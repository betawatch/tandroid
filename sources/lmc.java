// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class lmc extends gpc {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmc(xqc xqcVar, Context context, cpc cpcVar) {
        super(context, cpcVar, 0);
        this.F = xqcVar;
    }

    @Override // gpc
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                mmc mmcVar = (mmc) obj;
                mmcVar.o = true;
                setPaused(true);
                setVisibility(8);
                mmcVar.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((xqc) obj).a.setVisibility(0);
                break;
        }
    }

    @Override // gpc, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((xqc) this.F).a;
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
    public lmc(mmc mmcVar, Context context, imc imcVar) {
        super(context, imcVar, 2);
        this.F = mmcVar;
    }
}
