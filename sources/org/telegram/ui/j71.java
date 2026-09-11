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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class j71 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static String[] a2;
    public final ArrayList A0;
    public ArrayList A1;
    public final ArrayList B0;
    public ArrayList B1;
    public boolean C0;
    public ArrayList C1;
    public final ArrayList D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ValueAnimator E1;
    public int F;
    public final ArrayList F0;
    public boolean F1;
    public n61 G;
    public final ArrayList G0;
    public boolean G1;
    public h71 H;
    public final ArrayList H0;
    public ValueAnimator H1;
    public boolean I;
    public final ArrayList I0;
    public m51 I1;
    public HashSet J;
    public ArrayList J0;
    public bi.i7 J1;
    public final HashSet K;
    public final ArrayList K0;
    public boolean K1;
    public final Paint L;
    public ArrayList L0;
    public boolean L1;
    public final Paint M;
    public final ArrayList M0;
    public View M1;
    public Drawable N;
    public final boolean N0;
    public int N1;
    public s61 O;
    public boolean O0;
    public int O1;
    public boolean P;
    public Integer P0;
    public long P1;
    public boolean Q;
    public boolean Q0;
    public zh.h8 Q1;
    public boolean R;
    public List R0;
    public final m51 R1;
    public final ArrayList S;
    public s61 S0;
    public final m51 S1;
    public boolean T;
    public boolean T0;
    public Runnable T1;
    public j61 U;
    public float U0;
    public ValueAnimator U1;
    public final int V;
    public final ImageReceiver V0;
    public ValueAnimator V1;
    public final int W;
    public org.telegram.ui.Components.q5 W0;
    public final AnimationNotificationsLocker W1;
    public y51 X0;
    public final Paint X1;
    public final Integer Y0;
    public Integer Y1;
    public final org.telegram.ui.ActionBar.f6 Z0;
    public int a;
    public final d61 a0;
    public float a1;
    public int b;
    public final di.r6 b0;
    public float b1;
    public int c;
    public final org.telegram.ui.Components.bw[] c0;
    public final org.telegram.ui.ActionBar.n2 c1;
    public int d;
    public org.telegram.ui.Components.bw d0;
    public final int d1;
    public int e;
    public final b61 e0;
    public final h61 e1;
    public int f;
    public final a61 f0;
    public final int f1;
    public final v51 g0;
    public boolean g1;
    public int h;
    public final g61 h0;
    public boolean h1;
    public final w51 i0;
    public ValueAnimator i1;
    public final FrameLayout j0;
    public Drawable j1;
    public final ah.w k0;
    public final PorterDuffColorFilter k1;
    public final org.telegram.ui.Components.x9 l0;
    public float l1;
    public final View m0;
    public int m1;
    public int n;
    public final org.telegram.ui.Components.jn n0;
    public org.telegram.ui.Components.o5 n1;
    public final View o0;
    public Rect o1;
    public final i61 p0;
    public View p1;
    public final t61 q0;
    public float q1;
    public int r;
    public final x51 r0;
    public s61 r1;
    public int s;
    public final org.telegram.ui.Components.ok0 s0;
    public Rect s1;
    public final View t0;
    public final OvershootInterpolator t1;
    public int u0;
    public ValueAnimator u1;
    public int v;
    public final ArrayList v0;
    public boolean v1;
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
    public String z1;
    public static final List Z1 = Arrays.asList("😖", "😫", "\u1fae0", "😨", "❓");
    public static final boolean[] b2 = new boolean[4];
    public static final HashMap c2 = new HashMap();

    public j71(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this(n2Var, context, z10, num, i10, true, f6Var, 16);
    }

    public static void D(int i10, org.telegram.ui.Components.x9 x9Var) {
        List list;
        ImageLocation forDocument;
        String str;
        if (x9Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i10).getFeaturedEmojiSets());
        Collections.shuffle(arrayList);
        int round = (int) Math.round(Math.random() * 10.0d);
        TLRPC.Document document = null;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            list = Z1;
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
            x9Var.setLayerNum(7);
            x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
            x9Var.l(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "36_36", svgThumb, document);
        }
    }

    public static void a(j71 j71Var, int i10, int i11) {
        org.telegram.ui.Components.ok0 ok0Var = j71Var.s0;
        x51 x51Var = j71Var.r0;
        View m10 = x51Var.m(i10);
        int L0 = x51Var.L0();
        if ((m10 == null && Math.abs(i10 - L0) > 72.0f) || !SharedConfig.animationsEnabled()) {
            ok0Var.b = x51Var.L0() < i10 ? 0 : 1;
            ok0Var.c(i10, i11, false, false);
        } else {
            di.m1 m1Var = new di.m1(j71Var, j71Var.h0.getContext(), 4);
            m1Var.a = i10;
            m1Var.p = i11;
            x51Var.w0(m1Var);
        }
    }

    public static boolean c(j71 j71Var) {
        if (j71Var.T) {
            return true;
        }
        ValueAnimator valueAnimator = j71Var.U1;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCacheType() {
        int i10 = 13;
        int i11 = this.W;
        if (i11 != 5 && i11 != 7) {
            if (i11 == 6) {
                return org.telegram.ui.Components.q5.g();
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
        long j3;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String fixEmoji = Emoji.fixEmoji(str);
        int i10 = 0;
        while (true) {
            if (i10 >= tL_messages_stickerSet.packs.size()) {
                j3 = 0;
                break;
            }
            if (!tL_messages_stickerSet.packs.get(i10).documents.isEmpty() && TextUtils.equals(Emoji.fixEmoji(tL_messages_stickerSet.packs.get(i10).emoticon), fixEmoji)) {
                j3 = tL_messages_stickerSet.packs.get(i10).documents.get(0).longValue();
                break;
            }
            i10++;
        }
        if (j3 == 0) {
            return null;
        }
        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
            if (document.id == j3) {
                return document;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBigReactionAnimatedEmoji(org.telegram.ui.Components.q5 q5Var) {
        org.telegram.ui.Components.q5 q5Var2;
        if (this.I && (q5Var2 = this.W0) != q5Var) {
            if (q5Var2 != null) {
                q5Var2.o(this);
            }
            this.W0 = q5Var;
            if (q5Var != null) {
                q5Var.setColorFilter(this.k1);
                this.W0.a(this);
            }
        }
    }

    public static void t(final int i10) {
        boolean[] zArr = b2;
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
        org.telegram.ui.Components.vw0.x3.fetch(i10, 1, new Utilities.Callback() { // from class: org.telegram.ui.Components.lw0
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
                    q5.h(i10).b(emojiGroup.icon_emoji_id, null);
                }
            }
        });
    }

    public final void A(Long l4) {
        this.K.remove(l4);
        g61 g61Var = this.h0;
        if (g61Var != null) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                if (g61Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i11);
                    org.telegram.ui.Components.z5 z5Var = s61Var.e;
                    if (z5Var == null || z5Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = s61Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            s61Var.f();
                        }
                    } else {
                        s61Var.f();
                    }
                    z10 = true;
                }
            }
            g61Var.invalidate();
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
            i61 i61Var = this.p0;
            if (i61Var != null) {
                i61Var.m(i10);
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
        long j3;
        ArrayList arrayList3;
        int size;
        int i13;
        long j10;
        int i14;
        ArrayList arrayList4;
        g61 g61Var;
        int i15;
        int i16;
        ArrayList arrayList5;
        MediaDataController mediaDataController;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.Document> arrayList6;
        boolean z14;
        SparseIntArray sparseIntArray3;
        org.telegram.ui.Components.xx xxVar;
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
                        arrayList13.add(new org.telegram.ui.Components.z5(tL_emojiList.document_id.get(i11).longValue(), (Paint.FontMetricsInt) null));
                        i11++;
                        tL_emojiList = tL_emojiList;
                    }
                    for (i12 = 0; i12 < arrayList13.size(); i12++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.z5) arrayList13.get(i12)).getDocumentId() * 13) + 43223));
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
                                arrayList13.add(new org.telegram.ui.Components.z5(tL_messages_stickerSet.documents.get(i30), (Paint.FontMetricsInt) null));
                                i30++;
                                tL_messages_stickerSet = tL_messages_stickerSet;
                            }
                        }
                        for (int i31 = 0; i31 < arrayList13.size(); i31++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.z5) arrayList13.get(i31)).getDocumentId() * 13) + 43223));
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
                    org.telegram.ui.Components.xx xxVar2 = new org.telegram.ui.Components.xx();
                    xxVar2.f = true;
                    xxVar2.g = false;
                    xxVar2.h = true;
                    xxVar2.e = true;
                    xxVar2.b = new TLRPC.TL_stickerSet();
                    xxVar2.a = tL_emojiList3.document_id.get(0);
                    arrayList16.size();
                    arrayList16.add(xxVar2);
                    int i33 = 0;
                    while (i33 < tL_emojiList3.document_id.size()) {
                        arrayList13.add(new org.telegram.ui.Components.z5(tL_emojiList3.document_id.get(i33).longValue(), (Paint.FontMetricsInt) null));
                        i33++;
                        tL_emojiList3 = tL_emojiList3;
                    }
                    for (int i34 = 0; i34 < arrayList13.size(); i34++) {
                        arrayList11.add(Long.valueOf((((org.telegram.ui.Components.z5) arrayList13.get(i34)).getDocumentId() * 13) + 43223));
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
                        if (((ah.j1) arrayList22.get(i36)).e) {
                            arrayList7.add((ah.j1) arrayList22.remove(i36));
                            i36--;
                        }
                        i36++;
                    }
                    if (i24 != 8 || i24 == 11 || i24 == 13) {
                        arrayList14.addAll(arrayList22);
                    } else {
                        for (int i37 = 0; i37 < 16; i37++) {
                            if (!arrayList22.isEmpty()) {
                                arrayList14.add((ah.j1) arrayList22.remove(0));
                            }
                        }
                    }
                    for (i19 = 0; i19 < arrayList14.size(); i19++) {
                        arrayList11 = arrayList11;
                        arrayList11.add(Long.valueOf((((ah.j1) arrayList14.get(i19)).hashCode() * 13) - 5632));
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
                                if (((ah.j1) arrayList22.get(i21)).g != 0) {
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
                            arrayList11.add(Long.valueOf((((ah.j1) arrayList15.get(i22)).h * 13) + (z15 ? 4235 : -3142)));
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
                            arrayList11.add(Long.valueOf(((ah.j1) arrayList7.get(i20)).c * 19));
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
                            arrayList13.add(new org.telegram.ui.Components.z5(stickerSet.documents.get(i41), (Paint.FontMetricsInt) null));
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
                                        arrayList13.add(new org.telegram.ui.Components.z5(emojiStatusDocumentId.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        recentEmojiStatuses = arrayList24;
                                        size5 = i44;
                                    } else {
                                        if (((org.telegram.ui.Components.z5) arrayList13.get(i43)).getDocumentId() == emojiStatusDocumentId.longValue()) {
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
                                        arrayList13.add(new org.telegram.ui.Components.z5(emojiStatusDocumentId2.longValue(), (Paint.FontMetricsInt) null));
                                        if (arrayList13.size() + i10 >= 104) {
                                            break;
                                        }
                                        defaultEmojiStatuses = arrayList25;
                                        size6 = i47;
                                    } else if (((org.telegram.ui.Components.z5) arrayList13.get(i46)).getDocumentId() == emojiStatusDocumentId2.longValue()) {
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
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.z5) arrayList13.get(i48)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                    } else {
                        for (int i49 = 0; i49 < 39 - i10; i49++) {
                            arrayList11.add(Long.valueOf((((org.telegram.ui.Components.z5) arrayList13.get(i49)).getDocumentId() * 13) + 43223));
                            this.u0++;
                        }
                        arrayList11.add(Long.valueOf(((((arrayList13.size() - 40) + i10) + 1) * 13) - 5531));
                        n61 n61Var = this.G;
                        if (n61Var != null) {
                            n61Var.a.setText("+" + ((arrayList13.size() - 40) + i10 + 1));
                        }
                        sparseIntArray10.put(this.u0, -1);
                        this.u0++;
                    }
                }
            }
            arrayList19.clear();
            if (i24 != 0 || i24 == 12 || i24 == 9 || i24 == 10) {
                j3 = 13334;
                zh.j5 G = zh.s5.y(i23, false).G(getDialogId(), true);
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
                    j10 = 322;
                    this.s = this.u0;
                    this.d0.l(true);
                } else {
                    j10 = 322;
                    this.d0.l(false);
                }
                i14 = 13;
            } else {
                i14 = 13;
                j3 = 13334;
                j10 = 322;
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
                        arrayList11.add(Long.valueOf((r12.hashCode() * j10) + j3));
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
                                org.telegram.ui.Components.xx xxVar3 = new org.telegram.ui.Components.xx();
                                xxVar3.f = true;
                                xxVar3.g = false;
                                xxVar3.h = true;
                                if (i24 == 4) {
                                    xxVar3.e = false;
                                } else {
                                    xxVar3.e = !MessageObject.isPremiumEmojiPack(tL_messages_stickerSet3);
                                }
                                xxVar3.b = tL_messages_stickerSet3.set;
                                xxVar3.c = j(hashSet, tL_messages_stickerSet3.documents);
                                arrayList16.size();
                                arrayList16.add(xxVar3);
                                this.u0 = xxVar3.c.size() + this.u0;
                                for (int i54 = 0; i54 < xxVar3.c.size(); i54++) {
                                    arrayList11.add(Long.valueOf((((TLRPC.Document) xxVar3.c.get(i54)).id * 13) + 3212));
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
                            if (((org.telegram.ui.Components.xx) arrayList16.get(i55)).b.id == stickerSet3.id) {
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
                                        xxVar = new org.telegram.ui.Components.xx();
                                        xxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray15;
                                        xxVar.f = this.B0.contains(Long.valueOf(stickerSet3.id));
                                        xxVar.g = true;
                                        if (i24 != 4) {
                                            xxVar.e = false;
                                        } else {
                                            xxVar.e = !z14;
                                        }
                                        xxVar.b = stickerSet3;
                                        xxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        xxVar.h = this.A0.contains(Long.valueOf(xxVar.b.id));
                                        if (xxVar.c.size() > 24 || xxVar.h) {
                                            this.u0 = xxVar.c.size() + this.u0;
                                            for (i17 = 0; i17 < xxVar.c.size(); i17++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) xxVar.c.get(i17)).id * 13) + 3212));
                                            }
                                        } else {
                                            this.u0 += 24;
                                            for (int i56 = 0; i56 < 23; i56++) {
                                                arrayList11.add(Long.valueOf((((TLRPC.Document) xxVar.c.get(i56)).id * 13) + 3212));
                                            }
                                            arrayList11.add(Long.valueOf(((xxVar.c.size() - 23) * 169) + ((stickerSet3.id * 13) - 5531)));
                                            sparseIntArray10.put(this.u0 - 1, arrayList5.size());
                                        }
                                        if (!xxVar.f || i24 == 4) {
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
                                            arrayList5.add(xxVar);
                                        } else {
                                            sparseIntArray5 = sparseIntArray12;
                                        }
                                        arrayList5.add(xxVar);
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
                                        xxVar = new org.telegram.ui.Components.xx();
                                        xxVar.d = inputStickerSet;
                                        sparseIntArray4 = sparseIntArray152;
                                        xxVar.f = this.B0.contains(Long.valueOf(stickerSet3.id));
                                        xxVar.g = true;
                                        if (i24 != 4) {
                                        }
                                        xxVar.b = stickerSet3;
                                        xxVar.c = j(hashSet, arrayList6);
                                        arrayList5.size();
                                        xxVar.h = this.A0.contains(Long.valueOf(xxVar.b.id));
                                        if (xxVar.c.size() > 24) {
                                        }
                                        this.u0 = xxVar.c.size() + this.u0;
                                        while (i17 < xxVar.c.size()) {
                                        }
                                        if (xxVar.f) {
                                        }
                                        sparseIntArray5 = sparseIntArray12;
                                        arrayList5.add(xxVar);
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
            g61Var = this.h0;
            if (z17) {
                g61Var.setItemAnimator(null);
            } else {
                g61Var.setItemAnimator(this.e1);
            }
            if (z12) {
                i15 = 0;
                this.p0.l();
            } else {
                i15 = 0;
                s4.o.c(new hg.g(this, arrayList12, 3), false).b(this.p0);
            }
            if (g61Var.L1) {
                g61Var.u0(i15);
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
        j3 = 13334;
        zh.j5 G2 = zh.s5.y(i23, false).G(getDialogId(), true);
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
        g61Var = this.h0;
        if (z17) {
        }
        if (z12) {
        }
        if (g61Var.L1) {
        }
    }

    public final void C() {
        a61 a61Var = this.f0;
        if (a61Var == null) {
            return;
        }
        if (this.y1) {
            a61Var.clearAnimation();
            a61Var.setVisibility(0);
            a61Var.animate().translationY(0.0f).start();
            return;
        }
        g61 g61Var = this.h0;
        if (g61Var.getChildCount() <= 0) {
            a61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
            return;
        }
        View childAt = g61Var.getChildAt(0);
        if (RecyclerView.R(childAt) != this.a || !"searchbox".equals(childAt.getTag())) {
            a61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
        } else {
            a61Var.setVisibility(0);
            a61Var.setTranslationY(childAt.getY());
        }
    }

    public final void E(float f7) {
        View view = this.m0;
        if (view != null) {
            float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(w7.p.a((((f7 * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            view.setScaleY(interpolation * (n() ? -1 : 1));
        }
        org.telegram.ui.Components.jn jnVar = this.n0;
        if (jnVar != null) {
            float a10 = w7.p.a((((f7 * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            jnVar.setAlpha(a10);
            jnVar.setScaleX(a10);
            jnVar.setScaleY(a10 * (n() ? -1 : 1));
        }
        float f10 = 800.0f * f7;
        float f11 = f10 - 40.0f;
        float a11 = w7.p.a(f11 / 700.0f, 0.0f, 1.0f);
        float a12 = w7.p.a((f10 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a13 = w7.p.a(f11 / 750.0f, 0.0f, 1.0f);
        float a14 = w7.p.a((f10 - 30.0f) / 120.0f, 0.0f, 1.0f);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        float interpolation2 = prVar.getInterpolation(a11);
        float interpolation3 = prVar.getInterpolation(a12);
        this.b0.setAlpha(a14);
        this.f0.setAlpha(a14);
        int i10 = 0;
        for (int i11 = 0; i11 < this.d0.b.getChildCount(); i11++) {
            this.d0.b.getChildAt(i11).setAlpha(a14);
        }
        if (this.n1 != null) {
            invalidate();
        }
        float f12 = 1.0f - a14;
        d61 d61Var = this.a0;
        d61Var.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        if (jnVar != null) {
            jnVar.setTranslationY(AndroidUtilities.dp(-5.0f) * f12);
        }
        this.a1 = (interpolation2 * 0.85f) + 0.15f;
        this.b1 = (interpolation3 * 0.925f) + 0.075f;
        d61Var.invalidateOutline();
        if (jnVar != null) {
            jnVar.setAlpha(a14);
        }
        b61 b61Var = this.e0;
        b61Var.setAlpha(a14);
        b61Var.setScaleX(Math.min(this.a1, 1.0f));
        float pivotX = b61Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(d61Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(d61Var.getHeight(), 2.0d) + Math.pow(d61Var.getWidth() - pivotX, 2.0d)));
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
            float cascade = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(cascade)) {
                cascade = 0.0f;
            }
            childAt.setScaleX(cascade);
            childAt.setScaleY(cascade);
        }
        while (true) {
            g61 g61Var = this.h0;
            if (i10 >= g61Var.getChildCount()) {
                this.k0.invalidate();
                g61Var.invalidate();
                return;
            }
            View childAt2 = g61Var.getChildAt(i10);
            if (childAt2 instanceof s61) {
                s61 s61Var = (s61) childAt2;
                float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                if (n()) {
                    height2 = getMeasuredHeight() - height2;
                }
                float cascade2 = AndroidUtilities.cascade(a13, (float) Math.sqrt(com.google.android.gms.internal.vision.e2.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                if (Float.isNaN(cascade2)) {
                    cascade2 = 0.0f;
                }
                s61Var.setAnimatedScale(cascade2);
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
        m51 m51Var = this.S1;
        if (i10 == i12) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.Q)) {
                AndroidUtilities.cancelRunOnUIThread(m51Var);
                AndroidUtilities.runOnUIThread(m51Var);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.featuredEmojiDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
            return;
        }
        if (i10 == NotificationCenter.recentEmojiStatusesUpdate) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
            return;
        }
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            AndroidUtilities.runOnUIThread(m51Var);
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.starUserGiftsLoaded && ((Long) objArr[0]).longValue() == UserConfig.getInstance(this.V).getClientUserId()) {
                AndroidUtilities.cancelRunOnUIThread(m51Var);
                AndroidUtilities.runOnUIThread(m51Var);
                return;
            }
            return;
        }
        bi.f fVar = new bi.f(19);
        g61 g61Var = this.h0;
        AndroidUtilities.forEachViews((RecyclerView) g61Var, (e2.h) fVar);
        if (g61Var != null) {
            g61Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        org.telegram.ui.Components.o5 o5Var = this.n1;
        if (o5Var != null && (num = this.Y0) != null) {
            Rect bounds = o5Var.getBounds();
            View view = this.p1;
            float scaleY = view == null ? 1.0f : view.getScaleY();
            int alpha = this.n1.getAlpha();
            View view2 = this.p1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.n1.v = (int) (Math.pow(this.a0.getAlpha(), 0.25d) * alpha * this.l1);
            if (this.o1 == null) {
                this.o1 = new Rect();
            }
            float f7 = (scaleY <= 1.0f || scaleY >= 1.5f) ? 0 : 2;
            float intValue = num.intValue() + f7;
            float z10 = com.google.android.gms.internal.vision.e2.z(scaleY, 1.0f, bounds.centerY(), -(scaleY > 1.5f ? (bounds.height() * 0.81f) + 1.0f : 0.0f));
            boolean n10 = n();
            int i10 = this.d1;
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + z10 + (!n10 ? AndroidUtilities.dp(i10) : getMeasuredHeight() - (AndroidUtilities.dp(i10) / 2.0f));
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.o1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            org.telegram.ui.Components.o5 o5Var2 = this.n1;
            Rect rect = this.o1;
            int i11 = rect.left;
            Rect rect2 = this.o1;
            o5Var2.setBounds(i11, rect.top, (int) ((rect.width() / scaleY) + i11), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.o1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.n1.draw(canvas);
            org.telegram.ui.Components.o5 o5Var3 = this.n1;
            o5Var3.v = alpha;
            o5Var3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        s61 s61Var = this.r1;
        if (s61Var == null || this.s1 == null || s61Var.E == null) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, -getTranslationY());
        this.r1.E.setAlpha((int) (this.q1 * 255.0f));
        this.r1.E.setBounds(this.s1);
        this.r1.E.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.l1, this.f1, this.m1), PorterDuff.Mode.SRC_IN));
        this.r1.E.draw(canvas);
        canvas.restore();
    }

    public final long f() {
        return Math.max(450L, Math.min(55, this.O1 - this.N1) * 30);
    }

    public final long g() {
        return Math.max(300L, Math.min(45, this.O1 - this.N1) * 25) + f() + 16;
    }

    public zh.h8 getCollectionParticles() {
        if (this.Q1 == null) {
            this.Q1 = new zh.h8(1, 8);
        }
        return this.Q1;
    }

    public long getDialogId() {
        return UserConfig.getInstance(this.V).getClientUserId();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h() {
        boolean canScrollVertically = (this.F1 ? this.i0 : this.h0).canScrollVertically(1);
        if (canScrollVertically != this.v1) {
            this.v1 = canScrollVertically;
            this.o0.animate().alpha(canScrollVertically ? 1.0f : 0.0f).setDuration(200L).start();
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
                org.telegram.ui.Components.xx xxVar = (org.telegram.ui.Components.xx) arrayList.get(i15);
                if (xxVar.h) {
                    return;
                }
                z11 = i15 + 1 == arrayList.size();
                i13 = this.x0.get(i15);
                this.A0.add(Long.valueOf(xxVar.b.id));
                i11 = 24;
                i12 = xxVar.h ? xxVar.c.size() : Math.min(24, xxVar.c.size());
                num = xxVar.c.size() > 24 ? Integer.valueOf(i13 + 1 + i12) : null;
                xxVar.h = true;
                i14 = xxVar.c.size();
                if (i14 > i12) {
                    num = Integer.valueOf(i13 + 1 + i12);
                    num2 = Integer.valueOf(i14 - i12);
                }
                B(false, true, true);
                if (num != null || num2 == null) {
                }
                this.M1 = view;
                this.N1 = num.intValue();
                this.O1 = num2.intValue() + num.intValue();
                this.P1 = SystemClock.elapsedRealtime();
                if (z11) {
                    post(new org.telegram.ui.Components.sx(this, num2.intValue() > i11 / 2 ? 1.5f : 3.5f, num.intValue(), 1));
                    return;
                }
                return;
            }
        }
        if (i15 != -1 || (z10 = this.C0)) {
            return;
        }
        int i16 = (this.a != -1 ? 1 : 0) + (this.v != -1 ? 1 : 0);
        boolean z12 = this.N0;
        int i17 = i16 + (z12 ? 1 : 0);
        ArrayList arrayList2 = this.D0;
        int size = z10 ? arrayList2.size() : Math.min(38 - (z12 ? 1 : 0), arrayList2.size());
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
        String s10 = a4.a.s(new StringBuilder("emoji"), (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) ? "status" : "reaction", "usehint");
        int i11 = MessagesController.getGlobalMainSettings().getInt(s10, 0);
        if (i11 <= 3) {
            MessagesController.getGlobalMainSettings().edit().putInt(s10, i11 + 1).apply();
        }
    }

    public final boolean n() {
        int i10 = this.W;
        return i10 == 5 || i10 == 10 || i10 == 12 || i10 == 15;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
    
        if (r13.K.contains(java.lang.Long.valueOf(r15.documentId)) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(View view, org.telegram.ui.Components.z5 z5Var) {
        l();
        if (z5Var != null) {
            int i10 = this.W;
            if (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10) {
            }
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = z5Var.getDocumentId();
            TLRPC.Document document = z5Var.document;
            int i11 = this.V;
            if (document == null) {
                document = org.telegram.ui.Components.q5.f(i11, z5Var.documentId);
            }
            if (!(view instanceof s61)) {
                p(view, Long.valueOf(z5Var.documentId), document, null, null);
                return;
            }
            final s61 s61Var = (s61) view;
            if (s61Var.v == null && (i10 == 0 || i10 == 12 || i10 == 9 || i10 == 10)) {
                MediaDataController.getInstance(i11).pushRecentEmojiStatus(tL_emojiStatus);
            }
            if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10 && i10 != 2) {
                p(view, Long.valueOf(z5Var.documentId), document, s61Var.v, null);
                return;
            }
            TLRPC.Document document2 = document;
            if (!F(s61Var.v)) {
                p(view, Long.valueOf(z5Var.documentId), document2, s61Var.v, null);
                return;
            }
            final h90 h90Var = new h90(this, view, z5Var, document2, s61Var, 23);
            if (this.u1 != null || this.n1 == null) {
                h90Var.run();
                return;
            }
            s61Var.b = true;
            final Rect rect = new Rect();
            d61 d61Var = this.a0;
            int left = d61Var.getLeft();
            g61 g61Var = this.h0;
            rect.set(s61Var.getLeft() + g61Var.getLeft() + left, s61Var.getTop() + g61Var.getTop() + d61Var.getTop(), s61Var.getRight() + g61Var.getLeft() + d61Var.getLeft(), s61Var.getBottom() + g61Var.getTop() + d61Var.getTop());
            Drawable drawable = s61Var.E;
            final org.telegram.ui.Components.q5 n10 = drawable instanceof org.telegram.ui.Components.q5 ? org.telegram.ui.Components.q5.n(i11, ((org.telegram.ui.Components.q5) drawable).i(), null, 7) : null;
            this.r1 = s61Var;
            Rect rect2 = new Rect();
            this.s1 = rect2;
            rect2.set(rect);
            final boolean[] zArr = new boolean[1];
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.u1 = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.o51
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.telegram.ui.Components.o5 o5Var;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    j71 j71Var = j71.this;
                    j71Var.l1 = 1.0f - ((floatValue * floatValue) * floatValue);
                    j71Var.q1 = 1.0f - ((float) Math.pow(floatValue, 10.0d));
                    AndroidUtilities.lerp(rect, j71Var.o1, floatValue, j71Var.s1);
                    float scaleX = s61Var.getScaleX() * Math.max(1.0f, j71Var.t1.getInterpolation(w7.p.a((3.0f * floatValue) - 2.0f, 0.0f, 1.0f)));
                    j71Var.s1.set((int) org.telegram.messenger.vl.c(j71Var.s1.width(), 2.0f, scaleX, r0.centerX()), (int) org.telegram.messenger.vl.c(j71Var.s1.height(), 2.0f, scaleX, j71Var.s1.centerY()), (int) a4.a.e(j71Var.s1.width(), 2.0f, scaleX, j71Var.s1.centerX()), (int) a4.a.e(j71Var.s1.height(), 2.0f, scaleX, j71Var.s1.centerY()));
                    j71Var.invalidate();
                    if (floatValue > 0.85f) {
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        h90Var.run();
                        if (n10 == null || (o5Var = j71Var.n1) == null) {
                            return;
                        }
                        o5Var.f();
                    }
                }
            });
            this.u1.addListener(new bi.j4(this, zArr, h90Var, 8));
            this.u1.setInterpolator(org.telegram.ui.Components.pr.h);
            this.u1.setDuration(260L);
            this.u1.start();
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
        org.telegram.ui.Components.o5 o5Var = this.n1;
        if (o5Var != null) {
            o5Var.n = this;
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
        org.telegram.ui.Components.o5 o5Var = this.n1;
        if (o5Var != null) {
            o5Var.n = null;
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

    public final void s(z61 z61Var) {
        Integer num = this.Y1;
        if (num != null) {
        }
        this.T1 = z61Var;
        boolean z10 = this.Q0;
        int i10 = 0;
        g61 g61Var = this.h0;
        if (!z10) {
            h();
            while (i10 < g61Var.getChildCount()) {
                View childAt = g61Var.getChildAt(i10);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                i10++;
            }
            return;
        }
        ValueAnimator valueAnimator = this.U1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U1 = null;
        }
        ValueAnimator valueAnimator2 = this.V1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.V1 = null;
        }
        int i11 = this.W;
        if (i11 == 3 || i11 == 4 || i11 == 6) {
            h();
            E(1.0f);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.U1 = ofFloat;
        ofFloat.addUpdateListener(new l51(this, i10));
        this.U1.addListener(new gk0(this, 23));
        m51 m51Var = new m51(this, i10);
        ah.y0.f = true;
        ah.y0.e = true;
        ah.y0.g = false;
        if (ah.y0.d) {
            ah.y0.d = false;
        }
        ah.y0.c = m51Var;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.W1.lock();
        this.U1.setDuration(800L);
        g61Var.setLayerType(2, null);
        this.f0.setLayerType(2, null);
        this.e0.setLayerType(2, null);
        this.b0.setLayerType(2, null);
        org.telegram.ui.Components.jn jnVar = this.n0;
        if (jnVar != null) {
            jnVar.setLayerType(2, null);
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

    public void setBackgroundDelegate(j61 j61Var) {
        this.U = j61Var;
    }

    public void setDrawBackground(boolean z10) {
        this.Q0 = z10;
        this.a0.setClipToOutline(z10);
        di.r6 r6Var = this.b0;
        if (z10) {
            r6Var.setVisibility(0);
        } else {
            r6Var.setVisibility(8);
        }
    }

    public void setEnterAnimationInProgress(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                return;
            }
            AndroidUtilities.forEachViews((RecyclerView) this.h0, (e2.h) new bi.f(29));
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
        s61 s61Var = this.O;
        if (s61Var != null) {
            s61Var.h.setImageBitmap(drawable);
        }
    }

    public void setLongPressEnabled(boolean z10) {
        this.h1 = z10;
    }

    public void setOnLongPressedListener(h71 h71Var) {
        this.H = h71Var;
    }

    public void setRecentReactions(List<ah.j1> list) {
        this.R0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i10) {
        this.Y1 = Integer.valueOf(i10);
    }

    public void setSelected(Long l4) {
        HashSet hashSet = this.K;
        hashSet.clear();
        hashSet.add(l4);
        g61 g61Var = this.h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = s61Var.e;
                    if (z5Var != null) {
                        s61Var.d(hashSet.contains(Long.valueOf(z5Var.getDocumentId())), true);
                    } else {
                        s61Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            g61Var.invalidate();
        }
    }

    public void setSelectedReaction(ah.j1 j1Var) {
        this.J.clear();
        this.J.add(j1Var);
        g61 g61Var = this.h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    s61Var.d(this.J.contains(s61Var.x), true);
                }
            }
            g61Var.invalidate();
        }
        w51 w51Var = this.i0;
        if (w51Var != null) {
            for (int i11 = 0; i11 < w51Var.getChildCount(); i11++) {
                if (w51Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var2 = (s61) w51Var.getChildAt(i11);
                    s61Var2.d(this.J.contains(s61Var2.x), true);
                }
            }
            w51Var.invalidate();
        }
    }

    public void setSelectedReactions(HashSet<ah.j1> hashSet) {
        this.J = hashSet;
        HashSet hashSet2 = this.K;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null && ((ah.j1) arrayList.get(i10)).g != 0) {
                hashSet2.add(Long.valueOf(((ah.j1) arrayList.get(i10)).g));
            }
        }
    }

    public boolean u() {
        return false;
    }

    public final void v(String str, boolean z10, boolean z11) {
        m51 m51Var = this.I1;
        if (m51Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m51Var);
            this.I1 = null;
        }
        bi.i7 i7Var = this.J1;
        if (i7Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i7Var);
            this.J1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        t61 t61Var = this.q0;
        a61 a61Var = this.f0;
        if (isEmpty) {
            this.x1 = false;
            this.y1 = false;
            z(false, z10);
            if (a61Var != null) {
                a61Var.e(true);
                y61.a(a61Var, false);
            }
            t61Var.E(true);
            this.z1 = null;
        } else {
            boolean z12 = this.x1;
            boolean z13 = !z12;
            this.x1 = true;
            this.y1 = false;
            if (a61Var != null) {
                a61Var.f.b(2);
            }
            if (!z12) {
                ArrayList arrayList = this.A1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.B1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.D1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                t61Var.E(false);
            } else if (!str.equals(this.z1)) {
                m51 m51Var2 = new m51(this, 1);
                this.I1 = m51Var2;
                AndroidUtilities.runOnUIThread(m51Var2, 120L);
            }
            this.z1 = str;
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(currentKeyboardLanguage, a2)) {
                MediaDataController.getInstance(this.V).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            a2 = currentKeyboardLanguage;
            bi.i7 i7Var2 = new bi.i7(this, str, z10, z13, currentKeyboardLanguage, 3);
            this.J1 = i7Var2;
            AndroidUtilities.runOnUIThread(i7Var2, z11 ? 425L : 0L);
            if (a61Var != null) {
                a61Var.f.b(2);
                y61.a(a61Var, z10);
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
        ofFloat.addUpdateListener(new l51(this, 2));
        this.i1.setDuration(200L);
        this.i1.setInterpolator(org.telegram.ui.Components.pr.f);
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
        g61 g61Var = this.h0;
        if (g61Var != null) {
            for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                if (g61Var.getChildAt(i10) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i10);
                    org.telegram.ui.Components.z5 z5Var = s61Var.e;
                    if (z5Var == null || z5Var.getDocumentId() != l4.longValue()) {
                        TLRPC.Document document = s61Var.d;
                        if (document != null && document.id == l4.longValue()) {
                            s61Var.e(z11, z10);
                        }
                    } else {
                        s61Var.e(z11, z10);
                    }
                }
            }
            g61Var.invalidate();
        }
    }

    public final void y(org.telegram.ui.Components.o5 o5Var, View view) {
        Integer num;
        this.m1 = (o5Var == null || (num = o5Var.F) == null) ? 0 : num.intValue();
        this.n1 = o5Var;
        this.p1 = view;
        if (this.I && o5Var != null) {
            o5Var.n = this;
        }
        invalidate();
    }

    public final void z(boolean z10, boolean z11) {
        if (this.F1 == z10) {
            return;
        }
        this.F1 = z10;
        g61 g61Var = this.h0;
        int i10 = 0;
        g61Var.setVisibility(0);
        w51 w51Var = this.i0;
        w51Var.setVisibility(0);
        ValueAnimator valueAnimator = this.E1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.H1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.H1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E1 = ofFloat;
        ofFloat.addUpdateListener(new p51(this, z10, i10));
        this.E1.addListener(new c61(this, z10, i10));
        this.E1.setDuration(320L);
        this.E1.setInterpolator(org.telegram.ui.Components.pr.h);
        this.E1.start();
        org.telegram.messenger.vl.q(((View) g61Var.getParent()).animate().translationY((this.F1 && z11) ? -AndroidUtilities.dp(36.0f) : 0.0f).setUpdateListener(new l51(this, 1)), org.telegram.ui.Components.pr.f, 160L);
        if (this.F1 && z11) {
            w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        } else {
            w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        }
        h();
    }

    public j71(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this(n2Var, context, z10, num, i10, z11, f6Var, i11, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var));
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
    public j71(org.telegram.ui.ActionBar.n2 n2Var, Context context, boolean z10, Integer num, int i10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context);
        int i13;
        boolean z12;
        int i14;
        int i15;
        float f7;
        w51 w51Var;
        v51 v51Var;
        int i16;
        int i17;
        int i18;
        boolean z13;
        f61 f61Var;
        int i19;
        boolean z14;
        int i20;
        org.telegram.ui.Components.xv xvVar;
        int i21 = i10;
        int i22 = i12;
        this.J = new HashSet();
        this.K = new HashSet();
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.S = new ArrayList();
        this.V = UserConfig.selectedAccount;
        this.c0 = new org.telegram.ui.Components.bw[2];
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
        this.l1 = 1.0f;
        this.q1 = 1.0f;
        this.t1 = new OvershootInterpolator(2.0f);
        this.v1 = false;
        this.w1 = false;
        this.x1 = false;
        this.y1 = false;
        this.F1 = false;
        this.G1 = false;
        this.K1 = false;
        this.L1 = false;
        this.N1 = -1;
        this.O1 = -1;
        this.P1 = -1L;
        this.R1 = new m51(this, 3);
        this.S1 = new m51(this, 4);
        this.W1 = new AnimationNotificationsLocker();
        this.X1 = new Paint();
        this.Z0 = f6Var;
        this.W = i21;
        this.N0 = z10;
        this.c1 = n2Var;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        StringBuilder sb2 = new StringBuilder("emoji");
        sb2.append((i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10) ? "status" : "reaction");
        sb2.append("usehint");
        this.O0 = globalMainSettings.getInt(sb2.toString(), 0) < 3;
        this.f1 = i22;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
        paint2.setColor(i0.a.k(i22, 30));
        this.k1 = new PorterDuffColorFilter(i22, PorterDuff.Mode.SRC_IN);
        this.Y0 = num;
        Integer valueOf = num == null ? null : Integer.valueOf(w7.p.b(num.intValue(), AndroidUtilities.dp(26.0f), AndroidUtilities.dp(292.0f)));
        boolean z15 = valueOf != null && valueOf.intValue() > AndroidUtilities.dp(170.0f);
        setFocusableInTouchMode(true);
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 7) {
            this.d1 = i11;
            setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            setOnTouchListener(new d0(this, 6));
        }
        if (valueOf != null) {
            View view = new View(context);
            this.m0 = view;
            Drawable mutate = getResources().getDrawable(R.drawable.shadowed_bubble1).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
            view.setBackground(mutate);
            addView(view, w7.x5.d(10, 10.0f, (n() ? 80 : 48) | 3, (valueOf.intValue() / AndroidUtilities.density) + (z15 ? -12 : 4), n() ? 0 : this.d1, 0.0f, n() ? this.d1 : 0));
        }
        di.r6 r6Var = new di.r6(this, context, f6Var, 13);
        this.b0 = r6Var;
        boolean z16 = i21 == 3 || i21 == 4;
        boolean z17 = z16;
        d61 d61Var = new d61(this, context, z16, z17, f6Var, valueOf);
        Integer num2 = valueOf;
        this.a0 = d61Var;
        if (!z17) {
            d61Var.setOutlineProvider(new e61(this, num2));
            d61Var.setClipToOutline(true);
            if (z17) {
                d61Var.setElevation(2.0f);
            }
        }
        if (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 10 || i21 == 2 || i21 == 5 || i21 == 15) {
            d61Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        }
        d61Var.addView(r6Var, w7.x5.c(-1.0f, -1));
        addView(d61Var, w7.x5.d(-1, -1.0f, 119, 0.0f, (i21 == 0 || i21 == 12 || i21 == 9 || i21 == 2 || i21 == 7) ? this.d1 + 6 : 0.0f, 0.0f, n() ? this.d1 + 6 : 0.0f));
        if (num2 != null) {
            org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 24);
            this.n0 = jnVar;
            Drawable drawable = getResources().getDrawable(R.drawable.shadowed_bubble2_half);
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
            jnVar.setBackground(drawable);
            addView(jnVar, w7.x5.d(17, 9.0f, (n() ? 80 : 48) | 3, (num2.intValue() / AndroidUtilities.density) + (z15 ? -25 : 10), n() ? 0.0f : this.d1 + 5, 0.0f, n() ? this.d1 + 14 : 0.0f));
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
                            f61Var = new f61(this, context, f6Var, z18, z14, i20, !z12 ? new rx0(29, this, n2Var) : null, i22, i10);
                            xvVar = f61Var.y;
                            if (xvVar != null) {
                                xvVar.setOnLongClickListener(new u(this, 7));
                            }
                            f61Var.U = false;
                            if (i20 != i13) {
                                f61Var.setAnimatedEmojiCacheType(13);
                            } else {
                                f61Var.setAnimatedEmojiCacheType((i20 == 0 || i20 == 12 || i20 == 2) ? 6 : 5);
                            }
                            f61Var.O = num3 != null;
                            f61Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                            if (i20 != 14 && i20 != 8 && i20 != 13) {
                                this.a0.addView(f61Var, w7.x5.c(36.0f, -1));
                            }
                            this.c0[i19] = f61Var;
                            i14 = i19 + 1;
                            i22 = i12;
                            i21 = i20;
                            num2 = num3;
                        }
                    }
                    i19 = i14;
                    z14 = true;
                    i20 = i21;
                    f61Var = new f61(this, context, f6Var, z18, z14, i20, !z12 ? new rx0(29, this, n2Var) : null, i22, i10);
                    xvVar = f61Var.y;
                    if (xvVar != null) {
                    }
                    f61Var.U = false;
                    if (i20 != i13) {
                    }
                    f61Var.O = num3 != null;
                    f61Var.setPaddingLeft(i20 != 6 ? 10.0f : 5.0f);
                    if (i20 != 14) {
                        this.a0.addView(f61Var, w7.x5.c(36.0f, -1));
                    }
                    this.c0[i19] = f61Var;
                    i14 = i19 + 1;
                    i22 = i12;
                    i21 = i20;
                    num2 = num3;
                }
                Integer num4 = num2;
                i15 = i21;
                org.telegram.ui.Components.bw[] bwVarArr = this.c0;
                this.d0 = bwVarArr[0];
                bwVarArr[1].setVisibility(8);
                b61 b61Var = new b61(context, num4, 1);
                this.e0 = b61Var;
                b61Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
                if (i15 != 14 || i15 == 8 || i15 == 13) {
                    f7 = 1.0f;
                } else {
                    f7 = 1.0f;
                    this.a0.addView(b61Var, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 36.0f, 0.0f, 0.0f));
                }
                AndroidUtilities.updateViewVisibilityAnimated(b61Var, true, f7, false);
                g61 g61Var = new g61(this, context, i15);
                this.h0 = g61Var;
                h61 h61Var = new h61();
                this.e1 = h61Var;
                h61Var.c = 220L;
                h61Var.e = 260L;
                h61Var.f = 160L;
                h61Var.g = 160L;
                h61Var.m = false;
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                h61Var.i = prVar;
                h61Var.C = false;
                g61Var.setItemAnimator(h61Var);
                g61Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                i61 i61Var = new i61(this);
                this.p0 = i61Var;
                g61Var.setAdapter(i61Var);
                x51 x51Var = new x51(this, 1);
                this.r0 = x51Var;
                g61Var.setLayoutManager(x51Var);
                x51Var.O = new u51(this, 0);
                v51 v51Var2 = new v51(context, 0);
                this.g0 = v51Var2;
                ah.w wVar = new ah.w(this, context);
                this.k0 = wVar;
                wVar.addView(g61Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                v51Var2.addView(wVar, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                w51Var = new w51(this, context);
                this.i0 = w51Var;
                if (w51Var.getItemAnimator() == null) {
                    v51Var = v51Var2;
                    w51Var.getItemAnimator().n(180L);
                    w51Var.getItemAnimator().i = prVar;
                } else {
                    v51Var = v51Var2;
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
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
                this.l0 = x9Var;
                FrameLayout frameLayout = new FrameLayout(context);
                this.j0 = frameLayout;
                frameLayout.addView(x9Var, w7.x5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
                frameLayout.setVisibility(8);
                frameLayout.setAlpha(0.0f);
                v51 v51Var3 = v51Var;
                v51Var3.addView(frameLayout, w7.x5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
                w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
                t61 t61Var = new t61(this);
                this.q0 = t61Var;
                w51Var.setAdapter(t61Var);
                x51 x51Var2 = new x51(this, 0);
                w51Var.setLayoutManager(x51Var2);
                x51Var2.O = new u51(this, 1);
                w51Var.setVisibility(8);
                v51Var3.addView(w51Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
                this.a0.addView(v51Var3, w7.x5.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(g61Var, x51Var);
                this.s0 = ok0Var;
                ok0Var.i = new di.l1(this, 1);
                ok0Var.h = new n51(this);
                z51 z51Var = new z51(this, i15, context, f6Var, num);
                g61Var.m1(z51Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                w51Var.m1(z51Var, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
                org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(this, i10, 2);
                g61Var.setOnItemClickListener(pm0Var);
                w51Var.setOnItemClickListener(pm0Var);
                a61 a61Var = new a61(this, context, z11);
                this.f0 = a61Var;
                a61Var.setTranslationY(-AndroidUtilities.dp(52.0f));
                a61Var.setVisibility(4);
                v51Var3.addView(a61Var, w7.x5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
                b61 b61Var2 = new b61(context, num4, 0);
                Drawable drawable2 = getResources().getDrawable(R.drawable.gradient_top);
                int i23 = org.telegram.ui.ActionBar.j6.G8;
                int multiplyAlphaComponent = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), 0.8f);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable2.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent, mode));
                b61Var2.setBackground(drawable2);
                b61Var2.setAlpha(0.0f);
                this.a0.addView(b61Var2, w7.x5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
                View view2 = new View(context);
                this.o0 = view2;
                Drawable drawable3 = getResources().getDrawable(R.drawable.gradient_bottom);
                drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i23, f6Var), mode));
                if (i10 == 14) {
                    view2.setBackground(drawable3);
                }
                view2.setAlpha(0.0f);
                this.a0.addView(view2, w7.x5.e(-1, 20, 87));
                View view3 = new View(context);
                this.t0 = view3;
                view3.setAlpha(0.0f);
                view3.setBackgroundColor(-16777216);
                this.a0.addView(view3, w7.x5.c(-1.0f, -1));
                i16 = this.V;
                if (MediaDataController.getInstance(i16) == null) {
                    MediaDataController.getInstance(i16).checkStickers(5);
                    if (i10 == 14) {
                        MessagesController.getInstance(this.V).getAvailableEffects();
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
                    this.V0.setLayerNum(7);
                    i18 = this.W;
                    if (i18 != i17 || i18 == 4 || i18 == 6) {
                        z13 = true;
                    } else {
                        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
                        if (cacheOutQueue.b == null) {
                            z13 = true;
                            cacheOutQueue.b = new CountDownLatch(1);
                        } else {
                            z13 = true;
                        }
                        ah.y0.g = z13;
                    }
                    B(z13, false, z13);
                }
                i17 = 3;
                this.V0.setLayerNum(7);
                i18 = this.W;
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
        org.telegram.ui.Components.bw[] bwVarArr2 = this.c0;
        this.d0 = bwVarArr2[0];
        bwVarArr2[1].setVisibility(8);
        b61 b61Var3 = new b61(context, num42, 1);
        this.e0 = b61Var3;
        b61Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
        if (i15 != 14) {
        }
        f7 = 1.0f;
        AndroidUtilities.updateViewVisibilityAnimated(b61Var3, true, f7, false);
        g61 g61Var2 = new g61(this, context, i15);
        this.h0 = g61Var2;
        h61 h61Var2 = new h61();
        this.e1 = h61Var2;
        h61Var2.c = 220L;
        h61Var2.e = 260L;
        h61Var2.f = 160L;
        h61Var2.g = 160L;
        h61Var2.m = false;
        org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.pr.h;
        h61Var2.i = prVar2;
        h61Var2.C = false;
        g61Var2.setItemAnimator(h61Var2);
        g61Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        i61 i61Var2 = new i61(this);
        this.p0 = i61Var2;
        g61Var2.setAdapter(i61Var2);
        x51 x51Var3 = new x51(this, 1);
        this.r0 = x51Var3;
        g61Var2.setLayoutManager(x51Var3);
        x51Var3.O = new u51(this, 0);
        v51 v51Var22 = new v51(context, 0);
        this.g0 = v51Var22;
        ah.w wVar2 = new ah.w(this, context);
        this.k0 = wVar2;
        wVar2.addView(g61Var2, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        v51Var22.addView(wVar2, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        w51Var = new w51(this, context);
        this.i0 = w51Var;
        if (w51Var.getItemAnimator() == null) {
        }
        TextView textView2 = new TextView(context);
        if (i15 != i13) {
        }
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Le, f6Var));
        org.telegram.ui.Components.x9 x9Var2 = new org.telegram.ui.Components.x9(context);
        this.l0 = x9Var2;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j0 = frameLayout2;
        frameLayout2.addView(x9Var2, w7.x5.d(36, 36.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
        frameLayout2.addView(textView2, w7.x5.d(-2, -2.0f, 49, 0.0f, 60.0f, 0.0f, 0.0f));
        frameLayout2.setVisibility(8);
        frameLayout2.setAlpha(0.0f);
        v51 v51Var32 = v51Var;
        v51Var32.addView(frameLayout2, w7.x5.d(-1, -2.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        w51Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(38.0f));
        t61 t61Var2 = new t61(this);
        this.q0 = t61Var2;
        w51Var.setAdapter(t61Var2);
        x51 x51Var22 = new x51(this, 0);
        w51Var.setLayoutManager(x51Var22);
        x51Var22.O = new u51(this, 1);
        w51Var.setVisibility(8);
        v51Var32.addView(w51Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a0.addView(v51Var32, w7.x5.d(-1, -1.0f, 48, 0.0f, (i15 != 8 || i15 == 13 || i15 == 14) ? 0.0f : (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ok0 ok0Var2 = new org.telegram.ui.Components.ok0(g61Var2, x51Var3);
        this.s0 = ok0Var2;
        ok0Var2.i = new di.l1(this, 1);
        ok0Var2.h = new n51(this);
        z51 z51Var2 = new z51(this, i15, context, f6Var, num);
        g61Var2.m1(z51Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        w51Var.m1(z51Var2, (long) (ViewConfiguration.getLongPressTimeout() * 0.25f));
        org.telegram.ui.Components.pm0 pm0Var2 = new org.telegram.ui.Components.pm0(this, i10, 2);
        g61Var2.setOnItemClickListener(pm0Var2);
        w51Var.setOnItemClickListener(pm0Var2);
        a61 a61Var2 = new a61(this, context, z11);
        this.f0 = a61Var2;
        a61Var2.setTranslationY(-AndroidUtilities.dp(52.0f));
        a61Var2.setVisibility(4);
        v51Var32.addView(a61Var2, w7.x5.d(-1, 52.0f, 48, 0.0f, -4.0f, 0.0f, 0.0f));
        b61 b61Var22 = new b61(context, num42, 0);
        Drawable drawable22 = getResources().getDrawable(R.drawable.gradient_top);
        int i232 = org.telegram.ui.ActionBar.j6.G8;
        int multiplyAlphaComponent2 = AndroidUtilities.multiplyAlphaComponent(org.telegram.ui.ActionBar.j6.v0(i232, f6Var), 0.8f);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable22.setColorFilter(new PorterDuffColorFilter(multiplyAlphaComponent2, mode2));
        b61Var22.setBackground(drawable22);
        b61Var22.setAlpha(0.0f);
        this.a0.addView(b61Var22, w7.x5.d(-1, 20.0f, 55, 0.0f, (1.0f / AndroidUtilities.density) + 36.0f, 0.0f, 0.0f));
        View view22 = new View(context);
        this.o0 = view22;
        Drawable drawable32 = getResources().getDrawable(R.drawable.gradient_bottom);
        drawable32.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i232, f6Var), mode2));
        if (i10 == 14) {
        }
        view22.setAlpha(0.0f);
        this.a0.addView(view22, w7.x5.e(-1, 20, 87));
        View view32 = new View(context);
        this.t0 = view32;
        view32.setAlpha(0.0f);
        view32.setBackgroundColor(-16777216);
        this.a0.addView(view32, w7.x5.c(-1.0f, -1));
        i16 = this.V;
        if (MediaDataController.getInstance(i16) == null) {
        }
        this.V0.setLayerNum(7);
        i18 = this.W;
        if (i18 != i17) {
        }
        z13 = true;
        B(z13, false, z13);
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.J.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = arrayList.get(i10);
            i10++;
            this.J.add(ah.j1.b(str));
        }
        g61 g61Var = this.h0;
        if (g61Var != null) {
            for (int i11 = 0; i11 < g61Var.getChildCount(); i11++) {
                if (g61Var.getChildAt(i11) instanceof s61) {
                    s61 s61Var = (s61) g61Var.getChildAt(i11);
                    s61Var.d(this.J.contains(s61Var.x), true);
                }
            }
            g61Var.invalidate();
        }
    }

    public void m() {
    }

    public void q() {
    }

    public void setOnRecentClearedListener(i71 i71Var) {
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
    }

    public void r(s61 s61Var, ah.j1 j1Var) {
    }
}
