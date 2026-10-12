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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nb extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb(Object obj, int i10) {
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
                if (i10 == -1) {
                    ((ac) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                hd hdVar = (hd) obj;
                if (i10 == -1) {
                    if (hdVar.b < hdVar.S0() || !hdVar.Q0()) {
                        hdVar.finishFragment();
                        break;
                    } else {
                        hdVar.V0();
                        break;
                    }
                } else if (i10 == 1) {
                    FrameLayout frameLayout = (FrameLayout) hdVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    hdVar.L.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    hdVar.L.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    hdVar.L.getLocationInWindow(iArr);
                    float f7 = iArr[0];
                    float f10 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    rc rcVar = new rc(hdVar, hdVar.getParentActivity(), canvas, (hdVar.L.getMeasuredWidth() / 2.0f) + f7, (hdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    hdVar.m0 = rcVar;
                    rcVar.setOnTouchListener(new ci.d(2));
                    hdVar.n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hdVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new di.tb(hdVar, i12));
                    hdVar.o0.addListener(new u0(hdVar, 20));
                    hdVar.o0.setDuration(400L);
                    hdVar.o0.setInterpolator(org.telegram.ui.Components.xt.e);
                    hdVar.o0.start();
                    frameLayout.addView(hdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new mc(hdVar, 0));
                    break;
                }
                break;
            case 2:
                zo zoVar = (zo) obj;
                if (i10 == -1) {
                    if (zoVar.e0(true)) {
                        zoVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    zoVar.j0();
                    break;
                }
                break;
            case 3:
                np npVar = (np) obj;
                if (i10 == -1) {
                    npVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.ds dsVar = npVar.r;
                    if (dsVar == null || dsVar.c <= 0.0f) {
                        npVar.Y();
                        break;
                    }
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((aq) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((hq) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                tq tqVar = (tq) obj;
                if (i10 == -1) {
                    if (tqVar.m0(true)) {
                        tqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    tqVar.r0(true);
                    break;
                }
                break;
            case 7:
                yr yrVar = (yr) obj;
                if (i10 == -1) {
                    if (yrVar.g0(true)) {
                        yrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    yrVar.u0();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj;
                if (i10 == -1) {
                    m8Var.dismiss();
                    break;
                } else {
                    m8Var.u0(i10);
                    break;
                }
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.db) obj).dismiss();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj;
                if (i10 != -1) {
                    viVar.B0.w(i10);
                    break;
                } else if (!viVar.B0.j()) {
                    viVar.dismiss();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.o40) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.jg0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.qh0) obj).dismiss();
                    break;
                }
                break;
            case 14:
                ((org.telegram.ui.Components.jr0) obj).onBackPressed();
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.c71) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.v0) obj).b(false, false);
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((wi1) obj).a(false, false);
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((fu) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((ev) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((sv) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((qz) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                h00 h00Var = (h00) obj;
                if (i10 == -1) {
                    if (h00Var.W(true)) {
                        h00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(h00Var.T - 1.0f) < 0.1f) {
                        h00Var.c0();
                        break;
                    } else if (Math.abs(h00Var.T - 0.5f) < 0.1f) {
                        for (int i13 = 0; i13 < h00Var.a.getChildCount(); i13++) {
                            View childAt = h00Var.a.getChildAt(i13);
                            h00Var.a.getClass();
                            if (RecyclerView.R(childAt) == h00Var.L && (childAt instanceof org.telegram.ui.Components.l10)) {
                                int i14 = -h00Var.s;
                                h00Var.s = i14;
                                AndroidUtilities.shakeViewSpring(childAt, i14);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 25:
                l10 l10Var = (l10) obj;
                if (i10 == -1) {
                    if (l10Var.h0(true)) {
                        l10Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    l10Var.q0();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((v20) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                j70 j70Var = (j70) obj;
                if (i10 == -1) {
                    if (j70Var.f0(true)) {
                        j70Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    j70Var.o0();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((p70) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
