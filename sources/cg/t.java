package cg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c81;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t extends c81 {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        u uVar = this.a;
        return i10 != 1 ? i10 != 2 ? (x) uVar.b : (d0) uVar.d : (w) uVar.c;
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.c81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
    }
}
