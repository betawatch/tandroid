package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeByteBuffer b;
    public final /* synthetic */ AsyncTask c;

    public /* synthetic */ j(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, int i7) {
        this.a = i7;
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
