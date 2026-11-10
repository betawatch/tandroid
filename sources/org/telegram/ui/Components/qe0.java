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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qe0 extends org.telegram.ui.ActionBar.w2 {
    public static final org.telegram.ui.Cells.o8 L1 = new org.telegram.ui.Cells.o8("placeholderAlpha", 9);
    public final Paint A1;
    public LinearGradient B1;
    public Matrix C1;
    public float D1;
    public float E1;
    public boolean F1;
    public final RectF G1;
    public final TLRPC.TL_messageMediaPoll H1;
    public boolean I1;
    public int J1;
    public int K1;
    public final ke0 l1;
    public final me0 m1;
    public final Drawable n1;
    public final View o1;
    public final q7 p1;
    public AnimatorSet q1;
    public final org.telegram.messenger.ij r1;
    public final TLRPC.Poll s1;
    public final TLRPC.InputPeer t1;
    public final HashSet u1;
    public final HashMap v1;
    public final ArrayList w1;
    public final p5 x1;
    public int y1;
    public final ArrayList z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(Context context, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.c10 c10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11 = 1;
        this.u1 = new HashSet();
        this.v1 = new HashMap();
        this.w1 = new ArrayList();
        this.z1 = new ArrayList();
        this.A1 = new Paint(1);
        this.F1 = true;
        this.G1 = new RectF();
        this.a = i7;
        this.x = true;
        N();
        this.r1 = ijVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ijVar.k.media;
        this.H1 = tL_messageMediaPoll;
        this.s1 = tL_messageMediaPoll.poll;
        this.t1 = org.telegram.messenger.qp.s1(this.a).j1(org.telegram.messenger.ij.B0(ijVar.k));
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        boolean z9 = false;
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
                this.w1.add(new pe0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.t1;
                tL_messages_getPollVotes.id = this.r1.e1();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new bg.k0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.z1.add(valueOf);
            }
            i12++;
            i11 = i10;
        }
        L0();
        Collections.sort(this.w1, new je0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.n1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false), PorterDuff.Mode.MULTIPLY));
        fi.r3 r3Var = new fi.r3(this, context);
        this.b = r3Var;
        r3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.t0;
        viewGroup.setPadding(i16, 0, i16, 0);
        ke0 ke0Var = new ke0(this, context);
        this.l1 = ke0Var;
        ke0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = wq.h;
        ke0Var.setItemAnimator(kVar);
        ke0Var.setClipToPadding(false);
        getContext();
        ke0Var.setLayoutManager(new jg.b0(i11, z9, 9));
        ke0Var.setHorizontalScrollBarEnabled(false);
        ke0Var.setVerticalScrollBarEnabled(false);
        int i17 = 2;
        ke0Var.setSectionsType(2);
        this.b.addView(ke0Var, c8.ha.e(-1, -1, 51));
        me0 me0Var = new me0(this, context);
        this.m1 = me0Var;
        ke0Var.setAdapter(me0Var);
        org.telegram.ui.ActionBar.t6.l(ke0Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        ke0Var.setOnItemClickListener(new di.q4(13, this, context));
        ke0Var.setOnScrollListener(new ti(this, 11));
        p5 p5Var = new p5(context);
        this.x1 = p5Var;
        p5Var.setTextSize(1, 18.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(p5Var, i18, null);
        p5Var.setTag(-33024);
        p5Var.setLayoutParams(new v4.o0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.s1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.ij ijVar2 = this.r1;
            if (ijVar2 != null && ijVar2.J2 && (message = ijVar2.k) != null && (c10Var = message.translatedPoll) != null && (tL_textWithEntities = c10Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.qs.i(p5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, p5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.ij.B5(m10, tL_textWithEntities2.entities, p5Var.getPaint().getFontMetricsInt(), false);
            p5Var.setText(m10);
        }
        q7 q7Var = new q7(i17, context, this);
        this.p1 = q7Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, q7Var, null);
        q7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.t6.l(q7Var, 1, i18, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 3, org.telegram.ui.ActionBar.m6.I5, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 5, i18, null);
        org.telegram.ui.ActionBar.t6.l(q7Var, 6, org.telegram.ui.ActionBar.m6.Dj, null);
        q7Var.setOccupyStatusBar(false);
        q7Var.setAlpha(0.0f);
        q7Var.setTitle(org.telegram.messenger.id.M0(2131747161, null));
        if (this.s1.quiz) {
            q7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            q7Var.setSubtitle(org.telegram.messenger.id.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(q7Var, c8.ha.c(-2.0f, -1));
        q7Var.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 16));
        View view = new View(context);
        this.o1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.b.addView(view, c8.ha.c(1.0f, -1));
    }

    public static void I0(qe0 qe0Var) {
        q7 q7Var = qe0Var.p1;
        ke0 ke0Var = qe0Var.l1;
        if (ke0Var.getChildCount() <= 0) {
            int paddingTop = ke0Var.getPaddingTop();
            qe0Var.y1 = paddingTop;
            ke0Var.setTopGlowOffset(paddingTop);
            qe0Var.b.invalidate();
            return;
        }
        View childAt = ke0Var.getChildAt(0);
        xi0 xi0Var = (xi0) ke0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        boolean z9 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z9 && q7Var.getTag() == null) || (!z9 && q7Var.getTag() != null)) {
            q7Var.setTag(z9 ? 1 : null);
            AnimatorSet animatorSet = qe0Var.q1;
            if (animatorSet != null) {
                animatorSet.cancel();
                qe0Var.q1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            qe0Var.q1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = qe0Var.q1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(q7Var, (Property<q7, Float>) property, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(qe0Var.o1, (Property<View, Float>) property, z9 ? 1.0f : 0.0f));
            qe0Var.q1.addListener(new e60(qe0Var, 9));
            qe0Var.q1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ke0Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin, top);
        if (qe0Var.y1 != D) {
            qe0Var.y1 = D;
            ke0Var.setTopGlowOffset(D - layoutParams.topMargin);
            qe0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void J0(View view) {
        ke0 ke0Var;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            ke0Var = this.l1;
            int i10 = 0;
            if (i7 >= ke0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i7 == -2 ? view : i7 == -1 ? ke0Var.getPinnedHeader() : ke0Var.getChildAt(i7);
            if ((pinnedHeader instanceof oe0) && (pinnedHeader.getTag(R.id.object_tag) instanceof pe0)) {
                oe0 oe0Var = (oe0) pinnedHeader;
                pe0 pe0Var = (pe0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.s1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (!Arrays.equals(pollAnswer.option, pe0Var.d) || ((ne0) this.v1.get(pe0Var)) == null) {
                            i11++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.ij ijVar = this.r1;
                            if (ijVar != null && ijVar.J2 && (message = ijVar.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= ijVar.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ijVar.k.translatedPoll.b.get(i10);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            oe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, K0(pe0Var.d), pe0Var.a, pe0Var.a(), true);
                            oe0Var.setTag(R.id.object_tag, pe0Var);
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = ke0Var.p1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ke0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ke0Var.getMeasuredHeight(), 0));
            View view3 = ke0Var.p1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ke0Var.p1.getMeasuredHeight());
            ke0Var.invalidate();
        }
        ke0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        ArrayList arrayList = this.z1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
        }
        super.K();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.w1;
            if (i7 >= arrayList.size()) {
                break;
            }
            pe0 pe0Var = (pe0) arrayList.get(i7);
            if (pe0Var != null) {
                i10 += pe0Var.a;
                if (Arrays.equals(pe0Var.d, bArr)) {
                    i11 += pe0Var.a;
                }
            }
            i7++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.H1;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i10 = tL_messageMediaPoll.results.total_voters;
        }
        if (i10 <= 0) {
            return 0;
        }
        return Math.round((i11 / i10) * 100.0f);
    }

    public final void L0() {
        HashMap hashMap;
        HashMap hashMap2 = this.v1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.r1.k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.w1;
        int size = arrayList2.size();
        int i7 = 100;
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            pe0 pe0Var = (pe0) arrayList2.get(i10);
            ne0 ne0Var = new ne0();
            arrayList.add(ne0Var);
            hashMap2.put(pe0Var, ne0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(pe0Var.d, tL_messageMediaPoll.results.results.get(i13).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        ne0Var.a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z9 = true;
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
        if (!z9 || i7 == 0) {
            return;
        }
        Collections.sort(arrayList, new org.telegram.ui.pe(12));
        int min = Math.min(i7, arrayList.size());
        for (int i15 = 0; i15 < min; i15++) {
            ((ne0) arrayList.get(i15)).getClass();
        }
    }

    public final void M0() {
        Paint paint = this.A1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.E1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.B1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.C1 = matrix;
        this.B1.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        r6 r6Var = new r6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.n1};
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.p1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, r6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, r6Var, org.telegram.ui.ActionBar.m6.i5));
        int i10 = org.telegram.ui.ActionBar.m6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.l1, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
            if (this.I1 && x02 == this.J1 && x03 == this.K1) {
                return;
            }
            this.I1 = true;
            this.J1 = x02;
            this.K1 = x03;
            Drawable drawable = this.n1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
