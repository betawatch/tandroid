package fi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class qa extends o3 {
    public final /* synthetic */ sb k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(sb sbVar, int i10, Context context, di.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = sbVar;
    }

    @Override // fi.o3
    public final void a() {
        sb sbVar = this.k0;
        sbVar.M0.setTranslationY(sbVar.n.getMeasuredHeight() - sbVar.M0.g());
        z9 z9Var = sbVar.q2;
        if (z9Var != null) {
            z9Var.run();
            sbVar.q2 = null;
        }
    }

    @Override // fi.o3
    public final void c(boolean z10) {
        if (this.k0.f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new di.s8(this, 28));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        sb sbVar = this.k0;
        sbVar.L0 = true;
        sbVar.e(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sb sbVar = this.k0;
        if (sbVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (sbVar.n.getMeasuredHeight() - sbVar.M0.g())), 1.0f, 0.0f);
            sbVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            sbVar.r.setAlpha(1.0f - (0.6f * clamp));
            sbVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
