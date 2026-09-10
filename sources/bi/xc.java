package bi;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class xc extends p4 {
    public final /* synthetic */ ce k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(ce ceVar, int i10, Context context, zh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = ceVar;
    }

    @Override // bi.p4
    public final void a() {
        ce ceVar = this.k0;
        ceVar.M0.setTranslationY(ceVar.n.getMeasuredHeight() - ceVar.M0.g());
        dc dcVar = ceVar.q2;
        if (dcVar != null) {
            dcVar.run();
            ceVar.q2 = null;
        }
    }

    @Override // bi.p4
    public final void c(boolean z10) {
        if (this.k0.f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new wc(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        ce ceVar = this.k0;
        ceVar.L0 = true;
        ceVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ce ceVar = this.k0;
        if (ceVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (ceVar.n.getMeasuredHeight() - ceVar.M0.g())), 1.0f, 0.0f);
            ceVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            ceVar.r.setAlpha(1.0f - (0.6f * clamp));
            ceVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
