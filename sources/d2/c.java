package d2;

import android.content.pm.ShortcutManager;
import android.graphics.Typeface;
import android.window.OnBackInvokedDispatcher;
import b2.c1;
import b2.d1;
import b2.v;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.k;
import e2.g0;
import e2.o;
import e2.p;
import e9.d2;
import e9.r1;
import e9.t1;
import e9.u0;
import e9.u1;
import e9.v0;
import e9.y0;
import i2.l;
import ig.f0;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLObject;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.t6;
import z9.e2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements k, i5.e, r9.d, g2.g, o, p, f0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static di.c a() {
        InputStream open = w0.b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_13];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new di.c(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* bridge */ /* synthetic */ ShortcutManager e(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher f(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ShortcutManager.class;
    }

    @Override // r9.d
    public Object K(bh.d dVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(dVar);
        return lambda$getComponents$0;
    }

    @Override // d9.k
    public Object apply(Object obj) {
        boolean z10 = true;
        switch (this.a) {
            case 0:
                return Integer.valueOf(((b) obj).r);
            case 1:
                da.a.b.getClass();
                return aa.b.a.v((e2) obj).getBytes(Charset.forName("UTF-8"));
            case 9:
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
            case 10:
                Collection collection = (Collection) obj;
                int i10 = e9.w0.d;
                if (collection instanceof e9.w0) {
                    return (e9.w0) collection;
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
                            t6.j(r1, u1Var2.c);
                            Object obj2 = u1Var2.a[r1];
                            t6.j(r1, u1Var2.c);
                            u0Var.c(u1Var2.b[r1], obj2);
                            r1++;
                            if (r1 >= u1Var2.c) {
                                r1 = -1;
                            }
                        }
                    } else {
                        e9.w0 w0Var = (e9.w0) r1Var;
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
                return new j2.g((g0) obj);
        }
    }

    @Override // ig.f0
    public Typeface b() {
        switch (this.a) {
            case 22:
                return i0.o1("fonts/rmedium.ttf");
            case 23:
                return i0.o1("fonts/rmediumitalic.ttf");
            case 24:
                return Typeface.create("serif", 1);
            case 25:
                return i0.o1("fonts/rcondensedbold.ttf");
            case 26:
                return i0.o1("fonts/rmono.ttf");
            default:
                return i0.o1("fonts/mw_bold.ttf");
        }
    }

    @Override // e2.p
    public void c(Object obj, v vVar) {
        ((d1) obj).D(new c1(vVar));
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(w0.b);
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 19:
                ((d1) obj).H(new l(2, new ad.d("Player release timed out."), 1003));
                break;
            case 21:
                ((d1) obj).onRenderedFirstFrame();
                break;
            case 28:
                ((j2.b) obj).getClass();
                break;
            default:
                ((j2.b) obj).getClass();
                break;
        }
    }

    public /* synthetic */ c(i2.i0 i0Var) {
        this.a = 20;
    }

    public /* synthetic */ c(j2.a aVar, Object obj, int i10) {
        this.a = i10;
    }
}
