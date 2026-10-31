package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(int i10, ch0 ch0Var, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = 5;
        this.b = i10;
        this.c = ch0Var;
        this.d = k2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new m4.a1((m60) obj3, (f4) obj2, tL_error, tLObject, this.b, (c1) obj, 4));
                break;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.a2(x1Var, 0));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new i2.g1(sharedPreferences, (TLRPC.TL_help_support) tLObject, x1Var, this.b, k2Var, 10));
                    break;
                }
            case 2:
                org.telegram.messenger.i0.g3(new i2.g1((org.telegram.ui.Components.vr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.b, (int[]) obj, 12));
                break;
            case 3:
                org.telegram.ui.Components.zt0 zt0Var = (org.telegram.ui.Components.zt0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.as((org.telegram.ui.ActionBar.x1[]) obj2, 2));
                int i11 = this.b;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new ag.g3(zt0Var, i11, tL_error, tL_messages_editMessage, 25));
                    break;
                } else {
                    org.telegram.messenger.vp.r1(i11).L3((TLRPC.Updates) tLObject, false);
                    break;
                }
            case 4:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new i2.g1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.b, (org.telegram.ui.ActionBar.x1) obj, 14), 2L);
                break;
            case 5:
                ch0 ch0Var = (ch0) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.b;
                if (!z10) {
                    if (tL_error != null) {
                        org.telegram.messenger.i0.g3(new org.telegram.ui.Components.c11(i12, tL_error, k2Var2, tL_payments_assignPlayMarketTransaction, 10));
                        break;
                    }
                } else {
                    org.telegram.messenger.vp.r1(i12).L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(ch0Var);
                    break;
                }
                break;
            case 6:
                org.telegram.messenger.i0.g3(new m4.a1((org.telegram.ui.web.z0) obj3, tLObject, this.b, (org.telegram.ui.web.v0) obj2, (org.telegram.ui.web.x0) obj, tL_error, 12));
                break;
            case 7:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                q8 q8Var = (q8) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.w8.n(this.b).u(new Object[]{tL_messages_getAttachedStickers, q8Var}, obj3);
                    break;
                } else {
                    q8Var.run(tLObject, tL_error);
                    break;
                }
            default:
                org.telegram.messenger.i0.g3(new i2.g1(tLObject, (boolean[]) obj3, (org.telegram.messenger.q20) obj2, this.b, (TL_account.updateEmojiStatus) obj, 23));
                break;
        }
    }

    public /* synthetic */ b0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ b0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }
}
