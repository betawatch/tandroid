package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class eg0 extends rg.f {
    public final /* synthetic */ int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.b0 = i12;
    }

    @Override // rg.f
    public void k() {
        switch (this.b0) {
            case 4:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // rg.f, android.view.TextureView, android.view.View
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

    @Override // rg.f, android.view.View
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
