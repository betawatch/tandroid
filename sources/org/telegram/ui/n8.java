package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ n8(i9 i9Var, org.telegram.ui.ActionBar.c2 c2Var, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, int i9) {
        this.a = i9;
        this.b = i9Var;
        this.c = c2Var;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 0;
                final i9 i9Var = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z10 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.q8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                i9.U(i9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                            default:
                                i9.X(i9Var, c2Var, tLObject, hashSet, tL_inputGroupCallInviteMessage, z10, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final i9 i9Var2 = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z11 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.q8
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i9.U(i9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                            default:
                                i9.X(i9Var2, c2Var2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z11, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
