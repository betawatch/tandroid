package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface StandardIntegrityManager {

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class PrepareIntegrityTokenRequest {

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j10);
        }

        public static Builder builder() {
            c cVar = new c();
            cVar.a(0);
            return cVar;
        }

        public abstract int a();

        public abstract long b();
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i9);

        public abstract String token();
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class StandardIntegrityTokenRequest {

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);

            public abstract Builder setVerdictOptOut(Set<Integer> set);
        }

        public static Builder builder() {
            f fVar = new f();
            int i9 = k8.j.c;
            fVar.setVerdictOptOut(k8.l.h);
            return fVar;
        }

        public abstract String requestHash();

        public abstract Set<Integer> verdictOptOut();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
