package ag;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u extends q71 {
    public final /* synthetic */ v a;

    public u(v vVar) {
        this.a = vVar;
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        v vVar = this.a;
        return i10 != 1 ? i10 != 2 ? (y) vVar.b : (e0) vVar.d : (x) vVar.c;
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
    }
}
