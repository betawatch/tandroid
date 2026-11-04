package ei;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qk;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, hs.D4, 10, -2013375, -1482439, -7666429, 500, 900, hs.e3, 7, -1214690, -1214690, -6606592, hs.Z3, 600, hs.g2, 4, -1926647, -1926647, -6668800, 100, hs.X4, hs.v1, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i3, int i10, int i11) {
        int[] iArr = hp.s1(i3).X6;
        for (int i12 = 0; i12 < iArr.length / 7; i12++) {
            int i13 = i12 * 7;
            if (i10 >= iArr[i13]) {
                return iArr[i13 + 1 + i11];
            }
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r6.equals("color_bg") == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] c(TLRPC.TL_jsonArray tL_jsonArray) {
        boolean z10;
        int[] iArr = new int[tL_jsonArray.value.size() * 7];
        for (int i3 = 0; i3 < tL_jsonArray.value.size(); i3++) {
            TLRPC.JSONValue jSONValue = tL_jsonArray.value.get(i3);
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                ArrayList<TLRPC.TL_jsonObjectValue> arrayList = ((TLRPC.TL_jsonObject) jSONValue).value;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = arrayList.get(i10);
                    i10++;
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObjectValue;
                    TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                    int i11 = 2;
                    int i12 = -1;
                    if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                        int i13 = (int) ((TLRPC.TL_jsonNumber) jSONValue2).value;
                        String str = tL_jsonObjectValue2.key;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1544802595:
                                if (str.equals("text_length_max")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case -1186480213:
                                if (str.equals("pin_period")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 109757537:
                                if (str.equals("stars")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 1686749675:
                                if (str.equals("emoji_max")) {
                                    z10 = 3;
                                    break;
                                }
                                z10 = -1;
                                break;
                            default:
                                z10 = -1;
                                break;
                        }
                        switch (z10) {
                            case false:
                                break;
                            case true:
                                i11 = 1;
                                break;
                            case true:
                                i11 = 0;
                                break;
                            case true:
                                i11 = 3;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                        if (i11 >= 0) {
                            iArr[(i3 * 7) + i11] = i13;
                        }
                    } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                        String str2 = ((TLRPC.TL_jsonString) jSONValue2).value;
                        String str3 = tL_jsonObjectValue2.key;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1354842834:
                                if (str3.equals("color1")) {
                                    i11 = 0;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1354842833:
                                if (str3.equals("color2")) {
                                    i11 = 1;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -628825439:
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                        switch (i11) {
                            case 0:
                                i12 = 4;
                                break;
                            case 1:
                                i12 = 5;
                                break;
                            case 2:
                                i12 = 6;
                                break;
                        }
                        if (i12 >= 0) {
                            try {
                                iArr[(i3 * 7) + i12] = (int) Long.parseLong("FF" + str2, 16);
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                    }
                }
            }
        }
        return iArr;
    }

    public static int[] d(String str) {
        if (str == null || str.length() == 0) {
            return a();
        }
        try {
            return DesugarArrays.stream(str.split(",")).mapToInt(new cg.d(12)).toArray();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return a();
        }
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr.length == iArr2.length) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new qk(1)).collect(Collectors.joining(","));
    }
}
