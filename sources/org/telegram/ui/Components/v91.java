package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da1 b;

    public /* synthetic */ v91(da1 da1Var, int i10) {
        this.a = i10;
        this.b = da1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                da1 da1Var = this.b;
                z91 z91Var = da1Var.f0;
                j81 j81Var = da1Var.a;
                if (j81Var != null && j81Var.y()) {
                    z91Var.c((int) (j81Var.n() / 1000));
                    z91Var.w = (int) (j81Var.j() / 1000);
                    z91Var.invalidate();
                    AndroidUtilities.runOnUIThread(da1Var.i0, 1000L);
                    break;
                }
                break;
            default:
                da1 da1Var2 = this.b;
                z91 z91Var2 = da1Var2.f0;
                ImageView imageView = da1Var2.e;
                TextureView textureView = da1Var2.d;
                da1Var2.W = false;
                Bitmap bitmap = da1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    da1Var2.h = null;
                }
                da1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        da1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = da1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            da1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (da1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(da1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                da1Var2.U = true;
                da1Var2.n();
                da1Var2.o();
                da1Var2.k();
                da1Var2.m();
                ViewGroup viewGroup = (ViewGroup) z91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(z91Var2);
                }
                aa1 aa1Var = da1Var2.v;
                z91 z91Var3 = da1Var2.f0;
                boolean z10 = da1Var2.U;
                int i10 = da1Var2.g0;
                int i11 = da1Var2.h0;
                da1Var2.c.getVideoRotation();
                TextureView f7 = aa1Var.f(z91Var3, z10, i10, i11, da1Var2.I);
                da1Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                z91Var2.d(false, false);
                break;
        }
    }
}
