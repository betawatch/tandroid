package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.dj;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ce extends org.telegram.ui.ActionBar.w2 implements ls {
    public final di.s0 A1;
    public final di.n0 B1;
    public final View C1;
    public final wo D1;
    public final qd E1;
    public final ij F1;
    public final ArrayList G1;
    public final c H1;
    public int I1;
    public di.g2 J1;
    public int K1;
    public a1.c L1;
    public final wp[] M1;
    public boolean N1;
    public boolean O1;
    public cn P1;
    public View Q1;
    public ValueAnimator R1;
    public final org.telegram.ui.ActionBar.h6 l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final ld s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final org.telegram.ui.Components.k9 v1;
    public final fi.d w1;
    public final be x1;
    public long y1;
    public long z1;

    public ce(Context context, final int i7, final long j3, cn cnVar, ij ijVar, ArrayList arrayList, boolean z9, final boolean z10, long j10, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        TLRPC.MessageReactor messageReactor;
        long j11;
        boolean z11;
        int[] iArr;
        String a02;
        String str;
        TLRPC.MessageReactor messageReactor2;
        Context context2;
        this.M1 = new wp[1];
        this.O1 = false;
        this.l1 = h6Var;
        this.m1 = i7;
        this.F1 = ijVar;
        this.G1 = arrayList;
        this.n1 = z10;
        this.o1 = z9;
        c cVar = new c(i7, context, h6Var);
        this.H1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        this.c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ka.a(cVar);
        cVar.setOnClickListener(new gd(0, context, h6Var));
        long e10 = p10.i(i7).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long o4 = org.telegram.messenger.m5.o(messageReactor4.peer_id);
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
        boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z10) {
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
            this.y1 = j10;
        } else {
            j11 = e10;
            this.y1 = ea.y(i7, false).B(ijVar);
        }
        long j12 = this.y1;
        this.z1 = j12 == 2666000 ? j11 : j12;
        O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h6Var));
        this.I1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.p1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        linearLayout.addView(frameLayout, c8.ha.o(-1, -2));
        this.s1 = new ld(this, context, h6Var, z10, i7);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j13 = qp.s1(i7).Z5;
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (true) {
            if (i12 >= 9) {
                z11 = z12;
                break;
            }
            int i13 = iArr2[i12];
            z11 = z12;
            if (i13 > j13) {
                arrayList2.add(Integer.valueOf((int) j13));
                break;
            }
            arrayList2.add(Integer.valueOf(i13));
            if (iArr2[i12] == j13) {
                break;
            }
            i12++;
            z12 = z11;
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            iArr3[i14] = ((Integer) arrayList2.get(i14)).intValue();
        }
        ld ldVar = this.s1;
        ldVar.e0 = iArr3;
        if (z9 || z10) {
            if (!z9) {
                ldVar.setAlpha(0.5f);
            }
            this.q1.addView(this.s1, c8.ha.d(-1, -2.0f, 55, 0.0f, z10 ? -50.0f : 0.0f, 0.0f, (!z10 || z11) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.r1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z10) {
            this.q1.addView(linearLayout2, c8.ha.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.t1 = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.u1 = frameLayout3;
        int L = org.telegram.messenger.g0.L(14.0f);
        int i15 = org.telegram.ui.ActionBar.m6.i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i15, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
        frameLayout3.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout3, d02, M, null, h6Var);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.v1 = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        k9Var.getImageReceiver().A0 = true;
        M0();
        frameLayout3.addView(k9Var, c8.ha.e(28, 28, qs.A1));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i16 = org.telegram.ui.ActionBar.m6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i16, h6Var, mode);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, c8.ha.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, c8.ha.e(52, 28, 17));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
        linearLayout2.addView(frameLayout2, c8.ha.q(-2, -1, 0.0f, qs.A1, 6, 4, 6, 0));
        c8.ka.a(frameLayout2);
        n0.g(i7).o();
        md mdVar = new md(context, 0);
        int i17 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(mdVar, i17, h6Var);
        mdVar.setTextSize(1, 20.0f);
        mdVar.setGravity(17);
        mdVar.setText(org.telegram.messenger.id.M0(2131745038, null));
        mdVar.setTypeface(org.telegram.messenger.g0.o());
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(mdVar, c8.ha.q(-1, -2, 1.0f, qs.E1, 2, 0, 2, 0));
        final int i18 = 0;
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, mode);
        c8.ka.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.hd
            public final /* synthetic */ ce b;

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
                        ce ceVar = this.b;
                        wo woVar = ceVar.D1;
                        woVar.a(!woVar.a.q, true);
                        ceVar.y1 = woVar.a.q ? ceVar.z1 : 2666000L;
                        ceVar.M0();
                        be beVar = ceVar.x1;
                        if (beVar != null) {
                            beVar.setMyPrivacy(ceVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, c8.ha.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.q1.addView(linearLayout3, c8.ha.d(-1, -2.0f, 55, 0.0f, z10 ? 0.0f : z9 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, i17, h6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = org.telegram.messenger.id.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            iArr = null;
            a02 = org.telegram.messenger.id.a0(null, null, 2131745043, M0 == null ? "" : M0.title);
        }
        textView.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g0.X2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z9 && !z10) {
            linearLayout3.addView(textView, c8.ha.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z11) {
            if (!z10) {
                linearLayout3.addView(new nd(context, h6Var), c8.ha.t(-1, 30, 55, 0, 20, 0, 0));
            }
            be beVar = new be(this, context, z10);
            this.x1 = beVar;
            beVar.setOnSenderClickListener(new c20() { // from class: bi.id
                @Override // org.telegram.messenger.c20
                public final void a(Object obj2) {
                    Long l10 = (Long) obj2;
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    long longValue = l10.longValue();
                    ce ceVar = ce.this;
                    boolean z13 = z10;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l10.longValue());
                        if (l10.longValue() == p10.i(i7).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new od(ceVar, bundle, z13));
                        ceVar.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l10.longValue());
                        T.presentFragment(new pd(ceVar, bundle2, z13));
                    }
                    ceVar.dismiss();
                }
            });
            this.p1.addView(beVar, c8.ha.k(0.0f, z10 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, qs.v1));
            View view = new View(context);
            this.C1 = view;
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
            if (!z10 && (z9 || messageReactor != null)) {
                this.p1.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.p, -1, 7, 24, 0, 24, 0));
            }
            str = null;
        } else {
            str = null;
            this.x1 = null;
            this.C1 = null;
        }
        if (z10) {
            int i19 = org.telegram.ui.ActionBar.m6.j5;
            TextView b10 = c8.qa.b(context, 20.0f, i19, true, h6Var);
            b10.setGravity(17);
            b10.setText(org.telegram.messenger.id.M0(z9 ? 2131748791 : 2131748793, str));
            this.p1.addView(b10, c8.ha.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = c8.qa.b(context, 14.0f, i19, false, h6Var);
            b11.setGravity(17);
            org.telegram.messenger.k5.r(null, null, z9 ? 2131748792 : z11 ? 2131748794 : 2131748795, new Object[]{org.telegram.messenger.m5.l(p10.s0, j3)}, b11);
            this.p1.addView(b11, c8.ha.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z10) {
            di.s0 s0Var = new di.s0();
            this.A1 = s0Var;
            messageReactor2 = messageReactor;
            s0Var.c = this.y1;
            s0Var.g = 50L;
            s0Var.e = true;
            di.n0 n0Var = new di.n0(i7, context, true);
            this.B1 = n0Var;
            n0Var.set(s0Var);
            this.p1.addView(n0Var, c8.ha.t(-2, -2, 17, 32, 0, 32, 20));
        } else {
            messageReactor2 = messageReactor;
        }
        wo woVar = new wo(21, context, h6Var);
        this.D1 = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.j7, org.telegram.ui.ActionBar.m6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(this.y1 != 2666000, false);
        be beVar2 = this.x1;
        if (beVar2 != null) {
            beVar2.setMyPrivacy(this.y1);
        }
        woVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView2, i17, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(org.telegram.messenger.id.M0(2131745046, null));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        f10.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        f10.addView(woVar, c8.ha.t(21, 21, 16, 0, 0, 9, 0));
        f10.addView(textView2, c8.ha.r(-2, -2, 16));
        final int i20 = 1;
        f10.setOnClickListener(new View.OnClickListener(this) { // from class: bi.hd
            public final /* synthetic */ ce b;

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
                        ce ceVar = this.b;
                        wo woVar2 = ceVar.D1;
                        woVar2.a(!woVar2.a.q, true);
                        ceVar.y1 = woVar2.a.q ? ceVar.z1 : 2666000L;
                        ceVar.M0();
                        be beVar3 = ceVar.x1;
                        if (beVar3 != null) {
                            beVar3.setMyPrivacy(ceVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        c8.ka.b(f10, 0.05f, 1.2f);
        int i21 = org.telegram.ui.ActionBar.m6.i6;
        int i22 = 6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i21, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i21);
        f10.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(f10, a03, null, M2, h6Var);
        if (!z10 && (z9 || messageReactor2 != null)) {
            this.p1.addView(f10, c8.ha.t(-2, -2, 1, 0, z11 ? 10 : 4, 0, 10));
        }
        fi.d dVar = new fi.d(context, h6Var, true);
        this.w1 = dVar;
        dVar.f();
        if (z9 || z10) {
            if (!z9) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.p1.addView(dVar, c8.ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131745047, org.telegram.messenger.id.E(50L, ',')), this.M1), true, true);
        if (z9) {
            context2 = context;
            dVar.setOnClickListener(new ib(this, ijVar, cnVar, i7, z10, context, h6Var, j3, M0));
        } else {
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: bi.jd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j14;
                int i23 = i7;
                n0 g10 = n0.g(i23);
                g10.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g10.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, p10.i(i23).f());
                ce ceVar = ce.this;
                k60 F = k60.F(ceVar.b, h6Var, ceVar.u1);
                int size2 = arrayList3.size();
                int i24 = 0;
                while (i24 < size2) {
                    int i25 = i24 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i24);
                    if (tLObject instanceof TLRPC.User) {
                        j14 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.t3.V(chat)) {
                                j14 = -chat.id;
                            }
                        }
                        i24 = i25;
                    }
                    if (j14 != j3) {
                        long j15 = ceVar.y1;
                        F.g(tLObject, j14 == j15 || (j15 == 0 && j14 == p10.i(i23).e()), new kd(ceVar, j14, z10, 0));
                    }
                    i24 = i25;
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.V(5);
                F.Z();
            }
        });
        w70 w70Var = new w70(context2, h6Var);
        w70Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.z6, h6Var);
        if (!z10 || z9) {
            w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745045, null), new pa(context2, i22)));
        } else {
            w70Var.setText(org.telegram.messenger.id.M0(2131748796, null));
        }
        w70Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.k5, h6Var);
        if (z9 || z10) {
            this.p1.addView(w70Var, c8.ha.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.N = this.p1;
        qd qdVar = new qd(context2, 1, 2, 0);
        this.E1 = qdVar;
        vg.f fVar = qdVar.b;
        fVar.z = org.telegram.ui.ActionBar.m6.Tk;
        fVar.A = org.telegram.ui.ActionBar.m6.Uk;
        fVar.b();
        qdVar.b.k = 1.0f;
        qdVar.setVisibility(4);
        qdVar.setPaused(true);
        this.c.addView(qdVar, c8.ha.c(150.0f, qs.g2));
        this.s1.setValue(50);
        if (arrayList != null) {
            long j14 = 0;
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i23)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > 0) {
                this.s1.setStarsTop(j14 + 1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E(ArrayList arrayList, boolean z9) {
        Property property = View.ALPHA;
        float[] fArr = {z9 ? 1.0f : 0.0f};
        c cVar = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_X, z9 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(cVar, (Property<c, Float>) View.SCALE_Y, z9 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        if (this.s1.k0) {
            return false;
        }
        return this.b0;
    }

    public final void J0(final aa aaVar) {
        ch.m0 m0Var;
        View view;
        ch.p0 p0Var;
        di.g2 g2Var;
        View view2;
        ch.p0 p0Var2;
        ch.m0 m0Var2;
        ij ijVar;
        ld ldVar = this.s1;
        qd qdVar = this.E1;
        ij ijVar2 = this.F1;
        if (ijVar2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                p0Var2.getClass();
                m0Var2 = p0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.t0) {
                p0Var2 = ((org.telegram.ui.Cells.t0) view3).E0;
                p0Var2.getClass();
                m0Var2 = p0Var2.l("stars");
            } else {
                p0Var2 = null;
                m0Var2 = null;
            }
            if (m0Var2 == null && p0Var2 != null) {
                dj t92 = this.P1.t9(ijVar2);
                if (t92 != null && !t92.e.isEmpty()) {
                    ArrayList arrayList = t92.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            ijVar = null;
                            break;
                        }
                        Object obj = arrayList.get(i7);
                        i7++;
                        ijVar = (ij) obj;
                        aj d = t92.d(ijVar);
                        if (d != null) {
                            int i10 = d.l;
                            if ((i10 & 1) != 0 && (i10 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (ijVar != null) {
                        view3 = this.P1.I8(ijVar.e1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.q1) {
                    p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                    p0Var2.getClass();
                    m0Var2 = p0Var2.l("stars");
                }
            }
            if (m0Var2 == null) {
                return;
            }
            p0Var = p0Var2;
            m0Var = m0Var2;
            view = view3;
        } else {
            if (this.J1 == null) {
                return;
            }
            m0Var = null;
            view = null;
            p0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        ldVar.getLocationInWindow(iArr);
        rectF.set(ldVar.G.getBounds());
        rectF.inset(-org.telegram.messenger.g0.L(3.5f), -org.telegram.messenger.g0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        ed edVar = new ed(this, 2);
        qdVar.a0 = edVar;
        if (qdVar.W) {
            qdVar.a0 = null;
            edVar.run();
        }
        if (m0Var != null) {
            m0Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        ch.m0 m0Var3 = m0Var;
        di.n0[] n0VarArr = new di.n0[1];
        if (this.n1 && (g2Var = this.J1) != null) {
            n0VarArr[0] = g2Var.d(this.K1);
        }
        final RectF rectF2 = new RectF();
        final r7 r7Var = new r7(this, n0VarArr, iArr, rectF2, view, p0Var, m0Var3, 3);
        View view4 = view;
        r7Var.run();
        qdVar.setPaused(false);
        qdVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        qdVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        qdVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
        qdVar.setScaleX(rectF3.width() / org.telegram.messenger.g0.L(150.0f));
        qdVar.setScaleY(rectF3.height() / org.telegram.messenger.g0.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bi.fd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                r7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, floatValue, rectF6);
                ce ceVar = ce.this;
                qd qdVar2 = ceVar.E1;
                qdVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                qdVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.g0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.g0.T1(Math.max(rectF6.width() / org.telegram.messenger.g0.L(150.0f), rectF6.height() / org.telegram.messenger.g0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                qdVar2.setScaleX(T1);
                qdVar2.setScaleY(T1);
                vg.f fVar = qdVar2.b;
                fVar.d = 360.0f * floatValue;
                fVar.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    ceVar.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = aaVar;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.R1.addListener(new rd(this, m0Var3, view4, n0VarArr, zArr, rectF2, aaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new sd(0));
        this.R1.start();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.K();
        }
    }

    public final boolean K0() {
        if (!this.n1) {
            n0 g10 = n0.g(this.m1);
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
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.t3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L0(boolean z9) {
        FrameLayout frameLayout = this.t1;
        if ((frameLayout.getVisibility() == 0) != K0()) {
            frameLayout.setVisibility(K0() ? 0 : 8);
            if (z9) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.r1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.p = 0.42f;
        long j3 = this.y1;
        org.telegram.ui.Components.k9 k9Var = this.v1;
        if (j3 == 2666000) {
            v8Var.g(21);
            int i7 = org.telegram.ui.ActionBar.m6.c8;
            org.telegram.ui.ActionBar.h6 h6Var = this.l1;
            v8Var.i(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            k9Var.e(null, v8Var);
            return;
        }
        int i10 = this.m1;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(this.y1));
            v8Var.r(a22);
            k9Var.e(a22, v8Var);
        } else {
            TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-this.y1));
            v8Var.q(M0);
            k9Var.e(M0, v8Var);
        }
    }

    public final void N0(long j3) {
        be beVar;
        long j10;
        long j11;
        long j12 = 0;
        if ((!this.n1 || this.o1 || j3 <= 0) && (beVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e10 = p10.i(this.m1).e();
            int i7 = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j11 = 0;
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i10);
                    long o4 = org.telegram.messenger.m5.o(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z9 = messageReactor.anonymous;
                    if (z9) {
                        o4 = messageReactor.my ? e10 : (-i10) - i7;
                    }
                    if (messageReactor.my || o4 == e10) {
                        j11 = messageReactor.count;
                    } else {
                        long j14 = messageReactor.count;
                        vd vdVar = new vd();
                        vdVar.a = z9;
                        vdVar.b = false;
                        vdVar.c = o4;
                        vdVar.d = j14;
                        arrayList.add(vdVar);
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
                boolean z10 = this.y1 == 2666000;
                vd vdVar2 = new vd();
                vdVar2.a = z10;
                vdVar2.b = true;
                vdVar2.c = e10;
                vdVar2.d = j15;
                arrayList.add(vdVar2);
            }
            Collections.sort(arrayList, new a3.c(14));
            beVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean X(float f10, float f11) {
        c cVar = this.H1;
        if (f10 < cVar.getX() || f10 > cVar.getX() + cVar.getWidth() || f11 < cVar.getY() || f11 > cVar.getY() + cVar.getHeight()) {
            return super.X(f10, f11);
        }
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.M3) {
            L0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        Long z12;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            ij ijVar = this.F1;
            if (ijVar != null && ((z12 = ijVar.z1()) == null || z12.longValue() != this.y1)) {
                ijVar.J5(this.y1);
                x9 b10 = x9.b(ijVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i7 = this.m1;
                qp s12 = qp.s1(i7);
                long j3 = b10.a;
                int i10 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = s12.j1(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i10;
                long j10 = this.y1;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = qp.s1(i7).j1(this.y1);
                }
                qs.f(i7).k(qs.I1, Long.valueOf(b10.a), Integer.valueOf(i10), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_togglePaidReactionPrivacy, new j0(this, 4));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.m1).c(this, qs.M3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.m1).n(this, qs.M3);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.I1 || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.l1)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.I1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
