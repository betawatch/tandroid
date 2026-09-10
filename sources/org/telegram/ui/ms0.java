package org.telegram.ui;

import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ms0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(this.b, tLObject, this.c, (TLObject) this.d, 27));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ac0(this.b, (Object) tLObject, this.c, this.d, tL_error, 13));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new fy0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.d2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 0));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ac0(this.b, (Object) tLObject, this.c, this.d, tL_error, 17));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ac0(this.b, (Object) tLObject, this.c, this.d, tL_error, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ac0((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, this.d, 6));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ac0((v71) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 20));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new fy0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.d2) this.c, tL_error, (TLRPC.TL_authorization) this.d, 9));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new fy0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.d2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 8));
                break;
            case 10:
                qa1 qa1Var = (qa1) this.b;
                String str = (String) this.c;
                eb1 eb1Var = (eb1) this.d;
                boolean z10 = true;
                ig.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ra1 ra1Var = qa1Var.r;
                        int i10 = ra1Var.i;
                        if (ra1Var != qa1Var.w.w) {
                            z10 = false;
                        }
                        bVar = fb1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(qa1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new fy0(qa1Var, bVar, str, eb1Var, 12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new fy0(this.b, tLObject, this.c, (org.telegram.ui.ActionBar.d2) this.d, 14));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new r91(14, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new fy0(twoStepVerificationActivity, bArr, tLObject, bArr2, 15));
                    break;
                }
        }
    }
}
