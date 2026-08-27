package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ yk0 e;

    public /* synthetic */ zj(yk0 yk0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.a = i10;
        this.e = yk0Var;
        this.d = viewGroup;
        this.b = messageObject;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ak akVar = (ak) this.e;
                org.telegram.ui.a10 a10Var = akVar.D;
                bk bkVar = akVar.T;
                boolean t10 = bkVar.b.T0.t();
                boolean z10 = this.c;
                if (!t10) {
                    f7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    a10Var.a = messageObject.getDialogId();
                    a10Var.b = id2;
                    f7Var.b(bkVar.P.containsKey(a10Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var = ((org.telegram.ui.b10) this.e).c;
                boolean f10 = i10Var.k0.f();
                boolean z11 = this.c;
                if (!f10) {
                    p2Var.V(false, z11);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var2 = i10Var.O;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    a10Var2.a = messageObject2.getDialogId();
                    a10Var2.b = id3;
                    p2Var.V(i10Var.k0.b(i10Var.O), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) this.d;
                f7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var2 = ((org.telegram.ui.d10) this.e).v;
                boolean f11 = i10Var2.k0.f();
                boolean z12 = this.c;
                if (!f11) {
                    f7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var3 = i10Var2.O;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    a10Var3.a = messageObject3.getDialogId();
                    a10Var3.b = id4;
                    f7Var2.b(i10Var2.k0.b(i10Var2.O), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) this.d;
                e7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var3 = ((org.telegram.ui.d10) this.e).v;
                boolean f12 = i10Var3.k0.f();
                boolean z13 = this.c;
                if (!f12) {
                    e7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var4 = i10Var3.O;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    a10Var4.a = messageObject4.getDialogId();
                    a10Var4.b = id5;
                    e7Var.e(i10Var3.k0.b(i10Var3.O), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var4 = ((org.telegram.ui.f10) this.e).v;
                boolean f13 = i10Var4.k0.f();
                boolean z14 = this.c;
                if (!f13) {
                    i7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.a10 a10Var5 = i10Var4.O;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    a10Var5.a = messageObject5.getDialogId();
                    a10Var5.b = id6;
                    i7Var.f(i10Var4.k0.b(i10Var4.O), z14);
                    break;
                }
        }
        return true;
    }
}
