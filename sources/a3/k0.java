package a3;

import ai.ac;
import ai.d6;
import ai.d9;
import ai.f6;
import ai.f9;
import ai.i5;
import ai.jc;
import ai.l9;
import ai.q9;
import ai.r5;
import ai.s5;
import ai.s8;
import ai.sc;
import ai.t8;
import ai.w3;
import ai.w5;
import ai.x4;
import ai.y4;
import ai.y8;
import ai.z4;
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
import ci.ba;
import ci.d2;
import ci.e2;
import ci.fb;
import ci.ga;
import ci.ia;
import ci.o8;
import ci.oc;
import ci.p1;
import ci.s3;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.b3;
import ei.e4;
import ei.k3;
import ei.v1;
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
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.web.d1;
import v7.m8;
import w7.y5;
import zg.p0;
import zg.r0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v87, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v48, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.graphics.Bitmap] */
    @Override // java.lang.Runnable
    public final void run() {
        zg.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
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
        int i12 = 2;
        int[] iArr2 = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.b;
                b2.s sVar = (b2.s) this.c;
                i2.h hVar = (i2.h) this.d;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) l0Var).a;
                e0Var.Q = sVar;
                j2.f fVar = e0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1017, new j2.c(p5, sVar, hVar, 17));
                return;
            case 1:
                z4 z4Var = (z4) this.b;
                p0 p0Var = (p0) this.c;
                View view = (View) this.d;
                f6 f6Var = z4Var.a;
                f6Var.u3 = true;
                d6 d6Var = f6Var.O1;
                ImageReceiver imageReceiver = f6Var.l3;
                boolean[] zArr = {false};
                q9 q9Var = f6Var.E0;
                q9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new w3(i13, q9Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                q9 q9Var2 = new q9(f6Var.getContext(), f6Var.x1);
                f6Var.E0 = q9Var2;
                q9Var2.setPadding(dp, dp, dp, dp);
                f6Var.D0.addView(f6Var.E0, y5.e(40, 40, 3));
                p5 p5Var2 = f6Var.o3;
                if (p5Var2 != null) {
                    p5Var2.o(f6Var);
                    dVar = null;
                    f6Var.o3 = null;
                } else {
                    dVar = null;
                }
                zg.d dVar2 = f6Var.m3;
                if (dVar2 != null) {
                    dVar2.d(f6Var);
                    f6Var.m3 = dVar;
                }
                f6Var.p3 = false;
                if (p0Var.g != 0) {
                    f6Var.p3 = true;
                    p5 p5Var3 = new p5(2, f6Var.C2, p0Var.g);
                    f6Var.o3 = p5Var3;
                    p5Var3.a(f6Var);
                } else if (p0Var.f != null && (tL_availableReaction = MediaDataController.getInstance(f6Var.C2).getReactionsMap().get(p0Var.f)) != null) {
                    f6Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), zg.l0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                f6Var.E0.setReaction(p0Var);
                if (f6Var.D1) {
                    TL_stories.StoryItem storyItem3 = d6Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = d6Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        r0.b(null, storyItem4.sent_reaction, storyViews);
                        f6Var.k1(true);
                    }
                }
                if (p0Var.g != 0 && (p5Var = f6Var.E0.f) != null) {
                    zg.d a2 = zg.d.a(p5Var, false, true);
                    f6Var.m3 = a2;
                    a2.f(f6Var);
                }
                f6Var.S1.g0(f6Var.B1, d6Var.a, p0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                f6Var.getLocationInWindow(iArr4);
                f6Var.w3 = iArr3[0] - iArr4[0];
                f6Var.x3 = iArr3[1] - iArr4[1];
                f6Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f6Var.v3 = 0.0f;
                f6Var.invalidate();
                q9 q9Var3 = f6Var.E0;
                q9Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = q9Var3.e;
                if (p0Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new x4(z4Var, ofFloat, zArr, i14));
                ofFloat.addListener(new y4(z4Var, zArr, q9Var3, i14));
                ofFloat.setDuration(220L);
                ofFloat.start();
                f6Var.b1(false);
                return;
            case 2:
                w5 w5Var = (w5) this.b;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                f6 f6Var3 = w5Var.l;
                d5.S(f6Var3.getContext(), null, f6Var2, new r5(w5Var, storyItem5, f6Var2, i14));
                w5 w5Var2 = f6Var3.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    return;
                }
                return;
            case 3:
                t8 t8Var = (t8) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i14 < t8Var.i.size()) {
                    MessageObject messageObject2 = (MessageObject) t8Var.i.get(i14);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        return;
                    }
                    i14++;
                }
                callback.run(null);
                return;
            case 4:
                l9 l9Var = (l9) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i15 = l9Var.a;
                l9Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    l9Var.S = null;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    l9Var.n(tL_error);
                    return;
                } else {
                    l9Var.S = new f9(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 5:
                t8 t8Var2 = (t8) this.b;
                s8 s8Var = (s8) this.c;
                g2 g2Var = (g2) this.d;
                ArrayList arrayList = t8Var2.i;
                while (i14 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = s8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.id == document3.id) {
                                g2Var.run((s8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            g2Var.run((s8) storyItem2);
                            return;
                        }
                    }
                    i14++;
                }
                g2Var.run(null);
                return;
            case 6:
                t8 t8Var3 = (t8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                y8 y8Var = t8Var3.q;
                ArrayList arrayList2 = t8Var3.G;
                ArrayList arrayList3 = t8Var3.i;
                ArrayList arrayList4 = t8Var3.H;
                t8Var3.F = 0;
                t8Var3.C = false;
                t8Var3.D = true;
                t8Var3.r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList6.get(i16);
                        i16++;
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
                int i17 = 0;
                while (i17 < size2) {
                    Object obj2 = arrayList5.get(i17);
                    i17++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj2;
                    ArrayList arrayList8 = arrayList5;
                    MessageObject messageObject4 = new MessageObject(t8Var3.c, new s8(t8Var3, t8Var3.d, botpreviewmedia));
                    int i18 = 0;
                    while (true) {
                        if (i18 >= arrayList7.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList7.get(i18)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList7.get(i18);
                        } else {
                            i18++;
                        }
                    }
                    TL_stories.StoryItem storyItem7 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = t8Var3.I;
                        t8Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem7.id = id2;
                    messageObject4.parentStoriesList = t8Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(y8Var);
                AndroidUtilities.runOnUIThread(y8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 7:
                ac acVar = (ac) this.b;
                d9 d9Var = (d9) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                jc jcVar = acVar.d;
                jcVar.n0.D(jcVar.h, d9Var.d, arrayList9);
                return;
            case 8:
                sc scVar = (sc) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                d dVar3 = scVar.f;
                int i19 = scVar.b;
                sc.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i19).putUsers(tL_stories_storyViews.users, false);
                    if (!scVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        scVar.d = 0;
                        scVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                scVar.d = 0;
                if (scVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(dVar3);
                    AndroidUtilities.runOnUIThread(dVar3, 10000L);
                    return;
                }
                return;
            case 9:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            aVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + aVar);
                return;
            case 10:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.c;
                try {
                    androidx.car.app.utils.g.d(str3.concat(" onSuccess"), new r5(iOnDoneCallback, ((androidx.car.app.utils.a) this.d).a(), str3, i12));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.g.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 11:
                k6.h hVar2 = (k6.h) this.b;
                v7.w wVar = (v7.w) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.q a10 = v7.v.a(hVar2.a);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) ((androidx.emoji2.text.k) a10.b);
                    synchronized (pVar.d) {
                        pVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a10.b).b(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 12:
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
                    p1.x1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                return;
            case 13:
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
                                iArr2 = ci.n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i20 = photoEntry.gradientTopColor;
                                if (i20 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i20, i10};
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
                AndroidUtilities.runOnUIThread(new k0(s3Var, str5, iArr2, 14));
                return;
            case 14:
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
            case 15:
                ci.w3 w3Var = (ci.w3) this.b;
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
            case 16:
                String[] strArr = (String[]) this.b;
                int[][] iArr6 = (int[][]) this.c;
                i5 i5Var = (i5) this.d;
                while (i14 < strArr.length) {
                    String str7 = strArr[i14];
                    if (str7 != null) {
                        AnimatedFileNative.d(str7, iArr6[i14], 0L);
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(i5Var);
                return;
            case 17:
                String str8 = (String) this.b;
                int[][] iArr7 = (int[][]) this.c;
                i5 i5Var2 = (i5) this.d;
                AnimatedFileNative.d(str8, iArr7[0], 0L);
                AndroidUtilities.runOnUIThread(i5Var2);
                return;
            case 18:
                ba baVar = (ba) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                ia iaVar = baVar.W;
                baVar.v.setLoading(false);
                if (tLObject6 != null) {
                    int i21 = ia.d0;
                    ArrayList h12 = iaVar.h1();
                    for (int i22 = 0; i22 < h12.size(); i22++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i22);
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
                    iaVar.g1(new ga(1, i11, (ArrayList) null), new s5(iaVar, i13), false);
                    return;
                } else {
                    iaVar.f1();
                    iaVar.b.E(0);
                    return;
                }
            case 19:
                oc ocVar = (oc) this.b;
                ((o8) this.c).O0 = (File) this.d;
                fb fbVar = ocVar.d1;
                if (fbVar != null) {
                    fbVar.b.Y2.N(false);
                    return;
                }
                return;
            case 20:
                oc ocVar2 = (oc) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), ocVar2.B0.getMatrix(), true);
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
            case 21:
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
            case 22:
                i9.w wVar2 = (i9.w) this.b;
                i9.c0 c0Var = (i9.c0) this.c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(m8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    c0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    c0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var.n(e);
                    return;
                }
            case 23:
                i9.c0 c0Var2 = (i9.c0) this.b;
                ki.l lVar = (ki.l) this.c;
                m4.p1 p1Var = (m4.p1) this.d;
                try {
                    if (c0Var2.a instanceof i9.a) {
                        return;
                    }
                    lVar.run();
                    c0Var2.m(p1Var);
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 24:
                ArrayList arrayList12 = (ArrayList) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                ArrayList arrayList13 = new ArrayList();
                for (int i23 = 0; i23 < arrayList12.size(); i23++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList12.get(i23);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    ei.q qVar = new ei.q();
                    qVar.a = user2;
                    qVar.b = z10;
                    arrayList13.add(qVar);
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
                ei.f3 f3Var = (ei.f3) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = f3Var.d;
                if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    new xc(k3Var.p0, k3Var.E).Y(tL_error2).k(true);
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
                xc.a0(e4Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ei.l.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user3))), R.raw.copy).j();
                return;
            case 28:
                e4.A0((e4) this.b, (TLObject) this.c, (b2) this.d);
                return;
            default:
                gg.i0 i0Var = (gg.i0) this.b;
                HashSet hashSet = (HashSet) this.c;
                gg.s sVar2 = (gg.s) this.d;
                int i24 = i0Var.s0;
                MessagesController messagesController3 = MessagesController.getInstance(i24);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l4 = (Long) pair2.second;
                    (booleanValue ? messagesController3.dialogs_read_outbox_max : messagesController3.dialogs_read_inbox_max).put(l4, Integer.valueOf(MessagesStorage.getInstance(i24).getDialogReadMaxSync(booleanValue, l4.longValue())));
                }
                AndroidUtilities.runOnUIThread(sVar2);
                return;
        }
    }
}
