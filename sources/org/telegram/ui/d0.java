package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        int i7;
        Runnable runnable;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                g4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = g4Var.H) != null && g1Var.isShowing()) {
                    view.getHitRect(g4Var.D0);
                    if (!g4Var.D0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g4Var.H.d(true);
                        break;
                    }
                }
                break;
            case 1:
                ks ksVar = (ks) this.b;
                ksVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!ksVar.n) {
                        ksVar.m();
                        break;
                    } else {
                        ksVar.n();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (!externalActionActivity.d.i()) {
                        if (x10 <= i10 || x10 >= externalActionActivity.d.getView().getWidth() + i10 || y10 <= i11 || y10 >= externalActionActivity.d.getView().getHeight() + i11) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.d0((org.telegram.ui.ActionBar.f2) actionBarLayout.getFragmentStack().get(0), false);
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
                if (!launchActivity.o0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.p0.getView().getLocationOnScreen(iArr2);
                    int i12 = iArr2[0];
                    int i13 = iArr2[1];
                    if (!launchActivity.p0.i()) {
                        if (x11 <= i12 || x11 >= launchActivity.p0.getView().getWidth() + i12 || y11 <= i13 || y11 >= launchActivity.p0.getView().getHeight() + i13) {
                            if (!launchActivity.p0.getFragmentStack().isEmpty()) {
                                while (launchActivity.p0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.p0;
                                    actionBarLayout2.d0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.p0.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                nm0 nm0Var = (nm0) this.b;
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int L = org.telegram.messenger.g0.L(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i7 = nm0Var.n) != 0) {
                            float f10 = x12 - nm0Var.r;
                            float f11 = y12 - nm0Var.s;
                            if (i7 == 5) {
                                float f12 = nm0Var.f + f10;
                                nm0Var.f = f12;
                                float f13 = nm0Var.h + f11;
                                nm0Var.h = f13;
                                int i14 = nm0Var.y;
                                float f14 = i14;
                                if (f12 < f14) {
                                    nm0Var.f = f14;
                                } else {
                                    float f15 = nm0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i14 + nm0Var.w;
                                    if (f16 > f17) {
                                        nm0Var.f = f17 - f15;
                                    }
                                }
                                int i15 = nm0Var.D;
                                float f18 = i15;
                                if (f13 < f18) {
                                    nm0Var.h = f18;
                                } else {
                                    float f19 = nm0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i15 + nm0Var.x;
                                    if (f20 > f21) {
                                        nm0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i7 == 1) {
                                float f22 = nm0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = nm0Var.f;
                                float f24 = f23 + f10;
                                float f25 = nm0Var.y;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (nm0Var.G) {
                                    float f26 = nm0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = nm0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = nm0Var.D;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    nm0Var.f = f23 + f10;
                                    nm0Var.h = f27 + f11;
                                    nm0Var.d = f22 - f10;
                                    nm0Var.e = f26 - f11;
                                } else {
                                    float f30 = nm0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = nm0Var.D;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    nm0Var.f = f23 + f10;
                                    nm0Var.h = f30 + f10;
                                    nm0Var.d = f22 - f10;
                                    nm0Var.e -= f10;
                                }
                            } else if (i7 == 2) {
                                float f33 = nm0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = nm0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = nm0Var.y + nm0Var.w;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (nm0Var.G) {
                                    float f37 = nm0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = nm0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = nm0Var.D;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    nm0Var.h = f38 + f11;
                                    nm0Var.d = f33 + f10;
                                    nm0Var.e = f37 - f11;
                                } else {
                                    float f41 = nm0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = nm0Var.D;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    nm0Var.h = f41 - f10;
                                    nm0Var.d = f33 + f10;
                                    nm0Var.e += f10;
                                }
                            } else if (i7 == 3) {
                                float f44 = nm0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = nm0Var.f;
                                float f46 = f45 + f10;
                                float f47 = nm0Var.y;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (nm0Var.G) {
                                    float f48 = nm0Var.h;
                                    float f49 = nm0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = nm0Var.D + nm0Var.x;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    nm0Var.f = f45 + f10;
                                    nm0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    nm0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        nm0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = nm0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i16 = nm0Var.D;
                                    int i17 = nm0Var.x;
                                    if (f54 > i16 + i17) {
                                        f10 = (f53 - i16) - i17;
                                    }
                                    nm0Var.f = f45 + f10;
                                    nm0Var.d = f44 - f10;
                                    nm0Var.e -= f10;
                                }
                            } else if (i7 == 4) {
                                float f55 = nm0Var.f;
                                float f56 = nm0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = nm0Var.y + nm0Var.w;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (nm0Var.G) {
                                    float f59 = nm0Var.h;
                                    float f60 = nm0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = nm0Var.D + nm0Var.x;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    nm0Var.d = f56 + f10;
                                    nm0Var.e = f60 + f11;
                                } else {
                                    float f63 = nm0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = nm0Var.D + nm0Var.x;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    nm0Var.d = f56 + f10;
                                    nm0Var.e += f10;
                                }
                                if (nm0Var.d < 160.0f) {
                                    nm0Var.d = 160.0f;
                                }
                                if (nm0Var.e < 160.0f) {
                                    nm0Var.e = 160.0f;
                                }
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                            nm0Var.invalidate();
                            break;
                        }
                    } else {
                        nm0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = nm0Var.f;
                    float f67 = L;
                    float f68 = f66 - f67;
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f69 = nm0Var.h;
                        if (f69 - f67 < y12 && f69 + f67 > y12) {
                            nm0Var.n = 1;
                            if (nm0Var.n != 0) {
                                nm0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                            break;
                        }
                    }
                    float f70 = nm0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f72 = nm0Var.h;
                        if (f72 - f67 < y12 && f72 + f67 > y12) {
                            nm0Var.n = 2;
                            if (nm0Var.n != 0) {
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                        }
                    }
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f73 = nm0Var.h;
                        float f74 = nm0Var.e;
                        if ((f73 - f67) + f74 < y12 && f73 + f67 + f74 > y12) {
                            nm0Var.n = 3;
                            if (nm0Var.n != 0) {
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                        }
                    }
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f75 = nm0Var.h;
                        float f76 = nm0Var.e;
                        if ((f75 - f67) + f76 < y12 && f75 + f67 + f76 > y12) {
                            nm0Var.n = 4;
                            if (nm0Var.n != 0) {
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                        }
                    }
                    if (f66 < x12 && f66 + f70 > x12) {
                        float f77 = nm0Var.h;
                        if (f77 < y12 && f77 + nm0Var.e > y12) {
                            nm0Var.n = 5;
                            if (nm0Var.n != 0) {
                            }
                            nm0Var.r = x12;
                            nm0Var.s = y12;
                        }
                    }
                    nm0Var.n = 0;
                    if (nm0Var.n != 0) {
                    }
                    nm0Var.r = x12;
                    nm0Var.s = y12;
                }
                break;
            case 5:
                zr0 zr0Var = (zr0) this.b;
                if (zr0Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) zr0Var.T).getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(zr0Var.T.getX(), zr0Var.T.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        zr0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                q11 q11Var = (q11) this.b;
                q11Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = q11Var.U1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                g81 g81Var = (g81) this.b;
                if (g81Var.S != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) g81Var.S).getBackgroundDrawable();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(g81Var.S.getX(), g81Var.S.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        g81Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
