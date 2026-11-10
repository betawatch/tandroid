package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p1 {
    public StaticLayout A;
    public org.telegram.ui.Components.m5 B;
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
    public my0 q;
    public org.telegram.ui.Components.m5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public uh.b x;
    public org.telegram.ui.Components.v8 y;
    public ImageReceiver z;

    public p1(q1 q1Var) {
        this.E = q1Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        uh.b bVar = this.x;
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
        uh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.R();
            bVar.E.f();
        }
    }
}
