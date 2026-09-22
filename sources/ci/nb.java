package ci;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class nb extends x3 {
    public final /* synthetic */ oc k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(oc ocVar, int i10, Context context, ai.d dVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, dVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = ocVar;
    }

    @Override // ci.x3
    public final void a() {
        oc ocVar = this.k0;
        ocVar.M0.setTranslationY(ocVar.n.getMeasuredHeight() - ocVar.M0.g());
        ua uaVar = ocVar.q2;
        if (uaVar != null) {
            uaVar.run();
            ocVar.q2 = null;
        }
    }

    @Override // ci.x3
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
        oc ocVar = this.k0;
        ocVar.L0 = true;
        ocVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        oc ocVar = this.k0;
        if (ocVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (ocVar.n.getMeasuredHeight() - ocVar.M0.g())), 1.0f, 0.0f);
            ocVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            ocVar.r.setAlpha(1.0f - (0.6f * clamp));
            ocVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
