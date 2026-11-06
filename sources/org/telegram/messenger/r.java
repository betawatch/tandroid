package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.d41;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements u10 {
    public final /* synthetic */ SpannableStringBuilder a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r(SpannableStringBuilder spannableStringBuilder, int i7, boolean z9, boolean z10) {
        this.a = spannableStringBuilder;
        this.b = i7;
        this.c = z9;
        this.d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.u10
    public final Object run() {
        boolean z9;
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        SpannableStringBuilder spannableStringBuilder = this.a;
        String obj = spannableStringBuilder.toString();
        int i15 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!g0.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                boolean z11 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z9 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof d41) || z9) {
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z12 = this.c;
                int i16 = 4;
                if (!z12 && (this.b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder, 4);
                }
                Pattern pattern = qc.a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                f fVar = g0.c0;
                SpannableStringBuilder spannableStringBuilder2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, (char) 9472) >= 0 ? new SpannableStringBuilder(spannableStringBuilder.toString().replace((char) 9472, ' ')) : spannableStringBuilder;
                if (!TextUtils.isEmpty(spannableStringBuilder2) && TextUtils.lastIndexOf(spannableStringBuilder2, '_') == spannableStringBuilder2.length() - 1) {
                    spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder2.toString()).replace(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), (CharSequence) "a");
                }
                Matcher matcher = pattern.matcher(spannableStringBuilder2);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (fVar == null || fVar.acceptMatch(spannableStringBuilder2, start, end)) {
                        d0 d0Var = new d0();
                        String group = matcher.group(i15);
                        i13 = i15;
                        while (true) {
                            if (i15 >= i16) {
                                str = group;
                                i14 = i13;
                                break;
                            }
                            String str2 = strArr[i15];
                            if (group.regionMatches(true, 0, str2, 0, str2.length())) {
                                String str3 = strArr[i15];
                                str = group;
                                if (!group.regionMatches(false, 0, str3, 0, str3.length())) {
                                    str = strArr[i15] + str.substring(strArr[i15].length());
                                }
                                i14 = 1;
                            } else {
                                i15++;
                                i16 = 4;
                            }
                        }
                        if (i14 == 0) {
                            str = a8.p0.s(new StringBuilder(), strArr[i13], str);
                        }
                        if (z12) {
                            z11 = true;
                            if (!vf.c.g(Uri.parse(str), true, null)) {
                            }
                        } else {
                            z11 = true;
                        }
                        d0Var.a = str;
                        d0Var.b = start;
                        d0Var.c = end;
                        arrayList.add(d0Var);
                    } else {
                        i13 = i15;
                    }
                    i15 = i13;
                    i16 = 4;
                }
                i7 = i15;
                Collections.sort(arrayList, new jg.x(11));
                int size = arrayList.size();
                int i17 = i7;
                while (i17 < size - 1) {
                    d0 d0Var2 = (d0) arrayList.get(i17);
                    int i18 = i17 + 1;
                    d0 d0Var3 = (d0) arrayList.get(i18);
                    int i19 = d0Var2.b;
                    int i20 = d0Var3.b;
                    if (i19 <= i20 && (i10 = d0Var2.c) > i20) {
                        int i21 = d0Var3.c;
                        int i22 = (i21 > i10 && (i11 = i10 - i19) <= (i12 = i21 - i20)) ? i11 < i12 ? i17 : -1 : i18;
                        if (i22 != -1) {
                            arrayList.remove(i22);
                            size--;
                        }
                    }
                    i17 = i18;
                }
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i23 = i7; i23 < size2; i23++) {
                        d0 d0Var4 = (d0) arrayList.get(i23);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(d0Var4.b, d0Var4.c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i24 = i7; i24 < uRLSpanArr2.length; i24++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i24];
                                spannableStringBuilder.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof d41) || z9) {
                                    spannableStringBuilder.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str4 = d0Var4.a;
                        if (str4 != null) {
                            str4 = str4.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!vf.c.k(str4)) {
                            spannableStringBuilder.setSpan(new URLSpan(str4), d0Var4.b, d0Var4.c, 33);
                        }
                    }
                    z10 = z11;
                    return Boolean.valueOf(z10);
                }
                z10 = i7;
                return Boolean.valueOf(z10);
            }
        }
        i7 = 0;
        z10 = i7;
        return Boolean.valueOf(z10);
    }
}
