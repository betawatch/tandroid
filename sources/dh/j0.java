package dh;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import ci.j1;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.q01;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j0 {
    public static j0 B;
    public static j0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final h0 b;
    public final h0 c;
    public final h0 d;
    public final FrameLayout e;
    public final j0 f;
    public float g;
    public float h;
    public final g0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final n0 p;
    public float q;
    public float r;
    public boolean s;
    public final ji0 t;
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
    /* JADX WARN: Type inference failed for: r5v47, types: [org.telegram.ui.Components.ch0] */
    /* JADX WARN: Type inference failed for: r5v51, types: [org.telegram.ui.Components.ch0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(Context context, d2 d2Var, li0 li0Var, View view, View view2, float f10, float f11, n0 n0Var, int i3, int i10, boolean z10) {
        zi ziVar;
        Context context2;
        d2 d2Var2;
        View view3;
        l0 l0Var;
        long j10;
        zi ziVar2;
        li0 li0Var2;
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
        g0 g0Var;
        ?? r15;
        h0 h0Var;
        h0 h0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i14;
        h0 h0Var3;
        zi ziVar3;
        int i15;
        int i16;
        boolean z11;
        wm wmVar;
        int i17;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof q1;
        if (z12) {
            ziVar = ((q1) view).getMessageObject();
            this.n = ziVar.f1();
            this.o = ziVar.d1();
        } else if (view instanceof t0) {
            ziVar = ((t0) view).getMessageObject();
            this.n = ziVar.f1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            ziVar = null;
        }
        this.p = n0Var;
        this.a = i10;
        this.v = view;
        l0 k10 = z12 ? ((q1) view).O.k(n0Var) : view instanceof t0 ? ((t0) view).F0.k(n0Var) : null;
        if (z10 && i10 == 2) {
            view3 = view2;
            l0Var = k10;
            j10 = 0;
            ziVar2 = ziVar;
            li0Var2 = li0Var;
            d2Var2 = d2Var;
            j0 j0Var = new j0(context, d2Var2, li0Var2, view, view3, f10, f11, n0Var, i3, 1, true);
            context2 = context;
            this.f = j0Var;
            C = j0Var;
        } else {
            context2 = context;
            d2Var2 = d2Var;
            view3 = view2;
            l0Var = k10;
            j10 = 0;
            ziVar2 = ziVar;
            li0Var2 = li0Var;
        }
        wm wmVar2 = d2Var2 instanceof wm ? (wm) d2Var2 : null;
        if (li0Var2 != null) {
            j1 j1Var = li0Var2.b;
            int i18 = 0;
            while (true) {
                if (i18 >= j1Var.getChildCount()) {
                    break;
                }
                if ((j1Var.getChildAt(i18) instanceof ji0) && ((ji0) j1Var.getChildAt(i18)).e.equals(this.p)) {
                    this.t = (ji0) j1Var.getChildAt(i18);
                    break;
                }
                i18++;
            }
        }
        int i19 = 1;
        if (i10 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (ziVar2 == null || (tL_messageReactions = ziVar2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && wmVar2 != null && wmVar2.a() < j10) {
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i20).reaction) && arrayList.get(i20).unread) {
                        u8 u8Var = new u8((e6) null);
                        i17 = i19;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long C1 = zi.C1(arrayList.get(i20).peer_id);
                        if (C1 < j10) {
                            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-C1));
                            if (M0 != null) {
                                u8Var.q(M0);
                                imageReceiver.i0(M0, u8Var, null);
                                i0 i0Var = new i0();
                                i0Var.a = imageReceiver;
                                float f17 = 100.0f;
                                i0Var.e = a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                i0Var.h = a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                i0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f18 = 0.4f;
                                i0Var.b = (int) a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f19 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f20 = 0.0f;
                                    float f21 = 0.0f;
                                    float f22 = 0.0f;
                                    int i21 = 0;
                                    while (i21 < 10) {
                                        wm wmVar3 = wmVar2;
                                        float e10 = a1.g.e(Math.abs(random.nextInt() % 100), 0.6f, f17, f19);
                                        float e11 = a1.g.e(Math.abs(random.nextInt() % 100), f18, f17, f19);
                                        float f23 = 2.14748365E9f;
                                        for (int i22 = 0; i22 < this.x.size(); i22++) {
                                            float f24 = ((i0) this.x.get(i22)).f - e10;
                                            float f25 = ((i0) this.x.get(i22)).g - e11;
                                            float f26 = (f25 * f25) + (f24 * f24);
                                            if (f26 < f23) {
                                                f23 = f26;
                                            }
                                        }
                                        if (f23 > f22) {
                                            f21 = e11;
                                            f20 = e10;
                                            f22 = f23;
                                        }
                                        i21++;
                                        wmVar2 = wmVar3;
                                        f19 = 0.2f;
                                        f17 = 100.0f;
                                        f18 = 0.4f;
                                    }
                                    wmVar = wmVar2;
                                    i0Var.f = f20;
                                    i0Var.g = f21;
                                } else {
                                    i0Var.f = a1.g.e(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    i0Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    wmVar = wmVar2;
                                }
                                this.x.add(i0Var);
                            }
                            wmVar = wmVar2;
                        } else {
                            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(C1));
                            if (a22 != null) {
                                u8Var.r(a22);
                                imageReceiver.i0(a22, u8Var, null);
                                i0 i0Var2 = new i0();
                                i0Var2.a = imageReceiver;
                                float f172 = 100.0f;
                                i0Var2.e = a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                i0Var2.h = a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                i0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f182 = 0.4f;
                                i0Var2.b = (int) a1.g.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f192 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(i0Var2);
                            }
                            wmVar = wmVar2;
                        }
                    } else {
                        wmVar = wmVar2;
                        i17 = i19;
                    }
                    i20++;
                    i19 = i17;
                    wmVar2 = wmVar;
                }
            }
        }
        wm wmVar4 = wmVar2;
        int i23 = i19;
        ji0 ji0Var = this.t;
        ?? r10 = (ji0Var == null && (f10 == 0.0f || f11 == 0.0f)) ? 0 : i23;
        if (view3 == null) {
            if (ji0Var != null) {
                ji0Var.getLocationOnScreen(this.j);
                float x10 = this.j[0] + this.t.b.getX();
                float y9 = this.j[i23] + this.t.b.getY();
                f12 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f13 = x10;
                f14 = y9;
            } else {
                if (l0Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f27 = this.j[0];
                    ImageReceiver imageReceiver2 = l0Var.B;
                    f15 = f27 + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
                    f16 = r3[i23] + (imageReceiver2 == null ? 0.0f : imageReceiver2.M0);
                    if (imageReceiver2 != null) {
                        f12 = imageReceiver2.O0;
                    }
                } else {
                    view4 = view;
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f15 = iArr[0] + f10;
                        f16 = iArr[i23] + f11 + (view4 instanceof q1 ? ((q1) view4).W : 0);
                    } else {
                        f12 = 0.0f;
                        f13 = f10;
                        f14 = f11;
                    }
                }
                f12 = 0.0f;
            }
            if (i10 != 2) {
                int L = org.telegram.messenger.g0.L((z10 && az.j()) ? 60.0f : 34.0f);
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
                } else if (z10) {
                    i12 = org.telegram.messenger.g0.L(az.j() ? 240.0f : 140.0f);
                    round = az.j() ? (int) ((org.telegram.messenger.g0.L(80.0f) * 2.0f) / org.telegram.messenger.g0.p) : e();
                } else {
                    i12 = org.telegram.messenger.g0.L(80.0f);
                    round = e();
                }
            }
            float f28 = f12;
            i13 = i12 >> 1;
            int i24 = round >> 1;
            float f29 = f28 / i13;
            this.g = 0.0f;
            this.h = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.e = frameLayout;
            int i25 = round;
            View view5 = view4;
            int i26 = i12;
            zi ziVar4 = ziVar2;
            r15 = i11;
            g0Var = new g0(this, context2, d2Var, view5, z10, ziVar4, wmVar4, i13, i10, r10, f29, f13, f14, n0Var);
            this.i = g0Var;
            h0Var = new h0(this, context2);
            this.b = h0Var;
            h0Var2 = new h0(this, context2);
            this.c = h0Var2;
            h0 h0Var4 = new h0(this, context2);
            this.d = h0Var4;
            tL_availableReaction = n0Var.f == null ? (TLRPC.TL_availableReaction) li.b0(i3).r.get(this.p.f) : null;
            if (tL_availableReaction != null && n0Var.g == j10) {
                this.l = r15;
                return;
            }
            if (tL_availableReaction == null) {
                int i27 = 2;
                if (i10 != 2) {
                    if ((i10 == r15 && lc.e(4112)) || i10 == 0) {
                        TLRPC.Document document = i10 == r15 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                        String a10 = i10 == r15 ? a() : com.google.android.recaptcha.internal.a.i(i25, "_", i25);
                        ImageReceiver imageReceiver3 = h0Var.getImageReceiver();
                        StringBuilder sb2 = new StringBuilder();
                        int i28 = D;
                        D = i28 + 1;
                        sb2.append(i28);
                        sb2.append("_");
                        imageReceiver3.w1 = a1.g.o(this.n, "_", sb2);
                        h0Var.l(ac.b(document), a10, null, null, 0, null);
                        z11 = false;
                        h0Var.getImageReceiver().W(0);
                        h0Var.getImageReceiver().u0 = false;
                    } else {
                        z11 = false;
                    }
                    if (h0Var.getImageReceiver().B() != null) {
                        h0Var.getImageReceiver().B().N(z11 ? 1 : 0, z11, z11);
                        h0Var.getImageReceiver().B().start();
                    }
                    i27 = 2;
                    r11 = z11;
                } else {
                    r11 = 0;
                }
                if (i10 == i27) {
                    TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = h0Var2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i29 = D;
                    D = i29 + 1;
                    sb3.append(i29);
                    sb3.append("_");
                    imageReceiver4.w1 = a1.g.o(this.n, "_", sb3);
                    h0Var2.l(ac.b(document2), com.google.android.recaptcha.internal.a.i(i24, "_", i24), null, null, 0, null);
                } else if (i10 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = h0Var2.getImageReceiver();
                    StringBuilder sb4 = new StringBuilder();
                    int i30 = D;
                    D = i30 + 1;
                    sb4.append(i30);
                    sb4.append("_");
                    imageReceiver5.w1 = a1.g.o(this.n, "_", sb4);
                    h0Var2.l(ac.b(document3), com.google.android.recaptcha.internal.a.i(i24, "_", i24), null, null, 0, null);
                }
                h0Var3 = h0Var4;
            } else {
                r11 = 0;
                r11 = 0;
                if (i10 == 0) {
                    i14 = i3;
                    g5 g5Var = new g5(r15 == true ? 1 : 0, i14, n0Var.g);
                    g5Var.n(h0Var2);
                    h0Var2.I = g5Var;
                    if (h0Var2.K) {
                        g5Var.a(h0Var2);
                    }
                } else {
                    i14 = i3;
                    if (i10 == 2) {
                        h0Var3 = h0Var4;
                        ziVar3 = ziVar4;
                        g5 g5Var2 = new g5(2, i14, n0Var.g);
                        g5Var2.n(h0Var2);
                        h0Var2.I = g5Var2;
                        if (h0Var2.K) {
                            g5Var2.a(h0Var2);
                        }
                        if (i10 != 0 || i10 == r15) {
                            g5 g5Var3 = new g5(2, i14, n0Var.g);
                            g5Var3.setColorFilter(new PorterDuffColorFilter(ziVar3 == null ? k6.w0(ziVar3.Q5() ? ziVar3.Q3() ? k6.Gc : k6.qk : ziVar3.Q3() ? k6.uk : k6.tk, d2Var != null ? d2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            boolean z13 = i10 != 0 ? r15 == true ? 1 : 0 : false;
                            h0Var.J = d.a(g5Var3, z13, !z13);
                            g0Var.setClipChildren(false);
                        }
                    }
                }
                h0Var3 = h0Var4;
                ziVar3 = ziVar4;
                if (i10 != 0) {
                }
                g5 g5Var32 = new g5(2, i14, n0Var.g);
                if (ziVar3 == null) {
                }
                g5Var32.setColorFilter(new PorterDuffColorFilter(ziVar3 == null ? k6.w0(ziVar3.Q5() ? ziVar3.Q3() ? k6.Gc : k6.qk : ziVar3.Q3() ? k6.uk : k6.tk, d2Var != null ? d2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                if (i10 != 0) {
                }
                h0Var.J = d.a(g5Var32, z13, !z13);
                g0Var.setClipChildren(false);
            }
            h0Var2.getImageReceiver().W(r11);
            h0Var2.getImageReceiver().u0 = r11;
            if (h0Var2.getImageReceiver().B() != null) {
                if (i10 == 2) {
                    h0Var2.getImageReceiver().B().N(h0Var2.getImageReceiver().B().e[r11] - (r15 == true ? 1 : 0), r11, r11);
                } else {
                    h0Var2.getImageReceiver().B().N(r11, r11, r11);
                    h0Var2.getImageReceiver().B().start();
                }
            }
            i15 = i26 - i13;
            i16 = i15 >> 1;
            i15 = i10 == r15 ? i16 : i15;
            frameLayout.addView(h0Var2);
            h0Var2.getLayoutParams().width = i13;
            h0Var2.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) h0Var2.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) h0Var2.getLayoutParams()).leftMargin = i15;
            if (i10 != r15 && !z10) {
                if (tL_availableReaction != null) {
                    h0Var3.getImageReceiver().q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(h0Var3);
                h0Var3.getLayoutParams().width = i13;
                h0Var3.getLayoutParams().height = i13;
                ((FrameLayout.LayoutParams) h0Var3.getLayoutParams()).topMargin = i16;
                ((FrameLayout.LayoutParams) h0Var3.getLayoutParams()).leftMargin = i15;
            }
            g0Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i26;
            frameLayout.getLayoutParams().height = i26;
            int i31 = -i16;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i31;
            int i32 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i32;
            g0Var.addView(h0Var);
            h0Var.getLayoutParams().width = i26;
            h0Var.getLayoutParams().height = i26;
            h0Var.getLayoutParams().width = i26;
            h0Var.getLayoutParams().height = i26;
            ((FrameLayout.LayoutParams) h0Var.getLayoutParams()).topMargin = i31;
            ((FrameLayout.LayoutParams) h0Var.getLayoutParams()).leftMargin = i32;
            frameLayout.setPivotX(i15);
            frameLayout.setPivotY(i16);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f15 = iArr2[0];
        f16 = iArr2[i23];
        f12 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof q01) {
            float f30 = ((q01) view3).H;
            if (f30 > 0.0f) {
                f12 = view3.getWidth() * ((f30 * 2.0f) + 1.0f);
                f15 = k5.y(f12, view3.getWidth(), 2.0f, f15);
                f16 -= f12 - view3.getWidth();
            }
        }
        view4 = view;
        f14 = f16;
        f13 = f15;
        if (i10 != 2) {
        }
        float f282 = f12;
        i13 = i12 >> 1;
        int i242 = round >> 1;
        float f292 = f282 / i13;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i252 = round;
        View view52 = view4;
        int i262 = i12;
        zi ziVar42 = ziVar2;
        r15 = i11;
        g0Var = new g0(this, context2, d2Var, view52, z10, ziVar42, wmVar4, i13, i10, r10, f292, f13, f14, n0Var);
        this.i = g0Var;
        h0Var = new h0(this, context2);
        this.b = h0Var;
        h0Var2 = new h0(this, context2);
        this.c = h0Var2;
        h0 h0Var42 = new h0(this, context2);
        this.d = h0Var42;
        if (n0Var.f == null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction == null) {
        }
        h0Var2.getImageReceiver().W(r11);
        h0Var2.getImageReceiver().u0 = r11;
        if (h0Var2.getImageReceiver().B() != null) {
        }
        i15 = i262 - i13;
        i16 = i15 >> 1;
        if (i10 == r15) {
        }
        frameLayout.addView(h0Var2);
        h0Var2.getLayoutParams().width = i13;
        h0Var2.getLayoutParams().height = i13;
        ((FrameLayout.LayoutParams) h0Var2.getLayoutParams()).topMargin = i16;
        ((FrameLayout.LayoutParams) h0Var2.getLayoutParams()).leftMargin = i15;
        if (i10 != r15) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(h0Var3);
            h0Var3.getLayoutParams().width = i13;
            h0Var3.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) h0Var3.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) h0Var3.getLayoutParams()).leftMargin = i15;
        }
        g0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i262;
        frameLayout.getLayoutParams().height = i262;
        int i312 = -i16;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i312;
        int i322 = -i15;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i322;
        g0Var.addView(h0Var);
        h0Var.getLayoutParams().width = i262;
        h0Var.getLayoutParams().height = i262;
        h0Var.getLayoutParams().width = i262;
        h0Var.getLayoutParams().height = i262;
        ((FrameLayout.LayoutParams) h0Var.getLayoutParams()).topMargin = i312;
        ((FrameLayout.LayoutParams) h0Var.getLayoutParams()).leftMargin = i322;
        frameLayout.setPivotX(i15);
        frameLayout.setPivotY(i16);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i3 = 0;
        while (i3 < 2) {
            j0 j0Var = i3 == 0 ? B : C;
            if (j0Var != null) {
                if (z10) {
                    j0Var.c();
                } else {
                    j0Var.l = true;
                }
            }
            i3++;
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
    public static void d(d2 d2Var, li0 li0Var, View view, View view2, float f10, float f11, n0 n0Var, int i3, int i10) {
        if (view == null || n0Var == null || d2Var == null || d2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (hp.e1().getBoolean("view_animations", true)) {
            if (i10 == 2 || i10 == 0) {
                d(d2Var, null, view, view2, 0.0f, 0.0f, n0Var, i3, 1);
            }
            j0 j0Var = new j0(d2Var.getParentActivity(), d2Var, li0Var, view, view2, f10, f11, n0Var, i3, i10, false);
            if (i10 == 1) {
                C = j0Var;
            } else {
                B = j0Var;
            }
            if (d2Var instanceof wm) {
                wm wmVar = (wm) d2Var;
                if (i10 != 0) {
                }
                f1 f1Var = wmVar.f9;
                if (f1Var != null) {
                }
            }
            z10 = false;
            j0Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = d2Var.getParentActivity().getWindowManager();
                j0Var.k = windowManager;
                org.telegram.messenger.g0.y3(windowManager, j0Var.i, layoutParams);
                j0Var.k.addView(j0Var.i, layoutParams);
            } else {
                ((FrameLayout) d2Var.getParentActivity().getWindow().getDecorView()).addView(j0Var.i);
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
        j0 j0Var = B;
        if (j0Var != null) {
            j0Var.s = true;
            j0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        j0 j0Var2 = C;
        if (j0Var2 != null) {
            View view = j0Var2.v;
            if (view instanceof q1) {
                ((q1) view).O.b(j0Var2.p);
            } else if (view instanceof t0) {
                ((t0) view).F0.b(j0Var2.p);
            }
        }
    }

    public static void g() {
        j0 j0Var = C;
        if (j0Var == null || j0Var.s) {
            return;
        }
        j0Var.s = true;
        j0Var.y = System.currentTimeMillis();
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
            boolean z10 = this.w;
            g0 g0Var = this.i;
            if (z10) {
                this.k.removeView(g0Var);
            } else {
                org.telegram.messenger.g0.E2(g0Var);
            }
        } catch (Exception unused) {
        }
    }
}
