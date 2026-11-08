package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class q11 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public static String[] b2;
    public final ArrayList A0;
    public String A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public int D;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ValueAnimator F1;
    public v01 G;
    public final ArrayList G0;
    public boolean G1;
    public o11 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public tz0 J1;
    public final HashSet K;
    public final ArrayList K0;
    public di.z5 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public a11 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public int P1;
    public boolean Q;
    public boolean Q0;
    public long Q1;
    public boolean R;
    public List R0;
    public bi.ud R1;
    public final ArrayList S;
    public a11 S0;
    public final tz0 S1;
    public boolean T;
    public boolean T0;
    public final tz0 T1;
    public r01 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.i5 W0;
    public ValueAnimator W1;
    public g01 X0;
    public final h2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.f6 Z0;
    public Integer Z1;
    public int a;
    public final l01 a0;
    public float a1;
    public int b;
    public final fi.p5 b0;
    public float b1;
    public int c;
    public final org.telegram.ui.Components.bv[] c0;
    public final org.telegram.ui.ActionBar.f2 c1;
    public int d;
    public org.telegram.ui.Components.bv d0;
    public final int d1;
    public int e;
    public final j01 e0;
    public final p01 e1;
    public int f;
    public final i01 f0;
    public int f1;
    public final sq0 g0;
    public boolean g1;
    public int h;
    public final o01 h0;
    public boolean h1;
    public final e01 i0;
    public ValueAnimator i1;
    public final FrameLayout j0;
    public Drawable j1;
    public final bi.x5 k0;
    public PorterDuffColorFilter k1;
    public final org.telegram.ui.Components.l9 l0;
    public final boolean l1;
    public final View m0;
    public float m1;
    public int n;
    public final org.telegram.ui.Components.tm n0;
    public int n1;
    public final View o0;
    public org.telegram.ui.Components.g5 o1;
    public final q01 p0;
    public Rect p1;
    public final b11 q0;
    public View q1;
    public int r;
    public final f01 r0;
    public float r1;
    public int s;
    public final org.telegram.ui.Components.ri0 s0;
    public a11 s1;
    public final View t0;
    public Rect t1;
    public int u0;
    public final OvershootInterpolator u1;
    public final ArrayList v0;
    public ValueAnimator v1;
    public int w;
    public final SparseIntArray w0;
    public boolean w1;
    public int x;
    public final SparseIntArray x0;
    public boolean x1;
    public int y;
    public final SparseIntArray y0;
    public boolean y1;
    public final SparseIntArray z0;
    public boolean z1;
    public static final List a2 = Arrays.asList("😖", "😫", "\u1fae0", "😨", "❓");
    public static final boolean[] c2 = new boolean[4];
    public static final HashMap d2 = new HashMap();

    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        this(f2Var, context, z9, num, i7, true, f6Var, 16);
    }

    public static void D(int i7, org.telegram.ui.Components.l9 l9Var) {
        List list;
        org.telegram.messenger.hc b10;
        String str;
        if (l9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i7).s0[1]);
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            list = a2;
            if (i10 >= size) {
                break;
            }
            if ((arrayList.get(i10) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i10)).documents);
                Collections.shuffle(arrayList2);
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList2.size()) {
                        break;
                    }
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                    if (document2 != null && list.contains(org.telegram.messenger.ij.V(document2, null, null))) {
                        int i12 = round - 1;
                        if (round <= 0) {
                            round = i12;
                            document = document2;
                            break;
                        } else {
                            round = i12;
                            document = document2;
                        }
                    }
                    i11++;
                }
            }
            if (document != null && round <= 0) {
                break;
            } else {
                i10++;
            }
        }
        if (document == null || round > 0) {
            ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ui.b0(i7).s0(5));
            Collections.shuffle(arrayList3);
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                if (arrayList3.get(i13) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).documents);
                    Collections.shuffle(arrayList4);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList4.size()) {
                            break;
                        }
                        TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i14);
                        if (document3 != null && list.contains(org.telegram.messenger.ij.V(document3, null, null))) {
                            int i15 = round - 1;
                            if (round <= 0) {
                                round = i15;
                                document = document3;
                                break;
                            } else {
                                round = i15;
                                document = document3;
                            }
                        }
                        i14++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
            }
        }
        if (document != null) {
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.hc.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "36_36_g";
            } else {
                if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.hc.b(document);
                str = "36_36";
            }
            l9Var.setLayerNum(7);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            l9Var.m(b10, str, org.telegram.messenger.hc.c(w10, document), "36_36", d, document);
        }
    }

    public static void a(q11 q11Var, int i7, int i10) {
        org.telegram.ui.Components.ri0 ri0Var = q11Var.s0;
        f01 f01Var = q11Var.r0;
        View m10 = f01Var.m(i7);
        int L0 = f01Var.L0();
        if ((m10 == null && Math.abs(i7 - L0) > 72.0f) || !org.telegram.messenger.iz.c()) {
            ri0Var.b = f01Var.L0() < i7 ? 0 : 1;
            ri0Var.d(i7, i10, false, false);
        } else {
            fi.j1 j1Var = new fi.j1(4, q11Var.h0.getContext(), q11Var);
            j1Var.a = i7;
            j1Var.p = i10;
            f01Var.w0(j1Var);
        }
    }

    public static boolean c(q11 q11Var) {
        if (q11Var.T) {
            return true;
        }
        ValueAnimator valueAnimator = q11Var.V1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i7 = 13;
        int i10 = this.W;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.i5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i7 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        if (this.j1 == null) {
            int i7 = this.W;
            if (i7 == 5 || i7 == 9 || i7 == 10 || i7 == 7) {
                this.j1 = jg.g.h(org.telegram.messenger.t0.b, R.drawable.msg_filled_blocked);
            } else {
                this.j1 = jg.g.h(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
            }
            this.j1.setColorFilter(this.k1);
        }
        return this.j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i7 = 0;
        while (i7 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i7);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i7);
                i7--;
            }
            i7++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.i6.c(str);
        int i7 = 0;
        while (true) {
            if (i7 >= tL_messages_stickerSet.packs.size()) {
                j3 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i7).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.i6.c(tL_messages_stickerSet.packs.get(i7).emoticon), c10)) {
                j3 = tL_messages_stickerSet.packs.get(i7).documents.get(0).longValue();
                break;
            }
            i7++;
        }
        if (j3 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.id == j3) {
                return document;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.i5 i5Var) {
        org.telegram.ui.Components.i5 i5Var2;
        if (this.I && (i5Var2 = this.W0) != i5Var) {
            if (i5Var2 != null) {
                i5Var2.n(this);
            }
            this.W0 = i5Var;
            if (i5Var != null) {
                i5Var.setColorFilter(this.k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i7) {
        boolean[] zArr = c2;
        if (zArr[i7]) {
            return;
        }
        org.telegram.messenger.ui.b0(i7);
        zArr[i7] = true;
        org.telegram.messenger.ui.b0(i7).B(5);
        org.telegram.messenger.ui.b0(i7).L(0, true);
        org.telegram.messenger.ui.b0(i7).A();
        org.telegram.messenger.ui.b0(i7).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        org.telegram.messenger.ui.b0(i7).P();
        org.telegram.messenger.ui.b0(i7).v();
        org.telegram.ui.Components.yu0.E3.c(i7, 1, new di.f(i7, 1));
    }

    public final void A(Long l10) {
        this.K.remove(l10);
        o01 o01Var = this.h0;
        if (o01Var != null) {
            int i7 = 0;
            boolean z9 = false;
            for (int i10 = 0; i10 < o01Var.getChildCount(); i10++) {
                if (o01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i10);
                    org.telegram.ui.Components.r5 r5Var = a11Var.e;
                    if (r5Var == null || r5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = a11Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            a11Var.f();
                        }
                    } else {
                        a11Var.f();
                    }
                    z9 = true;
                }
            }
            o01Var.invalidate();
            if (z9) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.v0;
                if (i7 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i7)).longValue();
                if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                    break;
                } else {
                    i7++;
                }
            }
            q01 q01Var = this.p0;
            if (q01Var != null) {
                q01Var.g(i7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bc, code lost:
    
        if (r12 == 4) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x087c, code lost:
    
        if (r8 != false) goto L376;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0461 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04f1 A[LOOP:5: B:123:0x04eb->B:125:0x04f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0af2 A[LOOP:13: B:269:0x0aea->B:271:0x0af2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b6e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b7a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x02ee A[LOOP:30: B:536:0x02e6->B:538:0x02ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0313 A[LOOP:31: B:541:0x030d->B:543:0x0313, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0405 A[LOOP:2: B:79:0x03ff->B:81:0x0405, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z9, boolean z10, boolean z11) {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z12;
        ArrayList arrayList;
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList2;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList P;
        int i13;
        int i14;
        ArrayList arrayList4;
        int size;
        int i15;
        ArrayList arrayList5;
        int i16;
        o01 o01Var;
        int i17;
        SparseIntArray sparseIntArray3;
        HashSet hashSet2;
        org.telegram.messenger.ui uiVar;
        int i18;
        ArrayList arrayList6;
        TLRPC.StickerSet stickerSet;
        int i19;
        boolean z13;
        ArrayList<TLRPC.Document> arrayList7;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID;
        org.telegram.ui.Components.uw uwVar;
        int i20;
        SparseIntArray sparseIntArray4;
        ArrayList arrayList8;
        int i21;
        SparseIntArray sparseIntArray5;
        SparseIntArray sparseIntArray6;
        TLRPC.StickerSet stickerSet2;
        boolean z14;
        ArrayList arrayList9;
        int i22;
        int i23;
        int i24;
        boolean z15;
        int i25;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList10;
        boolean z16 = !this.P ? false : z10;
        int i26 = this.V;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i26);
        if (z9 || this.L0 == null) {
            this.L0 = new ArrayList(b02.s0(this.Q ? 0 : 5));
        }
        ArrayList arrayList11 = this.L0;
        ArrayList arrayList12 = new ArrayList(b02.s0[1]);
        ArrayList arrayList13 = this.v0;
        ArrayList arrayList14 = new ArrayList(arrayList13);
        this.u0 = 0;
        this.f = -1;
        this.b = -1;
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.h = -1;
        this.n = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        ArrayList arrayList15 = this.D0;
        arrayList15.clear();
        this.K0.clear();
        ArrayList arrayList16 = this.H0;
        arrayList16.clear();
        ArrayList arrayList17 = this.I0;
        arrayList17.clear();
        ArrayList arrayList18 = this.M0;
        arrayList18.clear();
        SparseIntArray sparseIntArray7 = this.w0;
        sparseIntArray7.clear();
        SparseIntArray sparseIntArray8 = this.x0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.y0;
        sparseIntArray9.clear();
        arrayList13.clear();
        boolean z17 = z16;
        SparseIntArray sparseIntArray10 = this.z0;
        sparseIntArray10.clear();
        org.telegram.messenger.ui uiVar2 = b02;
        this.S.clear();
        ArrayList arrayList19 = this.F0;
        arrayList19.clear();
        ArrayList arrayList20 = this.G0;
        arrayList20.clear();
        SparseIntArray sparseIntArray11 = sparseIntArray10;
        ArrayList arrayList21 = this.E0;
        arrayList21.clear();
        boolean isEmpty = arrayList11.isEmpty();
        ArrayList arrayList22 = arrayList12;
        int i27 = this.W;
        if (isEmpty) {
            sparseIntArray = sparseIntArray8;
        } else {
            sparseIntArray = sparseIntArray8;
        }
        if (i27 != 5 && i27 != 7 && i27 != 8) {
            int i28 = this.u0;
            sparseIntArray2 = sparseIntArray7;
            this.u0 = i28 + 1;
            this.a = i28;
            arrayList13.add(9L);
            z12 = this.N0;
            if (i27 != 5 || i27 == 7) {
                arrayList = arrayList11;
                i7 = z12 ? 1 : 0;
                if (i7 != 0) {
                    this.u0++;
                    arrayList13.add(2L);
                }
                tL_emojiList = org.telegram.messenger.ui.b0(i26).L1;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i10 = 0;
                    while (i10 < tL_emojiList.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.r5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                        i10++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i11 = 0; i11 < arrayList15.size(); i11++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.r5) arrayList15.get(i11)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            } else if (i27 != 4) {
                arrayList = arrayList11;
                i7 = z12 ? 1 : 0;
                if (i27 == 6) {
                    if (i7 != 0) {
                        this.u0++;
                        arrayList13.add(2L);
                    }
                    ArrayList arrayList23 = org.telegram.messenger.ui.b0(i26).n;
                    for (int i29 = 0; i29 < arrayList23.size(); i29++) {
                        arrayList19.add(((TLRPC.TL_availableReaction) arrayList23.get(i29)).activate_animation);
                    }
                    int i30 = 0;
                    while (i30 < arrayList19.size()) {
                        arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i30)).id * 13) + 62425));
                        this.u0++;
                        i30++;
                        arrayList19 = arrayList19;
                    }
                } else if (i27 == 3) {
                    int i31 = this.u0;
                    this.u0 = i31 + 1;
                    this.y = i31;
                    arrayList13.add(12L);
                    int i32 = this.u0;
                    this.u0 = i32 + 1;
                    this.x = i32;
                    arrayList13.add(7L);
                    String str = org.telegram.messenger.p10.i(i26).e0;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i26).p0(str);
                        tL_messages_stickerSet = p02 == null ? org.telegram.messenger.ui.b0(i26).n0(str) : p02;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i7 != 0) {
                            this.u0++;
                            arrayList13.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList24 = tL_messages_stickerSet.documents;
                        if (arrayList24 != null && !arrayList24.isEmpty()) {
                            int i33 = 0;
                            while (i33 < tL_messages_stickerSet.documents.size()) {
                                arrayList15.add(new org.telegram.ui.Components.r5(tL_messages_stickerSet.documents.get(i33), (Paint.FontMetricsInt) null));
                                i33++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i34 = 0; i34 < arrayList15.size(); i34++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.r5) arrayList15.get(i34)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                    }
                }
            } else if (this.Q) {
                arrayList19.addAll(org.telegram.messenger.ui.b0(i26).f0[0]);
                i7 = z12 ? 1 : 0;
                int i35 = 0;
                while (i35 < arrayList19.size()) {
                    arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i35)).id * 13) + 62425));
                    this.u0++;
                    i35++;
                    arrayList11 = arrayList11;
                }
                arrayList = arrayList11;
            } else {
                arrayList = arrayList11;
                i7 = z12 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.R ? org.telegram.messenger.ui.b0(i26).J1 : org.telegram.messenger.ui.b0(i26).K1;
                if (tL_emojiList3 != null && (arrayList10 = tL_emojiList3.document_id) != null && !arrayList10.isEmpty()) {
                    org.telegram.ui.Components.uw uwVar2 = new org.telegram.ui.Components.uw();
                    uwVar2.f = true;
                    uwVar2.g = false;
                    uwVar2.h = true;
                    uwVar2.e = true;
                    uwVar2.b = new TLRPC.TL_stickerSet();
                    uwVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList18.size();
                    arrayList18.add(uwVar2);
                    int i36 = 0;
                    while (i36 < tL_emojiList3.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.r5(tL_emojiList3.document_id.get(i36).longValue(), (Paint.FontMetricsInt) null));
                        i36++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i37 = 0; i37 < arrayList15.size(); i37++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.r5) arrayList15.get(i37)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            }
            if (this.O0 || i27 == 13 || i27 == 2 || i27 == 11 || i27 == 3 || i27 == 6 || i27 == 8 || i27 == 4 || i27 == 5 || i27 == 7) {
                i12 = 2;
            } else {
                int i38 = this.u0;
                i12 = 2;
                this.u0 = i38 + 1;
                this.w = i38;
                arrayList13.add(6L);
            }
            if ((i27 != 9 || i27 == 10) && (tL_emojiList2 = org.telegram.messenger.ui.b0(i26).M1) != null) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(tL_emojiList2.document_id);
                hashSet = hashSet3;
            } else {
                hashSet = null;
            }
            if (this.R0 == null) {
                this.d = this.u0;
                ArrayList arrayList25 = new ArrayList(this.R0);
                if (i27 == 13 && arrayList25.size() > 8) {
                    arrayList25.subList(8, arrayList25.size()).clear();
                } else if (i27 == 14) {
                    arrayList9 = new ArrayList();
                    int i39 = 0;
                    while (i39 < arrayList25.size()) {
                        if (((ch.o0) arrayList25.get(i39)).e) {
                            arrayList9.add((ch.o0) arrayList25.remove(i39));
                            i39--;
                        }
                        i39++;
                    }
                    if (i27 != 8 || i27 == 11 || i27 == 13) {
                        arrayList16.addAll(arrayList25);
                    } else {
                        for (int i40 = 0; i40 < 16; i40++) {
                            if (!arrayList25.isEmpty()) {
                                arrayList16.add((ch.o0) arrayList25.remove(0));
                            }
                        }
                    }
                    i22 = 0;
                    while (i22 < arrayList16.size()) {
                        arrayList13.add(Long.valueOf((((ch.o0) arrayList16.get(i22)).hashCode() * 13) - 5632));
                        i22++;
                        arrayList20 = arrayList20;
                    }
                    arrayList3 = arrayList20;
                    int size2 = arrayList16.size() + this.u0;
                    this.u0 = size2;
                    this.e = size2;
                    if (!arrayList25.isEmpty() && i27 != 8 && i27 != 11 && i27 != 13) {
                        i24 = 0;
                        while (true) {
                            if (i24 < arrayList25.size()) {
                                z15 = true;
                                break;
                            } else {
                                if (((ch.o0) arrayList25.get(i24)).g != 0) {
                                    z15 = false;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i27 != 14) {
                            if (!z15) {
                                int i41 = this.u0;
                                this.u0 = i41 + 1;
                                this.f = i41;
                                arrayList13.add(4L);
                            } else if (org.telegram.messenger.p10.i(i26).q()) {
                                int i42 = this.u0;
                                this.u0 = i42 + 1;
                                this.h = i42;
                                arrayList13.add(5L);
                            }
                        }
                        this.b = this.u0;
                        arrayList17.addAll(arrayList25);
                        for (i25 = 0; i25 < arrayList17.size(); i25++) {
                            arrayList13.add(Long.valueOf((((ch.o0) arrayList17.get(i25)).h * 13) + (z15 ? 4235 : -3142)));
                        }
                        int size3 = arrayList17.size() + this.u0;
                        this.u0 = size3;
                        this.c = size3;
                    }
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        int i43 = this.u0;
                        this.u0 = i43 + 1;
                        this.D = i43;
                        arrayList13.add(8L);
                        this.E = this.u0;
                        this.J0 = arrayList9;
                        for (i23 = 0; i23 < arrayList9.size(); i23++) {
                            arrayList13.add(Long.valueOf(((ch.o0) arrayList9.get(i23)).c * 19));
                        }
                        int size4 = arrayList9.size() + this.u0;
                        this.u0 = size4;
                        this.F = size4;
                    }
                }
                arrayList9 = null;
                if (i27 != 8) {
                }
                arrayList16.addAll(arrayList25);
                i22 = 0;
                while (i22 < arrayList16.size()) {
                }
                arrayList3 = arrayList20;
                int size22 = arrayList16.size() + this.u0;
                this.u0 = size22;
                this.e = size22;
                if (!arrayList25.isEmpty()) {
                    i24 = 0;
                    while (true) {
                        if (i24 < arrayList25.size()) {
                        }
                        i24++;
                    }
                    if (i27 != 14) {
                    }
                    this.b = this.u0;
                    arrayList17.addAll(arrayList25);
                    while (i25 < arrayList17.size()) {
                    }
                    int size32 = arrayList17.size() + this.u0;
                    this.u0 = size32;
                    this.c = size32;
                }
                if (arrayList9 != null) {
                    int i432 = this.u0;
                    this.u0 = i432 + 1;
                    this.D = i432;
                    arrayList13.add(8L);
                    this.E = this.u0;
                    this.J0 = arrayList9;
                    while (i23 < arrayList9.size()) {
                    }
                    int size42 = arrayList9.size() + this.u0;
                    this.u0 = size42;
                    this.F = size42;
                }
            } else {
                arrayList3 = arrayList20;
                if (i27 == 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i26);
                    Long[] lArr = b03.F0;
                    ArrayList[] arrayListArr = b03.E0;
                    if (!b03.G0[0]) {
                        b03.L(0, true);
                    } else if (arrayListArr[0] == null || (lArr[0] != null && (System.currentTimeMillis() / 1000) - lArr[0].longValue() > 1800)) {
                        b03.L(0, false);
                    }
                    ArrayList arrayList26 = arrayListArr[0];
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i26).m0((i27 == 0 || i27 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                    if (m0 != null) {
                        if (i7 != 0) {
                            this.u0++;
                            arrayList13.add(2L);
                        }
                        if (i27 == 0 || i27 == 12) {
                            P = org.telegram.messenger.ui.b0(i26).P();
                        } else {
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i26);
                            Long[] lArr2 = b04.F0;
                            ArrayList[] arrayListArr2 = b04.E0;
                            if (b04.G0[i12]) {
                                i14 = i12;
                                if (arrayListArr2[i14] == null || (lArr2[i14] != null && (System.currentTimeMillis() / 1000) - lArr2[i14].longValue() > 1800)) {
                                    b04.L(i14, false);
                                }
                            } else {
                                i14 = i12;
                                b04.L(i14, true);
                            }
                            P = arrayListArr2[i14];
                        }
                        ArrayList<TLRPC.Document> arrayList27 = m0.documents;
                        if (arrayList27 != null && !arrayList27.isEmpty()) {
                            for (int i44 = 0; i44 < Math.min(7, m0.documents.size()); i44++) {
                                arrayList15.add(new org.telegram.ui.Components.r5(m0.documents.get(i44), (Paint.FontMetricsInt) null));
                                if (arrayList15.size() + i7 >= 104) {
                                    break;
                                }
                            }
                        }
                        if ((i27 == 0 || i27 == 12) && arrayList26 != null && !arrayList26.isEmpty()) {
                            int size5 = arrayList26.size();
                            int i45 = 0;
                            while (i45 < size5) {
                                Object obj = arrayList26.get(i45);
                                i45++;
                                Long g10 = org.telegram.messenger.t10.g((TLRPC.EmojiStatus) obj);
                                if (g10 != null) {
                                    int i46 = 0;
                                    while (true) {
                                        if (i46 >= arrayList15.size()) {
                                            ArrayList arrayList28 = arrayList26;
                                            int i47 = size5;
                                            arrayList15.add(new org.telegram.ui.Components.r5(g10.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i7 >= 104) {
                                                break;
                                            }
                                            arrayList26 = arrayList28;
                                            size5 = i47;
                                        } else if (((org.telegram.ui.Components.r5) arrayList15.get(i46)).getDocumentId() == g10.longValue()) {
                                            break;
                                        } else {
                                            i46++;
                                        }
                                    }
                                }
                            }
                        }
                        if (P != null && !P.isEmpty()) {
                            int size6 = P.size();
                            int i48 = 0;
                            while (i48 < size6) {
                                Object obj2 = P.get(i48);
                                i48++;
                                Long g11 = org.telegram.messenger.t10.g((TLRPC.EmojiStatus) obj2);
                                if (g11 != null) {
                                    int i49 = 0;
                                    while (true) {
                                        if (i49 >= arrayList15.size()) {
                                            arrayList15.add(new org.telegram.ui.Components.r5(g11.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i7 >= 104) {
                                                break;
                                            }
                                        } else if (((org.telegram.ui.Components.r5) arrayList15.get(i49)).getDocumentId() == g11.longValue()) {
                                            break;
                                        } else {
                                            i49++;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList15.size() <= 40 - i7 || this.C0) {
                            for (int i50 = 0; i50 < arrayList15.size(); i50++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.r5) arrayList15.get(i50)).getDocumentId() * 13) + 43223));
                                this.u0++;
                            }
                        } else {
                            for (int i51 = 0; i51 < 39 - i7; i51++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.r5) arrayList15.get(i51)).getDocumentId() * 13) + 43223));
                                this.u0++;
                            }
                            arrayList13.add(Long.valueOf(((((arrayList15.size() - 40) + i7) + 1) * 13) - 5531));
                            v01 v01Var = this.G;
                            if (v01Var != null) {
                                TextView textView = v01Var.a;
                                StringBuilder sb2 = new StringBuilder("+");
                                i13 = 1;
                                sb2.append((arrayList15.size() - 40) + i7 + 1);
                                textView.setText(sb2.toString());
                            } else {
                                i13 = 1;
                            }
                            sparseIntArray9.put(this.u0, -1);
                            this.u0 += i13;
                        }
                    }
                }
            }
            arrayList21.clear();
            if (i27 != 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                bi.v9 G = bi.ea.y(i26, false).G(getDialogId(), true);
                G.a();
                arrayList4 = new ArrayList();
                ArrayList arrayList29 = G.l;
                size = arrayList29.size();
                i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList29.get(i15);
                    i15++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList4.isEmpty()) {
                    int i52 = this.u0;
                    this.u0 = i52 + 1;
                    this.n = i52;
                    arrayList13.add(22L);
                    this.r = this.u0;
                    int size7 = arrayList4.size();
                    int i53 = 0;
                    while (i53 < size7) {
                        Object obj4 = arrayList4.get(i53);
                        i53++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                        arrayList13.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.u0++;
                        arrayList21.add(tL_starGiftUnique);
                    }
                    this.s = this.u0;
                    this.d0.l(true);
                } else {
                    this.d0.l(false);
                }
            }
            if (i27 == 13) {
                String[][] strArr = org.telegram.messenger.j6.f;
                for (int i54 = 0; i54 < 8; i54++) {
                    for (String str2 : strArr[i54]) {
                        arrayList3.add(str2);
                        arrayList13.add(Long.valueOf((r8.hashCode() * 322) + 13334));
                        this.u0++;
                    }
                }
            }
            if (i27 != 8 && i27 != 13 && i27 != 14) {
                i21 = 0;
                while (i21 < arrayList.size()) {
                    ArrayList arrayList30 = arrayList;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList30.get(i21);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null) {
                        if (i27 == 5 || i27 == 7) {
                            if (stickerSet2 != null) {
                                if (stickerSet2.text_color) {
                                    z14 = true;
                                } else {
                                    ArrayList<TLRPC.Document> arrayList31 = tL_messages_stickerSet2.documents;
                                    if (arrayList31 != null && !arrayList31.isEmpty()) {
                                        z14 = org.telegram.messenger.ij.D4(tL_messages_stickerSet2.documents.get(0));
                                    }
                                }
                            }
                            z14 = false;
                        }
                        if ((i27 != 10 && i27 != 9) || tL_messages_stickerSet2.set.channel_emoji_status) {
                            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet2.set;
                            if (stickerSet3.emojis || this.Q) {
                                if (!this.B0.contains(Long.valueOf(stickerSet3.id))) {
                                    sparseIntArray6 = sparseIntArray2;
                                    sparseIntArray6.put(this.u0, arrayList18.size());
                                    sparseIntArray5 = sparseIntArray;
                                    sparseIntArray5.put(arrayList18.size(), this.u0);
                                    this.u0++;
                                    arrayList13.add(Long.valueOf((tL_messages_stickerSet2.set.id * 13) + 9211));
                                    org.telegram.ui.Components.uw uwVar3 = new org.telegram.ui.Components.uw();
                                    uwVar3.f = true;
                                    uwVar3.g = false;
                                    uwVar3.h = true;
                                    if (i27 == 4) {
                                        uwVar3.e = false;
                                    } else {
                                        uwVar3.e = !org.telegram.messenger.ij.W3(tL_messages_stickerSet2);
                                    }
                                    uwVar3.b = tL_messages_stickerSet2.set;
                                    uwVar3.c = j(tL_messages_stickerSet2.documents, hashSet);
                                    arrayList18.size();
                                    arrayList18.add(uwVar3);
                                    this.u0 = uwVar3.c.size() + this.u0;
                                    for (int i55 = 0; i55 < uwVar3.c.size(); i55++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) uwVar3.c.get(i55)).id * 13) + 3212));
                                    }
                                    i21++;
                                    sparseIntArray = sparseIntArray5;
                                    arrayList = arrayList30;
                                    sparseIntArray2 = sparseIntArray6;
                                }
                            }
                        }
                    }
                    sparseIntArray5 = sparseIntArray;
                    sparseIntArray6 = sparseIntArray2;
                    i21++;
                    sparseIntArray = sparseIntArray5;
                    arrayList = arrayList30;
                    sparseIntArray2 = sparseIntArray6;
                }
            }
            SparseIntArray sparseIntArray12 = sparseIntArray;
            SparseIntArray sparseIntArray13 = sparseIntArray2;
            if (!this.Q || i27 == 8 || i27 == 13) {
                arrayList5 = arrayList18;
                i16 = 14;
            } else {
                i16 = 14;
                if (i27 != 14) {
                    int i56 = 0;
                    while (i56 < arrayList22.size()) {
                        ArrayList arrayList32 = arrayList22;
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList32.get(i56);
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                        int i57 = 0;
                        while (true) {
                            if (i57 >= arrayList18.size()) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    int i58 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i18 = i58;
                                    arrayList22 = arrayList32;
                                    stickerSet = stickerSet4;
                                    arrayList6 = arrayList18;
                                    i19 = 10;
                                    TLRPC.TL_messages_stickerSet l02 = uiVar.l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (l02 != null) {
                                        ArrayList<TLRPC.Document> arrayList33 = l02.documents;
                                        boolean W3 = org.telegram.messenger.ij.W3(l02);
                                        arrayList7 = arrayList33;
                                        z13 = W3;
                                    } else {
                                        TLRPC.TL_inputStickerSetID Z = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                                        arrayList7 = new ArrayList<>();
                                        tL_inputStickerSetID = Z;
                                        z13 = true;
                                        if (arrayList7 != null && ((!(i27 == 5 || i27 == 7) || (!arrayList7.isEmpty() && org.telegram.messenger.ij.D4(arrayList7.get(0)))) && (!(i27 == i19 || i27 == 9) || stickerSet.channel_emoji_status))) {
                                            sparseIntArray13.put(this.u0, arrayList6.size());
                                            sparseIntArray3.put(arrayList6.size(), this.u0);
                                            this.u0++;
                                            boolean z18 = z13;
                                            arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                            uwVar = new org.telegram.ui.Components.uw();
                                            uwVar.d = tL_inputStickerSetID;
                                            uwVar.f = this.B0.contains(Long.valueOf(stickerSet.id));
                                            uwVar.g = true;
                                            if (i27 != 4) {
                                                uwVar.e = false;
                                            } else {
                                                uwVar.e = !z18;
                                            }
                                            uwVar.b = stickerSet;
                                            uwVar.c = j(arrayList7, hashSet2);
                                            arrayList6.size();
                                            uwVar.h = this.A0.contains(Long.valueOf(uwVar.b.id));
                                            if (uwVar.c.size() > 24 || uwVar.h) {
                                                this.u0 = uwVar.c.size() + this.u0;
                                                for (i20 = 0; i20 < uwVar.c.size(); i20++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) uwVar.c.get(i20)).id * 13) + 3212));
                                                }
                                            } else {
                                                this.u0 += 24;
                                                for (int i59 = 0; i59 < 23; i59++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) uwVar.c.get(i59)).id * 13) + 3212));
                                                }
                                                arrayList13.add(Long.valueOf(((uwVar.c.size() - 23) * 169) + ((stickerSet.id * 13) - 5531)));
                                                sparseIntArray9.put(this.u0 - 1, arrayList6.size());
                                            }
                                            if (!uwVar.f) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else if (i27 == 4 || i27 == 5 || i27 == 7 || i27 == 6) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else {
                                                sparseIntArray4 = sparseIntArray11;
                                                sparseIntArray4.put(this.u0, arrayList6.size());
                                                this.u0++;
                                                arrayList13.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                                arrayList8 = arrayList6;
                                                arrayList8.add(uwVar);
                                            }
                                            arrayList8 = arrayList6;
                                            arrayList8.add(uwVar);
                                        } else {
                                            sparseIntArray4 = sparseIntArray11;
                                            arrayList8 = arrayList6;
                                        }
                                    }
                                } else {
                                    int i60 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i18 = i60;
                                    arrayList22 = arrayList32;
                                    arrayList6 = arrayList18;
                                    stickerSet = stickerSet4;
                                    i19 = 10;
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        z13 = org.telegram.messenger.ij.V3(stickerSetCovered);
                                    } else {
                                        z13 = false;
                                        arrayList7 = null;
                                    }
                                }
                                tL_inputStickerSetID = null;
                                if (arrayList7 != null) {
                                    sparseIntArray13.put(this.u0, arrayList6.size());
                                    sparseIntArray3.put(arrayList6.size(), this.u0);
                                    this.u0++;
                                    boolean z182 = z13;
                                    arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                    uwVar = new org.telegram.ui.Components.uw();
                                    uwVar.d = tL_inputStickerSetID;
                                    uwVar.f = this.B0.contains(Long.valueOf(stickerSet.id));
                                    uwVar.g = true;
                                    if (i27 != 4) {
                                    }
                                    uwVar.b = stickerSet;
                                    uwVar.c = j(arrayList7, hashSet2);
                                    arrayList6.size();
                                    uwVar.h = this.A0.contains(Long.valueOf(uwVar.b.id));
                                    if (uwVar.c.size() > 24) {
                                    }
                                    this.u0 = uwVar.c.size() + this.u0;
                                    while (i20 < uwVar.c.size()) {
                                    }
                                    if (!uwVar.f) {
                                    }
                                    arrayList8 = arrayList6;
                                    arrayList8.add(uwVar);
                                }
                                sparseIntArray4 = sparseIntArray11;
                                arrayList8 = arrayList6;
                            } else {
                                if (((org.telegram.ui.Components.uw) arrayList18.get(i57)).b.id == stickerSet4.id) {
                                    int i61 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i18 = i61;
                                    arrayList22 = arrayList32;
                                    arrayList8 = arrayList18;
                                    sparseIntArray4 = sparseIntArray11;
                                    break;
                                }
                                i57++;
                            }
                        }
                        int i62 = i18 + 1;
                        sparseIntArray11 = sparseIntArray4;
                        uiVar2 = uiVar;
                        i16 = 14;
                        hashSet = hashSet2;
                        sparseIntArray12 = sparseIntArray3;
                        i56 = i62;
                        arrayList18 = arrayList8;
                    }
                }
                arrayList5 = arrayList18;
            }
            if (i27 != i16 && i27 != 8 && i27 != 13) {
                this.d0.p(arrayList5);
            }
            o01Var = this.h0;
            if (z17) {
                o01Var.setItemAnimator(null);
            } else {
                o01Var.setItemAnimator(this.e1);
            }
            if (z11) {
                i17 = 0;
                this.p0.f();
            } else {
                i17 = 0;
                v4.o.c(new jg.h(this, arrayList14, 5), false).c(this.p0);
            }
            if (o01Var.J1) {
                o01Var.v0(i17);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray7;
        this.a = -1;
        z12 = this.N0;
        if (i27 != 5) {
        }
        arrayList = arrayList11;
        i7 = z12 ? 1 : 0;
        if (i7 != 0) {
        }
        tL_emojiList = org.telegram.messenger.ui.b0(i26).L1;
        if (tL_emojiList != null) {
            i10 = 0;
            while (i10 < tL_emojiList.document_id.size()) {
            }
            while (i11 < arrayList15.size()) {
            }
        }
        if (this.O0) {
        }
        i12 = 2;
        if (i27 != 9) {
        }
        HashSet hashSet32 = new HashSet();
        hashSet32.addAll(tL_emojiList2.document_id);
        hashSet = hashSet32;
        if (this.R0 == null) {
        }
        arrayList21.clear();
        if (i27 != 0) {
        }
        bi.v9 G2 = bi.ea.y(i26, false).G(getDialogId(), true);
        G2.a();
        arrayList4 = new ArrayList();
        ArrayList arrayList292 = G2.l;
        size = arrayList292.size();
        i15 = 0;
        while (i15 < size) {
        }
        if (arrayList4.isEmpty()) {
        }
        if (i27 == 13) {
        }
        if (i27 != 8) {
            i21 = 0;
            while (i21 < arrayList.size()) {
            }
        }
        SparseIntArray sparseIntArray122 = sparseIntArray;
        SparseIntArray sparseIntArray132 = sparseIntArray2;
        if (this.Q) {
        }
        arrayList5 = arrayList18;
        i16 = 14;
        if (i27 != i16) {
            this.d0.p(arrayList5);
        }
        o01Var = this.h0;
        if (z17) {
        }
        if (z11) {
        }
        if (o01Var.J1) {
        }
    }

    public final void C() {
        i01 i01Var = this.f0;
        if (i01Var == null) {
            return;
        }
        if (this.z1) {
            i01Var.clearAnimation();
            i01Var.setVisibility(0);
            i01Var.animate().translationY(0.0f).start();
            return;
        }
        o01 o01Var = this.h0;
        if (o01Var.getChildCount() <= 0) {
            i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        View childAt = o01Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        } else {
            i01Var.setVisibility(0);
            i01Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(c8.j9.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.tm tmVar = this.n0;
        if (tmVar != null) {
            float a10 = c8.j9.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            tmVar.setAlpha(a10);
            tmVar.setScaleX(a10);
            tmVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = c8.j9.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = c8.j9.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = c8.j9.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = c8.j9.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        float interpolation2 = xqVar.getInterpolation(a11);
        float interpolation3 = xqVar.getInterpolation(a12);
        this.b0.setAlpha(a14);
        this.f0.setAlpha(a14);
        int i7 = 0;
        for (int i10 = 0; i10 < this.d0.b.getChildCount(); i10++) {
            this.d0.b.getChildAt(i10).setAlpha(a14);
        }
        if (this.o1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        l01 l01Var = this.a0;
        l01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (tmVar != null) {
            tmVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.a1 = (interpolation2 * 0.85f) + 0.15f;
        this.b1 = (interpolation3 * 0.925f) + 0.075f;
        l01Var.invalidateOutline();
        if (tmVar != null) {
            tmVar.setAlpha(a14);
        }
        j01 j01Var = this.e0;
        j01Var.setAlpha(a14);
        j01Var.setScaleX(Math.min(this.a1, 1.0f));
        float pivotX = j01Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(l01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(l01Var.getHeight(), 2.0d) + Math.pow(l01Var.getWidth() - pivotX, 2.0d)));
        for (int i11 = 0; i11 < this.d0.b.getChildCount(); i11++) {
            View childAt = this.d0.b.getChildAt(i11);
            if (f10 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f10 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s5 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s5)) {
                s5 = 0.0f;
            }
            childAt.setScaleX(s5);
            childAt.setScaleY(s5);
        }
        while (true) {
            o01 o01Var = this.h0;
            if (i7 >= o01Var.getChildCount()) {
                this.k0.invalidate();
                o01Var.invalidate();
                return;
            }
            View childAt2 = o01Var.getChildAt(i7);
            if (childAt2 instanceof a11) {
                a11 a11Var = (a11) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float s9 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(s9)) {
                    s9 = 0.0f;
                }
                a11Var.setAnimatedScale(s9);
            }
            i7++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.x0;
        tz0 tz0Var = this.T1;
        if (i7 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.g0.r(tz0Var);
                org.telegram.messenger.g0.h3(tz0Var);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.A0) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
            return;
        }
        if (i7 == org.telegram.messenger.qs.C1) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
            return;
        }
        if (i7 == org.telegram.messenger.qs.B0) {
            org.telegram.messenger.g0.r(tz0Var);
            org.telegram.messenger.g0.h3(tz0Var);
            return;
        }
        if (i7 != org.telegram.messenger.qs.i4) {
            if (i7 == org.telegram.messenger.qs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.p10.i(this.V).e()) {
                org.telegram.messenger.g0.r(tz0Var);
                org.telegram.messenger.g0.h3(tz0Var);
                return;
            }
            return;
        }
        pg.c cVar = new pg.c(0);
        o01 o01Var = this.h0;
        org.telegram.messenger.g0.d0(o01Var, cVar);
        if (o01Var != null) {
            o01Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.g5 g5Var = this.o1;
        if (g5Var != null && (num = this.Y0) != null) {
            Rect bounds = g5Var.getBounds();
            View view = this.q1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.o1.getAlpha();
            View view2 = this.q1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.o1.w = (int) (Math.pow(this.a0.getAlpha(), 0.25d) * alpha * this.m1);
            if (this.p1 == null) {
                this.p1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f10;
            float z9 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i7 = this.d1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z9 + (!n10 ? org.telegram.messenger.g0.L(i7) : getMeasuredHeight() - (org.telegram.messenger.g0.L(i7) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.g5 g5Var2 = this.o1;
            Rect rect = this.p1;
            int i10 = rect.left;
            Rect rect2 = this.p1;
            g5Var2.setBounds(i10, rect.top, (int) ((rect.width() / scaleY) + i10), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.o1.draw(canvas);
            org.telegram.ui.Components.g5 g5Var3 = this.o1;
            g5Var3.w = alpha;
            g5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        a11 a11Var = this.s1;
        if (a11Var == null || this.t1 == null || a11Var.E == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.s1.E.setAlpha((int) (this.r1 * 255.0f));
        this.s1.E.setBounds(this.t1);
        this.s1.E.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.m1, this.f1, this.n1), PorterDuff.Mode.SRC_IN));
        this.s1.E.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public bi.ud getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new bi.ud(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return org.telegram.messenger.p10.i(this.V).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.G1 ? this.i0 : this.h0).canScrollVertically(1);
        if (canScrollVertically != this.w1) {
            this.w1 = canScrollVertically;
            org.telegram.messenger.camera.q.k(this.o0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i7, View view) {
        boolean z9;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        boolean z10;
        int i14 = this.y0.get(i7);
        Integer num2 = null;
        if (i14 >= 0) {
            ArrayList arrayList = this.M0;
            if (i14 < arrayList.size()) {
                org.telegram.ui.Components.uw uwVar = (org.telegram.ui.Components.uw) arrayList.get(i14);
                if (uwVar.h) {
                    return;
                }
                boolean z11 = i14 + 1 == arrayList.size();
                i12 = this.x0.get(i14);
                this.A0.add(Long.valueOf(uwVar.b.id));
                i10 = 24;
                i11 = uwVar.h ? uwVar.c.size() : Math.min(24, uwVar.c.size());
                num = uwVar.c.size() > 24 ? Integer.valueOf(i12 + 1 + i11) : null;
                uwVar.h = true;
                i13 = uwVar.c.size();
                z10 = z11;
                if (i13 > i11) {
                    num = Integer.valueOf(i12 + 1 + i11);
                    num2 = Integer.valueOf(i13 - i11);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.N1 = view;
                this.O1 = num.intValue();
                this.P1 = num2.intValue() + num.intValue();
                this.Q1 = SystemClock.elapsedRealtime();
                if (z10) {
                    post(new org.telegram.ui.Components.pw(this, num2.intValue() > i10 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i14 != -1 || (z9 = this.C0)) {
            return;
        }
        int i15 = (this.a != -1 ? 1 : 0) + (this.w != -1 ? 1 : 0);
        boolean z12 = this.N0;
        int i16 = i15 + (z12 ? 1 : 0);
        ArrayList arrayList2 = this.D0;
        int size = z9 ? arrayList2.size() : Math.min(38 - (z12 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.C0 = true;
        i10 = 40;
        i11 = size;
        num = null;
        i12 = i16;
        i13 = size2;
        z10 = false;
        if (i13 > i11) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void l() {
        int i7 = this.W;
        if (i7 == 2) {
            return;
        }
        String s5 = a8.p0.s(new StringBuilder("emoji"), (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10) ? "status" : "reaction", "usehint");
        int i10 = org.telegram.messenger.qp.e1().getInt(s5, 0);
        if (i10 <= 3) {
            org.telegram.messenger.qp.e1().edit().putInt(s5, i10 + 1).apply();
        }
    }

    public final boolean n() {
        int i7 = this.W;
        return i7 == 5 || i7 == 10 || i7 == 12 || i7 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.K.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.r5 r5Var) {
        l();
        if (r5Var != null) {
            int i7 = this.W;
            if (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = r5Var.getDocumentId();
            TLRPC.Document document = r5Var.document;
            int i10 = this.V;
            if (document == null) {
                document = org.telegram.ui.Components.i5.e(i10, r5Var.documentId);
            }
            if (!(view instanceof a11)) {
                p(view, Long.valueOf(r5Var.documentId), document, null, null);
                return;
            }
            final a11 a11Var = (a11) view;
            if (a11Var.w == null && (i7 == 0 || i7 == 12 || i7 == 9 || i7 == 10)) {
                org.telegram.messenger.ui.b0(i10).C1(tL_emojiStatus);
            }
            if (i7 != 0 && i7 != 12 && i7 != 9 && i7 != 10 && i7 != 2) {
                p(view, Long.valueOf(r5Var.documentId), document, a11Var.w, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(a11Var.w)) {
                p(view, Long.valueOf(r5Var.documentId), document2, a11Var.w, null);
                return;
            }
            final c01 c01Var = new c01(this, view, r5Var, document2, a11Var, 0);
            if (this.v1 != null || this.o1 == null) {
                c01Var.run();
                return;
            }
            a11Var.b = true;
            final Rect rect = new Rect();
            l01 l01Var = this.a0;
            int left = l01Var.getLeft();
            o01 o01Var = this.h0;
            rect.set(a11Var.getLeft() + o01Var.getLeft() + left, a11Var.getTop() + o01Var.getTop() + l01Var.getTop(), a11Var.getRight() + o01Var.getLeft() + l01Var.getLeft(), a11Var.getBottom() + o01Var.getTop() + l01Var.getTop());
            Drawable drawable = a11Var.E;
            final org.telegram.ui.Components.i5 m10 = drawable instanceof org.telegram.ui.Components.i5 ? org.telegram.ui.Components.i5.m(i10, ((org.telegram.ui.Components.i5) drawable).h(), null, 7) : null;
            this.s1 = a11Var;
            Rect rect2 = new Rect();
            this.t1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.vz0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.g5 g5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float x10 = org.telegram.ui.Cells.f1.x(floatValue, floatValue, floatValue, 1.0f);
                    q11 q11Var = q11.this;
                    q11Var.m1 = x10;
                    q11Var.r1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    org.telegram.messenger.g0.X1(rect, q11Var.p1, floatValue, q11Var.t1);
                    float scaleX = a11Var.getScaleX() * Math.max(1.0f, q11Var.u1.getInterpolation(c8.j9.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    q11Var.t1.set((int) org.telegram.messenger.camera.q.v(q11Var.t1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.camera.q.v(q11Var.t1.height(), 2.0f, scaleX, q11Var.t1.centerY()), (int) com.google.android.recaptcha.internal.a.c(q11Var.t1.width(), 2.0f, scaleX, q11Var.t1.centerX()), (int) com.google.android.recaptcha.internal.a.c(q11Var.t1.height(), 2.0f, scaleX, q11Var.t1.centerY()));
                    q11Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        c01Var.run();
                        if (m10 == null || (g5Var = q11Var.o1) == null) {
                            return;
                        }
                        g5Var.f();
                    }
                }
            });
            this.v1.addListener(new di.h3(this, zArr, c01Var, 11));
            this.v1.setInterpolator(org.telegram.ui.Components.xq.h);
            this.v1.setDuration(260L);
            this.v1.start();
            return;
        }
        p(view, null, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.o1;
        if (g5Var != null) {
            g5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i7 = this.V;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.A0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.x0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.C1);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.B0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
        int i10 = this.W;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.G3);
        }
        org.telegram.ui.Components.g5 g5Var = this.o1;
        if (g5Var != null) {
            g5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.W == 6) {
            this.r0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = this.Q0;
        int i11 = this.W;
        if (z9 && i11 != 3 && i11 != 4) {
            float L = org.telegram.messenger.g0.L(324.0f);
            Point point = org.telegram.messenger.g0.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(L, point.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), TLObject.FLAG_31));
        } else if (i11 == 6) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.q.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i7, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(g11 g11Var) {
        Integer num = this.Z1;
        if (num != null) {
        }
        this.U1 = g11Var;
        boolean z9 = this.Q0;
        int i7 = 0;
        o01 o01Var = this.h0;
        if (!z9) {
            h();
            while (i7 < o01Var.getChildCount()) {
                View childAt = o01Var.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i7++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.V1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V1 = null;
        }
        ValueAnimator valueAnimator2 = this.W1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.W1 = null;
        }
        int i10 = this.W;
        if (i10 == 3 || i10 == 4 || i10 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V1 = ofFloat;
        ofFloat.addUpdateListener(new sz0(this, i7));
        this.V1.addListener(new d30(this, 27));
        tz0 tz0Var = new tz0(this, i7);
        ch.e0.f = true;
        ch.e0.e = true;
        ch.e0.g = false;
        if (ch.e0.d) {
            ch.e0.d = false;
        }
        ch.e0.c = tz0Var;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        this.X1.d();
        this.V1.setDuration(800L);
        o01Var.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.e0.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        org.telegram.ui.Components.tm tmVar = this.n0;
        if (tmVar != null) {
            tmVar.setLayerType(2, null);
        }
        View view = this.m0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.d0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z9) {
        this.P = z9;
    }

    public void setBackgroundDelegate(r01 r01Var) {
        this.U = r01Var;
    }

    public void setDrawBackground(boolean z9) {
        this.Q0 = z9;
        this.a0.setClipToOutline(z9);
        fi.p5 p5Var = this.b0;
        if (z9) {
            p5Var.setVisibility(0);
        } else {
            p5Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z9) {
        if (this.T != z9) {
            this.T = z9;
            if (z9) {
                return;
            }
            org.telegram.messenger.g0.d0(this.h0, new di.e(24));
            for (int i7 = 0; i7 < this.d0.b.getChildCount(); i7++) {
                View childAt = this.d0.b.getChildAt(i7);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.d0.b.invalidate();
        }
    }

    public void setExpireDateHint(int i7) {
        if (i7 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i7);
        B(true, false, true);
    }

    public void setForUser(boolean z9) {
        this.R = z9;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        a11 a11Var = this.O;
        if (a11Var != null) {
            a11Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z9) {
        this.h1 = z9;
    }

    public void setOnLongPressedListener(o11 o11Var) {
        this.H = o11Var;
    }

    public void setRecentReactions(List<ch.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i7) {
        this.Z1 = Integer.valueOf(i7);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l10);
        o01 o01Var = this.h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = a11Var.e;
                    if (r5Var != null) {
                        a11Var.d(hashSet.contains(Long.valueOf(r5Var.getDocumentId())), true);
                    } else {
                        a11Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            o01Var.invalidate();
        }
    }

    public void setSelectedReaction(ch.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        o01 o01Var = this.h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    a11Var.d(this.J.contains(a11Var.y), true);
                }
            }
            o01Var.invalidate();
        }
        e01 e01Var = this.i0;
        if (e01Var != null) {
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var2 = (a11) e01Var.getChildAt(i10);
                    a11Var2.d(this.J.contains(a11Var2.y), true);
                }
            }
            e01Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ch.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) != null && ((ch.o0) arrayList.get(i7)).g != 0) {
                hashSet2.add(Long.valueOf(((ch.o0) arrayList.get(i7)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int w02;
        try {
            if (this.l1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.Z0)) != this.f1) {
                this.f1 = w02;
                this.M.setColor(i0.a.o(w02, 30));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f1, PorterDuff.Mode.SRC_IN);
                this.k1 = porterDuffColorFilter;
                org.telegram.ui.Components.i5 i5Var = this.W0;
                if (i5Var != null) {
                    i5Var.setColorFilter(porterDuffColorFilter);
                }
                o01 o01Var = this.h0;
                if (o01Var != null) {
                    o01Var.invalidate();
                }
                e01 e01Var = this.i0;
                if (e01Var != null) {
                    e01Var.invalidate();
                }
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z9, boolean z10) {
        tz0 tz0Var = this.J1;
        if (tz0Var != null) {
            org.telegram.messenger.g0.r(tz0Var);
            this.J1 = null;
        }
        di.z5 z5Var = this.K1;
        if (z5Var != null) {
            org.telegram.messenger.g0.r(z5Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        b11 b11Var = this.q0;
        i01 i01Var = this.f0;
        if (isEmpty) {
            this.y1 = false;
            this.z1 = false;
            z(false, z9);
            if (i01Var != null) {
                i01Var.d(true);
                i01.a(i01Var, false);
            }
            b11Var.E(true);
            this.A1 = null;
        } else {
            boolean z11 = this.y1;
            boolean z12 = !z11;
            this.y1 = true;
            this.z1 = false;
            if (i01Var != null) {
                i01Var.f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.B1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.C1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.E1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                b11Var.E(false);
            } else if (!str.equals(this.A1)) {
                tz0 tz0Var2 = new tz0(this, 1);
                this.J1 = tz0Var2;
                org.telegram.messenger.g0.i3(tz0Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, b2)) {
                org.telegram.messenger.ui.b0(this.V).M(G0, false);
            }
            b2 = G0;
            di.z5 z5Var2 = new di.z5(this, str, z9, z12, G0, 3);
            this.K1 = z5Var2;
            org.telegram.messenger.g0.i3(z5Var2, z10 ? 425L : 0L);
            if (i01Var != null) {
                i01Var.f.b(2);
                i01.a(i01Var, z9);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t0.getAlpha(), f10 * 0.25f);
        this.i1 = ofFloat;
        ofFloat.addUpdateListener(new sz0(this, 2));
        this.i1.setDuration(200L);
        this.i1.setInterpolator(org.telegram.ui.Components.xq.f);
        this.i1.start();
    }

    public final void x(Long l10, boolean z9) {
        boolean z10;
        HashSet hashSet = this.K;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z10 = false;
        } else {
            hashSet.add(l10);
            z10 = true;
        }
        o01 o01Var = this.h0;
        if (o01Var != null) {
            for (int i7 = 0; i7 < o01Var.getChildCount(); i7++) {
                if (o01Var.getChildAt(i7) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i7);
                    org.telegram.ui.Components.r5 r5Var = a11Var.e;
                    if (r5Var == null || r5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = a11Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            a11Var.e(z10, z9);
                        }
                    } else {
                        a11Var.e(z10, z9);
                    }
                }
            }
            o01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.g5 g5Var, View view) {
        Integer num;
        this.n1 = (g5Var == null || (num = g5Var.F) == null) ? 0 : num.intValue();
        this.o1 = g5Var;
        this.q1 = view;
        if (this.I && g5Var != null) {
            g5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z9, boolean z10) {
        if (this.G1 == z9) {
            return;
        }
        this.G1 = z9;
        o01 o01Var = this.h0;
        int i7 = 0;
        o01Var.setVisibility(0);
        e01 e01Var = this.i0;
        e01Var.setVisibility(0);
        ValueAnimator valueAnimator = this.F1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.I1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F1 = ofFloat;
        ofFloat.addUpdateListener(new wz0(this, z9, i7));
        this.F1.addListener(new k01(this, z9, i7));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.F1.start();
        org.telegram.messenger.camera.q.l(((View) o01Var.getParent()).animate().translationY((this.G1 && z10) ? -org.telegram.messenger.g0.L(36.0f) : 0.0f).setUpdateListener(new sz0(this, 1)), org.telegram.ui.Components.xq.f, 160L);
        if (this.G1 && z10) {
            e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this(f2Var, context, z9, num, i7, z10, f6Var, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q11(org.telegram.ui.ActionBar.f2 f2Var, Context context, boolean z9, Integer num, int i7, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        float f11;
        boolean z11;
        Integer num2;
        boolean z12;
        Integer num3;
        boolean z13;
        int i14;
        by0 by0Var;
        int i15 = i7;
        int i16 = i11;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = org.telegram.messenger.p10.s0;
        this.c0 = new org.telegram.ui.Components.bv[2];
        this.v0 = new ArrayList();
        this.w0 = new SparseIntArray();
        this.x0 = new SparseIntArray();
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = false;
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = false;
        this.O0 = false;
        this.Q0 = true;
        this.V0 = new ImageReceiver(null);
        this.h1 = true;
        this.m1 = 1.0f;
        this.r1 = 1.0f;
        this.u1 = new OvershootInterpolator(2.0f);
        this.w1 = false;
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.G1 = false;
        this.H1 = false;
        this.L1 = false;
        this.M1 = false;
        this.O1 = -1;
        this.P1 = -1;
        this.Q1 = -1L;
        this.S1 = new tz0(this, 3);
        this.T1 = new tz0(this, 4);
        this.X1 = new h2.f((int[]) null);
        this.Y1 = new Paint();
        this.Z0 = f6Var;
        this.W = i15;
        this.N0 = z9;
        this.c1 = f2Var;
        SharedPreferences e12 = org.telegram.messenger.qp.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = e12.getInt(sb2.toString(), 0) < 3;
        this.f1 = i16;
        this.l1 = i16 == org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var));
        paint2.setColor(i0.a.o(i16, 30));
        this.k1 = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(c8.j9.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z14 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        int i17 = 6;
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 7) {
            this.d1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new d0(this, i17));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G8, f6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, c8.ha.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.p) + (z14 ? -12 : 4), n() ? 0 : this.d1, 0.0f, n() ? this.d1 : 0));
        }
        fi.p5 p5Var = new fi.p5(this, context, f6Var, 15);
        this.b0 = p5Var;
        boolean z15 = i15 == 3 || i15 == 4;
        Integer num4 = valueOf;
        l01 l01Var = new l01(this, context, z15, z15, f6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        this.a0 = l01Var;
        if (!z15) {
            l01Var.setOutlineProvider(new m01(this, num5));
            l01Var.setClipToOutline(true);
            if (z15) {
                l01Var.setElevation(2.0f);
            }
        }
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 15) {
            l01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        l01Var.addView(p5Var, c8.ha.c(-1.0f, -1));
        addView(l01Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 2 || i15 == 7) ? this.d1 + 6 : 0.0f, 0.0f, n() ? this.d1 + 6 : 0.0f));
        if (num5 != null) {
            org.telegram.ui.Components.tm tmVar = new org.telegram.ui.Components.tm(context, 23);
            this.n0 = tmVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.G8, f6Var2, PorterDuff.Mode.MULTIPLY);
            tmVar.setBackground(drawable);
            i12 = 3;
            addView(tmVar, c8.ha.d(17, 9.0f, (n() ? 80 : 48) | 3, (num5.intValue() / org.telegram.messenger.g0.p) + (z14 ? -25 : 10), n() ? 0.0f : this.d1 + 5, 0.0f, n() ? this.d1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z16 = (f2Var == null || i15 == i12 || i15 == 6 || i15 == 5 || i15 == 7 || i15 == 4 || i15 == 9 || i15 == 10 || !z10) ? false : true;
        int i18 = 0;
        while (true) {
            if (i18 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i15 != 4) {
                num2 = num6;
                z12 = true;
            } else {
                num2 = num6;
                z12 = false;
            }
            if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) {
                num3 = num2;
                z13 = true;
            } else {
                num3 = num2;
                z13 = false;
            }
            if (z16) {
                i14 = 7;
                by0Var = new by0(i14, this, f2Var);
            } else {
                i14 = 7;
                by0Var = null;
            }
            Integer num7 = num3;
            int i19 = i18;
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
            int i20 = i15;
            n01 n01Var = new n01(this, context, f6Var3, z12, z13, i20, by0Var, i16, i7);
            org.telegram.ui.Components.xu xuVar = n01Var.D;
            if (xuVar != null) {
                xuVar.setOnLongClickListener(new t(this, i14));
            }
            n01Var.U = false;
            if (i20 == 4) {
                n01Var.setAnimatedEmojiCacheType(13);
            } else {
                n01Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
            }
            n01Var.O = num7 == null;
            n01Var.setPaddingLeft(i20 == 6 ? 10.0f : 5.0f);
            if (i20 != 14 && i20 != 8 && i20 != 13) {
                this.a0.addView(n01Var, c8.ha.c(36.0f, -1));
            }
            this.c0[i19] = n01Var;
            int i21 = i19 + 1;
            i15 = i20;
            i13 = 14;
            i16 = i11;
            f6Var2 = f6Var3;
            i18 = i21;
            num5 = num7;
        }
        Integer num8 = num5;
        org.telegram.ui.ActionBar.f6 f6Var4 = f6Var2;
        int i22 = i15;
        int i23 = i13;
        org.telegram.ui.Components.bv[] bvVarArr = this.c0;
        this.d0 = bvVarArr[0];
        bvVarArr[1].setVisibility(8);
        j01 j01Var = new j01(context, num8, 1);
        this.e0 = j01Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, j01Var, f6Var4);
        if (i22 == i23 || i22 == 8 || i22 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.a0.addView(j01Var, c8.ha.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Z3(j01Var, true, f10, true, false);
        o01 o01Var = new o01(this, context, i22);
        this.h0 = o01Var;
        p01 p01Var = new p01();
        this.e1 = p01Var;
        p01Var.c = 220L;
        p01Var.e = 260L;
        p01Var.f = 160L;
        p01Var.g = 160L;
        p01Var.m = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        p01Var.i = xqVar;
        p01Var.C = false;
        o01Var.setItemAnimator(p01Var);
        o01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        q01 q01Var = new q01(this);
        this.p0 = q01Var;
        o01Var.setAdapter(q01Var);
        f01 f01Var = new f01(this, 1);
        this.r0 = f01Var;
        o01Var.setLayoutManager(f01Var);
        f01Var.O = new d01(this, 0);
        sq0 sq0Var = new sq0(context, 5);
        this.g0 = sq0Var;
        bi.x5 x5Var = new bi.x5(this, context);
        this.k0 = x5Var;
        x5Var.addView(o01Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        sq0Var.addView(x5Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        e01 e01Var = new e01(this, context);
        this.i0 = e01Var;
        if (e01Var.getItemAnimator() != null) {
            f11 = f10;
            e01Var.getItemAnimator().n(180L);
            e01Var.getItemAnimator().i = xqVar;
        } else {
            f11 = f10;
        }
        TextView textView = new TextView(context);
        if (i22 == 4) {
            textView.setText(org.telegram.messenger.id.M0(2131748213, null));
        } else if (i22 == 0 || i22 == 13 || i22 == 12 || i22 == 11 || i22 == 9 || i22 == 10) {
            textView.setText(org.telegram.messenger.id.M0(2131748214, null));
        } else if (i22 == 1 || i22 == 2) {
            textView.setText(org.telegram.messenger.id.M0(2131748175, null));
        } else if (i22 == i23) {
            textView.setText(org.telegram.messenger.id.M0(2131748215, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131748204, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Af, f6Var4);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.l0 = l9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.j0 = frameLayout;
        frameLayout.addView(l9Var, c8.ha.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        sq0Var.addView(frameLayout, c8.ha.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        b11 b11Var = new b11(this);
        this.q0 = b11Var;
        e01Var.setAdapter(b11Var);
        f01 f01Var2 = new f01(this, 0);
        e01Var.setLayoutManager(f01Var2);
        f01Var2.O = new d01(this, 1);
        e01Var.setVisibility(8);
        sq0Var.addView(e01Var, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.addView(sq0Var, c8.ha.d(-1, -1.0f, 48, 0.0f, (i22 == 8 || i22 == 13 || i22 == i23) ? 0.0f : (f11 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(o01Var, f01Var);
        this.s0 = ri0Var;
        ri0Var.i = new ai.m(this, 2);
        ri0Var.h = new uz0(this);
        h01 h01Var = new h01(this, i22, context, f6Var4, num);
        o01Var.p1(h01Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        e01Var.p1(h01Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(this, i22, 2);
        o01Var.setOnItemClickListener(yk0Var);
        e01Var.setOnItemClickListener(yk0Var);
        i01 i01Var = new i01(this, context, z10);
        this.f0 = i01Var;
        i01Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        i01Var.setVisibility(4);
        sq0Var.addView(i01Var, c8.ha.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        j01 j01Var2 = new j01(context, num8, 0);
        Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
        int i24 = org.telegram.ui.ActionBar.k6.G8;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.8f, i24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.l(j01Var2, drawable2, L.a, -1, 2, L.d, f6Var, mode);
        j01Var2.setBackground(drawable2);
        j01Var2.setAlpha(0.0f);
        this.a0.addView(j01Var2, c8.ha.d(-1, 20.0f, 55, 0.0f, (f11 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.o0 = view2;
        Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
        org.telegram.ui.ActionBar.r6.y(this, drawable3, i24, f6Var, mode);
        if (i7 == i23) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.a0.addView(view2, c8.ha.e(-1, 20, 87));
        View view3 = new View(context);
        this.t0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.a0.addView(view3, c8.ha.c(-1.0f, -1));
        int i25 = this.V;
        org.telegram.messenger.ui.b0(i25);
        org.telegram.messenger.ui.b0(i25).B(5);
        if (i7 == i23) {
            org.telegram.messenger.qp.s1(this.V).E0();
        } else if (i7 == 1 || i7 == 11 || i7 == 2 || i7 == 6 || i7 == 13) {
            org.telegram.messenger.ui.b0(i25).A();
        } else if (i7 == 9 || i7 == 10) {
            if (org.telegram.messenger.qp.s1(i25).e7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ui.b0(i25).a1(5, false, false);
                org.telegram.messenger.qp.s1(i25).e7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ui.b0(i25).L(2, false);
            org.telegram.messenger.ui.b0(i25).Y0();
            org.telegram.messenger.ui.b0(i25).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i7 == 0 || i7 == 12) {
            org.telegram.messenger.ui.b0(i25).L(0, true);
            org.telegram.messenger.ui.b0(i25).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i7 == 3) {
            org.telegram.messenger.ui.b0(i25).v();
        } else if (i7 == 4) {
            org.telegram.messenger.ui.b0(i25).V0(0, false, true, false);
            org.telegram.messenger.ui.b0(i25).B(0);
        }
        this.V0.E0(7);
        int i26 = this.W;
        if (i26 == 3 || i26 == 4 || i26 == 6) {
            z11 = true;
        } else {
            com.google.android.gms.internal.cast.b0 b0Var = org.telegram.messenger.gc.D().p;
            if (((CountDownLatch) b0Var.c) == null) {
                z11 = true;
                b0Var.c = new CountDownLatch(1);
            } else {
                z11 = true;
            }
            ch.e0.g = z11;
        }
        B(z11, false, z11);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            String str = arrayList.get(i7);
            i7++;
            this.J.add(ch.o0.b(str));
        }
        o01 o01Var = this.h0;
        if (o01Var != null) {
            for (int i10 = 0; i10 < o01Var.getChildCount(); i10++) {
                if (o01Var.getChildAt(i10) instanceof a11) {
                    a11 a11Var = (a11) o01Var.getChildAt(i10);
                    a11Var.d(this.J.contains(a11Var.y), true);
                }
            }
            o01Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(p11 p11Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(a11 a11Var, ch.o0 o0Var) {
    }
}
