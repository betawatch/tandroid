package c1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import rd.p;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c extends i implements p {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, obj, cls, str, str2, i10);
        this.a = i11;
    }

    @Override // rd.p
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
            case 4:
                ((b1.a) this.receiver).getClass();
                return b1.a.b((String) obj, (String) obj2);
            default:
                me.d p02 = (me.d) obj;
                int intValue = ((Number) obj2).intValue();
                j.e(p02, "p0");
                qe.e eVar = (qe.e) this.receiver;
                eVar.getClass();
                boolean z9 = !p02.j(intValue) && p02.i(intValue).c();
                eVar.b = z9;
                return Boolean.valueOf(z9);
        }
    }
}
