// default package

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class jnc extends er4 {
    public final /* synthetic */ lnc j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnc(lnc lncVar, Context context) {
        super(context, 1, 4);
        this.j0 = lncVar;
    }

    @Override // er4
    public final void h() {
        lnc lncVar = this.j0;
        if (lncVar.e == this) {
            lncVar.h();
        }
    }

    @Override // er4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // er4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int round = Math.round(Math.min(i, i2) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.E = round;
        this.y = round;
    }

    @Override // er4, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // er4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.j0.y && super.onTouchEvent(motionEvent);
    }
}
