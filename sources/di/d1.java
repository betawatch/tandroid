package di;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.iz;
import org.telegram.messenger.me;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d1(int i7, int i10, int i11, long j3, Object obj) {
        this.a = i11;
        this.e = obj;
        this.b = i7;
        this.c = j3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.e;
                int i7 = this.b;
                long j3 = this.c;
                int i10 = this.d;
                HashMap hashMap = g1Var.F;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
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
                long j10 = this.c;
                int i12 = this.d;
                mediaController.G1 = null;
                if (mediaController.H1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.f1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = TLObject.FLAG_31;
                    tL_document.id = iz.p();
                    mediaController.f1.user_id = p10.i(i11).e();
                    mediaController.f1.mime_type = "audio/ogg";
                    iz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.b, org.telegram.messenger.w7.z(1), new me(mediaController));
                        mediaController.F1 = gVar;
                        if (!gVar.h()) {
                            throw new IllegalStateException("Unable to start AudioRecorderV2");
                        }
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j10 + ", guid=" + i12);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        qs.f(mediaController.h1).k(qs.m2, Integer.valueOf(mediaController.g1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                yr yrVar = (yr) this.e;
                int i13 = this.b;
                long j11 = this.c;
                int i14 = this.d;
                yrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    yrVar.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    yrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                return;
        }
    }
}
