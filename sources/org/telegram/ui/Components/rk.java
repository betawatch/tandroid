package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ul0 e;

    public /* synthetic */ rk(ul0 ul0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = ul0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                sk skVar = (sk) this.e;
                org.telegram.ui.r10 r10Var = skVar.H;
                tk tkVar = skVar.X;
                boolean s10 = tkVar.b.X0.s();
                boolean z10 = this.c;
                if (!s10) {
                    l7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    r10Var.a = messageObject.getDialogId();
                    r10Var.b = id2;
                    l7Var.b(tkVar.T.containsKey(r10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var = ((org.telegram.ui.s10) this.e).c;
                boolean f7 = z10Var.o0.f();
                boolean z11 = this.c;
                if (!f7) {
                    r2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.r10 r10Var2 = z10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    r10Var2.a = messageObject2.getDialogId();
                    r10Var2.b = id3;
                    r2Var.V(z10Var.o0.b(z10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var2 = ((org.telegram.ui.u10) this.e).v;
                boolean f10 = z10Var2.o0.f();
                boolean z12 = this.c;
                if (!f10) {
                    l7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.r10 r10Var3 = z10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    r10Var3.a = messageObject3.getDialogId();
                    r10Var3.b = id4;
                    l7Var2.b(z10Var2.o0.b(z10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var3 = ((org.telegram.ui.u10) this.e).v;
                boolean f11 = z10Var3.o0.f();
                boolean z13 = this.c;
                if (!f11) {
                    k7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.r10 r10Var4 = z10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    r10Var4.a = messageObject4.getDialogId();
                    r10Var4.b = id5;
                    k7Var.e(z10Var3.o0.b(z10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var4 = ((org.telegram.ui.w10) this.e).v;
                boolean f12 = z10Var4.o0.f();
                boolean z14 = this.c;
                if (!f12) {
                    o7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.r10 r10Var5 = z10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    r10Var5.a = messageObject5.getDialogId();
                    r10Var5.b = id6;
                    o7Var.f(z10Var4.o0.b(z10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
