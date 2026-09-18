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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ps0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hs0((us0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new i90(this.b, tLObject, this.c, this.d, tL_error, 17));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hs0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new i90(this.b, tLObject, this.c, this.d, tL_error, 21));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new i90(this.b, tLObject, this.c, this.d, tL_error, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new i90(this.b, tLObject, this.c, this.d, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new hs0((j01) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 10));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new i90(this.b, tL_error, tLObject, this.c, this.d, 24));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new hs0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new hs0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.c2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                break;
            case 10:
                la1 la1Var = (la1) this.b;
                String str = (String) this.c;
                za1 za1Var = (za1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        ma1 ma1Var = la1Var.r;
                        int i10 = ma1Var.i;
                        if (ma1Var != la1Var.w.w) {
                            z10 = false;
                        }
                        bVar = ab1.e0(jSONObject, i10, z10);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(la1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new hs0(la1Var, bVar, str, za1Var, 16));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hs0((xe1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.c2) this.d, 18));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new qb1(11, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new hs0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    break;
                }
        }
    }
}
