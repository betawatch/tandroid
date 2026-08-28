package a7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c {
    public static final u5.c a;
    public static final u5.c b;
    public static final u5.c[] c;

    static {
        u5.c cVar = new u5.c("GET_CREDENTIAL", 1L);
        a = cVar;
        u5.c cVar2 = new u5.c("CREDENTIAL_REGISTRY", 1L);
        u5.c cVar3 = new u5.c("CLEAR_REGISTRY", 2L);
        u5.c cVar4 = new u5.c("CLEAR_CREATION_OPTIONS", 1L);
        u5.c cVar5 = new u5.c("CLEAR_CREDENTIAL_STATE", 1L);
        u5.c cVar6 = new u5.c("CREATE_CREDENTIAL", 3L);
        b = cVar6;
        c = new u5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, new u5.c("REGISTER_CREATION_OPTIONS", 1L), new u5.c("REGISTER_EXPORT", 1L), new u5.c("IMPORT_CREDENTIALS", 1L), new u5.c("SIGNAL_CREDENTIAL_STATE", 1L), new u5.c("CLEAR_EXPORT", 1L), new u5.c("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new u5.c("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new u5.c("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }
}
