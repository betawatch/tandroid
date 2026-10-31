package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z11 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.pc, mu0, nu0, wb0, org.telegram.messenger.l9, org.telegram.messenger.j9, org.telegram.messenger.k20, xu0 {
    public final /* synthetic */ int a;

    public /* synthetic */ z11(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.nu0
    public void b(Object obj, float f7) {
        org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
        switch (this.a) {
            case 3:
                WindowManager.LayoutParams layoutParams = s0Var.c;
                s0Var.Q = f7;
                layoutParams.x = (int) f7;
                org.telegram.messenger.i0.S3(s0Var.b, s0Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = s0Var.c;
                s0Var.R = f7;
                layoutParams2.y = (int) f7;
                org.telegram.messenger.i0.S3(s0Var.b, s0Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.messenger.k20
    public Object d(Number number, Object obj) {
        return ((Integer) number).intValue() == 0 ? rh.h8.Z0(false, org.telegram.messenger.cd.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : org.telegram.messenger.cd.E(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        switch (this.a) {
            case 10:
                break;
            case 11:
                break;
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.mu0
    public float get(Object obj) {
        org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
        switch (this.a) {
            case 2:
                return s0Var.Q;
            default:
                return s0Var.R;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                x1Var.dismiss();
                break;
            case 6:
                x1Var.dismiss();
                break;
            case 7:
                break;
            case 8:
                org.telegram.messenger.vp.e1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 9:
                org.telegram.messenger.vp.e1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 17:
                x1Var.dismiss();
                break;
            case 19:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 20:
                x1Var.dismiss();
                break;
            case 21:
                x1Var.dismiss();
                break;
            case 23:
                RectF rectF = ProfileActivity.R6;
                x1Var.dismiss();
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.l9
    public Object l(Object obj) {
        switch (this.a) {
            case 12:
                int L = org.telegram.messenger.i0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 13:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.i0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f7 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.D1;
                return new org.telegram.ui.pf0();
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        org.telegram.messenger.tz.b1 = i10;
        org.telegram.messenger.tz.y();
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        org.telegram.messenger.f8.g(exc, true);
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        Pattern pattern = LaunchActivity.D1;
        return org.telegram.messenger.tz.s.length() > 0 && !org.telegram.messenger.tz.A;
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
    }

    private final void a(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
    }
}
