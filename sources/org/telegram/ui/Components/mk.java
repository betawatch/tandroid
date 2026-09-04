package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ kl0 e;

    public /* synthetic */ mk(kl0 kl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = kl0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                nk nkVar = (nk) this.e;
                org.telegram.ui.p10 p10Var = nkVar.H;
                ok okVar = nkVar.X;
                boolean s10 = okVar.b.X0.s();
                boolean z10 = this.c;
                if (!s10) {
                    j7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    p10Var.a = messageObject.getDialogId();
                    p10Var.b = id2;
                    j7Var.b(okVar.T.containsKey(p10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var = ((org.telegram.ui.q10) this.e).c;
                boolean g10 = x10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    r2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.p10 p10Var2 = x10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    p10Var2.a = messageObject2.getDialogId();
                    p10Var2.b = id3;
                    r2Var.V(x10Var.o0.b(x10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var2 = ((org.telegram.ui.s10) this.e).v;
                boolean g11 = x10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    j7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.p10 p10Var3 = x10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    p10Var3.a = messageObject3.getDialogId();
                    p10Var3.b = id4;
                    j7Var2.b(x10Var2.o0.b(x10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var3 = ((org.telegram.ui.s10) this.e).v;
                boolean g12 = x10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    i7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.p10 p10Var4 = x10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    p10Var4.a = messageObject4.getDialogId();
                    p10Var4.b = id5;
                    i7Var.e(x10Var3.o0.b(x10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var4 = ((org.telegram.ui.u10) this.e).v;
                boolean g13 = x10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.p10 p10Var5 = x10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    p10Var5.a = messageObject5.getDialogId();
                    p10Var5.b = id6;
                    n7Var.f(x10Var4.o0.b(x10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
