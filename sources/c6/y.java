package c6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class y {
    public static final k6.c a;
    public static final k6.c b;
    public static final k6.c c;
    public static final k6.c d;
    public static final k6.c[] e;

    static {
        k6.c cVar = new k6.c("client_side_logging", 1L);
        k6.c cVar2 = new k6.c("cxless_client_minimal", 1L);
        a = cVar2;
        k6.c cVar3 = new k6.c("cxless_caf_control", 1L);
        k6.c cVar4 = new k6.c("module_flag_control", 1L);
        b = cVar4;
        k6.c cVar5 = new k6.c("discovery_hint_supply", 1L);
        k6.c cVar6 = new k6.c("relay_casting_set_active_account", 1L);
        k6.c cVar7 = new k6.c("analytics_proto_enum_translation", 1L);
        c = cVar7;
        k6.c cVar8 = new k6.c("integer_to_integer_map", 1L);
        d = cVar8;
        e = new k6.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new k6.c("relay_casting_set_remote_casting_mode", 1L), new k6.c("get_relay_access_token", 1L), new k6.c("get_cast_settings", 1L), new k6.c("set_bundle_setting", 1L), new k6.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return n4.y.N(new n4.y(8, str, (Object) null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
