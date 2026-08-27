package lh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class sa extends p3 {
    public final /* synthetic */ sb g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(sb sbVar, int i10, Context context, jh.b bVar, MediaController.AlbumEntry albumEntry, boolean z10, boolean z11, boolean z12) {
        super(i10, context, bVar, albumEntry, z10, 1.39f, z11, z12);
        this.g0 = sbVar;
    }

    @Override // lh.p3
    public final void a() {
        sb sbVar = this.g0;
        sbVar.I0.setTranslationY(sbVar.n.getMeasuredHeight() - sbVar.I0.g());
        ca caVar = sbVar.m2;
        if (caVar != null) {
            caVar.run();
            sbVar.m2 = null;
        }
    }

    @Override // lh.p3
    public final void c(boolean z10) {
        if (this.g0.b0 == 0 && z10) {
            AndroidUtilities.runOnUIThread(new kh.c(this, 21));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        sb sbVar = this.g0;
        sbVar.H0 = true;
        sbVar.f(false);
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sb sbVar = this.g0;
        if (sbVar.g2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (sbVar.n.getMeasuredHeight() - sbVar.I0.g())), 1.0f, 0.0f);
            sbVar.r.b(AndroidUtilities.dp(-32.0f) * clamp);
            sbVar.r.setAlpha(1.0f - (0.6f * clamp));
            sbVar.e0.setAlpha(1.0f - clamp);
        }
    }
}
