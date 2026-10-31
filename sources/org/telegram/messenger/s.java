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
import org.telegram.ui.Components.g51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements i20 {
    public final /* synthetic */ SpannableStringBuilder a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ s(SpannableStringBuilder spannableStringBuilder, int i10, boolean z10, boolean z11) {
        this.a = spannableStringBuilder;
        this.b = i10;
        this.c = z10;
        this.d = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.i20
    public final Object run() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        SpannableStringBuilder spannableStringBuilder = this.a;
        String obj = spannableStringBuilder.toString();
        int i16 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!i0.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                boolean z12 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z10 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof g51) || z10) {
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z13 = this.c;
                int i17 = 4;
                if (!z13 && (this.b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder, 4);
                }
                Pattern pattern = rc.a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                f fVar = i0.c0;
                SpannableStringBuilder spannableStringBuilder2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, (char) 9472) >= 0 ? new SpannableStringBuilder(spannableStringBuilder.toString().replace((char) 9472, ' ')) : spannableStringBuilder;
                if (!TextUtils.isEmpty(spannableStringBuilder2) && TextUtils.lastIndexOf(spannableStringBuilder2, '_') == spannableStringBuilder2.length() - 1) {
                    spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder2.toString()).replace(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), (CharSequence) "a");
                }
                Matcher matcher = pattern.matcher(spannableStringBuilder2);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (fVar == null || fVar.acceptMatch(spannableStringBuilder2, start, end)) {
                        f0 f0Var = new f0();
                        String group = matcher.group(i16);
                        i14 = i16;
                        while (true) {
                            if (i16 >= i17) {
                                str = group;
                                i15 = i14;
                                break;
                            }
                            String str2 = strArr[i16];
                            if (group.regionMatches(true, 0, str2, 0, str2.length())) {
                                String str3 = strArr[i16];
                                str = group;
                                if (!group.regionMatches(false, 0, str3, 0, str3.length())) {
                                    str = strArr[i16] + str.substring(strArr[i16].length());
                                }
                                i15 = 1;
                            } else {
                                i16++;
                                i17 = 4;
                            }
                        }
                        if (i15 == 0) {
                            str = a1.g.r(new StringBuilder(), strArr[i14], str);
                        }
                        if (z13) {
                            z12 = true;
                            if (!gf.f.e(Uri.parse(str), true, null)) {
                            }
                        } else {
                            z12 = true;
                        }
                        f0Var.a = str;
                        f0Var.b = start;
                        f0Var.c = end;
                        arrayList.add(f0Var);
                    } else {
                        i14 = i16;
                    }
                    i16 = i14;
                    i17 = 4;
                }
                i10 = i16;
                Collections.sort(arrayList, new a4.d(13));
                int size = arrayList.size();
                int i18 = i10;
                while (i18 < size - 1) {
                    f0 f0Var2 = (f0) arrayList.get(i18);
                    int i19 = i18 + 1;
                    f0 f0Var3 = (f0) arrayList.get(i19);
                    int i20 = f0Var2.b;
                    int i21 = f0Var3.b;
                    if (i20 <= i21 && (i11 = f0Var2.c) > i21) {
                        int i22 = f0Var3.c;
                        int i23 = (i22 > i11 && (i12 = i11 - i20) <= (i13 = i22 - i21)) ? i12 < i13 ? i18 : -1 : i19;
                        if (i23 != -1) {
                            arrayList.remove(i23);
                            size--;
                        }
                    }
                    i18 = i19;
                }
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i24 = i10; i24 < size2; i24++) {
                        f0 f0Var4 = (f0) arrayList.get(i24);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(f0Var4.b, f0Var4.c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i25 = i10; i25 < uRLSpanArr2.length; i25++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i25];
                                spannableStringBuilder.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof g51) || z10) {
                                    spannableStringBuilder.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str4 = f0Var4.a;
                        if (str4 != null) {
                            str4 = str4.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!gf.f.i(str4)) {
                            spannableStringBuilder.setSpan(new URLSpan(str4), f0Var4.b, f0Var4.c, 33);
                        }
                    }
                    z11 = z12;
                    return Boolean.valueOf(z11);
                }
                z11 = i10;
                return Boolean.valueOf(z11);
            }
        }
        i10 = 0;
        z11 = i10;
        return Boolean.valueOf(z11);
    }
}
