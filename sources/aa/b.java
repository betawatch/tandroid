package aa;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            default:
                return super.toString();
        }
    }

    public b(String str) {
        this.a = 1;
        this.b = str;
        this.c = 0;
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
