package aa;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b0 {
    public final /* synthetic */ int a;
    public String b;

    public static b0 a(h2.x xVar) {
        String str;
        xVar.O(2);
        int A = xVar.A();
        int i7 = A >> 1;
        int A2 = ((xVar.A() >> 3) & 31) | ((A & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7 || i7 == 8) {
            str = "dvhe";
        } else if (i7 == 9) {
            str = "dvav";
        } else {
            if (i7 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder m10 = e2.m(str);
        m10.append(i7 < 10 ? ".0" : ".");
        m10.append(i7);
        m10.append(A2 < 10 ? ".0" : ".");
        m10.append(A2);
        return new b0(m10.toString(), 2);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b0(String str, int i7) {
        this.a = i7;
        this.b = str;
    }
}
