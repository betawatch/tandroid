package di;

import android.content.SharedPreferences;
import android.net.Uri;
import bi.ub;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q50;
import org.telegram.ui.vf0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j8(int i7, vf0 vf0Var, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i7;
        this.c = vf0Var;
        this.d = f2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.a;
        int i10 = 2;
        int i11 = this.b;
        int i12 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                bg.k0 k0Var = (bg.k0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i11).u(new Object[]{tL_messages_getAttachedStickers, k0Var}, obj3);
                    break;
                } else {
                    k0Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                org.telegram.messenger.g0.h3(new ub(tLObject, (boolean[]) obj3, (c20) obj2, this.b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new bg.l0((q50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.a1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(u1Var, i12));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ub((Object) sharedPreferences, tLObject, (Object) u1Var, this.b, f2Var, 14));
                    break;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ub((lr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, 16));
                break;
            case 5:
                zs0 zs0Var = (zs0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new qr((org.telegram.ui.ActionBar.u1[]) obj2, i10));
                int i13 = this.b;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new qp0(zs0Var, i13, tL_error, tL_messages_editMessage, 0));
                    break;
                } else {
                    qp.s1(i13).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new ub((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.u1) obj, 18), 2L);
                break;
            case 7:
                vf0 vf0Var = (vf0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new qp0(i11, tL_error, f2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    qp.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(vf0Var);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new bg.l0((org.telegram.ui.web.x0) obj3, tLObject, this.b, (org.telegram.ui.web.u0) obj2, (p7) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ j8(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j8(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }
}
