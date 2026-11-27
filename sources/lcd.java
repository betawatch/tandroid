// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class lcd implements zq7 {
    public static final /* synthetic */ lcd b = new lcd(0);
    public static final /* synthetic */ lcd c = new lcd(1);
    public static final /* synthetic */ lcd d = new lcd(2);
    public static final /* synthetic */ lcd e = new lcd(3);
    public static final /* synthetic */ lcd f = new lcd(4);
    public static final /* synthetic */ lcd g = new lcd(5);
    public static final /* synthetic */ lcd h = new lcd(6);
    public static final /* synthetic */ lcd i = new lcd(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ lcd(byte b2) {
        this.a = b2;
    }

    @Override // l34
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ar7 ar7Var = (ar7) obj2;
                ar7Var.a(rcd.f, entry.getKey());
                ar7Var.a(rcd.g, entry.getValue());
                return;
            case 1:
                throw new o34("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ar7 ar7Var2 = (ar7) obj2;
                ar7Var2.a(hdd.f, entry2.getKey());
                ar7Var2.a(hdd.g, entry2.getValue());
                return;
            case 3:
                throw new o34("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                ar7 ar7Var3 = (ar7) obj2;
                ar7Var3.a(gnd.f, entry3.getKey());
                ar7Var3.a(gnd.g, entry3.getValue());
                return;
            case 5:
                throw new o34("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 6:
                Map.Entry entry4 = (Map.Entry) obj;
                ar7 ar7Var4 = (ar7) obj2;
                ar7Var4.a(kpd.f, entry4.getKey());
                ar7Var4.a(kpd.g, entry4.getValue());
                return;
            default:
                throw new o34("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
