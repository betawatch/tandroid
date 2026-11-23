package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a81 b;

    public /* synthetic */ s71(a81 a81Var, int i7) {
        this.a = i7;
        this.b = a81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a81 a81Var = this.b;
                w71 w71Var = a81Var.g0;
                h61 h61Var = a81Var.a;
                if (h61Var != null && h61Var.d0()) {
                    w71Var.c((int) (h61Var.S() / 1000));
                    w71Var.x = (int) (h61Var.K() / 1000);
                    w71Var.invalidate();
                    org.telegram.messenger.g0.h3(a81Var.j0, 1000L);
                    break;
                }
                break;
            default:
                a81 a81Var2 = this.b;
                w71 w71Var2 = a81Var2.g0;
                ImageView imageView = a81Var2.e;
                TextureView textureView = a81Var2.d;
                a81Var2.a0 = false;
                Bitmap bitmap = a81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    a81Var2.h = null;
                }
                a81Var2.T = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c10 = org.telegram.messenger.vr.c(width, height);
                        a81Var2.h = c10;
                        textureView.getBitmap(c10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = a81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            a81Var2.h = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (a81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(a81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                a81Var2.V = true;
                a81Var2.n();
                a81Var2.o();
                a81Var2.k();
                a81Var2.m();
                ViewGroup viewGroup = (ViewGroup) w71Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(w71Var2);
                }
                x71 x71Var = a81Var2.w;
                w71 w71Var3 = a81Var2.g0;
                boolean z10 = a81Var2.V;
                int i7 = a81Var2.h0;
                int i10 = a81Var2.i0;
                a81Var2.c.getVideoRotation();
                TextureView f10 = x71Var.f(w71Var3, z10, i7, i10, a81Var2.J);
                a81Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                w71Var2.d(false, false);
                break;
        }
    }
}
