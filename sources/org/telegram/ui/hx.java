package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hx implements org.telegram.ui.Components.mg {
    public final /* synthetic */ wy a;

    public hx(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.mg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        wy wyVar = this.a;
        if (wyVar.C2 == null || wyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < wyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) wyVar.I2.get(i12)).longValue(), 0L));
        }
        wy wyVar2 = this.a;
        wyVar2.C2.u(wyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        wy wyVar = this.a;
        AndroidUtilities.runOnUIThread(new kw(wyVar, 12), 100L);
        org.telegram.ui.Components.nq0 nq0Var = wyVar.G2;
        if (nq0Var != null) {
            if (z10) {
                if (nq0Var.h) {
                    nq0Var.e(charSequence, true);
                }
            } else {
                mw mwVar = wyVar.H2;
                if (mwVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(mwVar);
                }
                mw mwVar2 = new mw(4, this, charSequence);
                wyVar.H2 = mwVar2;
                AndroidUtilities.runOnUIThread(mwVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ rn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.mg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void g() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.mg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.mg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.mg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
