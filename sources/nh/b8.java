package nh;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.et;
import org.telegram.ui.ji0;
import org.telegram.ui.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b8(int i10, ji0 ji0Var, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 6;
        this.b = i10;
        this.c = ji0Var;
        this.d = p2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                kf.i0 i0Var = (kf.i0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.b).requestReference(obj3, tL_messages_getAttachedStickers, i0Var);
                    break;
                } else {
                    i0Var.run(tLObject, tL_error);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new kf.j0((p70) obj3, (org.telegram.ui.l4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.g1) obj));
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(d2Var, 0));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new dg.f3(sharedPreferences, (TLRPC.TL_help_support) tLObject, d2Var, this.b, p2Var, 17));
                    break;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new dg.f3((ds) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, 18));
                break;
            case 4:
                yu0 yu0Var = (yu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new js((org.telegram.ui.ActionBar.d2[]) obj2, 2));
                int i11 = this.b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new cg.v1(yu0Var, i11, tL_error, tL_messages_editMessage, 24));
                    break;
                } else {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 5:
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new dg.f3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.d2) obj, 20), 2L);
                break;
            case 6:
                ji0 ji0Var = (ji0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z4 = tLObject instanceof TLRPC.Updates;
                int i12 = this.b;
                if (!z4) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new et(i12, tL_error, p2Var2, tL_payments_assignPlayMarketTransaction, 9));
                        break;
                    }
                } else {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ji0Var);
                    break;
                }
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new kf.j0((org.telegram.ui.web.c1) obj3, tLObject, this.b, (org.telegram.ui.web.y0) obj2, (j7) obj, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new dg.f3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.b, (TL_account.updateEmojiStatus) obj, 26));
                break;
        }
    }

    public /* synthetic */ b8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ b8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }
}
