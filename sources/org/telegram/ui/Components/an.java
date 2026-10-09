package org.telegram.ui.Components;

import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class an {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c;
    public int d;
    public int e;
    public float f;
    public final ArrayList g;
    public final /* synthetic */ hn h;

    public an(hn hnVar, ArrayList arrayList) {
        this.h = hnVar;
        this.g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i10, int i11) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000.0f / f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x06b0, code lost:
    
        if (r12[2] > r12[3]) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (r6 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f7;
        float f10;
        int i10;
        char c10;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        arrayList2.clear();
        HashMap hashMap = this.b;
        hashMap.clear();
        boolean z12 = false;
        if (size == 0) {
            this.c = 0;
            this.f = 0.0f;
            this.d = 0;
            this.e = 0;
            return;
        }
        arrayList2.ensureCapacity(size);
        char[] cArr = new char[size];
        int i11 = 0;
        boolean z13 = false;
        float f13 = 1.0f;
        while (i11 < size) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i11);
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePosition.last = i11 == size + (-1) ? true : z12;
            MediaController.CropState cropState = photoEntry.cropState;
            int i12 = cropState != null ? cropState.width : photoEntry.width;
            int i13 = cropState != null ? cropState.height : photoEntry.height;
            HashMap hashMap2 = hn.U;
            if (hashMap2.containsKey(photoEntry)) {
                z10 = ((Boolean) hashMap2.get(photoEntry)).booleanValue();
            } else {
                try {
                    if (photoEntry.isVideo) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(photoEntry.path);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                        if (extractMetadata != null) {
                            if (!extractMetadata.equals("90")) {
                                if (extractMetadata.equals("270")) {
                                }
                            }
                            z11 = true;
                        }
                        z11 = false;
                    } else {
                        int c11 = new r1.g(photoEntry.path).c();
                        if (c11 != 6) {
                        }
                        z11 = true;
                    }
                    z10 = z11;
                } catch (Exception unused) {
                    z10 = false;
                }
                hn.U.put(photoEntry, Boolean.valueOf(z10));
            }
            if (z10) {
                int i14 = i12;
                i12 = i13;
                i13 = i14;
            }
            float f14 = i12 / i13;
            groupedMessagePosition.aspectRatio = f14;
            cArr[i11] = f14 > 1.2f ? 'w' : f14 < 0.8f ? 'n' : 'q';
            f13 += f14;
            if (f14 > 2.0f) {
                z13 = true;
            }
            hashMap.put(photoEntry, groupedMessagePosition);
            arrayList2.add(groupedMessagePosition);
            i11++;
            z12 = false;
        }
        float f15 = 1.0f;
        String str = new String(cArr);
        int dp = AndroidUtilities.dp(120.0f);
        float dp2 = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) (dp2 / (Math.min(point.x, point.y) / 1000.0f));
        float dp3 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / 1000.0f));
        float f16 = f13 / size;
        float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (size == 1) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (this.h.b.getBackgroundPaddingLeft() * 2);
            Point point3 = AndroidUtilities.displaySize;
            groupedMessagePosition2.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition2.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
        } else {
            char c12 = 4;
            if (z13 || !(size == 2 || size == 3 || size == 4)) {
                int i15 = 2;
                int size2 = arrayList2.size();
                float[] fArr = new float[size2];
                int i16 = 0;
                while (i16 < size) {
                    if (f16 > 1.1f) {
                        f11 = f15;
                        fArr[i16] = Math.max(f11, ((MessageObject.GroupedMessagePosition) arrayList2.get(i16)).aspectRatio);
                    } else {
                        f11 = f15;
                        fArr[i16] = Math.min(f11, ((MessageObject.GroupedMessagePosition) arrayList2.get(i16)).aspectRatio);
                    }
                    fArr[i16] = Math.max(0.66667f, Math.min(1.7f, fArr[i16]));
                    i16++;
                    f15 = f11;
                }
                ArrayList arrayList3 = new ArrayList();
                int i17 = 1;
                while (i17 < size2) {
                    int i18 = size2 - i17;
                    if (i17 <= 3 && i18 <= 3) {
                        float b10 = b(fArr, 0, i17);
                        float b11 = b(fArr, i17, size2);
                        zm zmVar = new zm();
                        zmVar.a = new int[]{i17, i18};
                        float[] fArr2 = new float[i15];
                        fArr2[0] = b10;
                        fArr2[1] = b11;
                        zmVar.b = fArr2;
                        arrayList3.add(zmVar);
                    }
                    i17++;
                    i15 = 2;
                }
                for (int i19 = 1; i19 < size2 - 1; i19++) {
                    int i20 = 1;
                    while (true) {
                        int i21 = size2 - i19;
                        if (i20 < i21) {
                            int i22 = i21 - i20;
                            if (i19 <= 3) {
                                if (i20 <= (f16 < 0.85f ? 4 : 3) && i22 <= 3) {
                                    float b12 = b(fArr, 0, i19);
                                    int i23 = i19 + i20;
                                    float b13 = b(fArr, i19, i23);
                                    float b14 = b(fArr, i23, size2);
                                    zm zmVar2 = new zm();
                                    zmVar2.a = new int[]{i19, i20, i22};
                                    zmVar2.b = new float[]{b12, b13, b14};
                                    arrayList3.add(zmVar2);
                                }
                            }
                            i20++;
                        }
                    }
                }
                for (int i24 = 1; i24 < size2 - 2; i24++) {
                    int i25 = 1;
                    while (true) {
                        int i26 = size2 - i24;
                        if (i25 < i26) {
                            int i27 = 1;
                            while (true) {
                                int i28 = i26 - i25;
                                if (i27 < i28) {
                                    int i29 = i28 - i27;
                                    if (i24 > 3 || i25 > 3 || i27 > 3 || i29 > 3) {
                                        i10 = size2;
                                        c10 = c12;
                                    } else {
                                        float b15 = b(fArr, 0, i24);
                                        int i30 = i24 + i25;
                                        float b16 = b(fArr, i24, i30);
                                        int i31 = i30 + i27;
                                        float b17 = b(fArr, i30, i31);
                                        float b18 = b(fArr, i31, size2);
                                        zm zmVar3 = new zm();
                                        zmVar3.a = new int[]{i24, i25, i27, i29};
                                        i10 = size2;
                                        c10 = 4;
                                        zmVar3.b = new float[]{b15, b16, b17, b18};
                                        arrayList3.add(zmVar3);
                                    }
                                    i27++;
                                    c12 = c10;
                                    size2 = i10;
                                }
                            }
                            i25++;
                        }
                    }
                }
                float f17 = 0.0f;
                zm zmVar4 = null;
                for (int i32 = 0; i32 < arrayList3.size(); i32++) {
                    zm zmVar5 = (zm) arrayList3.get(i32);
                    float f18 = Float.MAX_VALUE;
                    float f19 = 0.0f;
                    int i33 = 0;
                    while (true) {
                        float[] fArr3 = zmVar5.b;
                        if (i33 >= fArr3.length) {
                            break;
                        }
                        float f20 = fArr3[i33];
                        f19 += f20;
                        if (f20 < f18) {
                            f18 = f20;
                        }
                        i33++;
                    }
                    float abs = Math.abs(f19 - 1332.0f);
                    int[] iArr = zmVar5.a;
                    if (iArr.length > 1) {
                        int i34 = iArr[0];
                        int i35 = iArr[1];
                        if (i34 <= i35) {
                            f7 = abs;
                            if (iArr.length <= 2 || i35 <= iArr[2]) {
                                if (iArr.length > 3) {
                                }
                            }
                        } else {
                            f7 = abs;
                        }
                        f10 = f7 * 1.2f;
                        if (f18 < min) {
                            f10 *= 1.5f;
                        }
                        if (zmVar4 != null || f10 < f17) {
                            f17 = f10;
                            zmVar4 = zmVar5;
                        }
                    } else {
                        f7 = abs;
                    }
                    f10 = f7;
                    if (f18 < min) {
                    }
                    if (zmVar4 != null) {
                    }
                    f17 = f10;
                    zmVar4 = zmVar5;
                }
                if (zmVar4 == null) {
                    return;
                }
                int[] iArr2 = zmVar4.a;
                int i36 = 0;
                int i37 = 0;
                while (i36 < iArr2.length) {
                    int i38 = iArr2[i36];
                    float f21 = zmVar4.b[i36];
                    int i39 = 0;
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                    int i40 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    while (i39 < i38) {
                        int i41 = (int) (fArr[i37] * f21);
                        i40 -= i41;
                        MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(i37);
                        int i42 = i36 == 0 ? 4 : 0;
                        float[] fArr4 = fArr;
                        if (i36 == iArr2.length - 1) {
                            i42 |= 8;
                        }
                        if (i39 == 0) {
                            i42 |= 1;
                            groupedMessagePosition3 = groupedMessagePosition4;
                        }
                        if (i39 == i38 - 1) {
                            i42 |= 2;
                            groupedMessagePosition3 = groupedMessagePosition4;
                        }
                        int i43 = i39;
                        groupedMessagePosition4.set(i43, i39, i36, i36, i41, Math.max(dp4, f21 / 814.0f), i42);
                        i37++;
                        i39 = i43 + 1;
                        fArr = fArr4;
                    }
                    int i44 = i36;
                    float[] fArr5 = fArr;
                    if (groupedMessagePosition3 != null) {
                        groupedMessagePosition3.pw += i40;
                        groupedMessagePosition3.spanSize += i40;
                    }
                    i36 = i44 + 1;
                    fArr = fArr5;
                }
            } else if (size == 2) {
                MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                if (str.equals("ww")) {
                    f12 = 814.0f;
                    if (f16 > 1.2285012f * 1.4d) {
                        float f22 = groupedMessagePosition5.aspectRatio;
                        float f23 = groupedMessagePosition6.aspectRatio;
                        if (f22 - f23 < 0.2d) {
                            float round = Math.round(Math.min(1000.0f / f22, Math.min(1000.0f / f23, 407.0f))) / 814.0f;
                            groupedMessagePosition5.set(0, 0, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 7);
                            groupedMessagePosition6.set(0, 0, 1, 1, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 11);
                        }
                    }
                } else {
                    f12 = 814.0f;
                }
                if (str.equals("ww") || str.equals("qq")) {
                    float f24 = 500;
                    float round2 = Math.round(Math.min(f24 / groupedMessagePosition5.aspectRatio, Math.min(f24 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, 500, round2, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, 500, round2, 14);
                } else {
                    float f25 = groupedMessagePosition5.aspectRatio;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f25) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f25))));
                    int i45 = 1000 - max;
                    if (i45 < min) {
                        max -= min - i45;
                    } else {
                        min = i45;
                    }
                    float f26 = f12;
                    float min3 = Math.min(f26, Math.round(Math.min(min / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / f26;
                    groupedMessagePosition5.set(0, 0, 0, 0, min, min3, 13);
                    groupedMessagePosition6.set(1, 1, 0, 0, max, min3, 14);
                }
            } else if (size == 3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                if (str.charAt(0) == 'n') {
                    float f27 = groupedMessagePosition8.aspectRatio;
                    float min4 = Math.min(407.0f, Math.round((f27 * 1000.0f) / (groupedMessagePosition9.aspectRatio + f27)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r9))));
                    float f28 = (groupedMessagePosition7.aspectRatio * 814.0f) + min2;
                    int i46 = 1000 - max2;
                    groupedMessagePosition7.set(0, 0, 0, 1, Math.round(Math.min(f28, i46)), 1.0f, 13);
                    float f29 = (814.0f - min4) / 814.0f;
                    groupedMessagePosition8.set(1, 1, 0, 0, max2, f29, 6);
                    float f30 = min4 / 814.0f;
                    groupedMessagePosition9.set(1, 1, 1, 1, max2, f30, 10);
                    groupedMessagePosition9.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    groupedMessagePosition7.siblingHeights = new float[]{f30, f29};
                    groupedMessagePosition7.spanSize = i46;
                } else {
                    float round3 = Math.round(Math.min(1000.0f / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                    groupedMessagePosition7.set(0, 1, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round3, 7);
                    float f31 = 500;
                    float min5 = Math.min(814.0f - round3, Math.round(Math.min(f31 / groupedMessagePosition8.aspectRatio, f31 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                    float f32 = min5 < dp4 ? dp4 : min5;
                    groupedMessagePosition8.set(0, 0, 1, 1, 500, f32, 9);
                    groupedMessagePosition9.set(1, 1, 1, 1, 500, f32, 10);
                }
            } else {
                MessageObject.GroupedMessagePosition groupedMessagePosition10 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
                MessageObject.GroupedMessagePosition groupedMessagePosition11 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
                MessageObject.GroupedMessagePosition groupedMessagePosition12 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
                MessageObject.GroupedMessagePosition groupedMessagePosition13 = (MessageObject.GroupedMessagePosition) arrayList2.get(3);
                if (str.charAt(0) == 'w') {
                    float round4 = Math.round(Math.min(1000.0f / groupedMessagePosition10.aspectRatio, 537.24005f)) / 814.0f;
                    groupedMessagePosition10.set(0, 2, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round4, 7);
                    float round5 = Math.round(1000.0f / ((groupedMessagePosition11.aspectRatio + groupedMessagePosition12.aspectRatio) + groupedMessagePosition13.aspectRatio));
                    float f33 = min;
                    int max3 = (int) Math.max(f33, Math.min(400.0f, groupedMessagePosition11.aspectRatio * round5));
                    int max4 = (int) Math.max(Math.max(f33, 330.0f), groupedMessagePosition13.aspectRatio * round5);
                    int i47 = (1000 - max3) - max4;
                    if (i47 < AndroidUtilities.dp(58.0f)) {
                        int dp5 = AndroidUtilities.dp(58.0f) - i47;
                        i47 = AndroidUtilities.dp(58.0f);
                        int i48 = dp5 / 2;
                        max3 -= i48;
                        max4 -= dp5 - i48;
                    }
                    int i49 = max3;
                    float min6 = Math.min(814.0f - round4, round5) / 814.0f;
                    float f34 = min6 < dp4 ? dp4 : min6;
                    groupedMessagePosition11.set(0, 0, 1, 1, i49, f34, 9);
                    groupedMessagePosition12.set(1, 1, 1, 1, i47, f34, 8);
                    groupedMessagePosition13.set(2, 2, 1, 1, max4, f34, 10);
                } else {
                    int max5 = Math.max(min, Math.round(814.0f / ((1.0f / groupedMessagePosition13.aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                    float f35 = dp;
                    float f36 = max5;
                    float min7 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition11.aspectRatio) / 814.0f);
                    float min8 = Math.min(0.33f, Math.max(f35, f36 / groupedMessagePosition12.aspectRatio) / 814.0f);
                    float f37 = (1.0f - min7) - min8;
                    float f38 = (groupedMessagePosition10.aspectRatio * 814.0f) + min2;
                    int i50 = 1000 - max5;
                    groupedMessagePosition10.set(0, 0, 0, 2, Math.round(Math.min(f38, i50)), min7 + min8 + f37, 13);
                    groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                    groupedMessagePosition12.set(1, 1, 1, 1, max5, min8, 2);
                    groupedMessagePosition12.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    groupedMessagePosition13.set(1, 1, 2, 2, max5, f37, 10);
                    groupedMessagePosition13.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    groupedMessagePosition10.spanSize = i50;
                    groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f37};
                }
            }
        }
        int i51 = 0;
        while (i51 < size) {
            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i51);
            if (groupedMessagePosition14.minX == 0) {
                groupedMessagePosition14.spanSize += 200;
            }
            if ((groupedMessagePosition14.flags & 2) != 0) {
                groupedMessagePosition14.edge = true;
            }
            this.d = Math.max(this.d, (int) groupedMessagePosition14.maxX);
            this.e = Math.max(this.e, (int) groupedMessagePosition14.maxY);
            byte b19 = groupedMessagePosition14.minY;
            byte b20 = groupedMessagePosition14.maxY;
            byte b21 = groupedMessagePosition14.minX;
            int i52 = (b20 - b19) + 1;
            float[] fArr6 = new float[i52];
            Arrays.fill(fArr6, 0.0f);
            int size3 = arrayList2.size();
            int i53 = 0;
            while (i53 < size3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i53);
                if (groupedMessagePosition15 != groupedMessagePosition14 && groupedMessagePosition15.maxX < b21) {
                    int min9 = Math.min((int) groupedMessagePosition15.maxY, (int) b20) - b19;
                    int max6 = Math.max(groupedMessagePosition15.minY - b19, 0);
                    while (max6 <= min9) {
                        fArr6[max6] = fArr6[max6] + groupedMessagePosition15.pw;
                        max6++;
                        i51 = i51;
                    }
                }
                i53++;
                i51 = i51;
            }
            int i54 = i51;
            float f39 = 0.0f;
            for (int i55 = 0; i55 < i52; i55++) {
                float f40 = fArr6[i55];
                if (f39 < f40) {
                    f39 = f40;
                }
            }
            groupedMessagePosition14.left = f39;
            i51 = i54 + 1;
        }
        for (int i56 = 0; i56 < size; i56++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i56);
            byte b22 = groupedMessagePosition16.minY;
            int i57 = this.d + 1;
            float[] fArr7 = new float[i57];
            Arrays.fill(fArr7, 0.0f);
            int size4 = arrayList2.size();
            for (int i58 = 0; i58 < size4; i58++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i58);
                if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxY < b22) {
                    for (int i59 = groupedMessagePosition17.minX; i59 <= groupedMessagePosition17.maxX; i59++) {
                        fArr7[i59] = fArr7[i59] + groupedMessagePosition17.ph;
                    }
                }
            }
            float f41 = 0.0f;
            for (int i60 = 0; i60 < i57; i60++) {
                float f42 = fArr7[i60];
                if (f41 < f42) {
                    f41 = f42;
                }
            }
            groupedMessagePosition16.top = f41;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i61 = 0; i61 < size5; i61++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i61);
            int i62 = groupedMessagePosition18.pw;
            for (int i63 = groupedMessagePosition18.minY; i63 <= groupedMessagePosition18.maxY; i63++) {
                iArr3[i63] = iArr3[i63] + i62;
            }
        }
        int i64 = iArr3[0];
        for (int i65 = 1; i65 < 10; i65++) {
            int i66 = iArr3[i65];
            if (i64 < i66) {
                i64 = i66;
            }
        }
        this.c = i64;
        float[] fArr8 = new float[10];
        Arrays.fill(fArr8, 0.0f);
        int size6 = arrayList2.size();
        for (int i67 = 0; i67 < size6; i67++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i67);
            float f43 = groupedMessagePosition19.ph;
            for (int i68 = groupedMessagePosition19.minX; i68 <= groupedMessagePosition19.maxX; i68++) {
                fArr8[i68] = fArr8[i68] + f43;
            }
        }
        float f44 = fArr8[0];
        for (int i69 = 1; i69 < 10; i69++) {
            float f45 = fArr8[i69];
            if (f44 < f45) {
                f44 = f45;
            }
        }
        this.f = f44;
    }
}
