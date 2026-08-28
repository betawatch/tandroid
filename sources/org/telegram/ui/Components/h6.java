package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h6 implements CharSequence {
    public final CharSequence[] a;
    public final int b;

    public h6(CharSequence charSequence) {
        if (charSequence == null) {
            this.a = new CharSequence[0];
            this.b = 0;
            return;
        }
        this.b = charSequence.length();
        int i9 = 0;
        for (int i10 = 0; i10 < this.b; i10++) {
            if (charSequence.charAt(i10) == ' ') {
                i9++;
            }
        }
        this.a = new CharSequence[i9 + 1];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.b;
            if (i11 > i14) {
                return;
            }
            if (i11 == i14 || charSequence.charAt(i11) == ' ') {
                int i15 = i12 + 1;
                this.a[i12] = charSequence.subSequence(i13, (i11 < this.b ? 1 : 0) + i11);
                i13 = i11 + 1;
                i12 = i15;
            }
            i11++;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i10 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i9 < charSequenceArr[i10].length()) {
                return charSequenceArr[i10].charAt(i9);
            }
            i9 -= charSequenceArr[i10].length();
            i10++;
        }
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.a, i9, i10));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i9 >= charSequenceArr.length) {
                return sb2.toString();
            }
            sb2.append(charSequenceArr[i9]);
            i9++;
        }
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).chars());
        return convert;
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        j$.util.stream.IntStream convert;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).codePoints());
        return convert;
    }
}
