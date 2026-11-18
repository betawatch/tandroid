package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.t5 B;
    public int C;
    public int D;
    public final /* synthetic */ r1 E;
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
    public vy0 q;
    public org.telegram.ui.Components.t5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public uh.b x;
    public org.telegram.ui.Components.b9 y;
    public ImageReceiver z;

    public q1(r1 r1Var) {
        this.E = r1Var;
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
            bVar.F.e();
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
            bVar.F.f();
        }
    }
}
