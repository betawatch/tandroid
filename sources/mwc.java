// default package

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class mwc {
    public static final int[] a = {bkb.qa, bkb.Uc, bkb.de, bkb.Wc, bkb.Md};
    public static final int[] b = {bkb.qb, bkb.Vc, bkb.ic, bkb.Xc, bkb.Sb};
    public static final int[] c = {bkb.tb, bkb.ub, bkb.vb};

    public static String a(wjb wjbVar, boolean z) {
        boolean a2 = wjbVar != null ? wjbVar.a() : bkb.I.o();
        int[] iArr = z ? b : a;
        try {
            int v = bkb.v(a2 ? -16777216 : -1, b(wjbVar, z));
            int v0 = bkb.v0(iArr[1], wjbVar);
            int v02 = bkb.v0(iArr[2], wjbVar);
            int v03 = bkb.v0(iArr[3], wjbVar);
            int v04 = bkb.v0(iArr[4], wjbVar);
            int v05 = bkb.v0(bkb.Ei, wjbVar);
            int v06 = bkb.v0(bkb.Ii, wjbVar);
            int v2 = bkb.v(v, bkb.p1(0.1f, v04));
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
            jSONObject.put("destructive_text_color", c(bkb.v0(bkb.o7, wjbVar), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(v04, v));
            jSONObject.put("section_separator_color", c(bkb.p1(0.12f, v0), v));
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
            fa4.g(e, true);
            return b00.j(new StringBuilder("{\"colorScheme\":\""), a2 ? "dark" : "light", "\"}");
        }
    }

    public static int b(wjb wjbVar, boolean z) {
        int v0 = bkb.v0(z ? b[0] : a[0], wjbVar);
        if (z) {
            int[] iArr = c;
            int i = iArr[0];
            if ((wjbVar != null ? wjbVar.j(i) : bkb.km.get(i)) != 0) {
                int red = Color.red(v0);
                int green = Color.green(v0);
                int blue = Color.blue(v0);
                int i2 = 1;
                for (int i3 : iArr) {
                    int j = wjbVar != null ? wjbVar.j(i3) : bkb.km.get(i3);
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
        int v = bkb.v(i2, i);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z) {
        return b00.j(new StringBuilder("{\"colorScheme\":\""), z ? "dark" : "light", "\"}");
    }

    public static int e(wjb wjbVar, boolean z) {
        int i = (wjbVar == null ? !bkb.I.o() : !wjbVar.a()) ? 0 : 1;
        for (int i2 : z ? b : a) {
            i = (i * 31) + bkb.v0(i2, wjbVar);
        }
        if (z) {
            for (int i3 : c) {
                i = (i * 31) + (wjbVar != null ? wjbVar.j(i3) : bkb.km.get(i3));
            }
        }
        int v0 = (((bkb.v0(bkb.o7, wjbVar) + ((bkb.v0(bkb.Ii, wjbVar) + ((bkb.v0(bkb.Ei, wjbVar) + (i * 31)) * 31)) * 31)) * 31) + gba.S0) * 31;
        TextPaint textPaint = bkb.n2;
        return zi9.j0() + ((v0 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gba.S0);
        TextPaint textPaint = bkb.n2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(zi9.j0() / gl.p) + "px");
        return jSONObject;
    }
}
