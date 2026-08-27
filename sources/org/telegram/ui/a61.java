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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class a61 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] W1;
    public int A;
    public final ArrayList A0;
    public ValueAnimator A1;
    public int B;
    public final ArrayList B0;
    public boolean B1;
    public e51 C;
    public final ArrayList C0;
    public boolean C1;
    public y51 D;
    public final ArrayList D0;
    public ValueAnimator D1;
    public boolean E;
    public final ArrayList E0;
    public e41 E1;
    public HashSet F;
    public ArrayList F0;
    public jh.q5 F1;
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
    public j51 K;
    public boolean K0;
    public int K1;
    public boolean L;
    public Integer L0;
    public long L1;
    public boolean M;
    public boolean M0;
    public hh.bb M1;
    public boolean N;
    public List N0;
    public final e41 N1;
    public final ArrayList O;
    public j51 O0;
    public final e41 O1;
    public boolean P;
    public boolean P0;
    public Runnable P1;
    public a51 Q;
    public float Q0;
    public ValueAnimator Q1;
    public final int R;
    public final ImageReceiver R0;
    public ValueAnimator R1;
    public final int S;
    public org.telegram.ui.Components.k5 S0;
    public final AnimationNotificationsLocker S1;
    public final u41 T;
    public p41 T0;
    public final Paint T1;
    public final ag.t0 U;
    public final Integer U0;
    public Integer U1;
    public final org.telegram.ui.Components.mv[] V;
    public final org.telegram.ui.ActionBar.c6 V0;
    public org.telegram.ui.Components.mv W;
    public float W0;
    public float X0;
    public final org.telegram.ui.ActionBar.n2 Y0;
    public final int Z0;
    public int a;
    public final s41 a0;
    public final y41 a1;
    public int b;
    public final r41 b0;
    public final int b1;
    public int c;
    public final ag.d c0;
    public boolean c1;
    public int d;
    public final x41 d0;
    public boolean d1;
    public int e;
    public final n41 e0;
    public ValueAnimator e1;
    public int f;
    public final FrameLayout f0;
    public Drawable f1;
    public final ag.y1 g0;
    public final PorterDuffColorFilter g1;
    public int h;
    public final org.telegram.ui.Components.n9 h0;
    public float h1;
    public final View i0;
    public int i1;
    public final org.telegram.ui.Components.zm j0;
    public org.telegram.ui.Components.i5 j1;
    public final View k0;
    public Rect k1;
    public final z41 l0;
    public View l1;
    public final k51 m0;
    public float m1;
    public int n;
    public final o41 n0;
    public j51 n1;
    public final c2.x o0;
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

    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(n2Var, context, z10, num, i10, true, c6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.n9 n9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (n9Var == null) {
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
            n9Var.setLayerNum(7);
            n9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            n9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(a61 a61Var, int i10, int i11) {
        c2.x xVar = a61Var.o0;
        o41 o41Var = a61Var.n0;
        View m10 = o41Var.m(i10);
        int L0 = o41Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            xVar.b = o41Var.L0() < i10 ? 0 : 1;
            xVar.d(i10, i11, false, false);
        } else {
            lh.l1 l1Var = new lh.l1(a61Var, a61Var.d0.getContext(), 4);
            l1Var.a = i10;
            l1Var.p = i11;
            o41Var.w0(l1Var);
        }
    }

    public static boolean c(a61 a61Var) {
        if (a61Var.P) {
            return true;
        }
        ValueAnimator valueAnimator = a61Var.Q1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.S;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.k5.g();
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
        org.telegram.ui.Components.gw0.t3.fetch(i10, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.wv0
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
                    k5.h(i10).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l10) {
        this.G.remove(l10);
        x41 x41Var = this.d0;
        if (x41Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
                if (x41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i11);
                    org.telegram.ui.Components.t5 t5Var = j51Var.e;
                    if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = j51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            j51Var.f();
                        }
                    } else {
                        j51Var.f();
                    }
                    z10 = true;
                }
            }
            x41Var.invalidate();
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
            z41 z41Var = this.l0;
            if (z41Var != null) {
                z41Var.m(i10);
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
    /* JADX WARN: Removed duplicated region for block: B:140:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b19  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0521  */
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
        ArrayList<TLRPC.EmojiStatus> arrayList3;
        int i13;
        long j10;
        ArrayList arrayList4;
        int size;
        int i14;
        long j11;
        int i15;
        ArrayList arrayList5;
        x41 x41Var;
        int i16;
        int i17;
        ArrayList arrayList6;
        MediaDataController mediaDataController;
        boolean z14;
        ArrayList<TLRPC.Document> arrayList7;
        TLRPC.InputStickerSet inputStickerSet;
        int i18;
        SparseIntArray sparseIntArray3;
        TLRPC.InputStickerSet inputStickerSet2;
        ArrayList<TLRPC.Document> arrayList8;
        boolean z15;
        int i19;
        SparseIntArray sparseIntArray4;
        SparseIntArray sparseIntArray5;
        ArrayList arrayList9;
        int i20;
        int i21;
        int i22;
        boolean z16;
        int i23;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        ArrayList<Long> arrayList10;
        boolean z17 = !this.L ? false : z11;
        int i24 = this.R;
        MediaDataController mediaDataController2 = MediaDataController.getInstance(i24);
        if (mediaDataController2 == null) {
            return;
        }
        if (z10 || this.H0 == null) {
            this.H0 = new ArrayList(mediaDataController2.getStickerSets(this.M ? 0 : 5));
        }
        ArrayList arrayList11 = this.H0;
        ArrayList arrayList12 = new ArrayList(mediaDataController2.getFeaturedEmojiSets());
        ArrayList arrayList13 = this.r0;
        ArrayList arrayList14 = new ArrayList(arrayList13);
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
        ArrayList arrayList15 = this.z0;
        arrayList15.clear();
        this.G0.clear();
        ArrayList arrayList16 = this.D0;
        arrayList16.clear();
        ArrayList arrayList17 = this.E0;
        arrayList17.clear();
        ArrayList arrayList18 = this.I0;
        arrayList18.clear();
        SparseIntArray sparseIntArray6 = this.s0;
        sparseIntArray6.clear();
        SparseIntArray sparseIntArray7 = this.t0;
        sparseIntArray7.clear();
        SparseIntArray sparseIntArray8 = this.u0;
        sparseIntArray8.clear();
        arrayList13.clear();
        boolean z18 = z17;
        SparseIntArray sparseIntArray9 = this.v0;
        sparseIntArray9.clear();
        this.O.clear();
        ArrayList arrayList19 = this.B0;
        arrayList19.clear();
        SparseIntArray sparseIntArray10 = sparseIntArray9;
        ArrayList arrayList20 = this.C0;
        arrayList20.clear();
        MediaDataController mediaDataController3 = mediaDataController2;
        ArrayList arrayList21 = this.A0;
        arrayList21.clear();
        boolean isEmpty = arrayList11.isEmpty();
        ArrayList arrayList22 = arrayList12;
        int i25 = this.S;
        if (isEmpty) {
            sparseIntArray = sparseIntArray7;
        } else {
            sparseIntArray = sparseIntArray7;
        }
        if (i25 != 5 && i25 != 7 && i25 != 8) {
            int i26 = this.q0;
            sparseIntArray2 = sparseIntArray6;
            this.q0 = i26 + 1;
            this.a = i26;
            arrayList13.add(9L);
            z13 = this.J0;
            if (i25 != 5 || i25 == 7) {
                arrayList = arrayList20;
                i10 = z13 ? 1 : 0;
                if (i10 != 0) {
                    this.q0++;
                    arrayList13.add(2L);
                }
                tL_emojiList = MediaDataController.getInstance(i24).replyIconsDefault;
                if (tL_emojiList != null && (arrayList2 = tL_emojiList.document_id) != null && !arrayList2.isEmpty()) {
                    i11 = 0;
                    while (i11 < tL_emojiList.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.t5(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList15.size(); i12++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList15.get(i12)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            } else if (i25 != 4) {
                arrayList = arrayList20;
                i10 = z13 ? 1 : 0;
                if (i25 == 6) {
                    if (i10 != 0) {
                        this.q0++;
                        arrayList13.add(2L);
                    }
                    List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(i24).getEnabledReactionsList();
                    for (int i27 = 0; i27 < enabledReactionsList.size(); i27++) {
                        arrayList19.add(enabledReactionsList.get(i27).activate_animation);
                    }
                    for (int i28 = 0; i28 < arrayList19.size(); i28++) {
                        arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i28)).id * 13) + 62425));
                        this.q0++;
                    }
                } else if (i25 == 3) {
                    int i29 = this.q0;
                    this.q0 = i29 + 1;
                    this.x = i29;
                    arrayList13.add(12L);
                    int i30 = this.q0;
                    this.q0 = i30 + 1;
                    this.w = i30;
                    arrayList13.add(7L);
                    String str = UserConfig.getInstance(i24).defaultTopicIcons;
                    if (str != null) {
                        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i24).getStickerSetByName(str);
                        tL_messages_stickerSet = stickerSetByName == null ? MediaDataController.getInstance(i24).getStickerSetByEmojiOrName(str) : stickerSetByName;
                    } else {
                        tL_messages_stickerSet = null;
                    }
                    if (tL_messages_stickerSet != null) {
                        if (i10 != 0) {
                            this.q0++;
                            arrayList13.add(2L);
                        }
                        ArrayList<TLRPC.Document> arrayList23 = tL_messages_stickerSet.documents;
                        if (arrayList23 != null && !arrayList23.isEmpty()) {
                            int i31 = 0;
                            while (i31 < tL_messages_stickerSet.documents.size()) {
                                arrayList15.add(new org.telegram.ui.Components.t5(tL_messages_stickerSet.documents.get(i31), (Paint.FontMetricsInt) null));
                                i31++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i32 = 0; i32 < arrayList15.size(); i32++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList15.get(i32)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    }
                }
            } else if (this.M) {
                MediaDataController mediaDataController4 = MediaDataController.getInstance(i24);
                i10 = z13 ? 1 : 0;
                arrayList19.addAll(mediaDataController4.getRecentStickersNoCopy(0));
                int i33 = 0;
                while (i33 < arrayList19.size()) {
                    arrayList13.add(Long.valueOf((((TLRPC.Document) arrayList19.get(i33)).id * 13) + 62425));
                    this.q0++;
                    i33++;
                    arrayList20 = arrayList20;
                }
                arrayList = arrayList20;
            } else {
                arrayList = arrayList20;
                i10 = z13 ? 1 : 0;
                TLRPC.TL_emojiList tL_emojiList3 = this.N ? MediaDataController.getInstance(i24).profileAvatarConstructorDefault : MediaDataController.getInstance(i24).groupAvatarConstructorDefault;
                if (tL_emojiList3 != null && (arrayList10 = tL_emojiList3.document_id) != null && !arrayList10.isEmpty()) {
                    org.telegram.ui.Components.kx kxVar = new org.telegram.ui.Components.kx();
                    kxVar.f = true;
                    kxVar.g = false;
                    kxVar.h = true;
                    kxVar.e = true;
                    kxVar.b = new TLRPC.TL_stickerSet();
                    kxVar.a = tL_emojiList3.document_id.get(0);
                    arrayList18.size();
                    arrayList18.add(kxVar);
                    int i34 = 0;
                    while (i34 < tL_emojiList3.document_id.size()) {
                        arrayList15.add(new org.telegram.ui.Components.t5(tL_emojiList3.document_id.get(i34).longValue(), (Paint.FontMetricsInt) null));
                        i34++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i35 = 0; i35 < arrayList15.size(); i35++) {
                        arrayList13.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList15.get(i35)).getDocumentId() * 13) + 43223));
                        this.q0++;
                    }
                }
            }
            if (this.K0 && i25 != 13 && i25 != 2 && i25 != 11 && i25 != 3 && i25 != 6 && i25 != 8 && i25 != 4 && i25 != 5 && i25 != 7) {
                int i36 = this.q0;
                this.q0 = i36 + 1;
                this.v = i36;
                arrayList13.add(6L);
            }
            if ((i25 != 9 || i25 == 10) && (tL_emojiList2 = MediaDataController.getInstance(i24).restrictedStatusEmojis) != null) {
                hashSet = new HashSet();
                hashSet.addAll(tL_emojiList2.document_id);
            } else {
                hashSet = null;
            }
            if (this.N0 == null) {
                this.d = this.q0;
                ArrayList arrayList24 = new ArrayList(this.N0);
                if (i25 == 13 && arrayList24.size() > 8) {
                    arrayList24.subList(8, arrayList24.size()).clear();
                } else if (i25 == 14) {
                    arrayList9 = new ArrayList();
                    int i37 = 0;
                    while (i37 < arrayList24.size()) {
                        if (((ig.q0) arrayList24.get(i37)).e) {
                            arrayList9.add((ig.q0) arrayList24.remove(i37));
                            i37--;
                        }
                        i37++;
                    }
                    if (i25 != 8 || i25 == 11 || i25 == 13) {
                        arrayList16.addAll(arrayList24);
                    } else {
                        for (int i38 = 0; i38 < 16; i38++) {
                            if (!arrayList24.isEmpty()) {
                                arrayList16.add((ig.q0) arrayList24.remove(0));
                            }
                        }
                    }
                    for (i20 = 0; i20 < arrayList16.size(); i20++) {
                        arrayList13 = arrayList13;
                        arrayList13.add(Long.valueOf((((ig.q0) arrayList16.get(i20)).hashCode() * 13) - 5632));
                    }
                    int size2 = arrayList16.size() + this.q0;
                    this.q0 = size2;
                    this.e = size2;
                    if (!arrayList24.isEmpty() && i25 != 8 && i25 != 11 && i25 != 13) {
                        i22 = 0;
                        while (true) {
                            if (i22 < arrayList24.size()) {
                                z16 = true;
                                break;
                            } else {
                                if (((ig.q0) arrayList24.get(i22)).g != 0) {
                                    z16 = false;
                                    break;
                                }
                                i22++;
                            }
                        }
                        if (i25 != 14) {
                            if (!z16) {
                                int i39 = this.q0;
                                this.q0 = i39 + 1;
                                this.f = i39;
                                arrayList13.add(4L);
                            } else if (UserConfig.getInstance(i24).isPremium()) {
                                int i40 = this.q0;
                                this.q0 = i40 + 1;
                                this.h = i40;
                                arrayList13.add(5L);
                            }
                        }
                        this.b = this.q0;
                        arrayList17.addAll(arrayList24);
                        for (i23 = 0; i23 < arrayList17.size(); i23++) {
                            arrayList13.add(Long.valueOf((((ig.q0) arrayList17.get(i23)).h * 13) + (z16 ? 4235 : -3142)));
                        }
                        int size3 = arrayList17.size() + this.q0;
                        this.q0 = size3;
                        this.c = size3;
                    }
                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                        int i41 = this.q0;
                        this.q0 = i41 + 1;
                        this.y = i41;
                        arrayList13.add(8L);
                        this.A = this.q0;
                        this.F0 = arrayList9;
                        for (i21 = 0; i21 < arrayList9.size(); i21++) {
                            arrayList13.add(Long.valueOf(((ig.q0) arrayList9.get(i21)).c * 19));
                        }
                        int size4 = arrayList9.size() + this.q0;
                        this.q0 = size4;
                        this.B = size4;
                    }
                }
                arrayList9 = null;
                if (i25 != 8) {
                }
                arrayList16.addAll(arrayList24);
                while (i20 < arrayList16.size()) {
                }
                int size22 = arrayList16.size() + this.q0;
                this.q0 = size22;
                this.e = size22;
                if (!arrayList24.isEmpty()) {
                    i22 = 0;
                    while (true) {
                        if (i22 < arrayList24.size()) {
                        }
                        i22++;
                    }
                    if (i25 != 14) {
                    }
                    this.b = this.q0;
                    arrayList17.addAll(arrayList24);
                    while (i23 < arrayList17.size()) {
                    }
                    int size32 = arrayList17.size() + this.q0;
                    this.q0 = size32;
                    this.c = size32;
                }
                if (arrayList9 != null) {
                    int i412 = this.q0;
                    this.q0 = i412 + 1;
                    this.y = i412;
                    arrayList13.add(8L);
                    this.A = this.q0;
                    this.F0 = arrayList9;
                    while (i21 < arrayList9.size()) {
                    }
                    int size42 = arrayList9.size() + this.q0;
                    this.q0 = size42;
                    this.B = size42;
                }
            } else if (i25 == 0 || i25 == 12 || i25 == 9 || i25 == 10) {
                ArrayList<TLRPC.EmojiStatus> recentEmojiStatuses = MediaDataController.getInstance(i24).getRecentEmojiStatuses();
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i24).getStickerSet((i25 == 0 || i25 == 12) ? new TLRPC.TL_inputStickerSetEmojiDefaultStatuses() : new TLRPC.TL_inputStickerSetEmojiChannelDefaultStatuses(), true);
                if (stickerSet != null) {
                    if (i10 != 0) {
                        this.q0++;
                        arrayList13.add(2L);
                    }
                    ArrayList<TLRPC.EmojiStatus> defaultEmojiStatuses = (i25 == 0 || i25 == 12) ? MediaDataController.getInstance(i24).getDefaultEmojiStatuses() : MediaDataController.getInstance(i24).getDefaultChannelEmojiStatuses();
                    ArrayList<TLRPC.Document> arrayList25 = stickerSet.documents;
                    if (arrayList25 != null && !arrayList25.isEmpty()) {
                        int i42 = 0;
                        while (i42 < Math.min(7, stickerSet.documents.size())) {
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSet;
                            arrayList15.add(new org.telegram.ui.Components.t5(stickerSet.documents.get(i42), (Paint.FontMetricsInt) null));
                            if (arrayList15.size() + i10 >= 104) {
                                break;
                            }
                            i42++;
                            stickerSet = tL_messages_stickerSet2;
                        }
                    }
                    if ((i25 == 0 || i25 == 12) && recentEmojiStatuses != null && !recentEmojiStatuses.isEmpty()) {
                        int size5 = recentEmojiStatuses.size();
                        int i43 = 0;
                        while (i43 < size5) {
                            TLRPC.EmojiStatus emojiStatus = recentEmojiStatuses.get(i43);
                            i43++;
                            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(emojiStatus);
                            if (emojiStatusDocumentId != null) {
                                ArrayList<TLRPC.EmojiStatus> arrayList26 = recentEmojiStatuses;
                                int i44 = 0;
                                while (true) {
                                    if (i44 >= arrayList15.size()) {
                                        int i45 = size5;
                                        arrayList15.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList15.size() + i10 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList26;
                                        size5 = i45;
                                    } else {
                                        if (((org.telegram.ui.Components.t5) arrayList15.get(i44)).getDocumentId() == emojiStatusDocumentId.longValue()) {
                                            recentEmojiStatuses = arrayList26;
                                            break;
                                        }
                                        i44++;
                                    }
                                }
                            }
                        }
                    }
                    if (defaultEmojiStatuses != null && !defaultEmojiStatuses.isEmpty()) {
                        int size6 = defaultEmojiStatuses.size();
                        int i46 = 0;
                        while (i46 < size6) {
                            TLRPC.EmojiStatus emojiStatus2 = defaultEmojiStatuses.get(i46);
                            i46++;
                            Long emojiStatusDocumentId2 = UserObject.getEmojiStatusDocumentId(emojiStatus2);
                            if (emojiStatusDocumentId2 != null) {
                                int i47 = 0;
                                while (true) {
                                    if (i47 >= arrayList15.size()) {
                                        arrayList3 = defaultEmojiStatuses;
                                        i13 = size6;
                                        arrayList15.add(new org.telegram.ui.Components.t5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList15.size() + i10 >= 104) {
                                            break;
                                        }
                                    } else {
                                        if (((org.telegram.ui.Components.t5) arrayList15.get(i47)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
                                            arrayList3 = defaultEmojiStatuses;
                                            i13 = size6;
                                            break;
                                        }
                                        i47++;
                                    }
                                }
                                defaultEmojiStatuses = arrayList3;
                                size6 = i13;
                            }
                        }
                    }
                    if (arrayList15.size() <= 40 - i10 || this.y0) {
                        for (int i48 = 0; i48 < arrayList15.size(); i48++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList15.get(i48)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - i10; i49++) {
                            arrayList13.add(Long.valueOf((((org.telegram.ui.Components.t5) arrayList15.get(i49)).getDocumentId() * 13) + 43223));
                            this.q0++;
                        }
                        arrayList13.add(Long.valueOf(((((arrayList15.size() - 40) + i10) + 1) * 13) - 5531));
                        e51 e51Var = this.C;
                        if (e51Var != null) {
                            e51Var.a.setText("+" + ((arrayList15.size() - 40) + i10 + 1));
                        }
                        sparseIntArray8.put(this.q0, -1);
                        this.q0++;
                    }
                }
            }
            arrayList21.clear();
            if (i25 != 0 || i25 == 12 || i25 == 9 || i25 == 10) {
                j10 = 322;
                hh.m7 G = hh.u7.y(i24, false).G(getDialogId(), true);
                G.a();
                arrayList4 = new ArrayList();
                ArrayList arrayList27 = G.l;
                size = arrayList27.size();
                i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList27.get(i14);
                    i14++;
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList4.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                if (arrayList4.isEmpty()) {
                    int i50 = this.q0;
                    this.q0 = i50 + 1;
                    this.n = i50;
                    arrayList13.add(22L);
                    this.r = this.q0;
                    int size7 = arrayList4.size();
                    int i51 = 0;
                    while (i51 < size7) {
                        Object obj2 = arrayList4.get(i51);
                        i51++;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                        arrayList13.add(Long.valueOf((tL_starGiftUnique.id * 322) + 13334));
                        this.q0++;
                        arrayList21.add(tL_starGiftUnique);
                    }
                    j11 = 13334;
                    this.s = this.q0;
                    this.W.l(true);
                } else {
                    j11 = 13334;
                    this.W.l(false);
                }
                i15 = 13;
            } else {
                i15 = 13;
                j10 = 322;
                j11 = 13334;
            }
            if (i25 == i15) {
                String[][] strArr = EmojiData.dataColored;
                int length = strArr.length;
                for (int i52 = 0; i52 < length; i52++) {
                    String[] strArr2 = strArr[i52];
                    int length2 = strArr2.length;
                    int i53 = 0;
                    while (i53 < length2) {
                        arrayList.add(strArr2[i53]);
                        arrayList13.add(Long.valueOf((r12.hashCode() * j10) + j11));
                        this.q0++;
                        i53++;
                        strArr = strArr;
                        length = length;
                    }
                }
            }
            if (i25 != 8 && i25 != 13 && i25 != 14) {
                i19 = 0;
                while (i19 < arrayList11.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayList11.get(i19);
                    if (tL_messages_stickerSet3 != null && tL_messages_stickerSet3.set != null && (((i25 != 5 && i25 != 7) || MessageObject.isTextColorSet(tL_messages_stickerSet3)) && ((i25 != 10 && i25 != 9) || tL_messages_stickerSet3.set.channel_emoji_status))) {
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet3.set;
                        if (stickerSet2.emojis || this.M) {
                            if (!this.x0.contains(Long.valueOf(stickerSet2.id))) {
                                sparseIntArray5 = sparseIntArray2;
                                sparseIntArray5.put(this.q0, arrayList18.size());
                                sparseIntArray4 = sparseIntArray;
                                sparseIntArray4.put(arrayList18.size(), this.q0);
                                this.q0++;
                                arrayList13.add(Long.valueOf((tL_messages_stickerSet3.set.id * 13) + 9211));
                                org.telegram.ui.Components.kx kxVar2 = new org.telegram.ui.Components.kx();
                                kxVar2.f = true;
                                kxVar2.g = false;
                                kxVar2.h = true;
                                if (i25 == 4) {
                                    kxVar2.e = false;
                                } else {
                                    kxVar2.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                kxVar2.b = tL_messages_stickerSet3.set;
                                kxVar2.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList18.size();
                                arrayList18.add(kxVar2);
                                this.q0 = kxVar2.c.size() + this.q0;
                                for (int i54 = 0; i54 < kxVar2.c.size(); i54++) {
                                    arrayList13.add(Long.valueOf((((TLRPC.Document) kxVar2.c.get(i54)).id * 13) + 3212));
                                }
                                i19++;
                                sparseIntArray2 = sparseIntArray5;
                                sparseIntArray = sparseIntArray4;
                            }
                        }
                    }
                    sparseIntArray4 = sparseIntArray;
                    sparseIntArray5 = sparseIntArray2;
                    i19++;
                    sparseIntArray2 = sparseIntArray5;
                    sparseIntArray = sparseIntArray4;
                }
            }
            SparseIntArray sparseIntArray11 = sparseIntArray;
            SparseIntArray sparseIntArray12 = sparseIntArray2;
            if (!this.M && i25 != 8 && i25 != 13 && i25 != 14) {
                i17 = 0;
                while (i17 < arrayList22.size()) {
                    ArrayList arrayList28 = arrayList22;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList28.get(i17);
                    TLRPC.StickerSet stickerSet3 = stickerSetCovered.set;
                    int i55 = 0;
                    while (true) {
                        if (i55 < arrayList18.size()) {
                            arrayList6 = arrayList18;
                            if (((org.telegram.ui.Components.kx) arrayList18.get(i55)).b.id == stickerSet3.id) {
                                arrayList22 = arrayList28;
                                i18 = i17;
                                sparseIntArray3 = sparseIntArray10;
                                mediaDataController = mediaDataController3;
                                break;
                            }
                            i55++;
                            arrayList18 = arrayList6;
                        } else {
                            arrayList6 = arrayList18;
                            if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                mediaDataController = mediaDataController3;
                                TLRPC.TL_messages_stickerSet stickerSet4 = mediaDataController.getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                if (stickerSet4 != null) {
                                    arrayList8 = stickerSet4.documents;
                                    z15 = MessageObject.isPremiumEmojiPack(stickerSet4);
                                    inputStickerSet2 = null;
                                } else {
                                    inputStickerSet2 = MediaDataController.getInputStickerSet(stickerSetCovered.set);
                                    arrayList8 = new ArrayList<>();
                                    z15 = true;
                                }
                                TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                                arrayList7 = arrayList8;
                                z14 = z15;
                                inputStickerSet = inputStickerSet3;
                            } else {
                                mediaDataController = mediaDataController3;
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                    arrayList7 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    z14 = MessageObject.isPremiumEmojiPack(stickerSetCovered);
                                } else {
                                    z14 = false;
                                    arrayList7 = null;
                                }
                                inputStickerSet = null;
                            }
                            if (arrayList7 != null && ((!(i25 == 5 || i25 == 7) || (!arrayList7.isEmpty() && MessageObject.isTextColorEmoji(arrayList7.get(0)))) && (!(i25 == 10 || i25 == 9) || stickerSet3.channel_emoji_status))) {
                                arrayList22 = arrayList28;
                                sparseIntArray12.put(this.q0, arrayList6.size());
                                sparseIntArray11.put(arrayList6.size(), this.q0);
                                this.q0++;
                                boolean z19 = z14;
                                arrayList13.add(Long.valueOf((stickerSet3.id * 13) + 9211));
                                org.telegram.ui.Components.kx kxVar3 = new org.telegram.ui.Components.kx();
                                kxVar3.d = inputStickerSet;
                                i18 = i17;
                                kxVar3.f = this.x0.contains(Long.valueOf(stickerSet3.id));
                                kxVar3.g = true;
                                if (i25 == 4) {
                                    kxVar3.e = false;
                                } else {
                                    kxVar3.e = !z19;
                                }
                                kxVar3.b = stickerSet3;
                                kxVar3.c = j(hashSet, arrayList7);
                                arrayList6.size();
                                kxVar3.h = this.w0.contains(Long.valueOf(kxVar3.b.id));
                                if (kxVar3.c.size() <= 24 || kxVar3.h) {
                                    this.q0 = kxVar3.c.size() + this.q0;
                                    for (int i56 = 0; i56 < kxVar3.c.size(); i56++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) kxVar3.c.get(i56)).id * 13) + 3212));
                                    }
                                } else {
                                    this.q0 += 24;
                                    for (int i57 = 0; i57 < 23; i57++) {
                                        arrayList13.add(Long.valueOf((((TLRPC.Document) kxVar3.c.get(i57)).id * 13) + 3212));
                                    }
                                    arrayList13.add(Long.valueOf(((kxVar3.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                    sparseIntArray8.put(this.q0 - 1, arrayList6.size());
                                }
                                if (kxVar3.f || i25 == 4) {
                                    sparseIntArray3 = sparseIntArray10;
                                } else if (i25 == 5 || i25 == 7 || i25 == 6) {
                                    sparseIntArray3 = sparseIntArray10;
                                } else {
                                    sparseIntArray3 = sparseIntArray10;
                                    sparseIntArray3.put(this.q0, arrayList6.size());
                                    this.q0++;
                                    arrayList13.add(Long.valueOf((stickerSet3.id * 13) + 3321));
                                    arrayList6.add(kxVar3);
                                }
                                arrayList6.add(kxVar3);
                            } else {
                                arrayList22 = arrayList28;
                                i18 = i17;
                                sparseIntArray3 = sparseIntArray10;
                            }
                        }
                    }
                    i17 = i18 + 1;
                    sparseIntArray10 = sparseIntArray3;
                    arrayList18 = arrayList6;
                    mediaDataController3 = mediaDataController;
                }
            }
            arrayList5 = arrayList18;
            if (i25 != 14 && i25 != 8 && i25 != 13) {
                this.W.p(arrayList5);
            }
            x41Var = this.d0;
            if (z18) {
                x41Var.setItemAnimator(null);
            } else {
                x41Var.setItemAnimator(this.a1);
            }
            if (z12) {
                i16 = 0;
                this.l0.l();
            } else {
                i16 = 0;
                f2.q.c(new org.telegram.ui.Components.fx(this, arrayList14, 2), false).b(this.l0);
            }
            if (x41Var.H1) {
                x41Var.u0(i16);
                return;
            }
            return;
        }
        sparseIntArray2 = sparseIntArray6;
        this.a = -1;
        z13 = this.J0;
        if (i25 != 5) {
        }
        arrayList = arrayList20;
        i10 = z13 ? 1 : 0;
        if (i10 != 0) {
        }
        tL_emojiList = MediaDataController.getInstance(i24).replyIconsDefault;
        if (tL_emojiList != null) {
            i11 = 0;
            while (i11 < tL_emojiList.document_id.size()) {
            }
            while (i12 < arrayList15.size()) {
            }
        }
        if (this.K0) {
            int i362 = this.q0;
            this.q0 = i362 + 1;
            this.v = i362;
            arrayList13.add(6L);
        }
        if (i25 != 9) {
        }
        hashSet = new HashSet();
        hashSet.addAll(tL_emojiList2.document_id);
        if (this.N0 == null) {
        }
        arrayList21.clear();
        if (i25 != 0) {
        }
        j10 = 322;
        hh.m7 G2 = hh.u7.y(i24, false).G(getDialogId(), true);
        G2.a();
        arrayList4 = new ArrayList();
        ArrayList arrayList272 = G2.l;
        size = arrayList272.size();
        i14 = 0;
        while (i14 < size) {
        }
        if (arrayList4.isEmpty()) {
        }
        i15 = 13;
        if (i25 == i15) {
        }
        if (i25 != 8) {
            i19 = 0;
            while (i19 < arrayList11.size()) {
            }
        }
        SparseIntArray sparseIntArray112 = sparseIntArray;
        SparseIntArray sparseIntArray122 = sparseIntArray2;
        if (!this.M) {
            i17 = 0;
            while (i17 < arrayList22.size()) {
            }
        }
        arrayList5 = arrayList18;
        if (i25 != 14) {
            this.W.p(arrayList5);
        }
        x41Var = this.d0;
        if (z18) {
        }
        if (z12) {
        }
        if (x41Var.H1) {
        }
    }

    public final void C() {
        r41 r41Var = this.b0;
        if (r41Var == null) {
            return;
        }
        if (this.u1) {
            r41Var.clearAnimation();
            r41Var.setVisibility(0);
            r41Var.animate().translationY(0.0f).start();
            return;
        }
        x41 x41Var = this.d0;
        if (x41Var.getChildCount() <= 0) {
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = x41Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            r41Var.setVisibility(0);
            r41Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f10) {
        View view = this.i0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.er.g.getInterpolation(h7.n.a((((f10 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.zm zmVar = this.j0;
        if (zmVar != null) {
            float a2 = h7.n.a((((f10 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            zmVar.setAlpha(a2);
            zmVar.setScaleX(a2);
            zmVar.setScaleY(a2 * (n() ? -1 : 1));
        }
        float f11 = 800.0f * f10;
        float f12 = f11 - 40.0f;
        float a3 = h7.n.a(f12 / 700.0f, 0.0f, 1.0f);
        float a10 = h7.n.a((f11 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a11 = h7.n.a(f12 / 750.0f, 0.0f, 1.0f);
        float a12 = h7.n.a((f11 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        float interpolation2 = erVar.getInterpolation(a3);
        float interpolation3 = erVar.getInterpolation(a10);
        this.U.setAlpha(a12);
        this.b0.setAlpha(a12);
        int i10 = 0;
        for (int i11 = 0; i11 < this.W.b.getChildCount(); i11++) {
            this.W.b.getChildAt(i11).setAlpha(a12);
        }
        if (this.j1 != null) {
            invalidate();
        }
        float f13 = 1.0f - a12;
        u41 u41Var = this.T;
        u41Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        if (zmVar != null) {
            zmVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f13);
        }
        this.W0 = (interpolation2 * 0.85f) + 0.15f;
        this.X0 = (interpolation3 * 0.925f) + 0.075f;
        u41Var.invalidateOutline();
        if (zmVar != null) {
            zmVar.setAlpha(a12);
        }
        s41 s41Var = this.a0;
        s41Var.setAlpha(a12);
        s41Var.setScaleX(Math.min(this.W0, 1.0f));
        float pivotX = s41Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(u41Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(u41Var.getHeight(), 2.0d) + Math.pow(u41Var.getWidth() - pivotX, 2.0d)));
        for (int i12 = 0; i12 < this.W.b.getChildCount(); i12++) {
            View childAt = this.W.b.getChildAt(i12);
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
            float cascade = AndroidUtilities.cascade(a11, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            x41 x41Var = this.d0;
            if (i10 >= x41Var.getChildCount()) {
                this.g0.invalidate();
                x41Var.invalidate();
                return;
            }
            View childAt2 = x41Var.getChildAt(i10);
            if (childAt2 instanceof j51) {
                j51 j51Var = (j51) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a11, (float) Math.sqrt(com.google.android.recaptcha.internal.a.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                j51Var.setAnimatedScale(cascade2);
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
        e41 e41Var = this.O1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.M)) {
                AndroidUtilities.cancelRunOnUIThread(e41Var);
                AndroidUtilities.runOnUIThread(e41Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            AndroidUtilities.runOnUIThread(e41Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.R).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(e41Var);
                AndroidUtilities.runOnUIThread(e41Var);
                return;
            }
            return;
        }
        j4.w0 w0Var = new j4.w0(18);
        x41 x41Var = this.d0;
        AndroidUtilities.forEachViews((RecyclerView) x41Var, (d5.d) w0Var);
        if (x41Var != null) {
            x41Var.invalidate();
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
            float z10 = com.google.android.recaptcha.internal.a.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.Z0;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.k1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.i5 i5Var2 = this.j1;
            Rect rect = this.k1;
            int i11 = rect.left;
            Rect rect2 = this.k1;
            i5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.k1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.j1.draw(canvas);
            org.telegram.ui.Components.i5 i5Var3 = this.j1;
            i5Var3.v = alpha;
            i5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        j51 j51Var = this.n1;
        if (j51Var == null || this.o1 == null || j51Var.A == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.n1.A.setAlpha((int) (this.m1 * 255.0f));
        this.n1.A.setBounds(this.o1);
        this.n1.A.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - this.h1, this.b1, this.i1), PorterDuff.Mode.SRC_IN));
        this.n1.A.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.K1 - this.J1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.K1 - this.J1) * 25) + f() + 16;
    }

    public hh.bb getCollectionParticles() {
        if (this.M1 == null) {
            this.M1 = new hh.bb(1, 8);
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
                org.telegram.ui.Components.kx kxVar = (org.telegram.ui.Components.kx) arrayList.get(i15);
                if (kxVar.h) {
                    return;
                }
                z11 = i15 + 1 == arrayList.size();
                i13 = this.t0.get(i15);
                this.w0.add(Long.valueOf(kxVar.b.id));
                i11 = 24;
                i12 = kxVar.h ? kxVar.c.size() : Math.min(24, kxVar.c.size());
                num = kxVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                kxVar.h = true;
                i14 = kxVar.c.size();
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
                    post(new org.telegram.ui.Components.ex(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
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
        String p6 = a9.p.p(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(p6, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(p6, i11 + 1).apply();
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
    public final void o(View view, org.telegram.ui.Components.t5 t5Var) {
        l();
        if (t5Var != null) {
            int i10 = this.S;
            if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = t5Var.getDocumentId();
            TLRPC.Document document = t5Var.document;
            int i11 = this.R;
            if (document == null) {
                document = org.telegram.ui.Components.k5.f(i11, t5Var.documentId);
            }
            if (!(view instanceof j51)) {
                p(view, Long.valueOf(t5Var.documentId), document, null, null);
                return;
            }
            final j51 j51Var = (j51) view;
            if (j51Var.v == null && (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10)) {
                MediaDataController.getInstance(i11).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                p(view, Long.valueOf(t5Var.documentId), document, j51Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(j51Var.v)) {
                p(view, Long.valueOf(t5Var.documentId), document2, j51Var.v, null);
                return;
            }
            final a01 a01Var = new a01(this, view, t5Var, document2, j51Var, 1);
            if (this.q1 != null || this.j1 == null) {
                a01Var.run();
                return;
            }
            j51Var.b = true;
            final Rect rect = new Rect();
            u41 u41Var = this.T;
            int left = u41Var.getLeft();
            x41 x41Var = this.d0;
            rect.set(j51Var.getLeft() + x41Var.getLeft() + left, j51Var.getTop() + x41Var.getTop() + u41Var.getTop(), j51Var.getRight() + x41Var.getLeft() + u41Var.getLeft(), j51Var.getBottom() + x41Var.getTop() + u41Var.getTop());
            Drawable drawable = j51Var.A;
            final org.telegram.ui.Components.k5 n10 = drawable instanceof org.telegram.ui.Components.k5 ? org.telegram.ui.Components.k5.n(i11, ((org.telegram.ui.Components.k5) drawable).i(), null, 7) : null;
            this.n1 = j51Var;
            Rect rect2 = new Rect();
            this.o1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.q1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.g41
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.i5 i5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    a61 a61Var = a61.this;
                    a61Var.h1 = 1.0f - ((floatValue * floatValue) * floatValue);
                    a61Var.m1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, a61Var.k1, floatValue, a61Var.o1);
                    float scaleX = j51Var.getScaleX() * Math.max(1.0f, a61Var.p1.getInterpolation(h7.n.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    a61Var.o1.set((int) org.telegram.messenger.rl.c(a61Var.o1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.rl.c(a61Var.o1.height(), 2.0f, scaleX, a61Var.o1.centerY()), (int) s3.c.c(a61Var.o1.width(), 2.0f, scaleX, a61Var.o1.centerX()), (int) s3.c.c(a61Var.o1.height(), 2.0f, scaleX, a61Var.o1.centerY()));
                    a61Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        a01Var.run();
                        if (n10 == null || (i5Var = a61Var.j1) == null) {
                            return;
                        }
                        i5Var.f();
                    }
                }
            });
            this.q1.addListener(new jh.h3(this, zArr, a01Var, 8));
            this.q1.setInterpolator(org.telegram.ui.Components.er.h);
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
        org.telegram.ui.Components.i5 i5Var = this.j1;
        if (i5Var != null) {
            i5Var.n = null;
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

    public final void s(q51 q51Var) {
        Integer num = this.U1;
        if (num != null) {
        }
        this.P1 = q51Var;
        boolean z10 = this.M0;
        int i10 = 0;
        x41 x41Var = this.d0;
        if (!z10) {
            h();
            while (i10 < x41Var.getChildCount()) {
                View childAt = x41Var.getChildAt(i10);
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
        ofFloat.addUpdateListener(new d41(this, i10));
        this.Q1.addListener(new f50(this, 28));
        e41 e41Var = new e41(this, i10);
        ig.g0.f = true;
        ig.g0.e = true;
        ig.g0.g = false;
        if (ig.g0.d) {
            ig.g0.d = false;
        }
        ig.g0.c = e41Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.S1.lock();
        this.Q1.setDuration(800L);
        x41Var.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        this.a0.setLayerType(2, null);
        this.U.setLayerType(2, null);
        org.telegram.ui.Components.zm zmVar = this.j0;
        if (zmVar != null) {
            zmVar.setLayerType(2, null);
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

    public void setBackgroundDelegate(a51 a51Var) {
        this.Q = a51Var;
    }

    public void setDrawBackground(boolean z10) {
        this.M0 = z10;
        this.T.setClipToOutline(z10);
        ag.t0 t0Var = this.U;
        if (z10) {
            t0Var.setVisibility(0);
        } else {
            t0Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.d0, (d5.d) new j4.w0(13));
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
        j51 j51Var = this.K;
        if (j51Var != null) {
            j51Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.d1 = z10;
    }

    public void setOnLongPressedListener(y51 y51Var) {
        this.D = y51Var;
    }

    public void setRecentReactions(List<ig.q0> list) {
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
        x41 x41Var = this.d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = j51Var.e;
                    if (t5Var != null) {
                        j51Var.d(hashSet.contains(Long.valueOf(t5Var.getDocumentId())), true);
                    } else {
                        j51Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            x41Var.invalidate();
        }
    }

    public void setSelectedReaction(ig.q0 q0Var) {
        this.F.clear();
        this.F.add(q0Var);
        x41 x41Var = this.d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    j51Var.d(this.F.contains(j51Var.x), true);
                }
            }
            x41Var.invalidate();
        }
        n41 n41Var = this.e0;
        if (n41Var != null) {
            for (int i11 = 0; i11 < n41Var.getChildCount(); i11++) {
                if (n41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var2 = (j51) n41Var.getChildAt(i11);
                    j51Var2.d(this.F.contains(j51Var2.x), true);
                }
            }
            n41Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ig.q0> hashSet) {
        this.F = hashSet;
        HashSet hashSet2 = this.G;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ig.q0) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((ig.q0) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        e41 e41Var = this.E1;
        if (e41Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e41Var);
            this.E1 = null;
        }
        jh.q5 q5Var = this.F1;
        if (q5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q5Var);
            this.F1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        k51 k51Var = this.m0;
        r41 r41Var = this.b0;
        if (isEmpty) {
            this.t1 = false;
            this.u1 = false;
            z(false, z10);
            if (r41Var != null) {
                r41Var.e(true);
                p51.a(r41Var, false);
            }
            k51Var.E(true);
            this.v1 = null;
        } else {
            boolean z12 = this.t1;
            boolean z13 = !z12;
            this.t1 = true;
            this.u1 = false;
            if (r41Var != null) {
                r41Var.f.b(2);
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
                k51Var.E(false);
            } else if (!str.equals(this.v1)) {
                e41 e41Var2 = new e41(this, 1);
                this.E1 = e41Var2;
                AndroidUtilities.runOnUIThread(e41Var2, 120L);
            }
            this.v1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, W1)) {
                MediaDataController.getInstance(this.R).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            W1 = currentKeyboardLanguage;
            jh.q5 q5Var2 = new jh.q5(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.F1 = q5Var2;
            AndroidUtilities.runOnUIThread(q5Var2, z11 ? 425L : 0L);
            if (r41Var != null) {
                r41Var.f.b(2);
                p51.a(r41Var, z10);
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
        ofFloat.addUpdateListener(new d41(this, 2));
        this.e1.setDuration(200L);
        this.e1.setInterpolator(org.telegram.ui.Components.er.f);
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
        x41 x41Var = this.d0;
        if (x41Var != null) {
            for (int i10 = 0; i10 < x41Var.getChildCount(); i10++) {
                if (x41Var.getChildAt(i10) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i10);
                    org.telegram.ui.Components.t5 t5Var = j51Var.e;
                    if (t5Var == null || t5Var.getDocumentId() != l10.longValue()) {
                        TLRPC.Document document = j51Var.d;
                        if (document != null && document.id == l10.longValue()) {
                            j51Var.e(z11, z10);
                        }
                    } else {
                        j51Var.e(z11, z10);
                    }
                }
            }
            x41Var.invalidate();
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
        x41 x41Var = this.d0;
        int i10 = 0;
        x41Var.setVisibility(0);
        n41 n41Var = this.e0;
        n41Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new h41(this, z10, i10));
        this.A1.addListener(new t41(this, z10, i10));
        this.A1.setDuration(320L);
        this.A1.setInterpolator(org.telegram.ui.Components.er.h);
        this.A1.start();
        org.telegram.messenger.rl.o(((View) x41Var.getParent()).animate().translationY((this.B1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new d41(this, 1)), org.telegram.ui.Components.er.f, 160L);
        if (this.B1 && z11) {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this(n2Var, context, z10, num, i10, z11, c6Var, i11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var));
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
    public a61(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12) {
        super(context);
        int i13;
        boolean z12;
        int i14;
        int i15;
        float f10;
        n41 n41Var;
        ag.d dVar;
        int i16;
        int i17;
        int i18;
        boolean z13;
        w41 w41Var;
        int i19;
        boolean z14;
        int i20;
        org.telegram.ui.Components.iv ivVar;
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
        this.V = new org.telegram.ui.Components.mv[2];
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
        this.N1 = new e41(this, 3);
        this.O1 = new e41(this, 4);
        this.S1 = new AnimationNotificationsLocker();
        this.T1 = new Paint();
        this.V0 = c6Var;
        this.S = i21;
        this.J0 = z10;
        this.Y0 = n2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.K0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.b1 = i22;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var));
        paint2.setColor(i0.b.k(i22, 30));
        this.g1 = new PorterDuffColorFilter(i22, PorterDuff.Mode.SRC_IN);
        this.U0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(h7.n.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
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
            addView(view, h7.z5.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z15 ? -12 : 4), n() ? 0 : this.Z0, 0.0f, n() ? this.Z0 : 0));
        }
        ag.t0 t0Var = new ag.t0(this, context, c6Var, 14);
        this.U = t0Var;
        boolean z16 = i21 == 3 || i21 == 4;
        boolean z17 = z16;
        u41 u41Var = new u41(this, context, z16, z17, c6Var, valueOf);
        Integer num2 = valueOf;
        this.T = u41Var;
        if (!z17) {
            u41Var.setOutlineProvider(new v41(this, num2));
            u41Var.setClipToOutline(true);
            if (z17) {
                u41Var.setElevation(2.0f);
            }
        }
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 15) {
            u41Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        u41Var.addView(t0Var, h7.z5.c(-1.0f, -1));
        addView(u41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 2 || i21 == 7) ? this.Z0 + 6 : 0.0f, 0.0f, n() ? this.Z0 + 6 : 0.0f));
        if (num2 != null) {
            org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 23);
            this.j0 = zmVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
            zmVar.setBackground(drawable);
            addView(zmVar, h7.z5.d(17, 9.0f, (n() ? 80 : 48) | 3, (num2.intValue() / AndroidUtilities.density) + (z15 ? -25 : 10), n() ? 0.0f : this.Z0 + 5, 0.0f, n() ? this.Z0 + 14 : 0.0f));
        }
        if (n2Var == null || i21 == 3 || i21 == 6 || i21 == 5 || i21 == 7) {
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
                            w41Var = new w41(this, context, c6Var, z18, z14, i20, !z12 ? new m21(5, this, n2Var) : null, i22, i10);
                            ivVar = w41Var.y;
                            if (ivVar != null) {
                                ivVar.setOnLongClickListener(new v(this, 7));
                            }
                            w41Var.R = false;
                            if (i20 != i13) {
                                w41Var.setAnimatedEmojiCacheType(13);
                            } else {
                                w41Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
                            }
                            w41Var.K = num3 != null;
                            w41Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                            if (i20 != 14 && i20 != 8 && i20 != 13) {
                                this.T.addView(w41Var, h7.z5.c(36.0f, -1));
                            }
                            this.V[i19] = w41Var;
                            i14 = i19 + 1;
                            i22 = i12;
                            i21 = i20;
                            num2 = num3;
                        }
                    }
                    i19 = i14;
                    z14 = true;
                    i20 = i21;
                    w41Var = new w41(this, context, c6Var, z18, z14, i20, !z12 ? new m21(5, this, n2Var) : null, i22, i10);
                    ivVar = w41Var.y;
                    if (ivVar != null) {
                    }
                    w41Var.R = false;
                    if (i20 != i13) {
                    }
                    w41Var.K = num3 != null;
                    w41Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                    if (i20 != 14) {
                        this.T.addView(w41Var, h7.z5.c(36.0f, -1));
                    }
                    this.V[i19] = w41Var;
                    i14 = i19 + 1;
                    i22 = i12;
                    i21 = i20;
                    num2 = num3;
                }
                Integer num4 = num2;
                i15 = i21;
                org.telegram.ui.Components.mv[] mvVarArr = this.V;
                this.W = mvVarArr[0];
                mvVarArr[1].setVisibility(8);
                s41 s41Var = new s41(context, num4, 1);
                this.a0 = s41Var;
                s41Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
                if (i15 != 14 || i15 == 8 || i15 == 13) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    this.T.addView(s41Var, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(s41Var, true, f10, false);
                x41 x41Var = new x41(this, context, i15);
                this.d0 = x41Var;
                y41 y41Var = new y41();
                this.a1 = y41Var;
                y41Var.c = 220L;
                y41Var.e = 260L;
                y41Var.f = 160L;
                y41Var.g = 160L;
                y41Var.m = false;
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
                y41Var.i = erVar;
                y41Var.C = false;
                x41Var.setItemAnimator(y41Var);
                x41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                z41 z41Var = new z41(this);
                this.l0 = z41Var;
                x41Var.setAdapter(z41Var);
                o41 o41Var = new o41(this, 1);
                this.n0 = o41Var;
                x41Var.setLayoutManager(o41Var);
                o41Var.O = new m41(this, 0);
                ag.d dVar2 = new ag.d(context, 29);
                this.c0 = dVar2;
                ag.y1 y1Var = new ag.y1(this, context);
                this.g0 = y1Var;
                y1Var.addView(x41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                dVar2.addView(y1Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                n41Var = new n41(this, context);
                this.e0 = n41Var;
                if (n41Var.getItemAnimator() == null) {
                    dVar = dVar2;
                    n41Var.getItemAnimator().n(180L);
                    n41Var.getItemAnimator().i = erVar;
                } else {
                    dVar = dVar2;
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
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                this.h0 = n9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.f0 = frameLayout;
                frameLayout.addView(n9Var, h7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                ag.d dVar3 = dVar;
                dVar3.addView(frameLayout, h7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                k51 k51Var = new k51(this);
                this.m0 = k51Var;
                n41Var.setAdapter(k51Var);
                o41 o41Var2 = new o41(this, 0);
                n41Var.setLayoutManager(o41Var2);
                o41Var2.O = new m41(this, 1);
                n41Var.setVisibility(8);
                dVar3.addView(n41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.T.addView(dVar3, h7.z5.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                c2.x xVar = new c2.x(x41Var, o41Var);
                this.o0 = xVar;
                xVar.i = new lh.k1(this, 1);
                xVar.h = new f41(this);
                q41 q41Var = new q41(this, i15, context, c6Var, num);
                x41Var.n1(q41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                n41Var.n1(q41Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.dm0 dm0Var = new org.telegram.ui.Components.dm0(this, i10, 2);
                x41Var.setOnItemClickListener(dm0Var);
                n41Var.setOnItemClickListener(dm0Var);
                r41 r41Var = new r41(this, context, z11);
                this.b0 = r41Var;
                r41Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                r41Var.setVisibility(4);
                dVar3.addView(r41Var, h7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                s41 s41Var2 = new s41(context, num4, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i23 = org.telegram.ui.ActionBar.g6.G8;
                int multiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent, mode));
                s41Var2.setBackground(drawable2);
                s41Var2.setAlpha(0.0f);
                this.T.addView(s41Var2, h7.z5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.k0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i23, c6Var), mode));
                if (i10 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.T.addView(view2, h7.z5.e(-1, 20, 87));
                View view3 = new View(context);
                this.p0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.T.addView(view3, h7.z5.c(-1.0f, -1));
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
                        ne.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z13 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z13 = true;
                        }
                        ig.g0.g = z13;
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
        org.telegram.ui.Components.mv[] mvVarArr2 = this.V;
        this.W = mvVarArr2[0];
        mvVarArr2[1].setVisibility(8);
        s41 s41Var3 = new s41(context, num42, 1);
        this.a0 = s41Var3;
        s41Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        if (i15 != 14) {
        }
        f10 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(s41Var3, true, f10, false);
        x41 x41Var2 = new x41(this, context, i15);
        this.d0 = x41Var2;
        y41 y41Var2 = new y41();
        this.a1 = y41Var2;
        y41Var2.c = 220L;
        y41Var2.e = 260L;
        y41Var2.f = 160L;
        y41Var2.g = 160L;
        y41Var2.m = false;
        org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.h;
        y41Var2.i = erVar2;
        y41Var2.C = false;
        x41Var2.setItemAnimator(y41Var2);
        x41Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        z41 z41Var2 = new z41(this);
        this.l0 = z41Var2;
        x41Var2.setAdapter(z41Var2);
        o41 o41Var3 = new o41(this, 1);
        this.n0 = o41Var3;
        x41Var2.setLayoutManager(o41Var3);
        o41Var3.O = new m41(this, 0);
        ag.d dVar22 = new ag.d(context, 29);
        this.c0 = dVar22;
        ag.y1 y1Var2 = new ag.y1(this, context);
        this.g0 = y1Var2;
        y1Var2.addView(x41Var2, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        dVar22.addView(y1Var2, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        n41Var = new n41(this, context);
        this.e0 = n41Var;
        if (n41Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i15 != i13) {
        }
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Le, c6Var));
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        this.h0 = n9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f0 = frameLayout2;
        frameLayout2.addView(n9Var2, h7.z5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, h7.z5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        ag.d dVar32 = dVar;
        dVar32.addView(frameLayout2, h7.z5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        n41Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        k51 k51Var2 = new k51(this);
        this.m0 = k51Var2;
        n41Var.setAdapter(k51Var2);
        o41 o41Var22 = new o41(this, 0);
        n41Var.setLayoutManager(o41Var22);
        o41Var22.O = new m41(this, 1);
        n41Var.setVisibility(8);
        dVar32.addView(n41Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.addView(dVar32, h7.z5.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        c2.x xVar2 = new c2.x(x41Var2, o41Var3);
        this.o0 = xVar2;
        xVar2.i = new lh.k1(this, 1);
        xVar2.h = new f41(this);
        q41 q41Var2 = new q41(this, i15, context, c6Var, num);
        x41Var2.n1(q41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        n41Var.n1(q41Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.dm0 dm0Var2 = new org.telegram.ui.Components.dm0(this, i10, 2);
        x41Var2.setOnItemClickListener(dm0Var2);
        n41Var.setOnItemClickListener(dm0Var2);
        r41 r41Var2 = new r41(this, context, z11);
        this.b0 = r41Var2;
        r41Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        r41Var2.setVisibility(4);
        dVar32.addView(r41Var2, h7.z5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        s41 s41Var22 = new s41(context, num42, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i232 = org.telegram.ui.ActionBar.g6.G8;
        int multiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.g6.v0(i232, c6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable22.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent2, mode2));
        s41Var22.setBackground(drawable22);
        s41Var22.setAlpha(0.0f);
        this.T.addView(s41Var22, h7.z5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.k0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable32.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i232, c6Var), mode2));
        if (i10 == 14) {
        }
        view22.setAlpha(0.0f);
        this.T.addView(view22, h7.z5.e(-1, 20, 87));
        View view32 = new View(context);
        this.p0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.T.addView(view32, h7.z5.c(-1.0f, -1));
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
            this.F.add(ig.q0.b(str));
        }
        x41 x41Var = this.d0;
        if (x41Var != null) {
            for (int i11 = 0; i11 < x41Var.getChildCount(); i11++) {
                if (x41Var.getChildAt(i11) instanceof j51) {
                    j51 j51Var = (j51) x41Var.getChildAt(i11);
                    j51Var.d(this.F.contains(j51Var.x), true);
                }
            }
            x41Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(z51 z51Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void r(j51 j51Var, ig.q0 q0Var) {
    }
}
