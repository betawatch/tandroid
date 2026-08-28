package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bm0 extends f2.s {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ gm0 k;

    public bm0(gm0 gm0Var, int i9, int i10, int i11, int i12, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        this.k = gm0Var;
        this.b = i9;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
        this.g = arrayList;
        this.h = i14;
        this.i = i15;
        this.j = arrayList2;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        MessageObject messageObject;
        gm0 gm0Var = this.k;
        if (i9 >= 0 && i10 >= 0) {
            if (i9 == this.c && i10 == gm0Var.s) {
                return true;
            }
            if (i9 == this.d && i10 == gm0Var.x) {
                return true;
            }
        }
        MessageObject messageObject2 = null;
        int i11 = this.e;
        if (i9 < i11 || i9 >= this.f) {
            int i12 = this.h;
            messageObject = (i9 < i12 || i9 >= this.i) ? null : (MessageObject) this.j.get(i9 - i12);
        } else {
            messageObject = (MessageObject) this.g.get(i9 - i11);
        }
        int i13 = gm0Var.v;
        if (i10 < i13 || i10 >= gm0Var.w) {
            int i14 = gm0Var.y;
            if (i10 >= i14 && i10 < gm0Var.A) {
                messageObject2 = (MessageObject) gm0Var.f.get(i10 - i14);
            }
        } else {
            messageObject2 = (MessageObject) gm0Var.e.get(i10 - i13);
        }
        return (messageObject2 == null || messageObject == null || messageObject2.getDocument() == null || messageObject.getDocument() == null || messageObject2.getDocument().id != messageObject.getDocument().id) ? false : true;
    }

    @Override // f2.s
    public final int d() {
        return this.k.r;
    }

    @Override // f2.s
    public final int e() {
        return this.b;
    }
}
