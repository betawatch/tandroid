package di;

import android.content.SharedPreferences;
import bi.sb;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.h70;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q8(int i10, ci0 ci0Var, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i10;
        this.c = ci0Var;
        this.d = r2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ag.p0 p0Var = (ag.p0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, p0Var);
                    break;
                } else {
                    p0Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new sb(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.q0((h70) obj3, (org.telegram.ui.h4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.c1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(e2Var, i12));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new sb((Object) sharedPreferences, tLObject, (Object) e2Var, this.b, (Object) r2Var, 22));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new sb(obj3, tLObject, obj2, this.b, obj, 23));
                break;
            case 5:
                aw0 aw0Var = (aw0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new xs((org.telegram.ui.ActionBar.e2[]) obj2, 2));
                int i13 = this.b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ai.h1(aw0Var, i13, tL_error, tL_messages_editMessage, 28));
                    break;
                } else {
                    MessagesController.getInstance(i13).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new sb(obj3, tLObject, obj2, this.b, obj, 25), 2L);
                break;
            case 7:
                ci0 ci0Var = (ci0) obj3;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new zr0(i11, tL_error, r2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    MessagesController.getInstance(i11).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ci0Var);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new ag.q0((org.telegram.ui.web.a1) obj3, tLObject, this.b, (org.telegram.ui.web.x0) obj2, (x7) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ q8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }
}
