package fg;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x0(l1 l1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.c = l1Var;
        this.d = str;
        this.b = z10;
        this.g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((l1) this.c, (String) this.d, this.b, tLObject, (TLRPC.User) this.g, (String) this.e, (MessagesStorage) this.h, (String) this.f));
                break;
            default:
                ((SendMessagesHelper) this.c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f, (ArrayList) this.g, (SendMessagesHelper.DelayedMessage) this.h, this.b, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = delayedMessage;
        this.b = z10;
    }
}
