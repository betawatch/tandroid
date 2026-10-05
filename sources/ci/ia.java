package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ ia(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        kc kcVar = this.b;
        switch (i10) {
            case 0:
                kc kcVar2 = this.b;
                if (kcVar2.K1 != null && kcVar2.C2 == null && kcVar2.i1 != null) {
                    ValueAnimator valueAnimator = kcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = kcVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(kcVar2.n.getWidth(), kcVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        kcVar2.i1.setAlpha(0.0f);
                        yb ybVar = kcVar2.X0;
                        if (ybVar != null) {
                            ybVar.g0 = true;
                        }
                        mb mbVar = kcVar2.v1;
                        if (mbVar != null) {
                            mbVar.I0 = true;
                        }
                        kcVar2.n.draw(canvas);
                        yb ybVar2 = kcVar2.X0;
                        if (ybVar2 != null) {
                            ybVar2.g0 = false;
                        }
                        mb mbVar2 = kcVar2.v1;
                        if (mbVar2 != null) {
                            mbVar2.I0 = false;
                        }
                        kcVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        kcVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        sb sbVar = new sb(kcVar2, kcVar2.b, z11, canvas, (kcVar2.i1.getMeasuredWidth() / 2.0f) + f7, (kcVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        kcVar2.C2 = sbVar;
                        sbVar.setOnTouchListener(new bi.d(2));
                        kcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        kcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new tb(kcVar2, 0));
                        kcVar2.E2.addListener(new ib(kcVar2, 2));
                        kcVar2.E2.setStartDelay(80L);
                        kcVar2.E2.setDuration(z11 ? 320L : 450L);
                        kcVar2.E2.setInterpolator(z11 ? tr.i : tr.h);
                        kcVar2.E2.start();
                        kcVar2.n.addView(kcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ga(kcVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!kcVar.S1) {
                    kcVar.M();
                    break;
                }
                break;
            case 2:
                k8 k8Var = kcVar.K1;
                if (k8Var != null && !kcVar.S1) {
                    k8Var.Y = !k8Var.Y;
                    ArrayList arrayList = k8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((k8) obj).Y = kcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(kcVar.K1.y);
                    k8 k8Var2 = kcVar.K1;
                    boolean z12 = k8Var2.o0 != null;
                    if (kcVar.g0 == -1) {
                        e4 e4Var = kcVar.k1;
                        if (k8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = kcVar.k1.V;
                        if (e4Var.getMeasuredWidth() < 0) {
                            e4Var.G = string;
                        } else {
                            org.telegram.ui.Components.o6 o6Var = e4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            o6Var.q(string, z10, true);
                        }
                        kcVar.k1.u();
                    }
                    kcVar.f0(kcVar.K1.Y, true);
                    kcVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = kcVar.X0.k();
                kcVar.X0.x(-9982, k10);
                ((sg0) kcVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (kcVar.B0 != null && !kcVar.S1) {
                    String C = kcVar.C();
                    String F = kcVar.F();
                    if (C != null && !C.equals(F)) {
                        nb nbVar = kcVar.B0;
                        if (nbVar != null && nbVar.getCameraSession() != null) {
                            if (!kcVar.B0.isFrontface() || kcVar.B0.getCameraSession().hasFlashModes()) {
                                kcVar.B0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = kcVar.u2.indexOf(F);
                                if (indexOf >= 0) {
                                    kcVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", kcVar.t2).apply();
                                }
                            }
                        }
                        kcVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                nb nbVar2 = kcVar.B0;
                if (nbVar2 != null && kcVar.f0 == 0) {
                    nbVar2.toggleDual();
                    kcVar.F0.setValue(kcVar.B0.isDual());
                    kcVar.F0.setContentDescription(LocaleController.getString(kcVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    kcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (kcVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    kcVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (kcVar.f0 == 0 && !kcVar.a2) {
                    nb nbVar3 = kcVar.B0;
                    if (nbVar3 != null && nbVar3.isDual()) {
                        kcVar.B0.toggleDual();
                    }
                    if (!kcVar.I0.e && !kcVar.A0.j()) {
                        kcVar.A0.o(kcVar.z0);
                        kcVar.I0.setSelected(kcVar.z0);
                        kcVar.G0.a(new u(kcVar.z0, false), true);
                        kcVar.G0.setSelected(true);
                        nb nbVar4 = kcVar.B0;
                        if (nbVar4 != null) {
                            nbVar4.recordHevc = !kcVar.A0.j();
                        }
                        jb jbVar = kcVar.M0;
                        if (jbVar != null) {
                            jbVar.setMultipleOnClick(kcVar.A0.j());
                            kcVar.M0.setMaxCount(Math.min(10, t.b() - kcVar.A0.getFilledCount()));
                        }
                    }
                    kcVar.I0.a(!r1.e, true);
                    kcVar.m0(true);
                    break;
                }
                break;
            case 7:
                kcVar.A0.o(null);
                kcVar.A0.e();
                kcVar.I0.setSelected((t) null);
                nb nbVar5 = kcVar.B0;
                if (nbVar5 != null) {
                    nbVar5.recordHevc = !kcVar.A0.j();
                }
                kcVar.I0.a(false, true);
                kcVar.m0(true);
                jb jbVar2 = kcVar.M0;
                if (jbVar2 != null) {
                    jbVar2.setMultipleOnClick(kcVar.A0.j());
                    kcVar.M0.setMaxCount(Math.min(10, t.b() - kcVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                kcVar.k0();
                break;
            case 9:
                nb nbVar6 = kcVar.B0;
                if (nbVar6 != null && !kcVar.S1 && !kcVar.P1 && nbVar6.isInited() && kcVar.f0 == 0) {
                    kcVar.B0.switchCamera();
                    kcVar.O0.d(180.0f);
                    kc.a0(kcVar.B0.isFrontface());
                    if (!kcVar.q0()) {
                        kcVar.s.d();
                        break;
                    } else {
                        kcVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                kcVar.k0();
                break;
            case 11:
                k8 k8Var3 = kcVar.K1;
                if (k8Var3 != null) {
                    k8Var3.f0 = true;
                    k8Var3.e0 = kcVar.M1;
                    kcVar.X();
                    k8 k8Var4 = kcVar.K1;
                    if (k8Var4 != null && !k8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new ga(kcVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (kcVar.s2) {
                    kcVar.Z(true);
                    break;
                }
                break;
            case 13:
                kcVar.l0(-1, false, true);
                break;
            default:
                kcVar.l0(-1, false, true);
                break;
        }
    }
}
