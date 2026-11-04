package org.telegram.ui.Components;

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f6 implements CharSequence {
    public final CharSequence[] a;
    public final int b;

    public f6(CharSequence charSequence) {
        if (charSequence == null) {
            this.a = new CharSequence[0];
            this.b = 0;
            return;
        }
        this.b = charSequence.length();
        int i3 = 0;
        for (int i10 = 0; i10 < this.b; i10++) {
            if (charSequence.charAt(i10) == ' ') {
                i3++;
            }
        }
        this.a = new CharSequence[i3 + 1];
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
    public final char charAt(int i3) {
        int i10 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i10 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i3 < charSequenceArr[i10].length()) {
                return charSequenceArr[i10].charAt(i3);
            }
            i3 -= charSequenceArr[i10].length();
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
    public final CharSequence subSequence(int i3, int i10) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.a, i3, i10));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i3 >= charSequenceArr.length) {
                return sb2.toString();
            }
            sb2.append(charSequenceArr[i3]);
            i3++;
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
