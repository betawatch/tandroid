package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m4 extends vg.r {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(f9 f9Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.F = f9Var;
    }

    @Override // vg.r
    public final void a() {
        switch (this.E) {
            case 0:
                n4 n4Var = (n4) this.F;
                n4Var.o = true;
                setPaused(true);
                setVisibility(8);
                n4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((f9) this.F).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((f9) this.F).a;
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
    public m4(n4 n4Var, Context context, j4 j4Var) {
        super(context, j4Var, 2);
        this.F = n4Var;
    }
}
