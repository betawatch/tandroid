// default package

import android.net.Uri;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
