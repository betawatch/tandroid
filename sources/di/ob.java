package di;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class ob extends x3 {
    public final /* synthetic */ pc k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(pc pcVar, int i10, Context context, bi.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = pcVar;
    }

    @Override // di.x3
    public final void a() {
        pc pcVar = this.k0;
        pcVar.M0.setTranslationY(pcVar.n.getMeasuredHeight() - pcVar.M0.g());
        ua uaVar = pcVar.q2;
        if (uaVar != null) {
            uaVar.run();
            pcVar.q2 = null;
        }
    }

    @Override // di.x3
    public final void c(boolean z10) {
        if (this.k0.f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new nb(this, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        pc pcVar = this.k0;
        pcVar.L0 = true;
        pcVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        pc pcVar = this.k0;
        if (pcVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (pcVar.n.getMeasuredHeight() - pcVar.M0.g())), 1.0f, 0.0f);
            pcVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            pcVar.r.setAlpha(1.0f - (0.6f * clamp));
            pcVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
