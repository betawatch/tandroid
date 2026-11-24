// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8b implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ h8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String M0;
        byte b = this.a;
        byte b2 = 2;
        boolean z = false;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9b v9bVar2 = this.b;
                if (v9bVar2.L1 != null && v9bVar2.D2 == null && v9bVar2.j1 != null) {
                    ValueAnimator valueAnimator = v9bVar2.F2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z2 = v9bVar2.L1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(v9bVar2.n.getWidth(), v9bVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        v9bVar2.j1.setAlpha(0.0f);
                        k9b k9bVar = v9bVar2.Y0;
                        if (k9bVar != null) {
                            k9bVar.h0 = true;
                        }
                        z8b z8bVar = v9bVar2.w1;
                        if (z8bVar != null) {
                            z8bVar.y0 = true;
                        }
                        v9bVar2.n.draw(canvas);
                        k9b k9bVar2 = v9bVar2.Y0;
                        if (k9bVar2 != null) {
                            k9bVar2.h0 = false;
                        }
                        z8b z8bVar2 = v9bVar2.w1;
                        if (z8bVar2 != null) {
                            z8bVar2.y0 = false;
                        }
                        v9bVar2.j1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        v9bVar2.j1.getLocationInWindow(iArr);
                        float f = iArr[0];
                        float f2 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + gm.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        f9b f9bVar = new f9b(v9bVar2, v9bVar2.b, z2, canvas, (v9bVar2.j1.getMeasuredWidth() / 2.0f) + f, (v9bVar2.j1.getMeasuredHeight() / 2.0f) + f2, max, paint, createBitmap, paint2, f, f2);
                        v9bVar2.D2 = f9bVar;
                        f9bVar.setOnTouchListener(new w02((byte) 27));
                        v9bVar2.E2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        v9bVar2.F2 = ofFloat;
                        ofFloat.addUpdateListener(new gi1(v9bVar2, b2));
                        v9bVar2.F2.addListener(new x8b(v9bVar2, (byte) 2));
                        v9bVar2.F2.setStartDelay(80L);
                        v9bVar2.F2.setDuration(z2 ? 320L : 450L);
                        v9bVar2.F2.setInterpolator(z2 ? d53.i : d53.h);
                        v9bVar2.F2.start();
                        v9bVar2.n.addView(v9bVar2.D2, new ViewGroup.LayoutParams(-1, -1));
                        gm.c3(new f8b(v9bVar2, (byte) 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!v9bVar.T1) {
                    v9bVar.K();
                    break;
                }
                break;
            case 2:
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null && !v9bVar.T1) {
                    g6bVar.Y = !g6bVar.Y;
                    ArrayList arrayList = g6bVar.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((g6b) obj).Y = v9bVar.L1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(v9bVar.L1.y);
                    g6b g6bVar2 = v9bVar.L1;
                    boolean z3 = g6bVar2.o0 != null;
                    if (v9bVar.h0 == -1) {
                        hg5 hg5Var = v9bVar.l1;
                        if (g6bVar2.Y) {
                            M0 = jb6.M0((!isEmpty || z3) ? 2131744278 : 2131744146, null);
                        } else {
                            M0 = jb6.M0((!isEmpty || z3) ? 2131744277 : 2131744145, null);
                        }
                        boolean z4 = v9bVar.l1.W;
                        if (hg5Var.getMeasuredWidth() < 0) {
                            hg5Var.H = M0;
                        } else {
                            ho hoVar = hg5Var.I;
                            if (!jb6.a0 && z4) {
                                z = true;
                            }
                            hoVar.t(M0, z, true);
                        }
                        v9bVar.l1.v();
                    }
                    v9bVar.e0(v9bVar.L1.Y, true);
                    v9bVar.Y0.b();
                    break;
                }
                break;
            case 3:
                boolean j = v9bVar.Y0.j();
                v9bVar.Y0.x(-9982, j);
                ((ae8) v9bVar.k1.c).a(!j, true);
                break;
            case 4:
                if (v9bVar.C0 != null && !v9bVar.T1) {
                    String A = v9bVar.A();
                    String D = v9bVar.D();
                    if (A != null && !A.equals(D)) {
                        a9b a9bVar = v9bVar.C0;
                        if (a9bVar != null && a9bVar.getCameraSession() != null) {
                            if (!v9bVar.C0.isFrontface() || v9bVar.C0.getCameraSession().hasFlashModes()) {
                                v9bVar.C0.getCameraSession().setCurrentFlashMode(D);
                            } else {
                                int indexOf = v9bVar.v2.indexOf(D);
                                if (indexOf >= 0) {
                                    v9bVar.u2 = indexOf;
                                    oc7.d1().edit().putInt("frontflash", v9bVar.u2).apply();
                                }
                            }
                        }
                        v9bVar.d0(D);
                        break;
                    }
                }
                break;
            case 5:
                a9b a9bVar2 = v9bVar.C0;
                if (a9bVar2 != null && v9bVar.g0 == 0) {
                    a9bVar2.toggleDual();
                    v9bVar.G0.setValue(v9bVar.C0.isDual());
                    v9bVar.G0.setContentDescription(jb6.M0(v9bVar.C0.isDual() ? 2131754886 : 2131754887, null));
                    v9bVar.m1.f(true);
                    oc7.d1().edit().putInt("storydualhint", 2).apply();
                    if (v9bVar.n1.W) {
                        oc7.d1().edit().putInt("storysvddualhint", 2).apply();
                    }
                    v9bVar.n1.f(true);
                    break;
                }
                break;
            case 6:
                if (v9bVar.g0 == 0 && !v9bVar.b2) {
                    a9b a9bVar3 = v9bVar.C0;
                    if (a9bVar3 != null && a9bVar3.isDual()) {
                        v9bVar.C0.toggleDual();
                    }
                    if (!v9bVar.J0.e && !v9bVar.B0.i()) {
                        v9bVar.B0.o(v9bVar.A0);
                        v9bVar.J0.setSelected(v9bVar.A0);
                        v9bVar.H0.a(new tl2(v9bVar.A0, false), true);
                        v9bVar.H0.setSelected(true);
                        a9b a9bVar4 = v9bVar.C0;
                        if (a9bVar4 != null) {
                            a9bVar4.recordHevc = !v9bVar.B0.i();
                        }
                        wt4 wt4Var = v9bVar.N0;
                        if (wt4Var != null) {
                            wt4Var.setMultipleOnClick(v9bVar.B0.i());
                            v9bVar.N0.setMaxCount(Math.min(10, sl2.b() - v9bVar.B0.getFilledCount()));
                        }
                    }
                    v9bVar.J0.a(!r0.e, true);
                    v9bVar.l0(true);
                    break;
                }
                break;
            case 7:
                v9bVar.B0.o(null);
                v9bVar.B0.b();
                v9bVar.J0.setSelected((sl2) null);
                a9b a9bVar5 = v9bVar.C0;
                if (a9bVar5 != null) {
                    a9bVar5.recordHevc = !v9bVar.B0.i();
                }
                v9bVar.J0.a(false, true);
                v9bVar.l0(true);
                wt4 wt4Var2 = v9bVar.N0;
                if (wt4Var2 != null) {
                    wt4Var2.setMultipleOnClick(v9bVar.B0.i());
                    v9bVar.N0.setMaxCount(Math.min(10, sl2.b() - v9bVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                v9bVar.j0();
                break;
            case 9:
                a9b a9bVar6 = v9bVar.C0;
                if (a9bVar6 != null && !v9bVar.T1 && !v9bVar.Q1 && a9bVar6.isInited() && v9bVar.g0 == 0) {
                    v9bVar.C0.switchCamera();
                    v9bVar.P0.d(180.0f);
                    oc7.d1().edit().putBoolean("stories_camera", v9bVar.C0.isFrontface()).apply();
                    boolean p0 = v9bVar.p0();
                    rk4 rk4Var = v9bVar.s;
                    if (!p0) {
                        rk4Var.d();
                        break;
                    } else {
                        rk4Var.c(null);
                        break;
                    }
                }
                break;
            case 10:
                v9bVar.j0();
                break;
            case 11:
                g6b g6bVar3 = v9bVar.L1;
                if (g6bVar3 != null) {
                    g6bVar3.f0 = true;
                    g6bVar3.e0 = v9bVar.N1;
                    v9bVar.W();
                    g6b g6bVar4 = v9bVar.L1;
                    if (g6bVar4 != null && !g6bVar4.b0) {
                        gm.d3(new f8b(v9bVar, (byte) 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (v9bVar.t2) {
                    v9bVar.Z(true);
                    break;
                }
                break;
            case 13:
                v9bVar.k0(-1, false, true);
                break;
            default:
                v9bVar.k0(-1, false, true);
                break;
        }
    }
}
