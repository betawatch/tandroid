package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ sl0 e;

    public /* synthetic */ hk(sl0 sl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z4, int i10) {
        this.a = i10;
        this.e = sl0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ik ikVar = (ik) this.e;
                org.telegram.ui.l10 l10Var = ikVar.E;
                jk jkVar = ikVar.U;
                boolean s6 = jkVar.b.U0.s();
                boolean z4 = this.c;
                if (!s6) {
                    i7Var.b(false, z4);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    l10Var.a = messageObject.getDialogId();
                    l10Var.b = id2;
                    i7Var.b(jkVar.Q.containsKey(l10Var), z4);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var = ((org.telegram.ui.m10) this.e).c;
                boolean f10 = t10Var.l0.f();
                boolean z10 = this.c;
                if (!f10) {
                    r2Var.V(false, z10);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var2 = t10Var.P;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    l10Var2.a = messageObject2.getDialogId();
                    l10Var2.b = id3;
                    r2Var.V(t10Var.l0.b(t10Var.P), z10);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var2 = ((org.telegram.ui.o10) this.e).v;
                boolean f11 = t10Var2.l0.f();
                boolean z11 = this.c;
                if (!f11) {
                    i7Var2.b(false, z11);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var3 = t10Var2.P;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    l10Var3.a = messageObject3.getDialogId();
                    l10Var3.b = id4;
                    i7Var2.b(t10Var2.l0.b(t10Var2.P), z11);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var3 = ((org.telegram.ui.o10) this.e).v;
                boolean f12 = t10Var3.l0.f();
                boolean z12 = this.c;
                if (!f12) {
                    h7Var.e(false, z12);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var4 = t10Var3.P;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    l10Var4.a = messageObject4.getDialogId();
                    l10Var4.b = id5;
                    h7Var.e(t10Var3.l0.b(t10Var3.P), z12);
                    break;
                }
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var4 = ((org.telegram.ui.q10) this.e).v;
                boolean f13 = t10Var4.l0.f();
                boolean z13 = this.c;
                if (!f13) {
                    l7Var.f(false, z13);
                    break;
                } else {
                    org.telegram.ui.l10 l10Var5 = t10Var4.P;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    l10Var5.a = messageObject5.getDialogId();
                    l10Var5.b = id6;
                    l7Var.f(t10Var4.l0.b(t10Var4.P), z13);
                    break;
                }
        }
        return true;
    }
}
