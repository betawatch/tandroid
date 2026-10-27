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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cs0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg0((hs0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, false, 8));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30((mx0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.e2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 11));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                int i10 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity, tLObject, userFull, tL_birthday, tL_error, 29));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                kz0 kz0Var = (kz0) this.d;
                int i11 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity2, tLObject, tL_username, kz0Var, tL_error, 27));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i30(profileActivity3, tLObject, str, user, tL_error, 28));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new cg0((tz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, false, 17));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new q01((p61) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new cg0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.e2) this.c, tL_error, (TLRPC.TL_authorization) this.d, false, 20));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new cg0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.e2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, false, 19));
                break;
            case 10:
                j91 j91Var = (j91) this.b;
                String str2 = (String) this.c;
                x91 x91Var = (x91) this.d;
                boolean z10 = true;
                lg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        k91 k91Var = j91Var.r;
                        int i13 = k91Var.i;
                        if (k91Var != j91Var.w.w) {
                            z10 = false;
                        }
                        bVar = y91.d0(jSONObject, i13, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(j91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new cg0((Object) j91Var, (Object) bVar, str2, (Object) x91Var, 23));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new cg0(this.b, tLObject, this.c, this.d, 25));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new yc1(8, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new cg0(twoStepVerificationActivity, bArr, tLObject, bArr2, 26));
                    break;
                }
        }
    }
}
