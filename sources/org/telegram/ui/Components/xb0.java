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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb0 implements wt0, org.telegram.messenger.kc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6, vt0, org.telegram.messenger.j9, org.telegram.messenger.nc, pb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ xb0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 0:
                yb0 yb0Var = (yb0) obj;
                yb0Var.s = f10;
                yb0Var.f();
                break;
            default:
                rn0 rn0Var = (rn0) obj;
                rn0Var.n = f10;
                rn0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public void d(int i7, View view) {
        ((rm0) view).setTextColor(i7);
    }

    @Override // org.telegram.ui.ActionBar.q6
    public int f(View view) {
        return ((rm0) view).w;
    }

    @Override // org.telegram.ui.Components.vt0
    public float get(Object obj) {
        return ((rn0) obj).n;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 5:
                t1Var.dismiss();
                break;
            case 6:
                t1Var.dismiss();
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 15:
            case 16:
            case 19:
            case 21:
            default:
                org.telegram.messenger.np.h1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 12:
                t1Var.dismiss();
                break;
            case 13:
                t1Var.dismiss();
                break;
            case 14:
                t1Var.dismiss();
                break;
            case 17:
                int i10 = kw0.r2;
                break;
            case 18:
                t1Var.dismiss();
                break;
            case 20:
                t1Var.dismiss();
                break;
            case 22:
                t1Var.dismiss();
                break;
            case 23:
                break;
            case 24:
                org.telegram.messenger.np.h1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb0
    public String i(int i7) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // gh.d
    public int j(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        Bitmap bitmap = ci.u.a;
        return (((int) a8.p0.f(ci.c1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.messenger.j9
    public Object m(Object obj) {
        switch (this.a) {
            case 11:
                int i7 = ap0.U2;
                return 0;
            case 28:
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false));
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

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oh0 B;
        switch (this.a) {
            case 1:
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

    @Override // org.telegram.messenger.nc
    public void q(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    private final /* synthetic */ void l(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void n(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void a(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void b(int i7, Drawable drawable) {
    }

    private final void o(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
    }
}
