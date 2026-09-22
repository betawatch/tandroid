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
import org.telegram.ui.a6;
import org.telegram.ui.aa;
import org.telegram.ui.bd;
import org.telegram.ui.gc;
import org.telegram.ui.i8;
import org.telegram.ui.l9;
import org.telegram.ui.mc;
import org.telegram.ui.ra;
import org.telegram.ui.v9;
import org.telegram.ui.vb;
import org.telegram.ui.w6;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                    k0Var3.v.d.Y2.N(false);
                    k0Var3.d.E(0);
                    break;
                }
                break;
            case 9:
                hg.c cVar = (hg.c) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        cVar.X();
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
                        u0Var.a0();
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
                        w0Var.X();
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
                        e1Var.W();
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
                    ((a6) obj).finishFragment();
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
                        zh.b bVar = z6Var.c0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        w6 w6Var = z6Var.M;
                        if (w6Var != null) {
                            w6Var.f(false);
                            z6Var.M.e();
                            break;
                        }
                    }
                }
                break;
            case 23:
                i8 i8Var = (i8) obj;
                if (i10 == -1) {
                    if (i8Var.P != 0 || i8Var.Q != 0 || i8Var.G) {
                        i8Var.G = false;
                        i8Var.P = 0;
                        i8Var.Q = 0;
                        i8Var.t0();
                        i8Var.o0();
                        break;
                    } else {
                        i8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 24:
                l9 l9Var = (l9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        l9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) l9Var).actionBar;
                    if (!kVar2.s()) {
                        l9Var.finishFragment();
                        break;
                    } else {
                        l9Var.k0(true);
                        break;
                    }
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((v9) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                aa aaVar = (aa) obj;
                if (i10 != -1) {
                    if (i10 == 1 && aaVar.a.getText().length() != 0) {
                        aa.U(aaVar);
                        aaVar.finishFragment();
                        break;
                    }
                } else {
                    aaVar.finishFragment();
                    break;
                }
                break;
            case 27:
                ra raVar = (ra) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ra.Y(raVar);
                        ra.Z(raVar);
                        break;
                    }
                } else {
                    raVar.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((vb) obj).finishFragment();
                    break;
                }
                break;
            default:
                bd bdVar = (bd) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
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
                        mcVar.setOnTouchListener(new bi.d(2));
                        bdVar.n0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bdVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new xb(bdVar, 1));
                        bdVar.o0.addListener(new org.telegram.ui.t4(bdVar, 17));
                        bdVar.o0.setDuration(400L);
                        bdVar.o0.setInterpolator(kt.e);
                        bdVar.o0.start();
                        frameLayout.addView(bdVar.m0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new gc(bdVar, 0));
                        break;
                    }
                } else if (bdVar.b >= bdVar.S0() && bdVar.Q0()) {
                    bdVar.V0();
                    break;
                } else {
                    bdVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
