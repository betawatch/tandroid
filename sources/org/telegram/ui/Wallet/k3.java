package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class k3 extends tg.t {
    public final /* synthetic */ Object E;
    public final /* synthetic */ int y = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(o8 o8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = o8Var;
    }

    @Override // tg.t
    public final void a() {
        switch (this.y) {
            case 0:
                l3 l3Var = (l3) this.E;
                l3Var.o = true;
                setPaused(true);
                setVisibility(8);
                l3Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((o8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // tg.t, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.y) {
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
    public k3(l3 l3Var, Context context, h3 h3Var) {
        super(context, h3Var, 2);
        this.E = l3Var;
    }
}
