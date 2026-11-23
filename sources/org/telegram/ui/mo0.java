package org.telegram.ui;

import android.graphics.RectF;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mo0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg0((ro0) this.b, tLObject, (org.telegram.messenger.k10) this.c, (TLRPC.Photo) this.d, 7));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new wn(this.b, tLObject, this.c, this.d, tL_error, 29));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new kg0((PrivacySettingsActivity) this.b, (org.telegram.ui.ActionBar.t1) this.c, tLObject, (TL_account.setAccountTTL) this.d, 10));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 3));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                kv0 kv0Var = (kv0) this.d;
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity2, tLObject, tL_username, kv0Var, tL_error, 1));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g3(new wt0(profileActivity3, tLObject, str, user, tL_error, 2));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new kg0((rv0) this.b, tLObject, (org.telegram.messenger.k10) this.c, (TLRPC.Photo) this.d, 16));
                break;
            case 7:
                org.telegram.messenger.g0.g3(new wt0((c21) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d));
                break;
            case 8:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.t1) this.c, tL_error, (TLRPC.TL_authorization) this.d, 19));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new kg0((SessionsActivity) this.b, (org.telegram.ui.ActionBar.t1) this.c, tL_error, (TLRPC.TL_webAuthorization) this.d, 18));
                break;
            case 10:
                n41 n41Var = (n41) this.b;
                String str2 = (String) this.c;
                b51 b51Var = (b51) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        o41 o41Var = n41Var.r;
                        int i7 = o41Var.i;
                        if (o41Var != n41Var.x.x) {
                            z10 = false;
                        }
                        bVar = c51.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(n41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.g3(new kg0(n41Var, bVar, str2, b51Var, 22));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new kg0((s81) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.t1) this.d, 24));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new mz0(18, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.e.c(new kg0(twoStepVerificationActivity, bArr, tLObject, bArr2, 25));
                    break;
                }
        }
    }
}
