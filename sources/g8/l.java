package g8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class l {
    public static final k6.c[] a = {new k6.c("name_ulr_private", 1), new k6.c("name_sleep_segment_request", 1), new k6.c("get_last_activity_feature_id", 1), new k6.c("support_context_feature_id", 1), new k6.c("get_current_location", 2), new k6.c("get_last_location_with_request", 1), new k6.c("set_mock_mode_with_callback", 1), new k6.c("set_mock_location_with_callback", 1), new k6.c("inject_location_with_callback", 1), new k6.c("location_updates_with_callback", 1), new k6.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
