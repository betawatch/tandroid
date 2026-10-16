package android.support.v4.media;

import a0.f;
import a1.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.b0;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c {
    public final Bundle a;

    public c(Context context) {
        i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void b(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(g.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }

    public void c(long j10) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.a.putLong("android.media.metadata.DURATION", j10);
    }

    public void d(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(g.p("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public c() {
        this.a = new Bundle();
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        b0.a(bundle);
    }
}
