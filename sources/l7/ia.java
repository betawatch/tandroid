package l7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class ia implements ka {
    public final ArrayList a;

    public ia(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        haVar.getClass();
        arrayList.add(new ma(context, haVar));
    }

    @Override // l7.ka
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ka) obj).a(e0Var);
        }
    }
}
