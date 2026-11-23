package ki;

import org.telegram.ui.ActionBar.s4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v extends s4 {
    public final /* synthetic */ y p;

    public v(y yVar) {
        this.p = yVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
