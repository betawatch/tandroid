package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeByteBuffer b;
    public final /* synthetic */ AsyncTask c;

    public /* synthetic */ j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i10) {
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
