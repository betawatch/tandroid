package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class se extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                post(new yd(this.b, 5));
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
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
    public final void setAlpha(float f10) {
        switch (this.a) {
            case 0:
                super.setAlpha(f10);
                qe qeVar = this.b.F1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                qe qeVar2 = this.b.F1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                le leVar = this.b.W0;
                if (leVar != null) {
                    leVar.invalidate();
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
                le leVar = this.b.W0;
                if (leVar != null) {
                    leVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
