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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.vr;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements e2.j, g1, n2.m, d9.k, a2, mw0, Utilities.Callback2Return, ih.h, vl0, aw0, bw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i10) {
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
        m1 m1Var = (m1) obj;
        switch (this.a) {
            case 0:
                m1Var.stop();
                break;
            case 1:
                m1Var.c0();
                break;
            case 2:
                m1Var.G();
                break;
            case 3:
            default:
                m1Var.u();
                break;
            case 4:
                m1Var.b();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.b, new si.a(9)));
    }

    @Override // org.telegram.ui.Components.bw0
    public void b(Object obj, float f7) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 27:
                vrVar.b = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                vrVar.c = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // m4.g1
    public Object e(f0 f0Var, v vVar, int i10) {
        switch (this.a) {
            case 3:
                f0Var.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            case 5:
                f0Var.getClass();
                throw new ClassCastException();
            case 7:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 17:
                b2Var.dismiss();
                break;
            case 21:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.aw0
    public float get(Object obj) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 26:
                return vrVar.b;
            default:
                return vrVar.c;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
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

    @Override // ih.h
    public void i(RectF rectF, View view) {
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

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
    }

    @Override // n2.m
    public void release() {
    }
}
