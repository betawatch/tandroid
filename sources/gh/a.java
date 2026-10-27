package gh;

import a8.me;
import a8.yb;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.car.app.j;
import b2.e1;
import com.google.firebase.datatransport.TransportRegistrar;
import e2.g0;
import e2.o;
import e9.k;
import f9.m1;
import f9.o1;
import f9.p0;
import f9.p1;
import f9.q0;
import f9.r0;
import f9.t0;
import f9.y1;
import fh.d;
import hi.i4;
import hi.m3;
import hi.n4;
import i2.m;
import j$.util.Objects;
import j2.e;
import j5.f;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements d, ow0, pw0, GenericProvider, k, o, s9.d, d7 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // e9.k
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 23:
                return new e((g0) obj);
            case 26:
                String str = (String) obj;
                e9.a aVar = i9.a.g;
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
            default:
                Collection collection = (Collection) obj;
                int i10 = r0.d;
                if (collection instanceof r0) {
                    return (r0) collection;
                }
                boolean z11 = collection instanceof m1;
                int size = z11 ? ((q0) ((y1) ((m1) collection)).s()).size() : 11;
                p0 p0Var = new p0();
                p0Var.b = false;
                p1 p1Var = new p1();
                p1Var.d(size);
                p0Var.a = p1Var;
                if (z11) {
                    m1 m1Var = (m1) collection;
                    p1 p1Var2 = m1Var instanceof y1 ? ((y1) m1Var).e : null;
                    if (p1Var2 != null) {
                        p1Var.a(Math.max(p1Var.c, p1Var2.c));
                        r1 = p1Var2.c == 0 ? -1 : 0;
                        while (r1 >= 0) {
                            yb.j(r1, p1Var2.c);
                            Object obj2 = p1Var2.a[r1];
                            yb.j(r1, p1Var2.c);
                            p0Var.c(p1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= p1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        r0 r0Var = (r0) m1Var;
                        t0 t10 = r0Var.t();
                        p1 p1Var3 = p0Var.a;
                        p1Var3.a(Math.max(p1Var3.c, t10.size()));
                        for (o1 o1Var : r0Var.t()) {
                            p0Var.c(o1Var.a(), o1Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        p0Var.a(it.next());
                    }
                }
                Objects.requireNonNull(p0Var.a);
                if (p0Var.a.c == 0) {
                    return y1.n;
                }
                p0Var.b = true;
                return new y1(p0Var.a);
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 13:
                m3 m3Var = (m3) obj;
                m3Var.c = f7;
                m3Var.f.invalidate();
                m3Var.X.setAlpha(f7);
                m3Var.F();
                m3Var.D();
                break;
            case 14:
            default:
                ((n4) obj).setSwipeOffsetY(f7);
                break;
            case 15:
                ((i4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        Drawable background = view.getBackground();
        if (background instanceof ar) {
            Drawable drawable = ((ar) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i10);
                view.invalidate();
            }
        }
    }

    @Override // s9.d
    public Object d1(me meVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(meVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.ui.Components.ow0
    public float get(Object obj) {
        switch (this.a) {
            case 12:
                return ((m3) obj).c;
            case 13:
            default:
                return ((n4) obj).getSwipeOffsetY();
            case 14:
                return ((i4) obj).c;
        }
    }

    @Override // fh.d
    public int i(u6 u6Var, boolean z10) {
        switch (this.a) {
            case 0:
                return 855638016;
            case 1:
                return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.Fi, u6Var));
            case 2:
                return TLObject.FLAG_30;
            case 3:
                return y6.o1(0.075f, -16777216);
            case 4:
                return y6.o1(0.88f, y6.w0(y6.d6, u6Var));
            case 5:
                return y6.o1(z10 ? 0.85f : 0.825f, y6.x0(null, y6.G8, false));
            case 6:
                return c.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.d6, u6Var), y6.w0(y6.Yk, u6Var));
            case 7:
                return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.d6, u6Var));
            case 8:
                return c.n(LiteMode.isEnabled(262144) ? 0.85f : 0.8f, y6.w0(y6.a7, u6Var), y6.w0(y6.d6, u6Var));
            case 9:
                return y6.o1(0.78f, y6.w0(y6.h5, u6Var));
            case 10:
                return y6.o1(0.7f, y6.w0(y6.d6, u6Var));
            default:
                LiteMode.isEnabled(262144);
                return 0;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        e1 e1Var = (e1) obj;
        switch (this.a) {
            case 24:
                e1Var.onPlayerError(new m(2, new j("Player release timed out."), 1003));
                break;
            default:
                e1Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        qw0 qw0Var = n4.b0;
        return Boolean.FALSE;
    }
}
