package gg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Location d;

    public /* synthetic */ a(c cVar, String str, Location location, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = str;
        this.d = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c cVar = this.b;
                cVar.getClass();
                AndroidUtilities.runOnUIThread(new a(cVar, this.c, this.d, 1));
                break;
            default:
                c cVar2 = this.b;
                cVar2.E = null;
                cVar2.v = null;
                cVar2.H(this.c, this.d, true);
                break;
        }
    }
}
