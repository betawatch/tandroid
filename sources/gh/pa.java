package gh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb b;

    public /* synthetic */ pa(jb jbVar, int i9) {
        this.a = i9;
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jb jbVar = this.b;
                jbVar.N = true;
                jbVar.o(null);
                AndroidUtilities.runOnUIThread(new pa(jbVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                va vaVar = this.b.r;
                vaVar.B = false;
                vaVar.invalidate();
                break;
        }
    }
}
