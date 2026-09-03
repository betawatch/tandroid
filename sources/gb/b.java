package gb;

import android.content.Context;
import b6.m;
import c5.j;
import c9.f;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements f {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // c9.f
    public final Object d0(j jVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(jVar.x(fb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) jVar.a(Context.class), (fb.a) arrayList.get(0));
            default:
                return new a((e) jVar.a(e.class), (cb.d) jVar.a(cb.d.class));
        }
    }
}
