package ag;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gh.y5;
import lh.cb;
import lh.h9;
import nh.p4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ws;
import org.telegram.ui.a6;
import org.telegram.ui.bc;
import org.telegram.ui.h8;
import org.telegram.ui.hc;
import org.telegram.ui.j9;
import org.telegram.ui.jo;
import org.telegram.ui.jp;
import org.telegram.ui.na;
import org.telegram.ui.q4;
import org.telegram.ui.qb;
import org.telegram.ui.qp;
import org.telegram.ui.t9;
import org.telegram.ui.w6;
import org.telegram.ui.xc;
import org.telegram.ui.xo;
import org.telegram.ui.y9;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e2 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((g2) obj).dismiss();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((y5) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((hh.r) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                ig.s sVar = (ig.s) obj;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((nh.s) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((nh.b3) obj).q();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((p4) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((oh.f) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((oh.o) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((oh.r) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                oh.j0 j0Var = ((oh.d0) obj).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        j0Var.c.a(true, true);
                        j0Var.setAllowNestedScroll(false);
                        j0Var.O = null;
                        j0Var.C.U2.N(true);
                        j0Var.A.r.getText().clear();
                        j0Var.A.r.requestFocus();
                        AndroidUtilities.showKeyboard(j0Var.A.r);
                        break;
                    }
                } else if (!j0Var.J) {
                    j0Var.v.d.U2.N(false);
                    j0Var.d.D(0);
                    break;
                } else {
                    j0Var.dismiss();
                    break;
                }
                break;
            case 11:
                oh.j0 j0Var2 = ((oh.e0) obj).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        j0Var2.b.a(true, true);
                        j0Var2.setAllowNestedScroll(false);
                        TextUtils.isEmpty(j0Var2.N);
                        j0Var2.N = null;
                        j0Var2.B.h(0L, j0Var2.e, 0L, 0L, null, false, null, true);
                        j0Var2.y.r.getText().clear();
                        j0Var2.y.r.requestFocus();
                        AndroidUtilities.showKeyboard(j0Var2.y.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", j0Var2.e);
                    j0Var2.s.presentFragment(new oh.o(bundle));
                    j0Var2.dismiss();
                    break;
                }
                break;
            case 12:
                oh.j0 j0Var3 = ((oh.i0) obj).h;
                if (i10 == -1) {
                    j0Var3.v.d.U2.N(false);
                    j0Var3.d.D(0);
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((org.telegram.ui.h) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((org.telegram.ui.m) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((org.telegram.ui.q) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((q4) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((a6) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                z6 z6Var = (z6) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                z6.f0(z6Var, true);
                                break;
                            }
                        } else {
                            z6.f0(z6Var, false);
                            break;
                        }
                    } else {
                        z6Var.m0();
                        break;
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
                    if (!kVar.t()) {
                        z6Var.finishFragment();
                        break;
                    } else {
                        ih.b bVar = z6Var.U;
                        if (bVar != null) {
                            bVar.d();
                        }
                        w6 w6Var = z6Var.J;
                        if (w6Var != null) {
                            w6Var.e(false);
                            z6Var.J.d();
                            break;
                        }
                    }
                }
                break;
            case 19:
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.L != 0 || h8Var.M != 0 || h8Var.C) {
                        h8Var.C = false;
                        h8Var.L = 0;
                        h8Var.M = 0;
                        h8Var.t0();
                        h8Var.o0();
                        break;
                    } else {
                        h8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 20:
                j9 j9Var = (j9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        j9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar;
                    if (!kVar2.t()) {
                        j9Var.finishFragment();
                        break;
                    } else {
                        j9Var.k0(true);
                        break;
                    }
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((t9) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                y9 y9Var = (y9) obj;
                if (i10 != -1) {
                    if (i10 == 1 && y9Var.a.getText().length() != 0) {
                        y9.U(y9Var);
                        y9Var.finishFragment();
                        break;
                    }
                } else {
                    y9Var.finishFragment();
                    break;
                }
                break;
            case 23:
                na naVar = (na) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        na.Y(naVar);
                        na.Z(naVar);
                        break;
                    }
                } else {
                    naVar.finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((qb) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                xc xcVar = (xc) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) xcVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        xcVar.H.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        xcVar.H.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        xcVar.H.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        hc hcVar = new hc(xcVar, xcVar.getParentActivity(), canvas, (xcVar.H.getMeasuredWidth() / 2.0f) + f10, (xcVar.H.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                        xcVar.i0 = hcVar;
                        hcVar.setOnTouchListener(new kh.e(2));
                        xcVar.j0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        xcVar.k0 = ofFloat;
                        ofFloat.addUpdateListener(new cb(xcVar, 1));
                        xcVar.k0.addListener(new h9(xcVar, 25));
                        xcVar.k0.setDuration(400L);
                        xcVar.k0.setInterpolator(ws.e);
                        xcVar.k0.start();
                        frameLayout.addView(xcVar.i0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new bc(xcVar, 0));
                        break;
                    }
                } else if (xcVar.b >= xcVar.S0() && xcVar.Q0()) {
                    xcVar.V0();
                    break;
                } else {
                    xcVar.finishFragment();
                    break;
                }
                break;
            case 26:
                jo joVar = (jo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        joVar.j0();
                        break;
                    }
                } else if (joVar.e0(true)) {
                    joVar.finishFragment();
                    break;
                }
                break;
            case 27:
                xo xoVar = (xo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        dr drVar = xoVar.r;
                        if (drVar == null || drVar.c <= 0.0f) {
                            xoVar.Y();
                            break;
                        }
                    }
                } else {
                    xoVar.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((jp) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((qp) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
