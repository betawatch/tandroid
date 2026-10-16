package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = k4Var.H) != null && m1Var.isShowing()) {
                    view.getHitRect(k4Var.C0);
                    if (!k4Var.C0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        k4Var.H.d(true);
                        break;
                    }
                }
                break;
            case 1:
                xt xtVar = (xt) this.b;
                xtVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!xtVar.n) {
                        xtVar.n();
                        break;
                    } else {
                        xtVar.o();
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
                    if (!externalActionActivity.d.j()) {
                        if (x10 <= i11 || x10 >= externalActionActivity.d.getView().getWidth() + i11 || y3 <= i12 || y3 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.a0((org.telegram.ui.ActionBar.m2) actionBarLayout.getFragmentStack().get(0), false);
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
                    if (!launchActivity.r0.j()) {
                        if (x11 <= i13 || x11 >= launchActivity.r0.getView().getWidth() + i13 || y10 <= i14 || y10 >= launchActivity.r0.getView().getHeight() + i14) {
                            if (!launchActivity.r0.getFragmentStack().isEmpty()) {
                                while (launchActivity.r0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.r0;
                                    actionBarLayout2.a0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.r0.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                pq0 pq0Var = (pq0) this.b;
                float x12 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = pq0Var.n) != 0) {
                            float f7 = x12 - pq0Var.r;
                            float f10 = y11 - pq0Var.s;
                            if (i10 == 5) {
                                float f11 = pq0Var.f + f7;
                                pq0Var.f = f11;
                                float f12 = pq0Var.h + f10;
                                pq0Var.h = f12;
                                int i15 = pq0Var.x;
                                float f13 = i15;
                                if (f11 < f13) {
                                    pq0Var.f = f13;
                                } else {
                                    float f14 = pq0Var.d;
                                    float f15 = f11 + f14;
                                    float f16 = i15 + pq0Var.v;
                                    if (f15 > f16) {
                                        pq0Var.f = f16 - f14;
                                    }
                                }
                                int i16 = pq0Var.y;
                                float f17 = i16;
                                if (f12 < f17) {
                                    pq0Var.h = f17;
                                } else {
                                    float f18 = pq0Var.e;
                                    float f19 = f12 + f18;
                                    float f20 = i16 + pq0Var.w;
                                    if (f19 > f20) {
                                        pq0Var.h = f20 - f18;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f21 = pq0Var.d;
                                if (f21 - f7 < 160.0f) {
                                    f7 = f21 - 160.0f;
                                }
                                float f22 = pq0Var.f;
                                float f23 = f22 + f7;
                                float f24 = pq0Var.x;
                                if (f23 < f24) {
                                    f7 = f24 - f22;
                                }
                                if (pq0Var.G) {
                                    float f25 = pq0Var.e;
                                    if (f25 - f10 < 160.0f) {
                                        f10 = f25 - 160.0f;
                                    }
                                    float f26 = pq0Var.h;
                                    float f27 = f26 + f10;
                                    float f28 = pq0Var.y;
                                    if (f27 < f28) {
                                        f10 = f28 - f26;
                                    }
                                    pq0Var.f = f22 + f7;
                                    pq0Var.h = f26 + f10;
                                    pq0Var.d = f21 - f7;
                                    pq0Var.e = f25 - f10;
                                } else {
                                    float f29 = pq0Var.h;
                                    float f30 = f29 + f7;
                                    float f31 = pq0Var.y;
                                    if (f30 < f31) {
                                        f7 = f31 - f29;
                                    }
                                    pq0Var.f = f22 + f7;
                                    pq0Var.h = f29 + f7;
                                    pq0Var.d = f21 - f7;
                                    pq0Var.e -= f7;
                                }
                            } else if (i10 == 2) {
                                float f32 = pq0Var.d;
                                if (f32 + f7 < 160.0f) {
                                    f7 = -(f32 - 160.0f);
                                }
                                float f33 = pq0Var.f;
                                float f34 = f33 + f32 + f7;
                                float f35 = pq0Var.x + pq0Var.v;
                                if (f34 > f35) {
                                    f7 = (f35 - f33) - f32;
                                }
                                if (pq0Var.G) {
                                    float f36 = pq0Var.e;
                                    if (f36 - f10 < 160.0f) {
                                        f10 = f36 - 160.0f;
                                    }
                                    float f37 = pq0Var.h;
                                    float f38 = f37 + f10;
                                    float f39 = pq0Var.y;
                                    if (f38 < f39) {
                                        f10 = f39 - f37;
                                    }
                                    pq0Var.h = f37 + f10;
                                    pq0Var.d = f32 + f7;
                                    pq0Var.e = f36 - f10;
                                } else {
                                    float f40 = pq0Var.h;
                                    float f41 = f40 - f7;
                                    float f42 = pq0Var.y;
                                    if (f41 < f42) {
                                        f7 = f40 - f42;
                                    }
                                    pq0Var.h = f40 - f7;
                                    pq0Var.d = f32 + f7;
                                    pq0Var.e += f7;
                                }
                            } else if (i10 == 3) {
                                float f43 = pq0Var.d;
                                if (f43 - f7 < 160.0f) {
                                    f7 = f43 - 160.0f;
                                }
                                float f44 = pq0Var.f;
                                float f45 = f44 + f7;
                                float f46 = pq0Var.x;
                                if (f45 < f46) {
                                    f7 = f46 - f44;
                                }
                                if (pq0Var.G) {
                                    float f47 = pq0Var.h;
                                    float f48 = pq0Var.e;
                                    float f49 = f47 + f48 + f10;
                                    float f50 = pq0Var.y + pq0Var.w;
                                    if (f49 > f50) {
                                        f10 = (f50 - f47) - f48;
                                    }
                                    pq0Var.f = f44 + f7;
                                    pq0Var.d = f43 - f7;
                                    float f51 = f48 + f10;
                                    pq0Var.e = f51;
                                    if (f51 < 160.0f) {
                                        pq0Var.e = 160.0f;
                                    }
                                } else {
                                    float f52 = pq0Var.h + f43;
                                    float f53 = f52 - f7;
                                    int i17 = pq0Var.y;
                                    int i18 = pq0Var.w;
                                    if (f53 > i17 + i18) {
                                        f7 = (f52 - i17) - i18;
                                    }
                                    pq0Var.f = f44 + f7;
                                    pq0Var.d = f43 - f7;
                                    pq0Var.e -= f7;
                                }
                            } else if (i10 == 4) {
                                float f54 = pq0Var.f;
                                float f55 = pq0Var.d;
                                float f56 = f54 + f55 + f7;
                                float f57 = pq0Var.x + pq0Var.v;
                                if (f56 > f57) {
                                    f7 = (f57 - f54) - f55;
                                }
                                if (pq0Var.G) {
                                    float f58 = pq0Var.h;
                                    float f59 = pq0Var.e;
                                    float f60 = f58 + f59 + f10;
                                    float f61 = pq0Var.y + pq0Var.w;
                                    if (f60 > f61) {
                                        f10 = (f61 - f58) - f59;
                                    }
                                    pq0Var.d = f55 + f7;
                                    pq0Var.e = f59 + f10;
                                } else {
                                    float f62 = pq0Var.h;
                                    float f63 = f62 + f55 + f7;
                                    float f64 = pq0Var.y + pq0Var.w;
                                    if (f63 > f64) {
                                        f7 = (f64 - f62) - f55;
                                    }
                                    pq0Var.d = f55 + f7;
                                    pq0Var.e += f7;
                                }
                                if (pq0Var.d < 160.0f) {
                                    pq0Var.d = 160.0f;
                                }
                                if (pq0Var.e < 160.0f) {
                                    pq0Var.e = 160.0f;
                                }
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                            pq0Var.invalidate();
                            break;
                        }
                    } else {
                        pq0Var.n = 0;
                        break;
                    }
                } else {
                    float f65 = pq0Var.f;
                    float f66 = dp;
                    float f67 = f65 - f66;
                    if (f67 < x12 && f65 + f66 > x12) {
                        float f68 = pq0Var.h;
                        if (f68 - f66 < y11 && f68 + f66 > y11) {
                            pq0Var.n = 1;
                            if (pq0Var.n != 0) {
                                pq0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                            break;
                        }
                    }
                    float f69 = pq0Var.d;
                    float f70 = f67 + f69;
                    if (f70 < x12 && f65 + f66 + f69 > x12) {
                        float f71 = pq0Var.h;
                        if (f71 - f66 < y11 && f71 + f66 > y11) {
                            pq0Var.n = 2;
                            if (pq0Var.n != 0) {
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                        }
                    }
                    if (f67 < x12 && f65 + f66 > x12) {
                        float f72 = pq0Var.h;
                        float f73 = pq0Var.e;
                        if ((f72 - f66) + f73 < y11 && f72 + f66 + f73 > y11) {
                            pq0Var.n = 3;
                            if (pq0Var.n != 0) {
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                        }
                    }
                    if (f70 < x12 && f65 + f66 + f69 > x12) {
                        float f74 = pq0Var.h;
                        float f75 = pq0Var.e;
                        if ((f74 - f66) + f75 < y11 && f74 + f66 + f75 > y11) {
                            pq0Var.n = 4;
                            if (pq0Var.n != 0) {
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                        }
                    }
                    if (f65 < x12 && f65 + f69 > x12) {
                        float f76 = pq0Var.h;
                        if (f76 < y11 && f76 + pq0Var.e > y11) {
                            pq0Var.n = 5;
                            if (pq0Var.n != 0) {
                            }
                            pq0Var.r = x12;
                            pq0Var.s = y11;
                        }
                    }
                    pq0Var.n = 0;
                    if (pq0Var.n != 0) {
                    }
                    pq0Var.r = x12;
                    pq0Var.s = y11;
                }
                break;
            case 5:
                rw0 rw0Var = (rw0) this.b;
                if (rw0Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) rw0Var.T).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(rw0Var.T.getX(), rw0Var.T.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        rw0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                r71 r71Var = (r71) this.b;
                r71Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = r71Var.T1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                re1 re1Var = (re1) this.b;
                if (re1Var.S != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) re1Var.S).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(re1Var.S.getX(), re1Var.S.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        re1Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
