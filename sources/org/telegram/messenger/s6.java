package org.telegram.messenger;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s6(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new rn((a7) this.c, tLObject, (TLRPC.TL_textWithEntities) this.d, this.b, (org.telegram.ui.ActionBar.x1) this.e, 2));
                break;
            case 1:
                i0.g3(new i2.h1((org.telegram.ui.le) this.c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.b, tLObject, 2));
                break;
            case 2:
                i0.g3(new ag.n0((org.telegram.ui.un) this.c, (gf.e) this.d, tLObject, (org.telegram.ui.af) this.e, this.b, 6));
                break;
            case 3:
                i0.g3(new i2.h1((org.telegram.ui.zo) this.c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.b, tL_error, 5));
                break;
            case 4:
                i0.g3(new ag.n0((org.telegram.ui.Components.dy) this.c, (String) this.d, this.b, (String) this.e, tLObject, 9));
                break;
            case 5:
                i0.g3(new i2.h1((org.telegram.ui.ut) this.c, tLObject, (vh.d) this.d, this.b, (HashSet) this.e, tL_error, 7));
                break;
            case 6:
                i0.g3(new i2.h1((rh.e4) this.c, tL_error, (q20) this.d, (TwoStepVerificationActivity) this.e, this.b, tLObject, 9));
                break;
            default:
                i0.g3(new ag.n0((vh.e1) this.c, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 15));
                break;
        }
    }

    public /* synthetic */ s6(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
    }

    public /* synthetic */ s6(vh.e1 e1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = 7;
        this.c = e1Var;
        this.b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }
}
