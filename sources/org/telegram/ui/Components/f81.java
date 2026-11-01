package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n81 b;

    public /* synthetic */ f81(n81 n81Var, int i10) {
        this.a = i10;
        this.b = n81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n81 n81Var = this.b;
                j81 j81Var = n81Var.f0;
                v61 v61Var = n81Var.a;
                if (v61Var != null && v61Var.d0()) {
                    j81Var.c((int) (v61Var.S() / 1000));
                    j81Var.x = (int) (v61Var.J() / 1000);
                    j81Var.invalidate();
                    org.telegram.messenger.i0.h3(n81Var.i0, 1000L);
                    break;
                }
                break;
            default:
                n81 n81Var2 = this.b;
                j81 j81Var2 = n81Var2.f0;
                ImageView imageView = n81Var2.e;
                TextureView textureView = n81Var2.d;
                n81Var2.W = false;
                Bitmap bitmap = n81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    n81Var2.h = null;
                }
                n81Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap b10 = org.telegram.messenger.ks.b(width, height);
                        n81Var2.h = b10;
                        textureView.getBitmap(b10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = n81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            n81Var2.h = null;
                        }
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    if (n81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(n81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                n81Var2.U = true;
                n81Var2.n();
                n81Var2.o();
                n81Var2.k();
                n81Var2.m();
                ViewGroup viewGroup = (ViewGroup) j81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(j81Var2);
                }
                k81 k81Var = n81Var2.w;
                j81 j81Var3 = n81Var2.f0;
                boolean z10 = n81Var2.U;
                int i10 = n81Var2.g0;
                int i11 = n81Var2.h0;
                n81Var2.c.getVideoRotation();
                TextureView f7 = k81Var.f(j81Var3, z10, i10, i11, n81Var2.I);
                n81Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                j81Var2.d(false, false);
                break;
        }
    }
}
