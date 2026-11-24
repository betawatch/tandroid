// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dxb extends qxb {
    public final /* synthetic */ sxb p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(sxb sxbVar, Context context) {
        super(sxbVar, context);
        this.p3 = sxbVar;
    }

    @Override // r59
    public final boolean S0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((jxb) arrayList.get(0)).c == null || ((jxb) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p3.z0();
    }
}
