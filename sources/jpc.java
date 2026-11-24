// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class jpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ npc b;

    public /* synthetic */ jpc(npc npcVar, byte b) {
        this.a = b;
        this.b = npcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        npc npcVar = this.b;
        switch (b) {
            case 0:
                npcVar.i();
                break;
            default:
                Runnable runnable = npcVar.d0;
                npcVar.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
