package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l71 b;

    public /* synthetic */ d71(l71 l71Var, int i7) {
        this.a = i7;
        this.b = l71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l71 l71Var = this.b;
                h71 h71Var = l71Var.f0;
                t51 t51Var = l71Var.a;
                if (t51Var != null && t51Var.d0()) {
                    h71Var.c((int) (t51Var.S() / 1000));
                    h71Var.x = (int) (t51Var.K() / 1000);
                    h71Var.invalidate();
                    org.telegram.messenger.g0.i3(l71Var.i0, 1000L);
                    break;
                }
                break;
            default:
                l71 l71Var2 = this.b;
                h71 h71Var2 = l71Var2.f0;
                ImageView imageView = l71Var2.e;
                TextureView textureView = l71Var2.d;
                l71Var2.W = false;
                Bitmap bitmap = l71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    l71Var2.h = null;
                }
                l71Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.as.c(width, height);
                        l71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = l71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            l71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (l71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(l71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                l71Var2.U = true;
                l71Var2.n();
                l71Var2.o();
                l71Var2.k();
                l71Var2.m();
                ViewGroup viewGroup = (ViewGroup) h71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(h71Var2);
                }
                i71 i71Var = l71Var2.w;
                h71 h71Var3 = l71Var2.f0;
                boolean z9 = l71Var2.U;
                int i7 = l71Var2.g0;
                int i10 = l71Var2.h0;
                l71Var2.c.getVideoRotation();
                TextureView f10 = i71Var.f(h71Var3, z9, i7, i10, l71Var2.I);
                l71Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                h71Var2.d(false, false);
                break;
        }
    }
}
