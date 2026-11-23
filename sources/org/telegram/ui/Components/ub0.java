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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub0 implements vt0, org.telegram.messenger.jc, gh.d, r0.m, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, ut0, org.telegram.messenger.i9, org.telegram.messenger.mc, mb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ub0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.vt0
    public void d(Object obj, float f10) {
        switch (this.a) {
            case 0:
                vb0 vb0Var = (vb0) obj;
                vb0Var.s = f10;
                vb0Var.f();
                break;
            default:
                qn0 qn0Var = (qn0) obj;
                qn0Var.n = f10;
                qn0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // gh.d
    public int f(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        Bitmap bitmap = ci.u.a;
        return (((int) a8.p0.f(ci.c1.b[3], 255.0f, 100.0f, 0.5f)) << 24) | 16777215;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public void g(int i7, View view) {
        ((qm0) view).setTextColor(i7);
    }

    @Override // org.telegram.ui.Components.ut0
    public float get(Object obj) {
        return ((qn0) obj).n;
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        switch (this.a) {
            case 11:
                int i7 = zo0.U2;
                return 0;
            case 28:
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
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

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
                org.telegram.messenger.mp.h1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
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
                int i10 = jw0.r2;
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
                org.telegram.messenger.mp.h1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public int k(View view) {
        return ((qm0) view).w;
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return r0.l1.b;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nh0 C;
        switch (this.a) {
            case 1:
                if (z10 && !z11 && (C = imageReceiver.C()) != null) {
                    C.start();
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

    private final /* synthetic */ void m(ImageReceiver imageReceiver) {
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
