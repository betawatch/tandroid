package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, it0, jt0, org.telegram.messenger.e9, org.telegram.messenger.ec, org.telegram.messenger.ic, ya0, org.telegram.messenger.d9 {
    public final /* synthetic */ int a;

    public /* synthetic */ lf0(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 6:
                fn0 fn0Var = (fn0) obj;
                fn0Var.n = f10;
                fn0Var.invalidate();
                break;
            case 17:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                WindowManager.LayoutParams layoutParams = s0Var.c;
                s0Var.R = f10;
                layoutParams.x = (int) f10;
                org.telegram.messenger.g0.T3(s0Var.b, s0Var.d, layoutParams);
                break;
            default:
                org.telegram.ui.Components.voip.s0 s0Var2 = (org.telegram.ui.Components.voip.s0) obj;
                WindowManager.LayoutParams layoutParams2 = s0Var2.c;
                s0Var2.S = f10;
                layoutParams2.y = (int) f10;
                org.telegram.messenger.g0.T3(s0Var2.b, s0Var2.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i3));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void f(int i3, View view) {
        ((fm0) view).setTextColor(i3);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                s1Var.dismiss();
                break;
            case 2:
                s1Var.dismiss();
                break;
            case 8:
                s1Var.dismiss();
                break;
            case 9:
                s1Var.dismiss();
                break;
            case 10:
                s1Var.dismiss();
                break;
            case 11:
                int i10 = xv0.o2;
                break;
            case 12:
                s1Var.dismiss();
                break;
            case 14:
                s1Var.dismiss();
                break;
            case 20:
                s1Var.dismiss();
                break;
            case 21:
                break;
            case 22:
                org.telegram.messenger.hp.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            default:
                org.telegram.messenger.hp.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.Components.it0
    public float get(Object obj) {
        switch (this.a) {
            case 5:
                return ((fn0) obj).n;
            case 16:
                return ((org.telegram.ui.Components.voip.s0) obj).R;
            default:
                return ((org.telegram.ui.Components.voip.s0) obj).S;
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int h(View view) {
        return ((fm0) view).w;
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        switch (this.a) {
            case 7:
                int i3 = oo0.R2;
                return 0;
            case 26:
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
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

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if ((imageReceiver.k0 instanceof org.telegram.messenger.o6) || (imageReceiver.T instanceof org.telegram.messenger.o6) || (imageReceiver.b0 instanceof org.telegram.messenger.o6) || (imageReceiver.n0 instanceof org.telegram.messenger.o6)) {
            imageReceiver.p1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        }
    }

    @Override // org.telegram.messenger.d9
    public boolean run() {
        String str = LaunchActivity.E1;
        return org.telegram.messenger.az.s.length() > 0 && !org.telegram.messenger.az.A;
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    private final void b(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
