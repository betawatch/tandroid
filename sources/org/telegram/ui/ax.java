package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ax implements org.telegram.ui.Components.eg {
    public final /* synthetic */ oy a;

    public ax(oy oyVar) {
        this.a = oyVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        oy oyVar = this.a;
        if (oyVar.z2 == null || oyVar.F2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < oyVar.F2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) oyVar.F2.get(i12)).longValue(), 0L));
        }
        oy oyVar2 = this.a;
        oyVar2.z2.w(oyVar2, arrayList, charSequence, false, z4, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean G0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int c1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem e1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean g1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int l() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void n1(CharSequence charSequence, boolean z4, boolean z10) {
        oy oyVar = this.a;
        AndroidUtilities.runOnUIThread(new dw(oyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = oyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.k41 k41Var = oyVar.E2;
                if (k41Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(k41Var);
                }
                org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(22, this, charSequence);
                oyVar.E2 = k41Var2;
                AndroidUtilities.runOnUIThread(k41Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer p() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean q1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ nn r0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void C() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void C1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void N0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void V0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void Y() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b0(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void b1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void j2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void m2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void o0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void r2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void t1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void u1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void w0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void z(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void z2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void H(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void I0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
