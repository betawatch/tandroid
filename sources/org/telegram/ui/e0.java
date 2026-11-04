package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        int i3;
        Runnable runnable;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                i4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var = i4Var.I) != null && f1Var.isShowing()) {
                    view.getHitRect(i4Var.E0);
                    if (!i4Var.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        i4Var.I.d(true);
                        break;
                    }
                }
                break;
            case 1:
                is isVar = (is) this.b;
                isVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!isVar.n) {
                        isVar.m();
                        break;
                    } else {
                        isVar.n();
                        break;
                    }
                }
                break;
            case 2:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (!externalActionActivity.c.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x10 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    int[] iArr = new int[2];
                    externalActionActivity.d.getView().getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (!externalActionActivity.d.i()) {
                        if (x10 <= i10 || x10 >= externalActionActivity.d.getView().getWidth() + i10 || y9 <= i11 || y9 >= externalActionActivity.d.getView().getHeight() + i11) {
                            if (!externalActionActivity.d.getFragmentStack().isEmpty()) {
                                while (externalActionActivity.d.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout = externalActionActivity.d;
                                    actionBarLayout.d0((org.telegram.ui.ActionBar.d2) actionBarLayout.getFragmentStack().get(0), false);
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
                if (!launchActivity.r0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.s0.getView().getLocationOnScreen(iArr2);
                    int i12 = iArr2[0];
                    int i13 = iArr2[1];
                    if (!launchActivity.s0.i()) {
                        if (x11 <= i12 || x11 >= launchActivity.s0.getView().getWidth() + i12 || y10 <= i13 || y10 >= launchActivity.s0.getView().getHeight() + i13) {
                            if (!launchActivity.s0.getFragmentStack().isEmpty()) {
                                while (launchActivity.s0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.s0;
                                    actionBarLayout2.d0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.s0.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                im0 im0Var = (im0) this.b;
                float x12 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int L = org.telegram.messenger.g0.L(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i3 = im0Var.n) != 0) {
                            float f10 = x12 - im0Var.r;
                            float f11 = y11 - im0Var.s;
                            if (i3 == 5) {
                                float f12 = im0Var.f + f10;
                                im0Var.f = f12;
                                float f13 = im0Var.h + f11;
                                im0Var.h = f13;
                                int i14 = im0Var.y;
                                float f14 = i14;
                                if (f12 < f14) {
                                    im0Var.f = f14;
                                } else {
                                    float f15 = im0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i14 + im0Var.w;
                                    if (f16 > f17) {
                                        im0Var.f = f17 - f15;
                                    }
                                }
                                int i15 = im0Var.E;
                                float f18 = i15;
                                if (f13 < f18) {
                                    im0Var.h = f18;
                                } else {
                                    float f19 = im0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i15 + im0Var.x;
                                    if (f20 > f21) {
                                        im0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i3 == 1) {
                                float f22 = im0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = im0Var.f;
                                float f24 = f23 + f10;
                                float f25 = im0Var.y;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (im0Var.H) {
                                    float f26 = im0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = im0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = im0Var.E;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    im0Var.f = f23 + f10;
                                    im0Var.h = f27 + f11;
                                    im0Var.d = f22 - f10;
                                    im0Var.e = f26 - f11;
                                } else {
                                    float f30 = im0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = im0Var.E;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    im0Var.f = f23 + f10;
                                    im0Var.h = f30 + f10;
                                    im0Var.d = f22 - f10;
                                    im0Var.e -= f10;
                                }
                            } else if (i3 == 2) {
                                float f33 = im0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = im0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = im0Var.y + im0Var.w;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (im0Var.H) {
                                    float f37 = im0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = im0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = im0Var.E;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    im0Var.h = f38 + f11;
                                    im0Var.d = f33 + f10;
                                    im0Var.e = f37 - f11;
                                } else {
                                    float f41 = im0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = im0Var.E;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    im0Var.h = f41 - f10;
                                    im0Var.d = f33 + f10;
                                    im0Var.e += f10;
                                }
                            } else if (i3 == 3) {
                                float f44 = im0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = im0Var.f;
                                float f46 = f45 + f10;
                                float f47 = im0Var.y;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (im0Var.H) {
                                    float f48 = im0Var.h;
                                    float f49 = im0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = im0Var.E + im0Var.x;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    im0Var.f = f45 + f10;
                                    im0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    im0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        im0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = im0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i16 = im0Var.E;
                                    int i17 = im0Var.x;
                                    if (f54 > i16 + i17) {
                                        f10 = (f53 - i16) - i17;
                                    }
                                    im0Var.f = f45 + f10;
                                    im0Var.d = f44 - f10;
                                    im0Var.e -= f10;
                                }
                            } else if (i3 == 4) {
                                float f55 = im0Var.f;
                                float f56 = im0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = im0Var.y + im0Var.w;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (im0Var.H) {
                                    float f59 = im0Var.h;
                                    float f60 = im0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = im0Var.E + im0Var.x;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    im0Var.d = f56 + f10;
                                    im0Var.e = f60 + f11;
                                } else {
                                    float f63 = im0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = im0Var.E + im0Var.x;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    im0Var.d = f56 + f10;
                                    im0Var.e += f10;
                                }
                                if (im0Var.d < 160.0f) {
                                    im0Var.d = 160.0f;
                                }
                                if (im0Var.e < 160.0f) {
                                    im0Var.e = 160.0f;
                                }
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                            im0Var.invalidate();
                            break;
                        }
                    } else {
                        im0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = im0Var.f;
                    float f67 = L;
                    float f68 = f66 - f67;
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f69 = im0Var.h;
                        if (f69 - f67 < y11 && f69 + f67 > y11) {
                            im0Var.n = 1;
                            if (im0Var.n != 0) {
                                im0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                            break;
                        }
                    }
                    float f70 = im0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f72 = im0Var.h;
                        if (f72 - f67 < y11 && f72 + f67 > y11) {
                            im0Var.n = 2;
                            if (im0Var.n != 0) {
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                        }
                    }
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f73 = im0Var.h;
                        float f74 = im0Var.e;
                        if ((f73 - f67) + f74 < y11 && f73 + f67 + f74 > y11) {
                            im0Var.n = 3;
                            if (im0Var.n != 0) {
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                        }
                    }
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f75 = im0Var.h;
                        float f76 = im0Var.e;
                        if ((f75 - f67) + f76 < y11 && f75 + f67 + f76 > y11) {
                            im0Var.n = 4;
                            if (im0Var.n != 0) {
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                        }
                    }
                    if (f66 < x12 && f66 + f70 > x12) {
                        float f77 = im0Var.h;
                        if (f77 < y11 && f77 + im0Var.e > y11) {
                            im0Var.n = 5;
                            if (im0Var.n != 0) {
                            }
                            im0Var.r = x12;
                            im0Var.s = y11;
                        }
                    }
                    im0Var.n = 0;
                    if (im0Var.n != 0) {
                    }
                    im0Var.r = x12;
                    im0Var.s = y11;
                }
                break;
            case 5:
                pr0 pr0Var = (pr0) this.b;
                if (pr0Var.U != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) pr0Var.U).getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(pr0Var.U.getX(), pr0Var.U.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        pr0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                g11 g11Var = (g11) this.b;
                g11Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = g11Var.V1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                w71 w71Var = (w71) this.b;
                if (w71Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) w71Var.T).getBackgroundDrawable();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(w71Var.T.getX(), w71Var.T.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        w71Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
