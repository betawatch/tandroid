package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ na1 b;

    public /* synthetic */ fa1(na1 na1Var, int i10) {
        this.a = i10;
        this.b = na1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                na1 na1Var = this.b;
                ja1 ja1Var = na1Var.f0;
                t81 t81Var = na1Var.a;
                if (t81Var != null && t81Var.y()) {
                    ja1Var.c((int) (t81Var.n() / 1000));
                    ja1Var.w = (int) (t81Var.j() / 1000);
                    ja1Var.invalidate();
                    AndroidUtilities.runOnUIThread(na1Var.i0, 1000L);
                    break;
                }
                break;
            default:
                na1 na1Var2 = this.b;
                ja1 ja1Var2 = na1Var2.f0;
                ImageView imageView = na1Var2.e;
                TextureView textureView = na1Var2.d;
                na1Var2.W = false;
                Bitmap bitmap = na1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    na1Var2.h = null;
                }
                na1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        na1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = na1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            na1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (na1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(na1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                na1Var2.U = true;
                na1Var2.n();
                na1Var2.o();
                na1Var2.k();
                na1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ja1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ja1Var2);
                }
                ka1 ka1Var = na1Var2.v;
                ja1 ja1Var3 = na1Var2.f0;
                boolean z10 = na1Var2.U;
                int i10 = na1Var2.g0;
                int i11 = na1Var2.h0;
                na1Var2.c.getVideoRotation();
                TextureView f7 = ka1Var.f(ja1Var3, z10, i10, i11, na1Var2.I);
                na1Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ja1Var2.d(false, false);
                break;
        }
    }
}
