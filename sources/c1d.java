// default package

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class c1d {
    public static final int[] a = {aob.ra, aob.Vc, aob.ee, aob.Xc, aob.Nd};
    public static final int[] b = {aob.rb, aob.Wc, aob.jc, aob.Yc, aob.Tb};
    public static final int[] c = {aob.ub, aob.vb, aob.wb};

    public static String a(vnb vnbVar, boolean z) {
        boolean a2 = vnbVar != null ? vnbVar.a() : aob.I.o();
        int[] iArr = z ? b : a;
        try {
            int v = aob.v(a2 ? -16777216 : -1, b(vnbVar, z));
            int v0 = aob.v0(iArr[1], vnbVar);
            int v02 = aob.v0(iArr[2], vnbVar);
            int v03 = aob.v0(iArr[3], vnbVar);
            int v04 = aob.v0(iArr[4], vnbVar);
            int v05 = aob.v0(aob.Fi, vnbVar);
            int v06 = aob.v0(aob.Ji, vnbVar);
            int v2 = aob.v(v, aob.p1(0.1f, v04));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(v, v));
            jSONObject.put("text_color", c(v0, v));
            jSONObject.put("hint_color", c(v02, v));
            jSONObject.put("link_color", c(v03, v));
            jSONObject.put("button_color", c(v05, v));
            jSONObject.put("button_text_color", c(v06, v05));
            jSONObject.put("secondary_bg_color", c(v2, v));
            jSONObject.put("accent_text_color", c(v04, v));
            jSONObject.put("subtitle_text_color", c(v02, v));
            jSONObject.put("destructive_text_color", c(aob.v0(aob.p7, vnbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(aob.p1(0.12f, v0), v));
            jSONObject.put("header_bg_color", c(v2, v));
            jSONObject.put("bottom_bar_bg_color", c(v2, v));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(v04, v));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("colorScheme", a2 ? "dark" : "light");
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            cc4.g(e, true);
            return c00.k(new StringBuilder("{\"colorScheme\":\""), a2 ? "dark" : "light", "\"}");
        }
    }

    public static int b(vnb vnbVar, boolean z) {
        int v0 = aob.v0(z ? b[0] : a[0], vnbVar);
        if (z) {
            int[] iArr = c;
            int i = iArr[0];
            if ((vnbVar != null ? vnbVar.j(i) : aob.lm.get(i)) != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i2 = 1;
                for (int i3 : iArr) {
                    int j = vnbVar != null ? vnbVar.j(i3) : aob.lm.get(i3);
                    if (j != 0) {
                        int red2 = Color.red(j) + red;
                        int green2 = Color.green(j) + green;
                        i2++;
                        blue = Color.blue(j) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(v0), red / i2, green / i2, blue / i2);
            }
        }
        return v0;
    }

    public static String c(int i, int i2) {
        int v = aob.v(i2, i);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z) {
        return c00.k(new StringBuilder("{\"colorScheme\":\""), z ? "dark" : "light", "\"}");
    }

    public static int e(vnb vnbVar, boolean z) {
        int i = (vnbVar == null ? !aob.I.o() : !vnbVar.a()) ? 0 : 1;
        for (int i2 : z ? b : a) {
            i = (i * 31) + aob.v0(i2, vnbVar);
        }
        if (z) {
            for (int i3 : c) {
                i = (i * 31) + (vnbVar != null ? vnbVar.j(i3) : aob.lm.get(i3));
            }
        }
        int v0 = (((aob.v0(aob.p7, vnbVar) + ((aob.v0(aob.Ji, vnbVar) + ((aob.v0(aob.Fi, vnbVar) + (i * 31)) * 31)) * 31)) * 31) + xea.S0) * 31;
        TextPaint textPaint = aob.o2;
        return nm9.i0() + ((v0 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", xea.S0);
        TextPaint textPaint = aob.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(nm9.i0() / hl.p) + "px");
        return jSONObject;
    }
}
