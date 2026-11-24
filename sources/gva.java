// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gva extends FrameLayout implements gk7 {
    public final q5c a;
    public final wjb b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final fva h;
    public kyb n;
    public String r;

    public gva(Context context, boolean z, long j, int i, int i2, int i3, wjb wjbVar) {
        super(context);
        this.d = i;
        this.e = z;
        this.c = i2;
        this.f = j;
        this.b = wjbVar;
        this.h = new fva(i2, i, j, z);
        byte b = 27;
        q5c q5cVar = new q5c(context, i2, i3, true, new tf8(this, (byte) 28), new wh9(this, b), null, wjbVar);
        this.a = q5cVar;
        addView(q5cVar, nme.c(-1.0f, -1));
        q5cVar.setOnScrollListener(new n58(this, b));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.A3;
        q5c q5cVar = this.a;
        if (i == i3) {
            q5cVar.g3.O(true);
            if (q5cVar.canScrollVertically(1)) {
                for (int i4 = 0; i4 < q5cVar.getChildCount(); i4++) {
                    if (!(q5cVar.getChildAt(i4) instanceof pi4)) {
                    }
                }
                return;
            }
            this.h.run();
            return;
        }
        if (i == kk7.E3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                q5cVar.g3.O(true);
            }
        } else {
            if (i != kk7.c4 || this.n == null || TextUtils.equals(this.r, c.C(this.c).x())) {
                return;
            }
            q5cVar.g3.O(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.f;
        int i = this.c;
        if (j != 0) {
            kk7.f(i).b(this, kk7.E3);
        } else {
            kk7.f(i).b(this, kk7.A3);
            if (this.e) {
                kk7.f(i).b(this, kk7.c4);
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
            kk7.f(i).n(this, kk7.E3);
            return;
        }
        kk7.f(i).n(this, kk7.A3);
        if (this.e) {
            kk7.f(i).n(this, kk7.c4);
        }
    }
}
