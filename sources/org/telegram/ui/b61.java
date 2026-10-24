package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class b61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public static String[] b2;
    public final ArrayList A0;
    public String A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ValueAnimator F1;
    public f51 G;
    public final ArrayList G0;
    public boolean G1;
    public z51 H;
    public final ArrayList H0;
    public boolean H1;
    public boolean I;
    public final ArrayList I0;
    public ValueAnimator I1;
    public HashSet J;
    public ArrayList J0;
    public d41 J1;
    public final HashSet K;
    public final ArrayList K0;
    public ci.i6 K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public boolean M1;
    public Drawable N;
    public final boolean N0;
    public View N1;
    public k51 O;
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
    public ai.ee R1;
    public final ArrayList S;
    public k51 S0;
    public final d41 S1;
    public boolean T;
    public boolean T0;
    public final d41 T1;
    public b51 U;
    public float U0;
    public Runnable U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.r5 W0;
    public ValueAnimator W1;
    public q41 X0;
    public final AnimationNotificationsLocker X1;
    public final Integer Y0;
    public final Paint Y1;
    public final org.telegram.ui.ActionBar.g6 Z0;
    public Integer Z1;
    public int a;
    public final v41 a0;
    public float a1;
    public int b;
    public final ei.g6 b0;
    public float b1;
    public int c;
    public final org.telegram.ui.Components.kw[] c0;
    public final org.telegram.ui.ActionBar.o2 c1;
    public int d;
    public org.telegram.ui.Components.kw d0;
    public final int d1;
    public int e;
    public final t41 e0;
    public final z41 e1;
    public int f;
    public final s41 f0;
    public int f1;
    public final n41 g0;
    public boolean g1;
    public int h;
    public final y41 h0;
    public boolean h1;
    public final o41 i0;
    public ValueAnimator i1;
    public final FrameLayout j0;
    public Drawable j1;
    public final ah.v k0;
    public PorterDuffColorFilter k1;
    public final org.telegram.ui.Components.w9 l0;
    public final boolean l1;
    public final View m0;
    public float m1;
    public int n;
    public final org.telegram.ui.Components.un n0;
    public int n1;
    public final View o0;
    public org.telegram.ui.Components.p5 o1;
    public final a51 p0;
    public Rect p1;
    public final l51 q0;
    public View q1;
    public int r;
    public final p41 r0;
    public float r1;
    public int s;
    public final org.telegram.ui.Components.pl0 s0;
    public k51 s1;
    public final View t0;
    public Rect t1;
    public int u0;
    public final OvershootInterpolator u1;
    public int v;
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

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(o2Var, context, z10, num, i10, true, g6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.w9 w9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (w9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
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
                    if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
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
            ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i10).getStickerSets(5));
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
                        if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "36_36_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "36_36";
            }
            w9Var.setLayerNum(7);
            w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            w9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(b61 b61Var, int i10, int i11) {
        org.telegram.ui.Components.pl0 pl0Var = b61Var.s0;
        p41 p41Var = b61Var.r0;
        View m10 = p41Var.m(i10);
        int L0 = p41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            pl0Var.b = p41Var.L0() < i10 ? 0 : 1;
            pl0Var.c(i10, i11, false, false);
        } else {
            ei.l1 l1Var = new ei.l1(b61Var, b61Var.h0.getContext(), 4);
            l1Var.a = i10;
            l1Var.p = i11;
            p41Var.w0(l1Var);
        }
    }

    public static boolean c(b61 b61Var) {
        if (b61Var.T) {
            return true;
        }
        ValueAnimator valueAnimator = b61Var.V1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.r5.g();
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
                this.j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            } else {
                this.j1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            }
            this.j1.setColorFilter(this.k1);
        }
        return this.j1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
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

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 >= tL_messages_stickerSet.packs.size()) {
                j10 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), fixEmoji)) {
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
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.r5 r5Var) {
        org.telegram.ui.Components.r5 r5Var2;
        if (this.I && (r5Var2 = this.W0) != r5Var) {
            if (r5Var2 != null) {
                r5Var2.o(this);
            }
            this.W0 = r5Var;
            if (r5Var != null) {
                r5Var.setColorFilter(this.k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(int i10) {
        boolean[] zArr = c2;
        if (zArr[i10] || MediaDataController.getInstance(i10) == null) {
            return;
        }
        zArr[i10] = true;
        MediaDataController.getInstance(i10).checkStickers(5);
        MediaDataController.getInstance(i10).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i10).checkReactions();
        MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i10).getDefaultEmojiStatuses();
        MediaDataController.getInstance(i10).checkDefaultTopicIcons();
        org.telegram.ui.Components.ux0.y3.fetch(i10, 1, new ci.g(i10, 1));
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        y41 y41Var = this.h0;
        if (y41Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < y41Var.getChildCount(); i11++) {
                if (y41Var.getChildAt(i11) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i11);
                    org.telegram.ui.Components.a6 a6Var = k51Var.e;
                    if (a6Var == null || a6Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            k51Var.f();
                        }
                    } else {
                        k51Var.f();
                    }
                    z10 = true;
                }
            }
            y41Var.invalidate();
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
            a51 a51Var = this.p0;
            if (a51Var != null) {
                a51Var.m(i10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r8 == 4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04ff A[LOOP:5: B:125:0x04f9->B:127:0x04ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a9a A[LOOP:13: B:263:0x0a92->B:265:0x0a9a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b20  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b26  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02fb A[LOOP:30: B:512:0x02f3->B:514:0x02fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0320 A[LOOP:31: B:517:0x031a->B:519:0x0320, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0412 A[LOOP:2: B:81:0x040c->B:83:0x0412, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0457  */
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
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        long j10;
        ArrayList arrayList3;
        int size;
        int i13;
        long j11;
        int i14;
        ArrayList arrayList4;
        y41 y41Var;
        int i15;
        int i16;
        ArrayList arrayList5;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean z14;
        SparseIntArray sparseIntArray3;
        org.telegram.ui.Components.fy fyVar;
        SparseIntArray sparseIntArray4;
        int i17;
        SparseIntArray sparseIntArray5;
        int i18;
        SparseIntArray sparseIntArray6;
        SparseIntArray sparseIntArray7;
        ArrayList arrayList7;
        int i19;
        int i20;
        int i21;
        boolean z15;
        int i22;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList8;
        boolean z16 = !this.P ? false : z11;
        int i23 = this.V;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i23);
        if (mediaDataController2 == null) {
            return;
        }
        if (z10 || this.L0 == null) {
            this.L0 = new ArrayList(mediaDataController2.getStickerSets(this.Q ? 0 : 5));
        }
        ArrayList arrayList9 = this.L0;
        ArrayList arrayList10 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList11 = this.v0;
        ArrayList arrayList12 = new ArrayList(arrayList11);
        this.u0 = 0;
        this.f = -1;
        this.b = -1;
        this.r = -1;
        this.s = -1;
        this.c = -1;
        this.h = -1;
        this.n = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        ArrayList arrayList13 = this.D0;
        arrayList13.clear();
        this.K0.clear();
        ArrayList arrayList14 = this.H0;
        arrayList14.clear();
        ArrayList arrayList15 = this.I0;
        arrayList15.clear();
        ArrayList arrayList16 = this.M0;
        arrayList16.clear();
        SparseIntArray sparseIntArray8 = this.w0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.x0;
        sparseIntArray9.clear();
        SparseIntArray sparseIntArray10 = this.y0;
        sparseIntArray10.clear();
        arrayList11.clear();
        boolean z17 = z16;
        SparseIntArray sparseIntArray11 = this.z0;
        sparseIntArray11.clear();
        this.S.clear();
        ArrayList arrayList17 = this.F0;
        arrayList17.clear();
        SparseIntArray sparseIntArray12 = sparseIntArray11;
        ArrayList arrayList18 = this.G0;
        arrayList18.clear();
        MediaDataController mediaDataController3 = mediaDataController2;
        ArrayList arrayList19 = this.E0;
        arrayList19.clear();
        boolean isEmpty = arrayList9.isEmpty();
        ArrayList arrayList20 = arrayList10;
        int i24 = this.W;
        if (isEmpty) {
            sparseIntArray = sparseIntArray9;
        } else {
            sparseIntArray = sparseIntArray9;
        }
        if (i24 != 5 && i24 != 7 && i24 != 8) {
            int i25 = this.u0;
            sparseIntArray2 = sparseIntArray8;
            this.u0 = i25 + 1;
            this.a = i25;
            arrayList11.add(9L);
            z13 = this.N0;
            if (i24 != 5 || i24 == 7) {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                if (i10 != 0) {
                    this.u0++;
                    arrayList11.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i23).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i11 = 0;
                    while (i11 < tL_emojiList.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.a6(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList13.size(); i12++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.a6) arrayList13.get(i12)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            } else if (i24 != 4) {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                if (i24 == 6) {
                    if (i10 != 0) {
                        this.u0++;
                        arrayList11.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i23).getEnabledReactionsList();
                    for (int i26 = 0; i26 < enabledReactionsList.size(); i26++) {
                        arrayList17.add(enabledReactionsList.get(i26).activate_animation);
                    }
                    for (int i27 = 0; i27 < arrayList17.size(); i27++) {
                        arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i27)).id * 13) + 62425));
                        this.u0++;
                    }
                } else if (i24 == 3) {
                    int i28 = this.u0;
                    this.u0 = i28 + 1;
                    this.x = i28;
                    arrayList11.add(12L);
                    int i29 = this.u0;
                    this.u0 = i29 + 1;
                    this.w = i29;
                    arrayList11.add(7L);
                    String str = UserConfig.getInstance(i23).defaultTopicIcons;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i23).getStickerSetByName(str);
                        tL_messages_stickerSet = stickerSetByName == null ? MediaDataController.getInstance(i23).getStickerSetByEmojiOrName(str) : stickerSetByName;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i10 != 0) {
                            this.u0++;
                            arrayList11.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList21 = tL_messages_stickerSet.documents;
                        if (arrayList21 != null && !arrayList21.isEmpty()) {
                            int i30 = 0;
                            while (i30 < tL_messages_stickerSet.documents.size()) {
                                arrayList13.add(new org.telegram.ui.Components.a6(tL_messages_stickerSet.documents.get(i30), (Paint.FontMetricsInt) null));
                                i30++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i31 = 0; i31 < arrayList13.size(); i31++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.a6) arrayList13.get(i31)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                    }
                }
            } else if (this.Q) {
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i23);
                i10 = z13 ? 1 : 0;
                arrayList17.addAll(mediaDataController4.getRecentStickersNoCopy(0));
                int i32 = 0;
                while (i32 < arrayList17.size()) {
                    arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i32)).id * 13) + 62425));
                    this.u0++;
                    i32++;
                    arrayList18 = arrayList18;
                }
                arrayList = arrayList18;
            } else {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.R ? MediaDataController.getInstance(i23).profileAvatarConstructorDefault : MediaDataController.getInstance(i23).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList8 = tL_emojiList3.document_id) != null && !arrayList8.isEmpty()) {
                    org.telegram.ui.Components.fy fyVar2 = new org.telegram.ui.Components.fy();
                    fyVar2.f = true;
                    fyVar2.g = false;
                    fyVar2.h = true;
                    fyVar2.e = true;
                    fyVar2.b = new TLRPC.TL_stickerSet();
                    fyVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList16.size();
                    arrayList16.add(fyVar2);
                    int i33 = 0;
                    while (i33 < tL_emojiList3.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.a6(tL_emojiList3.document_id.get(i33).longValue(), (Paint.FontMetricsInt) null));
                        i33++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.a6) arrayList13.get(i34)).getDocumentId() * 13) + 43223));
                        this.u0++;
                    }
                }
            }
            if (this.O0 && i24 != 13 && i24 != 2 && i24 != 11 && i24 != 3 && i24 != 6 && i24 != 8 && i24 != 4 && i24 != 5 && i24 != 7) {
                int i35 = this.u0;
                this.u0 = i35 + 1;
                this.v = i35;
                arrayList11.add(6L);
            }
            if ((i24 != 9 || i24 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i23).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.R0 == null) {
                this.d = this.u0;
                ArrayList arrayList22 = new ArrayList(this.R0);
                if (i24 == 13 && arrayList22.size() > 8) {
                    arrayList22.subList(8, arrayList22.size()).clear();
                } else if (i24 == 14) {
                    arrayList7 = new ArrayList();
                    int i36 = 0;
                    while (i36 < arrayList22.size()) {
                        if (((ah.i1) arrayList22.get(i36)).e) {
                            arrayList7.add((ah.i1) arrayList22.remove(i36));
                            i36--;
                        }
                        i36++;
                    }
                    if (i24 != 8 || i24 == 11 || i24 == 13) {
                        arrayList14.addAll(arrayList22);
                    } else {
                        for (int i37 = 0; i37 < 16; i37++) {
                            if (!arrayList22.isEmpty()) {
                                arrayList14.add((ah.i1) arrayList22.remove(0));
                            }
                        }
                    }
                    for (i19 = 0; i19 < arrayList14.size(); i19++) {
                        arrayList11 = arrayList11;
                        arrayList11.add(Long.valueOf((((ah.i1) arrayList14.get(i19)).hashCode() * 13) - 5632));
                    }
                    int size2 = arrayList14.size() + this.u0;
                    this.u0 = size2;
                    this.e = size2;
                    if (!arrayList22.isEmpty() && i24 != 8 && i24 != 11 && i24 != 13) {
                        i21 = 0;
                        while (true) {
                            if (i21 < arrayList22.size()) {
                                z15 = true;
                                break;
                            } else {
                                if (((ah.i1) arrayList22.get(i21)).g != 0) {
                                    z15 = false;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i24 != 14) {
                            if (!z15) {
                                int i38 = this.u0;
                                this.u0 = i38 + 1;
                                this.f = i38;
                                arrayList11.add(4L);
                            } else if (UserConfig.getInstance(i23).isPremium()) {
                                int i39 = this.u0;
                                this.u0 = i39 + 1;
                                this.h = i39;
                                arrayList11.add(5L);
                            }
                        }
                        this.b = this.u0;
                        arrayList15.addAll(arrayList22);
                        for (i22 = 0; i22 < arrayList15.size(); i22++) {
                            arrayList11.add(Long.valueOf((((ah.i1) arrayList15.get(i22)).h * 13) + (z15 ? 4235 : -3142)));
                        }
                        int size3 = arrayList15.size() + this.u0;
                        this.u0 = size3;
                        this.c = size3;
                    }
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        int i40 = this.u0;
                        this.u0 = i40 + 1;
                        this.y = i40;
                        arrayList11.add(8L);
                        this.E = this.u0;
                        this.J0 = arrayList7;
                        for (i20 = 0; i20 < arrayList7.size(); i20++) {
                            arrayList11.add(Long.valueOf(((ah.i1) arrayList7.get(i20)).c * 19));
                        }
                        int size4 = arrayList7.size() + this.u0;
                        this.u0 = size4;
                        this.F = size4;
                    }
                }
                arrayList7 = null;
                if (i24 != 8) {
                }
                arrayList14.addAll(arrayList22);
                while (i19 < arrayList14.size()) {
                }
                int size22 = arrayList14.size() + this.u0;
                this.u0 = size22;
                this.e = size22;
                if (!arrayList22.isEmpty()) {
                    i21 = 0;
                    while (true) {
                        if (i21 < arrayList22.size()) {
                        }
                        i21++;
                    }
                    if (i24 != 14) {
                    }
                    this.b = this.u0;
                    arrayList15.addAll(arrayList22);
                    while (i22 < arrayList15.size()) {
                    }
                    int size32 = arrayList15.size() + this.u0;
                    this.u0 = size32;
                    this.c = size32;
                }
                if (arrayList7 != null) {
                    int i402 = this.u0;
                    this.u0 = i402 + 1;
                    this.y = i402;
                    arrayList11.add(8L);
                    this.E = this.u0;
                    this.J0 = arrayList7;
                    while (i20 < arrayList7.size()) {
                    }
                    int size42 = arrayList7.size() + this.u0;
                    this.u0 = size42;
                    this.F = size42;
                }
            } else if (i24 == 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(i23).getRecentEmojiStatuses();
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet((i24 == 0 || i24 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet != null) {
                    if (i10 != 0) {
                        this.u0++;
                        arrayList11.add(2L);
                    }
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i24 == 0 || i24 == 12) ? MediaDataController.getInstance(i23).getDefaultEmojiStatuses() : MediaDataController.getInstance(i23).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList23 = stickerSet.documents;
                    if (arrayList23 != null && !arrayList23.isEmpty()) {
                        int i41 = 0;
                        while (i41 < Math.min(7, stickerSet.documents.size())) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSet;
                            arrayList13.add(new org.telegram.ui.Components.a6(stickerSet.documents.get(i41), (Paint.FontMetricsInt) null));
                            if (arrayList13.size() + i10 >= 104) {
                                break;
                            }
                            i41++;
                            stickerSet = tL_messages_stickerSet2;
                        }
                    }
                    if ((i24 == 0 || i24 == 12) && recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                        int size5 = recentEmojiStatuses.size();
                        int i42 = 0;
                        while (i42 < size5) {
                            TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i42);
                            i42++;
                            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                            if (emojiStatusDocumentId != null) {
                                ArrayList<TLRPC.EmojiStatus> arrayList24 = recentEmojiStatuses;
                                int i43 = 0;
                                while (true) {
                                    if (i43 >= arrayList13.size()) {
                                        int i44 = size5;
                                        arrayList13.add(new org.telegram.ui.Components.a6(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList24;
                                        size5 = i44;
                                    } else {
                                        if (((org.telegram.ui.Components.a6) arrayList13.get(i43)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                            recentEmojiStatuses = arrayList24;
                                            break;
                                        }
                                        i43++;
                                    }
                                }
                            }
                        }
                    }
                    if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                        int size6 = defaultEmojiStatuses.size();
                        int i45 = 0;
                        while (i45 < size6) {
                            TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i45);
                            i45++;
                            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                            if (emojiStatusDocumentId2 != null) {
                                int i46 = 0;
                                while (true) {
                                    if (i46 >= arrayList13.size()) {
                                        ArrayList<TLRPC.EmojiStatus> arrayList25 = defaultEmojiStatuses;
                                        int i47 = size6;
                                        arrayList13.add(new org.telegram.ui.Components.a6(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        defaultEmojiStatuses = arrayList25;
                                        size6 = i47;
                                    } else if (((org.telegram.ui.Components.a6) arrayList13.get(i46)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i46++;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList13.size() <= 40 - i10 || this.C0) {
                        for (int i48 = 0; i48 < arrayList13.size(); i48++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.a6) arrayList13.get(i48)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - i10; i49++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.a6) arrayList13.get(i49)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                        arrayList11.add(Long.valueOf(((((arrayList13.size() - 40) + i10) + 1) * 13) - 5531));
                        f51 f51Var = this.G;
                        if (f51Var != null) {
                            f51Var.a.setText("+" + ((arrayList13.size() - 40) + i10 + 1));
                        }
                        sparseIntArray10.put(this.u0, -1);
                        this.u0++;
                    }
                }
            }
            arrayList19.clear();
            if (i24 != 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                j10 = 13334;
                ai.y9 G = ai.ha.y(i23, false).G(getDialogId(), true);
                G.a();
                arrayList3 = new ArrayList();
                ArrayList arrayList26 = G.l;
                size = arrayList26.size();
                i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList26.get(i13);
                    i13++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList3.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList3.isEmpty()) {
                    int i50 = this.u0;
                    this.u0 = i50 + 1;
                    this.n = i50;
                    arrayList11.add(22L);
                    this.r = this.u0;
                    int size7 = arrayList3.size();
                    int i51 = 0;
                    while (i51 < size7) {
                        Object obj2 = arrayList3.get(i51);
                        i51++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        arrayList11.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.u0++;
                        arrayList19.add(tL_starGiftUnique);
                    }
                    j11 = 322;
                    this.s = this.u0;
                    this.d0.l(true);
                } else {
                    j11 = 322;
                    this.d0.l(false);
                }
                i14 = 13;
            } else {
                i14 = 13;
                j10 = 13334;
                j11 = 322;
            }
            if (i24 == i14) {
                String[][] strArr = EmojiData.dataColored;
                int length = strArr.length;
                for (int i52 = 0; i52 < length; i52++) {
                    String[] strArr2 = strArr[i52];
                    int length2 = strArr2.length;
                    int i53 = 0;
                    while (i53 < length2) {
                        arrayList.add(strArr2[i53]);
                        arrayList11.add(Long.valueOf((r12.hashCode() * j11) + j10));
                        this.u0++;
                        i53++;
                        strArr = strArr;
                        length = length;
                    }
                }
            }
            if (i24 != 8 && i24 != 13 && i24 != 14) {
                i18 = 0;
                while (i18 < arrayList9.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList9.get(i18);
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.set != null && (((i24 != 5 && i24 != 7) || MessageObject.isTextColorSet(tL_messages_stickerSet3)) && ((i24 != 10 && i24 != 9) || tL_messages_stickerSet3.set.channel_emoji_status))) {
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet3.set;
                        if (stickerSet2.emojis || this.Q) {
                            if (!this.B0.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray7 = sparseIntArray2;
                                sparseIntArray7.put(this.u0, arrayList16.size());
                                sparseIntArray6 = sparseIntArray;
                                sparseIntArray6.put(arrayList16.size(), this.u0);
                                this.u0++;
                                arrayList11.add(Long.valueOf((tL_messages_stickerSet3.set.id * 13) + 9211));
                                org.telegram.ui.Components.fy fyVar3 = new org.telegram.ui.Components.fy();
                                fyVar3.f = true;
                                fyVar3.g = false;
                                fyVar3.h = true;
                                if (i24 == 4) {
                                    fyVar3.e = false;
                                } else {
                                    fyVar3.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                fyVar3.b = tL_messages_stickerSet3.set;
                                fyVar3.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList16.size();
                                arrayList16.add(fyVar3);
                                this.u0 = fyVar3.c.size() + this.u0;
                                for (int i54 = 0; i54 < fyVar3.c.size(); i54++) {
                                    arrayList11.add(Long.valueOf((((TLRPC.Document) fyVar3.c.get(i54)).id * 13) + 3212));
                                }
                                i18++;
                                sparseIntArray2 = sparseIntArray7;
                                sparseIntArray = sparseIntArray6;
                            }
                        }
                    }
                    sparseIntArray6 = sparseIntArray;
                    sparseIntArray7 = sparseIntArray2;
                    i18++;
                    sparseIntArray2 = sparseIntArray7;
                    sparseIntArray = sparseIntArray6;
                }
            }
            SparseIntArray sparseIntArray13 = sparseIntArray;
            SparseIntArray sparseIntArray14 = sparseIntArray2;
            if (!this.Q && i24 != 8 && i24 != 13 && i24 != 14) {
                i16 = 0;
                while (i16 < arrayList20.size()) {
                    ArrayList arrayList27 = arrayList20;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList27.get(i16);
                    TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                    int i55 = 0;
                    while (true) {
                        if (i55 < arrayList16.size()) {
                            arrayList5 = arrayList16;
                            if (((org.telegram.ui.Components.fy) arrayList16.get(i55)).b.id == stickerSet3.id) {
                                arrayList20 = arrayList27;
                                sparseIntArray4 = sparseIntArray14;
                                sparseIntArray3 = sparseIntArray13;
                                sparseIntArray5 = sparseIntArray12;
                                mediaDataController = mediaDataController3;
                                break;
                            }
                            i55++;
                            arrayList16 = arrayList5;
                        } else {
                            arrayList5 = arrayList16;
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                mediaDataController = mediaDataController3;
                                TLRPC.TL_messages_stickerSet stickerSet4 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                if (stickerSet4 != null) {
                                    ArrayList<TLRPC.Document> arrayList28 = stickerSet4.documents;
                                    z14 = MessageObject.isPremiumEmojiPack(stickerSet4);
                                    arrayList6 = arrayList28;
                                    inputStickerSet = null;
                                    if (arrayList6 != null && ((!(i24 == 5 || i24 == 7) || (!arrayList6.isEmpty() && MessageObject.isTextColorEmoji(arrayList6.get(0)))) && (!(i24 == 10 || i24 == 9) || stickerSet3.channel_emoji_status))) {
                                        arrayList20 = arrayList27;
                                        sparseIntArray14.put(this.u0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.u0);
                                        this.u0++;
                                        SparseIntArray sparseIntArray15 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        fyVar = new org.telegram.ui.Components.fy();
                                        fyVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray15;
                                        fyVar.f = this.B0.contains(Long.valueOf(stickerSet3.id));
                                        fyVar.g = true;
                                        if (i24 != 4) {
                                            fyVar.e = false;
                                        } else {
                                            fyVar.e = !z14;
                                        }
                                        fyVar.b = stickerSet3;
                                        fyVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        fyVar.h = this.A0.contains(Long.valueOf(fyVar.b.id));
                                        if (fyVar.c.size() > 24 || fyVar.h) {
                                            this.u0 = fyVar.c.size() + this.u0;
                                            for (i17 = 0; i17 < fyVar.c.size(); i17++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) fyVar.c.get(i17)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.u0 += 24;
                                            for (int i56 = 0; i56 < 23; i56++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) fyVar.c.get(i56)).id * 13) + 3212));
                                            }
                                            arrayList11.add(Long.valueOf(((fyVar.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray10.put(this.u0 - 1, arrayList5.size());
                                        }
                                        if (!fyVar.f || i24 == 4) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 5) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 7) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 != 6) {
                                            sparseIntArray5 = sparseIntArray12;
                                            sparseIntArray5.put(this.u0, arrayList5.size());
                                            this.u0++;
                                            arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                            arrayList5.add(fyVar);
                                        } else {
                                            sparseIntArray5 = sparseIntArray12;
                                        }
                                        arrayList5.add(fyVar);
                                    } else {
                                        arrayList20 = arrayList27;
                                        sparseIntArray4 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        sparseIntArray5 = sparseIntArray12;
                                    }
                                } else {
                                    inputStickerSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                    arrayList6 = new ArrayList<>();
                                    z14 = true;
                                    if (arrayList6 != null) {
                                        arrayList20 = arrayList27;
                                        sparseIntArray14.put(this.u0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.u0);
                                        this.u0++;
                                        SparseIntArray sparseIntArray152 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        fyVar = new org.telegram.ui.Components.fy();
                                        fyVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray152;
                                        fyVar.f = this.B0.contains(Long.valueOf(stickerSet3.id));
                                        fyVar.g = true;
                                        if (i24 != 4) {
                                        }
                                        fyVar.b = stickerSet3;
                                        fyVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        fyVar.h = this.A0.contains(Long.valueOf(fyVar.b.id));
                                        if (fyVar.c.size() > 24) {
                                        }
                                        this.u0 = fyVar.c.size() + this.u0;
                                        while (i17 < fyVar.c.size()) {
                                        }
                                        if (fyVar.f) {
                                        }
                                        sparseIntArray5 = sparseIntArray12;
                                        arrayList5.add(fyVar);
                                    }
                                    arrayList20 = arrayList27;
                                    sparseIntArray4 = sparseIntArray14;
                                    sparseIntArray3 = sparseIntArray13;
                                    sparseIntArray5 = sparseIntArray12;
                                }
                            } else {
                                mediaDataController = mediaDataController3;
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    z14 = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                    inputStickerSet = null;
                                    if (arrayList6 != null) {
                                    }
                                    arrayList20 = arrayList27;
                                    sparseIntArray4 = sparseIntArray14;
                                    sparseIntArray3 = sparseIntArray13;
                                    sparseIntArray5 = sparseIntArray12;
                                } else {
                                    inputStickerSet = null;
                                    arrayList6 = null;
                                    z14 = false;
                                    if (arrayList6 != null) {
                                    }
                                    arrayList20 = arrayList27;
                                    sparseIntArray4 = sparseIntArray14;
                                    sparseIntArray3 = sparseIntArray13;
                                    sparseIntArray5 = sparseIntArray12;
                                }
                            }
                        }
                    }
                    i16++;
                    sparseIntArray14 = sparseIntArray4;
                    sparseIntArray12 = sparseIntArray5;
                    arrayList16 = arrayList5;
                    mediaDataController3 = mediaDataController;
                    sparseIntArray13 = sparseIntArray3;
                }
            }
            arrayList4 = arrayList16;
            if (i24 != 14 && i24 != 8 && i24 != 13) {
                this.d0.p(arrayList4);
            }
            y41Var = this.h0;
            if (z17) {
                y41Var.setItemAnimator(null);
            } else {
                y41Var.setItemAnimator(this.e1);
            }
            if (z12) {
                i15 = 0;
                this.p0.l();
            } else {
                i15 = 0;
                s4.o.c(new hg.g(this, arrayList12, 3), false).c(this.p0);
            }
            if (y41Var.J1) {
                y41Var.u0(i15);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray8;
        this.a = -1;
        z13 = this.N0;
        if (i24 != 5) {
        }
        arrayList = arrayList18;
        i10 = z13 ? 1 : 0;
        if (i10 != 0) {
        }
        tL_emojiList = MediaDataController.getInstance(i23).replyIconsDefault;
        if (tL_emojiList != null) {
            i11 = 0;
            while (i11 < tL_emojiList.document_id.size()) {
            }
            while (i12 < arrayList13.size()) {
            }
        }
        if (this.O0) {
            int i352 = this.u0;
            this.u0 = i352 + 1;
            this.v = i352;
            arrayList11.add(6L);
        }
        if (i24 != 9) {
        }
        hashSet = new HashSet();
        hashSet.addAll(tL_emojiList2.document_id);
        if (this.R0 == null) {
        }
        arrayList19.clear();
        if (i24 != 0) {
        }
        j10 = 13334;
        ai.y9 G2 = ai.ha.y(i23, false).G(getDialogId(), true);
        G2.a();
        arrayList3 = new ArrayList();
        ArrayList arrayList262 = G2.l;
        size = arrayList262.size();
        i13 = 0;
        while (i13 < size) {
        }
        if (arrayList3.isEmpty()) {
        }
        i14 = 13;
        if (i24 == i14) {
        }
        if (i24 != 8) {
            i18 = 0;
            while (i18 < arrayList9.size()) {
            }
        }
        SparseIntArray sparseIntArray132 = sparseIntArray;
        SparseIntArray sparseIntArray142 = sparseIntArray2;
        if (!this.Q) {
            i16 = 0;
            while (i16 < arrayList20.size()) {
            }
        }
        arrayList4 = arrayList16;
        if (i24 != 14) {
            this.d0.p(arrayList4);
        }
        y41Var = this.h0;
        if (z17) {
        }
        if (z12) {
        }
        if (y41Var.J1) {
        }
    }

    public final void C() {
        s41 s41Var = this.f0;
        if (s41Var == null) {
            return;
        }
        if (this.z1) {
            s41Var.clearAnimation();
            s41Var.setVisibility(0);
            s41Var.animate().translationY(0.0f).start();
            return;
        }
        y41 y41Var = this.h0;
        if (y41Var.getChildCount() <= 0) {
            s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = y41Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            s41Var.setVisibility(0);
            s41Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f7) {
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.bs.g.getInterpolation(w7.r.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.un unVar = this.n0;
        if (unVar != null) {
            float a10 = w7.r.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            unVar.setAlpha(a10);
            unVar.setScaleX(a10);
            unVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.r.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.r.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.r.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.r.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        float interpolation2 = bsVar.getInterpolation(a11);
        float interpolation3 = bsVar.getInterpolation(a12);
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
        v41 v41Var = this.a0;
        v41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (unVar != null) {
            unVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.a1 = (interpolation2 * 0.85f) + 0.15f;
        this.b1 = (interpolation3 * 0.925f) + 0.075f;
        v41Var.invalidateOutline();
        if (unVar != null) {
            unVar.setAlpha(a14);
        }
        t41 t41Var = this.e0;
        t41Var.setAlpha(a14);
        t41Var.setScaleX(Math.min(this.a1, 1.0f));
        float pivotX = t41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(v41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(v41Var.getHeight(), 2.0d) + Math.pow(v41Var.getWidth() - pivotX, 2.0d)));
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
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.play_billing.k3.t(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            y41 y41Var = this.h0;
            if (i10 >= y41Var.getChildCount()) {
                this.k0.invalidate();
                y41Var.invalidate();
                return;
            }
            View childAt2 = y41Var.getChildAt(i10);
            if (childAt2 instanceof k51) {
                k51 k51Var = (k51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.play_billing.k3.t(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                k51Var.setAnimatedScale(cascade2);
            }
            i10++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.stickersDidLoad;
        d41 d41Var = this.T1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(d41Var);
                AndroidUtilities.runOnUIThread(d41Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(d41Var);
            AndroidUtilities.runOnUIThread(d41Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(d41Var);
            AndroidUtilities.runOnUIThread(d41Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(d41Var);
            AndroidUtilities.runOnUIThread(d41Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(d41Var);
                AndroidUtilities.runOnUIThread(d41Var);
                return;
            }
            return;
        }
        ci.e eVar = new ci.e(5);
        y41 y41Var = this.h0;
        AndroidUtilities.forEachViews((RecyclerView) y41Var, (Utilities.Callback<View>) eVar);
        if (y41Var != null) {
            y41Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.p5 p5Var = this.o1;
        if (p5Var != null && (num = this.Y0) != null) {
            Rect bounds = p5Var.getBounds();
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
            this.o1.v = (int) (Math.pow(this.a0.getAlpha(), 0.25d) * alpha * this.m1);
            if (this.p1 == null) {
                this.p1 = new Rect();
            }
            float f7 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f7;
            float y3 = com.google.android.gms.internal.play_billing.k3.y(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.d1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + y3 + (!n10 ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.p1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.p5 p5Var2 = this.o1;
            Rect rect = this.p1;
            int i11 = rect.left;
            Rect rect2 = this.p1;
            p5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.p1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.o1.draw(canvas);
            org.telegram.ui.Components.p5 p5Var3 = this.o1;
            p5Var3.v = alpha;
            p5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        k51 k51Var = this.s1;
        if (k51Var == null || this.t1 == null || k51Var.E == null) {
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

    public ai.ee getCollectionParticles() {
        if (this.R1 == null) {
            this.R1 = new ai.ee(1, 8);
        }
        return this.R1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.V).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.G1 ? this.i0 : this.h0).canScrollVertically(1);
        if (canScrollVertically != this.w1) {
            this.w1 = canScrollVertically;
            org.telegram.messenger.sl.s(this.o0.animate(), canScrollVertically ? 1.0f : 0.0f, 200L);
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
                org.telegram.ui.Components.fy fyVar = (org.telegram.ui.Components.fy) arrayList.get(i15);
                if (fyVar.h) {
                    return;
                }
                boolean z12 = i15 + 1 == arrayList.size();
                i13 = this.x0.get(i15);
                this.A0.add(Long.valueOf(fyVar.b.id));
                i11 = 24;
                i12 = fyVar.h ? fyVar.c.size() : Math.min(24, fyVar.c.size());
                num = fyVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                fyVar.h = true;
                i14 = fyVar.c.size();
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
                    post(new org.telegram.ui.Components.zx(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i15 != -1 || (z10 = this.C0)) {
            return;
        }
        int i16 = (this.a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
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
        String s10 = a1.g.s(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(s10, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(s10, i11 + 1).apply();
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
    public final void o(View view, org.telegram.ui.Components.a6 a6Var) {
        l();
        if (a6Var != null) {
            int i10 = 9;
            int i11 = this.W;
            if (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = a6Var.getDocumentId();
            TLRPC.Document document = a6Var.document;
            int i12 = this.V;
            if (document == null) {
                document = org.telegram.ui.Components.r5.f(i12, a6Var.documentId);
            }
            if (!(view instanceof k51)) {
                p(view, Long.valueOf(a6Var.documentId), document, null, null);
                return;
            }
            final k51 k51Var = (k51) view;
            if (k51Var.v == null && (i11 == 0 || i11 == 12 || i11 == 9 || i11 == 10)) {
                MediaDataController.getInstance(i12).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10 && i11 != 2) {
                p(view, Long.valueOf(a6Var.documentId), document, k51Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(k51Var.v)) {
                p(view, Long.valueOf(a6Var.documentId), document2, k51Var.v, null);
                return;
            }
            final k01 k01Var = new k01(this, view, a6Var, document2, k51Var, 1);
            if (this.v1 != null || this.o1 == null) {
                k01Var.run();
                return;
            }
            k51Var.b = true;
            final Rect rect = new Rect();
            v41 v41Var = this.a0;
            int left = v41Var.getLeft();
            y41 y41Var = this.h0;
            rect.set(k51Var.getLeft() + y41Var.getLeft() + left, k51Var.getTop() + y41Var.getTop() + v41Var.getTop(), k51Var.getRight() + y41Var.getLeft() + v41Var.getLeft(), k51Var.getBottom() + y41Var.getTop() + v41Var.getTop());
            Drawable drawable = k51Var.E;
            final org.telegram.ui.Components.r5 n10 = drawable instanceof org.telegram.ui.Components.r5 ? org.telegram.ui.Components.r5.n(i12, ((org.telegram.ui.Components.r5) drawable).i(), null, 7) : null;
            this.s1 = k51Var;
            Rect rect2 = new Rect();
            this.t1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.f41
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.p5 p5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    float x10 = org.telegram.ui.Cells.b1.x(floatValue, floatValue, floatValue, 1.0f);
                    b61 b61Var = b61.this;
                    b61Var.m1 = x10;
                    b61Var.r1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, b61Var.p1, floatValue, b61Var.t1);
                    float scaleX = k51Var.getScaleX() * Math.max(1.0f, b61Var.u1.getInterpolation(w7.r.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    b61Var.t1.set((int) org.telegram.messenger.sl.x(b61Var.t1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.sl.x(b61Var.t1.height(), 2.0f, scaleX, b61Var.t1.centerY()), (int) a1.g.d(b61Var.t1.width(), 2.0f, scaleX, b61Var.t1.centerX()), (int) a1.g.d(b61Var.t1.height(), 2.0f, scaleX, b61Var.t1.centerY()));
                    b61Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        k01Var.run();
                        if (n10 == null || (p5Var = b61Var.o1) == null) {
                            return;
                        }
                        p5Var.f();
                    }
                }
            });
            this.v1.addListener(new ci.o3(this, zArr, k01Var, i10));
            this.v1.setInterpolator(org.telegram.ui.Components.bs.h);
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
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.p5 p5Var = this.o1;
        if (p5Var != null) {
            p5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.I = false;
        int i10 = this.V;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.W;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.p5 p5Var = this.o1;
        if (p5Var != null) {
            p5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.W == 6) {
            this.r0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.Q0;
        int i12 = this.W;
        if (z10 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), TLObject.FLAG_31));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(r51 r51Var) {
        Integer num = this.Z1;
        if (num != null) {
        }
        this.U1 = r51Var;
        boolean z10 = this.Q0;
        int i10 = 0;
        y41 y41Var = this.h0;
        if (!z10) {
            h();
            while (i10 < y41Var.getChildCount()) {
                View childAt = y41Var.getChildAt(i10);
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
        ofFloat.addUpdateListener(new c41(this, i10));
        this.V1.addListener(new v70(this, 26));
        d41 d41Var = new d41(this, i10);
        ah.x0.f = true;
        ah.x0.e = true;
        ah.x0.g = false;
        if (ah.x0.d) {
            ah.x0.d = false;
        }
        ah.x0.c = d41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.X1.lock();
        this.V1.setDuration(800L);
        y41Var.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.e0.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        org.telegram.ui.Components.un unVar = this.n0;
        if (unVar != null) {
            unVar.setLayerType(2, null);
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

    public void setBackgroundDelegate(b51 b51Var) {
        this.U = b51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.a0.setClipToOutline(z10);
        ei.g6 g6Var = this.b0;
        if (z10) {
            g6Var.setVisibility(0);
        } else {
            g6Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.h0, (Utilities.Callback<View>) new ci.e(21));
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
        k51 k51Var = this.O;
        if (k51Var != null) {
            k51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.h1 = z10;
    }

    public void setOnLongPressedListener(z51 z51Var) {
        this.H = z51Var;
    }

    public void setRecentReactions(List<ah.i1> list) {
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
        y41 y41Var = this.h0;
        if (y41Var != null) {
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    org.telegram.ui.Components.a6 a6Var = k51Var.e;
                    if (a6Var != null) {
                        k51Var.d(hashSet.contains(Long.valueOf(a6Var.getDocumentId())), true);
                    } else {
                        k51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            y41Var.invalidate();
        }
    }

    public void setSelectedReaction(ah.i1 i1Var) {
        this.J.clear();
        this.J.add(i1Var);
        y41 y41Var = this.h0;
        if (y41Var != null) {
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    k51Var.d(this.J.contains(k51Var.x), true);
                }
            }
            y41Var.invalidate();
        }
        o41 o41Var = this.i0;
        if (o41Var != null) {
            for (int i11 = 0; i11 < o41Var.getChildCount(); i11++) {
                if (o41Var.getChildAt(i11) instanceof k51) {
                    k51 k51Var2 = (k51) o41Var.getChildAt(i11);
                    k51Var2.d(this.J.contains(k51Var2.x), true);
                }
            }
            o41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ah.i1> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ah.i1) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((ah.i1) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        try {
            if (this.l1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, this.Z0)) != this.f1) {
                this.f1 = w02;
                this.M.setColor(i0.a.o(w02, 30));
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f1, PorterDuff.Mode.SRC_IN);
                this.k1 = porterDuffColorFilter;
                org.telegram.ui.Components.r5 r5Var = this.W0;
                if (r5Var != null) {
                    r5Var.setColorFilter(porterDuffColorFilter);
                }
                y41 y41Var = this.h0;
                if (y41Var != null) {
                    y41Var.invalidate();
                }
                o41 o41Var = this.i0;
                if (o41Var != null) {
                    o41Var.invalidate();
                }
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(String str, boolean z10, boolean z11) {
        d41 d41Var = this.J1;
        if (d41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(d41Var);
            this.J1 = null;
        }
        ci.i6 i6Var = this.K1;
        if (i6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i6Var);
            this.K1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        l51 l51Var = this.q0;
        s41 s41Var = this.f0;
        if (isEmpty) {
            this.y1 = false;
            this.z1 = false;
            z(false, z10);
            if (s41Var != null) {
                s41Var.d(true);
                q51.a(s41Var, false);
            }
            l51Var.E(true);
            this.A1 = null;
        } else {
            boolean z12 = this.y1;
            boolean z13 = !z12;
            this.y1 = true;
            this.z1 = false;
            if (s41Var != null) {
                s41Var.f.b(2);
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
                l51Var.E(false);
            } else if (!str.equals(this.A1)) {
                d41 d41Var2 = new d41(this, 1);
                this.J1 = d41Var2;
                AndroidUtilities.runOnUIThread(d41Var2, 120L);
            }
            this.A1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, b2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            b2 = currentKeyboardLanguage;
            ci.i6 i6Var2 = new ci.i6(this, str, z10, z13, currentKeyboardLanguage, 4);
            this.K1 = i6Var2;
            AndroidUtilities.runOnUIThread(i6Var2, z11 ? 425L : 0L);
            if (s41Var != null) {
                s41Var.f.b(2);
                q51.a(s41Var, z10);
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
        ofFloat.addUpdateListener(new c41(this, 2));
        this.i1.setDuration(200L);
        this.i1.setInterpolator(org.telegram.ui.Components.bs.f);
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
        y41 y41Var = this.h0;
        if (y41Var != null) {
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    org.telegram.ui.Components.a6 a6Var = k51Var.e;
                    if (a6Var == null || a6Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            k51Var.e(z11, z10);
                        }
                    } else {
                        k51Var.e(z11, z10);
                    }
                }
            }
            y41Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.p5 p5Var, View view) {
        Integer num;
        this.n1 = (p5Var == null || (num = p5Var.F) == null) ? 0 : num.intValue();
        this.o1 = p5Var;
        this.q1 = view;
        if (this.I && p5Var != null) {
            p5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.G1 == z10) {
            return;
        }
        this.G1 = z10;
        y41 y41Var = this.h0;
        int i10 = 0;
        y41Var.setVisibility(0);
        o41 o41Var = this.i0;
        o41Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new g41(this, z10, i10));
        this.F1.addListener(new u41(this, z10, i10));
        this.F1.setDuration(320L);
        this.F1.setInterpolator(org.telegram.ui.Components.bs.h);
        this.F1.start();
        org.telegram.messenger.sl.t(((View) y41Var.getParent()).animate().translationY((this.G1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new c41(this, 1)), org.telegram.ui.Components.bs.f, 160L);
        if (this.G1 && z11) {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        this(o2Var, context, z10, num, i10, z11, g6Var, i11, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, g6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:119:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x043e A[EDGE_INSN: B:165:0x043e->B:166:0x043e BREAK  A[LOOP:0: B:117:0x0398->B:149:0x0429], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, int i11, int i12) {
        super(context);
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        float f7;
        o41 o41Var;
        n41 n41Var;
        int i20;
        int i21;
        int i22;
        boolean z15;
        int i23;
        boolean z16;
        int i24;
        org.telegram.ui.Components.gw gwVar;
        int i25 = i10;
        int i26 = i12;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = UserConfig.selectedAccount;
        this.c0 = new org.telegram.ui.Components.kw[2];
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
        this.V0 = new ImageReceiver();
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
        this.S1 = new d41(this, 3);
        this.T1 = new d41(this, 4);
        this.X1 = new AnimationNotificationsLocker();
        this.Y1 = new Paint();
        this.Z0 = g6Var;
        this.W = i25;
        this.N0 = z10;
        this.c1 = o2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        int i27 = 12;
        sb2.append((i25 == 0 || i25 == 12 || i25 == 9 || i25 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.f1 = i26;
        this.l1 = i26 == org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, g6Var);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, g6Var));
        paint2.setColor(i0.a.o(i26, 30));
        this.k1 = new PorterDuffColorFilter(i26, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(w7.r.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z17 = valueOf != null && valueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i25 == 0 || i25 == 12 || i25 == 9 || i25 == 10 || i25 == 2 || i25 == 5 || i25 == 7) {
            this.d1 = i11;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.G8, g6Var, PorterDuff.Mode.MULTIPLY);
            view.setBackground(mutate);
            addView(view, w7.z5.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z17 ? -12 : 4), n() ? 0 : this.d1, 0.0f, n() ? this.d1 : 0));
        }
        ei.g6 g6Var2 = new ei.g6(this, context, g6Var, 13);
        this.b0 = g6Var2;
        if (i25 == 3 || i25 == 4) {
            z12 = 4;
            z13 = true;
        } else {
            z12 = 4;
            z13 = false;
        }
        Integer num2 = valueOf;
        v41 v41Var = new v41(this, context, z13, z13, g6Var, num2);
        Integer num3 = num2;
        org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
        this.a0 = v41Var;
        if (!z13) {
            v41Var.setOutlineProvider(new w41(this, num3));
            v41Var.setClipToOutline(true);
            if (z13) {
                v41Var.setElevation(2.0f);
            }
        }
        if (i25 == 0 || i25 == 12 || i25 == 9 || i25 == 10 || i25 == 2 || i25 == 5 || i25 == 15) {
            i13 = 5;
            v41Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        } else {
            i13 = 5;
        }
        v41Var.addView(g6Var2, w7.z5.c(-1.0f, -1));
        addView(v41Var, w7.z5.d(-1, -1.0f, 119, 0.0f, (i25 == 0 || i25 == 12 || i25 == 9 || i25 == 2 || i25 == 7) ? this.d1 + 6 : 0.0f, 0.0f, n() ? this.d1 + 6 : 0.0f));
        if (num3 != null) {
            org.telegram.ui.Components.un unVar = new org.telegram.ui.Components.un(context, 24);
            this.n0 = unVar;
            i14 = 14;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            org.telegram.ui.ActionBar.r6.z(this, drawable, org.telegram.ui.ActionBar.k6.G8, g6Var3, PorterDuff.Mode.MULTIPLY);
            unVar.setBackground(drawable);
            addView(unVar, w7.z5.d(17, 9.0f, (n() ? 80 : 48) | 3, (num3.intValue() / AndroidUtilities.density) + (z17 ? -25 : 10), n() ? 0.0f : this.d1 + 5, 0.0f, n() ? this.d1 + 14 : 0.0f));
        } else {
            i14 = 14;
        }
        if (o2Var == null || i25 == 3 || i25 == 6 || i25 == i13) {
            i15 = 4;
        } else {
            i15 = 4;
            if (i25 != 7 && i25 != 4 && i25 != 9 && i25 != 10 && z11) {
                z14 = true;
                i16 = 0;
                while (true) {
                    if (i16 < 2) {
                        break;
                    }
                    Integer num4 = num3;
                    int i28 = i15;
                    boolean z18 = i25 != i15;
                    if (i25 != 0 && i25 != i27 && i25 != 9) {
                        if (i25 != 10) {
                            i23 = i16;
                            z16 = false;
                            org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
                            i24 = i25;
                            x41 x41Var = new x41(this, context, g6Var4, z18, z16, i24, !z14 ? new mv0(29, this, o2Var) : null, i26, i10);
                            gwVar = x41Var.y;
                            if (gwVar != null) {
                                gwVar.setOnLongClickListener(new t(this, 7));
                            }
                            x41Var.U = false;
                            if (i24 != i28) {
                                x41Var.setAnimatedEmojiCacheType(13);
                            } else {
                                x41Var.setAnimatedEmojiCacheType((i24 == 0 || i24 == 12 || i24 == 2) ? 6 : 5);
                            }
                            x41Var.O = num4 != null;
                            x41Var.setPaddingLeft(i24 == 6 ? 10.0f : 5.0f);
                            if (i24 == 14 && i24 != 8 && i24 != 13) {
                                this.a0.addView(x41Var, w7.z5.c(36.0f, -1));
                            }
                            this.c0[i23] = x41Var;
                            i16 = i23 + 1;
                            i25 = i24;
                            i14 = 14;
                            i15 = i28;
                            num3 = num4;
                            i27 = 12;
                            i26 = i12;
                            g6Var3 = g6Var4;
                        }
                    }
                    i23 = i16;
                    z16 = true;
                    org.telegram.ui.ActionBar.g6 g6Var42 = g6Var3;
                    i24 = i25;
                    x41 x41Var2 = new x41(this, context, g6Var42, z18, z16, i24, !z14 ? new mv0(29, this, o2Var) : null, i26, i10);
                    gwVar = x41Var2.y;
                    if (gwVar != null) {
                    }
                    x41Var2.U = false;
                    if (i24 != i28) {
                    }
                    x41Var2.O = num4 != null;
                    x41Var2.setPaddingLeft(i24 == 6 ? 10.0f : 5.0f);
                    if (i24 == 14) {
                    }
                    this.c0[i23] = x41Var2;
                    i16 = i23 + 1;
                    i25 = i24;
                    i14 = 14;
                    i15 = i28;
                    num3 = num4;
                    i27 = 12;
                    i26 = i12;
                    g6Var3 = g6Var42;
                }
                Integer num5 = num3;
                i17 = i15;
                org.telegram.ui.ActionBar.g6 g6Var5 = g6Var3;
                i18 = i25;
                i19 = i14;
                org.telegram.ui.Components.kw[] kwVarArr = this.c0;
                this.d0 = kwVarArr[0];
                kwVarArr[1].setVisibility(8);
                t41 t41Var = new t41(context, num5, 1);
                this.e0 = t41Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, t41Var, g6Var5);
                if (i18 != i19 || i18 == 8 || i18 == 13) {
                    f7 = 1.0f;
                } else {
                    f7 = 1.0f;
                    this.a0.addView(t41Var, w7.z5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(t41Var, true, f7, false);
                y41 y41Var = new y41(this, context, i18);
                this.h0 = y41Var;
                z41 z41Var = new z41();
                this.e1 = z41Var;
                z41Var.c = 220L;
                z41Var.e = 260L;
                z41Var.f = 160L;
                z41Var.g = 160L;
                z41Var.m = false;
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
                z41Var.i = bsVar;
                z41Var.C = false;
                y41Var.setItemAnimator(z41Var);
                float f10 = f7;
                y41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                a51 a51Var = new a51(this);
                this.p0 = a51Var;
                y41Var.setAdapter(a51Var);
                p41 p41Var = new p41(this, 1);
                this.r0 = p41Var;
                y41Var.setLayoutManager(p41Var);
                p41Var.O = new m41(this, 0);
                n41 n41Var2 = new n41(context, 0);
                this.g0 = n41Var2;
                ah.v vVar = new ah.v(this, context);
                this.k0 = vVar;
                vVar.addView(y41Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                n41Var2.addView(vVar, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                o41Var = new o41(this, context);
                this.i0 = o41Var;
                if (o41Var.getItemAnimator() == null) {
                    n41Var = n41Var2;
                    o41Var.getItemAnimator().n(180L);
                    o41Var.getItemAnimator().i = bsVar;
                } else {
                    n41Var = n41Var2;
                }
                TextView textView = new TextView(context);
                if (i18 != i17) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                } else {
                    if (i18 != 0 && i18 != 13 && i18 != 12 && i18 != 11 && i18 != 9) {
                        if (i18 != 10) {
                            if (i18 == 1 || i18 == 2) {
                                textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                            } else if (i18 == 14) {
                                textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                            } else {
                                textView.setText(LocaleController.getString(R.string.NoIconsFound));
                            }
                        }
                    }
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                }
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Le, g6Var5);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                this.l0 = w9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.j0 = frameLayout;
                frameLayout.addView(w9Var, w7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                n41 n41Var3 = n41Var;
                n41Var3.addView(frameLayout, w7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                l51 l51Var = new l51(this);
                this.q0 = l51Var;
                o41Var.setAdapter(l51Var);
                p41 p41Var2 = new p41(this, 0);
                o41Var.setLayoutManager(p41Var2);
                p41Var2.O = new m41(this, 1);
                o41Var.setVisibility(8);
                n41Var3.addView(o41Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.a0.addView(n41Var3, w7.z5.d(-1, -1.0f, 48, 0.0f, (i18 != 8 || i18 == 13 || i18 == 14) ? 0.0f : (f10 / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.pl0 pl0Var = new org.telegram.ui.Components.pl0(y41Var, p41Var);
                this.s0 = pl0Var;
                pl0Var.i = new ei.k1(this, 1);
                pl0Var.h = new e41(this);
                r41 r41Var = new r41(this, i18, context, g6Var5, num);
                y41Var.r1(r41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                o41Var.r1(r41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.rn0 rn0Var = new org.telegram.ui.Components.rn0(this, i18, 2);
                y41Var.setOnItemClickListener(rn0Var);
                o41Var.setOnItemClickListener(rn0Var);
                s41 s41Var = new s41(this, context, z11);
                this.f0 = s41Var;
                s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                s41Var.setVisibility(4);
                n41Var3.addView(s41Var, w7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                t41 t41Var2 = new t41(context, num5, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i29 = org.telegram.ui.ActionBar.k6.G8;
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.8f, i29);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                org.telegram.ui.ActionBar.r6.l(t41Var2, drawable2, M.a, -1, 2, M.d, g6Var, mode);
                t41Var2.setBackground(drawable2);
                t41Var2.setAlpha(0.0f);
                this.a0.addView(t41Var2, w7.z5.d(-1, 20.0f, 55, 0.0f, (f10 / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.o0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                org.telegram.ui.ActionBar.r6.z(this, drawable3, i29, g6Var, mode);
                if (i18 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.a0.addView(view2, w7.z5.e(-1, 20, 87));
                View view3 = new View(context);
                this.t0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.a0.addView(view3, w7.z5.c(-1.0f, -1));
                i20 = this.V;
                if (MediaDataController.getInstance(i20) == null) {
                    MediaDataController.getInstance(i20).checkStickers(5);
                    if (i18 == 14) {
                        MessagesController.getInstance(this.V).getAvailableEffects();
                        i21 = 3;
                    } else if (i18 == 1 || i18 == 11 || i18 == 2 || i18 == 6 || i18 == 13) {
                        i21 = 3;
                        MediaDataController.getInstance(i20).checkReactions();
                    } else if (i18 == 9 || i18 == 10) {
                        i21 = 3;
                        if (MessagesController.getInstance(i20).getMainSettings().getBoolean("resetemojipacks", true)) {
                            MediaDataController.getInstance(i20).loadStickers(5, false, false);
                            MessagesController.getInstance(i20).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
                        }
                        MediaDataController.getInstance(i20).fetchEmojiStatuses(2, false);
                        MediaDataController.getInstance(i20).loadRestrictedStatusEmojis();
                        MediaDataController.getInstance(i20).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                    } else if (i18 == 0 || i18 == 12) {
                        i21 = 3;
                        MediaDataController.getInstance(i20).fetchEmojiStatuses(0, true);
                        MediaDataController.getInstance(i20).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                    } else {
                        i21 = 3;
                        if (i18 == 3) {
                            MediaDataController.getInstance(i20).checkDefaultTopicIcons();
                        } else if (i18 == 4) {
                            MediaDataController.getInstance(i20).loadRecents(0, false, true, false);
                            MediaDataController.getInstance(i20).checkStickers(0);
                        }
                    }
                    this.V0.setLayerNum(7);
                    i22 = this.W;
                    if (i22 != i21 || i22 == 4 || i22 == 6) {
                        z15 = true;
                    } else {
                        hf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z15 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z15 = true;
                        }
                        ah.x0.g = z15;
                    }
                    B(z15, false, z15);
                }
                i21 = 3;
                this.V0.setLayerNum(7);
                i22 = this.W;
                if (i22 != i21) {
                }
                z15 = true;
                B(z15, false, z15);
            }
        }
        z14 = false;
        i16 = 0;
        while (true) {
            if (i16 < 2) {
            }
            this.c0[i23] = x41Var2;
            i16 = i23 + 1;
            i25 = i24;
            i14 = 14;
            i15 = i28;
            num3 = num4;
            i27 = 12;
            i26 = i12;
            g6Var3 = g6Var42;
        }
        Integer num52 = num3;
        i17 = i15;
        org.telegram.ui.ActionBar.g6 g6Var52 = g6Var3;
        i18 = i25;
        i19 = i14;
        org.telegram.ui.Components.kw[] kwVarArr2 = this.c0;
        this.d0 = kwVarArr2[0];
        kwVarArr2[1].setVisibility(8);
        t41 t41Var3 = new t41(context, num52, 1);
        this.e0 = t41Var3;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, t41Var3, g6Var52);
        if (i18 != i19) {
        }
        f7 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(t41Var3, true, f7, false);
        y41 y41Var2 = new y41(this, context, i18);
        this.h0 = y41Var2;
        z41 z41Var2 = new z41();
        this.e1 = z41Var2;
        z41Var2.c = 220L;
        z41Var2.e = 260L;
        z41Var2.f = 160L;
        z41Var2.g = 160L;
        z41Var2.m = false;
        org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.bs.h;
        z41Var2.i = bsVar2;
        z41Var2.C = false;
        y41Var2.setItemAnimator(z41Var2);
        float f102 = f7;
        y41Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        a51 a51Var2 = new a51(this);
        this.p0 = a51Var2;
        y41Var2.setAdapter(a51Var2);
        p41 p41Var3 = new p41(this, 1);
        this.r0 = p41Var3;
        y41Var2.setLayoutManager(p41Var3);
        p41Var3.O = new m41(this, 0);
        n41 n41Var22 = new n41(context, 0);
        this.g0 = n41Var22;
        ah.v vVar2 = new ah.v(this, context);
        this.k0 = vVar2;
        vVar2.addView(y41Var2, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        n41Var22.addView(vVar2, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        o41Var = new o41(this, context);
        this.i0 = o41Var;
        if (o41Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i18 != i17) {
        }
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Le, g6Var52);
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.l0 = w9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j0 = frameLayout2;
        frameLayout2.addView(w9Var2, w7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, w7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        n41 n41Var32 = n41Var;
        n41Var32.addView(frameLayout2, w7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        l51 l51Var2 = new l51(this);
        this.q0 = l51Var2;
        o41Var.setAdapter(l51Var2);
        p41 p41Var22 = new p41(this, 0);
        o41Var.setLayoutManager(p41Var22);
        p41Var22.O = new m41(this, 1);
        o41Var.setVisibility(8);
        n41Var32.addView(o41Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.addView(n41Var32, w7.z5.d(-1, -1.0f, 48, 0.0f, (i18 != 8 || i18 == 13 || i18 == 14) ? 0.0f : (f102 / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.pl0 pl0Var2 = new org.telegram.ui.Components.pl0(y41Var2, p41Var3);
        this.s0 = pl0Var2;
        pl0Var2.i = new ei.k1(this, 1);
        pl0Var2.h = new e41(this);
        r41 r41Var2 = new r41(this, i18, context, g6Var52, num);
        y41Var2.r1(r41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        o41Var.r1(r41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.rn0 rn0Var2 = new org.telegram.ui.Components.rn0(this, i18, 2);
        y41Var2.setOnItemClickListener(rn0Var2);
        o41Var.setOnItemClickListener(rn0Var2);
        s41 s41Var2 = new s41(this, context, z11);
        this.f0 = s41Var2;
        s41Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        s41Var2.setVisibility(4);
        n41Var32.addView(s41Var2, w7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        t41 t41Var22 = new t41(context, num52, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i292 = org.telegram.ui.ActionBar.k6.G8;
        org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.8f, i292);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.l(t41Var22, drawable22, M2.a, -1, 2, M2.d, g6Var, mode2);
        t41Var22.setBackground(drawable22);
        t41Var22.setAlpha(0.0f);
        this.a0.addView(t41Var22, w7.z5.d(-1, 20.0f, 55, 0.0f, (f102 / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.o0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        org.telegram.ui.ActionBar.r6.z(this, drawable32, i292, g6Var, mode2);
        if (i18 == 14) {
        }
        view22.setAlpha(0.0f);
        this.a0.addView(view22, w7.z5.e(-1, 20, 87));
        View view32 = new View(context);
        this.t0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.a0.addView(view32, w7.z5.c(-1.0f, -1));
        i20 = this.V;
        if (MediaDataController.getInstance(i20) == null) {
        }
        this.V0.setLayerNum(7);
        i22 = this.W;
        if (i22 != i21) {
        }
        z15 = true;
        B(z15, false, z15);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(ah.i1.b(str));
        }
        y41 y41Var = this.h0;
        if (y41Var != null) {
            for (int i11 = 0; i11 < y41Var.getChildCount(); i11++) {
                if (y41Var.getChildAt(i11) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i11);
                    k51Var.d(this.J.contains(k51Var.x), true);
                }
            }
            y41Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(a61 a61Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void r(k51 k51Var, ah.i1 i1Var) {
    }
}
