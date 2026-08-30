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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class q61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] X1;
    public final ArrayList A0;
    public ArrayList A1;
    public int B;
    public final ArrayList B0;
    public ValueAnimator B1;
    public int C;
    public final ArrayList C0;
    public boolean C1;
    public t51 D;
    public final ArrayList D0;
    public boolean D1;
    public o61 E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public boolean F;
    public final ArrayList F0;
    public r41 F1;
    public HashSet G;
    public ArrayList G0;
    public cg.x0 G1;
    public final HashSet H;
    public final ArrayList H0;
    public boolean H1;
    public final Paint I;
    public ArrayList I0;
    public boolean I1;
    public final Paint J;
    public final ArrayList J0;
    public View J1;
    public Drawable K;
    public final boolean K0;
    public int K1;
    public y51 L;
    public boolean L0;
    public int L1;
    public boolean M;
    public Integer M0;
    public long M1;
    public boolean N;
    public boolean N0;
    public lh.wa N1;
    public boolean O;
    public List O0;
    public final r41 O1;
    public final ArrayList P;
    public y51 P0;
    public final r41 P1;
    public boolean Q;
    public boolean Q0;
    public Runnable Q1;
    public p51 R;
    public float R0;
    public ValueAnimator R1;
    public final int S;
    public final ImageReceiver S0;
    public ValueAnimator S1;
    public final int T;
    public org.telegram.ui.Components.l5 T0;
    public final AnimationNotificationsLocker T1;
    public final j51 U;
    public e51 U0;
    public final Paint U1;
    public final eg.i0 V;
    public final Integer V0;
    public Integer V1;
    public final org.telegram.ui.Components.xv[] W;
    public final org.telegram.ui.ActionBar.f6 W0;
    public float X0;
    public float Y0;
    public final org.telegram.ui.ActionBar.p2 Z0;
    public int a;
    public org.telegram.ui.Components.xv a0;
    public final int a1;
    public int b;
    public final h51 b0;
    public final n51 b1;
    public int c;
    public final g51 c0;
    public final int c1;
    public int d;
    public final a51 d0;
    public boolean d1;
    public int e;
    public final m51 e0;
    public boolean e1;
    public int f;
    public final b51 f0;
    public ValueAnimator f1;
    public final FrameLayout g0;
    public Drawable g1;
    public int h;
    public final ah.d h0;
    public final PorterDuffColorFilter h1;
    public final org.telegram.ui.Components.p9 i0;
    public float i1;
    public final View j0;
    public int j1;
    public final org.telegram.ui.Components.hn k0;
    public org.telegram.ui.Components.j5 k1;
    public final View l0;
    public Rect l1;
    public final o51 m0;
    public View m1;
    public int n;
    public final z51 n0;
    public float n1;
    public final c51 o0;
    public y51 o1;
    public final c2.y p0;
    public Rect p1;
    public final View q0;
    public final OvershootInterpolator q1;
    public int r;
    public int r0;
    public ValueAnimator r1;
    public int s;
    public final ArrayList s0;
    public boolean s1;
    public final SparseIntArray t0;
    public boolean t1;
    public final SparseIntArray u0;
    public boolean u1;
    public int v;
    public final SparseIntArray v0;
    public boolean v1;
    public int w;
    public final SparseIntArray w0;
    public String w1;
    public int x;
    public final ArrayList x0;
    public ArrayList x1;
    public int y;
    public final ArrayList y0;
    public ArrayList y1;
    public boolean z0;
    public ArrayList z1;
    public static final List W1 = Arrays.asList("😖", "😫", "\u1fae0", "😨", "❓");
    public static final boolean[] Y1 = new boolean[4];
    public static final HashMap Z1 = new HashMap();

    public q61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(p2Var, context, z4, num, i10, true, f6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.p9 p9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (p9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            list = W1;
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
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.m6, 0.2f);
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
            p9Var.setLayerNum(7);
            p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            p9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(q61 q61Var, int i10, int i11) {
        c2.y yVar = q61Var.p0;
        c51 c51Var = q61Var.o0;
        View m9 = c51Var.m(i10);
        int L0 = c51Var.L0();
        if ((m9 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            yVar.b = c51Var.L0() < i10 ? 0 : 1;
            yVar.c(i10, i11, false, false);
        } else {
            org.telegram.ui.Components.dx dxVar = new org.telegram.ui.Components.dx(q61Var, q61Var.e0.getContext(), 3);
            dxVar.a = i10;
            dxVar.p = i11;
            c51Var.w0(dxVar);
        }
    }

    public static boolean c(q61 q61Var) {
        if (q61Var.Q) {
            return true;
        }
        ValueAnimator valueAnimator = q61Var.R1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.T;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.l5.g();
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
        if (this.g1 == null) {
            int i10 = this.T;
            if (i10 == 5 || i10 == 9 || i10 == 10 || i10 == 7) {
                this.g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_blocked).mutate();
            } else {
                this.g1 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_settings_premium).mutate();
            }
            this.g1.setColorFilter(this.h1);
        }
        return this.g1;
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
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.l5 l5Var) {
        org.telegram.ui.Components.l5 l5Var2;
        if (this.F && (l5Var2 = this.T0) != l5Var) {
            if (l5Var2 != null) {
                l5Var2.o(this);
            }
            this.T0 = l5Var;
            if (l5Var != null) {
                l5Var.setColorFilter(this.h1);
                this.T0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = Y1;
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
        org.telegram.ui.Components.xw0.u3.fetch(i10, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.nw0
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
                    l5.h(i10).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l10) {
        this.H.remove(l10);
        m51 m51Var = this.e0;
        if (m51Var != null) {
            int i10 = 0;
            boolean z4 = false;
            for (int i11 = 0; i11 < m51Var.getChildCount(); i11++) {
                if (m51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i11);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var == null || u5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = y51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            y51Var.f();
                        }
                    } else {
                        y51Var.f();
                    }
                    z4 = true;
                }
            }
            m51Var.invalidate();
            if (z4) {
                return;
            }
            while (true) {
                ArrayList arrayList = this.s0;
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
            o51 o51Var = this.m0;
            if (o51Var != null) {
                o51Var.m(i10);
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
    public final void B(boolean z4, boolean z10, boolean z11) {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        boolean z12;
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
        m51 m51Var;
        int i15;
        int i16;
        ArrayList arrayList5;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean z13;
        SparseIntArray sparseIntArray3;
        org.telegram.ui.Components.vx vxVar;
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
        boolean z14;
        int i22;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList8;
        boolean z15 = !this.M ? false : z10;
        int i23 = this.S;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i23);
        if (mediaDataController2 == null) {
            return;
        }
        if (z4 || this.I0 == null) {
            this.I0 = new ArrayList(mediaDataController2.getStickerSets(this.N ? 0 : 5));
        }
        ArrayList arrayList9 = this.I0;
        ArrayList arrayList10 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList11 = this.s0;
        ArrayList arrayList12 = new ArrayList(arrayList11);
        this.r0 = 0;
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
        this.B = -1;
        this.C = -1;
        ArrayList arrayList13 = this.A0;
        arrayList13.clear();
        this.H0.clear();
        ArrayList arrayList14 = this.E0;
        arrayList14.clear();
        ArrayList arrayList15 = this.F0;
        arrayList15.clear();
        ArrayList arrayList16 = this.J0;
        arrayList16.clear();
        SparseIntArray sparseIntArray8 = this.t0;
        sparseIntArray8.clear();
        SparseIntArray sparseIntArray9 = this.u0;
        sparseIntArray9.clear();
        SparseIntArray sparseIntArray10 = this.v0;
        sparseIntArray10.clear();
        arrayList11.clear();
        boolean z16 = z15;
        SparseIntArray sparseIntArray11 = this.w0;
        sparseIntArray11.clear();
        this.P.clear();
        ArrayList arrayList17 = this.C0;
        arrayList17.clear();
        SparseIntArray sparseIntArray12 = sparseIntArray11;
        ArrayList arrayList18 = this.D0;
        arrayList18.clear();
        MediaDataController mediaDataController3 = mediaDataController2;
        ArrayList arrayList19 = this.B0;
        arrayList19.clear();
        boolean isEmpty = arrayList9.isEmpty();
        ArrayList arrayList20 = arrayList10;
        int i24 = this.T;
        if (isEmpty) {
            sparseIntArray = sparseIntArray9;
        } else {
            sparseIntArray = sparseIntArray9;
        }
        if (i24 != 5 && i24 != 7 && i24 != 8) {
            int i25 = this.r0;
            sparseIntArray2 = sparseIntArray8;
            this.r0 = i25 + 1;
            this.a = i25;
            arrayList11.add(9L);
            z12 = this.K0;
            if (i24 != 5 || i24 == 7) {
                arrayList = arrayList18;
                i10 = z12 ? 1 : 0;
                if (i10 != 0) {
                    this.r0++;
                    arrayList11.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i23).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i11 = 0;
                    while (i11 < tL_emojiList.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.u5(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList13.size(); i12++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.u5) arrayList13.get(i12)).getDocumentId() * 13) + 43223));
                        this.r0++;
                    }
                }
            } else if (i24 != 4) {
                arrayList = arrayList18;
                i10 = z12 ? 1 : 0;
                if (i24 == 6) {
                    if (i10 != 0) {
                        this.r0++;
                        arrayList11.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i23).getEnabledReactionsList();
                    for (int i26 = 0; i26 < enabledReactionsList.size(); i26++) {
                        arrayList17.add(enabledReactionsList.get(i26).activate_animation);
                    }
                    for (int i27 = 0; i27 < arrayList17.size(); i27++) {
                        arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i27)).id * 13) + 62425));
                        this.r0++;
                    }
                } else if (i24 == 3) {
                    int i28 = this.r0;
                    this.r0 = i28 + 1;
                    this.x = i28;
                    arrayList11.add(12L);
                    int i29 = this.r0;
                    this.r0 = i29 + 1;
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
                            this.r0++;
                            arrayList11.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList21 = tL_messages_stickerSet.documents;
                        if (arrayList21 != null && !arrayList21.isEmpty()) {
                            int i30 = 0;
                            while (i30 < tL_messages_stickerSet.documents.size()) {
                                arrayList13.add(new org.telegram.ui.Components.u5(tL_messages_stickerSet.documents.get(i30), (Paint.FontMetricsInt) null));
                                i30++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i31 = 0; i31 < arrayList13.size(); i31++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.u5) arrayList13.get(i31)).getDocumentId() * 13) + 43223));
                            this.r0++;
                        }
                    }
                }
            } else if (this.N) {
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i23);
                i10 = z12 ? 1 : 0;
                arrayList17.addAll(mediaDataController4.getRecentStickersNoCopy(0));
                int i32 = 0;
                while (i32 < arrayList17.size()) {
                    arrayList11.add(Long.valueOf((((TLRPC.Document) arrayList17.get(i32)).id * 13) + 62425));
                    this.r0++;
                    i32++;
                    arrayList18 = arrayList18;
                }
                arrayList = arrayList18;
            } else {
                arrayList = arrayList18;
                i10 = z12 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.O ? MediaDataController.getInstance(i23).profileAvatarConstructorDefault : MediaDataController.getInstance(i23).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList8 = tL_emojiList3.document_id) != null && !arrayList8.isEmpty()) {
                    org.telegram.ui.Components.vx vxVar2 = new org.telegram.ui.Components.vx();
                    vxVar2.f = true;
                    vxVar2.g = false;
                    vxVar2.h = true;
                    vxVar2.e = true;
                    vxVar2.b = new TLRPC.TL_stickerSet();
                    vxVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList16.size();
                    arrayList16.add(vxVar2);
                    int i33 = 0;
                    while (i33 < tL_emojiList3.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.u5(tL_emojiList3.document_id.get(i33).longValue(), (Paint.FontMetricsInt) null));
                        i33++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.u5) arrayList13.get(i34)).getDocumentId() * 13) + 43223));
                        this.r0++;
                    }
                }
            }
            if (this.L0 && i24 != 13 && i24 != 2 && i24 != 11 && i24 != 3 && i24 != 6 && i24 != 8 && i24 != 4 && i24 != 5 && i24 != 7) {
                int i35 = this.r0;
                this.r0 = i35 + 1;
                this.v = i35;
                arrayList11.add(6L);
            }
            if ((i24 != 9 || i24 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i23).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.O0 == null) {
                this.d = this.r0;
                ArrayList arrayList22 = new ArrayList(this.O0);
                if (i24 == 13 && arrayList22.size() > 8) {
                    arrayList22.subList(8, arrayList22.size()).clear();
                } else if (i24 == 14) {
                    arrayList7 = new ArrayList();
                    int i36 = 0;
                    while (i36 < arrayList22.size()) {
                        if (((mg.q0) arrayList22.get(i36)).e) {
                            arrayList7.add((mg.q0) arrayList22.remove(i36));
                            i36--;
                        }
                        i36++;
                    }
                    if (i24 != 8 || i24 == 11 || i24 == 13) {
                        arrayList14.addAll(arrayList22);
                    } else {
                        for (int i37 = 0; i37 < 16; i37++) {
                            if (!arrayList22.isEmpty()) {
                                arrayList14.add((mg.q0) arrayList22.remove(0));
                            }
                        }
                    }
                    for (i19 = 0; i19 < arrayList14.size(); i19++) {
                        arrayList11 = arrayList11;
                        arrayList11.add(Long.valueOf((((mg.q0) arrayList14.get(i19)).hashCode() * 13) - 5632));
                    }
                    int size2 = arrayList14.size() + this.r0;
                    this.r0 = size2;
                    this.e = size2;
                    if (!arrayList22.isEmpty() && i24 != 8 && i24 != 11 && i24 != 13) {
                        i21 = 0;
                        while (true) {
                            if (i21 < arrayList22.size()) {
                                z14 = true;
                                break;
                            } else {
                                if (((mg.q0) arrayList22.get(i21)).g != 0) {
                                    z14 = false;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (i24 != 14) {
                            if (!z14) {
                                int i38 = this.r0;
                                this.r0 = i38 + 1;
                                this.f = i38;
                                arrayList11.add(4L);
                            } else if (UserConfig.getInstance(i23).isPremium()) {
                                int i39 = this.r0;
                                this.r0 = i39 + 1;
                                this.h = i39;
                                arrayList11.add(5L);
                            }
                        }
                        this.b = this.r0;
                        arrayList15.addAll(arrayList22);
                        for (i22 = 0; i22 < arrayList15.size(); i22++) {
                            arrayList11.add(Long.valueOf((((mg.q0) arrayList15.get(i22)).h * 13) + (z14 ? 4235 : -3142)));
                        }
                        int size3 = arrayList15.size() + this.r0;
                        this.r0 = size3;
                        this.c = size3;
                    }
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        int i40 = this.r0;
                        this.r0 = i40 + 1;
                        this.y = i40;
                        arrayList11.add(8L);
                        this.B = this.r0;
                        this.G0 = arrayList7;
                        for (i20 = 0; i20 < arrayList7.size(); i20++) {
                            arrayList11.add(Long.valueOf(((mg.q0) arrayList7.get(i20)).c * 19));
                        }
                        int size4 = arrayList7.size() + this.r0;
                        this.r0 = size4;
                        this.C = size4;
                    }
                }
                arrayList7 = null;
                if (i24 != 8) {
                }
                arrayList14.addAll(arrayList22);
                while (i19 < arrayList14.size()) {
                }
                int size22 = arrayList14.size() + this.r0;
                this.r0 = size22;
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
                    this.b = this.r0;
                    arrayList15.addAll(arrayList22);
                    while (i22 < arrayList15.size()) {
                    }
                    int size32 = arrayList15.size() + this.r0;
                    this.r0 = size32;
                    this.c = size32;
                }
                if (arrayList7 != null) {
                    int i402 = this.r0;
                    this.r0 = i402 + 1;
                    this.y = i402;
                    arrayList11.add(8L);
                    this.B = this.r0;
                    this.G0 = arrayList7;
                    while (i20 < arrayList7.size()) {
                    }
                    int size42 = arrayList7.size() + this.r0;
                    this.r0 = size42;
                    this.C = size42;
                }
            } else if (i24 == 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(i23).getRecentEmojiStatuses();
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i23).getStickerSet((i24 == 0 || i24 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet != null) {
                    if (i10 != 0) {
                        this.r0++;
                        arrayList11.add(2L);
                    }
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i24 == 0 || i24 == 12) ? MediaDataController.getInstance(i23).getDefaultEmojiStatuses() : MediaDataController.getInstance(i23).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList23 = stickerSet.documents;
                    if (arrayList23 != null && !arrayList23.isEmpty()) {
                        int i41 = 0;
                        while (i41 < Math.min(7, stickerSet.documents.size())) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSet;
                            arrayList13.add(new org.telegram.ui.Components.u5(stickerSet.documents.get(i41), (Paint.FontMetricsInt) null));
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
                                        arrayList13.add(new org.telegram.ui.Components.u5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList24;
                                        size5 = i44;
                                    } else {
                                        if (((org.telegram.ui.Components.u5) arrayList13.get(i43)).getDocumentId() == emojiStatusDocumentId.longValue()) {
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
                                        arrayList13.add(new org.telegram.ui.Components.u5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        defaultEmojiStatuses = arrayList25;
                                        size6 = i47;
                                    } else if (((org.telegram.ui.Components.u5) arrayList13.get(i46)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                        break;
                                    } else {
                                        i46++;
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList13.size() <= 40 - i10 || this.z0) {
                        for (int i48 = 0; i48 < arrayList13.size(); i48++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.u5) arrayList13.get(i48)).getDocumentId() * 13) + 43223));
                            this.r0++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - i10; i49++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.u5) arrayList13.get(i49)).getDocumentId() * 13) + 43223));
                            this.r0++;
                        }
                        arrayList11.add(Long.valueOf(((((arrayList13.size() - 40) + i10) + 1) * 13) - 5531));
                        t51 t51Var = this.D;
                        if (t51Var != null) {
                            t51Var.a.setText("+" + ((arrayList13.size() - 40) + i10 + 1));
                        }
                        sparseIntArray10.put(this.r0, -1);
                        this.r0++;
                    }
                }
            }
            arrayList19.clear();
            if (i24 != 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                j10 = 13334;
                lh.l7 G = lh.t7.y(i23, false).G(getDialogId(), true);
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
                    int i50 = this.r0;
                    this.r0 = i50 + 1;
                    this.n = i50;
                    arrayList11.add(22L);
                    this.r = this.r0;
                    int size7 = arrayList3.size();
                    int i51 = 0;
                    while (i51 < size7) {
                        Object obj2 = arrayList3.get(i51);
                        i51++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        arrayList11.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.r0++;
                        arrayList19.add(tL_starGiftUnique);
                    }
                    j11 = 322;
                    this.s = this.r0;
                    this.a0.l(true);
                } else {
                    j11 = 322;
                    this.a0.l(false);
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
                        this.r0++;
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
                        if (stickerSet2.emojis || this.N) {
                            if (!this.y0.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray7 = sparseIntArray2;
                                sparseIntArray7.put(this.r0, arrayList16.size());
                                sparseIntArray6 = sparseIntArray;
                                sparseIntArray6.put(arrayList16.size(), this.r0);
                                this.r0++;
                                arrayList11.add(Long.valueOf((tL_messages_stickerSet3.set.id * 13) + 9211));
                                org.telegram.ui.Components.vx vxVar3 = new org.telegram.ui.Components.vx();
                                vxVar3.f = true;
                                vxVar3.g = false;
                                vxVar3.h = true;
                                if (i24 == 4) {
                                    vxVar3.e = false;
                                } else {
                                    vxVar3.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                vxVar3.b = tL_messages_stickerSet3.set;
                                vxVar3.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList16.size();
                                arrayList16.add(vxVar3);
                                this.r0 = vxVar3.c.size() + this.r0;
                                for (int i54 = 0; i54 < vxVar3.c.size(); i54++) {
                                    arrayList11.add(Long.valueOf((((TLRPC.Document) vxVar3.c.get(i54)).id * 13) + 3212));
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
            if (!this.N && i24 != 8 && i24 != 13 && i24 != 14) {
                i16 = 0;
                while (i16 < arrayList20.size()) {
                    ArrayList arrayList27 = arrayList20;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList27.get(i16);
                    TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                    int i55 = 0;
                    while (true) {
                        if (i55 < arrayList16.size()) {
                            arrayList5 = arrayList16;
                            if (((org.telegram.ui.Components.vx) arrayList16.get(i55)).b.id == stickerSet3.id) {
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
                                    z13 = MessageObject.isPremiumEmojiPack(stickerSet4);
                                    arrayList6 = arrayList28;
                                    inputStickerSet = null;
                                    if (arrayList6 != null && ((!(i24 == 5 || i24 == 7) || (!arrayList6.isEmpty() && MessageObject.isTextColorEmoji(arrayList6.get(0)))) && (!(i24 == 10 || i24 == 9) || stickerSet3.channel_emoji_status))) {
                                        arrayList20 = arrayList27;
                                        sparseIntArray14.put(this.r0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.r0);
                                        this.r0++;
                                        SparseIntArray sparseIntArray15 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        vxVar = new org.telegram.ui.Components.vx();
                                        vxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray15;
                                        vxVar.f = this.y0.contains(Long.valueOf(stickerSet3.id));
                                        vxVar.g = true;
                                        if (i24 != 4) {
                                            vxVar.e = false;
                                        } else {
                                            vxVar.e = !z13;
                                        }
                                        vxVar.b = stickerSet3;
                                        vxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        vxVar.h = this.x0.contains(Long.valueOf(vxVar.b.id));
                                        if (vxVar.c.size() > 24 || vxVar.h) {
                                            this.r0 = vxVar.c.size() + this.r0;
                                            for (i17 = 0; i17 < vxVar.c.size(); i17++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) vxVar.c.get(i17)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.r0 += 24;
                                            for (int i56 = 0; i56 < 23; i56++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) vxVar.c.get(i56)).id * 13) + 3212));
                                            }
                                            arrayList11.add(Long.valueOf(((vxVar.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray10.put(this.r0 - 1, arrayList5.size());
                                        }
                                        if (!vxVar.f || i24 == 4) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 5) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 == 7) {
                                            sparseIntArray5 = sparseIntArray12;
                                        } else if (i24 != 6) {
                                            sparseIntArray5 = sparseIntArray12;
                                            sparseIntArray5.put(this.r0, arrayList5.size());
                                            this.r0++;
                                            arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                            arrayList5.add(vxVar);
                                        } else {
                                            sparseIntArray5 = sparseIntArray12;
                                        }
                                        arrayList5.add(vxVar);
                                    } else {
                                        arrayList20 = arrayList27;
                                        sparseIntArray4 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        sparseIntArray5 = sparseIntArray12;
                                    }
                                } else {
                                    inputStickerSet = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                    arrayList6 = new ArrayList<>();
                                    z13 = true;
                                    if (arrayList6 != null) {
                                        arrayList20 = arrayList27;
                                        sparseIntArray14.put(this.r0, arrayList5.size());
                                        sparseIntArray13.put(arrayList5.size(), this.r0);
                                        this.r0++;
                                        SparseIntArray sparseIntArray152 = sparseIntArray14;
                                        sparseIntArray3 = sparseIntArray13;
                                        arrayList11.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                        vxVar = new org.telegram.ui.Components.vx();
                                        vxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray152;
                                        vxVar.f = this.y0.contains(Long.valueOf(stickerSet3.id));
                                        vxVar.g = true;
                                        if (i24 != 4) {
                                        }
                                        vxVar.b = stickerSet3;
                                        vxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        vxVar.h = this.x0.contains(Long.valueOf(vxVar.b.id));
                                        if (vxVar.c.size() > 24) {
                                        }
                                        this.r0 = vxVar.c.size() + this.r0;
                                        while (i17 < vxVar.c.size()) {
                                        }
                                        if (vxVar.f) {
                                        }
                                        sparseIntArray5 = sparseIntArray12;
                                        arrayList5.add(vxVar);
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
                                    z13 = MessageObject.isPremiumEmojiPack(stickerSetCovered);
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
                                    z13 = false;
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
                this.a0.p(arrayList4);
            }
            m51Var = this.e0;
            if (z16) {
                m51Var.setItemAnimator(null);
            } else {
                m51Var.setItemAnimator(this.b1);
            }
            if (z11) {
                i15 = 0;
                this.m0.l();
            } else {
                i15 = 0;
                f2.q.c(new bg.a(this, arrayList12, 3), false).b(this.m0);
            }
            if (m51Var.I1) {
                m51Var.u0(i15);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray8;
        this.a = -1;
        z12 = this.K0;
        if (i24 != 5) {
        }
        arrayList = arrayList18;
        i10 = z12 ? 1 : 0;
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
        if (this.L0) {
            int i352 = this.r0;
            this.r0 = i352 + 1;
            this.v = i352;
            arrayList11.add(6L);
        }
        if (i24 != 9) {
        }
        hashSet = new HashSet();
        hashSet.addAll(tL_emojiList2.document_id);
        if (this.O0 == null) {
        }
        arrayList19.clear();
        if (i24 != 0) {
        }
        j10 = 13334;
        lh.l7 G2 = lh.t7.y(i23, false).G(getDialogId(), true);
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
        if (!this.N) {
            i16 = 0;
            while (i16 < arrayList20.size()) {
            }
        }
        arrayList4 = arrayList16;
        if (i24 != 14) {
            this.a0.p(arrayList4);
        }
        m51Var = this.e0;
        if (z16) {
        }
        if (z11) {
        }
        if (m51Var.I1) {
        }
    }

    public final void C() {
        g51 g51Var = this.c0;
        if (g51Var == null) {
            return;
        }
        if (this.v1) {
            g51Var.clearAnimation();
            g51Var.setVisibility(0);
            g51Var.animate().translationY(0.0f).start();
            return;
        }
        m51 m51Var = this.e0;
        if (m51Var.getChildCount() <= 0) {
            g51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = m51Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            g51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            g51Var.setVisibility(0);
            g51Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.j0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.nr.g.getInterpolation(k7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.hn hnVar = this.k0;
        if (hnVar != null) {
            float a2 = k7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            hnVar.setAlpha(a2);
            hnVar.setScaleX(a2);
            hnVar.setScaleY(a2 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a10 = k7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a11 = k7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a12 = k7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a13 = k7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        float interpolation2 = nrVar.getInterpolation(a10);
        float interpolation3 = nrVar.getInterpolation(a11);
        this.V.setAlpha(a13);
        this.c0.setAlpha(a13);
        int i10 = 0;
        for (int i11 = 0; i11 < this.a0.b.getChildCount(); i11++) {
            this.a0.b.getChildAt(i11).setAlpha(a13);
        }
        if (this.k1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a13;
        j51 j51Var = this.U;
        j51Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (hnVar != null) {
            hnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.X0 = (interpolation2 * 0.85f) + 0.15f;
        this.Y0 = (interpolation3 * 0.925f) + 0.075f;
        j51Var.invalidateOutline();
        if (hnVar != null) {
            hnVar.setAlpha(a13);
        }
        h51 h51Var = this.b0;
        h51Var.setAlpha(a13);
        h51Var.setScaleX(Math.min(this.X0, 1.0f));
        float pivotX = h51Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(j51Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(j51Var.getHeight(), 2.0d) + Math.pow(j51Var.getWidth() - pivotX, 2.0d)));
        for (int i12 = 0; i12 < this.a0.b.getChildCount(); i12++) {
            View childAt = this.a0.b.getChildAt(i12);
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
            float cascade = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            m51 m51Var = this.e0;
            if (i10 >= m51Var.getChildCount()) {
                this.h0.invalidate();
                m51Var.invalidate();
                return;
            }
            View childAt2 = m51Var.getChildAt(i10);
            if (childAt2 instanceof y51) {
                y51 y51Var = (y51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a12, (float) Math.sqrt(e2.c.u(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                y51Var.setAnimatedScale(cascade2);
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
        r41 r41Var = this.P1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.N)) {
                AndroidUtilities.cancelRunOnUIThread(r41Var);
                AndroidUtilities.runOnUIThread(r41Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            AndroidUtilities.runOnUIThread(r41Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.S).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(r41Var);
                AndroidUtilities.runOnUIThread(r41Var);
                return;
            }
            return;
        }
        nh.e eVar = new nh.e(19);
        m51 m51Var = this.e0;
        AndroidUtilities.forEachViews((RecyclerView) m51Var, (h5.d) eVar);
        if (m51Var != null) {
            m51Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.j5 j5Var = this.k1;
        if (j5Var != null && (num = this.V0) != null) {
            Rect bounds = j5Var.getBounds();
            View view = this.m1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.k1.getAlpha();
            View view2 = this.m1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.k1.v = (int) (Math.pow(this.U.getAlpha(), 0.25d) * alpha * this.i1);
            if (this.l1 == null) {
                this.l1 = new Rect();
            }
            float f10 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f10;
            float w10 = e2.c.w(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.a1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + w10 + (!n10 ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.l1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.j5 j5Var2 = this.k1;
            Rect rect = this.l1;
            int i11 = rect.left;
            Rect rect2 = this.l1;
            j5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.l1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.k1.draw(canvas);
            org.telegram.ui.Components.j5 j5Var3 = this.k1;
            j5Var3.v = alpha;
            j5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y51 y51Var = this.o1;
        if (y51Var == null || this.p1 == null || y51Var.B == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.o1.B.setAlpha((int) (this.n1 * 255.0f));
        this.o1.B.setBounds(this.p1);
        this.o1.B.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.i1, this.c1, this.j1), PorterDuff.Mode.SRC_IN));
        this.o1.B.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.L1 - this.K1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.L1 - this.K1) * 25) + f() + 16;
    }

    public lh.wa getCollectionParticles() {
        if (this.N1 == null) {
            this.N1 = new lh.wa(1, 8);
        }
        return this.N1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.S).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.C1 ? this.f0 : this.e0).canScrollVertically(1);
        if (canScrollVertically != this.s1) {
            this.s1 = canScrollVertically;
            this.l0.animate().alpha(canScrollVertically ? 1.0f : 0.0f).setDuration(200L).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(int i10, View view) {
        boolean z4;
        int i11;
        int i12;
        Integer num;
        int i13;
        int i14;
        boolean z10;
        int i15 = this.v0.get(i10);
        Integer num2 = null;
        if (i15 >= 0) {
            ArrayList arrayList = this.J0;
            if (i15 < arrayList.size()) {
                org.telegram.ui.Components.vx vxVar = (org.telegram.ui.Components.vx) arrayList.get(i15);
                if (vxVar.h) {
                    return;
                }
                z10 = i15 + 1 == arrayList.size();
                i13 = this.u0.get(i15);
                this.x0.add(Long.valueOf(vxVar.b.id));
                i11 = 24;
                i12 = vxVar.h ? vxVar.c.size() : Math.min(24, vxVar.c.size());
                num = vxVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                vxVar.h = true;
                i14 = vxVar.c.size();
                if (i14 > i12) {
                    num = Integer.valueOf(i13 + 1 + i12);
                    num2 = Integer.valueOf(i14 - i12);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.J1 = view;
                this.K1 = num.intValue();
                this.L1 = num2.intValue() + num.intValue();
                this.M1 = SystemClock.elapsedRealtime();
                if (z10) {
                    post(new org.telegram.ui.Components.qx(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i15 != -1 || (z4 = this.z0)) {
            return;
        }
        int i16 = (this.a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
        boolean z11 = this.K0;
        int i17 = i16 + (z11 ? 1 : 0);
        ArrayList arrayList2 = this.A0;
        int size = z4 ? arrayList2.size() : Math.min(38 - (z11 ? 1 : 0), arrayList2.size());
        int size2 = arrayList2.size();
        this.z0 = true;
        i11 = 40;
        i12 = size;
        num = null;
        i13 = i17;
        i14 = size2;
        z10 = false;
        if (i14 > i12) {
        }
        B(false, true, true);
        if (num != null) {
        }
    }

    public final void l() {
        int i10 = this.T;
        if (i10 == 2) {
            return;
        }
        String r10 = android.support.v4.media.a.r(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(r10, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(r10, i11 + 1).apply();
        }
    }

    public final boolean n() {
        int i10 = this.T;
        return i10 == 5 || i10 == 10 || i10 == 12 || i10 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.H.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.u5 u5Var) {
        l();
        if (u5Var != null) {
            int i10 = this.T;
            if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = u5Var.getDocumentId();
            TLRPC.Document document = u5Var.document;
            int i11 = this.S;
            if (document == null) {
                document = org.telegram.ui.Components.l5.f(i11, u5Var.documentId);
            }
            if (!(view instanceof y51)) {
                p(view, Long.valueOf(u5Var.documentId), document, null, null);
                return;
            }
            final y51 y51Var = (y51) view;
            if (y51Var.v == null && (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10)) {
                MediaDataController.getInstance(i11).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                p(view, Long.valueOf(u5Var.documentId), document, y51Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(y51Var.v)) {
                p(view, Long.valueOf(u5Var.documentId), document2, y51Var.v, null);
                return;
            }
            final org.telegram.ui.Components.jy0 jy0Var = new org.telegram.ui.Components.jy0(this, view, u5Var, document2, y51Var, 29);
            if (this.r1 != null || this.k1 == null) {
                jy0Var.run();
                return;
            }
            y51Var.b = true;
            final Rect rect = new Rect();
            j51 j51Var = this.U;
            int left = j51Var.getLeft();
            m51 m51Var = this.e0;
            rect.set(y51Var.getLeft() + m51Var.getLeft() + left, y51Var.getTop() + m51Var.getTop() + j51Var.getTop(), y51Var.getRight() + m51Var.getLeft() + j51Var.getLeft(), y51Var.getBottom() + m51Var.getTop() + j51Var.getTop());
            Drawable drawable = y51Var.B;
            final org.telegram.ui.Components.l5 n10 = drawable instanceof org.telegram.ui.Components.l5 ? org.telegram.ui.Components.l5.n(i11, ((org.telegram.ui.Components.l5) drawable).i(), null, 7) : null;
            this.o1 = y51Var;
            Rect rect2 = new Rect();
            this.p1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.r1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.t41
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.j5 j5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    q61 q61Var = q61.this;
                    q61Var.i1 = 1.0f - ((floatValue * floatValue) * floatValue);
                    q61Var.n1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, q61Var.l1, floatValue, q61Var.p1);
                    float scaleX = y51Var.getScaleX() * Math.max(1.0f, q61Var.q1.getInterpolation(k7.n.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    q61Var.p1.set((int) org.telegram.messenger.y3.A(q61Var.p1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.y3.A(q61Var.p1.height(), 2.0f, scaleX, q61Var.p1.centerY()), (int) vh.v2.c(q61Var.p1.width(), 2.0f, scaleX, q61Var.p1.centerX()), (int) vh.v2.c(q61Var.p1.height(), 2.0f, scaleX, q61Var.p1.centerY()));
                    q61Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        jy0Var.run();
                        if (n10 == null || (j5Var = q61Var.k1) == null) {
                            return;
                        }
                        j5Var.f();
                    }
                }
            });
            this.r1.addListener(new nh.g3(this, zArr, jy0Var, 8));
            this.r1.setInterpolator(org.telegram.ui.Components.nr.h);
            this.r1.setDuration(260L);
            this.r1.start();
            return;
        }
        p(view, null, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.k1;
        if (j5Var != null) {
            j5Var.n = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.F = false;
        int i10 = this.S;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.featuredEmojiDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentEmojiStatusesUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        int i11 = this.T;
        if (i11 == 0 || i11 == 12) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        }
        org.telegram.ui.Components.j5 j5Var = this.k1;
        if (j5Var != null) {
            j5Var.n = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4 && this.T == 6) {
            this.o0.y1((getMeasuredWidth() / AndroidUtilities.dp(42.0f)) * 5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4 = this.N0;
        int i12 = this.T;
        if (z4 && i12 != 3 && i12 != 4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f), TLObject.FLAG_31));
        } else if (i12 == 6) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.35f), TLObject.FLAG_31));
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public abstract void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    public final void s(f61 f61Var) {
        Integer num = this.V1;
        if (num != null) {
        }
        this.Q1 = f61Var;
        boolean z4 = this.N0;
        int i10 = 0;
        m51 m51Var = this.e0;
        if (!z4) {
            h();
            while (i10 < m51Var.getChildCount()) {
                View childAt = m51Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i10++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.R1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R1 = null;
        }
        ValueAnimator valueAnimator2 = this.S1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.S1 = null;
        }
        int i11 = this.T;
        if (i11 == 3 || i11 == 4 || i11 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R1 = ofFloat;
        ofFloat.addUpdateListener(new q41(this, i10));
        this.R1.addListener(new ls0(this, 19));
        r41 r41Var = new r41(this, i10);
        mg.g0.f = true;
        mg.g0.e = true;
        mg.g0.g = false;
        if (mg.g0.d) {
            mg.g0.d = false;
        }
        mg.g0.c = r41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.T1.lock();
        this.R1.setDuration(800L);
        m51Var.setLayerType(2, null);
        this.c0.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        this.V.setLayerType(2, null);
        org.telegram.ui.Components.hn hnVar = this.k0;
        if (hnVar != null) {
            hnVar.setLayerType(2, null);
        }
        View view = this.j0;
        if (view != null) {
            view.setLayerType(2, null);
        }
        this.a0.m(true);
        E(0.0f);
    }

    public void setAnimationsEnabled(boolean z4) {
        this.M = z4;
    }

    public void setBackgroundDelegate(p51 p51Var) {
        this.R = p51Var;
    }

    public void setDrawBackground(boolean z4) {
        this.N0 = z4;
        this.U.setClipToOutline(z4);
        eg.i0 i0Var = this.V;
        if (z4) {
            i0Var.setVisibility(0);
        } else {
            i0Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z4) {
        if (this.Q != z4) {
            this.Q = z4;
            if (z4) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.e0, (h5.d) new nh.e(14));
            for (int i10 = 0; i10 < this.a0.b.getChildCount(); i10++) {
                View childAt = this.a0.b.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            this.a0.b.invalidate();
        }
    }

    public void setExpireDateHint(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.L0 = true;
        this.M0 = Integer.valueOf(i10);
        B(true, false, true);
    }

    public void setForUser(boolean z4) {
        this.O = z4;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.K = drawable;
        y51 y51Var = this.L;
        if (y51Var != null) {
            y51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z4) {
        this.e1 = z4;
    }

    public void setOnLongPressedListener(o61 o61Var) {
        this.E = o61Var;
    }

    public void setRecentReactions(List<mg.q0> list) {
        this.O0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.V1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l10) {
        HashSet hashSet = this.H;
        hashSet.clear();
        hashSet.add(l10);
        m51 m51Var = this.e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var != null) {
                        y51Var.d(hashSet.contains(Long.valueOf(u5Var.getDocumentId())), true);
                    } else {
                        y51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            m51Var.invalidate();
        }
    }

    public void setSelectedReaction(mg.q0 q0Var) {
        this.G.clear();
        this.G.add(q0Var);
        m51 m51Var = this.e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    y51Var.d(this.G.contains(y51Var.x), true);
                }
            }
            m51Var.invalidate();
        }
        b51 b51Var = this.f0;
        if (b51Var != null) {
            for (int i11 = 0; i11 < b51Var.getChildCount(); i11++) {
                if (b51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var2 = (y51) b51Var.getChildAt(i11);
                    y51Var2.d(this.G.contains(y51Var2.x), true);
                }
            }
            b51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<mg.q0> hashSet) {
        this.G = hashSet;
        HashSet hashSet2 = this.H;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((mg.q0) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((mg.q0) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z4, boolean z10) {
        r41 r41Var = this.F1;
        if (r41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r41Var);
            this.F1 = null;
        }
        cg.x0 x0Var = this.G1;
        if (x0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x0Var);
            this.G1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        z51 z51Var = this.n0;
        g51 g51Var = this.c0;
        if (isEmpty) {
            this.u1 = false;
            this.v1 = false;
            z(false, z4);
            if (g51Var != null) {
                g51Var.d(true);
                e61.a(g51Var, false);
            }
            z51Var.E(true);
            this.w1 = null;
        } else {
            boolean z11 = this.u1;
            boolean z12 = !z11;
            this.u1 = true;
            this.v1 = false;
            if (g51Var != null) {
                g51Var.f.b(2);
            }
            if (!z11) {
                ArrayList arrayList = this.x1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.y1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.A1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                z51Var.E(false);
            } else if (!str.equals(this.w1)) {
                r41 r41Var2 = new r41(this, 1);
                this.F1 = r41Var2;
                AndroidUtilities.runOnUIThread(r41Var2, 120L);
            }
            this.w1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, X1)) {
                MediaDataController.getInstance(this.S).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            X1 = currentKeyboardLanguage;
            cg.x0 x0Var2 = new cg.x0(this, str, z4, z12, currentKeyboardLanguage, 5);
            this.G1 = x0Var2;
            AndroidUtilities.runOnUIThread(x0Var2, z10 ? 425L : 0L);
            if (g51Var != null) {
                g51Var.f.b(2);
                e61.a(g51Var, z4);
            }
        }
        C();
    }

    public final void w(float f10) {
        ValueAnimator valueAnimator = this.f1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q0.getAlpha(), f10 * 0.25f);
        this.f1 = ofFloat;
        ofFloat.addUpdateListener(new q41(this, 2));
        this.f1.setDuration(200L);
        this.f1.setInterpolator(org.telegram.ui.Components.nr.f);
        this.f1.start();
    }

    public final void x(Long l10, boolean z4) {
        boolean z10;
        HashSet hashSet = this.H;
        if (hashSet.contains(l10)) {
            hashSet.remove(l10);
            z10 = false;
        } else {
            hashSet.add(l10);
            z10 = true;
        }
        m51 m51Var = this.e0;
        if (m51Var != null) {
            for (int i10 = 0; i10 < m51Var.getChildCount(); i10++) {
                if (m51Var.getChildAt(i10) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i10);
                    org.telegram.ui.Components.u5 u5Var = y51Var.e;
                    if (u5Var == null || u5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = y51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            y51Var.e(z10, z4);
                        }
                    } else {
                        y51Var.e(z10, z4);
                    }
                }
            }
            m51Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.j5 j5Var, View view) {
        Integer num;
        this.j1 = (j5Var == null || (num = j5Var.C) == null) ? 0 : num.intValue();
        this.k1 = j5Var;
        this.m1 = view;
        if (this.F && j5Var != null) {
            j5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z4, boolean z10) {
        if (this.C1 == z4) {
            return;
        }
        this.C1 = z4;
        m51 m51Var = this.e0;
        int i10 = 0;
        m51Var.setVisibility(0);
        b51 b51Var = this.f0;
        b51Var.setVisibility(0);
        ValueAnimator valueAnimator = this.B1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.E1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.E1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B1 = ofFloat;
        ofFloat.addUpdateListener(new u41(this, z4, i10));
        this.B1.addListener(new i51(this, z4, i10));
        this.B1.setDuration(320L);
        this.B1.setInterpolator(org.telegram.ui.Components.nr.h);
        this.B1.start();
        b.p(((View) m51Var.getParent()).animate().translationY((this.C1 && z10) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new q41(this, 1)), org.telegram.ui.Components.nr.f, 160L);
        if (this.C1 && z10) {
            b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public q61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(p2Var, context, z4, num, i10, z10, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d0  */
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
    public q61(org.telegram.ui.ActionBar.p2 p2Var, Context context, boolean z4, Integer num, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context);
        int i13;
        boolean z11;
        int i14;
        int i15;
        float f10;
        b51 b51Var;
        a51 a51Var;
        int i16;
        int i17;
        int i18;
        boolean z12;
        l51 l51Var;
        int i19;
        boolean z13;
        int i20;
        org.telegram.ui.Components.tv tvVar;
        int i21 = i10;
        int i22 = i12;
        this.G = new HashSet();
        this.H = new HashSet();
        Paint paint = new Paint(1);
        this.I = paint;
        Paint paint2 = new Paint(1);
        this.J = paint2;
        this.P = new ArrayList();
        this.S = UserConfig.selectedAccount;
        this.W = new org.telegram.ui.Components.xv[2];
        this.s0 = new ArrayList();
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new SparseIntArray();
        this.w0 = new SparseIntArray();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = false;
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = false;
        this.L0 = false;
        this.N0 = true;
        this.S0 = new ImageReceiver();
        this.e1 = true;
        this.i1 = 1.0f;
        this.n1 = 1.0f;
        this.q1 = new OvershootInterpolator(2.0f);
        this.s1 = false;
        this.t1 = false;
        this.u1 = false;
        this.v1 = false;
        this.C1 = false;
        this.D1 = false;
        this.H1 = false;
        this.I1 = false;
        this.K1 = -1;
        this.L1 = -1;
        this.M1 = -1L;
        this.O1 = new r41(this, 3);
        this.P1 = new r41(this, 4);
        this.T1 = new AnimationNotificationsLocker();
        this.U1 = new Paint();
        this.W0 = f6Var;
        this.T = i21;
        this.K0 = z4;
        this.Z0 = p2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb = new StringBuilder("emoji");
        sb.append((i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) ? "status" : "reaction");
        sb.append("usehint");
        this.L0 = globalMainSettings.getInt(sb.toString(), 0) < 3;
        this.c1 = i22;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
        paint2.setColor(i0.a.k(i22, 30));
        this.h1 = new PorterDuffColorFilter(i22, PorterDuff.Mode.SRC_IN);
        this.V0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(k7.n.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z14 = valueOf != null && valueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 7) {
            this.a1 = i11;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new f0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.j0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            addView(view, k7.b6.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z14 ? -12 : 4), n() ? 0 : this.a1, 0.0f, n() ? this.a1 : 0));
        }
        eg.i0 i0Var = new eg.i0(this, context, f6Var, 12);
        this.V = i0Var;
        boolean z15 = i21 == 3 || i21 == 4;
        boolean z16 = z15;
        j51 j51Var = new j51(this, context, z15, z16, f6Var, valueOf);
        Integer num2 = valueOf;
        this.U = j51Var;
        if (!z16) {
            j51Var.setOutlineProvider(new k51(this, num2));
            j51Var.setClipToOutline(true);
            if (z16) {
                j51Var.setElevation(2.0f);
            }
        }
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 15) {
            j51Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        j51Var.addView(i0Var, k7.b6.c(-1.0f, -1));
        addView(j51Var, k7.b6.d(-1, -1.0f, 119, 0.0f, (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 2 || i21 == 7) ? this.a1 + 6 : 0.0f, 0.0f, n() ? this.a1 + 6 : 0.0f));
        if (num2 != null) {
            org.telegram.ui.Components.hn hnVar = new org.telegram.ui.Components.hn(context, 21);
            this.k0 = hnVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
            hnVar.setBackground(drawable);
            addView(hnVar, k7.b6.d(17, 9.0f, (n() ? 80 : 48) | 3, (num2.intValue() / AndroidUtilities.density) + (z14 ? -25 : 10), n() ? 0.0f : this.a1 + 5, 0.0f, n() ? this.a1 + 14 : 0.0f));
        }
        if (p2Var == null || i21 == 3 || i21 == 6 || i21 == 5 || i21 == 7) {
            i13 = 4;
        } else {
            i13 = 4;
            if (i21 != 4 && i21 != 9 && i21 != 10 && z10) {
                z11 = true;
                i14 = 0;
                while (i14 < 2) {
                    Integer num3 = num2;
                    boolean z17 = i21 != i13;
                    if (i21 != 0 && i21 != 12 && i21 != 9) {
                        if (i21 != 10) {
                            i19 = i14;
                            z13 = false;
                            i20 = i21;
                            l51Var = new l51(this, context, f6Var, z17, z13, i20, !z11 ? new l01(11, this, p2Var) : null, i22, i10);
                            tvVar = l51Var.y;
                            if (tvVar != null) {
                                tvVar.setOnLongClickListener(new w(this, 7));
                            }
                            l51Var.R = false;
                            if (i20 != i13) {
                                l51Var.setAnimatedEmojiCacheType(13);
                            } else {
                                l51Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
                            }
                            l51Var.L = num3 != null;
                            l51Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                            if (i20 != 14 && i20 != 8 && i20 != 13) {
                                this.U.addView(l51Var, k7.b6.c(36.0f, -1));
                            }
                            this.W[i19] = l51Var;
                            i14 = i19 + 1;
                            i22 = i12;
                            i21 = i20;
                            num2 = num3;
                        }
                    }
                    i19 = i14;
                    z13 = true;
                    i20 = i21;
                    l51Var = new l51(this, context, f6Var, z17, z13, i20, !z11 ? new l01(11, this, p2Var) : null, i22, i10);
                    tvVar = l51Var.y;
                    if (tvVar != null) {
                    }
                    l51Var.R = false;
                    if (i20 != i13) {
                    }
                    l51Var.L = num3 != null;
                    l51Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                    if (i20 != 14) {
                        this.U.addView(l51Var, k7.b6.c(36.0f, -1));
                    }
                    this.W[i19] = l51Var;
                    i14 = i19 + 1;
                    i22 = i12;
                    i21 = i20;
                    num2 = num3;
                }
                Integer num4 = num2;
                i15 = i21;
                org.telegram.ui.Components.xv[] xvVarArr = this.W;
                this.a0 = xvVarArr[0];
                xvVarArr[1].setVisibility(8);
                h51 h51Var = new h51(context, num4, 1);
                this.b0 = h51Var;
                h51Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
                if (i15 != 14 || i15 == 8 || i15 == 13) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    this.U.addView(h51Var, k7.b6.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(h51Var, true, f10, false);
                m51 m51Var = new m51(this, context, i15);
                this.e0 = m51Var;
                n51 n51Var = new n51();
                this.b1 = n51Var;
                n51Var.c = 220L;
                n51Var.e = 260L;
                n51Var.f = 160L;
                n51Var.g = 160L;
                n51Var.m = false;
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                n51Var.i = nrVar;
                n51Var.C = false;
                m51Var.setItemAnimator(n51Var);
                m51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                o51 o51Var = new o51(this);
                this.m0 = o51Var;
                m51Var.setAdapter(o51Var);
                c51 c51Var = new c51(this, 1);
                this.o0 = c51Var;
                m51Var.setLayoutManager(c51Var);
                c51Var.O = new z41(this, 0);
                a51 a51Var2 = new a51(context, 0);
                this.d0 = a51Var2;
                ah.d dVar = new ah.d(this, context);
                this.h0 = dVar;
                dVar.addView(m51Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                a51Var2.addView(dVar, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                b51Var = new b51(this, context);
                this.f0 = b51Var;
                if (b51Var.getItemAnimator() == null) {
                    a51Var = a51Var2;
                    b51Var.getItemAnimator().n(180L);
                    b51Var.getItemAnimator().i = nrVar;
                } else {
                    a51Var = a51Var2;
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
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Le, f6Var));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                this.i0 = p9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.g0 = frameLayout;
                frameLayout.addView(p9Var, k7.b6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                a51 a51Var3 = a51Var;
                a51Var3.addView(frameLayout, k7.b6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                z51 z51Var = new z51(this);
                this.n0 = z51Var;
                b51Var.setAdapter(z51Var);
                c51 c51Var2 = new c51(this, 0);
                b51Var.setLayoutManager(c51Var2);
                c51Var2.O = new z41(this, 1);
                b51Var.setVisibility(8);
                a51Var3.addView(b51Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.U.addView(a51Var3, k7.b6.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                c2.y yVar = new c2.y(m51Var, c51Var);
                this.p0 = yVar;
                yVar.i = new d51(this, 0);
                yVar.h = new s41(this);
                f51 f51Var = new f51(this, i15, context, f6Var, num);
                m51Var.n1(f51Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                b51Var.n1(f51Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.xm0 xm0Var = new org.telegram.ui.Components.xm0(this, i10, 2);
                m51Var.setOnItemClickListener(xm0Var);
                b51Var.setOnItemClickListener(xm0Var);
                g51 g51Var = new g51(this, context, z10);
                this.c0 = g51Var;
                g51Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                g51Var.setVisibility(4);
                a51Var3.addView(g51Var, k7.b6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                h51 h51Var2 = new h51(context, num4, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i23 = org.telegram.ui.ActionBar.j6.G8;
                int multiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent, mode));
                h51Var2.setBackground(drawable2);
                h51Var2.setAlpha(0.0f);
                this.U.addView(h51Var2, k7.b6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.l0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), mode));
                if (i10 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.U.addView(view2, k7.b6.e(-1, 20, 87));
                View view3 = new View(context);
                this.q0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.U.addView(view3, k7.b6.c(-1.0f, -1));
                i16 = this.S;
                if (MediaDataController.getInstance(i16) == null) {
                    MediaDataController.getInstance(i16).checkStickers(5);
                    if (i10 == 14) {
                        MessagesController.getInstance(this.S).getAvailableEffects();
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
                    this.S0.setLayerNum(7);
                    i18 = this.T;
                    if (i18 != i17 || i18 == 4 || i18 == 6) {
                        z12 = true;
                    } else {
                        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z12 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z12 = true;
                        }
                        mg.g0.g = z12;
                    }
                    B(z12, false, z12);
                }
                i17 = 3;
                this.S0.setLayerNum(7);
                i18 = this.T;
                if (i18 != i17) {
                }
                z12 = true;
                B(z12, false, z12);
            }
        }
        z11 = false;
        i14 = 0;
        while (i14 < 2) {
        }
        Integer num42 = num2;
        i15 = i21;
        org.telegram.ui.Components.xv[] xvVarArr2 = this.W;
        this.a0 = xvVarArr2[0];
        xvVarArr2[1].setVisibility(8);
        h51 h51Var3 = new h51(context, num42, 1);
        this.b0 = h51Var3;
        h51Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        if (i15 != 14) {
        }
        f10 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(h51Var3, true, f10, false);
        m51 m51Var2 = new m51(this, context, i15);
        this.e0 = m51Var2;
        n51 n51Var2 = new n51();
        this.b1 = n51Var2;
        n51Var2.c = 220L;
        n51Var2.e = 260L;
        n51Var2.f = 160L;
        n51Var2.g = 160L;
        n51Var2.m = false;
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.nr.h;
        n51Var2.i = nrVar2;
        n51Var2.C = false;
        m51Var2.setItemAnimator(n51Var2);
        m51Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        o51 o51Var2 = new o51(this);
        this.m0 = o51Var2;
        m51Var2.setAdapter(o51Var2);
        c51 c51Var3 = new c51(this, 1);
        this.o0 = c51Var3;
        m51Var2.setLayoutManager(c51Var3);
        c51Var3.O = new z41(this, 0);
        a51 a51Var22 = new a51(context, 0);
        this.d0 = a51Var22;
        ah.d dVar2 = new ah.d(this, context);
        this.h0 = dVar2;
        dVar2.addView(m51Var2, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        a51Var22.addView(dVar2, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        b51Var = new b51(this, context);
        this.f0 = b51Var;
        if (b51Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i15 != i13) {
        }
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Le, f6Var));
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.i0 = p9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g0 = frameLayout2;
        frameLayout2.addView(p9Var2, k7.b6.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, k7.b6.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        a51 a51Var32 = a51Var;
        a51Var32.addView(frameLayout2, k7.b6.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        b51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        z51 z51Var2 = new z51(this);
        this.n0 = z51Var2;
        b51Var.setAdapter(z51Var2);
        c51 c51Var22 = new c51(this, 0);
        b51Var.setLayoutManager(c51Var22);
        c51Var22.O = new z41(this, 1);
        b51Var.setVisibility(8);
        a51Var32.addView(b51Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.addView(a51Var32, k7.b6.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        c2.y yVar2 = new c2.y(m51Var2, c51Var3);
        this.p0 = yVar2;
        yVar2.i = new d51(this, 0);
        yVar2.h = new s41(this);
        f51 f51Var2 = new f51(this, i15, context, f6Var, num);
        m51Var2.n1(f51Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        b51Var.n1(f51Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.xm0 xm0Var2 = new org.telegram.ui.Components.xm0(this, i10, 2);
        m51Var2.setOnItemClickListener(xm0Var2);
        b51Var.setOnItemClickListener(xm0Var2);
        g51 g51Var2 = new g51(this, context, z10);
        this.c0 = g51Var2;
        g51Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        g51Var2.setVisibility(4);
        a51Var32.addView(g51Var2, k7.b6.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        h51 h51Var22 = new h51(context, num42, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i232 = org.telegram.ui.ActionBar.j6.G8;
        int multiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.j6.v0(i232, f6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable22.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent2, mode2));
        h51Var22.setBackground(drawable22);
        h51Var22.setAlpha(0.0f);
        this.U.addView(h51Var22, k7.b6.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.l0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable32.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i232, f6Var), mode2));
        if (i10 == 14) {
        }
        view22.setAlpha(0.0f);
        this.U.addView(view22, k7.b6.e(-1, 20, 87));
        View view32 = new View(context);
        this.q0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.U.addView(view32, k7.b6.c(-1.0f, -1));
        i16 = this.S;
        if (MediaDataController.getInstance(i16) == null) {
        }
        this.S0.setLayerNum(7);
        i18 = this.T;
        if (i18 != i17) {
        }
        z12 = true;
        B(z12, false, z12);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.G.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.G.add(mg.q0.b(str));
        }
        m51 m51Var = this.e0;
        if (m51Var != null) {
            for (int i11 = 0; i11 < m51Var.getChildCount(); i11++) {
                if (m51Var.getChildAt(i11) instanceof y51) {
                    y51 y51Var = (y51) m51Var.getChildAt(i11);
                    y51Var.d(this.G.contains(y51Var.x), true);
                }
            }
            m51Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(p61 p61Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
    }

    public void r(y51 y51Var, mg.q0 q0Var) {
    }
}
