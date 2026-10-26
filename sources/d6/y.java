package d6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class y {
    public static final l6.c a;
    public static final l6.c b;
    public static final l6.c c;
    public static final l6.c d;
    public static final l6.c[] e;

    static {
        l6.c cVar = new l6.c("client_side_logging", 1L);
        l6.c cVar2 = new l6.c("cxless_client_minimal", 1L);
        a = cVar2;
        l6.c cVar3 = new l6.c("cxless_caf_control", 1L);
        l6.c cVar4 = new l6.c("module_flag_control", 1L);
        b = cVar4;
        l6.c cVar5 = new l6.c("discovery_hint_supply", 1L);
        l6.c cVar6 = new l6.c("relay_casting_set_active_account", 1L);
        l6.c cVar7 = new l6.c("analytics_proto_enum_translation", 1L);
        c = cVar7;
        l6.c cVar8 = new l6.c("integer_to_integer_map", 1L);
        d = cVar8;
        e = new l6.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new l6.c("relay_casting_set_remote_casting_mode", 1L), new l6.c("get_relay_access_token", 1L), new l6.c("get_cast_settings", 1L), new l6.c("set_bundle_setting", 1L), new l6.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return n4.s.K(new n4.s(13, str, (Object) null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
