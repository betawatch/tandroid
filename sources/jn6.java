// default package

import android.net.Uri;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class jn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ jn6(qac qacVar, Uri uri, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                qacVar.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                qacVar.a(uri);
                break;
        }
    }
}
