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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fs0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jr0((ks0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new c90(this.b, tLObject, this.c, this.d, tL_error, 17));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new jr0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.a2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 5));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new c90(this.b, tLObject, this.c, this.d, tL_error, 21));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c90(this.b, tLObject, this.c, this.d, tL_error, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new c90(this.b, tLObject, this.c, this.d, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new jr0((yz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 11));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c90(this.b, tL_error, tLObject, this.c, this.d, 24));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jr0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.a2) this.c, tL_error, (TLRPC.TL_authorization) this.d, 14));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new jr0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.a2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 13));
                break;
            case 10:
                da1 da1Var = (da1) this.b;
                String str = (String) this.c;
                ra1 ra1Var = (ra1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ea1 ea1Var = da1Var.r;
                        int i10 = ea1Var.i;
                        if (ea1Var != da1Var.w.w) {
                            z10 = false;
                        }
                        bVar = sa1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(da1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new jr0(da1Var, bVar, str, ra1Var, 17));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new jr0((oe1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.a2) this.d, 19));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new p81(16, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new jr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 20));
                    break;
                }
        }
    }
}
