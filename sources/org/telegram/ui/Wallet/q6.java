package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q6 extends tg.n {
    public final /* synthetic */ s6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(s6 s6Var, Context context) {
        super(context, 1, 4);
        this.i0 = s6Var;
    }

    @Override // tg.n
    public final void j() {
        s6 s6Var = this.i0;
        if (s6Var.e == this) {
            s6.c(s6Var);
        }
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        super.onSurfaceTextureAvailable(surfaceTexture, round, round);
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        int round = Math.round(Math.min(i10, i11) * 3.5f);
        surfaceTexture.setDefaultBufferSize(round, round);
        this.y = round;
        this.x = round;
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int round = Math.round(Math.min(getWidth(), getHeight()) * 3.5f);
        if (round > 0) {
            surfaceTexture.setDefaultBufferSize(round, round);
        }
    }

    @Override // tg.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.i0.x && super.onTouchEvent(motionEvent);
    }
}
