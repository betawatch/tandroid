package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.y5 B;
    public int C;
    public int D;
    public final /* synthetic */ s1 E;
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
    public r11 q;
    public org.telegram.ui.Components.y5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public uh.b x;
    public org.telegram.ui.Components.j9 y;
    public ImageReceiver z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static /* synthetic */ void n(q1 q1Var, float f7) {
        q1Var.e -= f7;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        uh.b bVar = this.x;
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
        uh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
