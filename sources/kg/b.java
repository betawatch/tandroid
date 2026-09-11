package kg;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.g5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.c = jSONArray2.getString(0);
                aVar.a = new long[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.a[i13] = jSONArray2.getLong(i14);
                    long j3 = aVar.a[i13];
                    if (j3 > aVar.e) {
                        aVar.e = j3;
                    }
                    if (j3 < aVar.f) {
                        aVar.f = j3;
                    }
                    i13 = i14;
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
        for (int i15 = 0; i15 < this.d.size(); i15++) {
            a aVar2 = (a) this.d.get(i15);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.g = g5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.i = i0.a.d(0.85f, -1, parseColor);
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

    public final int a(float f7, int i10) {
        int length = this.b.length;
        if (f7 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.b;
            float f10 = fArr[i13];
            if ((f7 > f10 && (i13 == i11 || f7 < fArr[i13 + 1])) || f7 == f10) {
                return i13;
            }
            if (f7 < f10) {
                i12 = i13 - 1;
            } else if (f7 > f10) {
                i10 = i13 + 1;
            }
        }
        return i12;
    }

    public final int b(float f7, int i10, int i11) {
        float[] fArr = this.b;
        int length = fArr.length;
        if (f7 <= fArr[i10]) {
            return i10;
        }
        if (f7 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.b;
            float f10 = fArr2[i12];
            if ((f7 > f10 && (i12 == length - 1 || f7 < fArr2[i12 + 1])) || f7 == f10) {
                return i12;
            }
            if (f7 < f10) {
                i11 = i12 - 1;
            } else if (f7 > f10) {
                i10 = i12 + 1;
            }
        }
        return i11;
    }

    public final int c(float f7) {
        int length;
        int i10 = 0;
        if (f7 == 0.0f || (length = this.b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.b;
            float f10 = fArr[i12];
            if ((f7 < f10 && (i12 == 0 || f7 > fArr[i12 - 1])) || f7 == f10) {
                return i12;
            }
            if (f7 < f10) {
                i11 = i12 - 1;
            } else if (f7 > f10) {
                i10 = i12 + 1;
            }
        }
        return i10;
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
            for (int i10 = 0; i10 < length; i10++) {
                this.b[i10] = (this.a[i10] - j3) / (j10 - j3);
            }
        }
        for (int i11 = 0; i11 < this.d.size(); i11++) {
            if (((a) this.d.get(i11)).e > this.e) {
                this.e = ((a) this.d.get(i11)).e;
            }
            if (((a) this.d.get(i11)).f < this.f) {
                this.f = ((a) this.d.get(i11)).f;
            }
            ((a) this.d.get(i11)).b = new SegmentTree(((a) this.d.get(i11)).a);
        }
        long j11 = this.k;
        this.c = new String[((int) ((j10 - j3) / j11)) + 10];
        SimpleDateFormat simpleDateFormat = j11 == 1 ? null : j11 < 86400000 ? new SimpleDateFormat("HH:mm") : new SimpleDateFormat("MMM d");
        int i12 = 0;
        while (true) {
            String[] strArr = this.c;
            if (i12 >= strArr.length) {
                float f7 = this.k;
                long[] jArr2 = this.a;
                this.g = f7 / (jArr2[jArr2.length - 1] - jArr2[0]);
                return;
            } else {
                if (this.k == 1) {
                    strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                } else {
                    strArr[i12] = simpleDateFormat.format(new Date((i12 * this.k) + j3));
                }
                i12++;
            }
        }
    }
}
