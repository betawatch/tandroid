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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class oh0 extends org.telegram.ui.ActionBar.h3 {
    public static final org.telegram.ui.Cells.t8 R = new org.telegram.ui.Cells.t8("placeholderAlpha", 9);
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
    public boolean O;
    public int P;
    public int Q;
    public final ih0 b;
    public final kh0 c;
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
    public final z5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
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
                this.x.add(new nh0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.s;
                tL_messages_getPollVotes.id = this.n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new ai.tb(this, numArr, i13, arrayList, pollAnswerVoters, 7)));
                numArr[i13] = valueOf;
                this.F.add(valueOf);
            }
            i13++;
            i12 = i11;
        }
        T();
        Collections.sort(this.x, new gh0(this));
        U();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false), PorterDuff.Mode.MULTIPLY));
        hh0 hh0Var = new hh0(this, context);
        this.containerView = hh0Var;
        hh0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i17 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i17, 0, i17, 0);
        ih0 ih0Var = new ih0(this, context);
        this.b = ih0Var;
        ih0Var.setSections(false);
        s4.k kVar = new s4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = bs.h;
        ih0Var.setItemAnimator(kVar);
        ih0Var.setClipToPadding(false);
        getContext();
        ih0Var.setLayoutManager(new hg.a0(i12, z10, 9));
        ih0Var.setHorizontalScrollBarEnabled(false);
        ih0Var.setVerticalScrollBarEnabled(false);
        ih0Var.setSectionsType(2);
        this.containerView.addView(ih0Var, w7.z5.e(-1, -1, 51));
        kh0 kh0Var = new kh0(this, context);
        this.c = kh0Var;
        ih0Var.setAdapter(kh0Var);
        org.telegram.ui.ActionBar.r6.m(ih0Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        ih0Var.setOnItemClickListener(new ci.x4(13, this, context));
        ih0Var.setOnScrollListener(new kv(this, 5));
        z5 z5Var = new z5(context);
        this.y = z5Var;
        z5Var.setTextSize(1, 18.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i18 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(z5Var, i18, null);
        z5Var.setTag(-33024);
        z5Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(z5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, z5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, z5Var.getPaint().getFontMetricsInt());
            z5Var.setText(replaceEmoji);
        }
        z7 z7Var = new z7(this, context, 2);
        this.f = z7Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, z7Var, null);
        z7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r6.m(z7Var, 1, i18, null);
        org.telegram.ui.ActionBar.r6.m(z7Var, 3, org.telegram.ui.ActionBar.k6.I5, null);
        org.telegram.ui.ActionBar.r6.m(z7Var, 5, i18, null);
        org.telegram.ui.ActionBar.r6.m(z7Var, 6, org.telegram.ui.ActionBar.k6.Pi, null);
        z7Var.setOccupyStatusBar(false);
        z7Var.setAlpha(0.0f);
        z7Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.r.quiz) {
            z7Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            z7Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(z7Var, w7.z5.c(-2.0f, -1));
        z7Var.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 14));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
    }

    public static void m(oh0 oh0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        kh0 kh0Var = oh0Var.c;
        ArrayList arrayList2 = oh0Var.x;
        ih0 ih0Var = oh0Var.b;
        ArrayList arrayList3 = oh0Var.F;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            oh0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(oh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new nh0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                nh0 nh0Var = (nh0) arrayList.get(i11);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        nh0 nh0Var2 = (nh0) arrayList2.get(i12);
                        if (Arrays.equals(nh0Var.d, nh0Var2.d)) {
                            nh0Var2.c = nh0Var.c;
                            if (nh0Var2.a != nh0Var.a || nh0Var2.b.size() != nh0Var.b.size()) {
                                z10 = true;
                            }
                            nh0Var2.a = nh0Var.a;
                            nh0Var2.b = nh0Var.b;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            oh0Var.L = false;
            if (ih0Var != null) {
                if (oh0Var.currentSheetAnimationType != 0 || oh0Var.startAnimationRunnable != null || z10) {
                    if (z10) {
                        oh0Var.T();
                    }
                    kh0Var.X(false);
                    return;
                }
                int childCount = ih0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = ih0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View F = ih0Var.F(childAt);
                        s4.b1 T = F == null ? null : ih0Var.T(F);
                        if (T != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.E = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            kh0Var.y(T);
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
                oh0Var.L = false;
            }
        }
    }

    public static void n(oh0 oh0Var, nh0 nh0Var, TLObject tLObject) {
        if (oh0Var.isShowing()) {
            oh0Var.v.remove(nh0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(oh0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                nh0Var.b.addAll(tL_messages_votesList.votes);
                nh0Var.c = tL_messages_votesList.next_offset;
                oh0Var.Q(null);
                oh0Var.c.X(true);
            }
        }
    }

    public static void p(oh0 oh0Var, Context context, View view, int i10) {
        HashSet hashSet = oh0Var.v;
        kh0 kh0Var = oh0Var.c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = oh0Var.F;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    int S = kh0Var.S(i10) - 1;
                    int Q = kh0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    nh0 nh0Var = (nh0) oh0Var.x.get(S);
                    if (Q != nh0Var.b() || hashSet.contains(nh0Var)) {
                        return;
                    }
                    if (nh0Var.e && nh0Var.f < nh0Var.b.size()) {
                        int min = Math.min(nh0Var.f + 50, nh0Var.b.size());
                        nh0Var.f = min;
                        if (min == nh0Var.b.size()) {
                            nh0Var.e = false;
                        }
                        oh0Var.Q(null);
                        kh0Var.X(true);
                        return;
                    }
                    hashSet.add(nh0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = oh0Var.s;
                    tL_messages_getPollVotes.id = oh0Var.n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = nh0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = nh0Var.c;
                    ConnectionsManager.getInstance(oh0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.vc(19, oh0Var, nh0Var));
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
                    oh0Var.dismiss();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (U instanceof org.telegram.ui.sn) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User i13 = ((org.telegram.ui.sn) U).i();
                            oh0Var.b.getChildAt(0);
                            if (i13 != null && i13.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.Q4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.sn) U).e;
                            if (chat != null && chat.id == pollVotesAlert$UserCell.n.id) {
                                i11 = 1;
                            }
                            profileActivity.Q4(i11);
                        }
                    }
                    U.presentFragment(profileActivity);
                }
            }
        }
    }

    public static void v(oh0 oh0Var) {
        z7 z7Var = oh0Var.f;
        ih0 ih0Var = oh0Var.b;
        if (ih0Var.getChildCount() <= 0) {
            int paddingTop = ih0Var.getPaddingTop();
            oh0Var.E = paddingTop;
            ih0Var.setTopGlowOffset(paddingTop);
            oh0Var.containerView.invalidate();
            return;
        }
        View childAt = ih0Var.getChildAt(0);
        wl0 wl0Var = (wl0) ih0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        boolean z10 = top <= AndroidUtilities.dp(12.0f);
        if ((z10 && z7Var.getTag() == null) || (!z10 && z7Var.getTag() != null)) {
            z7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = oh0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                oh0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            oh0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = oh0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(z7Var, (Property<z7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(oh0Var.e, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            oh0Var.h.addListener(new i60(oh0Var, 10));
            oh0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ih0Var.getLayoutParams();
        int D = org.telegram.messenger.sl.D(11.0f, layoutParams.topMargin, top);
        if (oh0Var.E != D) {
            oh0Var.E = D;
            ih0Var.setTopGlowOffset(D - layoutParams.topMargin);
            oh0Var.containerView.invalidate();
        }
    }

    public final void Q(View view) {
        ih0 ih0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            ih0Var = this.b;
            int i11 = 0;
            if (i10 >= ih0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? ih0Var.getPinnedHeader() : ih0Var.getChildAt(i10);
            if ((pinnedHeader instanceof mh0) && (pinnedHeader.getTag(R.id.object_tag) instanceof nh0)) {
                mh0 mh0Var = (mh0) pinnedHeader;
                nh0 nh0Var = (nh0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, nh0Var.d) || ((lh0) this.w.get(nh0Var)) == null) {
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
                            mh0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, R(nh0Var.d), nh0Var.a, nh0Var.a(), true);
                            mh0Var.setTag(R.id.object_tag, nh0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = ih0Var.p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ih0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ih0Var.getMeasuredHeight(), 0));
            View view3 = ih0Var.p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ih0Var.p1.getMeasuredHeight());
            ih0Var.invalidate();
        }
        ih0Var.invalidate();
    }

    public final int R(byte[] bArr) {
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
            nh0 nh0Var = (nh0) arrayList.get(i10);
            if (nh0Var != null) {
                i11 += nh0Var.a;
                if (Arrays.equals(nh0Var.d, bArr)) {
                    i12 += nh0Var.a;
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

    public final MessagesController S() {
        return MessagesController.getInstance(this.currentAccount);
    }

    public final void T() {
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
            nh0 nh0Var = (nh0) arrayList2.get(i11);
            lh0 lh0Var = new lh0();
            arrayList.add(lh0Var);
            hashMap2.put(nh0Var, lh0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(nh0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f7 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        lh0Var.a = f7 - i15;
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
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l4(19));
        int min = Math.min(i10, arrayList.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((lh0) arrayList.get(i16)).getClass();
        }
    }

    public final void U() {
        Paint paint = this.G;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false);
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

    @Override // org.telegram.ui.ActionBar.h3
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        z6 z6Var = new z6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.containerView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        ih0 ih0Var = this.b;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ih0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, z6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ih0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, z6Var, org.telegram.ui.ActionBar.k6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ih0Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(ih0Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (this.O && x02 == this.P && x03 == this.Q) {
                return;
            }
            this.O = true;
            this.P = x02;
            this.Q = x03;
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            U();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
