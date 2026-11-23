package ee;

import com.google.android.gms.internal.vision.e2;
import h2.x;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class t {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ t(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    public static t a(x xVar) {
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
        return new t(m10.toString(), 1);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }
}
