package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ga extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Runnable runnable;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ua uaVar = (ua) obj;
                if (i10 == -1) {
                    uaVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    ua.Y(uaVar);
                    ua.Z(uaVar);
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((xb) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                dd ddVar = (dd) obj;
                if (i10 == -1) {
                    if (ddVar.b < ddVar.S0() || !ddVar.Q0()) {
                        ddVar.finishFragment();
                        break;
                    } else {
                        ddVar.V0();
                        break;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) ddVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    ddVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    ddVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    ddVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    nc ncVar = new nc(ddVar, ddVar.getParentActivity(), canvas, (ddVar.L.getMeasuredWidth() / 2.0f) + f7, (ddVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    ddVar.m0 = ncVar;
                    ncVar.setOnTouchListener(new di.d(2));
                    ddVar.n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ddVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new ei.eb(ddVar, i12));
                    ddVar.o0.addListener(new m.a(ddVar, 22));
                    ddVar.o0.setDuration(400L);
                    ddVar.o0.setInterpolator(org.telegram.ui.Components.st.e);
                    ddVar.o0.start();
                    frameLayout.addView(ddVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new ic(ddVar, 0));
                    break;
                }
                break;
            case 3:
                ko koVar = (ko) obj;
                if (i10 == -1) {
                    if (koVar.e0(true)) {
                        koVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    koVar.j0();
                    break;
                }
                break;
            case 4:
                yo yoVar = (yo) obj;
                if (i10 == -1) {
                    yoVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.as asVar = yoVar.r;
                    if (asVar == null || asVar.c <= 0.0f) {
                        yoVar.Y();
                        break;
                    }
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((kp) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((rp) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                dq dqVar = (dq) obj;
                if (i10 == -1) {
                    if (dqVar.m0(true)) {
                        dqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    dqVar.r0(true);
                    break;
                }
                break;
            case 8:
                jr jrVar = (jr) obj;
                if (i10 == -1) {
                    if (jrVar.g0(true)) {
                        jrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    jrVar.u0();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj;
                if (i10 == -1) {
                    k8Var.dismiss();
                    break;
                } else {
                    k8Var.u0(i10);
                    break;
                }
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) obj;
                if (i10 != -1) {
                    tiVar.B0.w(i10);
                    break;
                } else if (!tiVar.B0.j()) {
                    tiVar.dismiss();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.k40) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.dg0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.kh0) obj).dismiss();
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.Components.dr0) obj).onBackPressed();
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.v61) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((ch1) obj).a(false, false);
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((qt) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((nu) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((cv) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((wy) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                nz nzVar = (nz) obj;
                if (i10 == -1) {
                    if (nzVar.W(true)) {
                        nzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(nzVar.T - 1.0f) < 0.1f) {
                        nzVar.c0();
                        break;
                    } else if (Math.abs(nzVar.T - 0.5f) < 0.1f) {
                        for (int i13 = 0; i13 < nzVar.a.getChildCount(); i13++) {
                            View childAt = nzVar.a.getChildAt(i13);
                            nzVar.a.getClass();
                            if (RecyclerView.R(childAt) == nzVar.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i14 = -nzVar.s;
                                nzVar.s = i14;
                                AndroidUtilities.shakeViewSpring(childAt, i14);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 26:
                p00 p00Var = (p00) obj;
                if (i10 == -1) {
                    if (p00Var.h0(true)) {
                        p00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    p00Var.q0();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((a20) obj).finishFragment();
                    break;
                }
                break;
            default:
                n60 n60Var = (n60) obj;
                if (i10 == -1) {
                    if (n60Var.f0(true)) {
                        n60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    n60Var.o0();
                    break;
                }
                break;
        }
    }
}
