package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ k81(s81 s81Var, int i10) {
        this.a = i10;
        this.b = s81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s81 s81Var = this.b;
                o81 o81Var = s81Var.b0;
                x61 x61Var = s81Var.a;
                if (x61Var != null && x61Var.z()) {
                    o81Var.c((int) (x61Var.o() / 1000));
                    o81Var.w = (int) (x61Var.k() / 1000);
                    o81Var.invalidate();
                    AndroidUtilities.runOnUIThread(s81Var.e0, 1000L);
                    break;
                }
                break;
            default:
                s81 s81Var2 = this.b;
                o81 o81Var2 = s81Var2.b0;
                ImageView imageView = s81Var2.e;
                TextureView textureView = s81Var2.d;
                s81Var2.S = false;
                Bitmap bitmap = s81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    s81Var2.h = null;
                }
                s81Var2.O = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        s81Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = s81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            s81Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (s81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(s81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                s81Var2.Q = true;
                s81Var2.n();
                s81Var2.o();
                s81Var2.k();
                s81Var2.m();
                ViewGroup viewGroup = (ViewGroup) o81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(o81Var2);
                }
                p81 p81Var = s81Var2.v;
                o81 o81Var3 = s81Var2.b0;
                boolean z10 = s81Var2.Q;
                int i10 = s81Var2.c0;
                int i11 = s81Var2.d0;
                s81Var2.c.getVideoRotation();
                TextureView f9 = p81Var.f(o81Var3, z10, i10, i11, s81Var2.E);
                s81Var2.n = f9;
                f9.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                o81Var2.d(false, false);
                break;
        }
    }
}
