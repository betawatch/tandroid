package gf;

import android.support.v4.media.session.MediaSessionCompat$Token;
import kf.s;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public final Object g;

    public d(boolean z10, int i7, String str, String str2, MediaSessionCompat$Token mediaSessionCompat$Token, boolean z11, boolean z12) {
        this.a = z10;
        this.b = i7;
        this.f = str;
        this.g = str2;
        this.e = mediaSessionCompat$Token;
        this.c = z11;
        this.d = z12;
    }

    public d(s sVar, int i7, d dVar, e eVar, boolean z10) {
        this.c = true;
        this.d = false;
        this.e = sVar;
        this.b = i7;
        this.a = z10;
        this.f = dVar;
        this.g = eVar;
    }
}
