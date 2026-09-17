package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class eg0 extends tg.e {
    public final /* synthetic */ int b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.b0 = i12;
    }

    @Override // tg.e
    public void k() {
        switch (this.b0) {
            case 4:
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // tg.e, android.view.TextureView, android.view.View
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

    @Override // tg.e, android.view.View
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
