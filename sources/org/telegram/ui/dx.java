package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dx implements org.telegram.ui.Components.pg {
    public final /* synthetic */ uy a;

    public dx(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean C0() {
        return true;
    }

    @Override // org.telegram.ui.Components.pg
    public final void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        uy uyVar = this.a;
        if (uyVar.C2 == null || uyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < uyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) uyVar.I2.get(i12)).longValue(), 0L));
        }
        uy uyVar2 = this.a;
        uyVar2.C2.u(uyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers I() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean f1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void l1(CharSequence charSequence, boolean z10, boolean z11) {
        uy uyVar = this.a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 11), 100L);
        org.telegram.ui.Components.er0 er0Var = uyVar.G2;
        if (er0Var != null) {
            if (z10) {
                if (er0Var.h) {
                    er0Var.e(charSequence, true);
                }
            } else {
                cu cuVar = uyVar.H2;
                if (cuVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cuVar);
                }
                cu cuVar2 = new cu(5, this, charSequence);
                uyVar.H2 = cuVar2;
                AndroidUtilities.runOnUIThread(cuVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ on p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Components.pg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void E1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void V() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void d2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void f2(int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void i2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void j2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void n1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void s0() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void v1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void w2() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.pg
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Components.pg
    public final void E0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.pg
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
