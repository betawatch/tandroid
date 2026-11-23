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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ o9(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String N0;
        int i7 = this.a;
        boolean z10 = false;
        nb nbVar = this.b;
        switch (i7) {
            case 0:
                nb nbVar2 = this.b;
                if (nbVar2.L1 != null && nbVar2.D2 == null && nbVar2.j1 != null) {
                    ValueAnimator valueAnimator = nbVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = nbVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(nbVar2.n.getWidth(), nbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        nbVar2.j1.setAlpha(0.0f);
                        bb bbVar = nbVar2.Y0;
                        if (bbVar != null) {
                            bbVar.h0 = true;
                        }
                        pa paVar = nbVar2.w1;
                        if (paVar != null) {
                            paVar.s0 = true;
                        }
                        nbVar2.n.draw(canvas);
                        bb bbVar2 = nbVar2.Y0;
                        if (bbVar2 != null) {
                            bbVar2.h0 = false;
                        }
                        pa paVar2 = nbVar2.w1;
                        if (paVar2 != null) {
                            paVar2.s0 = false;
                        }
                        nbVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        nbVar2.j1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        va vaVar = new va(nbVar2, nbVar2.b, z11, canvas, (nbVar2.j1.getMeasuredWidth() / 2.0f) + f10, (nbVar2.j1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11);
                        nbVar2.D2 = vaVar;
                        vaVar.setOnTouchListener(new gi.a(2));
                        nbVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        nbVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new wa(nbVar2, 0));
                        nbVar2.F2.addListener(new na(nbVar2, 2));
                        nbVar2.F2.setStartDelay(80L);
                        nbVar2.F2.setDuration(z11 ? 320L : 450L);
                        nbVar2.F2.setInterpolator(z11 ? kr.i : kr.h);
                        nbVar2.F2.start();
                        nbVar2.n.addView(nbVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.g0.g3(new m9(nbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!nbVar.T1) {
                    nbVar.L();
                    break;
                }
                break;
            case 2:
                x7 x7Var = nbVar.L1;
                if (x7Var != null && !nbVar.T1) {
                    x7Var.Y = !x7Var.Y;
                    ArrayList arrayList = x7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((x7) obj).Y = nbVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(nbVar.L1.y);
                    x7 x7Var2 = nbVar.L1;
                    boolean z12 = x7Var2.o0 != null;
                    if (nbVar.h0 == -1) {
                        u3 u3Var = nbVar.l1;
                        if (x7Var2.Y) {
                            N0 = gd.N0((!isEmpty || z12) ? 2131744348 : 2131744216, null);
                        } else {
                            N0 = gd.N0((!isEmpty || z12) ? 2131744347 : 2131744215, null);
                        }
                        boolean z13 = nbVar.l1.W;
                        if (u3Var.getMeasuredWidth() < 0) {
                            u3Var.H = N0;
                        } else {
                            org.telegram.ui.Components.m6 m6Var = u3Var.I;
                            if (!gd.a0 && z13) {
                                z10 = true;
                            }
                            m6Var.t(N0, z10, true);
                        }
                        nbVar.l1.x();
                    }
                    nbVar.e0(nbVar.L1.Y, true);
                    nbVar.Y0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = nbVar.Y0.k();
                nbVar.Y0.x(-9982, k10);
                ((ve0) nbVar.k1.c).a(!k10, true);
                break;
            case 4:
                if (nbVar.C0 != null && !nbVar.T1) {
                    String B = nbVar.B();
                    String E = nbVar.E();
                    if (B != null && !B.equals(E)) {
                        qa qaVar = nbVar.C0;
                        if (qaVar != null && qaVar.getCameraSession() != null) {
                            if (!nbVar.C0.isFrontface() || nbVar.C0.getCameraSession().hasFlashModes()) {
                                nbVar.C0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = nbVar.v2.indexOf(E);
                                if (indexOf >= 0) {
                                    nbVar.u2 = indexOf;
                                    mp.g1().edit().putInt("frontflash", nbVar.u2).apply();
                                }
                            }
                        }
                        nbVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                qa qaVar2 = nbVar.C0;
                if (qaVar2 != null && nbVar.g0 == 0) {
                    qaVar2.toggleDual();
                    nbVar.G0.setValue(nbVar.C0.isDual());
                    nbVar.G0.setContentDescription(gd.N0(nbVar.C0.isDual() ? 2131754886 : 2131754887, null));
                    nbVar.m1.f(true);
                    mp.g1().edit().putInt("storydualhint", 2).apply();
                    if (nbVar.n1.W) {
                        mp.g1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    nbVar.n1.f(true);
                    break;
                }
                break;
            case 6:
                if (nbVar.g0 == 0 && !nbVar.b2) {
                    qa qaVar3 = nbVar.C0;
                    if (qaVar3 != null && qaVar3.isDual()) {
                        nbVar.C0.toggleDual();
                    }
                    if (!nbVar.J0.e && !nbVar.B0.j()) {
                        nbVar.B0.o(nbVar.A0);
                        nbVar.J0.setSelected(nbVar.A0);
                        nbVar.H0.a(new d0(nbVar.A0, false), true);
                        nbVar.H0.setSelected(true);
                        qa qaVar4 = nbVar.C0;
                        if (qaVar4 != null) {
                            qaVar4.recordHevc = !nbVar.B0.j();
                        }
                        p3 p3Var = nbVar.N0;
                        if (p3Var != null) {
                            p3Var.setMultipleOnClick(nbVar.B0.j());
                            nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                        }
                    }
                    nbVar.J0.a(!r1.e, true);
                    nbVar.l0(true);
                    break;
                }
                break;
            case 7:
                nbVar.B0.o(null);
                nbVar.B0.c();
                nbVar.J0.setSelected((c0) null);
                qa qaVar5 = nbVar.C0;
                if (qaVar5 != null) {
                    qaVar5.recordHevc = !nbVar.B0.j();
                }
                nbVar.J0.a(false, true);
                nbVar.l0(true);
                p3 p3Var2 = nbVar.N0;
                if (p3Var2 != null) {
                    p3Var2.setMultipleOnClick(nbVar.B0.j());
                    nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                nbVar.j0();
                break;
            case 9:
                qa qaVar6 = nbVar.C0;
                if (qaVar6 != null && !nbVar.T1 && !nbVar.Q1 && qaVar6.isInited() && nbVar.g0 == 0) {
                    nbVar.C0.switchCamera();
                    nbVar.P0.d(180.0f);
                    nb.Z(nbVar.C0.isFrontface());
                    if (!nbVar.p0()) {
                        nbVar.s.d();
                        break;
                    } else {
                        nbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                nbVar.j0();
                break;
            case 11:
                x7 x7Var3 = nbVar.L1;
                if (x7Var3 != null) {
                    x7Var3.f0 = true;
                    x7Var3.e0 = nbVar.N1;
                    nbVar.W();
                    x7 x7Var4 = nbVar.L1;
                    if (x7Var4 != null && !x7Var4.b0) {
                        org.telegram.messenger.g0.h3(new m9(nbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (nbVar.t2) {
                    nbVar.Y(true);
                    break;
                }
                break;
            case 13:
                nbVar.k0(-1, false, true);
                break;
            default:
                nbVar.k0(-1, false, true);
                break;
        }
    }
}
