package b7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class c {
    public static final v5.c a;
    public static final v5.c b;
    public static final v5.c[] c;

    static {
        v5.c cVar = new v5.c("GET_CREDENTIAL", 1L);
        a = cVar;
        v5.c cVar2 = new v5.c("CREDENTIAL_REGISTRY", 1L);
        v5.c cVar3 = new v5.c("CLEAR_REGISTRY", 2L);
        v5.c cVar4 = new v5.c("CLEAR_CREATION_OPTIONS", 1L);
        v5.c cVar5 = new v5.c("CLEAR_CREDENTIAL_STATE", 1L);
        v5.c cVar6 = new v5.c("CREATE_CREDENTIAL", 3L);
        b = cVar6;
        c = new v5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new v5.c("REGISTER_CREATION_OPTIONS", 1L), new v5.c("REGISTER_EXPORT", 1L), new v5.c("IMPORT_CREDENTIALS", 1L), new v5.c("SIGNAL_CREDENTIAL_STATE", 1L), new v5.c("CLEAR_EXPORT", 1L), new v5.c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new v5.c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new v5.c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
