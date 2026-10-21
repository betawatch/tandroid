package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class m3 extends tg.t {
    public final /* synthetic */ Object E;
    public final /* synthetic */ int y = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(i8 i8Var, Context context, n nVar) {
        super(context, nVar, 0);
        this.E = i8Var;
    }

    @Override // tg.t
    public final void a() {
        switch (this.y) {
            case 0:
                n3 n3Var = (n3) this.E;
                n3Var.o = true;
                setPaused(true);
                setVisibility(8);
                n3Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((i8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // tg.t, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.y) {
            case 1:
                ImageView imageView = ((i8) this.E).a;
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
    public m3(n3 n3Var, Context context, j3 j3Var) {
        super(context, j3Var, 2);
        this.E = n3Var;
    }
}
