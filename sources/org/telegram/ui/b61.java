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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class b61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public f51 C;
    public final ArrayList C0;
    public boolean C1;
    public z51 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public f41 E1;
    public HashSet F;
    public ArrayList F0;
    public ih.u5 F1;
    public final HashSet G;
    public final ArrayList G0;
    public boolean G1;
    public final Paint H;
    public ArrayList H0;
    public boolean H1;
    public final Paint I;
    public final ArrayList I0;
    public View I1;
    public Drawable J;
    public final boolean J0;
    public int J1;
    public k51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public gh.bb M1;
    public boolean N;
    public List N0;
    public final f41 N1;
    public final ArrayList O;
    public k51 O0;
    public final f41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public b51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.k5 S0;
    public final AnimationNotificationsLocker S1;
    public final v41 T;
    public q41 T0;
    public final Paint T1;
    public final kh.h6 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.nv[] V;
    public final org.telegram.ui.ActionBar.b6 V0;
    public org.telegram.ui.Components.nv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.o2 Y0;
    public final int Z0;
    public int a;
    public final t41 a0;
    public final z41 a1;
    public int b;
    public final s41 b0;
    public final int b1;
    public int c;
    public final dh.g c0;
    public boolean c1;
    public int d;
    public final y41 d0;
    public boolean d1;
    public int e;
    public final o41 e0;
    public ValueAnimator e1;
    public int f;
    public final FrameLayout f0;
    public Drawable f1;
    public final fh.v g0;
    public final PorterDuffColorFilter g1;
    public int h;
    public final org.telegram.ui.Components.o9 h0;
    public float h1;
    public final View i0;
    public int i1;
    public final org.telegram.ui.Components.an j0;
    public org.telegram.ui.Components.i5 j1;
    public final View k0;
    public Rect k1;
    public final a51 l0;
    public View l1;
    public final l51 m0;
    public float m1;
    public int n;
    public final p41 n0;
    public k51 n1;
    public final c2.y o0;
    public Rect o1;
    public final View p0;
    public final OvershootInterpolator p1;
    public int q0;
    public ValueAnimator q1;
    public int r;
    public final ArrayList r0;
    public boolean r1;
    public int s;
    public final SparseIntArray s0;
    public boolean s1;
    public final SparseIntArray t0;
    public boolean t1;
    public final SparseIntArray u0;
    public boolean u1;
    public int v;
    public final SparseIntArray v0;
    public String v1;
    public int w;
    public final ArrayList w0;
    public ArrayList w1;
    public int x;
    public final ArrayList x0;
    public ArrayList x1;
    public int y;
    public boolean y0;
    public ArrayList y1;
    public final ArrayList z0;
    public ArrayList z1;
    public static final List V1 = Arrays.asList("😖", "😫", "\u1fae0", "😨", "❓");
    public static final boolean[] X1 = new boolean[4];
    public static final HashMap Y1 = new HashMap();

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(o2Var, context, z10, num, i9, true, b6Var, 16);
    }

    public static void D(int i9, org.telegram.ui.Components.o9 o9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (o9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i9).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            list = V1;
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
                    if (document2 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document2, null))) {
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
            ArrayList arrayList3 = new ArrayList(MediaDataController.getInstance(i9).getStickerSets(5));
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
                        if (document3 != null && list.contains(MessageObject.findAnimatedEmojiEmoticon(document3, null))) {
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.m6, 0.2f);
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
            o9Var.setLayerNum(7);
            o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            o9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(b61 b61Var, int i9, int i10) {
        c2.y yVar = b61Var.o0;
        p41 p41Var = b61Var.n0;
        View m10 = p41Var.m(i9);
        int L0 = p41Var.L0();
        if ((m10 == null && Math.abs(i9 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            yVar.b = p41Var.L0() < i9 ? 0 : 1;
            yVar.c(i9, i10, false, false);
        } else {
            kh.n1 n1Var = new kh.n1(b61Var, b61Var.d0.getContext(), 4);
            n1Var.a = i9;
            n1Var.p = i10;
            p41Var.w0(n1Var);
        }
    }

    public static boolean c(b61 b61Var) {
        if (b61Var.P) {
            return true;
        }
        ValueAnimator valueAnimator = b61Var.Q1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i9 = 13;
        int i10 = this.S;
        if (i10 != 5 && i10 != 7) {
            if (i10 == 6) {
                return org.telegram.ui.Components.k5.g();
            }
            if (i10 != 3 && i10 != 4) {
                i9 = 2;
                if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                    return 3;
                }
            }
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getPremiumStar() {
        if (this.f1 == null) {
            int i9 = this.S;
            if (i9 == 5 || i9 == 9 || i9 == 10 || i9 == 7) {
                this.f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            } else {
                this.f1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            }
            this.f1.setColorFilter(this.g1);
        }
        return this.f1;
    }

    public static ArrayList j(HashSet hashSet, ArrayList arrayList) {
        if (hashSet == null) {
            return arrayList;
        }
        int i9 = 0;
        while (i9 < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i9);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
        return arrayList;
    }

    public static TLRPC.Document k(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        long j10;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i9 = 0;
        while (true) {
            if (i9 >= tL_messages_stickerSet.packs.size()) {
                j10 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i9).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i9).emoticon), fixEmoji)) {
                j10 = tL_messages_stickerSet.packs.get(i9).documents.get(0).longValue();
                break;
            }
            i9++;
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
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.k5 k5Var) {
        org.telegram.ui.Components.k5 k5Var2;
        if (this.E && (k5Var2 = this.S0) != k5Var) {
            if (k5Var2 != null) {
                k5Var2.o(this);
            }
            this.S0 = k5Var;
            if (k5Var != null) {
                k5Var.setColorFilter(this.g1);
                this.S0.a(this);
            }
        }
    }

    public static void t(final int i9) {
        boolean[] zArr = X1;
        if (zArr[i9] || MediaDataController.getInstance(i9) == null) {
            return;
        }
        zArr[i9] = true;
        MediaDataController.getInstance(i9).checkStickers(5);
        MediaDataController.getInstance(i9).fetchEmojiStatuses(0, true);
        MediaDataController.getInstance(i9).checkReactions();
        MediaDataController.getInstance(i9).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
        MediaDataController.getInstance(i9).getDefaultEmojiStatuses();
        MediaDataController.getInstance(i9).checkDefaultTopicIcons();
        org.telegram.ui.Components.ew0.t3.fetch(i9, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.uv0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList<TLRPC.EmojiGroup> arrayList;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups == null || (arrayList = tL_messages_emojiGroups.groups) == null) {
                    return;
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                    i10++;
                    k5.h(i9).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        y41 y41Var = this.d0;
        if (y41Var != null) {
            int i9 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = k51Var.e;
                    if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.id == l10.longValue()) {
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
                ArrayList arrayList = this.r0;
                if (i9 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i9)).longValue();
                if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                    break;
                } else {
                    i9++;
                }
            }
            a51 a51Var = this.l0;
            if (a51Var != null) {
                a51Var.m(i9);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bb, code lost:
    
        if (r8 == 4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04fe A[LOOP:5: B:125:0x04f8->B:127:0x04fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a99 A[LOOP:13: B:263:0x0a91->B:265:0x0a99, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02fa A[LOOP:30: B:512:0x02f2->B:514:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x031f A[LOOP:31: B:517:0x0319->B:519:0x031f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0411 A[LOOP:2: B:81:0x040b->B:83:0x0411, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0456  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(boolean z10, boolean z11, boolean z12) {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z13;
        ArrayList arrayList;
        int i9;
        TLRPC.TL_emojiList tL_emojiList;
        ArrayList<Long> arrayList2;
        int i10;
        int i11;
        TLRPC.TL_emojiList tL_emojiList2;
        HashSet hashSet;
        long j10;
        ArrayList arrayList3;
        int size;
        int i12;
        long j11;
        int i13;
        ArrayList arrayList4;
        y41 y41Var;
        int i14;
        int i15;
        ArrayList arrayList5;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean z14;
        SparseIntArray sparseIntArray3;
        org.telegram.ui.Components.jx jxVar;
        SparseIntArray sparseIntArray4;
        int i16;
        SparseIntArray sparseIntArray5;
        int i17;
        SparseIntArray sparseIntArray6;
        SparseIntArray sparseIntArray7;
        ArrayList arrayList7;
        int i18;
        int i19;
        int i20;
        boolean z15;
        int i21;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList8;
        boolean z16 = !this.L ? false : z11;
        int i22 = this.R;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i22);
        if (mediaDataController2 == null) {
            return;
        }
        if (z10 || this.H0 == null) {
            this.H0 = new ArrayList(mediaDataController2.getStickerSets(this.M ? 0 : 5));
        }
        ArrayList arrayList9 = this.H0;
        ArrayList arrayList10 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList11 = this.r0;
        ArrayList arrayList12 = new ArrayList(arrayList11);
        this.q0 = 0;
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
        this.A = -1;
        this.B = -1;
        ArrayList arrayList13 = this.z0;
        arrayList13.clear();
        this.G0.clear();
        ArrayList arrayList14 = this.D0;
        arrayList14.clear();
        ArrayList arrayList15 = this.E0;
        arrayList15.clear();
        ArrayList arrayList16 = this.I0;
        arrayList16.clear();
        SparseIntArray sparseIntArray8 = this.s0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.t0;
        sparseIntArray9.clear();
        SparseIntArray sparseIntArray10 = this.u0;
        sparseIntArray10.clear();
        arrayList11.clear();
        boolean z17 = z16;
        SparseIntArray sparseIntArray11 = this.v0;
        sparseIntArray11.clear();
        this.O.clear();
        ArrayList arrayList17 = this.B0;
        arrayList17.clear();
        SparseIntArray sparseIntArray12 = sparseIntArray11;
        ArrayList arrayList18 = this.C0;
        arrayList18.clear();
        MediaDataController mediaDataController3 = mediaDataController2;
        ArrayList arrayList19 = this.A0;
        arrayList19.clear();
        boolean isEmpty = arrayList9.isEmpty();
        ArrayList arrayList20 = arrayList10;
        int i23 = this.S;
        if (isEmpty) {
            sparseIntArray = sparseIntArray9;
        } else {
            sparseIntArray = sparseIntArray9;
        }
        if (i23 != 5 && i23 != 7 && i23 != 8) {
            int i24 = this.q0;
            sparseIntArray2 = sparseIntArray8;
            this.q0 = i24 + 1;
            this.a = i24;
            arrayList11.add(9L);
            z13 = this.J0;
            if (i23 != 5 || i23 == 7) {
                arrayList = arrayList18;
                i9 = z13 ? 1 : 0;
                if (i9 != 0) {
                    this.q0++;
                    arrayList11.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i22).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i10 = 0;
                    while (i10 < tL_emojiList.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.t5(tL_emojiList.document_id.get(i10).longValue(), (Paint.FontMetricsInt) null));
                        i10++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i11 = 0; i11 < arrayList13.size(); i11++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList13.get(i11)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            } else if (i23 != 4) {
                arrayList = arrayList18;
                i9 = z13 ? 1 : 0;
                if (i23 == 6) {
                    if (i9 != 0) {
                        this.q0++;
                        arrayList11.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i22).getEnabledReactionsList();
                    for (int i25 = 0; i25 < enabledReactionsList.size(); i25++) {
                        arrayList17.add(enabledReactionsList.get(i25).activate_animation);
                    }
                    for (int i26 = 0; i26 < arrayList17.size(); i26++) {
                        arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i26)).id * 13) + 62425));
                        this.q0++;
                    }
                } else if (i23 == 3) {
                    int i27 = this.q0;
                    this.q0 = i27 + 1;
                    this.x = i27;
                    arrayList11.add(12L);
                    int i28 = this.q0;
                    this.q0 = i28 + 1;
                    this.w = i28;
                    arrayList11.add(7L);
                    String str = UserConfig.getInstance(i22).defaultTopicIcons;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i22).getStickerSetByName(str);
                        tL_messages_stickerSet = stickerSetByName == null ? MediaDataController.getInstance(i22).getStickerSetByEmojiOrName(str) : stickerSetByName;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i9 != 0) {
                            this.q0++;
                            arrayList11.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList21 = tL_messages_stickerSet.documents;
                        if (arrayList21 != null && !arrayList21.isEmpty()) {
                            int i29 = 0;
                            while (i29 < tL_messages_stickerSet.documents.size()) {
                                arrayList13.add(new org.telegram.ui.Components.t5(tL_messages_stickerSet.documents.get(i29), (Paint.FontMetricsInt) null));
                                i29++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i30 = 0; i30 < arrayList13.size(); i30++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList13.get(i30)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    }
                }
            } else if (this.M) {
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i22);
                i9 = z13 ? 1 : 0;
                arrayList17.addAll(mediaDataController4.getRecentStickersNoCopy(0));
                int i31 = 0;
                while (i31 < arrayList17.size()) {
                    arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i31)).id * 13) + 62425));
                    this.q0++;
                    i31++;
                    arrayList18 = arrayList18;
                }
                arrayList = arrayList18;
            } else {
                arrayList = arrayList18;
                i9 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.N ? MediaDataController.getInstance(i22).profileAvatarConstructorDefault : MediaDataController.getInstance(i22).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList8 = tL_emojiList3.document_id) != null && !arrayList8.isEmpty()) {
                    org.telegram.ui.Components.jx jxVar2 = new org.telegram.ui.Components.jx();
                    jxVar2.f = true;
                    jxVar2.g = false;
                    jxVar2.h = true;
                    jxVar2.e = true;
                    jxVar2.b = new TLRPC.TL_stickerSet();
                    jxVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList16.size();
                    arrayList16.add(jxVar2);
                    int i32 = 0;
                    while (i32 < tL_emojiList3.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.t5(tL_emojiList3.document_id.get(i32).longValue(), (Paint.FontMetricsInt) null));
                        i32++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i33 = 0; i33 < arrayList13.size(); i33++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList13.get(i33)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            }
            if (this.K0 && i23 != 13 && i23 != 2 && i23 != 11 && i23 != 3 && i23 != 6 && i23 != 8 && i23 != 4 && i23 != 5 && i23 != 7) {
                int i34 = this.q0;
                this.q0 = i34 + 1;
                this.v = i34;
                arrayList11.add(6L);
            }
            if ((i23 != 9 || i23 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i22).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.N0 == null) {
                this.d = this.q0;
                ArrayList arrayList22 = new ArrayList(this.N0);
                if (i23 == 13 && arrayList22.size() > 8) {
                    arrayList22.subList(8, arrayList22.size()).clear();
                } else if (i23 == 14) {
                    arrayList7 = new ArrayList();
                    int i35 = 0;
                    while (i35 < arrayList22.size()) {
                        if (((hg.r0) arrayList22.get(i35)).e) {
                            arrayList7.add((hg.r0) arrayList22.remove(i35));
                            i35--;
                        }
                        i35++;
                    }
                    if (i23 != 8 || i23 == 11 || i23 == 13) {
                        arrayList14.addAll(arrayList22);
                    } else {
                        for (int i36 = 0; i36 < 16; i36++) {
                            if (!arrayList22.isEmpty()) {
                                arrayList14.add((hg.r0) arrayList22.remove(0));
                            }
                        }
                    }
                    for (i18 = 0; i18 < arrayList14.size(); i18++) {
                        arrayList11 = arrayList11;
                        arrayList11.add(Long.valueOf((((hg.r0) arrayList14.get(i18)).hashCode() * 13) - 5632));
                    }
                    int size2 = arrayList14.size() + this.q0;
                    this.q0 = size2;
                    this.e = size2;
                    if (!arrayList22.isEmpty() && i23 != 8 && i23 != 11 && i23 != 13) {
                        i20 = 0;
                        while (true) {
                            if (i20 < arrayList22.size()) {
                                z15 = true;
                                break;
                            } else {
                                if (((hg.r0) arrayList22.get(i20)).g != 0) {
                                    z15 = false;
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (i23 != 14) {
                            if (!z15) {
                                int i37 = this.q0;
                                this.q0 = i37 + 1;
                                this.f = i37;
                                arrayList11.add(4L);
                            } else if (UserConfig.getInstance(i22).isPremium()) {
                                int i38 = this.q0;
                                this.q0 = i38 + 1;
                                this.h = i38;
                                arrayList11.add(5L);
                            }
                        }
                        this.b = this.q0;
                        arrayList15.addAll(arrayList22);
                        for (i21 = 0; i21 < arrayList15.size(); i21++) {
                            arrayList11.add(Long.valueOf((((hg.r0) arrayList15.get(i21)).h * 13) + (z15 ? 4235 : -3142)));
                        }
                        int size3 = arrayList15.size() + this.q0;
                        this.q0 = size3;
                        this.c = size3;
                    }
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        int i39 = this.q0;
                        this.q0 = i39 + 1;
                        this.y = i39;
                        arrayList11.add(8L);
                        this.A = this.q0;
                        this.F0 = arrayList7;
                        for (i19 = 0; i19 < arrayList7.size(); i19++) {
                            arrayList11.add(Long.valueOf(((hg.r0) arrayList7.get(i19)).c * 19));
                        }
                        int size4 = arrayList7.size() + this.q0;
                        this.q0 = size4;
                        this.B = size4;
                    }
                }
                arrayList7 = null;
                if (i23 != 8) {
                }
                arrayList14.addAll(arrayList22);
                while (i18 < arrayList14.size()) {
                }
                int size22 = arrayList14.size() + this.q0;
                this.q0 = size22;
                this.e = size22;
                if (!arrayList22.isEmpty()) {
                    i20 = 0;
                    while (true) {
                        if (i20 < arrayList22.size()) {
                        }
                        i20++;
                    }
                    if (i23 != 14) {
                    }
                    this.b = this.q0;
                    arrayList15.addAll(arrayList22);
                    while (i21 < arrayList15.size()) {
                    }
                    int size32 = arrayList15.size() + this.q0;
                    this.q0 = size32;
                    this.c = size32;
                }
                if (arrayList7 != null) {
                    int i392 = this.q0;
                    this.q0 = i392 + 1;
                    this.y = i392;
                    arrayList11.add(8L);
                    this.A = this.q0;
                    this.F0 = arrayList7;
                    while (i19 < arrayList7.size()) {
                    }
                    int size42 = arrayList7.size() + this.q0;
                    this.q0 = size42;
                    this.B = size42;
                }
            } else if (i23 == 0 || i23 == 12 || i23 == 9 || i23 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(i22).getRecentEmojiStatuses();
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i22).getStickerSet((i23 == 0 || i23 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet != null) {
                    if (i9 != 0) {
                        this.q0++;
                        arrayList11.add(2L);
                    }
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i23 == 0 || i23 == 12) ? MediaDataController.getInstance(i22).getDefaultEmojiStatuses() : MediaDataController.getInstance(i22).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList23 = stickerSet.documents;
                    if (arrayList23 != null && !arrayList23.isEmpty()) {
                        int i40 = 0;
                        while (i40 < Math.min(7, stickerSet.documents.size())) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSet;
                            arrayList13.add(new org.telegram.ui.Components.t5(stickerSet.documents.get(i40), (Paint.FontMetricsInt) null));
                            if (arrayList13.size() + i9 >= 104) {
                                break;
                            }
                            i40++;
                            stickerSet = tL_messages_stickerSet2;
                        }
                    }
                    if ((i23 == 0 || i23 == 12) && recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                        int size5 = recentEmojiStatuses.size();
                        int i41 = 0;
                        while (i41 < size5) {
                            TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i41);
                            i41++;
                            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                            if (emojiStatusDocumentId != null) {
                                ArrayList<TLRPC.EmojiStatus> arrayList24 = recentEmojiStatuses;
                                int i42 = 0;
                                while (true) {
                                    if (i42 >= arrayList13.size()) {
                                        int i43 = size5;
                                        arrayList13.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i9 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList24;
                                        size5 = i43;
                                    } else {
                                        if (((org.telegram.ui.Components.t5) arrayList13.get(i42)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                            recentEmojiStatuses = arrayList24;
                                            break;
                                        }
                                        i42++;
                                    }
                                }
                            }
                        }
                    }
                    if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                        int size6 = defaultEmojiStatuses.size();
                        int i44 = 0;
                        while (i44 < size6) {
                            TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i44);
                            i44++;
                            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                            if (emojiStatusDocumentId2 != null) {
                                int i45 = 0;
                                while (true) {
                                    if (i45 >= arrayList13.size()) {
                                        ArrayList<TLRPC.EmojiStatus> arrayList25 = defaultEmojiStatuses;
                                        int i46 = size6;
                                        arrayList13.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i9 >= 104) {
                                            break;
                                        }
                                        defaultEmojiStatuses = arrayList25;
                                        size6 = i46;
                                    } else if (((org.telegram.ui.Components.t5) arrayList13.get(i45)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i45++;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList13.size() <= 40 - i9 || this.y0) {
                        for (int i47 = 0; i47 < arrayList13.size(); i47++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList13.get(i47)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    } else {
                        for (int i48 = 0; i48 < 39 - i9; i48++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList13.get(i48)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                        arrayList11.add(Long.valueOf(((((arrayList13.size() - 40) + i9) + 1) * 13) - 5531));
                        f51 f51Var = this.C;
                        if (f51Var != null) {
                            f51Var.a.setText("+" + ((arrayList13.size() - 40) + i9 + 1));
                        }
                        sparseIntArray10.put(this.q0, -1);
                        this.q0++;
                    }
                }
            }
            arrayList19.clear();
            if (i23 != 0 || i23 == 12 || i23 == 9 || i23 == 10) {
                j10 = 13334;
                gh.n7 G = gh.v7.y(i22, false).G(getDialogId(), true);
                G.a();
                arrayList3 = new ArrayList();
                ArrayList arrayList26 = G.l;
                size = arrayList26.size();
                i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList26.get(i12);
                    i12++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList3.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList3.isEmpty()) {
                    int i49 = this.q0;
                    this.q0 = i49 + 1;
                    this.n = i49;
                    arrayList11.add(22L);
                    this.r = this.q0;
                    int size7 = arrayList3.size();
                    int i50 = 0;
                    while (i50 < size7) {
                        Object obj2 = arrayList3.get(i50);
                        i50++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        arrayList11.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.q0++;
                        arrayList19.add(tL_starGiftUnique);
                    }
                    j11 = 322;
                    this.s = this.q0;
                    this.W.l(true);
                } else {
                    j11 = 322;
                    this.W.l(false);
                }
                i13 = 13;
            } else {
                i13 = 13;
                j10 = 13334;
                j11 = 322;
            }
            if (i23 == i13) {
                String[][] strArr = EmojiData.dataColored;
                int length = strArr.length;
                for (int i51 = 0; i51 < length; i51++) {
                    String[] strArr2 = strArr[i51];
                    int length2 = strArr2.length;
                    int i52 = 0;
                    while (i52 < length2) {
                        arrayList.add(strArr2[i52]);
                        arrayList11.add(Long.valueOf((r12.hashCode() * j11) + j10));
                        this.q0++;
                        i52++;
                        strArr = strArr;
                        length = length;
                    }
                }
            }
            if (i23 != 8 && i23 != 13 && i23 != 14) {
                i17 = 0;
                while (i17 < arrayList9.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList9.get(i17);
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.set != null && (((i23 != 5 && i23 != 7) || MessageObject.isTextColorSet(tL_messages_stickerSet3)) && ((i23 != 10 && i23 != 9) || tL_messages_stickerSet3.set.channel_emoji_status))) {
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet3.set;
                        if (stickerSet2.emojis || this.M) {
                            if (!this.x0.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray7 = sparseIntArray2;
                                sparseIntArray7.put(this.q0, arrayList16.size());
                                sparseIntArray6 = sparseIntArray;
                                sparseIntArray6.put(arrayList16.size(), this.q0);
                                this.q0++;
                                arrayList11.add(Long.valueOf((tL_messages_stickerSet3.set.id * 13) + 9211));
                                org.telegram.ui.Components.jx jxVar3 = new org.telegram.ui.Components.jx();
                                jxVar3.f = true;
                                jxVar3.g = false;
                                jxVar3.h = true;
                                if (i23 == 4) {
                                    jxVar3.e = false;
                                } else {
                                    jxVar3.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                jxVar3.b = tL_messages_stickerSet3.set;
                                jxVar3.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList16.size();
                                arrayList16.add(jxVar3);
                                this.q0 = jxVar3.c.size() + this.q0;
                                for (int i53 = 0; i53 < jxVar3.c.size(); i53++) {
                                    arrayList11.add(Long.valueOf((((TLRPC.Document) jxVar3.c.get(i53)).id * 13) + 3212));
                                }
                                i17++;
                                sparseIntArray2 = sparseIntArray7;
                                sparseIntArray = sparseIntArray6;
                            }
                        }
                    }
                    sparseIntArray6 = sparseIntArray;
                    sparseIntArray7 = sparseIntArray2;
                    i17++;
                    sparseIntArray2 = sparseIntArray7;
                    sparseIntArray = sparseIntArray6;
                }
            }
            SparseIntArray sparseIntArray13 = sparseIntArray;
            SparseIntArray sparseIntArray14 = sparseIntArray2;
            if (!this.M && i23 != 8 && i23 != 13 && i23 != 14) {
                i15 = 0;
                while (i15 < arrayList20.size()) {
                    ArrayList arrayList27 = arrayList20;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList27.get(i15);
                    TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                    int i54 = 0;
                    while (true) {
                        if (i54 < arrayList16.size()) {
                            arrayList5 = arrayList16;
                            if (((org.telegram.ui.Components.jx) arrayList16.get(i54)).b.id == stickerSet3.id) {
                                arrayList20 = arrayList27;
                                sparseIntArray4 = sparseIntArray14;
                                sparseIntArray3 = sparseIntArray13;
                                sparseIntArray5 = sparseIntArray12;
                                mediaDataController = mediaDataController3;
                                break;
                            }
                            i54++;
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
                                    if (arrayList6 != null && ((!(i23 == 5 || i23 == 7) || (!arrayList6.isEmpty() && MessageObject.isTextColorEmoji(arrayList6.get(0)))) && (!(i23 == 10 || i23 == 9) || stickerSet3.channel_emoji_status))) {
                                        arrayList20 = arrayList27;
                                        sparseIntArray14.put(this.q0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.q0);
                                        this.q0++;
                                        SparseIntArray sparseIntArray15 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        jxVar = new org.telegram.ui.Components.jx();
                                        jxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray15;
                                        jxVar.f = this.x0.contains(Long.valueOf(stickerSet3.id));
                                        jxVar.g = true;
                                        if (i23 != 4) {
                                            jxVar.e = false;
                                        } else {
                                            jxVar.e = !z14;
                                        }
                                        jxVar.b = stickerSet3;
                                        jxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        jxVar.h = this.w0.contains(Long.valueOf(jxVar.b.id));
                                        if (jxVar.c.size() > 24 || jxVar.h) {
                                            this.q0 = jxVar.c.size() + this.q0;
                                            for (i16 = 0; i16 < jxVar.c.size(); i16++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) jxVar.c.get(i16)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.q0 += 24;
                                            for (int i55 = 0; i55 < 23; i55++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) jxVar.c.get(i55)).id * 13) + 3212));
                                            }
                                            arrayList11.add(Long.valueOf(((jxVar.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray10.put(this.q0 - 1, arrayList5.size());
                                        }
                                        if (!jxVar.f || i23 == 4) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i23 == 5) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i23 == 7) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i23 != 6) {
                                            sparseIntArray5 = sparseIntArray12;
                                            sparseIntArray5.put(this.q0, arrayList5.size());
                                            this.q0++;
                                            arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                            arrayList5.add(jxVar);
                                        } else {
                                            sparseIntArray5 = sparseIntArray12;
                                        }
                                        arrayList5.add(jxVar);
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
                                        sparseIntArray14.put(this.q0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.q0);
                                        this.q0++;
                                        SparseIntArray sparseIntArray152 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        jxVar = new org.telegram.ui.Components.jx();
                                        jxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray152;
                                        jxVar.f = this.x0.contains(Long.valueOf(stickerSet3.id));
                                        jxVar.g = true;
                                        if (i23 != 4) {
                                        }
                                        jxVar.b = stickerSet3;
                                        jxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        jxVar.h = this.w0.contains(Long.valueOf(jxVar.b.id));
                                        if (jxVar.c.size() > 24) {
                                        }
                                        this.q0 = jxVar.c.size() + this.q0;
                                        while (i16 < jxVar.c.size()) {
                                        }
                                        if (jxVar.f) {
                                        }
                                        sparseIntArray5 = sparseIntArray12;
                                        arrayList5.add(jxVar);
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
                    i15++;
                    sparseIntArray14 = sparseIntArray4;
                    sparseIntArray12 = sparseIntArray5;
                    arrayList16 = arrayList5;
                    mediaDataController3 = mediaDataController;
                    sparseIntArray13 = sparseIntArray3;
                }
            }
            arrayList4 = arrayList16;
            if (i23 != 14 && i23 != 8 && i23 != 13) {
                this.W.p(arrayList4);
            }
            y41Var = this.d0;
            if (z17) {
                y41Var.setItemAnimator(null);
            } else {
                y41Var.setItemAnimator(this.a1);
            }
            if (z12) {
                i14 = 0;
                this.l0.l();
            } else {
                i14 = 0;
                f2.s.c(new of.g(this, arrayList12, 3), false).b(this.l0);
            }
            if (y41Var.H1) {
                y41Var.u0(i14);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray8;
        this.a = -1;
        z13 = this.J0;
        if (i23 != 5) {
        }
        arrayList = arrayList18;
        i9 = z13 ? 1 : 0;
        if (i9 != 0) {
        }
        tL_emojiList = MediaDataController.getInstance(i22).replyIconsDefault;
        if (tL_emojiList != null) {
            i10 = 0;
            while (i10 < tL_emojiList.document_id.size()) {
            }
            while (i11 < arrayList13.size()) {
            }
        }
        if (this.K0) {
            int i342 = this.q0;
            this.q0 = i342 + 1;
            this.v = i342;
            arrayList11.add(6L);
        }
        if (i23 != 9) {
        }
        hashSet = new HashSet();
        hashSet.addAll(tL_emojiList2.document_id);
        if (this.N0 == null) {
        }
        arrayList19.clear();
        if (i23 != 0) {
        }
        j10 = 13334;
        gh.n7 G2 = gh.v7.y(i22, false).G(getDialogId(), true);
        G2.a();
        arrayList3 = new ArrayList();
        ArrayList arrayList262 = G2.l;
        size = arrayList262.size();
        i12 = 0;
        while (i12 < size) {
        }
        if (arrayList3.isEmpty()) {
        }
        i13 = 13;
        if (i23 == i13) {
        }
        if (i23 != 8) {
            i17 = 0;
            while (i17 < arrayList9.size()) {
            }
        }
        SparseIntArray sparseIntArray132 = sparseIntArray;
        SparseIntArray sparseIntArray142 = sparseIntArray2;
        if (!this.M) {
            i15 = 0;
            while (i15 < arrayList20.size()) {
            }
        }
        arrayList4 = arrayList16;
        if (i23 != 14) {
            this.W.p(arrayList4);
        }
        y41Var = this.d0;
        if (z17) {
        }
        if (z12) {
        }
        if (y41Var.H1) {
        }
    }

    public final void C() {
        s41 s41Var = this.b0;
        if (s41Var == null) {
            return;
        }
        if (this.u1) {
            s41Var.clearAnimation();
            s41Var.setVisibility(0);
            s41Var.animate().translationY(0.0f).start();
            return;
        }
        y41 y41Var = this.d0;
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

    public final void E(float f10) {
        View view = this.i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.gr.g.getInterpolation(g7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.an anVar = this.j0;
        if (anVar != null) {
            float a2 = g7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            anVar.setAlpha(a2);
            anVar.setScaleX(a2);
            anVar.setScaleY(a2 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a3 = g7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a10 = g7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a11 = g7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a12 = g7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        float interpolation2 = grVar.getInterpolation(a3);
        float interpolation3 = grVar.getInterpolation(a10);
        this.U.setAlpha(a12);
        this.b0.setAlpha(a12);
        int i9 = 0;
        for (int i10 = 0; i10 < this.W.b.getChildCount(); i10++) {
            this.W.b.getChildAt(i10).setAlpha(a12);
        }
        if (this.j1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a12;
        v41 v41Var = this.T;
        v41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (anVar != null) {
            anVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        v41Var.invalidateOutline();
        if (anVar != null) {
            anVar.setAlpha(a12);
        }
        t41 t41Var = this.a0;
        t41Var.setAlpha(a12);
        t41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = t41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(v41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(v41Var.getHeight(), 2.0d) + Math.pow(v41Var.getWidth() - pivotX, 2.0d)));
        for (int i11 = 0; i11 < this.W.b.getChildCount(); i11++) {
            View childAt = this.W.b.getChildAt(i11);
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
            float cascade = AndroidUtilities.cascade(a11, (float) Math.sqrt(e2.c.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            y41 y41Var = this.d0;
            if (i9 >= y41Var.getChildCount()) {
                this.g0.invalidate();
                y41Var.invalidate();
                return;
            }
            View childAt2 = y41Var.getChildAt(i9);
            if (childAt2 instanceof k51) {
                k51 k51Var = (k51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a11, (float) Math.sqrt(e2.c.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                k51Var.setAnimatedScale(cascade2);
            }
            i9++;
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.stickersDidLoad;
        f41 f41Var = this.O1;
        if (i9 == i11) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(f41Var);
                AndroidUtilities.runOnUIThread(f41Var);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
            return;
        }
        if (i9 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
            return;
        }
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            AndroidUtilities.runOnUIThread(f41Var);
            return;
        }
        if (i9 != NotificationCenter.emojiLoaded) {
            if (i9 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(f41Var);
                AndroidUtilities.runOnUIThread(f41Var);
                return;
            }
            return;
        }
        ih.e eVar = new ih.e(18);
        y41 y41Var = this.d0;
        AndroidUtilities.forEachViews((RecyclerView) y41Var, (d5.d) eVar);
        if (y41Var != null) {
            y41Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.i5 i5Var = this.j1;
        if (i5Var != null && (num = this.U0) != null) {
            Rect bounds = i5Var.getBounds();
            View view = this.l1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.j1.getAlpha();
            View view2 = this.l1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.j1.v = (int) (Math.pow(this.T.getAlpha(), 0.25d) * alpha * this.h1);
            if (this.k1 == null) {
                this.k1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f10;
            float z10 = e2.c.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i9 = this.Z0;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? AndroidUtilities.dp(i9) : getMeasuredHeight() - (AndroidUtilities.dp(i9) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.k1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.i5 i5Var2 = this.j1;
            Rect rect = this.k1;
            int i10 = rect.left;
            Rect rect2 = this.k1;
            i5Var2.setBounds(i10, rect.top, (int) ((rect.width() / scaleY) + i10), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.j1.draw(canvas);
            org.telegram.ui.Components.i5 i5Var3 = this.j1;
            i5Var3.v = alpha;
            i5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        k51 k51Var = this.n1;
        if (k51Var == null || this.o1 == null || k51Var.A == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.n1.A.setAlpha((int) (this.m1 * 255.0f));
        this.n1.A.setBounds(this.o1);
        this.n1.A.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.h1, this.b1, this.i1), PorterDuff.Mode.SRC_IN));
        this.n1.A.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.K1 - this.J1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.K1 - this.J1) * 25) + f() + 16;
    }

    public gh.bb getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new gh.bb(1, 8);
        }
        return this.M1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.R).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.B1 ? this.e0 : this.d0).canScrollVertically(1);
        if (canScrollVertically != this.r1) {
            this.r1 = canScrollVertically;
            this.k0.animate().alpha(canScrollVertically ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i9, View view) {
        boolean z10;
        int i10;
        int i11;
        Integer num;
        int i12;
        int i13;
        boolean z11;
        int i14 = this.u0.get(i9);
        Integer num2 = null;
        if (i14 >= 0) {
            ArrayList arrayList = this.I0;
            if (i14 < arrayList.size()) {
                org.telegram.ui.Components.jx jxVar = (org.telegram.ui.Components.jx) arrayList.get(i14);
                if (jxVar.h) {
                    return;
                }
                z11 = i14 + 1 == arrayList.size();
                i12 = this.t0.get(i14);
                this.w0.add(Long.valueOf(jxVar.b.id));
                i10 = 24;
                i11 = jxVar.h ? jxVar.c.size() : Math.min(24, jxVar.c.size());
                num = jxVar.c.size() > 24 ? Integer.valueOf(i12 + 1 + i11) : null;
                jxVar.h = true;
                i13 = jxVar.c.size();
                if (i13 > i11) {
                    num = Integer.valueOf(i12 + 1 + i11);
                    num2 = Integer.valueOf(i13 - i11);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.I1 = view;
                this.J1 = num.intValue();
                this.K1 = num2.intValue() + num.intValue();
                this.L1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.ex(this, num2.intValue() > i10 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i14 != -1 || (z10 = this.y0)) {
            return;
        }
        int i15 = (this.a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
        boolean z12 = this.J0;
        int i16 = i15 + (z12 ? 1 : 0);
        ArrayList arrayList2 = this.z0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z12 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.y0 = true;
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
        int i9 = this.S;
        if (i9 == 2) {
            return;
        }
        String r10 = aa.d.r(new StringBuilder("emoji"), (i9 == 0 || i9 == 12 || i9 == 9 || i9 == 10) ? "status" : "reaction", "usehint");
        int i10 = MessagesController.getGlobalMainSettings().getInt(r10, 0);
        if (i10 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(r10, i10 + 1).apply();
        }
    }

    public final boolean n() {
        int i9 = this.S;
        return i9 == 5 || i9 == 10 || i9 == 12 || i9 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.G.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.t5 t5Var) {
        l();
        if (t5Var != null) {
            int i9 = this.S;
            if (i9 == 0 || i9 == 12 || i9 == 9 || i9 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = t5Var.getDocumentId();
            TLRPC.Document document = t5Var.document;
            int i10 = this.R;
            if (document == null) {
                document = org.telegram.ui.Components.k5.f(i10, t5Var.documentId);
            }
            if (!(view instanceof k51)) {
                p(view, Long.valueOf(t5Var.documentId), document, null, null);
                return;
            }
            final k51 k51Var = (k51) view;
            if (k51Var.v == null && (i9 == 0 || i9 == 12 || i9 == 9 || i9 == 10)) {
                MediaDataController.getInstance(i10).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i9 != 0 && i9 != 12 && i9 != 9 && i9 != 10 && i9 != 2) {
                p(view, Long.valueOf(t5Var.documentId), document, k51Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(k51Var.v)) {
                p(view, Long.valueOf(t5Var.documentId), document2, k51Var.v, null);
                return;
            }
            final rx0 rx0Var = new rx0(this, view, t5Var, document2, k51Var, 2);
            if (this.q1 != null || this.j1 == null) {
                rx0Var.run();
                return;
            }
            k51Var.b = true;
            final Rect rect = new Rect();
            v41 v41Var = this.T;
            int left = v41Var.getLeft();
            y41 y41Var = this.d0;
            rect.set(k51Var.getLeft() + y41Var.getLeft() + left, k51Var.getTop() + y41Var.getTop() + v41Var.getTop(), k51Var.getRight() + y41Var.getLeft() + v41Var.getLeft(), k51Var.getBottom() + y41Var.getTop() + v41Var.getTop());
            Drawable drawable = k51Var.A;
            final org.telegram.ui.Components.k5 n10 = drawable instanceof org.telegram.ui.Components.k5 ? org.telegram.ui.Components.k5.n(i10, ((org.telegram.ui.Components.k5) drawable).i(), null, 7) : null;
            this.n1 = k51Var;
            Rect rect2 = new Rect();
            this.o1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.q1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.h41
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.i5 i5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    b61 b61Var = b61.this;
                    b61Var.h1 = 1.0f - ((floatValue * floatValue) * floatValue);
                    b61Var.m1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, b61Var.k1, floatValue, b61Var.o1);
                    float scaleX = k51Var.getScaleX() * Math.max(1.0f, b61Var.p1.getInterpolation(g7.n.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    b61Var.o1.set((int) org.telegram.messenger.ll.c(b61Var.o1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.ll.c(b61Var.o1.height(), 2.0f, scaleX, b61Var.o1.centerY()), (int) org.telegram.ui.Cells.j2.b(b61Var.o1.width(), 2.0f, scaleX, b61Var.o1.centerX()), (int) org.telegram.ui.Cells.j2.b(b61Var.o1.height(), 2.0f, scaleX, b61Var.o1.centerY()));
                    b61Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        rx0Var.run();
                        if (n10 == null || (i5Var = b61Var.j1) == null) {
                            return;
                        }
                        i5Var.f();
                    }
                }
            });
            this.q1.addListener(new ih.j3(this, zArr, rx0Var, 8));
            this.q1.setInterpolator(org.telegram.ui.Components.gr.h);
            this.q1.setDuration(260L);
            this.q1.start();
            return;
        }
        p(view, null, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        int i9 = this.R;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.S;
        if (i10 == 0 || i10 == 12) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.j1;
        if (i5Var != null) {
            i5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.E = false;
        int i9 = this.R;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i10 = this.S;
        if (i10 == 0 || i10 == 12) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.i5 i5Var = this.j1;
        if (i5Var != null) {
            i5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (z10 && this.S == 6) {
            this.n0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10 = this.M0;
        int i11 = this.S;
        if (z10 && i11 != 3 && i11 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), TLObject.FLAG_31));
        } else if (i11 == 6) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i9, i10);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(r51 r51Var) {
        Integer num = this.U1;
        if (num != null) {
        }
        this.P1 = r51Var;
        boolean z10 = this.M0;
        int i9 = 0;
        y41 y41Var = this.d0;
        if (!z10) {
            h();
            while (i9 < y41Var.getChildCount()) {
                View childAt = y41Var.getChildAt(i9);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i9++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        ValueAnimator valueAnimator2 = this.R1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.R1 = null;
        }
        int i10 = this.S;
        if (i10 == 3 || i10 == 4 || i10 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q1 = ofFloat;
        ofFloat.addUpdateListener(new e41(this, i9));
        this.Q1.addListener(new bc0(this, 26));
        f41 f41Var = new f41(this, i9);
        hg.h0.f = true;
        hg.h0.e = true;
        hg.h0.g = false;
        if (hg.h0.d) {
            hg.h0.d = false;
        }
        hg.h0.c = f41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.S1.lock();
        this.Q1.setDuration(800L);
        y41Var.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        this.a0.setLayerType(2, null);
        this.U.setLayerType(2, null);
        org.telegram.ui.Components.an anVar = this.j0;
        if (anVar != null) {
            anVar.setLayerType(2, null);
        }
        View view = this.i0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.W.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z10) {
        this.L = z10;
    }

    public void setBackgroundDelegate(b51 b51Var) {
        this.Q = b51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        kh.h6 h6Var = this.U;
        if (z10) {
            h6Var.setVisibility(0);
        } else {
            h6Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.d0, (d5.d) new ih.e(13));
            for (int i9 = 0; i9 < this.W.b.getChildCount(); i9++) {
                View childAt = this.W.b.getChildAt(i9);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.W.b.invalidate();
        }
    }

    public void setExpireDateHint(int i9) {
        if (i9 <= 0) {
            return;
        }
        this.K0 = true;
        this.L0 = Integer.valueOf(i9);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.N = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.J = drawable;
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.d1 = z10;
    }

    public void setOnLongPressedListener(z51 z51Var) {
        this.D = z51Var;
    }

    public void setRecentReactions(List<hg.r0> list) {
        this.N0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i9) {
        this.U1 = Integer.valueOf(i9);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.G;
        hashSet.clear();
        hashSet.add(l10);
        y41 y41Var = this.d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    org.telegram.ui.Components.t5 t5Var = k51Var.e;
                    if (t5Var != null) {
                        k51Var.d(hashSet.contains(Long.valueOf(t5Var.getDocumentId())), true);
                    } else {
                        k51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            y41Var.invalidate();
        }
    }

    public void setSelectedReaction(hg.r0 r0Var) {
        this.F.clear();
        this.F.add(r0Var);
        y41 y41Var = this.d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    k51Var.d(this.F.contains(k51Var.x), true);
                }
            }
            y41Var.invalidate();
        }
        o41 o41Var = this.e0;
        if (o41Var != null) {
            for (int i10 = 0; i10 < o41Var.getChildCount(); i10++) {
                if (o41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var2 = (k51) o41Var.getChildAt(i10);
                    k51Var2.d(this.F.contains(k51Var2.x), true);
                }
            }
            o41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<hg.r0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) != null && ((hg.r0) arrayList.get(i9)).g != 0) {
                hashSet2.add(Long.valueOf(((hg.r0) arrayList.get(i9)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        f41 f41Var = this.E1;
        if (f41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f41Var);
            this.E1 = null;
        }
        ih.u5 u5Var = this.F1;
        if (u5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            this.F1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        l51 l51Var = this.m0;
        s41 s41Var = this.b0;
        if (isEmpty) {
            this.t1 = false;
            this.u1 = false;
            z(false, z10);
            if (s41Var != null) {
                s41Var.e(true);
                q51.a(s41Var, false);
            }
            l51Var.E(true);
            this.v1 = null;
        } else {
            boolean z12 = this.t1;
            boolean z13 = !z12;
            this.t1 = true;
            this.u1 = false;
            if (s41Var != null) {
                s41Var.f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.w1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.x1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.z1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                l51Var.E(false);
            } else if (!str.equals(this.v1)) {
                f41 f41Var2 = new f41(this, 1);
                this.E1 = f41Var2;
                AndroidUtilities.runOnUIThread(f41Var2, 120L);
            }
            this.v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            ih.u5 u5Var2 = new ih.u5(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.F1 = u5Var2;
            AndroidUtilities.runOnUIThread(u5Var2, z11 ? 425L : 0L);
            if (s41Var != null) {
                s41Var.f.b(2);
                q51.a(s41Var, z10);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0.getAlpha(), f10 * 0.25f);
        this.e1 = ofFloat;
        ofFloat.addUpdateListener(new e41(this, 2));
        this.e1.setDuration(200L);
        this.e1.setInterpolator(org.telegram.ui.Components.gr.f);
        this.e1.start();
    }

    public final void x(Long l10, boolean z10) {
        boolean z11;
        HashSet hashSet = this.G;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z11 = false;
        } else {
            hashSet.add(l10);
            z11 = true;
        }
        y41 y41Var = this.d0;
        if (y41Var != null) {
            for (int i9 = 0; i9 < y41Var.getChildCount(); i9++) {
                if (y41Var.getChildAt(i9) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i9);
                    org.telegram.ui.Components.t5 t5Var = k51Var.e;
                    if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = k51Var.d;
                        if (document != null && document.id == l10.longValue()) {
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

    public final void y(org.telegram.ui.Components.i5 i5Var, View view) {
        Integer num;
        this.i1 = (i5Var == null || (num = i5Var.B) == null) ? 0 : num.intValue();
        this.j1 = i5Var;
        this.l1 = view;
        if (this.E && i5Var != null) {
            i5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.B1 == z10) {
            return;
        }
        this.B1 = z10;
        y41 y41Var = this.d0;
        int i9 = 0;
        y41Var.setVisibility(0);
        o41 o41Var = this.e0;
        o41Var.setVisibility(0);
        ValueAnimator valueAnimator = this.A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.D1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.D1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A1 = ofFloat;
        ofFloat.addUpdateListener(new i41(this, z10, i9));
        this.A1.addListener(new u41(this, z10, i9));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.gr.h);
        this.A1.start();
        org.telegram.messenger.ll.r(((View) y41Var.getParent()).animate().translationY((this.B1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new e41(this, 1)), org.telegram.ui.Components.gr.f, 160L);
        if (this.B1 && z11) {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i9, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        this(o2Var, context, z10, num, i9, z11, b6Var, i10, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.v6, b6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i9, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11) {
        super(context);
        int i12;
        boolean z12;
        int i13;
        int i14;
        float f10;
        o41 o41Var;
        dh.g gVar;
        int i15;
        int i16;
        int i17;
        boolean z13;
        x41 x41Var;
        int i18;
        boolean z14;
        int i19;
        org.telegram.ui.Components.jv jvVar;
        int i20 = i9;
        int i21 = i11;
        this.F = new HashSet();
        this.G = new HashSet();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.O = new ArrayList();
        this.R = UserConfig.selectedAccount;
        this.V = new org.telegram.ui.Components.nv[2];
        this.r0 = new ArrayList();
        this.s0 = new SparseIntArray();
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new SparseIntArray();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = false;
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = false;
        this.K0 = false;
        this.M0 = true;
        this.R0 = new ImageReceiver();
        this.d1 = true;
        this.h1 = 1.0f;
        this.m1 = 1.0f;
        this.p1 = new OvershootInterpolator(2.0f);
        this.r1 = false;
        this.s1 = false;
        this.t1 = false;
        this.u1 = false;
        this.B1 = false;
        this.C1 = false;
        this.G1 = false;
        this.H1 = false;
        this.J1 = -1;
        this.K1 = -1;
        this.L1 = -1L;
        this.N1 = new f41(this, 3);
        this.O1 = new f41(this, 4);
        this.S1 = new AnimationNotificationsLocker();
        this.T1 = new Paint();
        this.V0 = b6Var;
        this.S = i20;
        this.J0 = z10;
        this.Y0 = o2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i20 == 0 || i20 == 12 || i20 == 9 || i20 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.K0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.b1 = i21;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var));
        paint2.setColor(i0.a.k(i21, 30));
        this.g1 = new PorterDuffColorFilter(i21, PorterDuff.Mode.SRC_IN);
        this.U0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(g7.n.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i20 == 0 || i20 == 12 || i20 == 9 || i20 == 10 || i20 == 2 || i20 == 5 || i20 == 7) {
            this.Z0 = i10;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new f0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.i0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            addView(view, g7.e6.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z15 ? -12 : 4), n() ? 0 : this.Z0, 0.0f, n() ? this.Z0 : 0));
        }
        kh.h6 h6Var = new kh.h6(this, context, b6Var, 13);
        this.U = h6Var;
        boolean z16 = i20 == 3 || i20 == 4;
        boolean z17 = z16;
        v41 v41Var = new v41(this, context, z16, z17, b6Var, valueOf);
        Integer num2 = valueOf;
        this.T = v41Var;
        if (!z17) {
            v41Var.setOutlineProvider(new w41(this, num2));
            v41Var.setClipToOutline(true);
            if (z17) {
                v41Var.setElevation(2.0f);
            }
        }
        if (i20 == 0 || i20 == 12 || i20 == 9 || i20 == 10 || i20 == 2 || i20 == 5 || i20 == 15) {
            v41Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        v41Var.addView(h6Var, g7.e6.c(-1.0f, -1));
        addView(v41Var, g7.e6.d(-1, -1.0f, 119, 0.0f, (i20 == 0 || i20 == 12 || i20 == 9 || i20 == 2 || i20 == 7) ? this.Z0 + 6 : 0.0f, 0.0f, n() ? this.Z0 + 6 : 0.0f));
        if (num2 != null) {
            org.telegram.ui.Components.an anVar = new org.telegram.ui.Components.an(context, 25);
            this.j0 = anVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var), PorterDuff.Mode.MULTIPLY));
            anVar.setBackground(drawable);
            addView(anVar, g7.e6.d(17, 9.0f, (n() ? 80 : 48) | 3, (num2.intValue() / AndroidUtilities.density) + (z15 ? -25 : 10), n() ? 0.0f : this.Z0 + 5, 0.0f, n() ? this.Z0 + 14 : 0.0f));
        }
        if (o2Var == null || i20 == 3 || i20 == 6 || i20 == 5 || i20 == 7) {
            i12 = 4;
        } else {
            i12 = 4;
            if (i20 != 4 && i20 != 9 && i20 != 10 && z11) {
                z12 = true;
                i13 = 0;
                while (i13 < 2) {
                    Integer num3 = num2;
                    boolean z18 = i20 != i12;
                    if (i20 != 0 && i20 != 12 && i20 != 9) {
                        if (i20 != 10) {
                            i18 = i13;
                            z14 = false;
                            i19 = i20;
                            x41Var = new x41(this, context, b6Var, z18, z14, i19, !z12 ? new n21(5, this, o2Var) : null, i21, i9);
                            jvVar = x41Var.y;
                            if (jvVar != null) {
                                jvVar.setOnLongClickListener(new u(this, 7));
                            }
                            x41Var.Q = false;
                            if (i19 != i12) {
                                x41Var.setAnimatedEmojiCacheType(13);
                            } else {
                                x41Var.setAnimatedEmojiCacheType((i19 == 0 || i19 == 12 || i19 == 2) ? 6 : 5);
                            }
                            x41Var.K = num3 != null;
                            x41Var.setPaddingLeft(i19 != 6 ? 10.0f : 5.0f);
                            if (i19 != 14 && i19 != 8 && i19 != 13) {
                                this.T.addView(x41Var, g7.e6.c(36.0f, -1));
                            }
                            this.V[i18] = x41Var;
                            i13 = i18 + 1;
                            i21 = i11;
                            i20 = i19;
                            num2 = num3;
                        }
                    }
                    i18 = i13;
                    z14 = true;
                    i19 = i20;
                    x41Var = new x41(this, context, b6Var, z18, z14, i19, !z12 ? new n21(5, this, o2Var) : null, i21, i9);
                    jvVar = x41Var.y;
                    if (jvVar != null) {
                    }
                    x41Var.Q = false;
                    if (i19 != i12) {
                    }
                    x41Var.K = num3 != null;
                    x41Var.setPaddingLeft(i19 != 6 ? 10.0f : 5.0f);
                    if (i19 != 14) {
                        this.T.addView(x41Var, g7.e6.c(36.0f, -1));
                    }
                    this.V[i18] = x41Var;
                    i13 = i18 + 1;
                    i21 = i11;
                    i20 = i19;
                    num2 = num3;
                }
                Integer num4 = num2;
                i14 = i20;
                org.telegram.ui.Components.nv[] nvVarArr = this.V;
                this.W = nvVarArr[0];
                nvVarArr[1].setVisibility(8);
                t41 t41Var = new t41(context, num4, 1);
                this.a0 = t41Var;
                t41Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var));
                if (i14 != 14 || i14 == 8 || i14 == 13) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    this.T.addView(t41Var, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(t41Var, true, f10, false);
                y41 y41Var = new y41(this, context, i14);
                this.d0 = y41Var;
                z41 z41Var = new z41();
                this.a1 = z41Var;
                z41Var.c = 220L;
                z41Var.e = 260L;
                z41Var.f = 160L;
                z41Var.g = 160L;
                z41Var.m = false;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                z41Var.i = grVar;
                z41Var.C = false;
                y41Var.setItemAnimator(z41Var);
                y41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                a51 a51Var = new a51(this);
                this.l0 = a51Var;
                y41Var.setAdapter(a51Var);
                p41 p41Var = new p41(this, 1);
                this.n0 = p41Var;
                y41Var.setLayoutManager(p41Var);
                p41Var.O = new n41(this, 0);
                dh.g gVar2 = new dh.g(context, 29);
                this.c0 = gVar2;
                fh.v vVar = new fh.v(this, context);
                this.g0 = vVar;
                vVar.addView(y41Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                gVar2.addView(vVar, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                o41Var = new o41(this, context);
                this.e0 = o41Var;
                if (o41Var.getItemAnimator() == null) {
                    gVar = gVar2;
                    o41Var.getItemAnimator().n(180L);
                    o41Var.getItemAnimator().i = grVar;
                } else {
                    gVar = gVar2;
                }
                TextView textView = new TextView(context);
                if (i14 != i12) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                } else {
                    if (i14 != 0 && i14 != 13 && i14 != 12 && i14 != 11 && i14 != 9) {
                        if (i14 != 10) {
                            if (i14 == 1 || i14 == 2) {
                                textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                            } else if (i14 == 14) {
                                textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                            } else {
                                textView.setText(LocaleController.getString(R.string.NoIconsFound));
                            }
                        }
                    }
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                }
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Le, b6Var));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                this.h0 = o9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.f0 = frameLayout;
                frameLayout.addView(o9Var, g7.e6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                dh.g gVar3 = gVar;
                gVar3.addView(frameLayout, g7.e6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                l51 l51Var = new l51(this);
                this.m0 = l51Var;
                o41Var.setAdapter(l51Var);
                p41 p41Var2 = new p41(this, 0);
                o41Var.setLayoutManager(p41Var2);
                p41Var2.O = new n41(this, 1);
                o41Var.setVisibility(8);
                gVar3.addView(o41Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.T.addView(gVar3, g7.e6.d(-1, -1.0f, 48, 0.0f, (i14 != 8 || i14 == 13 || i14 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                c2.y yVar = new c2.y(y41Var, p41Var);
                this.o0 = yVar;
                yVar.i = new kh.m1(this, 1);
                yVar.h = new g41(this);
                r41 r41Var = new r41(this, i14, context, b6Var, num);
                y41Var.n1(r41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                o41Var.n1(r41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(this, i9, 2);
                y41Var.setOnItemClickListener(am0Var);
                o41Var.setOnItemClickListener(am0Var);
                s41 s41Var = new s41(this, context, z11);
                this.b0 = s41Var;
                s41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                s41Var.setVisibility(4);
                gVar3.addView(s41Var, g7.e6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                t41 t41Var2 = new t41(context, num4, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i22 = org.telegram.ui.ActionBar.f6.G8;
                int multiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.f6.v0(i22, b6Var), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent, mode));
                t41Var2.setBackground(drawable2);
                t41Var2.setAlpha(0.0f);
                this.T.addView(t41Var2, g7.e6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.k0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i22, b6Var), mode));
                if (i9 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.T.addView(view2, g7.e6.e(-1, 20, 87));
                View view3 = new View(context);
                this.p0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.T.addView(view3, g7.e6.c(-1.0f, -1));
                i15 = this.R;
                if (MediaDataController.getInstance(i15) == null) {
                    MediaDataController.getInstance(i15).checkStickers(5);
                    if (i9 == 14) {
                        MessagesController.getInstance(this.R).getAvailableEffects();
                        i16 = 3;
                    } else if (i9 == 1 || i9 == 11 || i9 == 2 || i9 == 6 || i9 == 13) {
                        i16 = 3;
                        MediaDataController.getInstance(i15).checkReactions();
                    } else if (i9 == 9 || i9 == 10) {
                        i16 = 3;
                        if (MessagesController.getInstance(i15).getMainSettings().getBoolean("resetemojipacks", true)) {
                            MediaDataController.getInstance(i15).loadStickers(5, false, false);
                            MessagesController.getInstance(i15).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
                        }
                        MediaDataController.getInstance(i15).fetchEmojiStatuses(2, false);
                        MediaDataController.getInstance(i15).loadRestrictedStatusEmojis();
                        MediaDataController.getInstance(i15).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                    } else if (i9 == 0 || i9 == 12) {
                        i16 = 3;
                        MediaDataController.getInstance(i15).fetchEmojiStatuses(0, true);
                        MediaDataController.getInstance(i15).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                    } else {
                        i16 = 3;
                        if (i9 == 3) {
                            MediaDataController.getInstance(i15).checkDefaultTopicIcons();
                        } else if (i9 == 4) {
                            MediaDataController.getInstance(i15).loadRecents(0, false, true, false);
                            MediaDataController.getInstance(i15).checkStickers(0);
                        }
                    }
                    this.R0.setLayerNum(7);
                    i17 = this.S;
                    if (i17 != i16 || i17 == 4 || i17 == 6) {
                        z13 = true;
                    } else {
                        me.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z13 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z13 = true;
                        }
                        hg.h0.g = z13;
                    }
                    B(z13, false, z13);
                }
                i16 = 3;
                this.R0.setLayerNum(7);
                i17 = this.S;
                if (i17 != i16) {
                }
                z13 = true;
                B(z13, false, z13);
            }
        }
        z12 = false;
        i13 = 0;
        while (i13 < 2) {
        }
        Integer num42 = num2;
        i14 = i20;
        org.telegram.ui.Components.nv[] nvVarArr2 = this.V;
        this.W = nvVarArr2[0];
        nvVarArr2[1].setVisibility(8);
        t41 t41Var3 = new t41(context, num42, 1);
        this.a0 = t41Var3;
        t41Var3.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, b6Var));
        if (i14 != 14) {
        }
        f10 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(t41Var3, true, f10, false);
        y41 y41Var2 = new y41(this, context, i14);
        this.d0 = y41Var2;
        z41 z41Var2 = new z41();
        this.a1 = z41Var2;
        z41Var2.c = 220L;
        z41Var2.e = 260L;
        z41Var2.f = 160L;
        z41Var2.g = 160L;
        z41Var2.m = false;
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.h;
        z41Var2.i = grVar2;
        z41Var2.C = false;
        y41Var2.setItemAnimator(z41Var2);
        y41Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        a51 a51Var2 = new a51(this);
        this.l0 = a51Var2;
        y41Var2.setAdapter(a51Var2);
        p41 p41Var3 = new p41(this, 1);
        this.n0 = p41Var3;
        y41Var2.setLayoutManager(p41Var3);
        p41Var3.O = new n41(this, 0);
        dh.g gVar22 = new dh.g(context, 29);
        this.c0 = gVar22;
        fh.v vVar2 = new fh.v(this, context);
        this.g0 = vVar2;
        vVar2.addView(y41Var2, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        gVar22.addView(vVar2, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        o41Var = new o41(this, context);
        this.e0 = o41Var;
        if (o41Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i14 != i12) {
        }
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Le, b6Var));
        org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
        this.h0 = o9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        frameLayout2.addView(o9Var2, g7.e6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, g7.e6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        dh.g gVar32 = gVar;
        gVar32.addView(frameLayout2, g7.e6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        o41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        l51 l51Var2 = new l51(this);
        this.m0 = l51Var2;
        o41Var.setAdapter(l51Var2);
        p41 p41Var22 = new p41(this, 0);
        o41Var.setLayoutManager(p41Var22);
        p41Var22.O = new n41(this, 1);
        o41Var.setVisibility(8);
        gVar32.addView(o41Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.addView(gVar32, g7.e6.d(-1, -1.0f, 48, 0.0f, (i14 != 8 || i14 == 13 || i14 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        c2.y yVar2 = new c2.y(y41Var2, p41Var3);
        this.o0 = yVar2;
        yVar2.i = new kh.m1(this, 1);
        yVar2.h = new g41(this);
        r41 r41Var2 = new r41(this, i14, context, b6Var, num);
        y41Var2.n1(r41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        o41Var.n1(r41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.am0 am0Var2 = new org.telegram.ui.Components.am0(this, i9, 2);
        y41Var2.setOnItemClickListener(am0Var2);
        o41Var.setOnItemClickListener(am0Var2);
        s41 s41Var2 = new s41(this, context, z11);
        this.b0 = s41Var2;
        s41Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        s41Var2.setVisibility(4);
        gVar32.addView(s41Var2, g7.e6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        t41 t41Var22 = new t41(context, num42, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i222 = org.telegram.ui.ActionBar.f6.G8;
        int multiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.f6.v0(i222, b6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable22.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent2, mode2));
        t41Var22.setBackground(drawable22);
        t41Var22.setAlpha(0.0f);
        this.T.addView(t41Var22, g7.e6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.k0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable32.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i222, b6Var), mode2));
        if (i9 == 14) {
        }
        view22.setAlpha(0.0f);
        this.T.addView(view22, g7.e6.e(-1, 20, 87));
        View view32 = new View(context);
        this.p0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.T.addView(view32, g7.e6.c(-1.0f, -1));
        i15 = this.R;
        if (MediaDataController.getInstance(i15) == null) {
        }
        this.R0.setLayerNum(7);
        i17 = this.S;
        if (i17 != i16) {
        }
        z13 = true;
        B(z13, false, z13);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.F.clear();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            String str = arrayList.get(i9);
            i9++;
            this.F.add(hg.r0.b(str));
        }
        y41 y41Var = this.d0;
        if (y41Var != null) {
            for (int i10 = 0; i10 < y41Var.getChildCount(); i10++) {
                if (y41Var.getChildAt(i10) instanceof k51) {
                    k51 k51Var = (k51) y41Var.getChildAt(i10);
                    k51Var.d(this.F.contains(k51Var.x), true);
                }
            }
            y41Var.invalidate();
        }
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

    public void r(k51 k51Var, hg.r0 r0Var) {
    }
}
