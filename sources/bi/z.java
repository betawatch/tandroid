package bi;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.nd;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public abstract class z {
    public static int[] a() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, RichMessageLayout.PART_MAX_HEIGHT_DP, 200, 7, -1214690, -1214690, -6606592, MediaDataController.MAX_LINKS_COUNT, 600, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int b(int i10, int i11, int i12) {
        int[] iArr = MessagesController.getInstance(i10).starsGroupcallMessageLimits;
        for (int i13 = 0; i13 < iArr.length / 7; i13++) {
            int i14 = i13 * 7;
            if (i11 >= iArr[i14]) {
                return iArr[i14 + 1 + i12];
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
        char c10;
        int[] iArr = new int[tL_jsonArray.value.size() * 7];
        for (int i10 = 0; i10 < tL_jsonArray.value.size(); i10++) {
            TLRPC.JSONValue jSONValue = tL_jsonArray.value.get(i10);
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                ArrayList<TLRPC.TL_jsonObjectValue> arrayList = ((TLRPC.TL_jsonObject) jSONValue).value;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = arrayList.get(i11);
                    i11++;
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObjectValue;
                    TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                    int i12 = 2;
                    int i13 = -1;
                    if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                        int i14 = (int) ((TLRPC.TL_jsonNumber) jSONValue2).value;
                        String str = tL_jsonObjectValue2.key;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1544802595:
                                if (str.equals("text_length_max")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1186480213:
                                if (str.equals("pin_period")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 109757537:
                                if (str.equals("stars")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1686749675:
                                if (str.equals("emoji_max")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                break;
                            case 1:
                                i12 = 1;
                                break;
                            case 2:
                                i12 = 0;
                                break;
                            case 3:
                                i12 = 3;
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        if (i12 >= 0) {
                            iArr[(i10 * 7) + i12] = i14;
                        }
                    } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                        String str2 = ((TLRPC.TL_jsonString) jSONValue2).value;
                        String str3 = tL_jsonObjectValue2.key;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1354842834:
                                if (str3.equals("color1")) {
                                    i12 = 0;
                                    break;
                                }
                                i12 = -1;
                                break;
                            case -1354842833:
                                if (str3.equals("color2")) {
                                    i12 = 1;
                                    break;
                                }
                                i12 = -1;
                                break;
                            case -628825439:
                                break;
                            default:
                                i12 = -1;
                                break;
                        }
                        switch (i12) {
                            case 0:
                                i13 = 4;
                                break;
                            case 1:
                                i13 = 5;
                                break;
                            case 2:
                                i13 = 6;
                                break;
                        }
                        if (i13 >= 0) {
                            try {
                                iArr[(i10 * 7) + i13] = (int) Long.parseLong("FF" + str2, 16);
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
            return DesugarArrays.stream(str.split(",")).mapToInt(new org.telegram.messenger.c4(1)).toArray();
        } catch (Exception e7) {
            FileLog.e(e7);
            return a();
        }
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr.length == iArr2.length) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String f(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new nd(0)).collect(Collectors.joining(","));
    }
}
