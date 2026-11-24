// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d19 {
    public static d19 B;
    public static d19 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final b19 b;
    public final b19 c;
    public final b19 d;
    public final FrameLayout e;
    public final d19 f;
    public float g;
    public float h;
    public final a19 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final h19 p;
    public float q;
    public float r;
    public boolean s;
    public final r09 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0203  */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d19(Context context, d dVar, t09 t09Var, View view, View view2, float f, float f2, h19 h19Var, int i, int i2, boolean z) {
        k27 k27Var;
        Context context2;
        d dVar2;
        View view3;
        f19 f19Var;
        long j;
        k27 k27Var2;
        t09 t09Var2;
        View view4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int round;
        int i3;
        int i4;
        FrameLayout frameLayout;
        b19 b19Var;
        b19 b19Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r6;
        int i5;
        TLRPC.Document document;
        String m;
        int i6;
        int i7;
        mu1 mu1Var;
        int i8;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z;
        boolean z2 = view instanceof gb2;
        if (z2) {
            k27Var = ((gb2) view).getMessageObject();
            this.n = k27Var.e1();
            this.o = k27Var.c1();
        } else if (view instanceof uk1) {
            k27Var = ((uk1) view).getMessageObject();
            this.n = k27Var.e1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            k27Var = null;
        }
        this.p = h19Var;
        this.a = i2;
        this.v = view;
        f19 k = z2 ? ((gb2) view).O.k(h19Var) : view instanceof uk1 ? ((uk1) view).F0.k(h19Var) : null;
        if (z && i2 == 2) {
            view3 = view2;
            f19Var = k;
            j = 0;
            k27Var2 = k27Var;
            t09Var2 = t09Var;
            dVar2 = dVar;
            d19 d19Var = new d19(context, dVar2, t09Var2, view, view3, f, f2, h19Var, i, 1, true);
            context2 = context;
            this.f = d19Var;
            C = d19Var;
        } else {
            context2 = context;
            dVar2 = dVar;
            view3 = view2;
            f19Var = k;
            j = 0;
            k27Var2 = k27Var;
            t09Var2 = t09Var;
        }
        mu1 mu1Var2 = dVar2 instanceof mu1 ? (mu1) dVar2 : null;
        if (t09Var2 != null) {
            fu fuVar = t09Var2.b;
            int i9 = 0;
            while (true) {
                if (i9 >= fuVar.getChildCount()) {
                    break;
                }
                if ((fuVar.getChildAt(i9) instanceof r09) && ((r09) fuVar.getChildAt(i9)).e.equals(this.p)) {
                    this.t = (r09) fuVar.getChildAt(i9);
                    break;
                }
                i9++;
            }
        }
        int i10 = 1;
        if (i2 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (k27Var2 == null || (tL_messageReactions = k27Var2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && mu1Var2 != null && mu1Var2.a() < j) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i11).reaction) && arrayList.get(i11).unread) {
                        pb0 pb0Var = new pb0((wjb) null);
                        i8 = i10;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long B1 = k27.B1(arrayList.get(i11).peer_id);
                        if (B1 < j) {
                            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-B1));
                            if (K0 != null) {
                                pb0Var.p(K0);
                                imageReceiver.U(K0, pb0Var, null);
                                c19 c19Var = new c19();
                                c19Var.a = imageReceiver;
                                float f8 = 100.0f;
                                c19Var.e = b00.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                c19Var.h = b00.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                c19Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f9 = 0.4f;
                                c19Var.b = (int) b00.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f10 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f11 = 0.0f;
                                    float f12 = 0.0f;
                                    float f13 = 0.0f;
                                    int i12 = 0;
                                    while (i12 < 10) {
                                        mu1 mu1Var3 = mu1Var2;
                                        float d = ls6.d(Math.abs(random.nextInt() % 100), 0.6f, f8, f10);
                                        float d2 = ls6.d(Math.abs(random.nextInt() % 100), f9, f8, f10);
                                        float f14 = 2.1474836E9f;
                                        for (int i13 = 0; i13 < this.x.size(); i13++) {
                                            float f15 = ((c19) this.x.get(i13)).f - d;
                                            float f16 = ((c19) this.x.get(i13)).g - d2;
                                            float f17 = (f16 * f16) + (f15 * f15);
                                            if (f17 < f14) {
                                                f14 = f17;
                                            }
                                        }
                                        if (f14 > f13) {
                                            f12 = d2;
                                            f11 = d;
                                            f13 = f14;
                                        }
                                        i12++;
                                        mu1Var2 = mu1Var3;
                                        f8 = 100.0f;
                                        f10 = 0.2f;
                                        f9 = 0.4f;
                                    }
                                    mu1Var = mu1Var2;
                                    c19Var.f = f11;
                                    c19Var.g = f12;
                                } else {
                                    c19Var.f = ls6.d(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    c19Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    mu1Var = mu1Var2;
                                }
                                this.x.add(c19Var);
                            }
                            mu1Var = mu1Var2;
                        } else {
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(B1));
                            if (V1 != null) {
                                pb0Var.q(V1);
                                imageReceiver.U(V1, pb0Var, null);
                                c19 c19Var2 = new c19();
                                c19Var2.a = imageReceiver;
                                float f82 = 100.0f;
                                c19Var2.e = b00.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                c19Var2.h = b00.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                c19Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f92 = 0.4f;
                                c19Var2.b = (int) b00.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f102 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(c19Var2);
                            }
                            mu1Var = mu1Var2;
                        }
                    } else {
                        mu1Var = mu1Var2;
                        i8 = i10;
                    }
                    i11++;
                    i10 = i8;
                    mu1Var2 = mu1Var;
                }
            }
        }
        mu1 mu1Var4 = mu1Var2;
        int i14 = i10;
        r09 r09Var = this.t;
        boolean z3 = (r09Var == null && (f == 0.0f || f2 == 0.0f)) ? 0 : i14;
        if (view3 == null) {
            if (r09Var != null) {
                r09Var.getLocationOnScreen(this.j);
                float x = this.j[0] + this.t.b.getX();
                float y = this.j[i14] + this.t.b.getY();
                f3 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f4 = x;
                f5 = y;
            } else {
                if (f19Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f18 = this.j[0];
                    ImageReceiver imageReceiver2 = f19Var.B;
                    f6 = f18 + (imageReceiver2 == null ? 0.0f : imageReceiver2.L0);
                    f7 = r3[i14] + (imageReceiver2 == null ? 0.0f : imageReceiver2.M0);
                    if (imageReceiver2 != null) {
                        f3 = imageReceiver2.O0;
                    }
                } else {
                    view4 = view;
                    if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f6 = iArr[0] + f;
                        f7 = iArr[i14] + f2 + (view4 instanceof gb2 ? ((gb2) view4).W : 0);
                    } else {
                        f3 = 0.0f;
                        f4 = f;
                        f5 = f2;
                    }
                }
                f3 = 0.0f;
            }
            if (i2 != 2) {
                int L = gl.L((z && gba.j()) ? 60.0f : 34.0f);
                round = (int) ((L * 2.0f) / gl.p);
                i3 = L;
            } else if (i2 != i14) {
                int L2 = gl.L(350.0f);
                Point point = gl.q;
                int round2 = Math.round(Math.min(L2, Math.min(point.x, point.y)) * 0.8f);
                round = (int) (Math.round(Math.min(gl.L(350.0f), Math.min(point.x, point.y)) * 0.7f) / gl.p);
                i3 = round2;
            } else if (z) {
                int L3 = gl.L(gba.j() ? 240.0f : 140.0f);
                round = gba.j() ? (int) ((gl.L(80.0f) * 2.0f) / gl.p) : e();
                i3 = L3;
            } else {
                i3 = gl.L(80.0f);
                round = e();
            }
            float f19 = f3;
            i4 = i3 >> 1;
            int i15 = round >> 1;
            float f20 = f19 / i4;
            this.g = 0.0f;
            this.h = 0.0f;
            frameLayout = new FrameLayout(context2);
            this.e = frameLayout;
            int i16 = i3;
            int i17 = round;
            View view5 = view4;
            k27 k27Var3 = k27Var2;
            a19 a19Var = new a19(this, context2, dVar, view5, z, k27Var3, mu1Var4, i4, i2, z3, f20, f4, f5, h19Var);
            this.i = a19Var;
            b19 b19Var3 = new b19(this, context2);
            this.b = b19Var3;
            b19Var = new b19(this, context2);
            this.c = b19Var;
            b19Var2 = new b19(this, context2);
            this.d = b19Var2;
            tL_availableReaction = h19Var.f == null ? (TLRPC.TL_availableReaction) hq6.d0(i).r.get(this.p.f) : null;
            if (tL_availableReaction == null) {
                r6 = 0;
                r6 = 0;
                r6 = 0;
                i5 = 1;
                int i18 = 2;
                if (i2 != 2) {
                    if ((i2 == 1 && e66.e(4112)) || i2 == 0) {
                        if (i2 == 1) {
                            document = tL_availableReaction.around_animation;
                            m = a();
                        } else {
                            document = tL_availableReaction.effect_animation;
                            m = tb4.m(i17, i17, "_");
                        }
                        ImageReceiver imageReceiver3 = b19Var3.getImageReceiver();
                        StringBuilder sb = new StringBuilder();
                        int i19 = D;
                        D = i19 + 1;
                        sb.append(i19);
                        sb.append("_");
                        imageReceiver3.w1 = de9.l(sb, this.n, "_");
                        b19Var3.h(gl5.b(document), m, null, null, 0, null);
                        b19Var3.getImageReceiver().M(0);
                        b19Var3.getImageReceiver().u0 = false;
                    }
                    if (b19Var3.getImageReceiver().y() != null) {
                        b19Var3.getImageReceiver().y().I(0, false, false);
                        b19Var3.getImageReceiver().y().start();
                    }
                    i18 = 2;
                }
                if (i2 == i18) {
                    TLRPC.Document document2 = z ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = b19Var.getImageReceiver();
                    StringBuilder sb2 = new StringBuilder();
                    int i20 = D;
                    D = i20 + 1;
                    sb2.append(i20);
                    sb2.append("_");
                    imageReceiver4.w1 = de9.l(sb2, this.n, "_");
                    b19Var.h(gl5.b(document2), tb4.m(i15, i15, "_"), null, null, 0, null);
                } else if (i2 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = b19Var.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i21 = D;
                    D = i21 + 1;
                    sb3.append(i21);
                    sb3.append("_");
                    imageReceiver5.w1 = de9.l(sb3, this.n, "_");
                    b19Var.h(gl5.b(document3), tb4.m(i15, i15, "_"), null, null, 0, null);
                }
            } else {
                if (h19Var.g == j) {
                    this.l = true;
                    return;
                }
                if (i2 == 0) {
                    i5 = 1;
                    vl vlVar = new vl(1, i, h19Var.g);
                    vlVar.o(b19Var);
                    b19Var.I = vlVar;
                    if (b19Var.K) {
                        vlVar.b(b19Var);
                    }
                } else {
                    i5 = 1;
                    if (i2 == 2) {
                        vl vlVar2 = new vl(2, i, h19Var.g);
                        vlVar2.o(b19Var);
                        b19Var.I = vlVar2;
                        if (b19Var.K) {
                            vlVar2.b(b19Var);
                        }
                    }
                }
                if (i2 == 0 || i2 == i5) {
                    vl vlVar3 = new vl(2, i, h19Var.g);
                    vlVar3.setColorFilter(new PorterDuffColorFilter(k27Var3 != null ? bkb.v0(k27Var3.O5() ? k27Var3.O3() ? bkb.Ic : bkb.sk : k27Var3.O3() ? bkb.wk : bkb.vk, dVar != null ? dVar.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                    boolean z4 = i2 == 0 ? i5 : 0;
                    b19Var3.J = xl.a(vlVar3, z4, !z4);
                    r6 = 0;
                    a19Var.setClipChildren(false);
                } else {
                    r6 = 0;
                }
            }
            b19Var.getImageReceiver().M(r6);
            b19Var.getImageReceiver().u0 = r6;
            if (b19Var.getImageReceiver().y() != null) {
                if (i2 == 2) {
                    b19Var.getImageReceiver().y().I(b19Var.getImageReceiver().y().e[r6] - i5, r6, r6);
                } else {
                    b19Var.getImageReceiver().y().I(r6, r6, r6);
                    b19Var.getImageReceiver().y().start();
                }
            }
            i6 = i16 - i4;
            i7 = i6 >> 1;
            i6 = i2 == i5 ? i7 : i6;
            frameLayout.addView(b19Var);
            b19Var.getLayoutParams().width = i4;
            b19Var.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) b19Var.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) b19Var.getLayoutParams()).leftMargin = i6;
            if (i2 != i5 && !z) {
                if (tL_availableReaction != null) {
                    b19Var2.getImageReceiver().d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(b19Var2);
                b19Var2.getLayoutParams().width = i4;
                b19Var2.getLayoutParams().height = i4;
                ((FrameLayout.LayoutParams) b19Var2.getLayoutParams()).topMargin = i7;
                ((FrameLayout.LayoutParams) b19Var2.getLayoutParams()).leftMargin = i6;
            }
            a19Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i16;
            frameLayout.getLayoutParams().height = i16;
            int i22 = -i7;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i22;
            int i23 = -i6;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i23;
            a19Var.addView(b19Var3);
            b19Var3.getLayoutParams().width = i16;
            b19Var3.getLayoutParams().height = i16;
            b19Var3.getLayoutParams().width = i16;
            b19Var3.getLayoutParams().height = i16;
            ((FrameLayout.LayoutParams) b19Var3.getLayoutParams()).topMargin = i22;
            ((FrameLayout.LayoutParams) b19Var3.getLayoutParams()).leftMargin = i23;
            frameLayout.setPivotX(i6);
            frameLayout.setPivotY(i7);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f6 = iArr2[0];
        f7 = iArr2[i14];
        f3 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof dx9) {
            float f21 = ((dx9) view3).H;
            if (f21 > 0.0f) {
                f3 = view3.getWidth() * ((f21 * 2.0f) + 1.0f);
                f6 = tb4.x(f3, view3.getWidth(), 2.0f, f6);
                f7 -= f3 - view3.getWidth();
            }
        }
        view4 = view;
        f5 = f7;
        f4 = f6;
        if (i2 != 2) {
        }
        float f192 = f3;
        i4 = i3 >> 1;
        int i152 = round >> 1;
        float f202 = f192 / i4;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i162 = i3;
        int i172 = round;
        View view52 = view4;
        k27 k27Var32 = k27Var2;
        a19 a19Var2 = new a19(this, context2, dVar, view52, z, k27Var32, mu1Var4, i4, i2, z3, f202, f4, f5, h19Var);
        this.i = a19Var2;
        b19 b19Var32 = new b19(this, context2);
        this.b = b19Var32;
        b19Var = new b19(this, context2);
        this.c = b19Var;
        b19Var2 = new b19(this, context2);
        this.d = b19Var2;
        if (h19Var.f == null) {
        }
        if (tL_availableReaction == null) {
        }
        b19Var.getImageReceiver().M(r6);
        b19Var.getImageReceiver().u0 = r6;
        if (b19Var.getImageReceiver().y() != null) {
        }
        i6 = i162 - i4;
        i7 = i6 >> 1;
        if (i2 == i5) {
        }
        frameLayout.addView(b19Var);
        b19Var.getLayoutParams().width = i4;
        b19Var.getLayoutParams().height = i4;
        ((FrameLayout.LayoutParams) b19Var.getLayoutParams()).topMargin = i7;
        ((FrameLayout.LayoutParams) b19Var.getLayoutParams()).leftMargin = i6;
        if (i2 != i5) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(b19Var2);
            b19Var2.getLayoutParams().width = i4;
            b19Var2.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) b19Var2.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) b19Var2.getLayoutParams()).leftMargin = i6;
        }
        a19Var2.addView(frameLayout);
        frameLayout.getLayoutParams().width = i162;
        frameLayout.getLayoutParams().height = i162;
        int i222 = -i7;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i222;
        int i232 = -i6;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i232;
        a19Var2.addView(b19Var32);
        b19Var32.getLayoutParams().width = i162;
        b19Var32.getLayoutParams().height = i162;
        b19Var32.getLayoutParams().width = i162;
        b19Var32.getLayoutParams().height = i162;
        ((FrameLayout.LayoutParams) b19Var32.getLayoutParams()).topMargin = i222;
        ((FrameLayout.LayoutParams) b19Var32.getLayoutParams()).leftMargin = i232;
        frameLayout.setPivotX(i6);
        frameLayout.setPivotY(i7);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        int i = 0;
        while (i < 2) {
            d19 d19Var = i == 0 ? B : C;
            if (d19Var != null) {
                if (z) {
                    d19Var.c();
                } else {
                    d19Var.l = true;
                }
            }
            i++;
        }
        C = null;
        B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r22 != 2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r1.isShowing() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(d dVar, t09 t09Var, hf0 hf0Var, View view, float f, float f2, h19 h19Var, int i, int i2) {
        if (hf0Var == null || h19Var == null || dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        boolean z = true;
        if (na7.c1().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                d(dVar, null, hf0Var, view, 0.0f, 0.0f, h19Var, i, 1);
            }
            d19 d19Var = new d19(dVar.getParentActivity(), dVar, t09Var, hf0Var, view, f, f2, h19Var, i, i2, false);
            if (i2 == 1) {
                C = d19Var;
            } else {
                B = d19Var;
            }
            if (dVar instanceof mu1) {
                mu1 mu1Var = (mu1) dVar;
                if (i2 != 0) {
                }
                m8 m8Var = mu1Var.g9;
                if (m8Var != null) {
                }
            }
            z = false;
            d19Var.w = z;
            a19 a19Var = d19Var.i;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = dVar.getParentActivity().getWindowManager();
                d19Var.k = windowManager;
                gl.s3(windowManager, a19Var, layoutParams);
                d19Var.k.addView(a19Var, layoutParams);
            } else {
                ((FrameLayout) dVar.getParentActivity().getWindow().getDecorView()).addView(a19Var);
            }
            hf0Var.invalidate();
            if (!(hf0Var instanceof gb2) || ((gb2) hf0Var).getCurrentMessagesGroup() == null || hf0Var.getParent() == null) {
                return;
            }
            ((View) hf0Var.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((gl.L(40.0f) * 2.0f) / gl.p);
    }

    public static void f() {
        d19 d19Var = B;
        if (d19Var != null) {
            d19Var.s = true;
            d19Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        d19 d19Var2 = C;
        if (d19Var2 != null) {
            View view = d19Var2.v;
            if (view instanceof gb2) {
                ((gb2) view).O.b(d19Var2.p);
            } else if (view instanceof uk1) {
                ((uk1) view).F0.b(d19Var2.p);
            }
        }
    }

    public static void g() {
        d19 d19Var = C;
        if (d19Var == null || d19Var.s) {
            return;
        }
        d19Var.s = true;
        d19Var.y = System.currentTimeMillis();
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
            boolean z = this.w;
            a19 a19Var = this.i;
            if (z) {
                this.k.removeView(a19Var);
            } else {
                gl.B2(a19Var);
            }
        } catch (Exception unused) {
        }
    }
}
