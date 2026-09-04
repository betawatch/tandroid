package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pg0 extends org.telegram.ui.ActionBar.f3 {
    public static final org.telegram.ui.Cells.t8 O = new org.telegram.ui.Cells.t8("placeholderAlpha", 9);
    public int E;
    public final ArrayList F;
    public final Paint G;
    public LinearGradient H;
    public Matrix I;
    public float J;
    public float K;
    public boolean L;
    public final RectF M;
    public final TLRPC.TL_messageMediaPoll N;
    public final jg0 b;
    public final lg0 c;
    public final Drawable d;
    public final View e;
    public final z7 f;
    public AnimatorSet h;
    public final MessageObject n;
    public final TLRPC.Poll r;
    public final TLRPC.InputPeer s;
    public final HashSet v;
    public final HashMap w;
    public final ArrayList x;
    public final y5 y;

    public pg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        this.v = new HashSet();
        this.w = new HashMap();
        this.x = new ArrayList();
        this.F = new ArrayList();
        this.G = new Paint(1);
        this.L = true;
        this.M = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.N = tL_messageMediaPoll;
        this.r = tL_messageMediaPoll.poll;
        this.s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i11);
            if (pollAnswerVoters.voters != 0) {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i12 = pollAnswerVoters.voters;
                i12 = i12 > 15 ? 10 : i12;
                for (int i13 = 0; i13 < i12; i13++) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                }
                int i14 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i12 < i14 ? "empty" : null;
                tL_messages_votesList.count = i14;
                this.x.add(new og0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.s;
                tL_messages_getPollVotes.id = this.n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new bi.fa(this, numArr, i11, arrayList, pollAnswerVoters, 5)));
                numArr[i11] = valueOf;
                this.F.add(valueOf);
            }
            i11++;
        }
        R();
        Collections.sort(this.x, new hg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false), PorterDuff.Mode.MULTIPLY));
        ig0 ig0Var = new ig0(this, context);
        this.containerView = ig0Var;
        ig0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        jg0 jg0Var = new jg0(this, context);
        this.b = jg0Var;
        jg0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = pr.h;
        jg0Var.setItemAnimator(jVar);
        jg0Var.setClipToPadding(false);
        getContext();
        jg0Var.setLayoutManager(new hg.b0(1, z10, 9));
        jg0Var.setHorizontalScrollBarEnabled(false);
        jg0Var.setVerticalScrollBarEnabled(false);
        jg0Var.setSectionsType(2);
        this.containerView.addView(jg0Var, w7.x5.e(-1, -1, 51));
        lg0 lg0Var = new lg0(this, context);
        this.c = lg0Var;
        jg0Var.setAdapter(lg0Var);
        jg0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        jg0Var.setOnItemClickListener(new bi.x5(13, this, context));
        jg0Var.setOnScrollListener(new lb0(this, 1));
        y5 y5Var = new y5(context);
        this.y = y5Var;
        y5Var.setTextSize(1, 18.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i16 = org.telegram.ui.ActionBar.j6.j5;
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        y5Var.setTag(-33024);
        y5Var.setLayoutParams(new s4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(y5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, y5Var.getPaint().getFontMetricsInt());
            y5Var.setText(replaceEmoji);
        }
        z7 z7Var = new z7(this, context, 2);
        this.f = z7Var;
        z7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        z7Var.C(org.telegram.ui.ActionBar.j6.w0(null, i16, false), false);
        z7Var.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        z7Var.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        z7Var.setSubtitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pi, false));
        z7Var.setOccupyStatusBar(false);
        z7Var.setAlpha(0.0f);
        z7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.r.quiz) {
            z7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            z7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(z7Var, w7.x5.c(-2.0f, -1));
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ic(this, 12));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        this.containerView.addView(view, w7.x5.c(1.0f, -1));
    }

    public static void m(pg0 pg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        lg0 lg0Var = pg0Var.c;
        ArrayList arrayList2 = pg0Var.x;
        jg0 jg0Var = pg0Var.b;
        ArrayList arrayList3 = pg0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            pg0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(pg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new og0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                og0 og0Var = (og0) arrayList.get(i11);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        og0 og0Var2 = (og0) arrayList2.get(i12);
                        if (Arrays.equals(og0Var.d, og0Var2.d)) {
                            og0Var2.c = og0Var.c;
                            if (og0Var2.a != og0Var.a || og0Var2.b.size() != og0Var.b.size()) {
                                z10 = true;
                            }
                            og0Var2.a = og0Var.a;
                            og0Var2.b = og0Var.b;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            pg0Var.L = false;
            if (jg0Var != null) {
                if (pg0Var.currentSheetAnimationType != 0 || pg0Var.startAnimationRunnable != null || z10) {
                    if (z10) {
                        pg0Var.R();
                    }
                    lg0Var.X(false);
                    return;
                }
                int childCount = jg0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = jg0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View F = jg0Var.F(childAt);
                        s4.c1 T = F == null ? null : jg0Var.T(F);
                        if (T != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.E = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            lg0Var.y(T);
                            pollVotesAlert$UserCell.E = null;
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList4);
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
                pg0Var.L = false;
            }
        }
    }

    public static void n(pg0 pg0Var, og0 og0Var, TLObject tLObject) {
        if (pg0Var.isShowing()) {
            pg0Var.v.remove(og0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(pg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                og0Var.b.addAll(tL_messages_votesList.votes);
                og0Var.c = tL_messages_votesList.next_offset;
                pg0Var.O(null);
                pg0Var.c.X(true);
            }
        }
    }

    public static void o(pg0 pg0Var, Context context, View view, int i10) {
        HashSet hashSet = pg0Var.v;
        lg0 lg0Var = pg0Var.c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = pg0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = lg0Var.S(i10) - 1;
                    int Q = lg0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    og0 og0Var = (og0) pg0Var.x.get(S);
                    if (Q != og0Var.b() || hashSet.contains(og0Var)) {
                        return;
                    }
                    if (og0Var.e && og0Var.f < og0Var.b.size()) {
                        int min = Math.min(og0Var.f + 50, og0Var.b.size());
                        og0Var.f = min;
                        if (min == og0Var.b.size()) {
                            og0Var.e = false;
                        }
                        pg0Var.O(null);
                        lg0Var.X(true);
                        return;
                    }
                    hashSet.add(og0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = pg0Var.s;
                    tL_messages_getPollVotes.id = pg0Var.n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = og0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = og0Var.c;
                    ConnectionsManager.getInstance(pg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.ro(12, pg0Var, og0Var));
                    return;
                }
                if (view instanceof PollVotesAlert$UserCell) {
                    PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) view;
                    if (pollVotesAlert$UserCell.h == null && pollVotesAlert$UserCell.n == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    TLRPC.User user = pollVotesAlert$UserCell.h;
                    if (user != null) {
                        bundle.putLong("user_id", user.id);
                    } else {
                        bundle.putLong("chat_id", pollVotesAlert$UserCell.n.id);
                    }
                    pg0Var.dismiss();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (U instanceof org.telegram.ui.co) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User i13 = ((org.telegram.ui.co) U).i();
                            if (i13 != null && i13.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.co) U).e;
                            if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        }
                    }
                    U.presentFragment(profileActivity);
                }
            }
        }
    }

    public static void t(pg0 pg0Var) {
        z7 z7Var = pg0Var.f;
        jg0 jg0Var = pg0Var.b;
        if (jg0Var.getChildCount() <= 0) {
            int paddingTop = jg0Var.getPaddingTop();
            pg0Var.E = paddingTop;
            jg0Var.setTopGlowOffset(paddingTop);
            pg0Var.containerView.invalidate();
            return;
        }
        View childAt = jg0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        boolean z10 = top <= AndroidUtilities.dp(12.0f);
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            z7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = pg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                pg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            pg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = pg0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(z7Var, (Property<z7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(pg0Var.e, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            pg0Var.h.addListener(new r80(pg0Var, 6));
            pg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jg0Var.getLayoutParams();
        int D = org.telegram.messenger.wl.D(11.0f, layoutParams.topMargin, top);
        if (pg0Var.E != D) {
            pg0Var.E = D;
            jg0Var.setTopGlowOffset(D - layoutParams.topMargin);
            pg0Var.containerView.invalidate();
        }
    }

    public final void O(View view) {
        jg0 jg0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            jg0Var = this.b;
            int i11 = 0;
            if (i10 >= jg0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? jg0Var.getPinnedHeader() : jg0Var.getChildAt(i10);
            if ((pinnedHeader instanceof ng0) && (pinnedHeader.getTag(R.id.object_tag) instanceof og0)) {
                ng0 ng0Var = (ng0) pinnedHeader;
                og0 og0Var = (og0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, og0Var.d) || ((mg0) this.w.get(og0Var)) == null) {
                            i12++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.n;
                            if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i11 >= messageObject.messageOwner.translatedPoll.answers.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i11);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            ng0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, P(og0Var.d), og0Var.a, og0Var.a(), true);
                            ng0Var.setTag(R.id.object_tag, og0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = jg0Var.r1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(jg0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(jg0Var.getMeasuredHeight(), 0));
            View view3 = jg0Var.r1;
            view3.layout(0, 0, view3.getMeasuredWidth(), jg0Var.r1.getMeasuredHeight());
            jg0Var.invalidate();
        }
        jg0Var.invalidate();
    }

    public final int P(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                break;
            }
            og0 og0Var = (og0) arrayList.get(i10);
            if (og0Var != null) {
                i11 += og0Var.a;
                if (Arrays.equals(og0Var.d, bArr)) {
                    i12 += og0Var.a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.N;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i11 = tL_messageMediaPoll.results.total_voters;
        }
        if (i11 <= 0) {
            return 0;
        }
        return Math.round((i12 / i11) * 100.0f);
    }

    public final MessagesController Q() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void R() {
        HashMap hashMap;
        HashMap hashMap2 = this.w;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.n.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            og0 og0Var = (og0) arrayList2.get(i11);
            mg0 mg0Var = new mg0();
            arrayList.add(mg0Var);
            hashMap2.put(og0Var, mg0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(og0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f7 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        mg0Var.a = f7 - i15;
                        if (i12 == 0) {
                            i12 = i15;
                        } else if (i15 != 0 && i12 != i15) {
                            z10 = true;
                        }
                        i10 -= i15;
                        i13 = Math.max(i15, i13);
                        i11++;
                        hashMap2 = hashMap;
                    } else {
                        i14++;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            i11++;
            hashMap2 = hashMap;
        }
        if (!z10 || i10 == 0) {
            return;
        }
        Collections.sort(arrayList, new org.telegram.ui.f6(14));
        int min = Math.min(i10, arrayList.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((mg0) arrayList.get(i16)).getClass();
        }
    }

    public final void S() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.K = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.H = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.H.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.A5));
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 1024, null, null, null, null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, null, null, null, -1, z6Var, org.telegram.ui.ActionBar.j6.i5));
        int i12 = org.telegram.ui.ActionBar.j6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_19, new Class[]{ng0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_19, new Class[]{ng0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, TLObject.FLAG_19, new Class[]{ng0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 524304, new Class[]{ng0.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }
}
