package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bx implements org.telegram.ui.Components.eg {
    public final /* synthetic */ py a;

    public bx(py pyVar) {
        this.a = pyVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        py pyVar = this.a;
        if (pyVar.z2 == null || pyVar.F2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < pyVar.F2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) pyVar.F2.get(i12)).longValue(), 0L));
        }
        py pyVar2 = this.a;
        pyVar2.z2.v(pyVar2, arrayList, charSequence, false, z4, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean D1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean H0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int f1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem h1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean j1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void r1(CharSequence charSequence, boolean z4, boolean z10) {
        py pyVar = this.a;
        AndroidUtilities.runOnUIThread(new ew(pyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = pyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.q51 q51Var = pyVar.E2;
                if (q51Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(q51Var);
                }
                org.telegram.ui.Components.q51 q51Var2 = new org.telegram.ui.Components.q51(20, this, charSequence);
                pyVar.E2 = q51Var2;
                AndroidUtilities.runOnUIThread(q51Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean u1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void A(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void B() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void C1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void F2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void G1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void M1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void X() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void Y(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void e1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void s2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
