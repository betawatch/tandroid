package gb;

import a8.bb;
import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d0 {
    public final Context a;
    public final gd.i b;
    public final int c;
    public final gd.i d;
    public final gd.i e;
    public boolean f;

    public d0(Context appContext, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.a = appContext;
        final int i7 = 0;
        this.b = bb.b(new rd.a(this) { // from class: gb.c0
            public final /* synthetic */ d0 b;

            {
                this.b = this;
            }

            @Override // rd.a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ((e0) this.b.e.getValue()).a;
                    default:
                        return f0.b(this.b.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = bb.b(new androidx.activity.d(uuidGenerator, 1));
        final int i10 = 1;
        this.e = bb.b(new rd.a(this) { // from class: gb.c0
            public final /* synthetic */ d0 b;

            {
                this.b = this;
            }

            @Override // rd.a
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
        gd.i iVar = this.d;
        if (map == null) {
            return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new b0(Process.myPid(), (String) iVar.getValue()));
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? new LinkedHashMap(linkedHashMap) : hd.r.g(linkedHashMap) : hd.o.a;
    }
}
