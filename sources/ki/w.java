package ki;

import org.telegram.ui.ActionBar.t4;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w extends t4 {
    public final /* synthetic */ z p;

    public w(z zVar) {
        this.p = zVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.p.invalidate();
    }
}
