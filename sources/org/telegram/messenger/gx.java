package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.j50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h40;
import org.telegram.ui.ms0;
import org.telegram.ui.vx0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gx(int i3, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.g = obj3;
        this.b = i3;
        this.c = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        int i10 = this.b;
        Object obj = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                g0.h3(new ai.d3((yy) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (ky) obj2, this.b, (String) obj, 3));
                break;
            case 1:
                g0.h3(new ai.d3((org.telegram.ui.i4) obj5, this.b, (sf.b) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                g0.h3(new ai.d3(tLObject, (org.telegram.ui.ActionBar.s1) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.e6) obj2, (h40) obj));
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    hp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    yy.T(c.a(h10.t0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, bd.M0(2131752602, null), 1).show();
                    break;
                }
                break;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.E1;
                g0.h3(new ai.d3((LaunchActivity) obj5, tLObject, this.b, (org.telegram.ui.uw) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                g0.h3(new yd(tLObject, (org.telegram.ui.ActionBar.d2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (ms0) obj3, (ad.b) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                j50 j50Var = (j50) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        g0.i3(new vx0(d2Var, context2, e6Var, j50Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            g0.i3(new org.telegram.ui.rw(d2Var, i10, j50Var, 11), 200L);
                            break;
                        }
                    } else {
                        g0.i3(new vx0(d2Var, context2, e6Var, j50Var, 0), 200L);
                        break;
                    }
                } else {
                    g0.h3(new ai.w1(tLObject, (Object) context2, (Object) e6Var, (Object) bArr, (Object) d2Var, (Object) j50Var, 18));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gx(int i3, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.a = 3;
        this.b = i3;
        this.d = zArr;
        this.e = file;
        this.f = setcallrating;
        this.g = arrayList;
        this.c = context;
    }

    public /* synthetic */ gx(Context context, org.telegram.ui.ActionBar.e6 e6Var, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, j50 j50Var, int i3) {
        this.a = 6;
        this.d = context;
        this.e = e6Var;
        this.f = bArr;
        this.g = d2Var;
        this.c = j50Var;
        this.b = i3;
    }

    public /* synthetic */ gx(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.e6 e6Var, h40 h40Var) {
        this.a = 2;
        this.d = s1Var;
        this.e = context;
        this.b = i3;
        this.f = exportgroupcallinvite;
        this.g = e6Var;
        this.c = h40Var;
    }

    public /* synthetic */ gx(org.telegram.ui.i4 i4Var, int i3, sf.b bVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 1;
        this.d = i4Var;
        this.b = i3;
        this.e = bVar;
        this.c = str;
        this.f = g0Var;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ gx(LaunchActivity launchActivity, int i3, org.telegram.ui.uw uwVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        this.a = 4;
        this.d = launchActivity;
        this.b = i3;
        this.e = uwVar;
        this.f = d2Var;
        this.g = user;
        this.c = str;
    }
}
