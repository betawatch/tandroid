package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.t10 t10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean t10 = pkVar.b.a1.t();
                boolean z10 = this.c;
                if (!t10) {
                    j7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    t10Var.a = messageObject.getDialogId();
                    t10Var.b = id2;
                    j7Var.b(pkVar.T.containsKey(t10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var = ((org.telegram.ui.u10) this.e).c;
                boolean g10 = b20Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    s2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.t10 t10Var2 = b20Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    t10Var2.a = messageObject2.getDialogId();
                    t10Var2.b = id3;
                    s2Var.V(b20Var.o0.b(b20Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var2 = ((org.telegram.ui.w10) this.e).v;
                boolean g11 = b20Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    j7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.t10 t10Var3 = b20Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    t10Var3.a = messageObject3.getDialogId();
                    t10Var3.b = id4;
                    j7Var2.b(b20Var2.o0.b(b20Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var3 = ((org.telegram.ui.w10) this.e).v;
                boolean g12 = b20Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    i7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.t10 t10Var4 = b20Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    t10Var4.a = messageObject4.getDialogId();
                    t10Var4.b = id5;
                    i7Var.e(b20Var3.o0.b(b20Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var4 = ((org.telegram.ui.y10) this.e).v;
                boolean g13 = b20Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    n7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.t10 t10Var5 = b20Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    t10Var5.a = messageObject5.getDialogId();
                    t10Var5.b = id6;
                    n7Var.f(b20Var4.o0.b(b20Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
