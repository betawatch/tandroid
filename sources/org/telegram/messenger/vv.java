package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.ToIntFunction;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.xh0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class vv {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.p6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.dc G;
    public Paint H;
    public qz0 I;
    public t80 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public vv P;
    public View Q;
    public nh.h R;
    public int S;
    public int T;
    public org.telegram.ui.Components.t5 U;
    public float V;
    public qu W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final jj b;
    public TL_iv.RichMessage c;
    public boolean d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public Drawable i;
    public final HashMap j;
    public final HashMap k;
    public final ArrayList l;
    public final HashMap m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public Object q;
    public zh0 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final dl0 y;
    public final li.k z;

    public vv(jj jjVar, int i10, vv vvVar) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        this.y = new dl0(null);
        this.z = new li.k(23);
        this.K = new RectF();
        this.b = jjVar;
        this.B = i10;
        this.a = jjVar.I1;
        J(vvVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    public static float K(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000 / Math.max(1.0E-4f, f7);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i10) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            return pageListOrderedItem.num.endsWith(".") ? pageListOrderedItem.num : a1.g.r(new StringBuilder(), pageListOrderedItem.num, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a1.g.p(new StringBuilder(), pageListOrderedItem.value, ".");
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i10 + 1) + ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i10 = -i10;
        }
        sb2.append(i11 + i10);
        sb2.append(".");
        return sb2.toString();
    }

    public static boolean O(int i10, List list) {
        return i10 > 0 && (list.get(i10 - 1) instanceof TL_iv.pageBlockParagraph);
    }

    public static int R(int i10, int i11) {
        return i11 == 0 ? i10 : (i10 & (-16)) | i11;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        while (i10 < arrayList.size() && i10 < arrayList2.size() && arrayList.get(i10) == arrayList2.get(i10)) {
            i10++;
        }
        while (arrayList.size() > i10) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((mu) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i10, int i11, boolean z10) {
        if (i11 <= i10) {
            return;
        }
        SpannableStringBuilder a02 = a0(charSequence.subSequence(i10, i11));
        StringBuilder sb3 = new StringBuilder();
        bi.l4.g(sb3, a02);
        String sb4 = sb3.toString();
        if (sb4.isEmpty()) {
            return;
        }
        sb2.append(z10 ? "<cite>" : "<p>");
        sb2.append(sb4);
        sb2.append(z10 ? "</cite>" : "</p>");
    }

    public static SpannableStringBuilder a0(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (rv rvVar : (rv[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rv.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(rvVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(rvVar);
            if (spanEnd > spanStart) {
                int i10 = rvVar.b;
                int i11 = (i10 & 16) != 0 ? 1 : 0;
                if ((i10 & 32) != 0) {
                    i11 |= 2;
                }
                if ((i10 & 64) != 0) {
                    i11 |= 16;
                }
                if ((i10 & 128) != 0) {
                    i11 |= 8;
                }
                if ((i10 & 256) != 0) {
                    i11 |= 4;
                }
                if ((i10 & 2048) != 0) {
                    i11 |= TLObject.FLAG_14;
                }
                if ((i10 & TLObject.FLAG_12) != 0) {
                    i11 |= 32768;
                }
                if ((i10 & TLObject.FLAG_13) != 0) {
                    i11 |= 65536;
                }
                if (i11 != 0) {
                    yz0 yz0Var = new yz0();
                    yz0Var.a = i11;
                    spannableStringBuilder.setSpan(new zz0(yz0Var, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        while (!arrayList.isEmpty()) {
            sb2.append(((Boolean) i0.a.v(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0570, code lost:
    
        if (r12[r14] > r12[r13]) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bj[] e(float[] fArr) {
        int i10;
        int i11;
        bj[] bjVarArr;
        int i12;
        int i13;
        float f7;
        float f10;
        int length = fArr.length;
        bj[] bjVarArr2 = new bj[length];
        if (length == 0) {
            return bjVarArr2;
        }
        StringBuilder sb2 = new StringBuilder();
        float f11 = 0.0f;
        boolean z10 = false;
        for (int i14 = 0; i14 < length; i14++) {
            float f12 = fArr[i14];
            float f13 = f12 <= 0.0f ? 1.0f : f12;
            bj bjVar = new bj();
            bjVarArr2[i14] = bjVar;
            bjVar.g = f13;
            if (f13 > 1.2f) {
                sb2.append("w");
            } else if (f13 < 0.8f) {
                sb2.append("n");
            } else {
                sb2.append("q");
            }
            f11 += f13;
            if (f13 > 2.0f) {
                z10 = true;
            }
        }
        float f14 = f11 / length;
        int L = i0.L(120.0f);
        float L2 = i0.L(120.0f);
        Point point = i0.q;
        float f15 = 1000;
        int min = (int) (L2 / (Math.min(point.x, point.y) / f15));
        int L3 = (int) (i0.L(40.0f) / (Math.min(point.x, point.y) / f15));
        float f16 = 814.0f;
        float f17 = f15 / 814.0f;
        float L4 = i0.L(100.0f) / 814.0f;
        if (length == 1) {
            bjVarArr2[0].a(Math.round(Math.min(f15 / r0.g, 407.0f)) / 814.0f, 0, 0, 0, 0, 1000, 15);
            return bjVarArr2;
        }
        int i15 = 1;
        float f18 = 1.0f;
        int i16 = 2;
        int i17 = 3;
        if (!z10 && (length == 2 || length == 3 || length == 4)) {
            if (length == 2) {
                bj bjVar2 = bjVarArr2[0];
                bj bjVar3 = bjVarArr2[1];
                String sb3 = sb2.toString();
                if (sb3.equals("ww") && f14 > f17 * 1.4f) {
                    if (bjVar2.g - bjVar3.g < 0.2f) {
                        float round = Math.round(Math.min(f15 / r6, Math.min(f15 / r7, 407.0f))) / 814.0f;
                        bjVar2.a(round, 0, 0, 0, 0, 1000, 7);
                        bjVar3.a(round, 0, 0, 1, 1, 1000, 11);
                        return bjVarArr2;
                    }
                }
                if (sb3.equals("ww") || sb3.equals("qq")) {
                    float f19 = 500;
                    float round2 = Math.round(Math.min(f19 / bjVar2.g, Math.min(f19 / bjVar3.g, 814.0f))) / 814.0f;
                    bjVar2.a(round2, 0, 0, 0, 0, 500, 13);
                    bjVar3.a(round2, 1, 1, 0, 0, 500, 14);
                    return bjVarArr2;
                }
                float f20 = bjVar2.g;
                int max = (int) Math.max(0.4f * f15, Math.round((f15 / f20) / ((1.0f / bjVar3.g) + (1.0f / f20))));
                int i18 = 1000 - max;
                if (i18 < min) {
                    max -= min - i18;
                } else {
                    min = i18;
                }
                float min2 = Math.min(814.0f, Math.round(Math.min(min / bjVar2.g, max / bjVar3.g))) / 814.0f;
                bjVar2.a(min2, 0, 0, 0, 0, min, 13);
                bjVar3.a(min2, 1, 1, 0, 0, max, 14);
                return bjVarArr2;
            }
            if (length == 3) {
                bj bjVar4 = bjVarArr2[0];
                bj bjVar5 = bjVarArr2[1];
                bj bjVar6 = bjVarArr2[2];
                if (sb2.charAt(0) == 'n') {
                    float f21 = bjVar5.g;
                    float min3 = Math.min(407.0f, Math.round((f21 * f15) / (bjVar6.g + f21)));
                    int max2 = (int) Math.max(min, Math.min(f15 * 0.5f, Math.round(Math.min(bjVar6.g * min3, bjVar5.g * r7))));
                    bjVar4.a(1.0f, 0, 0, 0, 1, Math.round(Math.min((bjVar4.g * 814.0f) + L3, 1000 - max2)), 13);
                    bjVar5.a((814.0f - min3) / 814.0f, 1, 1, 0, 0, max2, 6);
                    bjVar6.a(min3 / 814.0f, 1, 1, 1, 1, max2, 10);
                    return bjVarArr2;
                }
                float round3 = Math.round(Math.min(f15 / bjVar4.g, 537.24005f)) / 814.0f;
                bjVar4.a(round3, 0, 1, 0, 0, 1000, 7);
                float f22 = 500;
                float min4 = Math.min(814.0f - round3, Math.round(Math.min(f22 / bjVar5.g, f22 / bjVar6.g))) / 814.0f;
                float f23 = min4 < L4 ? L4 : min4;
                bjVar5.a(f23, 0, 0, 1, 1, 500, 9);
                bjVar6.a(f23, 1, 1, 1, 1, 500, 10);
                return bjVarArr2;
            }
            bj bjVar7 = bjVarArr2[0];
            bj bjVar8 = bjVarArr2[1];
            bj bjVar9 = bjVarArr2[2];
            bj bjVar10 = bjVarArr2[3];
            if (sb2.charAt(0) != 'w') {
                int max3 = Math.max(min, Math.round(814.0f / ((1.0f / bjVar10.g) + ((1.0f / bjVar9.g) + (1.0f / bjVar8.g)))));
                float f24 = L;
                float f25 = max3;
                float min5 = Math.min(0.33f, Math.max(f24, f25 / bjVar8.g) / 814.0f);
                float min6 = Math.min(0.33f, Math.max(f24, f25 / bjVar9.g) / 814.0f);
                float f26 = (1.0f - min5) - min6;
                bjVar7.a(min5 + min6 + f26, 0, 0, 0, 2, Math.round(Math.min((bjVar7.g * 814.0f) + L3, 1000 - max3)), 13);
                bjVar8.a(min5, 1, 1, 0, 0, max3, 6);
                bjVar9.a(min6, 1, 1, 1, 1, max3, 2);
                bjVar10.a(f26, 1, 1, 2, 2, max3, 10);
                return bjVarArr2;
            }
            float round4 = Math.round(Math.min(f15 / bjVar7.g, 537.24005f)) / 814.0f;
            bjVar7.a(round4, 0, 2, 0, 0, 1000, 7);
            float round5 = Math.round(f15 / ((bjVar8.g + bjVar9.g) + bjVar10.g));
            float f27 = min;
            int max4 = (int) Math.max(f27, Math.min(f15 * 0.4f, bjVar8.g * round5));
            int max5 = (int) Math.max(Math.max(f27, f15 * 0.33f), bjVar10.g * round5);
            int i19 = (1000 - max4) - max5;
            if (i19 < i0.L(58.0f)) {
                int L5 = i0.L(58.0f) - i19;
                i19 = i0.L(58.0f);
                int i20 = L5 / 2;
                max4 -= i20;
                max5 -= L5 - i20;
            }
            int i21 = max4;
            float min7 = Math.min(814.0f - round4, round5) / 814.0f;
            float f28 = min7 < L4 ? L4 : min7;
            bjVar8.a(f28, 0, 0, 1, 1, i21, 9);
            bjVar9.a(f28, 1, 1, 1, 1, i19, 8);
            bjVar10.a(f28, 2, 2, 1, 1, max5, 10);
            return bjVarArr2;
        }
        float[] fArr2 = new float[length];
        int i22 = 0;
        while (i22 < length) {
            float f29 = bjVarArr2[i22].g;
            if (f14 > 1.1f) {
                f10 = f18;
                fArr2[i22] = Math.max(f10, f29);
            } else {
                f10 = f18;
                fArr2[i22] = Math.min(f10, f29);
            }
            fArr2[i22] = Math.max(0.66667f, Math.min(1.7f, fArr2[i22]));
            i22++;
            f18 = f10;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i23 = 1;
        while (i23 < length) {
            int i24 = length - i23;
            if (i23 > 3 || i24 > 3) {
                f7 = f16;
            } else {
                arrayList.add(new int[]{i23, i24});
                f7 = f16;
                arrayList2.add(new float[]{K(0, i23, fArr2), K(i23, length, fArr2)});
            }
            i23++;
            f16 = f7;
        }
        float f30 = f16;
        for (int i25 = 1; i25 < length - 1; i25++) {
            int i26 = 1;
            while (true) {
                int i27 = length - i25;
                if (i26 < i27) {
                    int i28 = i27 - i26;
                    if (i25 <= 3) {
                        if (i26 <= (f14 < 0.85f ? 4 : 3) && i28 <= 3) {
                            arrayList.add(new int[]{i25, i26, i28});
                            float K = K(0, i25, fArr2);
                            int i29 = i25 + i26;
                            float K2 = K(i25, i29, fArr2);
                            float K3 = K(i29, length, fArr2);
                            i13 = i16;
                            float[] fArr3 = new float[3];
                            fArr3[0] = K;
                            fArr3[1] = K2;
                            fArr3[i13] = K3;
                            arrayList2.add(fArr3);
                            i26++;
                            i16 = i13;
                        }
                    }
                    i13 = i16;
                    i26++;
                    i16 = i13;
                }
            }
        }
        int i30 = i16;
        for (int i31 = 1; i31 < length - 2; i31++) {
            int i32 = 1;
            while (true) {
                int i33 = length - i31;
                if (i32 < i33) {
                    int i34 = 1;
                    while (true) {
                        int i35 = i33 - i32;
                        if (i34 < i35) {
                            int i36 = i35 - i34;
                            if (i31 > i17 || i32 > i17 || i34 > i17 || i36 > i17) {
                                bjVarArr = bjVarArr2;
                                i12 = i17;
                            } else {
                                arrayList.add(new int[]{i31, i32, i34, i36});
                                float K4 = K(0, i31, fArr2);
                                int i37 = i31 + i32;
                                float K5 = K(i31, i37, fArr2);
                                i12 = i17;
                                int i38 = i37 + i34;
                                float K6 = K(i37, i38, fArr2);
                                float K7 = K(i38, length, fArr2);
                                bjVarArr = bjVarArr2;
                                float[] fArr4 = new float[4];
                                fArr4[0] = K4;
                                fArr4[1] = K5;
                                fArr4[i30] = K6;
                                fArr4[i12] = K7;
                                arrayList2.add(fArr4);
                            }
                            i34++;
                            i17 = i12;
                            bjVarArr2 = bjVarArr;
                        }
                    }
                    i32++;
                }
            }
        }
        bj[] bjVarArr3 = bjVarArr2;
        int i39 = i17;
        float f31 = (f15 / 3.0f) * 4.0f;
        int i40 = -1;
        int i41 = 0;
        float f32 = 0.0f;
        while (i41 < arrayList.size()) {
            float[] fArr5 = (float[]) arrayList2.get(i41);
            int[] iArr = (int[]) arrayList.get(i41);
            float f33 = Float.MAX_VALUE;
            float f34 = 0.0f;
            for (float f35 : fArr5) {
                f34 += f35;
                if (f35 < f33) {
                    f33 = f35;
                }
            }
            float abs = Math.abs(f34 - f31);
            int i42 = i15;
            if (iArr.length > i42) {
                int i43 = iArr[0];
                int i44 = iArr[i42];
                if (i43 <= i44) {
                    i10 = i30;
                    if (iArr.length <= i10 || i44 <= iArr[i10]) {
                        i11 = i39;
                        if (iArr.length > i11) {
                        }
                    }
                } else {
                    i10 = i30;
                }
                i11 = i39;
                abs *= 1.2f;
            } else {
                i10 = i30;
                i11 = i39;
            }
            if (f33 < min) {
                abs *= 1.5f;
            }
            if (i40 == -1 || abs < f32) {
                i40 = i41;
                f32 = abs;
            }
            i41++;
            i39 = i11;
            i30 = i10;
            i15 = 1;
        }
        if (i40 == -1) {
            int i45 = 0;
            while (i45 < length) {
                int i46 = i45;
                bjVarArr3[i45].a(0.4f, 0, 0, i46, i45, 1000, 3);
                i45 = i46 + 1;
            }
            return bjVarArr3;
        }
        int[] iArr2 = (int[]) arrayList.get(i40);
        float[] fArr6 = (float[]) arrayList2.get(i40);
        int i47 = 0;
        int i48 = 0;
        while (i48 < iArr2.length) {
            int i49 = iArr2[i48];
            float f36 = fArr6[i48];
            bj bjVar11 = null;
            int i50 = 1000;
            int i51 = 0;
            while (i51 < i49) {
                int i52 = (int) (fArr2[i47] * f36);
                i50 -= i52;
                bj bjVar12 = bjVarArr3[i47];
                int i53 = i48 == 0 ? 4 : 0;
                if (i48 == iArr2.length - 1) {
                    i53 |= 8;
                }
                if (i51 == 0) {
                    i53 |= 1;
                }
                if (i51 == i49 - 1) {
                    i53 |= 2;
                    bjVar11 = bjVar12;
                }
                int i54 = i51;
                bjVar12.a(Math.max(L4, f36 / f30), i54, i51, i48, i48, i52, i53);
                i47++;
                i51 = i54 + 1;
            }
            int i55 = i48;
            if (bjVar11 != null) {
                bjVar11.e += i50;
                bjVar11.i += i50;
            }
            i48 = i55 + 1;
        }
        return bjVarArr3;
    }

    public static int q(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return 6;
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks)) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 12;
        }
        return pageBlock instanceof TL_iv.pageBlockFooter ? 7 : 0;
    }

    public static String x(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        y(richText, sb2);
        return sb2.toString();
    }

    public static void y(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!bi.s6.j(textdiff.text)) {
                y(textdiff.text, sb2);
                return;
            } else {
                if (bi.s6.j(textdiff.old_text)) {
                    return;
                }
                y(textdiff.old_text, sb2);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                y(richText.texts.get(i10), sb2);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            y(richText2, sb2);
        }
    }

    public static yz0 z(int i10) {
        yz0 yz0Var = new yz0();
        yz0Var.a = i10;
        return yz0Var;
    }

    public final boolean B() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.Sa > 0;
    }

    public final boolean C() {
        org.telegram.ui.Components.k5 k5Var;
        if (F()) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i10);
                if ((u9Var instanceof uv) && (k5Var = ((uv) u9Var).E) != null && !k5Var.a.isEmpty()) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final boolean D() {
        jj jjVar = this.b;
        return (jjVar == null || !jjVar.P2() || jjVar.P3()) ? false : true;
    }

    public final boolean E() {
        jj jjVar = this.b;
        return jjVar != null && jjVar.P3();
    }

    public final boolean F() {
        zh0 zh0Var = this.r;
        return zh0Var == null || !zh0Var.h;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.F2();
    }

    public final boolean H() {
        org.telegram.ui.Cells.u9[] K;
        qu quVar = this.W;
        if (quVar != null && (K = quVar.K()) != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof uv) {
                    uv uvVar = (uv) u9Var;
                    if (uvVar.M != null || uvVar.Q != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean I() {
        TL_iv.RichMessage richMessage = this.c;
        return richMessage != null && richMessage.rtl;
    }

    public final void J(vv vvVar) {
        boolean z10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                qu quVar = (qu) arrayList.get(i10);
                View view2 = quVar.V;
                if (view2 != null && view2 == view) {
                    quVar.U();
                    CheckBoxBase checkBoxBase = quVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    quVar.V = null;
                }
            }
        }
        this.e.clear();
        this.f.clear();
        arrayList.clear();
        this.h.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.q = "";
        this.M = tz.W0;
        this.N = i0.p;
        this.w.setTextSize(i0.L(tz.W0));
        this.x.setTextSize(i0.L(tz.W0));
        this.d = false;
        this.c = null;
        jj jjVar = this.b;
        if (jjVar == null || jjVar.k == null || jjVar.E0() == null) {
            return;
        }
        TL_iv.RichMessage E0 = jjVar.E0();
        this.c = E0;
        this.d = E0.part;
        this.P = vvVar;
        int i11 = 0;
        while (i11 < this.c.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.c.blocks.get(i11);
            qu j10 = j(pageBlock, 0, new Rect(), 0, O(i11, this.c.blocks));
            if ((j10 instanceof kv) && (((z10 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.h4.I(pageBlock))) {
                kv kvVar = (kv) j10;
                kvVar.i0((i11 == 0 && z10) ? 0 : kvVar.Z, i11 == this.c.blocks.size() - 1 ? 0 : kvVar.a0);
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            qu quVar2 = (qu) arrayList.get(i12);
            if ((quVar2 instanceof kv) && quVar2.w > 0) {
                int i13 = i12 + 1;
                ((kv) quVar2).i0(i0.L(i12 > 0 && ((qu) arrayList.get(i12 + (-1))).w > 0 ? 3.0f : 6.0f), i0.L(i13 < arrayList.size() && ((qu) arrayList.get(i13)).w > 0 ? 3.0f : 6.0f));
            }
            i12++;
        }
        this.P = null;
        if (this.r != null) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((qu) arrayList.get(i14)).K = this.r;
            }
            this.r.k(p());
        }
        if (view != null) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((qu) arrayList.get(i15)).m(view);
            }
        }
        Q();
        X();
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i10) {
        return (this.c == richMessage && this.M == tz.W0 && Math.abs(this.N - i0.p) <= 0.1f && i10 == this.B) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M(MotionEvent motionEvent) {
        int i10;
        float f7;
        int actionMasked = motionEvent.getActionMasked();
        boolean Y = Y();
        ArrayList arrayList = this.g;
        if (Y && (arrayList.get(0) instanceof gl0)) {
            i10 = -this.S;
        } else {
            if (D()) {
                f7 = 0.0f;
                if (actionMasked == 0 || (motionEvent.getX() >= f7 && motionEvent.getX() <= this.C + this.T)) {
                    if (this.d) {
                        float x10 = motionEvent.getX();
                        float y3 = motionEvent.getY();
                        RectF rectF = this.K;
                        if (actionMasked == 0) {
                            if (rectF.contains(x10, y3)) {
                                this.L = true;
                                org.telegram.ui.Components.dc dcVar = this.G;
                                if (dcVar != null) {
                                    dcVar.c(true);
                                    return true;
                                }
                                return true;
                            }
                        } else if (this.L) {
                            if (actionMasked == 2) {
                                if (!rectF.contains(x10, y3)) {
                                    org.telegram.ui.Components.dc dcVar2 = this.G;
                                    if (dcVar2 != null) {
                                        dcVar2.c(false);
                                    }
                                    this.L = false;
                                    return true;
                                }
                            } else if (actionMasked == 1 || actionMasked == 3) {
                                org.telegram.ui.Components.dc dcVar3 = this.G;
                                if (dcVar3 != null) {
                                    dcVar3.c(false);
                                }
                                boolean z10 = actionMasked == 1 && rectF.contains(x10, y3);
                                this.L = false;
                                if (z10 && this.F != null && this.E != null) {
                                    View view = this.Q;
                                    if (view != null) {
                                        view.performHapticFeedback(3, 2);
                                    }
                                    this.F.C0(this.E);
                                }
                            }
                            return true;
                        }
                    }
                    if (actionMasked != 0) {
                        this.W = null;
                        float y10 = motionEvent.getY();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            }
                            qu quVar = (qu) arrayList.get(i11);
                            if (quVar.R()) {
                                int H = quVar.H();
                                float f10 = i12;
                                if (y10 < f10 || y10 >= i12 + H) {
                                    i12 += H;
                                } else {
                                    motionEvent.offsetLocation(0.0f, -i12);
                                    boolean e02 = quVar.e0(motionEvent);
                                    motionEvent.offsetLocation(0.0f, f10);
                                    if (e02) {
                                        this.W = quVar;
                                        this.X = i12;
                                        return true;
                                    }
                                }
                            }
                            i11++;
                        }
                    } else if (this.W != null) {
                        motionEvent.offsetLocation(0.0f, -this.X);
                        boolean e03 = this.W.e0(motionEvent);
                        motionEvent.offsetLocation(0.0f, this.X);
                        if (actionMasked != 1 && actionMasked != 3) {
                            return e03;
                        }
                        this.W = null;
                        return e03;
                    }
                }
                return false;
            }
            i10 = this.S;
        }
        f7 = i10;
        if (actionMasked == 0) {
        }
        if (this.d) {
        }
        if (actionMasked != 0) {
        }
        return false;
    }

    public final ArrayList P(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                mu muVar = (mu) obj;
                if (i10 >= muVar.a && i10 <= muVar.b) {
                    arrayList.add(muVar);
                }
            }
            Collections.sort(arrayList, new bk(16));
        }
        return arrayList;
    }

    public final void Q() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        ArrayList arrayList3 = this.o;
        arrayList3.clear();
        ArrayList arrayList4 = this.p;
        arrayList4.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.g;
            if (i10 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((qu) arrayList.get(i10)).J());
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            qu quVar = (qu) arrayList.get(i11);
            if (quVar instanceof jv) {
                jv jvVar = (jv) quVar;
                int i12 = this.C;
                int i13 = jvVar.e0;
                int i14 = jvVar.d0;
                Rect rect = jvVar.b;
                int max = Math.max(i13, Math.min(i14, Math.max(0, (i12 - rect.left) - rect.right)));
                jvVar.f0 = max;
                py0 py0Var = jvVar.X;
                py0Var.setRenderWidth(max);
                jvVar.g0 = py0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            qu quVar2 = (qu) arrayList.get(i16);
            boolean R = quVar2.R();
            quVar2.M = i15;
            quVar2.N = 0;
            quVar2.Q = R;
            Rect rect2 = quVar2.b;
            quVar2.Y(rect2.left, rect2.top + i15, i16);
            if (R) {
                org.telegram.ui.Cells.u9[] K = quVar2.K();
                if (K != null) {
                    for (org.telegram.ui.Cells.u9 u9Var : K) {
                        if (u9Var != null && u9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i16));
                            arrayList2.add(u9Var);
                            CharSequence text = u9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int H = quVar2.H();
                quVar2.N = H;
                i15 += H;
            }
        }
        this.A = i15;
        this.q = sb2;
    }

    public final void S(int i10, int i11) {
        if (this.S == i10 && this.T == i11) {
            return;
        }
        this.S = i10;
        this.T = i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i12 >= arrayList.size()) {
                return;
            }
            qu quVar = (qu) arrayList.get(i12);
            if (quVar instanceof wu) {
                wu wuVar = (wu) quVar;
                uv uvVar = wuVar.X;
                uvVar.c = (i0.L(53.0f) + (wuVar.S - wuVar.a.S)) - uvVar.f;
            }
            i12++;
        }
    }

    public final void T(org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Cells.l1 l1Var) {
        this.E = q1Var;
        this.F = l1Var;
    }

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (!(characterStyle instanceof rv)) {
            spannableStringBuilder.setSpan(characterStyle, i10, i11, 33);
            return;
        }
        int i12 = ((rv) characterStyle).b;
        rv[] rvVarArr = (rv[]) spannableStringBuilder.getSpans(i10, i11, rv.class);
        if (rvVarArr == null || rvVarArr.length <= 0) {
            V(spannableStringBuilder, i10, i11, i12);
            return;
        }
        Arrays.sort(rvVarArr, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.messenger.gu
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return spannableStringBuilder.getSpanStart((rv) obj);
            }
        }));
        for (int i13 = 0; i13 < rvVarArr.length; i13++) {
            int spanStart = spannableStringBuilder.getSpanStart(rvVarArr[i13]);
            int spanEnd = spannableStringBuilder.getSpanEnd(rvVarArr[i13]);
            if (spanStart > i10) {
                V(spannableStringBuilder, i10, spanStart, i12);
            }
            i10 = Math.max(i10, spanEnd);
        }
        if (i10 < i11) {
            V(spannableStringBuilder, i10, i11, i12);
        }
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        while (i10 < i11) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i10, i11, URLSpan.class);
            spannableStringBuilder.setSpan(new rv(this, i12, ((URLSpan[]) spannableStringBuilder.getSpans(i10, nextSpanTransition, URLSpan.class)).length > 0), i10, nextSpanTransition, 33);
            i10 = nextSpanTransition;
        }
    }

    public final void W(zh0 zh0Var) {
        this.r = zh0Var;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((qu) arrayList.get(i10)).K = zh0Var;
            arrayList.get(i10);
            ((qu) arrayList.get(i10)).getClass();
            i10++;
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((qu) arrayList.get(i10)).c0();
            i10++;
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        qu quVar = (qu) arrayList.get(0);
        return (quVar instanceof dv) || (quVar instanceof pv) || (quVar instanceof vu) || (quVar instanceof hv) || (quVar instanceof gl0);
    }

    public final void b(View view) {
        View view2 = this.Q;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.Q = view;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((qu) arrayList.get(i10)).m(view);
            i10++;
        }
    }

    public final void b0(int i10) {
        uv uvVar;
        View view;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i11 >= arrayList.size()) {
                return;
            }
            org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i11);
            if ((u9Var instanceof uv) && (view = (uvVar = (uv) u9Var).S) != null) {
                org.telegram.ui.Components.o5.release(view, uvVar.E);
                uvVar.E = null;
                uvVar.E = org.telegram.ui.Components.o5.update(i10, uvVar.S, uvVar.a.v && !uvVar.w, (org.telegram.ui.Components.k5) null, uvVar.b);
            }
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (A(r11.color) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        this.y.a(this.b, user, chat, this.D, 1);
        jj jjVar = this.b;
        if (jjVar == null || jjVar.P3() || jjVar.O5()) {
            return;
        }
        boolean z10 = true;
        if (jjVar.c1 < 0 && jjVar.e1 == null && (!jjVar.r4() || (peerColor = jjVar.X0) == null || peerColor.color == -1)) {
            TLRPC.Message message = jjVar.k;
            int i10 = this.a;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                long o10 = o5.o(peer);
                z10 = o10 >= 0 ? false : false;
            } else if (o5.C(jj.B0(message)) || jjVar.p3()) {
                if (user != null) {
                }
            } else {
                if (jjVar.n3() && chat != null) {
                    if (chat.signature_profiles) {
                        long Z0 = jjVar.Z0();
                        if (Z0 < 0) {
                        }
                    } else {
                        z10 = A(chat.color);
                    }
                }
            }
        }
        if (z10) {
            return;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        this.y.r(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.D), p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q());
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            nh.h hVar = this.R;
            if (hVar != null) {
                hVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i10 >= arrayList.size()) {
                    break;
                }
                qu quVar = (qu) arrayList.get(i10);
                View view3 = quVar.V;
                if (view3 != null && view3 == view) {
                    quVar.U();
                    CheckBoxBase checkBoxBase = quVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    quVar.V = null;
                }
                i10++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.x1 x1Var) {
        float f7;
        float f10;
        org.telegram.ui.Cells.l1 l1Var;
        S(i10, i11);
        this.w.linkColor = org.telegram.ui.ActionBar.t6.w0(E() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc, this.D);
        boolean z10 = this.d;
        int min = Math.min(this.A, i0.L(900.0f));
        if (z10) {
            canvas.saveLayerAlpha(-i10, 0.0f, this.C + i11, min, zs.e4, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z11 = q1Var != null && q1Var.pc > 0;
        if (z11) {
            float f11 = q1Var.nc - q1Var.t0;
            f10 = q1Var.pc + f11;
            f7 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        h(canvas, x1Var, z11, f7, f10);
        if (z10) {
            RectF rectF = i0.P;
            rectF.set(-i10, min - i0.L(32.0f), this.C + i11, min);
            this.z.o(canvas, rectF, 3, 1.0f);
            canvas.restore();
            int w02 = org.telegram.ui.ActionBar.t6.w0(E() ? org.telegram.ui.ActionBar.t6.Lb : org.telegram.ui.ActionBar.t6.yd, this.D);
            if (this.I == null) {
                this.I = new qz0(cd.L0(2131745357, null), 16.0f, i0.o());
            }
            org.telegram.ui.Components.dc dcVar = this.G;
            if (dcVar == null) {
                this.G = new org.telegram.ui.Components.dc(this.Q, 1.5f, 2.0f);
            } else {
                View view = dcVar.a;
                View view2 = this.Q;
                if (view != view2) {
                    dcVar.a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            float L = i0.L(42.0f);
            float f12 = this.I.c;
            float L2 = ((this.C + this.S) + this.T) - i0.L(24.0f);
            int i12 = this.C;
            float f13 = (((i12 + r12) + this.T) / 2.0f) - this.S;
            float L3 = i0.L(4.0f) + min;
            float f14 = L2 / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f13 - f14, L3, f13 + f14, L + L3);
            org.telegram.ui.Cells.q1 q1Var2 = this.E;
            boolean z12 = (q1Var2 == null || (l1Var = this.F) == null || !l1Var.k1(q1Var2, 7)) ? false : true;
            t80 t80Var = this.J;
            if (t80Var != null && !z12 && !t80Var.c() && !this.J.d()) {
                this.J.a();
            }
            t80 t80Var2 = this.J;
            if (t80Var2 == null && z12) {
                t80 t80Var3 = new t80();
                this.J = t80Var3;
                t80Var3.x.setStrokeWidth(i0.L(1.25f));
                this.J.D = true;
            } else if (t80Var2 != null && z12 && (t80Var2.c() || this.J.d())) {
                t80 t80Var4 = this.J;
                t80Var4.b = -1L;
                t80Var4.c = -1L;
            }
            t80 t80Var5 = this.J;
            if (t80Var5 != null) {
                t80Var5.g(org.telegram.ui.ActionBar.t6.r1(0.1f, w02), org.telegram.ui.ActionBar.t6.r1(0.3f, w02), org.telegram.ui.ActionBar.t6.r1(0.3f, w02), org.telegram.ui.ActionBar.t6.r1(1.2f, w02));
            }
            float a2 = this.G.a(0.075f);
            boolean z13 = a2 != 1.0f;
            if (z13) {
                canvas.save();
                canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, i0.L(8.0f), i0.L(8.0f), this.H);
            t80 t80Var6 = this.J;
            if (t80Var6 != null && !t80Var6.c()) {
                this.J.e(rectF2);
                this.J.k(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f12 / 2.0f), rectF2.centerY(), 1.0f, w02, canvas);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, org.telegram.ui.Cells.x1 x1Var, boolean z10, float f7, float f10) {
        View view;
        float f11;
        float f12;
        Canvas canvas2;
        wu wuVar;
        float f13;
        int i10;
        int i11;
        float f14;
        Canvas canvas3 = canvas;
        float f15 = 0.0f;
        float f16 = 1.0f;
        int i12 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                mu muVar = (mu) arrayList.get(i13);
                int r10 = r(muVar.a, x1Var);
                int i15 = muVar.b;
                ArrayList arrayList2 = this.g;
                float f17 = 4.0f;
                if (i15 < 0 || i15 >= arrayList2.size() || x1Var == null || !(this.s || this.u)) {
                    int i16 = i12;
                    int i17 = i16;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            i11 = this.A;
                            break;
                        }
                        qu quVar = (qu) arrayList2.get(i16);
                        boolean R = quVar.R();
                        float f18 = f17;
                        Rect rect = quVar.b;
                        if (R) {
                            int H = ((x1Var == null || !(this.s || this.u)) ? quVar.H() : i0.W1(Math.max(0.0f, Math.min(f16, x1Var.L1)), quVar.P, quVar.N)) + i17;
                            if (i16 != i15 || rect.bottom <= i0.L(f18)) {
                                f14 = f18;
                                i17 = H;
                            } else {
                                f14 = f18;
                                i17 = m5.B(f14, rect.bottom, H);
                            }
                        } else {
                            f14 = f18;
                        }
                        if (i16 == i15) {
                            i11 = i17;
                            break;
                        }
                        if (R) {
                        }
                        i16++;
                        f17 = f14;
                        f16 = 1.0f;
                    }
                } else {
                    float max = Math.max(f15, Math.min(f16, x1Var.L1));
                    qu quVar2 = (qu) arrayList2.get(i15);
                    int d = i0.a.d(4.0f, quVar2.b.bottom, i12);
                    float f19 = (quVar2.O + quVar2.P) - (quVar2.R ? d : i12);
                    float f20 = quVar2.M + quVar2.N;
                    if (!quVar2.Q) {
                        d = i12;
                    }
                    i11 = Math.round(i0.T1(f19, f20 - d, max));
                }
                int i18 = muVar.b;
                ArrayList arrayList3 = this.g;
                float f21 = 1.0f;
                for (int i19 = muVar.a; i19 < Math.min(i18 + 1, arrayList3.size()); i19++) {
                    qu quVar3 = (qu) arrayList3.get(i19);
                    if (quVar3.R()) {
                        f21 = quVar3.z() * f21;
                    }
                }
                int L = i0.L(3.0f) * muVar.d;
                int i20 = muVar.e + L;
                int i21 = L + muVar.f;
                if (i11 - r10 > i20 + i21) {
                    r10 += i20;
                    i11 -= i21;
                }
                RectF rectF = i0.P;
                rectF.set(muVar.c, r10, this.C - i0.L(muVar.d * 12), i11);
                canvas3.save();
                canvas3.scale(f21, f21, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(tz.Y0 / 3.0f);
                this.y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i13 = i14;
                f15 = 0.0f;
                f16 = 1.0f;
                i12 = 0;
            }
        }
        int i22 = 0;
        while (i22 < this.g.size()) {
            qu quVar4 = (qu) this.g.get(i22);
            if ((quVar4 instanceof fv) && (quVar4.Q || quVar4.R)) {
                fv fvVar = (fv) quVar4;
                int r11 = fvVar.W.r();
                uv uvVar = fvVar.X;
                int max2 = Math.max(r11, uvVar != null ? uvVar.r() : 0);
                if (max2 > 0) {
                    boolean z11 = x1Var != null && (this.s || this.u);
                    float max3 = z11 ? Math.max(0.0f, Math.min(1.0f, x1Var.L1)) : 1.0f;
                    float T1 = z11 ? i0.T1(fvVar.R ? 1.0f : 0.0f, fvVar.Q ? 1.0f : 0.0f, max3) : fvVar.Q ? 1.0f : 0.0f;
                    if (T1 > 0.0f) {
                        float f22 = ((this.C + this.T) - this.S) / 2.0f;
                        float f23 = max2 / 2.0f;
                        float L2 = (f22 - f23) - i0.L(30.0f);
                        float L3 = f22 + f23 + i0.L(30.0f);
                        float T12 = z11 ? i0.T1(fvVar.O, fvVar.M, max3) : fvVar.M;
                        float W1 = z11 ? i0.W1(max3, fvVar.P, fvVar.N) : fvVar.H();
                        float L4 = i0.L(8.0f) + T12;
                        float L5 = (T12 + W1) - i0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = i0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(tz.Y0 / 2.0f);
                            this.y.d(canvas3, rectF2, floor2, floor2, floor2, T1, false, false);
                            if (this.i == null) {
                                this.i = w0.b.getDrawable(R.drawable.mini_quote).mutate();
                            }
                            this.i.setColorFilter(this.y.i(), PorterDuff.Mode.SRC_IN);
                            this.i.setAlpha((int) (T1 * 255.0f));
                            int intrinsicWidth = this.i.getIntrinsicWidth();
                            int intrinsicHeight = this.i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i23 = (int) L2;
                            int i24 = (int) L4;
                            i10 = i22;
                            this.i.setBounds(i0.L(8.0f) + i23, i0.L(7.0f) + i24, m5.C(8.0f, i23, intrinsicWidth), m5.C(7.0f, i24, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i25 = (int) L3;
                            int i26 = (int) L5;
                            this.i.setBounds(m5.z(8.0f, i25, intrinsicWidth), m5.z(7.0f, i26, intrinsicHeight), i25 - i0.L(8.0f), i26 - i0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(zs.e4);
                            i22 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i22;
            i22 = i10 + 1;
        }
        jj jjVar = this.b;
        boolean z12 = this.O || (jjVar != null && vp.r1(this.a).t7.A(jjVar));
        if (z12 || this.U != null) {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.t5(0L, 350L, org.telegram.ui.Components.gr.h);
            }
            float e = this.U.e(false, z12 ? 1.0f : 0.0f);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        } else {
            this.V = 0.0f;
        }
        if (x1Var == null || !(this.s || this.u)) {
            f11 = 1.0f;
            f12 = 1.0f;
        } else {
            f11 = 1.0f;
            f12 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
        }
        this.t = f12;
        if (f12 >= f11) {
            this.s = false;
            this.u = false;
        }
        boolean z13 = this.s;
        boolean z14 = (z13 || this.u) ? false : z10;
        boolean z15 = z13 && f12 < 1.0f;
        if (z15) {
            ArrayList arrayList4 = this.g;
            for (int i27 = 0; i27 < arrayList4.size(); i27++) {
                qu quVar5 = (qu) arrayList4.get(i27);
                if (quVar5 instanceof wu) {
                    wu wuVar2 = (wu) quVar5;
                    wuVar2.d0 = i0.T1(wuVar2.O, wuVar2.M, f12) + wuVar2.H();
                    int i28 = i27 + 1;
                    while (true) {
                        if (i28 >= arrayList4.size()) {
                            f13 = Float.MAX_VALUE;
                            break;
                        }
                        qu quVar6 = (qu) arrayList4.get(i28);
                        do {
                            quVar6 = quVar6.L;
                            if (quVar6 == null) {
                                f13 = i0.T1(((qu) arrayList4.get(i28)).O, ((qu) arrayList4.get(i28)).M, f12);
                                break;
                            }
                        } while (quVar6 != wuVar2);
                        i28++;
                    }
                    wuVar2.e0 = f13;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i29 = 0; i29 < arrayList5.size(); i29++) {
            qu quVar7 = (qu) arrayList5.get(i29);
            if (quVar7 instanceof lv) {
                lv lvVar = (lv) quVar7;
                lvVar.i0 = i0.T1(lvVar.h0 ? 1.0f : 0.0f, lvVar.g0 ? 1.0f : 0.0f, f12);
                lvVar.j0 = i0.W1(f12, lvVar.P, lvVar.N);
            }
        }
        int i30 = 0;
        while (i30 < this.g.size()) {
            qu quVar8 = (qu) this.g.get(i30);
            if (quVar8.Q || quVar8.R) {
                float T13 = i0.T1(quVar8.O, quVar8.M, f12);
                boolean z16 = quVar8 instanceof xu;
                float T14 = z16 ? 1.0f : i0.T1(quVar8.R ? 1.0f : 0.0f, quVar8.Q ? 1.0f : 0.0f, f12);
                if (T14 > 0.0f) {
                    int H2 = quVar8.H();
                    if (!z14 || (H2 + T13 > f7 && T13 < f10)) {
                        canvas3.save();
                        if (z15 && (wuVar = quVar8.L) != null && !z16) {
                            float f24 = -3.4028235E38f;
                            float f25 = Float.MAX_VALUE;
                            for (wuVar = quVar8.L; wuVar != null; wuVar = wuVar.L) {
                                f24 = Math.max(f24, wuVar.d0);
                                f25 = Math.min(f25, wuVar.e0);
                            }
                            if (f25 <= f24) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f24, this.C + this.T, f25);
                            }
                        }
                        canvas3.translate(0.0f, T13);
                        if (T14 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, H2, (int) (T14 * 255.0f), 31);
                            quVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            quVar8.t(canvas2);
                        }
                        canvas2.restore();
                        i30++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i30++;
            canvas3 = canvas2;
        }
        if (f12 >= f11) {
            X();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (!F()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i10 >= arrayList.size()) {
                return;
            }
            qu quVar = (qu) arrayList.get(i10);
            if (quVar.Q) {
                canvas.save();
                canvas.translate(0.0f, quVar.M);
                quVar.s(canvas, colorFilter);
                canvas.restore();
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v67, types: [org.telegram.messenger.kv, org.telegram.messenger.lv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qu j(TL_iv.PageBlock pageBlock, int i10, Rect rect, int i11, boolean z10) {
        int i12;
        TLRPC.Document s10;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        gv gvVar;
        int i13;
        int i14;
        int i15;
        vv vvVar;
        qu quVar;
        boolean z11;
        vv vvVar2 = this;
        int i16 = i11;
        int i17 = rect.left + rect.right;
        int i18 = vvVar2.B;
        if (i17 >= i18) {
            return null;
        }
        boolean z12 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i19 = 0;
        ArrayList arrayList = vvVar2.g;
        if (z12) {
            nv nvVar = new nv(vvVar2, new Rect(), i18, vvVar2.l(pageBlock.text, 0));
            arrayList.add(nvVar);
            return nvVar;
        }
        if (org.telegram.ui.h4.I(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean I = org.telegram.ui.h4.I(pageBlock);
            kv kvVar = new kv(vvVar2, rect, i18, vvVar2.l(pageBlock.text, R(i16, q(pageBlock))));
            if (I) {
                kvVar.i0(i0.L(10.0f), i0.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                kvVar.i0(z10 ? 0 : i0.L(6.0f), i0.L(6.0f));
            }
            kvVar.F = pageBlock instanceof TL_iv.pageBlockHeading1 ? 2131754030 : pageBlock instanceof TL_iv.pageBlockHeading2 ? 2131754029 : pageBlock instanceof TL_iv.pageBlockHeading3 ? 2131754028 : pageBlock instanceof TL_iv.pageBlockHeading4 ? 2131754027 : pageBlock instanceof TL_iv.pageBlockHeading5 ? 2131754026 : pageBlock instanceof TL_iv.pageBlockHeading6 ? 2131754025 : pageBlock instanceof TL_iv.pageBlockFooter ? 2131754032 : 0;
            arrayList.add(kvVar);
            return kvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            vv vvVar3 = vvVar2.P;
            if (vvVar3 != null) {
                ArrayList arrayList2 = vvVar3.g;
                int size = arrayList2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size) {
                        quVar = null;
                        break;
                    }
                    Object obj = arrayList2.get(i20);
                    i20++;
                    qu quVar2 = (qu) obj;
                    if (ev.class.isInstance(quVar2) && (quVar2 instanceof ev)) {
                        String str = ((ev) quVar2).n0;
                        String x10 = x(pageBlock.text);
                        if (str != null && x10 != null) {
                            if (str.length() <= x10.length() && x10.length() > 0) {
                                z11 = x10.startsWith(str);
                                if (!z11) {
                                    quVar = (qu) ev.class.cast(quVar2);
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
            } else {
                quVar = null;
            }
            ev evVar = new ev(vvVar2, rect, vvVar2.B, pageblockpreformatted, (ev) quVar);
            evVar.F = 2131754055;
            arrayList.add(evVar);
            return evVar;
        }
        boolean z13 = pageBlock instanceof TL_iv.pageBlockList;
        TextPaint textPaint = vvVar2.x;
        if (z13) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i21 = i10 + 1;
            textPaint.setTextSize(i0.L(tz.W0));
            int L = i0.L(16.0f);
            for (int i22 = 0; i22 < pageblocklist.items.size(); i22++) {
                L = Math.max(L, pageblocklist.items.get(i22).checkbox ? i0.L(26.0f) : i0.L(16.0f));
            }
            Rect rect2 = new Rect(rect);
            if (vvVar2.I()) {
                rect2.right += L;
            } else {
                rect2.left += L;
            }
            int i23 = 0;
            while (i23 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i23);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    kv kvVar2 = new kv(vvVar2, new Rect(rect2), i18, vvVar2.l(tL_pageListItemText.text, i16));
                    kvVar2.n = L;
                    if (tL_pageListItemText.checkbox) {
                        kvVar2.a0(tL_pageListItemText, tL_pageListItemText.checked);
                    } else {
                        kvVar2.b0("•◦▪".charAt(i10 % 3) + "");
                    }
                    boolean z14 = tL_pageListItemText.checkbox;
                    boolean z15 = tL_pageListItemText.checked;
                    kvVar2.w = i21;
                    kvVar2.x = false;
                    kvVar2.y = z14;
                    kvVar2.D = z15;
                    arrayList.add(kvVar2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        int size2 = arrayList.size();
                        int i24 = 0;
                        boolean z16 = false;
                        while (i24 < tL_pageListItemBlocks.blocks.size()) {
                            int i25 = i24;
                            qu j10 = j(tL_pageListItemBlocks.blocks.get(i24), i21, new Rect(rect2), i16, O(i24, tL_pageListItemBlocks.blocks));
                            int i26 = i21;
                            if (j10 != null && !z16) {
                                j10.n = L;
                                if (tL_pageListItemBlocks.checkbox) {
                                    j10.a0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                } else {
                                    j10.b0("•◦▪".charAt(i10 % 3) + "");
                                }
                                boolean z17 = tL_pageListItemBlocks.checkbox;
                                boolean z18 = tL_pageListItemBlocks.checked;
                                j10.w = i26;
                                j10.x = false;
                                j10.y = z17;
                                j10.D = z18;
                                z16 = true;
                            }
                            i21 = i26;
                            i24 = i25 + 1;
                            vvVar2 = this;
                        }
                        i15 = i21;
                        vvVar = vvVar2;
                        int size3 = arrayList.size();
                        for (int i27 = size2; i27 < size3; i27++) {
                            qu quVar3 = (qu) arrayList.get(i27);
                            if (quVar3.w == 0) {
                                quVar3.w = i15;
                                quVar3.x = false;
                            }
                        }
                        i23++;
                        vvVar2 = vvVar;
                        i21 = i15;
                    }
                }
                i15 = i21;
                vvVar = vvVar2;
                i23++;
                vvVar2 = vvVar;
                i21 = i15;
            }
            return null;
        }
        vv vvVar4 = vvVar2;
        boolean z19 = true;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i28 = i10 + 1;
            textPaint.setTextSize(i0.L(tz.W0));
            new TextPaint(textPaint).setTypeface(i0.o());
            int L2 = i0.L(16.0f);
            for (int i29 = 0; i29 < pageblockorderedlist.items.size(); i29++) {
                L2 = Math.max(L2, i0.L(8.0f) + ((int) Math.ceil(r1.measureText(N(pageblockorderedlist, r12, i29)))) + (pageblockorderedlist.items.get(i29).checkbox ? i0.L(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (vvVar4.I()) {
                rect3.right += L2;
            } else {
                rect3.left += L2;
            }
            int i30 = 0;
            while (i30 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i30);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    kv kvVar3 = new kv(vvVar4, new Rect(rect3), i18, vvVar4.l(tL_pageListOrderedItemText.text, i16));
                    kvVar3.n = L2;
                    kvVar3.b0(N(pageblockorderedlist, tL_pageListOrderedItemText, i30));
                    if (tL_pageListOrderedItemText.checkbox) {
                        kvVar3.a0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                    }
                    boolean z20 = tL_pageListOrderedItemText.checkbox;
                    boolean z21 = tL_pageListOrderedItemText.checked;
                    kvVar3.w = i28;
                    kvVar3.x = z19;
                    kvVar3.y = z20;
                    kvVar3.D = z21;
                    arrayList.add(kvVar3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int i31 = i19;
                        int i32 = i31;
                        while (i31 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            vv vvVar5 = vvVar4;
                            int i33 = i28;
                            int i34 = i31;
                            qu j11 = vvVar5.j(tL_pageListOrderedItemBlocks.blocks.get(i31), i33, new Rect(rect3), i16, O(i31, tL_pageListOrderedItemBlocks.blocks));
                            vvVar4 = vvVar5;
                            i28 = i33;
                            int i35 = i16;
                            if (j11 != null && i32 == 0) {
                                j11.n = L2;
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j11.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                j11.b0(N(pageblockorderedlist, tL_pageListOrderedItemBlocks, i30));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j11.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                boolean z22 = tL_pageListOrderedItemBlocks.checkbox;
                                boolean z23 = tL_pageListOrderedItemBlocks.checked;
                                j11.w = i28;
                                j11.x = true;
                                j11.y = z22;
                                j11.D = z23;
                                i32 = 1;
                            }
                            i31 = i34 + 1;
                            i16 = i35;
                        }
                        i14 = i16;
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            qu quVar4 = (qu) arrayList.get(size5);
                            if (quVar4.w == 0) {
                                quVar4.w = i28;
                                quVar4.x = true;
                            }
                        }
                        i30++;
                        i16 = i14;
                        z19 = true;
                        i19 = 0;
                    }
                }
                i14 = i16;
                i30++;
                i16 = i14;
                z19 = true;
                i19 = 0;
            }
            return null;
        }
        int i36 = i16;
        boolean z24 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        ArrayList arrayList3 = vvVar4.h;
        if (z24) {
            int i37 = rect.left;
            int size6 = arrayList.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder l4 = vvVar4.l(pageBlock.text, R(i36, q(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            SpannableStringBuilder l10 = (richText == null || TextUtils.isEmpty(x(richText))) ? null : vvVar4.l(pageblockblockquote2.caption, R(i36, 11));
            if (pageblockblockquote2.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l4);
                if (l10 != null) {
                    spannableStringBuilder.append('\n');
                    i13 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) l10);
                } else {
                    i13 = -1;
                }
                int i38 = i13;
                ?? lvVar = new lv(vvVar4, new Rect(i0.L(12.0f) + rect.left, i0.L(4.0f) + rect.top, i0.L(20.0f) + rect.right, i0.L(4.0f) + rect.bottom), vvVar4.B, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                lvVar.b0 = i38;
                lvVar.i0(i0.L(8.0f), i0.L(8.0f));
                gvVar = lvVar;
            } else {
                pageblockblockquote = pageblockblockquote2;
                gvVar = new gv(vvVar4, new Rect(i0.L(12.0f) + rect.left, i0.L(12.0f) + rect.top, i0.L(12.0f) + rect.right, i0.L(14.0f) + rect.bottom), vvVar4.B, l4, l10, Layout.Alignment.ALIGN_NORMAL);
            }
            gvVar.F = 2131753996;
            arrayList.add(gvVar);
            arrayList3.add(new mu(size6, arrayList.size() - 1, i37, i10, i0.L(8.0f), pageblockblockquote.collapsed ? i0.L(8.0f) : 0));
            return gvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i39 = rect.left;
            int i40 = i10 + 1;
            int size7 = arrayList.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z25 = (richText2 == null || TextUtils.isEmpty(x(richText2))) ? false : true;
            int i41 = 0;
            while (i41 < pageblockblockquoteblocks.blocks.size()) {
                int i42 = i40;
                j(pageblockblockquoteblocks.blocks.get(i41), i42, new Rect(i0.L(12.0f) + rect.left, rect.top + (i41 == 0 ? i0.L(4.0f) : 0), i0.L(12.0f) + rect.right, rect.bottom + ((!(i41 == pageblockblockquoteblocks.blocks.size() - 1) || z25) ? 0 : i0.L(4.0f))), R(i36, 9), O(i41, pageblockblockquoteblocks.blocks));
                i41++;
                i36 = i36;
                i40 = i42;
            }
            int i43 = i36;
            if (arrayList.size() > size7) {
                ((qu) arrayList.get(size7)).E = 2131753996;
            }
            if (z25) {
                kv kvVar4 = new kv(this, new Rect(i0.L(12.0f) + rect.left, rect.top, i0.L(12.0f) + rect.right, i0.L(6.0f) + rect.bottom), i18, new SpannableStringBuilder(l(pageblockblockquoteblocks.caption, R(i43, 11))));
                kvVar4.b0 = 0;
                kvVar4.i0(i0.L(2.0f), 0);
                arrayList.add(kvVar4);
            }
            arrayList3.add(new mu(size7, arrayList.size() - 1, i39, i10, 0, 0));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder l11 = l(pageBlock.text, R(i36, q(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            fv fvVar = new fv(this, new Rect(i0.L(30.0f) + rect.left, i0.L(16.0f) + rect.top, i0.L(30.0f) + rect.right, i0.L(16.0f) + rect.bottom), this.B, l11, (richText3 == null || TextUtils.isEmpty(x(richText3))) ? null : l(pageblockpullquote.caption, R(i36, 11)), Layout.Alignment.ALIGN_CENTER);
            fvVar.F = 2131753997;
            arrayList.add(fvVar);
            return fvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            su suVar = new su(this, rect, i18, (TL_iv.pageBlockButtonRow) pageBlock);
            suVar.F = 2131754872;
            arrayList.add(suVar);
            return suVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            try {
                jv jvVar = new jv(this, rect, i18, (TL_iv.pageBlockTable) pageBlock);
                jvVar.F = 2131754855;
                arrayList.add(jvVar);
                return jvVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            bv bvVar = new bv(this, rect, i18, (TL_iv.pageBlockMath) pageBlock);
            arrayList.add(bvVar);
            return bvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            yu yuVar = new yu(this, rect, i18);
            arrayList.add(yuVar);
            return yuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            dv dvVar = new dv(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
            arrayList.add(dvVar);
            k(pageblockphoto.caption, rect, i36);
            return dvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            pv pvVar = new pv(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
            arrayList.add(pvVar);
            k(pageblockvideo.caption, rect, i36);
            return pvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            vu vuVar = new vu(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
            arrayList.add(vuVar);
            k(pageblockcollage.caption, rect, i36);
            return vuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            hv hvVar = new hv(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
            arrayList.add(hvVar);
            k(pageblockslideshow.caption, rect, i36);
            return hvVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            av avVar = new av(this, rect, i18, pageblockmap);
            arrayList.add(avVar);
            k(pageblockmap.caption, rect, i36);
            return avVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            HashMap hashMap = this.m;
            if (((jj) hashMap.get(pageblockaudio)) == null && (s10 = s(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i44 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i44;
                tL_message.id = i44;
                jj jjVar = this.b;
                tL_message.realId = jjVar.M1();
                tL_message.dialog_id = jj.B0(jjVar.k);
                TLRPC.Peer peer = jjVar.k.peer_id;
                tL_message.peer_id = peer;
                int i45 = this.a;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = d20.i(i45).e();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = d20.i(i45).e();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = s10;
                tL_message.flags |= 768;
                jj jjVar2 = new jj(i45, tL_message, false, true);
                this.l.add(jjVar2);
                hashMap.put(pageblockaudio, jjVar2);
            }
            ou ouVar = new ou(this, rect, i18, pageblockaudio);
            arrayList.add(ouVar);
            k(pageblockaudio.caption, rect, i36);
            return ouVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            zu zuVar = new zu(this, rect, i18, pageblockdocument);
            arrayList.add(zuVar);
            k(pageblockdocument.caption, rect, i36);
            return zuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return j(((TL_iv.pageBlockCover) pageBlock).cover, i10, rect, i36, false);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str2 = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str2 == null) {
                return null;
            }
            this.j.put(str2.toLowerCase(), Integer.valueOf(arrayList.size()));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            AtomicInteger atomicInteger = gl0.u0;
            if (pageblockembed.html != null && org.telegram.utils.twidget.p.n(pageblockembed.url)) {
                if (org.telegram.utils.twidget.p.n(pageblockembed.url)) {
                    String str3 = pageblockembed.url;
                    int i02 = (gl0.i0() * 2) + i18;
                    org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str3) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str3) : null;
                    if (mVar != null && (i12 = mVar.e) != 0) {
                        i02 = Math.min(i02, i0.L(Math.max(zs.e3, i12)));
                    }
                    i18 = i02 - (gl0.i0() * 2);
                }
                gl0 gl0Var = new gl0(this, rect, i18, pageblockembed, arrayList.isEmpty());
                arrayList.add(gl0Var);
                k(pageblockembed.caption, rect, i36);
                return gl0Var;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int L3 = v7.u7.a(i36, 9) ? i0.L(6.0f) : i10 > 0 ? i0.L(4.0f) : 0;
            ov ovVar = new ov(this, new Rect((rect.left + L3) - i0.L(7.0f), Math.max(i0.L(14.0f), rect.top), (rect.right + L3) - i0.L(7.0f), Math.max(i0.L(14.0f), rect.bottom)), this.B, arrayList.size(), i10);
            this.e.add(ovVar);
            if (i10 == 0) {
                this.f.add(ovVar);
            }
            arrayList.add(ovVar);
            return ovVar;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            boolean z26 = v2.a;
            return null;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        wu wuVar = new wu(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i36 & (-17)));
        arrayList.add(wuVar);
        for (int i46 = 0; i46 < pageblockdetails.blocks.size(); i46++) {
            j(pageblockdetails.blocks.get(i46), i10 + 1, rect, i36, O(i46, pageblockdetails.blocks));
        }
        arrayList.add(new xu(this, new Rect(rect.left, 0, rect.right, 0), i18));
        for (int size8 = arrayList.size(); size8 < arrayList.size(); size8++) {
            qu quVar5 = (qu) arrayList.get(size8);
            if (quVar5.L == null) {
                quVar5.L = wuVar;
            }
        }
        return wuVar;
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i10) {
        if (pageCaption == null) {
            return;
        }
        TL_iv.RichText richText = pageCaption.text;
        boolean z10 = false;
        boolean z11 = (richText == null || (richText instanceof TL_iv.textEmpty)) ? false : true;
        TL_iv.RichText richText2 = pageCaption.credit;
        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
            z10 = true;
        }
        if (z11 || z10) {
            int R = R(i10, 10);
            this.g.add(new uu(this, rect, this.B, z11 ? l(pageCaption.text, R) : null, z10 ? l(pageCaption.credit, R) : null));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i10 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i10, new rv(this, i10, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new nu(richText, i10), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10) {
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j10 = bi.s6.j(textdiff.text);
                    boolean j11 = bi.s6.j(textdiff.old_text);
                    if (j10 && !j11) {
                        n(textdiff.old_text, spannableStringBuilder, i10, new zz0(z(TLObject.FLAG_13), 0));
                    } else if (!j10 && j11) {
                        n(textdiff.text, spannableStringBuilder, i10, new zz0(z(TLObject.FLAG_12), 0));
                    } else if (!j10) {
                        n(textdiff.text, spannableStringBuilder, i10, new gv0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i11 = i10 | 16;
                    n(richText.text, spannableStringBuilder, i11, new rv(this, i11, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i12 = i10 | 32;
                    n(richText.text, spannableStringBuilder, i12, new rv(this, i12, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i13 = i10 | 64;
                    n(richText.text, spannableStringBuilder, i13, new rv(this, i13, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i14 = i10 | 128;
                    n(richText.text, spannableStringBuilder, i14, new rv(this, i14, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i15 = i10 | 256;
                    n(richText.text, spannableStringBuilder, i15, new rv(this, i15, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i10, new g51(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    n(richText.text, spannableStringBuilder, i10, new g51("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i16 = 0; i16 < richText.texts.size(); i16++) {
                        m(richText.texts.get(i16), spannableStringBuilder, i10);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i17 = i10 | 2048;
                    n(richText.text, spannableStringBuilder, i17, new rv(this, i17, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i18 = i10 | TLObject.FLAG_12;
                    n(richText.text, spannableStringBuilder, i18, new rv(this, i18, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i19 = i10 | TLObject.FLAG_13;
                    n(richText.text, spannableStringBuilder, i19, new rv(this, i19, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = af.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = sc.e.h("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i10, new g51(sc.e.h("tel:", d), z(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (textanchor.text instanceof TL_iv.textEmpty) {
                            HashMap hashMap = this.j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.g.size()));
                            }
                        } else {
                            this.k.put(lowerCase, textanchor);
                        }
                    }
                    TL_iv.RichText richText2 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText2, spannableStringBuilder, i10, new zi(2));
                } else if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        bi.u a2 = bi.u.a(textmath.source, i0.L(this.M + 4), true);
                        if (a2 != null) {
                            textmath.w = a2.b;
                            textmath.h = a2.c;
                            textmath.depth = a2.d;
                            textmath.bitmap = a2.a;
                        }
                    }
                    if (textmath.bitmap != null) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append(" ");
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new rz0(null, textmath.bitmap, textmath.w, textmath.h, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.D), textmath.depth), length2, length3, 33);
                        String str3 = textmath.source;
                        if (str3 != null && !str3.isEmpty()) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p9(textmath.source), length2, length3, 33);
                        }
                    }
                } else if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(charSequence);
                    int length5 = spannableStringBuilder.length();
                    boolean a10 = v7.u7.a(i10, 13);
                    int i20 = i10 & 15;
                    if (i20 < 1 || i20 > 6) {
                        size = new org.telegram.ui.Components.o5(textcustomemoji.document_id, a10 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(i0.L(this.M + 4 + (a10 ? -2 : 4)));
                    } else {
                        TextPaint textPaint = new TextPaint(this.w);
                        new rv(this, i10, true).a(textPaint);
                        size = new org.telegram.ui.Components.o5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                    }
                    spannableStringBuilder.setSpan(size, length4, length5, 33);
                } else if (richText instanceof TL_iv.textSpoiler) {
                    n(richText.text, spannableStringBuilder, i10, new zz0(z(256), 0));
                } else if (richText instanceof TL_iv.textMention) {
                    TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                    yz0 yz0Var = new yz0();
                    yz0Var.d = tL_messageEntityMention;
                    n(richText.text, spannableStringBuilder, i10, new e51(x(richText), yz0Var));
                } else if (richText instanceof TL_iv.textHashtag) {
                    TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                    yz0 yz0Var2 = new yz0();
                    yz0Var2.d = tL_messageEntityHashtag;
                    n(richText.text, spannableStringBuilder, i10, new e51(x(richText), yz0Var2));
                } else if (richText instanceof TL_iv.textBotCommand) {
                    n(richText.text, spannableStringBuilder, i10, new b51(x(richText), E() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textCashtag) {
                    TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                    yz0 yz0Var3 = new yz0();
                    yz0Var3.d = tL_messageEntityCashtag;
                    n(richText.text, spannableStringBuilder, i10, new e51(x(richText), yz0Var3));
                } else if (richText instanceof TL_iv.textAutoUrl) {
                    n(richText.text, spannableStringBuilder, i10, new g51(x(richText), z(1024)));
                } else if (richText instanceof TL_iv.textAutoEmail) {
                    n(richText.text, spannableStringBuilder, i10, new g51(sc.e.h("mailto:", x(richText)), z(1024)));
                } else if (richText instanceof TL_iv.textAutoPhone) {
                    String x10 = x(richText);
                    String d10 = af.b.d(x10, false);
                    if (x10.startsWith("+")) {
                        d10 = sc.e.h("+", d10);
                    }
                    n(richText.text, spannableStringBuilder, i10, new g51(sc.e.h("tel:", d10), z(1024)));
                } else if (richText instanceof TL_iv.textTonAddress) {
                    n(richText.text, spannableStringBuilder, i10, new e51(sc.e.h("tonaddress:", x(richText)), (yz0) null));
                } else if (richText instanceof TL_iv.textBankCard) {
                    n(richText.text, spannableStringBuilder, i10, new e51(sc.e.h("card:", x(richText)), (yz0) null));
                } else if (richText instanceof TL_iv.textMentionName) {
                    n(richText.text, spannableStringBuilder, i10, new h51("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textDate) {
                    TL_iv.textDate textdate = (TL_iv.textDate) richText;
                    TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                    tL_messageEntityFormattedDate.relative = textdate.relative;
                    tL_messageEntityFormattedDate.short_time = textdate.short_time;
                    tL_messageEntityFormattedDate.long_time = textdate.long_time;
                    tL_messageEntityFormattedDate.short_date = textdate.short_date;
                    tL_messageEntityFormattedDate.long_date = textdate.long_date;
                    tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                    tL_messageEntityFormattedDate.date = textdate.date;
                    int i21 = i10 | 512;
                    TL_iv.RichText richText3 = richText.text;
                    rv rvVar = new rv(this, i21, false);
                    org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(x(richText), null, tL_messageEntityFormattedDate);
                    int length6 = spannableStringBuilder.length();
                    m(richText3, spannableStringBuilder, i21);
                    if (spannableStringBuilder.length() > length6) {
                        U(rvVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                        U(n00Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                    }
                } else if (richText instanceof TL_iv.textButton) {
                    int length7 = spannableStringBuilder.length();
                    spannableStringBuilder.append("*");
                    tu tuVar = new tu(this, this.B, (TL_iv.textButton) richText, null);
                    tuVar.d = 1.2f;
                    spannableStringBuilder.setSpan(tuVar, length7, spannableStringBuilder.length(), 33);
                }
            }
        }
        IdentityHashMap identityHashMap = this.Y;
        if (identityHashMap == null || richText == null) {
            return;
        }
        identityHashMap.put(richText, new int[]{length, spannableStringBuilder.length()});
    }

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i10);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i10, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i10);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((qu) arrayList.get(i10)).p(arrayList2);
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((xh0) arrayList2.get(i11)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i10, org.telegram.ui.Cells.x1 x1Var) {
        ArrayList arrayList = this.g;
        if (i10 >= 0 && i10 < arrayList.size() && x1Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            qu quVar = (qu) arrayList.get(i10);
            return Math.round(i0.T1(quVar.O, quVar.M, max));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            qu quVar2 = (qu) arrayList.get(i12);
            boolean R = quVar2.R();
            if (i12 == i10) {
                return i11;
            }
            if (R) {
                i11 = ((x1Var == null || !(this.s || this.u)) ? quVar2.H() : i0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), quVar2.P, quVar2.N)) + i11;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j10) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document = arrayList.get(i10);
            i10++;
            TLRPC.Document document2 = document;
            if (document2.id == j10) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        if (!this.d || this.A <= i0.L(900.0f)) {
            return this.A + (this.d ? i0.L(50.0f) : 0);
        }
        return i0.L(950.0f);
    }

    public final int u() {
        return this.B;
    }

    public final TLRPC.Photo v(long j10) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            TLRPC.Photo photo2 = photo;
            if (photo2.id == j10) {
                return photo2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w(int i10, int i11) {
        int min;
        int max;
        int i12;
        qu quVar;
        int i13;
        String str;
        vv vvVar = this;
        ArrayList arrayList = vvVar.n;
        if (arrayList.isEmpty() || (max = Math.max(i10, i11)) <= (min = Math.min(i10, i11))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        int i15 = -1;
        while (i14 < arrayList.size()) {
            Layout a2 = ((org.telegram.ui.Cells.u9) arrayList.get(i14)).a();
            if (a2 == null || a2.getText() == null) {
                i12 = min;
            } else {
                CharSequence text = a2.getText();
                ArrayList arrayList4 = vvVar.o;
                int intValue = i14 < arrayList4.size() ? ((Integer) arrayList4.get(i14)).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    ArrayList arrayList5 = vvVar.p;
                    int intValue2 = i14 < arrayList5.size() ? ((Integer) arrayList5.get(i14)).intValue() : -1;
                    if (intValue2 >= 0) {
                        ArrayList arrayList6 = vvVar.g;
                        if (intValue2 < arrayList6.size()) {
                            quVar = (qu) arrayList6.get(intValue2);
                            String str2 = "";
                            if (quVar instanceof jv) {
                                ArrayList P = vvVar.P(intValue2);
                                if (arrayList2.size() != P.size()) {
                                    i12 = min;
                                } else {
                                    int i16 = 0;
                                    while (i16 < arrayList2.size()) {
                                        i12 = min;
                                        if (arrayList2.get(i16) == P.get(i16)) {
                                            i16++;
                                            min = i12;
                                        }
                                    }
                                    i12 = min;
                                    int i17 = max2 - intValue;
                                    int i18 = min2 - intValue;
                                    int i19 = !(quVar instanceof kv) ? ((kv) quVar).b0 : -1;
                                    boolean z10 = !(quVar instanceof mv) && ((mv) quVar).X == arrayList.get(i14);
                                    i13 = quVar == null ? quVar.w : 0;
                                    if (i13 > 0 || i19 >= 0) {
                                        d(sb2, arrayList3);
                                        if (!(quVar instanceof ev)) {
                                            SpannableStringBuilder a02 = a0(text.subSequence(i17, i18));
                                            String str3 = ((ev) quVar).p0;
                                            StringBuilder sb3 = new StringBuilder();
                                            bi.l4.g(sb3, a02);
                                            String sb4 = sb3.toString();
                                            if (!sb4.isEmpty()) {
                                                StringBuilder sb5 = new StringBuilder();
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb5.append("<pre>");
                                                } else {
                                                    sb5.append("<pre language=\"");
                                                    sb5.append(bi.l4.s(str3));
                                                    sb5.append("\">");
                                                }
                                                str2 = a1.g.r(sb5, sb4, "</pre>");
                                            }
                                            sb2.append(str2);
                                        } else if (z10) {
                                            a(sb2, text, i17, i18, true);
                                        } else if (i19 < 0) {
                                            a(sb2, text, i17, i18, false);
                                        } else {
                                            a(sb2, text, i17, Math.min(i18, i19 > 0 ? i19 - 1 : 0), false);
                                            a(sb2, text, Math.max(i17, i19), i18, true);
                                        }
                                    } else {
                                        boolean z11 = quVar.x;
                                        while (true) {
                                            str = "</ul>";
                                            if (arrayList3.size() <= i13) {
                                                break;
                                            }
                                            if (((Boolean) i0.a.v(1, arrayList3)).booleanValue()) {
                                                str = "</ol>";
                                            }
                                            sb2.append(str);
                                        }
                                        while (arrayList3.size() < i13) {
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        if (!arrayList3.isEmpty() && ((Boolean) i0.a.g(1, arrayList3)).booleanValue() != z11) {
                                            sb2.append(((Boolean) i0.a.v(1, arrayList3)).booleanValue() ? "</ol>" : "</ul>");
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        sb2.append("<li");
                                        if (quVar.y) {
                                            sb2.append(" data-checkbox=\"1\"");
                                            if (quVar.D) {
                                                sb2.append(" data-checked=\"1\"");
                                            }
                                        }
                                        sb2.append('>');
                                        SpannableStringBuilder a03 = a0(text.subSequence(i17, i18));
                                        StringBuilder sb6 = new StringBuilder();
                                        bi.l4.g(sb6, a03);
                                        sb2.append(sb6.toString());
                                        sb2.append("</li>");
                                    }
                                }
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, P);
                                int i172 = max2 - intValue;
                                int i182 = min2 - intValue;
                                if (!(quVar instanceof kv)) {
                                }
                                if (quVar instanceof mv) {
                                }
                                if (quVar == null) {
                                }
                                if (i13 > 0) {
                                }
                                d(sb2, arrayList3);
                                if (!(quVar instanceof ev)) {
                                }
                            } else if (intValue2 != i15) {
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, vvVar.P(intValue2));
                                TL_iv.pageBlockTable pageblocktable = ((jv) quVar).W;
                                if (pageblocktable != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    bi.l4.H(sb7, pageblocktable);
                                    str2 = sb7.toString();
                                }
                                sb2.append(str2);
                                i12 = min;
                                i15 = intValue2;
                            }
                        }
                    }
                    quVar = null;
                    String str22 = "";
                    if (quVar instanceof jv) {
                    }
                }
                i12 = min;
            }
            i14++;
            vvVar = this;
            min = i12;
        }
        d(sb2, arrayList3);
        while (!arrayList2.isEmpty()) {
            sb2.append("</blockquote>");
            arrayList2.remove(arrayList2.size() - 1);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public vv(int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        this.y = new dl0(null);
        this.z = new li.k(23);
        this.K = new RectF();
        this.b = null;
        this.a = i10;
        this.B = i11;
        this.D = p6Var;
        this.M = tz.W0;
        this.N = i0.p;
        textPaint.setTextSize(i0.L(r6));
        textPaint2.setTextSize(i0.L(this.M));
    }
}
