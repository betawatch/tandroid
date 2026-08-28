package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qf0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ x9(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i9 = this.a;
        boolean z10 = false;
        wb wbVar = this.b;
        switch (i9) {
            case 0:
                wb wbVar2 = this.b;
                if (wbVar2.G1 != null && wbVar2.y2 == null && wbVar2.e1 != null) {
                    ValueAnimator valueAnimator = wbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = wbVar2.G1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(wbVar2.n.getWidth(), wbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wbVar2.e1.setAlpha(0.0f);
                        kb kbVar = wbVar2.T0;
                        if (kbVar != null) {
                            kbVar.c0 = true;
                        }
                        ya yaVar = wbVar2.r1;
                        if (yaVar != null) {
                            yaVar.E0 = true;
                        }
                        wbVar2.n.draw(canvas);
                        kb kbVar2 = wbVar2.T0;
                        if (kbVar2 != null) {
                            kbVar2.c0 = false;
                        }
                        ya yaVar2 = wbVar2.r1;
                        if (yaVar2 != null) {
                            yaVar2.E0 = false;
                        }
                        wbVar2.e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wbVar2.e1.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        eb ebVar = new eb(wbVar2, wbVar2.b, z11, canvas, (wbVar2.e1.getMeasuredWidth() / 2.0f) + f10, (wbVar2.e1.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                        wbVar2.y2 = ebVar;
                        ebVar.setOnTouchListener(new jh.d(2));
                        wbVar2.z2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wbVar2.A2 = ofFloat;
                        ofFloat.addUpdateListener(new fb(wbVar2, 0));
                        wbVar2.A2.addListener(new ua(wbVar2, 2));
                        wbVar2.A2.setStartDelay(80L);
                        wbVar2.A2.setDuration(z11 ? 320L : 450L);
                        wbVar2.A2.setInterpolator(z11 ? gr.i : gr.h);
                        wbVar2.A2.start();
                        wbVar2.n.addView(wbVar2.y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new v9(wbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!wbVar.O1) {
                    wbVar.M();
                    break;
                }
                break;
            case 2:
                a8 a8Var = wbVar.G1;
                if (a8Var != null && !wbVar.O1) {
                    a8Var.Y = !a8Var.Y;
                    ArrayList arrayList = a8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            ((a8) obj).Y = wbVar.G1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(wbVar.G1.y);
                    a8 a8Var2 = wbVar.G1;
                    boolean z12 = a8Var2.o0 != null;
                    if (wbVar.c0 == -1) {
                        x3 x3Var = wbVar.g1;
                        if (a8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = wbVar.g1.R;
                        if (x3Var.getMeasuredWidth() < 0) {
                            x3Var.C = string;
                        } else {
                            org.telegram.ui.Components.i6 i6Var = x3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            i6Var.q(string, z10, true);
                        }
                        wbVar.g1.v();
                    }
                    wbVar.f0(wbVar.G1.Y, true);
                    wbVar.T0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = wbVar.T0.k();
                wbVar.T0.x(-9982, k10);
                ((qf0) wbVar.f1.c).a(!k10, true);
                break;
            case 4:
                if (wbVar.x0 != null && !wbVar.O1) {
                    String C = wbVar.C();
                    String F = wbVar.F();
                    if (C != null && !C.equals(F)) {
                        za zaVar = wbVar.x0;
                        if (zaVar != null && zaVar.getCameraSession() != null) {
                            if (!wbVar.x0.isFrontface() || wbVar.x0.getCameraSession().hasFlashModes()) {
                                wbVar.x0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = wbVar.q2.indexOf(F);
                                if (indexOf >= 0) {
                                    wbVar.p2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", wbVar.p2).apply();
                                }
                            }
                        }
                        wbVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                za zaVar2 = wbVar.x0;
                if (zaVar2 != null && wbVar.b0 == 0) {
                    zaVar2.toggleDual();
                    wbVar.B0.setValue(wbVar.x0.isDual());
                    wbVar.B0.setContentDescription(LocaleController.getString(wbVar.x0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    wbVar.h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (wbVar.i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    wbVar.i1.e(true);
                    break;
                }
                break;
            case 6:
                if (wbVar.b0 == 0 && !wbVar.W1) {
                    za zaVar3 = wbVar.x0;
                    if (zaVar3 != null && zaVar3.isDual()) {
                        wbVar.x0.toggleDual();
                    }
                    if (!wbVar.E0.e && !wbVar.w0.j()) {
                        wbVar.w0.o(wbVar.v0);
                        wbVar.E0.setSelected(wbVar.v0);
                        wbVar.C0.a(new v(wbVar.v0, false), true);
                        wbVar.C0.setSelected(true);
                        za zaVar4 = wbVar.x0;
                        if (zaVar4 != null) {
                            zaVar4.recordHevc = !wbVar.w0.j();
                        }
                        va vaVar = wbVar.I0;
                        if (vaVar != null) {
                            vaVar.setMultipleOnClick(wbVar.w0.j());
                            wbVar.I0.setMaxCount(Math.min(10, u.b() - wbVar.w0.getFilledCount()));
                        }
                    }
                    wbVar.E0.a(!r1.e, true);
                    wbVar.m0(true);
                    break;
                }
                break;
            case 7:
                wbVar.w0.o(null);
                wbVar.w0.e();
                wbVar.E0.setSelected((u) null);
                za zaVar5 = wbVar.x0;
                if (zaVar5 != null) {
                    zaVar5.recordHevc = !wbVar.w0.j();
                }
                wbVar.E0.a(false, true);
                wbVar.m0(true);
                va vaVar2 = wbVar.I0;
                if (vaVar2 != null) {
                    vaVar2.setMultipleOnClick(wbVar.w0.j());
                    wbVar.I0.setMaxCount(Math.min(10, u.b() - wbVar.w0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                wbVar.k0();
                break;
            case 9:
                za zaVar6 = wbVar.x0;
                if (zaVar6 != null && !wbVar.O1 && !wbVar.L1 && zaVar6.isInited() && wbVar.b0 == 0) {
                    wbVar.x0.switchCamera();
                    wbVar.K0.d(180.0f);
                    wb.a0(wbVar.x0.isFrontface());
                    if (!wbVar.q0()) {
                        wbVar.s.d();
                        break;
                    } else {
                        wbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                wbVar.k0();
                break;
            case 11:
                a8 a8Var3 = wbVar.G1;
                if (a8Var3 != null) {
                    a8Var3.f0 = true;
                    a8Var3.e0 = wbVar.I1;
                    wbVar.X();
                    a8 a8Var4 = wbVar.G1;
                    if (a8Var4 != null && !a8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new v9(wbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (wbVar.o2) {
                    wbVar.Z(true);
                    break;
                }
                break;
            case 13:
                wbVar.l0(-1, false, true);
                break;
            default:
                wbVar.l0(-1, false, true);
                break;
        }
    }
}
