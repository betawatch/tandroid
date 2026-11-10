package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class je extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(ChatActivityEnterView chatActivityEnterView, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                post(new qd(this.b, 5));
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
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
                he heVar = this.b.J1;
                if (heVar != null) {
                    heVar.setTranslationX(heVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                he heVar2 = this.b.J1;
                if (heVar2 != null) {
                    heVar2.setTranslationX(heVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                ce ceVar = this.b.Z0;
                if (ceVar != null) {
                    ceVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 2:
                super.setVisibility(i7);
                ce ceVar = this.b.Z0;
                if (ceVar != null) {
                    ceVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
