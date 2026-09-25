package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ vl0 e;

    public /* synthetic */ nk(vl0 vl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = vl0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.l10 l10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean s10 = pkVar.b.X0.s();
                boolean z10 = this.c;
                if (!s10) {
                    k7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    l10Var.a = messageObject.getDialogId();
                    l10Var.b = id2;
                    k7Var.b(pkVar.T.containsKey(l10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var = ((org.telegram.ui.m10) this.e).c;
                boolean g10 = t10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    s2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var2 = t10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    l10Var2.a = messageObject2.getDialogId();
                    l10Var2.b = id3;
                    s2Var.V(t10Var.o0.c(t10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var2 = ((org.telegram.ui.o10) this.e).v;
                boolean g11 = t10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    k7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var3 = t10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    l10Var3.a = messageObject3.getDialogId();
                    l10Var3.b = id4;
                    k7Var2.b(t10Var2.o0.c(t10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var3 = ((org.telegram.ui.o10) this.e).v;
                boolean g12 = t10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    j7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var4 = t10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    l10Var4.a = messageObject4.getDialogId();
                    l10Var4.b = id5;
                    j7Var.e(t10Var3.o0.c(t10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var4 = ((org.telegram.ui.q10) this.e).v;
                boolean g13 = t10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var5 = t10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    l10Var5.a = messageObject5.getDialogId();
                    l10Var5.b = id6;
                    n7Var.f(t10Var4.o0.c(t10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
