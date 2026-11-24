// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class hpc implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ npc b;

    public /* synthetic */ hpc(npc npcVar, byte b) {
        this.a = b;
        this.b = npcVar;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        npc npcVar = this.b;
        switch (b) {
            case 0:
                npcVar.c.setScaleX(f);
                npcVar.c.setScaleY(f);
                break;
            default:
                npcVar.Q = f2;
                break;
        }
    }
}
