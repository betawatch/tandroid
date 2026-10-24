package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ lm0 e;

    public /* synthetic */ lk(lm0 lm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
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
                mk mkVar = (mk) this.e;
                org.telegram.ui.a10 a10Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean s10 = nkVar.b.a1.s();
                boolean z10 = this.c;
                if (!s10) {
                    k7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    a10Var.a = messageObject.getDialogId();
                    a10Var.b = id2;
                    k7Var.b(nkVar.T.containsKey(a10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.d;
                q2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var = ((org.telegram.ui.b10) this.e).c;
                boolean g10 = i10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    q2Var.U(false, z11);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var2 = i10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    a10Var2.a = messageObject2.getDialogId();
                    a10Var2.b = id3;
                    q2Var.U(i10Var.o0.b(i10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var2 = ((org.telegram.ui.d10) this.e).v;
                boolean g11 = i10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    k7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var3 = i10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    a10Var3.a = messageObject3.getDialogId();
                    a10Var3.b = id4;
                    k7Var2.b(i10Var2.o0.b(i10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var3 = ((org.telegram.ui.d10) this.e).v;
                boolean g12 = i10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    j7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var4 = i10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    a10Var4.a = messageObject4.getDialogId();
                    a10Var4.b = id5;
                    j7Var.e(i10Var3.o0.b(i10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var4 = ((org.telegram.ui.f10) this.e).v;
                boolean g13 = i10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var5 = i10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    a10Var5.a = messageObject5.getDialogId();
                    a10Var5.b = id6;
                    n7Var.f(i10Var4.o0.b(i10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
