// default package

import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class al6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ al6(Object obj, int i, long j, int i2, byte b) {
        this.a = b;
        this.e = obj;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.e;
                int i = this.b;
                long j = this.c;
                int i2 = this.d;
                String[] strArr = MediaController.W1;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.i0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = TLObject.FLAG_31;
                    tL_document.id = gba.p();
                    mediaController.g1.user_id = y6c.h(i).e();
                    mediaController.g1.mime_type = "audio/ogg";
                    gba.x();
                    try {
                        u20 u20Var = new u20(a.b, ba4.z(1), new ml6(mediaController));
                        mediaController.G1 = u20Var;
                        if (!u20Var.g()) {
                            throw new IllegalStateException("Unable to start AudioRecorderV2");
                        }
                        if (w01.a) {
                            fa4.b("AudioRecorderV2 selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fa4.e("AudioRecorderV2 failed", e);
                        kk7.f(mediaController.i1).k(kk7.l2, Integer.valueOf(mediaController.h1));
                        mediaController.s(false);
                        return;
                    }
                }
                return;
            default:
                ad7 ad7Var = (ad7) this.e;
                int i3 = this.b;
                long j2 = this.c;
                int i4 = this.d;
                try {
                    SQLiteDatabase sQLiteDatabase = ad7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i3 + " WHERE uid = " + j2 + " AND mid = " + i4).stepThis().dispose();
                    ad7Var.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i3 + " WHERE uid = " + j2 + " AND mid = " + i4).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    ad7Var.n(e2, true);
                    return;
                }
        }
    }
}
