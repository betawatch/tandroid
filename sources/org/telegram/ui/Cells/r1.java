package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.w5 B;
    public int C;
    public int D;
    public final /* synthetic */ t1 E;
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
    public i11 q;
    public org.telegram.ui.Components.w5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public th.b x;
    public org.telegram.ui.Components.h9 y;
    public ImageReceiver z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static /* synthetic */ void n(r1 r1Var, float f7) {
        r1Var.e -= f7;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        th.b bVar = this.x;
        if (bVar != null) {
            bVar.b.a();
            bVar.c.onAttachedToWindow();
            bVar.E.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        th.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
