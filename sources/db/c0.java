package db;

import android.content.Context;
import android.os.Process;
import b8.hb;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 {
    public final Context a;
    public final dd.i b;
    public final int c;
    public final dd.i d;
    public final dd.i e;
    public boolean f;

    public c0(Context appContext, j1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.a = appContext;
        final int i3 = 0;
        this.b = hb.b(new od.a(this) { // from class: db.b0
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // od.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((e0) this.b.e.getValue()).a;
                    default:
                        return f0.b(this.b.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = hb.b(new androidx.activity.d(uuidGenerator, 1));
        final int i10 = 1;
        this.e = hb.b(new od.a(this) { // from class: db.b0
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // od.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ((e0) this.b.e.getValue()).a;
                    default:
                        return f0.b(this.b.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        dd.i iVar = this.d;
        if (map == null) {
            return ed.s.c(new dd.e(a(), new a0(Process.myPid(), (String) iVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new a0(Process.myPid(), (String) iVar.getValue()));
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : ed.s.g(linkedHashMap) : ed.p.a;
    }
}
