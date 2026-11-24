// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class htb extends efc {
    public boolean a = false;
    public final /* synthetic */ byte b;
    public final /* synthetic */ itb c;

    /* JADX WARN: Multi-variable type inference failed */
    public htb(itb itbVar, int i) {
        this.c = itbVar;
        this.b = i;
    }

    @Override // efc, dfc
    public final void a() {
        this.a = true;
    }

    @Override // efc, dfc
    public final void b() {
        this.c.a.setVisibility(0);
    }

    @Override // dfc
    public final void c() {
        if (this.a) {
            return;
        }
        this.c.a.setVisibility(this.b);
    }
}
