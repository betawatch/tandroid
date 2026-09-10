package bi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ ai.b c;

    public /* synthetic */ h3(m3 m3Var, ai.b bVar, int i10) {
        this.a = i10;
        this.b = m3Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.getClass();
                AndroidUtilities.runOnUIThread(new h3(m3Var, this.c, 1), 320L);
                break;
            default:
                m3 m3Var2 = this.b;
                m3Var2.getClass();
                this.c.run(new ai.b(m3Var2, 4));
                break;
        }
    }
}
