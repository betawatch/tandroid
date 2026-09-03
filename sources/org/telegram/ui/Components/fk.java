package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ql0 e;

    public /* synthetic */ fk(ql0 ql0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z4, int i10) {
        this.a = i10;
        this.e = ql0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gk gkVar = (gk) this.e;
                org.telegram.ui.m10 m10Var = gkVar.E;
                hk hkVar = gkVar.U;
                boolean s6 = hkVar.b.U0.s();
                boolean z4 = this.c;
                if (!s6) {
                    h7Var.b(false, z4);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    m10Var.a = messageObject.getDialogId();
                    m10Var.b = id2;
                    h7Var.b(hkVar.Q.containsKey(m10Var), z4);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.d;
                q2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var = ((org.telegram.ui.n10) this.e).c;
                boolean f10 = u10Var.l0.f();
                boolean z10 = this.c;
                if (!f10) {
                    q2Var.V(false, z10);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var2 = u10Var.P;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    m10Var2.a = messageObject2.getDialogId();
                    m10Var2.b = id3;
                    q2Var.V(u10Var.l0.b(u10Var.P), z10);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var2 = ((org.telegram.ui.p10) this.e).v;
                boolean f11 = u10Var2.l0.f();
                boolean z11 = this.c;
                if (!f11) {
                    h7Var2.b(false, z11);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var3 = u10Var2.P;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    m10Var3.a = messageObject3.getDialogId();
                    m10Var3.b = id4;
                    h7Var2.b(u10Var2.l0.b(u10Var2.P), z11);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var3 = ((org.telegram.ui.p10) this.e).v;
                boolean f12 = u10Var3.l0.f();
                boolean z12 = this.c;
                if (!f12) {
                    g7Var.e(false, z12);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var4 = u10Var3.P;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    m10Var4.a = messageObject4.getDialogId();
                    m10Var4.b = id5;
                    g7Var.e(u10Var3.l0.b(u10Var3.P), z12);
                    break;
                }
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var4 = ((org.telegram.ui.r10) this.e).v;
                boolean f13 = u10Var4.l0.f();
                boolean z13 = this.c;
                if (!f13) {
                    k7Var.f(false, z13);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var5 = u10Var4.P;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    m10Var5.a = messageObject5.getDialogId();
                    m10Var5.b = id6;
                    k7Var.f(u10Var4.l0.b(u10Var4.P), z13);
                    break;
                }
        }
        return true;
    }
}
