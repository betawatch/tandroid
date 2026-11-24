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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bwa extends fx0 implements gk7 {
    public final i76 A1;
    public final d76 B1;
    public final View C1;
    public final wf2 D1;
    public final n84 E1;
    public final k27 F1;
    public final ArrayList G1;
    public final ge0 H1;
    public int I1;
    public l18 J1;
    public int K1;
    public v66 L1;
    public final cm2[] M1;
    public boolean N1;
    public boolean O1;
    public mu1 P1;
    public View Q1;
    public ValueAnimator R1;
    public final wjb l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final LinearLayout p1;
    public final FrameLayout q1;
    public final LinearLayout r1;
    public final qva s1;
    public final FrameLayout t1;
    public final FrameLayout u1;
    public final be0 v1;
    public final u41 w1;
    public final awa x1;
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
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.String, wjb] */
    /* JADX WARN: Type inference failed for: r14v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bwa(Context context, final int i, final long j, mu1 mu1Var, k27 k27Var, ArrayList arrayList, boolean z, final boolean z2, long j2, final wjb wjbVar) {
        super(1, wjbVar, context, false);
        TLRPC.MessageReactor messageReactor;
        long x;
        LinearLayout linearLayout;
        TextView textView;
        int[] iArr;
        String a0;
        String str;
        awa awaVar;
        LinearLayout j3;
        ?? r14;
        long j4;
        Context context2;
        l46 l46Var;
        int i2;
        this.M1 = new cm2[1];
        this.O1 = false;
        this.l1 = wjbVar;
        this.m1 = i;
        this.F1 = k27Var;
        this.G1 = arrayList;
        this.n1 = z2;
        this.o1 = z;
        ge0 ge0Var = new ge0(i, wjbVar, context);
        this.H1 = ge0Var;
        ge0Var.setScaleX(0.6f);
        ge0Var.setScaleY(0.6f);
        ge0Var.setAlpha(0.0f);
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new ky(context, wjbVar, (byte) 3));
        long e = y6c.h(i).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long n = cf3.n(messageReactor3.peer_id);
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
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i4)).my) {
                        break;
                    }
                    i4++;
                }
            }
            x = j2;
            this.y1 = x;
        } else {
            x = gta.v(i, false).x(k27Var);
            this.y1 = x;
        }
        this.z1 = x == 2666000 ? e : x;
        L(bkb.v0(bkb.g5, wjbVar));
        this.I1 = this.H0;
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.p1 = linearLayout2;
        linearLayout2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.q1 = frameLayout;
        linearLayout2.addView(frameLayout, nme.o(-1, -2));
        this.s1 = new qva(this, context, wjbVar, z2, i);
        int i5 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long f = na7.q1(i).k4.y2.f();
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = z3;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            int i7 = iArr2[i6];
            int[] iArr3 = iArr2;
            if (i7 > f) {
                arrayList2.add(Integer.valueOf((int) f));
                break;
            }
            arrayList2.add(Integer.valueOf(i7));
            if (iArr3[i6] == f) {
                break;
            }
            i6++;
            iArr2 = iArr3;
            i5 = 9;
        }
        int[] iArr4 = new int[arrayList2.size()];
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            iArr4[i8] = ((Integer) arrayList2.get(i8)).intValue();
        }
        qva qvaVar = this.s1;
        qvaVar.f0 = iArr4;
        if (!z) {
            if (z2) {
                qvaVar.setAlpha(0.5f);
            }
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.r1 = linearLayout3;
            linearLayout3.setOrientation(0);
            if (!z2) {
                this.q1.addView(linearLayout3, nme.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.t1 = frameLayout2;
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.u1 = frameLayout3;
            int L = gl.L(14.0f);
            int i9 = bkb.h5;
            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i9, wjbVar));
            vkb M = zkb.M(i9);
            frameLayout3.setBackground(b0);
            zkb.j(frameLayout3, b0, M, null, wjbVar);
            be0 be0Var = new be0(context);
            this.v1 = be0Var;
            be0Var.setRoundRadius(gl.L(14.0f));
            be0Var.getImageReceiver().B0 = true;
            H0();
            frameLayout3.addView(be0Var, nme.e(28, 28, kk7.z1));
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            int i10 = bkb.q5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            zkb.s(imageView, i10, wjbVar, mode);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, nme.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, nme.e(52, 28, 17));
            frameLayout2.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
            linearLayout3.addView(frameLayout2, nme.q(-2, -1, 0.0f, kk7.z1, 6, 4, 6, 0));
            ote.a(frameLayout2);
            ct0.g(i).o();
            px8 px8Var = new px8(context, (byte) 3);
            int i11 = bkb.F6;
            zkb.X(px8Var, i11, wjbVar);
            px8Var.setTextSize(1, 20.0f);
            px8Var.setGravity(17);
            px8Var.setText(k96.M0(2131744801, null));
            px8Var.setTypeface(gl.o());
            px8Var.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout3.addView(px8Var, nme.q(-1, -2, 1.0f, kk7.D1, 2, 0, 2, 0));
            final byte b = 0;
            G0(false);
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.ic_close_white);
            zkb.s(imageView2, bkb.V5, wjbVar, mode);
            ote.a(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: mva
                public final /* synthetic */ bwa b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    bwa bwaVar = this.b;
                    switch (b2) {
                        case 0:
                            bwaVar.dismiss();
                            break;
                        default:
                            wf2 wf2Var = bwaVar.D1;
                            wf2Var.a(!wf2Var.a.q, true);
                            bwaVar.y1 = wf2Var.a.q ? bwaVar.z1 : 2666000L;
                            bwaVar.H0();
                            awa awaVar2 = bwaVar.x1;
                            if (awaVar2 != null) {
                                awaVar2.setMyPrivacy(bwaVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout3.addView(imageView2, nme.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.q1.addView(linearLayout, nme.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            textView = new TextView(context);
            zkb.X(textView, i11, wjbVar);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setSingleLine(false);
            textView.setMaxLines(3);
            if (messageReactor == null) {
                a0 = k96.H(',', "StarsReactionTextSent", messageReactor.count);
                iArr = null;
            } else {
                iArr = null;
                a0 = k96.a0(null, null, 2131744806, K0 == null ? "" : K0.title);
            }
            textView.setText(vu3.m(gl.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
            if (z && !z2) {
                linearLayout.addView(textView, nme.t(-1, -2, 55, 40, 0, 40, 0));
            }
            if (z4) {
                str = null;
                this.x1 = null;
                this.C1 = null;
                awaVar = null;
            } else {
                if (!z2) {
                    linearLayout.addView(new nha(context, wjbVar), nme.t(-1, 30, 55, 0, 20, 0, 0));
                }
                awaVar = new awa(this, context, z2);
                this.x1 = awaVar;
                awaVar.setOnSenderClickListener(new p8c() { // from class: nva
                    @Override // p8c
                    public final void a(Object obj2) {
                        Long l = (Long) obj2;
                        d S = LaunchActivity.S();
                        if (S == null) {
                            return;
                        }
                        long longValue = l.longValue();
                        bwa bwaVar = bwa.this;
                        boolean z5 = z2;
                        if (longValue >= 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", l.longValue());
                            if (l.longValue() == y6c.h(i).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                            S.presentFragment(new rva(bwaVar, bundle, z5));
                            bwaVar.dismiss();
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", -l.longValue());
                            S.presentFragment(new sva(bwaVar, bundle2, z5));
                        }
                        bwaVar.dismiss();
                    }
                });
                this.p1.addView(awaVar, nme.k(0.0f, z2 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, kk7.u1));
                View view = new View(context);
                this.C1 = view;
                zkb.h(bkb.c7, wjbVar, view);
                if (!z2 && (z || messageReactor != null)) {
                    this.p1.addView(view, nme.n(1.0f / gl.p, -1, 7, 24, 0, 24, 0));
                }
                str = null;
            }
            if (z2) {
                int i12 = bkb.i5;
                TextView b2 = hve.b(context, 20.0f, i12, true, wjbVar);
                b2.setGravity(17);
                b2.setText(k96.M0(z ? 2131748599 : 2131748601, str));
                this.p1.addView(b2, nme.t(-1, -2, 7, 32, 6, 32, 9));
                TextView b3 = hve.b(context, 14.0f, i12, false, wjbVar);
                b3.setGravity(17);
                de9.r(null, null, z ? 2131748600 : z4 ? 2131748602 : 2131748603, new Object[]{cf3.k(y6c.t0, j)}, b3);
                this.p1.addView(b3, nme.t(-1, -2, 7, 32, 0, 32, 20));
            }
            if (z2) {
                i76 i76Var = new i76();
                this.A1 = i76Var;
                i76Var.c = this.y1;
                i76Var.g = 50L;
                i76Var.e = true;
                d76 d76Var = new d76(i, context, true);
                this.B1 = d76Var;
                d76Var.set(i76Var);
                this.p1.addView(d76Var, nme.t(-2, -2, 17, 32, 0, 32, 20));
            }
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.D1 = wf2Var;
            wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
            wf2Var.setDrawUnchecked(true);
            wf2Var.a(this.y1 == 2666000, false);
            if (awaVar != null) {
                awaVar.setMyPrivacy(this.y1);
            }
            wf2Var.setDrawBackgroundAsArc(10);
            TextView textView2 = new TextView(context);
            zkb.X(textView2, i11, wjbVar);
            textView2.setTextSize(1, 14.0f);
            textView2.setText(k96.M0(2131744809, null));
            j3 = de9.j(context, 0);
            j3.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
            j3.addView(wf2Var, nme.t(21, 21, 16, 0, 0, 9, 0));
            j3.addView(textView2, nme.r(-2, -2, 16));
            final byte b4 = 1;
            j3.setOnClickListener(new View.OnClickListener(this) { // from class: mva
                public final /* synthetic */ bwa b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b22 = b4;
                    bwa bwaVar = this.b;
                    switch (b22) {
                        case 0:
                            bwaVar.dismiss();
                            break;
                        default:
                            wf2 wf2Var2 = bwaVar.D1;
                            wf2Var2.a(!wf2Var2.a.q, true);
                            bwaVar.y1 = wf2Var2.a.q ? bwaVar.z1 : 2666000L;
                            bwaVar.H0();
                            awa awaVar2 = bwaVar.x1;
                            if (awaVar2 != null) {
                                awaVar2.setMyPrivacy(bwaVar.y1);
                                break;
                            }
                            break;
                    }
                }
            });
            ote.b(j3, 0.05f, 1.2f);
            int i13 = bkb.h6;
            ff0 Y = bkb.Y(bkb.v0(i13, wjbVar), 6, 6);
            vkb M2 = zkb.M(i13);
            j3.setBackground(Y);
            zkb.j(j3, Y, null, M2, wjbVar);
            if (!z2 && (z || messageReactor != null)) {
                this.p1.addView(j3, nme.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
            }
            u41 u41Var = new u41(wjbVar, context, true);
            this.w1 = u41Var;
            u41Var.f();
            if (!z) {
                if (z2) {
                    u41Var.setAlpha(0.5f);
                    u41Var.setEnabled(false);
                }
                I0(0L);
                u41Var.i(jva.Y0(false, k96.a0(null, null, 2131744810, k96.E(50L, ',')), this.M1), true, true);
                if (z) {
                    r14 = 0;
                    j4 = 0;
                    context2 = context;
                    u41Var.setOnClickListener(new yta(this, k27Var, mu1Var, i, z2, context, wjbVar, j, K0));
                } else {
                    r14 = 0;
                    j4 = 0;
                    context2 = context;
                }
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ova
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        long j5;
                        int i14 = i;
                        ct0 g = ct0.g(i14);
                        g.o();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = g.l;
                        if (arrayList4 != null) {
                            arrayList3.addAll(arrayList4);
                        }
                        arrayList3.add(0, y6c.h(i14).f());
                        bwa bwaVar = bwa.this;
                        cs5 G = cs5.G(bwaVar.b, wjbVar, bwaVar.u1);
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            int i16 = i15 + 1;
                            TLObject tLObject = (TLObject) arrayList3.get(i15);
                            if (tLObject instanceof TLRPC.User) {
                                j5 = ((TLRPC.User) tLObject).id;
                            } else {
                                if (tLObject instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                    if (hc2.V(chat)) {
                                        j5 = -chat.id;
                                    }
                                }
                                i15 = i16;
                            }
                            if (j5 != j) {
                                long j6 = bwaVar.y1;
                                G.f(tLObject, j5 == j6 || (j6 == 0 && j5 == y6c.h(i14).e()), new ko2((Object) bwaVar, j5, z2, (byte) 2));
                            }
                            i15 = i16;
                        }
                        G.t = false;
                        G.b0 = true;
                        G.s = (short) 0;
                        G.W(5);
                        G.a0();
                    }
                });
                l46Var = new l46(context2, wjbVar);
                l46Var.setTextSize(1, 13.0f);
                zkb.X(l46Var, bkb.y6, wjbVar);
                if (z2 || z) {
                    i2 = 0;
                    l46Var.setText(gl.N2(k96.M0(2131744808, r14), -1, 0, new vf1(context2, (byte) 21), r14));
                } else {
                    l46Var.setText(k96.M0(2131748604, r14));
                    i2 = 0;
                }
                l46Var.setGravity(17);
                zkb.G(l46Var, bkb.j5, wjbVar);
                if (!z || z2) {
                    this.p1.addView(l46Var, nme.t(-1, -2, 17, 14, 8, 14, 12));
                }
                this.O = this.p1;
                n84 n84Var = new n84(context2, 1, 2, (byte) 5);
                this.E1 = n84Var;
                uq4 uq4Var = n84Var.b;
                uq4Var.z = bkb.Vk;
                uq4Var.A = bkb.Wk;
                uq4Var.b();
                n84Var.b.k = 1.0f;
                n84Var.setVisibility(4);
                n84Var.setPaused(true);
                this.c.addView(n84Var, nme.c(150.0f, kk7.f2));
                this.s1.setValue(50);
                if (arrayList != null) {
                    long j5 = j4;
                    for (int i14 = i2; i14 < arrayList.size(); i14++) {
                        long j6 = ((TLRPC.MessageReactor) arrayList.get(i14)).count;
                        if (j6 > j5) {
                            j5 = j6;
                        }
                    }
                    j5 = messageReactor != null ? j5 - messageReactor.count : j5;
                    if (j5 > j4) {
                        this.s1.setStarsTop(j5 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            this.p1.addView(u41Var, nme.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
            I0(0L);
            u41Var.i(jva.Y0(false, k96.a0(null, null, 2131744810, k96.E(50L, ',')), this.M1), true, true);
            if (z) {
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ova
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    long j52;
                    int i142 = i;
                    ct0 g = ct0.g(i142);
                    g.o();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = g.l;
                    if (arrayList4 != null) {
                        arrayList3.addAll(arrayList4);
                    }
                    arrayList3.add(0, y6c.h(i142).f());
                    bwa bwaVar = bwa.this;
                    cs5 G = cs5.G(bwaVar.b, wjbVar, bwaVar.u1);
                    int size2 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        int i16 = i15 + 1;
                        TLObject tLObject = (TLObject) arrayList3.get(i15);
                        if (tLObject instanceof TLRPC.User) {
                            j52 = ((TLRPC.User) tLObject).id;
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                if (hc2.V(chat)) {
                                    j52 = -chat.id;
                                }
                            }
                            i15 = i16;
                        }
                        if (j52 != j) {
                            long j62 = bwaVar.y1;
                            G.f(tLObject, j52 == j62 || (j62 == 0 && j52 == y6c.h(i142).e()), new ko2((Object) bwaVar, j52, z2, (byte) 2));
                        }
                        i15 = i16;
                    }
                    G.t = false;
                    G.b0 = true;
                    G.s = (short) 0;
                    G.W(5);
                    G.a0();
                }
            });
            l46Var = new l46(context2, wjbVar);
            l46Var.setTextSize(1, 13.0f);
            zkb.X(l46Var, bkb.y6, wjbVar);
            if (z2) {
            }
            i2 = 0;
            l46Var.setText(gl.N2(k96.M0(2131744808, r14), -1, 0, new vf1(context2, (byte) 21), r14));
            l46Var.setGravity(17);
            zkb.G(l46Var, bkb.j5, wjbVar);
            if (!z) {
            }
            this.p1.addView(l46Var, nme.t(-1, -2, 17, 14, 8, 14, 12));
            this.O = this.p1;
            n84 n84Var2 = new n84(context2, 1, 2, (byte) 5);
            this.E1 = n84Var2;
            uq4 uq4Var2 = n84Var2.b;
            uq4Var2.z = bkb.Vk;
            uq4Var2.A = bkb.Wk;
            uq4Var2.b();
            n84Var2.b.k = 1.0f;
            n84Var2.setVisibility(4);
            n84Var2.setPaused(true);
            this.c.addView(n84Var2, nme.c(150.0f, kk7.f2));
            this.s1.setValue(50);
            if (arrayList != null) {
            }
        }
        this.q1.addView(this.s1, nme.d(-1, -2.0f, 55, 0.0f, z2 ? -50.0f : 0.0f, 0.0f, (!z2 || z4) ? 0.0f : -40.0f));
        LinearLayout linearLayout32 = new LinearLayout(context);
        this.r1 = linearLayout32;
        linearLayout32.setOrientation(0);
        if (!z2) {
        }
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.t1 = frameLayout22;
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.u1 = frameLayout32;
        int L2 = gl.L(14.0f);
        int i92 = bkb.h5;
        ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i92, wjbVar));
        vkb M3 = zkb.M(i92);
        frameLayout32.setBackground(b02);
        zkb.j(frameLayout32, b02, M3, null, wjbVar);
        be0 be0Var2 = new be0(context);
        this.v1 = be0Var2;
        be0Var2.setRoundRadius(gl.L(14.0f));
        be0Var2.getImageReceiver().B0 = true;
        H0();
        frameLayout32.addView(be0Var2, nme.e(28, 28, kk7.z1));
        ImageView imageView3 = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType2);
        int i102 = bkb.q5;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView3, i102, wjbVar, mode2);
        imageView3.setImageResource(R.drawable.arrows_select);
        frameLayout32.addView(imageView3, nme.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout22.addView(frameLayout32, nme.e(52, 28, 17));
        frameLayout22.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
        linearLayout32.addView(frameLayout22, nme.q(-2, -1, 0.0f, kk7.z1, 6, 4, 6, 0));
        ote.a(frameLayout22);
        ct0.g(i).o();
        px8 px8Var2 = new px8(context, (byte) 3);
        int i112 = bkb.F6;
        zkb.X(px8Var2, i112, wjbVar);
        px8Var2.setTextSize(1, 20.0f);
        px8Var2.setGravity(17);
        px8Var2.setText(k96.M0(2131744801, null));
        px8Var2.setTypeface(gl.o());
        px8Var2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout32.addView(px8Var2, nme.q(-1, -2, 1.0f, kk7.D1, 2, 0, 2, 0));
        final byte b5 = 0;
        G0(false);
        ImageView imageView22 = new ImageView(context);
        imageView22.setScaleType(scaleType2);
        imageView22.setImageResource(R.drawable.ic_close_white);
        zkb.s(imageView22, bkb.V5, wjbVar, mode2);
        ote.a(imageView22);
        imageView22.setOnClickListener(new View.OnClickListener(this) { // from class: mva
            public final /* synthetic */ bwa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b5;
                bwa bwaVar = this.b;
                switch (b22) {
                    case 0:
                        bwaVar.dismiss();
                        break;
                    default:
                        wf2 wf2Var2 = bwaVar.D1;
                        wf2Var2.a(!wf2Var2.a.q, true);
                        bwaVar.y1 = wf2Var2.a.q ? bwaVar.z1 : 2666000L;
                        bwaVar.H0();
                        awa awaVar2 = bwaVar.x1;
                        if (awaVar2 != null) {
                            awaVar2.setMyPrivacy(bwaVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout32.addView(imageView22, nme.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z2) {
        }
        this.q1.addView(linearLayout, nme.d(-1, -2.0f, 55, 0.0f, z2 ? z ? 179.0f : 45.0f : 0.0f, 0.0f, 15.0f));
        TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(-j));
        textView = new TextView(context);
        zkb.X(textView, i112, wjbVar);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor == null) {
        }
        textView.setText(vu3.m(gl.S2(a0), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z) {
            linearLayout.addView(textView, nme.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z4) {
        }
        if (z2) {
        }
        if (z2) {
        }
        wf2 wf2Var2 = new wf2(21, wjbVar, context);
        this.D1 = wf2Var2;
        wf2Var2.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var2.setDrawUnchecked(true);
        wf2Var2.a(this.y1 == 2666000, false);
        if (awaVar != null) {
        }
        wf2Var2.setDrawBackgroundAsArc(10);
        TextView textView22 = new TextView(context);
        zkb.X(textView22, i112, wjbVar);
        textView22.setTextSize(1, 14.0f);
        textView22.setText(k96.M0(2131744809, null));
        j3 = de9.j(context, 0);
        j3.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        j3.addView(wf2Var2, nme.t(21, 21, 16, 0, 0, 9, 0));
        j3.addView(textView22, nme.r(-2, -2, 16));
        final byte b42 = 1;
        j3.setOnClickListener(new View.OnClickListener(this) { // from class: mva
            public final /* synthetic */ bwa b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b42;
                bwa bwaVar = this.b;
                switch (b22) {
                    case 0:
                        bwaVar.dismiss();
                        break;
                    default:
                        wf2 wf2Var22 = bwaVar.D1;
                        wf2Var22.a(!wf2Var22.a.q, true);
                        bwaVar.y1 = wf2Var22.a.q ? bwaVar.z1 : 2666000L;
                        bwaVar.H0();
                        awa awaVar2 = bwaVar.x1;
                        if (awaVar2 != null) {
                            awaVar2.setMyPrivacy(bwaVar.y1);
                            break;
                        }
                        break;
                }
            }
        });
        ote.b(j3, 0.05f, 1.2f);
        int i132 = bkb.h6;
        ff0 Y2 = bkb.Y(bkb.v0(i132, wjbVar), 6, 6);
        vkb M22 = zkb.M(i132);
        j3.setBackground(Y2);
        zkb.j(j3, Y2, null, M22, wjbVar);
        if (!z2) {
            this.p1.addView(j3, nme.t(-2, -2, 1, 0, !z4 ? 10 : 4, 0, 10));
        }
        u41 u41Var2 = new u41(wjbVar, context, true);
        this.w1 = u41Var2;
        u41Var2.f();
        if (!z) {
        }
        this.p1.addView(u41Var2, nme.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        I0(0L);
        u41Var2.i(jva.Y0(false, k96.a0(null, null, 2131744810, k96.E(50L, ',')), this.M1), true, true);
        if (z) {
        }
        frameLayout22.setOnClickListener(new View.OnClickListener() { // from class: ova
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j52;
                int i142 = i;
                ct0 g = ct0.g(i142);
                g.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, y6c.h(i142).f());
                bwa bwaVar = bwa.this;
                cs5 G = cs5.G(bwaVar.b, wjbVar, bwaVar.u1);
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i15);
                    if (tLObject instanceof TLRPC.User) {
                        j52 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (hc2.V(chat)) {
                                j52 = -chat.id;
                            }
                        }
                        i15 = i16;
                    }
                    if (j52 != j) {
                        long j62 = bwaVar.y1;
                        G.f(tLObject, j52 == j62 || (j62 == 0 && j52 == y6c.h(i142).e()), new ko2((Object) bwaVar, j52, z2, (byte) 2));
                    }
                    i15 = i16;
                }
                G.t = false;
                G.b0 = true;
                G.s = (short) 0;
                G.W(5);
                G.a0();
            }
        });
        l46Var = new l46(context2, wjbVar);
        l46Var.setTextSize(1, 13.0f);
        zkb.X(l46Var, bkb.y6, wjbVar);
        if (z2) {
        }
        i2 = 0;
        l46Var.setText(gl.N2(k96.M0(2131744808, r14), -1, 0, new vf1(context2, (byte) 21), r14));
        l46Var.setGravity(17);
        zkb.G(l46Var, bkb.j5, wjbVar);
        if (!z) {
        }
        this.p1.addView(l46Var, nme.t(-1, -2, 17, 14, 8, 14, 12));
        this.O = this.p1;
        n84 n84Var22 = new n84(context2, 1, 2, (byte) 5);
        this.E1 = n84Var22;
        uq4 uq4Var22 = n84Var22.b;
        uq4Var22.z = bkb.Vk;
        uq4Var22.A = bkb.Wk;
        uq4Var22.b();
        n84Var22.b.k = 1.0f;
        n84Var22.setVisibility(4);
        n84Var22.setPaused(true);
        this.c.addView(n84Var22, nme.c(150.0f, kk7.f2));
        this.s1.setValue(50);
        if (arrayList != null) {
        }
    }

    @Override // fx0
    public final void C(ArrayList arrayList, boolean z) {
        Property property = View.ALPHA;
        float f = z ? 1.0f : 0.0f;
        ge0 ge0Var = this.H1;
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, (Property<ge0, Float>) property, f));
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, (Property<ge0, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(ge0Var, (Property<ge0, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
    }

    @Override // fx0
    public final boolean D() {
        if (this.s1.l0) {
            return false;
        }
        return this.c0;
    }

    public final void E0(final cta ctaVar) {
        f19 f19Var;
        View view;
        i19 i19Var;
        l18 l18Var;
        View view2;
        i19 i19Var2;
        f19 f19Var2;
        k27 k27Var;
        qva qvaVar = this.s1;
        n84 n84Var = this.E1;
        k27 k27Var2 = this.F1;
        if (k27Var2 != null && (view2 = this.P1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.Q1;
            if (view3 instanceof gb2) {
                i19Var2 = ((gb2) view3).O;
                i19Var2.getClass();
                f19Var2 = i19Var2.l("stars");
            } else if (view3 instanceof uk1) {
                i19Var2 = ((uk1) view3).F0;
                i19Var2.getClass();
                f19Var2 = i19Var2.l("stars");
            } else {
                i19Var2 = null;
                f19Var2 = null;
            }
            if (f19Var2 == null && i19Var2 != null) {
                f27 n7 = this.P1.n7(k27Var2);
                if (n7 != null && !n7.e.isEmpty()) {
                    ArrayList arrayList = n7.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            k27Var = null;
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        k27Var = (k27) obj;
                        c27 d = n7.d(k27Var);
                        if (d != null) {
                            int i2 = d.l;
                            if ((i2 & 1) != 0 && (i2 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (k27Var != null) {
                        view3 = this.P1.E6(k27Var.e1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof gb2) {
                    i19Var2 = ((gb2) view3).O;
                    i19Var2.getClass();
                    f19Var2 = i19Var2.l("stars");
                }
            }
            if (f19Var2 == null) {
                return;
            }
            i19Var = i19Var2;
            f19Var = f19Var2;
            view = view3;
        } else {
            if (this.J1 == null) {
                return;
            }
            f19Var = null;
            view = null;
            i19Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        qvaVar.getLocationInWindow(iArr);
        rectF.set(qvaVar.H.getBounds());
        rectF.inset(-gl.L(3.5f), -gl.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        kva kvaVar = new kva(this, (byte) 2);
        n84Var.b0 = kvaVar;
        if (n84Var.a0) {
            n84Var.b0 = null;
            kvaVar.run();
        }
        if (f19Var != null) {
            f19Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        f19 f19Var3 = f19Var;
        d76[] d76VarArr = new d76[1];
        if (this.n1 && (l18Var = this.J1) != null) {
            d76VarArr[0] = l18Var.c(this.K1);
        }
        final RectF rectF2 = new RectF();
        final i87 i87Var = new i87((Object) this, (Object) d76VarArr, (Object) iArr, (Object) rectF2, (Object) view, (Object) i19Var, (Object) f19Var3, (byte) 21);
        View view4 = view;
        i87Var.run();
        n84Var.setPaused(false);
        n84Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        n84Var.setTranslationX(rectF3.centerX() - (gl.L(150.0f) / 2.0f));
        n84Var.setTranslationY(rectF3.centerY() - (gl.L(150.0f) / 2.0f));
        n84Var.setScaleX(rectF3.width() / gl.L(150.0f));
        n84Var.setScaleY(rectF3.height() / gl.L(150.0f));
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lva
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                i87Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                gl.X1(rectF4, rectF5, floatValue, rectF6);
                bwa bwaVar = bwa.this;
                n84 n84Var2 = bwaVar.E1;
                n84Var2.setTranslationX(rectF6.centerX() - (gl.L(150.0f) / 2.0f));
                n84Var2.setTranslationY(rectF6.centerY() - (gl.L(150.0f) / 2.0f));
                float R1 = gl.R1(Math.max(rectF6.width() / gl.L(150.0f), rectF6.height() / gl.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                n84Var2.setScaleX(R1);
                n84Var2.setScaleY(R1);
                uq4 uq4Var = n84Var2.b;
                uq4Var.d = 360.0f * floatValue;
                uq4Var.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.a0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    bwaVar.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                cta ctaVar2 = ctaVar;
                if (ctaVar2 != null) {
                    ctaVar2.run();
                }
            }
        });
        this.R1.addListener(new tva(this, f19Var3, view4, d76VarArr, zArr, rectF2, ctaVar));
        this.R1.setDuration(800L);
        this.R1.setInterpolator(new oe3((byte) 4));
        this.R1.start();
    }

    public final boolean F0() {
        if (!this.n1) {
            ct0 g = ct0.g(this.m1);
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
                if ((obj instanceof TLRPC.Chat) && hc2.V((TLRPC.Chat) obj)) {
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

    public final void H0() {
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p = 0.42f;
        long j = this.y1;
        be0 be0Var = this.v1;
        if (j == 2666000) {
            pb0Var.f(21);
            int i = bkb.b8;
            wjb wjbVar = this.l1;
            pb0Var.h(bkb.v0(i, wjbVar), bkb.v0(i, wjbVar));
            be0Var.f(null, pb0Var);
            return;
        }
        int i2 = this.m1;
        if (j >= 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(this.y1));
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-this.y1));
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
    }

    @Override // fx0
    public final void I() {
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.I();
        }
    }

    public final void I0(long j) {
        awa awaVar;
        long j2;
        long j3;
        long j4 = 0;
        if ((!this.n1 || this.o1 || j <= 0) && (awaVar = this.x1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = y6c.h(this.m1).e();
            int i = 1;
            ArrayList arrayList2 = this.G1;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long n = cf3.n(messageReactor.peer_id);
                    long j5 = j4;
                    boolean z = messageReactor.anonymous;
                    if (z) {
                        n = messageReactor.my ? e : (-i2) - i;
                    }
                    if (messageReactor.my || n == e) {
                        j3 = messageReactor.count;
                    } else {
                        long j6 = messageReactor.count;
                        wva wvaVar = new wva();
                        wvaVar.a = z;
                        wvaVar.b = false;
                        wvaVar.c = n;
                        wvaVar.d = j6;
                        arrayList.add(wvaVar);
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
                wva wvaVar2 = new wva();
                wvaVar2.a = z2;
                wvaVar2.b = true;
                wvaVar2.c = e;
                wvaVar2.d = j7;
                arrayList.add(wvaVar2);
            }
            Collections.sort(arrayList, new pva((byte) 0));
            awaVar.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // fx0
    public final boolean U(float f, float f2) {
        ge0 ge0Var = this.H1;
        if (f < ge0Var.getX() || f > ge0Var.getX() + ge0Var.getWidth() || f2 < ge0Var.getY() || f2 > ge0Var.getY() + ge0Var.getHeight()) {
            return super.U(f, f2);
        }
        return false;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.O3) {
            G0(true);
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        Long z1;
        if (!this.N1 && !this.O1) {
            this.O1 = true;
            k27 k27Var = this.F1;
            if (k27Var != null && ((z1 = k27Var.z1()) == null || z1.longValue() != this.y1)) {
                k27Var.I5(this.y1);
                zsa b = zsa.b(k27Var);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.m1;
                na7 q1 = na7.q1(i);
                long j = b.a;
                int i2 = b.b;
                tL_messages_togglePaidReactionPrivacy.peer = q1.h1(j);
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j2 = this.y1;
                if (j2 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j2 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = na7.q1(i).h1(this.y1);
                }
                kk7.f(i).k(kk7.H1, Long.valueOf(b.a), Integer.valueOf(i2), Long.valueOf(this.y1));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new wx9(this, (byte) 4));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.m1).b(this, kk7.O3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.m1).n(this, kk7.O3);
    }

    @Override // fx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.I1 || (v0 = bkb.v0(bkb.g5, this.l1)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.I1 = v0;
            x0(v0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
