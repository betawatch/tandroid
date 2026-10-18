package fh;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.j;
import b2.d1;
import b2.z0;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.k;
import e2.g0;
import e2.o;
import e9.d2;
import e9.r1;
import e9.t1;
import e9.u0;
import e9.u1;
import e9.v0;
import e9.w0;
import e9.y0;
import eh.d;
import gi.d3;
import gi.e4;
import gi.z3;
import i2.m;
import j$.util.Objects;
import j2.f;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cw0;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements d, aw0, bw0, GenericProvider, k, r9.d, o, a2, hh.b {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return ShortcutManager.class;
    }

    @Override // hh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 26:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 27:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i10 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i10);
            default:
                int i11 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i11 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i11);
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 14:
                String str = (String) obj;
                d9.a aVar = h9.a.g;
                aVar.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (aVar.c(str.charAt(length))) {
                            length--;
                        } else {
                            z10 = false;
                        }
                    }
                }
                if (z10 && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                sb2.append('\"');
                while (r1 < str.length()) {
                    char charAt = str.charAt(r1);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb2.append('\\');
                    }
                    sb2.append(charAt);
                    r1++;
                }
                sb2.append('\"');
                return sb2.toString();
            case 15:
                Collection collection = (Collection) obj;
                int i10 = w0.d;
                if (collection instanceof w0) {
                    return (w0) collection;
                }
                boolean z11 = collection instanceof r1;
                int size = z11 ? ((v0) ((d2) ((r1) collection)).s()).size() : 11;
                u0 u0Var = new u0();
                u0Var.b = false;
                u1 u1Var = new u1();
                u1Var.d(size);
                u0Var.a = u1Var;
                if (z11) {
                    r1 r1Var = (r1) collection;
                    u1 u1Var2 = r1Var instanceof d2 ? ((d2) r1Var).e : null;
                    if (u1Var2 != null) {
                        u1Var.a(Math.max(u1Var.c, u1Var2.c));
                        r1 = u1Var2.c == 0 ? -1 : 0;
                        while (r1 >= 0) {
                            u6.j(r1, u1Var2.c);
                            Object obj2 = u1Var2.a[r1];
                            u6.j(r1, u1Var2.c);
                            u0Var.c(u1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= u1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        w0 w0Var = (w0) r1Var;
                        y0 t10 = w0Var.t();
                        u1 u1Var3 = u0Var.a;
                        u1Var3.a(Math.max(u1Var3.c, t10.size()));
                        for (t1 t1Var : w0Var.t()) {
                            u0Var.c(t1Var.a(), t1Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        u0Var.a(it.next());
                    }
                }
                Objects.requireNonNull(u0Var.a);
                if (u0Var.a.c == 0) {
                    return d2.n;
                }
                u0Var.b = true;
                return new d2(u0Var.a);
            default:
                return new f((g0) obj);
        }
    }

    @Override // org.telegram.ui.Components.bw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 8:
                d3 d3Var = (d3) obj;
                d3Var.b = f7;
                d3Var.e.invalidate();
                d3Var.W.setAlpha(f7);
                d3Var.F();
                d3Var.D();
                break;
            case 9:
            default:
                ((e4) obj).setSwipeOffsetY(f7);
                break;
            case 10:
                ((z3) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // eh.d
    public int f(d6 d6Var, boolean z10) {
        switch (this.a) {
            case 0:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return h6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, h6.w0(h6.d6, d6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 24:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public float get(Object obj) {
        switch (this.a) {
            case 7:
                return ((d3) obj).b;
            case 8:
            default:
                return ((e4) obj).getSwipeOffsetY();
            case 9:
                return ((z3) obj).c;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 22:
                ((d1) obj).onPlayerError(new m(2, new j("Player release timed out."), 1003));
                break;
            case 23:
                ((d1) obj).onRenderedFirstFrame();
                break;
            default:
                ((j2.b) obj).getClass();
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        cw0 cw0Var = e4.b0;
        return Boolean.FALSE;
    }

    public /* synthetic */ b(j2.a aVar, z0 z0Var) {
        this.a = 29;
    }
}
