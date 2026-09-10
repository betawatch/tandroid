package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ g91(o91 o91Var, int i10) {
        this.a = i10;
        this.b = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o91 o91Var = this.b;
                k91 k91Var = o91Var.f0;
                t71 t71Var = o91Var.a;
                if (t71Var != null && t71Var.y()) {
                    k91Var.c((int) (t71Var.n() / 1000));
                    k91Var.w = (int) (t71Var.j() / 1000);
                    k91Var.invalidate();
                    AndroidUtilities.runOnUIThread(o91Var.i0, 1000L);
                    break;
                }
                break;
            default:
                o91 o91Var2 = this.b;
                k91 k91Var2 = o91Var2.f0;
                ImageView imageView = o91Var2.e;
                TextureView textureView = o91Var2.d;
                o91Var2.W = false;
                Bitmap bitmap = o91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    o91Var2.h = null;
                }
                o91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        o91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = o91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            o91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (o91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(o91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                o91Var2.U = true;
                o91Var2.n();
                o91Var2.o();
                o91Var2.k();
                o91Var2.m();
                ViewGroup viewGroup = (ViewGroup) k91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(k91Var2);
                }
                l91 l91Var = o91Var2.v;
                k91 k91Var3 = o91Var2.f0;
                boolean z10 = o91Var2.U;
                int i10 = o91Var2.g0;
                int i11 = o91Var2.h0;
                o91Var2.c.getVideoRotation();
                TextureView f7 = l91Var.f(k91Var3, z10, i10, i11, o91Var2.I);
                o91Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                k91Var2.d(false, false);
                break;
        }
    }
}
