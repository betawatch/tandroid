// default package

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        n8 n8Var;
        n8 n8Var2;
        s64 s64Var;
        zt5 zt5Var;
        n8 n8Var3;
        n8 n8Var4;
        byte b;
        float f;
        float f2;
        c1a c1aVar;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                s7 s7Var = (s7) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var = s7Var.d) != null && n8Var.isShowing()) {
                    view.getHitRect(s7Var.J);
                    if (!s7Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        s7Var.d.d(true);
                    }
                }
                return false;
            case 1:
                o oVar = (o) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = oVar.I) != null && n8Var2.isShowing()) {
                    view.getHitRect(oVar.E0);
                    if (!oVar.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oVar.I.d(true);
                    }
                }
                return false;
            case 2:
                h42 h42Var = (h42) obj;
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    h42Var.b0();
                }
                return false;
            case 3:
                rw2 rw2Var = (rw2) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (rw2Var.n) {
                        rw2Var.c();
                    } else {
                        rw2Var.b();
                    }
                }
                return true;
            case 4:
                n8 n8Var5 = (n8) ((g9) obj).b;
                if (motionEvent.getActionMasked() == 1 && n8Var5 != null && n8Var5.isShowing()) {
                    Rect rect = hl.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n8Var5.d(true);
                    }
                }
                return false;
            case 5:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj;
                ArrayList arrayList = ExternalActionActivity.y;
                if (externalActionActivity.c.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int[] iArr = new int[2];
                externalActionActivity.d.getView().getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                if (externalActionActivity.d.h()) {
                    return false;
                }
                if (x > i && x < externalActionActivity.d.getView().getWidth() + i && y > i2 && y < externalActionActivity.d.getView().getHeight() + i2) {
                    return false;
                }
                if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                    while (true) {
                        int size = externalActionActivity.d.getFragmentStack().size() - 1;
                        ActionBarLayout actionBarLayout = externalActionActivity.d;
                        if (size > 0) {
                            actionBarLayout.c0((e) actionBarLayout.getFragmentStack().get(0), false);
                        } else {
                            actionBarLayout.j(true, false);
                        }
                    }
                }
                return true;
            case 6:
                q qVar = (q) obj;
                if (qVar.Q == null || qVar.S == null) {
                    return false;
                }
                if (motionEvent.getActionMasked() == 0) {
                    ValueAnimator valueAnimator = qVar.d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.E0 = false;
                    qVar.C0 = motionEvent.getPointerId(0);
                    qVar.D0 = -1;
                    int i3 = qVar.S.a;
                    if (i3 == 5) {
                        ImageView imageView = qVar.J;
                        jp9 jp9Var = qVar.Q;
                        if (jp9Var != null && i3 == 5) {
                            boolean z = qVar.l0;
                            qVar.l0 = !z;
                            jp9.v();
                            if (jp9Var.a0 == 5 && (s64Var = jp9Var.W) != null) {
                                s64Var.R(!z ? 0.0f : 1.0f);
                            }
                            oec oecVar = qVar.V;
                            if (oecVar != null) {
                                oecVar.t = qVar.l0;
                            }
                            imageView.animate().cancel();
                            ik8.s(imageView.animate(), qVar.l0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        ip9 ip9Var = qVar.S;
                        if (ip9Var.a == 3 && !ip9Var.f) {
                            qVar.C0 = motionEvent.getPointerId(0);
                            qVar.D0 = motionEvent.getPointerId(1);
                            float hypot = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                            qVar.A0 = hypot;
                            qVar.E0 = hypot > 0.0f;
                            qVar.B0 = 0.0f;
                        }
                    }
                    if (motionEvent.getActionMasked() == 2 && qVar.E0) {
                        int findPointerIndex = motionEvent.findPointerIndex(qVar.C0);
                        int findPointerIndex2 = motionEvent.findPointerIndex(qVar.D0);
                        if (findPointerIndex < 0 || findPointerIndex2 < 0) {
                            qVar.l();
                        } else {
                            float hypot2 = ((float) Math.hypot(motionEvent.getX(findPointerIndex2) - motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex2) - motionEvent.getY(findPointerIndex))) / qVar.A0;
                            bp9 bp9Var = qVar.T;
                            float f3 = bp9Var == null ? 1.0f : bp9Var.c;
                            float max = f3 > 1.0f ? Math.max(0.0f, Math.min(1.0f, (((Math.max(0.0f, hypot2 - 1.0f) / 1.5f) + 1.0f) - 1.0f) / (f3 - 1.0f))) : 0.0f;
                            qVar.B0 = max;
                            qVar.Q.y(max);
                        }
                    } else if (motionEvent.getActionMasked() == 6 && qVar.E0) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        if (pointerId == qVar.C0 || pointerId == qVar.D0) {
                            qVar.l();
                        }
                    } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && qVar.E0) {
                        qVar.l();
                    }
                }
                return true;
            case 7:
                fu5 fu5Var = (fu5) ((WeakReference) obj).get();
                if (fu5Var == null || (zt5Var = fu5Var.m) == null || !zt5Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    fu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    fu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = fu5Var.v0;
                    if (view2 != null) {
                        fu5Var.v0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    fu5Var.u0 = null;
                } else if (actionMasked == 3) {
                    View view3 = fu5Var.v0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        fu5Var.v0 = null;
                    }
                    view.setOnTouchListener(null);
                    fu5Var.u0 = null;
                }
                return true;
            case 8:
                wy5 wy5Var = (wy5) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var3 = wy5Var.B1) != null && n8Var3.isShowing()) {
                    view.getHitRect(wy5Var.D1);
                    if (!wy5Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        wy5Var.B1.d(true);
                    }
                }
                return false;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                if (launchActivity.p0.getFragmentStack().isEmpty() || motionEvent.getAction() != 1) {
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                int[] iArr2 = new int[2];
                launchActivity.q0.getView().getLocationOnScreen(iArr2);
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                if (launchActivity.q0.h()) {
                    return false;
                }
                if (x2 > i4 && x2 < launchActivity.q0.getView().getWidth() + i4 && y2 > i5 && y2 < launchActivity.q0.getView().getHeight() + i5) {
                    return false;
                }
                if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                    while (true) {
                        int size2 = launchActivity.q0.getFragmentStack().size() - 1;
                        ActionBarLayout actionBarLayout2 = launchActivity.q0;
                        if (size2 > 0) {
                            actionBarLayout2.c0(actionBarLayout2.getFragmentStack().get(0), false);
                        } else {
                            actionBarLayout2.j(true, false);
                        }
                    }
                }
                return true;
            case 10:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return rw2.e().h(motionEvent, b27Var.getListView(), b27Var.x, null, b27Var.a);
            case 11:
                m57 m57Var = (m57) obj;
                if (motionEvent.getAction() == 1) {
                    m57Var.d0.a(true);
                }
                return true;
            case 12:
                dx7 dx7Var = (dx7) obj;
                if (motionEvent.getActionMasked() == 0 && (n8Var4 = dx7Var.r1) != null && n8Var4.isShowing()) {
                    view.getHitRect(dx7Var.t1);
                    if (!dx7Var.t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        dx7Var.r1.d(true);
                    }
                }
                return false;
            case 13:
                f88 f88Var = (f88) obj;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int L = hl.L(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f4 = f88Var.f;
                    float f5 = L;
                    float f6 = f4 - f5;
                    if (f6 < x3 && f4 + f5 > x3) {
                        float f7 = f88Var.h;
                        if (f7 - f5 < y3 && f7 + f5 > y3) {
                            f88Var.n = (byte) 1;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    float f8 = f88Var.d;
                    float f9 = f6 + f8;
                    if (f9 < x3 && f4 + f5 + f8 > x3) {
                        float f10 = f88Var.h;
                        if (f10 - f5 < y3 && f10 + f5 > y3) {
                            f88Var.n = (byte) 2;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (f6 < x3 && f4 + f5 > x3) {
                        float f11 = f88Var.h;
                        float f12 = f88Var.e;
                        if ((f11 - f5) + f12 < y3 && f11 + f5 + f12 > y3) {
                            f88Var.n = (byte) 3;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (f9 < x3 && f4 + f5 + f8 > x3) {
                        float f13 = f88Var.h;
                        float f14 = f88Var.e;
                        if ((f13 - f5) + f14 < y3 && f13 + f5 + f14 > y3) {
                            f88Var.n = (byte) 4;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    if (f4 < x3 && f4 + f8 > x3) {
                        float f15 = f88Var.h;
                        if (f15 < y3 && f15 + f88Var.e > y3) {
                            f88Var.n = (byte) 5;
                            f88Var.requestDisallowInterceptTouchEvent(true);
                            f88Var.r = x3;
                            f88Var.s = y3;
                        }
                    }
                    f88Var.n = (byte) 0;
                    f88Var.r = x3;
                    f88Var.s = y3;
                } else if (motionEvent.getAction() == 1) {
                    f88Var.n = (byte) 0;
                } else if (motionEvent.getAction() == 2 && (b = f88Var.n) != 0) {
                    float f16 = x3 - f88Var.r;
                    float f17 = y3 - f88Var.s;
                    if (b == 5) {
                        float f18 = f88Var.f + f16;
                        f88Var.f = f18;
                        float f19 = f88Var.h + f17;
                        f88Var.h = f19;
                        int i6 = f88Var.y;
                        float f20 = i6;
                        if (f18 < f20) {
                            f88Var.f = f20;
                        } else {
                            float f21 = f88Var.d;
                            float f22 = f18 + f21;
                            float f23 = i6 + f88Var.w;
                            if (f22 > f23) {
                                f88Var.f = f23 - f21;
                            }
                        }
                        int i7 = f88Var.E;
                        float f24 = i7;
                        if (f19 < f24) {
                            f88Var.h = f24;
                        } else {
                            float f25 = f88Var.e;
                            float f26 = f19 + f25;
                            float f27 = i7 + f88Var.x;
                            if (f26 > f27) {
                                f88Var.h = f27 - f25;
                            }
                        }
                    } else if (b == 1) {
                        float f28 = f88Var.d;
                        if (f28 - f16 < 160.0f) {
                            f16 = f28 - 160.0f;
                        }
                        float f29 = f88Var.f;
                        float f30 = f29 + f16;
                        float f31 = f88Var.y;
                        if (f30 < f31) {
                            f16 = f31 - f29;
                        }
                        if (f88Var.H) {
                            float f32 = f88Var.e;
                            if (f32 - f17 < 160.0f) {
                                f17 = f32 - 160.0f;
                            }
                            float f33 = f88Var.h;
                            float f34 = f33 + f17;
                            float f35 = f88Var.E;
                            if (f34 < f35) {
                                f17 = f35 - f33;
                            }
                            f88Var.f = f29 + f16;
                            f88Var.h = f33 + f17;
                            f88Var.d = f28 - f16;
                            f88Var.e = f32 - f17;
                        } else {
                            float f36 = f88Var.h;
                            float f37 = f36 + f16;
                            float f38 = f88Var.E;
                            if (f37 < f38) {
                                f16 = f38 - f36;
                            }
                            f88Var.f = f29 + f16;
                            f88Var.h = f36 + f16;
                            f88Var.d = f28 - f16;
                            f88Var.e -= f16;
                        }
                    } else if (b == 2) {
                        float f39 = f88Var.d;
                        if (f39 + f16 < 160.0f) {
                            f16 = -(f39 - 160.0f);
                        }
                        float f40 = f88Var.f;
                        float f41 = f40 + f39 + f16;
                        float f42 = f88Var.y + f88Var.w;
                        if (f41 > f42) {
                            f16 = (f42 - f40) - f39;
                        }
                        if (f88Var.H) {
                            float f43 = f88Var.e;
                            if (f43 - f17 < 160.0f) {
                                f17 = f43 - 160.0f;
                            }
                            float f44 = f88Var.h;
                            float f45 = f44 + f17;
                            float f46 = f88Var.E;
                            if (f45 < f46) {
                                f17 = f46 - f44;
                            }
                            f88Var.h = f44 + f17;
                            f88Var.d = f39 + f16;
                            f88Var.e = f43 - f17;
                        } else {
                            float f47 = f88Var.h;
                            float f48 = f47 - f16;
                            float f49 = f88Var.E;
                            if (f48 < f49) {
                                f16 = f47 - f49;
                            }
                            f88Var.h = f47 - f16;
                            f88Var.d = f39 + f16;
                            f88Var.e += f16;
                        }
                    } else if (b == 3) {
                        float f50 = f88Var.d;
                        if (f50 - f16 < 160.0f) {
                            f16 = f50 - 160.0f;
                        }
                        float f51 = f88Var.f;
                        float f52 = f51 + f16;
                        float f53 = f88Var.y;
                        if (f52 < f53) {
                            f16 = f53 - f51;
                        }
                        boolean z2 = f88Var.H;
                        float f54 = f88Var.h;
                        if (z2) {
                            float f55 = f88Var.e;
                            float f56 = f54 + f55 + f17;
                            float f57 = f88Var.E + f88Var.x;
                            if (f56 > f57) {
                                f17 = (f57 - f54) - f55;
                            }
                            f88Var.f = f51 + f16;
                            f88Var.d = f50 - f16;
                            float f58 = f55 + f17;
                            f88Var.e = f58;
                            if (f58 < 160.0f) {
                                f88Var.e = 160.0f;
                            }
                        } else {
                            float f59 = f54 + f50;
                            float f60 = f59 - f16;
                            int i8 = f88Var.E;
                            int i9 = f88Var.x;
                            if (f60 > i8 + i9) {
                                f16 = (f59 - i8) - i9;
                            }
                            f88Var.f = f51 + f16;
                            f88Var.d = f50 - f16;
                            f88Var.e -= f16;
                        }
                    } else if (b == 4) {
                        float f61 = f88Var.f;
                        float f62 = f88Var.d;
                        float f63 = f61 + f62 + f16;
                        float f64 = f88Var.y + f88Var.w;
                        if (f63 > f64) {
                            f16 = (f64 - f61) - f62;
                        }
                        boolean z3 = f88Var.H;
                        float f65 = f88Var.h;
                        if (z3) {
                            float f66 = f88Var.e;
                            float f67 = f65 + f66 + f17;
                            float f68 = f88Var.E + f88Var.x;
                            if (f67 > f68) {
                                f17 = (f68 - f65) - f66;
                            }
                            f = f62 + f16;
                            f88Var.d = f;
                            f2 = f66 + f17;
                            f88Var.e = f2;
                        } else {
                            float f69 = f65 + f62 + f16;
                            float f70 = f88Var.E + f88Var.x;
                            if (f69 > f70) {
                                f16 = (f70 - f65) - f62;
                            }
                            f = f62 + f16;
                            f88Var.d = f;
                            f2 = f88Var.e + f16;
                            f88Var.e = f2;
                        }
                        if (f < 160.0f) {
                            f88Var.d = 160.0f;
                        }
                        if (f2 < 160.0f) {
                            f88Var.e = 160.0f;
                        }
                    }
                    f88Var.r = x3;
                    f88Var.s = y3;
                    f88Var.invalidate();
                }
                return true;
            case 14:
                ji8 ji8Var = (ji8) obj;
                if (ji8Var.U == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) ji8Var.U).getBackgroundDrawable();
                RectF rectF = hl.P;
                rectF.set(backgroundDrawable.getBounds());
                rectF.offset(ji8Var.U.getX(), ji8Var.U.getY());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                ji8Var.b(true);
                return true;
            case 15:
                n1a n1aVar = (n1a) obj;
                if (motionEvent.getAction() != 0 || (c1aVar = n1aVar.V1) == null) {
                    return false;
                }
                c1aVar.run();
                return true;
            case 16:
                s4b s4bVar = (s4b) obj;
                if (s4bVar.L1) {
                    return false;
                }
                return rw2.e().h(motionEvent, s4bVar.m1, s4bVar.B1, s4bVar.g2, s4bVar.J0);
            default:
                ktb ktbVar = (ktb) obj;
                if (ktbVar.T == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) ktbVar.T).getBackgroundDrawable();
                RectF rectF2 = hl.P;
                rectF2.set(backgroundDrawable2.getBounds());
                rectF2.offset(ktbVar.T.getX(), ktbVar.T.getY());
                if (rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                ktbVar.b(true);
                return true;
        }
    }
}
