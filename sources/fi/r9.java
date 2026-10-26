package fi;

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
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ r9(sb sbVar, int i10) {
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
                if (sbVar2.K1 != null && sbVar2.C2 == null && sbVar2.i1 != null) {
                    ValueAnimator valueAnimator = sbVar2.E2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = sbVar2.K1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(sbVar2.n.getWidth(), sbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        sbVar2.i1.setAlpha(0.0f);
                        gb gbVar = sbVar2.X0;
                        if (gbVar != null) {
                            gbVar.g0 = true;
                        }
                        ta taVar = sbVar2.v1;
                        if (taVar != null) {
                            taVar.x0 = true;
                        }
                        sbVar2.n.draw(canvas);
                        gb gbVar2 = sbVar2.X0;
                        if (gbVar2 != null) {
                            gbVar2.g0 = false;
                        }
                        ta taVar2 = sbVar2.v1;
                        if (taVar2 != null) {
                            taVar2.x0 = false;
                        }
                        sbVar2.i1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        sbVar2.i1.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ab abVar = new ab(sbVar2, sbVar2.b, z11, canvas, (sbVar2.i1.getMeasuredWidth() / 2.0f) + f7, (sbVar2.i1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10);
                        sbVar2.C2 = abVar;
                        abVar.setOnTouchListener(new ei.d(2));
                        sbVar2.D2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        sbVar2.E2 = ofFloat;
                        ofFloat.addUpdateListener(new bb(sbVar2, 0));
                        sbVar2.E2.addListener(new pa(sbVar2, 2));
                        sbVar2.E2.setStartDelay(80L);
                        sbVar2.E2.setDuration(z11 ? 320L : 450L);
                        sbVar2.E2.setInterpolator(z11 ? ds.i : ds.h);
                        sbVar2.E2.start();
                        sbVar2.n.addView(sbVar2.C2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new p9(sbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!sbVar.S1) {
                    sbVar.L();
                    break;
                }
                break;
            case 2:
                w7 w7Var = sbVar.K1;
                if (w7Var != null && !sbVar.S1) {
                    w7Var.Y = !w7Var.Y;
                    ArrayList arrayList = w7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((w7) obj).Y = sbVar.K1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(sbVar.K1.y);
                    w7 w7Var2 = sbVar.K1;
                    boolean z12 = w7Var2.o0 != null;
                    if (sbVar.g0 == -1) {
                        v3 v3Var = sbVar.k1;
                        if (w7Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = sbVar.k1.V;
                        if (v3Var.getMeasuredWidth() < 0) {
                            v3Var.G = string;
                        } else {
                            org.telegram.ui.Components.r6 r6Var = v3Var.H;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            r6Var.t(string, z10, true);
                        }
                        sbVar.k1.u();
                    }
                    sbVar.e0(sbVar.K1.Y, true);
                    sbVar.X0.c();
                    break;
                }
                break;
            case 3:
                boolean k10 = sbVar.X0.k();
                sbVar.X0.x(-9982, k10);
                ((dh0) sbVar.j1.c).a(!k10, true);
                break;
            case 4:
                if (sbVar.B0 != null && !sbVar.S1) {
                    String B = sbVar.B();
                    String E = sbVar.E();
                    if (B != null && !B.equals(E)) {
                        va vaVar = sbVar.B0;
                        if (vaVar != null && vaVar.getCameraSession() != null) {
                            if (!sbVar.B0.isFrontface() || sbVar.B0.getCameraSession().hasFlashModes()) {
                                sbVar.B0.getCameraSession().setCurrentFlashMode(E);
                            } else {
                                int indexOf = sbVar.u2.indexOf(E);
                                if (indexOf >= 0) {
                                    sbVar.t2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", sbVar.t2).apply();
                                }
                            }
                        }
                        sbVar.d0(E);
                        break;
                    }
                }
                break;
            case 5:
                va vaVar2 = sbVar.B0;
                if (vaVar2 != null && sbVar.f0 == 0) {
                    vaVar2.toggleDual();
                    sbVar.F0.setValue(sbVar.B0.isDual());
                    sbVar.F0.setContentDescription(LocaleController.getString(sbVar.B0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    sbVar.l1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (sbVar.m1.V) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    sbVar.m1.e(true);
                    break;
                }
                break;
            case 6:
                if (sbVar.f0 == 0 && !sbVar.a2) {
                    va vaVar3 = sbVar.B0;
                    if (vaVar3 != null && vaVar3.isDual()) {
                        sbVar.B0.toggleDual();
                    }
                    if (!sbVar.I0.e && !sbVar.A0.j()) {
                        sbVar.A0.o(sbVar.z0);
                        sbVar.I0.setSelected(sbVar.z0);
                        sbVar.G0.a(new u(sbVar.z0, false), true);
                        sbVar.G0.setSelected(true);
                        va vaVar4 = sbVar.B0;
                        if (vaVar4 != null) {
                            vaVar4.recordHevc = !sbVar.A0.j();
                        }
                        qa qaVar = sbVar.M0;
                        if (qaVar != null) {
                            qaVar.setMultipleOnClick(sbVar.A0.j());
                            sbVar.M0.setMaxCount(Math.min(10, t.b() - sbVar.A0.getFilledCount()));
                        }
                    }
                    sbVar.I0.a(!r1.e, true);
                    sbVar.l0(true);
                    break;
                }
                break;
            case 7:
                sbVar.A0.o(null);
                sbVar.A0.e();
                sbVar.I0.setSelected((t) null);
                va vaVar5 = sbVar.B0;
                if (vaVar5 != null) {
                    vaVar5.recordHevc = !sbVar.A0.j();
                }
                sbVar.I0.a(false, true);
                sbVar.l0(true);
                qa qaVar2 = sbVar.M0;
                if (qaVar2 != null) {
                    qaVar2.setMultipleOnClick(sbVar.A0.j());
                    sbVar.M0.setMaxCount(Math.min(10, t.b() - sbVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                sbVar.j0();
                break;
            case 9:
                va vaVar6 = sbVar.B0;
                if (vaVar6 != null && !sbVar.S1 && !sbVar.P1 && vaVar6.isInited() && sbVar.f0 == 0) {
                    sbVar.B0.switchCamera();
                    sbVar.O0.d(180.0f);
                    sb.Z(sbVar.B0.isFrontface());
                    if (!sbVar.p0()) {
                        sbVar.s.d();
                        break;
                    } else {
                        sbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                sbVar.j0();
                break;
            case 11:
                w7 w7Var3 = sbVar.K1;
                if (w7Var3 != null) {
                    w7Var3.f0 = true;
                    w7Var3.e0 = sbVar.M1;
                    sbVar.W();
                    w7 w7Var4 = sbVar.K1;
                    if (w7Var4 != null && !w7Var4.b0) {
                        AndroidUtilities.runOnUIThread(new p9(sbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (sbVar.s2) {
                    sbVar.Y(true);
                    break;
                }
                break;
            case 13:
                sbVar.k0(-1, false, true);
                break;
            default:
                sbVar.k0(-1, false, true);
                break;
        }
    }
}
