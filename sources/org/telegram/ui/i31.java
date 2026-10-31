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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i31 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
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
    public n21 G;
    public final ArrayList G0;
    public boolean G1;
    public g31 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public k11 J1;
    public final HashSet K;
    public final ArrayList K0;
    public ig.k0 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public s21 O;
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
    public rh.s8 R1;
    public final ArrayList S;
    public s21 S0;
    public final k11 S1;
    public boolean T;
    public boolean T0;
    public final k11 T1;
    public j21 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.f5 W0;
    public ValueAnimator W1;
    public y11 X0;
    public final e2.f X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.p6 Z0;
    public Integer Z1;
    public int a;
    public final d21 a0;
    public float a1;
    public int b;
    public final kg.f0 b0;
    public float b1;
    public int c;
    public final org.telegram.ui.Components.mv[] c0;
    public final org.telegram.ui.ActionBar.k2 c1;
    public int d;
    public org.telegram.ui.Components.mv d0;
    public final int d1;
    public int e;
    public final b21 e0;
    public final h21 e1;
    public int f;
    public final a21 f0;
    public int f1;
    public final dg0 g0;
    public boolean g1;
    public int h;
    public final g21 h0;
    public boolean h1;
    public final v11 i0;
    public ValueAnimator i1;
    public final FrameLayout j0;
    public Drawable j1;
    public final fg.i k0;
    public PorterDuffColorFilter k1;
    public final org.telegram.ui.Components.g9 l0;
    public final boolean l1;
    public final View m0;
    public float m1;
    public int n;
    public final org.telegram.ui.Components.bn n0;
    public int n1;
    public final View o0;
    public org.telegram.ui.Components.d5 o1;
    public final i21 p0;
    public Rect p1;
    public final t21 q0;
    public View q1;
    public int r;
    public final w11 r0;
    public float r1;
    public int s;
    public final org.telegram.ui.Components.vj0 s0;
    public s21 s1;
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

    public i31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this(k2Var, context, z10, num, i10, true, p6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.g9 g9Var) {
        List list;
        org.telegram.messenger.ic b10;
        String str;
        if (g9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(i10).s0[1]);
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            list = a2;
            if (i11 >= size) {
                break;
            }
            if ((arrayList.get(i11) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents != null) {
                ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i11)).documents);
                Collections.shuffle(arrayList2);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        break;
                    }
                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
                    if (document2 != null && list.contains(org.telegram.messenger.jj.V(document2, null, null))) {
                        int i13 = round - 1;
                        if (round <= 0) {
                            round = i13;
                            document = document2;
                            break;
                        } else {
                            round = i13;
                            document = document2;
                        }
                    }
                    i12++;
                }
            }
            if (document != null && round <= 0) {
                break;
            } else {
                i11++;
            }
        }
        if (document == null || round > 0) {
            ArrayList arrayList3 = new ArrayList(org.telegram.messenger.ui.b0(i10).s0(5));
            Collections.shuffle(arrayList3);
            for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                if (arrayList3.get(i14) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents != null) {
                    ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i14)).documents);
                    Collections.shuffle(arrayList4);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList4.size()) {
                            break;
                        }
                        TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i15);
                        if (document3 != null && list.contains(org.telegram.messenger.jj.V(document3, null, null))) {
                            int i16 = round - 1;
                            if (round <= 0) {
                                round = i16;
                                document = document3;
                                break;
                            } else {
                                round = i16;
                                document = document3;
                            }
                        }
                        i15++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
            }
        }
        if (document != null) {
            org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.ic.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "36_36_g";
            } else {
                if (d != null && org.telegram.messenger.jj.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.ic.b(document);
                str = "36_36";
            }
            g9Var.setLayerNum(7);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
            g9Var.m(b10, str, org.telegram.messenger.ic.c(w9, document), "36_36", d, document);
        }
    }

    public static void a(i31 i31Var, int i10, int i11) {
        org.telegram.ui.Components.vj0 vj0Var = i31Var.s0;
        w11 w11Var = i31Var.r0;
        View m10 = w11Var.m(i10);
        int L0 = w11Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !org.telegram.messenger.tz.c()) {
            vj0Var.b = w11Var.L0() < i10 ? 0 : 1;
            vj0Var.d(i10, i11, false, false);
        } else {
            org.telegram.ui.Components.qw qwVar = new org.telegram.ui.Components.qw(i31Var, i31Var.h0.getContext(), 3);
            qwVar.a = i10;
            qwVar.p = i11;
            w11Var.w0(qwVar);
        }
    }

    public static boolean c(i31 i31Var) {
        if (i31Var.T) {
            return true;
        }
        ValueAnimator valueAnimator = i31Var.V1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.f5.f();
            }
            if (i11 != 3 && i11 != 4) {
                i10 = 2;
                if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                    return 3;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        if (this.j1 == null) {
            int i10 = this.W;
            if (i10 == 5 || i10 == 9 || i10 == 10 || i10 == 7) {
                this.j1 = i0.a.f(org.telegram.messenger.w0.b, R.drawable.msg_filled_blocked);
            } else {
                this.j1 = i0.a.f(org.telegram.messenger.w0.b, R.drawable.msg_settings_premium);
            }
            this.j1.setColorFilter(this.k1);
        }
        return this.j1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.k6.c(str);
        int i10 = 0;
        while (true) {
            if (i10 >= tL_messages_stickerSet.packs.size()) {
                j10 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.k6.c(tL_messages_stickerSet.packs.get(i10).emoticon), c10)) {
                j10 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                break;
            }
            i10++;
        }
        if (j10 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.id == j10) {
                return document;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.f5 f5Var) {
        org.telegram.ui.Components.f5 f5Var2;
        if (this.I && (f5Var2 = this.W0) != f5Var) {
            if (f5Var2 != null) {
                f5Var2.n(this);
            }
            this.W0 = f5Var;
            if (f5Var != null) {
                f5Var.setColorFilter(this.k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = c2;
        if (zArr[i10]) {
            return;
        }
        org.telegram.messenger.ui.b0(i10);
        zArr[i10] = true;
        org.telegram.messenger.ui.b0(i10).B(5);
        org.telegram.messenger.ui.b0(i10).L(0, true);
        org.telegram.messenger.ui.b0(i10).A();
        org.telegram.messenger.ui.b0(i10).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        org.telegram.messenger.ui.b0(i10).P();
        org.telegram.messenger.ui.b0(i10).v();
        org.telegram.ui.Components.bw0.E3.c(i10, 1, new org.telegram.ui.Components.rv0(i10, 0));
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        g21 g21Var = this.h0;
        if (g21Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < g21Var.getChildCount(); i11++) {
                if (g21Var.getChildAt(i11) instanceof s21) {
                    s21 s21Var = (s21) g21Var.getChildAt(i11);
                    org.telegram.ui.Components.o5 o5Var = s21Var.e;
                    if (o5Var == null || o5Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = s21Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            s21Var.f();
                        }
                    } else {
                        s21Var.f();
                    }
                    z10 = true;
                }
            }
            g21Var.invalidate();
            if (z10) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.v0;
                if (i10 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i10)).longValue();
                if (longValue == (l4.longValue() * 13) + 62425 || longValue == (l4.longValue() * 13) + 3212) {
                    break;
                } else {
                    i10++;
                }
            }
            i21 i21Var = this.p0;
            if (i21Var != null) {
                i21Var.g(i10);
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
    public final void B(boolean z10, boolean z11, boolean z12) {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z13;
        ArrayList arrayList;
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList2;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        ArrayList arrayList3;
        ArrayList P;
        int i14;
        int i15;
        ArrayList arrayList4;
        int size;
        int i16;
        ArrayList arrayList5;
        int i17;
        g21 g21Var;
        int i18;
        SparseIntArray sparseIntArray3;
        HashSet hashSet2;
        org.telegram.messenger.ui uiVar;
        int i19;
        ArrayList arrayList6;
        TLRPC.StickerSet stickerSet;
        int i20;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList7;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID;
        org.telegram.ui.Components.ix ixVar;
        int i21;
        SparseIntArray sparseIntArray4;
        ArrayList arrayList8;
        int i22;
        SparseIntArray sparseIntArray5;
        SparseIntArray sparseIntArray6;
        TLRPC.StickerSet stickerSet2;
        boolean z15;
        ArrayList arrayList9;
        int i23;
        int i24;
        int i25;
        boolean z16;
        int i26;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList10;
        boolean z17 = !this.P ? false : z11;
        int i27 = this.V;
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i27);
        if (z10 || this.L0 == null) {
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
        boolean z18 = z17;
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
        int i28 = this.W;
        if (isEmpty) {
            sparseIntArray = sparseIntArray8;
        } else {
            sparseIntArray = sparseIntArray8;
        }
        if (i28 != 5 && i28 != 7 && i28 != 8) {
            int i29 = this.u0;
            sparseIntArray2 = sparseIntArray7;
            this.u0 = i29 + 1;
            this.a = i29;
            arrayList13.add(9L);
            z13 = this.N0;
            if (i28 != 5 || i28 == 7) {
                arrayList = arrayList11;
                i10 = z13 ? 1 : 0;
                if (i10 != 0) {
                    this.u0++;
                    arrayList13.add(2L);
                }
                tL_emojiList = org.telegram.messenger.ui.b0(i27).L1;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i11 = 0;
                    while (i11 < tL_emojiList.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.o5(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList15.size(); i12++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.o5) arrayList15.get(i12)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            } else if (i28 != 4) {
                arrayList = arrayList11;
                i10 = z13 ? 1 : 0;
                if (i28 == 6) {
                    if (i10 != 0) {
                        this.u0++;
                        arrayList13.add(2L);
                    }
                    ArrayList arrayList23 = org.telegram.messenger.ui.b0(i27).n;
                    for (int i30 = 0; i30 < arrayList23.size(); i30++) {
                        arrayList19.add(((TLRPC.TL_availableReaction) arrayList23.get(i30)).activate_animation);
                    }
                    int i31 = 0;
                    while (i31 < arrayList19.size()) {
                        arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i31)).id * 13) + 62425));
                        this.u0++;
                        i31++;
                        arrayList19 = arrayList19;
                    }
                } else if (i28 == 3) {
                    int i32 = this.u0;
                    this.u0 = i32 + 1;
                    this.y = i32;
                    arrayList13.add(12L);
                    int i33 = this.u0;
                    this.u0 = i33 + 1;
                    this.x = i33;
                    arrayList13.add(7L);
                    String str = org.telegram.messenger.d20.i(i27).e0;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i27).p0(str);
                        tL_messages_stickerSet = p02 == null ? org.telegram.messenger.ui.b0(i27).n0(str) : p02;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i10 != 0) {
                            this.u0++;
                            arrayList13.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList24 = tL_messages_stickerSet.documents;
                        if (arrayList24 != null && !arrayList24.isEmpty()) {
                            int i34 = 0;
                            while (i34 < tL_messages_stickerSet.documents.size()) {
                                arrayList15.add(new org.telegram.ui.Components.o5(tL_messages_stickerSet.documents.get(i34), (Paint.FontMetricsInt) null));
                                i34++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i35 = 0; i35 < arrayList15.size(); i35++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.o5) arrayList15.get(i35)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                    }
                }
            } else if (this.Q) {
                arrayList19.addAll(org.telegram.messenger.ui.b0(i27).f0[0]);
                i10 = z13 ? 1 : 0;
                int i36 = 0;
                while (i36 < arrayList19.size()) {
                    arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i36)).id * 13) + 62425));
                    this.u0++;
                    i36++;
                    arrayList11 = arrayList11;
                }
                arrayList = arrayList11;
            } else {
                arrayList = arrayList11;
                i10 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.R ? org.telegram.messenger.ui.b0(i27).J1 : org.telegram.messenger.ui.b0(i27).K1;
                if (tL_emojiList3 != null && (arrayList10 = tL_emojiList3.document_id) != null && !arrayList10.isEmpty()) {
                    org.telegram.ui.Components.ix ixVar2 = new org.telegram.ui.Components.ix();
                    ixVar2.f = true;
                    ixVar2.g = false;
                    ixVar2.h = true;
                    ixVar2.e = true;
                    ixVar2.b = new TLRPC.TL_stickerSet();
                    ixVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList18.size();
                    arrayList18.add(ixVar2);
                    int i37 = 0;
                    while (i37 < tL_emojiList3.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.o5(tL_emojiList3.document_id.get(i37).longValue(), (Paint.FontMetricsInt) null));
                        i37++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i38 = 0; i38 < arrayList15.size(); i38++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.o5) arrayList15.get(i38)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            }
            if (this.O0 || i28 == 13 || i28 == 2 || i28 == 11 || i28 == 3 || i28 == 6 || i28 == 8 || i28 == 4 || i28 == 5 || i28 == 7) {
                i13 = 2;
            } else {
                int i39 = this.u0;
                i13 = 2;
                this.u0 = i39 + 1;
                this.w = i39;
                arrayList13.add(6L);
            }
            if ((i28 != 9 || i28 == 10) && (tL_emojiList2 = org.telegram.messenger.ui.b0(i27).M1) != null) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(tL_emojiList2.document_id);
                hashSet = hashSet3;
            } else {
                hashSet = null;
            }
            if (this.R0 == null) {
                this.d = this.u0;
                ArrayList arrayList25 = new ArrayList(this.R0);
                if (i28 == 13 && arrayList25.size() > 8) {
                    arrayList25.subList(8, arrayList25.size()).clear();
                } else if (i28 == 14) {
                    arrayList9 = new ArrayList();
                    int i40 = 0;
                    while (i40 < arrayList25.size()) {
                        if (((sg.o0) arrayList25.get(i40)).e) {
                            arrayList9.add((sg.o0) arrayList25.remove(i40));
                            i40--;
                        }
                        i40++;
                    }
                    if (i28 != 8 || i28 == 11 || i28 == 13) {
                        arrayList16.addAll(arrayList25);
                    } else {
                        for (int i41 = 0; i41 < 16; i41++) {
                            if (!arrayList25.isEmpty()) {
                                arrayList16.add((sg.o0) arrayList25.remove(0));
                            }
                        }
                    }
                    i23 = 0;
                    while (i23 < arrayList16.size()) {
                        arrayList13.add(Long.valueOf((((sg.o0) arrayList16.get(i23)).hashCode() * 13) - 5632));
                        i23++;
                        arrayList20 = arrayList20;
                    }
                    arrayList3 = arrayList20;
                    int size2 = arrayList16.size() + this.u0;
                    this.u0 = size2;
                    this.e = size2;
                    if (!arrayList25.isEmpty() && i28 != 8 && i28 != 11 && i28 != 13) {
                        i25 = 0;
                        while (true) {
                            if (i25 < arrayList25.size()) {
                                z16 = true;
                                break;
                            } else {
                                if (((sg.o0) arrayList25.get(i25)).g != 0) {
                                    z16 = false;
                                    break;
                                }
                                i25++;
                            }
                        }
                        if (i28 != 14) {
                            if (!z16) {
                                int i42 = this.u0;
                                this.u0 = i42 + 1;
                                this.f = i42;
                                arrayList13.add(4L);
                            } else if (org.telegram.messenger.d20.i(i27).q()) {
                                int i43 = this.u0;
                                this.u0 = i43 + 1;
                                this.h = i43;
                                arrayList13.add(5L);
                            }
                        }
                        this.b = this.u0;
                        arrayList17.addAll(arrayList25);
                        for (i26 = 0; i26 < arrayList17.size(); i26++) {
                            arrayList13.add(Long.valueOf((((sg.o0) arrayList17.get(i26)).h * 13) + (z16 ? 4235 : -3142)));
                        }
                        int size3 = arrayList17.size() + this.u0;
                        this.u0 = size3;
                        this.c = size3;
                    }
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        int i44 = this.u0;
                        this.u0 = i44 + 1;
                        this.D = i44;
                        arrayList13.add(8L);
                        this.E = this.u0;
                        this.J0 = arrayList9;
                        for (i24 = 0; i24 < arrayList9.size(); i24++) {
                            arrayList13.add(Long.valueOf(((sg.o0) arrayList9.get(i24)).c * 19));
                        }
                        int size4 = arrayList9.size() + this.u0;
                        this.u0 = size4;
                        this.F = size4;
                    }
                }
                arrayList9 = null;
                if (i28 != 8) {
                }
                arrayList16.addAll(arrayList25);
                i23 = 0;
                while (i23 < arrayList16.size()) {
                }
                arrayList3 = arrayList20;
                int size22 = arrayList16.size() + this.u0;
                this.u0 = size22;
                this.e = size22;
                if (!arrayList25.isEmpty()) {
                    i25 = 0;
                    while (true) {
                        if (i25 < arrayList25.size()) {
                        }
                        i25++;
                    }
                    if (i28 != 14) {
                    }
                    this.b = this.u0;
                    arrayList17.addAll(arrayList25);
                    while (i26 < arrayList17.size()) {
                    }
                    int size32 = arrayList17.size() + this.u0;
                    this.u0 = size32;
                    this.c = size32;
                }
                if (arrayList9 != null) {
                    int i442 = this.u0;
                    this.u0 = i442 + 1;
                    this.D = i442;
                    arrayList13.add(8L);
                    this.E = this.u0;
                    this.J0 = arrayList9;
                    while (i24 < arrayList9.size()) {
                    }
                    int size42 = arrayList9.size() + this.u0;
                    this.u0 = size42;
                    this.F = size42;
                }
            } else {
                arrayList3 = arrayList20;
                if (i28 == 0 || i28 == 12 || i28 == 9 || i28 == 10) {
                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(i27);
                    Long[] lArr = b03.F0;
                    ArrayList[] arrayListArr = b03.E0;
                    if (!b03.G0[0]) {
                        b03.L(0, true);
                    } else if (arrayListArr[0] == null || (lArr[0] != null && (System.currentTimeMillis() / 1000) - lArr[0].longValue() > 1800)) {
                        b03.L(0, false);
                    }
                    ArrayList arrayList26 = arrayListArr[0];
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(i27).m0((i28 == 0 || i28 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                    if (m0 != null) {
                        if (i10 != 0) {
                            this.u0++;
                            arrayList13.add(2L);
                        }
                        if (i28 == 0 || i28 == 12) {
                            P = org.telegram.messenger.ui.b0(i27).P();
                        } else {
                            org.telegram.messenger.ui b04 = org.telegram.messenger.ui.b0(i27);
                            Long[] lArr2 = b04.F0;
                            ArrayList[] arrayListArr2 = b04.E0;
                            if (b04.G0[i13]) {
                                i15 = i13;
                                if (arrayListArr2[i15] == null || (lArr2[i15] != null && (System.currentTimeMillis() / 1000) - lArr2[i15].longValue() > 1800)) {
                                    b04.L(i15, false);
                                }
                            } else {
                                i15 = i13;
                                b04.L(i15, true);
                            }
                            P = arrayListArr2[i15];
                        }
                        ArrayList<TLRPC.Document> arrayList27 = m0.documents;
                        if (arrayList27 != null && !arrayList27.isEmpty()) {
                            for (int i45 = 0; i45 < Math.min(7, m0.documents.size()); i45++) {
                                arrayList15.add(new org.telegram.ui.Components.o5(m0.documents.get(i45), (Paint.FontMetricsInt) null));
                                if (arrayList15.size() + i10 >= 104) {
                                    break;
                                }
                            }
                        }
                        if ((i28 == 0 || i28 == 12) && arrayList26 != null && !arrayList26.isEmpty()) {
                            int size5 = arrayList26.size();
                            int i46 = 0;
                            while (i46 < size5) {
                                Object obj = arrayList26.get(i46);
                                i46++;
                                Long g10 = org.telegram.messenger.h20.g((TLRPC.EmojiStatus) obj);
                                if (g10 != null) {
                                    int i47 = 0;
                                    while (true) {
                                        if (i47 >= arrayList15.size()) {
                                            ArrayList arrayList28 = arrayList26;
                                            int i48 = size5;
                                            arrayList15.add(new org.telegram.ui.Components.o5(g10.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i10 >= 104) {
                                                break;
                                            }
                                            arrayList26 = arrayList28;
                                            size5 = i48;
                                        } else if (((org.telegram.ui.Components.o5) arrayList15.get(i47)).getDocumentId() == g10.longValue()) {
                                            break;
                                        } else {
                                            i47++;
                                        }
                                    }
                                }
                            }
                        }
                        if (P != null && !P.isEmpty()) {
                            int size6 = P.size();
                            int i49 = 0;
                            while (i49 < size6) {
                                Object obj2 = P.get(i49);
                                i49++;
                                Long g11 = org.telegram.messenger.h20.g((TLRPC.EmojiStatus) obj2);
                                if (g11 != null) {
                                    int i50 = 0;
                                    while (true) {
                                        if (i50 >= arrayList15.size()) {
                                            arrayList15.add(new org.telegram.ui.Components.o5(g11.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i10 >= 104) {
                                                break;
                                            }
                                        } else if (((org.telegram.ui.Components.o5) arrayList15.get(i50)).getDocumentId() == g11.longValue()) {
                                            break;
                                        } else {
                                            i50++;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList15.size() <= 40 - i10 || this.C0) {
                            for (int i51 = 0; i51 < arrayList15.size(); i51++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.o5) arrayList15.get(i51)).getDocumentId() * 13) + 43223));
                                this.u0++;
                            }
                        } else {
                            for (int i52 = 0; i52 < 39 - i10; i52++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.o5) arrayList15.get(i52)).getDocumentId() * 13) + 43223));
                                this.u0++;
                            }
                            arrayList13.add(Long.valueOf(((((arrayList15.size() - 40) + i10) + 1) * 13) - 5531));
                            n21 n21Var = this.G;
                            if (n21Var != null) {
                                TextView textView = n21Var.a;
                                StringBuilder sb2 = new StringBuilder("+");
                                i14 = 1;
                                sb2.append((arrayList15.size() - 40) + i10 + 1);
                                textView.setText(sb2.toString());
                            } else {
                                i14 = 1;
                            }
                            sparseIntArray9.put(this.u0, -1);
                            this.u0 += i14;
                        }
                    }
                }
            }
            arrayList21.clear();
            if (i28 != 0 || i28 == 12 || i28 == 9 || i28 == 10) {
                rh.v5 G = rh.e6.y(i27, false).G(getDialogId(), true);
                G.b();
                arrayList4 = new ArrayList();
                ArrayList arrayList29 = G.l;
                size = arrayList29.size();
                i16 = 0;
                while (i16 < size) {
                    Object obj3 = arrayList29.get(i16);
                    i16++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList4.isEmpty()) {
                    int i53 = this.u0;
                    this.u0 = i53 + 1;
                    this.n = i53;
                    arrayList13.add(22L);
                    this.r = this.u0;
                    int size7 = arrayList4.size();
                    int i54 = 0;
                    while (i54 < size7) {
                        Object obj4 = arrayList4.get(i54);
                        i54++;
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
            if (i28 == 13) {
                String[][] strArr = org.telegram.messenger.l6.f;
                for (int i55 = 0; i55 < 8; i55++) {
                    for (String str2 : strArr[i55]) {
                        arrayList3.add(str2);
                        arrayList13.add(Long.valueOf((r8.hashCode() * 322) + 13334));
                        this.u0++;
                    }
                }
            }
            if (i28 != 8 && i28 != 13 && i28 != 14) {
                i22 = 0;
                while (i22 < arrayList.size()) {
                    ArrayList arrayList30 = arrayList;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) arrayList30.get(i22);
                    if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null) {
                        if (i28 == 5 || i28 == 7) {
                            if (stickerSet2 != null) {
                                if (stickerSet2.text_color) {
                                    z15 = true;
                                } else {
                                    ArrayList<TLRPC.Document> arrayList31 = tL_messages_stickerSet2.documents;
                                    if (arrayList31 != null && !arrayList31.isEmpty()) {
                                        z15 = org.telegram.messenger.jj.C4(tL_messages_stickerSet2.documents.get(0));
                                    }
                                }
                            }
                            z15 = false;
                        }
                        if ((i28 != 10 && i28 != 9) || tL_messages_stickerSet2.set.channel_emoji_status) {
                            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet2.set;
                            if (stickerSet3.emojis || this.Q) {
                                if (!this.B0.contains(Long.valueOf(stickerSet3.id))) {
                                    sparseIntArray6 = sparseIntArray2;
                                    sparseIntArray6.put(this.u0, arrayList18.size());
                                    sparseIntArray5 = sparseIntArray;
                                    sparseIntArray5.put(arrayList18.size(), this.u0);
                                    this.u0++;
                                    arrayList13.add(Long.valueOf((tL_messages_stickerSet2.set.id * 13) + 9211));
                                    org.telegram.ui.Components.ix ixVar3 = new org.telegram.ui.Components.ix();
                                    ixVar3.f = true;
                                    ixVar3.g = false;
                                    ixVar3.h = true;
                                    if (i28 == 4) {
                                        ixVar3.e = false;
                                    } else {
                                        ixVar3.e = !org.telegram.messenger.jj.V3(tL_messages_stickerSet2);
                                    }
                                    ixVar3.b = tL_messages_stickerSet2.set;
                                    ixVar3.c = j(tL_messages_stickerSet2.documents, hashSet);
                                    arrayList18.size();
                                    arrayList18.add(ixVar3);
                                    this.u0 = ixVar3.c.size() + this.u0;
                                    for (int i56 = 0; i56 < ixVar3.c.size(); i56++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) ixVar3.c.get(i56)).id * 13) + 3212));
                                    }
                                    i22++;
                                    sparseIntArray = sparseIntArray5;
                                    arrayList = arrayList30;
                                    sparseIntArray2 = sparseIntArray6;
                                }
                            }
                        }
                    }
                    sparseIntArray5 = sparseIntArray;
                    sparseIntArray6 = sparseIntArray2;
                    i22++;
                    sparseIntArray = sparseIntArray5;
                    arrayList = arrayList30;
                    sparseIntArray2 = sparseIntArray6;
                }
            }
            SparseIntArray sparseIntArray12 = sparseIntArray;
            SparseIntArray sparseIntArray13 = sparseIntArray2;
            if (!this.Q || i28 == 8 || i28 == 13) {
                arrayList5 = arrayList18;
                i17 = 14;
            } else {
                i17 = 14;
                if (i28 != 14) {
                    int i57 = 0;
                    while (i57 < arrayList22.size()) {
                        ArrayList arrayList32 = arrayList22;
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList32.get(i57);
                        TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                        int i58 = 0;
                        while (true) {
                            if (i58 >= arrayList18.size()) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    int i59 = i57;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i19 = i59;
                                    arrayList22 = arrayList32;
                                    stickerSet = stickerSet4;
                                    arrayList6 = arrayList18;
                                    i20 = 10;
                                    TLRPC.TL_messages_stickerSet l02 = uiVar.l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (l02 != null) {
                                        ArrayList<TLRPC.Document> arrayList33 = l02.documents;
                                        boolean V3 = org.telegram.messenger.jj.V3(l02);
                                        arrayList7 = arrayList33;
                                        z14 = V3;
                                    } else {
                                        TLRPC.TL_inputStickerSetID Z = org.telegram.messenger.ui.Z(stickerSetCovered.set);
                                        arrayList7 = new ArrayList<>();
                                        tL_inputStickerSetID = Z;
                                        z14 = true;
                                        if (arrayList7 != null && ((!(i28 == 5 || i28 == 7) || (!arrayList7.isEmpty() && org.telegram.messenger.jj.C4(arrayList7.get(0)))) && (!(i28 == i20 || i28 == 9) || stickerSet.channel_emoji_status))) {
                                            sparseIntArray13.put(this.u0, arrayList6.size());
                                            sparseIntArray3.put(arrayList6.size(), this.u0);
                                            this.u0++;
                                            boolean z19 = z14;
                                            arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                            ixVar = new org.telegram.ui.Components.ix();
                                            ixVar.d = tL_inputStickerSetID;
                                            ixVar.f = this.B0.contains(Long.valueOf(stickerSet.id));
                                            ixVar.g = true;
                                            if (i28 != 4) {
                                                ixVar.e = false;
                                            } else {
                                                ixVar.e = !z19;
                                            }
                                            ixVar.b = stickerSet;
                                            ixVar.c = j(arrayList7, hashSet2);
                                            arrayList6.size();
                                            ixVar.h = this.A0.contains(Long.valueOf(ixVar.b.id));
                                            if (ixVar.c.size() > 24 || ixVar.h) {
                                                this.u0 = ixVar.c.size() + this.u0;
                                                for (i21 = 0; i21 < ixVar.c.size(); i21++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) ixVar.c.get(i21)).id * 13) + 3212));
                                                }
                                            } else {
                                                this.u0 += 24;
                                                for (int i60 = 0; i60 < 23; i60++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) ixVar.c.get(i60)).id * 13) + 3212));
                                                }
                                                arrayList13.add(Long.valueOf(((ixVar.c.size() - 23) * 169) + ((stickerSet.id * 13) - 5531)));
                                                sparseIntArray9.put(this.u0 - 1, arrayList6.size());
                                            }
                                            if (!ixVar.f) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else if (i28 == 4 || i28 == 5 || i28 == 7 || i28 == 6) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else {
                                                sparseIntArray4 = sparseIntArray11;
                                                sparseIntArray4.put(this.u0, arrayList6.size());
                                                this.u0++;
                                                arrayList13.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                                arrayList8 = arrayList6;
                                                arrayList8.add(ixVar);
                                            }
                                            arrayList8 = arrayList6;
                                            arrayList8.add(ixVar);
                                        } else {
                                            sparseIntArray4 = sparseIntArray11;
                                            arrayList8 = arrayList6;
                                        }
                                    }
                                } else {
                                    int i61 = i57;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i19 = i61;
                                    arrayList22 = arrayList32;
                                    arrayList6 = arrayList18;
                                    stickerSet = stickerSet4;
                                    i20 = 10;
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        z14 = org.telegram.messenger.jj.U3(stickerSetCovered);
                                    } else {
                                        z14 = false;
                                        arrayList7 = null;
                                    }
                                }
                                tL_inputStickerSetID = null;
                                if (arrayList7 != null) {
                                    sparseIntArray13.put(this.u0, arrayList6.size());
                                    sparseIntArray3.put(arrayList6.size(), this.u0);
                                    this.u0++;
                                    boolean z192 = z14;
                                    arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                    ixVar = new org.telegram.ui.Components.ix();
                                    ixVar.d = tL_inputStickerSetID;
                                    ixVar.f = this.B0.contains(Long.valueOf(stickerSet.id));
                                    ixVar.g = true;
                                    if (i28 != 4) {
                                    }
                                    ixVar.b = stickerSet;
                                    ixVar.c = j(arrayList7, hashSet2);
                                    arrayList6.size();
                                    ixVar.h = this.A0.contains(Long.valueOf(ixVar.b.id));
                                    if (ixVar.c.size() > 24) {
                                    }
                                    this.u0 = ixVar.c.size() + this.u0;
                                    while (i21 < ixVar.c.size()) {
                                    }
                                    if (!ixVar.f) {
                                    }
                                    arrayList8 = arrayList6;
                                    arrayList8.add(ixVar);
                                }
                                sparseIntArray4 = sparseIntArray11;
                                arrayList8 = arrayList6;
                            } else {
                                if (((org.telegram.ui.Components.ix) arrayList18.get(i58)).b.id == stickerSet4.id) {
                                    int i62 = i57;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    uiVar = uiVar2;
                                    i19 = i62;
                                    arrayList22 = arrayList32;
                                    arrayList8 = arrayList18;
                                    sparseIntArray4 = sparseIntArray11;
                                    break;
                                }
                                i58++;
                            }
                        }
                        int i63 = i19 + 1;
                        sparseIntArray11 = sparseIntArray4;
                        uiVar2 = uiVar;
                        i17 = 14;
                        hashSet = hashSet2;
                        sparseIntArray12 = sparseIntArray3;
                        i57 = i63;
                        arrayList18 = arrayList8;
                    }
                }
                arrayList5 = arrayList18;
            }
            if (i28 != i17 && i28 != 8 && i28 != 13) {
                this.d0.p(arrayList5);
            }
            g21Var = this.h0;
            if (z18) {
                g21Var.setItemAnimator(null);
            } else {
                g21Var.setItemAnimator(this.e1);
            }
            if (z12) {
                i18 = 0;
                this.p0.f();
            } else {
                i18 = 0;
                s4.n.c(new hg.a(this, arrayList14, 4), false).c(this.p0);
            }
            if (g21Var.J1) {
                g21Var.v0(i18);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray7;
        this.a = -1;
        z13 = this.N0;
        if (i28 != 5) {
        }
        arrayList = arrayList11;
        i10 = z13 ? 1 : 0;
        if (i10 != 0) {
        }
        tL_emojiList = org.telegram.messenger.ui.b0(i27).L1;
        if (tL_emojiList != null) {
            i11 = 0;
            while (i11 < tL_emojiList.document_id.size()) {
            }
            while (i12 < arrayList15.size()) {
            }
        }
        if (this.O0) {
        }
        i13 = 2;
        if (i28 != 9) {
        }
        HashSet hashSet32 = new HashSet();
        hashSet32.addAll(tL_emojiList2.document_id);
        hashSet = hashSet32;
        if (this.R0 == null) {
        }
        arrayList21.clear();
        if (i28 != 0) {
        }
        rh.v5 G2 = rh.e6.y(i27, false).G(getDialogId(), true);
        G2.b();
        arrayList4 = new ArrayList();
        ArrayList arrayList292 = G2.l;
        size = arrayList292.size();
        i16 = 0;
        while (i16 < size) {
        }
        if (arrayList4.isEmpty()) {
        }
        if (i28 == 13) {
        }
        if (i28 != 8) {
            i22 = 0;
            while (i22 < arrayList.size()) {
            }
        }
        SparseIntArray sparseIntArray122 = sparseIntArray;
        SparseIntArray sparseIntArray132 = sparseIntArray2;
        if (this.Q) {
        }
        arrayList5 = arrayList18;
        i17 = 14;
        if (i28 != i17) {
            this.d0.p(arrayList5);
        }
        g21Var = this.h0;
        if (z18) {
        }
        if (z12) {
        }
        if (g21Var.J1) {
        }
    }

    public final void C() {
        a21 a21Var = this.f0;
        if (a21Var == null) {
            return;
        }
        if (this.z1) {
            a21Var.clearAnimation();
            a21Var.setVisibility(0);
            a21Var.animate().translationY(0.0f).start();
            return;
        }
        g21 g21Var = this.h0;
        if (g21Var.getChildCount() <= 0) {
            a21Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
            return;
        }
        View childAt = g21Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            a21Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
        } else {
            a21Var.setVisibility(0);
            a21Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f7) {
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.gr.g.getInterpolation(w7.u.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.bn bnVar = this.n0;
        if (bnVar != null) {
            float a10 = w7.u.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            bnVar.setAlpha(a10);
            bnVar.setScaleX(a10);
            bnVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.u.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.u.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.u.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.u.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        float interpolation2 = grVar.getInterpolation(a11);
        float interpolation3 = grVar.getInterpolation(a12);
        this.b0.setAlpha(a14);
        this.f0.setAlpha(a14);
        int i10 = 0;
        for (int i11 = 0; i11 < this.d0.b.getChildCount(); i11++) {
            this.d0.b.getChildAt(i11).setAlpha(a14);
        }
        if (this.o1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        d21 d21Var = this.a0;
        d21Var.setTranslationY(org.telegram.messenger.i0.L(-5.0f) * f12);
        if (bnVar != null) {
            bnVar.setTranslationY(org.telegram.messenger.i0.L(-5.0f) * f12);
        }
        this.a1 = (interpolation2 * 0.85f) + 0.15f;
        this.b1 = (interpolation3 * 0.925f) + 0.075f;
        d21Var.invalidateOutline();
        if (bnVar != null) {
            bnVar.setAlpha(a14);
        }
        b21 b21Var = this.e0;
        b21Var.setAlpha(a14);
        b21Var.setScaleX(Math.min(this.a1, 1.0f));
        float pivotX = b21Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(d21Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(d21Var.getHeight(), 2.0d) + Math.pow(d21Var.getWidth() - pivotX, 2.0d)));
        for (int i12 = 0; i12 < this.d0.b.getChildCount(); i12++) {
            View childAt = this.d0.b.getChildAt(i12);
            if (f7 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f7 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float s10 = org.telegram.messenger.i0.s(a13, (float) Math.sqrt(c3.i0.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s10)) {
                s10 = 0.0f;
            }
            childAt.setScaleX(s10);
            childAt.setScaleY(s10);
        }
        while (true) {
            g21 g21Var = this.h0;
            if (i10 >= g21Var.getChildCount()) {
                this.k0.invalidate();
                g21Var.invalidate();
                return;
            }
            View childAt2 = g21Var.getChildAt(i10);
            if (childAt2 instanceof s21) {
                s21 s21Var = (s21) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float s11 = org.telegram.messenger.i0.s(a13, (float) Math.sqrt(c3.i0.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(s11)) {
                    s11 = 0.0f;
                }
                s21Var.setAnimatedScale(s11);
            }
            i10++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.x0;
        k11 k11Var = this.T1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                org.telegram.messenger.i0.r(k11Var);
                org.telegram.messenger.i0.g3(k11Var);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.A0) {
            org.telegram.messenger.i0.r(k11Var);
            org.telegram.messenger.i0.g3(k11Var);
            return;
        }
        if (i10 == org.telegram.messenger.zs.C1) {
            org.telegram.messenger.i0.r(k11Var);
            org.telegram.messenger.i0.g3(k11Var);
            return;
        }
        if (i10 == org.telegram.messenger.zs.B0) {
            org.telegram.messenger.i0.r(k11Var);
            org.telegram.messenger.i0.g3(k11Var);
            return;
        }
        if (i10 != org.telegram.messenger.zs.i4) {
            if (i10 == org.telegram.messenger.zs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.d20.i(this.V).e()) {
                org.telegram.messenger.i0.r(k11Var);
                org.telegram.messenger.i0.g3(k11Var);
                return;
            }
            return;
        }
        ag.z0 z0Var = new ag.z0(2);
        g21 g21Var = this.h0;
        org.telegram.messenger.i0.d0(g21Var, z0Var);
        if (g21Var != null) {
            g21Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.d5 d5Var = this.o1;
        if (d5Var != null && (num = this.Y0) != null) {
            Rect bounds = d5Var.getBounds();
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
            float f7 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f7;
            float z10 = c3.i0.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.d1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? org.telegram.messenger.i0.L(i10) : getMeasuredHeight() - (org.telegram.messenger.i0.L(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.d5 d5Var2 = this.o1;
            Rect rect = this.p1;
            int i11 = rect.left;
            Rect rect2 = this.p1;
            d5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.o1.draw(canvas);
            org.telegram.ui.Components.d5 d5Var3 = this.o1;
            d5Var3.w = alpha;
            d5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        s21 s21Var = this.s1;
        if (s21Var == null || this.t1 == null || s21Var.E == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.s1.E.setAlpha((int) (this.r1 * 255.0f));
        this.s1.E.setBounds(this.t1);
        this.s1.E.setColorFilter(new PorterDuffColorFilter(i0.b.f(1.0f - this.m1, this.f1, this.n1), PorterDuff.Mode.SRC_IN));
        this.s1.E.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.P1 - this.O1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.P1 - this.O1) * 25) + f() + 16;
    }

    public rh.s8 getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new rh.s8(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return org.telegram.messenger.d20.i(this.V).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.G1 ? this.i0 : this.h0).canScrollVertically(1);
        if (canScrollVertically != this.w1) {
            this.w1 = canScrollVertically;
            org.telegram.messenger.z20.l(this.o0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        Integer num;
        int i13;
        int i14;
        boolean z11;
        int i15 = this.y0.get(i10);
        Integer num2 = null;
        if (i15 >= 0) {
            ArrayList arrayList = this.M0;
            if (i15 < arrayList.size()) {
                org.telegram.ui.Components.ix ixVar = (org.telegram.ui.Components.ix) arrayList.get(i15);
                if (ixVar.h) {
                    return;
                }
                boolean z12 = i15 + 1 == arrayList.size();
                i13 = this.x0.get(i15);
                this.A0.add(Long.valueOf(ixVar.b.id));
                i11 = 24;
                i12 = ixVar.h ? ixVar.c.size() : Math.min(24, ixVar.c.size());
                num = ixVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                ixVar.h = true;
                i14 = ixVar.c.size();
                z11 = z12;
                if (i14 > i12) {
                    num = Integer.valueOf(i13 + 1 + i12);
                    num2 = Integer.valueOf(i14 - i12);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.N1 = view;
                this.O1 = num.intValue();
                this.P1 = num2.intValue() + num.intValue();
                this.Q1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.dx(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i15 != -1 || (z10 = this.C0)) {
            return;
        }
        int i16 = (this.a != -1 ? 1 : 0) + (this.w != -1 ? 1 : 0);
        boolean z13 = this.N0;
        int i17 = i16 + (z13 ? 1 : 0);
        ArrayList arrayList2 = this.D0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z13 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.C0 = true;
        i11 = 40;
        i12 = size;
        num = null;
        i13 = i17;
        i14 = size2;
        z11 = false;
        if (i14 > i12) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void l() {
        int i10 = this.W;
        if (i10 == 2) {
            return;
        }
        String r10 = a1.g.r(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = org.telegram.messenger.vp.d1().getInt(r10, 0);
        if (i11 <= 3) {
            org.telegram.messenger.vp.d1().edit().putInt(r10, i11 + 1).apply();
        }
    }

    public final boolean n() {
        int i10 = this.W;
        return i10 == 5 || i10 == 10 || i10 == 12 || i10 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0024, code lost:
    
        if (r14.K.contains(java.lang.Long.valueOf(r16.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.o5 o5Var) {
        l();
        if (o5Var != null) {
            int i10 = 10;
            int i11 = this.W;
            if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = o5Var.getDocumentId();
            TLRPC.Document document = o5Var.document;
            int i12 = this.V;
            if (document == null) {
                document = org.telegram.ui.Components.f5.e(i12, o5Var.documentId);
            }
            if (!(view instanceof s21)) {
                p(view, Long.valueOf(o5Var.documentId), document, null, null);
                return;
            }
            final s21 s21Var = (s21) view;
            if (s21Var.w == null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                org.telegram.messenger.ui.b0(i12).C1(tL_emojiStatus);
            }
            if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                p(view, Long.valueOf(o5Var.documentId), document, s21Var.w, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(s21Var.w)) {
                p(view, Long.valueOf(o5Var.documentId), document2, s21Var.w, null);
                return;
            }
            final m90 m90Var = new m90(this, view, o5Var, document2, s21Var, 20);
            if (this.v1 != null || this.o1 == null) {
                m90Var.run();
                return;
            }
            s21Var.b = true;
            final Rect rect = new Rect();
            d21 d21Var = this.a0;
            int left = d21Var.getLeft();
            g21 g21Var = this.h0;
            rect.set(s21Var.getLeft() + g21Var.getLeft() + left, s21Var.getTop() + g21Var.getTop() + d21Var.getTop(), s21Var.getRight() + g21Var.getLeft() + d21Var.getLeft(), s21Var.getBottom() + g21Var.getTop() + d21Var.getTop());
            Drawable drawable = s21Var.E;
            final org.telegram.ui.Components.f5 m10 = drawable instanceof org.telegram.ui.Components.f5 ? org.telegram.ui.Components.f5.m(i12, ((org.telegram.ui.Components.f5) drawable).h(), null, 7) : null;
            this.s1 = s21Var;
            Rect rect2 = new Rect();
            this.t1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.m11
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.d5 d5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float x10 = org.telegram.ui.Cells.f1.x(floatValue, floatValue, floatValue, 1.0f);
                    i31 i31Var = i31.this;
                    i31Var.m1 = x10;
                    i31Var.r1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    org.telegram.messenger.i0.X1(rect, i31Var.p1, floatValue, i31Var.t1);
                    float scaleX = s21Var.getScaleX() * Math.max(1.0f, i31Var.u1.getInterpolation(w7.u.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    i31Var.t1.set((int) org.telegram.messenger.z20.v(i31Var.t1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.z20.v(i31Var.t1.height(), 2.0f, scaleX, i31Var.t1.centerY()), (int) a1.g.c(i31Var.t1.width(), 2.0f, scaleX, i31Var.t1.centerX()), (int) a1.g.c(i31Var.t1.height(), 2.0f, scaleX, i31Var.t1.centerY()));
                    i31Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        m90Var.run();
                        if (m10 == null || (d5Var = i31Var.o1) == null) {
                            return;
                        }
                        d5Var.f();
                    }
                }
            });
            this.v1.addListener(new org.telegram.ui.ActionBar.g1(this, zArr, m90Var, i10));
            this.v1.setInterpolator(org.telegram.ui.Components.gr.h);
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
        int i10 = this.V;
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.A0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.x0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.C1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.B0);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.G3);
        }
        org.telegram.ui.Components.d5 d5Var = this.o1;
        if (d5Var != null) {
            d5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i10 = this.V;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.A0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.x0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.C1);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.B0);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.G3);
        }
        org.telegram.ui.Components.d5 d5Var = this.o1;
        if (d5Var != null) {
            d5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.r0.y1((getMeasuredWidth() / org.telegram.messenger.i0.L(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.Q0;
        int i12 = this.W;
        if (z10 && i12 != 3 && i12 != 4) {
            float L = org.telegram.messenger.i0.L(324.0f);
            Point point = org.telegram.messenger.i0.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(L, point.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.i0.L(330.0f), point.y * 0.75f), TLObject.FLAG_31));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.q.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(y21 y21Var) {
        Integer num = this.Z1;
        if (num != null) {
        }
        this.U1 = y21Var;
        boolean z10 = this.Q0;
        int i10 = 0;
        g21 g21Var = this.h0;
        if (!z10) {
            h();
            while (i10 < g21Var.getChildCount()) {
                View childAt = g21Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i10++;
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
        int i11 = this.W;
        if (i11 == 3 || i11 == 4 || i11 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V1 = ofFloat;
        ofFloat.addUpdateListener(new j11(this, i10));
        this.V1.addListener(new ns0(this, 8));
        k11 k11Var = new k11(this, i10);
        sg.e0.f = true;
        sg.e0.e = true;
        sg.e0.g = false;
        if (sg.e0.d) {
            sg.e0.d = false;
        }
        sg.e0.c = k11Var;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 512);
        this.X1.d();
        this.V1.setDuration(800L);
        g21Var.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.e0.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        org.telegram.ui.Components.bn bnVar = this.n0;
        if (bnVar != null) {
            bnVar.setLayerType(2, null);
        }
        View view = this.m0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.d0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.P = z10;
    }

    public void setBackgroundDelegate(j21 j21Var) {
        this.U = j21Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.a0.setClipToOutline(z10);
        kg.f0 f0Var = this.b0;
        if (z10) {
            f0Var.setVisibility(0);
        } else {
            f0Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                return;
            }
            org.telegram.messenger.i0.d0(this.h0, new ag.z0(20));
            for (int i10 = 0; i10 < this.d0.b.getChildCount(); i10++) {
                View childAt = this.d0.b.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.d0.b.invalidate();
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.O0 = true;
        this.P0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.R = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.N = drawable;
        s21 s21Var = this.O;
        if (s21Var != null) {
            s21Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.h1 = z10;
    }

    public void setOnLongPressedListener(g31 g31Var) {
        this.H = g31Var;
    }

    public void setRecentReactions(List<sg.o0> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Z1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        g21 g21Var = this.h0;
        if (g21Var != null) {
            for (int i10 = 0; i10 < g21Var.getChildCount(); i10++) {
                if (g21Var.getChildAt(i10) instanceof s21) {
                    s21 s21Var = (s21) g21Var.getChildAt(i10);
                    org.telegram.ui.Components.o5 o5Var = s21Var.e;
                    if (o5Var != null) {
                        s21Var.d(hashSet.contains(Long.valueOf(o5Var.getDocumentId())), true);
                    } else {
                        s21Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            g21Var.invalidate();
        }
    }

    public void setSelectedReaction(sg.o0 o0Var) {
        this.J.clear();
        this.J.add(o0Var);
        g21 g21Var = this.h0;
        if (g21Var != null) {
            for (int i10 = 0; i10 < g21Var.getChildCount(); i10++) {
                if (g21Var.getChildAt(i10) instanceof s21) {
                    s21 s21Var = (s21) g21Var.getChildAt(i10);
                    s21Var.d(this.J.contains(s21Var.y), true);
                }
            }
            g21Var.invalidate();
        }
        v11 v11Var = this.i0;
        if (v11Var != null) {
            for (int i11 = 0; i11 < v11Var.getChildCount(); i11++) {
                if (v11Var.getChildAt(i11) instanceof s21) {
                    s21 s21Var2 = (s21) v11Var.getChildAt(i11);
                    s21Var2.d(this.J.contains(s21Var2.y), true);
                }
            }
            v11Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<sg.o0> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((sg.o0) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((sg.o0) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        try {
            if (this.l1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, this.Z0)) != this.f1) {
                this.f1 = w02;
                this.M.setColor(i0.b.o(w02, 30));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f1, PorterDuff.Mode.SRC_IN);
                this.k1 = porterDuffColorFilter;
                org.telegram.ui.Components.f5 f5Var = this.W0;
                if (f5Var != null) {
                    f5Var.setColorFilter(porterDuffColorFilter);
                }
                g21 g21Var = this.h0;
                if (g21Var != null) {
                    g21Var.invalidate();
                }
                v11 v11Var = this.i0;
                if (v11Var != null) {
                    v11Var.invalidate();
                }
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        k11 k11Var = this.J1;
        if (k11Var != null) {
            org.telegram.messenger.i0.r(k11Var);
            this.J1 = null;
        }
        ig.k0 k0Var = this.K1;
        if (k0Var != null) {
            org.telegram.messenger.i0.r(k0Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        t21 t21Var = this.q0;
        a21 a21Var = this.f0;
        if (isEmpty) {
            this.y1 = false;
            this.z1 = false;
            z(false, z10);
            if (a21Var != null) {
                a21Var.d(true);
                a21.a(a21Var, false);
            }
            t21Var.E(true);
            this.A1 = null;
        } else {
            boolean z12 = this.y1;
            boolean z13 = !z12;
            this.y1 = true;
            this.z1 = false;
            if (a21Var != null) {
                a21Var.f.b(2);
            }
            if (!z12) {
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
                t21Var.E(false);
            } else if (!str.equals(this.A1)) {
                k11 k11Var2 = new k11(this, 1);
                this.J1 = k11Var2;
                org.telegram.messenger.i0.h3(k11Var2, 120L);
            }
            this.A1 = str;
            String[] G0 = org.telegram.messenger.i0.G0();
            if (!Arrays.equals(G0, b2)) {
                org.telegram.messenger.ui.b0(this.V).M(G0, false);
            }
            b2 = G0;
            ig.k0 k0Var2 = new ig.k0(this, str, z10, z13, G0, 4);
            this.K1 = k0Var2;
            org.telegram.messenger.i0.h3(k0Var2, z11 ? 425L : 0L);
            if (a21Var != null) {
                a21Var.f.b(2);
                a21.a(a21Var, z10);
            }
        }
        C();
    }

    public final void w(float f7) {
        ValueAnimator valueAnimator = this.i1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t0.getAlpha(), f7 * 0.25f);
        this.i1 = ofFloat;
        ofFloat.addUpdateListener(new j11(this, 2));
        this.i1.setDuration(200L);
        this.i1.setInterpolator(org.telegram.ui.Components.gr.f);
        this.i1.start();
    }

    public final void x(Long l4, boolean z10) {
        boolean z11;
        HashSet hashSet = this.K;
        if (hashSet.contains(l4)) {
            hashSet.remove(l4);
            z11 = false;
        } else {
            hashSet.add(l4);
            z11 = true;
        }
        g21 g21Var = this.h0;
        if (g21Var != null) {
            for (int i10 = 0; i10 < g21Var.getChildCount(); i10++) {
                if (g21Var.getChildAt(i10) instanceof s21) {
                    s21 s21Var = (s21) g21Var.getChildAt(i10);
                    org.telegram.ui.Components.o5 o5Var = s21Var.e;
                    if (o5Var == null || o5Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = s21Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            s21Var.e(z11, z10);
                        }
                    } else {
                        s21Var.e(z11, z10);
                    }
                }
            }
            g21Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.d5 d5Var, View view) {
        Integer num;
        this.n1 = (d5Var == null || (num = d5Var.F) == null) ? 0 : num.intValue();
        this.o1 = d5Var;
        this.q1 = view;
        if (this.I && d5Var != null) {
            d5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        g21 g21Var = this.h0;
        int i10 = 0;
        g21Var.setVisibility(0);
        v11 v11Var = this.i0;
        v11Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new n11(this, z10, i10));
        this.F1.addListener(new c21(this, z10, i10));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.F1.start();
        org.telegram.messenger.z20.m(((View) g21Var.getParent()).animate().translationY((this.G1 && z11) ? -org.telegram.messenger.i0.L(36.0f) : 0.0f).setUpdateListener(new j11(this, 1)), org.telegram.ui.Components.gr.f, 160L);
        if (this.G1 && z11) {
            v11Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        } else {
            v11Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        }
        h();
    }

    public i31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        this(k2Var, context, z10, num, i10, z11, p6Var, i11, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(org.telegram.ui.ActionBar.k2 k2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12) {
        super(context);
        int i13;
        int i14;
        float f7;
        v11 v11Var;
        boolean z12;
        Integer num2;
        boolean z13;
        Integer num3;
        boolean z14;
        float f10;
        int i15 = i10;
        int i16 = i12;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = org.telegram.messenger.d20.s0;
        this.c0 = new org.telegram.ui.Components.mv[2];
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
        this.S1 = new k11(this, 3);
        this.T1 = new k11(this, 4);
        this.X1 = new e2.f(null);
        this.Y1 = new Paint();
        this.Z0 = p6Var;
        this.W = i15;
        this.N0 = z10;
        this.c1 = k2Var;
        SharedPreferences d12 = org.telegram.messenger.vp.d1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = d12.getInt(sb2.toString(), 0) < 3;
        this.f1 = i16;
        this.l1 = i16 == org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.v6, p6Var);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
        paint2.setColor(i0.b.o(i16, 30));
        this.k1 = new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(w7.u.b(num.intValue(), org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.i0.L(170.0f);
        setFocusableInTouchMode(true);
        int i17 = 6;
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 7) {
            this.d1 = i11;
            setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            setOnTouchListener(new d0(this, i17));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.G8, p6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, w7.b6.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.i0.p) + (z15 ? -12 : 4), n() ? 0 : this.d1, 0.0f, n() ? this.d1 : 0));
        }
        kg.f0 f0Var = new kg.f0(this, context, p6Var, 14);
        this.b0 = f0Var;
        boolean z16 = i15 == 3 || i15 == 4;
        Integer num4 = valueOf;
        d21 d21Var = new d21(this, context, z16, z16, p6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
        this.a0 = d21Var;
        if (!z16) {
            d21Var.setOutlineProvider(new e21(this, num5));
            d21Var.setClipToOutline(true);
            if (z16) {
                d21Var.setElevation(2.0f);
            }
        }
        if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10 || i15 == 2 || i15 == 5 || i15 == 15) {
            d21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        }
        d21Var.addView(f0Var, w7.b6.c(-1.0f, -1));
        addView(d21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 2 || i15 == 7) ? this.d1 + 6 : 0.0f, 0.0f, n() ? this.d1 + 6 : 0.0f));
        int i18 = 20;
        if (num5 != null) {
            org.telegram.ui.Components.bn bnVar = new org.telegram.ui.Components.bn(context, i18);
            this.n0 = bnVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.G8, p6Var2, PorterDuff.Mode.MULTIPLY);
            bnVar.setBackground(drawable);
            i14 = 3;
            int i19 = (n() ? 80 : 48) | 3;
            float intValue = (num5.intValue() / org.telegram.messenger.i0.p) + (z15 ? -25 : 10);
            float f11 = n() ? 0.0f : this.d1 + 5;
            if (n()) {
                i13 = 14;
                f10 = this.d1 + 14;
            } else {
                i13 = 14;
                f10 = 0.0f;
            }
            addView(bnVar, w7.b6.d(17, 9.0f, i19, intValue, f11, 0.0f, f10));
        } else {
            i13 = 14;
            i14 = 3;
        }
        boolean z17 = (k2Var == null || i15 == i14 || i15 == 6 || i15 == 5 || i15 == 7 || i15 == 4 || i15 == 9 || i15 == 10 || !z11) ? false : true;
        int i20 = 0;
        while (true) {
            if (i20 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i15 != 4) {
                num2 = num6;
                z13 = true;
            } else {
                num2 = num6;
                z13 = false;
            }
            if (i15 == 0 || i15 == 12 || i15 == 9 || i15 == 10) {
                num3 = num2;
                z14 = true;
            } else {
                num3 = num2;
                z14 = false;
            }
            Integer num7 = num3;
            int i21 = i20;
            org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
            int i22 = i15;
            f21 f21Var = new f21(this, context, p6Var3, z13, z14, i22, z17 ? new t11(0, this, k2Var) : null, i16, i10);
            org.telegram.ui.Components.iv ivVar = f21Var.D;
            if (ivVar != null) {
                ivVar.setOnLongClickListener(new s(this, 7));
            }
            f21Var.U = false;
            if (i22 == 4) {
                f21Var.setAnimatedEmojiCacheType(13);
            } else {
                f21Var.setAnimatedEmojiCacheType((i22 == 0 || i22 == 12 || i22 == 2) ? 6 : 5);
            }
            f21Var.O = num7 == null;
            f21Var.setPaddingLeft(i22 == 6 ? 10.0f : 5.0f);
            if (i22 != 14 && i22 != 8 && i22 != 13) {
                this.a0.addView(f21Var, w7.b6.c(36.0f, -1));
            }
            this.c0[i21] = f21Var;
            i15 = i22;
            i13 = 14;
            i16 = i12;
            p6Var2 = p6Var3;
            i20 = i21 + 1;
            num5 = num7;
        }
        Integer num8 = num5;
        int i23 = i13;
        org.telegram.ui.ActionBar.p6 p6Var4 = p6Var2;
        int i24 = i15;
        int i25 = 8;
        org.telegram.ui.Components.mv[] mvVarArr = this.c0;
        this.d0 = mvVarArr[0];
        mvVarArr[1].setVisibility(8);
        b21 b21Var = new b21(context, num8, 1);
        this.e0 = b21Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, b21Var, p6Var4);
        if (i24 == i23 || i24 == 8 || i24 == 13) {
            f7 = 1.0f;
        } else {
            f7 = 1.0f;
            this.a0.addView(b21Var, w7.b6.d(-1, 1.0f / org.telegram.messenger.i0.p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.i0.Y3(b21Var, true, f7, true, false);
        g21 g21Var = new g21(this, context, i24);
        this.h0 = g21Var;
        h21 h21Var = new h21();
        this.e1 = h21Var;
        float f12 = f7;
        h21Var.c = 220L;
        h21Var.e = 260L;
        h21Var.f = 160L;
        h21Var.g = 160L;
        h21Var.m = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        h21Var.i = grVar;
        h21Var.C = false;
        g21Var.setItemAnimator(h21Var);
        g21Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        i21 i21Var = new i21(this);
        this.p0 = i21Var;
        g21Var.setAdapter(i21Var);
        w11 w11Var = new w11(this, 1);
        this.r0 = w11Var;
        g21Var.setLayoutManager(w11Var);
        w11Var.O = new u11(this, 0);
        dg0 dg0Var = new dg0(context, i25);
        this.g0 = dg0Var;
        fg.i iVar = new fg.i(this, context);
        this.k0 = iVar;
        iVar.addView(g21Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        dg0Var.addView(iVar, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        v11 v11Var2 = new v11(this, context);
        this.i0 = v11Var2;
        if (v11Var2.getItemAnimator() != null) {
            v11Var = v11Var2;
            v11Var2.getItemAnimator().n(180L);
            v11Var.getItemAnimator().i = grVar;
        } else {
            v11Var = v11Var2;
        }
        TextView textView = new TextView(context);
        if (i24 == 4) {
            textView.setText(org.telegram.messenger.cd.L0(2131748229, null));
        } else if (i24 == 0 || i24 == 13 || i24 == 12 || i24 == 11 || i24 == 9 || i24 == 10) {
            textView.setText(org.telegram.messenger.cd.L0(2131748230, null));
        } else if (i24 == 1 || i24 == 2) {
            textView.setText(org.telegram.messenger.cd.L0(2131748190, null));
        } else if (i24 == i23) {
            textView.setText(org.telegram.messenger.cd.L0(2131748231, null));
        } else {
            textView.setText(org.telegram.messenger.cd.L0(2131748220, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Af, p6Var4);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.l0 = g9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.j0 = frameLayout;
        frameLayout.addView(g9Var, w7.b6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        dg0Var.addView(frameLayout, w7.b6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.tk0 tk0Var = v11Var;
        tk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(54.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(38.0f));
        t21 t21Var = new t21(this);
        this.q0 = t21Var;
        tk0Var.setAdapter(t21Var);
        w11 w11Var2 = new w11(this, 0);
        tk0Var.setLayoutManager(w11Var2);
        w11Var2.O = new u11(this, 1);
        tk0Var.setVisibility(8);
        dg0Var.addView(tk0Var, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.addView(dg0Var, w7.b6.d(-1, -1.0f, 48, 0.0f, (i24 == 8 || i24 == 13 || i24 == 14) ? 0.0f : (f12 / org.telegram.messenger.i0.p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(g21Var, w11Var);
        this.s0 = vj0Var;
        vj0Var.i = new x11(this, 0);
        vj0Var.h = new l11(this);
        z11 z11Var = new z11(this, i24, context, p6Var4, num);
        g21Var.p1(z11Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        tk0Var.p1(z11Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.bm0 bm0Var = new org.telegram.ui.Components.bm0(this, i24, 2);
        g21Var.setOnItemClickListener(bm0Var);
        tk0Var.setOnItemClickListener(bm0Var);
        a21 a21Var = new a21(this, context, z11);
        this.f0 = a21Var;
        a21Var.setTranslationY(-org.telegram.messenger.i0.L(52.0f));
        a21Var.setVisibility(4);
        dg0Var.addView(a21Var, w7.b6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        b21 b21Var2 = new b21(context, num8, 0);
        Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
        int i26 = org.telegram.ui.ActionBar.t6.G8;
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.8f, i26);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.l(b21Var2, drawable2, L.a, -1, 2, L.d, p6Var, mode);
        b21Var2.setBackground(drawable2);
        b21Var2.setAlpha(0.0f);
        this.a0.addView(b21Var2, w7.b6.d(-1, 20.0f, 55, 0.0f, (f12 / org.telegram.messenger.i0.p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.o0 = view2;
        Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
        org.telegram.ui.ActionBar.a7.y(this, drawable3, i26, p6Var, mode);
        if (i24 == 14) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.a0.addView(view2, w7.b6.e(-1, 20, 87));
        View view3 = new View(context);
        this.t0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.a0.addView(view3, w7.b6.c(-1.0f, -1));
        int i27 = this.V;
        org.telegram.messenger.ui.b0(i27);
        org.telegram.messenger.ui.b0(i27).B(5);
        if (i24 == 14) {
            org.telegram.messenger.vp.r1(this.V).E0();
        } else if (i24 == 1 || i24 == 11 || i24 == 2 || i24 == 6 || i24 == 13) {
            org.telegram.messenger.ui.b0(i27).A();
        } else if (i24 == 9 || i24 == 10) {
            if (org.telegram.messenger.vp.r1(i27).f7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.ui.b0(i27).a1(5, false, false);
                org.telegram.messenger.vp.r1(i27).f7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.ui.b0(i27).L(2, false);
            org.telegram.messenger.ui.b0(i27).Y0();
            org.telegram.messenger.ui.b0(i27).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i24 == 0 || i24 == 12) {
            org.telegram.messenger.ui.b0(i27).L(0, true);
            org.telegram.messenger.ui.b0(i27).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i24 == 3) {
            org.telegram.messenger.ui.b0(i27).v();
        } else if (i24 == 4) {
            org.telegram.messenger.ui.b0(i27).V0(0, false, true, false);
            org.telegram.messenger.ui.b0(i27).B(0);
        }
        this.V0.E0(7);
        int i28 = this.W;
        if (i28 == 3 || i28 == 4 || i28 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.c0 c0Var = org.telegram.messenger.hc.D().p;
            if (((CountDownLatch) c0Var.c) == null) {
                z12 = true;
                c0Var.c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            sg.e0.g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(sg.o0.b(str));
        }
        g21 g21Var = this.h0;
        if (g21Var != null) {
            for (int i11 = 0; i11 < g21Var.getChildCount(); i11++) {
                if (g21Var.getChildAt(i11) instanceof s21) {
                    s21 s21Var = (s21) g21Var.getChildAt(i11);
                    s21Var.d(this.J.contains(s21Var.y), true);
                }
            }
            g21Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(h31 h31Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(s21 s21Var, sg.o0 o0Var) {
    }
}
