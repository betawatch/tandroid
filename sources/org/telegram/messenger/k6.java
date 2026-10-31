package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class k6 {
    public static final HashMap a = new HashMap();
    public static final int b;
    public static final int c;
    public static final Paint d;
    public static final int[] e;
    public static final Bitmap[][] f;
    public static final boolean[][] g;
    public static final HashMap h;
    public static final ArrayList i;
    public static final HashMap j;
    public static boolean k;
    public static final ag.f3 l;
    public static float m;
    public static boolean n;
    public static final String[] o;

    static {
        String[][] strArr = l6.i;
        e = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        f = new Bitmap[8][];
        g = new boolean[8][];
        h = new HashMap();
        i = new ArrayList();
        j = new HashMap();
        l = new ag.f3(15);
        n = true;
        o = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        b = i0.L(20.0f);
        c = i0.L(i0.Q1() ? 40.0f : 34.0f);
        int i10 = 0;
        while (true) {
            Bitmap[][] bitmapArr = f;
            if (i10 >= bitmapArr.length) {
                break;
            }
            int i11 = e[i10];
            bitmapArr[i10] = new Bitmap[i11];
            g[i10] = new boolean[i11];
            i10++;
        }
        int i12 = 0;
        while (true) {
            char[] cArr = l6.a;
            if (i12 >= 8) {
                Paint paint = new Paint();
                d = paint;
                paint.setColor(0);
                return;
            }
            int i13 = 0;
            while (true) {
                String[] strArr2 = l6.i[i12];
                if (i13 < strArr2.length) {
                    HashMap hashMap = a;
                    String str = strArr2[i13];
                    f6 f6Var = new f6();
                    f6Var.a = (byte) i12;
                    f6Var.b = (short) i13;
                    hashMap.put(str, f6Var);
                    i13++;
                }
            }
            i12++;
        }
    }

    public static void a(String str) {
        HashMap hashMap = h;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList arrayList = i;
            hashMap.remove((String) i0.a.g(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 55356 || charAt > 55358) {
                if (charAt == 8419) {
                    return str;
                }
                if (charAt >= 8252 && charAt <= 12953 && l6.j.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    i10++;
                    sb2.append(str.substring(0, i10));
                    sb2.append("️");
                    sb2.append(str.substring(i10));
                    str = sb2.toString();
                    length++;
                }
            } else if (charAt != 55356 || i10 >= length - 1) {
                i10++;
            } else {
                int i11 = i10 + 1;
                char charAt2 = str.charAt(i11);
                if (charAt2 == 56879 || charAt2 == 56324 || charAt2 == 56858 || charAt2 == 56703) {
                    StringBuilder sb3 = new StringBuilder();
                    i10 += 2;
                    sb3.append(str.substring(0, i10));
                    sb3.append("️");
                    sb3.append(str.substring(i10));
                    str = sb3.toString();
                    length++;
                } else {
                    i10 = i11;
                }
            }
            i10++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence) {
        int[] iArr = new int[1];
        j(charSequence, iArr);
        return iArr[0] > 0;
    }

    public static f6 e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (b(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap hashMap = a;
        f6 f6Var = (f6) hashMap.get(charSequence);
        return (f6Var != null || (charSequence2 = (CharSequence) l6.n.get(charSequence)) == null) ? f6Var : (f6) hashMap.get(charSequence2);
    }

    public static g6 f(String str) {
        CharSequence charSequence;
        g6 a2 = k4.a(str, null, null);
        if (a2 != null) {
            int i10 = b;
            a2.setBounds(0, 0, i10, i10);
        } else {
            a2 = null;
        }
        if (a2 == null) {
            a2 = g(str);
        }
        if (a2 == null && (charSequence = (CharSequence) l6.n.get(str)) != null) {
            a2 = g(charSequence);
        }
        if (a2 == null) {
            return null;
        }
        int i11 = c;
        a2.setBounds(0, 0, i11, i11);
        a2.a = true;
        return a2;
    }

    public static g6 g(CharSequence charSequence) {
        i4 a2;
        f6 e7 = e(charSequence);
        int i10 = b;
        if (e7 == null) {
            if (charSequence == null || (a2 = k4.a(charSequence.toString(), null, null)) == null) {
                return null;
            }
            a2.setBounds(0, 0, i10, i10);
            return a2;
        }
        boolean b10 = b(charSequence);
        j6 j6Var = new j6();
        j6Var.c = e7;
        j6Var.d = b10;
        j6Var.setBounds(0, 0, i10, i10);
        return j6Var;
    }

    public static boolean h(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap hashMap = a;
        f6 f6Var = (f6) hashMap.get(charSequence);
        if (f6Var == null && (charSequence2 = (CharSequence) l6.n.get(charSequence)) != null) {
            f6Var = (f6) hashMap.get(charSequence2);
        }
        return f6Var != null;
    }

    public static void i(final byte b10, final short s10) {
        if (f[b10][s10] == null) {
            boolean[] zArr = g[b10];
            if (zArr[s10]) {
                return;
            }
            zArr[s10] = true;
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.e6
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap;
                    byte b11 = b10;
                    short s11 = s10;
                    try {
                        bitmap = m6.a.h(b11, s11);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        k6.f[b11][s11] = bitmap;
                        ag.f3 f3Var = k6.l;
                        i0.r(f3Var);
                        i0.g3(f3Var);
                    }
                    k6.g[b11][s11] = false;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ab A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:9:0x002e, B:24:0x0127, B:36:0x01ab, B:38:0x01af, B:42:0x01bc, B:44:0x01c2, B:46:0x021f, B:63:0x01f1, B:65:0x01f5, B:76:0x020a, B:78:0x020e, B:91:0x022a, B:93:0x0232, B:95:0x0236, B:97:0x0241, B:101:0x024f, B:104:0x025f, B:106:0x0269, B:108:0x026c, B:109:0x0283, B:115:0x014d, B:117:0x0154, B:119:0x0160, B:123:0x0170, B:125:0x0176, B:126:0x0182, B:128:0x018a, B:129:0x0191, B:131:0x019b, B:157:0x007d, B:203:0x00e0), top: B:8:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232 A[Catch: Exception -> 0x017e, TryCatch #0 {Exception -> 0x017e, blocks: (B:9:0x002e, B:24:0x0127, B:36:0x01ab, B:38:0x01af, B:42:0x01bc, B:44:0x01c2, B:46:0x021f, B:63:0x01f1, B:65:0x01f5, B:76:0x020a, B:78:0x020e, B:91:0x022a, B:93:0x0232, B:95:0x0236, B:97:0x0241, B:101:0x024f, B:104:0x025f, B:106:0x0269, B:108:0x026c, B:109:0x0283, B:115:0x014d, B:117:0x0154, B:119:0x0160, B:123:0x0170, B:125:0x0176, B:126:0x0182, B:128:0x018a, B:129:0x0191, B:131:0x019b, B:157:0x007d, B:203:0x00e0), top: B:8:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(CharSequence charSequence, int[] iArr) {
        boolean z10;
        boolean z11;
        char charAt;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char charAt2;
        int i16;
        int i17;
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb2 = new StringBuilder(16);
            int length = charSequence.length();
            int i18 = -1;
            int[] iArr2 = iArr;
            int i19 = -1;
            int i20 = 0;
            int i21 = 0;
            long j10 = 0;
            int i22 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i21 < length) {
                try {
                    char charAt3 = charSequence.charAt(i21);
                    if ((charAt3 >= 55356 && charAt3 <= 55358) || (j10 != 0 && (j10 & (-4294967296L)) == 0 && (j10 & 65535) == 55356 && charAt3 >= 56806 && charAt3 <= 56831)) {
                        if (i19 == i18) {
                            i19 = i21;
                        } else if (z13) {
                            i19 = i21;
                            i22 = 0;
                            z13 = false;
                        }
                        try {
                            sb2.append(charAt3);
                            i22++;
                            j10 = (j10 << 16) | charAt3;
                        } catch (Exception e7) {
                            e = e7;
                            z10 = true;
                            f8.g(e, z10);
                            if (iArr2 != null) {
                                iArr2[0] = 0;
                            }
                            return arrayList;
                        }
                    } else if ((sb2.length() > 0 && (charAt3 == 9792 || charAt3 == 9794 || charAt3 == 9877)) || (j10 > 0 && (61440 & charAt3) == 53248)) {
                        sb2.append(charAt3);
                        i22++;
                        z14 = true;
                        j10 = 0;
                    } else if (charAt3 == 8419) {
                        if (i21 > 0 && (((charAt = charSequence.charAt(i20)) >= '0' && charAt <= '9') || charAt == '#' || charAt == '*')) {
                            i22 = (i21 - i20) + 1;
                            sb2.append(charAt);
                            sb2.append(charAt3);
                            z14 = true;
                            i19 = i20;
                            z13 = false;
                        }
                    } else if ((charAt3 == 169 || charAt3 == 174 || (charAt3 >= 8252 && charAt3 <= 12953)) && l6.k.containsKey(Character.valueOf(charAt3))) {
                        if (i19 == -1) {
                            i19 = i21;
                        } else if (z13) {
                            i19 = i21;
                            i22 = 0;
                            z13 = false;
                        }
                        i22++;
                        sb2.append(charAt3);
                        z14 = true;
                    } else {
                        if (i19 != -1) {
                            sb2.setLength(0);
                            z11 = false;
                            i19 = -1;
                            i22 = 0;
                            z13 = false;
                            z14 = false;
                        } else if (charAt3 != 65039 && charAt3 != '\n' && charAt3 != ' ' && charAt3 != '\t') {
                            z11 = true;
                        }
                        if (z14 || (i17 = i21 + 2) >= length) {
                            z12 = z11;
                        } else {
                            int i23 = i21 + 1;
                            char charAt4 = charSequence.charAt(i23);
                            z12 = z11;
                            if (charAt4 == 55356) {
                                char charAt5 = charSequence.charAt(i17);
                                if (charAt5 >= 57339 && charAt5 <= 57343) {
                                    sb2.append(charSequence.subSequence(i23, i21 + 3));
                                    i22 += 2;
                                    i10 = i17;
                                    i11 = i10;
                                    i12 = 0;
                                    while (i12 < 3) {
                                        int i24 = i11 + 1;
                                        if (i24 < length) {
                                            char charAt6 = charSequence.charAt(i24);
                                            i16 = i10;
                                            if (i12 == 1) {
                                                if (charAt6 == 8205 && sb2.length() > 0) {
                                                    sb2.append(charAt6);
                                                    i22++;
                                                    i11 = i24;
                                                    z14 = false;
                                                    z12 = false;
                                                }
                                            } else if (charAt3 == '*' || charAt3 == '#' || (charAt3 >= '0' && charAt3 <= '9')) {
                                                if (charAt6 >= 65024) {
                                                    if (charAt6 <= 65039) {
                                                        i22++;
                                                        if (!z14) {
                                                            z14 = i11 + 2 >= length;
                                                        }
                                                        i11 = i24;
                                                        i19 = i16;
                                                        z13 = true;
                                                    }
                                                }
                                            } else if (i19 != -1 && charAt6 >= 65024) {
                                                if (charAt6 <= 65039) {
                                                    i22++;
                                                    if (!z14) {
                                                        z14 = i11 + 2 >= length;
                                                    }
                                                    i11 = i24;
                                                }
                                            }
                                            i12++;
                                            i10 = i16;
                                        } else {
                                            i16 = i10;
                                        }
                                        i12++;
                                        i10 = i16;
                                    }
                                    int i25 = i10;
                                    if (z12 && iArr2 != null) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z14 && (i14 = i11 + 2) < length) {
                                        i15 = i11 + 1;
                                        if (charSequence.charAt(i15) == 55356 && (charAt2 = charSequence.charAt(i14)) >= 57339 && charAt2 <= 57343) {
                                            sb2.append(charSequence.subSequence(i15, i11 + 3));
                                            i22 += 2;
                                            i11 = i14;
                                        }
                                    }
                                    if (z14) {
                                        if (iArr2 != null) {
                                            iArr2[0] = iArr2[0] + 1;
                                        }
                                        if (i19 >= 0 && (i13 = i22 + i19) <= length) {
                                            CharSequence subSequence = sb2.subSequence(0, sb2.length());
                                            i6 i6Var = new i6();
                                            i6Var.a = i19;
                                            i6Var.b = i13;
                                            i6Var.c = subSequence;
                                            arrayList.add(i6Var);
                                        }
                                        sb2.setLength(0);
                                        i19 = -1;
                                        i22 = 0;
                                        z13 = false;
                                        z14 = false;
                                    }
                                    i21 = i11 + 1;
                                    i20 = i25;
                                    i18 = -1;
                                }
                            } else if (sb2.length() >= 2 && sb2.charAt(0) == 55356 && sb2.charAt(1) == 57332 && charAt4 == 56128) {
                                do {
                                    if (i23 < charSequence.length()) {
                                        sb2.append(charSequence.charAt(i23));
                                    }
                                    i21 = i23 + 1;
                                    if (i21 < charSequence.length()) {
                                        sb2.append(charSequence.charAt(i21));
                                    }
                                    i22 += 2;
                                    i23 += 2;
                                    if (i23 >= charSequence.length()) {
                                        break;
                                    }
                                } while (charSequence.charAt(i23) == 56128);
                            }
                        }
                        i10 = i21;
                        i11 = i10;
                        i12 = 0;
                        while (i12 < 3) {
                        }
                        int i252 = i10;
                        if (z12) {
                            iArr2[0] = 0;
                            iArr2 = null;
                        }
                        if (z14) {
                            i15 = i11 + 1;
                            if (charSequence.charAt(i15) == 55356) {
                                sb2.append(charSequence.subSequence(i15, i11 + 3));
                                i22 += 2;
                                i11 = i14;
                            }
                        }
                        if (z14) {
                        }
                        i21 = i11 + 1;
                        i20 = i252;
                        i18 = -1;
                    }
                    z11 = false;
                    if (z14) {
                    }
                    z12 = z11;
                    i10 = i21;
                    i11 = i10;
                    i12 = 0;
                    while (i12 < 3) {
                    }
                    int i2522 = i10;
                    if (z12) {
                    }
                    if (z14) {
                    }
                    if (z14) {
                    }
                    i21 = i11 + 1;
                    i20 = i2522;
                    i18 = -1;
                } catch (Exception e10) {
                    e = e10;
                    z10 = true;
                }
            }
            if (iArr2 != null && sb2.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static void k(CharSequence charSequence) {
        f6 e7 = e(charSequence);
        if (e7 != null) {
            i(e7.a, e7.b);
        }
    }

    public static CharSequence l(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return m(charSequence, fontMetricsInt, z10, null, 0);
    }

    public static CharSequence m(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10) {
        return n(charSequence, fontMetricsInt, z10, iArr, i10, 1.0f, 0);
    }

    public static CharSequence n(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10, float f7, int i11) {
        int i12;
        int i13;
        if (tz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        Spannable newSpannable = (z10 || !(charSequence instanceof Spannable)) ? Spannable.Factory.getInstance().newSpannable(charSequence) : (Spannable) charSequence;
        ArrayList j10 = j(newSpannable, iArr);
        if (j10.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.o5.class);
        org.telegram.ui.Components.dq[] dqVarArr = (org.telegram.ui.Components.dq[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.dq.class);
        int i14 = (tz.o() >= 2 ? 100 : 50) - i11;
        for (int i15 = 0; i15 < j10.size(); i15++) {
            try {
                i6 i6Var = (i6) j10.get(i15);
                if (o5VarArr != null && o5VarArr.length > 0) {
                    for (org.telegram.ui.Components.o5 o5Var : o5VarArr) {
                        i13 = (o5Var != null && newSpannable.getSpanStart(o5Var) == i6Var.a && newSpannable.getSpanEnd(o5Var) == i6Var.b) ? 0 : i13 + 1;
                    }
                }
                if (dqVarArr != null && dqVarArr.length > 0) {
                    for (org.telegram.ui.Components.dq dqVar : dqVarArr) {
                        i12 = (dqVar != null && newSpannable.getSpanStart(dqVar) == i6Var.a && newSpannable.getSpanEnd(dqVar) == i6Var.b) ? 0 : i12 + 1;
                    }
                }
                g6 g10 = g(i6Var.c);
                if (g10 != null) {
                    h6 h6Var = new h6(g10, i10);
                    h6Var.b = 1.0f;
                    h6Var.c = i0.L(20.0f);
                    h6Var.a = fontMetricsInt;
                    if (fontMetricsInt != null) {
                        int abs = Math.abs(h6Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                        h6Var.c = abs;
                        if (abs == 0) {
                            h6Var.c = i0.L(20.0f);
                        }
                    }
                    CharSequence charSequence2 = i6Var.c;
                    h6Var.d = charSequence2 == null ? null : charSequence2.toString();
                    h6Var.b = f7;
                    newSpannable.setSpan(h6Var, i6Var.a, i6Var.b, 33);
                }
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            if (Build.VERSION.SDK_INT >= 29 && i15 + 1 >= i14) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence o(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i10, Runnable runnable) {
        i6 i6Var;
        TLRPC.Document document;
        org.telegram.ui.Components.o5 o5Var;
        int i11;
        if (tz.U0 || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i12 = d20.s0;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet l02 = ui.b0(i12).l0(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new x3(runnable, 1));
        Spannable newSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        ArrayList j10 = j(newSpannable, null);
        if (j10.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.o5.class);
        int i13 = tz.o() >= 2 ? 100 : 50;
        for (int i14 = 0; i14 < j10.size(); i14++) {
            try {
                i6Var = (i6) j10.get(i14);
                if (o5VarArr != null) {
                    for (org.telegram.ui.Components.o5 o5Var2 : o5VarArr) {
                        i11 = (o5Var2 != null && newSpannable.getSpanStart(o5Var2) == i6Var.a && newSpannable.getSpanEnd(o5Var2) == i6Var.b) ? 0 : i11 + 1;
                    }
                }
                if (l02 != null) {
                    ArrayList<TLRPC.Document> arrayList = l02.documents;
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        TLRPC.Document document2 = arrayList.get(i15);
                        i15++;
                        document = document2;
                        if (jj.V(document, null, null).contains(i6Var.c)) {
                            break;
                        }
                    }
                }
                document = null;
                o5Var = document != null ? new org.telegram.ui.Components.o5(document, fontMetricsInt) : new org.telegram.ui.Components.o5(0L, fontMetricsInt);
                o5Var.emoji = i6Var.c.toString();
            } catch (Exception e7) {
                e = e7;
            }
            try {
                o5Var.cacheType = i10;
                newSpannable.setSpan(o5Var, i6Var.a, i6Var.b, 33);
            } catch (Exception e10) {
                e = e10;
                f8.g(e, true);
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                    return newSpannable;
                }
                continue;
            }
            if (Build.VERSION.SDK_INT >= 29 && i14 + 1 >= i13) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence p(CharSequence charSequence, TextView textView, Runnable runnable) {
        return o(charSequence, textView.getPaint().getFontMetricsInt(), 20, runnable);
    }

    public static void q() {
        SharedPreferences c12 = vp.c1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : j.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append((String) entry.getValue());
        }
        c12.edit().putString("color", sb2.toString()).commit();
    }

    public static void r() {
        SharedPreferences c12 = vp.c1();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : h.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        c12.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void s() {
        ArrayList arrayList = i;
        arrayList.clear();
        Iterator it = h.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        Collections.sort(arrayList, new a4.d(17));
        while (arrayList.size() > 48) {
            a1.g.x(1, arrayList);
        }
    }
}
