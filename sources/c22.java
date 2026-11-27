// default package

import android.view.View;
import com.google.firebase.components.ComponentRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.utils.code.highlight.PrismaHighlighter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c22 implements zla, ama, nu4, fd, jcc, f73, occ, uq2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ c22(byte b) {
        this.a = b;
    }

    public static dk2 a() {
        InputStream open = a.b.getAssets().open("grammars.dat");
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
                        return new dk2(new PrismaHighlighter(byteArray));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void c(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // f73
    public final h73 createDataSource() {
        return new lx(a.b);
    }

    @Override // ama
    public final void d(Object obj, float f) {
        switch (this.a) {
            case 1:
                ((d22) obj).setLoadProgress(f);
                break;
            case 3:
                ((i22) obj).setSwipeOffsetY(f);
                break;
            case 16:
                ok2 ok2Var = (ok2) obj;
                ok2Var.N1 = f;
                if (ok2Var.getParent() != null) {
                    ((View) ok2Var.getParent()).invalidate();
                    break;
                }
                break;
            case 18:
                ok2 ok2Var2 = (ok2) obj;
                ok2Var2.O1 = f;
                if (ok2Var2.getParent() != null) {
                    ((View) ok2Var2.getParent()).invalidate();
                    break;
                }
                break;
            case 20:
                ok2 ok2Var3 = (ok2) obj;
                ok2Var3.P1 = f;
                if (ok2Var3.getParent() != null) {
                    ((View) ok2Var3.getParent()).invalidate();
                    break;
                }
                break;
            default:
                ok2 ok2Var4 = (ok2) obj;
                ok2Var4.Q1 = f;
                if (ok2Var4.getParent() != null) {
                    ((View) ok2Var4.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        byte b = this.a;
        return Boolean.FALSE;
    }

    @Override // uq2
    public final List f(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // jcc
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        return num.intValue() == 0 ? ob6.H(',', "Stars", num2.intValue()) : String.valueOf(num2);
    }

    @Override // zla
    public final float get(Object obj) {
        switch (this.a) {
            case 0:
                return ((d22) obj).c;
            case 2:
                return ((i22) obj).getSwipeOffsetY();
            case 15:
                return ((ok2) obj).N1;
            case 17:
                return ((ok2) obj).O1;
            case 19:
                return ((ok2) obj).P1;
            default:
                return ((ok2) obj).Q1;
        }
    }

    @Override // nu4
    public final Object h(Object obj) {
        switch (this.a) {
            case 4:
                bma bmaVar = i22.c0;
                return Boolean.FALSE;
            default:
                return CheckBoxBase.I;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 5:
                idVar.dismiss();
                break;
            case 6:
            default:
                idVar.dismiss();
                break;
            case 7:
                idVar.dismiss();
                break;
        }
    }
}
