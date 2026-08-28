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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class am {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c;
    public int d;
    public int e;
    public float f;
    public final ArrayList g;
    public final /* synthetic */ hm h;

    public am(hm hmVar, ArrayList arrayList) {
        this.h = hmVar;
        this.g = arrayList;
        a();
    }

    public static float b(float[] fArr, int i9, int i10) {
        float f10 = 0.0f;
        while (i9 < i10) {
            f10 += fArr[i9];
            i9++;
        }
        return 1000.0f / f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x06c8, code lost:
    
        if (r12[2] > r12[3]) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b0, code lost:
    
        if (r6 != 8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        float f10;
        float f11;
        int i9;
        boolean z10;
        int e10;
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
        int i10 = 0;
        float f12 = 1.0f;
        boolean z12 = false;
        while (i10 < size) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList.get(i10);
            MessageObject.GroupedMessagePosition groupedMessagePosition = new MessageObject.GroupedMessagePosition();
            groupedMessagePosition.last = i10 == size + (-1);
            MediaController.CropState cropState = photoEntry.cropState;
            int i11 = cropState != null ? cropState.width : photoEntry.width;
            int i12 = cropState != null ? cropState.height : photoEntry.height;
            HashMap hashMap2 = hm.Q;
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
                        r1.g gVar = new r1.g(photoEntry.path);
                        r1.c c10 = gVar.c("Orientation");
                        if (c10 != null) {
                            try {
                                e10 = c10.e(gVar.g);
                            } catch (NumberFormatException unused) {
                            }
                            if (e10 != 6) {
                            }
                            z11 = true;
                        }
                        e10 = 1;
                        if (e10 != 6) {
                        }
                        z11 = true;
                    }
                    z10 = z11;
                } catch (Exception unused2) {
                    z10 = false;
                }
                hm.Q.put(photoEntry, Boolean.valueOf(z10));
            }
            if (z10) {
                int i13 = i11;
                i11 = i12;
                i12 = i13;
            }
            float f13 = i11 / i12;
            groupedMessagePosition.aspectRatio = f13;
            cArr[i10] = f13 > 1.2f ? 'w' : f13 < 0.8f ? 'n' : 'q';
            f12 += f13;
            if (f13 > 2.0f) {
                z12 = true;
            }
            hashMap.put(photoEntry, groupedMessagePosition);
            arrayList2.add(groupedMessagePosition);
            i10++;
        }
        String str = new String(cArr);
        int dp = AndroidUtilities.dp(120.0f);
        float dp2 = AndroidUtilities.dp(120.0f);
        Point point = AndroidUtilities.displaySize;
        int min = (int) (dp2 / (Math.min(point.x, point.y) / 1000.0f));
        float dp3 = AndroidUtilities.dp(40.0f);
        Point point2 = AndroidUtilities.displaySize;
        int min2 = (int) (dp3 / (Math.min(point2.x, point2.y) / 1000.0f));
        float f14 = f12 / size;
        float dp4 = AndroidUtilities.dp(100.0f) / 814.0f;
        if (size == 1) {
            MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            int backgroundPaddingLeft = AndroidUtilities.displaySize.x - (this.h.b.getBackgroundPaddingLeft() * 2);
            Point point3 = AndroidUtilities.displaySize;
            groupedMessagePosition2.set(0, 0, 0, 0, 800, ((backgroundPaddingLeft * 0.8f) / groupedMessagePosition2.aspectRatio) / (Math.max(point3.x, point3.y) * 0.5f), 15);
        } else if (z12 || !(size == 2 || size == 3 || size == 4)) {
            int size2 = arrayList2.size();
            float[] fArr = new float[size2];
            for (int i14 = 0; i14 < size; i14++) {
                if (f14 > 1.1f) {
                    fArr[i14] = Math.max(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i14)).aspectRatio);
                } else {
                    fArr[i14] = Math.min(1.0f, ((MessageObject.GroupedMessagePosition) arrayList2.get(i14)).aspectRatio);
                }
                fArr[i14] = Math.max(0.66667f, Math.min(1.7f, fArr[i14]));
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i15 = 1; i15 < size2; i15++) {
                int i16 = size2 - i15;
                if (i15 <= 3 && i16 <= 3) {
                    float b10 = b(fArr, 0, i15);
                    float b11 = b(fArr, i15, size2);
                    zl zlVar = new zl();
                    zlVar.a = new int[]{i15, i16};
                    zlVar.b = new float[]{b10, b11};
                    arrayList3.add(zlVar);
                }
            }
            for (int i17 = 1; i17 < size2 - 1; i17++) {
                int i18 = 1;
                while (true) {
                    int i19 = size2 - i17;
                    if (i18 < i19) {
                        int i20 = i19 - i18;
                        if (i17 <= 3) {
                            if (i18 <= (f14 < 0.85f ? 4 : 3) && i20 <= 3) {
                                float b12 = b(fArr, 0, i17);
                                int i21 = i17 + i18;
                                float b13 = b(fArr, i17, i21);
                                float b14 = b(fArr, i21, size2);
                                zl zlVar2 = new zl();
                                zlVar2.a = new int[]{i17, i18, i20};
                                zlVar2.b = new float[]{b12, b13, b14};
                                arrayList3.add(zlVar2);
                            }
                        }
                        i18++;
                    }
                }
            }
            for (int i22 = 1; i22 < size2 - 2; i22++) {
                int i23 = 1;
                while (true) {
                    int i24 = size2 - i22;
                    if (i23 < i24) {
                        int i25 = 1;
                        while (true) {
                            int i26 = i24 - i23;
                            if (i25 < i26) {
                                int i27 = i26 - i25;
                                if (i22 > 3 || i23 > 3 || i25 > 3 || i27 > 3) {
                                    i9 = size2;
                                } else {
                                    float b15 = b(fArr, 0, i22);
                                    int i28 = i22 + i23;
                                    float b16 = b(fArr, i22, i28);
                                    int i29 = i28 + i25;
                                    float b17 = b(fArr, i28, i29);
                                    float b18 = b(fArr, i29, size2);
                                    zl zlVar3 = new zl();
                                    zlVar3.a = new int[]{i22, i23, i25, i27};
                                    i9 = size2;
                                    zlVar3.b = new float[]{b15, b16, b17, b18};
                                    arrayList3.add(zlVar3);
                                }
                                i25++;
                                size2 = i9;
                            }
                        }
                        i23++;
                    }
                }
            }
            float f15 = 0.0f;
            zl zlVar4 = null;
            for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                zl zlVar5 = (zl) arrayList3.get(i30);
                float f16 = Float.MAX_VALUE;
                float f17 = 0.0f;
                int i31 = 0;
                while (true) {
                    float[] fArr2 = zlVar5.b;
                    if (i31 >= fArr2.length) {
                        break;
                    }
                    float f18 = fArr2[i31];
                    f17 += f18;
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i31++;
                }
                float abs = Math.abs(f17 - 1332.0f);
                int[] iArr = zlVar5.a;
                if (iArr.length > 1) {
                    int i32 = iArr[0];
                    int i33 = iArr[1];
                    if (i32 <= i33) {
                        f10 = abs;
                        if (iArr.length <= 2 || i33 <= iArr[2]) {
                            if (iArr.length > 3) {
                            }
                        }
                    } else {
                        f10 = abs;
                    }
                    f11 = f10 * 1.2f;
                    if (f16 < min) {
                        f11 *= 1.5f;
                    }
                    if (zlVar4 != null || f11 < f15) {
                        f15 = f11;
                        zlVar4 = zlVar5;
                    }
                } else {
                    f10 = abs;
                }
                f11 = f10;
                if (f16 < min) {
                }
                if (zlVar4 != null) {
                }
                f15 = f11;
                zlVar4 = zlVar5;
            }
            if (zlVar4 == null) {
                return;
            }
            int[] iArr2 = zlVar4.a;
            int i34 = 0;
            int i35 = 0;
            while (i34 < iArr2.length) {
                int i36 = iArr2[i34];
                float f19 = zlVar4.b[i34];
                int i37 = 0;
                MessageObject.GroupedMessagePosition groupedMessagePosition3 = null;
                int i38 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                while (i37 < i36) {
                    int i39 = (int) (fArr[i35] * f19);
                    i38 -= i39;
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = (MessageObject.GroupedMessagePosition) arrayList2.get(i35);
                    int i40 = i34 == 0 ? 4 : 0;
                    float[] fArr3 = fArr;
                    if (i34 == iArr2.length - 1) {
                        i40 |= 8;
                    }
                    if (i37 == 0) {
                        i40 |= 1;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    if (i37 == i36 - 1) {
                        i40 |= 2;
                        groupedMessagePosition3 = groupedMessagePosition4;
                    }
                    int i41 = i37;
                    groupedMessagePosition4.set(i41, i37, i34, i34, i39, Math.max(dp4, f19 / 814.0f), i40);
                    i35++;
                    i37 = i41 + 1;
                    fArr = fArr3;
                }
                int i42 = i34;
                float[] fArr4 = fArr;
                if (groupedMessagePosition3 != null) {
                    groupedMessagePosition3.pw += i38;
                    groupedMessagePosition3.spanSize += i38;
                }
                i34 = i42 + 1;
                fArr = fArr4;
            }
        } else if (size == 2) {
            MessageObject.GroupedMessagePosition groupedMessagePosition5 = (MessageObject.GroupedMessagePosition) arrayList2.get(0);
            MessageObject.GroupedMessagePosition groupedMessagePosition6 = (MessageObject.GroupedMessagePosition) arrayList2.get(1);
            if (str.equals("ww") && f14 > 1.2285012f * 1.4d) {
                float f20 = groupedMessagePosition5.aspectRatio;
                float f21 = groupedMessagePosition6.aspectRatio;
                if (f20 - f21 < 0.2d) {
                    float round = Math.round(Math.min(1000.0f / f20, Math.min(1000.0f / f21, 407.0f))) / 814.0f;
                    groupedMessagePosition5.set(0, 0, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 7);
                    groupedMessagePosition6.set(0, 0, 1, 1, MediaDataController.MAX_STYLE_RUNS_COUNT, round, 11);
                }
            }
            if (str.equals("ww") || str.equals("qq")) {
                float f22 = 500;
                float round2 = Math.round(Math.min(f22 / groupedMessagePosition5.aspectRatio, Math.min(f22 / groupedMessagePosition6.aspectRatio, 814.0f))) / 814.0f;
                groupedMessagePosition5.set(0, 0, 0, 0, 500, round2, 13);
                groupedMessagePosition6.set(1, 1, 0, 0, 500, round2, 14);
            } else {
                float f23 = groupedMessagePosition5.aspectRatio;
                int max = (int) Math.max(400.0f, Math.round((1000.0f / f23) / ((1.0f / groupedMessagePosition6.aspectRatio) + (1.0f / f23))));
                int i43 = 1000 - max;
                if (i43 < min) {
                    max -= min - i43;
                } else {
                    min = i43;
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
                float f24 = groupedMessagePosition8.aspectRatio;
                float min4 = Math.min(407.0f, Math.round((f24 * 1000.0f) / (groupedMessagePosition9.aspectRatio + f24)));
                int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(groupedMessagePosition9.aspectRatio * min4, groupedMessagePosition8.aspectRatio * r9))));
                float f25 = (groupedMessagePosition7.aspectRatio * 814.0f) + min2;
                int i44 = 1000 - max2;
                groupedMessagePosition7.set(0, 0, 0, 1, Math.round(Math.min(f25, i44)), 1.0f, 13);
                float f26 = (814.0f - min4) / 814.0f;
                groupedMessagePosition8.set(1, 1, 0, 0, max2, f26, 6);
                float f27 = min4 / 814.0f;
                groupedMessagePosition9.set(1, 1, 1, 1, max2, f27, 10);
                groupedMessagePosition9.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition7.siblingHeights = new float[]{f27, f26};
                groupedMessagePosition7.spanSize = i44;
            } else {
                float round3 = Math.round(Math.min(1000.0f / groupedMessagePosition7.aspectRatio, 537.24005f)) / 814.0f;
                groupedMessagePosition7.set(0, 1, 0, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, round3, 7);
                float f28 = 500;
                float min5 = Math.min(814.0f - round3, Math.round(Math.min(f28 / groupedMessagePosition8.aspectRatio, f28 / groupedMessagePosition9.aspectRatio))) / 814.0f;
                float f29 = min5 < dp4 ? dp4 : min5;
                groupedMessagePosition8.set(0, 0, 1, 1, 500, f29, 9);
                groupedMessagePosition9.set(1, 1, 1, 1, 500, f29, 10);
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
                float f30 = min;
                int max3 = (int) Math.max(f30, Math.min(400.0f, groupedMessagePosition11.aspectRatio * round5));
                int max4 = (int) Math.max(Math.max(f30, 330.0f), groupedMessagePosition13.aspectRatio * round5);
                int i45 = (1000 - max3) - max4;
                if (i45 < AndroidUtilities.dp(58.0f)) {
                    int dp5 = AndroidUtilities.dp(58.0f) - i45;
                    i45 = AndroidUtilities.dp(58.0f);
                    int i46 = dp5 / 2;
                    max3 -= i46;
                    max4 -= dp5 - i46;
                }
                int i47 = max3;
                float min6 = Math.min(814.0f - round4, round5) / 814.0f;
                float f31 = min6 < dp4 ? dp4 : min6;
                groupedMessagePosition11.set(0, 0, 1, 1, i47, f31, 9);
                groupedMessagePosition12.set(1, 1, 1, 1, i45, f31, 8);
                groupedMessagePosition13.set(2, 2, 1, 1, max4, f31, 10);
            } else {
                int max5 = Math.max(min, Math.round(814.0f / ((1.0f / groupedMessagePosition13.aspectRatio) + ((1.0f / groupedMessagePosition12.aspectRatio) + (1.0f / groupedMessagePosition11.aspectRatio)))));
                float f32 = dp;
                float f33 = max5;
                float min7 = Math.min(0.33f, Math.max(f32, f33 / groupedMessagePosition11.aspectRatio) / 814.0f);
                float min8 = Math.min(0.33f, Math.max(f32, f33 / groupedMessagePosition12.aspectRatio) / 814.0f);
                float f34 = (1.0f - min7) - min8;
                float f35 = (groupedMessagePosition10.aspectRatio * 814.0f) + min2;
                int i48 = 1000 - max5;
                groupedMessagePosition10.set(0, 0, 0, 2, Math.round(Math.min(f35, i48)), min7 + min8 + f34, 13);
                groupedMessagePosition11.set(1, 1, 0, 0, max5, min7, 6);
                groupedMessagePosition12.set(1, 1, 1, 1, max5, min8, 2);
                groupedMessagePosition12.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition13.set(1, 1, 2, 2, max5, f34, 10);
                groupedMessagePosition13.spanSize = MediaDataController.MAX_STYLE_RUNS_COUNT;
                groupedMessagePosition10.spanSize = i48;
                groupedMessagePosition10.siblingHeights = new float[]{min7, min8, f34};
            }
        }
        int i49 = 0;
        while (i49 < size) {
            MessageObject.GroupedMessagePosition groupedMessagePosition14 = (MessageObject.GroupedMessagePosition) arrayList2.get(i49);
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
            int i50 = (b20 - b19) + 1;
            float[] fArr5 = new float[i50];
            Arrays.fill(fArr5, 0.0f);
            int size3 = arrayList2.size();
            int i51 = 0;
            while (i51 < size3) {
                MessageObject.GroupedMessagePosition groupedMessagePosition15 = (MessageObject.GroupedMessagePosition) arrayList2.get(i51);
                if (groupedMessagePosition15 != groupedMessagePosition14 && groupedMessagePosition15.maxX < b21) {
                    int min9 = Math.min((int) groupedMessagePosition15.maxY, (int) b20) - b19;
                    int max6 = Math.max(groupedMessagePosition15.minY - b19, 0);
                    while (max6 <= min9) {
                        fArr5[max6] = fArr5[max6] + groupedMessagePosition15.pw;
                        max6++;
                        i49 = i49;
                    }
                }
                i51++;
                i49 = i49;
            }
            int i52 = i49;
            float f36 = 0.0f;
            for (int i53 = 0; i53 < i50; i53++) {
                float f37 = fArr5[i53];
                if (f36 < f37) {
                    f36 = f37;
                }
            }
            groupedMessagePosition14.left = f36;
            i49 = i52 + 1;
        }
        for (int i54 = 0; i54 < size; i54++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition16 = (MessageObject.GroupedMessagePosition) arrayList2.get(i54);
            byte b22 = groupedMessagePosition16.minY;
            int i55 = this.d + 1;
            float[] fArr6 = new float[i55];
            Arrays.fill(fArr6, 0.0f);
            int size4 = arrayList2.size();
            for (int i56 = 0; i56 < size4; i56++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition17 = (MessageObject.GroupedMessagePosition) arrayList2.get(i56);
                if (groupedMessagePosition17 != groupedMessagePosition16 && groupedMessagePosition17.maxY < b22) {
                    for (int i57 = groupedMessagePosition17.minX; i57 <= groupedMessagePosition17.maxX; i57++) {
                        fArr6[i57] = fArr6[i57] + groupedMessagePosition17.ph;
                    }
                }
            }
            float f38 = 0.0f;
            for (int i58 = 0; i58 < i55; i58++) {
                float f39 = fArr6[i58];
                if (f38 < f39) {
                    f38 = f39;
                }
            }
            groupedMessagePosition16.top = f38;
        }
        int[] iArr3 = new int[10];
        Arrays.fill(iArr3, 0);
        int size5 = arrayList2.size();
        for (int i59 = 0; i59 < size5; i59++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition18 = (MessageObject.GroupedMessagePosition) arrayList2.get(i59);
            int i60 = groupedMessagePosition18.pw;
            for (int i61 = groupedMessagePosition18.minY; i61 <= groupedMessagePosition18.maxY; i61++) {
                iArr3[i61] = iArr3[i61] + i60;
            }
        }
        int i62 = iArr3[0];
        for (int i63 = 1; i63 < 10; i63++) {
            int i64 = iArr3[i63];
            if (i62 < i64) {
                i62 = i64;
            }
        }
        this.c = i62;
        float[] fArr7 = new float[10];
        Arrays.fill(fArr7, 0.0f);
        int size6 = arrayList2.size();
        for (int i65 = 0; i65 < size6; i65++) {
            MessageObject.GroupedMessagePosition groupedMessagePosition19 = (MessageObject.GroupedMessagePosition) arrayList2.get(i65);
            float f40 = groupedMessagePosition19.ph;
            for (int i66 = groupedMessagePosition19.minX; i66 <= groupedMessagePosition19.maxX; i66++) {
                fArr7[i66] = fArr7[i66] + f40;
            }
        }
        float f41 = fArr7[0];
        for (int i67 = 1; i67 < 10; i67++) {
            float f42 = fArr7[i67];
            if (f41 < f42) {
                f41 = f42;
            }
        }
        this.f = f41;
    }
}
