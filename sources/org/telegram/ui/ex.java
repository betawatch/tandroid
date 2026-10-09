package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ex implements org.telegram.ui.Components.qg {
    public final /* synthetic */ ty a;

    public ex(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean C1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean I0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void K(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        ty tyVar = this.a;
        if (tyVar.C2 == null || tyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < tyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) tyVar.I2.get(i12)).longValue(), 0L));
        }
        ty tyVar2 = this.a;
        tyVar2.C2.w(tyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers P() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int h1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem j1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1(CharSequence charSequence, boolean z10, boolean z11) {
        ty tyVar = this.a;
        AndroidUtilities.runOnUIThread(new hw(tyVar, 13), 100L);
        org.telegram.ui.Components.rr0 rr0Var = tyVar.G2;
        if (rr0Var != null) {
            if (z10) {
                if (rr0Var.h) {
                    rr0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.ea1 ea1Var = tyVar.H2;
                if (ea1Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ea1Var);
                }
                org.telegram.ui.Components.ea1 ea1Var2 = new org.telegram.ui.Components.ea1(15, this, charSequence);
                tyVar.H2 = ea1Var2;
                AndroidUtilities.runOnUIThread(ea1Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int v() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer x() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final void B1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void B2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void J() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void L1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void M0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void O0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void a0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void c0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void j2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void l2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void p2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void K0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void V(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void z1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void q2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
