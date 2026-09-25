package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class kb extends w3 {
    public final /* synthetic */ lc k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(lc lcVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = lcVar;
    }

    @Override // ci.w3
    public final void a() {
        lc lcVar = this.k0;
        lcVar.M0.setTranslationY(lcVar.n.getMeasuredHeight() - lcVar.M0.g());
        ra raVar = lcVar.q2;
        if (raVar != null) {
            raVar.run();
            lcVar.q2 = null;
        }
    }

    @Override // ci.w3
    public final void c(boolean z10) {
        if (this.k0.f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 24));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        lc lcVar = this.k0;
        lcVar.L0 = true;
        lcVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        lc lcVar = this.k0;
        if (lcVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (lcVar.n.getMeasuredHeight() - lcVar.M0.g())), 1.0f, 0.0f);
            lcVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            lcVar.r.setAlpha(1.0f - (0.6f * clamp));
            lcVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
