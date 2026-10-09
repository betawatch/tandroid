package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha1 b;

    public /* synthetic */ y91(ha1 ha1Var, int i10) {
        this.a = i10;
        this.b = ha1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ha1 ha1Var = this.b;
                ca1 ca1Var = ha1Var.f0;
                k81 k81Var = ha1Var.a;
                if (k81Var != null && k81Var.y()) {
                    ca1Var.c((int) (k81Var.n() / 1000));
                    ca1Var.w = (int) (k81Var.j() / 1000);
                    ca1Var.invalidate();
                    AndroidUtilities.runOnUIThread(ha1Var.i0, 1000L);
                    break;
                }
                break;
            default:
                ha1 ha1Var2 = this.b;
                ca1 ca1Var2 = ha1Var2.f0;
                ImageView imageView = ha1Var2.e;
                TextureView textureView = ha1Var2.d;
                ha1Var2.W = false;
                Bitmap bitmap = ha1Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    ha1Var2.h = null;
                }
                ha1Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        ha1Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = ha1Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            ha1Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (ha1Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(ha1Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                ha1Var2.U = true;
                ha1Var2.n();
                ha1Var2.o();
                ha1Var2.k();
                ha1Var2.m();
                ViewGroup viewGroup = (ViewGroup) ca1Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(ca1Var2);
                }
                da1 da1Var = ha1Var2.v;
                ca1 ca1Var3 = ha1Var2.f0;
                boolean z10 = ha1Var2.U;
                int i10 = ha1Var2.g0;
                int i11 = ha1Var2.h0;
                ha1Var2.c.getVideoRotation();
                TextureView f7 = da1Var.f(ca1Var3, z10, i10, i11, ha1Var2.I);
                ha1Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                ca1Var2.d(false, false);
                break;
        }
    }
}
