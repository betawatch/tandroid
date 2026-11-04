package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d71 b;

    public /* synthetic */ v61(d71 d71Var, int i3) {
        this.a = i3;
        this.b = d71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d71 d71Var = this.b;
                z61 z61Var = d71Var.g0;
                m51 m51Var = d71Var.a;
                if (m51Var != null && m51Var.d0()) {
                    z61Var.c((int) (m51Var.S() / 1000));
                    z61Var.x = (int) (m51Var.K() / 1000);
                    z61Var.invalidate();
                    org.telegram.messenger.g0.i3(d71Var.j0, 1000L);
                    break;
                }
                break;
            default:
                d71 d71Var2 = this.b;
                z61 z61Var2 = d71Var2.g0;
                ImageView imageView = d71Var2.e;
                TextureView textureView = d71Var2.d;
                d71Var2.a0 = false;
                Bitmap bitmap = d71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    d71Var2.h = null;
                }
                d71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                        d71Var2.h = c2;
                        textureView.getBitmap(c2);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = d71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            d71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (d71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                d71Var2.V = true;
                d71Var2.n();
                d71Var2.o();
                d71Var2.k();
                d71Var2.m();
                ViewGroup viewGroup = (ViewGroup) z61Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(z61Var2);
                }
                a71 a71Var = d71Var2.w;
                z61 z61Var3 = d71Var2.g0;
                boolean z10 = d71Var2.V;
                int i3 = d71Var2.h0;
                int i10 = d71Var2.i0;
                d71Var2.c.getVideoRotation();
                TextureView f10 = a71Var.f(z61Var3, z10, i3, i10, d71Var2.J);
                d71Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                z61Var2.d(false, false);
                break;
        }
    }
}
