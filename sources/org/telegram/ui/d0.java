package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                h4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var = h4Var.H) != null && k1Var.isShowing()) {
                    view.getHitRect(h4Var.D0);
                    if (!h4Var.D0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        h4Var.H.d(true);
                        break;
                    }
                }
                break;
            case 1:
                kt ktVar = (kt) this.b;
                ktVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!ktVar.n) {
                        ktVar.m();
                        break;
                    } else {
                        ktVar.n();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x10 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (!externalActionActivity.d.i()) {
                        if (x10 <= i11 || x10 >= externalActionActivity.d.getView().getWidth() + i11 || y3 <= i12 || y3 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.c0((org.telegram.ui.ActionBar.k2) actionBarLayout.getFragmentStack().get(0), false);
                                }
                                externalActionActivity.d.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (!launchActivity.q0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.r0.getView().getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!launchActivity.r0.i()) {
                        if (x11 <= i13 || x11 >= launchActivity.r0.getView().getWidth() + i13 || y10 <= i14 || y10 >= launchActivity.r0.getView().getHeight() + i14) {
                            if (!launchActivity.r0.getFragmentStack().isEmpty()) {
                                while (launchActivity.r0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.r0;
                                    actionBarLayout2.c0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.r0.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                xn0 xn0Var = (xn0) this.b;
                float x12 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int L = org.telegram.messenger.i0.L(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = xn0Var.n) != 0) {
                            float f7 = x12 - xn0Var.r;
                            float f10 = y11 - xn0Var.s;
                            if (i10 == 5) {
                                float f11 = xn0Var.f + f7;
                                xn0Var.f = f11;
                                float f12 = xn0Var.h + f10;
                                xn0Var.h = f12;
                                int i15 = xn0Var.y;
                                float f13 = i15;
                                if (f11 < f13) {
                                    xn0Var.f = f13;
                                } else {
                                    float f14 = xn0Var.d;
                                    float f15 = f11 + f14;
                                    float f16 = i15 + xn0Var.w;
                                    if (f15 > f16) {
                                        xn0Var.f = f16 - f14;
                                    }
                                }
                                int i16 = xn0Var.D;
                                float f17 = i16;
                                if (f12 < f17) {
                                    xn0Var.h = f17;
                                } else {
                                    float f18 = xn0Var.e;
                                    float f19 = f12 + f18;
                                    float f20 = i16 + xn0Var.x;
                                    if (f19 > f20) {
                                        xn0Var.h = f20 - f18;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f21 = xn0Var.d;
                                if (f21 - f7 < 160.0f) {
                                    f7 = f21 - 160.0f;
                                }
                                float f22 = xn0Var.f;
                                float f23 = f22 + f7;
                                float f24 = xn0Var.y;
                                if (f23 < f24) {
                                    f7 = f24 - f22;
                                }
                                if (xn0Var.G) {
                                    float f25 = xn0Var.e;
                                    if (f25 - f10 < 160.0f) {
                                        f10 = f25 - 160.0f;
                                    }
                                    float f26 = xn0Var.h;
                                    float f27 = f26 + f10;
                                    float f28 = xn0Var.D;
                                    if (f27 < f28) {
                                        f10 = f28 - f26;
                                    }
                                    xn0Var.f = f22 + f7;
                                    xn0Var.h = f26 + f10;
                                    xn0Var.d = f21 - f7;
                                    xn0Var.e = f25 - f10;
                                } else {
                                    float f29 = xn0Var.h;
                                    float f30 = f29 + f7;
                                    float f31 = xn0Var.D;
                                    if (f30 < f31) {
                                        f7 = f31 - f29;
                                    }
                                    xn0Var.f = f22 + f7;
                                    xn0Var.h = f29 + f7;
                                    xn0Var.d = f21 - f7;
                                    xn0Var.e -= f7;
                                }
                            } else if (i10 == 2) {
                                float f32 = xn0Var.d;
                                if (f32 + f7 < 160.0f) {
                                    f7 = -(f32 - 160.0f);
                                }
                                float f33 = xn0Var.f;
                                float f34 = f33 + f32 + f7;
                                float f35 = xn0Var.y + xn0Var.w;
                                if (f34 > f35) {
                                    f7 = (f35 - f33) - f32;
                                }
                                if (xn0Var.G) {
                                    float f36 = xn0Var.e;
                                    if (f36 - f10 < 160.0f) {
                                        f10 = f36 - 160.0f;
                                    }
                                    float f37 = xn0Var.h;
                                    float f38 = f37 + f10;
                                    float f39 = xn0Var.D;
                                    if (f38 < f39) {
                                        f10 = f39 - f37;
                                    }
                                    xn0Var.h = f37 + f10;
                                    xn0Var.d = f32 + f7;
                                    xn0Var.e = f36 - f10;
                                } else {
                                    float f40 = xn0Var.h;
                                    float f41 = f40 - f7;
                                    float f42 = xn0Var.D;
                                    if (f41 < f42) {
                                        f7 = f40 - f42;
                                    }
                                    xn0Var.h = f40 - f7;
                                    xn0Var.d = f32 + f7;
                                    xn0Var.e += f7;
                                }
                            } else if (i10 == 3) {
                                float f43 = xn0Var.d;
                                if (f43 - f7 < 160.0f) {
                                    f7 = f43 - 160.0f;
                                }
                                float f44 = xn0Var.f;
                                float f45 = f44 + f7;
                                float f46 = xn0Var.y;
                                if (f45 < f46) {
                                    f7 = f46 - f44;
                                }
                                if (xn0Var.G) {
                                    float f47 = xn0Var.h;
                                    float f48 = xn0Var.e;
                                    float f49 = f47 + f48 + f10;
                                    float f50 = xn0Var.D + xn0Var.x;
                                    if (f49 > f50) {
                                        f10 = (f50 - f47) - f48;
                                    }
                                    xn0Var.f = f44 + f7;
                                    xn0Var.d = f43 - f7;
                                    float f51 = f48 + f10;
                                    xn0Var.e = f51;
                                    if (f51 < 160.0f) {
                                        xn0Var.e = 160.0f;
                                    }
                                } else {
                                    float f52 = xn0Var.h + f43;
                                    float f53 = f52 - f7;
                                    int i17 = xn0Var.D;
                                    int i18 = xn0Var.x;
                                    if (f53 > i17 + i18) {
                                        f7 = (f52 - i17) - i18;
                                    }
                                    xn0Var.f = f44 + f7;
                                    xn0Var.d = f43 - f7;
                                    xn0Var.e -= f7;
                                }
                            } else if (i10 == 4) {
                                float f54 = xn0Var.f;
                                float f55 = xn0Var.d;
                                float f56 = f54 + f55 + f7;
                                float f57 = xn0Var.y + xn0Var.w;
                                if (f56 > f57) {
                                    f7 = (f57 - f54) - f55;
                                }
                                if (xn0Var.G) {
                                    float f58 = xn0Var.h;
                                    float f59 = xn0Var.e;
                                    float f60 = f58 + f59 + f10;
                                    float f61 = xn0Var.D + xn0Var.x;
                                    if (f60 > f61) {
                                        f10 = (f61 - f58) - f59;
                                    }
                                    xn0Var.d = f55 + f7;
                                    xn0Var.e = f59 + f10;
                                } else {
                                    float f62 = xn0Var.h;
                                    float f63 = f62 + f55 + f7;
                                    float f64 = xn0Var.D + xn0Var.x;
                                    if (f63 > f64) {
                                        f7 = (f64 - f62) - f55;
                                    }
                                    xn0Var.d = f55 + f7;
                                    xn0Var.e += f7;
                                }
                                if (xn0Var.d < 160.0f) {
                                    xn0Var.d = 160.0f;
                                }
                                if (xn0Var.e < 160.0f) {
                                    xn0Var.e = 160.0f;
                                }
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                            xn0Var.invalidate();
                            break;
                        }
                    } else {
                        xn0Var.n = 0;
                        break;
                    }
                } else {
                    float f65 = xn0Var.f;
                    float f66 = L;
                    float f67 = f65 - f66;
                    if (f67 < x12 && f65 + f66 > x12) {
                        float f68 = xn0Var.h;
                        if (f68 - f66 < y11 && f68 + f66 > y11) {
                            xn0Var.n = 1;
                            if (xn0Var.n != 0) {
                                xn0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                            break;
                        }
                    }
                    float f69 = xn0Var.d;
                    float f70 = f67 + f69;
                    if (f70 < x12 && f65 + f66 + f69 > x12) {
                        float f71 = xn0Var.h;
                        if (f71 - f66 < y11 && f71 + f66 > y11) {
                            xn0Var.n = 2;
                            if (xn0Var.n != 0) {
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                        }
                    }
                    if (f67 < x12 && f65 + f66 > x12) {
                        float f72 = xn0Var.h;
                        float f73 = xn0Var.e;
                        if ((f72 - f66) + f73 < y11 && f72 + f66 + f73 > y11) {
                            xn0Var.n = 3;
                            if (xn0Var.n != 0) {
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                        }
                    }
                    if (f70 < x12 && f65 + f66 + f69 > x12) {
                        float f74 = xn0Var.h;
                        float f75 = xn0Var.e;
                        if ((f74 - f66) + f75 < y11 && f74 + f66 + f75 > y11) {
                            xn0Var.n = 4;
                            if (xn0Var.n != 0) {
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                        }
                    }
                    if (f65 < x12 && f65 + f69 > x12) {
                        float f76 = xn0Var.h;
                        if (f76 < y11 && f76 + xn0Var.e > y11) {
                            xn0Var.n = 5;
                            if (xn0Var.n != 0) {
                            }
                            xn0Var.r = x12;
                            xn0Var.s = y11;
                        }
                    }
                    xn0Var.n = 0;
                    if (xn0Var.n != 0) {
                    }
                    xn0Var.r = x12;
                    xn0Var.s = y11;
                }
                break;
            case 5:
                jt0 jt0Var = (jt0) this.b;
                if (jt0Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) jt0Var.T).getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(jt0Var.T.getX(), jt0Var.T.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        jt0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                g31 g31Var = (g31) this.b;
                g31Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = g31Var.U1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                v91 v91Var = (v91) this.b;
                if (v91Var.S != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) v91Var.S).getBackgroundDrawable();
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(v91Var.S.getX(), v91Var.S.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        v91Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
