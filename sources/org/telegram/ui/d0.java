package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                j4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = j4Var.H) != null && o1Var.isShowing()) {
                    view.getHitRect(j4Var.D0);
                    if (!j4Var.D0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        j4Var.H.d(true);
                        break;
                    }
                }
                break;
            case 1:
                ht htVar = (ht) this.b;
                htVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!htVar.n) {
                        htVar.l();
                        break;
                    } else {
                        htVar.m();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x9 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (!externalActionActivity.d.i()) {
                        if (x9 <= i11 || x9 >= externalActionActivity.d.getView().getWidth() + i11 || y3 <= i12 || y3 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.c0((org.telegram.ui.ActionBar.r2) actionBarLayout.getFragmentStack().get(0), false);
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
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.r0.getView().getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!launchActivity.r0.i()) {
                        if (x10 <= i13 || x10 >= launchActivity.r0.getView().getWidth() + i13 || y10 <= i14 || y10 >= launchActivity.r0.getView().getHeight() + i14) {
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
                dq0 dq0Var = (dq0) this.b;
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = dq0Var.n) != 0) {
                            float f7 = x11 - dq0Var.r;
                            float f10 = y11 - dq0Var.s;
                            if (i10 == 5) {
                                float f11 = dq0Var.f + f7;
                                dq0Var.f = f11;
                                float f12 = dq0Var.h + f10;
                                dq0Var.h = f12;
                                int i15 = dq0Var.x;
                                float f13 = i15;
                                if (f11 < f13) {
                                    dq0Var.f = f13;
                                } else {
                                    float f14 = dq0Var.d;
                                    float f15 = f11 + f14;
                                    float f16 = i15 + dq0Var.v;
                                    if (f15 > f16) {
                                        dq0Var.f = f16 - f14;
                                    }
                                }
                                int i16 = dq0Var.y;
                                float f17 = i16;
                                if (f12 < f17) {
                                    dq0Var.h = f17;
                                } else {
                                    float f18 = dq0Var.e;
                                    float f19 = f12 + f18;
                                    float f20 = i16 + dq0Var.w;
                                    if (f19 > f20) {
                                        dq0Var.h = f20 - f18;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f21 = dq0Var.d;
                                if (f21 - f7 < 160.0f) {
                                    f7 = f21 - 160.0f;
                                }
                                float f22 = dq0Var.f;
                                float f23 = f22 + f7;
                                float f24 = dq0Var.x;
                                if (f23 < f24) {
                                    f7 = f24 - f22;
                                }
                                if (dq0Var.G) {
                                    float f25 = dq0Var.e;
                                    if (f25 - f10 < 160.0f) {
                                        f10 = f25 - 160.0f;
                                    }
                                    float f26 = dq0Var.h;
                                    float f27 = f26 + f10;
                                    float f28 = dq0Var.y;
                                    if (f27 < f28) {
                                        f10 = f28 - f26;
                                    }
                                    dq0Var.f = f22 + f7;
                                    dq0Var.h = f26 + f10;
                                    dq0Var.d = f21 - f7;
                                    dq0Var.e = f25 - f10;
                                } else {
                                    float f29 = dq0Var.h;
                                    float f30 = f29 + f7;
                                    float f31 = dq0Var.y;
                                    if (f30 < f31) {
                                        f7 = f31 - f29;
                                    }
                                    dq0Var.f = f22 + f7;
                                    dq0Var.h = f29 + f7;
                                    dq0Var.d = f21 - f7;
                                    dq0Var.e -= f7;
                                }
                            } else if (i10 == 2) {
                                float f32 = dq0Var.d;
                                if (f32 + f7 < 160.0f) {
                                    f7 = -(f32 - 160.0f);
                                }
                                float f33 = dq0Var.f;
                                float f34 = f33 + f32 + f7;
                                float f35 = dq0Var.x + dq0Var.v;
                                if (f34 > f35) {
                                    f7 = (f35 - f33) - f32;
                                }
                                if (dq0Var.G) {
                                    float f36 = dq0Var.e;
                                    if (f36 - f10 < 160.0f) {
                                        f10 = f36 - 160.0f;
                                    }
                                    float f37 = dq0Var.h;
                                    float f38 = f37 + f10;
                                    float f39 = dq0Var.y;
                                    if (f38 < f39) {
                                        f10 = f39 - f37;
                                    }
                                    dq0Var.h = f37 + f10;
                                    dq0Var.d = f32 + f7;
                                    dq0Var.e = f36 - f10;
                                } else {
                                    float f40 = dq0Var.h;
                                    float f41 = f40 - f7;
                                    float f42 = dq0Var.y;
                                    if (f41 < f42) {
                                        f7 = f40 - f42;
                                    }
                                    dq0Var.h = f40 - f7;
                                    dq0Var.d = f32 + f7;
                                    dq0Var.e += f7;
                                }
                            } else if (i10 == 3) {
                                float f43 = dq0Var.d;
                                if (f43 - f7 < 160.0f) {
                                    f7 = f43 - 160.0f;
                                }
                                float f44 = dq0Var.f;
                                float f45 = f44 + f7;
                                float f46 = dq0Var.x;
                                if (f45 < f46) {
                                    f7 = f46 - f44;
                                }
                                if (dq0Var.G) {
                                    float f47 = dq0Var.h;
                                    float f48 = dq0Var.e;
                                    float f49 = f47 + f48 + f10;
                                    float f50 = dq0Var.y + dq0Var.w;
                                    if (f49 > f50) {
                                        f10 = (f50 - f47) - f48;
                                    }
                                    dq0Var.f = f44 + f7;
                                    dq0Var.d = f43 - f7;
                                    float f51 = f48 + f10;
                                    dq0Var.e = f51;
                                    if (f51 < 160.0f) {
                                        dq0Var.e = 160.0f;
                                    }
                                } else {
                                    float f52 = dq0Var.h + f43;
                                    float f53 = f52 - f7;
                                    int i17 = dq0Var.y;
                                    int i18 = dq0Var.w;
                                    if (f53 > i17 + i18) {
                                        f7 = (f52 - i17) - i18;
                                    }
                                    dq0Var.f = f44 + f7;
                                    dq0Var.d = f43 - f7;
                                    dq0Var.e -= f7;
                                }
                            } else if (i10 == 4) {
                                float f54 = dq0Var.f;
                                float f55 = dq0Var.d;
                                float f56 = f54 + f55 + f7;
                                float f57 = dq0Var.x + dq0Var.v;
                                if (f56 > f57) {
                                    f7 = (f57 - f54) - f55;
                                }
                                if (dq0Var.G) {
                                    float f58 = dq0Var.h;
                                    float f59 = dq0Var.e;
                                    float f60 = f58 + f59 + f10;
                                    float f61 = dq0Var.y + dq0Var.w;
                                    if (f60 > f61) {
                                        f10 = (f61 - f58) - f59;
                                    }
                                    dq0Var.d = f55 + f7;
                                    dq0Var.e = f59 + f10;
                                } else {
                                    float f62 = dq0Var.h;
                                    float f63 = f62 + f55 + f7;
                                    float f64 = dq0Var.y + dq0Var.w;
                                    if (f63 > f64) {
                                        f7 = (f64 - f62) - f55;
                                    }
                                    dq0Var.d = f55 + f7;
                                    dq0Var.e += f7;
                                }
                                if (dq0Var.d < 160.0f) {
                                    dq0Var.d = 160.0f;
                                }
                                if (dq0Var.e < 160.0f) {
                                    dq0Var.e = 160.0f;
                                }
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                            dq0Var.invalidate();
                            break;
                        }
                    } else {
                        dq0Var.n = 0;
                        break;
                    }
                } else {
                    float f65 = dq0Var.f;
                    float f66 = dp;
                    float f67 = f65 - f66;
                    if (f67 < x11 && f65 + f66 > x11) {
                        float f68 = dq0Var.h;
                        if (f68 - f66 < y11 && f68 + f66 > y11) {
                            dq0Var.n = 1;
                            if (dq0Var.n != 0) {
                                dq0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                            break;
                        }
                    }
                    float f69 = dq0Var.d;
                    float f70 = f67 + f69;
                    if (f70 < x11 && f65 + f66 + f69 > x11) {
                        float f71 = dq0Var.h;
                        if (f71 - f66 < y11 && f71 + f66 > y11) {
                            dq0Var.n = 2;
                            if (dq0Var.n != 0) {
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                        }
                    }
                    if (f67 < x11 && f65 + f66 > x11) {
                        float f72 = dq0Var.h;
                        float f73 = dq0Var.e;
                        if ((f72 - f66) + f73 < y11 && f72 + f66 + f73 > y11) {
                            dq0Var.n = 3;
                            if (dq0Var.n != 0) {
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                        }
                    }
                    if (f70 < x11 && f65 + f66 + f69 > x11) {
                        float f74 = dq0Var.h;
                        float f75 = dq0Var.e;
                        if ((f74 - f66) + f75 < y11 && f74 + f66 + f75 > y11) {
                            dq0Var.n = 4;
                            if (dq0Var.n != 0) {
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                        }
                    }
                    if (f65 < x11 && f65 + f69 > x11) {
                        float f76 = dq0Var.h;
                        if (f76 < y11 && f76 + dq0Var.e > y11) {
                            dq0Var.n = 5;
                            if (dq0Var.n != 0) {
                            }
                            dq0Var.r = x11;
                            dq0Var.s = y11;
                        }
                    }
                    dq0Var.n = 0;
                    if (dq0Var.n != 0) {
                    }
                    dq0Var.r = x11;
                    dq0Var.s = y11;
                }
                break;
            case 5:
                zv0 zv0Var = (zv0) this.b;
                if (zv0Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) zv0Var.T).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(zv0Var.T.getX(), zv0Var.T.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        zv0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                f61 f61Var = (f61) this.b;
                f61Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = f61Var.U1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                kd1 kd1Var = (kd1) this.b;
                if (kd1Var.S != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) kd1Var.S).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(kd1Var.S.getX(), kd1Var.S.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        kd1Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
