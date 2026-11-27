// default package

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class bb7 implements RequestDelegate {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bb7(uc7 uc7Var, long j, int i, int i2, long j2, boolean z, gn1 gn1Var) {
        this.b = uc7Var;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = j2;
        this.g = z;
        this.h = gn1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                long j = this.c;
                if (j != 0) {
                    uc7Var.getMessagesStorage().r1(j);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j2 = this.f;
                    if (i > 0) {
                        uc7Var.W(j2, 0, this.d, this.e, this.g, inputPeer, 0L);
                    }
                    uc7Var.W3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    kf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new me7(messagesStorage, j2, (byte) 4));
                    break;
                }
                break;
            case 1:
                uc7 uc7Var2 = (uc7) obj2;
                gn1 gn1Var = (gn1) obj;
                if (tL_error != null) {
                    hl.c3(new z96(gn1Var, (byte) 28));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    uc7Var2.W3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    uc7Var2.getMessagesStorage().a.c(new jb7(uc7Var2, this.c, this.d, this.e, this.f, tL_messages_affectedHistory2, this.g, gn1Var));
                    break;
                }
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.c, this.f, this.e, this.g, (Context) obj2, (String) obj, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ bb7(uc7 uc7Var, long j, long j2, int i, int i2, boolean z, TLRPC.InputPeer inputPeer) {
        this.b = uc7Var;
        this.c = j;
        this.f = j2;
        this.d = i;
        this.e = i2;
        this.g = z;
        this.h = inputPeer;
    }

    public /* synthetic */ bb7(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        this.d = i;
        this.c = j;
        this.f = j2;
        this.e = i2;
        this.g = z;
        this.b = context;
        this.h = str;
    }
}
