package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class r91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z91 b;

    public /* synthetic */ r91(z91 z91Var, int i10) {
        this.a = i10;
        this.b = z91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z91 z91Var = this.b;
                v91 v91Var = z91Var.f0;
                d81 d81Var = z91Var.a;
                if (d81Var != null && d81Var.y()) {
                    v91Var.c((int) (d81Var.n() / 1000));
                    v91Var.w = (int) (d81Var.j() / 1000);
                    v91Var.invalidate();
                    AndroidUtilities.runOnUIThread(z91Var.i0, 1000L);
                    break;
                }
                break;
            default:
                z91 z91Var2 = this.b;
                v91 v91Var2 = z91Var2.f0;
                ImageView imageView = z91Var2.e;
                TextureView textureView = z91Var2.d;
                z91Var2.W = false;
                Bitmap bitmap = z91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    z91Var2.h = null;
                }
                z91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        z91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = z91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            z91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (z91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(z91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                z91Var2.U = true;
                z91Var2.n();
                z91Var2.o();
                z91Var2.k();
                z91Var2.m();
                ViewGroup viewGroup = (ViewGroup) v91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(v91Var2);
                }
                w91 w91Var = z91Var2.v;
                v91 v91Var3 = z91Var2.f0;
                boolean z10 = z91Var2.U;
                int i10 = z91Var2.g0;
                int i11 = z91Var2.h0;
                z91Var2.c.getVideoRotation();
                TextureView f7 = w91Var.f(v91Var3, z10, i10, i11, z91Var2.I);
                z91Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                v91Var2.d(false, false);
                break;
        }
    }
}
