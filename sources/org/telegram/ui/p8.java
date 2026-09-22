package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ p8(l9 l9Var, org.telegram.ui.ActionBar.b2 b2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.a = i10;
        this.b = l9Var;
        this.c = b2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final l9 l9Var = this.b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.s8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l9.V(l9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                            default:
                                l9.Y(l9Var, b2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final l9 l9Var2 = this.b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.s8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l9.V(l9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                            default:
                                l9.Y(l9Var2, b2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
