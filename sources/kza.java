// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kza extends FrameLayout implements fn7 {
    public final q9c a;
    public final vnb b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final jza h;
    public k2c n;
    public String r;

    public kza(Context context, boolean z, long j, int i, int i2, int i3, vnb vnbVar) {
        super(context);
        this.d = i;
        this.e = z;
        this.c = i2;
        this.f = j;
        this.b = vnbVar;
        this.h = new jza(i2, i, j, z);
        q9c q9cVar = new q9c(context, i2, i3, true, new hj8(this, (byte) 28), new hja(this, (byte) 10), null, vnbVar);
        this.a = q9cVar;
        addView(q9cVar, tre.c(-1.0f, -1));
        q9cVar.setOnScrollListener(new e98(this, (byte) 27));
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.B3;
        q9c q9cVar = this.a;
        if (i == i3) {
            q9cVar.g3.O(true);
            if (q9cVar.canScrollVertically(1)) {
                for (int i4 = 0; i4 < q9cVar.getChildCount(); i4++) {
                    if (!(q9cVar.getChildAt(i4) instanceof tk4)) {
                    }
                }
                return;
            }
            this.h.run();
            return;
        }
        if (i == jn7.F3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                q9cVar.g3.O(true);
            }
        } else {
            if (i != jn7.d4 || this.n == null || TextUtils.equals(this.r, c.C(this.c).x())) {
                return;
            }
            q9cVar.g3.O(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.f;
        int i = this.c;
        if (j != 0) {
            jn7.f(i).b(this, jn7.F3);
        } else {
            jn7.f(i).b(this, jn7.B3);
            if (this.e) {
                jn7.f(i).b(this, jn7.d4);
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
            jn7.f(i).n(this, jn7.F3);
            return;
        }
        jn7.f(i).n(this, jn7.B3);
        if (this.e) {
            jn7.f(i).n(this, jn7.d4);
        }
    }
}
