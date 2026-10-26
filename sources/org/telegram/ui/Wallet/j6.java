package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j6 extends ug.n {
    public final /* synthetic */ l6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(l6 l6Var, Context context) {
        super(context, 1, 4);
        this.i0 = l6Var;
    }

    @Override // ug.n
    public final void i() {
        l6 l6Var = this.i0;
        if (l6Var.e == this) {
            l6.c(l6Var);
        }
    }

    @Override // ug.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // ug.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.y = round;
        this.x = round;
    }

    @Override // ug.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // ug.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.i0.x && super.onTouchEvent(motionEvent);
    }
}
