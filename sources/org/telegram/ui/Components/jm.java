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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jm {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c;
    public int d;
    public int e;
    public float f;
    public final ArrayList g;
    public final /* synthetic */ qm h;

    public jm(qm qmVar, ArrayList arrayList) {
        this.h = qmVar;
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

    /* JADX WARN: Code restructure failed: missing block: B:313:0x06ba, code lost:
    
        if (r12[2] > r12[3]) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        if (r6 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f7;
        float f10;
        int i10;
        boolean z10;
        boolean z11;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        arrayList2.clear();
        HashMap hashMap = this.b;
        hashMap.clear();
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
        float f11 = 1.0f;
        boolean z12 = false;
        while (i11 < size) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i11);
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePosition.last = i11 == size + (-1);
            MediaController.CropState cropState = photoEntry.cropState;
            int i12 = cropState != null ? cropState.width : photoEntry.width;
            int i13 = cropState != null ? cropState.height : photoEntry.height;
            HashMap hashMap2 = qm.U;
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
                        int c10 = new r1.g(photoEntry.path).c();
                        if (c10 != 6) {
                        }
                        z11 = true;
                    }
                    z10 = z11;
                } catch (Exception unused) {
                    z10 = false;
                }
                qm.U.put(photoEntry, Boolean.valueOf(z10));
            }
            if (z10) {
                int i14 = i12;
                i12 = i13;
                i13 = i14;
            }
            float f12 = i12 / i13;
            groupedMessagePosition.aspectRatio = f12;
            cArr[i11] = f12 > 1.2f ? 'w' : f12 < 0.8f ? 'n' : 'q';
            f11 += f12;
            if (f12 > 2.0f) {
                z12 = true;
            }
            hashMap.put(photoEntry, groupedMessagePosition);
            arrayList2.add(groupedMessagePosition);
            i11++;
        }
        String str = new String(cArr);
        int dp = AndroidUtilities.dp(120.0f);
        float dp2 = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) (dp2 / (Math.min(point.x, point.y) / 1000.0f));
        float dp3 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / 1000.0f));
        float f13 = f11 / size;
        float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (size == 1) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (this.h.b.getBackgroundPaddingLeft() * 2);
            Point point3 = AndroidUtilities.displaySize;
            groupedMessagePosition2.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition2.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
        } else if (z12 || !(size == 2 || size == 3 || size == 4)) {
            int size2 = arrayList2.size();
            float[] fArr = new float[size2];
            for (int i15 = 0; i15 < size; i15++) {
                if (f13 > 1.1f) {
                    fArr[i15] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i15)).aspectRatio);
                } else {
                    fArr[i15] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i15)).aspectRatio);
                }
                fArr[i15] = Math.max(0.66667f, Math.min(1.7f, fArr[i15]));
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i16 = 1; i16 < size2; i16++) {
                int i17 = size2 - i16;
                if (i16 <= 3 && i17 <= 3) {
                    float b10 = b(fArr, 0, i16);
                    float b11 = b(fArr, i16, size2);
                    im imVar = new im();
                    imVar.a = new int[]{i16, i17};
                    imVar.b = new float[]{b10, b11};
                    arrayList3.add(imVar);
                }
            }
            for (int i18 = 1; i18 < size2 - 1; i18++) {
                int i19 = 1;
                while (true) {
                    int i20 = size2 - i18;
                    if (i19 < i20) {
                        int i21 = i20 - i19;
                        if (i18 <= 3) {
                            if (i19 <= (f13 < 0.85f ? 4 : 3) && i21 <= 3) {
                                float b12 = b(fArr, 0, i18);
                                int i22 = i18 + i19;
                                float b13 = b(fArr, i18, i22);
                                float b14 = b(fArr, i22, size2);
                                im imVar2 = new im();
                                imVar2.a = new int[]{i18, i19, i21};
                                imVar2.b = new float[]{b12, b13, b14};
                                arrayList3.add(imVar2);
                            }
                        }
                        i19++;
                    }
                }
            }
            for (int i23 = 1; i23 < size2 - 2; i23++) {
                int i24 = 1;
                while (true) {
                    int i25 = size2 - i23;
                    if (i24 < i25) {
                        int i26 = 1;
                        while (true) {
                            int i27 = i25 - i24;
                            if (i26 < i27) {
                                int i28 = i27 - i26;
                                if (i23 > 3 || i24 > 3 || i26 > 3 || i28 > 3) {
                                    i10 = size2;
                                } else {
                                    float b15 = b(fArr, 0, i23);
                                    int i29 = i23 + i24;
                                    float b16 = b(fArr, i23, i29);
                                    int i30 = i29 + i26;
                                    float b17 = b(fArr, i29, i30);
                                    float b18 = b(fArr, i30, size2);
                                    im imVar3 = new im();
                                    imVar3.a = new int[]{i23, i24, i26, i28};
                                    i10 = size2;
                                    imVar3.b = new float[]{b15, b16, b17, b18};
                                    arrayList3.add(imVar3);
                                }
                                i26++;
                                size2 = i10;
                            }
                        }
                        i24++;
                    }
                }
            }
            float f14 = 0.0f;
            im imVar4 = null;
            for (int i31 = 0; i31 < arrayList3.size(); i31++) {
                im imVar5 = (im) arrayList3.get(i31);
                float f15 = Float.MAX_VALUE;
                float f16 = 0.0f;
                int i32 = 0;
                while (true) {
                    float[] fArr2 = imVar5.b;
                    if (i32 >= fArr2.length) {
                        break;
                    }
                    float f17 = fArr2[i32];
                    f16 += f17;
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i32++;
                }
                float abs = Math.abs(f16 - 1332.0f);
                int[] iArr = imVar5.a;
                if (iArr.length > 1) {
                    int i33 = iArr[0];
                    int i34 = iArr[1];
                    if (i33 <= i34) {
                        f7 = abs;
                        if (iArr.length <= 2 || i34 <= iArr[2]) {
                            if (iArr.length > 3) {
                            }
                        }
                    } else {
                        f7 = abs;
                    }
                    f10 = f7 * 1.2f;
                    if (f15 < min) {
                        f10 *= 1.5f;
                    }
                    if (imVar4 != null || f10 < f14) {
                        f14 = f10;
                        imVar4 = imVar5;
                    }
                } else {
                    f7 = abs;
                }
                f10 = f7;
                if (f15 < min) {
                }
                if (imVar4 != null) {
                }
                f14 = f10;
                imVar4 = imVar5;
            }
            if (imVar4 == null) {
                return;
            }
            int[] iArr2 = imVar4.a;
            int i35 = 0;
            int i36 = 0;
            while (i35 < iArr2.length) {
                int i37 = iArr2[i35];
                float f18 = imVar4.b[i35];
                int i38 = 0;
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                int i39 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                while (i38 < i37) {
                    int i40 = (int) (fArr[i36] * f18);
                    i39 -= i40;
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(i36);
                    int i41 = i35 == 0 ? 4 : 0;
                    float[] fArr3 = fArr;
                    if (i35 == iArr2.length - 1) {
                        i41 |= 8;
                    }
                    if (i38 == 0) {
                        i41 |= 1;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    if (i38 == i37 - 1) {
                        i41 |= 2;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    int i42 = i38;
                    groupedMessagePosition4.set(i42, i38, i35, i35, i40, Math.max(dp4, f18 / 814.0f), i41);
                    i36++;
                    i38 = i42 + 1;
                    fArr = fArr3;
                }
                int i43 = i35;
                float[] fArr4 = fArr;
                if (groupedMessagePosition3 != null) {
                    groupedMessagePosition3.pw += i39;
                    groupedMessagePosition3.spanSize += i39;
                }
                i35 = i43 + 1;
                fArr = fArr4;
            }
        } else if (size == 2) {
            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            if (str.equals("ww") && f13 > 1.2285012f * 1.4d) {
                float f19 = groupedMessagePosition5.aspectRatio;
                float f20 = groupedMessagePosition6.aspectRatio;
                if (f19 - f20 < 0.2d) {
                    float round = Math.round(Math.min(1000.0f / f19, Math.min(1000.0f / f20, 407.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 7);
                    groupedMessagePosition6.set(0, 0, 1, 1, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 11);
                }
            }
            if (str.equals("ww") || str.equals("qq")) {
                float f21 = 500;
                float round2 = Math.round(Math.min(f21 / groupedMessagePosition5.aspectRatio, Math.min(f21 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                groupedMessagePosition5.set(0, 0, 0, 0, 500, round2, 13);
                groupedMessagePosition6.set(1, 1, 0, 0, 500, round2, 14);
            } else {
                float f22 = groupedMessagePosition5.aspectRatio;
                int max = (int) Math.max(400.0f, Math.round((1000.0f / f22) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f22))));
                int i44 = 1000 - max;
                if (i44 < min) {
                    max -= min - i44;
                } else {
                    min = i44;
                }
                float min3 = Math.min(814.0f, Math.round(Math.min(min / groupedMessagePosition5.aspectRatio, max / groupedMessagePosition6.aspectRatio))) / 814.0f;
                groupedMessagePosition5.set(0, 0, 0, 0, min, min3, 13);
                groupedMessagePosition6.set(1, 1, 0, 0, max, min3, 14);
            }
        } else if (size == 3) {
            MessageObject.GroupedMessagePosition groupedMessagePosition7 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition8 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            MessageObject.GroupedMessagePosition groupedMessagePosition9 = (MessageObject.GroupedMessagePosition) arrayList2.get(2);
            if (str.charAt(0) == 'n') {
                float f23 = groupedMessagePosition8.aspectRatio;
                float min4 = Math.min(407.0f, Math.round((f23 * 1000.0f) / (groupedMessagePosition9.aspectRatio + f23)));
                int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r9))));
                float f24 = (groupedMessagePosition7.aspectRatio * 814.0f) + min2;
                int i45 = 1000 - max2;
                groupedMessagePosition7.set(0, 0, 0, 1, Math.round(Math.min(f24, i45)), 1.0f, 13);
                float f25 = (814.0f - min4) / 814.0f;
                groupedMessagePosition8.set(1, 1, 0, 0, max2, f25, 6);
                float f26 = min4 / 814.0f;
                groupedMessagePosition9.set(1, 1, 1, 1, max2, f26, 10);
                groupedMessagePosition9.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition7.siblingHeights = new float[]{f26, f25};
                groupedMessagePosition7.spanSize = i45;
            } else {
                float round3 = Math.round(Math.min(1000.0f / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition7.set(0, 1, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round3, 7);
                float f27 = 500;
                float min5 = Math.min(814.0f - round3, Math.round(Math.min(f27 / groupedMessagePosition8.aspectRatio, f27 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                float f28 = min5 < dp4 ? dp4 : min5;
                groupedMessagePosition8.set(0, 0, 1, 1, 500, f28, 9);
                groupedMessagePosition9.set(1, 1, 1, 1, 500, f28, 10);
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
                float f29 = min;
                int max3 = (int) Math.max(f29, Math.min(400.0f, groupedMessagePosition11.aspectRatio * round5));
                int max4 = (int) Math.max(Math.max(f29, 330.0f), groupedMessagePosition13.aspectRatio * round5);
                int i46 = (1000 - max3) - max4;
                if (i46 < AndroidUtilities.dp(58.0f)) {
                    int dp5 = AndroidUtilities.dp(58.0f) - i46;
                    i46 = AndroidUtilities.dp(58.0f);
                    int i47 = dp5 / 2;
                    max3 -= i47;
                    max4 -= dp5 - i47;
                }
                int i48 = max3;
                float min6 = Math.min(814.0f - round4, round5) / 814.0f;
                float f30 = min6 < dp4 ? dp4 : min6;
                groupedMessagePosition11.set(0, 0, 1, 1, i48, f30, 9);
                groupedMessagePosition12.set(1, 1, 1, 1, i46, f30, 8);
                groupedMessagePosition13.set(2, 2, 1, 1, max4, f30, 10);
            } else {
                int max5 = Math.max(min, Math.round(814.0f / ((1.0f / groupedMessagePosition13.aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                float f31 = dp;
                float f32 = max5;
                float min7 = Math.min(0.33f, Math.max(f31, f32 / groupedMessagePosition11.aspectRatio) / 814.0f);
                float min8 = Math.min(0.33f, Math.max(f31, f32 / groupedMessagePosition12.aspectRatio) / 814.0f);
                float f33 = (1.0f - min7) - min8;
                float f34 = (groupedMessagePosition10.aspectRatio * 814.0f) + min2;
                int i49 = 1000 - max5;
                groupedMessagePosition10.set(0, 0, 0, 2, Math.round(Math.min(f34, i49)), min7 + min8 + f33, 13);
                groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                groupedMessagePosition12.set(1, 1, 1, 1, max5, min8, 2);
                groupedMessagePosition12.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition13.set(1, 1, 2, 2, max5, f33, 10);
                groupedMessagePosition13.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition10.spanSize = i49;
                groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f33};
            }
        }
        int i50 = 0;
        while (i50 < size) {
            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i50);
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
            int i51 = (b20 - b19) + 1;
            float[] fArr5 = new float[i51];
            Arrays.fill(fArr5, 0.0f);
            int size3 = arrayList2.size();
            int i52 = 0;
            while (i52 < size3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i52);
                if (groupedMessagePosition15 != groupedMessagePosition14 && groupedMessagePosition15.maxX < b21) {
                    int min9 = Math.min((int) groupedMessagePosition15.maxY, (int) b20) - b19;
                    int max6 = Math.max(groupedMessagePosition15.minY - b19, 0);
                    while (max6 <= min9) {
                        fArr5[max6] = fArr5[max6] + groupedMessagePosition15.pw;
                        max6++;
                        i50 = i50;
                    }
                }
                i52++;
                i50 = i50;
            }
            int i53 = i50;
            float f35 = 0.0f;
            for (int i54 = 0; i54 < i51; i54++) {
                float f36 = fArr5[i54];
                if (f35 < f36) {
                    f35 = f36;
                }
            }
            groupedMessagePosition14.left = f35;
            i50 = i53 + 1;
        }
        for (int i55 = 0; i55 < size; i55++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i55);
            byte b22 = groupedMessagePosition16.minY;
            int i56 = this.d + 1;
            float[] fArr6 = new float[i56];
            Arrays.fill(fArr6, 0.0f);
            int size4 = arrayList2.size();
            for (int i57 = 0; i57 < size4; i57++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i57);
                if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxY < b22) {
                    for (int i58 = groupedMessagePosition17.minX; i58 <= groupedMessagePosition17.maxX; i58++) {
                        fArr6[i58] = fArr6[i58] + groupedMessagePosition17.ph;
                    }
                }
            }
            float f37 = 0.0f;
            for (int i59 = 0; i59 < i56; i59++) {
                float f38 = fArr6[i59];
                if (f37 < f38) {
                    f37 = f38;
                }
            }
            groupedMessagePosition16.top = f37;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i60 = 0; i60 < size5; i60++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i60);
            int i61 = groupedMessagePosition18.pw;
            for (int i62 = groupedMessagePosition18.minY; i62 <= groupedMessagePosition18.maxY; i62++) {
                iArr3[i62] = iArr3[i62] + i61;
            }
        }
        int i63 = iArr3[0];
        for (int i64 = 1; i64 < 10; i64++) {
            int i65 = iArr3[i64];
            if (i63 < i65) {
                i63 = i65;
            }
        }
        this.c = i63;
        float[] fArr7 = new float[10];
        Arrays.fill(fArr7, 0.0f);
        int size6 = arrayList2.size();
        for (int i66 = 0; i66 < size6; i66++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i66);
            float f39 = groupedMessagePosition19.ph;
            for (int i67 = groupedMessagePosition19.minX; i67 <= groupedMessagePosition19.maxX; i67++) {
                fArr7[i67] = fArr7[i67] + f39;
            }
        }
        float f40 = fArr7[0];
        for (int i68 = 1; i68 < 10; i68++) {
            float f41 = fArr7[i68];
            if (f40 < f41) {
                f40 = f41;
            }
        }
        this.f = f40;
    }
}
