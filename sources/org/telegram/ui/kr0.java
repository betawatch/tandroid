package org.telegram.ui;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kr0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ir0((pr0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new hr((uw0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 26));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ir0((org.telegram.ui.ActionBar.o2) this.b, this.c, tLObject, this.d, 3));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new rx0((ProfileActivity) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 0));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new hr((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, (vy0) this.d, tL_error, 28));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new hr((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error, 29));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ir0((dz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 9));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new rx0((l61) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ir0(this.b, this.c, (Object) tL_error, this.d, 12));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ir0(this.b, this.c, (Object) tL_error, this.d, 11));
                break;
            case 10:
                d91 d91Var = (d91) this.b;
                String str = (String) this.c;
                r91 r91Var = (r91) this.d;
                boolean z10 = true;
                rf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        e91 e91Var = d91Var.r;
                        int i9 = e91Var.i;
                        if (e91Var != d91Var.w.w) {
                            z10 = false;
                        }
                        bVar = s91.d0(jSONObject, i9, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(d91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ir0(d91Var, bVar, str, r91Var, 15));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ir0((nd1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.c2) this.d, 17));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new n21(23, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new ir0((org.telegram.ui.ActionBar.o2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    break;
                }
        }
    }
}
