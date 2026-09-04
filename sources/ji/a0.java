package ji;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import v7.c9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class a0 extends FrameLayout implements l4 {
    public a a;
    public final j5.b b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public a0(Context context) {
        super(context);
        j5.b bVar = new j5.b();
        bVar.a = Long.MIN_VALUE;
        bVar.b = -1;
        this.b = bVar;
    }

    public final void c(a aVar) {
        this.b.a(aVar, new fi.f(this, 22));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int i11;
        int d = c9.d(this.a);
        int i12 = 0;
        int e7 = (i10 > 0 || d > 0) ? e() : 0;
        a aVar = this.a;
        if (aVar == null || !aVar.n) {
            i11 = this.e;
        } else {
            i11 = aVar.l <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r3, 1, 16, 10));
        }
        a aVar2 = this.a;
        if (aVar2 == null || !aVar2.o) {
            i12 = this.h;
        } else {
            if (aVar2.m > 0) {
                i12 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r7, 1, 16, 10));
            }
        }
        int i13 = i10 + e7;
        int i14 = d + e7;
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
