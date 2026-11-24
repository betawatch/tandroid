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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a7 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        h74 h74Var;
        wt5 wt5Var;
        m8 m8Var3;
        m8 m8Var4;
        byte b;
        float f;
        float f2;
        lz9 lz9Var;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                r7 r7Var = (r7) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
                    view.getHitRect(r7Var.J);
                    if (!r7Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r7Var.d.d(true);
                    }
                }
                return false;
            case 1:
                o oVar = (o) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = oVar.I) != null && m8Var2.isShowing()) {
                    view.getHitRect(oVar.E0);
                    if (!oVar.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        oVar.I.d(true);
                    }
                }
                return false;
            case 2:
                c52 c52Var = (c52) obj;
                if (motionEvent.getActionMasked() == 1 && !view.hasFocus()) {
                    c52Var.c0();
                }
                return false;
            case 3:
                hx2 hx2Var = (hx2) obj;
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (hx2Var.n) {
                        hx2Var.c();
                    } else {
                        hx2Var.b();
                    }
                }
                return true;
            case 4:
                m8 m8Var5 = (m8) ((f9) obj).b;
                if (motionEvent.getActionMasked() == 1 && m8Var5 != null && m8Var5.isShowing()) {
                    Rect rect = gm.Q;
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m8Var5.d(true);
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
                            actionBarLayout.c0((d) actionBarLayout.getFragmentStack().get(0), false);
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
                        un9 un9Var = qVar.Q;
                        if (un9Var != null && i3 == 5) {
                            boolean z = qVar.l0;
                            qVar.l0 = !z;
                            un9.v();
                            if (un9Var.a0 == 5 && (h74Var = un9Var.W) != null) {
                                h74Var.R(!z ? 0.0f : 1.0f);
                            }
                            rcc rccVar = qVar.V;
                            if (rccVar != null) {
                                rccVar.t = qVar.l0;
                            }
                            imageView.animate().cancel();
                            wi8.s(imageView.animate(), qVar.l0 ? 1.0f : 0.0f, 180L);
                        }
                    }
                } else {
                    if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
                        tn9 tn9Var = qVar.S;
                        if (tn9Var.a == 3 && !tn9Var.f) {
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
                            mn9 mn9Var = qVar.T;
                            float f3 = mn9Var == null ? 1.0f : mn9Var.c;
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
                bu5 bu5Var = (bu5) ((WeakReference) obj).get();
                if (bu5Var == null || (wt5Var = bu5Var.m) == null || !wt5Var.isShowing()) {
                    view.setOnTouchListener(null);
                    return false;
                }
                if (view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    bu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                } else if (actionMasked == 1) {
                    bu5Var.c0((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    View view2 = bu5Var.s0;
                    if (view2 != null) {
                        bu5Var.s0 = null;
                        view2.setPressed(false);
                        view2.performClick();
                    }
                    view.setOnTouchListener(null);
                    bu5Var.r0 = null;
                } else if (actionMasked == 3) {
                    View view3 = bu5Var.s0;
                    if (view3 != null) {
                        view3.setPressed(false);
                        bu5Var.s0 = null;
                    }
                    view.setOnTouchListener(null);
                    bu5Var.r0 = null;
                }
                return true;
            case 8:
                ry5 ry5Var = (ry5) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var3 = ry5Var.H1) != null && m8Var3.isShowing()) {
                    view.getHitRect(ry5Var.J1);
                    if (!ry5Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ry5Var.H1.d(true);
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
                u17 u17Var = (u17) obj;
                u17Var.getClass();
                return hx2.e().h(motionEvent, u17Var.getListView(), u17Var.x, null, u17Var.a);
            case 11:
                f57 f57Var = (f57) obj;
                if (motionEvent.getAction() == 1) {
                    f57Var.d0.a(true);
                }
                return true;
            case 12:
                xv7 xv7Var = (xv7) obj;
                if (motionEvent.getActionMasked() == 0 && (m8Var4 = xv7Var.x1) != null && m8Var4.isShowing()) {
                    view.getHitRect(xv7Var.z1);
                    if (!xv7Var.z1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        xv7Var.x1.d(true);
                    }
                }
                return false;
            case 13:
                s68 s68Var = (s68) obj;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int L = gm.L(14.0f);
                if (motionEvent.getAction() == 0) {
                    float f4 = s68Var.f;
                    float f5 = L;
                    float f6 = f4 - f5;
                    if (f6 < x3 && f4 + f5 > x3) {
                        float f7 = s68Var.h;
                        if (f7 - f5 < y3 && f7 + f5 > y3) {
                            s68Var.n = (byte) 1;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    float f8 = s68Var.d;
                    float f9 = f6 + f8;
                    if (f9 < x3 && f4 + f5 + f8 > x3) {
                        float f10 = s68Var.h;
                        if (f10 - f5 < y3 && f10 + f5 > y3) {
                            s68Var.n = (byte) 2;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (f6 < x3 && f4 + f5 > x3) {
                        float f11 = s68Var.h;
                        float f12 = s68Var.e;
                        if ((f11 - f5) + f12 < y3 && f11 + f5 + f12 > y3) {
                            s68Var.n = (byte) 3;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (f9 < x3 && f4 + f5 + f8 > x3) {
                        float f13 = s68Var.h;
                        float f14 = s68Var.e;
                        if ((f13 - f5) + f14 < y3 && f13 + f5 + f14 > y3) {
                            s68Var.n = (byte) 4;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    if (f4 < x3 && f4 + f8 > x3) {
                        float f15 = s68Var.h;
                        if (f15 < y3 && f15 + s68Var.e > y3) {
                            s68Var.n = (byte) 5;
                            s68Var.requestDisallowInterceptTouchEvent(true);
                            s68Var.r = x3;
                            s68Var.s = y3;
                        }
                    }
                    s68Var.n = (byte) 0;
                    s68Var.r = x3;
                    s68Var.s = y3;
                } else if (motionEvent.getAction() == 1) {
                    s68Var.n = (byte) 0;
                } else if (motionEvent.getAction() == 2 && (b = s68Var.n) != 0) {
                    float f16 = x3 - s68Var.r;
                    float f17 = y3 - s68Var.s;
                    if (b == 5) {
                        float f18 = s68Var.f + f16;
                        s68Var.f = f18;
                        float f19 = s68Var.h + f17;
                        s68Var.h = f19;
                        int i6 = s68Var.y;
                        float f20 = i6;
                        if (f18 < f20) {
                            s68Var.f = f20;
                        } else {
                            float f21 = s68Var.d;
                            float f22 = f18 + f21;
                            float f23 = i6 + s68Var.w;
                            if (f22 > f23) {
                                s68Var.f = f23 - f21;
                            }
                        }
                        int i7 = s68Var.E;
                        float f24 = i7;
                        if (f19 < f24) {
                            s68Var.h = f24;
                        } else {
                            float f25 = s68Var.e;
                            float f26 = f19 + f25;
                            float f27 = i7 + s68Var.x;
                            if (f26 > f27) {
                                s68Var.h = f27 - f25;
                            }
                        }
                    } else if (b == 1) {
                        float f28 = s68Var.d;
                        if (f28 - f16 < 160.0f) {
                            f16 = f28 - 160.0f;
                        }
                        float f29 = s68Var.f;
                        float f30 = f29 + f16;
                        float f31 = s68Var.y;
                        if (f30 < f31) {
                            f16 = f31 - f29;
                        }
                        if (s68Var.H) {
                            float f32 = s68Var.e;
                            if (f32 - f17 < 160.0f) {
                                f17 = f32 - 160.0f;
                            }
                            float f33 = s68Var.h;
                            float f34 = f33 + f17;
                            float f35 = s68Var.E;
                            if (f34 < f35) {
                                f17 = f35 - f33;
                            }
                            s68Var.f = f29 + f16;
                            s68Var.h = f33 + f17;
                            s68Var.d = f28 - f16;
                            s68Var.e = f32 - f17;
                        } else {
                            float f36 = s68Var.h;
                            float f37 = f36 + f16;
                            float f38 = s68Var.E;
                            if (f37 < f38) {
                                f16 = f38 - f36;
                            }
                            s68Var.f = f29 + f16;
                            s68Var.h = f36 + f16;
                            s68Var.d = f28 - f16;
                            s68Var.e -= f16;
                        }
                    } else if (b == 2) {
                        float f39 = s68Var.d;
                        if (f39 + f16 < 160.0f) {
                            f16 = -(f39 - 160.0f);
                        }
                        float f40 = s68Var.f;
                        float f41 = f40 + f39 + f16;
                        float f42 = s68Var.y + s68Var.w;
                        if (f41 > f42) {
                            f16 = (f42 - f40) - f39;
                        }
                        if (s68Var.H) {
                            float f43 = s68Var.e;
                            if (f43 - f17 < 160.0f) {
                                f17 = f43 - 160.0f;
                            }
                            float f44 = s68Var.h;
                            float f45 = f44 + f17;
                            float f46 = s68Var.E;
                            if (f45 < f46) {
                                f17 = f46 - f44;
                            }
                            s68Var.h = f44 + f17;
                            s68Var.d = f39 + f16;
                            s68Var.e = f43 - f17;
                        } else {
                            float f47 = s68Var.h;
                            float f48 = f47 - f16;
                            float f49 = s68Var.E;
                            if (f48 < f49) {
                                f16 = f47 - f49;
                            }
                            s68Var.h = f47 - f16;
                            s68Var.d = f39 + f16;
                            s68Var.e += f16;
                        }
                    } else if (b == 3) {
                        float f50 = s68Var.d;
                        if (f50 - f16 < 160.0f) {
                            f16 = f50 - 160.0f;
                        }
                        float f51 = s68Var.f;
                        float f52 = f51 + f16;
                        float f53 = s68Var.y;
                        if (f52 < f53) {
                            f16 = f53 - f51;
                        }
                        boolean z2 = s68Var.H;
                        float f54 = s68Var.h;
                        if (z2) {
                            float f55 = s68Var.e;
                            float f56 = f54 + f55 + f17;
                            float f57 = s68Var.E + s68Var.x;
                            if (f56 > f57) {
                                f17 = (f57 - f54) - f55;
                            }
                            s68Var.f = f51 + f16;
                            s68Var.d = f50 - f16;
                            float f58 = f55 + f17;
                            s68Var.e = f58;
                            if (f58 < 160.0f) {
                                s68Var.e = 160.0f;
                            }
                        } else {
                            float f59 = f54 + f50;
                            float f60 = f59 - f16;
                            int i8 = s68Var.E;
                            int i9 = s68Var.x;
                            if (f60 > i8 + i9) {
                                f16 = (f59 - i8) - i9;
                            }
                            s68Var.f = f51 + f16;
                            s68Var.d = f50 - f16;
                            s68Var.e -= f16;
                        }
                    } else if (b == 4) {
                        float f61 = s68Var.f;
                        float f62 = s68Var.d;
                        float f63 = f61 + f62 + f16;
                        float f64 = s68Var.y + s68Var.w;
                        if (f63 > f64) {
                            f16 = (f64 - f61) - f62;
                        }
                        boolean z3 = s68Var.H;
                        float f65 = s68Var.h;
                        if (z3) {
                            float f66 = s68Var.e;
                            float f67 = f65 + f66 + f17;
                            float f68 = s68Var.E + s68Var.x;
                            if (f67 > f68) {
                                f17 = (f68 - f65) - f66;
                            }
                            f = f62 + f16;
                            s68Var.d = f;
                            f2 = f66 + f17;
                            s68Var.e = f2;
                        } else {
                            float f69 = f65 + f62 + f16;
                            float f70 = s68Var.E + s68Var.x;
                            if (f69 > f70) {
                                f16 = (f70 - f65) - f62;
                            }
                            f = f62 + f16;
                            s68Var.d = f;
                            f2 = s68Var.e + f16;
                            s68Var.e = f2;
                        }
                        if (f < 160.0f) {
                            s68Var.d = 160.0f;
                        }
                        if (f2 < 160.0f) {
                            s68Var.e = 160.0f;
                        }
                    }
                    s68Var.r = x3;
                    s68Var.s = y3;
                    s68Var.invalidate();
                }
                return true;
            case 14:
                xg8 xg8Var = (xg8) obj;
                if (xg8Var.U == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) xg8Var.U).getBackgroundDrawable();
                RectF rectF = gm.P;
                rectF.set(backgroundDrawable.getBounds());
                rectF.offset(xg8Var.U.getX(), xg8Var.U.getY());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                xg8Var.b(true);
                return true;
            case 15:
                vz9 vz9Var = (vz9) obj;
                if (motionEvent.getAction() != 0 || (lz9Var = vz9Var.V1) == null) {
                    return false;
                }
                lz9Var.run();
                return true;
            case 16:
                x2b x2bVar = (x2b) obj;
                if (x2bVar.L1) {
                    return false;
                }
                return hx2.e().h(motionEvent, x2bVar.m1, x2bVar.B1, x2bVar.g2, x2bVar.J0);
            default:
                krb krbVar = (krb) obj;
                if (krbVar.T == null || motionEvent.getAction() != 0) {
                    return false;
                }
                Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) krbVar.T).getBackgroundDrawable();
                RectF rectF2 = gm.P;
                rectF2.set(backgroundDrawable2.getBounds());
                rectF2.offset(krbVar.T.getX(), krbVar.T.getY());
                if (rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                krbVar.b(true);
                return true;
        }
    }
}
