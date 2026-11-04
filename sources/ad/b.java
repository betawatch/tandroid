package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ int a;
    public String b;
    public int c;

    public int a() {
        String str = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        char charAt = str.charAt(i3);
        if (charAt < 55296) {
            return charAt;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            int i12 = this.c;
            this.c = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                return (charAt2 << i11) | i10;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.c + ": " + this.b;
            case 4:
                return this.b;
            default:
                return super.toString();
        }
    }

    public b(String str, int i3) {
        this.a = i3;
        switch (i3) {
            case 4:
                String[] split = str.split(" +", 3);
                if (split.length < 2) {
                    throw new IllegalArgumentException();
                }
                String str2 = split[0];
                this.c = Integer.parseInt(split[1]);
                if (split.length == 3) {
                    String str3 = split[2];
                }
                this.b = str;
                return;
            default:
                this.b = str;
                this.c = 0;
                return;
        }
    }

    public b(int i3, String str, Object[] objArr) {
        this.a = 0;
        this.b = String.format(str, objArr);
        this.c = i3;
    }

    public b(int i3, String str) {
        this.a = 3;
        this.c = i3;
        this.b = str;
    }
}
