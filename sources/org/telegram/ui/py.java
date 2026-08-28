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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class py implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet H = new HashSet();
    public static final HashSet I;
    public fm A;
    public final FrameLayout C;
    public final org.telegram.ui.Components.wk0 D;
    public final long E;
    public final long F;
    public HashMap G;
    public final qn a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public ri y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList B = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        I = hashSet;
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

    public py(int i9, FrameLayout frameLayout) {
        this.C = frameLayout;
        this.b = i9;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f10, int i9) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
        return centerY > f10 && centerY < ((float) i9);
    }

    public static int f() {
        float min;
        float f10;
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
            f10 = 0.4f;
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        return (int) ((((int) (min * f10)) * 2.0f) / AndroidUtilities.density);
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
        int i9 = 0;
        String str2 = str;
        while (i9 < length) {
            if (i9 < length - 1) {
                if (str2.charAt(i9) == 55356) {
                    int i10 = i9 + 1;
                    if (str2.charAt(i10) >= 57339) {
                    }
                }
                if (str2.charAt(i9) == 8205) {
                    int i11 = i9 + 1;
                    if (str2.charAt(i11) != 9792) {
                    }
                    length -= 2;
                    str2 = TextUtils.concat(str2.subSequence(0, i9), str2.subSequence(i9 + 2, str2.length()));
                    i9--;
                    i9++;
                    str2 = str2;
                }
            }
            if (str2.charAt(i9) == 65039) {
                length--;
                str2 = TextUtils.concat(str2.subSequence(0, i9), str2.subSequence(i9 + 1, str2.length()));
                i9--;
                i9++;
                str2 = str2;
            } else {
                i9++;
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
            for (int i9 = 0; i9 < this.c.documents.size(); i9++) {
                hashMap.put(Long.valueOf(this.c.documents.get(i9).id), this.c.documents.get(i9));
            }
            for (int i10 = 0; i10 < this.c.packs.size(); i10++) {
                TLRPC.TL_stickerPack tL_stickerPack = this.c.packs.get(i10);
                if (!I.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = H;
                    hashSet.add(str);
                    ArrayList arrayList = new ArrayList();
                    String str2 = tL_stickerPack.emoticon;
                    HashMap hashMap2 = this.e;
                    hashMap2.put(str2, arrayList);
                    for (int i11 = 0; i11 < tL_stickerPack.documents.size(); i11++) {
                        arrayList.add((TLRPC.Document) hashMap.get(tL_stickerPack.documents.get(i11)));
                    }
                    if (tL_stickerPack.emoticon.equals("❤")) {
                        String[] strArr = {"🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "🤎"};
                        for (int i12 = 0; i12 < 8; i12++) {
                            String str3 = strArr[i12];
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((oy) arrayList.get(i9)).r.onDetachedFromWindow();
            if (((oy) arrayList.get(i9)).j != null) {
                ((oy) arrayList.get(i9)).j.d(this.C);
            }
            i9++;
        }
    }

    public final boolean d(String str, int i9, TLRPC.Document document, MessageObject messageObject, int i10, boolean z10, boolean z11, float f10, float f11, boolean z12) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z13;
        ri riVar;
        int i11 = i10;
        boolean z14 = messageObject != null && messageObject.isPremiumSticker();
        boolean z15 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z15 || z14 || H.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z15 || ((arrayList != null && !arrayList.isEmpty()) || z14)) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    ArrayList arrayList2 = this.B;
                    if (i12 >= arrayList2.size()) {
                        if (z10 && z14 && i13 > 0) {
                            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
                            if (gcVar != null && gcVar.b == messageObject.getId()) {
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
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new rc(25, this, messageObject));
                            return false;
                        }
                        if (i13 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z15) {
                            TLRPC.TL_availableEffect effect = messageObject.getEffect();
                            TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(this.b).getAvailableEffects();
                            if (availableEffects == null) {
                                return false;
                            }
                            j10 = 0;
                            long j11 = effect.effect_animation_id;
                            if (j11 == 0) {
                                j11 = effect.effect_sticker_id;
                            }
                            random = random2;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i15);
                                long j12 = j11;
                                if (document2 != null && document2.id == j12) {
                                    break;
                                }
                                i15++;
                                j11 = j12;
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
                            j10 = 0;
                            if (z14) {
                                document2 = messageObject.getDocument();
                                premiumStickerAnimation = messageObject.getPremiumStickerAnimation();
                            } else {
                                if (messageObject == null || !messageObject.isAnimatedAnimatedEmoji()) {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        i11 = Math.abs(random.nextInt()) % arrayList.size();
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(i11);
                                } else {
                                    if (i11 < 0 || i11 > arrayList.size() - 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                            TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                                            if (document3 != null) {
                                                HashMap hashMap = this.G;
                                                Boolean bool = hashMap != null ? (Boolean) hashMap.get(Long.valueOf(document3.id)) : null;
                                                if (bool != null && bool.booleanValue()) {
                                                    arrayList3.add(Integer.valueOf(i16));
                                                }
                                            }
                                        }
                                        abs = arrayList3.isEmpty() ? Math.abs(random.nextInt()) % arrayList.size() : ((Integer) arrayList3.get(Math.abs(random.nextInt()) % arrayList3.size())).intValue();
                                    } else {
                                        abs = i11;
                                    }
                                    document2 = (TLRPC.Document) arrayList.get(abs);
                                    i11 = abs;
                                }
                                premiumStickerAnimation = null;
                            }
                        }
                        if (document2 == null && premiumStickerAnimation == null) {
                            return false;
                        }
                        oy oyVar = new oy();
                        oyVar.h = z14;
                        oyVar.i = z15;
                        if (!z15) {
                            oyVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            oyVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        oyVar.p = i9;
                        oyVar.q = document2;
                        oyVar.m = z12;
                        oyVar.r.setAllowStartAnimation(true);
                        oyVar.r.setAllowLottieVibration(z10);
                        boolean z16 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap hashMap2 = this.f;
                        int i17 = i11;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z13 = z14;
                            boolean z17 = z16;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            oyVar.r.setUniqKeyPrefix(intValue + "_" + oyVar.p + "_");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f12);
                            sb2.append("_");
                            sb2.append(f12);
                            sb2.append(z17 ? "_pcache" : "");
                            oyVar.r.setImage(forDocument, sb2.toString(), null, "tgs", this.c, 1);
                            oyVar.r.setDelegate(new ny(this, oyVar, z10, messageObject));
                            if (oyVar.r.getLottieAnimation() != null) {
                                oyVar.r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z13 = z14;
                            boolean z18 = z16;
                            int f13 = f();
                            if (i14 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                oyVar.r.setUniqKeyPrefix(intValue2 + "_" + oyVar.p + "_");
                            }
                            oyVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(f13);
                            sb3.append("_");
                            sb3.append(f13);
                            sb3.append(z18 ? "_pcache" : "");
                            oyVar.r.setImage(forDocument2, sb3.toString(), null, "tgs", this.c, 1);
                        }
                        oyVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        oyVar.r.setAutoRepeat(0);
                        if (oyVar.r.getLottieAnimation() != null) {
                            if (oyVar.h) {
                                oyVar.r.getLottieAnimation().L(0, false, true);
                            }
                            oyVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(oyVar);
                        oyVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = oyVar.r;
                        FrameLayout frameLayout = this.C;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z10 && !z13 && UserConfig.getInstance(this.b).clientUserId != this.E) {
                            int i18 = this.r;
                            if (i18 != 0 && i18 != i9 && (riVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(riVar);
                                this.y.run();
                            }
                            this.r = i9;
                            this.v = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.x;
                            ArrayList arrayList5 = this.w;
                            if (j13 == j10) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i17));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i17));
                            }
                            ri riVar2 = this.y;
                            if (riVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(riVar2);
                                this.y = null;
                            }
                            ri riVar3 = new ri(this, 27);
                            this.y = riVar3;
                            AndroidUtilities.runOnUIThread(riVar3, 500L);
                        }
                        if (!z11) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.E, this.F, 11, str, 0);
                        return true;
                    }
                    if (((oy) arrayList2.get(i12)).p == i9) {
                        i13++;
                        if (!z15 && (((oy) arrayList2.get(i12)).r.getLottieAnimation() == null || ((oy) arrayList2.get(i12)).r.getLottieAnimation().w())) {
                            return false;
                        }
                    }
                    if (((oy) arrayList2.get(i12)).q != null && document != null) {
                        if (((oy) arrayList2.get(i12)).q.id == document.id) {
                            i14++;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        Integer printingStringType;
        if (i9 == NotificationCenter.diceStickersDidLoad) {
            if ("EmojiAnimations".equals((String) objArr[0])) {
                b();
                return;
            }
            return;
        }
        int i11 = NotificationCenter.onEmojiInteractionsReceived;
        long j10 = this.E;
        if (i9 != i11) {
            if (i9 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.F)) != null && printingStringType.intValue() == 5) {
                fm fmVar = this.A;
                if (fmVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(fmVar);
                }
                this.A = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j10 && H.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i12 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i13);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ac0(this, i12, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.B.isEmpty()) {
            return;
        }
        int i9 = 0;
        while (i9 < this.B.size()) {
            oy oyVar = (oy) this.B.get(i9);
            float f12 = 3.0f;
            if (this.a != null) {
                oyVar.c = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= this.D.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 0.0f;
                        break;
                    }
                    View childAt = this.D.getChildAt(i10);
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
                    if (messageObject == null || messageObject.getId() != oyVar.p) {
                        i10++;
                        f12 = 3.0f;
                    } else {
                        oyVar.c = true;
                        float x10 = childAt.getX() + this.D.getX();
                        float y10 = childAt.getY() + this.D.getY();
                        f11 = childAt.getY();
                        oyVar.d = imageReceiver.getImageWidth();
                        oyVar.e = imageReceiver.getImageHeight();
                        if (oyVar.i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            float f13 = (f() * AndroidUtilities.density) / 1.3f;
                            float f14 = f13 / f12;
                            oyVar.d = f14;
                            oyVar.e = f14;
                            float timeX = t1Var2.getTimeX() + x10;
                            float f15 = f13 / 2.0f;
                            f10 = 3.0f;
                            oyVar.a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                            oyVar.b = (t1Var2.getTimeY() + y10) - f15;
                        } else {
                            f10 = 3.0f;
                            if (oyVar.h) {
                                oyVar.a = imageReceiver.getImageX() + x10;
                                oyVar.b = imageReceiver.getImageY() + y10;
                            } else {
                                float imageX = imageReceiver.getImageX() + x10;
                                float imageY = imageReceiver.getImageY() + y10;
                                float dp = oyVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                oyVar.a = dp;
                                oyVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!oyVar.c || oyVar.e + f11 < this.a.o9 || f11 > this.D.getMeasuredHeight() - this.a.wa) {
                    oyVar.n = true;
                }
                if (oyVar.h) {
                    float f16 = oyVar.e / 2.0f;
                    boolean z10 = ((float) this.D.getMeasuredHeight()) - f11 <= f16;
                    boolean z11 = (f11 - this.a.o9) + f16 <= 0.0f;
                    if (z10 || z11) {
                        oyVar.n = true;
                    }
                }
                if (oyVar.n) {
                    float f17 = oyVar.o;
                    if (f17 != 1.0f) {
                        float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                        oyVar.o = clamp;
                        oyVar.r.setAlpha(1.0f - clamp);
                        this.a.T0.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                h(oyVar);
            }
            boolean z12 = !oyVar.l && oyVar.n;
            if (!z12) {
                if (!oyVar.h || oyVar.i) {
                    hg.d dVar = oyVar.j;
                    if (dVar != null) {
                        float f18 = oyVar.a + oyVar.f;
                        float f19 = oyVar.b + oyVar.g;
                        float f20 = oyVar.d * f10;
                        dVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                        oyVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = oyVar.r;
                        float f21 = oyVar.a + oyVar.f;
                        float f22 = oyVar.b + oyVar.g;
                        float f23 = oyVar.d * f10;
                        imageReceiver2.setImageCoords(f21, f22, f23, f23);
                        if (oyVar.m) {
                            oyVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, oyVar.r.getCenterX(), oyVar.r.getCenterY());
                            oyVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f24 = oyVar.e;
                    float f25 = 1.49926f * f24;
                    float f26 = 0.0546875f * f25;
                    float f27 = (((f24 / 2.0f) + oyVar.b) - (f25 / 2.0f)) - (0.00279f * f25);
                    if (oyVar.m) {
                        oyVar.r.setImageCoords(((oyVar.a + oyVar.d) - f25) + f26, f27, f25, f25);
                    } else {
                        oyVar.r.setImageCoords(oyVar.a - f26, f27, f25, f25);
                    }
                    if (oyVar.m) {
                        oyVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, oyVar.r.getCenterX(), oyVar.r.getCenterY());
                        oyVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            hg.d dVar2 = oyVar.j;
            boolean c10 = dVar2 != null ? dVar2.c() : oyVar.l && oyVar.r.getLottieAnimation() != null && oyVar.r.getLottieAnimation().X >= oyVar.r.getLottieAnimation().e[0] + (-2);
            if (oyVar.o == 1.0f || c10 || z12) {
                oy oyVar2 = (oy) this.B.remove(i9);
                if (oyVar.h && oyVar.r.getLottieAnimation() != null) {
                    oyVar2.r.getLottieAnimation().L(0, true, true);
                }
                oyVar2.r.onDetachedFromWindow();
                hg.d dVar3 = oyVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.C);
                }
                i9--;
            } else if (oyVar.r.getLottieAnimation() != null && oyVar.r.getLottieAnimation().h0) {
                oyVar.l = true;
            } else if (oyVar.r.getLottieAnimation() != null && !oyVar.r.getLottieAnimation().h0) {
                oyVar.r.getLottieAnimation().L(0, true, false);
                oyVar.r.getLottieAnimation().start();
            }
            i9++;
        }
        if (this.B.isEmpty()) {
            i();
        }
        this.C.invalidate();
    }

    public final boolean g() {
        return this.B.isEmpty();
    }

    public final void j() {
        this.n = true;
        b();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.updateInterfaces);
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((oy) arrayList.get(i9)).r.onAttachedToWindow();
            if (((oy) arrayList.get(i9)).j != null) {
                ((oy) arrayList.get(i9)).j.f(this.C);
            }
            i9++;
        }
    }

    public final void k() {
        int i9 = 0;
        this.n = false;
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.updateInterfaces);
        while (true) {
            ArrayList arrayList = this.B;
            if (i9 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((oy) arrayList.get(i9)).r.onDetachedFromWindow();
            if (((oy) arrayList.get(i9)).j != null) {
                ((oy) arrayList.get(i9)).j.d(this.C);
            }
            i9++;
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, qn qnVar, boolean z10) {
        if (qnVar.w() || t1Var.getMessageObject() == null || t1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (t1Var.getMessageObject().isPremiumSticker() || qnVar.f != null) {
            boolean o6 = o(t1Var, -1, z10, false);
            if (z10 && o6 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    t1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
            long j10 = this.E;
            if (isPremiumSticker || t1Var.getEffect() != null || (!z10 && t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                qnVar.getMessagesStorage().updateMessageCustomParams(j10, t1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.F);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.A == null && o6) {
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
                if ((gcVar == null || !gcVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != qnVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(qnVar.getParentActivity(), null, 1, -1, t1Var.getMessageObject().isAnimatedAnimatedEmoji() ? t1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji()), qnVar.getResourceProvider());
                    iw0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, qnVar.f.first_name));
                    TextView textView = iw0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    fm fmVar = new fm(2, this, org.telegram.ui.Components.gc.g(qnVar, iw0Var, 2750));
                    this.A = fmVar;
                    AndroidUtilities.runOnUIThread(fmVar, 1500L);
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.G;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.G == null) {
                this.G = new HashMap();
            }
            this.G.put(Long.valueOf(document.id), Boolean.TRUE);
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
        String q10 = q(stickerEmoji);
        if (!H.contains(q10) || (arrayList = (ArrayList) this.e.get(q10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i9 = 0; i9 < min; i9++) {
            m((TLRPC.Document) arrayList.get(i9));
        }
    }

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i9, boolean z10, boolean z11) {
        if (t1Var == null || this.B.size() > 12) {
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
            return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i9, z10, z11, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        qn qnVar = this.a;
        if (qnVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || qnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(this.C.getContext(), null, 1, -1, messageObject.getDocument(), qnVar.getResourceProvider());
        iw0Var.b.setText(tL_messages_stickerSet.set.title);
        iw0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(qnVar.getParentActivity(), qnVar.getResourceProvider(), true);
        iw0Var.setButton(ecVar);
        ecVar.a = new org.telegram.ui.Components.p61(18, this, messageObject);
        ecVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.gc g10 = org.telegram.ui.Components.gc.g(qnVar, iw0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public py(qn qnVar, FrameLayout frameLayout, org.telegram.ui.Components.wk0 wk0Var, int i9, long j10, long j11) {
        this.a = qnVar;
        this.C = frameLayout;
        this.D = wk0Var;
        this.b = i9;
        this.E = j10;
        this.F = j11;
    }

    public void h(oy oyVar) {
    }

    public void i() {
    }
}
