package org.telegram.tgnet;

import android.os.AsyncTask;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NativeByteBuffer b;
    public final /* synthetic */ AsyncTask c;

    public /* synthetic */ b(AsyncTask asyncTask, NativeByteBuffer nativeByteBuffer, byte b) {
        this.a = b;
        this.c = asyncTask;
        this.b = nativeByteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        NativeByteBuffer nativeByteBuffer = this.b;
        AsyncTask asyncTask = this.c;
        switch (b) {
            case 0:
                ((ConnectionsManager.GoogleDnsLoadTask) asyncTask).lambda$onPostExecute$1(nativeByteBuffer);
                break;
            default:
                ((ConnectionsManager.MozillaDnsLoadTask) asyncTask).lambda$onPostExecute$1(nativeByteBuffer);
                break;
        }
    }
}
