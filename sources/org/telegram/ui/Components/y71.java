package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g81 b;

    public /* synthetic */ y71(g81 g81Var, int i9) {
        this.a = i9;
        this.b = g81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g81 g81Var = this.b;
                c81 c81Var = g81Var.b0;
                k61 k61Var = g81Var.a;
                if (k61Var != null && k61Var.z()) {
                    c81Var.c((int) (k61Var.o() / 1000));
                    c81Var.w = (int) (k61Var.k() / 1000);
                    c81Var.invalidate();
                    AndroidUtilities.runOnUIThread(g81Var.e0, 1000L);
                    break;
                }
                break;
            default:
                g81 g81Var2 = this.b;
                c81 c81Var2 = g81Var2.b0;
                ImageView imageView = g81Var2.e;
                TextureView textureView = g81Var2.d;
                g81Var2.S = false;
                Bitmap bitmap = g81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    g81Var2.h = null;
                }
                g81Var2.O = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        g81Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = g81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            g81Var2.h = null;
                        }
                        FileLog.e(th);
                    }
                    if (g81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(g81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                g81Var2.Q = true;
                g81Var2.n();
                g81Var2.o();
                g81Var2.k();
                g81Var2.m();
                ViewGroup viewGroup = (ViewGroup) c81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(c81Var2);
                }
                d81 d81Var = g81Var2.v;
                c81 c81Var3 = g81Var2.b0;
                boolean z10 = g81Var2.Q;
                int i9 = g81Var2.c0;
                int i10 = g81Var2.d0;
                g81Var2.c.getVideoRotation();
                TextureView f10 = d81Var.f(c81Var3, z10, i9, i10, g81Var2.E);
                g81Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                c81Var2.d(false, false);
                break;
        }
    }
}
