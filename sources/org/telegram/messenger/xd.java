package org.telegram.messenger;

import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xd(int i10, int i11, int i12, long j10, Object obj) {
        this.a = i12;
        this.e = obj;
        this.b = i10;
        this.c = j10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                MediaController mediaController = (MediaController) this.e;
                int i10 = this.b;
                long j10 = this.c;
                int i11 = this.d;
                mediaController.F1 = null;
                if (mediaController.G1) {
                    MediaController.j0(true);
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    mediaController.e1 = tL_document;
                    tL_document.file_reference = new byte[0];
                    tL_document.dc_id = TLObject.FLAG_31;
                    tL_document.id = tz.p();
                    mediaController.e1.user_id = d20.i(i10).e();
                    mediaController.e1.mime_type = "audio/ogg";
                    tz.y();
                    try {
                        e0.h hVar = new e0.h(w0.b, b8.z(1), new me(mediaController));
                        mediaController.E1 = hVar;
                        if (!hVar.h()) {
                            throw new IllegalStateException("Unable to start AudioRecorderV2");
                        }
                        if (v2.a) {
                            f8.b("AudioRecorderV2 selected: account=" + i10 + ", dialog=" + j10 + ", guid=" + i11);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        f8.e("AudioRecorderV2 failed", e);
                        zs.f(mediaController.g1).k(zs.m2, Integer.valueOf(mediaController.f1));
                        mediaController.x(false);
                        return;
                    }
                }
                return;
            case 1:
                hs hsVar = (hs) this.e;
                int i12 = this.b;
                long j11 = this.c;
                int i13 = this.d;
                hsVar.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("UPDATE OR REPLACE widget_state SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    hsVar.b.executeFast("UPDATE OR REPLACE widget_heights SET mid = " + i12 + " WHERE uid = " + j11 + " AND mid = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    hsVar.o(e7, true);
                    return;
                }
            case 2:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                return;
            default:
                th.s0 s0Var = (th.s0) this.e;
                int i14 = this.b;
                long j12 = this.c;
                int i15 = this.d;
                HashMap hashMap = s0Var.F;
                if (i14 == 0) {
                    str = a1.g.l(j12, "");
                } else {
                    str = i14 + "_" + j12 + "_" + i15;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    ConnectionsManager.getInstance(c.a(s0Var.e).a).cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    return;
                }
                return;
        }
    }
}
