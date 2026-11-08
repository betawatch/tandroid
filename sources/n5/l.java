package n5;

import a8.p0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.a;
            if (num != null ? num.equals(((l) aVar).a) : ((l) aVar).a == null) {
                String str = this.b;
                if (str != null ? str.equals(((l) aVar).b) : ((l) aVar).b == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(((l) aVar).c) : ((l) aVar).c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((l) aVar).d) : ((l) aVar).d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((l) aVar).e) : ((l) aVar).e == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(((l) aVar).f) : ((l) aVar).f == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(((l) aVar).g) : ((l) aVar).g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((l) aVar).h) : ((l) aVar).h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((l) aVar).i) : ((l) aVar).i == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(((l) aVar).j) : ((l) aVar).j == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(((l) aVar).k) : ((l) aVar).k == null) {
                                                        String str11 = this.l;
                                                        if (str11 != null ? str11.equals(((l) aVar).l) : ((l) aVar).l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(this.b);
        sb2.append(", hardware=");
        sb2.append(this.c);
        sb2.append(", device=");
        sb2.append(this.d);
        sb2.append(", product=");
        sb2.append(this.e);
        sb2.append(", osBuild=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(this.g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.i);
        sb2.append(", country=");
        sb2.append(this.j);
        sb2.append(", mccMnc=");
        sb2.append(this.k);
        sb2.append(", applicationBuild=");
        return p0.s(sb2, this.l, "}");
    }
}
