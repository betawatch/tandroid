package aa;

import androidx.activity.v;
import dd.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e extends i implements od.a {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.a = i11;
    }

    @Override // od.a
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((f) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                j.d(name, "<get-threadName>(...)");
                break;
            case 1:
                ((f) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                j.d(name2, "<get-threadName>(...)");
                break;
            case 2:
                ((f) this.receiver).getClass();
                break;
            case 3:
                ((v) this.receiver).d();
                break;
            default:
                ((v) this.receiver).d();
                break;
        }
        return k.a;
    }
}
