package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l4 extends vg.r {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(e9 e9Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.F = e9Var;
    }

    @Override // vg.r
    public final void a() {
        switch (this.E) {
            case 0:
                m4 m4Var = (m4) this.F;
                m4Var.o = true;
                setPaused(true);
                setVisibility(8);
                m4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((e9) this.F).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.r, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((e9) this.F).a;
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
    public l4(m4 m4Var, Context context, i4 i4Var) {
        super(context, i4Var, 2);
        this.F = m4Var;
    }
}
