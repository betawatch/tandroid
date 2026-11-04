package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ie extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie(ChatActivityEnterView chatActivityEnterView, Context context, int i3) {
        super(context);
        this.a = i3;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                post(new pd(this.b, 5));
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
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
                ge geVar = this.b.K1;
                if (geVar != null) {
                    geVar.setTranslationX(geVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f10);
                ge geVar2 = this.b.K1;
                if (geVar2 != null) {
                    geVar2.setTranslationX(geVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                be beVar = this.b.a1;
                if (beVar != null) {
                    beVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 2:
                super.setVisibility(i3);
                be beVar = this.b.a1;
                if (beVar != null) {
                    beVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
