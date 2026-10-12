package m4;

import android.graphics.RectF;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ks;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements e2.j, h1, n2.m, d9.k, z1, rw0, Utilities.Callback2Return, ih.h, zl0, fw0, gw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w0(int i10) {
        this.a = i10;
    }

    public static mi.b a() {
        InputStream open = ApplicationLoader.applicationContext.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                        return new mi.b(new PrismaHighlighter(byteArray));
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

    @Override // e2.j
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.a) {
            case 0:
                n1Var.stop();
                break;
            case 1:
                n1Var.c0();
                break;
            case 2:
                n1Var.G();
                break;
            case 3:
            default:
                n1Var.u();
                break;
            case 4:
                n1Var.b();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.b, new t0.a(6)));
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        ks ksVar = (ks) obj;
        switch (this.a) {
            case 27:
                ksVar.b = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                ksVar.c = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // m4.h1
    public Object c(f0 f0Var, w wVar, int i10) {
        switch (this.a) {
            case 3:
                f0Var.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return q8.b(new t1(-6));
            case 5:
                f0Var.getClass();
                throw new ClassCastException();
            case 7:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public void f(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 17:
                a2Var.dismiss();
                break;
            case 21:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        ks ksVar = (ks) obj;
        switch (this.a) {
            case 26:
                return ksVar.b;
            default:
                return ksVar.c;
        }
    }

    @Override // ih.h
    public void h(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 20:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ w0(String str, r rVar, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }

    @Override // n2.m
    public void release() {
    }
}
