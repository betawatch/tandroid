// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kxa extends FrameLayout implements jm7 {
    public final q7c a;
    public final ylb b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final jxa h;
    public l0c n;
    public String r;

    public kxa(Context context, boolean z, long j, int i, int i2, int i3, ylb ylbVar) {
        super(context);
        this.d = i;
        this.e = z;
        this.c = i2;
        this.f = j;
        this.b = ylbVar;
        this.h = new jxa(i2, i, j, z);
        byte b = 28;
        q7c q7cVar = new q7c(context, i2, i3, true, new vh8(this, b), new wta(this, (byte) 1), null, ylbVar);
        this.a = q7cVar;
        addView(q7cVar, qoe.c(-1.0f, -1));
        q7cVar.setOnScrollListener(new so7(this, b));
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.B3;
        q7c q7cVar = this.a;
        if (i == i3) {
            q7cVar.g3.O(true);
            if (q7cVar.canScrollVertically(1)) {
                for (int i4 = 0; i4 < q7cVar.getChildCount(); i4++) {
                    if (!(q7cVar.getChildAt(i4) instanceof tk4)) {
                    }
                }
                return;
            }
            this.h.run();
            return;
        }
        if (i == nm7.F3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                q7cVar.g3.O(true);
            }
        } else {
            if (i != nm7.e4 || this.n == null || TextUtils.equals(this.r, c.C(this.c).x())) {
                return;
            }
            q7cVar.g3.O(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.f;
        int i = this.c;
        if (j != 0) {
            nm7.f(i).b(this, nm7.F3);
        } else {
            nm7.f(i).b(this, nm7.B3);
            if (this.e) {
                nm7.f(i).b(this, nm7.e4);
            }
        }
        this.a.g3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j = this.f;
        int i = this.c;
        if (j != 0) {
            nm7.f(i).n(this, nm7.F3);
            return;
        }
        nm7.f(i).n(this, nm7.B3);
        if (this.e) {
            nm7.f(i).n(this, nm7.e4);
        }
    }
}
