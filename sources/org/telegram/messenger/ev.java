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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.vg0;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ev {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.i6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.mc G;
    public Paint H;
    public vy0 I;
    public o80 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public ev P;
    public View Q;
    public xh.e R;
    public int S;
    public int T;
    public org.telegram.ui.Components.c6 U;
    public float V;
    public zt W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final fj b;
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
    public xg0 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final mk0 y;
    public final h6.m z;

    public ev(fj fjVar, int i7, ev evVar) {
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
        this.y = new mk0(null);
        this.z = new h6.m(29);
        this.K = new RectF();
        this.b = fjVar;
        this.B = i7;
        this.a = fjVar.K1;
        J(evVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    public static float K(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return 1000 / Math.max(1.0E-4f, f10);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i7) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            return pageListOrderedItem.num.endsWith(".") ? pageListOrderedItem.num : a8.p0.s(new StringBuilder(), pageListOrderedItem.num, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a8.p0.n(pageListOrderedItem.value, ".", new StringBuilder());
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i7 + 1) + ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i7 = -i7;
        }
        sb2.append(i10 + i7);
        sb2.append(".");
        return sb2.toString();
    }

    public static boolean O(int i7, List list) {
        return i7 > 0 && (list.get(i7 - 1) instanceof TL_iv.pageBlockParagraph);
    }

    public static int R(int i7, int i10) {
        return i10 == 0 ? i7 : (i7 & (-16)) | i10;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i7 = 0;
        while (i7 < arrayList.size() && i7 < arrayList2.size() && arrayList.get(i7) == arrayList2.get(i7)) {
            i7++;
        }
        while (arrayList.size() > i7) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((vt) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i7, int i10, boolean z10) {
        if (i10 <= i7) {
            return;
        }
        SpannableStringBuilder a02 = a0(charSequence.subSequence(i7, i10));
        StringBuilder sb3 = new StringBuilder();
        oi.a4.g(sb3, a02);
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
        for (av avVar : (av[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), av.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(avVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(avVar);
            if (spanEnd > spanStart) {
                int i7 = avVar.b;
                int i10 = (i7 & 16) != 0 ? 1 : 0;
                if ((i7 & 32) != 0) {
                    i10 |= 2;
                }
                if ((i7 & 64) != 0) {
                    i10 |= 16;
                }
                if ((i7 & 128) != 0) {
                    i10 |= 8;
                }
                if ((i7 & 256) != 0) {
                    i10 |= 4;
                }
                if ((i7 & 2048) != 0) {
                    i10 |= TLObject.FLAG_14;
                }
                if ((i7 & TLObject.FLAG_12) != 0) {
                    i10 |= 32768;
                }
                if ((i7 & TLObject.FLAG_13) != 0) {
                    i10 |= 65536;
                }
                if (i10 != 0) {
                    dz0 dz0Var = new dz0();
                    dz0Var.a = i10;
                    spannableStringBuilder.setSpan(new ez0(dz0Var, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        while (!arrayList.isEmpty()) {
            sb2.append(((Boolean) p5.c.g(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0570, code lost:
    
        if (r12[r14] > r12[r13]) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xi[] e(float[] fArr) {
        int i7;
        int i10;
        xi[] xiVarArr;
        int i11;
        int i12;
        float f10;
        float f11;
        int length = fArr.length;
        xi[] xiVarArr2 = new xi[length];
        if (length == 0) {
            return xiVarArr2;
        }
        StringBuilder sb2 = new StringBuilder();
        float f12 = 0.0f;
        boolean z10 = false;
        for (int i13 = 0; i13 < length; i13++) {
            float f13 = fArr[i13];
            float f14 = f13 <= 0.0f ? 1.0f : f13;
            xi xiVar = new xi();
            xiVarArr2[i13] = xiVar;
            xiVar.g = f14;
            if (f14 > 1.2f) {
                sb2.append("w");
            } else if (f14 < 0.8f) {
                sb2.append("n");
            } else {
                sb2.append("q");
            }
            f12 += f14;
            if (f14 > 2.0f) {
                z10 = true;
            }
        }
        float f15 = f12 / length;
        int L = g0.L(120.0f);
        float L2 = g0.L(120.0f);
        Point point = g0.q;
        float f16 = 1000;
        int min = (int) (L2 / (Math.min(point.x, point.y) / f16));
        int L3 = (int) (g0.L(40.0f) / (Math.min(point.x, point.y) / f16));
        float f17 = 814.0f;
        float f18 = f16 / 814.0f;
        float L4 = g0.L(100.0f) / 814.0f;
        if (length == 1) {
            xiVarArr2[0].a(Math.round(Math.min(f16 / r0.g, 407.0f)) / 814.0f, 0, 0, 0, 0, 1000, 15);
            return xiVarArr2;
        }
        int i14 = 1;
        float f19 = 1.0f;
        int i15 = 2;
        int i16 = 3;
        if (!z10 && (length == 2 || length == 3 || length == 4)) {
            if (length == 2) {
                xi xiVar2 = xiVarArr2[0];
                xi xiVar3 = xiVarArr2[1];
                String sb3 = sb2.toString();
                if (sb3.equals("ww") && f15 > f18 * 1.4f) {
                    if (xiVar2.g - xiVar3.g < 0.2f) {
                        float round = Math.round(Math.min(f16 / r6, Math.min(f16 / r7, 407.0f))) / 814.0f;
                        xiVar2.a(round, 0, 0, 0, 0, 1000, 7);
                        xiVar3.a(round, 0, 0, 1, 1, 1000, 11);
                        return xiVarArr2;
                    }
                }
                if (sb3.equals("ww") || sb3.equals("qq")) {
                    float f20 = 500;
                    float round2 = Math.round(Math.min(f20 / xiVar2.g, Math.min(f20 / xiVar3.g, 814.0f))) / 814.0f;
                    xiVar2.a(round2, 0, 0, 0, 0, 500, 13);
                    xiVar3.a(round2, 1, 1, 0, 0, 500, 14);
                    return xiVarArr2;
                }
                float f21 = xiVar2.g;
                int max = (int) Math.max(0.4f * f16, Math.round((f16 / f21) / ((1.0f / xiVar3.g) + (1.0f / f21))));
                int i17 = 1000 - max;
                if (i17 < min) {
                    max -= min - i17;
                } else {
                    min = i17;
                }
                float min2 = Math.min(814.0f, Math.round(Math.min(min / xiVar2.g, max / xiVar3.g))) / 814.0f;
                xiVar2.a(min2, 0, 0, 0, 0, min, 13);
                xiVar3.a(min2, 1, 1, 0, 0, max, 14);
                return xiVarArr2;
            }
            if (length == 3) {
                xi xiVar4 = xiVarArr2[0];
                xi xiVar5 = xiVarArr2[1];
                xi xiVar6 = xiVarArr2[2];
                if (sb2.charAt(0) == 'n') {
                    float f22 = xiVar5.g;
                    float min3 = Math.min(407.0f, Math.round((f22 * f16) / (xiVar6.g + f22)));
                    int max2 = (int) Math.max(min, Math.min(f16 * 0.5f, Math.round(Math.min(xiVar6.g * min3, xiVar5.g * r7))));
                    xiVar4.a(1.0f, 0, 0, 0, 1, Math.round(Math.min((xiVar4.g * 814.0f) + L3, 1000 - max2)), 13);
                    xiVar5.a((814.0f - min3) / 814.0f, 1, 1, 0, 0, max2, 6);
                    xiVar6.a(min3 / 814.0f, 1, 1, 1, 1, max2, 10);
                    return xiVarArr2;
                }
                float round3 = Math.round(Math.min(f16 / xiVar4.g, 537.24005f)) / 814.0f;
                xiVar4.a(round3, 0, 1, 0, 0, 1000, 7);
                float f23 = 500;
                float min4 = Math.min(814.0f - round3, Math.round(Math.min(f23 / xiVar5.g, f23 / xiVar6.g))) / 814.0f;
                float f24 = min4 < L4 ? L4 : min4;
                xiVar5.a(f24, 0, 0, 1, 1, 500, 9);
                xiVar6.a(f24, 1, 1, 1, 1, 500, 10);
                return xiVarArr2;
            }
            xi xiVar7 = xiVarArr2[0];
            xi xiVar8 = xiVarArr2[1];
            xi xiVar9 = xiVarArr2[2];
            xi xiVar10 = xiVarArr2[3];
            if (sb2.charAt(0) != 'w') {
                int max3 = Math.max(min, Math.round(814.0f / ((1.0f / xiVar10.g) + ((1.0f / xiVar9.g) + (1.0f / xiVar8.g)))));
                float f25 = L;
                float f26 = max3;
                float min5 = Math.min(0.33f, Math.max(f25, f26 / xiVar8.g) / 814.0f);
                float min6 = Math.min(0.33f, Math.max(f25, f26 / xiVar9.g) / 814.0f);
                float f27 = (1.0f - min5) - min6;
                xiVar7.a(min5 + min6 + f27, 0, 0, 0, 2, Math.round(Math.min((xiVar7.g * 814.0f) + L3, 1000 - max3)), 13);
                xiVar8.a(min5, 1, 1, 0, 0, max3, 6);
                xiVar9.a(min6, 1, 1, 1, 1, max3, 2);
                xiVar10.a(f27, 1, 1, 2, 2, max3, 10);
                return xiVarArr2;
            }
            float round4 = Math.round(Math.min(f16 / xiVar7.g, 537.24005f)) / 814.0f;
            xiVar7.a(round4, 0, 2, 0, 0, 1000, 7);
            float round5 = Math.round(f16 / ((xiVar8.g + xiVar9.g) + xiVar10.g));
            float f28 = min;
            int max4 = (int) Math.max(f28, Math.min(f16 * 0.4f, xiVar8.g * round5));
            int max5 = (int) Math.max(Math.max(f28, f16 * 0.33f), xiVar10.g * round5);
            int i18 = (1000 - max4) - max5;
            if (i18 < g0.L(58.0f)) {
                int L5 = g0.L(58.0f) - i18;
                i18 = g0.L(58.0f);
                int i19 = L5 / 2;
                max4 -= i19;
                max5 -= L5 - i19;
            }
            int i20 = max4;
            float min7 = Math.min(814.0f - round4, round5) / 814.0f;
            float f29 = min7 < L4 ? L4 : min7;
            xiVar8.a(f29, 0, 0, 1, 1, i20, 9);
            xiVar9.a(f29, 1, 1, 1, 1, i18, 8);
            xiVar10.a(f29, 2, 2, 1, 1, max5, 10);
            return xiVarArr2;
        }
        float[] fArr2 = new float[length];
        int i21 = 0;
        while (i21 < length) {
            float f30 = xiVarArr2[i21].g;
            if (f15 > 1.1f) {
                f11 = f19;
                fArr2[i21] = Math.max(f11, f30);
            } else {
                f11 = f19;
                fArr2[i21] = Math.min(f11, f30);
            }
            fArr2[i21] = Math.max(0.66667f, Math.min(1.7f, fArr2[i21]));
            i21++;
            f19 = f11;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i22 = 1;
        while (i22 < length) {
            int i23 = length - i22;
            if (i22 > 3 || i23 > 3) {
                f10 = f17;
            } else {
                arrayList.add(new int[]{i22, i23});
                f10 = f17;
                arrayList2.add(new float[]{K(0, i22, fArr2), K(i22, length, fArr2)});
            }
            i22++;
            f17 = f10;
        }
        float f31 = f17;
        for (int i24 = 1; i24 < length - 1; i24++) {
            int i25 = 1;
            while (true) {
                int i26 = length - i24;
                if (i25 < i26) {
                    int i27 = i26 - i25;
                    if (i24 <= 3) {
                        if (i25 <= (f15 < 0.85f ? 4 : 3) && i27 <= 3) {
                            arrayList.add(new int[]{i24, i25, i27});
                            float K = K(0, i24, fArr2);
                            int i28 = i24 + i25;
                            float K2 = K(i24, i28, fArr2);
                            float K3 = K(i28, length, fArr2);
                            i12 = i15;
                            float[] fArr3 = new float[3];
                            fArr3[0] = K;
                            fArr3[1] = K2;
                            fArr3[i12] = K3;
                            arrayList2.add(fArr3);
                            i25++;
                            i15 = i12;
                        }
                    }
                    i12 = i15;
                    i25++;
                    i15 = i12;
                }
            }
        }
        int i29 = i15;
        for (int i30 = 1; i30 < length - 2; i30++) {
            int i31 = 1;
            while (true) {
                int i32 = length - i30;
                if (i31 < i32) {
                    int i33 = 1;
                    while (true) {
                        int i34 = i32 - i31;
                        if (i33 < i34) {
                            int i35 = i34 - i33;
                            if (i30 > i16 || i31 > i16 || i33 > i16 || i35 > i16) {
                                xiVarArr = xiVarArr2;
                                i11 = i16;
                            } else {
                                arrayList.add(new int[]{i30, i31, i33, i35});
                                float K4 = K(0, i30, fArr2);
                                int i36 = i30 + i31;
                                float K5 = K(i30, i36, fArr2);
                                i11 = i16;
                                int i37 = i36 + i33;
                                float K6 = K(i36, i37, fArr2);
                                float K7 = K(i37, length, fArr2);
                                xiVarArr = xiVarArr2;
                                float[] fArr4 = new float[4];
                                fArr4[0] = K4;
                                fArr4[1] = K5;
                                fArr4[i29] = K6;
                                fArr4[i11] = K7;
                                arrayList2.add(fArr4);
                            }
                            i33++;
                            i16 = i11;
                            xiVarArr2 = xiVarArr;
                        }
                    }
                    i31++;
                }
            }
        }
        xi[] xiVarArr3 = xiVarArr2;
        int i38 = i16;
        float f32 = (f16 / 3.0f) * 4.0f;
        int i39 = -1;
        int i40 = 0;
        float f33 = 0.0f;
        while (i40 < arrayList.size()) {
            float[] fArr5 = (float[]) arrayList2.get(i40);
            int[] iArr = (int[]) arrayList.get(i40);
            float f34 = Float.MAX_VALUE;
            float f35 = 0.0f;
            for (float f36 : fArr5) {
                f35 += f36;
                if (f36 < f34) {
                    f34 = f36;
                }
            }
            float abs = Math.abs(f35 - f32);
            int i41 = i14;
            if (iArr.length > i41) {
                int i42 = iArr[0];
                int i43 = iArr[i41];
                if (i42 <= i43) {
                    i7 = i29;
                    if (iArr.length <= i7 || i43 <= iArr[i7]) {
                        i10 = i38;
                        if (iArr.length > i10) {
                        }
                    }
                } else {
                    i7 = i29;
                }
                i10 = i38;
                abs *= 1.2f;
            } else {
                i7 = i29;
                i10 = i38;
            }
            if (f34 < min) {
                abs *= 1.5f;
            }
            if (i39 == -1 || abs < f33) {
                i39 = i40;
                f33 = abs;
            }
            i40++;
            i38 = i10;
            i29 = i7;
            i14 = 1;
        }
        if (i39 == -1) {
            int i44 = 0;
            while (i44 < length) {
                int i45 = i44;
                xiVarArr3[i44].a(0.4f, 0, 0, i45, i44, 1000, 3);
                i44 = i45 + 1;
            }
            return xiVarArr3;
        }
        int[] iArr2 = (int[]) arrayList.get(i39);
        float[] fArr6 = (float[]) arrayList2.get(i39);
        int i46 = 0;
        int i47 = 0;
        while (i47 < iArr2.length) {
            int i48 = iArr2[i47];
            float f37 = fArr6[i47];
            xi xiVar11 = null;
            int i49 = 1000;
            int i50 = 0;
            while (i50 < i48) {
                int i51 = (int) (fArr2[i46] * f37);
                i49 -= i51;
                xi xiVar12 = xiVarArr3[i46];
                int i52 = i47 == 0 ? 4 : 0;
                if (i47 == iArr2.length - 1) {
                    i52 |= 8;
                }
                if (i50 == 0) {
                    i52 |= 1;
                }
                if (i50 == i48 - 1) {
                    i52 |= 2;
                    xiVar11 = xiVar12;
                }
                int i53 = i50;
                xiVar12.a(Math.max(L4, f37 / f31), i53, i50, i47, i47, i51, i52);
                i46++;
                i50 = i53 + 1;
            }
            int i54 = i47;
            if (xiVar11 != null) {
                xiVar11.e += i49;
                xiVar11.i += i49;
            }
            i47 = i54 + 1;
        }
        return xiVarArr3;
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
            if (!oi.b6.j(textdiff.text)) {
                y(textdiff.text, sb2);
                return;
            } else {
                if (oi.b6.j(textdiff.old_text)) {
                    return;
                }
                y(textdiff.old_text, sb2);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                y(richText.texts.get(i7), sb2);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            y(richText2, sb2);
        }
    }

    public static dz0 z(int i7) {
        dz0 dz0Var = new dz0();
        dz0Var.a = i7;
        return dz0Var;
    }

    public final boolean B() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.Ua > 0;
    }

    public final boolean C() {
        org.telegram.ui.Components.t5 t5Var;
        if (F()) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i7 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i7);
                if ((t9Var instanceof dv) && (t5Var = ((dv) t9Var).F) != null && !t5Var.a.isEmpty()) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    public final boolean D() {
        fj fjVar = this.b;
        return (fjVar == null || !fjVar.P2() || fjVar.P3()) ? false : true;
    }

    public final boolean E() {
        fj fjVar = this.b;
        return fjVar != null && fjVar.P3();
    }

    public final boolean F() {
        xg0 xg0Var = this.r;
        return xg0Var == null || !xg0Var.h;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.L2();
    }

    public final boolean H() {
        org.telegram.ui.Cells.t9[] L;
        zt ztVar = this.W;
        if (ztVar != null && (L = ztVar.L()) != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof dv) {
                    dv dvVar = (dv) t9Var;
                    if (dvVar.N != null || dvVar.R != null) {
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

    public final void J(ev evVar) {
        boolean z10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                zt ztVar = (zt) arrayList.get(i7);
                View view2 = ztVar.W;
                if (view2 != null && view2 == view) {
                    ztVar.V();
                    CheckBoxBase checkBoxBase = ztVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    ztVar.W = null;
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
        this.M = bz.W0;
        this.N = g0.p;
        this.w.setTextSize(g0.L(bz.W0));
        this.x.setTextSize(g0.L(bz.W0));
        this.d = false;
        this.c = null;
        fj fjVar = this.b;
        if (fjVar == null || fjVar.k == null || fjVar.E0() == null) {
            return;
        }
        TL_iv.RichMessage E0 = fjVar.E0();
        this.c = E0;
        this.d = E0.part;
        this.P = evVar;
        int i10 = 0;
        while (i10 < this.c.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.c.blocks.get(i10);
            zt j3 = j(pageBlock, 0, new Rect(), 0, O(i10, this.c.blocks));
            if ((j3 instanceof tu) && (((z10 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.g4.I(pageBlock))) {
                tu tuVar = (tu) j3;
                tuVar.j0((i10 == 0 && z10) ? 0 : tuVar.a0, i10 == this.c.blocks.size() - 1 ? 0 : tuVar.b0);
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            zt ztVar2 = (zt) arrayList.get(i11);
            if ((ztVar2 instanceof tu) && ztVar2.w > 0) {
                int i12 = i11 + 1;
                ((tu) ztVar2).j0(g0.L(i11 > 0 && ((zt) arrayList.get(i11 + (-1))).w > 0 ? 3.0f : 6.0f), g0.L(i12 < arrayList.size() && ((zt) arrayList.get(i12)).w > 0 ? 3.0f : 6.0f));
            }
            i11++;
        }
        this.P = null;
        if (this.r != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((zt) arrayList.get(i13)).L = this.r;
            }
            this.r.k(p());
        }
        if (view != null) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((zt) arrayList.get(i14)).m(view);
            }
        }
        Q();
        X();
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i7) {
        return (this.c == richMessage && this.M == bz.W0 && Math.abs(this.N - g0.p) <= 0.1f && i7 == this.B) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M(MotionEvent motionEvent) {
        int i7;
        float f10;
        int actionMasked = motionEvent.getActionMasked();
        boolean Y = Y();
        ArrayList arrayList = this.g;
        if (Y && (arrayList.get(0) instanceof pk0)) {
            i7 = -this.S;
        } else {
            if (D()) {
                f10 = 0.0f;
                if (actionMasked == 0 || (motionEvent.getX() >= f10 && motionEvent.getX() <= this.C + this.T)) {
                    if (this.d) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        RectF rectF = this.K;
                        if (actionMasked == 0) {
                            if (rectF.contains(x10, y10)) {
                                this.L = true;
                                org.telegram.ui.Components.mc mcVar = this.G;
                                if (mcVar != null) {
                                    mcVar.c(true);
                                    return true;
                                }
                                return true;
                            }
                        } else if (this.L) {
                            if (actionMasked == 2) {
                                if (!rectF.contains(x10, y10)) {
                                    org.telegram.ui.Components.mc mcVar2 = this.G;
                                    if (mcVar2 != null) {
                                        mcVar2.c(false);
                                    }
                                    this.L = false;
                                    return true;
                                }
                            } else if (actionMasked == 1 || actionMasked == 3) {
                                org.telegram.ui.Components.mc mcVar3 = this.G;
                                if (mcVar3 != null) {
                                    mcVar3.c(false);
                                }
                                boolean z10 = actionMasked == 1 && rectF.contains(x10, y10);
                                this.L = false;
                                if (z10 && this.F != null && this.E != null) {
                                    View view = this.Q;
                                    if (view != null) {
                                        view.performHapticFeedback(3, 2);
                                    }
                                    this.F.F0(this.E);
                                }
                            }
                            return true;
                        }
                    }
                    if (actionMasked != 0) {
                        this.W = null;
                        float y11 = motionEvent.getY();
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            zt ztVar = (zt) arrayList.get(i10);
                            if (ztVar.S()) {
                                int I = ztVar.I();
                                float f11 = i11;
                                if (y11 < f11 || y11 >= i11 + I) {
                                    i11 += I;
                                } else {
                                    motionEvent.offsetLocation(0.0f, -i11);
                                    boolean f02 = ztVar.f0(motionEvent);
                                    motionEvent.offsetLocation(0.0f, f11);
                                    if (f02) {
                                        this.W = ztVar;
                                        this.X = i11;
                                        return true;
                                    }
                                }
                            }
                            i10++;
                        }
                    } else if (this.W != null) {
                        motionEvent.offsetLocation(0.0f, -this.X);
                        boolean f03 = this.W.f0(motionEvent);
                        motionEvent.offsetLocation(0.0f, this.X);
                        if (actionMasked != 1 && actionMasked != 3) {
                            return f03;
                        }
                        this.W = null;
                        return f03;
                    }
                }
                return false;
            }
            i7 = this.S;
        }
        f10 = i7;
        if (actionMasked == 0) {
        }
        if (this.d) {
        }
        if (actionMasked != 0) {
        }
        return false;
    }

    public final ArrayList P(int i7) {
        ArrayList arrayList = new ArrayList();
        if (i7 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                vt vtVar = (vt) obj;
                if (i7 >= vtVar.a && i7 <= vtVar.b) {
                    arrayList.add(vtVar);
                }
            }
            Collections.sort(arrayList, new dl(13));
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
        int i7 = 0;
        while (true) {
            arrayList = this.g;
            if (i7 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((zt) arrayList.get(i7)).K());
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zt ztVar = (zt) arrayList.get(i10);
            if (ztVar instanceof su) {
                su suVar = (su) ztVar;
                int i11 = this.C;
                int i12 = suVar.f0;
                int i13 = suVar.e0;
                Rect rect = suVar.b;
                int max = Math.max(i12, Math.min(i13, Math.max(0, (i11 - rect.left) - rect.right)));
                suVar.g0 = max;
                wx0 wx0Var = suVar.Y;
                wx0Var.setRenderWidth(max);
                suVar.h0 = wx0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zt ztVar2 = (zt) arrayList.get(i15);
            boolean S = ztVar2.S();
            ztVar2.N = i14;
            ztVar2.O = 0;
            ztVar2.R = S;
            Rect rect2 = ztVar2.b;
            ztVar2.Z(rect2.left, rect2.top + i14, i15);
            if (S) {
                org.telegram.ui.Cells.t9[] L = ztVar2.L();
                if (L != null) {
                    for (org.telegram.ui.Cells.t9 t9Var : L) {
                        if (t9Var != null && t9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i15));
                            arrayList2.add(t9Var);
                            CharSequence text = t9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int I = ztVar2.I();
                ztVar2.O = I;
                i14 += I;
            }
        }
        this.A = i14;
        this.q = sb2;
    }

    public final void S(int i7, int i10) {
        if (this.S == i7 && this.T == i10) {
            return;
        }
        this.S = i7;
        this.T = i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i11 >= arrayList.size()) {
                return;
            }
            zt ztVar = (zt) arrayList.get(i11);
            if (ztVar instanceof fu) {
                fu fuVar = (fu) ztVar;
                dv dvVar = fuVar.Y;
                dvVar.c = (g0.L(53.0f) + (fuVar.T - fuVar.a.S)) - dvVar.f;
            }
            i11++;
        }
    }

    public final void T(org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Cells.l1 l1Var) {
        this.E = q1Var;
        this.F = l1Var;
    }

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i7, int i10) {
        if (!(characterStyle instanceof av)) {
            spannableStringBuilder.setSpan(characterStyle, i7, i10, 33);
            return;
        }
        int i11 = ((av) characterStyle).b;
        av[] avVarArr = (av[]) spannableStringBuilder.getSpans(i7, i10, av.class);
        if (avVarArr == null || avVarArr.length <= 0) {
            V(spannableStringBuilder, i7, i10, i11);
            return;
        }
        Arrays.sort(avVarArr, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.messenger.pt
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return spannableStringBuilder.getSpanStart((av) obj);
            }
        }));
        for (int i12 = 0; i12 < avVarArr.length; i12++) {
            int spanStart = spannableStringBuilder.getSpanStart(avVarArr[i12]);
            int spanEnd = spannableStringBuilder.getSpanEnd(avVarArr[i12]);
            if (spanStart > i7) {
                V(spannableStringBuilder, i7, spanStart, i11);
            }
            i7 = Math.max(i7, spanEnd);
        }
        if (i7 < i10) {
            V(spannableStringBuilder, i7, i10, i11);
        }
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11) {
        while (i7 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i7, i10, URLSpan.class);
            spannableStringBuilder.setSpan(new av(this, i11, ((URLSpan[]) spannableStringBuilder.getSpans(i7, nextSpanTransition, URLSpan.class)).length > 0), i7, nextSpanTransition, 33);
            i7 = nextSpanTransition;
        }
    }

    public final void W(xg0 xg0Var) {
        this.r = xg0Var;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((zt) arrayList.get(i7)).L = xg0Var;
            arrayList.get(i7);
            ((zt) arrayList.get(i7)).getClass();
            i7++;
        }
    }

    public final void X() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((zt) arrayList.get(i7)).d0();
            i7++;
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        zt ztVar = (zt) arrayList.get(0);
        return (ztVar instanceof mu) || (ztVar instanceof yu) || (ztVar instanceof eu) || (ztVar instanceof qu) || (ztVar instanceof pk0);
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((zt) arrayList.get(i7)).m(view);
            i7++;
        }
    }

    public final void b0(int i7) {
        dv dvVar;
        View view;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i10);
            if ((t9Var instanceof dv) && (view = (dvVar = (dv) t9Var).T) != null) {
                org.telegram.ui.Components.x5.release(view, dvVar.F);
                dvVar.F = null;
                dvVar.F = org.telegram.ui.Components.x5.update(i7, dvVar.T, dvVar.a.v && !dvVar.w, (org.telegram.ui.Components.t5) null, dvVar.b);
            }
            i10++;
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
        fj fjVar = this.b;
        if (fjVar == null || fjVar.P3() || fjVar.P5()) {
            return;
        }
        boolean z10 = true;
        if (fjVar.e1 < 0 && fjVar.g1 == null && (!fjVar.r4() || (peerColor = fjVar.Z0) == null || peerColor.color == -1)) {
            TLRPC.Message message = fjVar.k;
            int i7 = this.a;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                long o4 = n5.o(peer);
                z10 = o4 >= 0 ? false : false;
            } else if (n5.C(fj.B0(message)) || fjVar.p3()) {
                if (user != null) {
                }
            } else {
                if (fjVar.n3() && chat != null) {
                    if (chat.signature_profiles) {
                        long Z0 = fjVar.Z0();
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
        org.telegram.ui.ActionBar.i6 i6Var = this.D;
        this.y.r(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.D), i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q());
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            xh.e eVar = this.R;
            if (eVar != null) {
                eVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i7 >= arrayList.size()) {
                    break;
                }
                zt ztVar = (zt) arrayList.get(i7);
                View view3 = ztVar.W;
                if (view3 != null && view3 == view) {
                    ztVar.V();
                    CheckBoxBase checkBoxBase = ztVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    ztVar.W = null;
                }
                i7++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i7, int i10, org.telegram.ui.Cells.x1 x1Var) {
        float f10;
        float f11;
        org.telegram.ui.Cells.l1 l1Var;
        S(i7, i10);
        this.w.linkColor = org.telegram.ui.ActionBar.n6.w0(E() ? org.telegram.ui.ActionBar.n6.Yc : org.telegram.ui.ActionBar.n6.Xc, this.D);
        boolean z10 = this.d;
        int min = Math.min(this.A, g0.L(900.0f));
        if (z10) {
            canvas.saveLayerAlpha(-i7, 0.0f, this.C + i10, min, ks.e4, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z11 = q1Var != null && q1Var.sc > 0;
        if (z11) {
            float f12 = q1Var.qc - q1Var.u0;
            f11 = q1Var.sc + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        h(canvas, x1Var, z11, f10, f11);
        if (z10) {
            RectF rectF = g0.P;
            rectF.set(-i7, min - g0.L(32.0f), this.C + i10, min);
            this.z.n(canvas, rectF, 3, 1.0f);
            canvas.restore();
            int w02 = org.telegram.ui.ActionBar.n6.w0(E() ? org.telegram.ui.ActionBar.n6.Ob : org.telegram.ui.ActionBar.n6.Bd, this.D);
            if (this.I == null) {
                this.I = new vy0(gd.M0(2131745144, null), 16.0f, g0.o());
            }
            org.telegram.ui.Components.mc mcVar = this.G;
            if (mcVar == null) {
                this.G = new org.telegram.ui.Components.mc(this.Q, 1.5f, 2.0f);
            } else {
                View view = mcVar.a;
                View view2 = this.Q;
                if (view != view2) {
                    mcVar.a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
            float L = g0.L(42.0f);
            float f13 = this.I.c;
            float L2 = ((this.C + this.S) + this.T) - g0.L(24.0f);
            int i11 = this.C;
            float f14 = (((i11 + r12) + this.T) / 2.0f) - this.S;
            float L3 = g0.L(4.0f) + min;
            float f15 = L2 / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f14 - f15, L3, f14 + f15, L + L3);
            org.telegram.ui.Cells.q1 q1Var2 = this.E;
            boolean z12 = (q1Var2 == null || (l1Var = this.F) == null || !l1Var.z1(q1Var2, 7)) ? false : true;
            o80 o80Var = this.J;
            if (o80Var != null && !z12 && !o80Var.c() && !this.J.d()) {
                this.J.a();
            }
            o80 o80Var2 = this.J;
            if (o80Var2 == null && z12) {
                o80 o80Var3 = new o80();
                this.J = o80Var3;
                o80Var3.x.setStrokeWidth(g0.L(1.25f));
                this.J.D = true;
            } else if (o80Var2 != null && z12 && (o80Var2.c() || this.J.d())) {
                o80 o80Var4 = this.J;
                o80Var4.b = -1L;
                o80Var4.c = -1L;
            }
            o80 o80Var5 = this.J;
            if (o80Var5 != null) {
                o80Var5.g(org.telegram.ui.ActionBar.n6.r1(0.1f, w02), org.telegram.ui.ActionBar.n6.r1(0.3f, w02), org.telegram.ui.ActionBar.n6.r1(0.3f, w02), org.telegram.ui.ActionBar.n6.r1(1.2f, w02));
            }
            float a10 = this.G.a(0.075f);
            boolean z13 = a10 != 1.0f;
            if (z13) {
                canvas.save();
                canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, g0.L(8.0f), g0.L(8.0f), this.H);
            o80 o80Var6 = this.J;
            if (o80Var6 != null && !o80Var6.c()) {
                this.J.e(rectF2);
                this.J.k(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f13 / 2.0f), rectF2.centerY(), 1.0f, w02, canvas);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, org.telegram.ui.Cells.x1 x1Var, boolean z10, float f10, float f11) {
        View view;
        float f12;
        float f13;
        Canvas canvas2;
        fu fuVar;
        float f14;
        int i7;
        int i10;
        float f15;
        Canvas canvas3 = canvas;
        float f16 = 0.0f;
        float f17 = 1.0f;
        int i11 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                vt vtVar = (vt) arrayList.get(i12);
                int r10 = r(vtVar.a, x1Var);
                int i14 = vtVar.b;
                ArrayList arrayList2 = this.g;
                float f18 = 4.0f;
                if (i14 < 0 || i14 >= arrayList2.size() || x1Var == null || !(this.s || this.u)) {
                    int i15 = i11;
                    int i16 = i15;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            i10 = this.A;
                            break;
                        }
                        zt ztVar = (zt) arrayList2.get(i15);
                        boolean S = ztVar.S();
                        float f19 = f18;
                        Rect rect = ztVar.b;
                        if (S) {
                            int I = ((x1Var == null || !(this.s || this.u)) ? ztVar.I() : g0.W1(Math.max(0.0f, Math.min(f17, x1Var.L1)), ztVar.Q, ztVar.O)) + i16;
                            if (i15 != i14 || rect.bottom <= g0.L(f19)) {
                                f15 = f19;
                                i16 = I;
                            } else {
                                f15 = f19;
                                i16 = f3.B(f15, rect.bottom, I);
                            }
                        } else {
                            f15 = f19;
                        }
                        if (i15 == i14) {
                            i10 = i16;
                            break;
                        }
                        if (S) {
                        }
                        i15++;
                        f18 = f15;
                        f17 = 1.0f;
                    }
                } else {
                    float max = Math.max(f16, Math.min(f17, x1Var.L1));
                    zt ztVar2 = (zt) arrayList2.get(i14);
                    int d = i5.c.d(4.0f, ztVar2.b.bottom, i11);
                    float f20 = (ztVar2.P + ztVar2.Q) - (ztVar2.S ? d : i11);
                    float f21 = ztVar2.N + ztVar2.O;
                    if (!ztVar2.R) {
                        d = i11;
                    }
                    i10 = Math.round(g0.T1(f20, f21 - d, max));
                }
                int i17 = vtVar.b;
                ArrayList arrayList3 = this.g;
                float f22 = 1.0f;
                for (int i18 = vtVar.a; i18 < Math.min(i17 + 1, arrayList3.size()); i18++) {
                    zt ztVar3 = (zt) arrayList3.get(i18);
                    if (ztVar3.S()) {
                        f22 = ztVar3.z() * f22;
                    }
                }
                int L = g0.L(3.0f) * vtVar.d;
                int i19 = vtVar.e + L;
                int i20 = L + vtVar.f;
                if (i10 - r10 > i19 + i20) {
                    r10 += i19;
                    i10 -= i20;
                }
                RectF rectF = g0.P;
                rectF.set(vtVar.c, r10, this.C - g0.L(vtVar.d * 12), i10);
                canvas3.save();
                canvas3.scale(f22, f22, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(bz.Y0 / 3.0f);
                this.y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i12 = i13;
                f16 = 0.0f;
                f17 = 1.0f;
                i11 = 0;
            }
        }
        int i21 = 0;
        while (i21 < this.g.size()) {
            zt ztVar4 = (zt) this.g.get(i21);
            if ((ztVar4 instanceof ou) && (ztVar4.R || ztVar4.S)) {
                ou ouVar = (ou) ztVar4;
                int r11 = ouVar.X.r();
                dv dvVar = ouVar.Y;
                int max2 = Math.max(r11, dvVar != null ? dvVar.r() : 0);
                if (max2 > 0) {
                    boolean z11 = x1Var != null && (this.s || this.u);
                    float max3 = z11 ? Math.max(0.0f, Math.min(1.0f, x1Var.L1)) : 1.0f;
                    float T1 = z11 ? g0.T1(ouVar.S ? 1.0f : 0.0f, ouVar.R ? 1.0f : 0.0f, max3) : ouVar.R ? 1.0f : 0.0f;
                    if (T1 > 0.0f) {
                        float f23 = ((this.C + this.T) - this.S) / 2.0f;
                        float f24 = max2 / 2.0f;
                        float L2 = (f23 - f24) - g0.L(30.0f);
                        float L3 = f23 + f24 + g0.L(30.0f);
                        float T12 = z11 ? g0.T1(ouVar.P, ouVar.N, max3) : ouVar.N;
                        float W1 = z11 ? g0.W1(max3, ouVar.Q, ouVar.O) : ouVar.I();
                        float L4 = g0.L(8.0f) + T12;
                        float L5 = (T12 + W1) - g0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = g0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(bz.Y0 / 2.0f);
                            this.y.d(canvas3, rectF2, floor2, floor2, floor2, T1, false, false);
                            if (this.i == null) {
                                this.i = t0.b.getDrawable(R.drawable.mini_quote).mutate();
                            }
                            this.i.setColorFilter(this.y.i(), PorterDuff.Mode.SRC_IN);
                            this.i.setAlpha((int) (T1 * 255.0f));
                            int intrinsicWidth = this.i.getIntrinsicWidth();
                            int intrinsicHeight = this.i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i22 = (int) L2;
                            int i23 = (int) L4;
                            i7 = i21;
                            this.i.setBounds(g0.L(8.0f) + i22, g0.L(7.0f) + i23, f3.C(8.0f, i22, intrinsicWidth), f3.C(7.0f, i23, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i24 = (int) L3;
                            int i25 = (int) L5;
                            this.i.setBounds(f3.z(8.0f, i24, intrinsicWidth), f3.z(7.0f, i25, intrinsicHeight), i24 - g0.L(8.0f), i25 - g0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(ks.e4);
                            i21 = i7 + 1;
                        }
                    }
                }
            }
            i7 = i21;
            i21 = i7 + 1;
        }
        fj fjVar = this.b;
        boolean z12 = this.O || (fjVar != null && mp.u1(this.a).v7.A(fjVar));
        if (z12 || this.U != null) {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.c6(0L, 350L, org.telegram.ui.Components.lr.h);
            }
            float e10 = this.U.e(false, z12 ? 1.0f : 0.0f);
            this.V = e10;
            if (e10 > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        } else {
            this.V = 0.0f;
        }
        if (x1Var == null || !(this.s || this.u)) {
            f12 = 1.0f;
            f13 = 1.0f;
        } else {
            f12 = 1.0f;
            f13 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
        }
        this.t = f13;
        if (f13 >= f12) {
            this.s = false;
            this.u = false;
        }
        boolean z13 = this.s;
        boolean z14 = (z13 || this.u) ? false : z10;
        boolean z15 = z13 && f13 < 1.0f;
        if (z15) {
            ArrayList arrayList4 = this.g;
            for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                zt ztVar5 = (zt) arrayList4.get(i26);
                if (ztVar5 instanceof fu) {
                    fu fuVar2 = (fu) ztVar5;
                    fuVar2.e0 = g0.T1(fuVar2.P, fuVar2.N, f13) + fuVar2.I();
                    int i27 = i26 + 1;
                    while (true) {
                        if (i27 >= arrayList4.size()) {
                            f14 = Float.MAX_VALUE;
                            break;
                        }
                        zt ztVar6 = (zt) arrayList4.get(i27);
                        do {
                            ztVar6 = ztVar6.M;
                            if (ztVar6 == null) {
                                f14 = g0.T1(((zt) arrayList4.get(i27)).P, ((zt) arrayList4.get(i27)).N, f13);
                                break;
                            }
                        } while (ztVar6 != fuVar2);
                        i27++;
                    }
                    fuVar2.f0 = f14;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i28 = 0; i28 < arrayList5.size(); i28++) {
            zt ztVar7 = (zt) arrayList5.get(i28);
            if (ztVar7 instanceof uu) {
                uu uuVar = (uu) ztVar7;
                uuVar.j0 = g0.T1(uuVar.i0 ? 1.0f : 0.0f, uuVar.h0 ? 1.0f : 0.0f, f13);
                uuVar.k0 = g0.W1(f13, uuVar.Q, uuVar.O);
            }
        }
        int i29 = 0;
        while (i29 < this.g.size()) {
            zt ztVar8 = (zt) this.g.get(i29);
            if (ztVar8.R || ztVar8.S) {
                float T13 = g0.T1(ztVar8.P, ztVar8.N, f13);
                boolean z16 = ztVar8 instanceof gu;
                float T14 = z16 ? 1.0f : g0.T1(ztVar8.S ? 1.0f : 0.0f, ztVar8.R ? 1.0f : 0.0f, f13);
                if (T14 > 0.0f) {
                    int I2 = ztVar8.I();
                    if (!z14 || (I2 + T13 > f10 && T13 < f11)) {
                        canvas3.save();
                        if (z15 && (fuVar = ztVar8.M) != null && !z16) {
                            float f25 = -3.4028235E38f;
                            float f26 = Float.MAX_VALUE;
                            for (fuVar = ztVar8.M; fuVar != null; fuVar = fuVar.M) {
                                f25 = Math.max(f25, fuVar.e0);
                                f26 = Math.min(f26, fuVar.f0);
                            }
                            if (f26 <= f25) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f25, this.C + this.T, f26);
                            }
                        }
                        canvas3.translate(0.0f, T13);
                        if (T14 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, I2, (int) (T14 * 255.0f), 31);
                            ztVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            ztVar8.t(canvas2);
                        }
                        canvas2.restore();
                        i29++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i29++;
            canvas3 = canvas2;
        }
        if (f13 >= f12) {
            X();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (!F()) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i7 >= arrayList.size()) {
                return;
            }
            zt ztVar = (zt) arrayList.get(i7);
            if (ztVar.R) {
                canvas.save();
                canvas.translate(0.0f, ztVar.N);
                ztVar.s(canvas, colorFilter);
                canvas.restore();
            }
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v67, types: [org.telegram.messenger.tu, org.telegram.messenger.uu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zt j(TL_iv.PageBlock pageBlock, int i7, Rect rect, int i10, boolean z10) {
        int i11;
        TLRPC.Document s5;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        pu puVar;
        int i12;
        int i13;
        int i14;
        ev evVar;
        zt ztVar;
        boolean z11;
        ev evVar2 = this;
        int i15 = i10;
        int i16 = rect.left + rect.right;
        int i17 = evVar2.B;
        if (i16 >= i17) {
            return null;
        }
        boolean z12 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i18 = 0;
        ArrayList arrayList = evVar2.g;
        if (z12) {
            wu wuVar = new wu(evVar2, new Rect(), i17, evVar2.l(pageBlock.text, 0));
            arrayList.add(wuVar);
            return wuVar;
        }
        if (org.telegram.ui.g4.I(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean I = org.telegram.ui.g4.I(pageBlock);
            tu tuVar = new tu(evVar2, rect, i17, evVar2.l(pageBlock.text, R(i15, q(pageBlock))));
            if (I) {
                tuVar.j0(g0.L(10.0f), g0.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                tuVar.j0(z10 ? 0 : g0.L(6.0f), g0.L(6.0f));
            }
            tuVar.G = pageBlock instanceof TL_iv.pageBlockHeading1 ? 2131754028 : pageBlock instanceof TL_iv.pageBlockHeading2 ? 2131754027 : pageBlock instanceof TL_iv.pageBlockHeading3 ? 2131754026 : pageBlock instanceof TL_iv.pageBlockHeading4 ? 2131754025 : pageBlock instanceof TL_iv.pageBlockHeading5 ? 2131754024 : pageBlock instanceof TL_iv.pageBlockHeading6 ? 2131754023 : pageBlock instanceof TL_iv.pageBlockFooter ? 2131754030 : 0;
            arrayList.add(tuVar);
            return tuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            ev evVar3 = evVar2.P;
            if (evVar3 != null) {
                ArrayList arrayList2 = evVar3.g;
                int size = arrayList2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size) {
                        ztVar = null;
                        break;
                    }
                    Object obj = arrayList2.get(i19);
                    i19++;
                    zt ztVar2 = (zt) obj;
                    if (nu.class.isInstance(ztVar2) && (ztVar2 instanceof nu)) {
                        String str = ((nu) ztVar2).o0;
                        String x10 = x(pageBlock.text);
                        if (str != null && x10 != null) {
                            if (str.length() <= x10.length() && x10.length() > 0) {
                                z11 = x10.startsWith(str);
                                if (!z11) {
                                    ztVar = (zt) nu.class.cast(ztVar2);
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
                ztVar = null;
            }
            nu nuVar = new nu(evVar2, rect, evVar2.B, pageblockpreformatted, (nu) ztVar);
            nuVar.G = 2131754053;
            arrayList.add(nuVar);
            return nuVar;
        }
        boolean z13 = pageBlock instanceof TL_iv.pageBlockList;
        TextPaint textPaint = evVar2.x;
        if (z13) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i20 = i7 + 1;
            textPaint.setTextSize(g0.L(bz.W0));
            int L = g0.L(16.0f);
            for (int i21 = 0; i21 < pageblocklist.items.size(); i21++) {
                L = Math.max(L, pageblocklist.items.get(i21).checkbox ? g0.L(26.0f) : g0.L(16.0f));
            }
            Rect rect2 = new Rect(rect);
            if (evVar2.I()) {
                rect2.right += L;
            } else {
                rect2.left += L;
            }
            int i22 = 0;
            while (i22 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i22);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    tu tuVar2 = new tu(evVar2, new Rect(rect2), i17, evVar2.l(tL_pageListItemText.text, i15));
                    tuVar2.n = L;
                    if (tL_pageListItemText.checkbox) {
                        tuVar2.b0(tL_pageListItemText, tL_pageListItemText.checked);
                    } else {
                        tuVar2.c0("•◦▪".charAt(i7 % 3) + "");
                    }
                    boolean z14 = tL_pageListItemText.checkbox;
                    boolean z15 = tL_pageListItemText.checked;
                    tuVar2.w = i20;
                    tuVar2.x = false;
                    tuVar2.y = z14;
                    tuVar2.E = z15;
                    arrayList.add(tuVar2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        int size2 = arrayList.size();
                        int i23 = 0;
                        boolean z16 = false;
                        while (i23 < tL_pageListItemBlocks.blocks.size()) {
                            int i24 = i23;
                            zt j3 = j(tL_pageListItemBlocks.blocks.get(i23), i20, new Rect(rect2), i15, O(i23, tL_pageListItemBlocks.blocks));
                            int i25 = i20;
                            if (j3 != null && !z16) {
                                j3.n = L;
                                if (tL_pageListItemBlocks.checkbox) {
                                    j3.b0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                } else {
                                    j3.c0("•◦▪".charAt(i7 % 3) + "");
                                }
                                boolean z17 = tL_pageListItemBlocks.checkbox;
                                boolean z18 = tL_pageListItemBlocks.checked;
                                j3.w = i25;
                                j3.x = false;
                                j3.y = z17;
                                j3.E = z18;
                                z16 = true;
                            }
                            i20 = i25;
                            i23 = i24 + 1;
                            evVar2 = this;
                        }
                        i14 = i20;
                        evVar = evVar2;
                        int size3 = arrayList.size();
                        for (int i26 = size2; i26 < size3; i26++) {
                            zt ztVar3 = (zt) arrayList.get(i26);
                            if (ztVar3.w == 0) {
                                ztVar3.w = i14;
                                ztVar3.x = false;
                            }
                        }
                        i22++;
                        evVar2 = evVar;
                        i20 = i14;
                    }
                }
                i14 = i20;
                evVar = evVar2;
                i22++;
                evVar2 = evVar;
                i20 = i14;
            }
            return null;
        }
        ev evVar4 = evVar2;
        boolean z19 = true;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i27 = i7 + 1;
            textPaint.setTextSize(g0.L(bz.W0));
            new TextPaint(textPaint).setTypeface(g0.o());
            int L2 = g0.L(16.0f);
            for (int i28 = 0; i28 < pageblockorderedlist.items.size(); i28++) {
                L2 = Math.max(L2, g0.L(8.0f) + ((int) Math.ceil(r1.measureText(N(pageblockorderedlist, r12, i28)))) + (pageblockorderedlist.items.get(i28).checkbox ? g0.L(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (evVar4.I()) {
                rect3.right += L2;
            } else {
                rect3.left += L2;
            }
            int i29 = 0;
            while (i29 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i29);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    tu tuVar3 = new tu(evVar4, new Rect(rect3), i17, evVar4.l(tL_pageListOrderedItemText.text, i15));
                    tuVar3.n = L2;
                    tuVar3.c0(N(pageblockorderedlist, tL_pageListOrderedItemText, i29));
                    if (tL_pageListOrderedItemText.checkbox) {
                        tuVar3.b0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                    }
                    boolean z20 = tL_pageListOrderedItemText.checkbox;
                    boolean z21 = tL_pageListOrderedItemText.checked;
                    tuVar3.w = i27;
                    tuVar3.x = z19;
                    tuVar3.y = z20;
                    tuVar3.E = z21;
                    arrayList.add(tuVar3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int i30 = i18;
                        int i31 = i30;
                        while (i30 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            ev evVar5 = evVar4;
                            int i32 = i27;
                            int i33 = i30;
                            zt j10 = evVar5.j(tL_pageListOrderedItemBlocks.blocks.get(i30), i32, new Rect(rect3), i15, O(i30, tL_pageListOrderedItemBlocks.blocks));
                            evVar4 = evVar5;
                            i27 = i32;
                            int i34 = i15;
                            if (j10 != null && i31 == 0) {
                                j10.n = L2;
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j10.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                j10.c0(N(pageblockorderedlist, tL_pageListOrderedItemBlocks, i29));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j10.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                boolean z22 = tL_pageListOrderedItemBlocks.checkbox;
                                boolean z23 = tL_pageListOrderedItemBlocks.checked;
                                j10.w = i27;
                                j10.x = true;
                                j10.y = z22;
                                j10.E = z23;
                                i31 = 1;
                            }
                            i30 = i33 + 1;
                            i15 = i34;
                        }
                        i13 = i15;
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            zt ztVar4 = (zt) arrayList.get(size5);
                            if (ztVar4.w == 0) {
                                ztVar4.w = i27;
                                ztVar4.x = true;
                            }
                        }
                        i29++;
                        i15 = i13;
                        z19 = true;
                        i18 = 0;
                    }
                }
                i13 = i15;
                i29++;
                i15 = i13;
                z19 = true;
                i18 = 0;
            }
            return null;
        }
        int i35 = i15;
        boolean z24 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        ArrayList arrayList3 = evVar4.h;
        if (z24) {
            int i36 = rect.left;
            int size6 = arrayList.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder l10 = evVar4.l(pageBlock.text, R(i35, q(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            SpannableStringBuilder l11 = (richText == null || TextUtils.isEmpty(x(richText))) ? null : evVar4.l(pageblockblockquote2.caption, R(i35, 11));
            if (pageblockblockquote2.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l10);
                if (l11 != null) {
                    spannableStringBuilder.append('\n');
                    i12 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) l11);
                } else {
                    i12 = -1;
                }
                int i37 = i12;
                ?? uuVar = new uu(evVar4, new Rect(g0.L(12.0f) + rect.left, g0.L(4.0f) + rect.top, g0.L(20.0f) + rect.right, g0.L(4.0f) + rect.bottom), evVar4.B, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                uuVar.c0 = i37;
                uuVar.j0(g0.L(8.0f), g0.L(8.0f));
                puVar = uuVar;
            } else {
                pageblockblockquote = pageblockblockquote2;
                puVar = new pu(evVar4, new Rect(g0.L(12.0f) + rect.left, g0.L(12.0f) + rect.top, g0.L(12.0f) + rect.right, g0.L(14.0f) + rect.bottom), evVar4.B, l10, l11, Layout.Alignment.ALIGN_NORMAL);
            }
            puVar.G = 2131753994;
            arrayList.add(puVar);
            arrayList3.add(new vt(size6, arrayList.size() - 1, i36, i7, g0.L(8.0f), pageblockblockquote.collapsed ? g0.L(8.0f) : 0));
            return puVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i38 = rect.left;
            int i39 = i7 + 1;
            int size7 = arrayList.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z25 = (richText2 == null || TextUtils.isEmpty(x(richText2))) ? false : true;
            int i40 = 0;
            while (i40 < pageblockblockquoteblocks.blocks.size()) {
                int i41 = i39;
                j(pageblockblockquoteblocks.blocks.get(i40), i41, new Rect(g0.L(12.0f) + rect.left, rect.top + (i40 == 0 ? g0.L(4.0f) : 0), g0.L(12.0f) + rect.right, rect.bottom + ((!(i40 == pageblockblockquoteblocks.blocks.size() - 1) || z25) ? 0 : g0.L(4.0f))), R(i35, 9), O(i40, pageblockblockquoteblocks.blocks));
                i40++;
                i35 = i35;
                i39 = i41;
            }
            int i42 = i35;
            if (arrayList.size() > size7) {
                ((zt) arrayList.get(size7)).F = 2131753994;
            }
            if (z25) {
                tu tuVar4 = new tu(this, new Rect(g0.L(12.0f) + rect.left, rect.top, g0.L(12.0f) + rect.right, g0.L(6.0f) + rect.bottom), i17, new SpannableStringBuilder(l(pageblockblockquoteblocks.caption, R(i42, 11))));
                tuVar4.c0 = 0;
                tuVar4.j0(g0.L(2.0f), 0);
                arrayList.add(tuVar4);
            }
            arrayList3.add(new vt(size7, arrayList.size() - 1, i38, i7, 0, 0));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder l12 = l(pageBlock.text, R(i35, q(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            ou ouVar = new ou(this, new Rect(g0.L(30.0f) + rect.left, g0.L(16.0f) + rect.top, g0.L(30.0f) + rect.right, g0.L(16.0f) + rect.bottom), this.B, l12, (richText3 == null || TextUtils.isEmpty(x(richText3))) ? null : l(pageblockpullquote.caption, R(i35, 11)), Layout.Alignment.ALIGN_CENTER);
            ouVar.G = 2131753995;
            arrayList.add(ouVar);
            return ouVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            bu buVar = new bu(this, rect, i17, (TL_iv.pageBlockButtonRow) pageBlock);
            buVar.G = 2131754872;
            arrayList.add(buVar);
            return buVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            try {
                su suVar = new su(this, rect, i17, (TL_iv.pageBlockTable) pageBlock);
                suVar.G = 2131754855;
                arrayList.add(suVar);
                return suVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            ku kuVar = new ku(this, rect, i17, (TL_iv.pageBlockMath) pageBlock);
            arrayList.add(kuVar);
            return kuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            hu huVar = new hu(this, rect, i17);
            arrayList.add(huVar);
            return huVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            mu muVar = new mu(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
            arrayList.add(muVar);
            k(pageblockphoto.caption, rect, i35);
            return muVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            yu yuVar = new yu(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
            arrayList.add(yuVar);
            k(pageblockvideo.caption, rect, i35);
            return yuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            eu euVar = new eu(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
            arrayList.add(euVar);
            k(pageblockcollage.caption, rect, i35);
            return euVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            qu quVar = new qu(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
            arrayList.add(quVar);
            k(pageblockslideshow.caption, rect, i35);
            return quVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            ju juVar = new ju(this, rect, i17, pageblockmap);
            arrayList.add(juVar);
            k(pageblockmap.caption, rect, i35);
            return juVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            HashMap hashMap = this.m;
            if (((fj) hashMap.get(pageblockaudio)) == null && (s5 = s(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i43 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i43;
                tL_message.id = i43;
                fj fjVar = this.b;
                tL_message.realId = fjVar.L1();
                tL_message.dialog_id = fj.B0(fjVar.k);
                TLRPC.Peer peer = fjVar.k.peer_id;
                tL_message.peer_id = peer;
                int i44 = this.a;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = j10.i(i44).e();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = j10.i(i44).e();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = s5;
                tL_message.flags |= 768;
                fj fjVar2 = new fj(i44, tL_message, false, true);
                this.l.add(fjVar2);
                hashMap.put(pageblockaudio, fjVar2);
            }
            xt xtVar = new xt(this, rect, i17, pageblockaudio);
            arrayList.add(xtVar);
            k(pageblockaudio.caption, rect, i35);
            return xtVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            iu iuVar = new iu(this, rect, i17, pageblockdocument);
            arrayList.add(iuVar);
            k(pageblockdocument.caption, rect, i35);
            return iuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return j(((TL_iv.pageBlockCover) pageBlock).cover, i7, rect, i35, false);
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
            AtomicInteger atomicInteger = pk0.t0;
            if (pageblockembed.html != null && org.telegram.utils.twidget.n0.n(pageblockembed.url)) {
                if (org.telegram.utils.twidget.n0.n(pageblockembed.url)) {
                    String str3 = pageblockembed.url;
                    int j02 = (pk0.j0() * 2) + i17;
                    org.telegram.utils.twidget.k0 k0Var = org.telegram.utils.twidget.n0.n(str3) ? (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str3) : null;
                    if (k0Var != null && (i11 = k0Var.e) != 0) {
                        j02 = Math.min(j02, g0.L(Math.max(ks.e3, i11)));
                    }
                    i17 = j02 - (pk0.j0() * 2);
                }
                pk0 pk0Var = new pk0(this, rect, i17, pageblockembed, arrayList.isEmpty());
                arrayList.add(pk0Var);
                k(pageblockembed.caption, rect, i35);
                return pk0Var;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int L3 = c8.dd.a(i35, 9) ? g0.L(6.0f) : i7 > 0 ? g0.L(4.0f) : 0;
            xu xuVar = new xu(this, new Rect((rect.left + L3) - g0.L(7.0f), Math.max(g0.L(14.0f), rect.top), (rect.right + L3) - g0.L(7.0f), Math.max(g0.L(14.0f), rect.bottom)), this.B, arrayList.size(), i7);
            this.e.add(xuVar);
            if (i7 == 0) {
                this.f.add(xuVar);
            }
            arrayList.add(xuVar);
            return xuVar;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            boolean z26 = s2.a;
            return null;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        fu fuVar = new fu(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i35 & (-17)));
        arrayList.add(fuVar);
        for (int i45 = 0; i45 < pageblockdetails.blocks.size(); i45++) {
            j(pageblockdetails.blocks.get(i45), i7 + 1, rect, i35, O(i45, pageblockdetails.blocks));
        }
        arrayList.add(new gu(this, new Rect(rect.left, 0, rect.right, 0), i17));
        for (int size8 = arrayList.size(); size8 < arrayList.size(); size8++) {
            zt ztVar5 = (zt) arrayList.get(size8);
            if (ztVar5.M == null) {
                ztVar5.M = fuVar;
            }
        }
        return fuVar;
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i7) {
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
            int R = R(i7, 10);
            this.g.add(new du(this, rect, this.B, z11 ? l(pageCaption.text, R) : null, z10 ? l(pageCaption.credit, R) : null));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i7 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i7, new av(this, i7, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new wt(richText, i7), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i7) {
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j3 = oi.b6.j(textdiff.text);
                    boolean j10 = oi.b6.j(textdiff.old_text);
                    if (j3 && !j10) {
                        n(textdiff.old_text, spannableStringBuilder, i7, new ez0(z(TLObject.FLAG_13), 0));
                    } else if (!j3 && j10) {
                        n(textdiff.text, spannableStringBuilder, i7, new ez0(z(TLObject.FLAG_12), 0));
                    } else if (!j3) {
                        n(textdiff.text, spannableStringBuilder, i7, new nu0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i10 = i7 | 16;
                    n(richText.text, spannableStringBuilder, i10, new av(this, i10, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i11 = i7 | 32;
                    n(richText.text, spannableStringBuilder, i11, new av(this, i11, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i12 = i7 | 64;
                    n(richText.text, spannableStringBuilder, i12, new av(this, i12, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i13 = i7 | 128;
                    n(richText.text, spannableStringBuilder, i13, new av(this, i13, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i14 = i7 | 256;
                    n(richText.text, spannableStringBuilder, i14, new av(this, i14, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i7, new r41(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    n(richText.text, spannableStringBuilder, i7, new r41("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                        m(richText.texts.get(i15), spannableStringBuilder, i7);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i16 = i7 | 2048;
                    n(richText.text, spannableStringBuilder, i16, new av(this, i16, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i17 = i7 | TLObject.FLAG_12;
                    n(richText.text, spannableStringBuilder, i17, new av(this, i17, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i18 = i7 | TLObject.FLAG_13;
                    n(richText.text, spannableStringBuilder, i18, new av(this, i18, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = pf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = p5.c.k("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i7, new r41(p5.c.k("tel:", d), z(1024)));
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
                    n(richText2, spannableStringBuilder, i7, new hi.r9(3));
                } else if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        oi.p a10 = oi.p.a(textmath.source, g0.L(this.M + 4), true);
                        if (a10 != null) {
                            textmath.w = a10.b;
                            textmath.h = a10.c;
                            textmath.depth = a10.d;
                            textmath.bitmap = a10.a;
                        }
                    }
                    if (textmath.bitmap != null) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append(" ");
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new wy0(null, textmath.bitmap, textmath.w, textmath.h, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.D), textmath.depth), length2, length3, 33);
                        String str3 = textmath.source;
                        if (str3 != null && !str3.isEmpty()) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.o9(textmath.source), length2, length3, 33);
                        }
                    }
                } else if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(charSequence);
                    int length5 = spannableStringBuilder.length();
                    boolean a11 = c8.dd.a(i7, 13);
                    int i19 = i7 & 15;
                    if (i19 < 1 || i19 > 6) {
                        size = new org.telegram.ui.Components.x5(textcustomemoji.document_id, a11 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(g0.L(this.M + 4 + (a11 ? -2 : 4)));
                    } else {
                        TextPaint textPaint = new TextPaint(this.w);
                        new av(this, i7, true).a(textPaint);
                        size = new org.telegram.ui.Components.x5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                    }
                    spannableStringBuilder.setSpan(size, length4, length5, 33);
                } else if (richText instanceof TL_iv.textSpoiler) {
                    n(richText.text, spannableStringBuilder, i7, new ez0(z(256), 0));
                } else if (richText instanceof TL_iv.textMention) {
                    TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                    dz0 dz0Var = new dz0();
                    dz0Var.d = tL_messageEntityMention;
                    n(richText.text, spannableStringBuilder, i7, new p41(x(richText), dz0Var));
                } else if (richText instanceof TL_iv.textHashtag) {
                    TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                    dz0 dz0Var2 = new dz0();
                    dz0Var2.d = tL_messageEntityHashtag;
                    n(richText.text, spannableStringBuilder, i7, new p41(x(richText), dz0Var2));
                } else if (richText instanceof TL_iv.textBotCommand) {
                    n(richText.text, spannableStringBuilder, i7, new m41(x(richText), E() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textCashtag) {
                    TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                    dz0 dz0Var3 = new dz0();
                    dz0Var3.d = tL_messageEntityCashtag;
                    n(richText.text, spannableStringBuilder, i7, new p41(x(richText), dz0Var3));
                } else if (richText instanceof TL_iv.textAutoUrl) {
                    n(richText.text, spannableStringBuilder, i7, new r41(x(richText), z(1024)));
                } else if (richText instanceof TL_iv.textAutoEmail) {
                    n(richText.text, spannableStringBuilder, i7, new r41(p5.c.k("mailto:", x(richText)), z(1024)));
                } else if (richText instanceof TL_iv.textAutoPhone) {
                    String x10 = x(richText);
                    String d2 = pf.b.d(x10, false);
                    if (x10.startsWith("+")) {
                        d2 = p5.c.k("+", d2);
                    }
                    n(richText.text, spannableStringBuilder, i7, new r41(p5.c.k("tel:", d2), z(1024)));
                } else if (richText instanceof TL_iv.textTonAddress) {
                    n(richText.text, spannableStringBuilder, i7, new p41(p5.c.k("tonaddress:", x(richText)), (dz0) null));
                } else if (richText instanceof TL_iv.textBankCard) {
                    n(richText.text, spannableStringBuilder, i7, new p41(p5.c.k("card:", x(richText)), (dz0) null));
                } else if (richText instanceof TL_iv.textMentionName) {
                    n(richText.text, spannableStringBuilder, i7, new s41("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
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
                    int i20 = i7 | 512;
                    TL_iv.RichText richText3 = richText.text;
                    av avVar = new av(this, i20, false);
                    org.telegram.ui.Components.k00 k00Var = new org.telegram.ui.Components.k00(x(richText), null, tL_messageEntityFormattedDate);
                    int length6 = spannableStringBuilder.length();
                    m(richText3, spannableStringBuilder, i20);
                    if (spannableStringBuilder.length() > length6) {
                        U(avVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                        U(k00Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                    }
                } else if (richText instanceof TL_iv.textButton) {
                    int length7 = spannableStringBuilder.length();
                    spannableStringBuilder.append("*");
                    cu cuVar = new cu(this, this.B, (TL_iv.textButton) richText, null);
                    cuVar.d = 1.2f;
                    spannableStringBuilder.setSpan(cuVar, length7, spannableStringBuilder.length(), 33);
                }
            }
        }
        IdentityHashMap identityHashMap = this.Y;
        if (identityHashMap == null || richText == null) {
            return;
        }
        identityHashMap.put(richText, new int[]{length, spannableStringBuilder.length()});
    }

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i7, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i7);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i7, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i7);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((zt) arrayList.get(i7)).p(arrayList2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((vg0) arrayList2.get(i10)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i7, org.telegram.ui.Cells.x1 x1Var) {
        ArrayList arrayList = this.g;
        if (i7 >= 0 && i7 < arrayList.size() && x1Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            zt ztVar = (zt) arrayList.get(i7);
            return Math.round(g0.T1(ztVar.P, ztVar.N, max));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            zt ztVar2 = (zt) arrayList.get(i11);
            boolean S = ztVar2.S();
            if (i11 == i7) {
                return i10;
            }
            if (S) {
                i10 = ((x1Var == null || !(this.s || this.u)) ? ztVar2.I() : g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), ztVar2.Q, ztVar2.O)) + i10;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j3) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.Document document = arrayList.get(i7);
            i7++;
            TLRPC.Document document2 = document;
            if (document2.id == j3) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        if (!this.d || this.A <= g0.L(900.0f)) {
            return this.A + (this.d ? g0.L(50.0f) : 0);
        }
        return g0.L(950.0f);
    }

    public final int u() {
        return this.B;
    }

    public final TLRPC.Photo v(long j3) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.Photo photo = arrayList.get(i7);
            i7++;
            TLRPC.Photo photo2 = photo;
            if (photo2.id == j3) {
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
    public final String w(int i7, int i10) {
        int min;
        int max;
        int i11;
        zt ztVar;
        int i12;
        String str;
        ev evVar = this;
        ArrayList arrayList = evVar.n;
        if (arrayList.isEmpty() || (max = Math.max(i7, i10)) <= (min = Math.min(i7, i10))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        int i14 = -1;
        while (i13 < arrayList.size()) {
            Layout a10 = ((org.telegram.ui.Cells.t9) arrayList.get(i13)).a();
            if (a10 == null || a10.getText() == null) {
                i11 = min;
            } else {
                CharSequence text = a10.getText();
                ArrayList arrayList4 = evVar.o;
                int intValue = i13 < arrayList4.size() ? ((Integer) arrayList4.get(i13)).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    ArrayList arrayList5 = evVar.p;
                    int intValue2 = i13 < arrayList5.size() ? ((Integer) arrayList5.get(i13)).intValue() : -1;
                    if (intValue2 >= 0) {
                        ArrayList arrayList6 = evVar.g;
                        if (intValue2 < arrayList6.size()) {
                            ztVar = (zt) arrayList6.get(intValue2);
                            String str2 = "";
                            if (ztVar instanceof su) {
                                ArrayList P = evVar.P(intValue2);
                                if (arrayList2.size() != P.size()) {
                                    i11 = min;
                                } else {
                                    int i15 = 0;
                                    while (i15 < arrayList2.size()) {
                                        i11 = min;
                                        if (arrayList2.get(i15) == P.get(i15)) {
                                            i15++;
                                            min = i11;
                                        }
                                    }
                                    i11 = min;
                                    int i16 = max2 - intValue;
                                    int i17 = min2 - intValue;
                                    int i18 = !(ztVar instanceof tu) ? ((tu) ztVar).c0 : -1;
                                    boolean z10 = !(ztVar instanceof vu) && ((vu) ztVar).Y == arrayList.get(i13);
                                    i12 = ztVar == null ? ztVar.w : 0;
                                    if (i12 > 0 || i18 >= 0) {
                                        d(sb2, arrayList3);
                                        if (!(ztVar instanceof nu)) {
                                            SpannableStringBuilder a02 = a0(text.subSequence(i16, i17));
                                            String str3 = ((nu) ztVar).q0;
                                            StringBuilder sb3 = new StringBuilder();
                                            oi.a4.g(sb3, a02);
                                            String sb4 = sb3.toString();
                                            if (!sb4.isEmpty()) {
                                                StringBuilder sb5 = new StringBuilder();
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb5.append("<pre>");
                                                } else {
                                                    sb5.append("<pre language=\"");
                                                    sb5.append(oi.a4.s(str3));
                                                    sb5.append("\">");
                                                }
                                                str2 = a8.p0.s(sb5, sb4, "</pre>");
                                            }
                                            sb2.append(str2);
                                        } else if (z10) {
                                            a(sb2, text, i16, i17, true);
                                        } else if (i18 < 0) {
                                            a(sb2, text, i16, i17, false);
                                        } else {
                                            a(sb2, text, i16, Math.min(i17, i18 > 0 ? i18 - 1 : 0), false);
                                            a(sb2, text, Math.max(i16, i18), i17, true);
                                        }
                                    } else {
                                        boolean z11 = ztVar.x;
                                        while (true) {
                                            str = "</ul>";
                                            if (arrayList3.size() <= i12) {
                                                break;
                                            }
                                            if (((Boolean) p5.c.g(1, arrayList3)).booleanValue()) {
                                                str = "</ol>";
                                            }
                                            sb2.append(str);
                                        }
                                        while (arrayList3.size() < i12) {
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        if (!arrayList3.isEmpty() && ((Boolean) i5.c.h(1, arrayList3)).booleanValue() != z11) {
                                            sb2.append(((Boolean) p5.c.g(1, arrayList3)).booleanValue() ? "</ol>" : "</ul>");
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        sb2.append("<li");
                                        if (ztVar.y) {
                                            sb2.append(" data-checkbox=\"1\"");
                                            if (ztVar.E) {
                                                sb2.append(" data-checked=\"1\"");
                                            }
                                        }
                                        sb2.append('>');
                                        SpannableStringBuilder a03 = a0(text.subSequence(i16, i17));
                                        StringBuilder sb6 = new StringBuilder();
                                        oi.a4.g(sb6, a03);
                                        sb2.append(sb6.toString());
                                        sb2.append("</li>");
                                    }
                                }
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, P);
                                int i162 = max2 - intValue;
                                int i172 = min2 - intValue;
                                if (!(ztVar instanceof tu)) {
                                }
                                if (ztVar instanceof vu) {
                                }
                                if (ztVar == null) {
                                }
                                if (i12 > 0) {
                                }
                                d(sb2, arrayList3);
                                if (!(ztVar instanceof nu)) {
                                }
                            } else if (intValue2 != i14) {
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, evVar.P(intValue2));
                                TL_iv.pageBlockTable pageblocktable = ((su) ztVar).X;
                                if (pageblocktable != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    oi.a4.H(sb7, pageblocktable);
                                    str2 = sb7.toString();
                                }
                                sb2.append(str2);
                                i11 = min;
                                i14 = intValue2;
                            }
                        }
                    }
                    ztVar = null;
                    String str22 = "";
                    if (ztVar instanceof su) {
                    }
                }
                i11 = min;
            }
            i13++;
            evVar = this;
            min = i11;
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

    public ev(int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
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
        this.y = new mk0(null);
        this.z = new h6.m(29);
        this.K = new RectF();
        this.b = null;
        this.a = i7;
        this.B = i10;
        this.D = i6Var;
        this.M = bz.W0;
        this.N = g0.p;
        textPaint.setTextSize(g0.L(r6));
        textPaint2.setTextSize(g0.L(this.M));
    }
}
