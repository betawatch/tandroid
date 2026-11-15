package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class rb0 implements org.telegram.messenger.kc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6, kt0, lt0, org.telegram.messenger.j9, org.telegram.messenger.nc, eb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ rb0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        switch (this.a) {
            case 0:
                if (z10 && !z11 && (B = imageReceiver.B()) != null) {
                    B.start();
                    break;
                }
                break;
            default:
                if ((imageReceiver.k0 instanceof org.telegram.messenger.o6) || (imageReceiver.T instanceof org.telegram.messenger.o6) || (imageReceiver.b0 instanceof org.telegram.messenger.o6) || (imageReceiver.n0 instanceof org.telegram.messenger.o6)) {
                    imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                    break;
                }
                break;
        }
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.lt0
    public void c(Object obj, float f10) {
        gn0 gn0Var = (gn0) obj;
        gn0Var.n = f10;
        gn0Var.invalidate();
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public void f(int i7, View view) {
        ((gm0) view).setTextColor(i7);
    }

    @Override // org.telegram.ui.ActionBar.n6
    public int g(View view) {
        return ((gm0) view).w;
    }

    @Override // org.telegram.ui.Components.kt0
    public float get(Object obj) {
        return ((gn0) obj).n;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 4:
                t1Var.dismiss();
                break;
            case 5:
                t1Var.dismiss();
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            case 15:
            case 18:
            case 20:
            default:
                org.telegram.messenger.np.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 11:
                t1Var.dismiss();
                break;
            case 12:
                t1Var.dismiss();
                break;
            case 13:
                t1Var.dismiss();
                break;
            case 16:
                int i10 = bw0.r2;
                break;
            case 17:
                t1Var.dismiss();
                break;
            case 19:
                t1Var.dismiss();
                break;
            case 21:
                t1Var.dismiss();
                break;
            case 22:
                break;
            case 23:
                org.telegram.messenger.np.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // gh.d
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Bitmap bitmap = ci.u.a;
        return (((int) a8.p0.f(ci.c1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        switch (this.a) {
            case 10:
                int i7 = po0.U2;
                return 0;
            case 27:
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            default:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f10 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
        }
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    private final /* synthetic */ void l(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void a(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void b(int i7, Drawable drawable) {
    }

    private final void n(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
