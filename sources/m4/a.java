package m4;

import android.net.Uri;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
