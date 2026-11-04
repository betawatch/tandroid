package ei;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i50;
import org.telegram.ui.nf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i8(int i3, nf0 nf0Var, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i3;
        this.c = nf0Var;
        this.d = d2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.a;
        int i10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                cg.j0 j0Var = (cg.j0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i10).u(new Object[]{tL_messages_getAttachedStickers, j0Var}, obj3);
                    break;
                } else {
                    j0Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                org.telegram.messenger.g0.h3(new ai.p1(tLObject, (boolean[]) obj3, (u10) obj2, this.b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new cg.k0((i50) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.b1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1(s1Var, 0));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ai.p1(sharedPreferences, (TLRPC.TL_help_support) tLObject, s1Var, this.b, d2Var, 16));
                    break;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ai.p1((lr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, 18));
                break;
            case 5:
                ws0 ws0Var = (ws0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new qr((org.telegram.ui.ActionBar.s1[]) obj2, 2));
                int i11 = this.b;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new zo0(ws0Var, i11, tL_error, tL_messages_editMessage, 1));
                    break;
                } else {
                    hp.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new ai.p1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.s1) obj, 20), 2L);
                break;
            case 7:
                nf0 nf0Var = (nf0) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.h3(new zo0(i10, tL_error, d2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    hp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(nf0Var);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new cg.k0((org.telegram.ui.web.w0) obj3, tLObject, this.b, (org.telegram.ui.web.t0) obj2, (p7) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ i8(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ i8(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
        this.e = obj3;
    }
}
