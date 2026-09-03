package fg;

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
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.aa;
import org.telegram.ui.b7;
import org.telegram.ui.bd;
import org.telegram.ui.d6;
import org.telegram.ui.dc;
import org.telegram.ui.ep;
import org.telegram.ui.j8;
import org.telegram.ui.jc;
import org.telegram.ui.kc;
import org.telegram.ui.kq;
import org.telegram.ui.l9;
import org.telegram.ui.pa;
import org.telegram.ui.po;
import org.telegram.ui.qr;
import org.telegram.ui.rp;
import org.telegram.ui.s4;
import org.telegram.ui.s5;
import org.telegram.ui.sb;
import org.telegram.ui.v9;
import org.telegram.ui.y6;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        Runnable runnable;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((n1) obj).dismiss();
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
                    ((mh.p) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                ng.s sVar = (ng.s) obj;
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
                    ((s4) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((d6) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                b7 b7Var = (b7) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                b7.f0(b7Var, true);
                                break;
                            }
                        } else {
                            b7.f0(b7Var, false);
                            break;
                        }
                    } else {
                        b7Var.m0();
                        break;
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.p2) b7Var).actionBar;
                    if (!kVar.s()) {
                        b7Var.finishFragment();
                        break;
                    } else {
                        nh.b bVar = b7Var.V;
                        if (bVar != null) {
                            bVar.d();
                        }
                        y6 y6Var = b7Var.K;
                        if (y6Var != null) {
                            y6Var.e(false);
                            b7Var.K.d();
                            break;
                        }
                    }
                }
                break;
            case 10:
                j8 j8Var = (j8) obj;
                if (i10 == -1) {
                    if (j8Var.M != 0 || j8Var.N != 0 || j8Var.D) {
                        j8Var.D = false;
                        j8Var.M = 0;
                        j8Var.N = 0;
                        j8Var.t0();
                        j8Var.o0();
                        break;
                    } else {
                        j8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 11:
                l9 l9Var = (l9) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        l9Var.p0(false);
                        break;
                    }
                } else {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) l9Var).actionBar;
                    if (!kVar2.s()) {
                        l9Var.finishFragment();
                        break;
                    } else {
                        l9Var.k0(true);
                        break;
                    }
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((v9) obj).finishFragment();
                    break;
                }
                break;
            case 13:
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
            case 14:
                pa paVar = (pa) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        pa.Y(paVar);
                        pa.Z(paVar);
                        break;
                    }
                } else {
                    paVar.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((sb) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                bd bdVar = (bd) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) bdVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        bdVar.I.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        bdVar.I.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        bdVar.I.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        jc jcVar = new jc(bdVar, bdVar.getParentActivity(), canvas, (bdVar.I.getMeasuredWidth() / 2.0f) + f10, (bdVar.I.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                        bdVar.j0 = jcVar;
                        jcVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
                        bdVar.k0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        bdVar.l0 = ofFloat;
                        ofFloat.addUpdateListener(new kc(bdVar, 0));
                        bdVar.l0.addListener(new s5(bdVar, 16));
                        bdVar.l0.setDuration(400L);
                        bdVar.l0.setInterpolator(jt.e);
                        bdVar.l0.start();
                        frameLayout.addView(bdVar.j0, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new dc(bdVar, 0));
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
            case 17:
                po poVar = (po) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        poVar.j0();
                        break;
                    }
                } else if (poVar.e0(true)) {
                    poVar.finishFragment();
                    break;
                }
                break;
            case 18:
                ep epVar = (ep) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        or orVar = epVar.r;
                        if (orVar == null || orVar.c <= 0.0f) {
                            epVar.Y();
                            break;
                        }
                    }
                } else {
                    epVar.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((rp) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((yp) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                kq kqVar = (kq) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        kqVar.r0(true);
                        break;
                    }
                } else if (kqVar.m0(true)) {
                    kqVar.finishFragment();
                    break;
                }
                break;
            case 22:
                qr qrVar = (qr) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        qrVar.u0();
                        break;
                    }
                } else if (qrVar.g0(true)) {
                    qrVar.finishFragment();
                    break;
                }
                break;
            case 23:
                c8 c8Var = (c8) obj;
                if (i10 != -1) {
                    c8Var.t0(i10);
                    break;
                } else {
                    c8Var.dismiss();
                    break;
                }
            case 24:
                if (i10 == -1) {
                    ((sa) obj).dismiss();
                    break;
                }
                break;
            case 25:
                mi miVar = (mi) obj;
                if (i10 != -1) {
                    miVar.v0.t(i10);
                    break;
                } else if (!miVar.v0.i()) {
                    miVar.dismiss();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((f40) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1 && (runnable = ((qf0) obj).r) != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((xg0) obj).dismiss();
                    break;
                }
                break;
            default:
                ((lq0) obj).onBackPressed();
                break;
        }
    }
}
