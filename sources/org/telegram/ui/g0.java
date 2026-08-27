package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                m4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = m4Var.D) != null && n1Var.isShowing()) {
                    view.getHitRect(m4Var.y0);
                    if (!m4Var.y0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m4Var.D.d(true);
                        break;
                    }
                }
                break;
            case 1:
                kt ktVar = (kt) this.b;
                ktVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!ktVar.n) {
                        ktVar.n();
                        break;
                    } else {
                        ktVar.o();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (!externalActionActivity.d.j()) {
                        if (x8 <= i11 || x8 >= externalActionActivity.d.getView().getWidth() + i11 || y10 <= i12 || y10 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
                                }
                                externalActionActivity.d.l(true, false);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (!launchActivity.m0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.n0.getView().getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!launchActivity.n0.j()) {
                        if (x10 <= i13 || x10 >= launchActivity.n0.getView().getWidth() + i13 || y11 <= i14 || y11 >= launchActivity.n0.getView().getHeight() + i14) {
                            if (!launchActivity.n0.getFragmentStack().isEmpty()) {
                                while (launchActivity.n0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.n0;
                                    actionBarLayout2.a0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.n0.l(true, false);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                kp0 kp0Var = (kp0) this.b;
                float x11 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = kp0Var.n) != 0) {
                            float f10 = x11 - kp0Var.r;
                            float f11 = y12 - kp0Var.s;
                            if (i10 == 5) {
                                float f12 = kp0Var.f + f10;
                                kp0Var.f = f12;
                                float f13 = kp0Var.h + f11;
                                kp0Var.h = f13;
                                int i15 = kp0Var.x;
                                float f14 = i15;
                                if (f12 < f14) {
                                    kp0Var.f = f14;
                                } else {
                                    float f15 = kp0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i15 + kp0Var.v;
                                    if (f16 > f17) {
                                        kp0Var.f = f17 - f15;
                                    }
                                }
                                int i16 = kp0Var.y;
                                float f18 = i16;
                                if (f13 < f18) {
                                    kp0Var.h = f18;
                                } else {
                                    float f19 = kp0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i16 + kp0Var.w;
                                    if (f20 > f21) {
                                        kp0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f22 = kp0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = kp0Var.f;
                                float f24 = f23 + f10;
                                float f25 = kp0Var.x;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (kp0Var.C) {
                                    float f26 = kp0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = kp0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = kp0Var.y;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    kp0Var.f = f23 + f10;
                                    kp0Var.h = f27 + f11;
                                    kp0Var.d = f22 - f10;
                                    kp0Var.e = f26 - f11;
                                } else {
                                    float f30 = kp0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = kp0Var.y;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    kp0Var.f = f23 + f10;
                                    kp0Var.h = f30 + f10;
                                    kp0Var.d = f22 - f10;
                                    kp0Var.e -= f10;
                                }
                            } else if (i10 == 2) {
                                float f33 = kp0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = kp0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = kp0Var.x + kp0Var.v;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (kp0Var.C) {
                                    float f37 = kp0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = kp0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = kp0Var.y;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    kp0Var.h = f38 + f11;
                                    kp0Var.d = f33 + f10;
                                    kp0Var.e = f37 - f11;
                                } else {
                                    float f41 = kp0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = kp0Var.y;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    kp0Var.h = f41 - f10;
                                    kp0Var.d = f33 + f10;
                                    kp0Var.e += f10;
                                }
                            } else if (i10 == 3) {
                                float f44 = kp0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = kp0Var.f;
                                float f46 = f45 + f10;
                                float f47 = kp0Var.x;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (kp0Var.C) {
                                    float f48 = kp0Var.h;
                                    float f49 = kp0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = kp0Var.y + kp0Var.w;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    kp0Var.f = f45 + f10;
                                    kp0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    kp0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        kp0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = kp0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i17 = kp0Var.y;
                                    int i18 = kp0Var.w;
                                    if (f54 > i17 + i18) {
                                        f10 = (f53 - i17) - i18;
                                    }
                                    kp0Var.f = f45 + f10;
                                    kp0Var.d = f44 - f10;
                                    kp0Var.e -= f10;
                                }
                            } else if (i10 == 4) {
                                float f55 = kp0Var.f;
                                float f56 = kp0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = kp0Var.x + kp0Var.v;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (kp0Var.C) {
                                    float f59 = kp0Var.h;
                                    float f60 = kp0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = kp0Var.y + kp0Var.w;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    kp0Var.d = f56 + f10;
                                    kp0Var.e = f60 + f11;
                                } else {
                                    float f63 = kp0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = kp0Var.y + kp0Var.w;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    kp0Var.d = f56 + f10;
                                    kp0Var.e += f10;
                                }
                                if (kp0Var.d < 160.0f) {
                                    kp0Var.d = 160.0f;
                                }
                                if (kp0Var.e < 160.0f) {
                                    kp0Var.e = 160.0f;
                                }
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                            kp0Var.invalidate();
                            break;
                        }
                    } else {
                        kp0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = kp0Var.f;
                    float f67 = dp;
                    float f68 = f66 - f67;
                    if (f68 < x11 && f66 + f67 > x11) {
                        float f69 = kp0Var.h;
                        if (f69 - f67 < y12 && f69 + f67 > y12) {
                            kp0Var.n = 1;
                            if (kp0Var.n != 0) {
                                kp0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                            break;
                        }
                    }
                    float f70 = kp0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x11 && f66 + f67 + f70 > x11) {
                        float f72 = kp0Var.h;
                        if (f72 - f67 < y12 && f72 + f67 > y12) {
                            kp0Var.n = 2;
                            if (kp0Var.n != 0) {
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                        }
                    }
                    if (f68 < x11 && f66 + f67 > x11) {
                        float f73 = kp0Var.h;
                        float f74 = kp0Var.e;
                        if ((f73 - f67) + f74 < y12 && f73 + f67 + f74 > y12) {
                            kp0Var.n = 3;
                            if (kp0Var.n != 0) {
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                        }
                    }
                    if (f71 < x11 && f66 + f67 + f70 > x11) {
                        float f75 = kp0Var.h;
                        float f76 = kp0Var.e;
                        if ((f75 - f67) + f76 < y12 && f75 + f67 + f76 > y12) {
                            kp0Var.n = 4;
                            if (kp0Var.n != 0) {
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                        }
                    }
                    if (f66 < x11 && f66 + f70 > x11) {
                        float f77 = kp0Var.h;
                        if (f77 < y12 && f77 + kp0Var.e > y12) {
                            kp0Var.n = 5;
                            if (kp0Var.n != 0) {
                            }
                            kp0Var.r = x11;
                            kp0Var.s = y12;
                        }
                    }
                    kp0Var.n = 0;
                    if (kp0Var.n != 0) {
                    }
                    kp0Var.r = x11;
                    kp0Var.s = y12;
                }
                break;
            case 5:
                jv0 jv0Var = (jv0) this.b;
                if (jv0Var.P != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) jv0Var.P).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(jv0Var.P.getX(), jv0Var.P.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        jv0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                a61 a61Var = (a61) this.b;
                a61Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = a61Var.P1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                if (dd1Var.O != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) dd1Var.O).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(dd1Var.O.getX(), dd1Var.O.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        dd1Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
