// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eu0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eu0(he heVar, long j, j5 j5Var, ue7 ue7Var) {
        this.a = (byte) 2;
        this.d = heVar;
        this.b = j;
        this.c = j5Var;
        this.e = ue7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                gm.c3(new r97((ku0) obj3, (he) obj2, tLObject, this.b, (qac) obj));
                break;
            case 1:
                gm.c3(new om1(obj3, (Object) tLObject, obj2, (TLObject) tL_error, obj, this.b, (byte) 2));
                break;
            case 2:
                gm.c3(new r97(obj2, (Object) tLObject, this.b, obj3, obj, (byte) 8));
                break;
            case 3:
                gm.c3(new r97(obj3, (Object) tLObject, this.b, obj2, obj, (byte) 10));
                break;
            case 4:
                oc7 oc7Var = (oc7) obj3;
                int[] iArr = (int[]) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory.offset;
                    long j = this.b;
                    if (i > 0) {
                        oc7Var.e0(j, iArr[0], inputPeer);
                    }
                    oc7Var.R3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    cf7 messagesStorage = oc7Var.getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, j, (byte) 5));
                    break;
                }
                break;
            case 5:
                gm.c3(new om1(obj3, (Object) tLObject, obj2, (TLObject) obj, (Object) tL_error, this.b, (byte) 3));
                break;
            case 6:
                gm.c3(new r97(obj3, (Object) tLObject, obj2, this.b, obj, (byte) 16));
                break;
            default:
                qwb qwbVar = (qwb) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qwbVar.getClass();
                if (tL_error != null) {
                    boolean equals = "PINNED_TOO_MUCH".equals(tL_error.text);
                    long j2 = this.b;
                    if (!equals) {
                        if ("PINNED_TOPIC_NOT_MODIFIED".equals(tL_error.text)) {
                            gm.c3(new vp2((Object) qwbVar, j2, false, (byte) 4));
                            break;
                        }
                    } else if (dVar != null) {
                        qwbVar.a(j2, arrayList, true);
                        gm.c3(new pf2(qwbVar, dVar, (byte) 14));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ eu0(oc7 oc7Var, long j, Object obj, TLObject tLObject, byte b) {
        this.a = b;
        this.c = oc7Var;
        this.b = j;
        this.d = obj;
        this.e = tLObject;
    }

    public /* synthetic */ eu0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ eu0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
