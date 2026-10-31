package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ m8(j9 j9Var, org.telegram.ui.ActionBar.x1 x1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i10) {
        this.a = i10;
        this.b = j9Var;
        this.c = x1Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final j9 j9Var = this.b;
                final org.telegram.ui.ActionBar.x1 x1Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j9.a0(j9Var, x1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                            default:
                                j9.b0(j9Var, x1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final j9 j9Var2 = this.b;
                final org.telegram.ui.ActionBar.x1 x1Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                j9.a0(j9Var2, x1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                            default:
                                j9.b0(j9Var2, x1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
