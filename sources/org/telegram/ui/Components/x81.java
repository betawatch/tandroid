package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f91 b;

    public /* synthetic */ x81(f91 f91Var, int i10) {
        this.a = i10;
        this.b = f91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f91 f91Var = this.b;
                b91 b91Var = f91Var.c0;
                k71 k71Var = f91Var.a;
                if (k71Var != null && k71Var.y()) {
                    b91Var.c((int) (k71Var.n() / 1000));
                    b91Var.w = (int) (k71Var.j() / 1000);
                    b91Var.invalidate();
                    AndroidUtilities.runOnUIThread(f91Var.f0, 1000L);
                    break;
                }
                break;
            default:
                f91 f91Var2 = this.b;
                b91 b91Var2 = f91Var2.c0;
                ImageView imageView = f91Var2.e;
                TextureView textureView = f91Var2.d;
                f91Var2.T = false;
                Bitmap bitmap = f91Var2.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    f91Var2.h = null;
                }
                f91Var2.P = true;
                if (imageView != null) {
                    try {
                        Bitmap createBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        f91Var2.h = createBitmap;
                        textureView.getBitmap(createBitmap);
                    } catch (Throwable th2) {
                        Bitmap bitmap2 = f91Var2.h;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            f91Var2.h = null;
                        }
                        FileLog.e(th2);
                    }
                    if (f91Var2.h != null) {
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(f91Var2.h);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                }
                f91Var2.R = true;
                f91Var2.n();
                f91Var2.o();
                f91Var2.k();
                f91Var2.m();
                ViewGroup viewGroup = (ViewGroup) b91Var2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b91Var2);
                }
                c91 c91Var = f91Var2.v;
                b91 b91Var3 = f91Var2.c0;
                boolean z4 = f91Var2.R;
                int i10 = f91Var2.d0;
                int i11 = f91Var2.e0;
                f91Var2.c.getVideoRotation();
                TextureView f10 = c91Var.f(b91Var3, z4, i10, i11, f91Var2.F);
                f91Var2.n = f10;
                f10.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(textureView);
                }
                b91Var2.d(false, false);
                break;
        }
    }
}
