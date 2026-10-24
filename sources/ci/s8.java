package ci;

import ai.db;
import ai.tb;
import ai.vb;
import ai.wb;
import android.content.SharedPreferences;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f70;
import org.telegram.ui.fi0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s8(int i10, fi0 fi0Var, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i10;
        this.c = fi0Var;
        this.d = o2Var;
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
                tb tbVar = (tb) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, tbVar);
                    break;
                } else {
                    tbVar.run(tLObject, tL_error);
                    break;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new vb(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new wb((f70) obj3, (org.telegram.ui.i4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.e1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(c2Var, i12));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new vb((Object) sharedPreferences, tLObject, (Object) c2Var, this.b, (Object) o2Var, 22));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new vb(obj3, tLObject, obj2, this.b, obj, 23));
                break;
            case 5:
                xv0 xv0Var = (xv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new vs((org.telegram.ui.ActionBar.c2[]) obj2, 2));
                int i13 = this.b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new db(xv0Var, i13, tL_error, tL_messages_editMessage, 28));
                    break;
                } else {
                    MessagesController.getInstance(i13).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new vb(obj3, tLObject, obj2, this.b, obj, 25), 2L);
                break;
            case 7:
                fi0 fi0Var = (fi0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new fz0(i11, tL_error, o2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(fi0Var);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new wb((org.telegram.ui.web.b1) obj3, tLObject, this.b, (org.telegram.ui.web.y0) obj2, (y7) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ s8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ s8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }
}
