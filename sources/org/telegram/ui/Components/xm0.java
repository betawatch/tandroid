package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xm0 extends f2.q {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ cn0 k;

    public xm0(cn0 cn0Var, int i10, int i11, int i12, int i13, int i14, ArrayList arrayList, int i15, int i16, ArrayList arrayList2) {
        this.k = cn0Var;
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

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        MessageObject messageObject;
        cn0 cn0Var = this.k;
        if (i10 >= 0 && i11 >= 0) {
            if (i10 == this.c && i11 == cn0Var.s) {
                return true;
            }
            if (i10 == this.d && i11 == cn0Var.x) {
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
        int i14 = cn0Var.v;
        if (i11 < i14 || i11 >= cn0Var.w) {
            int i15 = cn0Var.y;
            if (i11 >= i15 && i11 < cn0Var.B) {
                messageObject2 = (MessageObject) cn0Var.f.get(i11 - i15);
            }
        } else {
            messageObject2 = (MessageObject) cn0Var.e.get(i11 - i14);
        }
        return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().id != messageObject.getDocument().id) ? false : true;
    }

    @Override // f2.q
    public final int d() {
        return this.k.r;
    }

    @Override // f2.q
    public final int e() {
        return this.b;
    }
}
