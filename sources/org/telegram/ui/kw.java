package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kw implements org.telegram.ui.Components.og {
    public final /* synthetic */ cy a;

    public kw(cy cyVar) {
        this.a = cyVar;
    }

    @Override // org.telegram.ui.Components.og
    public final void A(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        cy cyVar = this.a;
        if (cyVar.C2 == null || cyVar.I2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < cyVar.I2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) cyVar.I2.get(i12)).longValue(), 0L));
        }
        cy cyVar2 = this.a;
        cyVar2.C2.v(cyVar2, arrayList, charSequence, false, z10, i10, i11, null);
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
        cy cyVar = this.a;
        AndroidUtilities.runOnUIThread(new sv(cyVar, 14), 100L);
        org.telegram.ui.Components.qr0 qr0Var = cyVar.G2;
        if (qr0Var != null) {
            if (z10) {
                if (qr0Var.h) {
                    qr0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.c71 c71Var = cyVar.H2;
                if (c71Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(c71Var);
                }
                org.telegram.ui.Components.c71 c71Var2 = new org.telegram.ui.Components.c71(24, this, charSequence);
                cyVar.H2 = c71Var2;
                AndroidUtilities.runOnUIThread(c71Var2, 1000L);
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
    public final /* synthetic */ kn i0() {
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
