package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class vb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ vb(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        ce ceVar = this.b;
        switch (i10) {
            case 0:
                ce ceVar2 = this.b;
                if (ceVar2.K1 != null && ceVar2.C2 == null && ceVar2.i1 != null) {
                    ValueAnimator valueAnimator = ceVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = ceVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(ceVar2.n.getWidth(), ceVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        ceVar2.i1.setAlpha(0.0f);
                        nd ndVar = ceVar2.X0;
                        if (ndVar != null) {
                            ndVar.g0 = true;
                        }
                        ad adVar = ceVar2.v1;
                        if (adVar != null) {
                            adVar.I0 = true;
                        }
                        ceVar2.n.draw(canvas);
                        nd ndVar2 = ceVar2.X0;
                        if (ndVar2 != null) {
                            ndVar2.g0 = false;
                        }
                        ad adVar2 = ceVar2.v1;
                        if (adVar2 != null) {
                            adVar2.I0 = false;
                        }
                        ceVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        ceVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gd gdVar = new gd(ceVar2, ceVar2.b, z11, canvas, (ceVar2.i1.getMeasuredWidth() / 2.0f) + f7, (ceVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        ceVar2.C2 = gdVar;
                        gdVar.setOnTouchListener(new ai.h(2));
                        ceVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ceVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new hd(ceVar2, 0));
                        ceVar2.E2.addListener(new vc(ceVar2, 2));
                        ceVar2.E2.setStartDelay(80L);
                        ceVar2.E2.setDuration(z11 ? 320L : 450L);
                        ceVar2.E2.setInterpolator(z11 ? wr.i : wr.h);
                        ceVar2.E2.start();
                        ceVar2.n.addView(ceVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new tb(ceVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!ceVar.S1) {
                    ceVar.M();
                    break;
                }
                break;
            case 2:
                r9 r9Var = ceVar.K1;
                if (r9Var != null && !ceVar.S1) {
                    r9Var.Y = !r9Var.Y;
                    ArrayList arrayList = r9Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((r9) obj).Y = ceVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(ceVar.K1.y);
                    r9 r9Var2 = ceVar.K1;
                    boolean z12 = r9Var2.o0 != null;
                    if (ceVar.g0 == -1) {
                        x4 x4Var = ceVar.k1;
                        if (r9Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = ceVar.k1.V;
                        if (x4Var.getMeasuredWidth() < 0) {
                            x4Var.G = string;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = x4Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            n6Var.q(string, z10, true);
                        }
                        ceVar.k1.u();
                    }
                    ceVar.f0(ceVar.K1.Y, true);
                    ceVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = ceVar.X0.k();
                ceVar.X0.x(-9982, k10);
                ((pg0) ceVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (ceVar.B0 != null && !ceVar.S1) {
                    String C = ceVar.C();
                    String F = ceVar.F();
                    if (C != null && !C.equals(F)) {
                        bd bdVar = ceVar.B0;
                        if (bdVar != null && bdVar.getCameraSession() != null) {
                            if (!ceVar.B0.isFrontface() || ceVar.B0.getCameraSession().hasFlashModes()) {
                                ceVar.B0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = ceVar.u2.indexOf(F);
                                if (indexOf >= 0) {
                                    ceVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", ceVar.t2).apply();
                                }
                            }
                        }
                        ceVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                bd bdVar2 = ceVar.B0;
                if (bdVar2 != null && ceVar.f0 == 0) {
                    bdVar2.toggleDual();
                    ceVar.F0.setValue(ceVar.B0.isDual());
                    ceVar.F0.setContentDescription(LocaleController.getString(ceVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    ceVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (ceVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    ceVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (ceVar.f0 == 0 && !ceVar.a2) {
                    bd bdVar3 = ceVar.B0;
                    if (bdVar3 != null && bdVar3.isDual()) {
                        ceVar.B0.toggleDual();
                    }
                    if (!ceVar.I0.e && !ceVar.A0.j()) {
                        ceVar.A0.o(ceVar.z0);
                        ceVar.I0.setSelected(ceVar.z0);
                        ceVar.G0.a(new y(ceVar.z0, false), true);
                        ceVar.G0.setSelected(true);
                        bd bdVar4 = ceVar.B0;
                        if (bdVar4 != null) {
                            bdVar4.recordHevc = !ceVar.A0.j();
                        }
                        xc xcVar = ceVar.M0;
                        if (xcVar != null) {
                            xcVar.setMultipleOnClick(ceVar.A0.j());
                            ceVar.M0.setMaxCount(Math.min(10, x.b() - ceVar.A0.getFilledCount()));
                        }
                    }
                    ceVar.I0.a(!r1.e, true);
                    ceVar.m0(true);
                    break;
                }
                break;
            case 7:
                ceVar.A0.o(null);
                ceVar.A0.e();
                ceVar.I0.setSelected((x) null);
                bd bdVar5 = ceVar.B0;
                if (bdVar5 != null) {
                    bdVar5.recordHevc = !ceVar.A0.j();
                }
                ceVar.I0.a(false, true);
                ceVar.m0(true);
                xc xcVar2 = ceVar.M0;
                if (xcVar2 != null) {
                    xcVar2.setMultipleOnClick(ceVar.A0.j());
                    ceVar.M0.setMaxCount(Math.min(10, x.b() - ceVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                ceVar.k0();
                break;
            case 9:
                bd bdVar6 = ceVar.B0;
                if (bdVar6 != null && !ceVar.S1 && !ceVar.P1 && bdVar6.isInited() && ceVar.f0 == 0) {
                    ceVar.B0.switchCamera();
                    ceVar.O0.d(180.0f);
                    ce.a0(ceVar.B0.isFrontface());
                    if (!ceVar.q0()) {
                        ceVar.s.d();
                        break;
                    } else {
                        ceVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                ceVar.k0();
                break;
            case 11:
                r9 r9Var3 = ceVar.K1;
                if (r9Var3 != null) {
                    r9Var3.f0 = true;
                    r9Var3.e0 = ceVar.M1;
                    ceVar.X();
                    r9 r9Var4 = ceVar.K1;
                    if (r9Var4 != null && !r9Var4.b0) {
                        AndroidUtilities.runOnUIThread(new tb(ceVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (ceVar.s2) {
                    ceVar.Z(true);
                    break;
                }
                break;
            case 13:
                ceVar.l0(-1, false, true);
                break;
            default:
                ceVar.l0(-1, false, true);
                break;
        }
    }
}
