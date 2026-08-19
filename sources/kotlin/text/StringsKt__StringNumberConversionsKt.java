package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    public static Long toLongOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toLongOrNull(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long toLongOrNull(String str, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        Long l = null;
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
                long j2 = 0;
                long j3 = -256204778801521550L;
                while (i2 < length) {
                    int digitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i2), i);
                    if (digitOf < 0) {
                        return l;
                    }
                    if (j2 < j3) {
                        if (j3 != -256204778801521550L) {
                            return l;
                        }
                        j3 = j / i;
                        if (j2 < j3) {
                            return l;
                        }
                    }
                    Long l2 = l;
                    int i3 = i2;
                    long j4 = j2 * i;
                    long j5 = digitOf;
                    if (j4 < j + j5) {
                        return l2;
                    }
                    j2 = j4 - j5;
                    i2 = i3 + 1;
                    l = l2;
                }
                return !z ? Long.valueOf(j2) : Long.valueOf(-j2);
            }
            i2 = 1;
        }
        z = false;
        long j22 = 0;
        long j32 = -256204778801521550L;
        while (i2 < length) {
        }
        if (!z) {
        }
    }
}
