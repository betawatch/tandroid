package androidx.activity.result;

import androidx.fragment.app.f0;
import java.util.HashMap;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
