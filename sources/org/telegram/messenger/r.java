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
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements m10 {
    public final /* synthetic */ SpannableStringBuilder a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r(SpannableStringBuilder spannableStringBuilder, int i3, boolean z10, boolean z11) {
        this.a = spannableStringBuilder;
        this.b = i3;
        this.c = z10;
        this.d = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.m10
    public final Object run() {
        boolean z10;
        int i3;
        boolean z11;
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
                boolean z12 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z10 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof x31) || z10) {
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z13 = this.c;
                int i16 = 4;
                if (!z13 && (this.b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder, 4);
                }
                Pattern pattern = kc.a;
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
                            str = a1.g.s(new StringBuilder(), strArr[i13], str);
                        }
                        if (z13) {
                            z12 = true;
                            if (!sf.c.g(Uri.parse(str), true, null)) {
                            }
                        } else {
                            z12 = true;
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
                i3 = i15;
                Collections.sort(arrayList, new o0.a(1));
                int size = arrayList.size();
                int i17 = i3;
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
                    for (int i23 = i3; i23 < size2; i23++) {
                        d0 d0Var4 = (d0) arrayList.get(i23);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(d0Var4.b, d0Var4.c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i24 = i3; i24 < uRLSpanArr2.length; i24++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i24];
                                spannableStringBuilder.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof x31) || z10) {
                                    spannableStringBuilder.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str4 = d0Var4.a;
                        if (str4 != null) {
                            str4 = str4.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!sf.c.k(str4)) {
                            spannableStringBuilder.setSpan(new URLSpan(str4), d0Var4.b, d0Var4.c, 33);
                        }
                    }
                    z11 = z12;
                    return Boolean.valueOf(z11);
                }
                z11 = i3;
                return Boolean.valueOf(z11);
            }
        }
        i3 = 0;
        z11 = i3;
        return Boolean.valueOf(z11);
    }
}
