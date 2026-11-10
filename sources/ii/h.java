package ii;

import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(p pVar, long j3, int i7) {
        this.a = i7;
        this.b = pVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p.c0(this.b, this.c);
                break;
            default:
                p pVar = this.b;
                pVar.getClass();
                pVar.presentFragment(cn.ta(this.c));
                break;
        }
    }
}
