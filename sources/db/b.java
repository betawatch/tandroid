package db;

import af.h;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements z8.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // z8.d
    public final Object u0(h hVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(hVar.y(cb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) hVar.a(Context.class), (cb.a) arrayList.get(0));
            default:
                return new a((e) hVar.a(e.class), (za.d) hVar.a(za.d.class));
        }
    }
}
