package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bx implements org.telegram.ui.Components.og {
    public final /* synthetic */ qy a;

    public bx(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        qy qyVar = this.a;
        if (qyVar.C2 == null || qyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < qyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) qyVar.I2.get(i12)).longValue(), 0L));
        }
        qy qyVar2 = this.a;
        qyVar2.C2.u(qyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        qy qyVar = this.a;
        AndroidUtilities.runOnUIThread(new ew(qyVar, 12), 100L);
        org.telegram.ui.Components.zq0 zq0Var = qyVar.G2;
        if (zq0Var != null) {
            if (z10) {
                if (zq0Var.h) {
                    zq0Var.e(charSequence, true);
                }
            } else {
                tt ttVar = qyVar.H2;
                if (ttVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ttVar);
                }
                tt ttVar2 = new tt(10, this, charSequence);
                qyVar.H2 = ttVar2;
                AndroidUtilities.runOnUIThread(ttVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ mn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void D() {
    }

    @Override // org.telegram.ui.Components.og
    public final void E1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.og
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g() {
    }

    @Override // org.telegram.ui.Components.og
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void x() {
    }

    @Override // org.telegram.ui.Components.og
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
