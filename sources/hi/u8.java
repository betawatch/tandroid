package hi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ue0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ u8(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String M0;
        int i7 = this.a;
        boolean z10 = false;
        ta taVar = this.b;
        switch (i7) {
            case 0:
                ta taVar2 = this.b;
                if (taVar2.L1 != null && taVar2.D2 == null && taVar2.j1 != null) {
                    ValueAnimator valueAnimator = taVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = taVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(taVar2.n.getWidth(), taVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        taVar2.j1.setAlpha(0.0f);
                        ha haVar = taVar2.Y0;
                        if (haVar != null) {
                            haVar.h0 = true;
                        }
                        v9 v9Var = taVar2.w1;
                        if (v9Var != null) {
                            v9Var.s0 = true;
                        }
                        taVar2.n.draw(canvas);
                        ha haVar2 = taVar2.Y0;
                        if (haVar2 != null) {
                            haVar2.h0 = false;
                        }
                        v9 v9Var2 = taVar2.w1;
                        if (v9Var2 != null) {
                            v9Var2.s0 = false;
                        }
                        taVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        taVar2.j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ba baVar = new ba(taVar2, taVar2.b, z11, canvas, (taVar2.j1.getMeasuredWidth() / 2.0f) + f10, (taVar2.j1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11);
                        taVar2.D2 = baVar;
                        baVar.setOnTouchListener(new gi.a(2));
                        taVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        taVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new ca(taVar2, 0));
                        taVar2.F2.addListener(new t9(taVar2, 2));
                        taVar2.F2.setStartDelay(80L);
                        taVar2.F2.setDuration(z11 ? 320L : 450L);
                        taVar2.F2.setInterpolator(z11 ? lr.i : lr.h);
                        taVar2.F2.start();
                        taVar2.n.addView(taVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new s8(taVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!taVar.T1) {
                    taVar.L();
                    break;
                }
                break;
            case 2:
                d7 d7Var = taVar.L1;
                if (d7Var != null && !taVar.T1) {
                    d7Var.Y = !d7Var.Y;
                    ArrayList arrayList = d7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((d7) obj).Y = taVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(taVar.L1.y);
                    d7 d7Var2 = taVar.L1;
                    boolean z12 = d7Var2.o0 != null;
                    if (taVar.h0 == -1) {
                        m3 m3Var = taVar.l1;
                        if (d7Var2.Y) {
                            M0 = gd.M0((!isEmpty || z12) ? 2131744357 : 2131744225, null);
                        } else {
                            M0 = gd.M0((!isEmpty || z12) ? 2131744356 : 2131744224, null);
                        }
                        boolean z13 = taVar.l1.W;
                        if (m3Var.getMeasuredWidth() < 0) {
                            m3Var.H = M0;
                        } else {
                            org.telegram.ui.Components.m6 m6Var = m3Var.I;
                            if (!gd.a0 && z13) {
                                z10 = true;
                            }
                            m6Var.t(M0, z10, true);
                        }
                        taVar.l1.x();
                    }
                    taVar.e0(taVar.L1.Y, true);
                    taVar.Y0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = taVar.Y0.k();
                taVar.Y0.x(-9982, k10);
                ((ue0) taVar.k1.c).a(!k10, true);
                break;
            case 4:
                if (taVar.C0 != null && !taVar.T1) {
                    String B = taVar.B();
                    String E = taVar.E();
                    if (B != null && !B.equals(E)) {
                        w9 w9Var = taVar.C0;
                        if (w9Var != null && w9Var.getCameraSession() != null) {
                            if (!taVar.C0.isFrontface() || taVar.C0.getCameraSession().hasFlashModes()) {
                                taVar.C0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = taVar.v2.indexOf(E);
                                if (indexOf >= 0) {
                                    taVar.u2 = indexOf;
                                    mp.g1().edit().putInt("frontflash", taVar.u2).apply();
                                }
                            }
                        }
                        taVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                w9 w9Var2 = taVar.C0;
                if (w9Var2 != null && taVar.g0 == 0) {
                    w9Var2.toggleDual();
                    taVar.G0.setValue(taVar.C0.isDual());
                    taVar.G0.setContentDescription(gd.M0(taVar.C0.isDual() ? 2131754886 : 2131754887, null));
                    taVar.m1.f(true);
                    mp.g1().edit().putInt("storydualhint", 2).apply();
                    if (taVar.n1.W) {
                        mp.g1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    taVar.n1.f(true);
                    break;
                }
                break;
            case 6:
                if (taVar.g0 == 0 && !taVar.b2) {
                    w9 w9Var3 = taVar.C0;
                    if (w9Var3 != null && w9Var3.isDual()) {
                        taVar.C0.toggleDual();
                    }
                    if (!taVar.J0.e && !taVar.B0.j()) {
                        taVar.B0.o(taVar.A0);
                        taVar.J0.setSelected(taVar.A0);
                        taVar.H0.a(new v(taVar.A0, false), true);
                        taVar.H0.setSelected(true);
                        w9 w9Var4 = taVar.C0;
                        if (w9Var4 != null) {
                            w9Var4.recordHevc = !taVar.B0.j();
                        }
                        h3 h3Var = taVar.N0;
                        if (h3Var != null) {
                            h3Var.setMultipleOnClick(taVar.B0.j());
                            taVar.N0.setMaxCount(Math.min(10, u.b() - taVar.B0.getFilledCount()));
                        }
                    }
                    taVar.J0.a(!r1.e, true);
                    taVar.l0(true);
                    break;
                }
                break;
            case 7:
                taVar.B0.o(null);
                taVar.B0.c();
                taVar.J0.setSelected((u) null);
                w9 w9Var5 = taVar.C0;
                if (w9Var5 != null) {
                    w9Var5.recordHevc = !taVar.B0.j();
                }
                taVar.J0.a(false, true);
                taVar.l0(true);
                h3 h3Var2 = taVar.N0;
                if (h3Var2 != null) {
                    h3Var2.setMultipleOnClick(taVar.B0.j());
                    taVar.N0.setMaxCount(Math.min(10, u.b() - taVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                taVar.j0();
                break;
            case 9:
                w9 w9Var6 = taVar.C0;
                if (w9Var6 != null && !taVar.T1 && !taVar.Q1 && w9Var6.isInited() && taVar.g0 == 0) {
                    taVar.C0.switchCamera();
                    taVar.P0.d(180.0f);
                    ta.Z(taVar.C0.isFrontface());
                    if (!taVar.p0()) {
                        taVar.s.d();
                        break;
                    } else {
                        taVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                taVar.j0();
                break;
            case 11:
                d7 d7Var3 = taVar.L1;
                if (d7Var3 != null) {
                    d7Var3.f0 = true;
                    d7Var3.e0 = taVar.N1;
                    taVar.W();
                    d7 d7Var4 = taVar.L1;
                    if (d7Var4 != null && !d7Var4.b0) {
                        org.telegram.messenger.g0.h3(new s8(taVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (taVar.t2) {
                    taVar.Y(true);
                    break;
                }
                break;
            case 13:
                taVar.k0(-1, false, true);
                break;
            default:
                taVar.k0(-1, false, true);
                break;
        }
    }
}
