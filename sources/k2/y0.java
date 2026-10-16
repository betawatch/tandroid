package k2;

import android.os.Bundle;
import b2.h1;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import m4.f1;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.utils.code.highlight.PrismaHighlighter;
import v7.q8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements d9.k, i5.g, m4.d0, g1, e2.j, f1 {
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i10) {
        this.a = i10;
    }

    public static li.b e() {
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
                        return new li.b(new PrismaHighlighter(byteArray));
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

    @Override // m4.f1
    public void a(m1 m1Var, m4.v vVar, List list) {
        switch (this.a) {
            case 27:
                m1Var.x0(list);
                break;
            default:
                m1Var.x0(list);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.a) {
            case 14:
                m1Var.B0();
                break;
            case 15:
                m1Var.e();
                break;
            case 16:
                m1Var.f0();
                break;
            case 17:
            case 22:
            default:
                m1Var.K();
                break;
            case 18:
                m1Var.C0();
                break;
            case 19:
                m1Var.J0();
                break;
            case 20:
                m1Var.V();
                break;
            case 21:
                m1Var.E();
                break;
            case 23:
                m1Var.I0();
                break;
            case 24:
                m1Var.H0();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.g1
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        switch (this.a) {
            case 12:
                e0Var.getClass();
                throw new ClassCastException();
            case 13:
                e0Var.getClass();
                throw new ClassCastException();
            case 17:
                return e0Var.n(vVar);
            case 22:
                e0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            default:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // m4.d0
    public void d(m4.u uVar, int i10) {
        switch (this.a) {
            case 9:
                uVar.getClass();
                break;
            case 10:
                uVar.b(i10);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ y0(String str, int i10, int i11, m4.q qVar, int i12) {
        this.a = i12;
    }

    public /* synthetic */ y0(String str, h1 h1Var) {
        this.a = 25;
    }

    public /* synthetic */ y0(boolean z10, o1 o1Var, Bundle bundle) {
        this.a = 17;
    }

    @Override // i5.g
    public void b(Exception exc) {
    }
}
