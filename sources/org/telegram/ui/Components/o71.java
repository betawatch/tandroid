package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ o71(w71 w71Var, int i7) {
        this.a = i7;
        this.b = w71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w71 w71Var = this.b;
                s71 s71Var = w71Var.g0;
                f61 f61Var = w71Var.a;
                if (f61Var != null && f61Var.d0()) {
                    s71Var.c((int) (f61Var.S() / 1000));
                    s71Var.x = (int) (f61Var.K() / 1000);
                    s71Var.invalidate();
                    org.telegram.messenger.g0.h3(w71Var.j0, 1000L);
                    break;
                }
                break;
            default:
                w71 w71Var2 = this.b;
                s71 s71Var2 = w71Var2.g0;
                ImageView imageView = w71Var2.e;
                TextureView textureView = w71Var2.d;
                w71Var2.a0 = false;
                Bitmap bitmap = w71Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    w71Var2.h = null;
                }
                w71Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        w71Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = w71Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            w71Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (w71Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(w71Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                w71Var2.V = true;
                w71Var2.n();
                w71Var2.o();
                w71Var2.k();
                w71Var2.m();
                ViewGroup viewGroup = (ViewGroup) s71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(s71Var2);
                }
                t71 t71Var = w71Var2.w;
                s71 s71Var3 = w71Var2.g0;
                boolean z10 = w71Var2.V;
                int i7 = w71Var2.h0;
                int i10 = w71Var2.i0;
                w71Var2.c.getVideoRotation();
                TextureView f10 = t71Var.f(s71Var3, z10, i7, i10, w71Var2.J);
                w71Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                s71Var2.d(false, false);
                break;
        }
    }
}
