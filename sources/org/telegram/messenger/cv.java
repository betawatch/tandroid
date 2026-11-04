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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class cv {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.e6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.gc G;
    public Paint H;
    public ly0 I;
    public w70 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public cv P;
    public View Q;
    public yh.e R;
    public int S;
    public int T;
    public org.telegram.ui.Components.u5 U;
    public float V;
    public xt W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final zi b;
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
    public ng0 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final dk0 y;
    public final k4.j z;

    public cv(zi ziVar, int i3, cv cvVar) {
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
        this.y = new dk0(null);
        this.z = new k4.j(24);
        this.K = new RectF();
        this.b = ziVar;
        this.B = i3;
        this.a = ziVar.I1;
        J(cvVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    public static float K(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return 1000 / Math.max(1.0E-4f, f10);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i3) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            return pageListOrderedItem.num.endsWith(".") ? pageListOrderedItem.num : a1.g.s(new StringBuilder(), pageListOrderedItem.num, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a1.g.o(pageListOrderedItem.value, ".", new StringBuilder());
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i3 + 1) + ".";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i3 = -i3;
        }
        sb2.append(i10 + i3);
        sb2.append(".");
        return sb2.toString();
    }

    public static boolean O(int i3, List list) {
        return i3 > 0 && (list.get(i3 - 1) instanceof TL_iv.pageBlockParagraph);
    }

    public static int R(int i3, int i10) {
        return i10 == 0 ? i3 : (i3 & (-16)) | i10;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i3 = 0;
        while (i3 < arrayList.size() && i3 < arrayList2.size() && arrayList.get(i3) == arrayList2.get(i3)) {
            i3++;
        }
        while (arrayList.size() > i3) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((tt) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i3, int i10, boolean z10) {
        if (i10 <= i3) {
            return;
        }
        SpannableStringBuilder a02 = a0(charSequence.subSequence(i3, i10));
        StringBuilder sb3 = new StringBuilder();
        mi.b4.g(sb3, a02);
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
        for (yu yuVar : (yu[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yu.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(yuVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(yuVar);
            if (spanEnd > spanStart) {
                int i3 = yuVar.b;
                int i10 = (i3 & 16) != 0 ? 1 : 0;
                if ((i3 & 32) != 0) {
                    i10 |= 2;
                }
                if ((i3 & 64) != 0) {
                    i10 |= 16;
                }
                if ((i3 & 128) != 0) {
                    i10 |= 8;
                }
                if ((i3 & 256) != 0) {
                    i10 |= 4;
                }
                if ((i3 & 2048) != 0) {
                    i10 |= TLObject.FLAG_14;
                }
                if ((i3 & TLObject.FLAG_12) != 0) {
                    i10 |= 32768;
                }
                if ((i3 & TLObject.FLAG_13) != 0) {
                    i10 |= 65536;
                }
                if (i10 != 0) {
                    ty0 ty0Var = new ty0();
                    ty0Var.a = i10;
                    spannableStringBuilder.setSpan(new uy0(ty0Var, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        while (!arrayList.isEmpty()) {
            sb2.append(((Boolean) org.telegram.ui.Cells.f1.o(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0570, code lost:
    
        if (r12[r14] > r12[r13]) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ri[] e(float[] fArr) {
        int i3;
        int i10;
        ri[] riVarArr;
        int i11;
        int i12;
        float f10;
        float f11;
        int length = fArr.length;
        ri[] riVarArr2 = new ri[length];
        if (length == 0) {
            return riVarArr2;
        }
        StringBuilder sb2 = new StringBuilder();
        float f12 = 0.0f;
        boolean z10 = false;
        for (int i13 = 0; i13 < length; i13++) {
            float f13 = fArr[i13];
            float f14 = f13 <= 0.0f ? 1.0f : f13;
            ri riVar = new ri();
            riVarArr2[i13] = riVar;
            riVar.g = f14;
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
            riVarArr2[0].a(Math.round(Math.min(f16 / r0.g, 407.0f)) / 814.0f, 0, 0, 0, 0, 1000, 15);
            return riVarArr2;
        }
        int i14 = 1;
        float f19 = 1.0f;
        int i15 = 2;
        int i16 = 3;
        if (!z10 && (length == 2 || length == 3 || length == 4)) {
            if (length == 2) {
                ri riVar2 = riVarArr2[0];
                ri riVar3 = riVarArr2[1];
                String sb3 = sb2.toString();
                if (sb3.equals("ww") && f15 > f18 * 1.4f) {
                    if (riVar2.g - riVar3.g < 0.2f) {
                        float round = Math.round(Math.min(f16 / r6, Math.min(f16 / r7, 407.0f))) / 814.0f;
                        riVar2.a(round, 0, 0, 0, 0, 1000, 7);
                        riVar3.a(round, 0, 0, 1, 1, 1000, 11);
                        return riVarArr2;
                    }
                }
                if (sb3.equals("ww") || sb3.equals("qq")) {
                    float f20 = 500;
                    float round2 = Math.round(Math.min(f20 / riVar2.g, Math.min(f20 / riVar3.g, 814.0f))) / 814.0f;
                    riVar2.a(round2, 0, 0, 0, 0, 500, 13);
                    riVar3.a(round2, 1, 1, 0, 0, 500, 14);
                    return riVarArr2;
                }
                float f21 = riVar2.g;
                int max = (int) Math.max(0.4f * f16, Math.round((f16 / f21) / ((1.0f / riVar3.g) + (1.0f / f21))));
                int i17 = 1000 - max;
                if (i17 < min) {
                    max -= min - i17;
                } else {
                    min = i17;
                }
                float min2 = Math.min(814.0f, Math.round(Math.min(min / riVar2.g, max / riVar3.g))) / 814.0f;
                riVar2.a(min2, 0, 0, 0, 0, min, 13);
                riVar3.a(min2, 1, 1, 0, 0, max, 14);
                return riVarArr2;
            }
            if (length == 3) {
                ri riVar4 = riVarArr2[0];
                ri riVar5 = riVarArr2[1];
                ri riVar6 = riVarArr2[2];
                if (sb2.charAt(0) == 'n') {
                    float f22 = riVar5.g;
                    float min3 = Math.min(407.0f, Math.round((f22 * f16) / (riVar6.g + f22)));
                    int max2 = (int) Math.max(min, Math.min(f16 * 0.5f, Math.round(Math.min(riVar6.g * min3, riVar5.g * r7))));
                    riVar4.a(1.0f, 0, 0, 0, 1, Math.round(Math.min((riVar4.g * 814.0f) + L3, 1000 - max2)), 13);
                    riVar5.a((814.0f - min3) / 814.0f, 1, 1, 0, 0, max2, 6);
                    riVar6.a(min3 / 814.0f, 1, 1, 1, 1, max2, 10);
                    return riVarArr2;
                }
                float round3 = Math.round(Math.min(f16 / riVar4.g, 537.24005f)) / 814.0f;
                riVar4.a(round3, 0, 1, 0, 0, 1000, 7);
                float f23 = 500;
                float min4 = Math.min(814.0f - round3, Math.round(Math.min(f23 / riVar5.g, f23 / riVar6.g))) / 814.0f;
                float f24 = min4 < L4 ? L4 : min4;
                riVar5.a(f24, 0, 0, 1, 1, 500, 9);
                riVar6.a(f24, 1, 1, 1, 1, 500, 10);
                return riVarArr2;
            }
            ri riVar7 = riVarArr2[0];
            ri riVar8 = riVarArr2[1];
            ri riVar9 = riVarArr2[2];
            ri riVar10 = riVarArr2[3];
            if (sb2.charAt(0) != 'w') {
                int max3 = Math.max(min, Math.round(814.0f / ((1.0f / riVar10.g) + ((1.0f / riVar9.g) + (1.0f / riVar8.g)))));
                float f25 = L;
                float f26 = max3;
                float min5 = Math.min(0.33f, Math.max(f25, f26 / riVar8.g) / 814.0f);
                float min6 = Math.min(0.33f, Math.max(f25, f26 / riVar9.g) / 814.0f);
                float f27 = (1.0f - min5) - min6;
                riVar7.a(min5 + min6 + f27, 0, 0, 0, 2, Math.round(Math.min((riVar7.g * 814.0f) + L3, 1000 - max3)), 13);
                riVar8.a(min5, 1, 1, 0, 0, max3, 6);
                riVar9.a(min6, 1, 1, 1, 1, max3, 2);
                riVar10.a(f27, 1, 1, 2, 2, max3, 10);
                return riVarArr2;
            }
            float round4 = Math.round(Math.min(f16 / riVar7.g, 537.24005f)) / 814.0f;
            riVar7.a(round4, 0, 2, 0, 0, 1000, 7);
            float round5 = Math.round(f16 / ((riVar8.g + riVar9.g) + riVar10.g));
            float f28 = min;
            int max4 = (int) Math.max(f28, Math.min(f16 * 0.4f, riVar8.g * round5));
            int max5 = (int) Math.max(Math.max(f28, f16 * 0.33f), riVar10.g * round5);
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
            riVar8.a(f29, 0, 0, 1, 1, i20, 9);
            riVar9.a(f29, 1, 1, 1, 1, i18, 8);
            riVar10.a(f29, 2, 2, 1, 1, max5, 10);
            return riVarArr2;
        }
        float[] fArr2 = new float[length];
        int i21 = 0;
        while (i21 < length) {
            float f30 = riVarArr2[i21].g;
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
                                riVarArr = riVarArr2;
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
                                riVarArr = riVarArr2;
                                float[] fArr4 = new float[4];
                                fArr4[0] = K4;
                                fArr4[1] = K5;
                                fArr4[i29] = K6;
                                fArr4[i11] = K7;
                                arrayList2.add(fArr4);
                            }
                            i33++;
                            i16 = i11;
                            riVarArr2 = riVarArr;
                        }
                    }
                    i31++;
                }
            }
        }
        ri[] riVarArr3 = riVarArr2;
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
                    i3 = i29;
                    if (iArr.length <= i3 || i43 <= iArr[i3]) {
                        i10 = i38;
                        if (iArr.length > i10) {
                        }
                    }
                } else {
                    i3 = i29;
                }
                i10 = i38;
                abs *= 1.2f;
            } else {
                i3 = i29;
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
            i29 = i3;
            i14 = 1;
        }
        if (i39 == -1) {
            int i44 = 0;
            while (i44 < length) {
                int i45 = i44;
                riVarArr3[i44].a(0.4f, 0, 0, i45, i44, 1000, 3);
                i44 = i45 + 1;
            }
            return riVarArr3;
        }
        int[] iArr2 = (int[]) arrayList.get(i39);
        float[] fArr6 = (float[]) arrayList2.get(i39);
        int i46 = 0;
        int i47 = 0;
        while (i47 < iArr2.length) {
            int i48 = iArr2[i47];
            float f37 = fArr6[i47];
            ri riVar11 = null;
            int i49 = 1000;
            int i50 = 0;
            while (i50 < i48) {
                int i51 = (int) (fArr2[i46] * f37);
                i49 -= i51;
                ri riVar12 = riVarArr3[i46];
                int i52 = i47 == 0 ? 4 : 0;
                if (i47 == iArr2.length - 1) {
                    i52 |= 8;
                }
                if (i50 == 0) {
                    i52 |= 1;
                }
                if (i50 == i48 - 1) {
                    i52 |= 2;
                    riVar11 = riVar12;
                }
                int i53 = i50;
                riVar12.a(Math.max(L4, f37 / f31), i53, i50, i47, i47, i51, i52);
                i46++;
                i50 = i53 + 1;
            }
            int i54 = i47;
            if (riVar11 != null) {
                riVar11.e += i49;
                riVar11.i += i49;
            }
            i47 = i54 + 1;
        }
        return riVarArr3;
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
            if (!mi.d6.j(textdiff.text)) {
                y(textdiff.text, sb2);
                return;
            } else {
                if (mi.d6.j(textdiff.old_text)) {
                    return;
                }
                y(textdiff.old_text, sb2);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i3 = 0; i3 < richText.texts.size(); i3++) {
                y(richText.texts.get(i3), sb2);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            y(richText2, sb2);
        }
    }

    public static ty0 z(int i3) {
        ty0 ty0Var = new ty0();
        ty0Var.a = i3;
        return ty0Var;
    }

    public final boolean B() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.Ta > 0;
    }

    public final boolean C() {
        org.telegram.ui.Components.l5 l5Var;
        if (F()) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i3 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i3);
                if ((s9Var instanceof bv) && (l5Var = ((bv) s9Var).F) != null && !l5Var.a.isEmpty()) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    public final boolean D() {
        zi ziVar = this.b;
        return (ziVar == null || !ziVar.Q2() || ziVar.Q3()) ? false : true;
    }

    public final boolean E() {
        zi ziVar = this.b;
        return ziVar != null && ziVar.Q3();
    }

    public final boolean F() {
        ng0 ng0Var = this.r;
        return ng0Var == null || !ng0Var.h;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        return q1Var != null && q1Var.H2();
    }

    public final boolean H() {
        org.telegram.ui.Cells.s9[] L;
        xt xtVar = this.W;
        if (xtVar != null && (L = xtVar.L()) != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof bv) {
                    bv bvVar = (bv) s9Var;
                    if (bvVar.N != null || bvVar.R != null) {
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

    public final void J(cv cvVar) {
        boolean z10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                xt xtVar = (xt) arrayList.get(i3);
                View view2 = xtVar.W;
                if (view2 != null && view2 == view) {
                    xtVar.V();
                    CheckBoxBase checkBoxBase = xtVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    xtVar.W = null;
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
        this.M = az.W0;
        this.N = g0.p;
        this.w.setTextSize(g0.L(az.W0));
        this.x.setTextSize(g0.L(az.W0));
        this.d = false;
        this.c = null;
        zi ziVar = this.b;
        if (ziVar == null || ziVar.k == null || ziVar.E0() == null) {
            return;
        }
        TL_iv.RichMessage E0 = ziVar.E0();
        this.c = E0;
        this.d = E0.part;
        this.P = cvVar;
        int i10 = 0;
        while (i10 < this.c.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.c.blocks.get(i10);
            xt j10 = j(pageBlock, 0, new Rect(), 0, O(i10, this.c.blocks));
            if ((j10 instanceof ru) && (((z10 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.i4.I(pageBlock))) {
                ru ruVar = (ru) j10;
                ruVar.j0((i10 == 0 && z10) ? 0 : ruVar.a0, i10 == this.c.blocks.size() - 1 ? 0 : ruVar.b0);
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            xt xtVar2 = (xt) arrayList.get(i11);
            if ((xtVar2 instanceof ru) && xtVar2.w > 0) {
                int i12 = i11 + 1;
                ((ru) xtVar2).j0(g0.L(i11 > 0 && ((xt) arrayList.get(i11 + (-1))).w > 0 ? 3.0f : 6.0f), g0.L(i12 < arrayList.size() && ((xt) arrayList.get(i12)).w > 0 ? 3.0f : 6.0f));
            }
            i11++;
        }
        this.P = null;
        if (this.r != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((xt) arrayList.get(i13)).L = this.r;
            }
            this.r.k(p());
        }
        if (view != null) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((xt) arrayList.get(i14)).m(view);
            }
        }
        Q();
        X();
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i3) {
        return (this.c == richMessage && this.M == az.W0 && Math.abs(this.N - g0.p) <= 0.1f && i3 == this.B) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M(MotionEvent motionEvent) {
        int i3;
        float f10;
        int actionMasked = motionEvent.getActionMasked();
        boolean Y = Y();
        ArrayList arrayList = this.g;
        if (Y && (arrayList.get(0) instanceof gk0)) {
            i3 = -this.S;
        } else {
            if (D()) {
                f10 = 0.0f;
                if (actionMasked == 0 || (motionEvent.getX() >= f10 && motionEvent.getX() <= this.C + this.T)) {
                    if (this.d) {
                        float x10 = motionEvent.getX();
                        float y9 = motionEvent.getY();
                        RectF rectF = this.K;
                        if (actionMasked == 0) {
                            if (rectF.contains(x10, y9)) {
                                this.L = true;
                                org.telegram.ui.Components.gc gcVar = this.G;
                                if (gcVar != null) {
                                    gcVar.c(true);
                                    return true;
                                }
                                return true;
                            }
                        } else if (this.L) {
                            if (actionMasked == 2) {
                                if (!rectF.contains(x10, y9)) {
                                    org.telegram.ui.Components.gc gcVar2 = this.G;
                                    if (gcVar2 != null) {
                                        gcVar2.c(false);
                                    }
                                    this.L = false;
                                    return true;
                                }
                            } else if (actionMasked == 1 || actionMasked == 3) {
                                org.telegram.ui.Components.gc gcVar3 = this.G;
                                if (gcVar3 != null) {
                                    gcVar3.c(false);
                                }
                                boolean z10 = actionMasked == 1 && rectF.contains(x10, y9);
                                this.L = false;
                                if (z10 && this.F != null && this.E != null) {
                                    View view = this.Q;
                                    if (view != null) {
                                        view.performHapticFeedback(3, 2);
                                    }
                                    this.F.D0(this.E);
                                }
                            }
                            return true;
                        }
                    }
                    if (actionMasked != 0) {
                        this.W = null;
                        float y10 = motionEvent.getY();
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                break;
                            }
                            xt xtVar = (xt) arrayList.get(i10);
                            if (xtVar.S()) {
                                int I = xtVar.I();
                                float f11 = i11;
                                if (y10 < f11 || y10 >= i11 + I) {
                                    i11 += I;
                                } else {
                                    motionEvent.offsetLocation(0.0f, -i11);
                                    boolean f02 = xtVar.f0(motionEvent);
                                    motionEvent.offsetLocation(0.0f, f11);
                                    if (f02) {
                                        this.W = xtVar;
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
            i3 = this.S;
        }
        f10 = i3;
        if (actionMasked == 0) {
        }
        if (this.d) {
        }
        if (actionMasked != 0) {
        }
        return false;
    }

    public final ArrayList P(int i3) {
        ArrayList arrayList = new ArrayList();
        if (i3 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                tt ttVar = (tt) obj;
                if (i3 >= ttVar.a && i3 <= ttVar.b) {
                    arrayList.add(ttVar);
                }
            }
            Collections.sort(arrayList, new tq(4));
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
        int i3 = 0;
        while (true) {
            arrayList = this.g;
            if (i3 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((xt) arrayList.get(i3)).K());
            i3++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            xt xtVar = (xt) arrayList.get(i10);
            if (xtVar instanceof qu) {
                qu quVar = (qu) xtVar;
                int i11 = this.C;
                int i12 = quVar.f0;
                int i13 = quVar.e0;
                Rect rect = quVar.b;
                int max = Math.max(i12, Math.min(i13, Math.max(0, (i11 - rect.left) - rect.right)));
                quVar.g0 = max;
                lx0 lx0Var = quVar.Y;
                lx0Var.setRenderWidth(max);
                quVar.h0 = lx0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            xt xtVar2 = (xt) arrayList.get(i15);
            boolean S = xtVar2.S();
            xtVar2.N = i14;
            xtVar2.O = 0;
            xtVar2.R = S;
            Rect rect2 = xtVar2.b;
            xtVar2.Z(rect2.left, rect2.top + i14, i15);
            if (S) {
                org.telegram.ui.Cells.s9[] L = xtVar2.L();
                if (L != null) {
                    for (org.telegram.ui.Cells.s9 s9Var : L) {
                        if (s9Var != null && s9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i15));
                            arrayList2.add(s9Var);
                            CharSequence text = s9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int I = xtVar2.I();
                xtVar2.O = I;
                i14 += I;
            }
        }
        this.A = i14;
        this.q = sb2;
    }

    public final void S(int i3, int i10) {
        if (this.S == i3 && this.T == i10) {
            return;
        }
        this.S = i3;
        this.T = i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i11 >= arrayList.size()) {
                return;
            }
            xt xtVar = (xt) arrayList.get(i11);
            if (xtVar instanceof du) {
                du duVar = (du) xtVar;
                bv bvVar = duVar.Y;
                bvVar.c = (g0.L(53.0f) + (duVar.T - duVar.a.S)) - bvVar.f;
            }
            i11++;
        }
    }

    public final void T(org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Cells.l1 l1Var) {
        this.E = q1Var;
        this.F = l1Var;
    }

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i3, int i10) {
        if (!(characterStyle instanceof yu)) {
            spannableStringBuilder.setSpan(characterStyle, i3, i10, 33);
            return;
        }
        int i11 = ((yu) characterStyle).b;
        yu[] yuVarArr = (yu[]) spannableStringBuilder.getSpans(i3, i10, yu.class);
        if (yuVarArr == null || yuVarArr.length <= 0) {
            V(spannableStringBuilder, i3, i10, i11);
            return;
        }
        Arrays.sort(yuVarArr, Comparator$-CC.comparingInt(new ToIntFunction() { // from class: org.telegram.messenger.nt
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return spannableStringBuilder.getSpanStart((yu) obj);
            }
        }));
        for (int i12 = 0; i12 < yuVarArr.length; i12++) {
            int spanStart = spannableStringBuilder.getSpanStart(yuVarArr[i12]);
            int spanEnd = spannableStringBuilder.getSpanEnd(yuVarArr[i12]);
            if (spanStart > i3) {
                V(spannableStringBuilder, i3, spanStart, i11);
            }
            i3 = Math.max(i3, spanEnd);
        }
        if (i3 < i10) {
            V(spannableStringBuilder, i3, i10, i11);
        }
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11) {
        while (i3 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i3, i10, URLSpan.class);
            spannableStringBuilder.setSpan(new yu(this, i11, ((URLSpan[]) spannableStringBuilder.getSpans(i3, nextSpanTransition, URLSpan.class)).length > 0), i3, nextSpanTransition, 33);
            i3 = nextSpanTransition;
        }
    }

    public final void W(ng0 ng0Var) {
        this.r = ng0Var;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((xt) arrayList.get(i3)).L = ng0Var;
            arrayList.get(i3);
            ((xt) arrayList.get(i3)).getClass();
            i3++;
        }
    }

    public final void X() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((xt) arrayList.get(i3)).d0();
            i3++;
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        xt xtVar = (xt) arrayList.get(0);
        return (xtVar instanceof ku) || (xtVar instanceof wu) || (xtVar instanceof cu) || (xtVar instanceof ou) || (xtVar instanceof gk0);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((xt) arrayList.get(i3)).m(view);
            i3++;
        }
    }

    public final void b0(int i3) {
        bv bvVar;
        View view;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                return;
            }
            org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i10);
            if ((s9Var instanceof bv) && (view = (bvVar = (bv) s9Var).T) != null) {
                org.telegram.ui.Components.p5.release(view, bvVar.F);
                bvVar.F = null;
                bvVar.F = org.telegram.ui.Components.p5.update(i3, bvVar.T, bvVar.a.v && !bvVar.w, (org.telegram.ui.Components.l5) null, bvVar.b);
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
        zi ziVar = this.b;
        if (ziVar == null || ziVar.Q3() || ziVar.Q5()) {
            return;
        }
        boolean z10 = true;
        if (ziVar.c1 < 0 && ziVar.e1 == null && (!ziVar.s4() || (peerColor = ziVar.X0) == null || peerColor.color == -1)) {
            TLRPC.Message message = ziVar.k;
            int i3 = this.a;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                long o10 = m5.o(peer);
                z10 = o10 >= 0 ? false : false;
            } else if (m5.C(zi.B0(message)) || ziVar.q3()) {
                if (user != null) {
                }
            } else {
                if (ziVar.o3() && chat != null) {
                    if (chat.signature_profiles) {
                        long Z0 = ziVar.Z0();
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
        org.telegram.ui.ActionBar.e6 e6Var = this.D;
        this.y.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.D), e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            yh.e eVar = this.R;
            if (eVar != null) {
                eVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i3 >= arrayList.size()) {
                    break;
                }
                xt xtVar = (xt) arrayList.get(i3);
                View view3 = xtVar.W;
                if (view3 != null && view3 == view) {
                    xtVar.V();
                    CheckBoxBase checkBoxBase = xtVar.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    xtVar.W = null;
                }
                i3++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i3, int i10, org.telegram.ui.Cells.x1 x1Var) {
        float f10;
        float f11;
        org.telegram.ui.Cells.l1 l1Var;
        S(i3, i10);
        this.w.linkColor = org.telegram.ui.ActionBar.k6.w0(E() ? org.telegram.ui.ActionBar.k6.Vc : org.telegram.ui.ActionBar.k6.Uc, this.D);
        boolean z10 = this.d;
        int min = Math.min(this.A, g0.L(900.0f));
        if (z10) {
            canvas.saveLayerAlpha(-i3, 0.0f, this.C + i10, min, hs.e4, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z11 = q1Var != null && q1Var.qc > 0;
        if (z11) {
            float f12 = q1Var.oc - q1Var.u0;
            f11 = q1Var.qc + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        h(canvas, x1Var, z11, f10, f11);
        if (z10) {
            RectF rectF = g0.P;
            rectF.set(-i3, min - g0.L(32.0f), this.C + i10, min);
            this.z.w(canvas, rectF, 3, 1.0f);
            canvas.restore();
            int w02 = org.telegram.ui.ActionBar.k6.w0(E() ? org.telegram.ui.ActionBar.k6.Lb : org.telegram.ui.ActionBar.k6.yd, this.D);
            if (this.I == null) {
                this.I = new ly0(bd.M0(2131745349, null), 16.0f, g0.o());
            }
            org.telegram.ui.Components.gc gcVar = this.G;
            if (gcVar == null) {
                this.G = new org.telegram.ui.Components.gc(this.Q, 1.5f, 2.0f);
            } else {
                View view = gcVar.a;
                View view2 = this.Q;
                if (view != view2) {
                    gcVar.a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
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
            boolean z12 = (q1Var2 == null || (l1Var = this.F) == null || !l1Var.p1(q1Var2, 7)) ? false : true;
            w70 w70Var = this.J;
            if (w70Var != null && !z12 && !w70Var.c() && !this.J.d()) {
                this.J.a();
            }
            w70 w70Var2 = this.J;
            if (w70Var2 == null && z12) {
                w70 w70Var3 = new w70();
                this.J = w70Var3;
                w70Var3.x.setStrokeWidth(g0.L(1.25f));
                this.J.D = true;
            } else if (w70Var2 != null && z12 && (w70Var2.c() || this.J.d())) {
                w70 w70Var4 = this.J;
                w70Var4.b = -1L;
                w70Var4.c = -1L;
            }
            w70 w70Var5 = this.J;
            if (w70Var5 != null) {
                w70Var5.g(org.telegram.ui.ActionBar.k6.r1(0.1f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.2f, w02));
            }
            float a10 = this.G.a(0.075f);
            boolean z13 = a10 != 1.0f;
            if (z13) {
                canvas.save();
                canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, g0.L(8.0f), g0.L(8.0f), this.H);
            w70 w70Var6 = this.J;
            if (w70Var6 != null && !w70Var6.c()) {
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
        du duVar;
        float f14;
        int i3;
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
                tt ttVar = (tt) arrayList.get(i12);
                int r5 = r(ttVar.a, x1Var);
                int i14 = ttVar.b;
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
                        xt xtVar = (xt) arrayList2.get(i15);
                        boolean S = xtVar.S();
                        float f19 = f18;
                        Rect rect = xtVar.b;
                        if (S) {
                            int I = ((x1Var == null || !(this.s || this.u)) ? xtVar.I() : g0.W1(Math.max(0.0f, Math.min(f17, x1Var.L1)), xtVar.Q, xtVar.O)) + i16;
                            if (i15 != i14 || rect.bottom <= g0.L(f19)) {
                                f15 = f19;
                                i16 = I;
                            } else {
                                f15 = f19;
                                i16 = k5.B(f15, rect.bottom, I);
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
                    xt xtVar2 = (xt) arrayList2.get(i14);
                    int d = k2.p1.d(4.0f, xtVar2.b.bottom, i11);
                    float f20 = (xtVar2.P + xtVar2.Q) - (xtVar2.S ? d : i11);
                    float f21 = xtVar2.N + xtVar2.O;
                    if (!xtVar2.R) {
                        d = i11;
                    }
                    i10 = Math.round(g0.T1(f20, f21 - d, max));
                }
                int i17 = ttVar.b;
                ArrayList arrayList3 = this.g;
                float f22 = 1.0f;
                for (int i18 = ttVar.a; i18 < Math.min(i17 + 1, arrayList3.size()); i18++) {
                    xt xtVar3 = (xt) arrayList3.get(i18);
                    if (xtVar3.S()) {
                        f22 = xtVar3.z() * f22;
                    }
                }
                int L = g0.L(3.0f) * ttVar.d;
                int i19 = ttVar.e + L;
                int i20 = L + ttVar.f;
                if (i10 - r5 > i19 + i20) {
                    r5 += i19;
                    i10 -= i20;
                }
                RectF rectF = g0.P;
                rectF.set(ttVar.c, r5, this.C - g0.L(ttVar.d * 12), i10);
                canvas3.save();
                canvas3.scale(f22, f22, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(az.Y0 / 3.0f);
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
            xt xtVar4 = (xt) this.g.get(i21);
            if ((xtVar4 instanceof mu) && (xtVar4.R || xtVar4.S)) {
                mu muVar = (mu) xtVar4;
                int r9 = muVar.X.r();
                bv bvVar = muVar.Y;
                int max2 = Math.max(r9, bvVar != null ? bvVar.r() : 0);
                if (max2 > 0) {
                    boolean z11 = x1Var != null && (this.s || this.u);
                    float max3 = z11 ? Math.max(0.0f, Math.min(1.0f, x1Var.L1)) : 1.0f;
                    float T1 = z11 ? g0.T1(muVar.S ? 1.0f : 0.0f, muVar.R ? 1.0f : 0.0f, max3) : muVar.R ? 1.0f : 0.0f;
                    if (T1 > 0.0f) {
                        float f23 = ((this.C + this.T) - this.S) / 2.0f;
                        float f24 = max2 / 2.0f;
                        float L2 = (f23 - f24) - g0.L(30.0f);
                        float L3 = f23 + f24 + g0.L(30.0f);
                        float T12 = z11 ? g0.T1(muVar.P, muVar.N, max3) : muVar.N;
                        float W1 = z11 ? g0.W1(max3, muVar.Q, muVar.O) : muVar.I();
                        float L4 = g0.L(8.0f) + T12;
                        float L5 = (T12 + W1) - g0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = g0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(az.Y0 / 2.0f);
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
                            i3 = i21;
                            this.i.setBounds(g0.L(8.0f) + i22, g0.L(7.0f) + i23, k5.C(8.0f, i22, intrinsicWidth), k5.C(7.0f, i23, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i24 = (int) L3;
                            int i25 = (int) L5;
                            this.i.setBounds(k5.z(8.0f, i24, intrinsicWidth), k5.z(7.0f, i25, intrinsicHeight), i24 - g0.L(8.0f), i25 - g0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(hs.e4);
                            i21 = i3 + 1;
                        }
                    }
                }
            }
            i3 = i21;
            i21 = i3 + 1;
        }
        zi ziVar = this.b;
        boolean z12 = this.O || (ziVar != null && hp.s1(this.a).s7.A(ziVar));
        if (z12 || this.U != null) {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.u5(0L, 350L, org.telegram.ui.Components.xq.h);
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
                xt xtVar5 = (xt) arrayList4.get(i26);
                if (xtVar5 instanceof du) {
                    du duVar2 = (du) xtVar5;
                    duVar2.e0 = g0.T1(duVar2.P, duVar2.N, f13) + duVar2.I();
                    int i27 = i26 + 1;
                    while (true) {
                        if (i27 >= arrayList4.size()) {
                            f14 = Float.MAX_VALUE;
                            break;
                        }
                        xt xtVar6 = (xt) arrayList4.get(i27);
                        do {
                            xtVar6 = xtVar6.M;
                            if (xtVar6 == null) {
                                f14 = g0.T1(((xt) arrayList4.get(i27)).P, ((xt) arrayList4.get(i27)).N, f13);
                                break;
                            }
                        } while (xtVar6 != duVar2);
                        i27++;
                    }
                    duVar2.f0 = f14;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i28 = 0; i28 < arrayList5.size(); i28++) {
            xt xtVar7 = (xt) arrayList5.get(i28);
            if (xtVar7 instanceof su) {
                su suVar = (su) xtVar7;
                suVar.j0 = g0.T1(suVar.i0 ? 1.0f : 0.0f, suVar.h0 ? 1.0f : 0.0f, f13);
                suVar.k0 = g0.W1(f13, suVar.Q, suVar.O);
            }
        }
        int i29 = 0;
        while (i29 < this.g.size()) {
            xt xtVar8 = (xt) this.g.get(i29);
            if (xtVar8.R || xtVar8.S) {
                float T13 = g0.T1(xtVar8.P, xtVar8.N, f13);
                boolean z16 = xtVar8 instanceof eu;
                float T14 = z16 ? 1.0f : g0.T1(xtVar8.S ? 1.0f : 0.0f, xtVar8.R ? 1.0f : 0.0f, f13);
                if (T14 > 0.0f) {
                    int I2 = xtVar8.I();
                    if (!z14 || (I2 + T13 > f10 && T13 < f11)) {
                        canvas3.save();
                        if (z15 && (duVar = xtVar8.M) != null && !z16) {
                            float f25 = -3.4028235E38f;
                            float f26 = Float.MAX_VALUE;
                            for (duVar = xtVar8.M; duVar != null; duVar = duVar.M) {
                                f25 = Math.max(f25, duVar.e0);
                                f26 = Math.min(f26, duVar.f0);
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
                            xtVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            xtVar8.t(canvas2);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i3 >= arrayList.size()) {
                return;
            }
            xt xtVar = (xt) arrayList.get(i3);
            if (xtVar.R) {
                canvas.save();
                canvas.translate(0.0f, xtVar.N);
                xtVar.s(canvas, colorFilter);
                canvas.restore();
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v67, types: [org.telegram.messenger.ru, org.telegram.messenger.su] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xt j(TL_iv.PageBlock pageBlock, int i3, Rect rect, int i10, boolean z10) {
        int i11;
        TLRPC.Document s6;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        nu nuVar;
        int i12;
        int i13;
        int i14;
        cv cvVar;
        xt xtVar;
        boolean z11;
        cv cvVar2 = this;
        int i15 = i10;
        int i16 = rect.left + rect.right;
        int i17 = cvVar2.B;
        if (i16 >= i17) {
            return null;
        }
        boolean z12 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i18 = 0;
        ArrayList arrayList = cvVar2.g;
        if (z12) {
            uu uuVar = new uu(cvVar2, new Rect(), i17, cvVar2.l(pageBlock.text, 0));
            arrayList.add(uuVar);
            return uuVar;
        }
        if (org.telegram.ui.i4.I(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean I = org.telegram.ui.i4.I(pageBlock);
            ru ruVar = new ru(cvVar2, rect, i17, cvVar2.l(pageBlock.text, R(i15, q(pageBlock))));
            if (I) {
                ruVar.j0(g0.L(10.0f), g0.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                ruVar.j0(z10 ? 0 : g0.L(6.0f), g0.L(6.0f));
            }
            ruVar.G = pageBlock instanceof TL_iv.pageBlockHeading1 ? 2131754030 : pageBlock instanceof TL_iv.pageBlockHeading2 ? 2131754029 : pageBlock instanceof TL_iv.pageBlockHeading3 ? 2131754028 : pageBlock instanceof TL_iv.pageBlockHeading4 ? 2131754027 : pageBlock instanceof TL_iv.pageBlockHeading5 ? 2131754026 : pageBlock instanceof TL_iv.pageBlockHeading6 ? 2131754025 : pageBlock instanceof TL_iv.pageBlockFooter ? 2131754032 : 0;
            arrayList.add(ruVar);
            return ruVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            cv cvVar3 = cvVar2.P;
            if (cvVar3 != null) {
                ArrayList arrayList2 = cvVar3.g;
                int size = arrayList2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size) {
                        xtVar = null;
                        break;
                    }
                    Object obj = arrayList2.get(i19);
                    i19++;
                    xt xtVar2 = (xt) obj;
                    if (lu.class.isInstance(xtVar2) && (xtVar2 instanceof lu)) {
                        String str = ((lu) xtVar2).o0;
                        String x10 = x(pageBlock.text);
                        if (str != null && x10 != null) {
                            if (str.length() <= x10.length() && x10.length() > 0) {
                                z11 = x10.startsWith(str);
                                if (!z11) {
                                    xtVar = (xt) lu.class.cast(xtVar2);
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
                xtVar = null;
            }
            lu luVar = new lu(cvVar2, rect, cvVar2.B, pageblockpreformatted, (lu) xtVar);
            luVar.G = 2131754055;
            arrayList.add(luVar);
            return luVar;
        }
        boolean z13 = pageBlock instanceof TL_iv.pageBlockList;
        TextPaint textPaint = cvVar2.x;
        if (z13) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i20 = i3 + 1;
            textPaint.setTextSize(g0.L(az.W0));
            int L = g0.L(16.0f);
            for (int i21 = 0; i21 < pageblocklist.items.size(); i21++) {
                L = Math.max(L, pageblocklist.items.get(i21).checkbox ? g0.L(26.0f) : g0.L(16.0f));
            }
            Rect rect2 = new Rect(rect);
            if (cvVar2.I()) {
                rect2.right += L;
            } else {
                rect2.left += L;
            }
            int i22 = 0;
            while (i22 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i22);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    ru ruVar2 = new ru(cvVar2, new Rect(rect2), i17, cvVar2.l(tL_pageListItemText.text, i15));
                    ruVar2.n = L;
                    if (tL_pageListItemText.checkbox) {
                        ruVar2.b0(tL_pageListItemText, tL_pageListItemText.checked);
                    } else {
                        ruVar2.c0("•◦▪".charAt(i3 % 3) + "");
                    }
                    boolean z14 = tL_pageListItemText.checkbox;
                    boolean z15 = tL_pageListItemText.checked;
                    ruVar2.w = i20;
                    ruVar2.x = false;
                    ruVar2.y = z14;
                    ruVar2.E = z15;
                    arrayList.add(ruVar2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        int size2 = arrayList.size();
                        int i23 = 0;
                        boolean z16 = false;
                        while (i23 < tL_pageListItemBlocks.blocks.size()) {
                            int i24 = i23;
                            xt j10 = j(tL_pageListItemBlocks.blocks.get(i23), i20, new Rect(rect2), i15, O(i23, tL_pageListItemBlocks.blocks));
                            int i25 = i20;
                            if (j10 != null && !z16) {
                                j10.n = L;
                                if (tL_pageListItemBlocks.checkbox) {
                                    j10.b0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                } else {
                                    j10.c0("•◦▪".charAt(i3 % 3) + "");
                                }
                                boolean z17 = tL_pageListItemBlocks.checkbox;
                                boolean z18 = tL_pageListItemBlocks.checked;
                                j10.w = i25;
                                j10.x = false;
                                j10.y = z17;
                                j10.E = z18;
                                z16 = true;
                            }
                            i20 = i25;
                            i23 = i24 + 1;
                            cvVar2 = this;
                        }
                        i14 = i20;
                        cvVar = cvVar2;
                        int size3 = arrayList.size();
                        for (int i26 = size2; i26 < size3; i26++) {
                            xt xtVar3 = (xt) arrayList.get(i26);
                            if (xtVar3.w == 0) {
                                xtVar3.w = i14;
                                xtVar3.x = false;
                            }
                        }
                        i22++;
                        cvVar2 = cvVar;
                        i20 = i14;
                    }
                }
                i14 = i20;
                cvVar = cvVar2;
                i22++;
                cvVar2 = cvVar;
                i20 = i14;
            }
            return null;
        }
        cv cvVar4 = cvVar2;
        boolean z19 = true;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i27 = i3 + 1;
            textPaint.setTextSize(g0.L(az.W0));
            new TextPaint(textPaint).setTypeface(g0.o());
            int L2 = g0.L(16.0f);
            for (int i28 = 0; i28 < pageblockorderedlist.items.size(); i28++) {
                L2 = Math.max(L2, g0.L(8.0f) + ((int) Math.ceil(r1.measureText(N(pageblockorderedlist, r12, i28)))) + (pageblockorderedlist.items.get(i28).checkbox ? g0.L(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (cvVar4.I()) {
                rect3.right += L2;
            } else {
                rect3.left += L2;
            }
            int i29 = 0;
            while (i29 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i29);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    ru ruVar3 = new ru(cvVar4, new Rect(rect3), i17, cvVar4.l(tL_pageListOrderedItemText.text, i15));
                    ruVar3.n = L2;
                    ruVar3.c0(N(pageblockorderedlist, tL_pageListOrderedItemText, i29));
                    if (tL_pageListOrderedItemText.checkbox) {
                        ruVar3.b0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                    }
                    boolean z20 = tL_pageListOrderedItemText.checkbox;
                    boolean z21 = tL_pageListOrderedItemText.checked;
                    ruVar3.w = i27;
                    ruVar3.x = z19;
                    ruVar3.y = z20;
                    ruVar3.E = z21;
                    arrayList.add(ruVar3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int i30 = i18;
                        int i31 = i30;
                        while (i30 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            cv cvVar5 = cvVar4;
                            int i32 = i27;
                            int i33 = i30;
                            xt j11 = cvVar5.j(tL_pageListOrderedItemBlocks.blocks.get(i30), i32, new Rect(rect3), i15, O(i30, tL_pageListOrderedItemBlocks.blocks));
                            cvVar4 = cvVar5;
                            i27 = i32;
                            int i34 = i15;
                            if (j11 != null && i31 == 0) {
                                j11.n = L2;
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j11.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                j11.c0(N(pageblockorderedlist, tL_pageListOrderedItemBlocks, i29));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j11.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                boolean z22 = tL_pageListOrderedItemBlocks.checkbox;
                                boolean z23 = tL_pageListOrderedItemBlocks.checked;
                                j11.w = i27;
                                j11.x = true;
                                j11.y = z22;
                                j11.E = z23;
                                i31 = 1;
                            }
                            i30 = i33 + 1;
                            i15 = i34;
                        }
                        i13 = i15;
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            xt xtVar4 = (xt) arrayList.get(size5);
                            if (xtVar4.w == 0) {
                                xtVar4.w = i27;
                                xtVar4.x = true;
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
        ArrayList arrayList3 = cvVar4.h;
        if (z24) {
            int i36 = rect.left;
            int size6 = arrayList.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder l10 = cvVar4.l(pageBlock.text, R(i35, q(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            SpannableStringBuilder l11 = (richText == null || TextUtils.isEmpty(x(richText))) ? null : cvVar4.l(pageblockblockquote2.caption, R(i35, 11));
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
                ?? suVar = new su(cvVar4, new Rect(g0.L(12.0f) + rect.left, g0.L(4.0f) + rect.top, g0.L(20.0f) + rect.right, g0.L(4.0f) + rect.bottom), cvVar4.B, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                suVar.c0 = i37;
                suVar.j0(g0.L(8.0f), g0.L(8.0f));
                nuVar = suVar;
            } else {
                pageblockblockquote = pageblockblockquote2;
                nuVar = new nu(cvVar4, new Rect(g0.L(12.0f) + rect.left, g0.L(12.0f) + rect.top, g0.L(12.0f) + rect.right, g0.L(14.0f) + rect.bottom), cvVar4.B, l10, l11, Layout.Alignment.ALIGN_NORMAL);
            }
            nuVar.G = 2131753996;
            arrayList.add(nuVar);
            arrayList3.add(new tt(size6, arrayList.size() - 1, i36, i3, g0.L(8.0f), pageblockblockquote.collapsed ? g0.L(8.0f) : 0));
            return nuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i38 = rect.left;
            int i39 = i3 + 1;
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
                ((xt) arrayList.get(size7)).F = 2131753996;
            }
            if (z25) {
                ru ruVar4 = new ru(this, new Rect(g0.L(12.0f) + rect.left, rect.top, g0.L(12.0f) + rect.right, g0.L(6.0f) + rect.bottom), i17, new SpannableStringBuilder(l(pageblockblockquoteblocks.caption, R(i42, 11))));
                ruVar4.c0 = 0;
                ruVar4.j0(g0.L(2.0f), 0);
                arrayList.add(ruVar4);
            }
            arrayList3.add(new tt(size7, arrayList.size() - 1, i38, i3, 0, 0));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder l12 = l(pageBlock.text, R(i35, q(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            mu muVar = new mu(this, new Rect(g0.L(30.0f) + rect.left, g0.L(16.0f) + rect.top, g0.L(30.0f) + rect.right, g0.L(16.0f) + rect.bottom), this.B, l12, (richText3 == null || TextUtils.isEmpty(x(richText3))) ? null : l(pageblockpullquote.caption, R(i35, 11)), Layout.Alignment.ALIGN_CENTER);
            muVar.G = 2131753997;
            arrayList.add(muVar);
            return muVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            zt ztVar = new zt(this, rect, i17, (TL_iv.pageBlockButtonRow) pageBlock);
            ztVar.G = 2131754872;
            arrayList.add(ztVar);
            return ztVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            try {
                qu quVar = new qu(this, rect, i17, (TL_iv.pageBlockTable) pageBlock);
                quVar.G = 2131754855;
                arrayList.add(quVar);
                return quVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            iu iuVar = new iu(this, rect, i17, (TL_iv.pageBlockMath) pageBlock);
            arrayList.add(iuVar);
            return iuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            fu fuVar = new fu(this, rect, i17);
            arrayList.add(fuVar);
            return fuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            ku kuVar = new ku(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
            arrayList.add(kuVar);
            k(pageblockphoto.caption, rect, i35);
            return kuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            wu wuVar = new wu(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
            arrayList.add(wuVar);
            k(pageblockvideo.caption, rect, i35);
            return wuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            cu cuVar = new cu(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
            arrayList.add(cuVar);
            k(pageblockcollage.caption, rect, i35);
            return cuVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            ou ouVar = new ou(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
            arrayList.add(ouVar);
            k(pageblockslideshow.caption, rect, i35);
            return ouVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            hu huVar = new hu(this, rect, i17, pageblockmap);
            arrayList.add(huVar);
            k(pageblockmap.caption, rect, i35);
            return huVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            HashMap hashMap = this.m;
            if (((zi) hashMap.get(pageblockaudio)) == null && (s6 = s(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i43 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i43;
                tL_message.id = i43;
                zi ziVar = this.b;
                tL_message.realId = ziVar.M1();
                tL_message.dialog_id = zi.B0(ziVar.k);
                TLRPC.Peer peer = ziVar.k.peer_id;
                tL_message.peer_id = peer;
                int i44 = this.a;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = h10.i(i44).e();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = h10.i(i44).e();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = s6;
                tL_message.flags |= 768;
                zi ziVar2 = new zi(i44, tL_message, false, true);
                this.l.add(ziVar2);
                hashMap.put(pageblockaudio, ziVar2);
            }
            vt vtVar = new vt(this, rect, i17, pageblockaudio);
            arrayList.add(vtVar);
            k(pageblockaudio.caption, rect, i35);
            return vtVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            gu guVar = new gu(this, rect, i17, pageblockdocument);
            arrayList.add(guVar);
            k(pageblockdocument.caption, rect, i35);
            return guVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return j(((TL_iv.pageBlockCover) pageBlock).cover, i3, rect, i35, false);
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
            AtomicInteger atomicInteger = gk0.t0;
            if (pageblockembed.html != null && org.telegram.utils.twidget.p.n(pageblockembed.url)) {
                if (org.telegram.utils.twidget.p.n(pageblockembed.url)) {
                    String str3 = pageblockembed.url;
                    int j02 = (gk0.j0() * 2) + i17;
                    org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str3) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str3) : null;
                    if (mVar != null && (i11 = mVar.e) != 0) {
                        j02 = Math.min(j02, g0.L(Math.max(hs.e3, i11)));
                    }
                    i17 = j02 - (gk0.j0() * 2);
                }
                gk0 gk0Var = new gk0(this, rect, i17, pageblockembed, arrayList.isEmpty());
                arrayList.add(gk0Var);
                k(pageblockembed.caption, rect, i35);
                return gk0Var;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int L3 = x7.u.a(i35, 9) ? g0.L(6.0f) : i3 > 0 ? g0.L(4.0f) : 0;
            vu vuVar = new vu(this, new Rect((rect.left + L3) - g0.L(7.0f), Math.max(g0.L(14.0f), rect.top), (rect.right + L3) - g0.L(7.0f), Math.max(g0.L(14.0f), rect.bottom)), this.B, arrayList.size(), i3);
            this.e.add(vuVar);
            if (i3 == 0) {
                this.f.add(vuVar);
            }
            arrayList.add(vuVar);
            return vuVar;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            boolean z26 = r2.a;
            return null;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        du duVar = new du(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i35 & (-17)));
        arrayList.add(duVar);
        for (int i45 = 0; i45 < pageblockdetails.blocks.size(); i45++) {
            j(pageblockdetails.blocks.get(i45), i3 + 1, rect, i35, O(i45, pageblockdetails.blocks));
        }
        arrayList.add(new eu(this, new Rect(rect.left, 0, rect.right, 0), i17));
        for (int size8 = arrayList.size(); size8 < arrayList.size(); size8++) {
            xt xtVar5 = (xt) arrayList.get(size8);
            if (xtVar5.M == null) {
                xtVar5.M = duVar;
            }
        }
        return duVar;
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i3) {
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
            int R = R(i3, 10);
            this.g.add(new bu(this, rect, this.B, z11 ? l(pageCaption.text, R) : null, z10 ? l(pageCaption.credit, R) : null));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i3 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i3, new yu(this, i3, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new ut(richText, i3), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i3) {
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j10 = mi.d6.j(textdiff.text);
                    boolean j11 = mi.d6.j(textdiff.old_text);
                    if (j10 && !j11) {
                        n(textdiff.old_text, spannableStringBuilder, i3, new uy0(z(TLObject.FLAG_13), 0));
                    } else if (!j10 && j11) {
                        n(textdiff.text, spannableStringBuilder, i3, new uy0(z(TLObject.FLAG_12), 0));
                    } else if (!j10) {
                        n(textdiff.text, spannableStringBuilder, i3, new du0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i10 = i3 | 16;
                    n(richText.text, spannableStringBuilder, i10, new yu(this, i10, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i11 = i3 | 32;
                    n(richText.text, spannableStringBuilder, i11, new yu(this, i11, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i12 = i3 | 64;
                    n(richText.text, spannableStringBuilder, i12, new yu(this, i12, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i13 = i3 | 128;
                    n(richText.text, spannableStringBuilder, i13, new yu(this, i13, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i14 = i3 | 256;
                    n(richText.text, spannableStringBuilder, i14, new yu(this, i14, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i3, new x31(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    n(richText.text, spannableStringBuilder, i3, new x31("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                        m(richText.texts.get(i15), spannableStringBuilder, i3);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i16 = i3 | 2048;
                    n(richText.text, spannableStringBuilder, i16, new yu(this, i16, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i17 = i3 | TLObject.FLAG_12;
                    n(richText.text, spannableStringBuilder, i17, new yu(this, i17, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i18 = i3 | TLObject.FLAG_13;
                    n(richText.text, spannableStringBuilder, i18, new yu(this, i18, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = mf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = t4.c.f("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("tel:", d), z(1024)));
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
                    n(richText2, spannableStringBuilder, i3, new gi.t9(3));
                } else if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        mi.q a10 = mi.q.a(textmath.source, g0.L(this.M + 4), true);
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
                        spannableStringBuilder.setSpan(new my0(null, textmath.bitmap, textmath.w, textmath.h, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.D), textmath.depth), length2, length3, 33);
                        String str3 = textmath.source;
                        if (str3 != null && !str3.isEmpty()) {
                            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n9(textmath.source), length2, length3, 33);
                        }
                    }
                } else if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(charSequence);
                    int length5 = spannableStringBuilder.length();
                    boolean a11 = x7.u.a(i3, 13);
                    int i19 = i3 & 15;
                    if (i19 < 1 || i19 > 6) {
                        size = new org.telegram.ui.Components.p5(textcustomemoji.document_id, a11 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(g0.L(this.M + 4 + (a11 ? -2 : 4)));
                    } else {
                        TextPaint textPaint = new TextPaint(this.w);
                        new yu(this, i3, true).a(textPaint);
                        size = new org.telegram.ui.Components.p5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                    }
                    spannableStringBuilder.setSpan(size, length4, length5, 33);
                } else if (richText instanceof TL_iv.textSpoiler) {
                    n(richText.text, spannableStringBuilder, i3, new uy0(z(256), 0));
                } else if (richText instanceof TL_iv.textMention) {
                    TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                    ty0 ty0Var = new ty0();
                    ty0Var.d = tL_messageEntityMention;
                    n(richText.text, spannableStringBuilder, i3, new v31(x(richText), ty0Var));
                } else if (richText instanceof TL_iv.textHashtag) {
                    TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                    ty0 ty0Var2 = new ty0();
                    ty0Var2.d = tL_messageEntityHashtag;
                    n(richText.text, spannableStringBuilder, i3, new v31(x(richText), ty0Var2));
                } else if (richText instanceof TL_iv.textBotCommand) {
                    n(richText.text, spannableStringBuilder, i3, new s31(x(richText), E() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textCashtag) {
                    TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                    ty0 ty0Var3 = new ty0();
                    ty0Var3.d = tL_messageEntityCashtag;
                    n(richText.text, spannableStringBuilder, i3, new v31(x(richText), ty0Var3));
                } else if (richText instanceof TL_iv.textAutoUrl) {
                    n(richText.text, spannableStringBuilder, i3, new x31(x(richText), z(1024)));
                } else if (richText instanceof TL_iv.textAutoEmail) {
                    n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("mailto:", x(richText)), z(1024)));
                } else if (richText instanceof TL_iv.textAutoPhone) {
                    String x10 = x(richText);
                    String d10 = mf.b.d(x10, false);
                    if (x10.startsWith("+")) {
                        d10 = t4.c.f("+", d10);
                    }
                    n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("tel:", d10), z(1024)));
                } else if (richText instanceof TL_iv.textTonAddress) {
                    n(richText.text, spannableStringBuilder, i3, new v31(t4.c.f("tonaddress:", x(richText)), (ty0) null));
                } else if (richText instanceof TL_iv.textBankCard) {
                    n(richText.text, spannableStringBuilder, i3, new v31(t4.c.f("card:", x(richText)), (ty0) null));
                } else if (richText instanceof TL_iv.textMentionName) {
                    n(richText.text, spannableStringBuilder, i3, new y31("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
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
                    int i20 = i3 | 512;
                    TL_iv.RichText richText3 = richText.text;
                    yu yuVar = new yu(this, i20, false);
                    org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(x(richText), null, tL_messageEntityFormattedDate);
                    int length6 = spannableStringBuilder.length();
                    m(richText3, spannableStringBuilder, i20);
                    if (spannableStringBuilder.length() > length6) {
                        U(yuVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                        U(vzVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                    }
                } else if (richText instanceof TL_iv.textButton) {
                    int length7 = spannableStringBuilder.length();
                    spannableStringBuilder.append("*");
                    au auVar = new au(this, this.B, (TL_iv.textButton) richText, null);
                    auVar.d = 1.2f;
                    spannableStringBuilder.setSpan(auVar, length7, spannableStringBuilder.length(), 33);
                }
            }
        }
        IdentityHashMap identityHashMap = this.Y;
        if (identityHashMap == null || richText == null) {
            return;
        }
        identityHashMap.put(richText, new int[]{length, spannableStringBuilder.length()});
    }

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i3, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i3);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i3, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i3);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((xt) arrayList.get(i3)).p(arrayList2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((lg0) arrayList2.get(i10)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i3, org.telegram.ui.Cells.x1 x1Var) {
        ArrayList arrayList = this.g;
        if (i3 >= 0 && i3 < arrayList.size() && x1Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            xt xtVar = (xt) arrayList.get(i3);
            return Math.round(g0.T1(xtVar.P, xtVar.N, max));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            xt xtVar2 = (xt) arrayList.get(i11);
            boolean S = xtVar2.S();
            if (i11 == i3) {
                return i10;
            }
            if (S) {
                i10 = ((x1Var == null || !(this.s || this.u)) ? xtVar2.I() : g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), xtVar2.Q, xtVar2.O)) + i10;
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
        int i3 = 0;
        while (i3 < size) {
            TLRPC.Document document = arrayList.get(i3);
            i3++;
            TLRPC.Document document2 = document;
            if (document2.id == j10) {
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

    public final TLRPC.Photo v(long j10) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.Photo photo = arrayList.get(i3);
            i3++;
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
    public final String w(int i3, int i10) {
        int min;
        int max;
        int i11;
        xt xtVar;
        int i12;
        String str;
        cv cvVar = this;
        ArrayList arrayList = cvVar.n;
        if (arrayList.isEmpty() || (max = Math.max(i3, i10)) <= (min = Math.min(i3, i10))) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        int i14 = -1;
        while (i13 < arrayList.size()) {
            Layout a10 = ((org.telegram.ui.Cells.s9) arrayList.get(i13)).a();
            if (a10 == null || a10.getText() == null) {
                i11 = min;
            } else {
                CharSequence text = a10.getText();
                ArrayList arrayList4 = cvVar.o;
                int intValue = i13 < arrayList4.size() ? ((Integer) arrayList4.get(i13)).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    ArrayList arrayList5 = cvVar.p;
                    int intValue2 = i13 < arrayList5.size() ? ((Integer) arrayList5.get(i13)).intValue() : -1;
                    if (intValue2 >= 0) {
                        ArrayList arrayList6 = cvVar.g;
                        if (intValue2 < arrayList6.size()) {
                            xtVar = (xt) arrayList6.get(intValue2);
                            String str2 = "";
                            if (xtVar instanceof qu) {
                                ArrayList P = cvVar.P(intValue2);
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
                                    int i18 = !(xtVar instanceof ru) ? ((ru) xtVar).c0 : -1;
                                    boolean z10 = !(xtVar instanceof tu) && ((tu) xtVar).Y == arrayList.get(i13);
                                    i12 = xtVar == null ? xtVar.w : 0;
                                    if (i12 > 0 || i18 >= 0) {
                                        d(sb2, arrayList3);
                                        if (!(xtVar instanceof lu)) {
                                            SpannableStringBuilder a02 = a0(text.subSequence(i16, i17));
                                            String str3 = ((lu) xtVar).q0;
                                            StringBuilder sb3 = new StringBuilder();
                                            mi.b4.g(sb3, a02);
                                            String sb4 = sb3.toString();
                                            if (!sb4.isEmpty()) {
                                                StringBuilder sb5 = new StringBuilder();
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb5.append("<pre>");
                                                } else {
                                                    sb5.append("<pre language=\"");
                                                    sb5.append(mi.b4.s(str3));
                                                    sb5.append("\">");
                                                }
                                                str2 = a1.g.s(sb5, sb4, "</pre>");
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
                                        boolean z11 = xtVar.x;
                                        while (true) {
                                            str = "</ul>";
                                            if (arrayList3.size() <= i12) {
                                                break;
                                            }
                                            if (((Boolean) org.telegram.ui.Cells.f1.o(1, arrayList3)).booleanValue()) {
                                                str = "</ol>";
                                            }
                                            sb2.append(str);
                                        }
                                        while (arrayList3.size() < i12) {
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        if (!arrayList3.isEmpty() && ((Boolean) k2.p1.h(1, arrayList3)).booleanValue() != z11) {
                                            sb2.append(((Boolean) org.telegram.ui.Cells.f1.o(1, arrayList3)).booleanValue() ? "</ol>" : "</ul>");
                                            sb2.append(z11 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z11));
                                        }
                                        sb2.append("<li");
                                        if (xtVar.y) {
                                            sb2.append(" data-checkbox=\"1\"");
                                            if (xtVar.E) {
                                                sb2.append(" data-checked=\"1\"");
                                            }
                                        }
                                        sb2.append('>');
                                        SpannableStringBuilder a03 = a0(text.subSequence(i16, i17));
                                        StringBuilder sb6 = new StringBuilder();
                                        mi.b4.g(sb6, a03);
                                        sb2.append(sb6.toString());
                                        sb2.append("</li>");
                                    }
                                }
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, P);
                                int i162 = max2 - intValue;
                                int i172 = min2 - intValue;
                                if (!(xtVar instanceof ru)) {
                                }
                                if (xtVar instanceof tu) {
                                }
                                if (xtVar == null) {
                                }
                                if (i12 > 0) {
                                }
                                d(sb2, arrayList3);
                                if (!(xtVar instanceof lu)) {
                                }
                            } else if (intValue2 != i14) {
                                d(sb2, arrayList3);
                                Z(sb2, arrayList2, cvVar.P(intValue2));
                                TL_iv.pageBlockTable pageblocktable = ((qu) xtVar).X;
                                if (pageblocktable != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    mi.b4.H(sb7, pageblocktable);
                                    str2 = sb7.toString();
                                }
                                sb2.append(str2);
                                i11 = min;
                                i14 = intValue2;
                            }
                        }
                    }
                    xtVar = null;
                    String str22 = "";
                    if (xtVar instanceof qu) {
                    }
                }
                i11 = min;
            }
            i13++;
            cvVar = this;
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

    public cv(int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.y = new dk0(null);
        this.z = new k4.j(24);
        this.K = new RectF();
        this.b = null;
        this.a = i3;
        this.B = i10;
        this.D = e6Var;
        this.M = az.W0;
        this.N = g0.p;
        textPaint.setTextSize(g0.L(r6));
        textPaint2.setTextSize(g0.L(this.M));
    }
}
