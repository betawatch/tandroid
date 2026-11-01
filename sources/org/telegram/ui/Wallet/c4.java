package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class c4 extends lg.w {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(u8 u8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = u8Var;
    }

    @Override // lg.w
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
                ((u8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // lg.w, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((u8) this.E).a;
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
