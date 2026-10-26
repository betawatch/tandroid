package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dc1 {
    public static final TextPaint b = new TextPaint();
    public final ArrayList a;

    public dc1(ArrayList arrayList) {
        this.a = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dc1 a(String str, w81 w81Var, float f7) {
        bc1 bc1Var;
        ArrayList arrayList;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint;
        int i11;
        float f17;
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (i13 < jSONArray.length()) {
            int optInt = jSONArray.getJSONArray(i13).optInt(i12);
            int i14 = i13;
            while (i14 < jSONArray.length() && jSONArray.getJSONArray(i14).optInt(i12) == optInt) {
                i14++;
            }
            ArrayList arrayList3 = new ArrayList();
            float[] fArr = new float[64];
            float f18 = Float.MAX_VALUE;
            float f19 = -3.4028235E38f;
            float f20 = -3.4028235E38f;
            ac1 ac1Var = null;
            float f21 = Float.MAX_VALUE;
            while (i13 < i14) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i13);
                float optDouble = ((float) jSONArray2.optDouble(1)) * f7;
                JSONArray jSONArray3 = jSONArray;
                ArrayList arrayList4 = arrayList2;
                float optDouble2 = ((float) jSONArray2.optDouble(2)) * f7;
                int i15 = i13;
                float optDouble3 = ((float) jSONArray2.optDouble(3)) * f7;
                float optDouble4 = ((float) jSONArray2.optDouble(4)) * f7;
                ArrayList arrayList5 = arrayList3;
                float optDouble5 = ((float) jSONArray2.optDouble(7)) * f7;
                float optDouble6 = ((float) jSONArray2.optDouble(8)) * f7;
                String optString = jSONArray2.optString(9);
                if (!optString.isEmpty()) {
                    JSONArray optJSONArray = jSONArray2.optJSONArray(10);
                    if (optJSONArray == null || optJSONArray.length() != 6 || Math.abs(optJSONArray.optDouble(1)) >= 1.0E-4d || Math.abs(optJSONArray.optDouble(2)) >= 1.0E-4d || optJSONArray.optDouble(0) <= 0.0d || optJSONArray.optDouble(3) <= 0.0d) {
                        f10 = optDouble;
                        f11 = optDouble4;
                        f12 = optDouble3;
                        f13 = optDouble5;
                        f14 = 1.0f;
                        f15 = optDouble2;
                    } else {
                        f14 = (float) optJSONArray.optDouble(0);
                        float optDouble7 = (float) optJSONArray.optDouble(3);
                        f10 = (((float) optJSONArray.optDouble(4)) * f7) + (f14 * optDouble);
                        f15 = (((float) optJSONArray.optDouble(5)) * f7) + (optDouble7 * optDouble2);
                        f12 = optDouble3 * f14;
                        f11 = optDouble4 * optDouble7;
                        f13 = optDouble5 * f14;
                        optDouble6 *= f14;
                    }
                    if (f12 > 0.0f || f11 > 0.0f) {
                        float f22 = (f11 / 2.0f) + f15;
                        if (ac1Var != null) {
                            StringBuilder sb2 = ac1Var.d;
                            f16 = f11;
                            if (f22 >= ac1Var.a && f22 <= ac1Var.b) {
                                if (f10 - ac1Var.c > 1.0f && ((sb2.length() <= 0 || !Character.isWhitespace(sb2.charAt(sb2.length() - 1))) && !Character.isWhitespace(optString.charAt(0)))) {
                                    sb2.append(' ');
                                    ac1Var.e.add(Float.valueOf(ac1Var.c));
                                }
                                arrayList = arrayList5;
                                ac1Var.a = Math.min(ac1Var.a, f15);
                                float f23 = f12;
                                float f24 = f15 + f16;
                                ac1Var.b = Math.max(ac1Var.b, f24);
                                float f25 = optDouble6;
                                paint = (Paint) ((HashMap) w81Var.a).get(Integer.valueOf(jSONArray2.optInt(6)));
                                i10 = i14;
                                if (fArr.length < optString.length()) {
                                    fArr = new float[optString.length()];
                                }
                                if (paint != null) {
                                    paint.getTextWidths(optString, fArr);
                                }
                                float f26 = f10;
                                i11 = 0;
                                while (i11 < optString.length()) {
                                    float[] fArr2 = fArr;
                                    ac1Var.d.append(optString.charAt(i11));
                                    ac1Var.e.add(Float.valueOf(f26));
                                    if (paint == null) {
                                        f17 = (((i11 + 1) * f23) / optString.length()) + f10;
                                    } else {
                                        f17 = (fArr2[i11] * f14) + (Character.isLowSurrogate(optString.charAt(i11)) ? 0.0f : f13) + f26;
                                        if (optString.charAt(i11) == ' ' || optString.charAt(i11) == 160) {
                                            f17 += f25;
                                        }
                                    }
                                    f26 = f17;
                                    i11++;
                                    fArr = fArr2;
                                }
                                ac1Var.c = Math.max(f26, f10 + f23);
                                float min = Math.min(f18, f10);
                                float min2 = Math.min(f21, f15);
                                float max = Math.max(f19, ac1Var.c);
                                f21 = min2;
                                f18 = min;
                                f20 = Math.max(f20, f24);
                                f19 = max;
                                i13 = i15 + 1;
                                arrayList3 = arrayList;
                                jSONArray = jSONArray3;
                                arrayList2 = arrayList4;
                                i14 = i10;
                            }
                        } else {
                            f16 = f11;
                        }
                        if (ac1Var != null) {
                            StringBuilder sb3 = ac1Var.d;
                            if (sb3.length() > 0 && (sb3.length() <= 0 || !Character.isWhitespace(sb3.charAt(sb3.length() - 1)))) {
                                sb3.append(' ');
                                ac1Var.e.add(Float.valueOf(ac1Var.c));
                            }
                        }
                        ac1Var = new ac1();
                        arrayList = arrayList5;
                        arrayList.add(ac1Var);
                        ac1Var.a = Math.min(ac1Var.a, f15);
                        float f232 = f12;
                        float f242 = f15 + f16;
                        ac1Var.b = Math.max(ac1Var.b, f242);
                        float f252 = optDouble6;
                        paint = (Paint) ((HashMap) w81Var.a).get(Integer.valueOf(jSONArray2.optInt(6)));
                        i10 = i14;
                        if (fArr.length < optString.length()) {
                        }
                        if (paint != null) {
                        }
                        float f262 = f10;
                        i11 = 0;
                        while (i11 < optString.length()) {
                        }
                        ac1Var.c = Math.max(f262, f10 + f232);
                        float min3 = Math.min(f18, f10);
                        float min22 = Math.min(f21, f15);
                        float max2 = Math.max(f19, ac1Var.c);
                        f21 = min22;
                        f18 = min3;
                        f20 = Math.max(f20, f242);
                        f19 = max2;
                        i13 = i15 + 1;
                        arrayList3 = arrayList;
                        jSONArray = jSONArray3;
                        arrayList2 = arrayList4;
                        i14 = i10;
                    } else if (ac1Var != null) {
                        ac1Var.d.append('\n');
                        ac1Var.e.add(Float.valueOf(ac1Var.c));
                        ac1Var = null;
                    }
                }
                arrayList = arrayList5;
                i10 = i14;
                i13 = i15 + 1;
                arrayList3 = arrayList;
                jSONArray = jSONArray3;
                arrayList2 = arrayList4;
                i14 = i10;
            }
            JSONArray jSONArray4 = jSONArray;
            ArrayList arrayList6 = arrayList2;
            ArrayList arrayList7 = arrayList3;
            int i16 = i14;
            if (arrayList7.isEmpty()) {
                bc1Var = null;
            } else {
                StringBuilder sb4 = new StringBuilder();
                int[] iArr = new int[arrayList7.size() + 1];
                int[] iArr2 = new int[arrayList7.size() + 1];
                float[][] fArr3 = new float[arrayList7.size()][];
                int floor = (int) Math.floor(f18);
                int floor2 = (int) Math.floor(f21);
                int i17 = 0;
                while (i17 < arrayList7.size()) {
                    ac1 ac1Var2 = (ac1) arrayList7.get(i17);
                    iArr[i17] = sb4.length();
                    StringBuilder sb5 = ac1Var2.d;
                    ArrayList arrayList8 = ac1Var2.e;
                    sb4.append((CharSequence) sb5);
                    iArr2[i17] = Math.round(ac1Var2.a) - floor2;
                    float[] fArr4 = new float[arrayList8.size() + 1];
                    int i18 = 0;
                    while (i18 < arrayList8.size()) {
                        fArr4[i18] = ((Float) arrayList8.get(i18)).floatValue() - floor;
                        i18++;
                        sb4 = sb4;
                    }
                    fArr4[arrayList8.size()] = ac1Var2.c - floor;
                    fArr3[i17] = fArr4;
                    i17++;
                    sb4 = sb4;
                }
                StringBuilder sb6 = sb4;
                iArr[arrayList7.size()] = sb6.length();
                iArr2[arrayList7.size()] = Math.round(f20) - floor2;
                for (int i19 = 1; i19 < arrayList7.size(); i19++) {
                    iArr2[i19] = Math.max(iArr2[i19 - 1], iArr2[i19]);
                }
                String sb7 = sb6.toString();
                int ceil = ((int) Math.ceil(f19)) - floor;
                int i20 = iArr2[arrayList7.size()];
                bc1Var = new bc1(sb7, floor, floor2, ceil, iArr, iArr2, fArr3);
            }
            arrayList2 = arrayList6;
            if (bc1Var != null) {
                arrayList2.add(bc1Var);
            }
            jSONArray = jSONArray4;
            i13 = i16;
            i12 = 0;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new dc1(arrayList2);
    }
}
