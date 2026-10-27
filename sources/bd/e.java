package bd;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends HashMap {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        switch (this.a) {
            case 1:
                int i10 = ((ah) this.b).v;
                yj0 yj0Var = (yj0) super.get(obj);
                if (yj0Var != null) {
                    return yj0Var;
                }
                zg zgVar = (zg) obj;
                yj0 yj0Var2 = new yj0(zgVar.c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                put(zgVar, yj0Var2);
                return yj0Var2;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((h) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
