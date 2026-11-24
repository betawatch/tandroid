// default package

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class nyc {
    public static final int[] a = {cmb.qa, cmb.Uc, cmb.de, cmb.Wc, cmb.Md};
    public static final int[] b = {cmb.qb, cmb.Vc, cmb.ic, cmb.Xc, cmb.Sb};
    public static final int[] c = {cmb.tb, cmb.ub, cmb.vb};

    public static String a(ylb ylbVar, boolean z) {
        boolean a2 = ylbVar != null ? ylbVar.a() : cmb.I.o();
        int[] iArr = z ? b : a;
        try {
            int v = cmb.v(a2 ? -16777216 : -1, b(ylbVar, z));
            int v0 = cmb.v0(iArr[1], ylbVar);
            int v02 = cmb.v0(iArr[2], ylbVar);
            int v03 = cmb.v0(iArr[3], ylbVar);
            int v04 = cmb.v0(iArr[4], ylbVar);
            int v05 = cmb.v0(cmb.Ei, ylbVar);
            int v06 = cmb.v0(cmb.Ii, ylbVar);
            int v2 = cmb.v(v, cmb.p1(0.1f, v04));
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
            jSONObject.put("destructive_text_color", c(cmb.v0(cmb.o7, ylbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(cmb.p1(0.12f, v0), v));
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
            fc4.g(e, true);
            return b10.j(new StringBuilder("{\"colorScheme\":\""), a2 ? "dark" : "light", "\"}");
        }
    }

    public static int b(ylb ylbVar, boolean z) {
        int v0 = cmb.v0(z ? b[0] : a[0], ylbVar);
        if (z) {
            int[] iArr = c;
            int i = iArr[0];
            if ((ylbVar != null ? ylbVar.j(i) : cmb.km.get(i)) != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i2 = 1;
                for (int i3 : iArr) {
                    int j = ylbVar != null ? ylbVar.j(i3) : cmb.km.get(i3);
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
        int v = cmb.v(i2, i);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z) {
        return b10.j(new StringBuilder("{\"colorScheme\":\""), z ? "dark" : "light", "\"}");
    }

    public static int e(ylb ylbVar, boolean z) {
        int i = (ylbVar == null ? !cmb.I.o() : !ylbVar.a()) ? 0 : 1;
        for (int i2 : z ? b : a) {
            i = (i * 31) + cmb.v0(i2, ylbVar);
        }
        if (z) {
            for (int i3 : c) {
                i = (i * 31) + (ylbVar != null ? ylbVar.j(i3) : cmb.km.get(i3));
            }
        }
        int v0 = (((cmb.v0(cmb.o7, ylbVar) + ((cmb.v0(cmb.Ii, ylbVar) + ((cmb.v0(cmb.Ei, ylbVar) + (i * 31)) * 31)) * 31)) * 31) + gda.S0) * 31;
        TextPaint textPaint = cmb.n2;
        return al9.i0() + ((v0 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gda.S0);
        TextPaint textPaint = cmb.n2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(al9.i0() / gm.p) + "px");
        return jSONObject;
    }
}
