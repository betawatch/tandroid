package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class a4 extends vg.r {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(n8 n8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.E = n8Var;
    }

    @Override // vg.r
    public final void a() {
        switch (this.D) {
            case 0:
                b4 b4Var = (b4) this.E;
                b4Var.o = true;
                setPaused(true);
                setVisibility(8);
                b4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((n8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.D) {
            case 1:
                ImageView imageView = ((n8) this.E).a;
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
        this.E = b4Var;
    }
}
