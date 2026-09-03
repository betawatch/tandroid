package af;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j {
    public final ArrayList a;

    public j(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final i a(int i10) {
        return (i) this.a.get(i10);
    }

    public j(i iVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(iVar);
    }
}
