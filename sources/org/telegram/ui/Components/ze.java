package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ze extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ge(this.b, 5));
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
                xe xeVar = this.b.I1;
                if (xeVar != null) {
                    xeVar.setTranslationX(xeVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f7);
                xe xeVar2 = this.b.I1;
                if (xeVar2 != null) {
                    xeVar2.setTranslationX(xeVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                se seVar = this.b.Z0;
                if (seVar != null) {
                    seVar.invalidate();
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
                se seVar = this.b.Z0;
                if (seVar != null) {
                    seVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
