package di;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.aj;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.messenger.xi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mc extends org.telegram.ui.ActionBar.x2 implements fs {
    public long A1;
    public final fi.r0 B1;
    public final fi.m0 C1;
    public final View D1;
    public final mp E1;
    public final bc F1;
    public final fj G1;
    public final ArrayList H1;
    public final b I1;
    public int J1;
    public fi.a2 K1;
    public int L1;
    public c7 M1;
    public final lq[] N1;
    public boolean O1;
    public boolean P1;
    public bn Q1;
    public View R1;
    public ValueAnimator S1;
    public final org.telegram.ui.ActionBar.i6 m1;
    public final int n1;
    public final boolean o1;
    public final boolean p1;
    public final LinearLayout q1;
    public final FrameLayout r1;
    public final LinearLayout s1;
    public final wb t1;
    public final FrameLayout u1;
    public final FrameLayout v1;
    public final org.telegram.ui.Components.q9 w1;
    public final hi.d x1;
    public final lc y1;
    public long z1;

    public mc(Context context, final int i7, final long j3, bn bnVar, fj fjVar, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        TLRPC.MessageReactor messageReactor;
        long j11;
        boolean z12;
        int[] iArr;
        String a02;
        String str;
        TLRPC.MessageReactor messageReactor2;
        Context context2;
        this.N1 = new lq[1];
        this.P1 = false;
        this.m1 = i6Var;
        this.n1 = i7;
        this.G1 = fjVar;
        this.H1 = arrayList;
        this.o1 = z11;
        this.p1 = z10;
        b bVar = new b(i7, context, i6Var);
        this.I1 = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        this.c.addView(bVar, c8.ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ra.a(bVar);
        bVar.setOnClickListener(new bi.p(1, context, i6Var));
        long e10 = j10.i(i7).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o4 = org.telegram.messenger.n5.o(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    o4 = e10;
                }
                if (messageReactor4.my || o4 == e10) {
                    messageReactor3 = messageReactor4;
                }
            }
            messageReactor = messageReactor3;
        } else {
            messageReactor = null;
        }
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i11)).my) {
                        break;
                    }
                    i11++;
                }
            }
            j11 = e10;
            this.z1 = j10;
        } else {
            j11 = e10;
            this.z1 = x8.y(i7, false).B(fjVar);
        }
        long j12 = this.z1;
        this.A1 = j12 == 2666000 ? j11 : j12;
        P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i6Var));
        this.J1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r1 = frameLayout;
        linearLayout.addView(frameLayout, c8.ma.o(-1, -2));
        this.t1 = new wb(this, context, i6Var, z11, i7);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = org.telegram.messenger.mp.u1(i7).c6;
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (true) {
            if (i12 >= 9) {
                z12 = z13;
                break;
            }
            int i13 = iArr2[i12];
            z12 = z13;
            if (i13 > j13) {
                arrayList2.add(Integer.valueOf((int) j13));
                break;
            }
            arrayList2.add(Integer.valueOf(i13));
            if (iArr2[i12] == j13) {
                break;
            }
            i12++;
            z13 = z12;
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            iArr3[i14] = ((Integer) arrayList2.get(i14)).intValue();
        }
        wb wbVar = this.t1;
        wbVar.f0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                wbVar.setAlpha(0.5f);
            }
            this.r1.addView(this.t1, c8.ma.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z12) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.s1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.r1.addView(linearLayout2, c8.ma.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.u1 = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v1 = frameLayout3;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i15 = org.telegram.ui.ActionBar.n6.i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i15, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i15);
        frameLayout3.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout3, d02, M, null, i6Var);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.w1 = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        q9Var.getImageReceiver().B0 = true;
        N0();
        frameLayout3.addView(q9Var, c8.ma.e(28, 28, ks.A1));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.n6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView, i16, i6Var, mode);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, c8.ma.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, c8.ma.e(52, 28, 17));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout2, c8.ma.q(-2, -1, 0.0f, ks.A1, 6, 4, 6, 0));
        c8.ra.a(frameLayout2);
        e0.g(i7).o();
        xb xbVar = new xb(context, 0);
        int i17 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(xbVar, i17, i6Var);
        xbVar.setTextSize(1, 20.0f);
        xbVar.setGravity(17);
        xbVar.setText(gd.M0(2131744803, null));
        xbVar.setTypeface(org.telegram.messenger.g0.o());
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(xbVar, c8.ma.q(-1, -2, 1.0f, ks.E1, 2, 0, 2, 0));
        final int i18 = 0;
        M0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.W5, i6Var, mode);
        c8.ra.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: di.sb
            public final /* synthetic */ mc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        mc mcVar = this.b;
                        mp mpVar = mcVar.E1;
                        mpVar.a(!mpVar.a.q, true);
                        mcVar.z1 = mpVar.a.q ? mcVar.A1 : 2666000L;
                        mcVar.N0();
                        lc lcVar = mcVar.y1;
                        if (lcVar != null) {
                            lcVar.setMyPrivacy(mcVar.z1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, c8.ma.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.r1.addView(linearLayout3, c8.ma.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, i17, i6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = gd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            iArr = null;
            a02 = gd.a0(null, null, 2131744808, O0 == null ? "" : O0.title);
        }
        textView.setText(org.telegram.messenger.j6.m(org.telegram.messenger.g0.W2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, c8.ma.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new yb(context, i6Var), c8.ma.t(-1, 30, 55, 0, 20, 0, 0));
            }
            lc lcVar = new lc(this, context, z11);
            this.y1 = lcVar;
            lcVar.setOnSenderClickListener(new x10() { // from class: di.tb
                @Override // org.telegram.messenger.x10
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    mc mcVar = mc.this;
                    boolean z14 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == j10.i(i7).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new zb(mcVar, bundle, z14));
                        mcVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new ac(mcVar, bundle2, z14));
                    }
                    mcVar.dismiss();
                }
            });
            this.q1.addView(lcVar, c8.ma.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, ks.v1));
            View view = new View(context);
            this.D1 = view;
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, i6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.q1.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.p, -1, 7, 24, 0, 24, 0));
            }
            str = null;
        } else {
            str = null;
            this.y1 = null;
            this.D1 = null;
        }
        if (z11) {
            int i19 = org.telegram.ui.ActionBar.n6.j5;
            TextView b10 = c8.va.b(context, 20.0f, i19, true, i6Var);
            b10.setGravity(17);
            b10.setText(gd.M0(z10 ? 2131748599 : 2131748601, str));
            this.q1.addView(b10, c8.ma.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = c8.va.b(context, 14.0f, i19, false, i6Var);
            b11.setGravity(17);
            org.telegram.messenger.f3.q(null, null, z10 ? 2131748600 : z12 ? 2131748602 : 2131748603, new Object[]{org.telegram.messenger.n5.l(j10.t0, j3)}, b11);
            this.q1.addView(b11, c8.ma.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            fi.r0 r0Var = new fi.r0();
            this.B1 = r0Var;
            messageReactor2 = messageReactor;
            r0Var.c = this.z1;
            r0Var.g = 50L;
            r0Var.e = true;
            fi.m0 m0Var = new fi.m0(i7, context, true);
            this.C1 = m0Var;
            m0Var.set(r0Var);
            this.q1.addView(m0Var, c8.ma.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        mp mpVar = new mp(21, context, i6Var);
        this.E1 = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.j7, org.telegram.ui.ActionBar.n6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(this.z1 != 2666000, false);
        lc lcVar2 = this.y1;
        if (lcVar2 != null) {
            lcVar2.setMyPrivacy(this.z1);
        }
        mpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView2, i17, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(gd.M0(2131744811, null));
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        g10.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        g10.addView(mpVar, c8.ma.t(21, 21, 16, 0, 0, 9, 0));
        g10.addView(textView2, c8.ma.r(-2, -2, 16));
        final int i20 = 1;
        g10.setOnClickListener(new View.OnClickListener(this) { // from class: di.sb
            public final /* synthetic */ mc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        mc mcVar = this.b;
                        mp mpVar2 = mcVar.E1;
                        mpVar2.a(!mpVar2.a.q, true);
                        mcVar.z1 = mpVar2.a.q ? mcVar.A1 : 2666000L;
                        mcVar.N0();
                        lc lcVar3 = mcVar.y1;
                        if (lcVar3 != null) {
                            lcVar3.setMyPrivacy(mcVar.z1);
                            break;
                        }
                        break;
                }
            }
        });
        c8.ra.b(g10, 0.05f, 1.2f);
        int i21 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i21, i6Var), 6, 6);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i21);
        g10.setBackground(a03);
        org.telegram.ui.ActionBar.u6.j(g10, a03, null, M2, i6Var);
        if (!z11 && (z10 || messageReactor2 != null)) {
            this.q1.addView(g10, c8.ma.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        hi.d dVar = new hi.d(context, i6Var, true);
        this.x1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.q1.addView(dVar, c8.ma.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        O0(0L);
        dVar.i(pb.Z0(false, gd.a0(null, null, 2131744812, gd.E(50L, ',')), this.N1), true, true);
        if (z10) {
            context2 = context;
            dVar.setOnClickListener(new x9(this, fjVar, bnVar, i7, z11, context, i6Var, j3, O0));
        } else {
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: di.ub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j14;
                int i22 = i7;
                e0 g11 = e0.g(i22);
                g11.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g11.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, j10.i(i22).f());
                mc mcVar = mc.this;
                y60 G = y60.G(mcVar.b, i6Var, mcVar.v1);
                int size2 = arrayList3.size();
                int i23 = 0;
                while (i23 < size2) {
                    int i24 = i23 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i23);
                    if (tLObject instanceof TLRPC.User) {
                        j14 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.v3.V(chat)) {
                                j14 = -chat.id;
                            }
                        }
                        i23 = i24;
                    }
                    if (j14 != j3) {
                        long j15 = mcVar.z1;
                        G.g(tLObject, j14 == j15 || (j15 == 0 && j14 == j10.i(i22).e()), new vb(mcVar, j14, z11, 0));
                    }
                    i23 = i24;
                }
                G.t = false;
                G.b0 = true;
                G.s = 0;
                G.W(5);
                G.a0();
            }
        });
        k80 k80Var = new k80(context2, i6Var);
        k80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.z6, i6Var);
        if (!z11 || z10) {
            k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131744810, null), new ai.a(context2, 8)));
        } else {
            k80Var.setText(gd.M0(2131748604, null));
        }
        k80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.k5, i6Var);
        if (z10 || z11) {
            this.q1.addView(k80Var, c8.ma.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.O = this.q1;
        int i22 = 0;
        bc bcVar = new bc(context2, 1, 2, i22);
        this.F1 = bcVar;
        vg.f fVar = bcVar.b;
        fVar.z = org.telegram.ui.ActionBar.n6.Wk;
        fVar.A = org.telegram.ui.ActionBar.n6.Xk;
        fVar.b();
        bcVar.b.k = 1.0f;
        bcVar.setVisibility(4);
        bcVar.setPaused(true);
        this.c.addView(bcVar, c8.ma.c(150.0f, ks.g2));
        this.t1.setValue(50);
        if (arrayList != null) {
            long j14 = 0;
            while (i22 < arrayList.size()) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i22)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
                i22++;
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > 0) {
                this.t1.setStarsTop(j14 + 1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void F(ArrayList arrayList, boolean z10) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        b bVar = this.I1;
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(bVar, (Property<b, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        if (this.t1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void K0(final t8 t8Var) {
        ch.n0 n0Var;
        View view;
        ch.q0 q0Var;
        fi.a2 a2Var;
        View view2;
        ch.q0 q0Var2;
        ch.n0 n0Var2;
        fj fjVar;
        wb wbVar = this.t1;
        bc bcVar = this.F1;
        fj fjVar2 = this.G1;
        if (fjVar2 != null && (view2 = this.Q1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.R1;
            if (view3 instanceof org.telegram.ui.Cells.r1) {
                q0Var2 = ((org.telegram.ui.Cells.r1) view3).O;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.v0) {
                q0Var2 = ((org.telegram.ui.Cells.v0) view3).F0;
                q0Var2.getClass();
                n0Var2 = q0Var2.l("stars");
            } else {
                q0Var2 = null;
                n0Var2 = null;
            }
            if (n0Var2 == null && q0Var2 != null) {
                aj u92 = this.Q1.u9(fjVar2);
                if (u92 != null && !u92.e.isEmpty()) {
                    ArrayList arrayList = u92.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            fjVar = null;
                            break;
                        }
                        Object obj = arrayList.get(i7);
                        i7++;
                        fjVar = (fj) obj;
                        xi d = u92.d(fjVar);
                        if (d != null) {
                            int i10 = d.l;
                            if ((i10 & 1) != 0 && (i10 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (fjVar != null) {
                        view3 = this.Q1.J8(fjVar.e1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.r1) {
                    q0Var2 = ((org.telegram.ui.Cells.r1) view3).O;
                    q0Var2.getClass();
                    n0Var2 = q0Var2.l("stars");
                }
            }
            if (n0Var2 == null) {
                return;
            }
            q0Var = q0Var2;
            n0Var = n0Var2;
            view = view3;
        } else {
            if (this.K1 == null) {
                return;
            }
            n0Var = null;
            view = null;
            q0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        wbVar.getLocationInWindow(iArr);
        rectF.set(wbVar.H.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        qb qbVar = new qb(this, 2);
        bcVar.b0 = qbVar;
        if (bcVar.a0) {
            bcVar.b0 = null;
            qbVar.run();
        }
        if (n0Var != null) {
            n0Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ch.n0 n0Var3 = n0Var;
        fi.m0[] m0VarArr = new fi.m0[1];
        if (this.o1 && (a2Var = this.K1) != null) {
            m0VarArr[0] = a2Var.d(this.L1);
        }
        final RectF rectF2 = new RectF();
        final m6 m6Var = new m6(this, m0VarArr, iArr, rectF2, view, q0Var, n0Var3, 3);
        View view4 = view;
        m6Var.run();
        bcVar.setPaused(false);
        bcVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        bcVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        bcVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        bcVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        bcVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
        ValueAnimator valueAnimator = this.S1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: di.rb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m6Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                mc mcVar = mc.this;
                bc bcVar2 = mcVar.F1;
                bcVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                bcVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                bcVar2.setScaleX(T1);
                bcVar2.setScaleY(T1);
                vg.f fVar = bcVar2.b;
                fVar.d = 360.0f * floatValue;
                fVar.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    mcVar.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = t8Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.S1.addListener(new cc(this, n0Var3, view4, m0VarArr, zArr, rectF2, t8Var));
        this.S1.setDuration(800L);
        this.S1.setInterpolator(new c5.c(1));
        this.S1.start();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        ValueAnimator valueAnimator = this.S1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.L();
        }
    }

    public final boolean L0() {
        if (!this.o1) {
            e0 g10 = e0.g(this.n1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.v3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void M0(boolean z10) {
        FrameLayout frameLayout = this.u1;
        if ((frameLayout.getVisibility() == 0) != L0()) {
            frameLayout.setVisibility(L0() ? 0 : 8);
            if (z10) {
                if (L0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.s1, changeBounds);
            }
        }
    }

    public final void N0() {
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.p = 0.42f;
        long j3 = this.z1;
        org.telegram.ui.Components.q9 q9Var = this.w1;
        if (j3 == 2666000) {
            b9Var.g(21);
            int i7 = org.telegram.ui.ActionBar.n6.c8;
            org.telegram.ui.ActionBar.i6 i6Var = this.m1;
            b9Var.i(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            q9Var.f(null, b9Var);
            return;
        }
        int i10 = this.n1;
        if (j3 >= 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i10).c2(Long.valueOf(this.z1));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-this.z1));
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
        }
    }

    public final void O0(long j3) {
        lc lcVar;
        long j10;
        long j11;
        long j12 = 0;
        if ((!this.o1 || this.p1 || j3 <= 0) && (lcVar = this.y1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = j10.i(this.n1).e();
            int i7 = 1;
            ArrayList arrayList2 = this.H1;
            if (arrayList2 != null) {
                j11 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o4 = org.telegram.messenger.n5.o(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        o4 = messageReactor.my ? e10 : (-i10) - i7;
                    }
                    if (messageReactor.my || o4 == e10) {
                        j11 = messageReactor.count;
                    } else {
                        long j14 = messageReactor.count;
                        fc fcVar = new fc();
                        fcVar.a = z10;
                        fcVar.b = false;
                        fcVar.c = o4;
                        fcVar.d = j14;
                        arrayList.add(fcVar);
                    }
                    i10++;
                    j12 = j13;
                    i7 = 1;
                }
                j10 = j12;
            } else {
                j10 = 0;
                j11 = 0;
            }
            long j15 = j11 + j3;
            if (j15 > j10) {
                boolean z11 = this.z1 == 2666000;
                fc fcVar2 = new fc();
                fcVar2.a = z11;
                fcVar2.b = true;
                fcVar2.c = e10;
                fcVar2.d = j15;
                arrayList.add(fcVar2);
            }
            Collections.sort(arrayList, new a3.c(17));
            lcVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean Y(float f10, float f11) {
        b bVar = this.I1;
        if (f10 < bVar.getX() || f10 > bVar.getX() + bVar.getWidth() || f11 < bVar.getY() || f11 > bVar.getY() + bVar.getHeight()) {
            return super.Y(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.P3) {
            M0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        Long z12;
        if (!this.O1 && !this.P1) {
            this.P1 = true;
            fj fjVar = this.G1;
            if (fjVar != null && ((z12 = fjVar.z1()) == null || z12.longValue() != this.z1)) {
                fjVar.J5(this.z1);
                q8 b10 = q8.b(fjVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i7 = this.n1;
                org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                long j3 = b10.a;
                int i10 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = u12.l1(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j10 = this.z1;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = org.telegram.messenger.mp.u1(i7).l1(this.z1);
                }
                ks.f(i7).k(ks.I1, Long.valueOf(b10.a), Integer.valueOf(i10), Long.valueOf(this.z1));
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_togglePaidReactionPrivacy, new ai.e1(this, 5));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.n1).c(this, ks.P3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.n1).n(this, ks.P3);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 >= 0 || this.H0 != this.J1 || (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, this.m1)) == this.H0) {
                return;
            }
            this.H0 = w02;
            this.J1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
