package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j3 extends tg.t {
    public final /* synthetic */ Object E;
    public final /* synthetic */ int y = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l8 l8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = l8Var;
    }

    @Override // tg.t
    public final void a() {
        switch (this.y) {
            case 0:
                k3 k3Var = (k3) this.E;
                k3Var.o = true;
                setPaused(true);
                setVisibility(8);
                k3Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((l8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // tg.t, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.y) {
            case 1:
                ImageView imageView = ((l8) this.E).a;
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
    public j3(k3 k3Var, Context context, g3 g3Var) {
        super(context, g3Var, 2);
        this.E = k3Var;
    }
}
