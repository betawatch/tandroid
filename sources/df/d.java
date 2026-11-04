package df;

import android.support.v4.media.session.MediaSessionCompat$Token;
import gf.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d(boolean z10, int i3, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i3;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public d(s sVar, int i3, d dVar, e eVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i3;
        this.a = z10;
        this.f = dVar;
        this.g = eVar;
    }
}
