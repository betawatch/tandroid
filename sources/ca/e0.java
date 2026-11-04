package ca;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public List i;
    public byte j;

    public final f0 a() {
        String str;
        if (this.j == 63 && (str = this.b) != null) {
            return new f0(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.b == null) {
            sb2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
