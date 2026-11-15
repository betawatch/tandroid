package fi;

import java.util.List;
import org.telegram.messenger.a20;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements a20 {
    public final /* synthetic */ k6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ j6(k6 k6Var, boolean z10, int i7, List list) {
        this.a = k6Var;
        this.b = z10;
        this.c = i7;
        this.d = list;
    }

    @Override // org.telegram.messenger.a20
    public final Object a(Object obj) {
        return Boolean.valueOf(this.a.q(this.c, this.d, this.b));
    }
}
