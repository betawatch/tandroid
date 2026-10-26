package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ bh.x0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ un s;

    public oi(un unVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, bh.x0 x0Var, MessageObject messageObject) {
        this.s = unVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = fl0Var;
        this.f = f7;
        this.h = f10;
        this.n = x0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            un unVar = this.s;
            if (unVar.yc != null) {
                unVar.yc = null;
                if (this.b) {
                    unVar.o8(new ni(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    unVar.o8(new ed(18, this, this.r));
                }
                unVar.H7(true);
            }
        }
    }
}
