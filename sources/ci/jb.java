package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class jb extends w3 {
    public final /* synthetic */ kc k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(kc kcVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = kcVar;
    }

    @Override // ci.w3
    public final void a() {
        kc kcVar = this.k0;
        kcVar.M0.setTranslationY(kcVar.n.getMeasuredHeight() - kcVar.M0.g());
        qa qaVar = kcVar.q2;
        if (qaVar != null) {
            qaVar.run();
            kcVar.q2 = null;
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
        kc kcVar = this.k0;
        kcVar.L0 = true;
        kcVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        kc kcVar = this.k0;
        if (kcVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (kcVar.n.getMeasuredHeight() - kcVar.M0.g())), 1.0f, 0.0f);
            kcVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            kcVar.r.setAlpha(1.0f - (0.6f * clamp));
            kcVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
