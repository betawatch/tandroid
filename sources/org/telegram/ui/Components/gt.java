package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gt extends hy {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final /* synthetic */ lt Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(lt ltVar, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12) {
        super(f2Var, z9, false, false, context, z10, null, null, z11, f6Var, false, z12);
        this.Y2 = ltVar;
    }

    @Override // org.telegram.ui.Components.hy, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lt ltVar = this.Y2;
        int i7 = ltVar.L;
        if (i7 == 2 || i7 == 3) {
            ltVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.hy, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        lt ltVar = this.Y2;
        if (ltVar.b()) {
            int i14 = i12 - i10;
            if (!this.W2 && ltVar.y) {
                this.X2 = true;
            }
            if (this.X2 && (i13 = this.V2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.camera.q.l(animate().translationY(0.0f), org.telegram.ui.ActionBar.i1.w, 250L);
                this.X2 = false;
            }
            this.W2 = ltVar.y;
            this.V2 = i14;
        }
    }
}
