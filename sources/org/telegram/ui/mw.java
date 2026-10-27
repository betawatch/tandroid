package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mw implements org.telegram.ui.Components.og {
    public final /* synthetic */ ey a;

    public mw(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        ey eyVar = this.a;
        if (eyVar.C2 == null || eyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < eyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) eyVar.I2.get(i12)).longValue(), 0L));
        }
        ey eyVar2 = this.a;
        eyVar2.C2.v(eyVar2, arrayList, charSequence, false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers B() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int N0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TL_stories.StoryItem P0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean T0() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final void V0(CharSequence charSequence, boolean z10, boolean z11) {
        ey eyVar = this.a;
        AndroidUtilities.runOnUIThread(new uv(eyVar, 14), 100L);
        org.telegram.ui.Components.rr0 rr0Var = eyVar.G2;
        if (rr0Var != null) {
            if (z10) {
                if (rr0Var.h) {
                    rr0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.d71 d71Var = eyVar.H2;
                if (d71Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(d71Var);
                }
                org.telegram.ui.Components.d71 d71Var2 = new org.telegram.ui.Components.d71(25, this, charSequence);
                eyVar.H2 = d71Var2;
                AndroidUtilities.runOnUIThread(d71Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean Y0() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ int g() {
        return 0;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean h1() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ mn i0() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ TLRPC.Peer k() {
        return null;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void J1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void N1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void T1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void U() {
    }

    @Override // org.telegram.ui.Components.og
    public final void X0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void Y1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void a1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void b() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void b1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void c1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void c2() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Components.og
    public final void l0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o() {
    }

    @Override // org.telegram.ui.Components.og
    public final void o1() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void x0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void z() {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Components.og
    public final void L1(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void M0(int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void O1(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void R(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.og
    public final void t(float f7) {
    }

    @Override // org.telegram.ui.Components.og
    public final /* synthetic */ void w(boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void G(float f7, int i10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void v0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.og
    public final void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override // org.telegram.ui.Components.og
    public final void P1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }
}
