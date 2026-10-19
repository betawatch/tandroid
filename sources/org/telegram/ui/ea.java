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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ea extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ea(Object obj, int i10) {
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
                sa saVar = (sa) obj;
                if (i10 == -1) {
                    saVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    sa.Y(saVar);
                    sa.Z(saVar);
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((vb) obj).finishFragment();
                    break;
                }
                break;
            case 2:
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
                    lc lcVar = new lc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.L.getMeasuredWidth() / 2.0f) + f7, (bdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                    bdVar.m0 = lcVar;
                    lcVar.setOnTouchListener(new di.d(2));
                    bdVar.n0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bdVar.o0 = ofFloat;
                    ofFloat.addUpdateListener(new ei.eb(bdVar, i12));
                    bdVar.o0.addListener(new m.a(bdVar, 22));
                    bdVar.o0.setDuration(400L);
                    bdVar.o0.setInterpolator(org.telegram.ui.Components.st.e);
                    bdVar.o0.start();
                    frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new gc(bdVar, 0));
                    break;
                }
                break;
            case 3:
                io ioVar = (io) obj;
                if (i10 == -1) {
                    if (ioVar.e0(true)) {
                        ioVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    ioVar.j0();
                    break;
                }
                break;
            case 4:
                wo woVar = (wo) obj;
                if (i10 == -1) {
                    woVar.finishFragment();
                    break;
                } else if (i10 == 1) {
                    org.telegram.ui.Components.as asVar = woVar.r;
                    if (asVar == null || asVar.c <= 0.0f) {
                        woVar.Y();
                        break;
                    }
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((ip) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((pp) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                bq bqVar = (bq) obj;
                if (i10 == -1) {
                    if (bqVar.m0(true)) {
                        bqVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    bqVar.r0(true);
                    break;
                }
                break;
            case 8:
                hr hrVar = (hr) obj;
                if (i10 == -1) {
                    if (hrVar.g0(true)) {
                        hrVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    hrVar.u0();
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
                ((org.telegram.ui.Components.er0) obj).onBackPressed();
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.w61) obj).finishFragment();
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
                    ((ah1) obj).a(false, false);
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((ot) obj).finishFragment();
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
                    ((lu) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((av) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((uy) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                lz lzVar = (lz) obj;
                if (i10 == -1) {
                    if (lzVar.W(true)) {
                        lzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(lzVar.T - 1.0f) < 0.1f) {
                        lzVar.c0();
                        break;
                    } else if (Math.abs(lzVar.T - 0.5f) < 0.1f) {
                        for (int i13 = 0; i13 < lzVar.a.getChildCount(); i13++) {
                            View childAt = lzVar.a.getChildAt(i13);
                            lzVar.a.getClass();
                            if (RecyclerView.R(childAt) == lzVar.L && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i14 = -lzVar.s;
                                lzVar.s = i14;
                                AndroidUtilities.shakeViewSpring(childAt, i14);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 26:
                n00 n00Var = (n00) obj;
                if (i10 == -1) {
                    if (n00Var.h0(true)) {
                        n00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    n00Var.q0();
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
                    ((y10) obj).finishFragment();
                    break;
                }
                break;
            default:
                l60 l60Var = (l60) obj;
                if (i10 == -1) {
                    if (l60Var.f0(true)) {
                        l60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    l60Var.o0();
                    break;
                }
                break;
        }
    }
}
