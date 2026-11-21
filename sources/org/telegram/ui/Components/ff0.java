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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ff0 extends org.telegram.ui.ActionBar.w2 {
    public static final org.telegram.ui.Cells.p8 M1 = new org.telegram.ui.Cells.p8("placeholderAlpha", 9);
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
    public final ze0 m1;
    public final bf0 n1;
    public final Drawable o1;
    public final View p1;
    public final v7 q1;
    public AnimatorSet r1;
    public final org.telegram.messenger.fj s1;
    public final TLRPC.Poll t1;
    public final TLRPC.InputPeer u1;
    public final HashSet v1;
    public final HashMap w1;
    public final ArrayList x1;
    public final x5 y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff0(Context context, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        TLRPC.Message message;
        org.telegram.messenger.w00 w00Var;
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
        this.s1 = fjVar;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) fjVar.k.media;
        this.I1 = tL_messageMediaPoll;
        this.t1 = tL_messageMediaPoll.poll;
        this.u1 = org.telegram.messenger.mp.u1(this.a).l1(org.telegram.messenger.fj.B0(fjVar.k));
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
                this.x1.add(new ef0(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.u1;
                tL_messages_getPollVotes.id = this.s1.e1();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer valueOf = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getPollVotes, new bg.l0(this, numArr, i12, arrayList, pollAnswerVoters, 7)));
                numArr[i12] = valueOf;
                this.A1.add(valueOf);
            }
            i12++;
            i11 = i10;
        }
        M0();
        Collections.sort(this.x1, new ye0(this));
        N0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.o1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false), PorterDuff.Mode.MULTIPLY));
        hi.p3 p3Var = new hi.p3(this, context);
        this.b = p3Var;
        p3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.u0;
        viewGroup.setPadding(i16, 0, i16, 0);
        ze0 ze0Var = new ze0(this, context);
        this.m1 = ze0Var;
        ze0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = nr.h;
        ze0Var.setItemAnimator(kVar);
        ze0Var.setClipToPadding(false);
        getContext();
        ze0Var.setLayoutManager(new jg.b0(i11, z10, 9));
        ze0Var.setHorizontalScrollBarEnabled(false);
        ze0Var.setVerticalScrollBarEnabled(false);
        int i17 = 2;
        ze0Var.setSectionsType(2);
        this.b.addView(ze0Var, c8.ma.e(-1, -1, 51));
        bf0 bf0Var = new bf0(this, context);
        this.n1 = bf0Var;
        ze0Var.setAdapter(bf0Var);
        org.telegram.ui.ActionBar.t6.l(ze0Var, 21, org.telegram.ui.ActionBar.m6.A5, null);
        ze0Var.setOnItemClickListener(new fi.g4(13, this, context));
        ze0Var.setOnScrollListener(new oa(this, 14));
        x5 x5Var = new x5(context);
        this.y1 = x5Var;
        x5Var.setTextSize(1, 18.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(x5Var, i18, null);
        x5Var.setTag(-33024);
        x5Var.setLayoutParams(new v4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.t1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.fj fjVar2 = this.s1;
            if (fjVar2 != null && fjVar2.L2 && (message = fjVar2.k) != null && (w00Var = message.translatedPoll) != null && (tL_textWithEntities = w00Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.ks.i(x5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ri.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, tL_textWithEntities2.entities, x5Var.getPaint().getFontMetricsInt(), false);
            x5Var.setText(m10);
        }
        v7 v7Var = new v7(i17, context, this);
        this.q1 = v7Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, v7Var, null);
        v7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.t6.l(v7Var, 1, i18, null);
        org.telegram.ui.ActionBar.t6.l(v7Var, 3, org.telegram.ui.ActionBar.m6.I5, null);
        org.telegram.ui.ActionBar.t6.l(v7Var, 5, i18, null);
        org.telegram.ui.ActionBar.t6.l(v7Var, 6, org.telegram.ui.ActionBar.m6.Gj, null);
        v7Var.setOccupyStatusBar(false);
        v7Var.setAlpha(0.0f);
        v7Var.setTitle(org.telegram.messenger.gd.N0(2131746967, null));
        if (this.t1.quiz) {
            v7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Answer", new Object[0]));
        } else {
            v7Var.setSubtitle(org.telegram.messenger.gd.G(tL_messageMediaPoll.results.total_voters, "Vote", new Object[0]));
        }
        this.b.addView(v7Var, c8.ma.c(-2.0f, -1));
        v7Var.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 19));
        View view = new View(context);
        this.p1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.V5, view, null);
        this.b.addView(view, c8.ma.c(1.0f, -1));
    }

    public static void J0(ff0 ff0Var) {
        v7 v7Var = ff0Var.q1;
        ze0 ze0Var = ff0Var.m1;
        if (ze0Var.getChildCount() <= 0) {
            int paddingTop = ze0Var.getPaddingTop();
            ff0Var.z1 = paddingTop;
            ze0Var.setTopGlowOffset(paddingTop);
            ff0Var.b.invalidate();
            return;
        }
        View childAt = ze0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ze0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && v7Var.getTag() == null) || (!z10 && v7Var.getTag() != null)) {
            v7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = ff0Var.r1;
            if (animatorSet != null) {
                animatorSet.cancel();
                ff0Var.r1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            ff0Var.r1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = ff0Var.r1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(v7Var, (Property<v7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ff0Var.p1, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            ff0Var.r1.addListener(new s60(ff0Var, 9));
            ff0Var.r1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ze0Var.getLayoutParams();
        int i7 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin, top);
        if (ff0Var.z1 != i7) {
            ff0Var.z1 = i7;
            ze0Var.setTopGlowOffset(i7 - layoutParams.topMargin);
            ff0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f7));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void K0(View view) {
        ze0 ze0Var;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            ze0Var = this.m1;
            int i10 = 0;
            if (i7 >= ze0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i7 == -2 ? view : i7 == -1 ? ze0Var.getPinnedHeader() : ze0Var.getChildAt(i7);
            if ((pinnedHeader instanceof df0) && (pinnedHeader.getTag(R.id.object_tag) instanceof ef0)) {
                df0 df0Var = (df0) pinnedHeader;
                ef0 ef0Var = (ef0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.t1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (!Arrays.equals(pollAnswer.option, ef0Var.d) || ((cf0) this.w1.get(ef0Var)) == null) {
                            i11++;
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            org.telegram.messenger.fj fjVar = this.s1;
                            if (fjVar != null && fjVar.L2 && (message = fjVar.k) != null && message.translatedPoll != null) {
                                while (true) {
                                    if (i10 >= fjVar.k.translatedPoll.b.size()) {
                                        break;
                                    }
                                    TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) fjVar.k.translatedPoll.b.get(i10);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            df0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, L0(ef0Var.d), ef0Var.a, ef0Var.a(), true);
                            df0Var.setTag(R.id.object_tag, ef0Var);
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = ze0Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(ze0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ze0Var.getMeasuredHeight(), 0));
            View view3 = ze0Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), ze0Var.q1.getMeasuredHeight());
            ze0Var.invalidate();
        }
        ze0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        ArrayList arrayList = this.A1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ConnectionsManager.getInstance(this.a).cancelRequest(((Integer) arrayList.get(i7)).intValue(), true);
        }
        super.L();
    }

    public final int L0(byte[] bArr) {
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
            ef0 ef0Var = (ef0) arrayList.get(i7);
            if (ef0Var != null) {
                i10 += ef0Var.a;
                if (Arrays.equals(ef0Var.d, bArr)) {
                    i11 += ef0Var.a;
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

    public final void M0() {
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
            ef0 ef0Var = (ef0) arrayList2.get(i10);
            cf0 cf0Var = new cf0();
            arrayList.add(cf0Var);
            hashMap2.put(ef0Var, cf0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(ef0Var.d, tL_messageMediaPoll.results.results.get(i13).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        cf0Var.a = f10 - i14;
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
        Collections.sort(arrayList, new org.telegram.ui.pe(11));
        int min = Math.min(i7, arrayList.size());
        for (int i15 = 0; i15 < min; i15++) {
            ((cf0) arrayList.get(i15)).getClass();
        }
    }

    public final void N0() {
        Paint paint = this.B1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false);
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

    @Override // org.telegram.ui.ActionBar.w2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.zj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.o1};
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.q1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.j5));
        ze0 ze0Var = this.m1;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ze0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, x6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ze0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ze0Var, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ze0Var, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i5, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false);
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
            N0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
