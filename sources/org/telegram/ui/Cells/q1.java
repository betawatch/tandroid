package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q1 {
    public StaticLayout A;
    public org.telegram.ui.Components.q5 B;
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
    public k01 q;
    public org.telegram.ui.Components.q5 r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public Drawable w;
    public fh.b x;
    public org.telegram.ui.Components.z8 y;
    public ImageReceiver z;

    public q1(s1 s1Var) {
        this.E = s1Var;
    }

    public static /* synthetic */ void n(q1 q1Var, float f10) {
        q1Var.e -= f10;
    }

    public final void q() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        fh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.a();
            bVar.c.onAttachedToWindow();
            bVar.B.e();
        }
    }

    public final void r() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        fh.b bVar = this.x;
        if (bVar != null) {
            bVar.b.b();
            bVar.c.onDetachedFromWindow();
            bVar.B.f();
        }
    }
}
