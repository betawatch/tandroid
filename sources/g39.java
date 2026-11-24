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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g39 {
    public static g39 B;
    public static g39 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final e39 b;
    public final e39 c;
    public final e39 d;
    public final FrameLayout e;
    public final g39 f;
    public float g;
    public float h;
    public final d39 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final k39 p;
    public float q;
    public float r;
    public boolean s;
    public final t29 t;
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
    public g39(Context context, d dVar, v29 v29Var, View view, View view2, float f, float f2, k39 k39Var, int i, int i2, boolean z) {
        k47 k47Var;
        Context context2;
        d dVar2;
        View view3;
        i39 i39Var;
        long j;
        k47 k47Var2;
        v29 v29Var2;
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
        e39 e39Var;
        e39 e39Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r6;
        int i5;
        TLRPC.Document document;
        String n;
        int i6;
        int i7;
        yv1 yv1Var;
        int i8;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z;
        boolean z2 = view instanceof rc2;
        if (z2) {
            k47Var = ((rc2) view).getMessageObject();
            this.n = k47Var.e1();
            this.o = k47Var.c1();
        } else if (view instanceof cm1) {
            k47Var = ((cm1) view).getMessageObject();
            this.n = k47Var.e1();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            k47Var = null;
        }
        this.p = k39Var;
        this.a = i2;
        this.v = view;
        i39 k = z2 ? ((rc2) view).O.k(k39Var) : view instanceof cm1 ? ((cm1) view).F0.k(k39Var) : null;
        if (z && i2 == 2) {
            view3 = view2;
            i39Var = k;
            j = 0;
            k47Var2 = k47Var;
            v29Var2 = v29Var;
            dVar2 = dVar;
            g39 g39Var = new g39(context, dVar2, v29Var2, view, view3, f, f2, k39Var, i, 1, true);
            context2 = context;
            this.f = g39Var;
            C = g39Var;
        } else {
            context2 = context;
            dVar2 = dVar;
            view3 = view2;
            i39Var = k;
            j = 0;
            k47Var2 = k47Var;
            v29Var2 = v29Var;
        }
        yv1 yv1Var2 = dVar2 instanceof yv1 ? (yv1) dVar2 : null;
        if (v29Var2 != null) {
            fv fvVar = v29Var2.b;
            int i9 = 0;
            while (true) {
                if (i9 >= fvVar.getChildCount()) {
                    break;
                }
                if ((fvVar.getChildAt(i9) instanceof t29) && ((t29) fvVar.getChildAt(i9)).e.equals(this.p)) {
                    this.t = (t29) fvVar.getChildAt(i9);
                    break;
                }
                i9++;
            }
        }
        int i10 = 1;
        if (i2 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (k47Var2 == null || (tL_messageReactions = k47Var2.k.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && yv1Var2 != null && yv1Var2.a() < j) {
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i11).reaction) && arrayList.get(i11).unread) {
                        pc0 pc0Var = new pc0((ylb) null);
                        i8 = i10;
                        ImageReceiver imageReceiver = new ImageReceiver(null);
                        long B1 = k47.B1(arrayList.get(i11).peer_id);
                        if (B1 < j) {
                            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B1));
                            if (L0 != null) {
                                pc0Var.p(L0);
                                imageReceiver.U(L0, pc0Var, null);
                                f39 f39Var = new f39();
                                f39Var.a = imageReceiver;
                                float f8 = 100.0f;
                                f39Var.e = b10.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                f39Var.h = b10.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                f39Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f9 = 0.4f;
                                f39Var.b = (int) b10.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f10 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f11 = 0.0f;
                                    float f12 = 0.0f;
                                    float f13 = 0.0f;
                                    int i12 = 0;
                                    while (i12 < 10) {
                                        yv1 yv1Var3 = yv1Var2;
                                        float d = kt6.d(Math.abs(random.nextInt() % 100), 0.6f, f8, f10);
                                        float d2 = kt6.d(Math.abs(random.nextInt() % 100), f9, f8, f10);
                                        float f14 = 2.1474836E9f;
                                        for (int i13 = 0; i13 < this.x.size(); i13++) {
                                            float f15 = ((f39) this.x.get(i13)).f - d;
                                            float f16 = ((f39) this.x.get(i13)).g - d2;
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
                                        yv1Var2 = yv1Var3;
                                        f8 = 100.0f;
                                        f10 = 0.2f;
                                        f9 = 0.4f;
                                    }
                                    yv1Var = yv1Var2;
                                    f39Var.f = f11;
                                    f39Var.g = f12;
                                } else {
                                    f39Var.f = kt6.d(Math.abs(random.nextInt() % 100), 0.6f, 100.0f, 0.2f);
                                    f39Var.g = (Math.abs(random.nextInt() % 100) * 0.4f) / 100.0f;
                                    yv1Var = yv1Var2;
                                }
                                this.x.add(f39Var);
                            }
                            yv1Var = yv1Var2;
                        } else {
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(B1));
                            if (W1 != null) {
                                pc0Var.q(W1);
                                imageReceiver.U(W1, pc0Var, null);
                                f39 f39Var2 = new f39();
                                f39Var2.a = imageReceiver;
                                float f82 = 100.0f;
                                f39Var2.e = b10.A(Math.abs(random.nextInt() % 100), 100.0f, 0.1f, 0.3f);
                                f39Var2.h = b10.A(Math.abs(random.nextInt() % 100), 100.0f, 0.4f, 0.8f);
                                f39Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f92 = 0.4f;
                                f39Var2.b = (int) b10.A(Math.abs(random.nextInt() % 100), 100.0f, 200.0f, 400.0f);
                                float f102 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(f39Var2);
                            }
                            yv1Var = yv1Var2;
                        }
                    } else {
                        yv1Var = yv1Var2;
                        i8 = i10;
                    }
                    i11++;
                    i10 = i8;
                    yv1Var2 = yv1Var;
                }
            }
        }
        yv1 yv1Var4 = yv1Var2;
        int i14 = i10;
        t29 t29Var = this.t;
        boolean z3 = (t29Var == null && (f == 0.0f || f2 == 0.0f)) ? 0 : i14;
        if (view3 == null) {
            if (t29Var != null) {
                t29Var.getLocationOnScreen(this.j);
                float x = this.j[0] + this.t.b.getX();
                float y = this.j[i14] + this.t.b.getY();
                f3 = this.t.getScaleX() * this.t.b.getWidth();
                view4 = view;
                f4 = x;
                f5 = y;
            } else {
                if (i39Var != null) {
                    view4 = view;
                    view4.getLocationInWindow(this.j);
                    float f18 = this.j[0];
                    ImageReceiver imageReceiver2 = i39Var.B;
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
                        f7 = iArr[i14] + f2 + (view4 instanceof rc2 ? ((rc2) view4).W : 0);
                    } else {
                        f3 = 0.0f;
                        f4 = f;
                        f5 = f2;
                    }
                }
                f3 = 0.0f;
            }
            if (i2 != 2) {
                int L = gm.L((z && gda.j()) ? 60.0f : 34.0f);
                round = (int) ((L * 2.0f) / gm.p);
                i3 = L;
            } else if (i2 != i14) {
                int L2 = gm.L(350.0f);
                Point point = gm.q;
                int round2 = Math.round(Math.min(L2, Math.min(point.x, point.y)) * 0.8f);
                round = (int) (Math.round(Math.min(gm.L(350.0f), Math.min(point.x, point.y)) * 0.7f) / gm.p);
                i3 = round2;
            } else if (z) {
                int L3 = gm.L(gda.j() ? 240.0f : 140.0f);
                round = gda.j() ? (int) ((gm.L(80.0f) * 2.0f) / gm.p) : e();
                i3 = L3;
            } else {
                i3 = gm.L(80.0f);
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
            k47 k47Var3 = k47Var2;
            d39 d39Var = new d39(this, context2, dVar, view5, z, k47Var3, yv1Var4, i4, i2, z3, f20, f4, f5, k39Var);
            this.i = d39Var;
            e39 e39Var3 = new e39(this, context2);
            this.b = e39Var3;
            e39Var = new e39(this, context2);
            this.c = e39Var;
            e39Var2 = new e39(this, context2);
            this.d = e39Var2;
            tL_availableReaction = k39Var.f == null ? (TLRPC.TL_availableReaction) hs6.d0(i).r.get(this.p.f) : null;
            if (tL_availableReaction == null) {
                r6 = 0;
                r6 = 0;
                r6 = 0;
                i5 = 1;
                int i18 = 2;
                if (i2 != 2) {
                    if ((i2 == 1 && e86.e(4112)) || i2 == 0) {
                        if (i2 == 1) {
                            document = tL_availableReaction.around_animation;
                            n = a();
                        } else {
                            document = tL_availableReaction.effect_animation;
                            n = td4.n(i17, i17, "_");
                        }
                        ImageReceiver imageReceiver3 = e39Var3.getImageReceiver();
                        StringBuilder sb = new StringBuilder();
                        int i19 = D;
                        D = i19 + 1;
                        sb.append(i19);
                        sb.append("_");
                        imageReceiver3.w1 = hg9.k(sb, this.n, "_");
                        e39Var3.h(gn5.b(document), n, null, null, 0, null);
                        e39Var3.getImageReceiver().M(0);
                        e39Var3.getImageReceiver().u0 = false;
                    }
                    if (e39Var3.getImageReceiver().y() != null) {
                        e39Var3.getImageReceiver().y().I(0, false, false);
                        e39Var3.getImageReceiver().y().start();
                    }
                    i18 = 2;
                }
                if (i2 == i18) {
                    TLRPC.Document document2 = z ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                    ImageReceiver imageReceiver4 = e39Var.getImageReceiver();
                    StringBuilder sb2 = new StringBuilder();
                    int i20 = D;
                    D = i20 + 1;
                    sb2.append(i20);
                    sb2.append("_");
                    imageReceiver4.w1 = hg9.k(sb2, this.n, "_");
                    e39Var.h(gn5.b(document2), td4.n(i15, i15, "_"), null, null, 0, null);
                } else if (i2 == 0) {
                    TLRPC.Document document3 = tL_availableReaction.activate_animation;
                    ImageReceiver imageReceiver5 = e39Var.getImageReceiver();
                    StringBuilder sb3 = new StringBuilder();
                    int i21 = D;
                    D = i21 + 1;
                    sb3.append(i21);
                    sb3.append("_");
                    imageReceiver5.w1 = hg9.k(sb3, this.n, "_");
                    e39Var.h(gn5.b(document3), td4.n(i15, i15, "_"), null, null, 0, null);
                }
            } else {
                if (k39Var.g == j) {
                    this.l = true;
                    return;
                }
                if (i2 == 0) {
                    i5 = 1;
                    vm vmVar = new vm(1, i, k39Var.g);
                    vmVar.o(e39Var);
                    e39Var.I = vmVar;
                    if (e39Var.K) {
                        vmVar.b(e39Var);
                    }
                } else {
                    i5 = 1;
                    if (i2 == 2) {
                        vm vmVar2 = new vm(2, i, k39Var.g);
                        vmVar2.o(e39Var);
                        e39Var.I = vmVar2;
                        if (e39Var.K) {
                            vmVar2.b(e39Var);
                        }
                    }
                }
                if (i2 == 0 || i2 == i5) {
                    vm vmVar3 = new vm(2, i, k39Var.g);
                    vmVar3.setColorFilter(new PorterDuffColorFilter(k47Var3 != null ? cmb.v0(k47Var3.O5() ? k47Var3.O3() ? cmb.Ic : cmb.sk : k47Var3.O3() ? cmb.wk : cmb.vk, dVar != null ? dVar.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                    boolean z4 = i2 == 0 ? i5 : 0;
                    e39Var3.J = xm.a(vmVar3, z4, !z4);
                    r6 = 0;
                    d39Var.setClipChildren(false);
                } else {
                    r6 = 0;
                }
            }
            e39Var.getImageReceiver().M(r6);
            e39Var.getImageReceiver().u0 = r6;
            if (e39Var.getImageReceiver().y() != null) {
                if (i2 == 2) {
                    e39Var.getImageReceiver().y().I(e39Var.getImageReceiver().y().e[r6] - i5, r6, r6);
                } else {
                    e39Var.getImageReceiver().y().I(r6, r6, r6);
                    e39Var.getImageReceiver().y().start();
                }
            }
            i6 = i16 - i4;
            i7 = i6 >> 1;
            i6 = i2 == i5 ? i7 : i6;
            frameLayout.addView(e39Var);
            e39Var.getLayoutParams().width = i4;
            e39Var.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) e39Var.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) e39Var.getLayoutParams()).leftMargin = i6;
            if (i2 != i5 && !z) {
                if (tL_availableReaction != null) {
                    e39Var2.getImageReceiver().d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                }
                frameLayout.addView(e39Var2);
                e39Var2.getLayoutParams().width = i4;
                e39Var2.getLayoutParams().height = i4;
                ((FrameLayout.LayoutParams) e39Var2.getLayoutParams()).topMargin = i7;
                ((FrameLayout.LayoutParams) e39Var2.getLayoutParams()).leftMargin = i6;
            }
            d39Var.addView(frameLayout);
            frameLayout.getLayoutParams().width = i16;
            frameLayout.getLayoutParams().height = i16;
            int i22 = -i7;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i22;
            int i23 = -i6;
            ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i23;
            d39Var.addView(e39Var3);
            e39Var3.getLayoutParams().width = i16;
            e39Var3.getLayoutParams().height = i16;
            e39Var3.getLayoutParams().width = i16;
            e39Var3.getLayoutParams().height = i16;
            ((FrameLayout.LayoutParams) e39Var3.getLayoutParams()).topMargin = i22;
            ((FrameLayout.LayoutParams) e39Var3.getLayoutParams()).leftMargin = i23;
            frameLayout.setPivotX(i6);
            frameLayout.setPivotY(i7);
        }
        view3.getLocationOnScreen(this.j);
        int[] iArr2 = this.j;
        f6 = iArr2[0];
        f7 = iArr2[i14];
        f3 = view3.getScaleX() * view3.getWidth();
        if (view3 instanceof fz9) {
            float f21 = ((fz9) view3).H;
            if (f21 > 0.0f) {
                f3 = view3.getWidth() * ((f21 * 2.0f) + 1.0f);
                f6 = td4.y(f3, view3.getWidth(), 2.0f, f6);
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
        k47 k47Var32 = k47Var2;
        d39 d39Var2 = new d39(this, context2, dVar, view52, z, k47Var32, yv1Var4, i4, i2, z3, f202, f4, f5, k39Var);
        this.i = d39Var2;
        e39 e39Var32 = new e39(this, context2);
        this.b = e39Var32;
        e39Var = new e39(this, context2);
        this.c = e39Var;
        e39Var2 = new e39(this, context2);
        this.d = e39Var2;
        if (k39Var.f == null) {
        }
        if (tL_availableReaction == null) {
        }
        e39Var.getImageReceiver().M(r6);
        e39Var.getImageReceiver().u0 = r6;
        if (e39Var.getImageReceiver().y() != null) {
        }
        i6 = i162 - i4;
        i7 = i6 >> 1;
        if (i2 == i5) {
        }
        frameLayout.addView(e39Var);
        e39Var.getLayoutParams().width = i4;
        e39Var.getLayoutParams().height = i4;
        ((FrameLayout.LayoutParams) e39Var.getLayoutParams()).topMargin = i7;
        ((FrameLayout.LayoutParams) e39Var.getLayoutParams()).leftMargin = i6;
        if (i2 != i5) {
            if (tL_availableReaction != null) {
            }
            frameLayout.addView(e39Var2);
            e39Var2.getLayoutParams().width = i4;
            e39Var2.getLayoutParams().height = i4;
            ((FrameLayout.LayoutParams) e39Var2.getLayoutParams()).topMargin = i7;
            ((FrameLayout.LayoutParams) e39Var2.getLayoutParams()).leftMargin = i6;
        }
        d39Var2.addView(frameLayout);
        frameLayout.getLayoutParams().width = i162;
        frameLayout.getLayoutParams().height = i162;
        int i222 = -i7;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i222;
        int i232 = -i6;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i232;
        d39Var2.addView(e39Var32);
        e39Var32.getLayoutParams().width = i162;
        e39Var32.getLayoutParams().height = i162;
        e39Var32.getLayoutParams().width = i162;
        e39Var32.getLayoutParams().height = i162;
        ((FrameLayout.LayoutParams) e39Var32.getLayoutParams()).topMargin = i222;
        ((FrameLayout.LayoutParams) e39Var32.getLayoutParams()).leftMargin = i232;
        frameLayout.setPivotX(i6);
        frameLayout.setPivotY(i7);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z) {
        int i = 0;
        while (i < 2) {
            g39 g39Var = i == 0 ? B : C;
            if (g39Var != null) {
                if (z) {
                    g39Var.c();
                } else {
                    g39Var.l = true;
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
    public static void d(d dVar, v29 v29Var, hg0 hg0Var, View view, float f, float f2, k39 k39Var, int i, int i2) {
        if (hg0Var == null || k39Var == null || dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        boolean z = true;
        if (oc7.d1().getBoolean("view_animations", true)) {
            if (i2 == 2 || i2 == 0) {
                d(dVar, null, hg0Var, view, 0.0f, 0.0f, k39Var, i, 1);
            }
            g39 g39Var = new g39(dVar.getParentActivity(), dVar, v29Var, hg0Var, view, f, f2, k39Var, i, i2, false);
            if (i2 == 1) {
                C = g39Var;
            } else {
                B = g39Var;
            }
            if (dVar instanceof yv1) {
                yv1 yv1Var = (yv1) dVar;
                if (i2 != 0) {
                }
                m8 m8Var = yv1Var.g9;
                if (m8Var != null) {
                }
            }
            z = false;
            g39Var.w = z;
            d39 d39Var = g39Var.i;
            if (z) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = 1000;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = dVar.getParentActivity().getWindowManager();
                g39Var.k = windowManager;
                gm.s3(windowManager, d39Var, layoutParams);
                g39Var.k.addView(d39Var, layoutParams);
            } else {
                ((FrameLayout) dVar.getParentActivity().getWindow().getDecorView()).addView(d39Var);
            }
            hg0Var.invalidate();
            if (!(hg0Var instanceof rc2) || ((rc2) hg0Var).getCurrentMessagesGroup() == null || hg0Var.getParent() == null) {
                return;
            }
            ((View) hg0Var.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((gm.L(40.0f) * 2.0f) / gm.p);
    }

    public static void f() {
        g39 g39Var = B;
        if (g39Var != null) {
            g39Var.s = true;
            g39Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        g39 g39Var2 = C;
        if (g39Var2 != null) {
            View view = g39Var2.v;
            if (view instanceof rc2) {
                ((rc2) view).O.b(g39Var2.p);
            } else if (view instanceof cm1) {
                ((cm1) view).F0.b(g39Var2.p);
            }
        }
    }

    public static void g() {
        g39 g39Var = C;
        if (g39Var == null || g39Var.s) {
            return;
        }
        g39Var.s = true;
        g39Var.y = System.currentTimeMillis();
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
            d39 d39Var = this.i;
            if (z) {
                this.k.removeView(d39Var);
            } else {
                gm.B2(d39Var);
            }
        } catch (Exception unused) {
        }
    }
}
