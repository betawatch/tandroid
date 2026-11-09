package db;

import ab.a0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class b extends a0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(int i7, String str) {
        super(str, r0);
        String str2;
        switch (i7) {
            case 55501:
                str2 = "The carrier associated with this SIM is not supported.";
                break;
            case 55502:
                str2 = "Invalid digital credential response.";
                break;
            case 55503:
                str2 = "Integrity check failed in an unexpected place.";
                break;
            case 55504:
                str2 = "Preflight check failed - we could not mint a digital credentials request on the server.";
                break;
            case 55505:
                str2 = "The API is not supported - this API with the specified parameters is not intended to be called at this time.";
                break;
            case 55506:
                str2 = "The Android Credential Manager has failed unexpectedly.";
                break;
            case 55507:
                str2 = "Invalid test number ID(s) - might be empty, expired or duplicated.";
                break;
            case 55508:
                str2 = "Test session already enabled - `enableTestSession` should only be called once.";
                break;
            case 55509:
                str2 = "An Activity context is required to call this API.";
                break;
            default:
                str2 = "An unexpected error has occurred.";
                break;
        }
        Throwable th2 = new Throwable(str2);
        q6.m.f(str, "Detail message must not be empty");
    }
}
