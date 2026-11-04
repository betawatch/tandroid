package ei;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.ge;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d1(int i3, int i10, int i11, long j10, Object obj) {
        this.a = i11;
        this.e = obj;
        this.b = i3;
        this.c = j10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.e;
                int i3 = this.b;
                long j10 = this.c;
                int i10 = this.d;
                HashMap hashMap = g1Var.G;
                if (i3 == 0) {
                    str = a1.g.p(j10, "");
                } else {
                    str = i3 + "_" + j10 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(g1Var.e).a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.e;
                int i11 = this.b;
                long j11 = this.c;
                int i12 = this.d;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = TLObject.FLAG_31;
                    tL_document.id = az.p();
                    mediaController.g1.user_id = h10.i(i11).e();
                    mediaController.g1.mime_type = "audio/ogg";
                    az.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.b, org.telegram.messenger.w7.z(1), new ge(mediaController));
                        mediaController.G1 = gVar;
                        if (!gVar.h()) {
                            throw new IllegalStateException("Unable to start AudioRecorderV2");
                        }
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j11 + ", guid=" + i12);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        hs.f(mediaController.i1).k(hs.m2, Integer.valueOf(mediaController.h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                qr qrVar = (qr) this.e;
                int i13 = this.b;
                long j12 = this.c;
                int i14 = this.d;
                qrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = qrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j12 + " AND mid = " + i14).stepThis().dispose();
                    qrVar.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j12 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    qrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                return;
        }
    }
}
