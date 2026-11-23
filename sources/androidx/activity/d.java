package androidx.activity;

import gb.i1;
import java.util.UUID;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements rd.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((l) this.b).reportFullyDrawn();
                return null;
            case 1:
                ((i1) this.b).getClass();
                UUID randomUUID = UUID.randomUUID();
                kotlin.jvm.internal.j.d(randomUUID, "randomUUID(...)");
                String uuid = randomUUID.toString();
                kotlin.jvm.internal.j.d(uuid, "toString(...)");
                return uuid;
            default:
                ((hb.a) this.b).a.await();
                return gd.k.a;
        }
    }
}
