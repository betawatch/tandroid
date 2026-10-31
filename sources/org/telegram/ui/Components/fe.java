package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fe extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ld(this.b, 5));
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (getAlpha() <= 0.0f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        switch (this.a) {
            case 0:
                super.setAlpha(f7);
                de deVar = this.b.J1;
                if (deVar != null) {
                    deVar.setTranslationX(deVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f7);
                de deVar2 = this.b.J1;
                if (deVar2 != null) {
                    deVar2.setTranslationX(deVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                yd ydVar = this.b.Z0;
                if (ydVar != null) {
                    ydVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 2:
                super.setVisibility(i10);
                yd ydVar = this.b.Z0;
                if (ydVar != null) {
                    ydVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
