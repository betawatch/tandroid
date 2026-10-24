package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class sn0 extends s4.o {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ xn0 k;

    public sn0(xn0 xn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.k = xn0Var;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = i14;
        this.g = arrayList;
        this.h = i15;
        this.i = i16;
        this.j = arrayList2;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        xn0 xn0Var = this.k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.c && i11 == xn0Var.s) {
                return true;
            }
            if (i10 == this.d && i11 == xn0Var.x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i12 = this.e;
        if (i10 < i12 || i10 >= this.f) {
            int i13 = this.h;
            messageObject = (i10 < i13 || i10 >= this.i) ? null : (MessageObject) this.j.get(i10 - i13);
        } else {
            messageObject = (MessageObject) this.g.get(i10 - i12);
        }
        int i14 = xn0Var.v;
        if (i11 < i14 || i11 >= xn0Var.w) {
            int i15 = xn0Var.y;
            if (i11 >= i15 && i11 < xn0Var.E) {
                messageObject2 = (MessageObject) xn0Var.f.get(i11 - i15);
            }
        } else {
            messageObject2 = (MessageObject) xn0Var.e.get(i11 - i14);
        }
        return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().id != messageObject.getDocument().id) ? false : true;
    }

    @Override // s4.o
    public final int d() {
        return this.k.r;
    }

    @Override // s4.o
    public final int e() {
        return this.b;
    }
}
