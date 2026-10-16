package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jx implements org.telegram.ui.Components.pg {
    public final /* synthetic */ yy a;

    public jx(yy yyVar) {
        this.a = yyVar;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void J(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        yy yyVar = this.a;
        if (yyVar.C2 == null || yyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < yyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) yyVar.I2.get(i12)).longValue(), 0L));
        }
        yy yyVar2 = this.a;
        yyVar2.C2.w(yyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers K() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int Z0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TL_stories.StoryItem b1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean c1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean f1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void h1(CharSequence charSequence, boolean z10, boolean z11) {
        yy yyVar = this.a;
        AndroidUtilities.runOnUIThread(new mw(yyVar, 13), 100L);
        org.telegram.ui.Components.nr0 nr0Var = yyVar.G2;
        if (nr0Var != null) {
            if (z10) {
                if (nr0Var.h) {
                    nr0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.n51 n51Var = yyVar.H2;
                if (n51Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n51Var);
                }
                org.telegram.ui.Components.n51 n51Var2 = new org.telegram.ui.Components.n51(21, this, charSequence);
                yyVar.H2 = n51Var2;
                AndroidUtilities.runOnUIThread(n51Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ un p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean s1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int v() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.Peer y() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final void A(float f7) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void D(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void H() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void I0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void R0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void W1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y0(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void Y1(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void b2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void c2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void h2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void j1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void n1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void r1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void z() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void z1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void p1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void d2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
