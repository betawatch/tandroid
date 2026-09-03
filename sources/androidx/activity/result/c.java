package androidx.activity.result;

import androidx.fragment.app.e0;
import java.util.HashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e0 c;
    public final /* synthetic */ f d;

    public /* synthetic */ c(f fVar, String str, e0 e0Var, int i10) {
        this.a = i10;
        this.d = fVar;
        this.b = str;
        this.c = e0Var;
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
                    } catch (Exception e) {
                        fVar.d.remove(str);
                        throw e;
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
                    } catch (Exception e6) {
                        fVar2.d.remove(str2);
                        throw e6;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + e0Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }
}
