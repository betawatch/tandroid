package nh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ga extends n3 {
    public final /* synthetic */ gb g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(gb gbVar, int i10, Context context, lh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.g0 = gbVar;
    }

    @Override // nh.n3
    public final void a() {
        gb gbVar = this.g0;
        gbVar.I0.setTranslationY(gbVar.n.getMeasuredHeight() - gbVar.I0.g());
        q9 q9Var = gbVar.m2;
        if (q9Var != null) {
            q9Var.run();
            gbVar.m2 = null;
        }
    }

    @Override // nh.n3
    public final void c(boolean z10) {
        if (this.g0.b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new m6(this, 5));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        gb gbVar = this.g0;
        gbVar.H0 = true;
        gbVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        gb gbVar = this.g0;
        if (gbVar.g2) {
            float clamp = Utilities.clamp(1.0f - (f9 / (gbVar.n.getMeasuredHeight() - gbVar.I0.g())), 1.0f, 0.0f);
            gbVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            gbVar.r.setAlpha(1.0f - (0.6f * clamp));
            gbVar.e0.setAlpha(1.0f - clamp);
        }
    }
}
