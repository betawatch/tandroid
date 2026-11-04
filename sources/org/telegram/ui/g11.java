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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class g11 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static String[] c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public l01 H;
    public final ArrayList H0;
    public boolean H1;
    public e11 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public kz0 K1;
    public final HashSet L;
    public final ArrayList L0;
    public ei.a6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public q01 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public ci.lc S1;
    public final ArrayList T;
    public q01 T0;
    public final kz0 T1;
    public boolean U;
    public boolean U0;
    public final kz0 U1;
    public h01 V;
    public float V0;
    public Runnable V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public org.telegram.ui.Components.g5 X0;
    public ValueAnimator X1;
    public wz0 Y0;
    public final g2.g Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final org.telegram.ui.ActionBar.e6 a1;
    public Integer a2;
    public int b;
    public final b01 b0;
    public float b1;
    public int c;
    public final gi.n5 c0;
    public float c1;
    public int d;
    public final org.telegram.ui.Components.zu[] d0;
    public final org.telegram.ui.ActionBar.d2 d1;
    public int e;
    public org.telegram.ui.Components.zu e0;
    public final int e1;
    public int f;
    public final zz0 f0;
    public final f01 f1;
    public final yz0 g0;
    public int g1;
    public int h;
    public final yg0 h0;
    public boolean h1;
    public final e01 i0;
    public boolean i1;
    public final uz0 j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final ai.c0 l0;
    public PorterDuffColorFilter l1;
    public final org.telegram.ui.Components.k9 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final org.telegram.ui.Components.sm o0;
    public int o1;
    public final View p0;
    public org.telegram.ui.Components.e5 p1;
    public final g01 q0;
    public Rect q1;
    public int r;
    public final r01 r0;
    public View r1;
    public int s;
    public final vz0 s0;
    public float s1;
    public final org.telegram.ui.Components.vi0 t0;
    public q01 t1;
    public final View u0;
    public Rect u1;
    public int v0;
    public final OvershootInterpolator v1;
    public int w;
    public final ArrayList w0;
    public ValueAnimator w1;
    public int x;
    public final SparseIntArray x0;
    public boolean x1;
    public int y;
    public final SparseIntArray y0;
    public boolean y1;
    public final SparseIntArray z0;
    public boolean z1;
    public static final List b2 = Arrays.asList("😖", "😫", "\u1fae0", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap e2 = new HashMap();

    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this(d2Var, context, z10, num, i3, true, e6Var, 16);
    }

    public static void D(int i3, org.telegram.ui.Components.k9 k9Var) {
        List list;
        org.telegram.messenger.ac b10;
        String str;
        if (k9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(i3).t0[1]);
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            list = b2;
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
                    if (document2 != null && list.contains(org.telegram.messenger.zi.V(document2, null, null))) {
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
            ArrayList arrayList3 = new ArrayList(org.telegram.messenger.li.b0(i3).s0(5));
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
                        if (document3 != null && list.contains(org.telegram.messenger.zi.V(document3, null, null))) {
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
            org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.ac.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "36_36_g";
            } else {
                if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b10 = org.telegram.messenger.ac.b(document);
                str = "36_36";
            }
            k9Var.setLayerNum(7);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            k9Var.m(b10, str, org.telegram.messenger.ac.c(w10, document), "36_36", d, document);
        }
    }

    public static void a(g11 g11Var, int i3, int i10) {
        org.telegram.ui.Components.vi0 vi0Var = g11Var.t0;
        vz0 vz0Var = g11Var.s0;
        View m10 = vz0Var.m(i3);
        int L0 = vz0Var.L0();
        if ((m10 == null && Math.abs(i3 - L0) > 72.0f) || !org.telegram.messenger.az.c()) {
            vi0Var.b = vz0Var.L0() < i3 ? 0 : 1;
            vi0Var.d(i3, i10, false, false);
        } else {
            gi.j1 j1Var = new gi.j1(4, g11Var.i0.getContext(), g11Var);
            j1Var.a = i3;
            j1Var.p = i10;
            vz0Var.w0(j1Var);
        }
    }

    public static boolean c(g11 g11Var) {
        if (g11Var.U) {
            return true;
        }
        ValueAnimator valueAnimator = g11Var.W1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i3 = 13;
        int i10 = this.a0;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.g5.f();
            }
            if (i10 != 3 && i10 != 4) {
                i3 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        if (this.k1 == null) {
            int i3 = this.a0;
            if (i3 == 5 || i3 == 9 || i3 == 10 || i3 == 7) {
                this.k1 = k2.p1.g(org.telegram.messenger.t0.b, R.drawable.msg_filled_blocked);
            } else {
                this.k1 = k2.p1.g(org.telegram.messenger.t0.b, R.drawable.msg_settings_premium);
            }
            this.k1.setColorFilter(this.l1);
        }
        return this.k1;
    }

    public static ArrayList j(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i3);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c10 = org.telegram.messenger.i6.c(str);
        int i3 = 0;
        while (true) {
            if (i3 >= tL_messages_stickerSet.packs.size()) {
                j10 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i3).documents.isEmpty() && TextUtils.equals(org.telegram.messenger.i6.c(tL_messages_stickerSet.packs.get(i3).emoticon), c10)) {
                j10 = tL_messages_stickerSet.packs.get(i3).documents.get(0).longValue();
                break;
            }
            i3++;
        }
        if (j10 == 0) {
            return null;
        }
        for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
            if (document.id == j10) {
                return document;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.g5 g5Var) {
        org.telegram.ui.Components.g5 g5Var2;
        if (this.J && (g5Var2 = this.X0) != g5Var) {
            if (g5Var2 != null) {
                g5Var2.n(this);
            }
            this.X0 = g5Var;
            if (g5Var != null) {
                g5Var.setColorFilter(this.l1);
                this.X0.a(this);
            }
        }
    }

    public static void t(int i3) {
        boolean[] zArr = d2;
        if (zArr[i3]) {
            return;
        }
        org.telegram.messenger.li.b0(i3);
        zArr[i3] = true;
        org.telegram.messenger.li.b0(i3).B(5);
        org.telegram.messenger.li.b0(i3).L(0, true);
        org.telegram.messenger.li.b0(i3).A();
        org.telegram.messenger.li.b0(i3).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        org.telegram.messenger.li.b0(i3).P();
        org.telegram.messenger.li.b0(i3).v();
        org.telegram.ui.Components.xu0.F3.c(i3, 1, new ei.g(i3, 1));
    }

    public final void A(Long l10) {
        this.L.remove(l10);
        e01 e01Var = this.i0;
        if (e01Var != null) {
            int i3 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i10);
                    org.telegram.ui.Components.p5 p5Var = q01Var.e;
                    if (p5Var == null || p5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = q01Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            q01Var.f();
                        }
                    } else {
                        q01Var.f();
                    }
                    z10 = true;
                }
            }
            e01Var.invalidate();
            if (z10) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.w0;
                if (i3 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i3)).longValue();
                if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                    break;
                } else {
                    i3++;
                }
            }
            g01 g01Var = this.q0;
            if (g01Var != null) {
                g01Var.g(i3);
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
        int i3;
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
        e01 e01Var;
        int i17;
        SparseIntArray sparseIntArray3;
        HashSet hashSet2;
        org.telegram.messenger.li liVar;
        int i18;
        ArrayList arrayList6;
        TLRPC.StickerSet stickerSet;
        int i19;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList7;
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID;
        org.telegram.ui.Components.sw swVar;
        int i20;
        SparseIntArray sparseIntArray4;
        ArrayList arrayList8;
        int i21;
        SparseIntArray sparseIntArray5;
        SparseIntArray sparseIntArray6;
        TLRPC.StickerSet stickerSet2;
        boolean z15;
        ArrayList arrayList9;
        int i22;
        int i23;
        int i24;
        boolean z16;
        int i25;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList10;
        boolean z17 = !this.Q ? false : z11;
        int i26 = this.W;
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i26);
        if (z10 || this.M0 == null) {
            this.M0 = new ArrayList(b02.s0(this.R ? 0 : 5));
        }
        ArrayList arrayList11 = this.M0;
        ArrayList arrayList12 = new ArrayList(b02.t0[1]);
        ArrayList arrayList13 = this.w0;
        ArrayList arrayList14 = new ArrayList(arrayList13);
        this.v0 = 0;
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
        this.E = -1;
        this.F = -1;
        this.G = -1;
        ArrayList arrayList15 = this.E0;
        arrayList15.clear();
        this.L0.clear();
        ArrayList arrayList16 = this.I0;
        arrayList16.clear();
        ArrayList arrayList17 = this.J0;
        arrayList17.clear();
        ArrayList arrayList18 = this.N0;
        arrayList18.clear();
        SparseIntArray sparseIntArray7 = this.x0;
        sparseIntArray7.clear();
        SparseIntArray sparseIntArray8 = this.y0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.z0;
        sparseIntArray9.clear();
        arrayList13.clear();
        boolean z18 = z17;
        SparseIntArray sparseIntArray10 = this.A0;
        sparseIntArray10.clear();
        org.telegram.messenger.li liVar2 = b02;
        this.T.clear();
        ArrayList arrayList19 = this.G0;
        arrayList19.clear();
        ArrayList arrayList20 = this.H0;
        arrayList20.clear();
        SparseIntArray sparseIntArray11 = sparseIntArray10;
        ArrayList arrayList21 = this.F0;
        arrayList21.clear();
        boolean isEmpty = arrayList11.isEmpty();
        ArrayList arrayList22 = arrayList12;
        int i27 = this.a0;
        if (isEmpty) {
            sparseIntArray = sparseIntArray8;
        } else {
            sparseIntArray = sparseIntArray8;
        }
        if (i27 != 5 && i27 != 7 && i27 != 8) {
            int i28 = this.v0;
            sparseIntArray2 = sparseIntArray7;
            this.v0 = i28 + 1;
            this.a = i28;
            arrayList13.add(9L);
            z13 = this.O0;
            if (i27 != 5 || i27 == 7) {
                arrayList = arrayList11;
                i3 = z13 ? 1 : 0;
                if (i3 != 0) {
                    this.v0++;
                    arrayList13.add(2L);
                }
                tL_emojiList = org.telegram.messenger.li.b0(i26).M1;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i10 = 0;
                    while (i10 < tL_emojiList.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.p5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                        i10++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i11 = 0; i11 < arrayList15.size(); i11++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.p5) arrayList15.get(i11)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            } else if (i27 != 4) {
                arrayList = arrayList11;
                i3 = z13 ? 1 : 0;
                if (i27 == 6) {
                    if (i3 != 0) {
                        this.v0++;
                        arrayList13.add(2L);
                    }
                    ArrayList arrayList23 = org.telegram.messenger.li.b0(i26).n;
                    for (int i29 = 0; i29 < arrayList23.size(); i29++) {
                        arrayList19.add(((TLRPC.TL_availableReaction) arrayList23.get(i29)).activate_animation);
                    }
                    int i30 = 0;
                    while (i30 < arrayList19.size()) {
                        arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i30)).id * 13) + 62425));
                        this.v0++;
                        i30++;
                        arrayList19 = arrayList19;
                    }
                } else if (i27 == 3) {
                    int i31 = this.v0;
                    this.v0 = i31 + 1;
                    this.y = i31;
                    arrayList13.add(12L);
                    int i32 = this.v0;
                    this.v0 = i32 + 1;
                    this.x = i32;
                    arrayList13.add(7L);
                    String str = org.telegram.messenger.h10.i(i26).f0;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i26).p0(str);
                        tL_messages_stickerSet = p02 == null ? org.telegram.messenger.li.b0(i26).n0(str) : p02;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i3 != 0) {
                            this.v0++;
                            arrayList13.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList24 = tL_messages_stickerSet.documents;
                        if (arrayList24 != null && !arrayList24.isEmpty()) {
                            int i33 = 0;
                            while (i33 < tL_messages_stickerSet.documents.size()) {
                                arrayList15.add(new org.telegram.ui.Components.p5(tL_messages_stickerSet.documents.get(i33), (Paint.FontMetricsInt) null));
                                i33++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i34 = 0; i34 < arrayList15.size(); i34++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.p5) arrayList15.get(i34)).getDocumentId() * 13) + 43223));
                            this.v0++;
                        }
                    }
                }
            } else if (this.R) {
                arrayList19.addAll(org.telegram.messenger.li.b0(i26).g0[0]);
                i3 = z13 ? 1 : 0;
                int i35 = 0;
                while (i35 < arrayList19.size()) {
                    arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i35)).id * 13) + 62425));
                    this.v0++;
                    i35++;
                    arrayList11 = arrayList11;
                }
                arrayList = arrayList11;
            } else {
                arrayList = arrayList11;
                i3 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.S ? org.telegram.messenger.li.b0(i26).K1 : org.telegram.messenger.li.b0(i26).L1;
                if (tL_emojiList3 != null && (arrayList10 = tL_emojiList3.document_id) != null && !arrayList10.isEmpty()) {
                    org.telegram.ui.Components.sw swVar2 = new org.telegram.ui.Components.sw();
                    swVar2.f = true;
                    swVar2.g = false;
                    swVar2.h = true;
                    swVar2.e = true;
                    swVar2.b = new TLRPC.TL_stickerSet();
                    swVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList18.size();
                    arrayList18.add(swVar2);
                    int i36 = 0;
                    while (i36 < tL_emojiList3.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.p5(tL_emojiList3.document_id.get(i36).longValue(), (Paint.FontMetricsInt) null));
                        i36++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i37 = 0; i37 < arrayList15.size(); i37++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.p5) arrayList15.get(i37)).getDocumentId() * 13) + 43223));
                        this.v0++;
                    }
                }
            }
            if (this.P0 || i27 == 13 || i27 == 2 || i27 == 11 || i27 == 3 || i27 == 6 || i27 == 8 || i27 == 4 || i27 == 5 || i27 == 7) {
                i12 = 2;
            } else {
                int i38 = this.v0;
                i12 = 2;
                this.v0 = i38 + 1;
                this.w = i38;
                arrayList13.add(6L);
            }
            if ((i27 != 9 || i27 == 10) && (tL_emojiList2 = org.telegram.messenger.li.b0(i26).N1) != null) {
                HashSet hashSet3 = new HashSet();
                hashSet3.addAll(tL_emojiList2.document_id);
                hashSet = hashSet3;
            } else {
                hashSet = null;
            }
            if (this.S0 == null) {
                this.d = this.v0;
                ArrayList arrayList25 = new ArrayList(this.S0);
                if (i27 == 13 && arrayList25.size() > 8) {
                    arrayList25.subList(8, arrayList25.size()).clear();
                } else if (i27 == 14) {
                    arrayList9 = new ArrayList();
                    int i39 = 0;
                    while (i39 < arrayList25.size()) {
                        if (((dh.n0) arrayList25.get(i39)).e) {
                            arrayList9.add((dh.n0) arrayList25.remove(i39));
                            i39--;
                        }
                        i39++;
                    }
                    if (i27 != 8 || i27 == 11 || i27 == 13) {
                        arrayList16.addAll(arrayList25);
                    } else {
                        for (int i40 = 0; i40 < 16; i40++) {
                            if (!arrayList25.isEmpty()) {
                                arrayList16.add((dh.n0) arrayList25.remove(0));
                            }
                        }
                    }
                    i22 = 0;
                    while (i22 < arrayList16.size()) {
                        arrayList13.add(Long.valueOf((((dh.n0) arrayList16.get(i22)).hashCode() * 13) - 5632));
                        i22++;
                        arrayList20 = arrayList20;
                    }
                    arrayList3 = arrayList20;
                    int size2 = arrayList16.size() + this.v0;
                    this.v0 = size2;
                    this.e = size2;
                    if (!arrayList25.isEmpty() && i27 != 8 && i27 != 11 && i27 != 13) {
                        i24 = 0;
                        while (true) {
                            if (i24 < arrayList25.size()) {
                                z16 = true;
                                break;
                            } else {
                                if (((dh.n0) arrayList25.get(i24)).g != 0) {
                                    z16 = false;
                                    break;
                                }
                                i24++;
                            }
                        }
                        if (i27 != 14) {
                            if (!z16) {
                                int i41 = this.v0;
                                this.v0 = i41 + 1;
                                this.f = i41;
                                arrayList13.add(4L);
                            } else if (org.telegram.messenger.h10.i(i26).q()) {
                                int i42 = this.v0;
                                this.v0 = i42 + 1;
                                this.h = i42;
                                arrayList13.add(5L);
                            }
                        }
                        this.b = this.v0;
                        arrayList17.addAll(arrayList25);
                        for (i25 = 0; i25 < arrayList17.size(); i25++) {
                            arrayList13.add(Long.valueOf((((dh.n0) arrayList17.get(i25)).h * 13) + (z16 ? 4235 : -3142)));
                        }
                        int size3 = arrayList17.size() + this.v0;
                        this.v0 = size3;
                        this.c = size3;
                    }
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        int i43 = this.v0;
                        this.v0 = i43 + 1;
                        this.E = i43;
                        arrayList13.add(8L);
                        this.F = this.v0;
                        this.K0 = arrayList9;
                        for (i23 = 0; i23 < arrayList9.size(); i23++) {
                            arrayList13.add(Long.valueOf(((dh.n0) arrayList9.get(i23)).c * 19));
                        }
                        int size4 = arrayList9.size() + this.v0;
                        this.v0 = size4;
                        this.G = size4;
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
                int size22 = arrayList16.size() + this.v0;
                this.v0 = size22;
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
                    this.b = this.v0;
                    arrayList17.addAll(arrayList25);
                    while (i25 < arrayList17.size()) {
                    }
                    int size32 = arrayList17.size() + this.v0;
                    this.v0 = size32;
                    this.c = size32;
                }
                if (arrayList9 != null) {
                    int i432 = this.v0;
                    this.v0 = i432 + 1;
                    this.E = i432;
                    arrayList13.add(8L);
                    this.F = this.v0;
                    this.K0 = arrayList9;
                    while (i23 < arrayList9.size()) {
                    }
                    int size42 = arrayList9.size() + this.v0;
                    this.v0 = size42;
                    this.G = size42;
                }
            } else {
                arrayList3 = arrayList20;
                if (i27 == 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                    org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(i26);
                    Long[] lArr = b03.G0;
                    ArrayList[] arrayListArr = b03.F0;
                    if (!b03.H0[0]) {
                        b03.L(0, true);
                    } else if (arrayListArr[0] == null || (lArr[0] != null && (System.currentTimeMillis() / 1000) - lArr[0].longValue() > 1800)) {
                        b03.L(0, false);
                    }
                    ArrayList arrayList26 = arrayListArr[0];
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(i26).m0((i27 == 0 || i27 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                    if (m0 != null) {
                        if (i3 != 0) {
                            this.v0++;
                            arrayList13.add(2L);
                        }
                        if (i27 == 0 || i27 == 12) {
                            P = org.telegram.messenger.li.b0(i26).P();
                        } else {
                            org.telegram.messenger.li b04 = org.telegram.messenger.li.b0(i26);
                            Long[] lArr2 = b04.G0;
                            ArrayList[] arrayListArr2 = b04.F0;
                            if (b04.H0[i12]) {
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
                                arrayList15.add(new org.telegram.ui.Components.p5(m0.documents.get(i44), (Paint.FontMetricsInt) null));
                                if (arrayList15.size() + i3 >= 104) {
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
                                Long g7 = org.telegram.messenger.l10.g((TLRPC.EmojiStatus) obj);
                                if (g7 != null) {
                                    int i46 = 0;
                                    while (true) {
                                        if (i46 >= arrayList15.size()) {
                                            ArrayList arrayList28 = arrayList26;
                                            int i47 = size5;
                                            arrayList15.add(new org.telegram.ui.Components.p5(g7.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i3 >= 104) {
                                                break;
                                            }
                                            arrayList26 = arrayList28;
                                            size5 = i47;
                                        } else if (((org.telegram.ui.Components.p5) arrayList15.get(i46)).getDocumentId() == g7.longValue()) {
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
                                Long g10 = org.telegram.messenger.l10.g((TLRPC.EmojiStatus) obj2);
                                if (g10 != null) {
                                    int i49 = 0;
                                    while (true) {
                                        if (i49 >= arrayList15.size()) {
                                            arrayList15.add(new org.telegram.ui.Components.p5(g10.longValue(), (Paint.FontMetricsInt) null));
                                            if (arrayList15.size() + i3 >= 104) {
                                                break;
                                            }
                                        } else if (((org.telegram.ui.Components.p5) arrayList15.get(i49)).getDocumentId() == g10.longValue()) {
                                            break;
                                        } else {
                                            i49++;
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList15.size() <= 40 - i3 || this.D0) {
                            for (int i50 = 0; i50 < arrayList15.size(); i50++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.p5) arrayList15.get(i50)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                        } else {
                            for (int i51 = 0; i51 < 39 - i3; i51++) {
                                arrayList13.add(Long.valueOf((((org.telegram.ui.Components.p5) arrayList15.get(i51)).getDocumentId() * 13) + 43223));
                                this.v0++;
                            }
                            arrayList13.add(Long.valueOf(((((arrayList15.size() - 40) + i3) + 1) * 13) - 5531));
                            l01 l01Var = this.H;
                            if (l01Var != null) {
                                TextView textView = l01Var.a;
                                StringBuilder sb2 = new StringBuilder("+");
                                i13 = 1;
                                sb2.append((arrayList15.size() - 40) + i3 + 1);
                                textView.setText(sb2.toString());
                            } else {
                                i13 = 1;
                            }
                            sparseIntArray9.put(this.v0, -1);
                            this.v0 += i13;
                        }
                    }
                }
            }
            arrayList21.clear();
            if (i27 != 0 || i27 == 12 || i27 == 9 || i27 == 10) {
                ci.v8 G = ci.e9.y(i26, false).G(getDialogId(), true);
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
                    int i52 = this.v0;
                    this.v0 = i52 + 1;
                    this.n = i52;
                    arrayList13.add(22L);
                    this.r = this.v0;
                    int size7 = arrayList4.size();
                    int i53 = 0;
                    while (i53 < size7) {
                        Object obj4 = arrayList4.get(i53);
                        i53++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                        arrayList13.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.v0++;
                        arrayList21.add(tL_starGiftUnique);
                    }
                    this.s = this.v0;
                    this.e0.l(true);
                } else {
                    this.e0.l(false);
                }
            }
            if (i27 == 13) {
                String[][] strArr = org.telegram.messenger.j6.f;
                for (int i54 = 0; i54 < 8; i54++) {
                    for (String str2 : strArr[i54]) {
                        arrayList3.add(str2);
                        arrayList13.add(Long.valueOf((r8.hashCode() * 322) + 13334));
                        this.v0++;
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
                                    z15 = true;
                                } else {
                                    ArrayList<TLRPC.Document> arrayList31 = tL_messages_stickerSet2.documents;
                                    if (arrayList31 != null && !arrayList31.isEmpty()) {
                                        z15 = org.telegram.messenger.zi.D4(tL_messages_stickerSet2.documents.get(0));
                                    }
                                }
                            }
                            z15 = false;
                        }
                        if ((i27 != 10 && i27 != 9) || tL_messages_stickerSet2.set.channel_emoji_status) {
                            TLRPC.StickerSet stickerSet3 = tL_messages_stickerSet2.set;
                            if (stickerSet3.emojis || this.R) {
                                if (!this.C0.contains(Long.valueOf(stickerSet3.id))) {
                                    sparseIntArray6 = sparseIntArray2;
                                    sparseIntArray6.put(this.v0, arrayList18.size());
                                    sparseIntArray5 = sparseIntArray;
                                    sparseIntArray5.put(arrayList18.size(), this.v0);
                                    this.v0++;
                                    arrayList13.add(Long.valueOf((tL_messages_stickerSet2.set.id * 13) + 9211));
                                    org.telegram.ui.Components.sw swVar3 = new org.telegram.ui.Components.sw();
                                    swVar3.f = true;
                                    swVar3.g = false;
                                    swVar3.h = true;
                                    if (i27 == 4) {
                                        swVar3.e = false;
                                    } else {
                                        swVar3.e = !org.telegram.messenger.zi.W3(tL_messages_stickerSet2);
                                    }
                                    swVar3.b = tL_messages_stickerSet2.set;
                                    swVar3.c = j(tL_messages_stickerSet2.documents, hashSet);
                                    arrayList18.size();
                                    arrayList18.add(swVar3);
                                    this.v0 = swVar3.c.size() + this.v0;
                                    for (int i55 = 0; i55 < swVar3.c.size(); i55++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) swVar3.c.get(i55)).id * 13) + 3212));
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
            if (!this.R || i27 == 8 || i27 == 13) {
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
                                    liVar = liVar2;
                                    i18 = i58;
                                    arrayList22 = arrayList32;
                                    stickerSet = stickerSet4;
                                    arrayList6 = arrayList18;
                                    i19 = 10;
                                    TLRPC.TL_messages_stickerSet l02 = liVar.l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    if (l02 != null) {
                                        ArrayList<TLRPC.Document> arrayList33 = l02.documents;
                                        boolean W3 = org.telegram.messenger.zi.W3(l02);
                                        arrayList7 = arrayList33;
                                        z14 = W3;
                                    } else {
                                        TLRPC.TL_inputStickerSetID Z = org.telegram.messenger.li.Z(stickerSetCovered.set);
                                        arrayList7 = new ArrayList<>();
                                        tL_inputStickerSetID = Z;
                                        z14 = true;
                                        if (arrayList7 != null && ((!(i27 == 5 || i27 == 7) || (!arrayList7.isEmpty() && org.telegram.messenger.zi.D4(arrayList7.get(0)))) && (!(i27 == i19 || i27 == 9) || stickerSet.channel_emoji_status))) {
                                            sparseIntArray13.put(this.v0, arrayList6.size());
                                            sparseIntArray3.put(arrayList6.size(), this.v0);
                                            this.v0++;
                                            boolean z19 = z14;
                                            arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                            swVar = new org.telegram.ui.Components.sw();
                                            swVar.d = tL_inputStickerSetID;
                                            swVar.f = this.C0.contains(Long.valueOf(stickerSet.id));
                                            swVar.g = true;
                                            if (i27 != 4) {
                                                swVar.e = false;
                                            } else {
                                                swVar.e = !z19;
                                            }
                                            swVar.b = stickerSet;
                                            swVar.c = j(arrayList7, hashSet2);
                                            arrayList6.size();
                                            swVar.h = this.B0.contains(Long.valueOf(swVar.b.id));
                                            if (swVar.c.size() > 24 || swVar.h) {
                                                this.v0 = swVar.c.size() + this.v0;
                                                for (i20 = 0; i20 < swVar.c.size(); i20++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) swVar.c.get(i20)).id * 13) + 3212));
                                                }
                                            } else {
                                                this.v0 += 24;
                                                for (int i59 = 0; i59 < 23; i59++) {
                                                    arrayList13.add(Long.valueOf((((TLRPC.Document) swVar.c.get(i59)).id * 13) + 3212));
                                                }
                                                arrayList13.add(Long.valueOf(((swVar.c.size() - 23) * 169) + ((stickerSet.id * 13) - 5531)));
                                                sparseIntArray9.put(this.v0 - 1, arrayList6.size());
                                            }
                                            if (!swVar.f) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else if (i27 == 4 || i27 == 5 || i27 == 7 || i27 == 6) {
                                                sparseIntArray4 = sparseIntArray11;
                                            } else {
                                                sparseIntArray4 = sparseIntArray11;
                                                sparseIntArray4.put(this.v0, arrayList6.size());
                                                this.v0++;
                                                arrayList13.add(Long.valueOf((stickerSet.id * 13) + 3321));
                                                arrayList8 = arrayList6;
                                                arrayList8.add(swVar);
                                            }
                                            arrayList8 = arrayList6;
                                            arrayList8.add(swVar);
                                        } else {
                                            sparseIntArray4 = sparseIntArray11;
                                            arrayList8 = arrayList6;
                                        }
                                    }
                                } else {
                                    int i60 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    liVar = liVar2;
                                    i18 = i60;
                                    arrayList22 = arrayList32;
                                    arrayList6 = arrayList18;
                                    stickerSet = stickerSet4;
                                    i19 = 10;
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                        z14 = org.telegram.messenger.zi.V3(stickerSetCovered);
                                    } else {
                                        z14 = false;
                                        arrayList7 = null;
                                    }
                                }
                                tL_inputStickerSetID = null;
                                if (arrayList7 != null) {
                                    sparseIntArray13.put(this.v0, arrayList6.size());
                                    sparseIntArray3.put(arrayList6.size(), this.v0);
                                    this.v0++;
                                    boolean z192 = z14;
                                    arrayList13.add(Long.valueOf((stickerSet.id * 13) + 9211));
                                    swVar = new org.telegram.ui.Components.sw();
                                    swVar.d = tL_inputStickerSetID;
                                    swVar.f = this.C0.contains(Long.valueOf(stickerSet.id));
                                    swVar.g = true;
                                    if (i27 != 4) {
                                    }
                                    swVar.b = stickerSet;
                                    swVar.c = j(arrayList7, hashSet2);
                                    arrayList6.size();
                                    swVar.h = this.B0.contains(Long.valueOf(swVar.b.id));
                                    if (swVar.c.size() > 24) {
                                    }
                                    this.v0 = swVar.c.size() + this.v0;
                                    while (i20 < swVar.c.size()) {
                                    }
                                    if (!swVar.f) {
                                    }
                                    arrayList8 = arrayList6;
                                    arrayList8.add(swVar);
                                }
                                sparseIntArray4 = sparseIntArray11;
                                arrayList8 = arrayList6;
                            } else {
                                if (((org.telegram.ui.Components.sw) arrayList18.get(i57)).b.id == stickerSet4.id) {
                                    int i61 = i56;
                                    sparseIntArray3 = sparseIntArray12;
                                    hashSet2 = hashSet;
                                    liVar = liVar2;
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
                        liVar2 = liVar;
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
                this.e0.p(arrayList5);
            }
            e01Var = this.i0;
            if (z18) {
                e01Var.setItemAnimator(null);
            } else {
                e01Var.setItemAnimator(this.f1);
            }
            if (z12) {
                i17 = 0;
                this.q0.f();
            } else {
                i17 = 0;
                u4.o.c(new kg.g(this, arrayList14, 5), false).c(this.q0);
            }
            if (e01Var.K1) {
                e01Var.v0(i17);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray7;
        this.a = -1;
        z13 = this.O0;
        if (i27 != 5) {
        }
        arrayList = arrayList11;
        i3 = z13 ? 1 : 0;
        if (i3 != 0) {
        }
        tL_emojiList = org.telegram.messenger.li.b0(i26).M1;
        if (tL_emojiList != null) {
            i10 = 0;
            while (i10 < tL_emojiList.document_id.size()) {
            }
            while (i11 < arrayList15.size()) {
            }
        }
        if (this.P0) {
        }
        i12 = 2;
        if (i27 != 9) {
        }
        HashSet hashSet32 = new HashSet();
        hashSet32.addAll(tL_emojiList2.document_id);
        hashSet = hashSet32;
        if (this.S0 == null) {
        }
        arrayList21.clear();
        if (i27 != 0) {
        }
        ci.v8 G2 = ci.e9.y(i26, false).G(getDialogId(), true);
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
        if (this.R) {
        }
        arrayList5 = arrayList18;
        i16 = 14;
        if (i27 != i16) {
            this.e0.p(arrayList5);
        }
        e01Var = this.i0;
        if (z18) {
        }
        if (z12) {
        }
        if (e01Var.K1) {
        }
    }

    public final void C() {
        yz0 yz0Var = this.g0;
        if (yz0Var == null) {
            return;
        }
        if (this.A1) {
            yz0Var.clearAnimation();
            yz0Var.setVisibility(0);
            yz0Var.animate().translationY(0.0f).start();
            return;
        }
        e01 e01Var = this.i0;
        if (e01Var.getChildCount() <= 0) {
            yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
            return;
        }
        View childAt = e01Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        } else {
            yz0Var.setVisibility(0);
            yz0Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.n0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(b8.be.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.sm smVar = this.o0;
        if (smVar != null) {
            float a10 = b8.be.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            smVar.setAlpha(a10);
            smVar.setScaleX(a10);
            smVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a11 = b8.be.a(f12 / 700.0f, 0.0f, 1.0f);
        float a12 = b8.be.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = b8.be.a(f12 / 750.0f, 0.0f, 1.0f);
        float a14 = b8.be.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        float interpolation2 = xqVar.getInterpolation(a11);
        float interpolation3 = xqVar.getInterpolation(a12);
        this.c0.setAlpha(a14);
        this.g0.setAlpha(a14);
        int i3 = 0;
        for (int i10 = 0; i10 < this.e0.b.getChildCount(); i10++) {
            this.e0.b.getChildAt(i10).setAlpha(a14);
        }
        if (this.p1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a14;
        b01 b01Var = this.b0;
        b01Var.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        if (smVar != null) {
            smVar.setTranslationY(org.telegram.messenger.g0.L(-5.0f) * f13);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        b01Var.invalidateOutline();
        if (smVar != null) {
            smVar.setAlpha(a14);
        }
        zz0 zz0Var = this.f0;
        zz0Var.setAlpha(a14);
        zz0Var.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = zz0Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(b01Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(b01Var.getHeight(), 2.0d) + Math.pow(b01Var.getWidth() - pivotX, 2.0d)));
        for (int i11 = 0; i11 < this.e0.b.getChildCount(); i11++) {
            View childAt = this.e0.b.getChildAt(i11);
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
            float s6 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.v(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s6)) {
                s6 = 0.0f;
            }
            childAt.setScaleX(s6);
            childAt.setScaleY(s6);
        }
        while (true) {
            e01 e01Var = this.i0;
            if (i3 >= e01Var.getChildCount()) {
                this.l0.invalidate();
                e01Var.invalidate();
                return;
            }
            View childAt2 = e01Var.getChildAt(i3);
            if (childAt2 instanceof q01) {
                q01 q01Var = (q01) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float s10 = org.telegram.messenger.g0.s(a13, (float) Math.sqrt(com.google.android.recaptcha.internal.a.v(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(s10)) {
                    s10 = 0.0f;
                }
                q01Var.setAnimatedScale(s10);
            }
            i3++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.x0;
        kz0 kz0Var = this.U1;
        if (i3 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                org.telegram.messenger.g0.r(kz0Var);
                org.telegram.messenger.g0.h3(kz0Var);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.A0) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
            return;
        }
        if (i3 == org.telegram.messenger.hs.C1) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
            return;
        }
        if (i3 == org.telegram.messenger.hs.B0) {
            org.telegram.messenger.g0.r(kz0Var);
            org.telegram.messenger.g0.h3(kz0Var);
            return;
        }
        if (i3 != org.telegram.messenger.hs.i4) {
            if (i3 == org.telegram.messenger.hs.G3 && ((Long) objArr[0]).longValue() == org.telegram.messenger.h10.i(this.W).e()) {
                org.telegram.messenger.g0.r(kz0Var);
                org.telegram.messenger.g0.h3(kz0Var);
                return;
            }
            return;
        }
        ei.e eVar = new ei.e(27);
        e01 e01Var = this.i0;
        org.telegram.messenger.g0.d0(e01Var, eVar);
        if (e01Var != null) {
            e01Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.e5 e5Var = this.p1;
        if (e5Var != null && (num = this.Z0) != null) {
            Rect bounds = e5Var.getBounds();
            View view = this.r1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.p1.getAlpha();
            View view2 = this.r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.p1.w = (int) (Math.pow(this.b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.q1 == null) {
                this.q1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f10;
            float y9 = com.google.android.recaptcha.internal.a.y(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n4 = n();
            int i3 = this.e1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + y9 + (!n4 ? org.telegram.messenger.g0.L(i3) : getMeasuredHeight() - (org.telegram.messenger.g0.L(i3) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.e5 e5Var2 = this.p1;
            Rect rect = this.q1;
            int i10 = rect.left;
            Rect rect2 = this.q1;
            e5Var2.setBounds(i10, rect.top, (int) ((rect.width() / scaleY) + i10), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            org.telegram.ui.Components.e5 e5Var3 = this.p1;
            e5Var3.w = alpha;
            e5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        q01 q01Var = this.t1;
        if (q01Var == null || this.u1 == null || q01Var.F == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.t1.F.setAlpha((int) (this.s1 * 255.0f));
        this.t1.F.setBounds(this.u1);
        this.t1.F.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
        this.t1.F.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + f() + 16;
    }

    public ci.lc getCollectionParticles() {
        if (this.S1 == null) {
            this.S1 = new ci.lc(1, 8);
        }
        return this.S1;
    }

    public long getDialogId() {
        return org.telegram.messenger.h10.i(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.H1 ? this.j0 : this.i0).canScrollVertically(1);
        if (canScrollVertically != this.x1) {
            this.x1 = canScrollVertically;
            org.telegram.messenger.camera.q.k(this.p0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i3, View view) {
        boolean z10;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        boolean z11;
        int i14 = this.z0.get(i3);
        Integer num2 = null;
        if (i14 >= 0) {
            ArrayList arrayList = this.N0;
            if (i14 < arrayList.size()) {
                org.telegram.ui.Components.sw swVar = (org.telegram.ui.Components.sw) arrayList.get(i14);
                if (swVar.h) {
                    return;
                }
                boolean z12 = i14 + 1 == arrayList.size();
                i12 = this.y0.get(i14);
                this.B0.add(Long.valueOf(swVar.b.id));
                i10 = 24;
                i11 = swVar.h ? swVar.c.size() : Math.min(24, swVar.c.size());
                num = swVar.c.size() > 24 ? Integer.valueOf(i12 + 1 + i11) : null;
                swVar.h = true;
                i13 = swVar.c.size();
                z11 = z12;
                if (i13 > i11) {
                    num = Integer.valueOf(i12 + 1 + i11);
                    num2 = Integer.valueOf(i13 - i11);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.O1 = view;
                this.P1 = num.intValue();
                this.Q1 = num2.intValue() + num.intValue();
                this.R1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.nw(this, num2.intValue() > i10 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i14 != -1 || (z10 = this.D0)) {
            return;
        }
        int i15 = (this.a != -1 ? 1 : 0) + (this.w != -1 ? 1 : 0);
        boolean z13 = this.O0;
        int i16 = i15 + (z13 ? 1 : 0);
        ArrayList arrayList2 = this.E0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z13 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.D0 = true;
        i10 = 40;
        i11 = size;
        num = null;
        i12 = i16;
        i13 = size2;
        z11 = false;
        if (i13 > i11) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void l() {
        int i3 = this.a0;
        if (i3 == 2) {
            return;
        }
        String s6 = a1.g.s(new StringBuilder("emoji"), (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10) ? "status" : "reaction", "usehint");
        int i10 = org.telegram.messenger.hp.e1().getInt(s6, 0);
        if (i10 <= 3) {
            org.telegram.messenger.hp.e1().edit().putInt(s6, i10 + 1).apply();
        }
    }

    public final boolean n() {
        int i3 = this.a0;
        return i3 == 5 || i3 == 10 || i3 == 12 || i3 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.L.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.p5 p5Var) {
        l();
        if (p5Var != null) {
            int i3 = this.a0;
            if (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = p5Var.getDocumentId();
            TLRPC.Document document = p5Var.document;
            int i10 = this.W;
            if (document == null) {
                document = org.telegram.ui.Components.g5.e(i10, p5Var.documentId);
            }
            if (!(view instanceof q01)) {
                p(view, Long.valueOf(p5Var.documentId), document, null, null);
                return;
            }
            final q01 q01Var = (q01) view;
            if (q01Var.w == null && (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10)) {
                org.telegram.messenger.li.b0(i10).C1(tL_emojiStatus);
            }
            if (i3 != 0 && i3 != 12 && i3 != 9 && i3 != 10 && i3 != 2) {
                p(view, Long.valueOf(p5Var.documentId), document, q01Var.w, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(q01Var.w)) {
                p(view, Long.valueOf(p5Var.documentId), document2, q01Var.w, null);
                return;
            }
            final xt0 xt0Var = new xt0(this, view, p5Var, document2, q01Var, 2);
            if (this.w1 != null || this.p1 == null) {
                xt0Var.run();
                return;
            }
            q01Var.b = true;
            final Rect rect = new Rect();
            b01 b01Var = this.b0;
            int left = b01Var.getLeft();
            e01 e01Var = this.i0;
            rect.set(q01Var.getLeft() + e01Var.getLeft() + left, q01Var.getTop() + e01Var.getTop() + b01Var.getTop(), q01Var.getRight() + e01Var.getLeft() + b01Var.getLeft(), q01Var.getBottom() + e01Var.getTop() + b01Var.getTop());
            Drawable drawable = q01Var.F;
            final org.telegram.ui.Components.g5 m10 = drawable instanceof org.telegram.ui.Components.g5 ? org.telegram.ui.Components.g5.m(i10, ((org.telegram.ui.Components.g5) drawable).h(), null, 7) : null;
            this.t1 = q01Var;
            Rect rect2 = new Rect();
            this.u1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.w1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.mz0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.e5 e5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float A = org.telegram.ui.Cells.f1.A(floatValue, floatValue, floatValue, 1.0f);
                    g11 g11Var = g11.this;
                    g11Var.n1 = A;
                    g11Var.s1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    org.telegram.messenger.g0.X1(rect, g11Var.q1, floatValue, g11Var.u1);
                    float scaleX = q01Var.getScaleX() * Math.max(1.0f, g11Var.v1.getInterpolation(b8.be.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    g11Var.u1.set((int) org.telegram.messenger.camera.q.v(g11Var.u1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.camera.q.v(g11Var.u1.height(), 2.0f, scaleX, g11Var.u1.centerY()), (int) a1.g.A(g11Var.u1.width(), 2.0f, scaleX, g11Var.u1.centerX()), (int) a1.g.A(g11Var.u1.height(), 2.0f, scaleX, g11Var.u1.centerY()));
                    g11Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        xt0Var.run();
                        if (m10 == null || (e5Var = g11Var.p1) == null) {
                            return;
                        }
                        e5Var.f();
                    }
                }
            });
            this.w1.addListener(new ei.k3(this, zArr, xt0Var, 11));
            this.w1.setInterpolator(org.telegram.ui.Components.xq.h);
            this.w1.setDuration(260L);
            this.w1.start();
            return;
        }
        p(view, null, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i3 = this.W;
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.A0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.C1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.B0);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        int i10 = this.a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.p1;
        if (e5Var != null) {
            e5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i3 = this.W;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.A0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.x0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.C1);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.B0);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
        int i10 = this.a0;
        if (i10 == 0 || i10 == 12) {
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.G3);
        }
        org.telegram.ui.Components.e5 e5Var = this.p1;
        if (e5Var != null) {
            e5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10 && this.a0 == 6) {
            this.s0.y1((getMeasuredWidth() / org.telegram.messenger.g0.L(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = this.R0;
        int i11 = this.a0;
        if (z10 && i11 != 3 && i11 != 4) {
            float L = org.telegram.messenger.g0.L(324.0f);
            Point point = org.telegram.messenger.g0.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(L, point.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(org.telegram.messenger.g0.L(330.0f), point.y * 0.75f), TLObject.FLAG_31));
        } else if (i11 == 6) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.q.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i3, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(w01 w01Var) {
        Integer num = this.a2;
        if (num != null) {
        }
        this.V1 = w01Var;
        boolean z10 = this.R0;
        int i3 = 0;
        e01 e01Var = this.i0;
        if (!z10) {
            h();
            while (i3 < e01Var.getChildCount()) {
                View childAt = e01Var.getChildAt(i3);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i3++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i10 = this.a0;
        if (i10 == 3 || i10 == 4 || i10 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W1 = ofFloat;
        ofFloat.addUpdateListener(new jz0(this, i3));
        this.W1.addListener(new y20(this, 27));
        kz0 kz0Var = new kz0(this, i3);
        dh.d0.f = true;
        dh.d0.e = true;
        dh.d0.g = false;
        if (dh.d0.d) {
            dh.d0.d = false;
        }
        dh.d0.c = kz0Var;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 512);
        this.Y1.d();
        this.W1.setDuration(800L);
        e01Var.setLayerType(2, null);
        this.g0.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.c0.setLayerType(2, null);
        org.telegram.ui.Components.sm smVar = this.o0;
        if (smVar != null) {
            smVar.setLayerType(2, null);
        }
        View view = this.n0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.e0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.Q = z10;
    }

    public void setBackgroundDelegate(h01 h01Var) {
        this.V = h01Var;
    }

    public void setDrawBackground(boolean z10) {
        this.R0 = z10;
        this.b0.setClipToOutline(z10);
        gi.n5 n5Var = this.c0;
        if (z10) {
            n5Var.setVisibility(0);
        } else {
            n5Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            if (z10) {
                return;
            }
            org.telegram.messenger.g0.d0(this.i0, new ei.e(21));
            for (int i3 = 0; i3 < this.e0.b.getChildCount(); i3++) {
                View childAt = this.e0.b.getChildAt(i3);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.e0.b.invalidate();
        }
    }

    public void setExpireDateHint(int i3) {
        if (i3 <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i3);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.S = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        q01 q01Var = this.P;
        if (q01Var != null) {
            q01Var.h.w0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.i1 = z10;
    }

    public void setOnLongPressedListener(e11 e11Var) {
        this.I = e11Var;
    }

    public void setRecentReactions(List<dh.n0> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i3) {
        this.a2 = Integer.valueOf(i3);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l10);
        e01 e01Var = this.i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    org.telegram.ui.Components.p5 p5Var = q01Var.e;
                    if (p5Var != null) {
                        q01Var.d(hashSet.contains(Long.valueOf(p5Var.getDocumentId())), true);
                    } else {
                        q01Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            e01Var.invalidate();
        }
    }

    public void setSelectedReaction(dh.n0 n0Var) {
        this.K.clear();
        this.K.add(n0Var);
        e01 e01Var = this.i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    q01Var.d(this.K.contains(q01Var.y), true);
                }
            }
            e01Var.invalidate();
        }
        uz0 uz0Var = this.j0;
        if (uz0Var != null) {
            for (int i10 = 0; i10 < uz0Var.getChildCount(); i10++) {
                if (uz0Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var2 = (q01) uz0Var.getChildAt(i10);
                    q01Var2.d(this.K.contains(q01Var2.y), true);
                }
            }
            uz0Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<dh.n0> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != null && ((dh.n0) arrayList.get(i3)).g != 0) {
                hashSet2.add(Long.valueOf(((dh.n0) arrayList.get(i3)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int w02;
        try {
            if (this.m1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.a1)) != this.g1) {
                this.g1 = w02;
                this.N.setColor(i0.a.o(w02, 30));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
                this.l1 = porterDuffColorFilter;
                org.telegram.ui.Components.g5 g5Var = this.X0;
                if (g5Var != null) {
                    g5Var.setColorFilter(porterDuffColorFilter);
                }
                e01 e01Var = this.i0;
                if (e01Var != null) {
                    e01Var.invalidate();
                }
                uz0 uz0Var = this.j0;
                if (uz0Var != null) {
                    uz0Var.invalidate();
                }
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        kz0 kz0Var = this.K1;
        if (kz0Var != null) {
            org.telegram.messenger.g0.r(kz0Var);
            this.K1 = null;
        }
        ei.a6 a6Var = this.L1;
        if (a6Var != null) {
            org.telegram.messenger.g0.r(a6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        r01 r01Var = this.r0;
        yz0 yz0Var = this.g0;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z10);
            if (yz0Var != null) {
                yz0Var.d(true);
                yz0.a(yz0Var, false);
            }
            r01Var.E(true);
            this.B1 = null;
        } else {
            boolean z12 = this.z1;
            boolean z13 = !z12;
            this.z1 = true;
            this.A1 = false;
            if (yz0Var != null) {
                yz0Var.f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                r01Var.E(false);
            } else if (!str.equals(this.B1)) {
                kz0 kz0Var2 = new kz0(this, 1);
                this.K1 = kz0Var2;
                org.telegram.messenger.g0.i3(kz0Var2, 120L);
            }
            this.B1 = str;
            String[] G0 = org.telegram.messenger.g0.G0();
            if (!Arrays.equals(G0, c2)) {
                org.telegram.messenger.li.b0(this.W).M(G0, false);
            }
            c2 = G0;
            ei.a6 a6Var2 = new ei.a6(this, str, z10, z13, G0, 4);
            this.L1 = a6Var2;
            org.telegram.messenger.g0.i3(a6Var2, z11 ? 425L : 0L);
            if (yz0Var != null) {
                yz0Var.f.b(2);
                yz0.a(yz0Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0.getAlpha(), f10 * 0.25f);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new jz0(this, 2));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(org.telegram.ui.Components.xq.f);
        this.j1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.L;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z11 = false;
        } else {
            hashSet.add(l10);
            z11 = true;
        }
        e01 e01Var = this.i0;
        if (e01Var != null) {
            for (int i3 = 0; i3 < e01Var.getChildCount(); i3++) {
                if (e01Var.getChildAt(i3) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i3);
                    org.telegram.ui.Components.p5 p5Var = q01Var.e;
                    if (p5Var == null || p5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = q01Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            q01Var.e(z11, z10);
                        }
                    } else {
                        q01Var.e(z11, z10);
                    }
                }
            }
            e01Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.e5 e5Var, View view) {
        Integer num;
        this.o1 = (e5Var == null || (num = e5Var.G) == null) ? 0 : num.intValue();
        this.p1 = e5Var;
        this.r1 = view;
        if (this.J && e5Var != null) {
            e5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.H1 == z10) {
            return;
        }
        this.H1 = z10;
        e01 e01Var = this.i0;
        int i3 = 0;
        e01Var.setVisibility(0);
        uz0 uz0Var = this.j0;
        uz0Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new nz0(this, z10, i3));
        this.G1.addListener(new a01(this, z10, i3));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(org.telegram.ui.Components.xq.h);
        this.G1.start();
        org.telegram.messenger.camera.q.l(((View) e01Var.getParent()).animate().translationY((this.H1 && z11) ? -org.telegram.messenger.g0.L(36.0f) : 0.0f).setUpdateListener(new jz0(this, 1)), org.telegram.ui.Components.xq.f, 160L);
        if (this.H1 && z11) {
            uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        } else {
            uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        }
        h();
    }

    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this(d2Var, context, z10, num, i3, z11, e6Var, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, e6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(org.telegram.ui.ActionBar.d2 d2Var, Context context, boolean z10, Integer num, int i3, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(context);
        int i12;
        int i13;
        float f10;
        boolean z12;
        Integer num2;
        boolean z13;
        Integer num3;
        boolean z14;
        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
        int i14 = i3;
        int i15 = i11;
        this.K = new HashSet();
        this.L = new HashSet();
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        this.T = new ArrayList();
        this.W = org.telegram.messenger.h10.t0;
        this.d0 = new org.telegram.ui.Components.zu[2];
        this.w0 = new ArrayList();
        this.x0 = new SparseIntArray();
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new SparseIntArray();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = false;
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = new ArrayList();
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = false;
        this.P0 = false;
        this.R0 = true;
        this.W0 = new ImageReceiver(null);
        this.i1 = true;
        this.n1 = 1.0f;
        this.s1 = 1.0f;
        this.v1 = new OvershootInterpolator(2.0f);
        this.x1 = false;
        this.y1 = false;
        this.z1 = false;
        this.A1 = false;
        this.H1 = false;
        this.I1 = false;
        this.M1 = false;
        this.N1 = false;
        this.P1 = -1;
        this.Q1 = -1;
        this.R1 = -1L;
        this.T1 = new kz0(this, 3);
        this.U1 = new kz0(this, 4);
        this.Y1 = new g2.g((int[]) null);
        this.Z1 = new Paint();
        this.a1 = e6Var;
        this.a0 = i14;
        this.O0 = z10;
        this.d1 = d2Var2;
        SharedPreferences e12 = org.telegram.messenger.hp.e1();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.P0 = e12.getInt(sb2.toString(), 0) < 3;
        this.g1 = i15;
        this.m1 = i15 == org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, e6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var));
        paint2.setColor(i0.a.o(i15, 30));
        this.l1 = new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN);
        this.Z0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(b8.be.b(num.intValue(), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > org.telegram.messenger.g0.L(170.0f);
        setFocusableInTouchMode(true);
        int i16 = 6;
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 7) {
            this.e1 = i10;
            setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            setOnTouchListener(new e0(this, i16));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.n0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, b8.mf.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / org.telegram.messenger.g0.p) + (z15 ? -12 : 4), n() ? 0 : this.e1, 0.0f, n() ? this.e1 : 0));
        }
        gi.n5 n5Var = new gi.n5(this, context, e6Var, 15);
        this.c0 = n5Var;
        boolean z16 = i14 == 3 || i14 == 4;
        Integer num4 = valueOf;
        b01 b01Var = new b01(this, context, z16, z16, e6Var, num4);
        Integer num5 = num4;
        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        this.b0 = b01Var;
        if (!z16) {
            b01Var.setOutlineProvider(new c01(this, num5));
            b01Var.setClipToOutline(true);
            if (z16) {
                b01Var.setElevation(2.0f);
            }
        }
        if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10 || i14 == 2 || i14 == 5 || i14 == 15) {
            b01Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        }
        b01Var.addView(n5Var, b8.mf.c(-1.0f, -1));
        addView(b01Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 2 || i14 == 7) ? this.e1 + 6 : 0.0f, 0.0f, n() ? this.e1 + 6 : 0.0f));
        if (num5 != null) {
            org.telegram.ui.Components.sm smVar = new org.telegram.ui.Components.sm(context, 24);
            this.o0 = smVar;
            i13 = 14;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.G8, e6Var2, PorterDuff.Mode.MULTIPLY);
            smVar.setBackground(drawable);
            i12 = 3;
            addView(smVar, b8.mf.d(17, 9.0f, (n() ? 80 : 48) | 3, (num5.intValue() / org.telegram.messenger.g0.p) + (z15 ? -25 : 10), n() ? 0.0f : this.e1 + 5, 0.0f, n() ? this.e1 + 14 : 0.0f));
        } else {
            i12 = 3;
            i13 = 14;
        }
        boolean z17 = (d2Var2 == null || i14 == i12 || i14 == 6 || i14 == 5 || i14 == 7 || i14 == 4 || i14 == 9 || i14 == 10 || !z11) ? false : true;
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            Integer num6 = num5;
            if (i14 != 4) {
                num2 = num6;
                z13 = true;
            } else {
                num2 = num6;
                z13 = false;
            }
            int i18 = 12;
            if (i14 == 0 || i14 == 12 || i14 == 9 || i14 == 10) {
                num3 = num2;
                z14 = true;
            } else {
                num3 = num2;
                z14 = false;
            }
            qv0 qv0Var = z17 ? new qv0(i18, this, d2Var2) : null;
            int i19 = i17;
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
            int i20 = i14;
            int i21 = i13;
            d01 d01Var = new d01(this, context, e6Var3, z13, z14, i20, qv0Var, i15, i3);
            org.telegram.ui.Components.vu vuVar = d01Var.E;
            if (vuVar != null) {
                vuVar.setOnLongClickListener(new t(this, 7));
            }
            d01Var.V = false;
            if (i20 == 4) {
                d01Var.setAnimatedEmojiCacheType(13);
            } else {
                d01Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
            }
            d01Var.P = num3 == null;
            d01Var.setPaddingLeft(i20 == 6 ? 10.0f : 5.0f);
            if (i20 != i21 && i20 != 8 && i20 != 13) {
                this.b0.addView(d01Var, b8.mf.c(36.0f, -1));
            }
            this.d0[i19] = d01Var;
            i15 = i11;
            i14 = i20;
            i13 = i21;
            d2Var2 = d2Var;
            e6Var2 = e6Var3;
            i17 = i19 + 1;
            num5 = num3;
        }
        Integer num7 = num5;
        org.telegram.ui.ActionBar.e6 e6Var4 = e6Var2;
        int i22 = i14;
        int i23 = i13;
        org.telegram.ui.Components.zu[] zuVarArr = this.d0;
        this.e0 = zuVarArr[0];
        zuVarArr[1].setVisibility(8);
        zz0 zz0Var = new zz0(context, num7, 1);
        this.f0 = zz0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, zz0Var, e6Var4);
        if (i22 == i23 || i22 == 8 || i22 == 13) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
            this.b0.addView(zz0Var, b8.mf.d(-1, 1.0f / org.telegram.messenger.g0.p, 48, 0.0f, 36.0f, 0.0f, 0.0f));
        }
        org.telegram.messenger.g0.Z3(zz0Var, true, f10, true, false);
        e01 e01Var = new e01(this, context, i22);
        this.i0 = e01Var;
        f01 f01Var = new f01();
        this.f1 = f01Var;
        f01Var.c = 220L;
        f01Var.e = 260L;
        f01Var.f = 160L;
        f01Var.g = 160L;
        f01Var.m = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        f01Var.i = xqVar;
        f01Var.C = false;
        e01Var.setItemAnimator(f01Var);
        float f11 = f10;
        e01Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        g01 g01Var = new g01(this);
        this.q0 = g01Var;
        e01Var.setAdapter(g01Var);
        vz0 vz0Var = new vz0(this, 1);
        this.s0 = vz0Var;
        e01Var.setLayoutManager(vz0Var);
        vz0Var.O = new tz0(this, 0);
        yg0 yg0Var = new yg0(context, 7);
        this.h0 = yg0Var;
        ai.c0 c0Var = new ai.c0(this, context);
        this.l0 = c0Var;
        c0Var.addView(e01Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        yg0Var.addView(c0Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        uz0 uz0Var = new uz0(this, context);
        this.j0 = uz0Var;
        if (uz0Var.getItemAnimator() != null) {
            uz0Var.getItemAnimator().n(180L);
            uz0Var.getItemAnimator().i = xqVar;
        }
        TextView textView = new TextView(context);
        if (i22 == 4) {
            textView.setText(org.telegram.messenger.bd.M0(2131748220, null));
        } else if (i22 == 0 || i22 == 13 || i22 == 12 || i22 == 11 || i22 == 9 || i22 == 10) {
            textView.setText(org.telegram.messenger.bd.M0(2131748221, null));
        } else if (i22 == 1 || i22 == 2) {
            textView.setText(org.telegram.messenger.bd.M0(2131748182, null));
        } else if (i22 == 14) {
            textView.setText(org.telegram.messenger.bd.M0(2131748222, null));
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131748211, null));
        }
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Af, e6Var4);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.m0 = k9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.k0 = frameLayout;
        frameLayout.addView(k9Var, b8.mf.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        yg0Var.addView(frameLayout, b8.mf.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        uz0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(38.0f));
        r01 r01Var = new r01(this);
        this.r0 = r01Var;
        uz0Var.setAdapter(r01Var);
        vz0 vz0Var2 = new vz0(this, 0);
        uz0Var.setLayoutManager(vz0Var2);
        vz0Var2.O = new tz0(this, 1);
        uz0Var.setVisibility(8);
        yg0Var.addView(uz0Var, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.b0.addView(yg0Var, b8.mf.d(-1, -1.0f, 48, 0.0f, (i22 == 8 || i22 == 13 || i22 == 14) ? 0.0f : (f11 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.vi0 vi0Var = new org.telegram.ui.Components.vi0(e01Var, vz0Var);
        this.t0 = vi0Var;
        vi0Var.i = new bi.h(this, 2);
        vi0Var.h = new lz0(this);
        xz0 xz0Var = new xz0(this, i22, context, e6Var4, num);
        e01Var.p1(xz0Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        uz0Var.p1(xz0Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.cl0 cl0Var = new org.telegram.ui.Components.cl0(this, i22, 2);
        e01Var.setOnItemClickListener(cl0Var);
        uz0Var.setOnItemClickListener(cl0Var);
        yz0 yz0Var = new yz0(this, context, z11);
        this.g0 = yz0Var;
        yz0Var.setTranslationY(-org.telegram.messenger.g0.L(52.0f));
        yz0Var.setVisibility(4);
        yg0Var.addView(yz0Var, b8.mf.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        zz0 zz0Var2 = new zz0(context, num7, 0);
        Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
        int i24 = org.telegram.ui.ActionBar.k6.G8;
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.8f, i24);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.l(zz0Var2, drawable2, L.a, -1, 2, L.d, e6Var, mode);
        zz0Var2.setBackground(drawable2);
        zz0Var2.setAlpha(0.0f);
        this.b0.addView(zz0Var2, b8.mf.d(-1, 20.0f, 55, 0.0f, (f11 / org.telegram.messenger.g0.p) + 36.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.p0 = view2;
        Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
        org.telegram.ui.ActionBar.r6.y(this, drawable3, i24, e6Var, mode);
        if (i3 == 14) {
            view2.setBackground(drawable3);
        }
        view2.setAlpha(0.0f);
        this.b0.addView(view2, b8.mf.e(-1, 20, 87));
        View view3 = new View(context);
        this.u0 = view3;
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(-16777216);
        this.b0.addView(view3, b8.mf.c(-1.0f, -1));
        int i25 = this.W;
        org.telegram.messenger.li.b0(i25);
        org.telegram.messenger.li.b0(i25).B(5);
        if (i3 == 14) {
            org.telegram.messenger.hp.s1(this.W).E0();
        } else if (i3 == 1 || i3 == 11 || i3 == 2 || i3 == 6 || i3 == 13) {
            org.telegram.messenger.li.b0(i25).A();
        } else if (i3 == 9 || i3 == 10) {
            if (org.telegram.messenger.hp.s1(i25).e7.getBoolean("resetemojipacks", true)) {
                org.telegram.messenger.li.b0(i25).a1(5, false, false);
                org.telegram.messenger.hp.s1(i25).e7.edit().putBoolean("resetemojipacks", false).commit();
            }
            org.telegram.messenger.li.b0(i25).L(2, false);
            org.telegram.messenger.li.b0(i25).Y0();
            org.telegram.messenger.li.b0(i25).m0(new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
        } else if (i3 == 0 || i3 == 12) {
            org.telegram.messenger.li.b0(i25).L(0, true);
            org.telegram.messenger.li.b0(i25).m0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        } else if (i3 == 3) {
            org.telegram.messenger.li.b0(i25).v();
        } else if (i3 == 4) {
            org.telegram.messenger.li.b0(i25).V0(0, false, true, false);
            org.telegram.messenger.li.b0(i25).B(0);
        }
        this.W0.E0(7);
        int i26 = this.a0;
        if (i26 == 3 || i26 == 4 || i26 == 6) {
            z12 = true;
        } else {
            com.google.android.gms.internal.cast.c0 c0Var2 = org.telegram.messenger.zb.D().p;
            if (((CountDownLatch) c0Var2.c) == null) {
                z12 = true;
                c0Var2.c = new CountDownLatch(1);
            } else {
                z12 = true;
            }
            dh.d0.g = z12;
        }
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            this.K.add(dh.n0.b(str));
        }
        e01 e01Var = this.i0;
        if (e01Var != null) {
            for (int i10 = 0; i10 < e01Var.getChildCount(); i10++) {
                if (e01Var.getChildAt(i10) instanceof q01) {
                    q01 q01Var = (q01) e01Var.getChildAt(i10);
                    q01Var.d(this.K.contains(q01Var.y), true);
                }
            }
            e01Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(f11 f11Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void m() {
    }

    public void q() {
    }

    public void r(q01 q01Var, dh.n0 n0Var) {
    }
}
