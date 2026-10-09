package androidx.activity.result;

import androidx.fragment.app.f0;
import java.util.HashMap;
import t7.o;
import t7.q;
import t7.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c {
    public static r e;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f0 c;
    public final /* synthetic */ f d;

    public /* synthetic */ c(f fVar, String str, f0 f0Var, int i10) {
        this.a = i10;
        this.d = fVar;
        this.b = str;
        this.c = f0Var;
    }

    public static synchronized q b(o oVar) {
        q qVar;
        synchronized (c.class) {
            try {
                if (e == null) {
                    e = new r(0);
                }
                qVar = (q) e.O0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = this.d;
                HashMap hashMap = fVar.b;
                String str = this.b;
                Integer num = (Integer) hashMap.get(str);
                f0 f0Var = this.c;
                if (num != null) {
                    fVar.d.add(str);
                    try {
                        fVar.b(num.intValue(), f0Var, obj);
                        return;
                    } catch (Exception e7) {
                        fVar.d.remove(str);
                        throw e7;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + f0Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                f fVar2 = this.d;
                HashMap hashMap2 = fVar2.b;
                String str2 = this.b;
                Integer num2 = (Integer) hashMap2.get(str2);
                f0 f0Var2 = this.c;
                if (num2 != null) {
                    fVar2.d.add(str2);
                    try {
                        fVar2.b(num2.intValue(), f0Var2, obj);
                        return;
                    } catch (Exception e10) {
                        fVar2.d.remove(str2);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + f0Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
