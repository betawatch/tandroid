package k7;

import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements u9.d {
    public static final /* synthetic */ e b = new e(0);
    public static final /* synthetic */ e c = new e(1);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(f.g, entry.getKey());
                eVar.e(f.h, entry.getValue());
                return;
            default:
                throw new u9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
