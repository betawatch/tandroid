package o5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class y {
    public static final w5.c a;
    public static final w5.c b;
    public static final w5.c c;
    public static final w5.c d;
    public static final w5.c[] e;

    static {
        w5.c cVar = new w5.c("client_side_logging", 1L);
        w5.c cVar2 = new w5.c("cxless_client_minimal", 1L);
        a = cVar2;
        w5.c cVar3 = new w5.c("cxless_caf_control", 1L);
        w5.c cVar4 = new w5.c("module_flag_control", 1L);
        b = cVar4;
        w5.c cVar5 = new w5.c("discovery_hint_supply", 1L);
        w5.c cVar6 = new w5.c("relay_casting_set_active_account", 1L);
        w5.c cVar7 = new w5.c("analytics_proto_enum_translation", 1L);
        c = cVar7;
        w5.c cVar8 = new w5.c("integer_to_integer_map", 1L);
        d = cVar8;
        e = new w5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new w5.c("relay_casting_set_remote_casting_mode", 1L), new w5.c("get_relay_access_token", 1L), new w5.c("get_cast_settings", 1L), new w5.c("set_bundle_setting", 1L), new w5.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return g9.l.r(new g9.l(str, null, false, 28));
    }
}
