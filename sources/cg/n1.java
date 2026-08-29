package cg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.r5;
import nh.q5;
import nh.qa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.z30;
import org.telegram.ui.a6;
import org.telegram.ui.dq;
import org.telegram.ui.f8;
import org.telegram.ui.fc;
import org.telegram.ui.h9;
import org.telegram.ui.jr;
import org.telegram.ui.ko;
import org.telegram.ui.kp;
import org.telegram.ui.la;
import org.telegram.ui.ob;
import org.telegram.ui.q4;
import org.telegram.ui.r9;
import org.telegram.ui.rp;
import org.telegram.ui.u6;
import org.telegram.ui.vc;
import org.telegram.ui.w9;
import org.telegram.ui.x6;
import org.telegram.ui.yo;
import org.telegram.ui.zb;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        Runnable runnable;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((p1) obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((r5) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((jh.q) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                kg.s sVar = (kg.s) obj;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((org.telegram.ui.i) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((org.telegram.ui.n) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((org.telegram.ui.r) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((q4) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((a6) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                x6 x6Var = (x6) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                x6.f0(x6Var, true);
                                break;
                            }
                        } else {
                            x6.f0(x6Var, false);
                            break;
                        }
                    } else {
                        x6Var.m0();
                        break;
                    }
                } else {
                    lVar = ((org.telegram.ui.ActionBar.o2) x6Var).actionBar;
                    if (!lVar.s()) {
                        x6Var.finishFragment();
                        break;
                    } else {
                        kh.b bVar = x6Var.U;
                        if (bVar != null) {
                            bVar.d();
                        }
                        u6 u6Var = x6Var.J;
                        if (u6Var != null) {
                            u6Var.e(false);
                            x6Var.J.d();
                            break;
                        }
                    }
                }
                break;
            case 10:
                f8 f8Var = (f8) obj;
                if (i10 == -1) {
                    if (f8Var.L != 0 || f8Var.M != 0 || f8Var.C) {
                        f8Var.C = false;
                        f8Var.L = 0;
                        f8Var.M = 0;
                        f8Var.t0();
                        f8Var.o0();
                        break;
                    } else {
                        f8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 11:
                h9 h9Var = (h9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        h9Var.p0(false);
                        break;
                    }
                } else {
                    lVar2 = ((org.telegram.ui.ActionBar.o2) h9Var).actionBar;
                    if (!lVar2.s()) {
                        h9Var.finishFragment();
                        break;
                    } else {
                        h9Var.k0(true);
                        break;
                    }
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((r9) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                w9 w9Var = (w9) obj;
                if (i10 != -1) {
                    if (i10 == 1 && w9Var.a.getText().length() != 0) {
                        w9.U(w9Var);
                        w9Var.finishFragment();
                        break;
                    }
                } else {
                    w9Var.finishFragment();
                    break;
                }
                break;
            case 14:
                la laVar = (la) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        la.Y(laVar);
                        la.Z(laVar);
                        break;
                    }
                } else {
                    laVar.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((ob) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                vc vcVar = (vc) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) vcVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vcVar.H.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        vcVar.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vcVar.H.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fc fcVar = new fc(vcVar, vcVar.getParentActivity(), canvas, (vcVar.H.getMeasuredWidth() / 2.0f) + f9, (vcVar.H.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 0);
                        vcVar.i0 = fcVar;
                        fcVar.setOnTouchListener(new mh.d(2));
                        vcVar.j0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vcVar.k0 = ofFloat;
                        ofFloat.addUpdateListener(new qa(vcVar, 1));
                        vcVar.k0.addListener(new q5(vcVar, 25));
                        vcVar.k0.setDuration(400L);
                        vcVar.k0.setInterpolator(ct.e);
                        vcVar.k0.start();
                        frameLayout.addView(vcVar.i0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zb(vcVar, 0));
                        break;
                    }
                } else if (vcVar.b >= vcVar.S0() && vcVar.Q0()) {
                    vcVar.V0();
                    break;
                } else {
                    vcVar.finishFragment();
                    break;
                }
                break;
            case 17:
                ko koVar = (ko) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        koVar.j0();
                        break;
                    }
                } else if (koVar.e0(true)) {
                    koVar.finishFragment();
                    break;
                }
                break;
            case 18:
                yo yoVar = (yo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ir irVar = yoVar.r;
                        if (irVar == null || irVar.c <= 0.0f) {
                            yoVar.Y();
                            break;
                        }
                    }
                } else {
                    yoVar.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((kp) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((rp) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                dq dqVar = (dq) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        dqVar.r0(true);
                        break;
                    }
                } else if (dqVar.m0(true)) {
                    dqVar.finishFragment();
                    break;
                }
                break;
            case 22:
                jr jrVar = (jr) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        jrVar.u0();
                        break;
                    }
                } else if (jrVar.g0(true)) {
                    jrVar.finishFragment();
                    break;
                }
                break;
            case 23:
                g8 g8Var = (g8) obj;
                if (i10 != -1) {
                    g8Var.t0(i10);
                    break;
                } else {
                    g8Var.dismiss();
                    break;
                }
            case 24:
                if (i10 == -1) {
                    ((xa) obj).dismiss();
                    break;
                }
                break;
            case 25:
                ni niVar = (ni) obj;
                if (i10 != -1) {
                    niVar.u0.t(i10);
                    break;
                } else if (!niVar.u0.i()) {
                    niVar.dismiss();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((z30) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1 && (runnable = ((ff0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((lg0) obj).dismiss();
                    break;
                }
                break;
            default:
                ((dq0) obj).onBackPressed();
                break;
        }
    }
}
