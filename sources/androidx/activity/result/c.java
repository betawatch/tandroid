package androidx.activity.result;

import androidx.fragment.app.e0;
import d7.o;
import d7.r;
import d7.s;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static s e;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e0 c;
    public final /* synthetic */ f d;

    public /* synthetic */ c(f fVar, String str, e0 e0Var, int i9) {
        this.a = i9;
        this.d = fVar;
        this.b = str;
        this.c = e0Var;
    }

    public static synchronized r b(o oVar) {
        r rVar;
        synchronized (c.class) {
            try {
                if (e == null) {
                    e = new s(0);
                }
                rVar = (r) e.G(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = this.d;
                HashMap hashMap = fVar.b;
                String str = this.b;
                Integer num = (Integer) hashMap.get(str);
                e0 e0Var = this.c;
                if (num != null) {
                    fVar.d.add(str);
                    try {
                        fVar.b(num.intValue(), e0Var, obj);
                        return;
                    } catch (Exception e10) {
                        fVar.d.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + e0Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                f fVar2 = this.d;
                HashMap hashMap2 = fVar2.b;
                String str2 = this.b;
                Integer num2 = (Integer) hashMap2.get(str2);
                e0 e0Var2 = this.c;
                if (num2 != null) {
                    fVar2.d.add(str2);
                    try {
                        fVar2.b(num2.intValue(), e0Var2, obj);
                        return;
                    } catch (Exception e11) {
                        fVar2.d.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + e0Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
