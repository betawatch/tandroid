package jg;

import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.ry;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d1 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final /* synthetic */ int g;
    public final /* synthetic */ fs h;
    public boolean d = false;
    public long f = -1;

    public d1(fs fsVar, int i7, long j3, long j10, int i10) {
        this.g = i10;
        this.h = fsVar;
        this.a = i7;
        this.b = j3;
        this.c = j10;
    }

    public final void a() {
        boolean N;
        switch (this.g) {
            case 0:
                N = ((h1) this.h).N();
                break;
            default:
                ry ryVar = (ry) this.h;
                if (ryVar.u1 == null || ryVar.getVisibility() != 0 || !ryVar.L0) {
                    N = false;
                    break;
                } else {
                    N = true;
                    break;
                }
        }
        this.d = N;
        if (N) {
            return;
        }
        if (this.e) {
            mp.u1(this.a).N4(2, 0, this.b, this.c, null);
        }
        this.f = -1L;
    }

    public final void b() {
        if (this.d) {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f > 2000) {
                this.e = true;
                this.f = System.currentTimeMillis();
                mp.u1(this.a).N4(10, 0, this.b, this.c, null);
            }
        }
    }
}
