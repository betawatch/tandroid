// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ezb extends rzb {
    public final /* synthetic */ tzb p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(tzb tzbVar, Context context) {
        super(tzbVar, context);
        this.p3 = tzbVar;
    }

    @Override // d79
    public final boolean T0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((kzb) arrayList.get(0)).c == null || ((kzb) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p3.z0();
    }
}
