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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sh0 extends org.telegram.ui.ActionBar.f3 {
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
    public final lh0 b;
    public final oh0 c;
    public final Drawable d;
    public final View e;
    public final a8 f;
    public AnimatorSet h;
    public final MessageObject n;
    public final TLRPC.Poll r;
    public final TLRPC.InputPeer s;
    public final HashSet v;
    public final HashMap w;
    public final ArrayList x;
    public final a6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12 = 1;
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
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i13);
            if (pollAnswerVoters.voters == 0) {
                i11 = i12;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i14 = pollAnswerVoters.voters;
                i14 = i14 > 15 ? 10 : i14;
                int i15 = 0;
                while (i15 < i14) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                    i15++;
                    i12 = i12;
                }
                i11 = i12;
                int i16 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i14 < i16 ? "empty" : null;
                tL_messages_votesList.count = i16;
                this.x.add(new rh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.s;
                tL_messages_getPollVotes.id = this.n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.za(this, numArr, i13, arrayList, pollAnswerVoters, 5)));
                numArr[i13] = valueOf;
                this.F.add(valueOf);
            }
            i13++;
            i12 = i11;
        }
        S();
        Collections.sort(this.x, new jh0(this));
        T();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i5, false), PorterDuff.Mode.MULTIPLY));
        kh0 kh0Var = new kh0(this, context);
        this.containerView = kh0Var;
        kh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i17 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i17, 0, i17, 0);
        lh0 lh0Var = new lh0(this, context);
        this.b = lh0Var;
        lh0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = hs.h;
        lh0Var.setItemAnimator(jVar);
        lh0Var.setClipToPadding(false);
        getContext();
        lh0Var.setLayoutManager(new gg.a0(i12, z10, 9));
        lh0Var.setHorizontalScrollBarEnabled(false);
        lh0Var.setVerticalScrollBarEnabled(false);
        lh0Var.setSectionsType(2);
        this.containerView.addView(lh0Var, w7.x5.e(-1, -1, 51));
        oh0 oh0Var = new oh0(this, context);
        this.c = oh0Var;
        lh0Var.setAdapter(oh0Var);
        lh0Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        lh0Var.setOnItemClickListener(new ai.o6(13, this, context));
        lh0Var.setOnScrollListener(new mh0(this, 0));
        a6 a6Var = new a6(context);
        this.y = a6Var;
        a6Var.setTextSize(1, 18.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i18 = org.telegram.ui.ActionBar.i6.j5;
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
        a6Var.setTag(-33024);
        a6Var.setLayoutParams(new s4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(a6Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, a6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, a6Var.getPaint().getFontMetricsInt());
            a6Var.setText(replaceEmoji);
        }
        a8 a8Var = new a8(this, context, 2);
        this.f = a8Var;
        a8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false));
        a8Var.setBackButtonImage(R.drawable.ic_ab_back);
        a8Var.D(org.telegram.ui.ActionBar.i6.x0(null, i18, false), false);
        a8Var.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
        a8Var.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
        a8Var.setSubtitleColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Pi, false));
        a8Var.setOccupyStatusBar(false);
        a8Var.setAlpha(0.0f);
        a8Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.r.quiz) {
            a8Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            a8Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(a8Var, w7.x5.d(-2.0f, -1));
        a8Var.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 11));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V5, false));
        this.containerView.addView(view, w7.x5.d(1.0f, -1));
    }

    public static void o(sh0 sh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        oh0 oh0Var = sh0Var.c;
        ArrayList arrayList2 = sh0Var.x;
        lh0 lh0Var = sh0Var.b;
        ArrayList arrayList3 = sh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            sh0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(sh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new rh0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                rh0 rh0Var = (rh0) arrayList.get(i11);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        rh0 rh0Var2 = (rh0) arrayList2.get(i12);
                        if (Arrays.equals(rh0Var.d, rh0Var2.d)) {
                            rh0Var2.c = rh0Var.c;
                            if (rh0Var2.a != rh0Var.a || rh0Var2.b.size() != rh0Var.b.size()) {
                                z10 = true;
                            }
                            rh0Var2.a = rh0Var.a;
                            rh0Var2.b = rh0Var.b;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            sh0Var.L = false;
            if (lh0Var != null) {
                if (sh0Var.currentSheetAnimationType != 0 || sh0Var.startAnimationRunnable != null || z10) {
                    if (z10) {
                        sh0Var.S();
                    }
                    oh0Var.X(false);
                    return;
                }
                int childCount = lh0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = lh0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View F = lh0Var.F(childAt);
                        s4.d1 T = F == null ? null : lh0Var.T(F);
                        if (T != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.E = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            oh0Var.y(T);
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
                sh0Var.L = false;
            }
        }
    }

    public static void p(sh0 sh0Var, rh0 rh0Var, TLObject tLObject) {
        if (sh0Var.isShowing()) {
            sh0Var.v.remove(rh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(sh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                rh0Var.b.addAll(tL_messages_votesList.votes);
                rh0Var.c = tL_messages_votesList.next_offset;
                sh0Var.P(null);
                sh0Var.c.X(true);
            }
        }
    }

    public static void q(sh0 sh0Var, Context context, View view, int i10) {
        HashSet hashSet = sh0Var.v;
        oh0 oh0Var = sh0Var.c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = sh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = oh0Var.S(i10) - 1;
                    int Q = oh0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    rh0 rh0Var = (rh0) sh0Var.x.get(S);
                    if (Q != rh0Var.b() || hashSet.contains(rh0Var)) {
                        return;
                    }
                    if (rh0Var.e && rh0Var.f < rh0Var.b.size()) {
                        int min = Math.min(rh0Var.f + 50, rh0Var.b.size());
                        rh0Var.f = min;
                        if (min == rh0Var.b.size()) {
                            rh0Var.e = false;
                        }
                        sh0Var.P(null);
                        oh0Var.X(true);
                        return;
                    }
                    hashSet.add(rh0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = sh0Var.s;
                    tL_messages_getPollVotes.id = sh0Var.n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = rh0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = rh0Var.c;
                    ConnectionsManager.getInstance(sh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.oo(12, sh0Var, rh0Var));
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
                    sh0Var.dismiss();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (U instanceof org.telegram.ui.zn) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User i13 = ((org.telegram.ui.zn) U).i();
                            if (i13 != null && i13.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.zn) U).e;
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

    public static void v(sh0 sh0Var) {
        a8 a8Var = sh0Var.f;
        lh0 lh0Var = sh0Var.b;
        if (lh0Var.getChildCount() <= 0) {
            int paddingTop = lh0Var.getPaddingTop();
            sh0Var.E = paddingTop;
            lh0Var.setTopGlowOffset(paddingTop);
            sh0Var.containerView.invalidate();
            return;
        }
        View childAt = lh0Var.getChildAt(0);
        am0 am0Var = (am0) lh0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || am0Var == null || am0Var.b() != 0) {
            top = dp;
        }
        boolean z10 = top <= AndroidUtilities.dp(12.0f);
        if ((z10 && a8Var.getTag() == null) || (!z10 && a8Var.getTag() != null)) {
            a8Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = sh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                sh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            sh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = sh0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(a8Var, (Property<a8, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(sh0Var.e, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            sh0Var.h.addListener(new vd0(sh0Var, 4));
            sh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lh0Var.getLayoutParams();
        int D = org.telegram.messenger.bi.D(11.0f, layoutParams.topMargin, top);
        if (sh0Var.E != D) {
            sh0Var.E = D;
            lh0Var.setTopGlowOffset(D - layoutParams.topMargin);
            sh0Var.containerView.invalidate();
        }
    }

    public final void P(View view) {
        lh0 lh0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            lh0Var = this.b;
            int i11 = 0;
            if (i10 >= lh0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? lh0Var.getPinnedHeader() : lh0Var.getChildAt(i10);
            if ((pinnedHeader instanceof qh0) && (pinnedHeader.getTag(R.id.object_tag) instanceof rh0)) {
                qh0 qh0Var = (qh0) pinnedHeader;
                rh0 rh0Var = (rh0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, rh0Var.d) || ((ph0) this.w.get(rh0Var)) == null) {
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
                            qh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, Q(rh0Var.d), rh0Var.a, rh0Var.a(), true);
                            qh0Var.setTag(R.id.object_tag, rh0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = lh0Var.p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(lh0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(lh0Var.getMeasuredHeight(), 0));
            View view3 = lh0Var.p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), lh0Var.p1.getMeasuredHeight());
            lh0Var.invalidate();
        }
        lh0Var.invalidate();
    }

    public final int Q(byte[] bArr) {
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
            rh0 rh0Var = (rh0) arrayList.get(i10);
            if (rh0Var != null) {
                i11 += rh0Var.a;
                if (Arrays.equals(rh0Var.d, bArr)) {
                    i12 += rh0Var.a;
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

    public final MessagesController R() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void S() {
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
            rh0 rh0Var = (rh0) arrayList2.get(i11);
            ph0 ph0Var = new ph0();
            arrayList.add(ph0Var);
            hashMap2.put(rh0Var, ph0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(rh0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f7 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        ph0Var.a = f7 - i15;
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
        Collections.sort(arrayList, new org.telegram.ui.gf(12));
        int min = Math.min(i10, arrayList.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((ph0) arrayList.get(i16)).getClass();
        }
    }

    public final void T() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i5, false);
        int averageColor = AndroidUtilities.getAverageColor(x03, x02);
        paint.setColor(x03);
        float dp = AndroidUtilities.dp(500.0f);
        this.K = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, averageColor, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
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
        a7 a7Var = new a7(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.A5));
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 1024, null, null, null, null, org.telegram.ui.ActionBar.i6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, null, null, null, -1, a7Var, org.telegram.ui.ActionBar.i6.i5));
        int i12 = org.telegram.ui.ActionBar.i6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, TLObject.FLAG_19, new Class[]{qh0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, TLObject.FLAG_19, new Class[]{qh0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, TLObject.FLAG_19, new Class[]{qh0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 524304, new Class[]{qh0.class}, null, null, null, org.telegram.ui.ActionBar.i6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.k0, null, null, org.telegram.ui.ActionBar.i6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        return arrayList;
    }
}
