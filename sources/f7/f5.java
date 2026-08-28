package f7;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f5 {
    public static void a(com.google.android.exoplayer2.upstream.m mVar) {
        if (mVar != null) {
            try {
                mVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
