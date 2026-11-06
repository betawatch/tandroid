package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
