package fi;

import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.internal.cast.z5;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements fw0, gw0, GenericProvider, d9.k, r9.d, e2.o, org.telegram.ui.ActionBar.z1, hh.b {
    public final /* synthetic */ int a;

    public /* synthetic */ c2(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return ShortcutManager.class;
    }

    @Override // hh.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 24:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 25:
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
            case 12:
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
            case 13:
                Collection collection = (Collection) obj;
                int i10 = e9.w0.d;
                if (collection instanceof e9.w0) {
                    return (e9.w0) collection;
                }
                boolean z11 = collection instanceof e9.r1;
                int size = z11 ? ((e9.v0) ((e9.d2) ((e9.r1) collection)).s()).size() : 11;
                e9.u0 u0Var = new e9.u0();
                u0Var.b = false;
                e9.u1 u1Var = new e9.u1();
                u1Var.d(size);
                u0Var.a = u1Var;
                if (z11) {
                    e9.r1 r1Var = (e9.r1) collection;
                    e9.u1 u1Var2 = r1Var instanceof e9.d2 ? ((e9.d2) r1Var).e : null;
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
                        e9.w0 w0Var = (e9.w0) r1Var;
                        e9.y0 t10 = w0Var.t();
                        e9.u1 u1Var3 = u0Var.a;
                        u1Var3.a(Math.max(u1Var3.c, t10.size()));
                        for (e9.t1 t1Var : w0Var.t()) {
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
                    return e9.d2.n;
                }
                u0Var.b = true;
                return new e9.d2(u0Var.a);
            default:
                return new j2.f((e2.g0) obj);
        }
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 1:
                k3 k3Var = (k3) obj;
                k3Var.b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.F();
                k3Var.D();
                break;
            case 2:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                break;
            case 3:
                ((k4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 22:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((k3) obj).b;
            case 1:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 2:
                return ((k4) obj).c;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 20:
                ((b2.e1) obj).onPlayerError(new i2.m(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 21:
                ((b2.e1) obj).onRenderedFirstFrame();
                break;
            case 27:
                ((j2.b) obj).getClass();
                break;
            case 28:
                ((j2.b) obj).getClass();
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
        hw0 hw0Var = p4.b0;
        return Boolean.FALSE;
    }

    public /* synthetic */ c2(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ c2(j2.a aVar, boolean z10, int i10) {
        this.a = 29;
    }
}
