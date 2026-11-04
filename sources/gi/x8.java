package gi;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ x8(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String M0;
        int i3 = this.a;
        boolean z10 = false;
        va vaVar = this.b;
        switch (i3) {
            case 0:
                va vaVar2 = this.b;
                if (vaVar2.L1 != null && vaVar2.D2 == null && vaVar2.j1 != null) {
                    ValueAnimator valueAnimator = vaVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = vaVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vaVar2.n.getWidth(), vaVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vaVar2.j1.setAlpha(0.0f);
                        ja jaVar = vaVar2.Y0;
                        if (jaVar != null) {
                            jaVar.h0 = true;
                        }
                        x9 x9Var = vaVar2.w1;
                        if (x9Var != null) {
                            x9Var.s0 = true;
                        }
                        vaVar2.n.draw(canvas);
                        ja jaVar2 = vaVar2.Y0;
                        if (jaVar2 != null) {
                            jaVar2.h0 = false;
                        }
                        x9 x9Var2 = vaVar2.w1;
                        if (x9Var2 != null) {
                            x9Var2.s0 = false;
                        }
                        vaVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vaVar2.j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        da daVar = new da(vaVar2, vaVar2.b, z11, canvas, (vaVar2.j1.getMeasuredWidth() / 2.0f) + f10, (vaVar2.j1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11);
                        vaVar2.D2 = daVar;
                        daVar.setOnTouchListener(new fi.a(2));
                        vaVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vaVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new ea(vaVar2, 0));
                        vaVar2.F2.addListener(new v9(vaVar2, 2));
                        vaVar2.F2.setStartDelay(80L);
                        vaVar2.F2.setDuration(z11 ? 320L : 450L);
                        vaVar2.F2.setInterpolator(z11 ? xq.i : xq.h);
                        vaVar2.F2.start();
                        vaVar2.n.addView(vaVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new v8(vaVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!vaVar.T1) {
                    vaVar.L();
                    break;
                }
                break;
            case 2:
                f7 f7Var = vaVar.L1;
                if (f7Var != null && !vaVar.T1) {
                    f7Var.Y = !f7Var.Y;
                    ArrayList arrayList = f7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((f7) obj).Y = vaVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vaVar.L1.y);
                    f7 f7Var2 = vaVar.L1;
                    boolean z12 = f7Var2.o0 != null;
                    if (vaVar.h0 == -1) {
                        l3 l3Var = vaVar.l1;
                        if (f7Var2.Y) {
                            M0 = bd.M0((!isEmpty || z12) ? 2131744602 : 2131744470, null);
                        } else {
                            M0 = bd.M0((!isEmpty || z12) ? 2131744601 : 2131744469, null);
                        }
                        boolean z13 = vaVar.l1.W;
                        if (l3Var.getMeasuredWidth() < 0) {
                            l3Var.H = M0;
                        } else {
                            org.telegram.ui.Components.g6 g6Var = l3Var.I;
                            if (!bd.a0 && z13) {
                                z10 = true;
                            }
                            g6Var.t(M0, z10, true);
                        }
                        vaVar.l1.w();
                    }
                    vaVar.e0(vaVar.L1.Y, true);
                    vaVar.Y0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = vaVar.Y0.k();
                vaVar.Y0.x(-9982, k10);
                ((je0) vaVar.k1.c).a(!k10, true);
                break;
            case 4:
                if (vaVar.C0 != null && !vaVar.T1) {
                    String B = vaVar.B();
                    String E = vaVar.E();
                    if (B != null && !B.equals(E)) {
                        y9 y9Var = vaVar.C0;
                        if (y9Var != null && y9Var.getCameraSession() != null) {
                            if (!vaVar.C0.isFrontface() || vaVar.C0.getCameraSession().hasFlashModes()) {
                                vaVar.C0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = vaVar.v2.indexOf(E);
                                if (indexOf >= 0) {
                                    vaVar.u2 = indexOf;
                                    hp.e1().edit().putInt("frontflash", vaVar.u2).apply();
                                }
                            }
                        }
                        vaVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                y9 y9Var2 = vaVar.C0;
                if (y9Var2 != null && vaVar.g0 == 0) {
                    y9Var2.toggleDual();
                    vaVar.G0.setValue(vaVar.C0.isDual());
                    vaVar.G0.setContentDescription(bd.M0(vaVar.C0.isDual() ? 2131754886 : 2131754887, null));
                    vaVar.m1.f(true);
                    hp.e1().edit().putInt("storydualhint", 2).apply();
                    if (vaVar.n1.W) {
                        hp.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vaVar.n1.f(true);
                    break;
                }
                break;
            case 6:
                if (vaVar.g0 == 0 && !vaVar.b2) {
                    y9 y9Var3 = vaVar.C0;
                    if (y9Var3 != null && y9Var3.isDual()) {
                        vaVar.C0.toggleDual();
                    }
                    if (!vaVar.J0.e && !vaVar.B0.j()) {
                        vaVar.B0.o(vaVar.A0);
                        vaVar.J0.setSelected(vaVar.A0);
                        vaVar.H0.a(new u(vaVar.A0, false), true);
                        vaVar.H0.setSelected(true);
                        y9 y9Var4 = vaVar.C0;
                        if (y9Var4 != null) {
                            y9Var4.recordHevc = !vaVar.B0.j();
                        }
                        g3 g3Var = vaVar.N0;
                        if (g3Var != null) {
                            g3Var.setMultipleOnClick(vaVar.B0.j());
                            vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                        }
                    }
                    vaVar.J0.a(!r1.e, true);
                    vaVar.l0(true);
                    break;
                }
                break;
            case 7:
                vaVar.B0.o(null);
                vaVar.B0.c();
                vaVar.J0.setSelected((t) null);
                y9 y9Var5 = vaVar.C0;
                if (y9Var5 != null) {
                    y9Var5.recordHevc = !vaVar.B0.j();
                }
                vaVar.J0.a(false, true);
                vaVar.l0(true);
                g3 g3Var2 = vaVar.N0;
                if (g3Var2 != null) {
                    g3Var2.setMultipleOnClick(vaVar.B0.j());
                    vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                vaVar.j0();
                break;
            case 9:
                y9 y9Var6 = vaVar.C0;
                if (y9Var6 != null && !vaVar.T1 && !vaVar.Q1 && y9Var6.isInited() && vaVar.g0 == 0) {
                    vaVar.C0.switchCamera();
                    vaVar.P0.d(180.0f);
                    va.Z(vaVar.C0.isFrontface());
                    if (!vaVar.p0()) {
                        vaVar.s.d();
                        break;
                    } else {
                        vaVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                vaVar.j0();
                break;
            case 11:
                f7 f7Var3 = vaVar.L1;
                if (f7Var3 != null) {
                    f7Var3.f0 = true;
                    f7Var3.e0 = vaVar.N1;
                    vaVar.W();
                    f7 f7Var4 = vaVar.L1;
                    if (f7Var4 != null && !f7Var4.b0) {
                        org.telegram.messenger.g0.i3(new v8(vaVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (vaVar.t2) {
                    vaVar.Y(true);
                    break;
                }
                break;
            case 13:
                vaVar.k0(-1, false, true);
                break;
            default:
                vaVar.k0(-1, false, true);
                break;
        }
    }
}
