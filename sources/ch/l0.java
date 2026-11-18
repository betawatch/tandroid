package ch;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import di.b1;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.pc;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.b11;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final j0 b;
    public final j0 c;
    public final j0 d;
    public final FrameLayout e;
    public final l0 f;
    public float g;
    public float h;
    public final i0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final p0 p;
    public float q;
    public float r;
    public boolean s;
    public final ti0 t;
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
    /* JADX WARN: Type inference failed for: r5v47, types: [org.telegram.ui.Components.mh0] */
    /* JADX WARN: Type inference failed for: r5v51, types: [org.telegram.ui.Components.mh0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l0(Context context, h2 h2Var, vi0 vi0Var, View view, View view2, float f10, float f11, p0 p0Var, int i7, int i10, boolean z10) {
        fj fjVar;
        Context context2;
        h2 h2Var2;
        View view3;
        n0 n0Var;
        long j3;
        fj fjVar2;
        vi0 vi0Var2;
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
        i0 i0Var;
        ?? r15;
        j0 j0Var;
        j0 j0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i14;
        j0 j0Var3;
        fj fjVar3;
        int i15;
        int i16;
        boolean z11;
        bn bnVar;
        int i17;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof q1;
        if (z12) {
            fjVar = ((q1) view).getMessageObject();
            this.n = fjVar.e1();
            this.o = fjVar.c1();
        } else if (view instanceof u0) {
            fjVar = ((u0) view).getMessageObject();
            this.n = fjVar.e1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            fjVar = null;
        }
        this.p = p0Var;
        this.a = i10;
        this.v = view;
        n0 k10 = z12 ? ((q1) view).O.k(p0Var) : view instanceof u0 ? ((u0) view).F0.k(p0Var) : null;
        if (z10 && i10 == 2) {
            view3 = view2;
            n0Var = k10;
            j3 = 0;
            fjVar2 = fjVar;
            vi0Var2 = vi0Var;
            h2Var2 = h2Var;
            l0 l0Var = new l0(context, h2Var2, vi0Var2, view, view3, f10, f11, p0Var, i7, 1, true);
            context2 = context;
            this.f = l0Var;
            C = l0Var;
        } else {
            context2 = context;
            h2Var2 = h2Var;
            view3 = view2;
            n0Var = k10;
            j3 = 0;
            fjVar2 = fjVar;
            vi0Var2 = vi0Var;
        }
        bn bnVar2 = h2Var2 instanceof bn ? (bn) h2Var2 : null;
        if (vi0Var2 != null) {
            b1 b1Var = vi0Var2.b;
            int i18 = 0;
            while (true) {
                if (i18 >= b1Var.getChildCount()) {
                    break;
                }
                if ((b1Var.getChildAt(i18) instanceof ti0) && ((ti0) b1Var.getChildAt(i18)).e.equals(this.p)) {
                    this.t = (ti0) b1Var.getChildAt(i18);
                    break;
                }
                i18++;
            }
        }
        int i19 = 1;
        if (i10 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (fjVar2 == null || (tL_messageReactions = fjVar2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && bnVar2 != null && bnVar2.a() < j3) {
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i20).reaction) && arrayList.get(i20).unread) {
                        b9 b9Var = new b9((i6) null);
                        i17 = i19;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long B1 = fj.B1(arrayList.get(i20).peer_id);
                        if (B1 < j3) {
                            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-B1));
                            if (O0 != null) {
                                b9Var.q(O0);
                                imageReceiver.i0(O0, b9Var, null);
                                k0 k0Var = new k0();
                                k0Var.a = imageReceiver;
                                float f17 = 100.0f;
                                k0Var.e = e2.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                k0Var.h = e2.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                k0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f18 = 0.4f;
                                k0Var.b = (int) e2.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f19 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f20 = 0.0f;
                                    float f21 = 0.0f;
                                    float f22 = 0.0f;
                                    int i21 = 0;
                                    while (i21 < 10) {
                                        bn bnVar3 = bnVar2;
                                        float f23 = a8.p0.f(Math.abs(random.nextInt() % 100), 0.6f, f17, f19);
                                        float f24 = a8.p0.f(Math.abs(random.nextInt() % 100), f18, f17, f19);
                                        float f25 = 2.1474836E9f;
                                        for (int i22 = 0; i22 < this.x.size(); i22++) {
                                            float f26 = ((k0) this.x.get(i22)).f - f23;
                                            float f27 = ((k0) this.x.get(i22)).g - f24;
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
                                        bnVar2 = bnVar3;
                                        f19 = 0.2f;
                                        f17 = 100.0f;
                                        f18 = 0.4f;
                                    }
                                    bnVar = bnVar2;
                                    k0Var.f = f20;
                                    k0Var.g = f21;
                                } else {
                                    k0Var.f = a8.p0.f(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    k0Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    bnVar = bnVar2;
                                }
                                this.x.add(k0Var);
                            }
                            bnVar = bnVar2;
                        } else {
                            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(B1));
                            if (c22 != null) {
                                b9Var.r(c22);
                                imageReceiver.i0(c22, b9Var, null);
                                k0 k0Var2 = new k0();
                                k0Var2.a = imageReceiver;
                                float f172 = 100.0f;
                                k0Var2.e = e2.c(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                k0Var2.h = e2.c(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                k0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f182 = 0.4f;
                                k0Var2.b = (int) e2.c(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f192 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(k0Var2);
                            }
                            bnVar = bnVar2;
                        }
                    } else {
                        bnVar = bnVar2;
                        i17 = i19;
                    }
                    i20++;
                    i19 = i17;
                    bnVar2 = bnVar;
                }
            }
        }
        bn bnVar4 = bnVar2;
        int i23 = i19;
        ti0 ti0Var = this.t;
        ?? r10 = (ti0Var == null && (f10 == 0.0f || f11 == 0.0f)) ? 0 : i23;
        if (view3 == null) {
            if (ti0Var != null) {
                ti0Var.getLocationOnScreen(this.j);
                float x10 = this.j[0] + this.t.b.getX();
                float y10 = this.j[i23] + this.t.b.getY();
                f12 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f13 = x10;
                f14 = y10;
            } else {
                if (n0Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f29 = this.j[0];
                    ImageReceiver imageReceiver2 = n0Var.B;
                    f15 = f29 + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
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
                int L = org.telegram.messenger.g0.L((z10 && bz.j()) ? 60.0f : 34.0f);
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
                    i12 = org.telegram.messenger.g0.L(bz.j() ? 240.0f : 140.0f);
                    round = bz.j() ? (int) ((org.telegram.messenger.g0.L(80.0f) * 2.0f) / org.telegram.messenger.g0.p) : e();
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
            fj fjVar4 = fjVar2;
            r15 = i11;
            i0Var = new i0(this, context2, h2Var, view5, z10, fjVar4, bnVar4, i13, i10, r10, f31, f13, f14, p0Var);
            this.i = i0Var;
            j0Var = new j0(this, context2);
            this.b = j0Var;
            j0Var2 = new j0(this, context2);
            this.c = j0Var2;
            j0 j0Var4 = new j0(this, context2);
            this.d = j0Var4;
            tL_availableReaction = p0Var.f == null ? (TLRPC.TL_availableReaction) ri.d0(i7).r.get(this.p.f) : null;
            if (tL_availableReaction != null && p0Var.g == j3) {
                this.l = r15;
                return;
            }
            if (tL_availableReaction == null) {
                int i27 = 2;
                if (i10 != 2) {
                    if ((i10 == r15 && pc.e(4112)) || i10 == 0) {
                        TLRPC.Document document = i10 == r15 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                        String a10 = i10 == r15 ? a() : e2.j(i25, "_", i25);
                        ImageReceiver imageReceiver3 = j0Var.getImageReceiver();
                        StringBuilder sb2 = new StringBuilder();
                        int i28 = D;
                        D = i28 + 1;
                        sb2.append(i28);
                        sb2.append("_");
                        imageReceiver3.w1 = a8.p0.n(this.n, "_", sb2);
                        j0Var.l(fc.b(document), a10, null, null, 0, null);
                        z11 = false;
                        j0Var.getImageReceiver().W(0);
                        j0Var.getImageReceiver().u0 = false;
                    } else {
                        z11 = false;
                    }
                    if (j0Var.getImageReceiver().B() != null) {
                        j0Var.getImageReceiver().B().N(z11 ? 1 : 0, z11, z11);
                        j0Var.getImageReceiver().B().start();
                    }
                    i27 = 2;
                    r11 = z11;
                } else {
                    r11 = 0;
                }
                if (i10 == i27) {
                    TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = j0Var2.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i29 = D;
                    D = i29 + 1;
                    sb3.append(i29);
                    sb3.append("_");
                    imageReceiver4.w1 = a8.p0.n(this.n, "_", sb3);
                    j0Var2.l(fc.b(document2), e2.j(i24, "_", i24), null, null, 0, null);
                } else if (i10 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = j0Var2.getImageReceiver();
                    StringBuilder sb4 = new StringBuilder();
                    int i30 = D;
                    D = i30 + 1;
                    sb4.append(i30);
                    sb4.append("_");
                    imageReceiver5.w1 = a8.p0.n(this.n, "_", sb4);
                    j0Var2.l(fc.b(document3), e2.j(i24, "_", i24), null, null, 0, null);
                }
                j0Var3 = j0Var4;
            } else {
                r11 = 0;
                r11 = 0;
                if (i10 == 0) {
                    i14 = i7;
                    o5 o5Var = new o5(r15 == true ? 1 : 0, i14, p0Var.g);
                    o5Var.n(j0Var2);
                    j0Var2.I = o5Var;
                    if (j0Var2.K) {
                        o5Var.a(j0Var2);
                    }
                } else {
                    i14 = i7;
                    if (i10 == 2) {
                        j0Var3 = j0Var4;
                        fjVar3 = fjVar4;
                        o5 o5Var2 = new o5(2, i14, p0Var.g);
                        o5Var2.n(j0Var2);
                        j0Var2.I = o5Var2;
                        if (j0Var2.K) {
                            o5Var2.a(j0Var2);
                        }
                        if (i10 != 0 || i10 == r15) {
                            o5 o5Var3 = new o5(2, i14, p0Var.g);
                            o5Var3.setColorFilter(new PorterDuffColorFilter(fjVar3 == null ? n6.w0(fjVar3.P5() ? fjVar3.P3() ? n6.Jc : n6.tk : fjVar3.P3() ? n6.xk : n6.wk, h2Var != null ? h2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            boolean z13 = i10 != 0 ? r15 == true ? 1 : 0 : false;
                            j0Var.J = d.a(o5Var3, z13, !z13);
                            i0Var.setClipChildren(false);
                        }
                    }
                }
                j0Var3 = j0Var4;
                fjVar3 = fjVar4;
                if (i10 != 0) {
                }
                o5 o5Var32 = new o5(2, i14, p0Var.g);
                if (fjVar3 == null) {
                }
                o5Var32.setColorFilter(new PorterDuffColorFilter(fjVar3 == null ? n6.w0(fjVar3.P5() ? fjVar3.P3() ? n6.Jc : n6.tk : fjVar3.P3() ? n6.xk : n6.wk, h2Var != null ? h2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                if (i10 != 0) {
                }
                j0Var.J = d.a(o5Var32, z13, !z13);
                i0Var.setClipChildren(false);
            }
            j0Var2.getImageReceiver().W(r11);
            j0Var2.getImageReceiver().u0 = r11;
            if (j0Var2.getImageReceiver().B() != null) {
                if (i10 == 2) {
                    j0Var2.getImageReceiver().B().N(j0Var2.getImageReceiver().B().e[r11] - (r15 == true ? 1 : 0), r11, r11);
                } else {
                    j0Var2.getImageReceiver().B().N(r11, r11, r11);
                    j0Var2.getImageReceiver().B().start();
                }
            }
            i15 = i26 - i13;
            i16 = i15 >> 1;
            i15 = i10 == r15 ? i16 : i15;
            frameLayout.addView(j0Var2);
            j0Var2.getLayoutParams().width = i13;
            j0Var2.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) j0Var2.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) j0Var2.getLayoutParams()).leftMargin = i15;
            if (i10 != r15 && !z10) {
                if (tL_availableReaction != null) {
                    j0Var3.getImageReceiver().q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(j0Var3);
                j0Var3.getLayoutParams().width = i13;
                j0Var3.getLayoutParams().height = i13;
                ((FrameLayout.LayoutParams) j0Var3.getLayoutParams()).topMargin = i16;
                ((FrameLayout.LayoutParams) j0Var3.getLayoutParams()).leftMargin = i15;
            }
            i0Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i26;
            frameLayout.getLayoutParams().height = i26;
            int i31 = -i16;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i31;
            int i32 = -i15;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i32;
            i0Var.addView(j0Var);
            j0Var.getLayoutParams().width = i26;
            j0Var.getLayoutParams().height = i26;
            j0Var.getLayoutParams().width = i26;
            j0Var.getLayoutParams().height = i26;
            ((FrameLayout.LayoutParams) j0Var.getLayoutParams()).topMargin = i31;
            ((FrameLayout.LayoutParams) j0Var.getLayoutParams()).leftMargin = i32;
            frameLayout.setPivotX(i15);
            frameLayout.setPivotY(i16);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f15 = iArr2[0];
        f16 = iArr2[i23];
        f12 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof b11) {
            float f32 = ((b11) view3).H;
            if (f32 > 0.0f) {
                f12 = view3.getWidth() * ((f32 * 2.0f) + 1.0f);
                f15 = f3.y(f12, view3.getWidth(), 2.0f, f15);
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
        fj fjVar42 = fjVar2;
        r15 = i11;
        i0Var = new i0(this, context2, h2Var, view52, z10, fjVar42, bnVar4, i13, i10, r10, f312, f13, f14, p0Var);
        this.i = i0Var;
        j0Var = new j0(this, context2);
        this.b = j0Var;
        j0Var2 = new j0(this, context2);
        this.c = j0Var2;
        j0 j0Var42 = new j0(this, context2);
        this.d = j0Var42;
        if (p0Var.f == null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction == null) {
        }
        j0Var2.getImageReceiver().W(r11);
        j0Var2.getImageReceiver().u0 = r11;
        if (j0Var2.getImageReceiver().B() != null) {
        }
        i15 = i262 - i13;
        i16 = i15 >> 1;
        if (i10 == r15) {
        }
        frameLayout.addView(j0Var2);
        j0Var2.getLayoutParams().width = i13;
        j0Var2.getLayoutParams().height = i13;
        ((FrameLayout.LayoutParams) j0Var2.getLayoutParams()).topMargin = i16;
        ((FrameLayout.LayoutParams) j0Var2.getLayoutParams()).leftMargin = i15;
        if (i10 != r15) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(j0Var3);
            j0Var3.getLayoutParams().width = i13;
            j0Var3.getLayoutParams().height = i13;
            ((FrameLayout.LayoutParams) j0Var3.getLayoutParams()).topMargin = i16;
            ((FrameLayout.LayoutParams) j0Var3.getLayoutParams()).leftMargin = i15;
        }
        i0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i262;
        frameLayout.getLayoutParams().height = i262;
        int i312 = -i16;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i312;
        int i322 = -i15;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i322;
        i0Var.addView(j0Var);
        j0Var.getLayoutParams().width = i262;
        j0Var.getLayoutParams().height = i262;
        j0Var.getLayoutParams().width = i262;
        j0Var.getLayoutParams().height = i262;
        ((FrameLayout.LayoutParams) j0Var.getLayoutParams()).topMargin = i312;
        ((FrameLayout.LayoutParams) j0Var.getLayoutParams()).leftMargin = i322;
        frameLayout.setPivotX(i15);
        frameLayout.setPivotY(i16);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i7 = 0;
        while (i7 < 2) {
            l0 l0Var = i7 == 0 ? B : C;
            if (l0Var != null) {
                if (z10) {
                    l0Var.c();
                } else {
                    l0Var.l = true;
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
    public static void d(h2 h2Var, vi0 vi0Var, View view, View view2, float f10, float f11, p0 p0Var, int i7, int i10) {
        if (view == null || p0Var == null || h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (mp.g1().getBoolean("view_animations", true)) {
            if (i10 == 2 || i10 == 0) {
                d(h2Var, null, view, view2, 0.0f, 0.0f, p0Var, i7, 1);
            }
            l0 l0Var = new l0(h2Var.getParentActivity(), h2Var, vi0Var, view, view2, f10, f11, p0Var, i7, i10, false);
            if (i10 == 1) {
                C = l0Var;
            } else {
                B = l0Var;
            }
            if (h2Var instanceof bn) {
                bn bnVar = (bn) h2Var;
                if (i10 != 0) {
                }
                h1 h1Var = bnVar.g9;
                if (h1Var != null) {
                }
            }
            z10 = false;
            l0Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = h2Var.getParentActivity().getWindowManager();
                l0Var.k = windowManager;
                org.telegram.messenger.g0.w3(windowManager, l0Var.i, layoutParams);
                l0Var.k.addView(l0Var.i, layoutParams);
            } else {
                ((FrameLayout) h2Var.getParentActivity().getWindow().getDecorView()).addView(l0Var.i);
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
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.s = true;
            l0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        l0 l0Var2 = C;
        if (l0Var2 != null) {
            View view = l0Var2.v;
            if (view instanceof q1) {
                ((q1) view).O.b(l0Var2.p);
            } else if (view instanceof u0) {
                ((u0) view).F0.b(l0Var2.p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var == null || l0Var.s) {
            return;
        }
        l0Var.s = true;
        l0Var.y = System.currentTimeMillis();
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
            i0 i0Var = this.i;
            if (z10) {
                this.k.removeView(i0Var);
            } else {
                org.telegram.messenger.g0.E2(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
