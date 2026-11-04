package ii;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import b8.ke;
import b8.zb;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e9;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y3 implements jt0, e9, f9.k, t10, g2.p, g2.q, t9.d, o6, p6, jh.b {
    public final /* synthetic */ int a;

    public /* synthetic */ y3(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.messenger.t10
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        switch (this.a) {
        }
        return Boolean.FALSE;
    }

    @Override // f9.k
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 2:
                String str = (String) obj;
                f9.a aVar = j9.a.g;
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
            case 3:
                Collection collection = (Collection) obj;
                int i3 = g9.r0.d;
                if (collection instanceof g9.r0) {
                    return (g9.r0) collection;
                }
                boolean z11 = collection instanceof g9.m1;
                int size = z11 ? ((g9.q0) ((g9.y1) ((g9.m1) collection)).o()).size() : 11;
                g9.p0 p0Var = new g9.p0();
                p0Var.b = false;
                g9.p1 p1Var = new g9.p1();
                p1Var.d(size);
                p0Var.a = p1Var;
                if (z11) {
                    g9.m1 m1Var = (g9.m1) collection;
                    g9.p1 p1Var2 = m1Var instanceof g9.y1 ? ((g9.y1) m1Var).e : null;
                    if (p1Var2 != null) {
                        p1Var.a(Math.max(p1Var.c, p1Var2.c));
                        r1 = p1Var2.c == 0 ? -1 : 0;
                        while (r1 >= 0) {
                            zb.j(r1, p1Var2.c);
                            Object obj2 = p1Var2.a[r1];
                            zb.j(r1, p1Var2.c);
                            p0Var.c(p1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= p1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        g9.r0 r0Var = (g9.r0) m1Var;
                        g9.t0 p10 = r0Var.p();
                        g9.p1 p1Var3 = p0Var.a;
                        p1Var3.a(Math.max(p1Var3.c, p10.size()));
                        for (g9.o1 o1Var : r0Var.p()) {
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
                    return g9.y1.n;
                }
                p0Var.b = true;
                return new g9.y1(p0Var.a);
            default:
                return new l2.f((g2.h0) obj);
        }
    }

    @Override // jh.b
    public Object b(Bitmap bitmap) {
        switch (this.a) {
            case 15:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 16:
                int i3 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i3 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i3);
            default:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i10 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i10);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        ((c4) obj).setSwipeOffsetY(f10);
    }

    @Override // g2.q
    public void e(Object obj, d2.t tVar) {
        ((d2.c1) obj).O(new d2.b1(tVar));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void f(int i3, View view) {
        Drawable background = view.getBackground();
        if (background instanceof xp) {
            Drawable drawable = ((xp) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i3);
                view.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int h(View view) {
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

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 7:
                ((d2.c1) obj).o(new k2.l(2, new androidx.car.app.j("Player release timed out."), 1003));
                break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                ((l2.b) obj).getClass();
                break;
            case 9:
                ((d2.c1) obj).onRenderedFirstFrame();
                break;
            case 18:
                ((l2.b) obj).getClass();
                break;
            case 19:
                ((l2.b) obj).getClass();
                break;
            case 20:
                ((l2.b) obj).getClass();
                break;
            case 21:
                ((l2.b) obj).getClass();
                break;
            case 22:
                ((l2.b) obj).getClass();
                break;
            case 23:
                ((l2.b) obj).getClass();
                break;
            case 24:
                ((l2.b) obj).getClass();
                break;
            case 25:
                ((l2.b) obj).getClass();
                break;
            case 26:
                ((l2.b) obj).getClass();
                break;
            case 27:
                ((l2.b) obj).getClass();
                break;
            case 28:
                ((l2.b) obj).getClass();
                break;
        }
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        kt0 kt0Var = c4.c0;
        return Boolean.FALSE;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        k5.f lambda$getComponents$0;
        k5.f lambda$getComponents$1;
        k5.f lambda$getComponents$2;
        switch (this.a) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(keVar);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(keVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(keVar);
                return lambda$getComponents$2;
        }
    }

    public /* synthetic */ y3(int i3, int i10, l2.a aVar, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ y3(Object obj, int i3) {
        this.a = i3;
    }

    public /* synthetic */ y3(l2.a aVar, int i3) {
        this.a = 25;
    }

    public /* synthetic */ y3(l2.a aVar, Object obj, int i3) {
        this.a = i3;
    }

    public /* synthetic */ y3(l2.a aVar, String str, long j10, long j11) {
        this.a = 24;
    }

    public /* synthetic */ y3(l2.a aVar, boolean z10) {
        this.a = 23;
    }
}
