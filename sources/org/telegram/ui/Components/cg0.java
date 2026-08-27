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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class cg0 extends org.telegram.ui.ActionBar.e3 {
    public static final dh.g K = new dh.g("placeholderAlpha", 11);
    public int A;
    public final ArrayList B;
    public final Paint C;
    public LinearGradient D;
    public Matrix E;
    public float F;
    public float G;
    public boolean H;
    public final RectF I;
    public final TLRPC.TL_messageMediaPoll J;
    public final wf0 b;
    public final yf0 c;
    public final Drawable d;
    public final View e;
    public final ag.d2 f;
    public AnimatorSet h;
    public final MessageObject n;
    public final TLRPC.Poll r;
    public final TLRPC.InputPeer s;
    public final HashSet v;
    public final HashMap w;
    public final ArrayList x;
    public final s5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(Context context, int i10, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, true, false);
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z10 = false;
        this.v = new HashSet();
        this.w = new HashMap();
        this.x = new ArrayList();
        this.B = new ArrayList();
        this.C = new Paint(1);
        this.H = true;
        this.I = new RectF();
        this.currentAccount = i10;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.n = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.J = tL_messageMediaPoll;
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
                this.x.add(new bg0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.s;
                tL_messages_getPollVotes.id = this.n.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new gf.j0(this, numArr, i11, arrayList, pollAnswerVoters, 7)));
                numArr[i11] = valueOf;
                this.B.add(valueOf);
            }
            i11++;
        }
        R();
        Collections.sort(this.x, new vf0(this));
        S();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i5, false), PorterDuff.Mode.MULTIPLY));
        ag.d0 d0Var = new ag.d0(this, context);
        this.containerView = d0Var;
        d0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i15, 0, i15, 0);
        wf0 wf0Var = new wf0(this, context);
        this.b = wf0Var;
        wf0Var.setSections(false);
        f2.l lVar = new f2.l();
        lVar.c = 150L;
        lVar.e = 350L;
        lVar.f = 0L;
        lVar.g = 0L;
        lVar.d = 0L;
        lVar.C = false;
        lVar.i = new OvershootInterpolator(1.1f);
        lVar.o = er.h;
        wf0Var.setItemAnimator(lVar);
        wf0Var.setClipToPadding(false);
        getContext();
        wf0Var.setLayoutManager(new org.telegram.ui.j(1, z10, 7));
        wf0Var.setHorizontalScrollBarEnabled(false);
        wf0Var.setVerticalScrollBarEnabled(false);
        wf0Var.setSectionsType(2);
        this.containerView.addView(wf0Var, h7.z5.e(-1, -1, 51));
        yf0 yf0Var = new yf0(this, context);
        this.c = yf0Var;
        wf0Var.setAdapter(yf0Var);
        wf0Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        wf0Var.setOnItemClickListener(new cg.x0(15, this, context));
        wf0Var.setOnScrollListener(new xm(this, 8));
        s5 s5Var = new s5(context);
        this.y = s5Var;
        s5Var.setTextSize(1, 18.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i16 = org.telegram.ui.ActionBar.g6.j5;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        s5Var.setTag(-33024);
        s5Var.setLayoutParams(new f2.y0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.r.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.n;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(s5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_textWithEntities2.entities, s5Var.getPaint().getFontMetricsInt());
            s5Var.setText(replaceEmoji);
        }
        ag.d2 d2Var = new ag.d2(this, context, 3);
        this.f = d2Var;
        d2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false));
        d2Var.setBackButtonImage(R.drawable.ic_ab_back);
        d2Var.D(org.telegram.ui.ActionBar.g6.w0(null, i16, false), false);
        d2Var.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        d2Var.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        d2Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pi, false));
        d2Var.setOccupyStatusBar(false);
        d2Var.setAlpha(0.0f);
        d2Var.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.r.quiz) {
            d2Var.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            d2Var.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(d2Var, h7.z5.c(-2.0f, -1));
        d2Var.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 7));
        View view = new View(context);
        this.e = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        this.containerView.addView(view, h7.z5.c(1.0f, -1));
    }

    public static void m(cg0 cg0Var, Integer[] numArr, int i10, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        yf0 yf0Var = cg0Var.c;
        ArrayList arrayList2 = cg0Var.x;
        wf0 wf0Var = cg0Var.b;
        ArrayList arrayList3 = cg0Var.B;
        arrayList3.remove(numArr[i10]);
        if (tLObject == null) {
            cg0Var.dismiss();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(cg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new bg0(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList3.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                bg0 bg0Var = (bg0) arrayList.get(i11);
                int size2 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size2) {
                        bg0 bg0Var2 = (bg0) arrayList2.get(i12);
                        if (Arrays.equals(bg0Var.d, bg0Var2.d)) {
                            bg0Var2.c = bg0Var.c;
                            if (bg0Var2.a != bg0Var.a || bg0Var2.b.size() != bg0Var.b.size()) {
                                z10 = true;
                            }
                            bg0Var2.a = bg0Var.a;
                            bg0Var2.b = bg0Var.b;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            cg0Var.H = false;
            if (wf0Var != null) {
                if (cg0Var.currentSheetAnimationType != 0 || cg0Var.startAnimationRunnable != null || z10) {
                    if (z10) {
                        cg0Var.R();
                    }
                    yf0Var.X(false);
                    return;
                }
                int childCount = wf0Var.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = wf0Var.getChildAt(i13);
                    if (childAt instanceof PollVotesAlert$UserCell) {
                        View F = wf0Var.F(childAt);
                        f2.o1 T = F == null ? null : wf0Var.T(F);
                        if (T != null) {
                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                            pollVotesAlert$UserCell.A = arrayList4;
                            pollVotesAlert$UserCell.setEnabled(true);
                            yf0Var.y(T);
                            pollVotesAlert$UserCell.A = null;
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList4);
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
                cg0Var.H = false;
            }
        }
    }

    public static void n(cg0 cg0Var, bg0 bg0Var, TLObject tLObject) {
        if (cg0Var.isShowing()) {
            cg0Var.v.remove(bg0Var);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(cg0Var.currentAccount).putUsers(tL_messages_votesList.users, false);
                bg0Var.b.addAll(tL_messages_votesList.votes);
                bg0Var.c = tL_messages_votesList.next_offset;
                cg0Var.O(null);
                cg0Var.c.X(true);
            }
        }
    }

    public static void p(cg0 cg0Var, Context context, View view, int i10) {
        HashSet hashSet = cg0Var.v;
        yf0 yf0Var = cg0Var.c;
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = cg0Var.B;
            if (arrayList == null || arrayList.isEmpty()) {
                int i11 = 0;
                if (view instanceof org.telegram.ui.Cells.l8) {
                    int S = yf0Var.S(i10) - 1;
                    int Q = yf0Var.Q(i10) - 1;
                    if (Q <= 0 || S < 0) {
                        return;
                    }
                    bg0 bg0Var = (bg0) cg0Var.x.get(S);
                    if (Q != bg0Var.b() || hashSet.contains(bg0Var)) {
                        return;
                    }
                    if (bg0Var.e && bg0Var.f < bg0Var.b.size()) {
                        int min = Math.min(bg0Var.f + 50, bg0Var.b.size());
                        bg0Var.f = min;
                        if (min == bg0Var.b.size()) {
                            bg0Var.e = false;
                        }
                        cg0Var.O(null);
                        yf0Var.X(true);
                        return;
                    }
                    hashSet.add(bg0Var);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = cg0Var.s;
                    tL_messages_getPollVotes.id = cg0Var.n.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i12 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = bg0Var.d;
                    tL_messages_getPollVotes.flags = i12 | 3;
                    tL_messages_getPollVotes.offset = bg0Var.c;
                    ConnectionsManager.getInstance(cg0Var.currentAccount).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.gg(16, cg0Var, bg0Var));
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
                    cg0Var.dismiss();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    if (U instanceof org.telegram.ui.rn) {
                        if (pollVotesAlert$UserCell.h != null) {
                            TLRPC.User i13 = ((org.telegram.ui.rn) U).i();
                            if (i13 != null && i13.id == pollVotesAlert$UserCell.h.id) {
                                i11 = 1;
                            }
                            profileActivity.N4(i11);
                        } else {
                            TLRPC.Chat chat = ((org.telegram.ui.rn) U).e;
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

    public static void u(cg0 cg0Var) {
        ag.d2 d2Var = cg0Var.f;
        wf0 wf0Var = cg0Var.b;
        if (wf0Var.getChildCount() <= 0) {
            int paddingTop = wf0Var.getPaddingTop();
            cg0Var.A = paddingTop;
            wf0Var.setTopGlowOffset(paddingTop);
            cg0Var.containerView.invalidate();
            return;
        }
        View childAt = wf0Var.getChildAt(0);
        lk0 lk0Var = (lk0) wf0Var.G(childAt);
        int top = childAt.getTop();
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || lk0Var == null || lk0Var.b() != 0) {
            top = dp;
        }
        boolean z10 = top <= AndroidUtilities.dp(12.0f);
        if ((z10 && d2Var.getTag() == null) || (!z10 && d2Var.getTag() != null)) {
            d2Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = cg0Var.h;
            if (animatorSet != null) {
                animatorSet.cancel();
                cg0Var.h = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            cg0Var.h = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = cg0Var.h;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(d2Var, (Property<ag.d2, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cg0Var.e, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            cg0Var.h.addListener(new sz(cg0Var, 11));
            cg0Var.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wf0Var.getLayoutParams();
        int C = org.telegram.messenger.rl.C(11.0f, layoutParams.topMargin, top);
        if (cg0Var.A != C) {
            cg0Var.A = C;
            wf0Var.setTopGlowOffset(C - layoutParams.topMargin);
            cg0Var.containerView.invalidate();
        }
    }

    public final void O(View view) {
        wf0 wf0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            wf0Var = this.b;
            int i11 = 0;
            if (i10 >= wf0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? wf0Var.getPinnedHeader() : wf0Var.getChildAt(i10);
            if ((pinnedHeader instanceof ag0) && (pinnedHeader.getTag(R.id.object_tag) instanceof bg0)) {
                ag0 ag0Var = (ag0) pinnedHeader;
                bg0 bg0Var = (bg0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.r;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, bg0Var.d) || ((zf0) this.w.get(bg0Var)) == null) {
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
                            ag0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, P(bg0Var.d), bg0Var.a, bg0Var.a(), true);
                            ag0Var.setTag(R.id.object_tag, bg0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = wf0Var.n1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(wf0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wf0Var.getMeasuredHeight(), 0));
            View view3 = wf0Var.n1;
            view3.layout(0, 0, view3.getMeasuredWidth(), wf0Var.n1.getMeasuredHeight());
            wf0Var.invalidate();
        }
        wf0Var.invalidate();
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
            bg0 bg0Var = (bg0) arrayList.get(i10);
            if (bg0Var != null) {
                i11 += bg0Var.a;
                if (Arrays.equals(bg0Var.d, bArr)) {
                    i12 += bg0Var.a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.J;
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
            bg0 bg0Var = (bg0) arrayList2.get(i11);
            zf0 zf0Var = new zf0();
            arrayList.add(zf0Var);
            hashMap2.put(bg0Var, zf0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(bg0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f10;
                        zf0Var.a = f10 - i15;
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
        Collections.sort(arrayList, new k9.a(26));
        int min = Math.min(i10, arrayList.size());
        for (int i16 = 0; i16 < min; i16++) {
            ((zf0) arrayList.get(i16)).getClass();
        }
    }

    public final void S() {
        Paint paint = this.C;
        if (paint == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h5, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i5, false);
        int averageColor = AndroidUtilities.getAverageColor(w03, w02);
        paint.setColor(w03);
        float dp = AndroidUtilities.dp(500.0f);
        this.G = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.D = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.E = matrix;
        this.D.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.dismissInternal();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 6);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.containerView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ii));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.d};
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(viewGroup, 0, null, null, drawableArr, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.A5));
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f, 256, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, null, null, null, -1, s6Var, org.telegram.ui.ActionBar.g6.i5));
        int i12 = org.telegram.ui.ActionBar.g6.f7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, TLObject.FLAG_19, new Class[]{ag0.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, TLObject.FLAG_19, new Class[]{ag0.class}, new String[]{"middleTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, TLObject.FLAG_19, new Class[]{ag0.class}, new String[]{"righTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 524304, new Class[]{ag0.class}, null, null, null, org.telegram.ui.ActionBar.g6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{PollVotesAlert$UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        return arrayList;
    }
}
