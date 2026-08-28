package kh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class va extends q3 {
    public final /* synthetic */ wb g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(wb wbVar, int i9, Context context, ih.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i9, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.g0 = wbVar;
    }

    @Override // kh.q3
    public final void a() {
        wb wbVar = this.g0;
        wbVar.I0.setTranslationY(wbVar.n.getMeasuredHeight() - wbVar.I0.g());
        fa faVar = wbVar.m2;
        if (faVar != null) {
            faVar.run();
            wbVar.m2 = null;
        }
    }

    @Override // kh.q3
    public final void c(boolean z10) {
        if (this.g0.b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new f1(this, 14));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        wb wbVar = this.g0;
        wbVar.H0 = true;
        wbVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        wb wbVar = this.g0;
        if (wbVar.g2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (wbVar.n.getMeasuredHeight() - wbVar.I0.g())), 1.0f, 0.0f);
            wbVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            wbVar.r.setAlpha(1.0f - (0.6f * clamp));
            wbVar.e0.setAlpha(1.0f - clamp);
        }
    }
}
