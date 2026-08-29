package ie;

import android.support.v4.media.session.MediaSessionCompat$Token;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public b(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i10;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public b(s sVar, int i10, b bVar, c cVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i10;
        this.a = z10;
        this.f = bVar;
        this.g = cVar;
    }
}
