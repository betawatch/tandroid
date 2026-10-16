package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a6 extends tg.n {
    public final /* synthetic */ c6 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(c6 c6Var, Context context) {
        super(context, 1, 4);
        this.f0 = c6Var;
    }

    @Override // tg.n
    public final void i() {
        c6 c6Var = this.f0;
        if (c6Var.e == this) {
            c6.c(c6Var);
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
        return !this.f0.x && super.onTouchEvent(motionEvent);
    }
}
