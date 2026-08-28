package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class se extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se(ChatActivityEnterView chatActivityEnterView, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                post(new yd(this.b, 5));
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
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
                qe qeVar = this.b.E1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                qe qeVar2 = this.b.E1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                le leVar = this.b.V0;
                if (leVar != null) {
                    leVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 2:
                super.setVisibility(i9);
                le leVar = this.b.V0;
                if (leVar != null) {
                    leVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }
}
