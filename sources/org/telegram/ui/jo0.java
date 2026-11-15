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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jo0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ok0((oo0) this.b, tLObject, (org.telegram.messenger.m10) this.c, (TLRPC.Photo) this.d, 4));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new hp(this.b, (Object) tLObject, this.c, this.d, tL_error, 28));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ok0((org.telegram.ui.ActionBar.e2) this.b, this.c, tLObject, this.d, 7));
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.d;
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity, tLObject, userFull, tL_birthday, tL_error, 2));
                break;
            case 4:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.c;
                iv0 iv0Var = (iv0) this.d;
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity2, tLObject, tL_username, iv0Var, tL_error, 0));
                break;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                String str = (String) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                RectF rectF3 = ProfileActivity.X6;
                org.telegram.messenger.g0.h3(new cu0(profileActivity3, tLObject, str, user, tL_error, 1));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ok0((pv0) this.b, tLObject, (org.telegram.messenger.m10) this.c, (TLRPC.Photo) this.d, 13));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new cu0((x11) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, (TLRPC.User) this.d));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new ok0(this.b, this.c, (Object) tL_error, this.d, 16));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new ok0(this.b, this.c, (Object) tL_error, this.d, 15));
                break;
            case 10:
                k41 k41Var = (k41) this.b;
                String str2 = (String) this.c;
                y41 y41Var = (y41) this.d;
                boolean z10 = true;
                mg.b bVar = null;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        JSONObject jSONObject = new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data);
                        l41 l41Var = k41Var.r;
                        int i7 = l41Var.i;
                        if (l41Var != k41Var.x.x) {
                            z10 = false;
                        }
                        bVar = z41.h0(jSONObject, i7, z10);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(k41Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new ok0(k41Var, bVar, str2, y41Var, 19));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new ok0((o81) this.b, tLObject, (String) this.c, (org.telegram.ui.ActionBar.t1) this.d, 21));
                break;
            default:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                byte[] bArr = (byte[]) this.c;
                byte[] bArr2 = (byte[]) this.d;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new fy0(21, twoStepVerificationActivity, tL_error));
                    break;
                } else {
                    Utilities.e.c(new ok0((org.telegram.ui.ActionBar.e2) twoStepVerificationActivity, (Object) bArr, tLObject, (Object) bArr2, 22));
                    break;
                }
        }
    }
}
