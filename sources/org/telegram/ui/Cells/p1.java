package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.k5 B;
    public int C;
    public int D;
    public final /* synthetic */ q1 E;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public boolean o;
    public StaticLayout p;
    public qz0 q;
    public org.telegram.ui.Components.k5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public kh.b x;
    public org.telegram.ui.Components.r8 y;
    public ImageReceiver z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        kh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.a();
            bVar.c.P();
            bVar.E.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        kh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.R();
            bVar.E.f();
        }
    }
}
