package ch;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.a11;
import org.telegram.ui.an;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k0 {
    public static k0 B;
    public static k0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final i0 b;
    public final i0 c;
    public final i0 d;
    public final FrameLayout e;
    public final k0 f;
    public float g;
    public float h;
    public final h0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final o0 p;
    public float q;
    public float r;
    public boolean s;
    public final gi0 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v39, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v47, types: [org.telegram.ui.Components.zg0] */
    /* JADX WARN: Type inference failed for: r5v51, types: [org.telegram.ui.Components.zg0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0(Context context, f2 f2Var, ii0 ii0Var, View view, View view2, float f10, float f11, o0 o0Var, int i7, int i10, boolean z9) {
        ij ijVar;
        Context context2;
        f2 f2Var2;
        View view3;
        m0 m0Var;
        long j3;
        ij ijVar2;
        ii0 ii0Var2;
        View view4;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        int round;
        int i12;
        int i13;
        FrameLayout frameLayout;
        h0 h0Var;
        ?? r15;
        i0 i0Var;
        i0 i0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i14;
        i0 i0Var3;
        ij ijVar3;
        int i15;
        int i16;
        boolean z10;
        an anVar;
        int i17;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z9;
        boolean z11 = view instanceof q1;
        if (z11) {
            ijVar = ((q1) view).getMessageObject();
            this.n = ijVar.f1();
            this.o = ijVar.d1();
        } else if (view instanceof t0) {
            ijVar = ((t0) view).getMessageObject();
            this.n = ijVar.f1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            ijVar = null;
        }
        this.p = o0Var;
        this.a = i10;
        this.v = view;
        m0 k10 = z11 ? ((q1) view).N.k(o0Var) : view instanceof t0 ? ((t0) view).E0.k(o0Var) : null;
        if (z9 && i10 == 2) {
            view3 = view2;
            m0Var = k10;
            j3 = 0;
            ijVar2 = ijVar;
            ii0Var2 = ii0Var;
            f2Var2 = f2Var;
            k0 k0Var = new k0(context, f2Var2, ii0Var2, view, view3, f10, f11, o0Var, i7, 1, true);
            context2 = context;
            this.f = k0Var;
            C = k0Var;
        } else {
            context2 = context;
            f2Var2 = f2Var;
            view3 = view2;
            m0Var = k10;
            j3 = 0;
            ijVar2 = ijVar;
            ii0Var2 = ii0Var;
        }
        an anVar2 = f2Var2 instanceof an ? (an) f2Var2 : null;
        if (ii0Var2 != null) {
            bi.q1 q1Var = ii0Var2.b;
            int i18 = 0;
            while (true) {
                if (i18 >= q1Var.getChildCount()) {
                    break;
                }
                if ((q1Var.getChildAt(i18) instanceof gi0) && ((gi0) q1Var.getChildAt(i18)).e.equals(this.p)) {
                    this.t = (gi0) q1Var.getChildAt(i18);
                    break;
                }
                i18++;
            }
        }
        int i19 = 1;
        if (i10 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (ijVar2 == null || (tL_messageReactions = ijVar2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && anVar2 != null && anVar2.a() < j3) {
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i20).reaction) && arrayList.get(i20).unread) {
                        w8 w8Var = new w8((f6) null);
                        i17 = i19;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long C1 = ij.C1(arrayList.get(i20).peer_id);
                        if (C1 < j3) {
                            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-C1));
                            if (M0 != null) {
                                w8Var.q(M0);
                                imageReceiver.i0(M0, w8Var, null);
                                j0 j0Var = new j0();
                                j0Var.a = imageReceiver;
                                float f17 = 100.0f;
                                j0Var.e = com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                j0Var.h = com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                j0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f18 = 0.4f;
                                j0Var.b = (int) com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f19 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f20 = 0.0f;
                                    float f21 = 0.0f;
                                    float f22 = 0.0f;
                                    int i21 = 0;
                                    while (i21 < 10) {
                                        an anVar3 = anVar2;
                                        float f23 = a8.p0.f(Math.abs(random.nextInt() % 100), 0.6f, f17, f19);
                                        float f24 = a8.p0.f(Math.abs(random.nextInt() % 100), f18, f17, f19);
                                        float f25 = 2.14748365E9f;
                                        for (int i22 = 0; i22 < this.x.size(); i22++) {
                                            float f26 = ((j0) this.x.get(i22)).f - f23;
                                            float f27 = ((j0) this.x.get(i22)).g - f24;
                                            float f28 = (f27 * f27) + (f26 * f26);
                                            if (f28 < f25) {
                                                f25 = f28;
                                            }
                                        }
                                        if (f25 > f22) {
                                            f21 = f24;
                                            f20 = f23;
                                            f22 = f25;
                                        }
                                        i21++;
                                        anVar2 = anVar3;
                                        f19 = 0.2f;
                                        f17 = 100.0f;
                                        f18 = 0.4f;
                                    }
                                    anVar = anVar2;
                                    j0Var.f = f20;
                                    j0Var.g = f21;
                                } else {
                                    j0Var.f = a8.p0.f(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    j0Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    anVar = anVar2;
                                }
                                this.x.add(j0Var);
                            }
                            anVar = anVar2;
                        } else {
                            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(C1));
                            if (a22 != null) {
                                w8Var.r(a22);
                                imageReceiver.i0(a22, w8Var, null);
                                j0 j0Var2 = new j0();
                                j0Var2.a = imageReceiver;
                                float f172 = 100.0f;
                                j0Var2.e = com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                j0Var2.h = com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                j0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f182 = 0.4f;
                                j0Var2.b = (int) com.google.android.recaptcha.internal.a.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f192 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(j0Var2);
                            }
                            anVar = anVar2;
                        }
                    } else {
                        anVar = anVar2;
                        i17 = i19;
                    }
                    i20++;
                    i19 = i17;
                    anVar2 = anVar;
                }
            }
        }
        an anVar4 = anVar2;
        int i23 = i19;
        gi0 gi0Var = this.t;
        ?? r10 = (gi0Var == null && (f10 == 0.0f || f11 == 0.0f)) ? 0 : i23;
        if (view3 == null) {
            if (gi0Var != null) {
                gi0Var.getLocationOnScreen(this.j);
                float x10 = this.j[0] + this.t.b.getX();
                float y10 = this.j[i23] + this.t.b.getY();
                f12 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f13 = x10;
                f14 = y10;
            } else {
                if (m0Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f29 = this.j[0];
                    ImageReceiver imageReceiver2 = m0Var.B;
                    f15 = f29 + (imageReceiver2 == null ? 0.0f : imageReceiver2.K0);
                    f16 = r3[i23] + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
                    if (imageReceiver2 != null) {
                        f12 = imageReceiver2.N0;
                    }
                } else {
                    view4 = view;
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f15 = iArr[0] + f10;
                        f16 = iArr[i23] + f11 + (view4 instanceof q1 ? ((q1) view4).V : 0);
                    } else {
                        f12 = 0.0f;
                        f13 = f10;
                        f14 = f11;
                    }
                }
                f12 = 0.0f;
            }
            if (i10 != 2) {
                int L = org.telegram.messenger.g0.L((z9 && iz.j()) ? 60.0f : 34.0f);
                round = (int) ((L * 2.0f) / org.telegram.messenger.g0.p);
                i12 = L;
                i11 = i23;
            } else {
                i11 = i23;
                if (i10 != i11) {
                    int L2 = org.telegram.messenger.g0.L(350.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int round2 = Math.round(Math.min(L2, Math.min(point.x, point.y)) * 0.8f);
                    round = (int) (Math.round(Math.min(org.telegram.messenger.g0.L(350.0f), Math.min(point.x, point.y)) * 0.7f) / org.telegram.messenger.g0.p);
                    i12 = round2;
                } else if (z9) {
                    i12 = org.telegram.messenger.g0.L(iz.j() ? 240.0f : 140.0f);
                    round = iz.j() ? (int) ((org.telegram.messenger.g0.L(80.0f) * 2.0f) / org.telegram.messenger.g0.p) : e();
                } else {
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    round = e();
                }
            }
            float f30 = f12;
            i13 = i12 >> 1;
            int i24 = round >> 1;
            float f31 = f30 / i13;
            this.g = 0.0f;
            this.h = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.e = frameLayout;
            int i25 = round;
            View view5 = view4;
            int i26 = i12;
            ij ijVar4 = ijVar2;
            r15 = i11;
            h0Var = new h0(this, context2, f2Var, view5, z9, ijVar4, anVar4, i13, i10, r10, f31, f13, f14, o0Var);
            this.i = h0Var;
            i0Var = new i0(this, context2);
            this.b = i0Var;
            i0Var2 = new i0(this, context2);
            this.c = i0Var2;
            i0 i0Var4 = new i0(this, context2);
            this.d = i0Var4;
            tL_availableReaction = o0Var.f == null ? (TLRPC.TL_availableReaction) ui.b0(i7).r.get(this.p.f) : null;
            if (tL_availableReaction != null && o0Var.g == j3) {
                this.l = r15;
                return;
            }
            if (tL_availableReaction == null) {
                int i27 = 2;
                if (i10 != 2) {
                    if ((i10 == r15 && sc.e(4112)) || i10 == 0) {
                        TLRPC.Document document = i10 == r15 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                        String a10 = i10 == r15 ? a() : com.google.android.recaptcha.internal.a.j(i25, "_", i25);
                        ImageReceiver imageReceiver3 = i0Var.getImageReceiver();
                        StringBuilder sb2 = new StringBuilder();
                        int i28 = D;
                        D = i28 + 1;
                        sb2.append(i28);
                        sb2.append("_");
                        imageReceiver3.v1 = a8.p0.n(this.n, "_", sb2);
                        i0Var.l(hc.b(document), a10, null, null, 0, null);
                        z10 = false;
                        i0Var.getImageReceiver().W(0);
                        i0Var.getImageReceiver().t0 = false;
                    } else {
                        z10 = false;
                    }
                    if (i0Var.getImageReceiver().B() != null) {
                        i0Var.getImageReceiver().B().N(z10 ? 1 : 0, z10, z10);
                        i0Var.getImageReceiver().B().start();
                    }
                    i27 = 2;
                    r11 = z10;
                } else {
                    r11 = 0;
                }
                if (i10 == i27) {
                    TLRPC.Document document2 = z9 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = i0Var2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i29 = D;
                    D = i29 + 1;
                    sb3.append(i29);
                    sb3.append("_");
                    imageReceiver4.v1 = a8.p0.n(this.n, "_", sb3);
                    i0Var2.l(hc.b(document2), com.google.android.recaptcha.internal.a.j(i24, "_", i24), null, null, 0, null);
                } else if (i10 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = i0Var2.getImageReceiver();
                    StringBuilder sb4 = new StringBuilder();
                    int i30 = D;
                    D = i30 + 1;
                    sb4.append(i30);
                    sb4.append("_");
                    imageReceiver5.v1 = a8.p0.n(this.n, "_", sb4);
                    i0Var2.l(hc.b(document3), com.google.android.recaptcha.internal.a.j(i24, "_", i24), null, null, 0, null);
                }
                i0Var3 = i0Var4;
            } else {
                r11 = 0;
                r11 = 0;
                if (i10 == 0) {
                    i14 = i7;
                    i5 i5Var = new i5(r15 == true ? 1 : 0, i14, o0Var.g);
                    i5Var.n(i0Var2);
                    i0Var2.H = i5Var;
                    if (i0Var2.J) {
                        i5Var.a(i0Var2);
                    }
                } else {
                    i14 = i7;
                    if (i10 == 2) {
                        i0Var3 = i0Var4;
                        ijVar3 = ijVar4;
                        i5 i5Var2 = new i5(2, i14, o0Var.g);
                        i5Var2.n(i0Var2);
                        i0Var2.H = i5Var2;
                        if (i0Var2.J) {
                            i5Var2.a(i0Var2);
                        }
                        if (i10 != 0 || i10 == r15) {
                            i5 i5Var3 = new i5(2, i14, o0Var.g);
                            i5Var3.setColorFilter(new PorterDuffColorFilter(ijVar3 == null ? k6.w0(ijVar3.Q5() ? ijVar3.Q3() ? k6.Gc : k6.qk : ijVar3.Q3() ? k6.uk : k6.tk, f2Var != null ? f2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            boolean z12 = i10 != 0 ? r15 == true ? 1 : 0 : false;
                            i0Var.I = d.a(i5Var3, z12, !z12);
                            h0Var.setClipChildren(false);
                        }
                    }
                }
                i0Var3 = i0Var4;
                ijVar3 = ijVar4;
                if (i10 != 0) {
                }
                i5 i5Var32 = new i5(2, i14, o0Var.g);
                if (ijVar3 == null) {
                }
                i5Var32.setColorFilter(new PorterDuffColorFilter(ijVar3 == null ? k6.w0(ijVar3.Q5() ? ijVar3.Q3() ? k6.Gc : k6.qk : ijVar3.Q3() ? k6.uk : k6.tk, f2Var != null ? f2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                if (i10 != 0) {
                }
                i0Var.I = d.a(i5Var32, z12, !z12);
                h0Var.setClipChildren(false);
            }
            i0Var2.getImageReceiver().W(r11);
            i0Var2.getImageReceiver().t0 = r11;
            if (i0Var2.getImageReceiver().B() != null) {
                if (i10 == 2) {
                    i0Var2.getImageReceiver().B().N(i0Var2.getImageReceiver().B().e[r11] - (r15 == true ? 1 : 0), r11, r11);
                } else {
                    i0Var2.getImageReceiver().B().N(r11, r11, r11);
                    i0Var2.getImageReceiver().B().start();
                }
            }
            i15 = i26 - i13;
            i16 = i15 >> 1;
            i15 = i10 == r15 ? i16 : i15;
            frameLayout.addView(i0Var2);
            i0Var2.getLayoutParams().width = i13;
            i0Var2.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).leftMargin = i15;
            if (i10 != r15 && !z9) {
                if (tL_availableReaction != null) {
                    i0Var3.getImageReceiver().q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(i0Var3);
                i0Var3.getLayoutParams().width = i13;
                i0Var3.getLayoutParams().height = i13;
                ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).topMargin = i16;
                ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).leftMargin = i15;
            }
            h0Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i26;
            frameLayout.getLayoutParams().height = i26;
            int i31 = -i16;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i31;
            int i32 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i32;
            h0Var.addView(i0Var);
            i0Var.getLayoutParams().width = i26;
            i0Var.getLayoutParams().height = i26;
            i0Var.getLayoutParams().width = i26;
            i0Var.getLayoutParams().height = i26;
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).topMargin = i31;
            ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).leftMargin = i32;
            frameLayout.setPivotX(i15);
            frameLayout.setPivotY(i16);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f15 = iArr2[0];
        f16 = iArr2[i23];
        f12 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof a11) {
            float f32 = ((a11) view3).G;
            if (f32 > 0.0f) {
                f12 = view3.getWidth() * ((f32 * 2.0f) + 1.0f);
                f15 = k5.y(f12, view3.getWidth(), 2.0f, f15);
                f16 -= f12 - view3.getWidth();
            }
        }
        view4 = view;
        f14 = f16;
        f13 = f15;
        if (i10 != 2) {
        }
        float f302 = f12;
        i13 = i12 >> 1;
        int i242 = round >> 1;
        float f312 = f302 / i13;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i252 = round;
        View view52 = view4;
        int i262 = i12;
        ij ijVar42 = ijVar2;
        r15 = i11;
        h0Var = new h0(this, context2, f2Var, view52, z9, ijVar42, anVar4, i13, i10, r10, f312, f13, f14, o0Var);
        this.i = h0Var;
        i0Var = new i0(this, context2);
        this.b = i0Var;
        i0Var2 = new i0(this, context2);
        this.c = i0Var2;
        i0 i0Var42 = new i0(this, context2);
        this.d = i0Var42;
        if (o0Var.f == null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction == null) {
        }
        i0Var2.getImageReceiver().W(r11);
        i0Var2.getImageReceiver().t0 = r11;
        if (i0Var2.getImageReceiver().B() != null) {
        }
        i15 = i262 - i13;
        i16 = i15 >> 1;
        if (i10 == r15) {
        }
        frameLayout.addView(i0Var2);
        i0Var2.getLayoutParams().width = i13;
        i0Var2.getLayoutParams().height = i13;
        ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).topMargin = i16;
        ((FrameLayout.LayoutParams) i0Var2.getLayoutParams()).leftMargin = i15;
        if (i10 != r15) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(i0Var3);
            i0Var3.getLayoutParams().width = i13;
            i0Var3.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) i0Var3.getLayoutParams()).leftMargin = i15;
        }
        h0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i262;
        frameLayout.getLayoutParams().height = i262;
        int i312 = -i16;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i312;
        int i322 = -i15;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i322;
        h0Var.addView(i0Var);
        i0Var.getLayoutParams().width = i262;
        i0Var.getLayoutParams().height = i262;
        i0Var.getLayoutParams().width = i262;
        i0Var.getLayoutParams().height = i262;
        ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).topMargin = i312;
        ((FrameLayout.LayoutParams) i0Var.getLayoutParams()).leftMargin = i322;
        frameLayout.setPivotX(i15);
        frameLayout.setPivotY(i16);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z9) {
        int i7 = 0;
        while (i7 < 2) {
            k0 k0Var = i7 == 0 ? B : C;
            if (k0Var != null) {
                if (z9) {
                    k0Var.c();
                } else {
                    k0Var.l = true;
                }
            }
            i7++;
        }
        C = null;
        B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r22 != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r1.isShowing() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(f2 f2Var, ii0 ii0Var, View view, View view2, float f10, float f11, o0 o0Var, int i7, int i10) {
        if (view == null || o0Var == null || f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        boolean z9 = true;
        if (qp.e1().getBoolean("view_animations", true)) {
            if (i10 == 2 || i10 == 0) {
                d(f2Var, null, view, view2, 0.0f, 0.0f, o0Var, i7, 1);
            }
            k0 k0Var = new k0(f2Var.getParentActivity(), f2Var, ii0Var, view, view2, f10, f11, o0Var, i7, i10, false);
            if (i10 == 1) {
                C = k0Var;
            } else {
                B = k0Var;
            }
            if (f2Var instanceof an) {
                an anVar = (an) f2Var;
                if (i10 != 0) {
                }
                g1 g1Var = anVar.e9;
                if (g1Var != null) {
                }
            }
            z9 = false;
            k0Var.w = z9;
            if (z9) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = f2Var.getParentActivity().getWindowManager();
                k0Var.k = windowManager;
                org.telegram.messenger.g0.y3(windowManager, k0Var.i, layoutParams);
                k0Var.k.addView(k0Var.i, layoutParams);
            } else {
                ((FrameLayout) f2Var.getParentActivity().getWindow().getDecorView()).addView(k0Var.i);
            }
            view.invalidate();
            if (!(view instanceof q1) || ((q1) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((org.telegram.messenger.g0.L(40.0f) * 2.0f) / org.telegram.messenger.g0.p);
    }

    public static void f() {
        k0 k0Var = B;
        if (k0Var != null) {
            k0Var.s = true;
            k0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        k0 k0Var2 = C;
        if (k0Var2 != null) {
            View view = k0Var2.v;
            if (view instanceof q1) {
                ((q1) view).N.b(k0Var2.p);
            } else if (view instanceof t0) {
                ((t0) view).E0.b(k0Var2.p);
            }
        }
    }

    public static void g() {
        k0 k0Var = C;
        if (k0Var == null || k0Var.s) {
            return;
        }
        k0Var.s = true;
        k0Var.y = System.currentTimeMillis();
        if (C.a != 1 || System.currentTimeMillis() - E <= 200) {
            return;
        }
        E = System.currentTimeMillis();
        View view = C.v;
        if (view != null) {
            view.performHapticFeedback(3);
        }
    }

    public final void c() {
        try {
            boolean z9 = this.w;
            h0 h0Var = this.i;
            if (z9) {
                this.k.removeView(h0Var);
            } else {
                org.telegram.messenger.g0.E2(h0Var);
            }
        } catch (Exception unused) {
        }
    }
}
