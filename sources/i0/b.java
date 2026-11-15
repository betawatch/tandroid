package i0;

import a8.ja;
import a8.r7;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import e2.a1;
import e2.s;
import e2.z0;
import h2.g0;
import h2.o;
import h2.p;
import h9.m1;
import h9.o1;
import h9.p0;
import h9.p1;
import h9.q0;
import h9.r0;
import h9.t0;
import h9.y1;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import ki.t3;
import ki.x2;
import ki.x3;
import l2.l;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j9;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.mt0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements n6, o6, ih.b, g9.k, q1, y10, kt0, lt0, j9, o, p, u9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.y10
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        switch (this.a) {
        }
        return Boolean.FALSE;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 9:
                String str = (String) obj;
                g9.a aVar = k9.a.g;
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
            case 10:
                Collection collection = (Collection) obj;
                int i7 = r0.d;
                if (collection instanceof r0) {
                    return (r0) collection;
                }
                boolean z11 = collection instanceof m1;
                int size = z11 ? ((q0) ((y1) ((m1) collection)).o()).size() : 11;
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
                            ja.j(r1, p1Var2.c);
                            Object obj2 = p1Var2.a[r1];
                            ja.j(r1, p1Var2.c);
                            p0Var.c(p1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= p1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        r0 r0Var = (r0) m1Var;
                        t0 p10 = r0Var.p();
                        p1 p1Var3 = p0Var.a;
                        p1Var3.a(Math.max(p1Var3.c, p10.size()));
                        for (o1 o1Var : r0Var.p()) {
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
            default:
                return new m2.e((g0) obj);
        }
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        switch (this.a) {
            case 6:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 7:
                int i7 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i7 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i7);
            default:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i10 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i10);
        }
    }

    @Override // org.telegram.ui.Components.lt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 16:
                x2 x2Var = (x2) obj;
                x2Var.c = f10;
                x2Var.f.invalidate();
                x2Var.Y.setAlpha(f10);
                x2Var.J();
                x2Var.H();
                break;
            case 17:
            default:
                ((x3) obj).setSwipeOffsetY(f10);
                break;
            case 18:
                ((t3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // h2.p
    public void e(Object obj, s sVar) {
        ((a1) obj).F(new z0(sVar));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public void f(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof fq) {
            Drawable drawable = ((fq) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n6
    public int g(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof fq)) {
            return 0;
        }
        Drawable drawable = ((fq) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.kt0
    public float get(Object obj) {
        switch (this.a) {
            case 15:
                return ((x2) obj).c;
            case 16:
            default:
                return ((x3) obj).getSwipeOffsetY();
            case 17:
                return ((t3) obj).c;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 11:
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // u9.d
    public Object i(r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.a) {
            case 26:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 27:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        a1 a1Var = (a1) obj;
        switch (this.a) {
            case 23:
                a1Var.y(new l(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            default:
                a1Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        mt0 mt0Var = x3.c0;
        return Boolean.FALSE;
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
    }
}
