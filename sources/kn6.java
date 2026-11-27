// default package

import android.net.Uri;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class kn6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ kn6(pcc pccVar, Uri uri, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                pccVar.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                pccVar.a(uri);
                break;
        }
    }
}
