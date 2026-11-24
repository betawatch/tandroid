// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cvb extends ovb {
    public final /* synthetic */ qvb p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvb(qvb qvbVar, Context context) {
        super(qvbVar, context);
        this.p3 = qvbVar;
    }

    @Override // o39
    public final boolean S0() {
        ArrayList arrayList = this.p3.b;
        return (getAdapter() == null || this.W1 || (arrayList == null || arrayList.size() != 1 || arrayList.get(0) == null || ((ivb) arrayList.get(0)).c == null || ((ivb) arrayList.get(0)).c.id != 1 ? getAdapter().b() > 1 : getAdapter().b() > 2)) ? false : true;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.p3.y0();
    }
}
