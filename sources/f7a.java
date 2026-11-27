// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f7a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_initHistoryImport a;
    public final /* synthetic */ i7a b;

    public f7a(i7a i7aVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = i7aVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new vp8((Object) this, (Object) tLObject, (Object) this.a, (Object) tL_error, (byte) 17));
    }
}
