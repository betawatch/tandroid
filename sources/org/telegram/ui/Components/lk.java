package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ hm0 e;

    public /* synthetic */ lk(hm0 hm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = hm0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.y00 y00Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean s10 = nkVar.b.a1.s();
                boolean z10 = this.c;
                if (!s10) {
                    i7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    y00Var.a = messageObject.getDialogId();
                    y00Var.b = id2;
                    i7Var.b(nkVar.T.containsKey(y00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var = ((org.telegram.ui.z00) this.e).c;
                boolean g10 = g10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    r2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.y00 y00Var2 = g10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    y00Var2.a = messageObject2.getDialogId();
                    y00Var2.b = id3;
                    r2Var.V(g10Var.o0.b(g10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var2 = ((org.telegram.ui.b10) this.e).v;
                boolean g11 = g10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    i7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.y00 y00Var3 = g10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    y00Var3.a = messageObject3.getDialogId();
                    y00Var3.b = id4;
                    i7Var2.b(g10Var2.o0.b(g10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var3 = ((org.telegram.ui.b10) this.e).v;
                boolean g12 = g10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    h7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.y00 y00Var4 = g10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    y00Var4.a = messageObject4.getDialogId();
                    y00Var4.b = id5;
                    h7Var.e(g10Var3.o0.b(g10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.d;
                m7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var4 = ((org.telegram.ui.d10) this.e).v;
                boolean g13 = g10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    m7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.y00 y00Var5 = g10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    y00Var5.a = messageObject5.getDialogId();
                    y00Var5.b = id6;
                    m7Var.f(g10Var4.o0.b(g10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
