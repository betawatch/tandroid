package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeByteBuffer b;
    public final /* synthetic */ AsyncTask c;

    public /* synthetic */ k(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
        this.a = i10;
        this.c = asyncTask;
        this.b = nativeByteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) this.c).lambda$onPostExecute$1(this.b);
                break;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) this.c).lambda$onPostExecute$1(this.b);
                break;
        }
    }
}
