package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z71 b;

    public /* synthetic */ r71(z71 z71Var, int i7) {
        this.a = i7;
        this.b = z71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z71 z71Var = this.b;
                v71 v71Var = z71Var.g0;
                i61 i61Var = z71Var.a;
                if (i61Var != null && i61Var.d0()) {
                    v71Var.c((int) (i61Var.S() / 1000));
                    v71Var.x = (int) (i61Var.K() / 1000);
                    v71Var.invalidate();
                    org.telegram.messenger.g0.h3(z71Var.j0, 1000L);
                    break;
                }
                break;
            default:
                z71 z71Var2 = this.b;
                v71 v71Var2 = z71Var2.g0;
                ImageView imageView = z71Var2.e;
                TextureView textureView = z71Var2.d;
                z71Var2.a0 = false;
                Bitmap bitmap = z71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    z71Var2.h = null;
                }
                z71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        z71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = z71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            z71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (z71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(z71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                z71Var2.V = true;
                z71Var2.n();
                z71Var2.o();
                z71Var2.k();
                z71Var2.m();
                ViewGroup viewGroup = (ViewGroup) v71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(v71Var2);
                }
                w71 w71Var = z71Var2.w;
                v71 v71Var3 = z71Var2.g0;
                boolean z10 = z71Var2.V;
                int i7 = z71Var2.h0;
                int i10 = z71Var2.i0;
                z71Var2.c.getVideoRotation();
                TextureView f10 = w71Var.f(v71Var3, z10, i7, i10, z71Var2.J);
                z71Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                v71Var2.d(false, false);
                break;
        }
    }
}
