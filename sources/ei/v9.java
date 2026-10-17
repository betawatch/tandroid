package ei;

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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ v9(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        vb vbVar = this.b;
        switch (i10) {
            case 0:
                vb vbVar2 = this.b;
                if (vbVar2.K1 != null && vbVar2.C2 == null && vbVar2.i1 != null) {
                    ValueAnimator valueAnimator = vbVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = vbVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(vbVar2.n.getWidth(), vbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        vbVar2.i1.setAlpha(0.0f);
                        jb jbVar = vbVar2.X0;
                        if (jbVar != null) {
                            jbVar.g0 = true;
                        }
                        xa xaVar = vbVar2.v1;
                        if (xaVar != null) {
                            xaVar.I0 = true;
                        }
                        vbVar2.n.draw(canvas);
                        jb jbVar2 = vbVar2.X0;
                        if (jbVar2 != null) {
                            jbVar2.g0 = false;
                        }
                        xa xaVar2 = vbVar2.v1;
                        if (xaVar2 != null) {
                            xaVar2.I0 = false;
                        }
                        vbVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        vbVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        db dbVar = new db(vbVar2, vbVar2.b, z11, canvas, (vbVar2.i1.getMeasuredWidth() / 2.0f) + f7, (vbVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        vbVar2.C2 = dbVar;
                        dbVar.setOnTouchListener(new di.d(2));
                        vbVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        vbVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new eb(vbVar2, 0));
                        vbVar2.E2.addListener(new ta(vbVar2, 2));
                        vbVar2.E2.setStartDelay(80L);
                        vbVar2.E2.setDuration(z11 ? 320L : 450L);
                        vbVar2.E2.setInterpolator(z11 ? bs.i : bs.h);
                        vbVar2.E2.start();
                        vbVar2.n.addView(vbVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new t9(vbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!vbVar.S1) {
                    vbVar.L();
                    break;
                }
                break;
            case 2:
                a8 a8Var = vbVar.K1;
                if (a8Var != null && !vbVar.S1) {
                    a8Var.Y = !a8Var.Y;
                    ArrayList arrayList = a8Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((a8) obj).Y = vbVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(vbVar.K1.y);
                    a8 a8Var2 = vbVar.K1;
                    boolean z12 = a8Var2.o0 != null;
                    if (vbVar.g0 == -1) {
                        x3 x3Var = vbVar.k1;
                        if (a8Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = vbVar.k1.V;
                        if (x3Var.getMeasuredWidth() < 0) {
                            x3Var.G = string;
                        } else {
                            org.telegram.ui.Components.p6 p6Var = x3Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            p6Var.t(string, z10, true);
                        }
                        vbVar.k1.u();
                    }
                    vbVar.e0(vbVar.K1.Y, true);
                    vbVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = vbVar.X0.k();
                vbVar.X0.x(-9982, k10);
                ((ah0) vbVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (vbVar.B0 != null && !vbVar.S1) {
                    String B = vbVar.B();
                    String E = vbVar.E();
                    if (B != null && !B.equals(E)) {
                        ya yaVar = vbVar.B0;
                        if (yaVar != null && yaVar.getCameraSession() != null) {
                            if (!vbVar.B0.isFrontface() || vbVar.B0.getCameraSession().hasFlashModes()) {
                                vbVar.B0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = vbVar.u2.indexOf(E);
                                if (indexOf >= 0) {
                                    vbVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", vbVar.t2).apply();
                                }
                            }
                        }
                        vbVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                ya yaVar2 = vbVar.B0;
                if (yaVar2 != null && vbVar.f0 == 0) {
                    yaVar2.toggleDual();
                    vbVar.F0.setValue(vbVar.B0.isDual());
                    vbVar.F0.setContentDescription(LocaleController.getString(vbVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    vbVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (vbVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    vbVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (vbVar.f0 == 0 && !vbVar.a2) {
                    ya yaVar3 = vbVar.B0;
                    if (yaVar3 != null && yaVar3.isDual()) {
                        vbVar.B0.toggleDual();
                    }
                    if (!vbVar.I0.e && !vbVar.A0.j()) {
                        vbVar.A0.o(vbVar.z0);
                        vbVar.I0.setSelected(vbVar.z0);
                        vbVar.G0.a(new u(vbVar.z0, false), true);
                        vbVar.G0.setSelected(true);
                        ya yaVar4 = vbVar.B0;
                        if (yaVar4 != null) {
                            yaVar4.recordHevc = !vbVar.A0.j();
                        }
                        ua uaVar = vbVar.M0;
                        if (uaVar != null) {
                            uaVar.setMultipleOnClick(vbVar.A0.j());
                            vbVar.M0.setMaxCount(Math.min(10, t.b() - vbVar.A0.getFilledCount()));
                        }
                    }
                    vbVar.I0.a(!r1.e, true);
                    vbVar.l0(true);
                    break;
                }
                break;
            case 7:
                vbVar.A0.o(null);
                vbVar.A0.e();
                vbVar.I0.setSelected((t) null);
                ya yaVar5 = vbVar.B0;
                if (yaVar5 != null) {
                    yaVar5.recordHevc = !vbVar.A0.j();
                }
                vbVar.I0.a(false, true);
                vbVar.l0(true);
                ua uaVar2 = vbVar.M0;
                if (uaVar2 != null) {
                    uaVar2.setMultipleOnClick(vbVar.A0.j());
                    vbVar.M0.setMaxCount(Math.min(10, t.b() - vbVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                vbVar.j0();
                break;
            case 9:
                ya yaVar6 = vbVar.B0;
                if (yaVar6 != null && !vbVar.S1 && !vbVar.P1 && yaVar6.isInited() && vbVar.f0 == 0) {
                    vbVar.B0.switchCamera();
                    vbVar.O0.d(180.0f);
                    vb.Z(vbVar.B0.isFrontface());
                    if (!vbVar.p0()) {
                        vbVar.s.d();
                        break;
                    } else {
                        vbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                vbVar.j0();
                break;
            case 11:
                a8 a8Var3 = vbVar.K1;
                if (a8Var3 != null) {
                    a8Var3.f0 = true;
                    a8Var3.e0 = vbVar.M1;
                    vbVar.W();
                    a8 a8Var4 = vbVar.K1;
                    if (a8Var4 != null && !a8Var4.b0) {
                        AndroidUtilities.runOnUIThread(new t9(vbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (vbVar.s2) {
                    vbVar.Y(true);
                    break;
                }
                break;
            case 13:
                vbVar.k0(-1, false, true);
                break;
            default:
                vbVar.k0(-1, false, true);
                break;
        }
    }
}
