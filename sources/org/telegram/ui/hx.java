package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hx implements org.telegram.ui.Components.qg {
    public final /* synthetic */ wy a;

    public hx(wy wyVar) {
        this.a = wyVar;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final void I(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        wy wyVar = this.a;
        if (wyVar.C2 == null || wyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < wyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) wyVar.I2.get(i12)).longValue(), 0L));
        }
        wy wyVar2 = this.a;
        wyVar2.C2.v(wyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int b1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TL_stories.StoryItem d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean e1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final void k1(CharSequence charSequence, boolean z10, boolean z11) {
        wy wyVar = this.a;
        AndroidUtilities.runOnUIThread(new kw(wyVar, 12), 100L);
        org.telegram.ui.Components.xq0 xq0Var = wyVar.G2;
        if (xq0Var != null) {
            if (z10) {
                if (xq0Var.h) {
                    xq0Var.e(charSequence, true);
                }
            } else {
                uv uvVar = wyVar.H2;
                if (uvVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(uvVar);
                }
                uv uvVar2 = new uv(7, this, charSequence);
                wyVar.H2 = uvVar2;
                AndroidUtilities.runOnUIThread(uvVar2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ tn p0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ int u() {
        return 0;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.Peer w() {
        return null;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void B(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void D1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void G() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void J0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void T0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void W() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void Z(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void a1(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void b2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void d2(int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void g2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void h2(boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void m0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void m1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void q1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void r1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void t0() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void u2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void x() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y(float f7) {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void y1() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void y2() {
    }

    @Override // org.telegram.ui.Components.qg
    public final void F0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void T(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void s1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.qg
    public final void i2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }
}
