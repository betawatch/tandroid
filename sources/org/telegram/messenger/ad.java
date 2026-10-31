package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ad {
    public final /* synthetic */ int a;

    public final int a(int i10) {
        switch (this.a) {
            case 0:
                int i11 = i10 % 100;
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i11 < 3 || i11 > 10) {
                    return (i11 < 11 || i11 > 99) ? 0 : 16;
                }
                return 8;
            case 1:
                int i12 = i10 % 100;
                int i13 = i10 % 10;
                if (i13 == 1 && i12 != 11) {
                    return 2;
                }
                if (i13 < 2 || i13 > 4 || (i12 >= 12 && i12 <= 14)) {
                    return (i13 == 0 || (i13 >= 5 && i13 <= 9) || (i12 >= 11 && i12 <= 14)) ? 16 : 0;
                }
                return 8;
            case 2:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i10 == 3) {
                    return 8;
                }
                return i10 == 6 ? 16 : 0;
            case 3:
                if (i10 == 1) {
                    return 2;
                }
                return (i10 < 2 || i10 > 4) ? 0 : 8;
            case 4:
                return (i10 < 0 || i10 >= 2) ? 0 : 2;
            case 5:
                if (i10 == 0) {
                    return 1;
                }
                return i10 == 1 ? 2 : 0;
            case 6:
                if (i10 == 0) {
                    return 1;
                }
                return (i10 % 10 != 1 || i10 % 100 == 11) ? 0 : 2;
            case 7:
                int i14 = i10 % 100;
                int i15 = i10 % 10;
                if (i15 != 1 || (i14 >= 11 && i14 <= 19)) {
                    return (i15 < 2 || i15 > 9 || (i14 >= 11 && i14 <= 19)) ? 0 : 8;
                }
                return 2;
            case 8:
                return (i10 % 10 != 1 || i10 == 11) ? 0 : 2;
            case 9:
                int i16 = i10 % 100;
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 0 || (i16 >= 2 && i16 <= 10)) {
                    return 8;
                }
                return (i16 < 11 || i16 > 19) ? 0 : 16;
            case 10:
                return 0;
            case 11:
                return i10 == 1 ? 2 : 0;
            case 12:
                int i17 = i10 % 100;
                int i18 = i10 % 10;
                if (i10 == 1) {
                    return 2;
                }
                if (i18 < 2 || i18 > 4 || (i17 >= 12 && i17 <= 14)) {
                    return ((i18 < 0 || i18 > 1) && (i18 < 5 || i18 > 9) && (i17 < 12 || i17 > 14)) ? 0 : 16;
                }
                return 8;
            case 13:
                int i19 = i10 % 100;
                if (i10 == 1) {
                    return 2;
                }
                return (i10 == 0 || (i19 >= 1 && i19 <= 19)) ? 8 : 0;
            case 14:
                int i20 = i10 % 100;
                int i21 = i10 % 10;
                if (i21 != 1 || i20 == 11) {
                    return (i21 < 2 || i21 > 4 || (i20 >= 12 && i20 <= 14)) ? 0 : 8;
                }
                return 2;
            case 15:
                int i22 = i10 % 100;
                if (i22 == 1) {
                    return 2;
                }
                if (i22 == 2) {
                    return 4;
                }
                return (i22 < 3 || i22 > 4) ? 0 : 8;
            case 16:
                if (i10 < 0 || i10 > 1) {
                    return (i10 < 2 || i10 > 10) ? 0 : 8;
                }
                return 2;
            case 17:
                if (i10 == 1) {
                    return 2;
                }
                return i10 == 2 ? 4 : 0;
            case 18:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i10 == 3) {
                    return 8;
                }
                return i10 == 6 ? 16 : 0;
            default:
                return (i10 == 0 || i10 == 1) ? 2 : 0;
        }
    }
}
