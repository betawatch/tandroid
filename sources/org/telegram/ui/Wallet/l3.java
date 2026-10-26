package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l3 extends ug.s {
    public final /* synthetic */ Object E;
    public final /* synthetic */ int y = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(i8 i8Var, Context context, m mVar) {
        super(context, mVar, 0);
        this.E = i8Var;
    }

    @Override // ug.s
    public final void a() {
        switch (this.y) {
            case 0:
                m3 m3Var = (m3) this.E;
                m3Var.o = true;
                setPaused(true);
                setVisibility(8);
                m3Var.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((i8) this.E).a.setVisibility(0);
                break;
        }
    }

    @Override // ug.s, android.view.TextureView.SurfaceTextureListener
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
    public l3(m3 m3Var, Context context, i3 i3Var) {
        super(context, i3Var, 2);
        this.E = m3Var;
    }
}
