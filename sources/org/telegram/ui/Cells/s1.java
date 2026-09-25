package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s1 {
    public StaticLayout A;
    public org.telegram.ui.Components.v5 B;
    public int C;
    public int D;
    public final /* synthetic */ u1 E;
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
    public t01 q;
    public org.telegram.ui.Components.v5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public sh.b x;
    public org.telegram.ui.Components.h9 y;
    public ImageReceiver z;

    public s1(u1 u1Var) {
        this.E = u1Var;
    }

    public static /* synthetic */ void n(s1 s1Var, float f7) {
        s1Var.e -= f7;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        sh.b bVar = this.x;
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
        sh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.onDetachedFromWindow();
            bVar.E.f();
        }
    }
}
