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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class is0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ is0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zr0((ns0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new f90(this.b, tLObject, this.c, this.d, tL_error, 17));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new zr0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f90(this.b, tLObject, this.c, this.d, tL_error, 21));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new f90(this.b, tLObject, this.c, this.d, tL_error, 19));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new f90(this.b, tLObject, this.c, this.d, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new zr0((a01) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 10));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new f90(this.b, tL_error, tLObject, this.c, this.d, 24));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tL_error, (TLRPC.TL_authorization) this.d, 13));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new zr0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 12));
                break;
            case 10:
                ea1 ea1Var = (ea1) this.b;
                String str = (String) this.c;
                sa1 sa1Var = (sa1) this.d;
                boolean z10 = true;
                jg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        fa1 fa1Var = ea1Var.r;
                        int i10 = fa1Var.i;
                        if (fa1Var != ea1Var.w.w) {
                            z10 = false;
                        }
                        bVar = ta1.c0(jSONObject, i10, z10);
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(ea1Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new zr0(ea1Var, bVar, str, sa1Var, 16));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new zr0((oe1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.b2) this.d, 18));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new e91(14, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new zr0(twoStepVerificationActivity, bArr, tLObject, bArr2, 19));
                    break;
                }
        }
    }
}
