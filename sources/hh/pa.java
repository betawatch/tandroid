package hh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class pa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb b;

    public /* synthetic */ pa(jb jbVar, int i10) {
        this.a = i10;
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jb jbVar = this.b;
                jbVar.N = true;
                jbVar.p(null);
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
