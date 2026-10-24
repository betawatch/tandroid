package af;

import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public e(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i10;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public e(df.s sVar, int i10, e eVar, f fVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i10;
        this.a = z10;
        this.f = eVar;
        this.g = fVar;
    }
}
