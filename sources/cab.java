// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class cab extends ela {
    public float m0;
    public float n0;
    public float o0;
    public final float[] p0;
    public final Path q0;
    public final RectF r0;
    public final RectF s0;
    public final RectF t0;
    public final RectF u0;
    public final RectF v0;
    public final SparseArray w0;
    public final /* synthetic */ d x0;
    public final /* synthetic */ oab y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cab(oab oabVar, Context context, d dVar) {
        super(context, null);
        this.y0 = oabVar;
        this.x0 = dVar;
        this.p0 = new float[8];
        this.q0 = new Path();
        this.r0 = new RectF();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new RectF();
        this.w0 = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    @Override // ela, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        int i;
        x48 x48Var;
        float f3;
        float f4;
        int i2;
        float f5;
        RectF rectF;
        float f6;
        float[] fArr;
        float f7;
        float f8;
        RectF rectF2;
        float f9;
        RectF rectF3;
        float f10;
        float f11;
        RectF rectF4;
        float f12;
        float f13;
        v4b v4bVar;
        float f14;
        Paint paint;
        View view;
        v4b v4bVar2;
        jab jabVar;
        iab iabVar;
        a58 currentPeerView;
        g48 g48Var;
        v4b v4bVar3;
        byte b;
        a58 w;
        u09 u09Var;
        boolean z2;
        float f15;
        Canvas canvas2 = canvas;
        oab oabVar = this.y0;
        RectF rectF5 = oabVar.U;
        lab labVar = oabVar.t0;
        float f16 = 1.0f;
        canvas2.drawColor(on2.p(-16777216, (int) ((((1.0f - oabVar.W) * 0.5f) + 0.5f) * oabVar.V * 255.0f)));
        int i3 = 0;
        if (oabVar.b) {
            boolean z3 = (1.0f - oabVar.W) * oabVar.V == 1.0f;
            if (oabVar.K0 != z3) {
                oabVar.K0 = z3;
                d dVar = this.x0;
                if (dVar.getLayoutContainer() != null) {
                    dVar.getLayoutContainer().invalidate();
                }
            }
        }
        a58 currentPeerView2 = oabVar.o0.getCurrentPeerView();
        RectF rectF6 = this.v0;
        RectF rectF7 = this.u0;
        if (currentPeerView2 != null) {
            x48 x48Var2 = currentPeerView2.e1;
            if (oabVar.V0) {
                x48Var2.a.getImageReceiver().v0(oabVar.V == 1.0f, true);
            } else {
                x48Var2.a.getImageReceiver().v0(true, false);
            }
            if (oabVar.h1) {
                oabVar.h1 = false;
                View view2 = x48Var2.a;
                kc0 kc0Var = x48Var2.a;
                f2 = 255.0f;
                z2 = true;
                float f17 = 0.0f;
                float f18 = 0.0f;
                while (view2 != this) {
                    int i4 = i3;
                    if (view2.getParent() == this) {
                        f17 += view2.getLeft();
                        f18 += view2.getTop();
                        f15 = f16;
                    } else {
                        f15 = f16;
                        if (view2.getParent() != oabVar.o0) {
                            f17 += view2.getX();
                            f18 += view2.getY();
                        }
                    }
                    view2 = (View) view2.getParent();
                    i3 = i4;
                    f16 = f15;
                }
                f = f16;
                i = i3;
                rectF7.set(f17, f18, kc0Var.getMeasuredWidth() + f17, kc0Var.getMeasuredHeight() + f18);
                rectF6.set(0.0f, currentPeerView2.S0.getTop() + currentPeerView2.getTop(), oabVar.w.getMeasuredWidth(), oabVar.w.getMeasuredHeight());
                oabVar.w.getMatrix().mapRect(rectF7);
                oabVar.w.getMatrix().mapRect(rectF6);
            } else {
                f = 1.0f;
                f2 = 255.0f;
                z2 = true;
                i = 0;
            }
            x48Var = x48Var2;
            z = z2;
        } else {
            f = 1.0f;
            f2 = 255.0f;
            z = 1;
            i = 0;
            x48Var = null;
        }
        oabVar.d1.setAlpha(f - oabVar.W);
        if (oabVar.Y == 0.0f) {
            float f19 = f;
            f3 = f19 - Utilities.i(Math.abs(oabVar.X / getMeasuredHeight()), f19, 0.0f);
        } else {
            f3 = 1.0f;
        }
        oabVar.o0.setHorizontalProgressToDismiss((oabVar.Y / oabVar.w.getMeasuredWidth()) * oabVar.V);
        if (oabVar.O != 0.0f || oabVar.P != 0.0f) {
            float f20 = oabVar.V;
            if (f20 != 1.0f) {
                if (oabVar.H0 && oabVar.V0) {
                    float i5 = 1.0f - Utilities.i(((1.0f - f20) - 0.8f) / 0.100000024f, 1.0f, 0.0f);
                    f4 = 0.15f;
                    f5 = Utilities.i(kt6.B(1.0f, i5, 0.05f, f20), 1.0f, 0.0f);
                    i2 = 2;
                    oabVar.w.setAlpha(i5);
                } else {
                    f4 = 0.15f;
                    i2 = 2;
                    oabVar.w.setAlpha(1.0f);
                    f5 = f20;
                }
                if (!oabVar.H0 || labVar == null || labVar.c == null) {
                    rectF = rectF7;
                } else {
                    dab dabVar = oabVar.w;
                    rectF = rectF7;
                    dabVar.setAlpha(dabVar.getAlpha() * ((float) Math.pow(f20, 0.20000000298023224d)));
                }
                dab dabVar2 = oabVar.w;
                float left = (oabVar.O - dabVar2.getLeft()) - (oabVar.w.getMeasuredWidth() / 2.0f);
                float f21 = oabVar.V;
                dabVar2.setTranslationX((oabVar.Y * f21) + ((1.0f - f21) * left));
                dab dabVar3 = oabVar.w;
                float top = (oabVar.P - dabVar3.getTop()) - (oabVar.w.getMeasuredHeight() / 2.0f);
                float f22 = oabVar.V;
                dabVar3.setTranslationY((oabVar.X * f22) + ((1.0f - f22) * top));
                float R1 = gm.R1(oabVar.S / oabVar.w.getMeasuredWidth(), (f3 * f4) + 0.85f, f5);
                oabVar.w.setScaleX(R1);
                oabVar.w.setScaleY(R1);
                Path path = this.q0;
                path.rewind();
                float f23 = oabVar.O;
                float f24 = oabVar.S / 2.0f;
                float f25 = oabVar.P;
                float f26 = oabVar.T / 2.0f;
                float f27 = f26 + f25;
                RectF rectF8 = this.r0;
                rectF8.set(f23 - f24, f25 - f26, f24 + f23, f27);
                boolean z4 = oabVar.H0;
                RectF rectF9 = this.s0;
                if (z4 && oabVar.V0) {
                    rectF9.set(rectF6);
                } else if (currentPeerView2 != null) {
                    rectF9.set(0.0f, currentPeerView2.S0.getTop() + oabVar.c0, getMeasuredWidth(), getMeasuredHeight() + oabVar.c0);
                } else {
                    rectF9.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                if (oabVar.H0 && oabVar.V0) {
                    rectF8.inset(gm.L(12.0f), gm.L(12.0f));
                }
                float R12 = gm.R1(rectF8.centerX(), rectF9.centerX(), oabVar.V);
                float R13 = gm.R1(rectF8.centerY(), rectF9.centerY(), oabVar.V);
                float R14 = gm.R1(rectF8.height(), rectF9.height(), f5);
                float R15 = gm.R1(rectF8.width(), rectF9.width(), f5);
                if (oabVar.H0 && oabVar.V0) {
                    f6 = R12;
                    rectF8.inset(-gm.L(12.0f), -gm.L(12.0f));
                } else {
                    f6 = R12;
                }
                RectF rectF10 = gm.P;
                float f28 = R15 / 2.0f;
                float f29 = R14 / 2.0f;
                rectF10.set(f6 - f28, R13 - f29, f6 + f28, R13 + f29);
                boolean z5 = oabVar.V0;
                float[] fArr2 = this.p0;
                if (z5) {
                    float R16 = gm.R1(oabVar.S / 2.0f, 0.0f, f5);
                    fArr = fArr2;
                    fArr[7] = R16;
                    fArr[6] = R16;
                    fArr[5] = R16;
                    fArr[4] = R16;
                    fArr[3] = R16;
                    fArr[i2] = R16;
                    fArr[z] = R16;
                    fArr[i] = R16;
                } else {
                    fArr = fArr2;
                    int[] iArr = oabVar.W0;
                    if (iArr == null) {
                        f7 = 0.0f;
                        fArr[7] = 0.0f;
                        fArr[6] = 0.0f;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[i2] = 0.0f;
                        fArr[z] = 0.0f;
                        fArr[0] = 0.0f;
                        path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                        canvas2.save();
                        f8 = oabVar.Q;
                        if (f8 != f7 && oabVar.R != f7) {
                            canvas2.clipRect(f7, gm.R1(f7, f8, (float) Math.pow(1.0f - oabVar.V, 0.4000000059604645d)), getMeasuredWidth(), gm.R1(getMeasuredHeight(), oabVar.R, 1.0f - oabVar.V));
                        }
                        if (labVar == null && (v4bVar3 = labVar.m) != null && v4bVar3.w && oabVar.V0) {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f20 * f2), 31);
                        } else {
                            rectF2 = rectF5;
                            f9 = f7;
                            rectF3 = rectF8;
                            canvas2.save();
                        }
                        canvas2.clipPath(path);
                        super.dispatchDraw(canvas);
                        RectF rectF11 = this.t0;
                        if (labVar != null || labVar.c == null || (currentPeerView = oabVar.o0.getCurrentPeerView()) == null || (g48Var = currentPeerView.S0) == null) {
                            f10 = f9;
                            f11 = f20;
                            rectF4 = rectF3;
                        } else {
                            boolean z6 = labVar.c.R0;
                            f10 = f9;
                            rectF9.set(g48Var.getX() + currentPeerView.getX() + oabVar.Y + oabVar.w.getLeft(), g48Var.getY() + currentPeerView.getY() + oabVar.X + oabVar.w.getTop(), ((oabVar.Y + oabVar.w.getRight()) - (oabVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g48Var.getRight()), ((oabVar.X + oabVar.w.getBottom()) - (oabVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g48Var.getBottom()));
                            gm.X1(rectF3, rectF9, f20, rectF11);
                            ImageReceiver imageReceiver = labVar.c;
                            float f30 = imageReceiver.L0;
                            float f31 = imageReceiver.M0;
                            float f32 = imageReceiver.N0;
                            float f33 = imageReceiver.O0;
                            imageReceiver.k0(rectF11);
                            float f34 = 1.0f - f20;
                            labVar.c.setAlpha(f34);
                            f11 = f20;
                            rectF4 = rectF3;
                            labVar.c.v0(z, false);
                            int saveCount = canvas2.getSaveCount();
                            iab iabVar2 = labVar.f;
                            if (iabVar2 != null) {
                                iabVar2.j(f34, canvas2, rectF11, oabVar.F);
                            }
                            labVar.c.h(canvas2, null);
                            jab jabVar2 = labVar.e;
                            if (jabVar2 != null) {
                                jabVar2.l(canvas2, rectF11, f34);
                            }
                            labVar.c.v0(z6, false);
                            labVar.c.i0(f30, f31, f32, f33);
                            canvas2.restoreToCount(saveCount);
                        }
                        canvas2.restore();
                        if (x48Var != null) {
                            kc0 kc0Var2 = x48Var.a;
                            float f35 = oabVar.Y;
                            float f36 = oabVar.X;
                            if (oabVar.H0 && oabVar.V0) {
                                rectF9.set(rectF);
                            } else {
                                for (View view3 = kc0Var2; view3 != this && view3 != null; view3 = (View) view3.getParent()) {
                                    if (view3.getParent() == this) {
                                        f35 += view3.getLeft();
                                        f36 += view3.getTop();
                                    } else if (view3.getParent() != oabVar.o0) {
                                        float x = view3.getX() + f35;
                                        f36 = view3.getY() + f36;
                                        f35 = x;
                                    }
                                    if (!(view3.getParent() instanceof View)) {
                                        break;
                                    }
                                }
                                rectF9.set(f35, f36, kc0Var2.getMeasuredWidth() + f35, kc0Var2.getMeasuredHeight() + f36);
                            }
                            gm.X1(rectF4, rectF9, oabVar.V, rectF11);
                            int saveCount2 = canvas2.getSaveCount();
                            if (labVar != null && (iabVar = labVar.f) != null) {
                                iabVar.j(1.0f - f11, canvas2, rectF11, oabVar.F);
                            }
                            if (oabVar.V0) {
                                boolean z7 = (labVar == null || labVar.l == null) ? false : true;
                                if (z7 && oabVar.V == f10) {
                                    f12 = f11;
                                } else {
                                    if (labVar != null && (v4bVar2 = labVar.m) != null && v4bVar2.w) {
                                        canvas2.saveLayerAlpha(rectF11.left - gm.L(4.0f), rectF11.top - gm.L(4.0f), rectF11.right + gm.L(4.0f), rectF11.bottom + gm.L(4.0f), nm7.d4, 31);
                                        canvas2 = canvas2;
                                    }
                                    kc0Var2.getImageReceiver().k0(rectF11);
                                    kc0Var2.getImageReceiver().q0((int) gm.R1(rectF11.width() / 2.0f, ((labVar == null || labVar.b == null) ? null : Integer.valueOf((int) (labVar.b.X0[0] * ((!labVar.n || (view = labVar.a) == null || view.getParent() == null) ? 1.0f : ((ViewGroup) labVar.a.getParent()).getScaleY())))) != null ? r4.intValue() : rectF11.width() / 2.0f, 1.0f - oabVar.V));
                                    kc0Var2.getImageReceiver().v0(true, false);
                                    float f37 = z7 ? oabVar.V : 1.0f;
                                    if (labVar == null || labVar.k >= 1.0f || (paint = labVar.j) == null) {
                                        f12 = f11;
                                        f13 = f37;
                                    } else {
                                        paint.setAlpha((int) ((1.0f - f11) * f2));
                                        canvas2.drawCircle(rectF11.centerX(), rectF11.centerY(), rectF11.width() / 2.0f, labVar.j);
                                        f12 = f11;
                                        f13 = gm.R1(labVar.k, f37, f12);
                                    }
                                    kc0Var2.getImageReceiver().setAlpha(f13);
                                    x48Var.a(oabVar.V, canvas2, rectF11, !oab.A1);
                                    kc0Var2.getImageReceiver().h(canvas2, null);
                                    kc0Var2.getImageReceiver().setAlpha(f37);
                                    kc0Var2.getImageReceiver().v0(false, false);
                                    if (labVar != null && (v4bVar = labVar.m) != null && v4bVar.w) {
                                        RectF rectF12 = gm.P;
                                        rectF12.set(rectF11);
                                        f14 = 1.0f;
                                        y4b.k(1.0f - oabVar.V, f10, canvas2, rectF12, true);
                                        canvas2.restore();
                                        if (oabVar.V != f14 && z7) {
                                            ImageReceiver imageReceiver2 = labVar.l;
                                            RectF rectF13 = rectF2;
                                            rectF13.set(imageReceiver2.L0, imageReceiver2.M0, imageReceiver2.w(), labVar.l.x());
                                            ImageReceiver imageReceiver3 = labVar.l;
                                            int i6 = imageReceiver3.X0[0];
                                            boolean z8 = imageReceiver3.R0;
                                            imageReceiver3.k0(rectF11);
                                            labVar.l.q0((int) (rectF11.width() / 2.0f));
                                            labVar.l.v0(true, false);
                                            canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - oabVar.V) * f2), 31);
                                            labVar.l.h(canvas2, null);
                                            canvas2.restore();
                                            labVar.l.v0(z8, false);
                                            labVar.l.k0(rectF13);
                                            labVar.l.q0(i6);
                                        }
                                        if (labVar != null && (jabVar = labVar.e) != null) {
                                            jabVar.l(canvas2, rectF11, 1.0f - f12);
                                        }
                                    }
                                }
                                f14 = 1.0f;
                                if (oabVar.V != f14) {
                                    ImageReceiver imageReceiver22 = labVar.l;
                                    RectF rectF132 = rectF2;
                                    rectF132.set(imageReceiver22.L0, imageReceiver22.M0, imageReceiver22.w(), labVar.l.x());
                                    ImageReceiver imageReceiver32 = labVar.l;
                                    int i62 = imageReceiver32.X0[0];
                                    boolean z82 = imageReceiver32.R0;
                                    imageReceiver32.k0(rectF11);
                                    labVar.l.q0((int) (rectF11.width() / 2.0f));
                                    labVar.l.v0(true, false);
                                    canvas2.saveLayerAlpha(rectF11, (int) ((1.0f - oabVar.V) * f2), 31);
                                    labVar.l.h(canvas2, null);
                                    canvas2.restore();
                                    labVar.l.v0(z82, false);
                                    labVar.l.k0(rectF132);
                                    labVar.l.q0(i62);
                                }
                                if (labVar != null) {
                                    jabVar.l(canvas2, rectF11, 1.0f - f12);
                                }
                            }
                            canvas2.restoreToCount(saveCount2);
                        }
                        if (oabVar.N != null) {
                            float i7 = Utilities.i(oabVar.V / 0.4f, 1.0f, 0.0f);
                            if (i7 != 1.0f) {
                                RectF rectF14 = gm.P;
                                float f38 = oabVar.O;
                                float f39 = oabVar.P;
                                rectF14.set(f38, f39, oabVar.S + f38, oabVar.T + f39);
                                rectF14.inset(-gm.L(16.0f), -gm.L(16.0f));
                                if (i7 != 0.0f) {
                                    canvas2.saveLayerAlpha(rectF14, (int) ((1.0f - i7) * f2), 31);
                                } else {
                                    canvas2.save();
                                }
                                canvas2.translate(oabVar.L, oabVar.M);
                                ((hg3) oabVar.N).G(canvas2);
                                canvas2.restore();
                            }
                        }
                        canvas2.restore();
                        if (oab.A1) {
                            ArrayList arrayList = oabVar.y0;
                            oabVar.W();
                            oabVar.V = 0.0f;
                            oabVar.Q(true);
                            oabVar.d = false;
                            oab.x1 = true;
                            oabVar.c0 = oabVar.X;
                            if (labVar.d != null && (w = oabVar.w()) != null && (u09Var = w.e1.d) != null) {
                                u09 u09Var2 = labVar.d;
                                u09Var.c = u09Var2.c;
                                u09Var.f = u09Var2.f;
                                u09Var.b = u09Var2.b;
                                u09Var.a = System.currentTimeMillis();
                                u09Var.c();
                            }
                            oabVar.F = true;
                            float[] fArr3 = new float[i2];
                            // fill-array-data instruction
                            fArr3[0] = 0.0f;
                            fArr3[1] = 1.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr3);
                            oabVar.G = ofFloat;
                            ofFloat.addUpdateListener(new w9b(oabVar, (byte) 1));
                            oabVar.J0.d();
                            dab dabVar4 = oabVar.w;
                            if (dabVar4 != null) {
                                pi5.c = true;
                                b = 2;
                                dabVar4.setLayerType(2, null);
                            } else {
                                b = 2;
                            }
                            oabVar.G.addListener(new x9b(oabVar, b));
                            oabVar.G.setStartDelay(40L);
                            oabVar.G.setDuration(250L);
                            oabVar.G.setInterpolator(d53.f);
                            oabVar.G.start();
                            if (!arrayList.isEmpty()) {
                                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                    ((Runnable) arrayList.get(i8)).run();
                                }
                                arrayList.clear();
                            }
                            oab.A1 = false;
                            return;
                        }
                        return;
                    }
                    int i9 = i;
                    float U1 = gm.U1(f20, iArr[i], i9);
                    fArr[z] = U1;
                    fArr[i9] = U1;
                    float U12 = gm.U1(f20, oabVar.W0[z], i9);
                    fArr[3] = U12;
                    fArr[i2] = U12;
                    float U13 = gm.U1(f20, oabVar.W0[i2], i9);
                    fArr[5] = U13;
                    fArr[4] = U13;
                    float U14 = gm.U1(f20, oabVar.W0[3], i9);
                    fArr[7] = U14;
                    fArr[6] = U14;
                }
                f7 = 0.0f;
                path.addRoundRect(rectF10, fArr, Path.Direction.CCW);
                canvas2.save();
                f8 = oabVar.Q;
                if (f8 != f7) {
                    canvas2.clipRect(f7, gm.R1(f7, f8, (float) Math.pow(1.0f - oabVar.V, 0.4000000059604645d)), getMeasuredWidth(), gm.R1(getMeasuredHeight(), oabVar.R, 1.0f - oabVar.V));
                }
                if (labVar == null) {
                }
                rectF2 = rectF5;
                f9 = f7;
                rectF3 = rectF8;
                canvas2.save();
                canvas2.clipPath(path);
                super.dispatchDraw(canvas);
                RectF rectF112 = this.t0;
                if (labVar != null) {
                }
                f10 = f9;
                f11 = f20;
                rectF4 = rectF3;
                canvas2.restore();
                if (x48Var != null) {
                }
                if (oabVar.N != null) {
                }
                canvas2.restore();
                if (oab.A1) {
                }
            }
        }
        oabVar.w.setAlpha(oabVar.V);
        float f40 = (f3 * 0.15f) + (oabVar.V * 0.1f) + 0.75f;
        oabVar.w.setScaleX(f40);
        oabVar.w.setScaleY(f40);
        oabVar.w.setTranslationY(oabVar.X);
        oabVar.w.setTranslationX(oabVar.Y);
        super.dispatchDraw(canvas);
        i2 = 2;
        if (oab.A1) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        oab oabVar = this.y0;
        if (keyCode == 24 || keyEvent.getKeyCode() == 25) {
            oabVar.r(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        oabVar.p();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0308  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        eab eabVar;
        int i;
        v29 v29Var;
        oab oabVar = this.y0;
        float[] fArr = oabVar.p0;
        a58 currentPeerView = oabVar.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            l48 l48Var = currentPeerView.A0;
            if (l48Var.W.w()) {
                float x = currentPeerView.getX();
                float y = ((View) currentPeerView.getParent()).getY() + currentPeerView.getY();
                motionEvent.offsetLocation(-x, -y);
                if (!l48Var.W.m(currentPeerView.getContext()).onTouchEvent(motionEvent)) {
                    motionEvent.offsetLocation(x, y);
                }
                return true;
            }
        }
        float f = 0.0f;
        byte b = 0;
        if (oabVar.p1 && currentPeerView != null && (v29Var = currentPeerView.h3) != null) {
            float f2 = 0.0f;
            for (View view = currentPeerView; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
                f += view.getX();
                f2 += view.getY();
            }
            if (currentPeerView.h3.getReactionsWindow() != null && currentPeerView.h3.getReactionsWindow().c != null) {
                motionEvent.offsetLocation(-f, (-f2) - currentPeerView.h3.getReactionsWindow().c.getTranslationY());
                currentPeerView.h3.getReactionsWindow().c.dispatchTouchEvent(motionEvent);
                return true;
            }
            Rect rect = gm.Q;
            v29Var.getHitRect(rect);
            rect.offset((int) f, (int) f2);
            if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                currentPeerView.W0(false);
                return true;
            }
            motionEvent.offsetLocation(-rect.left, -rect.top);
            v29Var.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            oabVar.k0 = false;
            gm.r(oabVar.b1);
            float f3 = oabVar.Y;
            if (f3 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
                oabVar.H = ofFloat;
                ofFloat.addUpdateListener(new z9b(this, b));
                oabVar.H.addListener(new aab(this, b));
                oabVar.H.setDuration(250L);
                oabVar.H.setInterpolator(d53.f);
                oabVar.H.start();
            }
            if (oabVar.W >= 0.3f) {
                oabVar.o(true);
            }
            oabVar.O(false);
            oabVar.P(false);
            z = true;
        } else {
            z = false;
        }
        if (motionEvent.getAction() == 0) {
            oabVar.b0 = false;
            if (currentPeerView != null) {
                a6 a6Var = currentPeerView.o0;
                b8b b8bVar = currentPeerView.s0;
                g48 g48Var = currentPeerView.S0;
                hg5 hg5Var = currentPeerView.v0;
                if (hg5Var != null && hg5Var.W && b8bVar != null && !hg5Var.D0.contains(motionEvent.getX() - (currentPeerView.v0.getX() + (g48Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.v0.getY() + (g48Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(b8bVar, motionEvent)) {
                    currentPeerView.v0.f(true);
                }
                hg5 hg5Var2 = currentPeerView.w0;
                if (hg5Var2 != null && hg5Var2.W && a6Var != null && !hg5Var2.D0.contains(motionEvent.getX() - (currentPeerView.w0.getX() + (g48Var.getX() + currentPeerView.getX())), motionEvent.getY() - (currentPeerView.w0.getY() + (g48Var.getY() + currentPeerView.getY()))) && !currentPeerView.z0(a6Var, motionEvent)) {
                    currentPeerView.w0.f(true);
                }
            }
            oabVar.o0.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        boolean z3 = (oabVar.y || oabVar.H0 || oabVar.I0) ? false : true;
        float f4 = oabVar.f0;
        SparseArray sparseArray = this.w0;
        if (f4 == 0.0f && !oabVar.k0 && oabVar.o0.G0 == 1 && motionEvent.getAction() == 2 && z3) {
            float floatValue = ((Float) sparseArray.get(motionEvent.getPointerId(0), Float.valueOf(0.0f))).floatValue() - motionEvent.getX(0);
            if ((floatValue != 0.0f && (((i = (eabVar = oabVar.o0).J0) == 0 && eabVar.L0 == 0.0f && floatValue < 0.0f) || (i == eabVar.getAdapter().b() - 1 && eabVar.L0 == 0.0f && floatValue > 0.0f))) || oabVar.Y != 0.0f) {
                float f5 = oabVar.Y;
                if (f5 == 0.0f) {
                    oabVar.Z = -floatValue;
                }
                if ((floatValue < 0.0f && oabVar.Z > 0.0f) || (floatValue > 0.0f && oabVar.Z < 0.0f)) {
                    floatValue *= 0.2f;
                }
                oabVar.Y = f5 - floatValue;
                oabVar.V();
                float f6 = oabVar.Y;
                if ((f6 > 0.0f && oabVar.Z < 0.0f) || (f6 < 0.0f && oabVar.Z > 0.0f)) {
                    oabVar.Y = 0.0f;
                }
                z2 = true;
                if (currentPeerView != null && oabVar.f0 == 0.0f && !oabVar.k0 && !oabVar.L0 && !oabVar.I0 && oabVar.o0.G0 != 1) {
                    gm.p1(currentPeerView.S0, this, fArr);
                    motionEvent.offsetLocation(-fArr[0], -fArr[1]);
                    a58 currentPeerView2 = oabVar.o0.getCurrentPeerView();
                    currentPeerView2.N2.a(motionEvent, currentPeerView2.S0, null, null, 0);
                    motionEvent.offsetLocation(fArr[0], fArr[1]);
                }
                if (motionEvent.getAction() != 1 || motionEvent.getAction() == 3) {
                    sparseArray.clear();
                } else {
                    for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                        sparseArray.put(motionEvent.getPointerId(i2), Float.valueOf(motionEvent.getX(i2)));
                    }
                }
                if (!z2) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        if (oabVar.f0 != 0.0f && !oabVar.g1 && oabVar.q0 < gm.L(20.0f)) {
                            oabVar.k(oabVar.x.f > 0.5f);
                        }
                        a58 w = oabVar.w();
                        if (w != null) {
                            w.A0.w0 = false;
                        }
                    }
                    if (z && !oabVar.b0) {
                        oabVar.i();
                    }
                    if (!dispatchTouchEvent && (!oab.x1 || !oabVar.r0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        z2 = false;
        if (currentPeerView != null) {
            gm.p1(currentPeerView.S0, this, fArr);
            motionEvent.offsetLocation(-fArr[0], -fArr[1]);
            a58 currentPeerView22 = oabVar.o0.getCurrentPeerView();
            currentPeerView22.N2.a(motionEvent, currentPeerView22.S0, null, null, 0);
            motionEvent.offsetLocation(fArr[0], fArr[1]);
        }
        if (motionEvent.getAction() != 1) {
        }
        sparseArray.clear();
        if (!z2) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.y0.z0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oab oabVar = this.y0;
        if (oabVar.b && !oabVar.c) {
            d dVar = this.x0;
            gm.V2(dVar.getParentActivity(), dVar.getClassGuid());
        }
        setTag(R.id.bulletin_delegate_tag, new bab(this));
        nm7.f(oabVar.h).b(oabVar, nm7.B5);
        nm7.f(oabVar.h).b(oabVar, nm7.z5);
        nm7.f(oabVar.h).b(oabVar, nm7.d1);
        nm7.f(oabVar.h).b(oabVar, nm7.c1);
        nm7.f(oabVar.h).b(oabVar, nm7.A5);
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
        oab oabVar = this.y0;
        nm7.f(oabVar.h).n(oabVar, nm7.B5);
        nm7.f(oabVar.h).n(oabVar, nm7.z5);
        nm7.f(oabVar.h).n(oabVar, nm7.d1);
        nm7.f(oabVar.h).n(oabVar, nm7.c1);
        nm7.f(oabVar.h).n(oabVar, nm7.A5);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01df  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        n38 n38Var;
        nab nabVar;
        a58 currentPeerView;
        boolean z;
        boolean z2;
        nsa nsaVar;
        c40 c40Var;
        a58 currentPeerView2;
        z48 z48Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        n38 n38Var2;
        oab oabVar = this.y0;
        j48 j48Var = oabVar.b1;
        if (motionEvent.getAction() == 0 && oabVar.V == 1.0f) {
            float x = motionEvent.getX();
            this.o0 = x;
            this.m0 = x;
            this.n0 = motionEvent.getY();
            oabVar.h0 = false;
            oabVar.g0 = (oabVar.I0 || oabVar.v(oabVar.s, motionEvent.getX(), motionEvent.getY(), false)) ? false : true;
            oabVar.i0 = (oabVar.I0 || oabVar.v(oabVar.s, motionEvent.getX(), motionEvent.getY(), true)) ? false : true;
            oabVar.O(oabVar.g0 && !oabVar.m1);
            a58 w = oabVar.w();
            if (oabVar.g0 && w != null && (n38Var2 = w.B0) != null) {
                n38Var2.setAllowTouches(false);
            }
            if (oabVar.g0 && !oabVar.I0 && oabVar.m1) {
                nsa nsaVar2 = new nsa((Object) this, (byte) 29);
                oabVar.n1 = nsaVar2;
                gm.d3(nsaVar2, 150L);
            }
            if (oabVar.g0 && !oabVar.y && !oabVar.I0 && !oabVar.j1) {
                gm.d3(j48Var, 400L);
            }
            f = 1.0f;
        } else if (motionEvent.getAction() == 2) {
            float abs = Math.abs(this.n0 - motionEvent.getY());
            float abs2 = Math.abs(this.m0 - motionEvent.getX());
            if (oabVar.a1 && oabVar.l0 && !oabVar.f1 && !oabVar.k0 && (c40Var = oabVar.G0) != null && ((nab) c40Var.c) != null && (currentPeerView2 = oabVar.o0.getCurrentPeerView()) != null && (z48Var = currentPeerView2.E1) != null && z48Var.b == null && z48Var.e) {
                long j = currentPeerView2.H2;
                if (j <= 0 && (storyItem = z48Var.a) != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                    j = (long) (k47.H0(document) * 1000.0d);
                }
                if (j > 0) {
                    float x2 = motionEvent.getX();
                    nab nabVar2 = (nab) oabVar.G0.c;
                    f = 1.0f;
                    if (((int) (nabVar2.seek((x2 - this.o0) / gm.L(220.0f), j) * 10.0f)) != ((int) (nabVar2.currentSeek * 10.0f))) {
                        try {
                            currentPeerView2.performHapticFeedback(9, 1);
                        } catch (Exception unused) {
                        }
                    }
                    currentPeerView2.S0.invalidate();
                    this.o0 = x2;
                    if (abs > abs2 && !oabVar.l0 && !oabVar.h0 && abs > gm.e * 2.0f) {
                        oabVar.h0 = true;
                    }
                    if (!oabVar.k0 && !oabVar.l0 && !oabVar.y && oabVar.i0) {
                        if (abs > abs2 && abs > gm.e * 2.0f) {
                            oabVar.k0 = true;
                            currentPeerView = oabVar.o0.getCurrentPeerView();
                            if (currentPeerView != null) {
                                currentPeerView.f0();
                                if (!currentPeerView.E1.f && (currentPeerView.s1 || (currentPeerView.t1 && currentPeerView.r3))) {
                                    z = true;
                                    oabVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || oabVar.u1 != null) ? false : true;
                                    z2 = (z || currentPeerView.S2 || currentPeerView.E1.a == null || oabVar.u1 != null) ? false : true;
                                    oabVar.d0 = z2;
                                    if (z2 && this.f != 0) {
                                        oabVar.d0 = false;
                                        z2 = false;
                                    }
                                    if (z2) {
                                        oabVar.m();
                                    }
                                    oabVar.a0 = 0.0f;
                                    nsaVar = oabVar.n1;
                                    if (nsaVar != null) {
                                        gm.r(nsaVar);
                                        oabVar.n1.run();
                                        oabVar.n1 = null;
                                    }
                                    gm.r(j48Var);
                                }
                            }
                            z = false;
                            oabVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || oabVar.u1 != null) ? false : true;
                            if (z) {
                            }
                            oabVar.d0 = z2;
                            if (z2) {
                                oabVar.d0 = false;
                                z2 = false;
                            }
                            if (z2) {
                            }
                            oabVar.a0 = 0.0f;
                            nsaVar = oabVar.n1;
                            if (nsaVar != null) {
                            }
                            gm.r(j48Var);
                        }
                        oabVar.C();
                    }
                }
            }
            f = 1.0f;
            if (abs > abs2) {
                oabVar.h0 = true;
            }
            if (!oabVar.k0) {
                if (abs > abs2) {
                    oabVar.k0 = true;
                    currentPeerView = oabVar.o0.getCurrentPeerView();
                    if (currentPeerView != null) {
                    }
                    z = false;
                    oabVar.m0 = (!z || currentPeerView == null || currentPeerView.t1 || currentPeerView.v1 || oabVar.u1 != null) ? false : true;
                    if (z) {
                    }
                    oabVar.d0 = z2;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    oabVar.a0 = 0.0f;
                    nsaVar = oabVar.n1;
                    if (nsaVar != null) {
                    }
                    gm.r(j48Var);
                }
                oabVar.C();
            }
        } else {
            f = 1.0f;
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                gm.r(j48Var);
                nsa nsaVar3 = oabVar.n1;
                if (nsaVar3 != null) {
                    gm.r(nsaVar3);
                    oabVar.n1 = null;
                }
                oabVar.O(false);
                oabVar.h0 = false;
                oabVar.l0 = false;
                c40 c40Var2 = oabVar.G0;
                if (c40Var2 != null && (nabVar = (nab) c40Var2.c) != null) {
                    nabVar.setSeeking(false);
                }
                a58 w2 = oabVar.w();
                if (w2 != null && (n38Var = w2.B0) != null) {
                    n38Var.setAllowTouches(true);
                }
            }
        }
        p2a p2aVar = oabVar.x;
        boolean z3 = p2aVar != null && p2aVar.f == f;
        if (!oabVar.k0 && !z3) {
            oabVar.j0.onTouchEvent(motionEvent);
        }
        return oabVar.k0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        oab oabVar = this.y0;
        ((FrameLayout.LayoutParams) oabVar.d1.getLayoutParams()).topMargin = gm.m - gm.L(2.0f);
        oabVar.d1.getLayoutParams().height = gm.L(2.0f);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n38 n38Var;
        int action = motionEvent.getAction();
        oab oabVar = this.y0;
        byte b = 1;
        if (action == 1 || motionEvent.getAction() == 3) {
            oabVar.k0 = false;
            oabVar.O(false);
            if (oabVar.W >= 1.0f) {
                oabVar.o(true);
            } else if (!oabVar.H0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(oabVar.X, 0.0f);
                oabVar.H = ofFloat;
                ofFloat.addUpdateListener(new z9b(this, b));
                oabVar.H.addListener(new aab(this, b));
                oabVar.H.setDuration(150L);
                oabVar.H.setInterpolator(d53.f);
                oabVar.H.start();
            }
            a58 w = oabVar.w();
            if (w != null && (n38Var = w.B0) != null) {
                n38Var.setAllowTouches(true);
            }
        }
        if (!oabVar.k0 && !oabVar.y && oabVar.a0 == 0.0f && ((oabVar.f0 == 0.0f || (!oabVar.g0 && !oabVar.h0)) && !oabVar.j1)) {
            return false;
        }
        oabVar.j0.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.y0.g0 = false;
    }
}
