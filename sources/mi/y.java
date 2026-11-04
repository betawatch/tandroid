package mi;

import android.content.Context;
import android.widget.FrameLayout;
import b8.ne;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements k4 {
    public a a;
    public final l5.c b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public y(Context context) {
        super(context);
        l5.c cVar = new l5.c();
        cVar.a = Long.MIN_VALUE;
        cVar.b = -1;
        this.b = cVar;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new l5.b(this, 6));
    }

    public int d() {
        return 0;
    }

    public void e(int i3) {
        int i10;
        int d = ne.d(this.a);
        int i11 = 0;
        int d10 = (i3 > 0 || d > 0) ? d() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i10 = this.e;
        } else {
            i10 = aVar.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i11 = this.h;
        } else {
            if (aVar2.m > 0) {
                i11 = org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r7, 1, 16, 10));
            }
        }
        int i12 = i3 + d10;
        int i13 = d + d10;
        int i14 = this.d;
        int i15 = this.f;
        if (bd.a0) {
            setPadding(i14 + i13, i10, i15 + i12, i11);
        } else {
            setPadding(i14 + i12, i10, i15 + i13, i11);
        }
    }

    public final void f(int i3, int i10, int i11, int i12) {
        this.d = i3;
        this.e = i10;
        this.f = i11;
        this.h = i12;
        int i13 = this.c;
        if (bd.a0) {
            setPadding(i3, i10, i11 + i13, i12);
        } else {
            setPadding(i3 + i13, i10, i11, i12);
        }
    }
}
