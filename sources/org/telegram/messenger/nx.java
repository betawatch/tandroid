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
import org.telegram.ui.Components.r80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.iy0;
import org.telegram.ui.p40;
import org.telegram.ui.zs0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class nx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nx(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f = obj2;
        this.g = obj3;
        this.b = i7;
        this.c = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = this.b;
        Object obj = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                g0.h3(new jg.c1((gz) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (sy) obj2, this.b, (String) obj));
                break;
            case 1:
                g0.h3(new jg.c1((org.telegram.ui.g4) obj5, this.b, (vf.b) obj4, tLObject, (String) obj, (org.telegram.ui.f0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                break;
            case 2:
                g0.h3(new jg.c1(tLObject, (org.telegram.ui.ActionBar.u1) obj5, (Context) obj4, this.b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.h6) obj2, (p40) obj));
                break;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    qp.s1(i10).O3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    gz.T(c.a(p10.s0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, id.M0(2131752602, null), 1).show();
                    break;
                }
                break;
            case 4:
                String str = (String) obj;
                String str2 = LaunchActivity.B1;
                g0.h3(new jg.c1((LaunchActivity) obj5, tLObject, this.b, (org.telegram.ui.zw) obj4, (org.telegram.ui.ActionBar.f2) obj3, (TLRPC.User) obj2, str));
                break;
            case 5:
                g0.h3(new ee(tLObject, (org.telegram.ui.ActionBar.f2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (zs0) obj3, (com.google.android.gms.internal.clearcut.z0) obj2, this.b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                break;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                r80 r80Var = (r80) obj;
                if (tLObject == null) {
                    if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        g0.i3(new iy0(f2Var, context2, h6Var, r80Var, 1), 200L);
                        break;
                    }
                } else if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption)) {
                    if (!(tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported)) {
                        if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                            g0.i3(new org.telegram.ui.h10(f2Var, i10, r80Var, 10), 200L);
                            break;
                        }
                    } else {
                        g0.i3(new iy0(f2Var, context2, h6Var, r80Var, 0), 200L);
                        break;
                    }
                } else {
                    g0.h3(new bi.a3(tLObject, (Object) context2, (Object) h6Var, (Object) bArr, (Object) f2Var, (Object) r80Var, 17));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nx(int i7, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.a = 3;
        this.b = i7;
        this.d = zArr;
        this.e = file;
        this.f = setcallrating;
        this.g = arrayList;
        this.c = context;
    }

    public /* synthetic */ nx(Context context, org.telegram.ui.ActionBar.h6 h6Var, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, r80 r80Var, int i7) {
        this.a = 6;
        this.d = context;
        this.e = h6Var;
        this.f = bArr;
        this.g = f2Var;
        this.c = r80Var;
        this.b = i7;
    }

    public /* synthetic */ nx(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.h6 h6Var, p40 p40Var) {
        this.a = 2;
        this.d = u1Var;
        this.e = context;
        this.b = i7;
        this.f = exportgroupcallinvite;
        this.g = h6Var;
        this.c = p40Var;
    }

    public /* synthetic */ nx(org.telegram.ui.g4 g4Var, int i7, vf.b bVar, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.a = 1;
        this.d = g4Var;
        this.b = i7;
        this.e = bVar;
        this.c = str;
        this.f = f0Var;
        this.g = tL_messages_getWebPage;
    }

    public /* synthetic */ nx(LaunchActivity launchActivity, int i7, org.telegram.ui.zw zwVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        this.a = 4;
        this.d = launchActivity;
        this.b = i7;
        this.e = zwVar;
        this.f = f2Var;
        this.g = user;
        this.c = str;
    }
}
