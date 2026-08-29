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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public h51 C;
    public final ArrayList C0;
    public boolean C1;
    public b61 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public h41 E1;
    public HashSet F;
    public ArrayList F0;
    public ag.z0 F1;
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
    public m51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public jh.va M1;
    public boolean N;
    public List N0;
    public final h41 N1;
    public final ArrayList O;
    public m51 O0;
    public final h41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public d51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.p5 S0;
    public final AnimationNotificationsLocker S1;
    public final x41 T;
    public s41 T0;
    public final Paint T1;
    public final cg.i0 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.tv[] V;
    public final org.telegram.ui.ActionBar.c6 V0;
    public org.telegram.ui.Components.tv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.o2 Y0;
    public final int Z0;
    public int a;
    public final v41 a0;
    public final b51 a1;
    public int b;
    public final u41 b0;
    public final int b1;
    public int c;
    public final n31 c0;
    public boolean c1;
    public int d;
    public final a51 d0;
    public boolean d1;
    public int e;
    public final q41 e0;
    public ValueAnimator e1;
    public int f;
    public final FrameLayout f0;
    public Drawable f1;
    public final bg.d1 g0;
    public final PorterDuffColorFilter g1;
    public int h;
    public final org.telegram.ui.Components.t9 h0;
    public float h1;
    public final View i0;
    public int i1;
    public final org.telegram.ui.Components.fn j0;
    public org.telegram.ui.Components.n5 j1;
    public final View k0;
    public Rect k1;
    public final c51 l0;
    public View l1;
    public final n51 m0;
    public float m1;
    public int n;
    public final r41 n0;
    public m51 n1;
    public final c2.z o0;
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

    public d61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(o2Var, context, z10, num, i10, true, c6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.t9 t9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (t9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            list = V1;
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.m6, 0.2f);
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
            t9Var.setLayerNum(7);
            t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            t9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(d61 d61Var, int i10, int i11) {
        c2.z zVar = d61Var.o0;
        r41 r41Var = d61Var.n0;
        View m10 = r41Var.m(i10);
        int L0 = r41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            zVar.b = r41Var.L0() < i10 ? 0 : 1;
            zVar.c(i10, i11, false, false);
        } else {
            nh.k1 k1Var = new nh.k1(d61Var, d61Var.d0.getContext(), 4);
            k1Var.a = i10;
            k1Var.p = i11;
            r41Var.w0(k1Var);
        }
    }

    public static boolean c(d61 d61Var) {
        if (d61Var.P) {
            return true;
        }
        ValueAnimator valueAnimator = d61Var.Q1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.S;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.p5.g();
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
        if (this.f1 == null) {
            int i10 = this.S;
            if (i10 == 5 || i10 == 9 || i10 == 10 || i10 == 7) {
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
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2;
        if (this.E && (p5Var2 = this.S0) != p5Var) {
            if (p5Var2 != null) {
                p5Var2.o(this);
            }
            this.S0 = p5Var;
            if (p5Var != null) {
                p5Var.setColorFilter(this.g1);
                this.S0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = X1;
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
        org.telegram.ui.Components.ow0.t3.fetch(i10, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.ew0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                ArrayList<TLRPC.EmojiGroup> arrayList;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups == null || (arrayList = tL_messages_emojiGroups.groups) == null) {
                    return;
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.EmojiGroup emojiGroup = arrayList.get(i11);
                    i11++;
                    p5.h(i10).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        a51 a51Var = this.d0;
        if (a51Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < a51Var.getChildCount(); i11++) {
                if (a51Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i11);
                    org.telegram.ui.Components.y5 y5Var = m51Var.e;
                    if (y5Var == null || y5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = m51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            m51Var.f();
                        }
                    } else {
                        m51Var.f();
                    }
                    z10 = true;
                }
            }
            a51Var.invalidate();
            if (z10) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.r0;
                if (i10 >= arrayList.size()) {
                    return;
                }
                long longValue = ((Long) arrayList.get(i10)).longValue();
                if (longValue == (l10.longValue() * 13) + 62425 || longValue == (l10.longValue() * 13) + 3212) {
                    break;
                } else {
                    i10++;
                }
            }
            c51 c51Var = this.l0;
            if (c51Var != null) {
                c51Var.m(i10);
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
        a51 a51Var;
        int i15;
        int i16;
        ArrayList arrayList5;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean z14;
        SparseIntArray sparseIntArray3;
        org.telegram.ui.Components.rx rxVar;
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
        boolean z16 = !this.L ? false : z11;
        int i23 = this.R;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i23);
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
        int i24 = this.S;
        if (isEmpty) {
            sparseIntArray = sparseIntArray9;
        } else {
            sparseIntArray = sparseIntArray9;
        }
        if (i24 != 5 && i24 != 7 && i24 != 8) {
            int i25 = this.q0;
            sparseIntArray2 = sparseIntArray8;
            this.q0 = i25 + 1;
            this.a = i25;
            arrayList11.add(9L);
            z13 = this.J0;
            if (i24 != 5 || i24 == 7) {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                if (i10 != 0) {
                    this.q0++;
                    arrayList11.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i23).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i11 = 0;
                    while (i11 < tL_emojiList.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.y5(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList13.size(); i12++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.y5) arrayList13.get(i12)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            } else if (i24 != 4) {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                if (i24 == 6) {
                    if (i10 != 0) {
                        this.q0++;
                        arrayList11.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i23).getEnabledReactionsList();
                    for (int i26 = 0; i26 < enabledReactionsList.size(); i26++) {
                        arrayList17.add(enabledReactionsList.get(i26).activate_animation);
                    }
                    for (int i27 = 0; i27 < arrayList17.size(); i27++) {
                        arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i27)).id * 13) + 62425));
                        this.q0++;
                    }
                } else if (i24 == 3) {
                    int i28 = this.q0;
                    this.q0 = i28 + 1;
                    this.x = i28;
                    arrayList11.add(12L);
                    int i29 = this.q0;
                    this.q0 = i29 + 1;
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
                            this.q0++;
                            arrayList11.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList21 = tL_messages_stickerSet.documents;
                        if (arrayList21 != null && !arrayList21.isEmpty()) {
                            int i30 = 0;
                            while (i30 < tL_messages_stickerSet.documents.size()) {
                                arrayList13.add(new org.telegram.ui.Components.y5(tL_messages_stickerSet.documents.get(i30), (Paint.FontMetricsInt) null));
                                i30++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i31 = 0; i31 < arrayList13.size(); i31++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.y5) arrayList13.get(i31)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    }
                }
            } else if (this.M) {
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i23);
                i10 = z13 ? 1 : 0;
                arrayList17.addAll(mediaDataController4.getRecentStickersNoCopy(0));
                int i32 = 0;
                while (i32 < arrayList17.size()) {
                    arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i32)).id * 13) + 62425));
                    this.q0++;
                    i32++;
                    arrayList18 = arrayList18;
                }
                arrayList = arrayList18;
            } else {
                arrayList = arrayList18;
                i10 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.N ? MediaDataController.getInstance(i23).profileAvatarConstructorDefault : MediaDataController.getInstance(i23).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList8 = tL_emojiList3.document_id) != null && !arrayList8.isEmpty()) {
                    org.telegram.ui.Components.rx rxVar2 = new org.telegram.ui.Components.rx();
                    rxVar2.f = true;
                    rxVar2.g = false;
                    rxVar2.h = true;
                    rxVar2.e = true;
                    rxVar2.b = new TLRPC.TL_stickerSet();
                    rxVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList16.size();
                    arrayList16.add(rxVar2);
                    int i33 = 0;
                    while (i33 < tL_emojiList3.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.y5(tL_emojiList3.document_id.get(i33).longValue(), (Paint.FontMetricsInt) null));
                        i33++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.y5) arrayList13.get(i34)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            }
            if (this.K0 && i24 != 13 && i24 != 2 && i24 != 11 && i24 != 3 && i24 != 6 && i24 != 8 && i24 != 4 && i24 != 5 && i24 != 7) {
                int i35 = this.q0;
                this.q0 = i35 + 1;
                this.v = i35;
                arrayList11.add(6L);
            }
            if ((i24 != 9 || i24 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i23).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.N0 == null) {
                this.d = this.q0;
                ArrayList arrayList22 = new ArrayList(this.N0);
                if (i24 == 13 && arrayList22.size() > 8) {
                    arrayList22.subList(8, arrayList22.size()).clear();
                } else if (i24 == 14) {
                    arrayList7 = new ArrayList();
                    int i36 = 0;
                    while (i36 < arrayList22.size()) {
                        if (((kg.q0) arrayList22.get(i36)).e) {
                            arrayList7.add((kg.q0) arrayList22.remove(i36));
                            i36--;
                        }
                        i36++;
                    }
                    if (i24 != 8 || i24 == 11 || i24 == 13) {
                        arrayList14.addAll(arrayList22);
                    } else {
                        for (int i37 = 0; i37 < 16; i37++) {
                            if (!arrayList22.isEmpty()) {
                                arrayList14.add((kg.q0) arrayList22.remove(0));
                            }
                        }
                    }
                    for (i19 = 0; i19 < arrayList14.size(); i19++) {
                        arrayList11 = arrayList11;
                        arrayList11.add(Long.valueOf((((kg.q0) arrayList14.get(i19)).hashCode() * 13) - 5632));
                    }
                    int size2 = arrayList14.size() + this.q0;
                    this.q0 = size2;
                    this.e = size2;
                    if (!arrayList22.isEmpty() && i24 != 8 && i24 != 11 && i24 != 13) {
                        i21 = 0;
                        while (true) {
                            if (i21 < arrayList22.size()) {
                                z15 = true;
                                break;
                            } else {
                                if (((kg.q0) arrayList22.get(i21)).g != 0) {
                                    z15 = false;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i24 != 14) {
                            if (!z15) {
                                int i38 = this.q0;
                                this.q0 = i38 + 1;
                                this.f = i38;
                                arrayList11.add(4L);
                            } else if (UserConfig.getInstance(i23).isPremium()) {
                                int i39 = this.q0;
                                this.q0 = i39 + 1;
                                this.h = i39;
                                arrayList11.add(5L);
                            }
                        }
                        this.b = this.q0;
                        arrayList15.addAll(arrayList22);
                        for (i22 = 0; i22 < arrayList15.size(); i22++) {
                            arrayList11.add(Long.valueOf((((kg.q0) arrayList15.get(i22)).h * 13) + (z15 ? 4235 : -3142)));
                        }
                        int size3 = arrayList15.size() + this.q0;
                        this.q0 = size3;
                        this.c = size3;
                    }
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        int i40 = this.q0;
                        this.q0 = i40 + 1;
                        this.y = i40;
                        arrayList11.add(8L);
                        this.A = this.q0;
                        this.F0 = arrayList7;
                        for (i20 = 0; i20 < arrayList7.size(); i20++) {
                            arrayList11.add(Long.valueOf(((kg.q0) arrayList7.get(i20)).c * 19));
                        }
                        int size4 = arrayList7.size() + this.q0;
                        this.q0 = size4;
                        this.B = size4;
                    }
                }
                arrayList7 = null;
                if (i24 != 8) {
                }
                arrayList14.addAll(arrayList22);
                while (i19 < arrayList14.size()) {
                }
                int size22 = arrayList14.size() + this.q0;
                this.q0 = size22;
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
                    this.b = this.q0;
                    arrayList15.addAll(arrayList22);
                    while (i22 < arrayList15.size()) {
                    }
                    int size32 = arrayList15.size() + this.q0;
                    this.q0 = size32;
                    this.c = size32;
                }
                if (arrayList7 != null) {
                    int i402 = this.q0;
                    this.q0 = i402 + 1;
                    this.y = i402;
                    arrayList11.add(8L);
                    this.A = this.q0;
                    this.F0 = arrayList7;
                    while (i20 < arrayList7.size()) {
                    }
                    int size42 = arrayList7.size() + this.q0;
                    this.q0 = size42;
                    this.B = size42;
                }
            } else if (i24 == 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(i23).getRecentEmojiStatuses();
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet((i24 == 0 || i24 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet != null) {
                    if (i10 != 0) {
                        this.q0++;
                        arrayList11.add(2L);
                    }
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i24 == 0 || i24 == 12) ? MediaDataController.getInstance(i23).getDefaultEmojiStatuses() : MediaDataController.getInstance(i23).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList23 = stickerSet.documents;
                    if (arrayList23 != null && !arrayList23.isEmpty()) {
                        int i41 = 0;
                        while (i41 < Math.min(7, stickerSet.documents.size())) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSet;
                            arrayList13.add(new org.telegram.ui.Components.y5(stickerSet.documents.get(i41), (Paint.FontMetricsInt) null));
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
                                        arrayList13.add(new org.telegram.ui.Components.y5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList24;
                                        size5 = i44;
                                    } else {
                                        if (((org.telegram.ui.Components.y5) arrayList13.get(i43)).getDocumentId() == emojiStatusDocumentId.longValue()) {
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
                                        arrayList13.add(new org.telegram.ui.Components.y5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        defaultEmojiStatuses = arrayList25;
                                        size6 = i47;
                                    } else if (((org.telegram.ui.Components.y5) arrayList13.get(i46)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i46++;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList13.size() <= 40 - i10 || this.y0) {
                        for (int i48 = 0; i48 < arrayList13.size(); i48++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.y5) arrayList13.get(i48)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - i10; i49++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.y5) arrayList13.get(i49)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                        arrayList11.add(Long.valueOf(((((arrayList13.size() - 40) + i10) + 1) * 13) - 5531));
                        h51 h51Var = this.C;
                        if (h51Var != null) {
                            h51Var.a.setText("+" + ((arrayList13.size() - 40) + i10 + 1));
                        }
                        sparseIntArray10.put(this.q0, -1);
                        this.q0++;
                    }
                }
            }
            arrayList19.clear();
            if (i24 != 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                j10 = 13334;
                jh.k7 G = jh.s7.y(i23, false).G(getDialogId(), true);
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
                    int i50 = this.q0;
                    this.q0 = i50 + 1;
                    this.n = i50;
                    arrayList11.add(22L);
                    this.r = this.q0;
                    int size7 = arrayList3.size();
                    int i51 = 0;
                    while (i51 < size7) {
                        Object obj2 = arrayList3.get(i51);
                        i51++;
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
                        this.q0++;
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
                        if (stickerSet2.emojis || this.M) {
                            if (!this.x0.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray7 = sparseIntArray2;
                                sparseIntArray7.put(this.q0, arrayList16.size());
                                sparseIntArray6 = sparseIntArray;
                                sparseIntArray6.put(arrayList16.size(), this.q0);
                                this.q0++;
                                arrayList11.add(Long.valueOf((tL_messages_stickerSet3.set.id * 13) + 9211));
                                org.telegram.ui.Components.rx rxVar3 = new org.telegram.ui.Components.rx();
                                rxVar3.f = true;
                                rxVar3.g = false;
                                rxVar3.h = true;
                                if (i24 == 4) {
                                    rxVar3.e = false;
                                } else {
                                    rxVar3.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                rxVar3.b = tL_messages_stickerSet3.set;
                                rxVar3.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList16.size();
                                arrayList16.add(rxVar3);
                                this.q0 = rxVar3.c.size() + this.q0;
                                for (int i54 = 0; i54 < rxVar3.c.size(); i54++) {
                                    arrayList11.add(Long.valueOf((((TLRPC.Document) rxVar3.c.get(i54)).id * 13) + 3212));
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
            if (!this.M && i24 != 8 && i24 != 13 && i24 != 14) {
                i16 = 0;
                while (i16 < arrayList20.size()) {
                    ArrayList arrayList27 = arrayList20;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList27.get(i16);
                    TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                    int i55 = 0;
                    while (true) {
                        if (i55 < arrayList16.size()) {
                            arrayList5 = arrayList16;
                            if (((org.telegram.ui.Components.rx) arrayList16.get(i55)).b.id == stickerSet3.id) {
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
                                        sparseIntArray14.put(this.q0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.q0);
                                        this.q0++;
                                        SparseIntArray sparseIntArray15 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        rxVar = new org.telegram.ui.Components.rx();
                                        rxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray15;
                                        rxVar.f = this.x0.contains(Long.valueOf(stickerSet3.id));
                                        rxVar.g = true;
                                        if (i24 != 4) {
                                            rxVar.e = false;
                                        } else {
                                            rxVar.e = !z14;
                                        }
                                        rxVar.b = stickerSet3;
                                        rxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        rxVar.h = this.w0.contains(Long.valueOf(rxVar.b.id));
                                        if (rxVar.c.size() > 24 || rxVar.h) {
                                            this.q0 = rxVar.c.size() + this.q0;
                                            for (i17 = 0; i17 < rxVar.c.size(); i17++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) rxVar.c.get(i17)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.q0 += 24;
                                            for (int i56 = 0; i56 < 23; i56++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) rxVar.c.get(i56)).id * 13) + 3212));
                                            }
                                            arrayList11.add(Long.valueOf(((rxVar.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray10.put(this.q0 - 1, arrayList5.size());
                                        }
                                        if (!rxVar.f || i24 == 4) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 5) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 7) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 != 6) {
                                            sparseIntArray5 = sparseIntArray12;
                                            sparseIntArray5.put(this.q0, arrayList5.size());
                                            this.q0++;
                                            arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                            arrayList5.add(rxVar);
                                        } else {
                                            sparseIntArray5 = sparseIntArray12;
                                        }
                                        arrayList5.add(rxVar);
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
                                        rxVar = new org.telegram.ui.Components.rx();
                                        rxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray152;
                                        rxVar.f = this.x0.contains(Long.valueOf(stickerSet3.id));
                                        rxVar.g = true;
                                        if (i24 != 4) {
                                        }
                                        rxVar.b = stickerSet3;
                                        rxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        rxVar.h = this.w0.contains(Long.valueOf(rxVar.b.id));
                                        if (rxVar.c.size() > 24) {
                                        }
                                        this.q0 = rxVar.c.size() + this.q0;
                                        while (i17 < rxVar.c.size()) {
                                        }
                                        if (rxVar.f) {
                                        }
                                        sparseIntArray5 = sparseIntArray12;
                                        arrayList5.add(rxVar);
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
                this.W.p(arrayList4);
            }
            a51Var = this.d0;
            if (z17) {
                a51Var.setItemAnimator(null);
            } else {
                a51Var.setItemAnimator(this.a1);
            }
            if (z12) {
                i15 = 0;
                this.l0.l();
            } else {
                i15 = 0;
                f2.q.c(new org.telegram.ui.Components.mx(this, arrayList12, 2), false).b(this.l0);
            }
            if (a51Var.H1) {
                a51Var.u0(i15);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray8;
        this.a = -1;
        z13 = this.J0;
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
        if (this.K0) {
            int i352 = this.q0;
            this.q0 = i352 + 1;
            this.v = i352;
            arrayList11.add(6L);
        }
        if (i24 != 9) {
        }
        hashSet = new HashSet();
        hashSet.addAll(tL_emojiList2.document_id);
        if (this.N0 == null) {
        }
        arrayList19.clear();
        if (i24 != 0) {
        }
        j10 = 13334;
        jh.k7 G2 = jh.s7.y(i23, false).G(getDialogId(), true);
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
        if (!this.M) {
            i16 = 0;
            while (i16 < arrayList20.size()) {
            }
        }
        arrayList4 = arrayList16;
        if (i24 != 14) {
            this.W.p(arrayList4);
        }
        a51Var = this.d0;
        if (z17) {
        }
        if (z12) {
        }
        if (a51Var.H1) {
        }
    }

    public final void C() {
        u41 u41Var = this.b0;
        if (u41Var == null) {
            return;
        }
        if (this.u1) {
            u41Var.clearAnimation();
            u41Var.setVisibility(0);
            u41Var.animate().translationY(0.0f).start();
            return;
        }
        a51 a51Var = this.d0;
        if (a51Var.getChildCount() <= 0) {
            u41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = a51Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            u41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            u41Var.setVisibility(0);
            u41Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f9) {
        View view = this.i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.jr.g.getInterpolation(i7.w.a((((f9 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.fn fnVar = this.j0;
        if (fnVar != null) {
            float a2 = i7.w.a((((f9 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            fnVar.setAlpha(a2);
            fnVar.setScaleX(a2);
            fnVar.setScaleY(a2 * (n() ? -1 : 1));
        }
        float f10 = 800.0f * f9;
        float f11 = f10 - 40.0f;
        float a10 = i7.w.a(f11 / 700.0f, 0.0f, 1.0f);
        float a11 = i7.w.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a12 = i7.w.a(f11 / 750.0f, 0.0f, 1.0f);
        float a13 = i7.w.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        float interpolation2 = jrVar.getInterpolation(a10);
        float interpolation3 = jrVar.getInterpolation(a11);
        this.U.setAlpha(a13);
        this.b0.setAlpha(a13);
        int i10 = 0;
        for (int i11 = 0; i11 < this.W.b.getChildCount(); i11++) {
            this.W.b.getChildAt(i11).setAlpha(a13);
        }
        if (this.j1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a13;
        x41 x41Var = this.T;
        x41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (fnVar != null) {
            fnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        x41Var.invalidateOutline();
        if (fnVar != null) {
            fnVar.setAlpha(a13);
        }
        v41 v41Var = this.a0;
        v41Var.setAlpha(a13);
        v41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = v41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(x41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(x41Var.getHeight(), 2.0d) + Math.pow(x41Var.getWidth() - pivotX, 2.0d)));
        for (int i12 = 0; i12 < this.W.b.getChildCount(); i12++) {
            View childAt = this.W.b.getChildAt(i12);
            if (f9 == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f9 == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (n()) {
                height = getMeasuredHeight() - height;
            }
            float cascade = AndroidUtilities.cascade(a12, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            a51 a51Var = this.d0;
            if (i10 >= a51Var.getChildCount()) {
                this.g0.invalidate();
                a51Var.invalidate();
                return;
            }
            View childAt2 = a51Var.getChildAt(i10);
            if (childAt2 instanceof m51) {
                m51 m51Var = (m51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a12, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                m51Var.setAnimatedScale(cascade2);
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
        h41 h41Var = this.O1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(h41Var);
                AndroidUtilities.runOnUIThread(h41Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            AndroidUtilities.runOnUIThread(h41Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(h41Var);
                AndroidUtilities.runOnUIThread(h41Var);
                return;
            }
            return;
        }
        l4.x0 x0Var = new l4.x0(18);
        a51 a51Var = this.d0;
        AndroidUtilities.forEachViews((RecyclerView) a51Var, (f5.d) x0Var);
        if (a51Var != null) {
            a51Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.n5 n5Var = this.j1;
        if (n5Var != null && (num = this.U0) != null) {
            Rect bounds = n5Var.getBounds();
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
            float f9 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f9;
            float z10 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.Z0;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.k1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.n5 n5Var2 = this.j1;
            Rect rect = this.k1;
            int i11 = rect.left;
            Rect rect2 = this.k1;
            n5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.j1.draw(canvas);
            org.telegram.ui.Components.n5 n5Var3 = this.j1;
            n5Var3.v = alpha;
            n5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        m51 m51Var = this.n1;
        if (m51Var == null || this.o1 == null || m51Var.A == null) {
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

    public jh.va getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new jh.va(1, 8);
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
    public final void i(int i10, View view) {
        boolean z10;
        int i11;
        int i12;
        Integer num;
        int i13;
        int i14;
        boolean z11;
        int i15 = this.u0.get(i10);
        Integer num2 = null;
        if (i15 >= 0) {
            ArrayList arrayList = this.I0;
            if (i15 < arrayList.size()) {
                org.telegram.ui.Components.rx rxVar = (org.telegram.ui.Components.rx) arrayList.get(i15);
                if (rxVar.h) {
                    return;
                }
                z11 = i15 + 1 == arrayList.size();
                i13 = this.t0.get(i15);
                this.w0.add(Long.valueOf(rxVar.b.id));
                i11 = 24;
                i12 = rxVar.h ? rxVar.c.size() : Math.min(24, rxVar.c.size());
                num = rxVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                rxVar.h = true;
                i14 = rxVar.c.size();
                if (i14 > i12) {
                    num = Integer.valueOf(i13 + 1 + i12);
                    num2 = Integer.valueOf(i14 - i12);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.I1 = view;
                this.J1 = num.intValue();
                this.K1 = num2.intValue() + num.intValue();
                this.L1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.lx(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i15 != -1 || (z10 = this.y0)) {
            return;
        }
        int i16 = (this.a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
        boolean z12 = this.J0;
        int i17 = i16 + (z12 ? 1 : 0);
        ArrayList arrayList2 = this.z0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z12 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.y0 = true;
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
        int i10 = this.S;
        if (i10 == 2) {
            return;
        }
        String q6 = a4.w.q(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(q6, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(q6, i11 + 1).apply();
        }
    }

    public final boolean n() {
        int i10 = this.S;
        return i10 == 5 || i10 == 10 || i10 == 12 || i10 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.G.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.y5 y5Var) {
        l();
        if (y5Var != null) {
            int i10 = this.S;
            if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = y5Var.getDocumentId();
            TLRPC.Document document = y5Var.document;
            int i11 = this.R;
            if (document == null) {
                document = org.telegram.ui.Components.p5.f(i11, y5Var.documentId);
            }
            if (!(view instanceof m51)) {
                p(view, Long.valueOf(y5Var.documentId), document, null, null);
                return;
            }
            final m51 m51Var = (m51) view;
            if (m51Var.v == null && (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10)) {
                MediaDataController.getInstance(i11).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                p(view, Long.valueOf(y5Var.documentId), document, m51Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(m51Var.v)) {
                p(view, Long.valueOf(y5Var.documentId), document2, m51Var.v, null);
                return;
            }
            final a01 a01Var = new a01(this, view, y5Var, document2, m51Var, 1);
            if (this.q1 != null || this.j1 == null) {
                a01Var.run();
                return;
            }
            m51Var.b = true;
            final Rect rect = new Rect();
            x41 x41Var = this.T;
            int left = x41Var.getLeft();
            a51 a51Var = this.d0;
            rect.set(m51Var.getLeft() + a51Var.getLeft() + left, m51Var.getTop() + a51Var.getTop() + x41Var.getTop(), m51Var.getRight() + a51Var.getLeft() + x41Var.getLeft(), m51Var.getBottom() + a51Var.getTop() + x41Var.getTop());
            Drawable drawable = m51Var.A;
            final org.telegram.ui.Components.p5 n10 = drawable instanceof org.telegram.ui.Components.p5 ? org.telegram.ui.Components.p5.n(i11, ((org.telegram.ui.Components.p5) drawable).i(), null, 7) : null;
            this.n1 = m51Var;
            Rect rect2 = new Rect();
            this.o1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.q1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.j41
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.n5 n5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    d61 d61Var = d61.this;
                    d61Var.h1 = 1.0f - ((floatValue * floatValue) * floatValue);
                    d61Var.m1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, d61Var.k1, floatValue, d61Var.o1);
                    float scaleX = m51Var.getScaleX() * Math.max(1.0f, d61Var.p1.getInterpolation(i7.w.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    d61Var.o1.set((int) org.telegram.messenger.x3.A(d61Var.o1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.x3.A(d61Var.o1.height(), 2.0f, scaleX, d61Var.o1.centerY()), (int) u3.c.c(d61Var.o1.width(), 2.0f, scaleX, d61Var.o1.centerX()), (int) u3.c.c(d61Var.o1.height(), 2.0f, scaleX, d61Var.o1.centerY()));
                    d61Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        a01Var.run();
                        if (n10 == null || (n5Var = d61Var.j1) == null) {
                            return;
                        }
                        n5Var.f();
                    }
                }
            });
            this.q1.addListener(new lh.f3(this, zArr, a01Var, 8));
            this.q1.setInterpolator(org.telegram.ui.Components.jr.h);
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
        int i10 = this.R;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.S;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.n5 n5Var = this.j1;
        if (n5Var != null) {
            n5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.E = false;
        int i10 = this.R;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.S;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.n5 n5Var = this.j1;
        if (n5Var != null) {
            n5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.S == 6) {
            this.n0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = this.M0;
        int i12 = this.S;
        if (z10 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), TLObject.FLAG_31));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(t51 t51Var) {
        Integer num = this.U1;
        if (num != null) {
        }
        this.P1 = t51Var;
        boolean z10 = this.M0;
        int i10 = 0;
        a51 a51Var = this.d0;
        if (!z10) {
            h();
            while (i10 < a51Var.getChildCount()) {
                View childAt = a51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i10++;
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
        int i11 = this.S;
        if (i11 == 3 || i11 == 4 || i11 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q1 = ofFloat;
        ofFloat.addUpdateListener(new g41(this, i10));
        this.Q1.addListener(new e50(this, 28));
        h41 h41Var = new h41(this, i10);
        kg.g0.f = true;
        kg.g0.e = true;
        kg.g0.g = false;
        if (kg.g0.d) {
            kg.g0.d = false;
        }
        kg.g0.c = h41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.S1.lock();
        this.Q1.setDuration(800L);
        a51Var.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        this.a0.setLayerType(2, null);
        this.U.setLayerType(2, null);
        org.telegram.ui.Components.fn fnVar = this.j0;
        if (fnVar != null) {
            fnVar.setLayerType(2, null);
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

    public void setBackgroundDelegate(d51 d51Var) {
        this.Q = d51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        cg.i0 i0Var = this.U;
        if (z10) {
            i0Var.setVisibility(0);
        } else {
            i0Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.d0, (f5.d) new l4.x0(13));
            for (int i10 = 0; i10 < this.W.b.getChildCount(); i10++) {
                View childAt = this.W.b.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.W.b.invalidate();
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.K0 = true;
        this.L0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z10) {
        this.N = z10;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.J = drawable;
        m51 m51Var = this.K;
        if (m51Var != null) {
            m51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.d1 = z10;
    }

    public void setOnLongPressedListener(b61 b61Var) {
        this.D = b61Var;
    }

    public void setRecentReactions(List<kg.q0> list) {
        this.N0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.U1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.G;
        hashSet.clear();
        hashSet.add(l10);
        a51 a51Var = this.d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = m51Var.e;
                    if (y5Var != null) {
                        m51Var.d(hashSet.contains(Long.valueOf(y5Var.getDocumentId())), true);
                    } else {
                        m51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            a51Var.invalidate();
        }
    }

    public void setSelectedReaction(kg.q0 q0Var) {
        this.F.clear();
        this.F.add(q0Var);
        a51 a51Var = this.d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    m51Var.d(this.F.contains(m51Var.x), true);
                }
            }
            a51Var.invalidate();
        }
        q41 q41Var = this.e0;
        if (q41Var != null) {
            for (int i11 = 0; i11 < q41Var.getChildCount(); i11++) {
                if (q41Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var2 = (m51) q41Var.getChildAt(i11);
                    m51Var2.d(this.F.contains(m51Var2.x), true);
                }
            }
            q41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<kg.q0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((kg.q0) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((kg.q0) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        h41 h41Var = this.E1;
        if (h41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h41Var);
            this.E1 = null;
        }
        ag.z0 z0Var = this.F1;
        if (z0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z0Var);
            this.F1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        n51 n51Var = this.m0;
        u41 u41Var = this.b0;
        if (isEmpty) {
            this.t1 = false;
            this.u1 = false;
            z(false, z10);
            if (u41Var != null) {
                u41Var.d(true);
                s51.a(u41Var, false);
            }
            n51Var.E(true);
            this.v1 = null;
        } else {
            boolean z12 = this.t1;
            boolean z13 = !z12;
            this.t1 = true;
            this.u1 = false;
            if (u41Var != null) {
                u41Var.f.b(2);
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
                n51Var.E(false);
            } else if (!str.equals(this.v1)) {
                h41 h41Var2 = new h41(this, 1);
                this.E1 = h41Var2;
                AndroidUtilities.runOnUIThread(h41Var2, 120L);
            }
            this.v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            ag.z0 z0Var2 = new ag.z0(this, str, z10, z13, currentKeyboardLanguage, 5);
            this.F1 = z0Var2;
            AndroidUtilities.runOnUIThread(z0Var2, z11 ? 425L : 0L);
            if (u41Var != null) {
                u41Var.f.b(2);
                s51.a(u41Var, z10);
            }
        }
        C();
    }

    public final void w(float f9) {
        ValueAnimator valueAnimator = this.e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.p0.getAlpha(), f9 * 0.25f);
        this.e1 = ofFloat;
        ofFloat.addUpdateListener(new g41(this, 2));
        this.e1.setDuration(200L);
        this.e1.setInterpolator(org.telegram.ui.Components.jr.f);
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
        a51 a51Var = this.d0;
        if (a51Var != null) {
            for (int i10 = 0; i10 < a51Var.getChildCount(); i10++) {
                if (a51Var.getChildAt(i10) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i10);
                    org.telegram.ui.Components.y5 y5Var = m51Var.e;
                    if (y5Var == null || y5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = m51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            m51Var.e(z11, z10);
                        }
                    } else {
                        m51Var.e(z11, z10);
                    }
                }
            }
            a51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.n5 n5Var, View view) {
        Integer num;
        this.i1 = (n5Var == null || (num = n5Var.B) == null) ? 0 : num.intValue();
        this.j1 = n5Var;
        this.l1 = view;
        if (this.E && n5Var != null) {
            n5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.B1 == z10) {
            return;
        }
        this.B1 = z10;
        a51 a51Var = this.d0;
        int i10 = 0;
        a51Var.setVisibility(0);
        q41 q41Var = this.e0;
        q41Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new k41(this, z10, i10));
        this.A1.addListener(new w41(this, z10, i10));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.jr.h);
        this.A1.start();
        b.q(((View) a51Var.getParent()).animate().translationY((this.B1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new g41(this, 1)), org.telegram.ui.Components.jr.f, 160L);
        if (this.B1 && z11) {
            q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public d61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this(o2Var, context, z10, num, i10, z11, c6Var, i11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var));
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
    /* JADX WARN: Removed duplicated region for block: B:177:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d61(org.telegram.ui.ActionBar.o2 o2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12) {
        super(context);
        int i13;
        boolean z12;
        int i14;
        int i15;
        float f9;
        q41 q41Var;
        n31 n31Var;
        int i16;
        int i17;
        int i18;
        boolean z13;
        z41 z41Var;
        int i19;
        boolean z14;
        int i20;
        org.telegram.ui.Components.pv pvVar;
        int i21 = i10;
        int i22 = i12;
        this.F = new HashSet();
        this.G = new HashSet();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.O = new ArrayList();
        this.R = UserConfig.selectedAccount;
        this.V = new org.telegram.ui.Components.tv[2];
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
        this.N1 = new h41(this, 3);
        this.O1 = new h41(this, 4);
        this.S1 = new AnimationNotificationsLocker();
        this.T1 = new Paint();
        this.V0 = c6Var;
        this.S = i21;
        this.J0 = z10;
        this.Y0 = o2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.K0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.b1 = i22;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var));
        paint2.setColor(i0.a.k(i22, 30));
        this.g1 = new PorterDuffColorFilter(i22, PorterDuff.Mode.SRC_IN);
        this.U0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(i7.w.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 7) {
            this.Z0 = i11;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new g0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.i0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            addView(view, i7.f6.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z15 ? -12 : 4), n() ? 0 : this.Z0, 0.0f, n() ? this.Z0 : 0));
        }
        cg.i0 i0Var = new cg.i0(this, context, c6Var, 13);
        this.U = i0Var;
        boolean z16 = i21 == 3 || i21 == 4;
        boolean z17 = z16;
        x41 x41Var = new x41(this, context, z16, z17, c6Var, valueOf);
        Integer num2 = valueOf;
        this.T = x41Var;
        if (!z17) {
            x41Var.setOutlineProvider(new y41(this, num2));
            x41Var.setClipToOutline(true);
            if (z17) {
                x41Var.setElevation(2.0f);
            }
        }
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 15) {
            x41Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        x41Var.addView(i0Var, i7.f6.c(-1.0f, -1));
        addView(x41Var, i7.f6.d(-1, -1.0f, 119, 0.0f, (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 2 || i21 == 7) ? this.Z0 + 6 : 0.0f, 0.0f, n() ? this.Z0 + 6 : 0.0f));
        if (num2 != null) {
            org.telegram.ui.Components.fn fnVar = new org.telegram.ui.Components.fn(context, 22);
            this.j0 = fnVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
            fnVar.setBackground(drawable);
            addView(fnVar, i7.f6.d(17, 9.0f, (n() ? 80 : 48) | 3, (num2.intValue() / AndroidUtilities.density) + (z15 ? -25 : 10), n() ? 0.0f : this.Z0 + 5, 0.0f, n() ? this.Z0 + 14 : 0.0f));
        }
        if (o2Var == null || i21 == 3 || i21 == 6 || i21 == 5 || i21 == 7) {
            i13 = 4;
        } else {
            i13 = 4;
            if (i21 != 4 && i21 != 9 && i21 != 10 && z11) {
                z12 = true;
                i14 = 0;
                while (i14 < 2) {
                    Integer num3 = num2;
                    boolean z18 = i21 != i13;
                    if (i21 != 0 && i21 != 12 && i21 != 9) {
                        if (i21 != 10) {
                            i19 = i14;
                            z14 = false;
                            i20 = i21;
                            z41Var = new z41(this, context, c6Var, z18, z14, i20, !z12 ? new t31(2, this, o2Var) : null, i22, i10);
                            pvVar = z41Var.y;
                            if (pvVar != null) {
                                pvVar.setOnLongClickListener(new w(this, 7));
                            }
                            z41Var.Q = false;
                            if (i20 != i13) {
                                z41Var.setAnimatedEmojiCacheType(13);
                            } else {
                                z41Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
                            }
                            z41Var.K = num3 != null;
                            z41Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                            if (i20 != 14 && i20 != 8 && i20 != 13) {
                                this.T.addView(z41Var, i7.f6.c(36.0f, -1));
                            }
                            this.V[i19] = z41Var;
                            i14 = i19 + 1;
                            i22 = i12;
                            i21 = i20;
                            num2 = num3;
                        }
                    }
                    i19 = i14;
                    z14 = true;
                    i20 = i21;
                    z41Var = new z41(this, context, c6Var, z18, z14, i20, !z12 ? new t31(2, this, o2Var) : null, i22, i10);
                    pvVar = z41Var.y;
                    if (pvVar != null) {
                    }
                    z41Var.Q = false;
                    if (i20 != i13) {
                    }
                    z41Var.K = num3 != null;
                    z41Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                    if (i20 != 14) {
                        this.T.addView(z41Var, i7.f6.c(36.0f, -1));
                    }
                    this.V[i19] = z41Var;
                    i14 = i19 + 1;
                    i22 = i12;
                    i21 = i20;
                    num2 = num3;
                }
                Integer num4 = num2;
                i15 = i21;
                org.telegram.ui.Components.tv[] tvVarArr = this.V;
                this.W = tvVarArr[0];
                tvVarArr[1].setVisibility(8);
                v41 v41Var = new v41(context, num4, 1);
                this.a0 = v41Var;
                v41Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
                if (i15 != 14 || i15 == 8 || i15 == 13) {
                    f9 = 1.0f;
                } else {
                    f9 = 1.0f;
                    this.T.addView(v41Var, i7.f6.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(v41Var, true, f9, false);
                a51 a51Var = new a51(this, context, i15);
                this.d0 = a51Var;
                b51 b51Var = new b51();
                this.a1 = b51Var;
                b51Var.c = 220L;
                b51Var.e = 260L;
                b51Var.f = 160L;
                b51Var.g = 160L;
                b51Var.m = false;
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
                b51Var.i = jrVar;
                b51Var.C = false;
                a51Var.setItemAnimator(b51Var);
                a51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                c51 c51Var = new c51(this);
                this.l0 = c51Var;
                a51Var.setAdapter(c51Var);
                r41 r41Var = new r41(this, 1);
                this.n0 = r41Var;
                a51Var.setLayoutManager(r41Var);
                r41Var.O = new p41(this, 0);
                n31 n31Var2 = new n31(context, 1);
                this.c0 = n31Var2;
                bg.d1 d1Var = new bg.d1(this, context);
                this.g0 = d1Var;
                d1Var.addView(a51Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                n31Var2.addView(d1Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                q41Var = new q41(this, context);
                this.e0 = q41Var;
                if (q41Var.getItemAnimator() == null) {
                    n31Var = n31Var2;
                    q41Var.getItemAnimator().n(180L);
                    q41Var.getItemAnimator().i = jrVar;
                } else {
                    n31Var = n31Var2;
                }
                TextView textView = new TextView(context);
                if (i15 != i13) {
                    textView.setText(LocaleController.getString(R.string.NoEmojiOrStickersFound));
                } else {
                    if (i15 != 0 && i15 != 13 && i15 != 12 && i15 != 11 && i15 != 9) {
                        if (i15 != 10) {
                            if (i15 == 1 || i15 == 2) {
                                textView.setText(LocaleController.getString(R.string.NoReactionsFound));
                            } else if (i15 == 14) {
                                textView.setText(LocaleController.getString(R.string.NoEffectsFound));
                            } else {
                                textView.setText(LocaleController.getString(R.string.NoIconsFound));
                            }
                        }
                    }
                    textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                }
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Le, c6Var));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                this.h0 = t9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.f0 = frameLayout;
                frameLayout.addView(t9Var, i7.f6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                n31 n31Var3 = n31Var;
                n31Var3.addView(frameLayout, i7.f6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                n51 n51Var = new n51(this);
                this.m0 = n51Var;
                q41Var.setAdapter(n51Var);
                r41 r41Var2 = new r41(this, 0);
                q41Var.setLayoutManager(r41Var2);
                r41Var2.O = new p41(this, 1);
                q41Var.setVisibility(8);
                n31Var3.addView(q41Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.T.addView(n31Var3, i7.f6.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                c2.z zVar = new c2.z(a51Var, r41Var);
                this.o0 = zVar;
                zVar.i = new nh.j1(this, 1);
                zVar.h = new i41(this);
                t41 t41Var = new t41(this, i15, context, c6Var, num);
                a51Var.n1(t41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                q41Var.n1(t41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(this, i10, 2);
                a51Var.setOnItemClickListener(nm0Var);
                q41Var.setOnItemClickListener(nm0Var);
                u41 u41Var = new u41(this, context, z11);
                this.b0 = u41Var;
                u41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                u41Var.setVisibility(4);
                n31Var3.addView(u41Var, i7.f6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                v41 v41Var2 = new v41(context, num4, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i23 = org.telegram.ui.ActionBar.g6.G8;
                int multiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent, mode));
                v41Var2.setBackground(drawable2);
                v41Var2.setAlpha(0.0f);
                this.T.addView(v41Var2, i7.f6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.k0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), mode));
                if (i10 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.T.addView(view2, i7.f6.e(-1, 20, 87));
                View view3 = new View(context);
                this.p0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.T.addView(view3, i7.f6.c(-1.0f, -1));
                i16 = this.R;
                if (MediaDataController.getInstance(i16) == null) {
                    MediaDataController.getInstance(i16).checkStickers(5);
                    if (i10 == 14) {
                        MessagesController.getInstance(this.R).getAvailableEffects();
                        i17 = 3;
                    } else if (i10 == 1 || i10 == 11 || i10 == 2 || i10 == 6 || i10 == 13) {
                        i17 = 3;
                        MediaDataController.getInstance(i16).checkReactions();
                    } else if (i10 == 9 || i10 == 10) {
                        i17 = 3;
                        if (MessagesController.getInstance(i16).getMainSettings().getBoolean("resetemojipacks", true)) {
                            MediaDataController.getInstance(i16).loadStickers(5, false, false);
                            MessagesController.getInstance(i16).getMainSettings().edit().putBoolean("resetemojipacks", false).commit();
                        }
                        MediaDataController.getInstance(i16).fetchEmojiStatuses(2, false);
                        MediaDataController.getInstance(i16).loadRestrictedStatusEmojis();
                        MediaDataController.getInstance(i16).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), false);
                    } else if (i10 == 0 || i10 == 12) {
                        i17 = 3;
                        MediaDataController.getInstance(i16).fetchEmojiStatuses(0, true);
                        MediaDataController.getInstance(i16).getStickerSet((TLRPC.InputStickerSet) new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
                    } else {
                        i17 = 3;
                        if (i10 == 3) {
                            MediaDataController.getInstance(i16).checkDefaultTopicIcons();
                        } else if (i10 == 4) {
                            MediaDataController.getInstance(i16).loadRecents(0, false, true, false);
                            MediaDataController.getInstance(i16).checkStickers(0);
                        }
                    }
                    this.R0.setLayerNum(7);
                    i18 = this.S;
                    if (i18 != i17 || i18 == 4 || i18 == 6) {
                        z13 = true;
                    } else {
                        pe.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z13 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z13 = true;
                        }
                        kg.g0.g = z13;
                    }
                    B(z13, false, z13);
                }
                i17 = 3;
                this.R0.setLayerNum(7);
                i18 = this.S;
                if (i18 != i17) {
                }
                z13 = true;
                B(z13, false, z13);
            }
        }
        z12 = false;
        i14 = 0;
        while (i14 < 2) {
        }
        Integer num42 = num2;
        i15 = i21;
        org.telegram.ui.Components.tv[] tvVarArr2 = this.V;
        this.W = tvVarArr2[0];
        tvVarArr2[1].setVisibility(8);
        v41 v41Var3 = new v41(context, num42, 1);
        this.a0 = v41Var3;
        v41Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        if (i15 != 14) {
        }
        f9 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(v41Var3, true, f9, false);
        a51 a51Var2 = new a51(this, context, i15);
        this.d0 = a51Var2;
        b51 b51Var2 = new b51();
        this.a1 = b51Var2;
        b51Var2.c = 220L;
        b51Var2.e = 260L;
        b51Var2.f = 160L;
        b51Var2.g = 160L;
        b51Var2.m = false;
        org.telegram.ui.Components.jr jrVar2 = org.telegram.ui.Components.jr.h;
        b51Var2.i = jrVar2;
        b51Var2.C = false;
        a51Var2.setItemAnimator(b51Var2);
        a51Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        c51 c51Var2 = new c51(this);
        this.l0 = c51Var2;
        a51Var2.setAdapter(c51Var2);
        r41 r41Var3 = new r41(this, 1);
        this.n0 = r41Var3;
        a51Var2.setLayoutManager(r41Var3);
        r41Var3.O = new p41(this, 0);
        n31 n31Var22 = new n31(context, 1);
        this.c0 = n31Var22;
        bg.d1 d1Var2 = new bg.d1(this, context);
        this.g0 = d1Var2;
        d1Var2.addView(a51Var2, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        n31Var22.addView(d1Var2, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        q41Var = new q41(this, context);
        this.e0 = q41Var;
        if (q41Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i15 != i13) {
        }
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Le, c6Var));
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
        this.h0 = t9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        frameLayout2.addView(t9Var2, i7.f6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, i7.f6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        n31 n31Var32 = n31Var;
        n31Var32.addView(frameLayout2, i7.f6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        q41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        n51 n51Var2 = new n51(this);
        this.m0 = n51Var2;
        q41Var.setAdapter(n51Var2);
        r41 r41Var22 = new r41(this, 0);
        q41Var.setLayoutManager(r41Var22);
        r41Var22.O = new p41(this, 1);
        q41Var.setVisibility(8);
        n31Var32.addView(q41Var, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.addView(n31Var32, i7.f6.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        c2.z zVar2 = new c2.z(a51Var2, r41Var3);
        this.o0 = zVar2;
        zVar2.i = new nh.j1(this, 1);
        zVar2.h = new i41(this);
        t41 t41Var2 = new t41(this, i15, context, c6Var, num);
        a51Var2.n1(t41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        q41Var.n1(t41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.nm0 nm0Var2 = new org.telegram.ui.Components.nm0(this, i10, 2);
        a51Var2.setOnItemClickListener(nm0Var2);
        q41Var.setOnItemClickListener(nm0Var2);
        u41 u41Var2 = new u41(this, context, z11);
        this.b0 = u41Var2;
        u41Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        u41Var2.setVisibility(4);
        n31Var32.addView(u41Var2, i7.f6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        v41 v41Var22 = new v41(context, num42, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i232 = org.telegram.ui.ActionBar.g6.G8;
        int multiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i232, c6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable22.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent2, mode2));
        v41Var22.setBackground(drawable22);
        v41Var22.setAlpha(0.0f);
        this.T.addView(v41Var22, i7.f6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.k0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable32.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i232, c6Var), mode2));
        if (i10 == 14) {
        }
        view22.setAlpha(0.0f);
        this.T.addView(view22, i7.f6.e(-1, 20, 87));
        View view32 = new View(context);
        this.p0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.T.addView(view32, i7.f6.c(-1.0f, -1));
        i16 = this.R;
        if (MediaDataController.getInstance(i16) == null) {
        }
        this.R0.setLayerNum(7);
        i18 = this.S;
        if (i18 != i17) {
        }
        z13 = true;
        B(z13, false, z13);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.F.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.F.add(kg.q0.b(str));
        }
        a51 a51Var = this.d0;
        if (a51Var != null) {
            for (int i11 = 0; i11 < a51Var.getChildCount(); i11++) {
                if (a51Var.getChildAt(i11) instanceof m51) {
                    m51 m51Var = (m51) a51Var.getChildAt(i11);
                    m51Var.d(this.F.contains(m51Var.x), true);
                }
            }
            a51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(c61 c61Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void r(m51 m51Var, kg.q0 q0Var) {
    }
}
