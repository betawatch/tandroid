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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ ja(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        lc lcVar = this.b;
        switch (i10) {
            case 0:
                lc lcVar2 = this.b;
                if (lcVar2.K1 != null && lcVar2.C2 == null && lcVar2.i1 != null) {
                    ValueAnimator valueAnimator = lcVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = lcVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(lcVar2.n.getWidth(), lcVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        lcVar2.i1.setAlpha(0.0f);
                        zb zbVar = lcVar2.X0;
                        if (zbVar != null) {
                            zbVar.g0 = true;
                        }
                        nb nbVar = lcVar2.v1;
                        if (nbVar != null) {
                            nbVar.I0 = true;
                        }
                        lcVar2.n.draw(canvas);
                        zb zbVar2 = lcVar2.X0;
                        if (zbVar2 != null) {
                            zbVar2.g0 = false;
                        }
                        nb nbVar2 = lcVar2.v1;
                        if (nbVar2 != null) {
                            nbVar2.I0 = false;
                        }
                        lcVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        lcVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        tb tbVar = new tb(lcVar2, lcVar2.b, z11, canvas, (lcVar2.i1.getMeasuredWidth() / 2.0f) + f7, (lcVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        lcVar2.C2 = tbVar;
                        tbVar.setOnTouchListener(new bi.d(2));
                        lcVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        lcVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new ub(lcVar2, 0));
                        lcVar2.E2.addListener(new jb(lcVar2, 2));
                        lcVar2.E2.setStartDelay(80L);
                        lcVar2.E2.setDuration(z11 ? 320L : 450L);
                        lcVar2.E2.setInterpolator(z11 ? rr.i : rr.h);
                        lcVar2.E2.start();
                        lcVar2.n.addView(lcVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ha(lcVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!lcVar.S1) {
                    lcVar.M();
                    break;
                }
                break;
            case 2:
                l8 l8Var = lcVar.K1;
                if (l8Var != null && !lcVar.S1) {
                    l8Var.Y = !l8Var.Y;
                    ArrayList arrayList = l8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((l8) obj).Y = lcVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(lcVar.K1.y);
                    l8 l8Var2 = lcVar.K1;
                    boolean z12 = l8Var2.o0 != null;
                    if (lcVar.g0 == -1) {
                        e4 e4Var = lcVar.k1;
                        if (l8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = lcVar.k1.V;
                        if (e4Var.getMeasuredWidth() < 0) {
                            e4Var.G = string;
                        } else {
                            org.telegram.ui.Components.o6 o6Var = e4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            o6Var.q(string, z10, true);
                        }
                        lcVar.k1.u();
                    }
                    lcVar.f0(lcVar.K1.Y, true);
                    lcVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = lcVar.X0.k();
                lcVar.X0.x(-9982, k10);
                ((fg0) lcVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (lcVar.B0 != null && !lcVar.S1) {
                    String C = lcVar.C();
                    String F = lcVar.F();
                    if (C != null && !C.equals(F)) {
                        ob obVar = lcVar.B0;
                        if (obVar != null && obVar.getCameraSession() != null) {
                            if (!lcVar.B0.isFrontface() || lcVar.B0.getCameraSession().hasFlashModes()) {
                                lcVar.B0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = lcVar.u2.indexOf(F);
                                if (indexOf >= 0) {
                                    lcVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", lcVar.t2).apply();
                                }
                            }
                        }
                        lcVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                ob obVar2 = lcVar.B0;
                if (obVar2 != null && lcVar.f0 == 0) {
                    obVar2.toggleDual();
                    lcVar.F0.setValue(lcVar.B0.isDual());
                    lcVar.F0.setContentDescription(LocaleController.getString(lcVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    lcVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (lcVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    lcVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (lcVar.f0 == 0 && !lcVar.a2) {
                    ob obVar3 = lcVar.B0;
                    if (obVar3 != null && obVar3.isDual()) {
                        lcVar.B0.toggleDual();
                    }
                    if (!lcVar.I0.e && !lcVar.A0.j()) {
                        lcVar.A0.o(lcVar.z0);
                        lcVar.I0.setSelected(lcVar.z0);
                        lcVar.G0.a(new u(lcVar.z0, false), true);
                        lcVar.G0.setSelected(true);
                        ob obVar4 = lcVar.B0;
                        if (obVar4 != null) {
                            obVar4.recordHevc = !lcVar.A0.j();
                        }
                        kb kbVar = lcVar.M0;
                        if (kbVar != null) {
                            kbVar.setMultipleOnClick(lcVar.A0.j());
                            lcVar.M0.setMaxCount(Math.min(10, t.b() - lcVar.A0.getFilledCount()));
                        }
                    }
                    lcVar.I0.a(!r1.e, true);
                    lcVar.m0(true);
                    break;
                }
                break;
            case 7:
                lcVar.A0.o(null);
                lcVar.A0.e();
                lcVar.I0.setSelected((t) null);
                ob obVar5 = lcVar.B0;
                if (obVar5 != null) {
                    obVar5.recordHevc = !lcVar.A0.j();
                }
                lcVar.I0.a(false, true);
                lcVar.m0(true);
                kb kbVar2 = lcVar.M0;
                if (kbVar2 != null) {
                    kbVar2.setMultipleOnClick(lcVar.A0.j());
                    lcVar.M0.setMaxCount(Math.min(10, t.b() - lcVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                lcVar.k0();
                break;
            case 9:
                ob obVar6 = lcVar.B0;
                if (obVar6 != null && !lcVar.S1 && !lcVar.P1 && obVar6.isInited() && lcVar.f0 == 0) {
                    lcVar.B0.switchCamera();
                    lcVar.O0.d(180.0f);
                    lc.a0(lcVar.B0.isFrontface());
                    if (!lcVar.q0()) {
                        lcVar.s.d();
                        break;
                    } else {
                        lcVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                lcVar.k0();
                break;
            case 11:
                l8 l8Var3 = lcVar.K1;
                if (l8Var3 != null) {
                    l8Var3.f0 = true;
                    l8Var3.e0 = lcVar.M1;
                    lcVar.X();
                    l8 l8Var4 = lcVar.K1;
                    if (l8Var4 != null && !l8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new ha(lcVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (lcVar.s2) {
                    lcVar.Z(true);
                    break;
                }
                break;
            case 13:
                lcVar.l0(-1, false, true);
                break;
            default:
                lcVar.l0(-1, false, true);
                break;
        }
    }
}
