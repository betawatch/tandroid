package bi;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
        this.e = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a0((m0) this.c, (org.telegram.ui.ActionBar.e2) this.d, tLObject, this.b, (Utilities.Callback) this.e, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((h7) this.c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.b));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a0((ca) this.c, tLObject, (MessageObject) this.d, this.b, (Runnable) this.e));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new a0((org.telegram.ui.ActionBar.e2) this.d, tLObject, this.b, (AccountInstance) this.c, (MessagesStorage.BooleanCallback) this.e));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m3((org.telegram.ui.ActionBar.r2) this.c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.b));
                break;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    public /* synthetic */ e0(org.telegram.ui.ActionBar.e2 e2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.a = 3;
        this.d = e2Var;
        this.b = j10;
        this.c = accountInstance;
        this.e = booleanCallback;
    }
}
