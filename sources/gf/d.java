package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d(boolean z9, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z10, boolean z11) {
        this.a = z9;
        this.b = i7;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z10;
        this.d = z11;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z9) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i7;
        this.a = z9;
        this.f = dVar;
        this.g = eVar;
    }
}
