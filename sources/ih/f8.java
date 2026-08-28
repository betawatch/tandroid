package ih;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a70;
import org.telegram.ui.ai0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f8(int i9, ai0 ai0Var, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i9;
        this.c = ai0Var;
        this.d = o2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        int i10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i9) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ff.j0 j0Var = (ff.j0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i10).requestReference(obj3, tL_messages_getAttachedStickers, j0Var);
                    break;
                } else {
                    j0Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new fh.g1(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ff.k0((a70) obj3, (org.telegram.ui.j4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.f1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(c2Var, 0));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new fh.g1(sharedPreferences, (TLRPC.TL_help_support) tLObject, c2Var, this.b, o2Var, 20));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new fh.g1((wr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, 21));
                break;
            case 5:
                eu0 eu0Var = (eu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new cs((org.telegram.ui.ActionBar.c2[]) obj2, 2));
                int i11 = this.b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new c3.d(eu0Var, i11, tL_error, tL_messages_editMessage, 25));
                    break;
                } else {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new fh.g1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.c2) obj, 23), 2L);
                break;
            case 7:
                ai0 ai0Var = (ai0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new y01(i10, tL_error, o2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ai0Var);
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new ff.k0((org.telegram.ui.web.y0) obj3, (String) obj2, tLObject, tL_error, this.b, (org.telegram.ui.web.v0) obj));
                break;
        }
    }

    public /* synthetic */ f8(Object obj, int i9, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, ff.j0 j0Var) {
        this.a = 0;
        this.c = obj;
        this.b = i9;
        this.d = tL_messages_getAttachedStickers;
        this.e = j0Var;
    }

    public /* synthetic */ f8(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
        this.e = obj3;
    }
}
