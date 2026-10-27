package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ mm0 e;

    public /* synthetic */ lk(mm0 mm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = mm0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.b10 b10Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean q5 = nkVar.b.a1.q();
                boolean z10 = this.c;
                if (!q5) {
                    o7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    b10Var.a = messageObject.getDialogId();
                    b10Var.b = id2;
                    o7Var.b(nkVar.T.containsKey(b10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var = ((org.telegram.ui.c10) this.e).c;
                boolean g7 = j10Var.o0.g();
                boolean z11 = this.c;
                if (!g7) {
                    p2Var.U(false, z11);
                    break;
                } else {
                    org.telegram.ui.b10 b10Var2 = j10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    b10Var2.a = messageObject2.getDialogId();
                    b10Var2.b = id3;
                    p2Var.U(j10Var.o0.c(j10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) this.d;
                o7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var2 = ((org.telegram.ui.e10) this.e).v;
                boolean g10 = j10Var2.o0.g();
                boolean z12 = this.c;
                if (!g10) {
                    o7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.b10 b10Var3 = j10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    b10Var3.a = messageObject3.getDialogId();
                    b10Var3.b = id4;
                    o7Var2.b(j10Var2.o0.c(j10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var3 = ((org.telegram.ui.e10) this.e).v;
                boolean g11 = j10Var3.o0.g();
                boolean z13 = this.c;
                if (!g11) {
                    n7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.b10 b10Var4 = j10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    b10Var4.a = messageObject4.getDialogId();
                    b10Var4.b = id5;
                    n7Var.e(j10Var3.o0.c(j10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.d;
                r7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var4 = ((org.telegram.ui.g10) this.e).v;
                boolean g12 = j10Var4.o0.g();
                boolean z14 = this.c;
                if (!g12) {
                    r7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.b10 b10Var5 = j10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    b10Var5.a = messageObject5.getDialogId();
                    b10Var5.b = id6;
                    r7Var.f(j10Var4.o0.c(j10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
