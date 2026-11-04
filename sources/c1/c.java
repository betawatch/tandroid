package c1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends i implements p {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.a = i11;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            case 1:
                ((b1.a) this.receiver).getClass();
                return b1.a.a((String) obj, (String) obj2);
            case 2:
                ((b1.a) this.receiver).getClass();
                return b1.a.a((String) obj, (String) obj2);
            case 3:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            default:
                je.d p02 = (je.d) obj;
                int intValue = ((Number) obj2).intValue();
                j.e(p02, "p0");
                ne.e eVar = (ne.e) this.receiver;
                eVar.getClass();
                boolean z10 = !p02.j(intValue) && p02.i(intValue).c();
                eVar.b = z10;
                return Boolean.valueOf(z10);
        }
    }
}
