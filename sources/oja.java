// default package

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class oja {
    public final w73 a;
    public final pja b;
    public final Context c;
    public final String d;
    public final tgb e;
    public final LinkedHashSet f;

    public oja(Context context, String str, Set set, w73 w73Var, pja pjaVar) {
        set.getClass();
        yj8 yj8Var = new yj8((byte) 1, context, str);
        this.a = w73Var;
        this.b = pjaVar;
        this.c = context;
        this.d = str;
        this.e = new tgb(yj8Var);
        this.f = set == rja.a ? null : new LinkedHashSet(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, ax2 ax2Var) {
        nja njaVar;
        Object obj2;
        int i;
        if (ax2Var instanceof nja) {
            njaVar = (nja) ax2Var;
            int i2 = njaVar.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                njaVar.d = i2 - TLObject.FLAG_31;
                obj2 = njaVar.b;
                i = njaVar.d;
                boolean z = true;
                if (i != 0) {
                    ixe.b(obj2);
                    njaVar.a = this;
                    njaVar.d = 1;
                    obj2 = this.a.invoke(obj, njaVar);
                    vx2 vx2Var = vx2.a;
                    if (obj2 == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (i != 1) {
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = njaVar.a;
                    ixe.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                tgb tgbVar = this.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) tgbVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                Map<String, ?> all = ((SharedPreferences) tgbVar.getValue()).getAll();
                all.getClass();
            }
        }
        njaVar = new nja(this, ax2Var);
        obj2 = njaVar.b;
        i = njaVar.d;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
