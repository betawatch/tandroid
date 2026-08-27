package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tf0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ u9(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        sb sbVar = this.b;
        switch (i10) {
            case 0:
                sb sbVar2 = this.b;
                if (sbVar2.G1 != null && sbVar2.y2 == null && sbVar2.e1 != null) {
                    ValueAnimator valueAnimator = sbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = sbVar2.G1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(sbVar2.n.getWidth(), sbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        sbVar2.e1.setAlpha(0.0f);
                        hb hbVar = sbVar2.T0;
                        if (hbVar != null) {
                            hbVar.c0 = true;
                        }
                        va vaVar = sbVar2.r1;
                        if (vaVar != null) {
                            vaVar.E0 = true;
                        }
                        sbVar2.n.draw(canvas);
                        hb hbVar2 = sbVar2.T0;
                        if (hbVar2 != null) {
                            hbVar2.c0 = false;
                        }
                        va vaVar2 = sbVar2.r1;
                        if (vaVar2 != null) {
                            vaVar2.E0 = false;
                        }
                        sbVar2.e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        sbVar2.e1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        bb bbVar = new bb(sbVar2, sbVar2.b, z11, canvas, (sbVar2.e1.getMeasuredWidth() / 2.0f) + f10, (sbVar2.e1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                        sbVar2.y2 = bbVar;
                        bbVar.setOnTouchListener(new kh.e(2));
                        sbVar2.z2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        sbVar2.A2 = ofFloat;
                        ofFloat.addUpdateListener(new cb(sbVar2, 0));
                        sbVar2.A2.addListener(new ra(sbVar2, 2));
                        sbVar2.A2.setStartDelay(80L);
                        sbVar2.A2.setDuration(z11 ? 320L : 450L);
                        sbVar2.A2.setInterpolator(z11 ? er.i : er.h);
                        sbVar2.A2.start();
                        sbVar2.n.addView(sbVar2.y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new s9(sbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!sbVar.O1) {
                    sbVar.M();
                    break;
                }
                break;
            case 2:
                z7 z7Var = sbVar.G1;
                if (z7Var != null && !sbVar.O1) {
                    z7Var.Y = !z7Var.Y;
                    ArrayList arrayList = z7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((z7) obj).Y = sbVar.G1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(sbVar.G1.y);
                    z7 z7Var2 = sbVar.G1;
                    boolean z12 = z7Var2.o0 != null;
                    if (sbVar.c0 == -1) {
                        w3 w3Var = sbVar.g1;
                        if (z7Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = sbVar.g1.R;
                        if (w3Var.getMeasuredWidth() < 0) {
                            w3Var.C = string;
                        } else {
                            org.telegram.ui.Components.i6 i6Var = w3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            i6Var.q(string, z10, true);
                        }
                        sbVar.g1.v();
                    }
                    sbVar.f0(sbVar.G1.Y, true);
                    sbVar.T0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = sbVar.T0.k();
                sbVar.T0.x(-9982, k10);
                ((tf0) sbVar.f1.c).a(!k10, true);
                break;
            case 4:
                if (sbVar.x0 != null && !sbVar.O1) {
                    String C = sbVar.C();
                    String F = sbVar.F();
                    if (C != null && !C.equals(F)) {
                        wa waVar = sbVar.x0;
                        if (waVar != null && waVar.getCameraSession() != null) {
                            if (!sbVar.x0.isFrontface() || sbVar.x0.getCameraSession().hasFlashModes()) {
                                sbVar.x0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = sbVar.q2.indexOf(F);
                                if (indexOf >= 0) {
                                    sbVar.p2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", sbVar.p2).apply();
                                }
                            }
                        }
                        sbVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                wa waVar2 = sbVar.x0;
                if (waVar2 != null && sbVar.b0 == 0) {
                    waVar2.toggleDual();
                    sbVar.B0.setValue(sbVar.x0.isDual());
                    sbVar.B0.setContentDescription(LocaleController.getString(sbVar.x0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    sbVar.h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (sbVar.i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    sbVar.i1.e(true);
                    break;
                }
                break;
            case 6:
                if (sbVar.b0 == 0 && !sbVar.W1) {
                    wa waVar3 = sbVar.x0;
                    if (waVar3 != null && waVar3.isDual()) {
                        sbVar.x0.toggleDual();
                    }
                    if (!sbVar.E0.e && !sbVar.w0.j()) {
                        sbVar.w0.o(sbVar.v0);
                        sbVar.E0.setSelected(sbVar.v0);
                        sbVar.C0.a(new v(sbVar.v0, false), true);
                        sbVar.C0.setSelected(true);
                        wa waVar4 = sbVar.x0;
                        if (waVar4 != null) {
                            waVar4.recordHevc = !sbVar.w0.j();
                        }
                        sa saVar = sbVar.I0;
                        if (saVar != null) {
                            saVar.setMultipleOnClick(sbVar.w0.j());
                            sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.w0.getFilledCount()));
                        }
                    }
                    sbVar.E0.a(!r1.e, true);
                    sbVar.m0(true);
                    break;
                }
                break;
            case 7:
                sbVar.w0.o(null);
                sbVar.w0.e();
                sbVar.E0.setSelected((u) null);
                wa waVar5 = sbVar.x0;
                if (waVar5 != null) {
                    waVar5.recordHevc = !sbVar.w0.j();
                }
                sbVar.E0.a(false, true);
                sbVar.m0(true);
                sa saVar2 = sbVar.I0;
                if (saVar2 != null) {
                    saVar2.setMultipleOnClick(sbVar.w0.j());
                    sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.w0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                sbVar.k0();
                break;
            case 9:
                wa waVar6 = sbVar.x0;
                if (waVar6 != null && !sbVar.O1 && !sbVar.L1 && waVar6.isInited() && sbVar.b0 == 0) {
                    sbVar.x0.switchCamera();
                    sbVar.K0.d(180.0f);
                    sb.a0(sbVar.x0.isFrontface());
                    if (!sbVar.q0()) {
                        sbVar.s.d();
                        break;
                    } else {
                        sbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                sbVar.k0();
                break;
            case 11:
                z7 z7Var3 = sbVar.G1;
                if (z7Var3 != null) {
                    z7Var3.f0 = true;
                    z7Var3.e0 = sbVar.I1;
                    sbVar.X();
                    z7 z7Var4 = sbVar.G1;
                    if (z7Var4 != null && !z7Var4.b0) {
                        AndroidUtilities.runOnUIThread(new s9(sbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (sbVar.o2) {
                    sbVar.Z(true);
                    break;
                }
                break;
            case 13:
                sbVar.l0(-1, false, true);
                break;
            default:
                sbVar.l0(-1, false, true);
                break;
        }
    }
}
