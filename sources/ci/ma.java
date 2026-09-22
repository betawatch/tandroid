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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sg0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ma implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ ma(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        oc ocVar = this.b;
        switch (i10) {
            case 0:
                oc ocVar2 = this.b;
                if (ocVar2.K1 != null && ocVar2.C2 == null && ocVar2.i1 != null) {
                    ValueAnimator valueAnimator = ocVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = ocVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(ocVar2.n.getWidth(), ocVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ocVar2.i1.setAlpha(0.0f);
                        cc ccVar = ocVar2.X0;
                        if (ccVar != null) {
                            ccVar.g0 = true;
                        }
                        qb qbVar = ocVar2.v1;
                        if (qbVar != null) {
                            qbVar.I0 = true;
                        }
                        ocVar2.n.draw(canvas);
                        cc ccVar2 = ocVar2.X0;
                        if (ccVar2 != null) {
                            ccVar2.g0 = false;
                        }
                        qb qbVar2 = ocVar2.v1;
                        if (qbVar2 != null) {
                            qbVar2.I0 = false;
                        }
                        ocVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ocVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        wb wbVar = new wb(ocVar2, ocVar2.b, z11, canvas, (ocVar2.i1.getMeasuredWidth() / 2.0f) + f7, (ocVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        ocVar2.C2 = wbVar;
                        wbVar.setOnTouchListener(new bi.d(2));
                        ocVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ocVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new xb(ocVar2, 0));
                        ocVar2.E2.addListener(new mb(ocVar2, 2));
                        ocVar2.E2.setStartDelay(80L);
                        ocVar2.E2.setDuration(z11 ? 320L : 450L);
                        ocVar2.E2.setInterpolator(z11 ? qr.i : qr.h);
                        ocVar2.E2.start();
                        ocVar2.n.addView(ocVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ka(ocVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!ocVar.S1) {
                    ocVar.M();
                    break;
                }
                break;
            case 2:
                o8 o8Var = ocVar.K1;
                if (o8Var != null && !ocVar.S1) {
                    o8Var.Y = !o8Var.Y;
                    ArrayList arrayList = o8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((o8) obj).Y = ocVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(ocVar.K1.y);
                    o8 o8Var2 = ocVar.K1;
                    boolean z12 = o8Var2.o0 != null;
                    if (ocVar.g0 == -1) {
                        f4 f4Var = ocVar.k1;
                        if (o8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = ocVar.k1.V;
                        if (f4Var.getMeasuredWidth() < 0) {
                            f4Var.G = string;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = f4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            n6Var.q(string, z10, true);
                        }
                        ocVar.k1.u();
                    }
                    ocVar.f0(ocVar.K1.Y, true);
                    ocVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = ocVar.X0.k();
                ocVar.X0.x(-9982, k10);
                ((sg0) ocVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (ocVar.B0 != null && !ocVar.S1) {
                    String C = ocVar.C();
                    String F = ocVar.F();
                    if (C != null && !C.equals(F)) {
                        rb rbVar = ocVar.B0;
                        if (rbVar != null && rbVar.getCameraSession() != null) {
                            if (!ocVar.B0.isFrontface() || ocVar.B0.getCameraSession().hasFlashModes()) {
                                ocVar.B0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = ocVar.u2.indexOf(F);
                                if (indexOf >= 0) {
                                    ocVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", ocVar.t2).apply();
                                }
                            }
                        }
                        ocVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                rb rbVar2 = ocVar.B0;
                if (rbVar2 != null && ocVar.f0 == 0) {
                    rbVar2.toggleDual();
                    ocVar.F0.setValue(ocVar.B0.isDual());
                    ocVar.F0.setContentDescription(LocaleController.getString(ocVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    ocVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (ocVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    ocVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (ocVar.f0 == 0 && !ocVar.a2) {
                    rb rbVar3 = ocVar.B0;
                    if (rbVar3 != null && rbVar3.isDual()) {
                        ocVar.B0.toggleDual();
                    }
                    if (!ocVar.I0.e && !ocVar.A0.j()) {
                        ocVar.A0.o(ocVar.z0);
                        ocVar.I0.setSelected(ocVar.z0);
                        ocVar.G0.a(new u(ocVar.z0, false), true);
                        ocVar.G0.setSelected(true);
                        rb rbVar4 = ocVar.B0;
                        if (rbVar4 != null) {
                            rbVar4.recordHevc = !ocVar.A0.j();
                        }
                        nb nbVar = ocVar.M0;
                        if (nbVar != null) {
                            nbVar.setMultipleOnClick(ocVar.A0.j());
                            ocVar.M0.setMaxCount(Math.min(10, t.b() - ocVar.A0.getFilledCount()));
                        }
                    }
                    ocVar.I0.a(!r1.e, true);
                    ocVar.m0(true);
                    break;
                }
                break;
            case 7:
                ocVar.A0.o(null);
                ocVar.A0.e();
                ocVar.I0.setSelected((t) null);
                rb rbVar5 = ocVar.B0;
                if (rbVar5 != null) {
                    rbVar5.recordHevc = !ocVar.A0.j();
                }
                ocVar.I0.a(false, true);
                ocVar.m0(true);
                nb nbVar2 = ocVar.M0;
                if (nbVar2 != null) {
                    nbVar2.setMultipleOnClick(ocVar.A0.j());
                    ocVar.M0.setMaxCount(Math.min(10, t.b() - ocVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                ocVar.k0();
                break;
            case 9:
                rb rbVar6 = ocVar.B0;
                if (rbVar6 != null && !ocVar.S1 && !ocVar.P1 && rbVar6.isInited() && ocVar.f0 == 0) {
                    ocVar.B0.switchCamera();
                    ocVar.O0.d(180.0f);
                    oc.a0(ocVar.B0.isFrontface());
                    if (!ocVar.q0()) {
                        ocVar.s.d();
                        break;
                    } else {
                        ocVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                ocVar.k0();
                break;
            case 11:
                o8 o8Var3 = ocVar.K1;
                if (o8Var3 != null) {
                    o8Var3.f0 = true;
                    o8Var3.e0 = ocVar.M1;
                    ocVar.X();
                    o8 o8Var4 = ocVar.K1;
                    if (o8Var4 != null && !o8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new ka(ocVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (ocVar.s2) {
                    ocVar.Z(true);
                    break;
                }
                break;
            case 13:
                ocVar.l0(-1, false, true);
                break;
            default:
                ocVar.l0(-1, false, true);
                break;
        }
    }
}
