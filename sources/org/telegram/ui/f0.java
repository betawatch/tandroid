package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        int i9;
        Runnable runnable;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.b;
                l4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = l4Var.D) != null && o1Var.isShowing()) {
                    view.getHitRect(l4Var.y0);
                    if (!l4Var.y0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l4Var.D.d(true);
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
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (!externalActionActivity.d.j()) {
                        if (x10 <= i10 || x10 >= externalActionActivity.d.getView().getWidth() + i10 || y10 <= i11 || y10 >= externalActionActivity.d.getView().getHeight() + i11) {
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
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.n0.getView().getLocationOnScreen(iArr2);
                    int i12 = iArr2[0];
                    int i13 = iArr2[1];
                    if (!launchActivity.n0.j()) {
                        if (x11 <= i12 || x11 >= launchActivity.n0.getView().getWidth() + i12 || y11 <= i13 || y11 >= launchActivity.n0.getView().getHeight() + i13) {
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
                jp0 jp0Var = (jp0) this.b;
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int dp = AndroidUtilities.dp(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i9 = jp0Var.n) != 0) {
                            float f10 = x12 - jp0Var.r;
                            float f11 = y12 - jp0Var.s;
                            if (i9 == 5) {
                                float f12 = jp0Var.f + f10;
                                jp0Var.f = f12;
                                float f13 = jp0Var.h + f11;
                                jp0Var.h = f13;
                                int i14 = jp0Var.x;
                                float f14 = i14;
                                if (f12 < f14) {
                                    jp0Var.f = f14;
                                } else {
                                    float f15 = jp0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i14 + jp0Var.v;
                                    if (f16 > f17) {
                                        jp0Var.f = f17 - f15;
                                    }
                                }
                                int i15 = jp0Var.y;
                                float f18 = i15;
                                if (f13 < f18) {
                                    jp0Var.h = f18;
                                } else {
                                    float f19 = jp0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i15 + jp0Var.w;
                                    if (f20 > f21) {
                                        jp0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i9 == 1) {
                                float f22 = jp0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = jp0Var.f;
                                float f24 = f23 + f10;
                                float f25 = jp0Var.x;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (jp0Var.C) {
                                    float f26 = jp0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = jp0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = jp0Var.y;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    jp0Var.f = f23 + f10;
                                    jp0Var.h = f27 + f11;
                                    jp0Var.d = f22 - f10;
                                    jp0Var.e = f26 - f11;
                                } else {
                                    float f30 = jp0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = jp0Var.y;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    jp0Var.f = f23 + f10;
                                    jp0Var.h = f30 + f10;
                                    jp0Var.d = f22 - f10;
                                    jp0Var.e -= f10;
                                }
                            } else if (i9 == 2) {
                                float f33 = jp0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = jp0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = jp0Var.x + jp0Var.v;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (jp0Var.C) {
                                    float f37 = jp0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = jp0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = jp0Var.y;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    jp0Var.h = f38 + f11;
                                    jp0Var.d = f33 + f10;
                                    jp0Var.e = f37 - f11;
                                } else {
                                    float f41 = jp0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = jp0Var.y;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    jp0Var.h = f41 - f10;
                                    jp0Var.d = f33 + f10;
                                    jp0Var.e += f10;
                                }
                            } else if (i9 == 3) {
                                float f44 = jp0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = jp0Var.f;
                                float f46 = f45 + f10;
                                float f47 = jp0Var.x;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (jp0Var.C) {
                                    float f48 = jp0Var.h;
                                    float f49 = jp0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = jp0Var.y + jp0Var.w;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    jp0Var.f = f45 + f10;
                                    jp0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    jp0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        jp0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = jp0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i16 = jp0Var.y;
                                    int i17 = jp0Var.w;
                                    if (f54 > i16 + i17) {
                                        f10 = (f53 - i16) - i17;
                                    }
                                    jp0Var.f = f45 + f10;
                                    jp0Var.d = f44 - f10;
                                    jp0Var.e -= f10;
                                }
                            } else if (i9 == 4) {
                                float f55 = jp0Var.f;
                                float f56 = jp0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = jp0Var.x + jp0Var.v;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (jp0Var.C) {
                                    float f59 = jp0Var.h;
                                    float f60 = jp0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = jp0Var.y + jp0Var.w;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    jp0Var.d = f56 + f10;
                                    jp0Var.e = f60 + f11;
                                } else {
                                    float f63 = jp0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = jp0Var.y + jp0Var.w;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    jp0Var.d = f56 + f10;
                                    jp0Var.e += f10;
                                }
                                if (jp0Var.d < 160.0f) {
                                    jp0Var.d = 160.0f;
                                }
                                if (jp0Var.e < 160.0f) {
                                    jp0Var.e = 160.0f;
                                }
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                            jp0Var.invalidate();
                            break;
                        }
                    } else {
                        jp0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = jp0Var.f;
                    float f67 = dp;
                    float f68 = f66 - f67;
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f69 = jp0Var.h;
                        if (f69 - f67 < y12 && f69 + f67 > y12) {
                            jp0Var.n = 1;
                            if (jp0Var.n != 0) {
                                jp0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                            break;
                        }
                    }
                    float f70 = jp0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f72 = jp0Var.h;
                        if (f72 - f67 < y12 && f72 + f67 > y12) {
                            jp0Var.n = 2;
                            if (jp0Var.n != 0) {
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                        }
                    }
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f73 = jp0Var.h;
                        float f74 = jp0Var.e;
                        if ((f73 - f67) + f74 < y12 && f73 + f67 + f74 > y12) {
                            jp0Var.n = 3;
                            if (jp0Var.n != 0) {
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                        }
                    }
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f75 = jp0Var.h;
                        float f76 = jp0Var.e;
                        if ((f75 - f67) + f76 < y12 && f75 + f67 + f76 > y12) {
                            jp0Var.n = 4;
                            if (jp0Var.n != 0) {
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                        }
                    }
                    if (f66 < x12 && f66 + f70 > x12) {
                        float f77 = jp0Var.h;
                        if (f77 < y12 && f77 + jp0Var.e > y12) {
                            jp0Var.n = 5;
                            if (jp0Var.n != 0) {
                            }
                            jp0Var.r = x12;
                            jp0Var.s = y12;
                        }
                    }
                    jp0Var.n = 0;
                    if (jp0Var.n != 0) {
                    }
                    jp0Var.r = x12;
                    jp0Var.s = y12;
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
                b61 b61Var = (b61) this.b;
                b61Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = b61Var.P1) != null) {
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
