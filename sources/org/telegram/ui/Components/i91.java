package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class i91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q91 b;

    public /* synthetic */ i91(q91 q91Var, int i10) {
        this.a = i10;
        this.b = q91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q91 q91Var = this.b;
                m91 m91Var = q91Var.f0;
                u71 u71Var = q91Var.a;
                if (u71Var != null && u71Var.y()) {
                    m91Var.c((int) (u71Var.n() / 1000));
                    m91Var.w = (int) (u71Var.j() / 1000);
                    m91Var.invalidate();
                    AndroidUtilities.runOnUIThread(q91Var.i0, 1000L);
                    break;
                }
                break;
            default:
                q91 q91Var2 = this.b;
                m91 m91Var2 = q91Var2.f0;
                ImageView imageView = q91Var2.e;
                TextureView textureView = q91Var2.d;
                q91Var2.W = false;
                Bitmap bitmap = q91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    q91Var2.h = null;
                }
                q91Var2.S = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        q91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = q91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            q91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (q91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(q91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                q91Var2.U = true;
                q91Var2.n();
                q91Var2.o();
                q91Var2.k();
                q91Var2.m();
                ViewGroup viewGroup = (ViewGroup) m91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(m91Var2);
                }
                n91 n91Var = q91Var2.v;
                m91 m91Var3 = q91Var2.f0;
                boolean z10 = q91Var2.U;
                int i10 = q91Var2.g0;
                int i11 = q91Var2.h0;
                q91Var2.c.getVideoRotation();
                TextureView f7 = n91Var.f(m91Var3, z10, i10, i11, q91Var2.I);
                q91Var2.n = f7;
                f7.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                m91Var2.d(false, false);
                break;
        }
    }
}
