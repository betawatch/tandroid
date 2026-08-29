package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                m4 m4Var = (m4) this.b;
                m4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = m4Var.D) != null && o1Var.isShowing()) {
                    view.getHitRect(m4Var.y0);
                    if (!m4Var.y0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m4Var.D.d(true);
                        break;
                    }
                }
                break;
            case 1:
                ht htVar = (ht) this.b;
                htVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!htVar.n) {
                        htVar.n();
                        break;
                    } else {
                        htVar.o();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x4 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (!externalActionActivity.d.j()) {
                        if (x4 <= i11 || x4 >= externalActionActivity.d.getView().getWidth() + i11 || y8 <= i12 || y8 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.a0((org.telegram.ui.ActionBar.o2) actionBarLayout.getFragmentStack().get(0), false);
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
                    float y10 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.n0.getView().getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!launchActivity.n0.j()) {
                        if (x10 <= i13 || x10 >= launchActivity.n0.getView().getWidth() + i13 || y10 <= i14 || y10 >= launchActivity.n0.getView().getHeight() + i14) {
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
                ip0 ip0Var = (ip0) this.b;
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = ip0Var.n) != 0) {
                            float f9 = x11 - ip0Var.r;
                            float f10 = y11 - ip0Var.s;
                            if (i10 == 5) {
                                float f11 = ip0Var.f + f9;
                                ip0Var.f = f11;
                                float f12 = ip0Var.h + f10;
                                ip0Var.h = f12;
                                int i15 = ip0Var.x;
                                float f13 = i15;
                                if (f11 < f13) {
                                    ip0Var.f = f13;
                                } else {
                                    float f14 = ip0Var.d;
                                    float f15 = f11 + f14;
                                    float f16 = i15 + ip0Var.v;
                                    if (f15 > f16) {
                                        ip0Var.f = f16 - f14;
                                    }
                                }
                                int i16 = ip0Var.y;
                                float f17 = i16;
                                if (f12 < f17) {
                                    ip0Var.h = f17;
                                } else {
                                    float f18 = ip0Var.e;
                                    float f19 = f12 + f18;
                                    float f20 = i16 + ip0Var.w;
                                    if (f19 > f20) {
                                        ip0Var.h = f20 - f18;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f21 = ip0Var.d;
                                if (f21 - f9 < 160.0f) {
                                    f9 = f21 - 160.0f;
                                }
                                float f22 = ip0Var.f;
                                float f23 = f22 + f9;
                                float f24 = ip0Var.x;
                                if (f23 < f24) {
                                    f9 = f24 - f22;
                                }
                                if (ip0Var.C) {
                                    float f25 = ip0Var.e;
                                    if (f25 - f10 < 160.0f) {
                                        f10 = f25 - 160.0f;
                                    }
                                    float f26 = ip0Var.h;
                                    float f27 = f26 + f10;
                                    float f28 = ip0Var.y;
                                    if (f27 < f28) {
                                        f10 = f28 - f26;
                                    }
                                    ip0Var.f = f22 + f9;
                                    ip0Var.h = f26 + f10;
                                    ip0Var.d = f21 - f9;
                                    ip0Var.e = f25 - f10;
                                } else {
                                    float f29 = ip0Var.h;
                                    float f30 = f29 + f9;
                                    float f31 = ip0Var.y;
                                    if (f30 < f31) {
                                        f9 = f31 - f29;
                                    }
                                    ip0Var.f = f22 + f9;
                                    ip0Var.h = f29 + f9;
                                    ip0Var.d = f21 - f9;
                                    ip0Var.e -= f9;
                                }
                            } else if (i10 == 2) {
                                float f32 = ip0Var.d;
                                if (f32 + f9 < 160.0f) {
                                    f9 = -(f32 - 160.0f);
                                }
                                float f33 = ip0Var.f;
                                float f34 = f33 + f32 + f9;
                                float f35 = ip0Var.x + ip0Var.v;
                                if (f34 > f35) {
                                    f9 = (f35 - f33) - f32;
                                }
                                if (ip0Var.C) {
                                    float f36 = ip0Var.e;
                                    if (f36 - f10 < 160.0f) {
                                        f10 = f36 - 160.0f;
                                    }
                                    float f37 = ip0Var.h;
                                    float f38 = f37 + f10;
                                    float f39 = ip0Var.y;
                                    if (f38 < f39) {
                                        f10 = f39 - f37;
                                    }
                                    ip0Var.h = f37 + f10;
                                    ip0Var.d = f32 + f9;
                                    ip0Var.e = f36 - f10;
                                } else {
                                    float f40 = ip0Var.h;
                                    float f41 = f40 - f9;
                                    float f42 = ip0Var.y;
                                    if (f41 < f42) {
                                        f9 = f40 - f42;
                                    }
                                    ip0Var.h = f40 - f9;
                                    ip0Var.d = f32 + f9;
                                    ip0Var.e += f9;
                                }
                            } else if (i10 == 3) {
                                float f43 = ip0Var.d;
                                if (f43 - f9 < 160.0f) {
                                    f9 = f43 - 160.0f;
                                }
                                float f44 = ip0Var.f;
                                float f45 = f44 + f9;
                                float f46 = ip0Var.x;
                                if (f45 < f46) {
                                    f9 = f46 - f44;
                                }
                                if (ip0Var.C) {
                                    float f47 = ip0Var.h;
                                    float f48 = ip0Var.e;
                                    float f49 = f47 + f48 + f10;
                                    float f50 = ip0Var.y + ip0Var.w;
                                    if (f49 > f50) {
                                        f10 = (f50 - f47) - f48;
                                    }
                                    ip0Var.f = f44 + f9;
                                    ip0Var.d = f43 - f9;
                                    float f51 = f48 + f10;
                                    ip0Var.e = f51;
                                    if (f51 < 160.0f) {
                                        ip0Var.e = 160.0f;
                                    }
                                } else {
                                    float f52 = ip0Var.h + f43;
                                    float f53 = f52 - f9;
                                    int i17 = ip0Var.y;
                                    int i18 = ip0Var.w;
                                    if (f53 > i17 + i18) {
                                        f9 = (f52 - i17) - i18;
                                    }
                                    ip0Var.f = f44 + f9;
                                    ip0Var.d = f43 - f9;
                                    ip0Var.e -= f9;
                                }
                            } else if (i10 == 4) {
                                float f54 = ip0Var.f;
                                float f55 = ip0Var.d;
                                float f56 = f54 + f55 + f9;
                                float f57 = ip0Var.x + ip0Var.v;
                                if (f56 > f57) {
                                    f9 = (f57 - f54) - f55;
                                }
                                if (ip0Var.C) {
                                    float f58 = ip0Var.h;
                                    float f59 = ip0Var.e;
                                    float f60 = f58 + f59 + f10;
                                    float f61 = ip0Var.y + ip0Var.w;
                                    if (f60 > f61) {
                                        f10 = (f61 - f58) - f59;
                                    }
                                    ip0Var.d = f55 + f9;
                                    ip0Var.e = f59 + f10;
                                } else {
                                    float f62 = ip0Var.h;
                                    float f63 = f62 + f55 + f9;
                                    float f64 = ip0Var.y + ip0Var.w;
                                    if (f63 > f64) {
                                        f9 = (f64 - f62) - f55;
                                    }
                                    ip0Var.d = f55 + f9;
                                    ip0Var.e += f9;
                                }
                                if (ip0Var.d < 160.0f) {
                                    ip0Var.d = 160.0f;
                                }
                                if (ip0Var.e < 160.0f) {
                                    ip0Var.e = 160.0f;
                                }
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                            ip0Var.invalidate();
                            break;
                        }
                    } else {
                        ip0Var.n = 0;
                        break;
                    }
                } else {
                    float f65 = ip0Var.f;
                    float f66 = dp;
                    float f67 = f65 - f66;
                    if (f67 < x11 && f65 + f66 > x11) {
                        float f68 = ip0Var.h;
                        if (f68 - f66 < y11 && f68 + f66 > y11) {
                            ip0Var.n = 1;
                            if (ip0Var.n != 0) {
                                ip0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                            break;
                        }
                    }
                    float f69 = ip0Var.d;
                    float f70 = f67 + f69;
                    if (f70 < x11 && f65 + f66 + f69 > x11) {
                        float f71 = ip0Var.h;
                        if (f71 - f66 < y11 && f71 + f66 > y11) {
                            ip0Var.n = 2;
                            if (ip0Var.n != 0) {
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                        }
                    }
                    if (f67 < x11 && f65 + f66 > x11) {
                        float f72 = ip0Var.h;
                        float f73 = ip0Var.e;
                        if ((f72 - f66) + f73 < y11 && f72 + f66 + f73 > y11) {
                            ip0Var.n = 3;
                            if (ip0Var.n != 0) {
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                        }
                    }
                    if (f70 < x11 && f65 + f66 + f69 > x11) {
                        float f74 = ip0Var.h;
                        float f75 = ip0Var.e;
                        if ((f74 - f66) + f75 < y11 && f74 + f66 + f75 > y11) {
                            ip0Var.n = 4;
                            if (ip0Var.n != 0) {
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                        }
                    }
                    if (f65 < x11 && f65 + f69 > x11) {
                        float f76 = ip0Var.h;
                        if (f76 < y11 && f76 + ip0Var.e > y11) {
                            ip0Var.n = 5;
                            if (ip0Var.n != 0) {
                            }
                            ip0Var.r = x11;
                            ip0Var.s = y11;
                        }
                    }
                    ip0Var.n = 0;
                    if (ip0Var.n != 0) {
                    }
                    ip0Var.r = x11;
                    ip0Var.s = y11;
                }
                break;
            case 5:
                iv0 iv0Var = (iv0) this.b;
                if (iv0Var.P != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) iv0Var.P).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(iv0Var.P.getX(), iv0Var.P.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        iv0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                d61 d61Var = (d61) this.b;
                d61Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = d61Var.P1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                fd1 fd1Var = (fd1) this.b;
                if (fd1Var.O != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) fd1Var.O).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(fd1Var.O.getX(), fd1Var.O.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        fd1Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
