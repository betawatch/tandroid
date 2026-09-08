package di;

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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class ma implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ ma(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        pc pcVar = this.b;
        switch (i10) {
            case 0:
                pc pcVar2 = this.b;
                if (pcVar2.K1 != null && pcVar2.C2 == null && pcVar2.i1 != null) {
                    ValueAnimator valueAnimator = pcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = pcVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(pcVar2.n.getWidth(), pcVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        pcVar2.i1.setAlpha(0.0f);
                        dc dcVar = pcVar2.X0;
                        if (dcVar != null) {
                            dcVar.g0 = true;
                        }
                        rb rbVar = pcVar2.v1;
                        if (rbVar != null) {
                            rbVar.I0 = true;
                        }
                        pcVar2.n.draw(canvas);
                        dc dcVar2 = pcVar2.X0;
                        if (dcVar2 != null) {
                            dcVar2.g0 = false;
                        }
                        rb rbVar2 = pcVar2.v1;
                        if (rbVar2 != null) {
                            rbVar2.I0 = false;
                        }
                        pcVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        pcVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        xb xbVar = new xb(pcVar2, pcVar2.b, z11, canvas, (pcVar2.i1.getMeasuredWidth() / 2.0f) + f7, (pcVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        pcVar2.C2 = xbVar;
                        xbVar.setOnTouchListener(new ci.d(2));
                        pcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        pcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new yb(pcVar2, 0));
                        pcVar2.E2.addListener(new mb(pcVar2, 2));
                        pcVar2.E2.setStartDelay(80L);
                        pcVar2.E2.setDuration(z11 ? 320L : 450L);
                        pcVar2.E2.setInterpolator(z11 ? pr.i : pr.h);
                        pcVar2.E2.start();
                        pcVar2.n.addView(pcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ka(pcVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!pcVar.S1) {
                    pcVar.M();
                    break;
                }
                break;
            case 2:
                o8 o8Var = pcVar.K1;
                if (o8Var != null && !pcVar.S1) {
                    o8Var.Y = !o8Var.Y;
                    ArrayList arrayList = o8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((o8) obj).Y = pcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(pcVar.K1.y);
                    o8 o8Var2 = pcVar.K1;
                    boolean z12 = o8Var2.o0 != null;
                    if (pcVar.g0 == -1) {
                        f4 f4Var = pcVar.k1;
                        if (o8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = pcVar.k1.V;
                        if (f4Var.getMeasuredWidth() < 0) {
                            f4Var.G = string;
                        } else {
                            org.telegram.ui.Components.p6 p6Var = f4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            p6Var.q(string, z10, true);
                        }
                        pcVar.k1.u();
                    }
                    pcVar.f0(pcVar.K1.Y, true);
                    pcVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = pcVar.X0.k();
                pcVar.X0.x(-9982, k10);
                ((fg0) pcVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (pcVar.B0 != null && !pcVar.S1) {
                    String C = pcVar.C();
                    String F = pcVar.F();
                    if (C != null && !C.equals(F)) {
                        sb sbVar = pcVar.B0;
                        if (sbVar != null && sbVar.getCameraSession() != null) {
                            if (!pcVar.B0.isFrontface() || pcVar.B0.getCameraSession().hasFlashModes()) {
                                pcVar.B0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = pcVar.u2.indexOf(F);
                                if (indexOf >= 0) {
                                    pcVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", pcVar.t2).apply();
                                }
                            }
                        }
                        pcVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                sb sbVar2 = pcVar.B0;
                if (sbVar2 != null && pcVar.f0 == 0) {
                    sbVar2.toggleDual();
                    pcVar.F0.setValue(pcVar.B0.isDual());
                    pcVar.F0.setContentDescription(LocaleController.getString(pcVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    pcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (pcVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    pcVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (pcVar.f0 == 0 && !pcVar.a2) {
                    sb sbVar3 = pcVar.B0;
                    if (sbVar3 != null && sbVar3.isDual()) {
                        pcVar.B0.toggleDual();
                    }
                    if (!pcVar.I0.e && !pcVar.A0.j()) {
                        pcVar.A0.o(pcVar.z0);
                        pcVar.I0.setSelected(pcVar.z0);
                        pcVar.G0.a(new u(pcVar.z0, false), true);
                        pcVar.G0.setSelected(true);
                        sb sbVar4 = pcVar.B0;
                        if (sbVar4 != null) {
                            sbVar4.recordHevc = !pcVar.A0.j();
                        }
                        ob obVar = pcVar.M0;
                        if (obVar != null) {
                            obVar.setMultipleOnClick(pcVar.A0.j());
                            pcVar.M0.setMaxCount(Math.min(10, t.b() - pcVar.A0.getFilledCount()));
                        }
                    }
                    pcVar.I0.a(!r1.e, true);
                    pcVar.m0(true);
                    break;
                }
                break;
            case 7:
                pcVar.A0.o(null);
                pcVar.A0.e();
                pcVar.I0.setSelected((t) null);
                sb sbVar5 = pcVar.B0;
                if (sbVar5 != null) {
                    sbVar5.recordHevc = !pcVar.A0.j();
                }
                pcVar.I0.a(false, true);
                pcVar.m0(true);
                ob obVar2 = pcVar.M0;
                if (obVar2 != null) {
                    obVar2.setMultipleOnClick(pcVar.A0.j());
                    pcVar.M0.setMaxCount(Math.min(10, t.b() - pcVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                pcVar.k0();
                break;
            case 9:
                sb sbVar6 = pcVar.B0;
                if (sbVar6 != null && !pcVar.S1 && !pcVar.P1 && sbVar6.isInited() && pcVar.f0 == 0) {
                    pcVar.B0.switchCamera();
                    pcVar.O0.d(180.0f);
                    pc.a0(pcVar.B0.isFrontface());
                    if (!pcVar.q0()) {
                        pcVar.s.d();
                        break;
                    } else {
                        pcVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                pcVar.k0();
                break;
            case 11:
                o8 o8Var3 = pcVar.K1;
                if (o8Var3 != null) {
                    o8Var3.f0 = true;
                    o8Var3.e0 = pcVar.M1;
                    pcVar.X();
                    o8 o8Var4 = pcVar.K1;
                    if (o8Var4 != null && !o8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new ka(pcVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (pcVar.s2) {
                    pcVar.Z(true);
                    break;
                }
                break;
            case 13:
                pcVar.l0(-1, false, true);
                break;
            default:
                pcVar.l0(-1, false, true);
                break;
        }
    }
}
