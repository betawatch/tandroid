package db;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class l extends i {
    public final fb.m a = new fb.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof l) && ((l) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void o(String str, i iVar) {
        if (iVar == null) {
            iVar = k.a;
        }
        this.a.put(str, iVar);
    }
}
