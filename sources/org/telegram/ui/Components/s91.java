package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class s91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa1 b;

    public /* synthetic */ s91(aa1 aa1Var, int i10) {
        this.a = i10;
        this.b = aa1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aa1 aa1Var = this.b;
                w91 w91Var = aa1Var.f0;
                e81 e81Var = aa1Var.a;
                if (e81Var != null && e81Var.y()) {
                    w91Var.c((int) (e81Var.n() / 1000));
                    w91Var.w = (int) (e81Var.j() / 1000);
                    w91Var.invalidate();
                    AndroidUtilities.runOnUIThread(aa1Var.i0, 1000L);
                    break;
                }
                break;
            default:
                aa1 aa1Var2 = this.b;
                w91 w91Var2 = aa1Var2.f0;
                ImageView imageView = aa1Var2.e;
                TextureView textureView = aa1Var2.d;
                aa1Var2.W = false;
                Bitmap bitmap = aa1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    aa1Var2.h = null;
                }
                aa1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        aa1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = aa1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            aa1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (aa1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(aa1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                aa1Var2.U = true;
                aa1Var2.n();
                aa1Var2.o();
                aa1Var2.k();
                aa1Var2.m();
                ViewGroup viewGroup = (ViewGroup) w91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(w91Var2);
                }
                x91 x91Var = aa1Var2.v;
                w91 w91Var3 = aa1Var2.f0;
                boolean z10 = aa1Var2.U;
                int i10 = aa1Var2.g0;
                int i11 = aa1Var2.h0;
                aa1Var2.c.getVideoRotation();
                TextureView f7 = x91Var.f(w91Var3, z10, i10, i11, aa1Var2.I);
                aa1Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                w91Var2.d(false, false);
                break;
        }
    }
}
