package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ea1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma1 b;

    public /* synthetic */ ea1(ma1 ma1Var, int i10) {
        this.a = i10;
        this.b = ma1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ma1 ma1Var = this.b;
                ia1 ia1Var = ma1Var.f0;
                s81 s81Var = ma1Var.a;
                if (s81Var != null && s81Var.y()) {
                    ia1Var.c((int) (s81Var.n() / 1000));
                    ia1Var.w = (int) (s81Var.j() / 1000);
                    ia1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ma1Var.i0, 1000L);
                    break;
                }
                break;
            default:
                ma1 ma1Var2 = this.b;
                ia1 ia1Var2 = ma1Var2.f0;
                ImageView imageView = ma1Var2.e;
                TextureView textureView = ma1Var2.d;
                ma1Var2.W = false;
                Bitmap bitmap = ma1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ma1Var2.h = null;
                }
                ma1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ma1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ma1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ma1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ma1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ma1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ma1Var2.U = true;
                ma1Var2.n();
                ma1Var2.o();
                ma1Var2.k();
                ma1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ia1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ia1Var2);
                }
                ja1 ja1Var = ma1Var2.v;
                ia1 ia1Var3 = ma1Var2.f0;
                boolean z10 = ma1Var2.U;
                int i10 = ma1Var2.g0;
                int i11 = ma1Var2.h0;
                ma1Var2.c.getVideoRotation();
                TextureView f7 = ja1Var.f(ia1Var3, z10, i10, i11, ma1Var2.I);
                ma1Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ia1Var2.d(false, false);
                break;
        }
    }
}
