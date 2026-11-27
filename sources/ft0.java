// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ft0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ft0(id idVar, long j, k5 k5Var, bf7 bf7Var) {
        this.a = (byte) 2;
        this.d = idVar;
        this.b = j;
        this.c = k5Var;
        this.e = bf7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hl.c3(new da7((kt0) obj3, (id) obj2, tLObject, this.b, (pcc) obj));
                break;
            case 1:
                hl.c3(new nm1(obj3, (Object) tLObject, obj2, (TLObject) tL_error, obj, this.b, (byte) 2));
                break;
            case 2:
                hl.c3(new da7(obj2, (Object) tLObject, this.b, obj3, obj, (byte) 8));
                break;
            case 3:
                hl.c3(new da7(obj3, (Object) tLObject, this.b, obj2, obj, (byte) 11));
                break;
            case 4:
                uc7 uc7Var = (uc7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        uc7Var.g0(j, iArr[0], inputPeer);
                    }
                    uc7Var.W3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    jf7 messagesStorage = uc7Var.getMessagesStorage();
                    messagesStorage.a.c(new le7(messagesStorage, j, (byte) 4));
                    break;
                }
                break;
            case 5:
                hl.c3(new nm1(obj3, (Object) tLObject, obj2, (TLObject) obj, (Object) tL_error, this.b, (byte) 3));
                break;
            case 6:
                hl.c3(new da7(obj3, (Object) tLObject, obj2, this.b, obj, (byte) 17));
                break;
            default:
                qyb qybVar = (qyb) obj3;
                e eVar = (e) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qybVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            hl.c3(new dp2((Object) qybVar, j2, false, (byte) 4));
                            break;
                        }
                    } else if (eVar != null) {
                        qybVar.a(j2, arrayList, true);
                        hl.c3(new ve2(qybVar, eVar, (byte) 14));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ft0(uc7 uc7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = uc7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public /* synthetic */ ft0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ ft0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
