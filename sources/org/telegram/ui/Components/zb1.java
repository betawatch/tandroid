package org.telegram.ui.Components;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class zb1 {
    public static final int[] a = {org.telegram.ui.ActionBar.y6.ra, org.telegram.ui.ActionBar.y6.ec, org.telegram.ui.ActionBar.y6.nd, org.telegram.ui.ActionBar.y6.gc, org.telegram.ui.ActionBar.y6.Wc};
    public static final int[] b = {org.telegram.ui.ActionBar.y6.Aa, org.telegram.ui.ActionBar.y6.fc, org.telegram.ui.ActionBar.y6.sb, org.telegram.ui.ActionBar.y6.hc, org.telegram.ui.ActionBar.y6.cb};
    public static final int[] c = {org.telegram.ui.ActionBar.y6.Da, org.telegram.ui.ActionBar.y6.Ea, org.telegram.ui.ActionBar.y6.Fa};

    public static String a(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        int[] iArr = z10 ? b : a;
        try {
            int v = org.telegram.ui.ActionBar.y6.v(a2 ? -16777216 : -1, b(u6Var, z10));
            int w02 = org.telegram.ui.ActionBar.y6.w0(iArr[1], u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(iArr[2], u6Var);
            int w04 = org.telegram.ui.ActionBar.y6.w0(iArr[3], u6Var);
            int w05 = org.telegram.ui.ActionBar.y6.w0(iArr[4], u6Var);
            int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
            int w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u6Var);
            int v10 = org.telegram.ui.ActionBar.y6.v(v, org.telegram.ui.ActionBar.y6.o1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(v, v));
            jSONObject.put("text_color", c(w02, v));
            jSONObject.put("hint_color", c(w03, v));
            jSONObject.put("link_color", c(w04, v));
            jSONObject.put("button_color", c(w06, v));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(v10, v));
            jSONObject.put("accent_text_color", c(w05, v));
            jSONObject.put("subtitle_text_color", c(w03, v));
            jSONObject.put("destructive_text_color", c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p7, u6Var), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(w05, v));
            jSONObject.put("section_separator_color", c(org.telegram.ui.ActionBar.y6.o1(0.12f, w02), v));
            jSONObject.put("header_bg_color", c(v10, v));
            jSONObject.put("bottom_bar_bg_color", c(v10, v));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, v));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("colorScheme", a2 ? "dark" : "light");
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            FileLog.e(e);
            return a1.g.s(new StringBuilder("{\"colorScheme\":\""), a2 ? "dark" : "light", "\"}");
        }
    }

    public static int b(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(z10 ? b[0] : a[0], u6Var);
        if (z10) {
            int[] iArr = c;
            int i10 = iArr[0];
            if ((u6Var != null ? u6Var.i(i10) : org.telegram.ui.ActionBar.y6.ul.get(i10)) != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i11 = 1;
                for (int i12 : iArr) {
                    int i13 = u6Var != null ? u6Var.i(i12) : org.telegram.ui.ActionBar.y6.ul.get(i12);
                    if (i13 != 0) {
                        int red2 = Color.red(i13) + red;
                        int green2 = Color.green(i13) + green;
                        i11++;
                        blue = Color.blue(i13) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i11, green / i11, blue / i11);
            }
        }
        return w02;
    }

    public static String c(int i10, int i11) {
        int v = org.telegram.ui.ActionBar.y6.v(i11, i10);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z10) {
        return a1.g.s(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}");
    }

    public static int e(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        int i10 = (u6Var == null ? !org.telegram.ui.ActionBar.y6.I.q() : !u6Var.a()) ? 0 : 1;
        for (int i11 : z10 ? b : a) {
            i10 = (i10 * 31) + org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        }
        if (z10) {
            for (int i12 : c) {
                i10 = (i10 * 31) + (u6Var != null ? u6Var.i(i12) : org.telegram.ui.ActionBar.y6.ul.get(i12));
            }
        }
        int w02 = (((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.p7, u6Var) + ((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u6Var) + ((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var) + (i10 * 31)) * 31)) * 31)) * 31) + SharedConfig.fontSize) * 31;
        TextPaint textPaint = org.telegram.ui.ActionBar.y6.o2;
        return an0.g() + ((w02 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", SharedConfig.fontSize);
        TextPaint textPaint = org.telegram.ui.ActionBar.y6.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(an0.g() / AndroidUtilities.density) + "px");
        return jSONObject;
    }
}
