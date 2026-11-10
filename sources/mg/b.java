package mg;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.d0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.v4;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class b {
    public long[] a;
    public float[] b;
    public String[] c;
    public ArrayList d = new ArrayList();
    public long e = 0;
    public long f = Long.MAX_VALUE;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i;
    public int j;
    public long k;

    public b(JSONObject jSONObject) {
        this.i = 0;
        this.j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i7);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.a = new long[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    this.a[i10] = jSONArray2.getLong(i11);
                    i10 = i11;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.c = jSONArray2.getString(0);
                aVar.a = new long[length2];
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12 + 1;
                    aVar.a[i12] = jSONArray2.getLong(i13);
                    long j3 = aVar.a[i12];
                    if (j3 > aVar.e) {
                        aVar.e = j3;
                    }
                    if (j3 < aVar.f) {
                        aVar.f = j3;
                    }
                    i12 = i13;
                }
            }
            long[] jArr = this.a;
            if (jArr.length > 1) {
                this.k = jArr[1] - jArr[0];
            } else {
                this.k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i14 = 0; i14 < this.d.size(); i14++) {
            a aVar2 = (a) this.d.get(i14);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.g = v4.h("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.i = i0.a.f(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.c);
            }
        }
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("TON")) {
            return 1;
        }
        return str.contains("XTR") ? 2 : 0;
    }

    public final int a(float f10, int i7) {
        int length = this.b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i10 = length - 1;
        int i11 = i10;
        while (i7 <= i11) {
            int i12 = (i11 + i7) >> 1;
            float[] fArr = this.b;
            float f11 = fArr[i12];
            if ((f10 > f11 && (i12 == i10 || f10 < fArr[i12 + 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i7 = i12 + 1;
            }
        }
        return i11;
    }

    public final int b(float f10, int i7, int i10) {
        float[] fArr = this.b;
        int length = fArr.length;
        if (f10 <= fArr[i7]) {
            return i7;
        }
        if (f10 >= fArr[i10]) {
            return i10;
        }
        while (i7 <= i10) {
            int i11 = (i10 + i7) >> 1;
            float[] fArr2 = this.b;
            float f11 = fArr2[i11];
            if ((f10 > f11 && (i11 == length - 1 || f10 < fArr2[i11 + 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i7 = i11 + 1;
            }
        }
        return i10;
    }

    public final int c(float f10) {
        int length;
        int i7 = 0;
        if (f10 == 0.0f || (length = this.b.length) < 2) {
            return 0;
        }
        int i10 = length - 1;
        while (i7 <= i10) {
            int i11 = (i10 + i7) >> 1;
            float[] fArr = this.b;
            float f11 = fArr[i11];
            if ((f10 < f11 && (i11 == 0 || f10 > fArr[i11 - 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i7 = i11 + 1;
            }
        }
        return i7;
    }

    public void e() {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j3 = jArr[0];
        long j10 = jArr[length - 1];
        float[] fArr = new float[length];
        this.b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i7 = 0; i7 < length; i7++) {
                this.b[i7] = (this.a[i7] - j3) / (j10 - j3);
            }
        }
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            if (((a) this.d.get(i10)).e > this.e) {
                this.e = ((a) this.d.get(i10)).e;
            }
            if (((a) this.d.get(i10)).f < this.f) {
                this.f = ((a) this.d.get(i10)).f;
            }
            ((a) this.d.get(i10)).b = new d0(((a) this.d.get(i10)).a);
        }
        long j11 = this.k;
        this.c = new String[((int) ((j10 - j3) / j11)) + 10];
        SimpleDateFormat simpleDateFormat = j11 == 1 ? null : j11 < 86400000 ? new SimpleDateFormat("HH:mm") : new SimpleDateFormat("MMM d");
        int i11 = 0;
        while (true) {
            String[] strArr = this.c;
            if (i11 >= strArr.length) {
                float f10 = this.k;
                long[] jArr2 = this.a;
                this.g = f10 / (jArr2[jArr2.length - 1] - jArr2[0]);
                return;
            } else {
                if (this.k == 1) {
                    strArr[i11] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i11));
                } else {
                    strArr[i11] = simpleDateFormat.format(new Date((i11 * this.k) + j3));
                }
                i11++;
            }
        }
    }
}
