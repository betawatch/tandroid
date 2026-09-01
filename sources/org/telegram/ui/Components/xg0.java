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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xg0 extends org.telegram.ui.ActionBar.h3 {
    public static final ih.g L = new ih.g("placeholderAlpha", 11);
    public int B;
    public final ArrayList C;
    public final Paint D;
    public LinearGradient E;
    public Matrix F;
    public float G;
    public float H;
    public boolean I;
    public final RectF J;
    public final TLRPC.TL_messageMediaPoll K;
    public final rg0 b;
    public final tg0 c;
    public final Drawable d;
    public final View e;
    public final fg.k1 f;
    public AnimatorSet h;
    public final MessageObject n;
    public final TLRPC.Poll r;
    public final TLRPC.InputPeer s;
    public final HashSet v;
    public final HashMap w;
    public final ArrayList x;
    public final t5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z4 = false;
        this.v = new HashSet();
        this.w = new HashMap();
        this.x = new ArrayList();
        this.C = new ArrayList();
        this.D = new Paint(1);
        this.I = true;
        this.J = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.K = tL_messageMediaPoll;
        this.r = tL_messageMediaPoll.poll;
        this.s = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
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
                this.x.add(new wg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.s;
                tL_messages_getPollVotes.id = this.n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new lf.i0(this, numArr, i11, arrayList, pollAnswerVoters, 7)));
                numArr[i11] = valueOf;
                this.C.add(valueOf);
            }
            i11++;
        }
        R();
        Collections.sort(this.x, new qg0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i5, false), PorterDuff.Mode.MULTIPLY));
        fg.y yVar = new fg.y(this, context);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        rg0 rg0Var = new rg0(this, context);
        this.b = rg0Var;
        rg0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 350L;
        lVar.f = 0L;
        lVar.g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.i = new OvershootInterpolator(1.1f);
        lVar.o = pr.h;
        rg0Var.setItemAnimator(lVar);
        rg0Var.setClipToPadding(false);
        getContext();
        rg0Var.setLayoutManager(new org.telegram.ui.k(1, z4, 7));
        rg0Var.setHorizontalScrollBarEnabled(false);
        rg0Var.setVerticalScrollBarEnabled(false);
        rg0Var.setSectionsType(2);
        this.containerView.addView(rg0Var, k7.c6.e(-1, -1, 51));
        tg0 tg0Var = new tg0(this, context);
        this.c = tg0Var;
        rg0Var.setAdapter(tg0Var);
        rg0Var.setGlowColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A5, false));
        rg0Var.setOnItemClickListener(new hg.v0(13, this, context));
        rg0Var.setOnScrollListener(new nb0(this, 1));
        t5 t5Var = new t5(context);
        this.y = t5Var;
        t5Var.setTextSize(1, 18.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i16 = org.telegram.ui.ActionBar.k6.j5;
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        t5Var.setTag(-33024);
        t5Var.setLayoutParams(new f2.x0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(t5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, t5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, t5Var.getPaint().getFontMetricsInt());
            t5Var.setText(replaceEmoji);
        }
        fg.k1 k1Var = new fg.k1(this, context, 3);
        this.f = k1Var;
        k1Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        k1Var.setBackButtonImage(R.drawable.ic_ab_back);
        k1Var.C(org.telegram.ui.ActionBar.k6.w0(null, i16, false), false);
        k1Var.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.I5, false), false);
        k1Var.setTitleColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        k1Var.setSubtitleColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pi, false));
        k1Var.setOccupyStatusBar(false);
        k1Var.setAlpha(0.0f);
        k1Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.r.quiz) {
            k1Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            k1Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(k1Var, k7.c6.c(-2.0f, -1));
        k1Var.setActionBarMenuOnItemClick(new fg.l1(this, 28));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.V5, false));
        this.containerView.addView(view, k7.c6.c(1.0f, -1));
    }

    public static void m(xg0 xg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        tg0 tg0Var = xg0Var.c;
        ArrayList arrayList2 = xg0Var.x;
        rg0 rg0Var = xg0Var.b;
        ArrayList arrayList3 = xg0Var.C;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            xg0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(xg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new wg0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z4 = false;
            for (int i11 = 0; i11 < size; i11++) {
                wg0 wg0Var = (wg0) arrayList.get(i11);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        wg0 wg0Var2 = (wg0) arrayList2.get(i12);
                        if (Arrays.equals(wg0Var.d, wg0Var2.d)) {
                            wg0Var2.c = wg0Var.c;
                            if (wg0Var2.a != wg0Var.a || wg0Var2.b.size() != wg0Var.b.size()) {
                                z4 = true;
                            }
                            wg0Var2.a = wg0Var.a;
                            wg0Var2.b = wg0Var.b;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            xg0Var.I = false;
            if (rg0Var != null) {
                if (xg0Var.currentSheetAnimationType != 0 || xg0Var.startAnimationRunnable != null || z4) {
                    if (z4) {
                        xg0Var.R();
                    }
                    tg0Var.X(false);
                    return;
                }
                int childCount = rg0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = rg0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View F = rg0Var.F(childAt);
                        f2.m1 T = F == null ? null : rg0Var.T(F);
                        if (T != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.B = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            tg0Var.y(T);
                            pollVotesAlert$UserCell.B = null;
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList4);
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
                xg0Var.I = false;
            }
        }
    }

    public static void n(xg0 xg0Var, wg0 wg0Var, TLObject tLObject) {
        if (xg0Var.isShowing()) {
            xg0Var.v.remove(wg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(xg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                wg0Var.b.addAll(tL_messages_votesList.votes);
                wg0Var.c = tL_messages_votesList.next_offset;
                xg0Var.O(null);
                xg0Var.c.X(true);
            }
        }
    }

    public static void o(xg0 xg0Var, Context context, View view, int i10) {
        HashSet hashSet = xg0Var.v;
        tg0 tg0Var = xg0Var.c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = xg0Var.C;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.o8) {
                    int S = tg0Var.S(i10) - 1;
                    int Q = tg0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    wg0 wg0Var = (wg0) xg0Var.x.get(S);
                    if (Q != wg0Var.b() || hashSet.contains(wg0Var)) {
                        return;
                    }
                    if (wg0Var.e && wg0Var.f < wg0Var.b.size()) {
                        int min = Math.min(wg0Var.f + 50, wg0Var.b.size());
                        wg0Var.f = min;
                        if (min == wg0Var.b.size()) {
                            wg0Var.e = false;
                        }
                        xg0Var.O(null);
                        tg0Var.X(true);
                        return;
                    }
                    hashSet.add(wg0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = xg0Var.s;
                    tL_messages_getPollVotes.id = xg0Var.n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = wg0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = wg0Var.c;
                    ConnectionsManager.getInstance(xg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.lo(12, xg0Var, wg0Var));
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
                    xg0Var.dismiss();
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (U instanceof org.telegram.ui.xn) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User i13 = ((org.telegram.ui.xn) U).i();
                            if (i13 != null && i13.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.xn) U).e;
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

    public static void t(xg0 xg0Var) {
        fg.k1 k1Var = xg0Var.f;
        rg0 rg0Var = xg0Var.b;
        if (rg0Var.getChildCount() <= 0) {
            int paddingTop = rg0Var.getPaddingTop();
            xg0Var.B = paddingTop;
            rg0Var.setTopGlowOffset(paddingTop);
            xg0Var.containerView.invalidate();
            return;
        }
        View childAt = rg0Var.getChildAt(0);
        fl0 fl0Var = (fl0) rg0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || fl0Var == null || fl0Var.b() != 0) {
            top = dp;
        }
        boolean z4 = top <= AndroidUtilities.dp(12.0f);
        if ((z4 && k1Var.getTag() == null) || (!z4 && k1Var.getTag() != null)) {
            k1Var.setTag(z4 ? 1 : null);
            AnimatorSet animatorSet = xg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                xg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            xg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = xg0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(k1Var, (Property<fg.k1, Float>) property, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(xg0Var.e, (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
            xg0Var.h.addListener(new pd0(xg0Var, 2));
            xg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rg0Var.getLayoutParams();
        int C = org.telegram.ui.b.C(11.0f, layoutParams.topMargin, top);
        if (xg0Var.B != C) {
            xg0Var.B = C;
            rg0Var.setTopGlowOffset(C - layoutParams.topMargin);
            xg0Var.containerView.invalidate();
        }
    }

    public final void O(View view) {
        rg0 rg0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            rg0Var = this.b;
            int i11 = 0;
            if (i10 >= rg0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? rg0Var.getPinnedHeader() : rg0Var.getChildAt(i10);
            if ((pinnedHeader instanceof vg0) && (pinnedHeader.getTag(R.id.object_tag) instanceof wg0)) {
                vg0 vg0Var = (vg0) pinnedHeader;
                wg0 wg0Var = (wg0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, wg0Var.d) || ((ug0) this.w.get(wg0Var)) == null) {
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
                            vg0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, P(wg0Var.d), wg0Var.a, wg0Var.a(), true);
                            vg0Var.setTag(R.id.object_tag, wg0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = rg0Var.o1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(rg0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(rg0Var.getMeasuredHeight(), 0));
            View view3 = rg0Var.o1;
            view3.layout(0, 0, view3.getMeasuredWidth(), rg0Var.o1.getMeasuredHeight());
            rg0Var.invalidate();
        }
        rg0Var.invalidate();
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
            wg0 wg0Var = (wg0) arrayList.get(i10);
            if (wg0Var != null) {
                i11 += wg0Var.a;
                if (Arrays.equals(wg0Var.d, bArr)) {
                    i12 += wg0Var.a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.K;
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
        boolean z4 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            wg0 wg0Var = (wg0) arrayList2.get(i11);
            ug0 ug0Var = new ug0();
            arrayList.add(ug0Var);
            hashMap2.put(wg0Var, ug0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(wg0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f10;
                        ug0Var.a = f10 - i15;
                        if (i12 == 0) {
                            i12 = i15;
                        } else if (i15 != 0 && i12 != i15) {
                            z4 = true;
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
        if (!z4 || i10 == 0) {
            return;
        }
        Collections.sort(arrayList, new oh.k0(23));
        int min = Math.min(i10, arrayList.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((ug0) arrayList.get(i16)).getClass();
        }
    }

    public final void S() {
        Paint paint = this.D;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.H = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.E = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.F = matrix;
        this.E.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t6 t6Var = new t6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.A5));
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 1024, null, null, null, null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, null, null, null, -1, t6Var, org.telegram.ui.ActionBar.k6.i5));
        int i12 = org.telegram.ui.ActionBar.k6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_19, new Class[]{vg0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_19, new Class[]{vg0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_19, new Class[]{vg0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 524304, new Class[]{vg0.class}, null, null, null, org.telegram.ui.ActionBar.k6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }
}
