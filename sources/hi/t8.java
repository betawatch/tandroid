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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.we0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ t8(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String N0;
        int i7 = this.a;
        boolean z10 = false;
        sa saVar = this.b;
        switch (i7) {
            case 0:
                sa saVar2 = this.b;
                if (saVar2.L1 != null && saVar2.D2 == null && saVar2.j1 != null) {
                    ValueAnimator valueAnimator = saVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = saVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(saVar2.n.getWidth(), saVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        saVar2.j1.setAlpha(0.0f);
                        ga gaVar = saVar2.Y0;
                        if (gaVar != null) {
                            gaVar.h0 = true;
                        }
                        u9 u9Var = saVar2.w1;
                        if (u9Var != null) {
                            u9Var.s0 = true;
                        }
                        saVar2.n.draw(canvas);
                        ga gaVar2 = saVar2.Y0;
                        if (gaVar2 != null) {
                            gaVar2.h0 = false;
                        }
                        u9 u9Var2 = saVar2.w1;
                        if (u9Var2 != null) {
                            u9Var2.s0 = false;
                        }
                        saVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        saVar2.j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        aa aaVar = new aa(saVar2, saVar2.b, z11, canvas, (saVar2.j1.getMeasuredWidth() / 2.0f) + f10, (saVar2.j1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11);
                        saVar2.D2 = aaVar;
                        aaVar.setOnTouchListener(new gi.a(2));
                        saVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        saVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new ba(saVar2, 0));
                        saVar2.F2.addListener(new s9(saVar2, 2));
                        saVar2.F2.setStartDelay(80L);
                        saVar2.F2.setDuration(z11 ? 320L : 450L);
                        saVar2.F2.setInterpolator(z11 ? nr.i : nr.h);
                        saVar2.F2.start();
                        saVar2.n.addView(saVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new r8(saVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!saVar.T1) {
                    saVar.L();
                    break;
                }
                break;
            case 2:
                c7 c7Var = saVar.L1;
                if (c7Var != null && !saVar.T1) {
                    c7Var.Y = !c7Var.Y;
                    ArrayList arrayList = c7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((c7) obj).Y = saVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(saVar.L1.y);
                    c7 c7Var2 = saVar.L1;
                    boolean z12 = c7Var2.o0 != null;
                    if (saVar.h0 == -1) {
                        l3 l3Var = saVar.l1;
                        if (c7Var2.Y) {
                            N0 = hd.N0((!isEmpty || z12) ? 2131744349 : 2131744217, null);
                        } else {
                            N0 = hd.N0((!isEmpty || z12) ? 2131744348 : 2131744216, null);
                        }
                        boolean z13 = saVar.l1.W;
                        if (l3Var.getMeasuredWidth() < 0) {
                            l3Var.H = N0;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = l3Var.I;
                            if (!hd.a0 && z13) {
                                z10 = true;
                            }
                            n6Var.t(N0, z10, true);
                        }
                        saVar.l1.x();
                    }
                    saVar.e0(saVar.L1.Y, true);
                    saVar.Y0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = saVar.Y0.k();
                saVar.Y0.x(-9982, k10);
                ((we0) saVar.k1.c).a(!k10, true);
                break;
            case 4:
                if (saVar.C0 != null && !saVar.T1) {
                    String B = saVar.B();
                    String E = saVar.E();
                    if (B != null && !B.equals(E)) {
                        v9 v9Var = saVar.C0;
                        if (v9Var != null && v9Var.getCameraSession() != null) {
                            if (!saVar.C0.isFrontface() || saVar.C0.getCameraSession().hasFlashModes()) {
                                saVar.C0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = saVar.v2.indexOf(E);
                                if (indexOf >= 0) {
                                    saVar.u2 = indexOf;
                                    np.g1().edit().putInt("frontflash", saVar.u2).apply();
                                }
                            }
                        }
                        saVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                v9 v9Var2 = saVar.C0;
                if (v9Var2 != null && saVar.g0 == 0) {
                    v9Var2.toggleDual();
                    saVar.G0.setValue(saVar.C0.isDual());
                    saVar.G0.setContentDescription(hd.N0(saVar.C0.isDual() ? 2131754886 : 2131754887, null));
                    saVar.m1.f(true);
                    np.g1().edit().putInt("storydualhint", 2).apply();
                    if (saVar.n1.W) {
                        np.g1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    saVar.n1.f(true);
                    break;
                }
                break;
            case 6:
                if (saVar.g0 == 0 && !saVar.b2) {
                    v9 v9Var3 = saVar.C0;
                    if (v9Var3 != null && v9Var3.isDual()) {
                        saVar.C0.toggleDual();
                    }
                    if (!saVar.J0.e && !saVar.B0.j()) {
                        saVar.B0.o(saVar.A0);
                        saVar.J0.setSelected(saVar.A0);
                        saVar.H0.a(new w(saVar.A0, false), true);
                        saVar.H0.setSelected(true);
                        v9 v9Var4 = saVar.C0;
                        if (v9Var4 != null) {
                            v9Var4.recordHevc = !saVar.B0.j();
                        }
                        g3 g3Var = saVar.N0;
                        if (g3Var != null) {
                            g3Var.setMultipleOnClick(saVar.B0.j());
                            saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                        }
                    }
                    saVar.J0.a(!r1.e, true);
                    saVar.l0(true);
                    break;
                }
                break;
            case 7:
                saVar.B0.o(null);
                saVar.B0.c();
                saVar.J0.setSelected((v) null);
                v9 v9Var5 = saVar.C0;
                if (v9Var5 != null) {
                    v9Var5.recordHevc = !saVar.B0.j();
                }
                saVar.J0.a(false, true);
                saVar.l0(true);
                g3 g3Var2 = saVar.N0;
                if (g3Var2 != null) {
                    g3Var2.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                saVar.j0();
                break;
            case 9:
                v9 v9Var6 = saVar.C0;
                if (v9Var6 != null && !saVar.T1 && !saVar.Q1 && v9Var6.isInited() && saVar.g0 == 0) {
                    saVar.C0.switchCamera();
                    saVar.P0.d(180.0f);
                    sa.Z(saVar.C0.isFrontface());
                    if (!saVar.p0()) {
                        saVar.s.d();
                        break;
                    } else {
                        saVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                saVar.j0();
                break;
            case 11:
                c7 c7Var3 = saVar.L1;
                if (c7Var3 != null) {
                    c7Var3.f0 = true;
                    c7Var3.e0 = saVar.N1;
                    saVar.W();
                    c7 c7Var4 = saVar.L1;
                    if (c7Var4 != null && !c7Var4.b0) {
                        org.telegram.messenger.g0.h3(new r8(saVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (saVar.t2) {
                    saVar.Y(true);
                    break;
                }
                break;
            case 13:
                saVar.k0(-1, false, true);
                break;
            default:
                saVar.k0(-1, false, true);
                break;
        }
    }
}
