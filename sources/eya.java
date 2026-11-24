// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eya extends my0 implements jm7 {
    public final i96 A1;
    public final d96 B1;
    public final View C1;
    public final jh2 D1;
    public final w94 E1;
    public final k47 F1;
    public final ArrayList G1;
    public final gf0 H1;
    public int I1;
    public n38 J1;
    public int K1;
    public v86 L1;
    public final pn2[] M1;
    public boolean N1;
    public boolean O1;
    public yv1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final ylb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final txa s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final bf0 v1;
    public final b61 w1;
    public final dya x1;
    public long y1;
    public long z1;

    /* JADX WARN: Removed duplicated region for block: B:102:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0635 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0667 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04a7  */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.String, ylb] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eya(Context context, final int i, final long j, yv1 yv1Var, k47 k47Var, ArrayList arrayList, boolean z, final boolean z2, long j2, final ylb ylbVar) {
        super(1, ylbVar, context, false);
        TLRPC.MessageReactor messageReactor;
        long x;
        LinearLayout linearLayout;
        TextView textView;
        int[] iArr;
        String a0;
        String str;
        dya dyaVar;
        LinearLayout i2;
        ?? r14;
        long j3;
        Context context2;
        l66 l66Var;
        int i3;
        this.M1 = new pn2[1];
        this.O1 = false;
        this.l1 = ylbVar;
        this.m1 = i;
        this.F1 = k47Var;
        this.G1 = arrayList;
        this.n1 = z2;
        this.o1 = z;
        gf0 gf0Var = new gf0(i, ylbVar, context);
        this.H1 = gf0Var;
        gf0Var.setScaleX(0.6f);
        gf0Var.setScaleY(0.6f);
        gf0Var.setAlpha(0.0f);
        this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new kz(context, ylbVar, (byte) 3));
        long e = z8c.h(i).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long n = pg3.n(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    n = e;
                }
                if (messageReactor3.my || n == e) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z2) {
            if (arrayList != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i5)).my) {
                        break;
                    }
                    i5++;
                }
            }
            x = j2;
            this.y1 = x;
        } else {
            x = jva.v(i, false).x(k47Var);
            this.y1 = x;
        }
        this.z1 = x == 2666000 ? e : x;
        K(cmb.v0(cmb.g5, ylbVar));
        this.I1 = this.H0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.p1 = linearLayout2;
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        linearLayout2.addView(frameLayout, qoe.o(-1, -2));
        this.s1 = new txa(this, context, ylbVar, z2, i);
        int i6 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long f = oc7.r1(i).l4.y2.f();
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = z3;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int i8 = iArr2[i7];
            int[] iArr3 = iArr2;
            if (i8 > f) {
                arrayList2.add(Integer.valueOf((int) f));
                break;
            }
            arrayList2.add(Integer.valueOf(i8));
            if (iArr3[i7] == f) {
                break;
            }
            i7++;
            iArr2 = iArr3;
            i6 = 9;
        }
        int[] iArr4 = new int[arrayList2.size()];
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            iArr4[i9] = ((Integer) arrayList2.get(i9)).intValue();
        }
        txa txaVar = this.s1;
        txaVar.f0 = iArr4;
        if (!z) {
            if (z2) {
                txaVar.setAlpha(0.5f);
            }
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.r1 = linearLayout3;
            linearLayout3.setOrientation(0);
            if (!z2) {
                this.q1.addView(linearLayout3, qoe.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.t1 = frameLayout2;
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.u1 = frameLayout3;
            int L = gm.L(14.0f);
            int i10 = cmb.h5;
            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i10, ylbVar));
            wmb M = anb.M(i10);
            frameLayout3.setBackground(b0);
            anb.j(frameLayout3, b0, M, null, ylbVar);
            bf0 bf0Var = new bf0(context);
            this.v1 = bf0Var;
            bf0Var.setRoundRadius(gm.L(14.0f));
            bf0Var.getImageReceiver().B0 = true;
            H0();
            frameLayout3.addView(bf0Var, qoe.e(28, 28, nm7.z1));
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            int i11 = cmb.q5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            anb.s(imageView, i11, ylbVar, mode);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, qoe.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, qoe.e(52, 28, 17));
            frameLayout2.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
            linearLayout3.addView(frameLayout2, qoe.q(-2, -1, 0.0f, nm7.z1, 6, 4, 6, 0));
            rve.a(frameLayout2);
            ku0.g(i).o();
            qz8 qz8Var = new qz8(context, (byte) 3);
            int i12 = cmb.F6;
            anb.X(qz8Var, i12, ylbVar);
            qz8Var.setTextSize(1, 20.0f);
            qz8Var.setGravity(17);
            qz8Var.setText(jb6.M0(2131744727, null));
            qz8Var.setTypeface(gm.o());
            qz8Var.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout3.addView(qz8Var, qoe.q(-1, -2, 1.0f, nm7.D1, 2, 0, 2, 0));
            final byte b = 0;
            G0(false);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.ic_close_white);
            anb.s(imageView2, cmb.V5, ylbVar, mode);
            rve.a(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: qxa
                public final /* synthetic */ eya b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    eya eyaVar = this.b;
                    switch (b2) {
                        case 0:
                            eyaVar.dismiss();
                            break;
                        default:
                            jh2 jh2Var = eyaVar.D1;
                            jh2Var.a(!jh2Var.a.q, true);
                            eyaVar.y1 = jh2Var.a.q ? eyaVar.z1 : 2666000L;
                            eyaVar.H0();
                            dya dyaVar2 = eyaVar.x1;
                            if (dyaVar2 != null) {
                                dyaVar2.setMyPrivacy(eyaVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout3.addView(imageView2, qoe.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.q1.addView(linearLayout, qoe.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            textView = new TextView(context);
            anb.X(textView, i12, ylbVar);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setSingleLine(false);
            textView.setMaxLines(3);
            if (messageReactor == null) {
                a0 = jb6.H(',', "StarsReactionTextSent", messageReactor.count);
                iArr = null;
            } else {
                iArr = null;
                a0 = jb6.a0(null, null, 2131744732, L0 == null ? "" : L0.title);
            }
            textView.setText(gw3.m(gm.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
            if (z && !z2) {
                linearLayout.addView(textView, qoe.t(-1, -2, 55, 40, 0, 40, 0));
            }
            if (z4) {
                str = null;
                this.x1 = null;
                this.C1 = null;
                dyaVar = null;
            } else {
                if (!z2) {
                    linearLayout.addView(new pja(context, ylbVar), qoe.t(-1, 30, 55, 0, 20, 0, 0));
                }
                dyaVar = new dya(this, context, z2);
                this.x1 = dyaVar;
                dyaVar.setOnSenderClickListener(new qac() { // from class: rxa
                    @Override // qac
                    public final void a(Object obj2) {
                        Long l = (Long) obj2;
                        d S = LaunchActivity.S();
                        if (S == null) {
                            return;
                        }
                        long longValue = l.longValue();
                        eya eyaVar = eya.this;
                        boolean z5 = z2;
                        if (longValue >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", l.longValue());
                            if (l.longValue() == z8c.h(i).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                            S.presentFragment(new uxa(eyaVar, bundle, z5));
                            eyaVar.dismiss();
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", -l.longValue());
                            S.presentFragment(new vxa(eyaVar, bundle2, z5));
                        }
                        eyaVar.dismiss();
                    }
                });
                this.p1.addView(dyaVar, qoe.k(0.0f, z2 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, nm7.u1));
                View view = new View(context);
                this.C1 = view;
                anb.h(cmb.c7, ylbVar, view);
                if (!z2 && (z || messageReactor != null)) {
                    this.p1.addView(view, qoe.n(1.0f / gm.p, -1, 7, 24, 0, 24, 0));
                }
                str = null;
            }
            if (z2) {
                int i13 = cmb.i5;
                TextView b2 = jxe.b(context, 20.0f, i13, true, ylbVar);
                b2.setGravity(17);
                b2.setText(jb6.M0(z ? 2131748548 : 2131748550, str));
                this.p1.addView(b2, qoe.t(-1, -2, 7, 32, 6, 32, 9));
                TextView b3 = jxe.b(context, 14.0f, i13, false, ylbVar);
                b3.setGravity(17);
                hg9.q(null, null, z ? 2131748549 : z4 ? 2131748551 : 2131748552, new Object[]{pg3.k(z8c.t0, j)}, b3);
                this.p1.addView(b3, qoe.t(-1, -2, 7, 32, 0, 32, 20));
            }
            if (z2) {
                i96 i96Var = new i96();
                this.A1 = i96Var;
                i96Var.c = this.y1;
                i96Var.g = 50L;
                i96Var.e = true;
                d96 d96Var = new d96(i, context, true);
                this.B1 = d96Var;
                d96Var.set(i96Var);
                this.p1.addView(d96Var, qoe.t(-2, -2, 17, 32, 0, 32, 20));
            }
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.D1 = jh2Var;
            jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
            jh2Var.setDrawUnchecked(true);
            jh2Var.a(this.y1 == 2666000, false);
            if (dyaVar != null) {
                dyaVar.setMyPrivacy(this.y1);
            }
            jh2Var.setDrawBackgroundAsArc(10);
            TextView textView2 = new TextView(context);
            anb.X(textView2, i12, ylbVar);
            textView2.setTextSize(1, 14.0f);
            textView2.setText(jb6.M0(2131744735, null));
            i2 = hg9.i(context, 0);
            i2.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
            i2.addView(jh2Var, qoe.t(21, 21, 16, 0, 0, 9, 0));
            i2.addView(textView2, qoe.r(-2, -2, 16));
            final byte b4 = 1;
            i2.setOnClickListener(new View.OnClickListener(this) { // from class: qxa
                public final /* synthetic */ eya b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b22 = b4;
                    eya eyaVar = this.b;
                    switch (b22) {
                        case 0:
                            eyaVar.dismiss();
                            break;
                        default:
                            jh2 jh2Var2 = eyaVar.D1;
                            jh2Var2.a(!jh2Var2.a.q, true);
                            eyaVar.y1 = jh2Var2.a.q ? eyaVar.z1 : 2666000L;
                            eyaVar.H0();
                            dya dyaVar2 = eyaVar.x1;
                            if (dyaVar2 != null) {
                                dyaVar2.setMyPrivacy(eyaVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            rve.b(i2, 0.05f, 1.2f);
            int i14 = cmb.h6;
            fg0 Y = cmb.Y(cmb.v0(i14, ylbVar), 6, 6);
            wmb M2 = anb.M(i14);
            i2.setBackground(Y);
            anb.j(i2, Y, null, M2, ylbVar);
            if (!z2 && (z || messageReactor != null)) {
                this.p1.addView(i2, qoe.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
            }
            b61 b61Var = new b61(ylbVar, context, true);
            this.w1 = b61Var;
            b61Var.f();
            if (!z) {
                if (z2) {
                    b61Var.setAlpha(0.5f);
                    b61Var.setEnabled(false);
                }
                I0(0L);
                b61Var.i(nxa.Z0(false, jb6.a0(null, null, 2131744736, jb6.E(50L, ',')), this.M1), true, true);
                if (z) {
                    r14 = 0;
                    j3 = 0;
                    context2 = context;
                    b61Var.setOnClickListener(new cwa(this, k47Var, yv1Var, i, z2, context, ylbVar, j, L0));
                } else {
                    r14 = 0;
                    j3 = 0;
                    context2 = context;
                }
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: sxa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        long j4;
                        int i15 = i;
                        ku0 g = ku0.g(i15);
                        g.o();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = g.l;
                        if (arrayList4 != null) {
                            arrayList3.addAll(arrayList4);
                        }
                        arrayList3.add(0, z8c.h(i15).f());
                        eya eyaVar = eya.this;
                        bu5 G = bu5.G(eyaVar.b, ylbVar, eyaVar.u1);
                        int size2 = arrayList3.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            int i17 = i16 + 1;
                            TLObject tLObject = (TLObject) arrayList3.get(i16);
                            if (tLObject instanceof TLRPC.User) {
                                j4 = ((TLRPC.User) tLObject).id;
                            } else {
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                    if (sd2.V(chat)) {
                                        j4 = -chat.id;
                                    }
                                }
                                i16 = i17;
                            }
                            if (j4 != j) {
                                long j5 = eyaVar.y1;
                                G.f(tLObject, j4 == j5 || (j5 == 0 && j4 == z8c.h(i15).e()), new vp2((Object) eyaVar, j4, z2, (byte) 2));
                            }
                            i16 = i17;
                        }
                        G.t = false;
                        G.b0 = true;
                        G.s = (short) 0;
                        G.W(5);
                        G.a0();
                    }
                });
                l66Var = new l66(context2, ylbVar);
                l66Var.setTextSize(1, 13.0f);
                anb.X(l66Var, cmb.y6, ylbVar);
                if (z2 || z) {
                    i3 = 0;
                    l66Var.setText(gm.N2(jb6.M0(2131744734, r14), -1, 0, new dh1(context2, (byte) 21), r14));
                } else {
                    l66Var.setText(jb6.M0(2131748553, r14));
                    i3 = 0;
                }
                l66Var.setGravity(17);
                anb.G(l66Var, cmb.j5, ylbVar);
                if (!z || z2) {
                    this.p1.addView(l66Var, qoe.t(-1, -2, 17, 14, 8, 14, 12));
                }
                this.O = this.p1;
                w94 w94Var = new w94(context2, 1, 2, (byte) 5);
                this.E1 = w94Var;
                vs4 vs4Var = w94Var.b;
                vs4Var.z = cmb.Vk;
                vs4Var.A = cmb.Wk;
                vs4Var.b();
                w94Var.b.k = 1.0f;
                w94Var.setVisibility(4);
                w94Var.setPaused(true);
                this.c.addView(w94Var, qoe.c(150.0f, nm7.f2));
                this.s1.setValue(50);
                if (arrayList != null) {
                    long j4 = j3;
                    for (int i15 = i3; i15 < arrayList.size(); i15++) {
                        long j5 = ((TLRPC.MessageReactor) arrayList.get(i15)).count;
                        if (j5 > j4) {
                            j4 = j5;
                        }
                    }
                    j4 = messageReactor != null ? j4 - messageReactor.count : j4;
                    if (j4 > j3) {
                        this.s1.setStarsTop(j4 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            this.p1.addView(b61Var, qoe.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
            I0(0L);
            b61Var.i(nxa.Z0(false, jb6.a0(null, null, 2131744736, jb6.E(50L, ',')), this.M1), true, true);
            if (z) {
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: sxa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long j42;
                    int i152 = i;
                    ku0 g = ku0.g(i152);
                    g.o();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = g.l;
                    if (arrayList4 != null) {
                        arrayList3.addAll(arrayList4);
                    }
                    arrayList3.add(0, z8c.h(i152).f());
                    eya eyaVar = eya.this;
                    bu5 G = bu5.G(eyaVar.b, ylbVar, eyaVar.u1);
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        int i17 = i16 + 1;
                        TLObject tLObject = (TLObject) arrayList3.get(i16);
                        if (tLObject instanceof TLRPC.User) {
                            j42 = ((TLRPC.User) tLObject).id;
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (sd2.V(chat)) {
                                    j42 = -chat.id;
                                }
                            }
                            i16 = i17;
                        }
                        if (j42 != j) {
                            long j52 = eyaVar.y1;
                            G.f(tLObject, j42 == j52 || (j52 == 0 && j42 == z8c.h(i152).e()), new vp2((Object) eyaVar, j42, z2, (byte) 2));
                        }
                        i16 = i17;
                    }
                    G.t = false;
                    G.b0 = true;
                    G.s = (short) 0;
                    G.W(5);
                    G.a0();
                }
            });
            l66Var = new l66(context2, ylbVar);
            l66Var.setTextSize(1, 13.0f);
            anb.X(l66Var, cmb.y6, ylbVar);
            if (z2) {
            }
            i3 = 0;
            l66Var.setText(gm.N2(jb6.M0(2131744734, r14), -1, 0, new dh1(context2, (byte) 21), r14));
            l66Var.setGravity(17);
            anb.G(l66Var, cmb.j5, ylbVar);
            if (!z) {
            }
            this.p1.addView(l66Var, qoe.t(-1, -2, 17, 14, 8, 14, 12));
            this.O = this.p1;
            w94 w94Var2 = new w94(context2, 1, 2, (byte) 5);
            this.E1 = w94Var2;
            vs4 vs4Var2 = w94Var2.b;
            vs4Var2.z = cmb.Vk;
            vs4Var2.A = cmb.Wk;
            vs4Var2.b();
            w94Var2.b.k = 1.0f;
            w94Var2.setVisibility(4);
            w94Var2.setPaused(true);
            this.c.addView(w94Var2, qoe.c(150.0f, nm7.f2));
            this.s1.setValue(50);
            if (arrayList != null) {
            }
        }
        this.q1.addView(this.s1, qoe.d(-1, -2.0f, 55, 0.0f, z2 ? -50.0f : 0.0f, 0.0f, (!z2 || z4) ? 0.0f : -40.0f));
        LinearLayout linearLayout32 = new LinearLayout(context);
        this.r1 = linearLayout32;
        linearLayout32.setOrientation(0);
        if (!z2) {
        }
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.t1 = frameLayout22;
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.u1 = frameLayout32;
        int L2 = gm.L(14.0f);
        int i102 = cmb.h5;
        ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i102, ylbVar));
        wmb M3 = anb.M(i102);
        frameLayout32.setBackground(b02);
        anb.j(frameLayout32, b02, M3, null, ylbVar);
        bf0 bf0Var2 = new bf0(context);
        this.v1 = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(14.0f));
        bf0Var2.getImageReceiver().B0 = true;
        H0();
        frameLayout32.addView(bf0Var2, qoe.e(28, 28, nm7.z1));
        ImageView imageView3 = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType2);
        int i112 = cmb.q5;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        anb.s(imageView3, i112, ylbVar, mode2);
        imageView3.setImageResource(R.drawable.arrows_select);
        frameLayout32.addView(imageView3, qoe.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout22.addView(frameLayout32, qoe.e(52, 28, 17));
        frameLayout22.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
        linearLayout32.addView(frameLayout22, qoe.q(-2, -1, 0.0f, nm7.z1, 6, 4, 6, 0));
        rve.a(frameLayout22);
        ku0.g(i).o();
        qz8 qz8Var2 = new qz8(context, (byte) 3);
        int i122 = cmb.F6;
        anb.X(qz8Var2, i122, ylbVar);
        qz8Var2.setTextSize(1, 20.0f);
        qz8Var2.setGravity(17);
        qz8Var2.setText(jb6.M0(2131744727, null));
        qz8Var2.setTypeface(gm.o());
        qz8Var2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout32.addView(qz8Var2, qoe.q(-1, -2, 1.0f, nm7.D1, 2, 0, 2, 0));
        final byte b5 = 0;
        G0(false);
        ImageView imageView22 = new ImageView(context);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.ic_close_white);
        anb.s(imageView22, cmb.V5, ylbVar, mode2);
        rve.a(imageView22);
        imageView22.setOnClickListener(new View.OnClickListener(this) { // from class: qxa
            public final /* synthetic */ eya b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                eya eyaVar = this.b;
                switch (b22) {
                    case 0:
                        eyaVar.dismiss();
                        break;
                    default:
                        jh2 jh2Var2 = eyaVar.D1;
                        jh2Var2.a(!jh2Var2.a.q, true);
                        eyaVar.y1 = jh2Var2.a.q ? eyaVar.z1 : 2666000L;
                        eyaVar.H0();
                        dya dyaVar2 = eyaVar.x1;
                        if (dyaVar2 != null) {
                            dyaVar2.setMyPrivacy(eyaVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout32.addView(imageView22, qoe.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z2) {
        }
        this.q1.addView(linearLayout, qoe.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
        TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(-j));
        textView = new TextView(context);
        anb.X(textView, i122, ylbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor == null) {
        }
        textView.setText(gw3.m(gm.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z) {
            linearLayout.addView(textView, qoe.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z4) {
        }
        if (z2) {
        }
        if (z2) {
        }
        jh2 jh2Var2 = new jh2(21, ylbVar, context);
        this.D1 = jh2Var2;
        jh2Var2.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var2.setDrawUnchecked(true);
        jh2Var2.a(this.y1 == 2666000, false);
        if (dyaVar != null) {
        }
        jh2Var2.setDrawBackgroundAsArc(10);
        TextView textView22 = new TextView(context);
        anb.X(textView22, i122, ylbVar);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(jb6.M0(2131744735, null));
        i2 = hg9.i(context, 0);
        i2.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        i2.addView(jh2Var2, qoe.t(21, 21, 16, 0, 0, 9, 0));
        i2.addView(textView22, qoe.r(-2, -2, 16));
        final byte b42 = 1;
        i2.setOnClickListener(new View.OnClickListener(this) { // from class: qxa
            public final /* synthetic */ eya b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b42;
                eya eyaVar = this.b;
                switch (b22) {
                    case 0:
                        eyaVar.dismiss();
                        break;
                    default:
                        jh2 jh2Var22 = eyaVar.D1;
                        jh2Var22.a(!jh2Var22.a.q, true);
                        eyaVar.y1 = jh2Var22.a.q ? eyaVar.z1 : 2666000L;
                        eyaVar.H0();
                        dya dyaVar2 = eyaVar.x1;
                        if (dyaVar2 != null) {
                            dyaVar2.setMyPrivacy(eyaVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        rve.b(i2, 0.05f, 1.2f);
        int i142 = cmb.h6;
        fg0 Y2 = cmb.Y(cmb.v0(i142, ylbVar), 6, 6);
        wmb M22 = anb.M(i142);
        i2.setBackground(Y2);
        anb.j(i2, Y2, null, M22, ylbVar);
        if (!z2) {
            this.p1.addView(i2, qoe.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
        }
        b61 b61Var2 = new b61(ylbVar, context, true);
        this.w1 = b61Var2;
        b61Var2.f();
        if (!z) {
        }
        this.p1.addView(b61Var2, qoe.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        I0(0L);
        b61Var2.i(nxa.Z0(false, jb6.a0(null, null, 2131744736, jb6.E(50L, ',')), this.M1), true, true);
        if (z) {
        }
        frameLayout22.setOnClickListener(new View.OnClickListener() { // from class: sxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j42;
                int i152 = i;
                ku0 g = ku0.g(i152);
                g.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, z8c.h(i152).f());
                eya eyaVar = eya.this;
                bu5 G = bu5.G(eyaVar.b, ylbVar, eyaVar.u1);
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    int i17 = i16 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i16);
                    if (tLObject instanceof TLRPC.User) {
                        j42 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (sd2.V(chat)) {
                                j42 = -chat.id;
                            }
                        }
                        i16 = i17;
                    }
                    if (j42 != j) {
                        long j52 = eyaVar.y1;
                        G.f(tLObject, j42 == j52 || (j52 == 0 && j42 == z8c.h(i152).e()), new vp2((Object) eyaVar, j42, z2, (byte) 2));
                    }
                    i16 = i17;
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.W(5);
                G.a0();
            }
        });
        l66Var = new l66(context2, ylbVar);
        l66Var.setTextSize(1, 13.0f);
        anb.X(l66Var, cmb.y6, ylbVar);
        if (z2) {
        }
        i3 = 0;
        l66Var.setText(gm.N2(jb6.M0(2131744734, r14), -1, 0, new dh1(context2, (byte) 21), r14));
        l66Var.setGravity(17);
        anb.G(l66Var, cmb.j5, ylbVar);
        if (!z) {
        }
        this.p1.addView(l66Var, qoe.t(-1, -2, 17, 14, 8, 14, 12));
        this.O = this.p1;
        w94 w94Var22 = new w94(context2, 1, 2, (byte) 5);
        this.E1 = w94Var22;
        vs4 vs4Var22 = w94Var22.b;
        vs4Var22.z = cmb.Vk;
        vs4Var22.A = cmb.Wk;
        vs4Var22.b();
        w94Var22.b.k = 1.0f;
        w94Var22.setVisibility(4);
        w94Var22.setPaused(true);
        this.c.addView(w94Var22, qoe.c(150.0f, nm7.f2));
        this.s1.setValue(50);
        if (arrayList != null) {
        }
    }

    @Override // my0
    public final void B(ArrayList arrayList, boolean z) {
        Property property = View.ALPHA;
        float f = z ? 1.0f : 0.0f;
        gf0 gf0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, (Property<gf0, Float>) property, f));
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, (Property<gf0, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(gf0Var, (Property<gf0, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
    }

    @Override // my0
    public final boolean C() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void E0(final fva fvaVar) {
        i39 i39Var;
        View view;
        l39 l39Var;
        n38 n38Var;
        View view2;
        l39 l39Var2;
        i39 i39Var2;
        k47 k47Var;
        txa txaVar = this.s1;
        w94 w94Var = this.E1;
        k47 k47Var2 = this.F1;
        if (k47Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof rc2) {
                l39Var2 = ((rc2) view3).O;
                l39Var2.getClass();
                i39Var2 = l39Var2.l("stars");
            } else if (view3 instanceof cm1) {
                l39Var2 = ((cm1) view3).F0;
                l39Var2.getClass();
                i39Var2 = l39Var2.l("stars");
            } else {
                l39Var2 = null;
                i39Var2 = null;
            }
            if (i39Var2 == null && l39Var2 != null) {
                f47 v7 = this.P1.v7(k47Var2);
                if (v7 != null && !v7.e.isEmpty()) {
                    ArrayList arrayList = v7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            k47Var = null;
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        k47Var = (k47) obj;
                        c47 d = v7.d(k47Var);
                        if (d != null) {
                            int i2 = d.l;
                            if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (k47Var != null) {
                        view3 = this.P1.L6(k47Var.e1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof rc2) {
                    l39Var2 = ((rc2) view3).O;
                    l39Var2.getClass();
                    i39Var2 = l39Var2.l("stars");
                }
            }
            if (i39Var2 == null) {
                return;
            }
            l39Var = l39Var2;
            i39Var = i39Var2;
            view = view3;
        } else {
            if (this.J1 == null) {
                return;
            }
            i39Var = null;
            view = null;
            l39Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        txaVar.getLocationInWindow(iArr);
        rectF.set(txaVar.H.getBounds());
        rectF.inset(-gm.L(3.5f), -gm.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        oxa oxaVar = new oxa(this, (byte) 2);
        w94Var.b0 = oxaVar;
        if (w94Var.a0) {
            w94Var.b0 = null;
            oxaVar.run();
        }
        if (i39Var != null) {
            i39Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        i39 i39Var3 = i39Var;
        d96[] d96VarArr = new d96[1];
        if (this.n1 && (n38Var = this.J1) != null) {
            d96VarArr[0] = n38Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final ja7 ja7Var = new ja7((Object) this, (Object) d96VarArr, (Object) iArr, (Object) rectF2, (Object) view, (Object) l39Var, (Object) i39Var3, (byte) 21);
        View view4 = view;
        ja7Var.run();
        w94Var.setPaused(false);
        w94Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        w94Var.setTranslationX(rectF3.centerX() - (gm.L(150.0f) / 2.0f));
        w94Var.setTranslationY(rectF3.centerY() - (gm.L(150.0f) / 2.0f));
        w94Var.setScaleX(rectF3.width() / gm.L(150.0f));
        w94Var.setScaleY(rectF3.height() / gm.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pxa
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ja7Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                gm.X1(rectF4, rectF5, floatValue, rectF6);
                eya eyaVar = eya.this;
                w94 w94Var2 = eyaVar.E1;
                w94Var2.setTranslationX(rectF6.centerX() - (gm.L(150.0f) / 2.0f));
                w94Var2.setTranslationY(rectF6.centerY() - (gm.L(150.0f) / 2.0f));
                float R1 = gm.R1(Math.max(rectF6.width() / gm.L(150.0f), rectF6.height() / gm.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                w94Var2.setScaleX(R1);
                w94Var2.setScaleY(R1);
                vs4 vs4Var = w94Var2.b;
                vs4Var.d = 360.0f * floatValue;
                vs4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    eyaVar.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                fva fvaVar2 = fvaVar;
                if (fvaVar2 != null) {
                    fvaVar2.run();
                }
            }
        });
        this.R1.addListener(new wxa(this, i39Var3, view4, d96VarArr, zArr, rectF2, fvaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new bg3((byte) 4));
        this.R1.start();
    }

    public final boolean F0() {
        if (!this.n1) {
            ku0 g = ku0.g(this.m1);
            g.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if ((obj instanceof TLRPC.Chat) && sd2.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void G0(boolean z) {
        FrameLayout frameLayout = this.t1;
        if ((frameLayout.getVisibility() == 0) != F0()) {
            frameLayout.setVisibility(F0() ? 0 : 8);
            if (z) {
                if (F0()) {
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

    @Override // my0
    public final void H() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.H();
        }
    }

    public final void H0() {
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.p = 0.42f;
        long j = this.y1;
        bf0 bf0Var = this.v1;
        if (j == 2666000) {
            pc0Var.f(21);
            int i = cmb.b8;
            ylb ylbVar = this.l1;
            pc0Var.h(cmb.v0(i, ylbVar), cmb.v0(i, ylbVar));
            bf0Var.f(null, pc0Var);
            return;
        }
        int i2 = this.m1;
        if (j >= 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(this.y1));
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
        } else {
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-this.y1));
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
        }
    }

    public final void I0(long j) {
        dya dyaVar;
        long j2;
        long j3;
        byte b;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (dyaVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = z8c.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = pg3.n(messageReactor.peer_id);
                    long j5 = j4;
                    boolean z = messageReactor.anonymous;
                    if (z) {
                        n = messageReactor.my ? e : (-i2) - i;
                    }
                    if (messageReactor.my || n == e) {
                        j3 = messageReactor.count;
                    } else {
                        long j6 = messageReactor.count;
                        zxa zxaVar = new zxa();
                        zxaVar.a = z;
                        zxaVar.b = false;
                        zxaVar.c = n;
                        zxaVar.d = j6;
                        arrayList.add(zxaVar);
                    }
                    i2++;
                    j4 = j5;
                    i = 1;
                }
                j2 = j4;
            } else {
                j2 = 0;
                j3 = 0;
            }
            long j7 = j3 + j;
            if (j7 > j2) {
                boolean z2 = this.y1 == 2666000;
                zxa zxaVar2 = new zxa();
                zxaVar2.a = z2;
                b = 1;
                zxaVar2.b = true;
                zxaVar2.c = e;
                zxaVar2.d = j7;
                arrayList.add(zxaVar2);
            } else {
                b = 1;
            }
            Collections.sort(arrayList, new zua(b));
            dyaVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // my0
    public final boolean T(float f, float f2) {
        gf0 gf0Var = this.H1;
        if (f < gf0Var.getX() || f > gf0Var.getX() + gf0Var.getWidth() || f2 < gf0Var.getY() || f2 > gf0Var.getY() + gf0Var.getHeight()) {
            return super.T(f, f2);
        }
        return false;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.P3) {
            G0(true);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            k47 k47Var = this.F1;
            if (k47Var != null && ((z1 = k47Var.z1()) == null || z1.longValue() != this.y1)) {
                k47Var.I5(this.y1);
                cva b = cva.b(k47Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                oc7 r1 = oc7.r1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = r1.i1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = oc7.r1(i).i1(this.y1);
                }
                nm7.f(i).k(nm7.I1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new go9(this, (byte) 5));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.m1).b(this, nm7.P3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.m1).n(this, nm7.P3);
    }

    @Override // my0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.I1 || (v0 = cmb.v0(cmb.g5, this.l1)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.I1 = v0;
            x0(v0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
