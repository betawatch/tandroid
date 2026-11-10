package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class c4 extends vg.r {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(q8 q8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = q8Var;
    }

    @Override // vg.r
    public final void a() {
        switch (this.D) {
            case 0:
                d4 d4Var = (d4) this.E;
                d4Var.o = true;
                setPaused(true);
                setVisibility(8);
                d4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((q8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((q8) this.E).a;
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
    public c4(d4 d4Var, Context context, z3 z3Var) {
        super(context, z3Var, 2);
        this.E = d4Var;
    }
}
