package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cx implements org.telegram.ui.Components.ng {
    public final /* synthetic */ ry a;

    public cx(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        ry ryVar = this.a;
        if (ryVar.C2 == null || ryVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < ryVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) ryVar.I2.get(i12)).longValue(), 0L));
        }
        ry ryVar2 = this.a;
        ryVar2.C2.u(ryVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        ry ryVar = this.a;
        AndroidUtilities.runOnUIThread(new fw(ryVar, 12), 100L);
        org.telegram.ui.Components.mq0 mq0Var = ryVar.G2;
        if (mq0Var != null) {
            if (z10) {
                if (mq0Var.h) {
                    mq0Var.e(charSequence, true);
                }
            } else {
                hw hwVar = ryVar.H2;
                if (hwVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(hwVar);
                }
                hw hwVar2 = new hw(4, this, charSequence);
                ryVar.H2 = hwVar2;
                AndroidUtilities.runOnUIThread(hwVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ nn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void D() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void E1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void g() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void x() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
