package nh;

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
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ i9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i10 = this.a;
        boolean z10 = false;
        gb gbVar = this.b;
        switch (i10) {
            case 0:
                gb gbVar2 = this.b;
                if (gbVar2.G1 != null && gbVar2.y2 == null && gbVar2.e1 != null) {
                    ValueAnimator valueAnimator = gbVar2.A2;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        boolean z11 = gbVar2.G1.y0;
                        Bitmap createBitmap = Bitmap.createBitmap(gbVar2.n.getWidth(), gbVar2.n.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        gbVar2.e1.setAlpha(0.0f);
                        va vaVar = gbVar2.T0;
                        if (vaVar != null) {
                            vaVar.c0 = true;
                        }
                        ja jaVar = gbVar2.r1;
                        if (jaVar != null) {
                            jaVar.E0 = true;
                        }
                        gbVar2.n.draw(canvas);
                        va vaVar2 = gbVar2.T0;
                        if (vaVar2 != null) {
                            vaVar2.c0 = false;
                        }
                        ja jaVar2 = gbVar2.r1;
                        if (jaVar2 != null) {
                            jaVar2.E0 = false;
                        }
                        gbVar2.e1.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        gbVar2.e1.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        pa paVar = new pa(gbVar2, gbVar2.b, z11, canvas, (gbVar2.e1.getMeasuredWidth() / 2.0f) + f9, (gbVar2.e1.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 0);
                        gbVar2.y2 = paVar;
                        paVar.setOnTouchListener(new mh.d(2));
                        gbVar2.z2 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        gbVar2.A2 = ofFloat;
                        ofFloat.addUpdateListener(new qa(gbVar2, 0));
                        gbVar2.A2.addListener(new fa(gbVar2, 2));
                        gbVar2.A2.setStartDelay(80L);
                        gbVar2.A2.setDuration(z11 ? 320L : 450L);
                        gbVar2.A2.setInterpolator(z11 ? jr.i : jr.h);
                        gbVar2.A2.start();
                        gbVar2.n.addView(gbVar2.y2, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new g9(gbVar2, 4));
                        break;
                    }
                }
                break;
            case 1:
                if (!gbVar.O1) {
                    gbVar.M();
                    break;
                }
                break;
            case 2:
                o7 o7Var = gbVar.G1;
                if (o7Var != null && !gbVar.O1) {
                    o7Var.Y = !o7Var.Y;
                    ArrayList arrayList = o7Var.T;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((o7) obj).Y = gbVar.G1.Y;
                        }
                    }
                    boolean isEmpty = TextUtils.isEmpty(gbVar.G1.y);
                    o7 o7Var2 = gbVar.G1;
                    boolean z12 = o7Var2.o0 != null;
                    if (gbVar.c0 == -1) {
                        t3 t3Var = gbVar.g1;
                        if (o7Var2.Y) {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
                        } else {
                            string = LocaleController.getString((!isEmpty || z12) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
                        }
                        boolean z13 = gbVar.g1.R;
                        if (t3Var.getMeasuredWidth() < 0) {
                            t3Var.C = string;
                        } else {
                            org.telegram.ui.Components.n6 n6Var = t3Var.D;
                            if (!LocaleController.isRTL && z13) {
                                z10 = true;
                            }
                            n6Var.q(string, z10, true);
                        }
                        gbVar.g1.v();
                    }
                    gbVar.f0(gbVar.G1.Y, true);
                    gbVar.T0.c();
                    break;
                }
                break;
            case 3:
                boolean k9 = gbVar.T0.k();
                gbVar.T0.x(-9982, k9);
                ((cg0) gbVar.f1.c).a(!k9, true);
                break;
            case 4:
                if (gbVar.x0 != null && !gbVar.O1) {
                    String C = gbVar.C();
                    String F = gbVar.F();
                    if (C != null && !C.equals(F)) {
                        ka kaVar = gbVar.x0;
                        if (kaVar != null && kaVar.getCameraSession() != null) {
                            if (!gbVar.x0.isFrontface() || gbVar.x0.getCameraSession().hasFlashModes()) {
                                gbVar.x0.getCameraSession().setCurrentFlashMode(F);
                            } else {
                                int indexOf = gbVar.q2.indexOf(F);
                                if (indexOf >= 0) {
                                    gbVar.p2 = indexOf;
                                    MessagesController.getGlobalMainSettings().edit().putInt("frontflash", gbVar.p2).apply();
                                }
                            }
                        }
                        gbVar.e0(F);
                        break;
                    }
                }
                break;
            case 5:
                ka kaVar2 = gbVar.x0;
                if (kaVar2 != null && gbVar.b0 == 0) {
                    kaVar2.toggleDual();
                    gbVar.B0.setValue(gbVar.x0.isDual());
                    gbVar.B0.setContentDescription(LocaleController.getString(gbVar.x0.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
                    gbVar.h1.e(true);
                    MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
                    if (gbVar.i1.R) {
                        MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
                    }
                    gbVar.i1.e(true);
                    break;
                }
                break;
            case 6:
                if (gbVar.b0 == 0 && !gbVar.W1) {
                    ka kaVar3 = gbVar.x0;
                    if (kaVar3 != null && kaVar3.isDual()) {
                        gbVar.x0.toggleDual();
                    }
                    if (!gbVar.E0.e && !gbVar.w0.j()) {
                        gbVar.w0.o(gbVar.v0);
                        gbVar.E0.setSelected(gbVar.v0);
                        gbVar.C0.a(new u(gbVar.v0, false), true);
                        gbVar.C0.setSelected(true);
                        ka kaVar4 = gbVar.x0;
                        if (kaVar4 != null) {
                            kaVar4.recordHevc = !gbVar.w0.j();
                        }
                        ga gaVar = gbVar.I0;
                        if (gaVar != null) {
                            gaVar.setMultipleOnClick(gbVar.w0.j());
                            gbVar.I0.setMaxCount(Math.min(10, t.b() - gbVar.w0.getFilledCount()));
                        }
                    }
                    gbVar.E0.a(!r1.e, true);
                    gbVar.m0(true);
                    break;
                }
                break;
            case 7:
                gbVar.w0.o(null);
                gbVar.w0.e();
                gbVar.E0.setSelected((t) null);
                ka kaVar5 = gbVar.x0;
                if (kaVar5 != null) {
                    kaVar5.recordHevc = !gbVar.w0.j();
                }
                gbVar.E0.a(false, true);
                gbVar.m0(true);
                ga gaVar2 = gbVar.I0;
                if (gaVar2 != null) {
                    gaVar2.setMultipleOnClick(gbVar.w0.j());
                    gbVar.I0.setMaxCount(Math.min(10, t.b() - gbVar.w0.getFilledCount()));
                    break;
                }
                break;
            case 8:
                gbVar.k0();
                break;
            case 9:
                ka kaVar6 = gbVar.x0;
                if (kaVar6 != null && !gbVar.O1 && !gbVar.L1 && kaVar6.isInited() && gbVar.b0 == 0) {
                    gbVar.x0.switchCamera();
                    gbVar.K0.d(180.0f);
                    gb.a0(gbVar.x0.isFrontface());
                    if (!gbVar.q0()) {
                        gbVar.s.d();
                        break;
                    } else {
                        gbVar.s.c(null);
                        break;
                    }
                }
                break;
            case 10:
                gbVar.k0();
                break;
            case 11:
                o7 o7Var3 = gbVar.G1;
                if (o7Var3 != null) {
                    o7Var3.f0 = true;
                    o7Var3.e0 = gbVar.I1;
                    gbVar.X();
                    o7 o7Var4 = gbVar.G1;
                    if (o7Var4 != null && !o7Var4.b0) {
                        AndroidUtilities.runOnUIThread(new g9(gbVar, 24), 400L);
                        break;
                    }
                }
                break;
            case 12:
                if (gbVar.o2) {
                    gbVar.Z(true);
                    break;
                }
                break;
            case 13:
                gbVar.l0(-1, false, true);
                break;
            default:
                gbVar.l0(-1, false, true);
                break;
        }
    }
}
