package bf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import ef.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d(boolean z10, int i10, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i10;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public d(s sVar, int i10, d dVar, e eVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i10;
        this.a = z10;
        this.f = dVar;
        this.g = eVar;
    }
}
