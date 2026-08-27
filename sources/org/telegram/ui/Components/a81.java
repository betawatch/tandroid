package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ a81(i81 i81Var, int i10) {
        this.a = i10;
        this.b = i81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i81 i81Var = this.b;
                e81 e81Var = i81Var.b0;
                m61 m61Var = i81Var.a;
                if (m61Var != null && m61Var.z()) {
                    e81Var.c((int) (m61Var.o() / 1000));
                    e81Var.w = (int) (m61Var.k() / 1000);
                    e81Var.invalidate();
                    AndroidUtilities.runOnUIThread(i81Var.e0, 1000L);
                    break;
                }
                break;
            default:
                i81 i81Var2 = this.b;
                e81 e81Var2 = i81Var2.b0;
                ImageView imageView = i81Var2.e;
                TextureView textureView = i81Var2.d;
                i81Var2.S = false;
                Bitmap bitmap = i81Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    i81Var2.h = null;
                }
                i81Var2.O = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        i81Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th) {
                        Bitmap bitmap2 = i81Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            i81Var2.h = null;
                        }
                        FileLog.e(th);
                    }
                    if (i81Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(i81Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                i81Var2.Q = true;
                i81Var2.n();
                i81Var2.o();
                i81Var2.k();
                i81Var2.m();
                ViewGroup viewGroup = (ViewGroup) e81Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(e81Var2);
                }
                f81 f81Var = i81Var2.v;
                e81 e81Var3 = i81Var2.b0;
                boolean z10 = i81Var2.Q;
                int i10 = i81Var2.c0;
                int i11 = i81Var2.d0;
                i81Var2.c.getVideoRotation();
                TextureView f10 = f81Var.f(e81Var3, z10, i10, i11, i81Var2.E);
                i81Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                e81Var2.d(false, false);
                break;
        }
    }
}
