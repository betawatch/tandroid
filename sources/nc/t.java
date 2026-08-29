package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // nc.b2
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d == '!') {
            lVar.g("<!");
            lVar.c = b2.E;
        } else if (d == '/') {
            lVar.e();
            lVar.c = b2.C;
        } else {
            lVar.g("<");
            aVar.q();
            lVar.c = b2.f;
        }
    }
}
