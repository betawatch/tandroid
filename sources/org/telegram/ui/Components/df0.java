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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class df0 extends org.telegram.ui.ActionBar.x2 {
    public static final org.telegram.ui.Cells.o8 M1 = new org.telegram.ui.Cells.o8("placeholderAlpha", 9);
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
    public final xe0 m1;
    public final ze0 n1;
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
    public final w5 y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(Context context, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
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
                this.x1.add(new cf0(tL_messages_votesList, pollAnswerVoters.option));
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
        Collections.sort(this.x1, new we0(this));
        N0();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.o1 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i5, false), PorterDuff.Mode.MULTIPLY));
        hi.q3 q3Var = new hi.q3(this, context);
        this.b = q3Var;
        q3Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i16 = this.u0;
        viewGroup.setPadding(i16, 0, i16, 0);
        xe0 xe0Var = new xe0(this, context);
        this.m1 = xe0Var;
        xe0Var.setSections(false);
        v4.k kVar = new v4.k();
        kVar.c = 150L;
        kVar.e = 350L;
        kVar.f = 0L;
        kVar.g = 0L;
        kVar.d = 0L;
        kVar.C = false;
        kVar.i = new OvershootInterpolator(1.1f);
        kVar.o = lr.h;
        xe0Var.setItemAnimator(kVar);
        xe0Var.setClipToPadding(false);
        getContext();
        xe0Var.setLayoutManager(new jg.b0(i11, z10, 9));
        xe0Var.setHorizontalScrollBarEnabled(false);
        xe0Var.setVerticalScrollBarEnabled(false);
        int i17 = 2;
        xe0Var.setSectionsType(2);
        this.b.addView(xe0Var, c8.ma.e(-1, -1, 51));
        ze0 ze0Var = new ze0(this, context);
        this.n1 = ze0Var;
        xe0Var.setAdapter(ze0Var);
        org.telegram.ui.ActionBar.u6.l(xe0Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        xe0Var.setOnItemClickListener(new fi.g4(13, this, context));
        xe0Var.setOnScrollListener(new oa(this, 14));
        w5 w5Var = new w5(context);
        this.y1 = w5Var;
        w5Var.setTextSize(1, 18.0f);
        w5Var.setTypeface(org.telegram.messenger.g0.o());
        w5Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(21.0f));
        int i18 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(w5Var, i18, null);
        w5Var.setTag(-33024);
        w5Var.setLayoutParams(new v4.q0(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.t1.question;
        if (tL_textWithEntities2 != null) {
            org.telegram.messenger.fj fjVar2 = this.s1;
            if (fjVar2 != null && fjVar2.L2 && (message = fjVar2.k) != null && (w00Var = message.translatedPoll) != null && (tL_textWithEntities = w00Var.a) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            org.telegram.messenger.ks.i(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            org.telegram.messenger.ri.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder, -1);
            CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false, null, 0);
            org.telegram.messenger.fj.B5(m10, tL_textWithEntities2.entities, w5Var.getPaint().getFontMetricsInt(), false);
            w5Var.setText(m10);
        }
        v7 v7Var = new v7(i17, context, this);
        this.q1 = v7Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, v7Var, null);
        v7Var.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.u6.l(v7Var, 1, i18, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 3, org.telegram.ui.ActionBar.n6.I5, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 5, i18, null);
        org.telegram.ui.ActionBar.u6.l(v7Var, 6, org.telegram.ui.ActionBar.n6.Gj, null);
        v7Var.setOccupyStatusBar(false);
        v7Var.setAlpha(0.0f);
        v7Var.setTitle(org.telegram.messenger.gd.M0(2131746968, null));
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
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        this.b.addView(view, c8.ma.c(1.0f, -1));
    }

    public static void J0(df0 df0Var) {
        v7 v7Var = df0Var.q1;
        xe0 xe0Var = df0Var.m1;
        if (xe0Var.getChildCount() <= 0) {
            int paddingTop = xe0Var.getPaddingTop();
            df0Var.z1 = paddingTop;
            xe0Var.setTopGlowOffset(paddingTop);
            df0Var.b.invalidate();
            return;
        }
        View childAt = xe0Var.getChildAt(0);
        kj0 kj0Var = (kj0) xe0Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        boolean z10 = top <= org.telegram.messenger.g0.L(12.0f);
        if ((z10 && v7Var.getTag() == null) || (!z10 && v7Var.getTag() != null)) {
            v7Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = df0Var.r1;
            if (animatorSet != null) {
                animatorSet.cancel();
                df0Var.r1 = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            df0Var.r1 = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = df0Var.r1;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(v7Var, (Property<v7, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(df0Var.p1, (Property<View, Float>) property, z10 ? 1.0f : 0.0f));
            df0Var.r1.addListener(new q60(df0Var, 9));
            df0Var.r1.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xe0Var.getLayoutParams();
        int i7 = org.telegram.ui.Cells.c0.i(11.0f, layoutParams.topMargin, top);
        if (df0Var.z1 != i7) {
            df0Var.z1 = i7;
            xe0Var.setTopGlowOffset(i7 - layoutParams.topMargin);
            df0Var.b.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f7));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return false;
    }

    public final void K0(View view) {
        xe0 xe0Var;
        TLRPC.Message message;
        int i7 = -2;
        while (true) {
            xe0Var = this.m1;
            int i10 = 0;
            if (i7 >= xe0Var.getChildCount()) {
                break;
            }
            View pinnedHeader = i7 == -2 ? view : i7 == -1 ? xe0Var.getPinnedHeader() : xe0Var.getChildAt(i7);
            if ((pinnedHeader instanceof bf0) && (pinnedHeader.getTag(R.id.object_tag) instanceof cf0)) {
                bf0 bf0Var = (bf0) pinnedHeader;
                cf0 cf0Var = (cf0) pinnedHeader.getTag(R.id.object_tag);
                TLRPC.Poll poll = this.t1;
                int size = poll.answers.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i11);
                        if (!Arrays.equals(pollAnswer.option, cf0Var.d) || ((af0) this.w1.get(cf0Var)) == null) {
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
                            bf0Var.a(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, L0(cf0Var.d), cf0Var.a, cf0Var.a(), true);
                            bf0Var.setTag(R.id.object_tag, cf0Var);
                        }
                    }
                }
            }
            i7++;
        }
        View view2 = xe0Var.q1;
        if (view2 != null) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(xe0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(xe0Var.getMeasuredHeight(), 0));
            View view3 = xe0Var.q1;
            view3.layout(0, 0, view3.getMeasuredWidth(), xe0Var.q1.getMeasuredHeight());
            xe0Var.invalidate();
        }
        xe0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.x2
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
            cf0 cf0Var = (cf0) arrayList.get(i7);
            if (cf0Var != null) {
                i10 += cf0Var.a;
                if (Arrays.equals(cf0Var.d, bArr)) {
                    i11 += cf0Var.a;
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
            cf0 cf0Var = (cf0) arrayList2.get(i10);
            af0 af0Var = new af0();
            arrayList.add(af0Var);
            hashMap2.put(cf0Var, af0Var);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i13 = 0;
                while (i13 < size2) {
                    hashMap = hashMap2;
                    if (Arrays.equals(cf0Var.d, tL_messageMediaPoll.results.results.get(i13).option)) {
                        float f10 = (r7.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                        int i14 = (int) f10;
                        af0Var.a = f10 - i14;
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
            ((af0) arrayList.get(i15)).getClass();
        }
    }

    public final void N0() {
        Paint paint = this.B1;
        if (paint == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i5, false);
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

    @Override // org.telegram.ui.ActionBar.x2
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 3);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.o1};
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.q1, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.j5));
        xe0 xe0Var = this.m1;
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{View.class}, (String[]) null, (Drawable[]) null, w6Var, org.telegram.ui.ActionBar.n6.i5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(xe0Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.i5, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false);
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
