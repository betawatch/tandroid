package m4;

import android.net.Uri;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        b bVar = this.b;
        switch (i10) {
            case 0:
                bVar.a.unregisterReceiver(bVar.d);
                break;
            case 1:
                b.a(bVar);
                break;
            default:
                Uri uri = b.g;
                bVar.b();
                break;
        }
    }
}
