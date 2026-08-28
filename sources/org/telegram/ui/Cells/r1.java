package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 {
    public StaticLayout A;
    public org.telegram.ui.Components.p5 B;
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
    public nz0 q;
    public org.telegram.ui.Components.p5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public ah.b x;
    public org.telegram.ui.Components.z8 y;
    public ImageReceiver z;

    public r1(t1 t1Var) {
        this.E = t1Var;
    }

    public static /* synthetic */ void n(r1 r1Var, float f10) {
        r1Var.e -= f10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        ah.b bVar = this.x;
        if (bVar != null) {
            bVar.b.a();
            bVar.c.onAttachedToWindow();
            bVar.A.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        ah.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.onDetachedFromWindow();
            bVar.A.f();
        }
    }
}
