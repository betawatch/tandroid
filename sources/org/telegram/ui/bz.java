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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class bz implements NotificationCenter.NotificationCenterDelegate {
    public static final HashSet I = new HashSet();
    public static final HashSet J;
    public yy B;
    public final FrameLayout D;
    public final org.telegram.ui.Components.sl0 E;
    public final long F;
    public final long G;
    public HashMap H;
    public final xn a;
    public int b;
    public TLRPC.TL_messages_stickerSet c;
    public boolean n;
    public String v;
    public zi y;
    public boolean d = false;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Random h = new Random();
    public int r = -1;
    public long s = 0;
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList C = new ArrayList();

    static {
        HashSet hashSet = new HashSet();
        J = hashSet;
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

    public bz(int i10, FrameLayout frameLayout) {
        this.D = frameLayout;
        this.b = i10;
    }

    public static boolean a(org.telegram.ui.Cells.t1 t1Var, float f10, int i10) {
        float centerY = t1Var.getPhotoImage().getCenterY() + t1Var.getY();
        return centerY > f10 && centerY < ((float) i10);
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
                if (!J.contains(tL_stickerPack.emoticon) && tL_stickerPack.documents.size() > 0) {
                    String str = tL_stickerPack.emoticon;
                    HashSet hashSet = I;
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
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((az) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((az) arrayList.get(i10)).j != null) {
                ((az) arrayList.get(i10)).j.d(this.D);
            }
            i10++;
        }
    }

    public final boolean d(String str, int i10, TLRPC.Document document, MessageObject messageObject, int i11, boolean z4, boolean z10, float f10, float f11, boolean z11) {
        Random random;
        long j10;
        TLRPC.Document document2;
        int abs;
        TLRPC.VideoSize premiumStickerAnimation;
        boolean z12;
        zi ziVar;
        int i12 = i11;
        boolean z13 = messageObject != null && messageObject.isPremiumSticker();
        boolean z14 = (messageObject == null || messageObject.getEffect() == null) ? false : true;
        if (z14 || z13 || I.contains(str)) {
            ArrayList arrayList = (ArrayList) this.e.get(str);
            if (z14 || ((arrayList != null && !arrayList.isEmpty()) || z13)) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList2 = this.C;
                    if (i13 >= arrayList2.size()) {
                        if (z4 && z13 && i14 > 0) {
                            org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
                            if (icVar != null && icVar.b == messageObject.getId()) {
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
                            ConnectionsManager.getInstance(this.b).sendRequest(tL_messages_getStickerSet, new lo(18, this, messageObject));
                            return false;
                        }
                        if (i14 >= 4) {
                            return false;
                        }
                        Random random2 = this.h;
                        if (z14) {
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
                            int i16 = 0;
                            while (true) {
                                if (i16 >= availableEffects.documents.size()) {
                                    document2 = null;
                                    break;
                                }
                                document2 = availableEffects.documents.get(i16);
                                long j12 = j11;
                                if (document2 != null && document2.id == j12) {
                                    break;
                                }
                                i16++;
                                j11 = j12;
                            }
                            if (document2 == null) {
                                return false;
                            }
                            if (effect.effect_sticker_id != 0) {
                                premiumStickerAnimation = MessageObject.getPremiumStickerAnimation(document2);
                                z13 = premiumStickerAnimation != null;
                            }
                            premiumStickerAnimation = null;
                        } else {
                            random = random2;
                            j10 = 0;
                            if (z13) {
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
                                                HashMap hashMap = this.H;
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
                        az azVar = new az();
                        azVar.h = z13;
                        azVar.i = z14;
                        if (!z14) {
                            azVar.f = ((random.nextInt() % 101) / 100.0f) * (f10 / 4.0f);
                            azVar.g = ((random.nextInt() % 101) / 100.0f) * (f11 / 4.0f);
                        }
                        azVar.p = i10;
                        azVar.q = document2;
                        azVar.m = z11;
                        azVar.r.setAllowStartAnimation(true);
                        azVar.r.setAllowLottieVibration(z4);
                        boolean z15 = SharedConfig.getDevicePerformanceClass() <= 1 || !BuildVars.DEBUG_VERSION;
                        HashMap hashMap2 = this.f;
                        int i18 = i12;
                        if (premiumStickerAnimation == null) {
                            int f12 = f();
                            z12 = z13;
                            boolean z16 = z15;
                            Integer num = (Integer) hashMap2.get(Long.valueOf(document2.id));
                            int intValue = (num == null ? 0 : num.intValue()) + 1;
                            hashMap2.put(Long.valueOf(document2.id), Integer.valueOf(intValue));
                            ImageLocation forDocument = ImageLocation.getForDocument(document2);
                            azVar.r.setUniqKeyPrefix(intValue + "_" + azVar.p + "_");
                            StringBuilder sb = new StringBuilder();
                            sb.append(f12);
                            sb.append("_");
                            sb.append(f12);
                            sb.append(z16 ? "_pcache" : "");
                            azVar.r.setImage(forDocument, sb.toString(), null, "tgs", this.c, 1);
                            azVar.r.setDelegate(new zy(this, azVar, z4, messageObject));
                            if (azVar.r.getLottieAnimation() != null) {
                                azVar.r.getLottieAnimation().L(0, false, true);
                            }
                        } else {
                            z12 = z13;
                            boolean z17 = z15;
                            int f13 = f();
                            if (i15 > 0) {
                                Integer num2 = (Integer) hashMap2.get(Long.valueOf(document2.id));
                                int intValue2 = num2 == null ? 0 : num2.intValue();
                                hashMap2.put(Long.valueOf(document2.id), Integer.valueOf((intValue2 + 1) % 4));
                                azVar.r.setUniqKeyPrefix(intValue2 + "_" + azVar.p + "_");
                            }
                            azVar.q = document2;
                            ImageLocation forDocument2 = ImageLocation.getForDocument(premiumStickerAnimation, document2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(f13);
                            sb2.append("_");
                            sb2.append(f13);
                            sb2.append(z17 ? "_pcache" : "");
                            azVar.r.setImage(forDocument2, sb2.toString(), null, "tgs", this.c, 1);
                        }
                        azVar.r.setLayerNum(ConnectionsManager.DEFAULT_DATACENTER_ID);
                        azVar.r.setAutoRepeat(0);
                        if (azVar.r.getLottieAnimation() != null) {
                            if (azVar.h) {
                                azVar.r.getLottieAnimation().L(0, false, true);
                            }
                            azVar.r.getLottieAnimation().start();
                        }
                        arrayList2.add(azVar);
                        azVar.r.onAttachedToWindow();
                        ImageReceiver imageReceiver = azVar.r;
                        FrameLayout frameLayout = this.D;
                        imageReceiver.setParentView(frameLayout);
                        frameLayout.invalidate();
                        if (z4 && !z12 && UserConfig.getInstance(this.b).clientUserId != this.F) {
                            int i19 = this.r;
                            if (i19 != 0 && i19 != i10 && (ziVar = this.y) != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar);
                                this.y.run();
                            }
                            this.r = i10;
                            this.v = str;
                            long j13 = this.s;
                            ArrayList arrayList4 = this.x;
                            ArrayList arrayList5 = this.w;
                            if (j13 == j10) {
                                this.s = System.currentTimeMillis();
                                arrayList5.clear();
                                arrayList4.clear();
                                arrayList5.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i18));
                            } else {
                                arrayList5.add(Long.valueOf(System.currentTimeMillis() - this.s));
                                arrayList4.add(Integer.valueOf(i18));
                            }
                            zi ziVar2 = this.y;
                            if (ziVar2 != null) {
                                AndroidUtilities.cancelRunOnUIThread(ziVar2);
                                this.y = null;
                            }
                            zi ziVar3 = new zi(this, 27);
                            this.y = ziVar3;
                            AndroidUtilities.runOnUIThread(ziVar3, 500L);
                        }
                        if (!z10) {
                            return true;
                        }
                        MessagesController.getInstance(this.b).sendTyping(this.F, this.G, 11, str, 0);
                        return true;
                    }
                    if (((az) arrayList2.get(i13)).p == i10) {
                        i14++;
                        if (!z14 && (((az) arrayList2.get(i13)).r.getLottieAnimation() == null || ((az) arrayList2.get(i13)).r.getLottieAnimation().w())) {
                            return false;
                        }
                    }
                    if (((az) arrayList2.get(i13)).q != null && document != null) {
                        if (((az) arrayList2.get(i13)).q.id == document.id) {
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
        long j10 = this.F;
        if (i10 != i12) {
            if (i10 == NotificationCenter.updateInterfaces && (printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.G)) != null && printingStringType.intValue() == 5) {
                yy yyVar = this.B;
                if (yyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(yyVar);
                }
                this.B = null;
                return;
            }
            return;
        }
        if (this.a == null) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        TLRPC.TL_sendMessageEmojiInteraction tL_sendMessageEmojiInteraction = (TLRPC.TL_sendMessageEmojiInteraction) objArr[1];
        if (longValue == j10 && I.contains(tL_sendMessageEmojiInteraction.emoticon)) {
            int i13 = tL_sendMessageEmojiInteraction.msg_id;
            if (tL_sendMessageEmojiInteraction.interaction.data != null) {
                try {
                    JSONArray jSONArray = new JSONObject(tL_sendMessageEmojiInteraction.interaction.data).getJSONArray("a");
                    for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vc0(this, i13, jSONObject.optInt("i", 1) - 1), (long) (jSONObject.optDouble("t", 0.0d) * 1000.0d));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        float f10;
        float f11;
        MessageObject messageObject;
        ImageReceiver imageReceiver;
        if (this.C.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < this.C.size()) {
            az azVar = (az) this.C.get(i10);
            float f12 = 3.0f;
            if (this.a != null) {
                azVar.c = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= this.E.getChildCount()) {
                        f10 = 3.0f;
                        f11 = 0.0f;
                        break;
                    }
                    View childAt = this.E.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        messageObject = t1Var.getMessageObject();
                        imageReceiver = t1Var.getPhotoImage();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        messageObject = v0Var.getMessageObject();
                        imageReceiver = v0Var.getPhotoImage();
                    } else {
                        messageObject = null;
                        imageReceiver = null;
                    }
                    if (messageObject == null || messageObject.getId() != azVar.p) {
                        i11++;
                        f12 = 3.0f;
                    } else {
                        azVar.c = true;
                        float x10 = childAt.getX() + this.E.getX();
                        float y10 = childAt.getY() + this.E.getY();
                        f11 = childAt.getY();
                        azVar.d = imageReceiver.getImageWidth();
                        azVar.e = imageReceiver.getImageHeight();
                        if (azVar.i && (childAt instanceof org.telegram.ui.Cells.t1)) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            float f13 = (f() * AndroidUtilities.density) / 1.3f;
                            float f14 = f13 / f12;
                            azVar.d = f14;
                            azVar.e = f14;
                            float timeX = t1Var2.getTimeX() + x10;
                            float f15 = f13 / 2.0f;
                            f10 = 3.0f;
                            azVar.a = Utilities.clamp(timeX - f15, AndroidUtilities.displaySize.x - f13, 0.0f);
                            azVar.b = (t1Var2.getTimeY() + y10) - f15;
                        } else {
                            f10 = 3.0f;
                            if (azVar.h) {
                                azVar.a = imageReceiver.getImageX() + x10;
                                azVar.b = imageReceiver.getImageY() + y10;
                            } else {
                                float imageX = imageReceiver.getImageX() + x10;
                                float imageY = imageReceiver.getImageY() + y10;
                                float dp = azVar.m ? ((-imageReceiver.getImageWidth()) * 2.0f) + AndroidUtilities.dp(24.0f) + imageX : (-AndroidUtilities.dp(24.0f)) + imageX;
                                float imageWidth = imageY - imageReceiver.getImageWidth();
                                azVar.a = dp;
                                azVar.b = imageWidth;
                            }
                        }
                    }
                }
                if (!azVar.c || azVar.e + f11 < this.a.p9 || f11 > this.E.getMeasuredHeight() - this.a.xa) {
                    azVar.n = true;
                }
                if (azVar.h) {
                    float f16 = azVar.e / 2.0f;
                    boolean z4 = ((float) this.E.getMeasuredHeight()) - f11 <= f16;
                    boolean z10 = (f11 - this.a.p9) + f16 <= 0.0f;
                    if (z4 || z10) {
                        azVar.n = true;
                    }
                }
                if (azVar.n) {
                    float f17 = azVar.o;
                    if (f17 != 1.0f) {
                        float clamp = Utilities.clamp(f17 + 0.10666667f, 1.0f, 0.0f);
                        azVar.o = clamp;
                        azVar.r.setAlpha(1.0f - clamp);
                        this.a.U0.invalidate();
                    }
                }
            } else {
                f10 = 3.0f;
                h(azVar);
            }
            boolean z11 = !azVar.l && azVar.n;
            if (!z11) {
                if (!azVar.h || azVar.i) {
                    mg.d dVar = azVar.j;
                    if (dVar != null) {
                        float f18 = azVar.a + azVar.f;
                        float f19 = azVar.b + azVar.g;
                        float f20 = azVar.d * f10;
                        dVar.e((int) f18, (int) f19, (int) (f18 + f20), (int) (f19 + f20));
                        azVar.j.b(canvas);
                    } else {
                        ImageReceiver imageReceiver2 = azVar.r;
                        float f21 = azVar.a + azVar.f;
                        float f22 = azVar.b + azVar.g;
                        float f23 = azVar.d * f10;
                        imageReceiver2.setImageCoords(f21, f22, f23, f23);
                        if (azVar.m) {
                            azVar.r.draw(canvas);
                        } else {
                            canvas.save();
                            canvas.scale(-1.0f, 1.0f, azVar.r.getCenterX(), azVar.r.getCenterY());
                            azVar.r.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    float f24 = azVar.e;
                    float f25 = 1.49926f * f24;
                    float f26 = 0.0546875f * f25;
                    float f27 = (((f24 / 2.0f) + azVar.b) - (f25 / 2.0f)) - (0.00279f * f25);
                    if (azVar.m) {
                        azVar.r.setImageCoords(((azVar.a + azVar.d) - f25) + f26, f27, f25, f25);
                    } else {
                        azVar.r.setImageCoords(azVar.a - f26, f27, f25, f25);
                    }
                    if (azVar.m) {
                        azVar.r.draw(canvas);
                    } else {
                        canvas.save();
                        canvas.scale(-1.0f, 1.0f, azVar.r.getCenterX(), azVar.r.getCenterY());
                        azVar.r.draw(canvas);
                        canvas.restore();
                    }
                }
            }
            mg.d dVar2 = azVar.j;
            boolean c3 = dVar2 != null ? dVar2.c() : azVar.l && azVar.r.getLottieAnimation() != null && azVar.r.getLottieAnimation().Y >= azVar.r.getLottieAnimation().e[0] + (-2);
            if (azVar.o == 1.0f || c3 || z11) {
                az azVar2 = (az) this.C.remove(i10);
                if (azVar.h && azVar.r.getLottieAnimation() != null) {
                    azVar2.r.getLottieAnimation().L(0, true, true);
                }
                azVar2.r.onDetachedFromWindow();
                mg.d dVar3 = azVar2.j;
                if (dVar3 != null) {
                    dVar3.d(this.D);
                }
                i10--;
            } else if (azVar.r.getLottieAnimation() != null && azVar.r.getLottieAnimation().i0) {
                azVar.l = true;
            } else if (azVar.r.getLottieAnimation() != null && !azVar.r.getLottieAnimation().i0) {
                azVar.r.getLottieAnimation().L(0, true, false);
                azVar.r.getLottieAnimation().start();
            }
            i10++;
        }
        if (this.C.isEmpty()) {
            i();
        }
        this.D.invalidate();
    }

    public final boolean g() {
        return this.C.isEmpty();
    }

    public final void j() {
        this.n = true;
        b();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.onEmojiInteractionsReceived);
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((az) arrayList.get(i10)).r.onAttachedToWindow();
            if (((az) arrayList.get(i10)).j != null) {
                ((az) arrayList.get(i10)).j.f(this.D);
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
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            }
            ((az) arrayList.get(i10)).r.onDetachedFromWindow();
            if (((az) arrayList.get(i10)).j != null) {
                ((az) arrayList.get(i10)).j.d(this.D);
            }
            i10++;
        }
    }

    public final void l(org.telegram.ui.Cells.t1 t1Var, xn xnVar, boolean z4) {
        if (xnVar.v() || t1Var.getMessageObject() == null || t1Var.getMessageObject().getId() < 0) {
            return;
        }
        if (t1Var.getMessageObject().isPremiumSticker() || xnVar.f != null) {
            int i10 = 0;
            boolean o10 = o(t1Var, -1, z4, false);
            if (z4 && o10 && !EmojiData.hasEmojiSupportVibration(t1Var.getMessageObject().getStickerEmoji()) && !t1Var.getMessageObject().isPremiumSticker() && !t1Var.getMessageObject().isAnimatedAnimatedEmoji()) {
                try {
                    t1Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            boolean isPremiumSticker = t1Var.getMessageObject().isPremiumSticker();
            long j10 = this.F;
            if (isPremiumSticker || t1Var.getEffect() != null || (!z4 && t1Var.getMessageObject().isAnimatedEmojiStickerSingle())) {
                t1Var.getMessageObject().forcePlayEffect = false;
                t1Var.getMessageObject().messageOwner.premiumEffectWasPlayed = true;
                xnVar.getMessagesStorage().updateMessageCustomParams(j10, t1Var.getMessageObject().messageOwner);
                return;
            }
            Integer printingStringType = MessagesController.getInstance(this.b).getPrintingStringType(j10, this.G);
            if ((printingStringType == null || printingStringType.intValue() != 5) && this.B == null && o10) {
                org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
                if ((icVar == null || !icVar.l) && SharedConfig.emojiInteractionsHintCount > 0 && UserConfig.getInstance(this.b).getClientUserId() != xnVar.f.id) {
                    SharedConfig.updateEmojiInteractionsHintCount(SharedConfig.emojiInteractionsHintCount - 1);
                    org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(xnVar.getParentActivity(), null, 1, -1, t1Var.getMessageObject().isAnimatedAnimatedEmoji() ? t1Var.getMessageObject().getDocument() : MediaDataController.getInstance(this.b).getEmojiAnimatedSticker(t1Var.getMessageObject().getStickerEmoji()), xnVar.getResourceProvider());
                    bx0Var.c.setVisibility(8);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("EmojiInteractionTapHint", R.string.EmojiInteractionTapHint, xnVar.f.first_name));
                    TextView textView = bx0Var.b;
                    textView.setText(Emoji.replaceEmoji(replaceTags, textView.getPaint().getFontMetricsInt(), false));
                    textView.setTypeface(null);
                    textView.setMaxLines(3);
                    textView.setSingleLine(false);
                    yy yyVar = new yy(i10, this, org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750));
                    this.B = yyVar;
                    AndroidUtilities.runOnUIThread(yyVar, 1500L);
                }
            }
        }
    }

    public final void m(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        HashMap hashMap = this.H;
        if (hashMap == null || !hashMap.containsKey(Long.valueOf(document.id))) {
            if (this.H == null) {
                this.H = new HashMap();
            }
            this.H.put(Long.valueOf(document.id), Boolean.TRUE);
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
        if (!I.contains(q10) || (arrayList = (ArrayList) this.e.get(q10)) == null || arrayList.isEmpty()) {
            return;
        }
        int min = Math.min(1, arrayList.size());
        for (int i10 = 0; i10 < min; i10++) {
            m((TLRPC.Document) arrayList.get(i10));
        }
    }

    public final boolean o(org.telegram.ui.Cells.t1 t1Var, int i10, boolean z4, boolean z10) {
        if (t1Var == null || this.C.size() > 12) {
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
            return d(q(stickerEmoji), t1Var.getMessageObject().getId(), t1Var.getMessageObject().getDocument(), messageObject, i10, z4, z10, imageWidth, imageHeight, t1Var.getMessageObject().isOutOwner());
        }
        return false;
    }

    public final void p(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, MessageObject messageObject) {
        xn xnVar = this.a;
        if (xnVar == null || MessagesController.getInstance(this.b).premiumFeaturesBlocked() || xnVar.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.bx0 bx0Var = new org.telegram.ui.Components.bx0(this.D.getContext(), null, 1, -1, messageObject.getDocument(), xnVar.getResourceProvider());
        bx0Var.b.setText(tL_messages_stickerSet.set.title);
        bx0Var.c.setText(LocaleController.getString(R.string.PremiumStickerTooltip));
        org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(xnVar.getParentActivity(), xnVar.getResourceProvider(), true);
        bx0Var.setButton(gcVar);
        gcVar.a = new org.telegram.ui.Components.k41(24, this, messageObject);
        gcVar.e(LocaleController.getString(R.string.ViewAction));
        org.telegram.ui.Components.ic g10 = org.telegram.ui.Components.ic.g(xnVar, bx0Var, 2750);
        g10.b = messageObject.getId();
        g10.j();
    }

    public bz(xn xnVar, FrameLayout frameLayout, org.telegram.ui.Components.sl0 sl0Var, int i10, long j10, long j11) {
        this.a = xnVar;
        this.D = frameLayout;
        this.E = sl0Var;
        this.b = i10;
        this.F = j10;
        this.G = j11;
    }

    public void h(az azVar) {
    }

    public void i() {
    }
}
