package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ vk0 e;

    public /* synthetic */ dk(vk0 vk0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i9) {
        this.a = i9;
        this.e = vk0Var;
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
                ek ekVar = (ek) this.e;
                org.telegram.ui.x00 x00Var = ekVar.D;
                fk fkVar = ekVar.T;
                boolean s10 = fkVar.b.T0.s();
                boolean z10 = this.c;
                if (!s10) {
                    i7Var.b(false, z10);
                    break;
                } else {
                    MessageObject messageObject = this.b;
                    int id2 = messageObject.getId();
                    x00Var.a = messageObject.getDialogId();
                    x00Var.b = id2;
                    i7Var.b(fkVar.P.containsKey(x00Var), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var = ((org.telegram.ui.y00) this.e).c;
                boolean f10 = f10Var.k0.f();
                boolean z11 = this.c;
                if (!f10) {
                    r2Var.U(false, z11);
                    break;
                } else {
                    org.telegram.ui.x00 x00Var2 = f10Var.O;
                    MessageObject messageObject2 = this.b;
                    int id3 = messageObject2.getId();
                    x00Var2.a = messageObject2.getDialogId();
                    x00Var2.b = id3;
                    r2Var.U(f10Var.k0.b(f10Var.O), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var2 = ((org.telegram.ui.a10) this.e).v;
                boolean f11 = f10Var2.k0.f();
                boolean z12 = this.c;
                if (!f11) {
                    i7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.x00 x00Var3 = f10Var2.O;
                    MessageObject messageObject3 = this.b;
                    int id4 = messageObject3.getId();
                    x00Var3.a = messageObject3.getDialogId();
                    x00Var3.b = id4;
                    i7Var2.b(f10Var2.k0.b(f10Var2.O), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var3 = ((org.telegram.ui.a10) this.e).v;
                boolean f12 = f10Var3.k0.f();
                boolean z13 = this.c;
                if (!f12) {
                    h7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.x00 x00Var4 = f10Var3.O;
                    MessageObject messageObject4 = this.b;
                    int id5 = messageObject4.getId();
                    x00Var4.a = messageObject4.getDialogId();
                    x00Var4.b = id5;
                    h7Var.e(f10Var3.k0.b(f10Var3.O), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var4 = ((org.telegram.ui.c10) this.e).v;
                boolean f13 = f10Var4.k0.f();
                boolean z14 = this.c;
                if (!f13) {
                    l7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.x00 x00Var5 = f10Var4.O;
                    MessageObject messageObject5 = this.b;
                    int id6 = messageObject5.getId();
                    x00Var5.a = messageObject5.getDialogId();
                    x00Var5.b = id6;
                    l7Var.f(f10Var4.k0.b(f10Var4.O), z14);
                    break;
                }
        }
        return true;
    }
}
