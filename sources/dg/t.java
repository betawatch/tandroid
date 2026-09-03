package dg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d81;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t extends d81 {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    @Override // org.telegram.ui.Components.d81
    public final View d(int i10) {
        u uVar = this.a;
        return i10 != 1 ? i10 != 2 ? (x) uVar.b : (d0) uVar.d : (w) uVar.c;
    }

    @Override // org.telegram.ui.Components.d81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.d81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.d81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.d81
    public final void b(View view, int i10, int i11) {
    }
}
