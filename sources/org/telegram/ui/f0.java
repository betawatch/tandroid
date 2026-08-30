package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        int i10;
        Runnable runnable;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                l4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = l4Var.E) != null && p1Var.isShowing()) {
                    view.getHitRect(l4Var.z0);
                    if (!l4Var.z0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l4Var.E.d(true);
                        break;
                    }
                }
                break;
            case 1:
                pt ptVar = (pt) this.b;
                ptVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!ptVar.n) {
                        ptVar.n();
                        break;
                    } else {
                        ptVar.o();
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
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    if (!externalActionActivity.d.j()) {
                        if (x10 <= i11 || x10 >= externalActionActivity.d.getView().getWidth() + i11 || y10 <= i12 || y10 >= externalActionActivity.d.getView().getHeight() + i12) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.a0((org.telegram.ui.ActionBar.p2) actionBarLayout.getFragmentStack().get(0), false);
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
                if (!launchActivity.n0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.o0.getView().getLocationOnScreen(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!launchActivity.o0.j()) {
                        if (x11 <= i13 || x11 >= launchActivity.o0.getView().getWidth() + i13 || y11 <= i14 || y11 >= launchActivity.o0.getView().getHeight() + i14) {
                            if (!launchActivity.o0.getFragmentStack().isEmpty()) {
                                while (launchActivity.o0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.o0;
                                    actionBarLayout2.a0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.o0.l(true, false);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                qp0 qp0Var = (qp0) this.b;
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i10 = qp0Var.n) != 0) {
                            float f10 = x12 - qp0Var.r;
                            float f11 = y12 - qp0Var.s;
                            if (i10 == 5) {
                                float f12 = qp0Var.f + f10;
                                qp0Var.f = f12;
                                float f13 = qp0Var.h + f11;
                                qp0Var.h = f13;
                                int i15 = qp0Var.x;
                                float f14 = i15;
                                if (f12 < f14) {
                                    qp0Var.f = f14;
                                } else {
                                    float f15 = qp0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i15 + qp0Var.v;
                                    if (f16 > f17) {
                                        qp0Var.f = f17 - f15;
                                    }
                                }
                                int i16 = qp0Var.y;
                                float f18 = i16;
                                if (f13 < f18) {
                                    qp0Var.h = f18;
                                } else {
                                    float f19 = qp0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i16 + qp0Var.w;
                                    if (f20 > f21) {
                                        qp0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i10 == 1) {
                                float f22 = qp0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = qp0Var.f;
                                float f24 = f23 + f10;
                                float f25 = qp0Var.x;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (qp0Var.D) {
                                    float f26 = qp0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = qp0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = qp0Var.y;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    qp0Var.f = f23 + f10;
                                    qp0Var.h = f27 + f11;
                                    qp0Var.d = f22 - f10;
                                    qp0Var.e = f26 - f11;
                                } else {
                                    float f30 = qp0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = qp0Var.y;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    qp0Var.f = f23 + f10;
                                    qp0Var.h = f30 + f10;
                                    qp0Var.d = f22 - f10;
                                    qp0Var.e -= f10;
                                }
                            } else if (i10 == 2) {
                                float f33 = qp0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = qp0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = qp0Var.x + qp0Var.v;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (qp0Var.D) {
                                    float f37 = qp0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = qp0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = qp0Var.y;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    qp0Var.h = f38 + f11;
                                    qp0Var.d = f33 + f10;
                                    qp0Var.e = f37 - f11;
                                } else {
                                    float f41 = qp0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = qp0Var.y;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    qp0Var.h = f41 - f10;
                                    qp0Var.d = f33 + f10;
                                    qp0Var.e += f10;
                                }
                            } else if (i10 == 3) {
                                float f44 = qp0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = qp0Var.f;
                                float f46 = f45 + f10;
                                float f47 = qp0Var.x;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (qp0Var.D) {
                                    float f48 = qp0Var.h;
                                    float f49 = qp0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = qp0Var.y + qp0Var.w;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    qp0Var.f = f45 + f10;
                                    qp0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    qp0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        qp0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = qp0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i17 = qp0Var.y;
                                    int i18 = qp0Var.w;
                                    if (f54 > i17 + i18) {
                                        f10 = (f53 - i17) - i18;
                                    }
                                    qp0Var.f = f45 + f10;
                                    qp0Var.d = f44 - f10;
                                    qp0Var.e -= f10;
                                }
                            } else if (i10 == 4) {
                                float f55 = qp0Var.f;
                                float f56 = qp0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = qp0Var.x + qp0Var.v;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (qp0Var.D) {
                                    float f59 = qp0Var.h;
                                    float f60 = qp0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = qp0Var.y + qp0Var.w;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    qp0Var.d = f56 + f10;
                                    qp0Var.e = f60 + f11;
                                } else {
                                    float f63 = qp0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = qp0Var.y + qp0Var.w;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    qp0Var.d = f56 + f10;
                                    qp0Var.e += f10;
                                }
                                if (qp0Var.d < 160.0f) {
                                    qp0Var.d = 160.0f;
                                }
                                if (qp0Var.e < 160.0f) {
                                    qp0Var.e = 160.0f;
                                }
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                            qp0Var.invalidate();
                            break;
                        }
                    } else {
                        qp0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = qp0Var.f;
                    float f67 = dp;
                    float f68 = f66 - f67;
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f69 = qp0Var.h;
                        if (f69 - f67 < y12 && f69 + f67 > y12) {
                            qp0Var.n = 1;
                            if (qp0Var.n != 0) {
                                qp0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                            break;
                        }
                    }
                    float f70 = qp0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f72 = qp0Var.h;
                        if (f72 - f67 < y12 && f72 + f67 > y12) {
                            qp0Var.n = 2;
                            if (qp0Var.n != 0) {
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                        }
                    }
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f73 = qp0Var.h;
                        float f74 = qp0Var.e;
                        if ((f73 - f67) + f74 < y12 && f73 + f67 + f74 > y12) {
                            qp0Var.n = 3;
                            if (qp0Var.n != 0) {
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                        }
                    }
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f75 = qp0Var.h;
                        float f76 = qp0Var.e;
                        if ((f75 - f67) + f76 < y12 && f75 + f67 + f76 > y12) {
                            qp0Var.n = 4;
                            if (qp0Var.n != 0) {
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                        }
                    }
                    if (f66 < x12 && f66 + f70 > x12) {
                        float f77 = qp0Var.h;
                        if (f77 < y12 && f77 + qp0Var.e > y12) {
                            qp0Var.n = 5;
                            if (qp0Var.n != 0) {
                            }
                            qp0Var.r = x12;
                            qp0Var.s = y12;
                        }
                    }
                    qp0Var.n = 0;
                    if (qp0Var.n != 0) {
                    }
                    qp0Var.r = x12;
                    qp0Var.s = y12;
                }
                break;
            case 5:
                rv0 rv0Var = (rv0) this.b;
                if (rv0Var.Q != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) rv0Var.Q).getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(rv0Var.Q.getX(), rv0Var.Q.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        rv0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                q61 q61Var = (q61) this.b;
                q61Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = q61Var.Q1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                rd1 rd1Var = (rd1) this.b;
                if (rd1Var.P != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) rd1Var.P).getBackgroundDrawable();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(rd1Var.P.getX(), rd1Var.P.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        rd1Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
