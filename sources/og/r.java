package og;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r extends n81 {
    public final /* synthetic */ ci.h a;

    public r(ci.h hVar) {
        this.a = hVar;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        ci.h hVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) hVar.d : (z) hVar.c : (t) hVar.b;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
