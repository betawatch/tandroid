package org.telegram.ui;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.h1 h1Var;
        int i7;
        Runnable runnable;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                g4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var = g4Var.I) != null && h1Var.isShowing()) {
                    view.getHitRect(g4Var.E0);
                    if (!g4Var.E0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g4Var.I.d(true);
                        break;
                    }
                }
                break;
            case 1:
                ns nsVar = (ns) this.b;
                nsVar.getClass();
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 6 || motionEvent.getAction() == 3) {
                    if (!nsVar.n) {
                        nsVar.m();
                        break;
                    } else {
                        nsVar.n();
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
                                    actionBarLayout.d0((org.telegram.ui.ActionBar.h2) actionBarLayout.getFragmentStack().get(0), false);
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
                if (!launchActivity.p0.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    int[] iArr2 = new int[2];
                    launchActivity.q0.getView().getLocationOnScreen(iArr2);
                    int i12 = iArr2[0];
                    int i13 = iArr2[1];
                    if (!launchActivity.q0.i()) {
                        if (x11 <= i12 || x11 >= launchActivity.q0.getView().getWidth() + i12 || y11 <= i13 || y11 >= launchActivity.q0.getView().getHeight() + i13) {
                            if (!launchActivity.q0.getFragmentStack().isEmpty()) {
                                while (launchActivity.q0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout2 = launchActivity.q0;
                                    actionBarLayout2.d0(actionBarLayout2.getFragmentStack().get(0), false);
                                }
                                launchActivity.q0.l(true, false);
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                rm0 rm0Var = (rm0) this.b;
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                int L = org.telegram.messenger.g0.L(14.0f);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2 && (i7 = rm0Var.n) != 0) {
                            float f10 = x12 - rm0Var.r;
                            float f11 = y12 - rm0Var.s;
                            if (i7 == 5) {
                                float f12 = rm0Var.f + f10;
                                rm0Var.f = f12;
                                float f13 = rm0Var.h + f11;
                                rm0Var.h = f13;
                                int i14 = rm0Var.y;
                                float f14 = i14;
                                if (f12 < f14) {
                                    rm0Var.f = f14;
                                } else {
                                    float f15 = rm0Var.d;
                                    float f16 = f12 + f15;
                                    float f17 = i14 + rm0Var.w;
                                    if (f16 > f17) {
                                        rm0Var.f = f17 - f15;
                                    }
                                }
                                int i15 = rm0Var.E;
                                float f18 = i15;
                                if (f13 < f18) {
                                    rm0Var.h = f18;
                                } else {
                                    float f19 = rm0Var.e;
                                    float f20 = f13 + f19;
                                    float f21 = i15 + rm0Var.x;
                                    if (f20 > f21) {
                                        rm0Var.h = f21 - f19;
                                    }
                                }
                            } else if (i7 == 1) {
                                float f22 = rm0Var.d;
                                if (f22 - f10 < 160.0f) {
                                    f10 = f22 - 160.0f;
                                }
                                float f23 = rm0Var.f;
                                float f24 = f23 + f10;
                                float f25 = rm0Var.y;
                                if (f24 < f25) {
                                    f10 = f25 - f23;
                                }
                                if (rm0Var.H) {
                                    float f26 = rm0Var.e;
                                    if (f26 - f11 < 160.0f) {
                                        f11 = f26 - 160.0f;
                                    }
                                    float f27 = rm0Var.h;
                                    float f28 = f27 + f11;
                                    float f29 = rm0Var.E;
                                    if (f28 < f29) {
                                        f11 = f29 - f27;
                                    }
                                    rm0Var.f = f23 + f10;
                                    rm0Var.h = f27 + f11;
                                    rm0Var.d = f22 - f10;
                                    rm0Var.e = f26 - f11;
                                } else {
                                    float f30 = rm0Var.h;
                                    float f31 = f30 + f10;
                                    float f32 = rm0Var.E;
                                    if (f31 < f32) {
                                        f10 = f32 - f30;
                                    }
                                    rm0Var.f = f23 + f10;
                                    rm0Var.h = f30 + f10;
                                    rm0Var.d = f22 - f10;
                                    rm0Var.e -= f10;
                                }
                            } else if (i7 == 2) {
                                float f33 = rm0Var.d;
                                if (f33 + f10 < 160.0f) {
                                    f10 = -(f33 - 160.0f);
                                }
                                float f34 = rm0Var.f;
                                float f35 = f34 + f33 + f10;
                                float f36 = rm0Var.y + rm0Var.w;
                                if (f35 > f36) {
                                    f10 = (f36 - f34) - f33;
                                }
                                if (rm0Var.H) {
                                    float f37 = rm0Var.e;
                                    if (f37 - f11 < 160.0f) {
                                        f11 = f37 - 160.0f;
                                    }
                                    float f38 = rm0Var.h;
                                    float f39 = f38 + f11;
                                    float f40 = rm0Var.E;
                                    if (f39 < f40) {
                                        f11 = f40 - f38;
                                    }
                                    rm0Var.h = f38 + f11;
                                    rm0Var.d = f33 + f10;
                                    rm0Var.e = f37 - f11;
                                } else {
                                    float f41 = rm0Var.h;
                                    float f42 = f41 - f10;
                                    float f43 = rm0Var.E;
                                    if (f42 < f43) {
                                        f10 = f41 - f43;
                                    }
                                    rm0Var.h = f41 - f10;
                                    rm0Var.d = f33 + f10;
                                    rm0Var.e += f10;
                                }
                            } else if (i7 == 3) {
                                float f44 = rm0Var.d;
                                if (f44 - f10 < 160.0f) {
                                    f10 = f44 - 160.0f;
                                }
                                float f45 = rm0Var.f;
                                float f46 = f45 + f10;
                                float f47 = rm0Var.y;
                                if (f46 < f47) {
                                    f10 = f47 - f45;
                                }
                                if (rm0Var.H) {
                                    float f48 = rm0Var.h;
                                    float f49 = rm0Var.e;
                                    float f50 = f48 + f49 + f11;
                                    float f51 = rm0Var.E + rm0Var.x;
                                    if (f50 > f51) {
                                        f11 = (f51 - f48) - f49;
                                    }
                                    rm0Var.f = f45 + f10;
                                    rm0Var.d = f44 - f10;
                                    float f52 = f49 + f11;
                                    rm0Var.e = f52;
                                    if (f52 < 160.0f) {
                                        rm0Var.e = 160.0f;
                                    }
                                } else {
                                    float f53 = rm0Var.h + f44;
                                    float f54 = f53 - f10;
                                    int i16 = rm0Var.E;
                                    int i17 = rm0Var.x;
                                    if (f54 > i16 + i17) {
                                        f10 = (f53 - i16) - i17;
                                    }
                                    rm0Var.f = f45 + f10;
                                    rm0Var.d = f44 - f10;
                                    rm0Var.e -= f10;
                                }
                            } else if (i7 == 4) {
                                float f55 = rm0Var.f;
                                float f56 = rm0Var.d;
                                float f57 = f55 + f56 + f10;
                                float f58 = rm0Var.y + rm0Var.w;
                                if (f57 > f58) {
                                    f10 = (f58 - f55) - f56;
                                }
                                if (rm0Var.H) {
                                    float f59 = rm0Var.h;
                                    float f60 = rm0Var.e;
                                    float f61 = f59 + f60 + f11;
                                    float f62 = rm0Var.E + rm0Var.x;
                                    if (f61 > f62) {
                                        f11 = (f62 - f59) - f60;
                                    }
                                    rm0Var.d = f56 + f10;
                                    rm0Var.e = f60 + f11;
                                } else {
                                    float f63 = rm0Var.h;
                                    float f64 = f63 + f56 + f10;
                                    float f65 = rm0Var.E + rm0Var.x;
                                    if (f64 > f65) {
                                        f10 = (f65 - f63) - f56;
                                    }
                                    rm0Var.d = f56 + f10;
                                    rm0Var.e += f10;
                                }
                                if (rm0Var.d < 160.0f) {
                                    rm0Var.d = 160.0f;
                                }
                                if (rm0Var.e < 160.0f) {
                                    rm0Var.e = 160.0f;
                                }
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                            rm0Var.invalidate();
                            break;
                        }
                    } else {
                        rm0Var.n = 0;
                        break;
                    }
                } else {
                    float f66 = rm0Var.f;
                    float f67 = L;
                    float f68 = f66 - f67;
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f69 = rm0Var.h;
                        if (f69 - f67 < y12 && f69 + f67 > y12) {
                            rm0Var.n = 1;
                            if (rm0Var.n != 0) {
                                rm0Var.requestDisallowInterceptTouchEvent(true);
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                            break;
                        }
                    }
                    float f70 = rm0Var.d;
                    float f71 = f68 + f70;
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f72 = rm0Var.h;
                        if (f72 - f67 < y12 && f72 + f67 > y12) {
                            rm0Var.n = 2;
                            if (rm0Var.n != 0) {
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                        }
                    }
                    if (f68 < x12 && f66 + f67 > x12) {
                        float f73 = rm0Var.h;
                        float f74 = rm0Var.e;
                        if ((f73 - f67) + f74 < y12 && f73 + f67 + f74 > y12) {
                            rm0Var.n = 3;
                            if (rm0Var.n != 0) {
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                        }
                    }
                    if (f71 < x12 && f66 + f67 + f70 > x12) {
                        float f75 = rm0Var.h;
                        float f76 = rm0Var.e;
                        if ((f75 - f67) + f76 < y12 && f75 + f67 + f76 > y12) {
                            rm0Var.n = 4;
                            if (rm0Var.n != 0) {
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                        }
                    }
                    if (f66 < x12 && f66 + f70 > x12) {
                        float f77 = rm0Var.h;
                        if (f77 < y12 && f77 + rm0Var.e > y12) {
                            rm0Var.n = 5;
                            if (rm0Var.n != 0) {
                            }
                            rm0Var.r = x12;
                            rm0Var.s = y12;
                        }
                    }
                    rm0Var.n = 0;
                    if (rm0Var.n != 0) {
                    }
                    rm0Var.r = x12;
                    rm0Var.s = y12;
                }
                break;
            case 5:
                as0 as0Var = (as0) this.b;
                if (as0Var.U != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) as0Var.U).getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(as0Var.U.getX(), as0Var.U.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        as0Var.c(true);
                        break;
                    }
                }
                break;
            case 6:
                r11 r11Var = (r11) this.b;
                r11Var.getClass();
                if (motionEvent.getAction() == 0 && (runnable = r11Var.V1) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                i81 i81Var = (i81) this.b;
                if (i81Var.T != null && motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable2 = ((ActionBarPopupWindow$ActionBarPopupWindowLayout) i81Var.T).getBackgroundDrawable();
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(backgroundDrawable2.getBounds());
                    rectF2.offset(i81Var.T.getX(), i81Var.T.getY());
                    if (!rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        i81Var.c(true);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
