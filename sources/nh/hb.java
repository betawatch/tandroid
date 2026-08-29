package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb b;

    public /* synthetic */ hb(qb qbVar, int i10) {
        this.a = i10;
        this.b = qbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qb qbVar = this.b;
                ob obVar = qbVar.I;
                if (obVar != null) {
                    long j10 = obVar.a;
                    if (j10 > 0) {
                        qbVar.D = j10;
                        break;
                    }
                }
                break;
            case 1:
                kb kbVar = this.b.a;
                if (kbVar != null) {
                    kbVar.y1();
                    break;
                }
                break;
            default:
                kb kbVar2 = this.b.a;
                if (kbVar2 != null) {
                    kbVar2.a0();
                    break;
                }
                break;
        }
    }
}
