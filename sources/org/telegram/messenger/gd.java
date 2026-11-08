package org.telegram.messenger;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class gd {
    public final /* synthetic */ int a;

    public final int a(int i7) {
        switch (this.a) {
            case 0:
                int i10 = i7 % 100;
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i10 < 3 || i10 > 10) {
                    return (i10 < 11 || i10 > 99) ? 0 : 16;
                }
                return 8;
            case 1:
                int i11 = i7 % 100;
                int i12 = i7 % 10;
                if (i12 == 1 && i11 != 11) {
                    return 2;
                }
                if (i12 < 2 || i12 > 4 || (i11 >= 12 && i11 <= 14)) {
                    return (i12 == 0 || (i12 >= 5 && i12 <= 9) || (i11 >= 11 && i11 <= 14)) ? 16 : 0;
                }
                return 8;
            case 2:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i7 == 3) {
                    return 8;
                }
                return i7 == 6 ? 16 : 0;
            case 3:
                if (i7 == 1) {
                    return 2;
                }
                return (i7 < 2 || i7 > 4) ? 0 : 8;
            case 4:
                return (i7 < 0 || i7 >= 2) ? 0 : 2;
            case 5:
                if (i7 == 0) {
                    return 1;
                }
                return i7 == 1 ? 2 : 0;
            case 6:
                if (i7 == 0) {
                    return 1;
                }
                return (i7 % 10 != 1 || i7 % 100 == 11) ? 0 : 2;
            case 7:
                int i13 = i7 % 100;
                int i14 = i7 % 10;
                if (i14 != 1 || (i13 >= 11 && i13 <= 19)) {
                    return (i14 < 2 || i14 > 9 || (i13 >= 11 && i13 <= 19)) ? 0 : 8;
                }
                return 2;
            case 8:
                return (i7 % 10 != 1 || i7 == 11) ? 0 : 2;
            case 9:
                int i15 = i7 % 100;
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 0 || (i15 >= 2 && i15 <= 10)) {
                    return 8;
                }
                return (i15 < 11 || i15 > 19) ? 0 : 16;
            case 10:
                return 0;
            case 11:
                return i7 == 1 ? 2 : 0;
            case 12:
                int i16 = i7 % 100;
                int i17 = i7 % 10;
                if (i7 == 1) {
                    return 2;
                }
                if (i17 < 2 || i17 > 4 || (i16 >= 12 && i16 <= 14)) {
                    return ((i17 < 0 || i17 > 1) && (i17 < 5 || i17 > 9) && (i16 < 12 || i16 > 14)) ? 0 : 16;
                }
                return 8;
            case 13:
                int i18 = i7 % 100;
                if (i7 == 1) {
                    return 2;
                }
                return (i7 == 0 || (i18 >= 1 && i18 <= 19)) ? 8 : 0;
            case 14:
                int i19 = i7 % 100;
                int i20 = i7 % 10;
                if (i20 != 1 || i19 == 11) {
                    return (i20 < 2 || i20 > 4 || (i19 >= 12 && i19 <= 14)) ? 0 : 8;
                }
                return 2;
            case 15:
                int i21 = i7 % 100;
                if (i21 == 1) {
                    return 2;
                }
                if (i21 == 2) {
                    return 4;
                }
                return (i21 < 3 || i21 > 4) ? 0 : 8;
            case 16:
                if (i7 < 0 || i7 > 1) {
                    return (i7 < 2 || i7 > 10) ? 0 : 8;
                }
                return 2;
            case 17:
                if (i7 == 1) {
                    return 2;
                }
                return i7 == 2 ? 4 : 0;
            case 18:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i7 == 3) {
                    return 8;
                }
                return i7 == 6 ? 16 : 0;
            default:
                return (i7 == 0 || i7 == 1) ? 2 : 0;
        }
    }
}
