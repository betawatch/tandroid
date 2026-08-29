package eb;

import a5.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements a9.e {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // a9.e
    public final Object I0(j jVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.r(db.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) jVar.a(Context.class), (db.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (ab.d) jVar.a(ab.d.class));
        }
    }
}
