package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cx implements org.telegram.ui.Components.eg {
    public final /* synthetic */ qy a;

    public cx(qy qyVar) {
        this.a = qyVar;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        qy qyVar = this.a;
        if (qyVar.z2 == null || qyVar.F2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < qyVar.F2.size(); i12++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) qyVar.F2.get(i12)).longValue(), 0L));
        }
        qy qyVar2 = this.a;
        qyVar2.z2.w(qyVar2, arrayList, charSequence, false, z4, i10, i11, null);
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean H0() {
        return true;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int g1() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TL_stories.StoryItem i1() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean k1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eg
    public final void q1(CharSequence charSequence, boolean z4, boolean z10) {
        qy qyVar = this.a;
        AndroidUtilities.runOnUIThread(new fw(qyVar, 12), 100L);
        org.telegram.ui.Components.qq0 qq0Var = qyVar.D2;
        if (qq0Var != null) {
            if (z4) {
                if (qq0Var.h) {
                    qq0Var.e(charSequence, true);
                }
            } else {
                org.telegram.ui.Components.k41 k41Var = qyVar.E2;
                if (k41Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(k41Var);
                }
                org.telegram.ui.Components.k41 k41Var2 = new org.telegram.ui.Components.k41(21, this, charSequence);
                qyVar.E2 = k41Var2;
                AndroidUtilities.runOnUIThread(k41Var2, 1000L);
            }
        }
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ TLRPC.Peer r() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ boolean t1() {
        return false;
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ pn u0() {
        return null;
    }

    @Override // org.telegram.ui.Components.eg
    public final void A1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void A2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void B(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void D() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void E1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void E2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void O0() {
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
    public final void c() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void f1(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void k2(int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void n2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void o2(boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void q0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void s1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void t2() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void v() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void v1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final /* synthetic */ void w1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x(float f10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x0() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void x1() {
    }

    @Override // org.telegram.ui.Components.eg
    public final void J0(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void K(float f10, int i10) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override // org.telegram.ui.Components.eg
    public final void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }
}
