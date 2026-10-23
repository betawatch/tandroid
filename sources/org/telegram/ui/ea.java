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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                    if (bdVar.b < bdVar.U0() || !bdVar.S0()) {
                        bdVar.finishFragment();
                        break;
                    } else {
                        bdVar.X0();
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
                        yoVar.Z();
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
                    k8Var.A0(i10);
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
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.ig0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.oh0) obj).dismiss();
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.Components.ir0) obj).onBackPressed();
                break;
            case 16:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.e71) obj).finishFragment();
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
                    ((hh1) obj).a(false, false);
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((rt) obj).finishFragment();
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
                    ((ou) obj).finishFragment();
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
                oz ozVar = (oz) obj;
                if (i10 == -1) {
                    if (ozVar.W(true)) {
                        ozVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    if (Math.abs(ozVar.U - 1.0f) < 0.1f) {
                        ozVar.c0();
                        break;
                    } else if (Math.abs(ozVar.U - 0.5f) < 0.1f) {
                        for (int i13 = 0; i13 < ozVar.a.getChildCount(); i13++) {
                            View childAt = ozVar.a.getChildAt(i13);
                            ozVar.a.getClass();
                            if (RecyclerView.R(childAt) == ozVar.M && (childAt instanceof org.telegram.ui.Components.h10)) {
                                int i14 = -ozVar.v;
                                ozVar.v = i14;
                                AndroidUtilities.shakeViewSpring(childAt, i14);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 26:
                q00 q00Var = (q00) obj;
                if (i10 == -1) {
                    if (q00Var.h0(true)) {
                        q00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    q00Var.q0();
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
                    ((b20) obj).finishFragment();
                    break;
                }
                break;
            default:
                p60 p60Var = (p60) obj;
                if (i10 == -1) {
                    if (p60Var.f0(true)) {
                        p60Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    p60Var.o0();
                    break;
                }
                break;
        }
    }
}
