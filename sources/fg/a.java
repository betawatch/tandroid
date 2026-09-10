package fg;

import android.location.Location;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
