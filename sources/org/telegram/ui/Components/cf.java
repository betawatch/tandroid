package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cf extends ImageView {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf(ChatActivityEnterView chatActivityEnterView, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                post(new ie(this.b, 5));
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
                af afVar = this.b.I1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.a);
                    break;
                }
                break;
            case 1:
                super.setAlpha(f7);
                af afVar2 = this.b.I1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.a);
                    break;
                }
                break;
            default:
                super.setAlpha(f7);
                ve veVar = this.b.Z0;
                if (veVar != null) {
                    veVar.invalidate();
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
                ve veVar = this.b.Z0;
                if (veVar != null) {
                    veVar.invalidate();
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
