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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lr0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((qr0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 26));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((uw0) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, (TL_account.setAccountTTL) this.d, 29));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.b, tLObject, (TLRPC.UserFull) this.c, (TL_account.TL_birthday) this.d, tL_error, 29));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.b, tLObject, (TLRPC.TL_username) this.c, (vy0) this.d, tL_error, 27));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ProfileActivity) this.b, tLObject, (String) this.c, (TLRPC.User) this.d, tL_error, 28));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ex0((dz0) this.b, tLObject, (UserConfig) this.c, (TLRPC.Photo) this.d, 5));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a01((k61) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 2));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ex0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tL_error, (TLObject) this.d, 8));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ex0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.b2) this.c, tL_error, (TLObject) this.d, 7));
                break;
            case 10:
                b91 b91Var = (b91) this.b;
                String str = (String) this.c;
                p91 p91Var = (p91) this.d;
                boolean z10 = true;
                sf.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        c91 c91Var = b91Var.r;
                        int i10 = c91Var.i;
                        if (c91Var != b91Var.w.w) {
                            z10 = false;
                        }
                        bVar = q91.e0(jSONObject, i10, z10);
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(b91Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new ex0(b91Var, bVar, str, p91Var, 11));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ex0((od1) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.b2) this.d));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new m21(23, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.globalQueue.postRunnable(new ex0(twoStepVerificationActivity, bArr, tLObject, bArr2, 14));
                    break;
                }
        }
    }
}
