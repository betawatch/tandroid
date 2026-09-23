package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ll0 e;

    public /* synthetic */ nk(ll0 ll0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = ll0Var;
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
                ok okVar = (ok) this.e;
                org.telegram.ui.m10 m10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean s10 = pkVar.b.X0.s();
                boolean z10 = this.c;
                if (!s10) {
                    j7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    m10Var.a = messageObject.getDialogId();
                    m10Var.b = id2;
                    j7Var.b(pkVar.T.containsKey(m10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var = ((org.telegram.ui.n10) this.e).c;
                boolean g10 = u10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    r2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var2 = u10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    m10Var2.a = messageObject2.getDialogId();
                    m10Var2.b = id3;
                    r2Var.V(u10Var.o0.c(u10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var2 = ((org.telegram.ui.p10) this.e).v;
                boolean g11 = u10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    j7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var3 = u10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    m10Var3.a = messageObject3.getDialogId();
                    m10Var3.b = id4;
                    j7Var2.b(u10Var2.o0.c(u10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var3 = ((org.telegram.ui.p10) this.e).v;
                boolean g12 = u10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    i7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var4 = u10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    m10Var4.a = messageObject4.getDialogId();
                    m10Var4.b = id5;
                    i7Var.e(u10Var3.o0.c(u10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var4 = ((org.telegram.ui.r10) this.e).v;
                boolean g13 = u10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.m10 m10Var5 = u10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    m10Var5.a = messageObject5.getDialogId();
                    m10Var5.b = id6;
                    n7Var.f(u10Var4.o0.c(u10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
