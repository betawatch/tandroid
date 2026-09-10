package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class iz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet L = new HashSet();
    public static final HashSet M;
    public i9.s E;
    public final FrameLayout G;
    public final org.telegram.ui.Components.vl0 H;
    public final long I;
    public final long J;
    public HashMap K;
    public final eo a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public fj y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList F = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        M = hashSet;
        hashSet.add("0⃣");
        hashSet.add("1⃣");
        hashSet.add("2⃣");
        hashSet.add("3⃣");
        hashSet.add("4⃣");
        hashSet.add("5⃣");
        hashSet.add("6⃣");
        hashSet.add("7⃣");
        hashSet.add("8⃣");
        hashSet.add("9⃣");
    }

    public iz(int i10, FrameLayout frameLayout) {
        this.G = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f7, int i10) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
        return centerY > f7 && centerY < ((float) i10);
    }

    public static int f() {
        float min;
        float f7;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f7 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        return (int) ((((int) (min * f7)) * 2.0f) / AndroidUtilities.density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r8.charAt(r3) <= 57343) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r8.charAt(r3) != 9794) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String q(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        String str2 = str;
        while (i10 < length) {
            if (i10 < length - 1) {
                if (str2.charAt(i10) == 55356) {
                    int i11 = i10 + 1;
                    if (str2.charAt(i11) >= 57339) {
                    }
                }
                if (str2.charAt(i10) == 8205) {
                    int i12 = i10 + 1;
                    if (str2.charAt(i12) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 2, str2.length()));
                    i10--;
                    i10++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i10) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i10), str2.subSequence(i10 + 1, str2.length()));
                i10--;
                i10++;
                str2 = str2;
            } else {
                i10++;
                str2 = str2;
            }
        }
        return str2.toString();
    }

    public final void b() {
        if (this.d) {
            return;
        }
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.b).getStickerSetByName("EmojiAnimations");
        this.c = stickerSetByName;
        if (stickerSetByName == null) {
            this.c = MediaDataController.getInstance(this.b).getStickerSetByEmojiOrName("EmojiAnimations");
        }
        if (this.c == null) {
            MediaDataController.getInstance(this.b).loadStickersByEmojiOrName("EmojiAnimations", false, true);
        }
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < this.c.documents.size(); i10++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i10).id), this.c.documents.get(i10));
            }
            for (int i11 = 0; i11 < this.c.packs.size(); i11++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i11);
                if (!M.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = L;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i12 = 0; i12 < tL_stickerPack.documents.size(); i12++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i12)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i13 = 0; i13 < 8; i13++) {
                            String str3 = strArr[i13];
                            hashSet.add(str3);
                            hashMap2.put(str3, arrayList);
                        }
                    }
                }
            }
            this.d = true;
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((hz) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((hz) arrayList.get(i10)).j != null) {
                ((hz) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z10, boolean z11, float f7, float f10, boolean z12) {
        Random random;
        long j3;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        fj fjVar;
        int i12 = i11;
        boolean z14 = messageObject != null && messageObject.isPremiumSticker();
        boolean z15 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z15 || z14 || L.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.F;
                    if (i13 >= arrayList2.size()) {
                        if (z10 && z14 && i14 > 0) {
                            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
                            if (pcVar != null && pcVar.b == messageObject.getId()) {
                                return false;
                            }
                            TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                            TLRPC.TL_messages_stickerSet stickerSetByName = inputStickerSet.short_name != null ? MediaDataController.getInstance(this.b).getStickerSetByName(inputStickerSet.short_name) : null;
                            if (stickerSetByName == null) {
                                stickerSetByName = MediaDataController.getInstance(this.b).getStickerSetById(inputStickerSet.id);
                            }
                            if (stickerSetByName != null) {
                                p(stickerSetByName, messageObject);
                                return false;
                            }
                            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                            tL_messages_getStickerSet.stickerset = inputStickerSet;
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.th(13, this, messageObject));
                            return false;
                        }
                        if (i14 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j3 = 0;
                            long j10 = effect.effect_animation_id;
                            if (j10 == 0) {
                                j10 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i16);
                                long j11 = j10;
                                if (document2 != null && document2.id == j11) {
                                    break;
                                }
                                i16++;
                                j10 = j11;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                z14 = premiumStickerAnimation != null;
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j3 = 0;
                            if (z14) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        i12 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i12);
                                } else {
                                    if (i12 < 0 || i12 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
                                            if (document3 != null) {
                                                HashMap hashMap = this.K;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i17));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i12;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i12 = abs;
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        hz hzVar = new hz();
                        hzVar.h = z14;
                        hzVar.i = z15;
                        if (!z15) {
                            hzVar.f = ((random.nextInt() % 101) / 100.0f) * (f7 / 4.0f);
                            hzVar.g = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                        }
                        hzVar.p = i10;
                        hzVar.q = document2;
                        hzVar.m = z12;
                        hzVar.r.setAllowStartAnimation(true);
                        hzVar.r.setAllowLottieVibration(z10);
                        boolean z16 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap hashMap2 = this.f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f11 = f();
                            z13 = z14;
                            boolean z17 = z16;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            hzVar.r.setUniqKeyPrefix(intValue + "_" + hzVar.p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f11);
                            sb2.append("_");
                            sb2.append(f11);
                            sb2.append(z17 ? "_pcache" : "");
                            hzVar.r.setImage(forDocument, sb2.toString(), null, "tgs", this.c, 1);
                            hzVar.r.setDelegate(new gz(this, hzVar, z10, messageObject));
                            if (hzVar.r.getLottieAnimation() != null) {
                                hzVar.r.getLottieAnimation().N(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int f12 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                hzVar.r.setUniqKeyPrefix(intValue2 + "_" + hzVar.p + "_");
                            }
                            hzVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f12);
                            sb3.append("_");
                            sb3.append(f12);
                            sb3.append(z18 ? "_pcache" : "");
                            hzVar.r.setImage(forDocument2, sb3.toString(), null, "tgs", this.c, 1);
                        }
                        hzVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        hzVar.r.setAutoRepeat(0);
                        if (hzVar.r.getLottieAnimation() != null) {
                            if (hzVar.h) {
                                hzVar.r.getLottieAnimation().N(0, false, true);
                            }
                            hzVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(hzVar);
                        hzVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = hzVar.r;
                        FrameLayout frameLayout = this.G;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.b).clientUserId != this.I) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (fjVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(fjVar);
                                this.y.run();
                            }
                            this.r = i10;
                            this.v = str;
                            long j12 = this.s;
                            ArrayList arrayList4 = this.x;
                            ArrayList arrayList5 = this.w;
                            if (j12 == j3) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j3));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            fj fjVar2 = this.y;
                            if (fjVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(fjVar2);
                                this.y = null;
                            }
                            fj fjVar3 = new fj(this, 27);
                            this.y = fjVar3;
                            AndroidUtilities.runOnUIThread(fjVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.I, this.J, 11, str, 0);
                        return true;
                    }
                    if (((hz) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z15 && (((hz) arrayList2.get(i13)).r.getLottieAnimation() == null || ((hz) arrayList2.get(i13)).r.getLottieAnimation().y())) {
                            return false;
                        }
                    }
                    if (((hz) arrayList2.get(i13)).q != null && document != null) {
                        if (((hz) arrayList2.get(i13)).q.id == document.id) {
                            i15++;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Integer printingStringType;
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.onEmojiInteractionsReceived;
        long j3 = this.I;
        if (i10 != i12) {
            if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j3, this.J)) != null && printingStringType.intValue() == 5) {
                i9.s sVar = this.E;
                if (sVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                }
                this.E = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j3 && L.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cd0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f7;
        float f10;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.F.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.F.size()) {
            hz hzVar = (hz) this.F.get(i10);
            float f11 = 3.0f;
            if (this.a != null) {
                hzVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.H.getChildCount()) {
                        f7 = 3.0f;
                        f10 = 0.0f;
                        break;
                    }
                    View childAt = this.H.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        messageObject = t1Var.getMessageObject();
                        imageReceiver = t1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        messageObject = w0Var.getMessageObject();
                        imageReceiver = w0Var.getPhotoImage();
                    } else {
                        messageObject = null;
                        imageReceiver = null;
                    }
                    if (messageObject == null || messageObject.getId() != hzVar.p) {
                        i11++;
                        f11 = 3.0f;
                    } else {
                        hzVar.c = true;
                        float x10 = childAt.getX() + this.H.getX();
                        float y3 = childAt.getY() + this.H.getY();
                        f10 = childAt.getY();
                        hzVar.d = imageReceiver.getImageWidth();
                        hzVar.e = imageReceiver.getImageHeight();
                        if (hzVar.i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            float f12 = (f() * AndroidUtilities.density) / 1.3f;
                            float f13 = f12 / f11;
                            hzVar.d = f13;
                            hzVar.e = f13;
                            float timeX = t1Var2.getTimeX() + x10;
                            float f14 = f12 / 2.0f;
                            f7 = 3.0f;
                            hzVar.a = Utilities.clamp(timeX - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
                            hzVar.b = (t1Var2.getTimeY() + y3) - f14;
                        } else {
                            f7 = 3.0f;
                            if (hzVar.h) {
                                hzVar.a = imageReceiver.getImageX() + x10;
                                hzVar.b = imageReceiver.getImageY() + y3;
                            } else {
                                float imageX = imageReceiver.getImageX() + x10;
                                float imageY = imageReceiver.getImageY() + y3;
                                float dp = hzVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                hzVar.a = dp;
                                hzVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!hzVar.c || hzVar.e + f10 < this.a.s9 || f10 > this.H.getMeasuredHeight() - this.a.Aa) {
                    hzVar.n = true;
                }
                if (hzVar.h) {
                    float f15 = hzVar.e / 2.0f;
                    boolean z10 = ((float) this.H.getMeasuredHeight()) - f10 <= f15;
                    boolean z11 = (f10 - this.a.s9) + f15 <= 0.0f;
                    if (z10 || z11) {
                        hzVar.n = true;
                    }
                }
                if (hzVar.n) {
                    float f16 = hzVar.o;
                    if (f16 != 1.0f) {
                        float clamp = Utilities.clamp(f16 + 0.10666667f, 1.0f, 0.0f);
                        hzVar.o = clamp;
                        hzVar.r.setAlpha(1.0f - clamp);
                        this.a.X0.invalidate();
                    }
                }
            } else {
                f7 = 3.0f;
                h(hzVar);
            }
            boolean z12 = !hzVar.l && hzVar.n;
            if (!z12) {
                if (!hzVar.h || hzVar.i) {
                    yg.e eVar = hzVar.j;
                    if (eVar != null) {
                        float f17 = hzVar.a + hzVar.f;
                        float f18 = hzVar.b + hzVar.g;
                        float f19 = hzVar.d * f7;
                        eVar.e((int) f17, (int) f18, (int) (f17 + f19), (int) (f18 + f19));
                        hzVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = hzVar.r;
                        float f20 = hzVar.a + hzVar.f;
                        float f21 = hzVar.b + hzVar.g;
                        float f22 = hzVar.d * f7;
                        imageReceiver2.setImageCoords(f20, f21, f22, f22);
                        if (hzVar.m) {
                            hzVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, hzVar.r.getCenterX(), hzVar.r.getCenterY());
                            hzVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f23 = hzVar.e;
                    float f24 = 1.49926f * f23;
                    float f25 = 0.0546875f * f24;
                    float f26 = (((f23 / 2.0f) + hzVar.b) - (f24 / 2.0f)) - (0.00279f * f24);
                    if (hzVar.m) {
                        hzVar.r.setImageCoords(((hzVar.a + hzVar.d) - f24) + f25, f26, f24, f24);
                    } else {
                        hzVar.r.setImageCoords(hzVar.a - f25, f26, f24, f24);
                    }
                    if (hzVar.m) {
                        hzVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, hzVar.r.getCenterX(), hzVar.r.getCenterY());
                        hzVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            yg.e eVar2 = hzVar.j;
            boolean c10 = eVar2 != null ? eVar2.c() : hzVar.l && hzVar.r.getLottieAnimation() != null && hzVar.r.getLottieAnimation().b0 >= hzVar.r.getLottieAnimation().e[0] + (-2);
            if (hzVar.o == 1.0f || c10 || z12) {
                hz hzVar2 = (hz) this.F.remove(i10);
                if (hzVar.h && hzVar.r.getLottieAnimation() != null) {
                    hzVar2.r.getLottieAnimation().N(0, true, true);
                }
                hzVar2.r.onDetachedFromWindow();
                yg.e eVar3 = hzVar2.j;
                if (eVar3 != null) {
                    eVar3.d(this.G);
                }
                i10--;
            } else if (hzVar.r.getLottieAnimation() != null && hzVar.r.getLottieAnimation().l0) {
                hzVar.l = true;
            } else if (hzVar.r.getLottieAnimation() != null && !hzVar.r.getLottieAnimation().l0) {
                hzVar.r.getLottieAnimation().N(0, true, false);
                hzVar.r.getLottieAnimation().start();
            }
            i10++;
        }
        if (this.F.isEmpty()) {
            i();
        }
        this.G.invalidate();
    }

    public final boolean g() {
        return this.F.isEmpty();
    }

    public final void j() {
        this.n = true;
        b();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((hz) arrayList.get(i10)).r.onAttachedToWindow();
            if (((hz) arrayList.get(i10)).j != null) {
                ((hz) arrayList.get(i10)).j.f(this.G);
            }
            i10++;
        }
    }

    public final void k() {
        int i10 = 0;
        this.n = false;
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.F;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((hz) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((hz) arrayList.get(i10)).j != null) {
                ((hz) arrayList.get(i10)).j.d(this.G);
            }
            i10++;
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, eo eoVar, boolean z10) {
        if (eoVar.u() || t1Var.getMessageObject() == null || t1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (t1Var.getMessageObject().isPremiumSticker() || eoVar.f != null) {
            boolean z11 = false;
            boolean o9 = o(t1Var, -1, z10, false);
            if (z10 && o9 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    t1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
            long j3 = this.I;
            if (isPremiumSticker || t1Var.getEffect() != null || (!z10 && t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                eoVar.getMessagesStorage().updateMessageCustomParams(j3, t1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j3, this.J);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.E == null && o9) {
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
                if ((pcVar == null || !pcVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != eoVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(eoVar.getParentActivity(), null, 1, -1, t1Var.getMessageObject().isAnimatedAnimatedEmoji() ? t1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji()), eoVar.getResourceProvider());
                    lx0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, eoVar.f.first_name));
                    TextView textView = lx0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    i9.s sVar = new i9.s(this, org.telegram.ui.Components.pc.g(eoVar, lx0Var, 2750), z11, 23);
                    this.E = sVar;
                    AndroidUtilities.runOnUIThread(sVar, 1500L);
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.K;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.K == null) {
                this.K = new HashMap();
            }
            this.K.put(Long.valueOf(document.id), Boolean.TRUE);
            MediaDataController.getInstance(this.b).preloadImage(ImageLocation.getForDocument(document), 2);
        }
    }

    public final void n(org.telegram.ui.Cells.t1 t1Var) {
        ArrayList arrayList;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.isPremiumSticker()) {
            return;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        String q6 = q(stickerEmoji);
        if (!L.contains(q6) || (arrayList = (ArrayList) this.e.get(q6)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            m((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10, boolean z11) {
        if (t1Var == null || this.F.size() > 12) {
            return false;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (t1Var.getEffect() == null && !t1Var.getPhotoImage().hasNotThumb()) {
            return false;
        }
        String stickerEmoji = messageObject.getStickerEmoji();
        if (stickerEmoji == null) {
            stickerEmoji = messageObject.messageOwner.message;
        }
        if (t1Var.getEffect() == null && stickerEmoji == null) {
            return false;
        }
        float imageHeight = t1Var.getPhotoImage().getImageHeight();
        float imageWidth = t1Var.getPhotoImage().getImageWidth();
        if (t1Var.getEffect() != null || (imageHeight > 0.0f && imageWidth > 0.0f)) {
            return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i10, z10, z11, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        eo eoVar = this.a;
        if (eoVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || eoVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0(this.G.getContext(), null, 1, -1, messageObject.getDocument(), eoVar.getResourceProvider());
        lx0Var.b.setText(tL_messages_stickerSet.set.title);
        lx0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(eoVar.getParentActivity(), eoVar.getResourceProvider(), true);
        lx0Var.setButton(ncVar);
        ncVar.a = new uv(9, this, messageObject);
        ncVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.pc g10 = org.telegram.ui.Components.pc.g(eoVar, lx0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public iz(eo eoVar, FrameLayout frameLayout, org.telegram.ui.Components.vl0 vl0Var, int i10, long j3, long j10) {
        this.a = eoVar;
        this.G = frameLayout;
        this.H = vl0Var;
        this.b = i10;
        this.I = j3;
        this.J = j10;
    }

    public void h(hz hzVar) {
    }

    public void i() {
    }
}
