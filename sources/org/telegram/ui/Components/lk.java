package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ im0 e;

    public /* synthetic */ lk(im0 im0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = im0Var;
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
                org.telegram.ui.w00 w00Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean t10 = nkVar.b.a1.t();
                boolean z10 = this.c;
                if (!t10) {
                    i7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    w00Var.a = messageObject.getDialogId();
                    w00Var.b = id2;
                    i7Var.b(nkVar.T.containsKey(w00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var = ((org.telegram.ui.x00) this.e).c;
                boolean g10 = e10Var.o0.g();
                boolean z11 = this.c;
                if (!g10) {
                    r2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.w00 w00Var2 = e10Var.S;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    w00Var2.a = messageObject2.getDialogId();
                    w00Var2.b = id3;
                    r2Var.V(e10Var.o0.b(e10Var.S), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var2 = ((org.telegram.ui.z00) this.e).v;
                boolean g11 = e10Var2.o0.g();
                boolean z12 = this.c;
                if (!g11) {
                    i7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.w00 w00Var3 = e10Var2.S;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    w00Var3.a = messageObject3.getDialogId();
                    w00Var3.b = id4;
                    i7Var2.b(e10Var2.o0.b(e10Var2.S), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var3 = ((org.telegram.ui.z00) this.e).v;
                boolean g12 = e10Var3.o0.g();
                boolean z13 = this.c;
                if (!g12) {
                    h7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.w00 w00Var4 = e10Var3.S;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    w00Var4.a = messageObject4.getDialogId();
                    w00Var4.b = id5;
                    h7Var.e(e10Var3.o0.b(e10Var3.S), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.d;
                m7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var4 = ((org.telegram.ui.b10) this.e).v;
                boolean g13 = e10Var4.o0.g();
                boolean z14 = this.c;
                if (!g13) {
                    m7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.w00 w00Var5 = e10Var4.S;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    w00Var5.a = messageObject5.getDialogId();
                    w00Var5.b = id6;
                    m7Var.f(e10Var4.o0.b(e10Var4.S), z14);
                    break;
                }
        }
        return true;
    }
}
