package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gg0 extends sg.e {
    public final /* synthetic */ int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.b0 = i12;
    }

    @Override // sg.e
    public void k() {
        switch (this.b0) {
            case 4:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // sg.e, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        switch (this.b0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // sg.e, android.view.View
    public void onDetachedFromWindow() {
        switch (this.b0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    private final void l() {
    }
}
