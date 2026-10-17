package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class pw implements org.telegram.ui.Components.og {
    public final /* synthetic */ ey a;

    public pw(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean B0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void L(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ey eyVar = this.a;
        if (eyVar.C2 == null || eyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < eyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) eyVar.I2.get(i12)).longValue(), 0L));
        }
        ey eyVar2 = this.a;
        eyVar2.C2.w(eyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers O() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int Y0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem a1() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean b1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence, boolean z10, boolean z11) {
        ey eyVar = this.a;
        AndroidUtilities.runOnUIThread(new uv(eyVar, 13), 100L);
        org.telegram.ui.Components.ir0 ir0Var = eyVar.G2;
        if (ir0Var != null) {
            if (z10) {
                if (ir0Var.h) {
                    ir0Var.e(charSequence, true);
                }
            } else {
                nt ntVar = eyVar.H2;
                if (ntVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ntVar);
                }
                nt ntVar2 = new nt(9, this, charSequence);
                eyVar.H2 = ntVar2;
                AndroidUtilities.runOnUIThread(ntVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ in p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void F0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Q0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Z1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final void i1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void q1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void q2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void u1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void z(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void U(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
