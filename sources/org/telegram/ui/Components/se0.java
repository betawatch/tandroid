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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class se0 extends org.telegram.ui.ActionBar.t2 {
    public static final org.telegram.ui.Cells.n8 J1 = new org.telegram.ui.Cells.n8("placeholderAlpha", 9);
    public Matrix A1;
    public float B1;
    public float C1;
    public boolean D1;
    public final RectF E1;
    public final TLRPC.TL_messageMediaPoll F1;
    public boolean G1;
    public int H1;
    public int I1;
    public final me0 j1;
    public final oe0 k1;
    public final Drawable l1;
    public final View m1;
    public final p7 n1;
    public AnimatorSet o1;
    public final org.telegram.messenger.zi p1;
    public final TLRPC.Poll q1;
    public final TLRPC.InputPeer r1;
    public final HashSet s1;
    public final HashMap t1;
    public final ArrayList u1;
    public final o5 v1;
    public int w1;
    public final ArrayList x1;
    public final Paint y1;
    public LinearGradient z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(Context context, int i3, org.telegram.messenger.zi ziVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.u00 u00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        int i11 = 1;
        this.s1 = new HashSet();
        this.t1 = new HashMap();
        this.u1 = new ArrayList();
        this.x1 = new ArrayList();
        this.y1 = new Paint(1);
        this.D1 = true;
        this.E1 = new RectF();
        this.a = i3;
        this.x = true;
        N();
        this.p1 = ziVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) ziVar.k.media;
        this.F1 = tL_messageMediaPoll;
        this.q1 = tL_messageMediaPoll.poll;
        this.r1 = org.telegram.messenger.hp.s1(this.a).j1(org.telegram.messenger.zi.B0(ziVar.k));
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
                this.u1.add(new re0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.r1;
                tL_messages_getPollVotes.id = this.p1.f1();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new cg.j0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.x1.add(valueOf);
            }
            i12++;
            i11 = i10;
        }
        L0();
        Collections.sort(this.u1, new le0(this));
        M0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.l1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false), PorterDuff.Mode.MULTIPLY));
        gi.q3 q3Var = new gi.q3(this, context);
        this.b = q3Var;
        q3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.u0;
        viewGroup.setPadding(i16, 0, i16, 0);
        me0 me0Var = new me0(this, context);
        this.j1 = me0Var;
        me0Var.setSections(false);
        u4.k kVar = new u4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = xq.h;
        me0Var.setItemAnimator(kVar);
        me0Var.setClipToPadding(false);
        getContext();
        me0Var.setLayoutManager(new kg.y(i11, z10, 9));
        me0Var.setHorizontalScrollBarEnabled(false);
        me0Var.setVerticalScrollBarEnabled(false);
        int i17 = 2;
        me0Var.setSectionsType(2);
        this.b.addView(me0Var, b8.mf.e(-1, -1, 51));
        oe0 oe0Var = new oe0(this, context);
        this.k1 = oe0Var;
        me0Var.setAdapter(oe0Var);
        org.telegram.ui.ActionBar.r6.m(me0Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        int i18 = 13;
        me0Var.setOnItemClickListener(new ei.q4(i18, this, context));
        me0Var.setOnScrollListener(new ji(this, i18));
        o5 o5Var = new o5(context);
        this.v1 = o5Var;
        o5Var.setTextSize(1, 18.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i19 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(o5Var, i19, null);
        o5Var.setTag(-33024);
        o5Var.setLayoutParams(new u4.p0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.q1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.zi ziVar2 = this.p1;
            if (ziVar2 != null && ziVar2.J2 && (message = ziVar2.k) != null && (u00Var = message.translatedPoll) != null && (tL_textWithEntities = u00Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.hs.i(o5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.li.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, o5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.zi.C5(m10, tL_textWithEntities2.entities, o5Var.getPaint().getFontMetricsInt(), false);
            o5Var.setText(m10);
        }
        p7 p7Var = new p7(i17, context, this);
        this.n1 = p7Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, p7Var, null);
        p7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r6.m(p7Var, 1, i19, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 3, org.telegram.ui.ActionBar.k6.I5, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 5, i19, null);
        org.telegram.ui.ActionBar.r6.m(p7Var, 6, org.telegram.ui.ActionBar.k6.Dj, null);
        p7Var.setOccupyStatusBar(false);
        p7Var.setAlpha(0.0f);
        p7Var.setTitle(org.telegram.messenger.bd.M0(2131747169, null));
        if (this.q1.quiz) {
            p7Var.setSubtitle(org.telegram.messenger.bd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            p7Var.setSubtitle(org.telegram.messenger.bd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(p7Var, b8.mf.c(-2.0f, -1));
        p7Var.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 17));
        View view = new View(context);
        this.m1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.b.addView(view, b8.mf.c(1.0f, -1));
    }

    public static void I0(se0 se0Var) {
        p7 p7Var = se0Var.n1;
        me0 me0Var = se0Var.j1;
        if (me0Var.getChildCount() <= 0) {
            int paddingTop = me0Var.getPaddingTop();
            se0Var.w1 = paddingTop;
            me0Var.setTopGlowOffset(paddingTop);
            se0Var.b.invalidate();
            return;
        }
        View childAt = me0Var.getChildAt(0);
        bj0 bj0Var = (bj0) me0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && p7Var.getTag() == null) || (!z10 && p7Var.getTag() != null)) {
            p7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = se0Var.o1;
            if (animatorSet != null) {
                animatorSet.cancel();
                se0Var.o1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            se0Var.o1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = se0Var.o1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(p7Var, (Property<p7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(se0Var.m1, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            se0Var.o1.addListener(new a60(se0Var, 9));
            se0Var.o1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) me0Var.getLayoutParams();
        int D = org.telegram.messenger.camera.q.D(11.0f, layoutParams.topMargin, top);
        if (se0Var.w1 != D) {
            se0Var.w1 = D;
            me0Var.setTopGlowOffset(D - layoutParams.topMargin);
            se0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f7));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void J0(View view) {
        me0 me0Var;
        TLRPC.Message message;
        int i3 = -2;
        while (true) {
            me0Var = this.j1;
            int i10 = 0;
            if (i3 >= me0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i3 == -2 ? view : i3 == -1 ? me0Var.getPinnedHeader() : me0Var.getChildAt(i3);
            if ((pinnedHeader instanceof qe0) && (pinnedHeader.getTag(R.id.object_tag) instanceof re0)) {
                qe0 qe0Var = (qe0) pinnedHeader;
                re0 re0Var = (re0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.q1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (!Arrays.equals(pollAnswer.option, re0Var.d) || ((pe0) this.t1.get(re0Var)) == null) {
                            i11++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.zi ziVar = this.p1;
                            if (ziVar != null && ziVar.J2 && (message = ziVar.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= ziVar.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) ziVar.k.translatedPoll.b.get(i10);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            qe0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, K0(re0Var.d), re0Var.a, re0Var.a(), true);
                            qe0Var.setTag(R.id.object_tag, re0Var);
                        }
                    }
                }
            }
            i3++;
        }
        View view2 = me0Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(me0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(me0Var.getMeasuredHeight(), 0));
            View view3 = me0Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), me0Var.q1.getMeasuredHeight());
            me0Var.invalidate();
        }
        me0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        ArrayList arrayList = this.x1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i3)).intValue(), true);
        }
        super.K();
    }

    public final int K0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.u1;
            if (i3 >= arrayList.size()) {
                break;
            }
            re0 re0Var = (re0) arrayList.get(i3);
            if (re0Var != null) {
                i10 += re0Var.a;
                if (Arrays.equals(re0Var.d, bArr)) {
                    i11 += re0Var.a;
                }
            }
            i3++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.F1;
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
        HashMap hashMap2 = this.t1;
        hashMap2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.p1.k.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.u1;
        int size = arrayList2.size();
        int i3 = 100;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            re0 re0Var = (re0) arrayList2.get(i10);
            pe0 pe0Var = new pe0();
            arrayList.add(pe0Var);
            hashMap2.put(re0Var, pe0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(re0Var.d, tL_messageMediaPoll.results.results.get(i13).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        pe0Var.a = f10 - i14;
                        if (i11 == 0) {
                            i11 = i14;
                        } else if (i14 != 0 && i11 != i14) {
                            z10 = true;
                        }
                        i3 -= i14;
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
        if (!z10 || i3 == 0) {
            return;
        }
        Collections.sort(arrayList, new d80(2));
        int min = Math.min(i3, arrayList.size());
        for (int i15 = 0; i15 < min; i15++) {
            ((pe0) arrayList.get(i15)).getClass();
        }
    }

    public final void M0() {
        Paint paint = this.y1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false);
        int w02 = org.telegram.messenger.g0.w0(x03, x02);
        paint.setColor(x03);
        float L = org.telegram.messenger.g0.L(500.0f);
        this.C1 = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.z1 = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.A1 = matrix;
        this.z1.setLocalMatrix(matrix);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.l1};
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.n1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.i5));
        int i10 = org.telegram.ui.ActionBar.k6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.j1, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i5, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false);
            if (this.G1 && x02 == this.H1 && x03 == this.I1) {
                return;
            }
            this.G1 = true;
            this.H1 = x02;
            this.I1 = x03;
            Drawable drawable = this.l1;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
            }
            M0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
