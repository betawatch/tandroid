package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a4 extends wg.r {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(o8 o8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.F = o8Var;
    }

    @Override // wg.r
    public final void a() {
        switch (this.E) {
            case 0:
                b4 b4Var = (b4) this.F;
                b4Var.o = true;
                setPaused(true);
                setVisibility(8);
                b4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.F).a.setVisibility(0);
                break;
        }
    }

    @Override // wg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((o8) this.F).a;
                super.onSurfaceTextureUpdated(surfaceTexture);
                if (this.n && imageView.getVisibility() == 0) {
                    imageView.setVisibility(4);
                    break;
                }
                break;
            default:
                super.onSurfaceTextureUpdated(surfaceTexture);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, Context context, x3 x3Var) {
        super(context, x3Var, 2);
        this.F = b4Var;
    }
}
