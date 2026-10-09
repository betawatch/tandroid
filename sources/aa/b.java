package aa;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b {
    public final /* synthetic */ int a;
    public String b;
    public int c;

    public int a() {
        String str = this.b;
        int i10 = this.c;
        this.c = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.c;
            this.c = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 < 55296) {
                return (charAt2 << i12) | i11;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.c + ": " + this.b;
            case 3:
                return this.b;
            default:
                return super.toString();
        }
    }

    public b(String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 3:
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

    public b(String str, int i10, Object[] objArr) {
        this.a = 2;
        this.b = String.format(str, objArr);
        this.c = i10;
    }

    public b(int i10, String str) {
        this.a = 0;
        this.c = i10;
        this.b = str;
    }
}
