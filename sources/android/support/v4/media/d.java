package android.support.v4.media;

import a0.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.c0;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d {
    public final Bundle a;

    public d(Context context) {
        j.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public MediaMetadataCompat a() {
        return new MediaMetadataCompat(this.a);
    }

    public Boolean b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public void c(String str, Bitmap bitmap) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.o("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.a.putParcelable(str, bitmap);
    }

    public void d(long j10, String str) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(a.o("The ", str, " key cannot be used to put a long"));
        }
        this.a.putLong(str, j10);
    }

    public void e(String str, String str2) {
        f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.o("The ", str, " key cannot be used to put a String"));
        }
        this.a.putCharSequence(str, str2);
    }

    public d() {
        this.a = new Bundle();
    }

    public d(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        c0.a(bundle);
    }
}
