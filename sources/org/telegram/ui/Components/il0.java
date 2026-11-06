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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il0 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, jt0, kt0, org.telegram.messenger.k9, org.telegram.messenger.lc, org.telegram.messenger.oc, db0, org.telegram.messenger.j9, org.telegram.messenger.eb {
    public final /* synthetic */ int a;

    public /* synthetic */ il0(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void c(int i7, View view) {
        ((cm0) view).setTextColor(i7);
    }

    @Override // org.telegram.ui.Components.kt0
    public void f(Object obj, float f10) {
        cn0 cn0Var = (cn0) obj;
        cn0Var.n = f10;
        cn0Var.invalidate();
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        if ((imageReceiver.j0 instanceof org.telegram.messenger.o6) || (imageReceiver.S instanceof org.telegram.messenger.o6) || (imageReceiver.a0 instanceof org.telegram.messenger.o6) || (imageReceiver.m0 instanceof org.telegram.messenger.o6)) {
            imageReceiver.o1 = new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                u1Var.dismiss();
                break;
            case 1:
                u1Var.dismiss();
                break;
            case 7:
                u1Var.dismiss();
                break;
            case 8:
                u1Var.dismiss();
                break;
            case 9:
                u1Var.dismiss();
                break;
            case 10:
                int i10 = yv0.n2;
                break;
            case 11:
                u1Var.dismiss();
                break;
            case 13:
                u1Var.dismiss();
                break;
            case 15:
                u1Var.dismiss();
                break;
            case 16:
                break;
            case 17:
                org.telegram.messenger.qp.f1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 18:
                org.telegram.messenger.qp.f1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 27:
                u1Var.dismiss();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public float get(Object obj) {
        return ((cn0) obj).n;
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        switch (this.a) {
            case 19:
                break;
            case 20:
                break;
            default:
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
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
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int i(View view) {
        return ((cm0) view).w;
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        switch (this.a) {
            case 6:
                int i7 = mo0.Q2;
                return 0;
            case 21:
                int L = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(200.0f), L, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, L / 2.0f, paint);
                return createBitmap;
            case 22:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int L2 = org.telegram.messenger.g0.L(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                float f10 = L2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
            default:
                String str = LaunchActivity.B1;
                return new org.telegram.ui.je0();
        }
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        String str = LaunchActivity.B1;
        return org.telegram.messenger.iz.s.length() > 0 && !org.telegram.messenger.iz.A;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.eb
    public void onClick() {
    }

    private final void a(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
