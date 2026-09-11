package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o6 implements CharSequence {
    public final CharSequence[] a;
    public final int b;

    public o6(CharSequence charSequence) {
        if (charSequence == null) {
            this.a = new CharSequence[0];
            this.b = 0;
            return;
        }
        this.b = charSequence.length();
        int i10 = 0;
        for (int i11 = 0; i11 < this.b; i11++) {
            if (charSequence.charAt(i11) == ' ') {
                i10++;
            }
        }
        this.a = new CharSequence[i10 + 1];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.b;
            if (i12 > i15) {
                return;
            }
            if (i12 == i15 || charSequence.charAt(i12) == ' ') {
                int i16 = i13 + 1;
                this.a[i13] = charSequence.subSequence(i14, (i12 < this.b ? 1 : 0) + i12);
                i14 = i12 + 1;
                i13 = i16;
            }
            i12++;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        int i11 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i11 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i10 < charSequenceArr[i11].length()) {
                return charSequenceArr[i11].charAt(i10);
            }
            i10 -= charSequenceArr[i11].length();
            i11++;
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
    public final CharSequence subSequence(int i10, int i11) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.a, i10, i11));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i10 >= charSequenceArr.length) {
                return sb2.toString();
            }
            sb2.append(charSequenceArr[i10]);
            i10++;
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
