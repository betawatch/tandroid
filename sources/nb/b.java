package nb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements r9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object K(bh.d dVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(dVar.J(mb.a.class));
                l.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) dVar.b(Context.class), (mb.a) arrayList.get(0));
            default:
                return new a((e) dVar.b(e.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
