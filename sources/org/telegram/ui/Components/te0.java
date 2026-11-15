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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class te0 extends org.telegram.ui.ActionBar.u2 {
    public static final org.telegram.ui.Cells.n8 M1 = new org.telegram.ui.Cells.n8("placeholderAlpha", 9);
    public final ArrayList A1;
    public final Paint B1;
    public LinearGradient C1;
    public Matrix D1;
    public float E1;
    public float F1;
    public boolean G1;
    public final RectF H1;
    public final TLRPC.TL_messageMediaPoll I1;
    public boolean J1;
    public int K1;
    public int L1;
    public final ne0 m1;
    public final pe0 n1;
    public final Drawable o1;
    public final View p1;
    public final o7 q1;
    public AnimatorSet r1;
    public final org.telegram.messenger.gj s1;
    public final TLRPC.Poll t1;
    public final TLRPC.InputPeer u1;
    public final HashSet v1;
    public final HashMap w1;
    public final ArrayList x1;
    public final o5 y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te0(Context context, int i7, org.telegram.messenger.gj gjVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.z00 z00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11 = 1;
        this.v1 = new HashSet();
        this.w1 = new HashMap();
        this.x1 = new ArrayList();
        this.A1 = new ArrayList();
        this.B1 = new Paint(1);
        this.G1 = true;
        this.H1 = new RectF();
        this.a = i7;
        this.x = true;
        O();
        this.s1 = gjVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) gjVar.k.media;
        this.I1 = tL_messageMediaPoll;
        this.t1 = tL_messageMediaPoll.poll;
        this.u1 = org.telegram.messenger.np.s1(this.a).j1(org.telegram.messenger.gj.B0(gjVar.k));
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        boolean z10 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i12);
            if (pollAnswerVoters.voters == 0) {
                i10 = i11;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i13 = pollAnswerVoters.voters;
                i13 = i13 > 15 ? 10 : i13;
                int i14 = 0;
                while (i14 < i13) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                    i14++;
                    i11 = i11;
                }
                i10 = i11;
                int i15 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i13 < i15 ? "empty" : null;
                tL_messages_votesList.count = i15;
                this.x1.add(new se0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.u1;
                tL_messages_getPollVotes.id = this.s1.e1();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new bg.k0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.A1.add(valueOf);
            }
            i12++;
            i11 = i10;
        }
        L0();
        Collections.sort(this.x1, new me0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.o1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i5, false), PorterDuff.Mode.MULTIPLY));
        hi.q3 q3Var = new hi.q3(this, context);
        this.b = q3Var;
        q3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.u0;
        viewGroup.setPadding(i16, 0, i16, 0);
        ne0 ne0Var = new ne0(this, context);
        this.m1 = ne0Var;
        ne0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = er.h;
        ne0Var.setItemAnimator(kVar);
        ne0Var.setClipToPadding(false);
        getContext();
        ne0Var.setLayoutManager(new jg.b0(i11, z10, 9));
        ne0Var.setHorizontalScrollBarEnabled(false);
        ne0Var.setVerticalScrollBarEnabled(false);
        int i17 = 2;
        ne0Var.setSectionsType(2);
        this.b.addView(ne0Var, c8.ja.e(-1, -1, 51));
        pe0 pe0Var = new pe0(this, context);
        this.n1 = pe0Var;
        ne0Var.setAdapter(pe0Var);
        org.telegram.ui.ActionBar.q6.l(ne0Var, 21, org.telegram.ui.ActionBar.j6.A5, null);
        int i18 = 13;
        ne0Var.setOnItemClickListener(new fi.i4(i18, this, context));
        ne0Var.setOnScrollListener(new ri(this, i18));
        o5 o5Var = new o5(context);
        this.y1 = o5Var;
        o5Var.setTextSize(1, 18.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i19 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(o5Var, i19, null);
        o5Var.setTag(-33024);
        o5Var.setLayoutParams(new v4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.t1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.gj gjVar2 = this.s1;
            if (gjVar2 != null && gjVar2.L2 && (message = gjVar2.k) != null && (z00Var = message.translatedPoll) != null && (tL_textWithEntities = z00Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.ns.i(o5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.si.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.gj.B5(m10, tL_textWithEntities2.entities, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        }
        o7 o7Var = new o7(i17, context, this);
        this.q1 = o7Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, o7Var, null);
        o7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.q6.l(o7Var, 1, i19, null);
        org.telegram.ui.ActionBar.q6.l(o7Var, 3, org.telegram.ui.ActionBar.j6.I5, null);
        org.telegram.ui.ActionBar.q6.l(o7Var, 5, i19, null);
        org.telegram.ui.ActionBar.q6.l(o7Var, 6, org.telegram.ui.ActionBar.j6.Gj, null);
        o7Var.setOccupyStatusBar(false);
        o7Var.setAlpha(0.0f);
        o7Var.setTitle(org.telegram.messenger.hd.M0(2131747161, null));
        if (this.t1.quiz) {
            o7Var.setSubtitle(org.telegram.messenger.hd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            o7Var.setSubtitle(org.telegram.messenger.hd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(o7Var, c8.ja.c(-2.0f, -1));
        o7Var.setActionBarMenuOnItemClick(new org.telegram.ui.p9(this, 17));
        View view = new View(context);
        this.p1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.V5, view, null);
        this.b.addView(view, c8.ja.c(1.0f, -1));
    }

    public static void I0(te0 te0Var) {
        o7 o7Var = te0Var.q1;
        ne0 ne0Var = te0Var.m1;
        if (ne0Var.getChildCount() <= 0) {
            int paddingTop = ne0Var.getPaddingTop();
            te0Var.z1 = paddingTop;
            ne0Var.setTopGlowOffset(paddingTop);
            te0Var.b.invalidate();
            return;
        }
        View childAt = ne0Var.getChildAt(0);
        cj0 cj0Var = (cj0) ne0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && o7Var.getTag() == null) || (!z10 && o7Var.getTag() != null)) {
            o7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = te0Var.r1;
            if (animatorSet != null) {
                animatorSet.cancel();
                te0Var.r1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            te0Var.r1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = te0Var.r1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(o7Var, (Property<o7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(te0Var.p1, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            te0Var.r1.addListener(new h60(te0Var, 9));
            te0Var.r1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ne0Var.getLayoutParams();
        int D = org.telegram.messenger.i20.D(11.0f, layoutParams.topMargin, top);
        if (te0Var.z1 != D) {
            te0Var.z1 = D;
            ne0Var.setTopGlowOffset(D - layoutParams.topMargin);
            te0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f7));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return false;
    }

    public final void J0(View view) {
        ne0 ne0Var;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            ne0Var = this.m1;
            int i10 = 0;
            if (i7 >= ne0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i7 == -2 ? view : i7 == -1 ? ne0Var.getPinnedHeader() : ne0Var.getChildAt(i7);
            if ((pinnedHeader instanceof re0) && (pinnedHeader.getTag(R.id.object_tag) instanceof se0)) {
                re0 re0Var = (re0) pinnedHeader;
                se0 se0Var = (se0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.t1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (!Arrays.equals(pollAnswer.option, se0Var.d) || ((qe0) this.w1.get(se0Var)) == null) {
                            i11++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.gj gjVar = this.s1;
                            if (gjVar != null && gjVar.L2 && (message = gjVar.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= gjVar.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) gjVar.k.translatedPoll.b.get(i10);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            re0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, K0(se0Var.d), se0Var.a, se0Var.a(), true);
                            re0Var.setTag(R.id.object_tag, se0Var);
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = ne0Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ne0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ne0Var.getMeasuredHeight(), 0));
            View view3 = ne0Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ne0Var.q1.getMeasuredHeight());
            ne0Var.invalidate();
        }
        ne0Var.invalidate();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.x1;
            if (i7 >= arrayList.size()) {
                break;
            }
            se0 se0Var = (se0) arrayList.get(i7);
            if (se0Var != null) {
                i10 += se0Var.a;
                if (Arrays.equals(se0Var.d, bArr)) {
                    i11 += se0Var.a;
                }
            }
            i7++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.I1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i10 = tL_messageMediaPoll.results.total_voters;
        }
        if (i10 <= 0) {
            return 0;
        }
        return Math.round((i11 / i10) * 100.0f);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        ArrayList arrayList = this.A1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
        }
        super.L();
    }

    public final void L0() {
        HashMap hashMap;
        HashMap hashMap2 = this.w1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.s1.k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.x1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            se0 se0Var = (se0) arrayList2.get(i10);
            qe0 qe0Var = new qe0();
            arrayList.add(qe0Var);
            hashMap2.put(se0Var, qe0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(se0Var.d, tL_messageMediaPoll.results.results.get(i13).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        qe0Var.a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z10 = true;
                        }
                        i7 -= i14;
                        i12 = Math.max(i14, i12);
                        i10++;
                        hashMap2 = hashMap;
                    } else {
                        i13++;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            i10++;
            hashMap2 = hashMap;
        }
        if (!z10 || i7 == 0) {
            return;
        }
        Collections.sort(arrayList, new org.telegram.ui.me(11));
        int min = Math.min(i7, arrayList.size());
        for (int i15 = 0; i15 < min; i15++) {
            ((qe0) arrayList.get(i15)).getClass();
        }
    }

    public final void M0() {
        Paint paint = this.B1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.F1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.C1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.D1 = matrix;
        this.C1.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.zj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.o1};
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.s6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.q1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.m1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.m1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.i5));
        int i10 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.m1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.m1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i5, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false);
            if (this.J1 && x02 == this.K1 && x03 == this.L1) {
                return;
            }
            this.J1 = true;
            this.K1 = x02;
            this.L1 = x03;
            Drawable drawable = this.o1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
