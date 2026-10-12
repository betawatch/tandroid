package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ lm0 e;

    public /* synthetic */ nk(lm0 lm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = lm0Var;
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
                org.telegram.ui.u10 u10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean t10 = pkVar.b.a1.t();
                boolean z10 = this.c;
                if (!t10) {
                    k7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    u10Var.a = messageObject.getDialogId();
                    u10Var.b = id2;
                    k7Var.b(pkVar.T.containsKey(u10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var = ((org.telegram.ui.v10) this.e).c;
                boolean g10 = c20Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    s2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.u10 u10Var2 = c20Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    u10Var2.a = messageObject2.getDialogId();
                    u10Var2.b = id3;
                    s2Var.V(c20Var.o0.b(c20Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var2 = ((org.telegram.ui.x10) this.e).v;
                boolean g11 = c20Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    k7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.u10 u10Var3 = c20Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    u10Var3.a = messageObject3.getDialogId();
                    u10Var3.b = id4;
                    k7Var2.b(c20Var2.o0.b(c20Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var3 = ((org.telegram.ui.x10) this.e).v;
                boolean g12 = c20Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    j7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.u10 u10Var4 = c20Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    u10Var4.a = messageObject4.getDialogId();
                    u10Var4.b = id5;
                    j7Var.e(c20Var3.o0.b(c20Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var4 = ((org.telegram.ui.z10) this.e).v;
                boolean g13 = c20Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.u10 u10Var5 = c20Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    u10Var5.a = messageObject5.getDialogId();
                    u10Var5.b = id6;
                    n7Var.f(c20Var4.o0.b(c20Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
