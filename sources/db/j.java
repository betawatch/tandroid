package db;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class j {
    public static final n6.c a;
    public static final n6.c[] b;

    static {
        n6.c cVar = new n6.c("fpnv_exchange_credential_response_for_phone_number_api", -1, 1L, true);
        n6.c cVar2 = new n6.c("fpnv_get_consent_screen_intent", -1, 1L, true);
        n6.c cVar3 = new n6.c("fpnv_get_digital_credential_payload_api", -1, 1L, true);
        n6.c cVar4 = new n6.c("fpnv_get_verification_support_info", -1, 1L, true);
        a = cVar4;
        b = new n6.c[]{cVar, cVar2, cVar3, cVar4, new n6.c("fpnv_test_sessions", -1, 1L, true), new n6.c("fpnv_verify_phone_number", -1, 1L, true)};
    }
}
