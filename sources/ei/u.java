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
import ci.tb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nt;
import org.telegram.ui.a7;
import org.telegram.ui.b6;
import org.telegram.ui.ba;
import org.telegram.ui.cd;
import org.telegram.ui.hc;
import org.telegram.ui.k6;
import org.telegram.ui.k8;
import org.telegram.ui.m9;
import org.telegram.ui.mc;
import org.telegram.ui.sa;
import org.telegram.ui.w9;
import org.telegram.ui.wb;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class u extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
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
                    ((v) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((l3) obj).q();
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
                        k0Var.G.f3.N(true);
                        k0Var.E.r.getText().clear();
                        k0Var.E.r.requestFocus();
                        AndroidUtilities.showKeyboard(k0Var.E.r);
                        break;
                    }
                } else if (!k0Var.N) {
                    k0Var.v.d.f3.N(false);
                    k0Var.d.E(0);
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
                    k0Var3.v.d.f3.N(false);
                    k0Var3.d.E(0);
                    break;
                }
                break;
            case 9:
                hg.c cVar = (hg.c) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        cVar.W();
                        break;
                    }
                } else if (cVar.onBackPressed(true)) {
                    cVar.finishFragment();
                    break;
                }
                break;
            case 10:
                hg.m mVar = (hg.m) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        mVar.h0();
                        break;
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                    break;
                }
                break;
            case 11:
                hg.u0 u0Var = (hg.u0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        u0Var.Z();
                        break;
                    }
                } else if (u0Var.onBackPressed(true)) {
                    u0Var.finishFragment();
                    break;
                }
                break;
            case 12:
                hg.w0 w0Var = (hg.w0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        w0Var.W();
                        break;
                    }
                } else if (w0Var.onBackPressed(true)) {
                    w0Var.finishFragment();
                    break;
                }
                break;
            case 13:
                hg.e1 e1Var = (hg.e1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        e1Var.U();
                        break;
                    }
                } else if (e1Var.onBackPressed(true)) {
                    e1Var.finishFragment();
                    break;
                }
                break;
            case 14:
                hg.g1 g1Var = (hg.g1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        g1Var.d0();
                        break;
                    }
                } else if (g1Var.onBackPressed(true)) {
                    g1Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((hg.i1) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((hg.e2) obj).finishFragment();
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
                    ((org.telegram.ui.q) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((org.telegram.ui.q4) obj).finishFragment();
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
                a7 a7Var = (a7) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                a7.f0(a7Var, true);
                                break;
                            }
                        } else {
                            a7.f0(a7Var, false);
                            break;
                        }
                    } else {
                        a7Var.j0();
                        break;
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) a7Var).actionBar;
                    if (!kVar.s()) {
                        a7Var.finishFragment();
                        break;
                    } else {
                        zh.b bVar = a7Var.e0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        k6 k6Var = a7Var.M;
                        if (k6Var != null) {
                            k6Var.f(false);
                            a7Var.M.e();
                            break;
                        }
                    }
                }
                break;
            case 23:
                k8 k8Var = (k8) obj;
                if (i10 == -1) {
                    if (k8Var.P != 0 || k8Var.Q != 0 || k8Var.G) {
                        k8Var.G = false;
                        k8Var.P = 0;
                        k8Var.Q = 0;
                        k8Var.t0();
                        k8Var.o0();
                        break;
                    } else {
                        k8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 24:
                m9 m9Var = (m9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        m9Var.j0(false);
                        break;
                    }
                } else {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) m9Var).actionBar;
                    if (!kVar2.s()) {
                        m9Var.finishFragment();
                        break;
                    } else {
                        m9Var.e0(true);
                        break;
                    }
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((w9) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                ba baVar = (ba) obj;
                if (i10 != -1) {
                    if (i10 == 1 && baVar.a.getText().length() != 0) {
                        ba.S(baVar);
                        baVar.finishFragment();
                        break;
                    }
                } else {
                    baVar.finishFragment();
                    break;
                }
                break;
            case 27:
                sa saVar = (sa) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        sa.X(saVar);
                        sa.Y(saVar);
                        break;
                    }
                } else {
                    saVar.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((wb) obj).finishFragment();
                    break;
                }
                break;
            default:
                cd cdVar = (cd) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) cdVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        cdVar.L.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        cdVar.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        cdVar.L.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(cdVar, cdVar.getParentActivity(), canvas, (cdVar.L.getMeasuredWidth() / 2.0f) + f7, (cdVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        cdVar.m0 = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        cdVar.n0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        cdVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new tb(cdVar, 1));
                        cdVar.o0.addListener(new org.telegram.ui.u4(cdVar, 17));
                        cdVar.o0.setDuration(400L);
                        cdVar.o0.setInterpolator(nt.e);
                        cdVar.o0.start();
                        frameLayout.addView(cdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new hc(cdVar, 0));
                        break;
                    }
                } else if (cdVar.b >= cdVar.S0() && cdVar.Q0()) {
                    cdVar.V0();
                    break;
                } else {
                    cdVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
