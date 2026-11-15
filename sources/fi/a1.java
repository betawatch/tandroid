package fi;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gz;
import org.telegram.messenger.le;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a1(int i7, int i10, int i11, long j3, Object obj) {
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
                e1 e1Var = (e1) this.e;
                int i7 = this.b;
                long j3 = this.c;
                int i10 = this.d;
                HashMap hashMap = e1Var.G;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(e1Var.e).a).cancelRequest(num.intValue(), true);
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
                    tL_document.id = gz.p();
                    mediaController.g1.user_id = m10.i(i11).e();
                    mediaController.g1.mime_type = "audio/ogg";
                    gz.y();
                    try {
                        e0.g gVar = new e0.g(org.telegram.messenger.t0.b, org.telegram.messenger.w7.z(1), new le(mediaController));
                        mediaController.G1 = gVar;
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
                        ns.f(mediaController.i1).k(ns.m2, Integer.valueOf(mediaController.h1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 2:
                vr vrVar = (vr) this.e;
                int i13 = this.b;
                long j11 = this.c;
                int i14 = this.d;
                vrVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = vrVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    vrVar.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i13 + " WHERE uid = " + j11 + " AND mid = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    vrVar.o(e11, true);
                    return;
                }
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                return;
        }
    }
}
