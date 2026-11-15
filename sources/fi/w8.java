package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w8 extends st0 {
    public float g0;
    public float h0;
    public float i0;
    public final float[] j0;
    public final Path k0;
    public final RectF l0;
    public final RectF m0;
    public final RectF n0;
    public final RectF o0;
    public final RectF p0;
    public final SparseArray q0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 r0;
    public final /* synthetic */ i9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(i9 i9Var, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null);
        this.s0 = i9Var;
        this.r0 = e2Var;
        this.j0 = new float[8];
        this.k0 = new Path();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new RectF();
        this.q0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        int i7;
        x3 x3Var;
        float f12;
        float f13;
        int i10;
        float f14;
        RectF rectF;
        float f15;
        float[] fArr;
        float f16;
        float f17;
        RectF rectF2;
        float f18;
        RectF rectF3;
        float f19;
        float f20;
        RectF rectF4;
        float f21;
        float f22;
        h7 h7Var;
        float f23;
        Paint paint;
        View view;
        h7 h7Var2;
        d9 d9Var;
        c9 c9Var;
        b4 currentPeerView;
        e3 e3Var;
        h7 h7Var3;
        int i11;
        b4 z11;
        gh0 gh0Var;
        boolean z12;
        float f24;
        i9 i9Var = this.s0;
        RectF rectF5 = i9Var.U;
        f9 f9Var = i9Var.t0;
        float f25 = 1.0f;
        canvas.drawColor(i0.a.o(-16777216, (int) ((((1.0f - i9Var.W) * 0.5f) + 0.5f) * i9Var.V * 255.0f)));
        int i12 = 0;
        if (i9Var.b) {
            boolean z13 = (1.0f - i9Var.W) * i9Var.V == 1.0f;
            if (i9Var.K0 != z13) {
                i9Var.K0 = z13;
                org.telegram.ui.ActionBar.e2 e2Var = this.r0;
                if (e2Var.getLayoutContainer() != null) {
                    e2Var.getLayoutContainer().invalidate();
                }
            }
        }
        b4 currentPeerView2 = i9Var.o0.getCurrentPeerView();
        RectF rectF6 = this.p0;
        RectF rectF7 = this.o0;
        if (currentPeerView2 != null) {
            x3 x3Var2 = currentPeerView2.Y0;
            if (i9Var.V0) {
                x3Var2.a.getImageReceiver().O0(i9Var.V == 1.0f, true);
            } else {
                x3Var2.a.getImageReceiver().O0(true, false);
            }
            if (i9Var.h1) {
                i9Var.h1 = false;
                View view2 = x3Var2.a;
                v3 v3Var = x3Var2.a;
                f11 = 255.0f;
                z12 = true;
                float f26 = 0.0f;
                float f27 = 0.0f;
                while (view2 != this) {
                    int i13 = i12;
                    if (view2.getParent() == this) {
                        f26 += view2.getLeft();
                        f27 += view2.getTop();
                        f24 = f25;
                    } else {
                        f24 = f25;
                        if (view2.getParent() != i9Var.o0) {
                            f26 += view2.getX();
                            f27 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i12 = i13;
                    f25 = f24;
                }
                f10 = f25;
                i7 = i12;
                rectF7.set(f26, f27, v3Var.getMeasuredWidth() + f26, v3Var.getMeasuredHeight() + f27);
                rectF6.set(0.0f, currentPeerView2.M0.getTop() + currentPeerView2.getTop(), i9Var.w.getMeasuredWidth(), i9Var.w.getMeasuredHeight());
                i9Var.w.getMatrix().mapRect(rectF7);
                i9Var.w.getMatrix().mapRect(rectF6);
            } else {
                f10 = 1.0f;
                f11 = 255.0f;
                z12 = true;
                i7 = 0;
            }
            x3Var = x3Var2;
            z10 = z12;
        } else {
            f10 = 1.0f;
            f11 = 255.0f;
            z10 = 1;
            i7 = 0;
            x3Var = null;
        }
        i9Var.d1.setAlpha(f10 - i9Var.W);
        if (i9Var.Y == 0.0f) {
            float f28 = f10;
            f12 = f28 - Utilities.i(Math.abs(i9Var.X / getMeasuredHeight()), f28, 0.0f);
        } else {
            f12 = 1.0f;
        }
        i9Var.o0.setHorizontalProgressToDismiss((i9Var.Y / i9Var.w.getMeasuredWidth()) * i9Var.V);
        if (i9Var.O != 0.0f || i9Var.P != 0.0f) {
            float f29 = i9Var.V;
            if (f29 != 1.0f) {
                if (i9Var.H0 && i9Var.V0) {
                    float i14 = 1.0f - Utilities.i(((1.0f - f29) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f13 = 0.15f;
                    f14 = Utilities.i(com.google.android.gms.internal.vision.e2.t(1.0f, i14, 0.05f, f29), 1.0f, 0.0f);
                    i10 = 2;
                    i9Var.w.setAlpha(i14);
                } else {
                    f13 = 0.15f;
                    i10 = 2;
                    i9Var.w.setAlpha(1.0f);
                    f14 = f29;
                }
                if (!i9Var.H0 || f9Var == null || f9Var.c == null) {
                    rectF = rectF7;
                } else {
                    x8 x8Var = i9Var.w;
                    rectF = rectF7;
                    x8Var.setAlpha(x8Var.getAlpha() * ((float) Math.pow(f29, 0.20000000298023224d)));
                }
                x8 x8Var2 = i9Var.w;
                float left = (i9Var.O - x8Var2.getLeft()) - (i9Var.w.getMeasuredWidth() / 2.0f);
                float f30 = i9Var.V;
                x8Var2.setTranslationX((i9Var.Y * f30) + ((1.0f - f30) * left));
                x8 x8Var3 = i9Var.w;
                float top = (i9Var.P - x8Var3.getTop()) - (i9Var.w.getMeasuredHeight() / 2.0f);
                float f31 = i9Var.V;
                x8Var3.setTranslationY((i9Var.X * f31) + ((1.0f - f31) * top));
                float T1 = org.telegram.messenger.g0.T1(i9Var.S / i9Var.w.getMeasuredWidth(), (f12 * f13) + 0.85f, f14);
                i9Var.w.setScaleX(T1);
                i9Var.w.setScaleY(T1);
                Path path = this.k0;
                path.rewind();
                float f32 = i9Var.O;
                float f33 = i9Var.S / 2.0f;
                float f34 = i9Var.P;
                float f35 = i9Var.T / 2.0f;
                float f36 = f35 + f34;
                RectF rectF8 = this.l0;
                rectF8.set(f32 - f33, f34 - f35, f33 + f32, f36);
                boolean z14 = i9Var.H0;
                RectF rectF9 = this.m0;
                if (z14 && i9Var.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.M0.getTop() + i9Var.c0, getMeasuredWidth(), getMeasuredHeight() + i9Var.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (i9Var.H0 && i9Var.V0) {
                    rectF8.inset(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                }
                float T12 = org.telegram.messenger.g0.T1(rectF8.centerX(), rectF9.centerX(), i9Var.V);
                float T13 = org.telegram.messenger.g0.T1(rectF8.centerY(), rectF9.centerY(), i9Var.V);
                float T14 = org.telegram.messenger.g0.T1(rectF8.height(), rectF9.height(), f14);
                float T15 = org.telegram.messenger.g0.T1(rectF8.width(), rectF9.width(), f14);
                if (i9Var.H0 && i9Var.V0) {
                    f15 = T12;
                    rectF8.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
                } else {
                    f15 = T12;
                }
                RectF rectF10 = org.telegram.messenger.g0.P;
                float f37 = T15 / 2.0f;
                float f38 = T14 / 2.0f;
                rectF10.set(f15 - f37, T13 - f38, f15 + f37, T13 + f38);
                boolean z15 = i9Var.V0;
                float[] fArr2 = this.j0;
                if (z15) {
                    float T16 = org.telegram.messenger.g0.T1(i9Var.S / 2.0f, 0.0f, f14);
                    fArr = fArr2;
                    fArr[7] = T16;
                    fArr[6] = T16;
                    fArr[5] = T16;
                    fArr[4] = T16;
                    fArr[3] = T16;
                    fArr[i10] = T16;
                    fArr[z10] = T16;
                    fArr[i7] = T16;
                } else {
                    fArr = fArr2;
                    int[] iArr = i9Var.W0;
                    if (iArr == null) {
                        f16 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i10] = 0.0f;
                        fArr[z10] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas.save();
                        f17 = i9Var.Q;
                        if (f17 != f16 && i9Var.R != f16) {
                            canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - i9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), i9Var.R, 1.0f - i9Var.V));
                        }
                        if (f9Var == null && (h7Var3 = f9Var.m) != null && h7Var3.w && i9Var.V0) {
                            rectF2 = rectF5;
                            f18 = f16;
                            rectF3 = rectF8;
                            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f29 * f11), 31);
                        } else {
                            rectF2 = rectF5;
                            f18 = f16;
                            rectF3 = rectF8;
                            canvas.save();
                        }
                        canvas.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.n0;
                        if (f9Var != null || f9Var.c == null || (currentPeerView = i9Var.o0.getCurrentPeerView()) == null || (e3Var = currentPeerView.M0) == null) {
                            f19 = f18;
                            f20 = f29;
                            rectF4 = rectF3;
                        } else {
                            boolean z16 = f9Var.c.R0;
                            f19 = f18;
                            rectF9.set(e3Var.getX() + currentPeerView.getX() + i9Var.Y + i9Var.w.getLeft(), e3Var.getY() + currentPeerView.getY() + i9Var.X + i9Var.w.getTop(), ((i9Var.Y + i9Var.w.getRight()) - (i9Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - e3Var.getRight()), ((i9Var.X + i9Var.w.getBottom()) - (i9Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - e3Var.getBottom()));
                            org.telegram.messenger.g0.Z1(rectF3, rectF9, f29, rectF11);
                            ImageReceiver imageReceiver = f9Var.c;
                            float f39 = imageReceiver.L0;
                            float f40 = imageReceiver.M0;
                            float f41 = imageReceiver.N0;
                            float f42 = imageReceiver.O0;
                            imageReceiver.A0(rectF11);
                            float f43 = 1.0f - f29;
                            f9Var.c.setAlpha(f43);
                            f20 = f29;
                            rectF4 = rectF3;
                            f9Var.c.O0(z10, false);
                            int saveCount = canvas.getSaveCount();
                            c9 c9Var2 = f9Var.f;
                            if (c9Var2 != null) {
                                c9Var2.g(f43, canvas, rectF11, i9Var.F);
                            }
                            f9Var.c.h(canvas, null);
                            d9 d9Var2 = f9Var.e;
                            if (d9Var2 != null) {
                                d9Var2.o(canvas, rectF11, f43);
                            }
                            f9Var.c.O0(z16, false);
                            f9Var.c.y0(f39, f40, f41, f42);
                            canvas.restoreToCount(saveCount);
                        }
                        canvas.restore();
                        if (x3Var != null) {
                            v3 v3Var2 = x3Var.a;
                            float f44 = i9Var.Y;
                            float f45 = i9Var.X;
                            if (i9Var.H0 && i9Var.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = v3Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f44 += view3.getLeft();
                                        f45 += view3.getTop();
                                    } else if (view3.getParent() != i9Var.o0) {
                                        float x10 = view3.getX() + f44;
                                        f45 = view3.getY() + f45;
                                        f44 = x10;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f44, f45, v3Var2.getMeasuredWidth() + f44, v3Var2.getMeasuredHeight() + f45);
                            }
                            org.telegram.messenger.g0.Z1(rectF4, rectF9, i9Var.V, rectF11);
                            int saveCount2 = canvas.getSaveCount();
                            if (f9Var != null && (c9Var = f9Var.f) != null) {
                                c9Var.g(1.0f - f20, canvas, rectF11, i9Var.F);
                            }
                            if (i9Var.V0) {
                                boolean z17 = (f9Var == null || f9Var.l == null) ? false : true;
                                if (z17 && i9Var.V == f19) {
                                    f21 = f20;
                                } else {
                                    if (f9Var != null && (h7Var2 = f9Var.m) != null && h7Var2.w) {
                                        canvas.saveLayerAlpha(rectF11.left - org.telegram.messenger.g0.L(4.0f), rectF11.top - org.telegram.messenger.g0.L(4.0f), rectF11.right + org.telegram.messenger.g0.L(4.0f), rectF11.bottom + org.telegram.messenger.g0.L(4.0f), ns.e4, 31);
                                    }
                                    v3Var2.getImageReceiver().A0(rectF11);
                                    v3Var2.getImageReceiver().J0((int) org.telegram.messenger.g0.T1(rectF11.width() / 2.0f, ((f9Var == null || f9Var.b == null) ? null : Integer.valueOf((int) (f9Var.b.X0[0] * ((!f9Var.n || (view = f9Var.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) f9Var.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - i9Var.V));
                                    v3Var2.getImageReceiver().O0(true, false);
                                    float f46 = z17 ? i9Var.V : 1.0f;
                                    if (f9Var == null || f9Var.k >= 1.0f || (paint = f9Var.j) == null) {
                                        f21 = f20;
                                        f22 = f46;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f20) * f11));
                                        canvas.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, f9Var.j);
                                        f21 = f20;
                                        f22 = org.telegram.messenger.g0.T1(f9Var.k, f46, f21);
                                    }
                                    v3Var2.getImageReceiver().setAlpha(f22);
                                    x3Var.b(i9Var.V, canvas, rectF11, !i9.A1);
                                    v3Var2.getImageReceiver().h(canvas, null);
                                    v3Var2.getImageReceiver().setAlpha(f46);
                                    v3Var2.getImageReceiver().O0(false, false);
                                    if (f9Var != null && (h7Var = f9Var.m) != null && h7Var.w) {
                                        RectF rectF12 = org.telegram.messenger.g0.P;
                                        rectF12.set(rectF11);
                                        f23 = 1.0f;
                                        l7.k(1.0f - i9Var.V, f19, canvas, rectF12, true);
                                        canvas.restore();
                                        if (i9Var.V != f23 && z17) {
                                            ImageReceiver imageReceiver2 = f9Var.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.y(), f9Var.l.A());
                                            ImageReceiver imageReceiver3 = f9Var.l;
                                            int i15 = imageReceiver3.X0[0];
                                            boolean z18 = imageReceiver3.R0;
                                            imageReceiver3.A0(rectF11);
                                            f9Var.l.J0((int) (rectF11.width() / 2.0f));
                                            f9Var.l.O0(true, false);
                                            canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.V) * f11), 31);
                                            f9Var.l.h(canvas, null);
                                            canvas.restore();
                                            f9Var.l.O0(z18, false);
                                            f9Var.l.A0(rectF13);
                                            f9Var.l.J0(i15);
                                        }
                                        if (f9Var != null && (d9Var = f9Var.e) != null) {
                                            d9Var.o(canvas, rectF11, 1.0f - f21);
                                        }
                                    }
                                }
                                f23 = 1.0f;
                                if (i9Var.V != f23) {
                                    ImageReceiver imageReceiver22 = f9Var.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.y(), f9Var.l.A());
                                    ImageReceiver imageReceiver32 = f9Var.l;
                                    int i152 = imageReceiver32.X0[0];
                                    boolean z182 = imageReceiver32.R0;
                                    imageReceiver32.A0(rectF11);
                                    f9Var.l.J0((int) (rectF11.width() / 2.0f));
                                    f9Var.l.O0(true, false);
                                    canvas.saveLayerAlpha(rectF11, (int) ((1.0f - i9Var.V) * f11), 31);
                                    f9Var.l.h(canvas, null);
                                    canvas.restore();
                                    f9Var.l.O0(z182, false);
                                    f9Var.l.A0(rectF132);
                                    f9Var.l.J0(i152);
                                }
                                if (f9Var != null) {
                                    d9Var.o(canvas, rectF11, 1.0f - f21);
                                }
                            }
                            canvas.restoreToCount(saveCount2);
                        }
                        if (i9Var.N != null) {
                            float i16 = Utilities.i(i9Var.V / 0.4f, 1.0f, 0.0f);
                            if (i16 != 1.0f) {
                                RectF rectF14 = org.telegram.messenger.g0.P;
                                float f47 = i9Var.O;
                                float f48 = i9Var.P;
                                rectF14.set(f47, f48, i9Var.S + f47, i9Var.T + f48);
                                rectF14.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(16.0f));
                                if (i16 != 0.0f) {
                                    canvas.saveLayerAlpha(rectF14, (int) ((1.0f - i16) * f11), 31);
                                } else {
                                    canvas.save();
                                }
                                canvas.translate(i9Var.L, i9Var.M);
                                ((org.telegram.ui.Cells.t2) i9Var.N).J(canvas);
                                canvas.restore();
                            }
                        }
                        canvas.restore();
                        if (i9.A1) {
                            ArrayList arrayList = i9Var.y0;
                            i9Var.W();
                            i9Var.V = 0.0f;
                            i9Var.S(true);
                            i9Var.d = false;
                            i9.x1 = true;
                            i9Var.c0 = i9Var.X;
                            if (f9Var.d != null && (z11 = i9Var.z()) != null && (gh0Var = z11.Y0.d) != null) {
                                gh0 gh0Var2 = f9Var.d;
                                gh0Var.c = gh0Var2.c;
                                gh0Var.f = gh0Var2.f;
                                gh0Var.b = gh0Var2.b;
                                gh0Var.a = System.currentTimeMillis();
                                gh0Var.c();
                            }
                            i9Var.F = true;
                            float[] fArr3 = new float[i10];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            i9Var.G = ofFloat;
                            ofFloat.addUpdateListener(new q8(i9Var, 1));
                            i9Var.J0.d();
                            x8 x8Var4 = i9Var.w;
                            if (x8Var4 != null) {
                                v.c = true;
                                i11 = 2;
                                x8Var4.setLayerType(2, null);
                            } else {
                                i11 = 2;
                            }
                            i9Var.G.addListener(new r8(i9Var, i11));
                            i9Var.G.setStartDelay(40L);
                            i9Var.G.setDuration(250L);
                            i9Var.G.setInterpolator(er.f);
                            i9Var.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                    ((Runnable) arrayList.get(i17)).run();
                                }
                                arrayList.clear();
                            }
                            i9.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i18 = i7;
                    float W1 = org.telegram.messenger.g0.W1(f29, iArr[i7], i18);
                    fArr[z10] = W1;
                    fArr[i18] = W1;
                    float W12 = org.telegram.messenger.g0.W1(f29, i9Var.W0[z10], i18);
                    fArr[3] = W12;
                    fArr[i10] = W12;
                    float W13 = org.telegram.messenger.g0.W1(f29, i9Var.W0[i10], i18);
                    fArr[5] = W13;
                    fArr[4] = W13;
                    float W14 = org.telegram.messenger.g0.W1(f29, i9Var.W0[3], i18);
                    fArr[7] = W14;
                    fArr[6] = W14;
                }
                f16 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas.save();
                f17 = i9Var.Q;
                if (f17 != f16) {
                    canvas.clipRect(f16, org.telegram.messenger.g0.T1(f16, f17, (float) Math.pow(1.0f - i9Var.V, 0.4000000059604645d)), getMeasuredWidth(), org.telegram.messenger.g0.T1(getMeasuredHeight(), i9Var.R, 1.0f - i9Var.V));
                }
                if (f9Var == null) {
                }
                rectF2 = rectF5;
                f18 = f16;
                rectF3 = rectF8;
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.n0;
                if (f9Var != null) {
                }
                f19 = f18;
                f20 = f29;
                rectF4 = rectF3;
                canvas.restore();
                if (x3Var != null) {
                }
                if (i9Var.N != null) {
                }
                canvas.restore();
                if (i9.A1) {
                }
            }
        }
        i9Var.w.setAlpha(i9Var.V);
        float f49 = (f12 * 0.15f) + (i9Var.V * 0.1f) + 0.75f;
        i9Var.w.setScaleX(f49);
        i9Var.w.setScaleY(f49);
        i9Var.w.setTranslationY(i9Var.X);
        i9Var.w.setTranslationX(i9Var.Y);
        super.dispatchDraw(canvas);
        i10 = 2;
        if (i9.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        i9 i9Var = this.s0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            i9Var.w(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i9Var.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        y8 y8Var;
        int i7;
        mi0 mi0Var;
        i9 i9Var = this.s0;
        float[] fArr = i9Var.p0;
        b4 currentPeerView = i9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            i3 i3Var = currentPeerView.u0;
            if (i3Var.a0.x()) {
                float x10 = currentPeerView.getX();
                float y10 = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x10, -y10);
                if (!i3Var.a0.n(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x10, y10);
                }
                return true;
            }
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (i9Var.p1 && currentPeerView != null && (mi0Var = currentPeerView.b3) != null) {
            float f11 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f10 += view.getX();
                f11 += view.getY();
            }
            if (currentPeerView.b3.getReactionsWindow() != null && currentPeerView.b3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f10, (-f11) - currentPeerView.b3.getReactionsWindow().c.getTranslationY());
                currentPeerView.b3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = org.telegram.messenger.g0.Q;
            mi0Var.getHitRect(rect);
            rect.offset((int) f10, (int) f11);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.Z0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            mi0Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i9Var.k0 = false;
            org.telegram.messenger.g0.r(i9Var.b1);
            float f12 = i9Var.Y;
            if (f12 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
                i9Var.H = ofFloat;
                ofFloat.addUpdateListener(new t8(this, i10));
                i9Var.H.addListener(new u8(this, i10));
                i9Var.H.setDuration(250L);
                i9Var.H.setInterpolator(er.f);
                i9Var.H.start();
            }
            if (i9Var.W >= 0.3f) {
                i9Var.u(true);
            }
            i9Var.Q(false);
            i9Var.R(false);
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            i9Var.b0 = false;
            if (currentPeerView != null) {
                bi.v1 v1Var = currentPeerView.i0;
                n8 n8Var = currentPeerView.m0;
                e3 e3Var = currentPeerView.M0;
                hi.l3 l3Var = currentPeerView.p0;
                if (l3Var != null && l3Var.W && n8Var != null && !l3Var.D0.contains(motionEvent.getX() - (currentPeerView.p0.getX() + (e3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.p0.getY() + (e3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(n8Var, motionEvent)) {
                    currentPeerView.p0.f(true);
                }
                hi.l3 l3Var2 = currentPeerView.q0;
                if (l3Var2 != null && l3Var2.W && v1Var != null && !l3Var2.D0.contains(motionEvent.getX() - (currentPeerView.q0.getX() + (e3Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.q0.getY() + (e3Var.getY() + currentPeerView.getY()))) && !currentPeerView.F0(v1Var, motionEvent)) {
                    currentPeerView.q0.f(true);
                }
            }
            i9Var.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z12 = (i9Var.y || i9Var.H0 || i9Var.I0) ? false : true;
        float f13 = i9Var.f0;
        SparseArray sparseArray = this.q0;
        if (f13 == 0.0f && !i9Var.k0 && i9Var.o0.G0 == 1 && motionEvent.getAction() == 2 && z12) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i7 = (y8Var = i9Var.o0).J0) == 0 && y8Var.L0 == 0.0f && floatValue < 0.0f) || (i7 == y8Var.getAdapter().b() - 1 && y8Var.L0 == 0.0f && floatValue > 0.0f))) || i9Var.Y != 0.0f) {
                float f14 = i9Var.Y;
                if (f14 == 0.0f) {
                    i9Var.Z = -floatValue;
                }
                if ((floatValue < 0.0f && i9Var.Z > 0.0f) || (floatValue > 0.0f && i9Var.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                i9Var.Y = f14 - floatValue;
                i9.i(i9Var);
                float f15 = i9Var.Y;
                if ((f15 > 0.0f && i9Var.Z < 0.0f) || (f15 < 0.0f && i9Var.Z > 0.0f)) {
                    i9Var.Y = 0.0f;
                }
                z11 = true;
                if (currentPeerView != null && i9Var.f0 == 0.0f && !i9Var.k0 && !i9Var.L0 && !i9Var.I0 && i9Var.o0.G0 != 1) {
                    org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    b4 currentPeerView2 = i9Var.o0.getCurrentPeerView();
                    currentPeerView2.H2.a(motionEvent, currentPeerView2.M0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                        sparseArray.put(motionEvent.getPointerId(i11), Float.valueOf(motionEvent.getX(i11)));
                    }
                }
                if (!z11) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (i9Var.f0 != 0.0f && !i9Var.g1 && i9Var.q0 < org.telegram.messenger.g0.L(20.0f)) {
                            i9Var.o(i9Var.x.f > 0.5f);
                        }
                        b4 z13 = i9Var.z();
                        if (z13 != null) {
                            z13.u0.x0 = false;
                        }
                    }
                    if (z10 && !i9Var.b0) {
                        i9Var.m();
                    }
                    if (!dispatchTouchEvent && (!i9.x1 || !i9Var.r0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z11 = false;
        if (currentPeerView != null) {
            org.telegram.messenger.g0.r1(currentPeerView.M0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            b4 currentPeerView22 = i9Var.o0.getCurrentPeerView();
            currentPeerView22.H2.a(motionEvent, currentPeerView22.M0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z11) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.s0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i9 i9Var = this.s0;
        if (i9Var.b && !i9Var.c) {
            org.telegram.ui.ActionBar.e2 e2Var = this.r0;
            org.telegram.messenger.g0.a3(e2Var.getParentActivity(), e2Var.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new v8(this));
        ns.f(i9Var.h).c(i9Var, ns.x5);
        ns.f(i9Var.h).c(i9Var, ns.v5);
        ns.f(i9Var.h).c(i9Var, ns.d1);
        ns.f(i9Var.h).c(i9Var, ns.c1);
        ns.f(i9Var.h).c(i9Var, ns.w5);
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        i9 i9Var = this.s0;
        ns.f(i9Var.h).n(i9Var, ns.x5);
        ns.f(i9Var.h).n(i9Var, ns.v5);
        ns.f(i9Var.h).n(i9Var, ns.d1);
        ns.f(i9Var.h).n(i9Var, ns.c1);
        ns.f(i9Var.h).n(i9Var, ns.w5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e3  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        c2 c2Var;
        h9 h9Var;
        b4 currentPeerView;
        boolean z10;
        c1 c1Var;
        a4 a4Var;
        b4 currentPeerView2;
        z3 z3Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        c2 c2Var2;
        i9 i9Var = this.s0;
        g3 g3Var = i9Var.b1;
        if (motionEvent.getAction() == 0 && i9Var.V == 1.0f) {
            float x10 = motionEvent.getX();
            this.i0 = x10;
            this.g0 = x10;
            this.h0 = motionEvent.getY();
            i9Var.h0 = false;
            i9Var.g0 = (i9Var.I0 || i9.c(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            i9Var.i0 = (i9Var.I0 || i9.c(i9Var, i9Var.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            i9Var.Q(i9Var.g0 && !i9Var.m1);
            b4 z11 = i9Var.z();
            if (i9Var.g0 && z11 != null && (c2Var2 = z11.v0) != null) {
                c2Var2.setAllowTouches(false);
            }
            if (i9Var.g0 && !i9Var.I0 && i9Var.m1) {
                c1 c1Var2 = new c1(this, 19);
                i9Var.n1 = c1Var2;
                org.telegram.messenger.g0.i3(c1Var2, 150L);
            }
            if (i9Var.g0 && !i9Var.y && !i9Var.I0 && !i9Var.j1) {
                org.telegram.messenger.g0.i3(g3Var, 400L);
            }
            f10 = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.h0 - motionEvent.getY());
            float abs2 = Math.abs(this.g0 - motionEvent.getX());
            if (i9Var.a1 && i9Var.l0 && !i9Var.f1 && !i9Var.k0 && (a4Var = i9Var.G0) != null && ((h9) a4Var.c) != null && (currentPeerView2 = i9Var.o0.getCurrentPeerView()) != null && (z3Var = currentPeerView2.y1) != null && z3Var.b == null && z3Var.e) {
                long j3 = currentPeerView2.B2;
                if (j3 <= 0 && (storyItem = z3Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j3 = (long) (gj.H0(document) * 1000.0d);
                }
                if (j3 > 0) {
                    float x11 = motionEvent.getX();
                    h9 h9Var2 = (h9) i9Var.G0.c;
                    f10 = 1.0f;
                    if (((int) (h9Var2.seek((x11 - this.i0) / org.telegram.messenger.g0.L(220.0f), j3) * 10.0f)) != ((int) (h9Var2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.M0.invalidate();
                    this.i0 = x11;
                    if (abs > abs2 && !i9Var.l0 && !i9Var.h0 && abs > org.telegram.messenger.g0.e * 2.0f) {
                        i9Var.h0 = true;
                    }
                    if (!i9Var.k0 && !i9Var.l0 && !i9Var.y && i9Var.i0) {
                        if (abs > abs2 && abs > org.telegram.messenger.g0.e * 2.0f) {
                            i9Var.k0 = true;
                            currentPeerView = i9Var.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.n0();
                            }
                            boolean z12 = currentPeerView == null && !currentPeerView.y1.f && (currentPeerView.m1 || (currentPeerView.n1 && currentPeerView.l3));
                            i9Var.m0 = (!z12 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || i9Var.u1 != null) ? false : true;
                            z10 = (z12 || currentPeerView.M2 || currentPeerView.y1.a == null || i9Var.u1 != null) ? false : true;
                            i9Var.d0 = z10;
                            if (z10 && this.f != 0) {
                                i9Var.d0 = false;
                            }
                            if (i9Var.d0) {
                                i9Var.r();
                            }
                            i9Var.a0 = 0.0f;
                            c1Var = i9Var.n1;
                            if (c1Var != null) {
                                org.telegram.messenger.g0.r(c1Var);
                                i9Var.n1.run();
                                i9Var.n1 = null;
                            }
                            org.telegram.messenger.g0.r(g3Var);
                        }
                        i9Var.E();
                    }
                }
            }
            f10 = 1.0f;
            if (abs > abs2) {
                i9Var.h0 = true;
            }
            if (!i9Var.k0) {
                if (abs > abs2) {
                    i9Var.k0 = true;
                    currentPeerView = i9Var.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    if (currentPeerView == null) {
                    }
                    i9Var.m0 = (!z12 || currentPeerView == null || currentPeerView.n1 || currentPeerView.p1 || i9Var.u1 != null) ? false : true;
                    if (z12) {
                    }
                    i9Var.d0 = z10;
                    if (z10) {
                        i9Var.d0 = false;
                    }
                    if (i9Var.d0) {
                    }
                    i9Var.a0 = 0.0f;
                    c1Var = i9Var.n1;
                    if (c1Var != null) {
                    }
                    org.telegram.messenger.g0.r(g3Var);
                }
                i9Var.E();
            }
        } else {
            f10 = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                org.telegram.messenger.g0.r(g3Var);
                c1 c1Var3 = i9Var.n1;
                if (c1Var3 != null) {
                    org.telegram.messenger.g0.r(c1Var3);
                    i9Var.n1 = null;
                }
                i9Var.Q(false);
                i9Var.h0 = false;
                i9Var.l0 = false;
                a4 a4Var2 = i9Var.G0;
                if (a4Var2 != null && (h9Var = (h9) a4Var2.c) != null) {
                    h9Var.setSeeking(false);
                }
                b4 z13 = i9Var.z();
                if (z13 != null && (c2Var = z13.v0) != null) {
                    c2Var.setAllowTouches(true);
                }
            }
        }
        k5 k5Var = i9Var.x;
        boolean z14 = k5Var != null && k5Var.f == f10;
        if (!i9Var.k0 && !z14) {
            i9Var.j0.onTouchEvent(motionEvent);
        }
        return i9Var.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        i9 i9Var = this.s0;
        ((FrameLayout.LayoutParams) i9Var.d1.getLayoutParams()).topMargin = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(2.0f);
        i9Var.d1.getLayoutParams().height = org.telegram.messenger.g0.L(2.0f);
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c2 c2Var;
        int action = motionEvent.getAction();
        i9 i9Var = this.s0;
        int i7 = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            i9Var.k0 = false;
            i9Var.Q(false);
            if (i9Var.W >= 1.0f) {
                i9Var.u(true);
            } else if (!i9Var.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i9Var.X, 0.0f);
                i9Var.H = ofFloat;
                ofFloat.addUpdateListener(new t8(this, i7));
                i9Var.H.addListener(new u8(this, i7));
                i9Var.H.setDuration(150L);
                i9Var.H.setInterpolator(er.f);
                i9Var.H.start();
            }
            b4 z10 = i9Var.z();
            if (z10 != null && (c2Var = z10.v0) != null) {
                c2Var.setAllowTouches(true);
            }
        }
        if (!i9Var.k0 && !i9Var.y && i9Var.a0 == 0.0f && ((i9Var.f0 == 0.0f || (!i9Var.g0 && !i9Var.h0)) && !i9Var.j1)) {
            return false;
        }
        i9Var.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.s0.g0 = false;
    }
}
