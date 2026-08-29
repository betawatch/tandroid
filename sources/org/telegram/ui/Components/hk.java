package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ il0 e;

    public /* synthetic */ hk(il0 il0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = il0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ik ikVar = (ik) this.e;
                org.telegram.ui.z00 z00Var = ikVar.D;
                jk jkVar = ikVar.T;
                boolean s10 = jkVar.b.T0.s();
                boolean z10 = this.c;
                if (!s10) {
                    g7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    z00Var.a = messageObject.getDialogId();
                    z00Var.b = id2;
                    g7Var.b(jkVar.P.containsKey(z00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var = ((org.telegram.ui.a10) this.e).c;
                boolean f9 = h10Var.k0.f();
                boolean z11 = this.c;
                if (!f9) {
                    p2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.z00 z00Var2 = h10Var.O;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    z00Var2.a = messageObject2.getDialogId();
                    z00Var2.b = id3;
                    p2Var.V(h10Var.k0.b(h10Var.O), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var2 = ((org.telegram.ui.c10) this.e).v;
                boolean f10 = h10Var2.k0.f();
                boolean z12 = this.c;
                if (!f10) {
                    g7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.z00 z00Var3 = h10Var2.O;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    z00Var3.a = messageObject3.getDialogId();
                    z00Var3.b = id4;
                    g7Var2.b(h10Var2.k0.b(h10Var2.O), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var3 = ((org.telegram.ui.c10) this.e).v;
                boolean f11 = h10Var3.k0.f();
                boolean z13 = this.c;
                if (!f11) {
                    f7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.z00 z00Var4 = h10Var3.O;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    z00Var4.a = messageObject4.getDialogId();
                    z00Var4.b = id5;
                    f7Var.e(h10Var3.k0.b(h10Var3.O), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var4 = ((org.telegram.ui.e10) this.e).v;
                boolean f12 = h10Var4.k0.f();
                boolean z14 = this.c;
                if (!f12) {
                    j7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.z00 z00Var5 = h10Var4.O;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    z00Var5.a = messageObject5.getDialogId();
                    z00Var5.b = id6;
                    j7Var.f(h10Var4.k0.b(h10Var4.O), z14);
                    break;
                }
        }
        return true;
    }
}
