package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class b4 extends vg.s {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(q8 q8Var, Context context, l lVar) {
        super(context, lVar, 0);
        this.F = q8Var;
    }

    @Override // vg.s
    public final void a() {
        switch (this.E) {
            case 0:
                c4 c4Var = (c4) this.F;
                c4Var.o = true;
                setPaused(true);
                setVisibility(8);
                c4Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((q8) this.F).a.setVisibility(0);
                break;
        }
    }

    @Override // vg.s, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((q8) this.F).a;
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
        this.F = c4Var;
    }
}
