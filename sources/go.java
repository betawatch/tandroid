// default package

import android.os.Build;
import android.text.TextUtils;
import j$.util.stream.IntStream;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class go implements CharSequence {
    public final CharSequence[] a;
    public final int b;

    public go(CharSequence charSequence) {
        if (charSequence == null) {
            this.a = new CharSequence[0];
            this.b = 0;
            return;
        }
        this.b = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (charSequence.charAt(i2) == ' ') {
                i++;
            }
        }
        this.a = new CharSequence[i + 1];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.b;
            if (i3 > i6) {
                return;
            }
            if (i3 == i6 || charSequence.charAt(i3) == ' ') {
                int i7 = i4 + 1;
                this.a[i4] = charSequence.subSequence(i5, (i3 < this.b ? 1 : 0) + i3);
                i5 = i3 + 1;
                i4 = i7;
            }
            i3++;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i2 >= charSequenceArr.length) {
                return (char) 0;
            }
            if (i < charSequenceArr[i2].length()) {
                return charSequenceArr[i2].charAt(i);
            }
            i -= charSequenceArr[i2].length();
            i2++;
        }
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream convert;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).chars());
        return convert;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream convert;
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        convert = IntStream.VivifiedWrapper.convert(TextUtils.concat(this.a).codePoints());
        return convert;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.a, i, i2));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            CharSequence[] charSequenceArr = this.a;
            if (i >= charSequenceArr.length) {
                return sb.toString();
            }
            sb.append(charSequenceArr[i]);
            i++;
        }
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }
}
