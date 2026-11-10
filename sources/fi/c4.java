package fi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;
    public final /* synthetic */ tg.r1 c;

    public /* synthetic */ c4(o5 o5Var, tg.r1 r1Var, int i7) {
        this.a = i7;
        this.b = o5Var;
        this.c = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0(this.c, true);
                break;
            default:
                this.b.z0(this.c);
                break;
        }
    }
}
