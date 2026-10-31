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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tf0 extends org.telegram.ui.ActionBar.z2 {
    public static final mh.g I1 = new mh.g("placeholderAlpha", 11);
    public float A1;
    public float B1;
    public boolean C1;
    public final RectF D1;
    public final TLRPC.TL_messageMediaPoll E1;
    public boolean F1;
    public int G1;
    public int H1;
    public final nf0 i1;
    public final pf0 j1;
    public final Drawable k1;
    public final View l1;
    public final kg.g1 m1;
    public AnimatorSet n1;
    public final org.telegram.messenger.jj o1;
    public final TLRPC.Poll p1;
    public final TLRPC.InputPeer q1;
    public final HashSet r1;
    public final HashMap s1;
    public final ArrayList t1;
    public final n5 u1;
    public int v1;
    public final ArrayList w1;
    public final Paint x1;
    public LinearGradient y1;
    public Matrix z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Serializable, java.lang.Integer[]] */
    public tf0(Context context, int i10, org.telegram.messenger.jj jjVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.q10 q10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        int i12 = 1;
        this.r1 = new HashSet();
        this.s1 = new HashMap();
        this.t1 = new ArrayList();
        this.w1 = new ArrayList();
        this.x1 = new Paint(1);
        this.C1 = true;
        this.D1 = new RectF();
        this.a = i10;
        this.x = true;
        O();
        this.o1 = jjVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) jjVar.k.media;
        this.E1 = tL_messageMediaPoll;
        this.p1 = tL_messageMediaPoll.poll;
        this.q1 = org.telegram.messenger.vp.r1(this.a).i1(org.telegram.messenger.jj.B0(jjVar.k));
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        ?? r22 = new Integer[size];
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
                this.t1.add(new sf0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.q1;
                tL_messages_getPollVotes.id = this.o1.f1();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new org.telegram.ui.q8(this, (Serializable) r22, i13, arrayList, pollAnswerVoters, 2)));
                r22[i13] = valueOf;
                this.w1.add(valueOf);
            }
            i13++;
            i12 = i11;
        }
        L0();
        Collections.sort(this.t1, new mf0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.k1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i5, false), PorterDuff.Mode.MULTIPLY));
        kg.x xVar = new kg.x(this, context);
        this.b = xVar;
        xVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i17 = this.t0;
        viewGroup.setPadding(i17, 0, i17, 0);
        nf0 nf0Var = new nf0(this, context);
        this.i1 = nf0Var;
        nf0Var.setSections(false);
        s4.j jVar = new s4.j();
        jVar.c = 150L;
        jVar.e = 350L;
        jVar.f = 0L;
        jVar.g = 0L;
        jVar.d = 0L;
        jVar.C = false;
        jVar.i = new OvershootInterpolator(1.1f);
        jVar.o = gr.h;
        nf0Var.setItemAnimator(jVar);
        nf0Var.setClipToPadding(false);
        getContext();
        nf0Var.setLayoutManager(new dh.f(i12, z10, 8));
        nf0Var.setHorizontalScrollBarEnabled(false);
        nf0Var.setVerticalScrollBarEnabled(false);
        nf0Var.setSectionsType(2);
        this.b.addView(nf0Var, w7.b6.e(-1, -1, 51));
        pf0 pf0Var = new pf0(this, context);
        this.j1 = pf0Var;
        nf0Var.setAdapter(pf0Var);
        org.telegram.ui.ActionBar.a7.m(nf0Var, 21, org.telegram.ui.ActionBar.t6.A5, null);
        nf0Var.setOnItemClickListener(new mg.q0(12, this, context));
        nf0Var.setOnScrollListener(new ag.u(this, 26));
        n5 n5Var = new n5(context);
        this.u1 = n5Var;
        n5Var.setTextSize(1, 18.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setPadding(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(n5Var, i18, null);
        n5Var.setTag(-33024);
        n5Var.setLayoutParams(new s4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.p1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.jj jjVar2 = this.o1;
            if (jjVar2 != null && jjVar2.J2 && (message = jjVar2.k) != null && (q10Var = message.translatedPoll) != null && (tL_textWithEntities = q10Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.zs.i(n5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, n5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.jj.A5(m10, tL_textWithEntities2.entities, n5Var.getPaint().getFontMetricsInt(), false);
            n5Var.setText(m10);
        }
        kg.g1 g1Var = new kg.g1(this, context, 3);
        this.m1 = g1Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, g1Var, null);
        g1Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.a7.m(g1Var, 1, i18, null);
        org.telegram.ui.ActionBar.a7.m(g1Var, 3, org.telegram.ui.ActionBar.t6.I5, null);
        org.telegram.ui.ActionBar.a7.m(g1Var, 5, i18, null);
        org.telegram.ui.ActionBar.a7.m(g1Var, 6, org.telegram.ui.ActionBar.t6.Dj, null);
        g1Var.setOccupyStatusBar(false);
        g1Var.setAlpha(0.0f);
        g1Var.setTitle(org.telegram.messenger.cd.L0(2131747176, null));
        if (this.p1.quiz) {
            g1Var.setSubtitle(org.telegram.messenger.cd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            g1Var.setSubtitle(org.telegram.messenger.cd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(g1Var, w7.b6.c(-2.0f, -1));
        g1Var.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 7));
        View view = new View(context);
        this.l1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view, null);
        this.b.addView(view, w7.b6.c(1.0f, -1));
    }

    public static void I0(tf0 tf0Var) {
        kg.g1 g1Var = tf0Var.m1;
        nf0 nf0Var = tf0Var.i1;
        if (nf0Var.getChildCount() <= 0) {
            int paddingTop = nf0Var.getPaddingTop();
            tf0Var.v1 = paddingTop;
            nf0Var.setTopGlowOffset(paddingTop);
            tf0Var.b.invalidate();
            return;
        }
        View childAt = nf0Var.getChildAt(0);
        ck0 ck0Var = (ck0) nf0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.i0.L(12.0f);
        if ((z10 && g1Var.getTag() == null) || (!z10 && g1Var.getTag() != null)) {
            g1Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = tf0Var.n1;
            if (animatorSet != null) {
                animatorSet.cancel();
                tf0Var.n1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            tf0Var.n1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = tf0Var.n1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(g1Var, (Property<kg.g1, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(tf0Var.l1, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            tf0Var.n1.addListener(new t60(tf0Var, 9));
            tf0Var.n1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nf0Var.getLayoutParams();
        int D = org.telegram.messenger.z20.D(11.0f, layoutParams.topMargin, top);
        if (tf0Var.v1 != D) {
            tf0Var.v1 = D;
            nf0Var.setTopGlowOffset(D - layoutParams.topMargin);
            tf0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f7));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void J0(View view) {
        nf0 nf0Var;
        TLRPC.Message message;
        int i10 = -2;
        while (true) {
            nf0Var = this.i1;
            int i11 = 0;
            if (i10 >= nf0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i10 == -2 ? view : i10 == -1 ? nf0Var.getPinnedHeader() : nf0Var.getChildAt(i10);
            if ((pinnedHeader instanceof rf0) && (pinnedHeader.getTag(R.id.object_tag) instanceof sf0)) {
                rf0 rf0Var = (rf0) pinnedHeader;
                sf0 sf0Var = (sf0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.p1;
                int size = poll.answers.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i12);
                        if (!Arrays.equals(pollAnswer.option, sf0Var.d) || ((qf0) this.s1.get(sf0Var)) == null) {
                            i12++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.jj jjVar = this.o1;
                            if (jjVar != null && jjVar.J2 && (message = jjVar.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i11 >= jjVar.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) jjVar.k.translatedPoll.b.get(i11);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i11++;
                                }
                            }
                            rf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, K0(sf0Var.d), sf0Var.a, sf0Var.a(), true);
                            rf0Var.setTag(R.id.object_tag, sf0Var);
                        }
                    }
                }
            }
            i10++;
        }
        View view2 = nf0Var.p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(nf0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(nf0Var.getMeasuredHeight(), 0));
            View view3 = nf0Var.p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), nf0Var.p1.getMeasuredHeight());
            nf0Var.invalidate();
        }
        nf0Var.invalidate();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.t1;
            if (i10 >= arrayList.size()) {
                break;
            }
            sf0 sf0Var = (sf0) arrayList.get(i10);
            if (sf0Var != null) {
                i11 += sf0Var.a;
                if (Arrays.equals(sf0Var.d, bArr)) {
                    i12 += sf0Var.a;
                }
            }
            i10++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.E1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i11 = tL_messageMediaPoll.results.total_voters;
        }
        if (i11 <= 0) {
            return 0;
        }
        return Math.round((i12 / i11) * 100.0f);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        ArrayList arrayList = this.w1;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i10)).intValue(), true);
        }
        super.L();
    }

    public final void L0() {
        HashMap hashMap;
        HashMap hashMap2 = this.s1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.o1.k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t1;
        int size = arrayList2.size();
        int i10 = 100;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            sf0 sf0Var = (sf0) arrayList2.get(i11);
            qf0 qf0Var = new qf0();
            arrayList.add(qf0Var);
            hashMap2.put(sf0Var, qf0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i14 = 0;
                while (i14 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(sf0Var.d, tL_messageMediaPoll.results.results.get(i14).option)) {
                        float f7 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i15 = (int) f7;
                        qf0Var.a = f7 - i15;
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
            ((qf0) arrayList.get(i16)).getClass();
        }
    }

    public final void M0() {
        Paint paint = this.x1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i5, false);
        int w02 = org.telegram.messenger.i0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.i0.L(500.0f);
        this.B1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.y1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.z1 = matrix;
        this.y1.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        o6 o6Var = new o6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.wj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.k1};
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.c7(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.m1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.i1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, o6Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.i1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.i5));
        int i11 = org.telegram.ui.ActionBar.t6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.i1, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.i1, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i5, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
            if (this.F1 && x02 == this.G1 && x03 == this.H1) {
                return;
            }
            this.F1 = true;
            this.G1 = x02;
            this.H1 = x03;
            Drawable drawable = this.k1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
