// default package

import android.net.Uri;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hl6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ hl6(p8c p8cVar, Uri uri, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                p8cVar.a(uri);
                break;
            default:
                String[] strArr2 = MediaController.W1;
                p8cVar.a(uri);
                break;
        }
    }
}
