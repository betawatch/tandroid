package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class b4 extends vg.r {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(o8 o8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = o8Var;
    }

    @Override // vg.r
    public final void a() {
        switch (this.D) {
            case 0:
                c4 c4Var = (c4) this.E;
                c4Var.o = true;
                setPaused(true);
                setVisibility(8);
                c4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((o8) this.E).a;
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
    public b4(c4 c4Var, Context context, y3 y3Var) {
        super(context, y3Var, 2);
        this.E = c4Var;
    }
}
