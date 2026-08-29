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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jr0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n20((or0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 24));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((tw0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new n20((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 27));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, (vy0) this.d, tL_error, 27));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error, 28));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new lx0((dz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 3));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a01((n61) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new lx0(this.b, this.c, tL_error, this.d, 6));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new lx0(this.b, this.c, tL_error, this.d, 5));
                break;
            case 10:
                e91 e91Var = (e91) this.b;
                String str = (String) this.c;
                s91 s91Var = (s91) this.d;
                boolean z10 = true;
                uf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        f91 f91Var = e91Var.r;
                        int i10 = f91Var.i;
                        if (f91Var != e91Var.w.w) {
                            z10 = false;
                        }
                        bVar = t91.e0(jSONObject, i10, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(e91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new lx0(e91Var, bVar, str, s91Var, 9));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new lx0((pd1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.c2) this.d, 11));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new t31(20, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new lx0(twoStepVerificationActivity, bArr, tLObject, bArr2));
                    break;
                }
        }
    }
}
