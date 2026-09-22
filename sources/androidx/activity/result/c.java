package androidx.activity.result;

import androidx.fragment.app.f0;
import java.util.HashMap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c {
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
                    } catch (Exception e) {
                        fVar.d.remove(str);
                        throw e;
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
                    } catch (Exception e7) {
                        fVar2.d.remove(str2);
                        throw e7;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + f0Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
