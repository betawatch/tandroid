package ai;

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class t {
    public final String a;
    public final String[] b;
    public volatile String[] c;
    public volatile String[] d;
    public volatile long e;
    public volatile long f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile float k;
    public final ArrayList h = new ArrayList();
    public final ArrayList l = new ArrayList();

    public t(String str, String[] strArr, String[] strArr2, long j3) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
        this.e = j3;
    }

    public final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(DictationAsr.d0(this, str2));
        }
        return sb2.toString();
    }

    public final String b() {
        return a8.p0.s(new StringBuilder(), this.a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final String[] d(String str) {
        String[] strArr = this.d != null ? this.d : this.c;
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (DictationAsr.o(str2).equals(str)) {
                arrayList.add(str2);
            }
        }
        String b10 = DictationAsr.b(arrayList);
        if (b10 != null) {
            arrayList.remove(b10);
            arrayList.add(0, b10);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
