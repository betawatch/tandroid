package ki;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public abstract class a0 extends FrameLayout implements l4 {
    public a a;
    public final j5.c b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public a0(Context context) {
        super(context);
        j5.c cVar = new j5.c();
        cVar.a = Long.MIN_VALUE;
        cVar.b = -1;
        this.b = cVar;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new j5.b(this, 2));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int i11;
        int d = w7.i.d(this.a);
        int i12 = 0;
        int e = (i10 > 0 || d > 0) ? e() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + e;
        int i14 = d + e;
        int i15 = this.d;
        int i16 = this.f;
        if (LocaleController.isRTL) {
            setPadding(i15 + i14, i11, i16 + i13, i12);
        } else {
            setPadding(i15 + i13, i11, i16 + i14, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f = i12;
        this.h = i13;
        int i14 = this.c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
