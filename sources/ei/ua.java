package ei;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class ua extends q3 {
    public final /* synthetic */ vb k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(vb vbVar, int i10, Context context, ci.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.k0 = vbVar;
    }

    @Override // ei.q3
    public final void a() {
        vb vbVar = this.k0;
        vbVar.M0.setTranslationY(vbVar.n.getMeasuredHeight() - vbVar.M0.g());
        da daVar = vbVar.q2;
        if (daVar != null) {
            daVar.run();
            vbVar.q2 = null;
        }
    }

    @Override // ei.q3
    public final void c(boolean z10) {
        if (this.k0.f0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 24));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        vb vbVar = this.k0;
        vbVar.L0 = true;
        vbVar.e(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        vb vbVar = this.k0;
        if (vbVar.k2) {
            float clamp = Utilities.clamp(1.0f - (f7 / (vbVar.n.getMeasuredHeight() - vbVar.M0.g())), 1.0f, 0.0f);
            vbVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            vbVar.r.setAlpha(1.0f - (0.6f * clamp));
            vbVar.i0.setAlpha(1.0f - clamp);
        }
    }
}
