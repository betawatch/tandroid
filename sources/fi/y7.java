package fi;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p50;
import org.telegram.ui.wf0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y7(int i7, wf0 wf0Var, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 7;
        this.b = i7;
        this.c = wf0Var;
        this.d = g2Var;
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
                bg.l0 l0Var = (bg.l0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i11).u(new Object[]{tL_messages_getAttachedStickers, l0Var}, obj3);
                    break;
                } else {
                    l0Var.run(tLObject, tL_error);
                    break;
                }
            case 1:
                org.telegram.messenger.g0.g3(new ai.i1(tLObject, (boolean[]) obj3, (x10) obj2, this.b, (TL_account.updateEmojiStatus) obj, 7));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new bg.m0((p50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.b, (org.telegram.ui.a1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.j2(t1Var, i12));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new ai.i1(sharedPreferences, (TLRPC.TL_help_support) tLObject, t1Var, this.b, g2Var, 16));
                    break;
                }
            case 4:
                org.telegram.messenger.g0.g3(new ai.i1((as) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj));
                break;
            case 5:
                jt0 jt0Var = (jt0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.g3(new fs((org.telegram.ui.ActionBar.t1[]) obj2, i10));
                int i13 = this.b;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new mp0(jt0Var, i13, tL_error, tL_messages_editMessage, 1));
                    break;
                } else {
                    mp.u1(i13).V3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 6:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new ai.i1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.t1) obj, 20), 2L);
                break;
            case 7:
                wf0 wf0Var = (wf0) obj3;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (!(tLObject instanceof TLRPC.Updates)) {
                    if (tL_error != null) {
                        org.telegram.messenger.g0.g3(new mp0(i11, tL_error, g2Var2, tL_payments_assignPlayMarketTransaction));
                        break;
                    }
                } else {
                    mp.u1(i11).V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(wf0Var);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new bg.m0((org.telegram.ui.web.v0) obj3, tLObject, this.b, (org.telegram.ui.web.s0) obj2, (f7) obj, tL_error));
                break;
        }
    }

    public /* synthetic */ y7(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ y7(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }
}
