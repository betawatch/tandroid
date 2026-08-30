package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e91 b;

    public /* synthetic */ w81(e91 e91Var, int i10) {
        this.a = i10;
        this.b = e91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e91 e91Var = this.b;
                a91 a91Var = e91Var.c0;
                i71 i71Var = e91Var.a;
                if (i71Var != null && i71Var.y()) {
                    a91Var.c((int) (i71Var.n() / 1000));
                    a91Var.w = (int) (i71Var.j() / 1000);
                    a91Var.invalidate();
                    AndroidUtilities.runOnUIThread(e91Var.f0, 1000L);
                    break;
                }
                break;
            default:
                e91 e91Var2 = this.b;
                a91 a91Var2 = e91Var2.c0;
                ImageView imageView = e91Var2.e;
                TextureView textureView = e91Var2.d;
                e91Var2.T = false;
                Bitmap bitmap = e91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    e91Var2.h = null;
                }
                e91Var2.P = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        e91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = e91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            e91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (e91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(e91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                e91Var2.R = true;
                e91Var2.n();
                e91Var2.o();
                e91Var2.k();
                e91Var2.m();
                ViewGroup viewGroup = (ViewGroup) a91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(a91Var2);
                }
                b91 b91Var = e91Var2.v;
                a91 a91Var3 = e91Var2.c0;
                boolean z4 = e91Var2.R;
                int i10 = e91Var2.d0;
                int i11 = e91Var2.e0;
                e91Var2.c.getVideoRotation();
                TextureView f10 = b91Var.f(a91Var3, z4, i10, i11, e91Var2.F);
                e91Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                a91Var2.d(false, false);
                break;
        }
    }
}
