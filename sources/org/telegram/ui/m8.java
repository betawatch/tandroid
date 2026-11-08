package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ m8(i9 i9Var, org.telegram.ui.ActionBar.u1 u1Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z9, int i7) {
        this.a = i7;
        this.b = i9Var;
        this.c = u1Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z9;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final i9 i9Var = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z9 = this.f;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                i9.b0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z9, tL_error);
                                break;
                            default:
                                i9.c0(i9Var, u1Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z9, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final i9 i9Var2 = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z10 = this.f;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.p8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i9.b0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                break;
                            default:
                                i9.c0(i9Var2, u1Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
