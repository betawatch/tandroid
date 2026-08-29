package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ m8(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.a = i10;
        this.b = h9Var;
        this.c = c2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final h9 h9Var = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                h9.V(h9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                            default:
                                h9.Y(h9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final h9 h9Var2 = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                h9.V(h9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                            default:
                                h9.Y(h9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
