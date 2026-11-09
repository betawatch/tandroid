package hi;

import a8.ia;
import a8.r7;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.k9;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements mt0, k9, b20, p6, q6, ih.b, g9.k, org.telegram.ui.ActionBar.r1, h2.o, h2.p, u9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ x3(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.b20
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.a) {
        }
        return Boolean.FALSE;
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        boolean z9 = true;
        switch (this.a) {
            case 13:
                String str = (String) obj;
                g9.a aVar = k9.a.g;
                aVar.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (aVar.c(str.charAt(length))) {
                            length--;
                        } else {
                            z9 = false;
                        }
                    }
                }
                if (z9 && !str.isEmpty()) {
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
            case 14:
                Collection collection = (Collection) obj;
                int i7 = h9.r0.d;
                if (collection instanceof h9.r0) {
                    return (h9.r0) collection;
                }
                boolean z10 = collection instanceof h9.n1;
                int size = z10 ? ((h9.q0) ((h9.z1) ((h9.n1) collection)).o()).size() : 11;
                h9.p0 p0Var = new h9.p0();
                p0Var.b = false;
                h9.q1 q1Var = new h9.q1();
                q1Var.d(size);
                p0Var.a = q1Var;
                if (z10) {
                    h9.n1 n1Var = (h9.n1) collection;
                    h9.q1 q1Var2 = n1Var instanceof h9.z1 ? ((h9.z1) n1Var).e : null;
                    if (q1Var2 != null) {
                        q1Var.a(Math.max(q1Var.c, q1Var2.c));
                        r1 = q1Var2.c == 0 ? -1 : 0;
                        while (r1 >= 0) {
                            ia.j(r1, q1Var2.c);
                            Object obj2 = q1Var2.a[r1];
                            ia.j(r1, q1Var2.c);
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
                return new m2.e((h2.g0) obj);
        }
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        switch (this.a) {
            case 10:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 11:
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

    @Override // org.telegram.ui.ActionBar.q6
    public void c(int i7, View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i7);
                view.invalidate();
            }
        }
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        l5.f lambda$getComponents$0;
        l5.f lambda$getComponents$1;
        l5.f lambda$getComponents$2;
        switch (this.a) {
            case 22:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(r7Var);
                return lambda$getComponents$0;
            case 23:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(r7Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(r7Var);
                return lambda$getComponents$2;
        }
    }

    @Override // org.telegram.ui.Components.mt0
    public void f(Object obj, float f10) {
        ((b4) obj).setSwipeOffsetY(f10);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 15:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // h2.p
    public void h(Object obj, e2.s sVar) {
        ((e2.a1) obj).F(new e2.z0(sVar));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public int i(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof xp)) {
            return 0;
        }
        Drawable drawable = ((xp) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 19:
                ((e2.a1) obj).y(new l2.l(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 20:
            case 22:
            case 23:
            case 24:
            default:
                ((m2.b) obj).getClass();
                break;
            case 21:
                ((e2.a1) obj).onRenderedFirstFrame();
                break;
            case 25:
                ((m2.b) obj).getClass();
                break;
            case 26:
                ((m2.b) obj).getClass();
                break;
            case 27:
                ((m2.b) obj).getClass();
                break;
            case 28:
                ((m2.b) obj).getClass();
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        nt0 nt0Var = b4.b0;
        return Boolean.FALSE;
    }

    public /* synthetic */ x3(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ x3(m2.a aVar, Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ x3(m2.a aVar, boolean z9, int i7) {
        this.a = 27;
    }
}
