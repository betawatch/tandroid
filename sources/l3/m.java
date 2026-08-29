package l3;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import i7.f6;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.d3;
import lh.b4;
import lh.b6;
import lh.d4;
import lh.f3;
import lh.g3;
import lh.h6;
import lh.i9;
import lh.k2;
import lh.k6;
import lh.m5;
import lh.m6;
import lh.r9;
import lh.s6;
import lh.t3;
import lh.w3;
import lh.x6;
import lh.z8;
import nh.c9;
import nh.e9;
import nh.gb;
import nh.j3;
import nh.m3;
import nh.n1;
import nh.o7;
import nh.x1;
import nh.y1;
import nh.y8;
import nh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g2;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p5;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, l4.h0] */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, lh.d4] */
    /* JADX WARN: Type inference failed for: r2v46, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r2v48, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.Components.p5] */
    /* JADX WARN: Type inference failed for: r5v31, types: [kg.d] */
    /* JADX WARN: Type inference failed for: r5v35, types: [org.telegram.ui.Components.p5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kg.d] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        kg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r72;
        TLRPC.TL_availableReaction tL_availableReaction2;
        p5 p5Var;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Photo photo;
        MessageObject messageObject;
        int id2;
        int[] iArr;
        File file;
        int i10;
        int i11;
        boolean contains;
        ViewGroup viewGroup;
        int i12 = this.a;
        int i13 = 4;
        int[] iArr2 = null;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.d;
        ?? r11 = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                o oVar = ((n) obj2).b;
                int i16 = f5.d0.a;
                oVar.getClass();
                k3.f fVar = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 1009, new d3(k9, (j3.t0) r11, (m3.l) obj, i13));
                break;
            case 1:
                l4.g0 g0Var = (l4.g0) obj2;
                r11.c(g0Var.a, g0Var.b, (l4.x) obj);
                break;
            case 2:
                g3 g3Var = (g3) obj2;
                kg.q0 q0Var = (kg.q0) r11;
                View view = (View) obj;
                ?? r12 = g3Var.a;
                r12.q3 = true;
                b4 b4Var = r12.K1;
                ImageReceiver imageReceiver = r12.h3;
                boolean[] zArr = {false};
                x6 x6Var = r12.A0;
                x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new k2(i15, x6Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                x6 x6Var2 = new x6(r12.getContext(), r12.t1);
                r12.A0 = x6Var2;
                x6Var2.setPadding(dp, dp, dp, dp);
                r12.z0.addView(r12.A0, f6.e(40, 40, 3));
                ?? r52 = r12.k3;
                if (r52 != 0) {
                    r52.o(r12);
                    dVar = null;
                    r12.k3 = null;
                } else {
                    dVar = null;
                }
                ?? r6 = r12.i3;
                if (r6 != 0) {
                    r6.d(r12);
                    r12.i3 = dVar;
                }
                r12.l3 = false;
                if (q0Var.g != 0) {
                    r12.l3 = true;
                    ?? p5Var2 = new p5(2, r12.y2, q0Var.g);
                    r12.k3 = p5Var2;
                    p5Var2.a(r12);
                } else if (q0Var.f != null && (tL_availableReaction = MediaDataController.getInstance(r12.y2).getReactionsMap().get(q0Var.f)) != null) {
                    r12.j3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), kg.m0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                r12.A0.setReaction(q0Var);
                if (r12.z1) {
                    TL_stories.StoryItem storyItem3 = b4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = b4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        kg.s0.b(null, storyItem4.sent_reaction, storyViews);
                        r12.k1(true);
                    }
                }
                if (q0Var.g != 0 && (p5Var = r12.A0.f) != null) {
                    ?? a2 = kg.d.a(p5Var, false, true);
                    r12.i3 = a2;
                    a2.f(r12);
                }
                r12.O1.g0(r12.x1, b4Var.a, q0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                r12.getLocationInWindow(iArr4);
                r12.s3 = iArr3[0] - iArr4[0];
                r12.t3 = iArr3[1] - iArr4[1];
                r12.u3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r12.r3 = 0.0f;
                r12.invalidate();
                x6 x6Var3 = r12.A0;
                x6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = x6Var3.e;
                if (q0Var.g != 0 || (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f)) == null) {
                    r72 = 0;
                } else {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    r72 = 0;
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new bg.s(g3Var, ofFloat, zArr, i15));
                ofFloat.addListener(new f3(g3Var, zArr, x6Var3, r72));
                ofFloat.setDuration(220L);
                ofFloat.start();
                r12.b1(r72);
                break;
            case 3:
                w3 w3Var = (w3) obj2;
                c6 c6Var = (c6) r11;
                d4 d4Var = w3Var.l;
                c5.S(d4Var.getContext(), null, c6Var, new androidx.car.app.utils.a(w3Var, (TL_stories.StoryItem) obj, c6Var, 9));
                w3 w3Var2 = d4Var.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 4:
                lh.c6 c6Var2 = (lh.c6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r11;
                Utilities.Callback callback = (Utilities.Callback) obj;
                for (int i17 = 0; i17 < c6Var2.i.size(); i17++) {
                    MessageObject messageObject2 = (MessageObject) c6Var2.i.get(i17);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        break;
                    }
                }
                callback.run(null);
                break;
            case 5:
                s6 s6Var = (s6) obj2;
                TLObject tLObject = (TLObject) r11;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i18 = s6Var.a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    s6Var.S = new m6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else {
                    s6Var.n(tL_error);
                    break;
                }
            case 6:
                b6 b6Var = (b6) r11;
                g2 g2Var = (g2) obj;
                ArrayList arrayList = ((lh.c6) obj2).i;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i19);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = b6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 != null) {
                                if (document4.id == document3.id) {
                                    g2Var.run((b6) storyItem2);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            g2Var.run((b6) storyItem2);
                            break;
                        }
                    }
                }
                g2Var.run(null);
                break;
            case 7:
                lh.c6 c6Var3 = (lh.c6) obj2;
                TLObject tLObject2 = (TLObject) r11;
                Runnable runnable = (Runnable) obj;
                h6 h6Var = c6Var3.q;
                ArrayList arrayList2 = c6Var3.G;
                ArrayList arrayList3 = c6Var3.i;
                ArrayList arrayList4 = c6Var3.H;
                c6Var3.F = 0;
                c6Var3.C = false;
                c6Var3.D = true;
                c6Var3.r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList6.get(i20);
                        i20++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj3);
                    }
                } else if (tLObject2 instanceof TL_bots.previewInfo) {
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList2.clear();
                    arrayList2.addAll(previewinfo.lang_codes);
                    arrayList5.addAll(previewinfo.media);
                }
                ArrayList arrayList7 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList4.clear();
                int size2 = arrayList5.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj4 = arrayList5.get(i21);
                    i21++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    MessageObject messageObject4 = new MessageObject(c6Var3.c, new b6(c6Var3, c6Var3.d, botpreviewmedia));
                    int i22 = 0;
                    while (true) {
                        if (i22 >= arrayList7.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList7.get(i22)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList7.get(i22);
                        } else {
                            i22++;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = c6Var3.I;
                        c6Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem6.id = id2;
                    messageObject4.parentStoriesList = c6Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                }
                AndroidUtilities.cancelRunOnUIThread(h6Var);
                AndroidUtilities.runOnUIThread(h6Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 8:
                i9 i9Var = ((z8) obj2).d;
                i9Var.j0.D(i9Var.h, ((k6) r11).d, (ArrayList) obj);
                break;
            case 9:
                r9 r9Var = (r9) obj2;
                TLObject tLObject3 = (TLObject) r11;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                m5 m5Var = r9Var.f;
                int i23 = r9Var.b;
                r9.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i23).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.e = false;
                        break;
                    } else {
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                r9Var.d = 0;
                if (r9Var.e) {
                    AndroidUtilities.cancelRunOnUIThread(m5Var);
                    AndroidUtilities.runOnUIThread(m5Var, 10000L);
                    break;
                }
                break;
            case 10:
                x1 x1Var = (x1) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList8 = x1Var.v;
                y1 y1Var = x1Var.J;
                ArrayList arrayList9 = x1Var.s;
                if (TextUtils.equals((String) r11, x1Var.D)) {
                    x1Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    x1Var.y.clear();
                    x1Var.n.clear();
                    x1Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList9.addAll(tL_messages_stickers.stickers);
                        x1Var.x = tL_messages_stickers.stickers.size() + x1Var.x;
                    }
                    x1Var.E = x1Var.D;
                    x1Var.l();
                    n1.w1(y1Var.b, 0, 0);
                    y1Var.f.c(false);
                    y1Var.e.n(false);
                    break;
                }
                break;
            case 11:
                j3 j3Var = (j3) obj2;
                String str = (String) obj;
                float f9 = j3Var.G;
                if (r11 != 0) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (r11 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) r11;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        j3Var.c(photoEntry, options);
                        o7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c3 = j3Var.c(photoEntry, options);
                        if (c3 != 0 && c3.getHeight() / c3.getWidth() < f9) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c3.isRecycled()) {
                                iArr2 = nh.n0.b(c3, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i24 = photoEntry.gradientTopColor;
                                if (i24 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i24, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c3;
                    } else if (!(r11 instanceof o7) || (file = ((o7) r11).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        o7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new m(j3Var, str, iArr2, 12));
                break;
            case 12:
                j3 j3Var2 = (j3) obj2;
                String str2 = (String) r11;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = j3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        j3.b0.put(str2, bitmap);
                        HashMap hashMap = j3.a0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (TextUtils.equals(str2, j3Var2.N)) {
                        j3Var2.a = bitmap;
                        if (iArr5 == null) {
                            paint.setShader(null);
                            j3Var2.e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            j3Var2.e = linearGradient;
                            paint.setShader(linearGradient);
                        }
                        j3Var2.h();
                        j3Var2.invalidate();
                        break;
                    } else {
                        j3.d(str2);
                        break;
                    }
                }
                break;
            case 13:
                m3 m3Var = (m3) obj2;
                TLObject tLObject5 = (TLObject) r11;
                MessagesController messagesController = (MessagesController) obj;
                m3Var.r = true;
                m3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(m3Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    m3Var.E();
                    break;
                }
                break;
            case 14:
                String[] strArr = (String[]) obj2;
                int[][] iArr6 = (int[][]) r11;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) obj;
                while (i14 < strArr.length) {
                    String str3 = strArr[i14];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr6[i14], 0L);
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(cVar);
                break;
            case 15:
                AnimatedFileNative.d((String) obj2, ((int[][]) r11)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.c) obj);
                break;
            case 16:
                y8 y8Var = (y8) obj2;
                TLObject tLObject6 = (TLObject) r11;
                MessagesController messagesController2 = (MessagesController) obj;
                e9 e9Var = y8Var.S;
                y8Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i25 = e9.Z;
                    ArrayList h12 = e9Var.h1();
                    for (int i26 = 0; i26 < h12.size(); i26++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i26);
                        if (user != null && (contains = y8Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                e9Var.f1();
                if (e9Var.V) {
                    i11 = ((org.telegram.ui.ActionBar.f3) e9Var).currentAccount;
                    e9Var.g1(new c9(1, i11, (ArrayList) null), new t3(e9Var, i15), false);
                    break;
                } else {
                    e9Var.f1();
                    e9Var.b.D(0);
                    break;
                }
                break;
            case 17:
                ((o7) r11).O0 = (File) obj;
                y9 y9Var = ((gb) obj2).Z0;
                if (y9Var != null) {
                    y9Var.b.U2.N(false);
                    break;
                }
                break;
            case 18:
                gb gbVar = (gb) obj2;
                Bitmap bitmap2 = (Bitmap) r11;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), gbVar.x0.getMatrix(), true);
                        bitmap2.recycle();
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable2);
                break;
            case 19:
                ((VideoAds) obj2).lambda$show$3((mc) r11, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 20:
                ((VideoAds) obj2).lambda$show$5((mc) r11, (boolean[]) obj);
                break;
            case 21:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r11, (Runnable) obj);
                break;
            case 22:
                ((Utilities.Callback2) obj2).run((TLObject) r11, (TLRPC.TL_error) obj);
                break;
            case 23:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r11, (TLRPC.TL_error) obj);
                break;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                o2 o2Var = (o2) r11;
                o2 o2Var2 = (o2) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.F;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.F);
                }
                if (actionBarLayout.h || actionBarLayout.T) {
                    actionBarLayout.v.setScaleX(1.0f);
                    actionBarLayout.v.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.F = null;
                    actionBarLayout.T = false;
                } else {
                    actionBarLayout.v.setTranslationX(0.0f);
                }
                actionBarLayout.m(o2Var);
                o2Var.setRemovingFromStack(false);
                o2Var.onTransitionAnimationEnd(false, true);
                o2Var2.onTransitionAnimationEnd(true, true);
                o2Var2.onBecomeFullyVisible();
                break;
            case 25:
                ((o2) r11).presentFragment((tn) obj);
                ((org.telegram.ui.ActionBar.m3) obj2).c = false;
                break;
            case 26:
                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj2;
                ArrayList arrayList10 = (ArrayList) r11;
                l3 l3Var = (l3) obj;
                m3Var2.getClass();
                while (i14 < arrayList10.size()) {
                    if (((org.telegram.ui.ActionBar.j3) arrayList10.get(i14)).a == l3Var) {
                        arrayList10.remove(i14);
                        i14--;
                    }
                    i14++;
                }
                m3Var2.invalidate();
                break;
            case 27:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TLObject tLObject7 = (TLObject) r11;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (tLObject7 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject7;
                    f6Var.c0 = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(f6Var2.A).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                    break;
                } else {
                    f6Var.s();
                    break;
                }
            case 28:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj2;
                v0Var.T0.K1(v0Var, (TLRPC.TL_premiumGiftOption) r11, (String) obj);
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) r11;
                f6Var3.f = !f6Var3.d((File) obj, f6Var3.c);
                AndroidUtilities.runOnUIThread(new ha(8, (ja) obj2, f6Var3));
                break;
        }
    }
}
