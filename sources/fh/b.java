package fh;

import android.content.pm.ShortcutManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.j;
import b2.d1;
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
import i5.f;
import j$.util.Objects;
import j2.e;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.yq;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements d, fw0, gw0, GenericProvider, k, r9.d, p6, o6, o, z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager c(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return ShortcutManager.class;
    }

    @Override // d9.k
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 16:
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
            case 17:
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
                return new e((g0) obj);
        }
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 10:
                d3 d3Var = (d3) obj;
                d3Var.c = f7;
                d3Var.f.invalidate();
                d3Var.X.setAlpha(f7);
                d3Var.F();
                d3Var.D();
                break;
            case 11:
            default:
                ((e4) obj).setSwipeOffsetY(f7);
                break;
            case 12:
                ((z3) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof yq) {
            Drawable drawable = ((yq) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int f(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof yq)) {
            return 0;
        }
        Drawable drawable = ((yq) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 28:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        switch (this.a) {
            case 9:
                return ((d3) obj).c;
            case 10:
            default:
                return ((e4) obj).getSwipeOffsetY();
            case 11:
                return ((z3) obj).c;
        }
    }

    @Override // eh.d
    public int i(g6 g6Var, boolean z10) {
        switch (this.a) {
            case 0:
                return k6.o1(0.78f, k6.w0(k6.h5, g6Var));
            case 1:
                return k6.o1(0.7f, k6.w0(k6.d6, g6Var));
            case 2:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, g6Var));
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        d1 d1Var = (d1) obj;
        switch (this.a) {
            case 26:
                d1Var.onPlayerError(new m(2, new j("Player release timed out."), 1003));
                break;
            default:
                d1Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        hw0 hw0Var = e4.b0;
        return Boolean.FALSE;
    }
}
