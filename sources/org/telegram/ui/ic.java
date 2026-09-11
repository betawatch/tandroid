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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ic extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ic(Object obj, int i10) {
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
                bd bdVar = (bd) obj;
                if (i10 == -1) {
                    if (bdVar.b < bdVar.S0() || !bdVar.Q0()) {
                        bdVar.finishFragment();
                        break;
                    } else {
                        bdVar.V0();
                        break;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    bdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    bdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    bdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    mc mcVar = new mc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = mcVar;
                    mcVar.setOnTouchListener(new ci.d(2));
                    bdVar.n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new di.yb(bdVar, i12));
                    bdVar.o0.addListener(new s0(bdVar, 20));
                    bdVar.o0.setDuration(400L);
                    bdVar.o0.setInterpolator(org.telegram.ui.Components.jt.e);
                    bdVar.o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new fc(bdVar, 0));
                    break;
                }
                break;
            case 1:
                xo xoVar = (xo) obj;
                if (i10 == -1) {
                    if (xoVar.e0(true)) {
                        xoVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    xoVar.j0();
                    break;
                }
                break;
            case 2:
                lp lpVar = (lp) obj;
                if (i10 == -1) {
                    lpVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.or orVar = lpVar.r;
                    if (orVar == null || orVar.c <= 0.0f) {
                        lpVar.Y();
                        break;
                    }
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((eq) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                qq qqVar = (qq) obj;
                if (i10 == -1) {
                    if (qqVar.m0(true)) {
                        qqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    qqVar.r0(true);
                    break;
                }
                break;
            case 6:
                vr vrVar = (vr) obj;
                if (i10 == -1) {
                    if (vrVar.g0(true)) {
                        vrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    vrVar.u0();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) obj;
                if (i10 == -1) {
                    k8Var.dismiss();
                    break;
                } else {
                    k8Var.t0(i10);
                    break;
                }
            case 8:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.bb) obj).dismiss();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj;
                if (i10 != -1) {
                    viVar.y0.t(i10);
                    break;
                } else if (!viVar.y0.i()) {
                    viVar.dismiss();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.b40) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.kf0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.pg0) obj).dismiss();
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.hq0) obj).onBackPressed();
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.y51) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((ni1) obj).a(false, false);
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((bu) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((av) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((ov) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((mz) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                c00 c00Var = (c00) obj;
                if (i10 == -1) {
                    if (c00Var.W(true)) {
                        c00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(c00Var.T - 1.0f) < 0.1f) {
                        c00Var.c0();
                        break;
                    } else if (Math.abs(c00Var.T - 0.5f) < 0.1f) {
                        for (int i13 = 0; i13 < c00Var.a.getChildCount(); i13++) {
                            View childAt = c00Var.a.getChildAt(i13);
                            c00Var.a.getClass();
                            if (RecyclerView.R(childAt) == c00Var.L && (childAt instanceof org.telegram.ui.Components.z00)) {
                                int i14 = -c00Var.s;
                                c00Var.s = i14;
                                AndroidUtilities.shakeViewSpring(childAt, i14);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                f10 f10Var = (f10) obj;
                if (i10 == -1) {
                    if (f10Var.h0(true)) {
                        f10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    f10Var.q0();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((r20) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                f70 f70Var = (f70) obj;
                if (i10 == -1) {
                    if (f70Var.f0(true)) {
                        f70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    f70Var.o0();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((l70) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((n70) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
