package fi;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cz;
import org.telegram.messenger.k10;
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import org.telegram.messenger.ur;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z0(int i7, int i10, int i11, long j3, Object obj) {
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
                c1 c1Var = (c1) this.e;
                int i7 = this.b;
                long j3 = this.c;
                int i10 = this.d;
                HashMap hashMap = c1Var.G;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(c1Var.e).a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
            case 1:
                MediaController mediaController = (MediaController) this.e;
                int i11 = this.b;
                long j10 = this.c;
                int i12 = this.d;
                mediaController.H1 = null;
                if (mediaController.I1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.g1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = TLObject.FLAG_31;
                    tL_document.id = cz.p();
                    mediaController.g1.user_id = k10.i(i11).e();
                    mediaController.g1.mime_type = "audio/ogg";
                    cz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.b, org.telegram.messenger.w7.z(1), new le(mediaController));
                        mediaController.G1 = gVar;
                        if (!gVar.h()) {
                            throw new IllegalStateException("Unable to start AudioRecorderV2");
                        }
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("AudioRecorderV2 selected: account=" + i11 + ", dialog=" + j10 + ", guid=" + i12);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.e("AudioRecorderV2 failed", e10);
                        ls.f(mediaController.i1).k(ls.m2, Integer.valueOf(mediaController.h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                ur urVar = (ur) this.e;
                int i13 = this.b;
                long j11 = this.c;
                int i14 = this.d;
                urVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = urVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    urVar.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    urVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                return;
        }
    }
}
