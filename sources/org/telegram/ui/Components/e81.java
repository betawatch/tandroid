package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m81 b;

    public /* synthetic */ e81(m81 m81Var, int i10) {
        this.a = i10;
        this.b = m81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m81 m81Var = this.b;
                i81 i81Var = m81Var.f0;
                u61 u61Var = m81Var.a;
                if (u61Var != null && u61Var.d0()) {
                    i81Var.c((int) (u61Var.S() / 1000));
                    i81Var.x = (int) (u61Var.J() / 1000);
                    i81Var.invalidate();
                    org.telegram.messenger.i0.h3(m81Var.i0, 1000L);
                    break;
                }
                break;
            default:
                m81 m81Var2 = this.b;
                i81 i81Var2 = m81Var2.f0;
                ImageView imageView = m81Var2.e;
                TextureView textureView = m81Var2.d;
                m81Var2.W = false;
                Bitmap bitmap = m81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    m81Var2.h = null;
                }
                m81Var2.S = true;
                if (imageView != null) {
                    try {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap b10 = org.telegram.messenger.js.b(width, height);
                        m81Var2.h = b10;
                        textureView.getBitmap(b10);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = m81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            m81Var2.h = null;
                        }
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    if (m81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(m81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                m81Var2.U = true;
                m81Var2.n();
                m81Var2.o();
                m81Var2.k();
                m81Var2.m();
                ViewGroup viewGroup = (ViewGroup) i81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(i81Var2);
                }
                j81 j81Var = m81Var2.w;
                i81 i81Var3 = m81Var2.f0;
                boolean z10 = m81Var2.U;
                int i10 = m81Var2.g0;
                int i11 = m81Var2.h0;
                m81Var2.c.getVideoRotation();
                TextureView f7 = j81Var.f(i81Var3, z10, i10, i11, m81Var2.I);
                m81Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                i81Var2.d(false, false);
                break;
        }
    }
}
