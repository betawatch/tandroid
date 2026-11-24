// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class mkc extends fnc {
    public final /* synthetic */ byte E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(voc vocVar, Context context, kbc kbcVar) {
        super(context, kbcVar, 0);
        this.F = vocVar;
    }

    @Override // fnc
    public final void a() {
        byte b = this.E;
        Object obj = this.F;
        switch (b) {
            case 0:
                nkc nkcVar = (nkc) obj;
                nkcVar.o = true;
                setPaused(true);
                setVisibility(8);
                nkcVar.a.invalidate();
                break;
            default:
                setPaused(true);
                setVisibility(8);
                ((voc) obj).a.setVisibility(0);
                break;
        }
    }

    @Override // fnc, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.E) {
            case 1:
                ImageView imageView = ((voc) this.F).a;
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
    public mkc(nkc nkcVar, Context context, jkc jkcVar) {
        super(context, jkcVar, 2);
        this.F = nkcVar;
    }
}
