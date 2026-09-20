package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fx implements org.telegram.ui.Components.ng {
    public final /* synthetic */ uy a;

    public fx(uy uyVar) {
        this.a = uyVar;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ng
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

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int c1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean g1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final void m1(CharSequence charSequence, boolean z10, boolean z11) {
        uy uyVar = this.a;
        AndroidUtilities.runOnUIThread(new jw(uyVar, 12), 100L);
        org.telegram.ui.Components.zq0 zq0Var = uyVar.G2;
        if (zq0Var != null) {
            if (z10) {
                if (zq0Var.h) {
                    zq0Var.e(charSequence, true);
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

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean p1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ pn q0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ TLRPC.Peer v() {
        return null;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void A1() {
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
    public final void F1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void X(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void b1(int i10) {
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
    public final /* synthetic */ void n0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void o2() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void r1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.ng
    public final void w1(CharSequence charSequence) {
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
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void K(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.ng
    public final void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
