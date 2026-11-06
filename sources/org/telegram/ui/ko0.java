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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ko0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new io0((po0) this.b, tLObject, (org.telegram.messenger.p10) this.c, (TLRPC.Photo) this.d, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0(this.b, this.c, tL_error, tLObject, this.d, 24));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new io0((org.telegram.ui.ActionBar.f2) this.b, this.c, tLObject, this.d, 3));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity, (Object) userFull, tL_error, tLObject, (Object) tL_birthday, 28));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                jv0 jv0Var = (jv0) this.d;
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity2, (Object) tL_username, tL_error, tLObject, (Object) jv0Var, 26));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.S6;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) profileActivity3, (Object) str, tL_error, tLObject, (Object) user, 27));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new io0((qv0) this.b, tLObject, (org.telegram.messenger.p10) this.c, (TLRPC.Photo) this.d, 9));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new c01((a21) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d, 1));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new io0(this.b, this.c, (Object) tL_error, this.d, 12));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new io0(this.b, this.c, (Object) tL_error, this.d, 11));
                break;
            case 10:
                m41 m41Var = (m41) this.b;
                String str2 = (String) this.c;
                b51 b51Var = (b51) this.d;
                boolean z9 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        o41 o41Var = m41Var.r;
                        int i7 = o41Var.i;
                        if (o41Var != m41Var.x.x) {
                            z9 = false;
                        }
                        bVar = c51.h0(jSONObject, i7, z9);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(m41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new io0(m41Var, bVar, str2, b51Var, 15));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new io0((p81) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.u1) this.d, 17));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new by0(24, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.e.c(new io0((org.telegram.ui.ActionBar.f2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 18));
                    break;
                }
        }
    }
}
