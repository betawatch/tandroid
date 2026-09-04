package a3;

import ah.e1;
import ah.j1;
import ah.m1;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.car.app.IOnDoneCallback;
import bi.a8;
import bi.b5;
import bi.b8;
import bi.f5;
import bi.g8;
import bi.gb;
import bi.i4;
import bi.j3;
import bi.j4;
import bi.k4;
import bi.l8;
import bi.m5;
import bi.n8;
import bi.o5;
import bi.oa;
import bi.pb;
import bi.u8;
import bi.yb;
import bi.z8;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.ba;
import di.d2;
import di.e2;
import di.fb;
import di.ga;
import di.ia;
import di.n0;
import di.o8;
import di.p1;
import di.pc;
import di.s3;
import di.w3;
import fi.b3;
import fi.e4;
import fi.k3;
import fi.v1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.web.d1;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v75, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r5v33, types: [android.util.Pair] */
    @Override // java.lang.Runnable
    public final void run() {
        ah.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        q5 q5Var;
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
        int i12 = 15;
        int i13 = 2;
        int[] iArr2 = null;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                pf.b bVar = (pf.b) this.b;
                b2.s sVar = (b2.s) this.c;
                i2.i iVar = (i2.i) this.d;
                i2.c0 c0Var = (i2.c0) bVar.c;
                String str = e2.d0.a;
                i2.f0 f0Var = c0Var.a;
                f0Var.Q = sVar;
                j2.f fVar = f0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, iVar, 15));
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            i14 = 0;
                        }
                        if (i14 != 0) {
                            cVar.a();
                            return;
                        }
                    } catch (w.g e7) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e7);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.c;
                try {
                    androidx.car.app.utils.i.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.c) this.d).a(), str3, i15));
                    return;
                } catch (RuntimeException e10) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e10);
                    throw new RuntimeException(e10);
                } catch (w.g e11) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e11);
                    return;
                }
            case 3:
                androidx.biometric.s sVar2 = (androidx.biometric.s) this.b;
                v7.w wVar = (v7.w) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.v.a(sVar2.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                k4 k4Var = (k4) this.b;
                j1 j1Var = (j1) this.c;
                View view = (View) this.d;
                o5 o5Var = k4Var.a;
                o5Var.u3 = true;
                m5 m5Var = o5Var.O1;
                ImageReceiver imageReceiver = o5Var.l3;
                boolean[] zArr = {false};
                z8 z8Var = o5Var.E0;
                z8Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new j3(i14, z8Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                z8 z8Var2 = new z8(o5Var.getContext(), o5Var.x1);
                o5Var.E0 = z8Var2;
                z8Var2.setPadding(dp, dp, dp, dp);
                o5Var.D0.addView(o5Var.E0, x5.e(40, 40, 3));
                q5 q5Var2 = o5Var.o3;
                if (q5Var2 != null) {
                    q5Var2.o(o5Var);
                    eVar = null;
                    o5Var.o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar2 = o5Var.m3;
                if (eVar2 != null) {
                    eVar2.d(o5Var);
                    o5Var.m3 = eVar;
                }
                o5Var.p3 = false;
                if (j1Var.g != 0) {
                    o5Var.p3 = true;
                    q5 q5Var3 = new q5(2, o5Var.C2, j1Var.g);
                    o5Var.o3 = q5Var3;
                    q5Var3.a(o5Var);
                } else if (j1Var.f != null && (tL_availableReaction = MediaDataController.getInstance(o5Var.C2).getReactionsMap().get(j1Var.f)) != null) {
                    o5Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), e1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                o5Var.E0.setReaction(j1Var);
                if (o5Var.D1) {
                    TL_stories.StoryItem storyItem3 = m5Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = m5Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        m1.b(null, storyItem4.sent_reaction, storyViews);
                        o5Var.k1(true);
                    }
                }
                if (j1Var.g != 0 && (q5Var = o5Var.E0.f) != null) {
                    ah.e a10 = ah.e.a(q5Var, false, true);
                    o5Var.m3 = a10;
                    a10.f(o5Var);
                }
                o5Var.S1.g0(o5Var.B1, m5Var.a, j1Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                o5Var.getLocationInWindow(iArr4);
                o5Var.w3 = iArr3[0] - iArr4[0];
                o5Var.x3 = iArr3[1] - iArr4[1];
                o5Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o5Var.v3 = 0.0f;
                o5Var.invalidate();
                z8 z8Var3 = o5Var.E0;
                z8Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = z8Var3.e;
                if (j1Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new i4(k4Var, ofFloat, zArr, i15));
                ofFloat.addListener(new j4(k4Var, zArr, z8Var3, i15));
                ofFloat.setDuration(220L);
                ofFloat.start();
                o5Var.b1(false);
                return;
            case 5:
                f5 f5Var = (f5) this.b;
                f6 f6Var = (f6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                o5 o5Var2 = f5Var.l;
                e5.S(o5Var2.getContext(), null, f6Var, new androidx.car.app.utils.a(f5Var, storyItem5, f6Var, i13));
                f5 f5Var2 = o5Var2.t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    return;
                }
                return;
            case 6:
                b8 b8Var = (b8) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i15 < b8Var.i.size()) {
                    MessageObject messageObject2 = (MessageObject) b8Var.i.get(i15);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        return;
                    }
                    i15++;
                }
                callback.run(null);
                return;
            case 7:
                u8 u8Var = (u8) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i16 = u8Var.a;
                u8Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    u8Var.S = null;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    u8Var.n(tL_error);
                    return;
                } else {
                    u8Var.S = new n8(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 8:
                b8 b8Var2 = (b8) this.b;
                a8 a8Var = (a8) this.c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = b8Var2.i;
                while (i15 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = a8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.id == document3.id) {
                                g2Var.run((a8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            g2Var.run((a8) storyItem2);
                            return;
                        }
                    }
                    i15++;
                }
                g2Var.run(null);
                return;
            case 9:
                b8 b8Var3 = (b8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                g8 g8Var = b8Var3.q;
                ArrayList arrayList2 = b8Var3.G;
                ArrayList arrayList3 = b8Var3.i;
                ArrayList arrayList4 = b8Var3.H;
                b8Var3.F = 0;
                b8Var3.C = false;
                b8Var3.D = true;
                b8Var3.r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList6.get(i17);
                        i17++;
                        arrayList5.add((TL_bots.botPreviewMedia) obj);
                    }
                } else {
                    if (!(tLObject2 instanceof TL_bots.previewInfo)) {
                        return;
                    }
                    TL_bots.previewInfo previewinfo = (TL_bots.previewInfo) tLObject2;
                    arrayList2.clear();
                    arrayList2.addAll(previewinfo.lang_codes);
                    arrayList5.addAll(previewinfo.media);
                }
                ArrayList arrayList7 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList4.clear();
                int size2 = arrayList5.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj2 = arrayList5.get(i18);
                    i18++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList8 = arrayList5;
                    MessageObject messageObject4 = new MessageObject(b8Var3.c, new a8(b8Var3, b8Var3.d, botpreviewmedia));
                    int i19 = 0;
                    while (true) {
                        if (i19 >= arrayList7.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList7.get(i19)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList7.get(i19);
                        } else {
                            i19++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = b8Var3.I;
                        b8Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem7.id = id2;
                    messageObject4.parentStoriesList = b8Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(g8Var);
                AndroidUtilities.runOnUIThread(g8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 10:
                gb gbVar = (gb) this.b;
                l8 l8Var = (l8) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                pb pbVar = gbVar.d;
                pbVar.n0.D(pbVar.h, l8Var.d, arrayList9);
                return;
            case 11:
                yb ybVar = (yb) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                oa oaVar = ybVar.f;
                int i20 = ybVar.b;
                yb.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i20).putUsers(tL_stories_storyViews.users, false);
                    if (!ybVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        ybVar.d = 0;
                        ybVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                ybVar.d = 0;
                if (ybVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(oaVar);
                    AndroidUtilities.runOnUIThread(oaVar, 10000L);
                    return;
                }
                return;
            case 12:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 13:
                d2 d2Var = (d2) this.b;
                String str4 = (String) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList10 = d2Var.v;
                e2 e2Var = d2Var.N;
                ArrayList arrayList11 = d2Var.s;
                if (TextUtils.equals(str4, d2Var.H)) {
                    d2Var.x = 0;
                    arrayList11.clear();
                    arrayList10.clear();
                    d2Var.y.clear();
                    d2Var.n.clear();
                    d2Var.x++;
                    arrayList11.add(null);
                    arrayList10.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList11.addAll(tL_messages_stickers.stickers);
                        d2Var.x = tL_messages_stickers.stickers.size() + d2Var.x;
                    }
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    p1.v1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                return;
            case 14:
                s3 s3Var = (s3) this.b;
                Object obj3 = this.c;
                String str5 = (String) this.d;
                float f7 = s3Var.K;
                if (obj3 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj3 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        s3Var.c(photoEntry, options);
                        o8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c10 = s3Var.c(photoEntry, options);
                        if (c10 != 0 && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i21 = photoEntry.gradientTopColor;
                                if (i21 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i21, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if (!(obj3 instanceof o8) || (file = ((o8) obj3).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        o8.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new j0(s3Var, str5, iArr2, i12));
                return;
            case 15:
                s3 s3Var2 = (s3) this.b;
                String str6 = (String) this.c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = s3Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str6 != null) {
                    s3.f0.put(str6, bitmap);
                    HashMap hashMap = s3.e0;
                    Integer num = (Integer) hashMap.get(str6);
                    if (num != null) {
                        hashMap.put(str6, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str6, 1);
                    }
                }
                if (!TextUtils.equals(str6, s3Var2.R)) {
                    s3.d(str6);
                    return;
                }
                s3Var2.a = bitmap;
                if (iArr5 == null) {
                    paint.setShader(null);
                    s3Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    s3Var2.e = linearGradient;
                    paint.setShader(linearGradient);
                }
                s3Var2.h();
                s3Var2.invalidate();
                return;
            case 16:
                w3 w3Var = (w3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                w3Var.r = true;
                w3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(w3Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    w3Var.E();
                    return;
                }
                return;
            case 17:
                String[] strArr = (String[]) this.b;
                int[][] iArr6 = (int[][]) this.c;
                androidx.car.app.utils.b bVar2 = (androidx.car.app.utils.b) this.d;
                while (i15 < strArr.length) {
                    String str7 = strArr[i15];
                    if (str7 != null) {
                        AnimatedFileNative.d(str7, iArr6[i15], 0L);
                    }
                    i15++;
                }
                AndroidUtilities.runOnUIThread(bVar2);
                return;
            case 18:
                String str8 = (String) this.b;
                int[][] iArr7 = (int[][]) this.c;
                androidx.car.app.utils.b bVar3 = (androidx.car.app.utils.b) this.d;
                AnimatedFileNative.d(str8, iArr7[0], 0L);
                AndroidUtilities.runOnUIThread(bVar3);
                return;
            case 19:
                ba baVar = (ba) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                ia iaVar = baVar.W;
                baVar.v.setLoading(false);
                if (tLObject6 != null) {
                    int i22 = ia.d0;
                    ArrayList h12 = iaVar.h1();
                    for (int i23 = 0; i23 < h12.size(); i23++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i23);
                        if (user != null && (contains = baVar.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                iaVar.f1();
                if (iaVar.Z) {
                    i11 = ((f3) iaVar).currentAccount;
                    iaVar.g1(new ga(1, i11, (ArrayList) null), new b5(iaVar, i14), false);
                    return;
                } else {
                    iaVar.f1();
                    iaVar.b.D(0);
                    return;
                }
            case 20:
                pc pcVar = (pc) this.b;
                ((o8) this.c).O0 = (File) this.d;
                fb fbVar = pcVar.d1;
                if (fbVar != null) {
                    fbVar.b.Y2.N(false);
                    return;
                }
                return;
            case 21:
                pc pcVar2 = (pc) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), pcVar2.B0.getMatrix(), true);
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
                return;
            case 22:
                i9.w wVar2 = (i9.w) this.b;
                i9.c0 c0Var2 = (i9.c0) this.c;
                try {
                    try {
                        c0Var2.o(((i9.p) this.d).apply(v7.l8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var2.n(th3);
                        return;
                    }
                } catch (Error e12) {
                    e = e12;
                    c0Var2.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var2.cancel(false);
                    return;
                } catch (RuntimeException e13) {
                    e = e13;
                    c0Var2.n(e);
                    return;
                } catch (ExecutionException e14) {
                    e = e14;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var2.n(e);
                    return;
                }
            case 23:
                i9.c0 c0Var3 = (i9.c0) this.b;
                ji.b5 b5Var = (ji.b5) this.c;
                m4.p1 p1Var = (m4.p1) this.d;
                try {
                    if (c0Var3.a instanceof i9.a) {
                        return;
                    }
                    b5Var.run();
                    c0Var3.m(p1Var);
                    return;
                } catch (Throwable th4) {
                    c0Var3.n(th4);
                    return;
                }
            case 24:
                ArrayList arrayList12 = (ArrayList) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                ArrayList arrayList13 = new ArrayList();
                for (int i24 = 0; i24 < arrayList12.size(); i24++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList12.get(i24);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    fi.r rVar = new fi.r();
                    rVar.a = user2;
                    rVar.b = z10;
                    arrayList13.add(rVar);
                }
                callback2.run(arrayList13);
                return;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                v1 v1Var = (v1) this.d;
                zArr2[0] = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    v1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                fi.f3 f3Var = (fi.f3) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = f3Var.d;
                if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    new yc(k3Var.p0, k3Var.E).Y(tL_error2).k(true);
                    return;
                }
                b3 b3Var = k3Var.x;
                b3Var.getClass();
                b3Var.z("emoji_status_access_requested", d1.B("cancelled", "status"));
                return;
            case 27:
                e4 e4Var = (e4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                yc.a0(e4Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, fi.m.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user3))), R.raw.copy).j();
                return;
            case 28:
                e4.A0((e4) this.b, (TLObject) this.c, (b2) this.d);
                return;
            default:
                hg.i0 i0Var = (hg.i0) this.b;
                HashSet hashSet = (HashSet) this.c;
                hg.s sVar3 = (hg.s) this.d;
                int i25 = i0Var.s0;
                MessagesController messagesController3 = MessagesController.getInstance(i25);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l4 = (Long) pair2.second;
                    (booleanValue ? messagesController3.dialogs_read_outbox_max : messagesController3.dialogs_read_inbox_max).put(l4, Integer.valueOf(MessagesStorage.getInstance(i25).getDialogReadMaxSync(booleanValue, l4.longValue())));
                }
                AndroidUtilities.runOnUIThread(sVar3);
                return;
        }
    }
}
