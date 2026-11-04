package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeByteBuffer b;
    public final /* synthetic */ AsyncTask c;

    public /* synthetic */ j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i3) {
        this.a = i3;
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
