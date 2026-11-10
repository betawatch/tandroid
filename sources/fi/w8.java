package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ w8(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String M0;
        int i7 = this.a;
        boolean z9 = false;
        va vaVar = this.b;
        switch (i7) {
            case 0:
                va vaVar2 = this.b;
                if (vaVar2.K1 != null && vaVar2.C2 == null && vaVar2.i1 != null) {
                    ValueAnimator valueAnimator = vaVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z10 = vaVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vaVar2.n.getWidth(), vaVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vaVar2.i1.setAlpha(0.0f);
                        ja jaVar = vaVar2.X0;
                        if (jaVar != null) {
                            jaVar.g0 = true;
                        }
                        x9 x9Var = vaVar2.v1;
                        if (x9Var != null) {
                            x9Var.r0 = true;
                        }
                        vaVar2.n.draw(canvas);
                        ja jaVar2 = vaVar2.X0;
                        if (jaVar2 != null) {
                            jaVar2.g0 = false;
                        }
                        x9 x9Var2 = vaVar2.v1;
                        if (x9Var2 != null) {
                            x9Var2.r0 = false;
                        }
                        vaVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vaVar2.i1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        da daVar = new da(vaVar2, vaVar2.b, z10, canvas, (vaVar2.i1.getMeasuredWidth() / 2.0f) + f10, (vaVar2.i1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11);
                        vaVar2.C2 = daVar;
                        daVar.setOnTouchListener(new ei.b(2));
                        vaVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vaVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new ea(vaVar2, 0));
                        vaVar2.E2.addListener(new u9(vaVar2, 2));
                        vaVar2.E2.setStartDelay(80L);
                        vaVar2.E2.setDuration(z10 ? 320L : 450L);
                        vaVar2.E2.setInterpolator(z10 ? wq.i : wq.h);
                        vaVar2.E2.start();
                        vaVar2.n.addView(vaVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.h3(new u8(vaVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!vaVar.S1) {
                    vaVar.L();
                    break;
                }
                break;
            case 2:
                e7 e7Var = vaVar.K1;
                if (e7Var != null && !vaVar.S1) {
                    e7Var.Y = !e7Var.Y;
                    ArrayList arrayList = e7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((e7) obj).Y = vaVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vaVar.K1.y);
                    e7 e7Var2 = vaVar.K1;
                    boolean z11 = e7Var2.o0 != null;
                    if (vaVar.g0 == -1) {
                        m3 m3Var = vaVar.k1;
                        if (e7Var2.Y) {
                            M0 = id.M0((!isEmpty || z11) ? 2131744592 : 2131744460, null);
                        } else {
                            M0 = id.M0((!isEmpty || z11) ? 2131744591 : 2131744459, null);
                        }
                        boolean z12 = vaVar.k1.V;
                        if (m3Var.getMeasuredWidth() < 0) {
                            m3Var.G = M0;
                        } else {
                            org.telegram.ui.Components.h6 h6Var = m3Var.H;
                            if (!id.a0 && z12) {
                                z9 = true;
                            }
                            h6Var.t(M0, z9, true);
                        }
                        vaVar.k1.w();
                    }
                    vaVar.e0(vaVar.K1.Y, true);
                    vaVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = vaVar.X0.k();
                vaVar.X0.x(-9982, k10);
                ((he0) vaVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (vaVar.B0 != null && !vaVar.S1) {
                    String B = vaVar.B();
                    String E = vaVar.E();
                    if (B != null && !B.equals(E)) {
                        y9 y9Var = vaVar.B0;
                        if (y9Var != null && y9Var.getCameraSession() != null) {
                            if (!vaVar.B0.isFrontface() || vaVar.B0.getCameraSession().hasFlashModes()) {
                                vaVar.B0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = vaVar.u2.indexOf(E);
                                if (indexOf >= 0) {
                                    vaVar.t2 = indexOf;
                                    qp.e1().edit().putInt("frontflash", vaVar.t2).apply();
                                }
                            }
                        }
                        vaVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                y9 y9Var2 = vaVar.B0;
                if (y9Var2 != null && vaVar.f0 == 0) {
                    y9Var2.toggleDual();
                    vaVar.F0.setValue(vaVar.B0.isDual());
                    vaVar.F0.setContentDescription(id.M0(vaVar.B0.isDual() ? 2131754886 : 2131754887, null));
                    vaVar.l1.f(true);
                    qp.e1().edit().putInt("storydualhint", 2).apply();
                    if (vaVar.m1.V) {
                        qp.e1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vaVar.m1.f(true);
                    break;
                }
                break;
            case 6:
                if (vaVar.f0 == 0 && !vaVar.a2) {
                    y9 y9Var3 = vaVar.B0;
                    if (y9Var3 != null && y9Var3.isDual()) {
                        vaVar.B0.toggleDual();
                    }
                    if (!vaVar.I0.e && !vaVar.A0.j()) {
                        vaVar.A0.o(vaVar.z0);
                        vaVar.I0.setSelected(vaVar.z0);
                        vaVar.G0.a(new u(vaVar.z0, false), true);
                        vaVar.G0.setSelected(true);
                        y9 y9Var4 = vaVar.B0;
                        if (y9Var4 != null) {
                            y9Var4.recordHevc = !vaVar.A0.j();
                        }
                        i3 i3Var = vaVar.M0;
                        if (i3Var != null) {
                            i3Var.setMultipleOnClick(vaVar.A0.j());
                            vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                        }
                    }
                    vaVar.I0.a(!r1.e, true);
                    vaVar.l0(true);
                    break;
                }
                break;
            case 7:
                vaVar.A0.o(null);
                vaVar.A0.c();
                vaVar.I0.setSelected((t) null);
                y9 y9Var5 = vaVar.B0;
                if (y9Var5 != null) {
                    y9Var5.recordHevc = !vaVar.A0.j();
                }
                vaVar.I0.a(false, true);
                vaVar.l0(true);
                i3 i3Var2 = vaVar.M0;
                if (i3Var2 != null) {
                    i3Var2.setMultipleOnClick(vaVar.A0.j());
                    vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                vaVar.j0();
                break;
            case 9:
                y9 y9Var6 = vaVar.B0;
                if (y9Var6 != null && !vaVar.S1 && !vaVar.P1 && y9Var6.isInited() && vaVar.f0 == 0) {
                    vaVar.B0.switchCamera();
                    vaVar.O0.d(180.0f);
                    va.Z(vaVar.B0.isFrontface());
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
                e7 e7Var3 = vaVar.K1;
                if (e7Var3 != null) {
                    e7Var3.f0 = true;
                    e7Var3.e0 = vaVar.M1;
                    vaVar.W();
                    e7 e7Var4 = vaVar.K1;
                    if (e7Var4 != null && !e7Var4.b0) {
                        org.telegram.messenger.g0.i3(new u8(vaVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (vaVar.s2) {
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
