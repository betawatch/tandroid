package androidx.activity.result;

import androidx.fragment.app.d0;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d0 c;
    public final /* synthetic */ f d;

    public /* synthetic */ c(f fVar, String str, d0 d0Var, int i7) {
        this.a = i7;
        this.d = fVar;
        this.b = str;
        this.c = d0Var;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f fVar = this.d;
                HashMap hashMap = fVar.b;
                String str = this.b;
                Integer num = (Integer) hashMap.get(str);
                d0 d0Var = this.c;
                if (num != null) {
                    fVar.d.add(str);
                    try {
                        fVar.b(num.intValue(), d0Var, obj);
                        return;
                    } catch (Exception e10) {
                        fVar.d.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + d0Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                f fVar2 = this.d;
                HashMap hashMap2 = fVar2.b;
                String str2 = this.b;
                Integer num2 = (Integer) hashMap2.get(str2);
                d0 d0Var2 = this.c;
                if (num2 != null) {
                    fVar2.d.add(str2);
                    try {
                        fVar2.b(num2.intValue(), d0Var2, obj);
                        return;
                    } catch (Exception e11) {
                        fVar2.d.remove(str2);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + d0Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
