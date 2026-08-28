package fe;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ie.s;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public b(boolean z10, int i9, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i9;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public b(s sVar, int i9, b bVar, c cVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i9;
        this.a = z10;
        this.f = bVar;
        this.g = cVar;
    }
}
