package hi;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e9 implements z10, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6, ih.b, g9.k, org.telegram.ui.ActionBar.q1, w10, vt0, wt0, org.telegram.messenger.i9, h2.o, h2.p, u9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ e9(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.w10
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 10:
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
            case 11:
                Collection collection = (Collection) obj;
                int i7 = h9.r0.d;
                if (collection instanceof h9.r0) {
                    return (h9.r0) collection;
                }
                boolean z11 = collection instanceof h9.n1;
                int size = z11 ? ((h9.q0) ((h9.z1) ((h9.n1) collection)).o()).size() : 11;
                h9.p0 p0Var = new h9.p0();
                p0Var.b = false;
                h9.q1 q1Var = new h9.q1();
                q1Var.d(size);
                p0Var.a = q1Var;
                if (z11) {
                    h9.n1 n1Var = (h9.n1) collection;
                    h9.q1 q1Var2 = n1Var instanceof h9.z1 ? ((h9.z1) n1Var).e : null;
                    if (q1Var2 != null) {
                        q1Var.a(Math.max(q1Var.c, q1Var2.c));
                        r1 = q1Var2.c == 0 ? -1 : 0;
                        while (r1 >= 0) {
                            a8.la.j(r1, q1Var2.c);
                            Object obj2 = q1Var2.a[r1];
                            a8.la.j(r1, q1Var2.c);
                            p0Var.c(q1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= q1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        h9.r0 r0Var = (h9.r0) n1Var;
                        h9.t0 p10 = r0Var.p();
                        h9.q1 q1Var3 = p0Var.a;
                        q1Var3.a(Math.max(q1Var3.c, p10.size()));
                        for (h9.p1 p1Var : r0Var.p()) {
                            p0Var.c(p1Var.a(), p1Var.a);
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
                    return h9.z1.n;
                }
                p0Var.b = true;
                return new h9.z1(p0Var.a);
            default:
                return new m2.d((h2.g0) obj);
        }
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        switch (this.a) {
            case 7:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 8:
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

    @Override // org.telegram.ui.Components.wt0
    public void c(Object obj, float f10) {
        switch (this.a) {
            case 17:
                ki.s2 s2Var = (ki.s2) obj;
                s2Var.c = f10;
                s2Var.f.invalidate();
                s2Var.Y.setAlpha(f10);
                s2Var.J();
                s2Var.H();
                break;
            case 18:
            default:
                ((ki.r3) obj).setSwipeOffsetY(f10);
                break;
            case 19:
                ((ki.n3) obj).setLoadProgress(f10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public void d(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof oq) {
            Drawable drawable = ((oq) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override // u9.d
    public Object e(a8.r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.a) {
            case 27:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 28:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override // org.telegram.ui.ActionBar.q6
    public int f(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof oq)) {
            return 0;
        }
        Drawable drawable = ((oq) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vt0
    public float get(Object obj) {
        switch (this.a) {
            case 16:
                return ((ki.s2) obj).c;
            case 17:
            default:
                return ((ki.r3) obj).getSwipeOffsetY();
            case 18:
                return ((ki.n3) obj).c;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 12:
                t1Var.dismiss();
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // h2.p
    public void i(Object obj, e2.s sVar) {
        ((e2.a1) obj).F(new e2.z0(sVar));
    }

    @Override // h2.o
    public void invoke(Object obj) {
        e2.a1 a1Var = (e2.a1) obj;
        switch (this.a) {
            case 24:
                a1Var.y(new l2.l(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            default:
                a1Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        xt0 xt0Var = ki.r3.c0;
        return Boolean.FALSE;
    }

    public /* synthetic */ e9(Object obj, int i7) {
        this.a = i7;
    }
}
