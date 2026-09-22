package ei;

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
import ci.xb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kt;
import org.telegram.ui.ad;
import org.telegram.ui.b6;
import org.telegram.ui.fc;
import org.telegram.ui.h8;
import org.telegram.ui.k9;
import org.telegram.ui.lc;
import org.telegram.ui.qa;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.w6;
import org.telegram.ui.z6;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class t extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
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
                    ((u) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((k3) obj).q();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((e5) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((fi.f) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((fi.p) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((fi.s) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                fi.k0 k0Var = ((fi.e0) obj).h;
                if (i10 != -1) {
                    if (i10 == 3) {
                        k0Var.c.a(true, true);
                        k0Var.setAllowNestedScroll(false);
                        k0Var.S = null;
                        k0Var.G.Y2.N(true);
                        k0Var.E.r.getText().clear();
                        k0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var.E.r);
                        break;
                    }
                } else if (!k0Var.N) {
                    k0Var.v.d.Y2.N(false);
                    k0Var.d.D(0);
                    break;
                } else {
                    k0Var.dismiss();
                    break;
                }
                break;
            case 7:
                fi.k0 k0Var2 = ((fi.f0) obj).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        k0Var2.b.a(true, true);
                        k0Var2.setAllowNestedScroll(false);
                        TextUtils.isEmpty(k0Var2.R);
                        k0Var2.R = null;
                        k0Var2.F.h(0L, k0Var2.e, 0L, 0L, null, false, null, true);
                        k0Var2.y.r.getText().clear();
                        k0Var2.y.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var2.y.r);
                        break;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("community_id", k0Var2.e);
                    k0Var2.s.presentFragment(new fi.p(bundle));
                    k0Var2.dismiss();
                    break;
                }
                break;
            case 8:
                fi.k0 k0Var3 = ((fi.j0) obj).h;
                if (i10 == -1) {
                    k0Var3.v.d.Y2.N(false);
                    k0Var3.d.D(0);
                    break;
                }
                break;
            case 9:
                hg.d dVar = (hg.d) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        dVar.X();
                        break;
                    }
                } else if (dVar.onBackPressed(true)) {
                    dVar.finishFragment();
                    break;
                }
                break;
            case 10:
                hg.n nVar = (hg.n) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        nVar.h0();
                        break;
                    }
                } else if (nVar.onBackPressed(true)) {
                    nVar.finishFragment();
                    break;
                }
                break;
            case 11:
                hg.v0 v0Var = (hg.v0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        v0Var.a0();
                        break;
                    }
                } else if (v0Var.onBackPressed(true)) {
                    v0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                hg.x0 x0Var = (hg.x0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        x0Var.X();
                        break;
                    }
                } else if (x0Var.onBackPressed(true)) {
                    x0Var.finishFragment();
                    break;
                }
                break;
            case 13:
                hg.f1 f1Var = (hg.f1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        f1Var.W();
                        break;
                    }
                } else if (f1Var.onBackPressed(true)) {
                    f1Var.finishFragment();
                    break;
                }
                break;
            case 14:
                hg.h1 h1Var = (hg.h1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        h1Var.d0();
                        break;
                    }
                } else if (h1Var.onBackPressed(true)) {
                    h1Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((hg.j1) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((hg.f2) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((org.telegram.ui.h) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((org.telegram.ui.l) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((org.telegram.ui.p) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.p4) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((b6) obj).finishFragment();
                    break;
                }
                break;
            case 22:
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
                    if (!kVar.s()) {
                        z6Var.finishFragment();
                        break;
                    } else {
                        zh.b bVar = z6Var.Y;
                        if (bVar != null) {
                            bVar.d();
                        }
                        w6 w6Var = z6Var.N;
                        if (w6Var != null) {
                            w6Var.e(false);
                            z6Var.N.d();
                            break;
                        }
                    }
                }
                break;
            case 23:
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.P != 0 || h8Var.Q != 0 || h8Var.G) {
                        h8Var.G = false;
                        h8Var.P = 0;
                        h8Var.Q = 0;
                        h8Var.t0();
                        h8Var.o0();
                        break;
                    } else {
                        h8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 24:
                k9 k9Var = (k9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        k9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) k9Var).actionBar;
                    if (!kVar2.s()) {
                        k9Var.finishFragment();
                        break;
                    } else {
                        k9Var.k0(true);
                        break;
                    }
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((u9) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                z9 z9Var = (z9) obj;
                if (i10 != -1) {
                    if (i10 == 1 && z9Var.a.getText().length() != 0) {
                        z9.U(z9Var);
                        z9Var.finishFragment();
                        break;
                    }
                } else {
                    z9Var.finishFragment();
                    break;
                }
                break;
            case 27:
                qa qaVar = (qa) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qa.Y(qaVar);
                        qa.Z(qaVar);
                        break;
                    }
                } else {
                    qaVar.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((ub) obj).finishFragment();
                    break;
                }
                break;
            default:
                ad adVar = (ad) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) adVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        adVar.L.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        adVar.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        adVar.L.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        lc lcVar = new lc(adVar, adVar.getParentActivity(), canvas, (adVar.L.getMeasuredWidth() / 2.0f) + f7, (adVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        adVar.m0 = lcVar;
                        lcVar.setOnTouchListener(new bi.d(2));
                        adVar.n0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        adVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new xb(adVar, 1));
                        adVar.o0.addListener(new org.telegram.ui.t4(adVar, 17));
                        adVar.o0.setDuration(400L);
                        adVar.o0.setInterpolator(kt.e);
                        adVar.o0.start();
                        frameLayout.addView(adVar.m0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new fc(adVar, 0));
                        break;
                    }
                } else if (adVar.b >= adVar.S0() && adVar.Q0()) {
                    adVar.V0();
                    break;
                } else {
                    adVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
