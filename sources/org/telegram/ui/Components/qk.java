package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ pm0 e;

    public /* synthetic */ qk(pm0 pm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = pm0Var;
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
                rk rkVar = (rk) this.e;
                org.telegram.ui.o10 o10Var = rkVar.H;
                sk skVar = rkVar.X;
                boolean t10 = skVar.b.a1.t();
                boolean z10 = this.c;
                if (!t10) {
                    k7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    o10Var.a = messageObject.getDialogId();
                    o10Var.b = id2;
                    k7Var.b(skVar.T.containsKey(o10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var = ((org.telegram.ui.p10) this.e).c;
                boolean g10 = w10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    s2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.o10 o10Var2 = w10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    o10Var2.a = messageObject2.getDialogId();
                    o10Var2.b = id3;
                    s2Var.V(w10Var.o0.c(w10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var2 = ((org.telegram.ui.r10) this.e).v;
                boolean g11 = w10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    k7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.o10 o10Var3 = w10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    o10Var3.a = messageObject3.getDialogId();
                    o10Var3.b = id4;
                    k7Var2.b(w10Var2.o0.c(w10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var3 = ((org.telegram.ui.r10) this.e).v;
                boolean g12 = w10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    j7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.o10 o10Var4 = w10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    o10Var4.a = messageObject4.getDialogId();
                    o10Var4.b = id5;
                    j7Var.e(w10Var3.o0.c(w10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var4 = ((org.telegram.ui.t10) this.e).v;
                boolean g13 = w10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.o10 o10Var5 = w10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    o10Var5.a = messageObject5.getDialogId();
                    o10Var5.b = id6;
                    n7Var.f(w10Var4.o0.c(w10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
