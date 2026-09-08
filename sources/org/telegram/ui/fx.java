package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class fx implements org.telegram.ui.Components.og {
    public final /* synthetic */ uy a;

    public fx(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void G(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
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

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int W0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem Y0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean a1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void f1(CharSequence charSequence, boolean z10, boolean z11) {
        uy uyVar = this.a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 12), 100L);
        org.telegram.ui.Components.mq0 mq0Var = uyVar.G2;
        if (mq0Var != null) {
            if (z10) {
                if (mq0Var.h) {
                    mq0Var.e(charSequence, true);
                }
            } else {
                yt ytVar = uyVar.H2;
                if (ytVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(ytVar);
                }
                yt ytVar2 = new yt(10, this, charSequence);
                uyVar.H2 = ytVar2;
                AndroidUtilities.runOnUIThread(ytVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean i1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ sn o0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer q() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean z0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final void C() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void D0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void G0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void X1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void a2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void b2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h() {
    }

    @Override // org.telegram.ui.Components.og
    public final void h1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void l1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void m1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.og
    public final void p1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void r0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void v() {
    }

    @Override // org.telegram.ui.Components.og
    public final void x(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void B0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void J(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void n1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void c2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
