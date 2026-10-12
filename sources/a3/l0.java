package a3;

import ah.d1;
import ah.i1;
import ah.l1;
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
import bi.bc;
import bi.c9;
import bi.d5;
import bi.e8;
import bi.f8;
import bi.h5;
import bi.j8;
import bi.jb;
import bi.l4;
import bi.la;
import bi.m3;
import bi.m4;
import bi.n4;
import bi.o5;
import bi.o8;
import bi.q5;
import bi.q8;
import bi.sb;
import bi.x8;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.bb;
import di.c2;
import di.ca;
import di.d2;
import di.ea;
import di.k8;
import di.kc;
import di.o1;
import di.q3;
import di.u3;
import di.x9;
import fi.b3;
import fi.f3;
import fi.f4;
import fi.k3;
import fi.u1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import ji.v2;
import m4.t1;
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
import org.telegram.messenger.j2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.web.b1;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v93, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v50, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.graphics.Bitmap] */
    @Override // java.lang.Runnable
    public final void run() {
        ah.e eVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        s5 s5Var;
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
                n4.s sVar = (n4.s) this.b;
                b2.x xVar = (b2.x) this.c;
                i2.f fVar = (i2.f) this.d;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var).a;
                h0Var.S = xVar;
                j2.f fVar2 = h0Var.s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1017, new j2.c(p5, xVar, fVar, 28));
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            cVar.a();
                            return;
                        }
                    } catch (w.f e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.c;
                try {
                    androidx.car.app.utils.i.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.c) this.d).a(), str3, i14));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.f e10) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 3:
                androidx.biometric.t tVar = (androidx.biometric.t) this.b;
                v7.t tVar2 = (v7.t) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.s.a(tVar.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(tVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    tVar2.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                n4 n4Var = (n4) this.b;
                i1 i1Var = (i1) this.c;
                View view = (View) this.d;
                q5 q5Var = n4Var.a;
                q5Var.u3 = true;
                o5 o5Var = q5Var.O1;
                ImageReceiver imageReceiver = q5Var.l3;
                boolean[] zArr = {false};
                c9 c9Var = q5Var.E0;
                c9Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new m3(i13, c9Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                c9 c9Var2 = new c9(q5Var.getContext(), q5Var.x1);
                q5Var.E0 = c9Var2;
                c9Var2.setPadding(dp, dp, dp, dp);
                q5Var.D0.addView(q5Var.E0, a6.e(40, 40, 3));
                s5 s5Var2 = q5Var.o3;
                if (s5Var2 != null) {
                    s5Var2.o(q5Var);
                    eVar = null;
                    q5Var.o3 = null;
                } else {
                    eVar = null;
                }
                ah.e eVar2 = q5Var.m3;
                if (eVar2 != null) {
                    eVar2.d(q5Var);
                    q5Var.m3 = eVar;
                }
                q5Var.p3 = false;
                if (i1Var.g != 0) {
                    q5Var.p3 = true;
                    s5 s5Var3 = new s5(2, q5Var.C2, i1Var.g);
                    q5Var.o3 = s5Var3;
                    s5Var3.a(q5Var);
                } else if (i1Var.f != null && (tL_availableReaction = MediaDataController.getInstance(q5Var.C2).getReactionsMap().get(i1Var.f)) != null) {
                    q5Var.n3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), d1.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().N(0, false, true);
                    }
                }
                q5Var.E0.setReaction(i1Var);
                if (q5Var.D1) {
                    TL_stories.StoryItem storyItem3 = o5Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = o5Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        l1.b(null, storyItem4.sent_reaction, storyViews);
                        q5Var.k1(true);
                    }
                }
                if (i1Var.g != 0 && (s5Var = q5Var.E0.f) != null) {
                    ah.e a10 = ah.e.a(s5Var, false, true);
                    q5Var.m3 = a10;
                    a10.f(q5Var);
                }
                q5Var.S1.g0(q5Var.B1, o5Var.a, i1Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                q5Var.getLocationInWindow(iArr4);
                q5Var.w3 = iArr3[0] - iArr4[0];
                q5Var.x3 = iArr3[1] - iArr4[1];
                q5Var.y3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q5Var.v3 = 0.0f;
                q5Var.invalidate();
                c9 c9Var3 = q5Var.E0;
                c9Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = c9Var3.e;
                if (i1Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new l4(n4Var, ofFloat, zArr, i14));
                ofFloat.addListener(new m4(n4Var, zArr, c9Var3, i14));
                ofFloat.setDuration(220L);
                ofFloat.start();
                q5Var.b1(false);
                return;
            case 5:
                h5 h5Var = (h5) this.b;
                c6 c6Var = (c6) this.c;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) this.d;
                q5 q5Var2 = h5Var.l;
                g5.R(q5Var2.getContext(), null, c6Var, new androidx.car.app.utils.a(h5Var, storyItem5, c6Var, i12));
                h5 h5Var2 = q5Var2.t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    return;
                }
                return;
            case 6:
                f8 f8Var = (f8) this.b;
                TL_stories.StoryItem storyItem6 = (TL_stories.StoryItem) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                while (i14 < f8Var.i.size()) {
                    MessageObject messageObject2 = (MessageObject) f8Var.i.get(i14);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem6.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        return;
                    }
                    i14++;
                }
                callback.run(null);
                return;
            case 7:
                x8 x8Var = (x8) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int i15 = x8Var.a;
                x8Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    x8Var.S = null;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                } else if (!(tLObject instanceof TL_stories.canSendStoryCount)) {
                    x8Var.n(tL_error);
                    return;
                } else {
                    x8Var.S = new q8(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    return;
                }
            case 8:
                f8 f8Var2 = (f8) this.b;
                e8 e8Var = (e8) this.c;
                j2 j2Var = (j2) this.d;
                ArrayList arrayList = f8Var2.i;
                while (i14 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = e8Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 == null) {
                                continue;
                            } else if (document4.id == document3.id) {
                                j2Var.run((e8) storyItem2);
                                return;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            j2Var.run((e8) storyItem2);
                            return;
                        }
                    }
                    i14++;
                }
                j2Var.run(null);
                return;
            case 9:
                f8 f8Var3 = (f8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                j8 j8Var = f8Var3.q;
                ArrayList arrayList2 = f8Var3.G;
                ArrayList arrayList3 = f8Var3.i;
                ArrayList arrayList4 = f8Var3.H;
                f8Var3.F = 0;
                f8Var3.C = false;
                f8Var3.D = true;
                f8Var3.r = true;
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
                    MessageObject messageObject4 = new MessageObject(f8Var3.c, new e8(f8Var3, f8Var3.d, botpreviewmedia));
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
                        id2 = f8Var3.I;
                        f8Var3.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem7.id = id2;
                    messageObject4.parentStoriesList = f8Var3;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    arrayList5 = arrayList8;
                }
                AndroidUtilities.cancelRunOnUIThread(j8Var);
                AndroidUtilities.runOnUIThread(j8Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 10:
                jb jbVar = (jb) this.b;
                o8 o8Var = (o8) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                sb sbVar = jbVar.d;
                sbVar.n0.D(sbVar.h, o8Var.d, arrayList9);
                return;
            case 11:
                bc bcVar = (bc) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                la laVar = bcVar.f;
                int i19 = bcVar.b;
                bc.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i19).putUsers(tL_stories_storyViews.users, false);
                    if (!bcVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        bcVar.d = 0;
                        bcVar.e = false;
                        return;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                bcVar.d = 0;
                if (bcVar.e) {
                    AndroidUtilities.cancelRunOnUIThread(laVar);
                    AndroidUtilities.runOnUIThread(laVar, 10000L);
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
                c2 c2Var = (c2) this.b;
                String str4 = (String) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                ArrayList arrayList10 = c2Var.v;
                d2 d2Var = c2Var.N;
                ArrayList arrayList11 = c2Var.s;
                if (TextUtils.equals(str4, c2Var.H)) {
                    c2Var.x = 0;
                    arrayList11.clear();
                    arrayList10.clear();
                    c2Var.y.clear();
                    c2Var.n.clear();
                    c2Var.x++;
                    arrayList11.add(null);
                    arrayList10.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList11.addAll(tL_messages_stickers.stickers);
                        c2Var.x = tL_messages_stickers.stickers.size() + c2Var.x;
                    }
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    o1.x1(d2Var.b, 0, 0);
                    d2Var.f.c(false);
                    d2Var.e.n(false);
                    return;
                }
                return;
            case 14:
                q3 q3Var = (q3) this.b;
                Object obj3 = this.c;
                String str5 = (String) this.d;
                float f7 = q3Var.K;
                if (obj3 != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj3 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        q3Var.c(photoEntry, options);
                        k8.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c10 = q3Var.c(photoEntry, options);
                        if (c10 != 0 && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = di.m0.b(c10, true);
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
                    } else if (!(obj3 instanceof k8) || (file = ((k8) obj3).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        k8.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new l0(q3Var, str5, iArr2, 15));
                return;
            case 15:
                q3 q3Var2 = (q3) this.b;
                String str6 = (String) this.c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = q3Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str6 != null) {
                    q3.f0.put(str6, bitmap);
                    HashMap hashMap = q3.e0;
                    Integer num = (Integer) hashMap.get(str6);
                    if (num != null) {
                        hashMap.put(str6, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str6, 1);
                    }
                }
                if (!TextUtils.equals(str6, q3Var2.R)) {
                    q3.d(str6);
                    return;
                }
                q3Var2.a = bitmap;
                if (iArr5 == null) {
                    paint.setShader(null);
                    q3Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    q3Var2.e = linearGradient;
                    paint.setShader(linearGradient);
                }
                q3Var2.h();
                q3Var2.invalidate();
                return;
            case 16:
                u3 u3Var = (u3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                u3Var.r = true;
                u3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(u3Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    u3Var.E();
                    return;
                }
                return;
            case 17:
                String[] strArr = (String[]) this.b;
                int[][] iArr6 = (int[][]) this.c;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.d;
                while (i14 < strArr.length) {
                    String str7 = strArr[i14];
                    if (str7 != null) {
                        AnimatedFileNative.d(str7, iArr6[i14], 0L);
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(bVar);
                return;
            case 18:
                String str8 = (String) this.b;
                int[][] iArr7 = (int[][]) this.c;
                androidx.car.app.utils.b bVar2 = (androidx.car.app.utils.b) this.d;
                AnimatedFileNative.d(str8, iArr7[0], 0L);
                AndroidUtilities.runOnUIThread(bVar2);
                return;
            case 19:
                x9 x9Var = (x9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                ea eaVar = x9Var.W;
                x9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i21 = ea.d0;
                    ArrayList i110 = eaVar.i1();
                    for (int i22 = 0; i22 < i110.size(); i22++) {
                        TLRPC.User user = (TLRPC.User) i110.get(i22);
                        if (user != null && (contains = x9Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                eaVar.g1();
                if (eaVar.Z) {
                    i11 = ((e3) eaVar).currentAccount;
                    eaVar.h1(new ca(1, i11, (ArrayList) null), new d5(eaVar, i13), false);
                    return;
                } else {
                    eaVar.g1();
                    eaVar.b.D(0);
                    return;
                }
            case 20:
                kc kcVar = (kc) this.b;
                ((k8) this.c).O0 = (File) this.d;
                bb bbVar = kcVar.d1;
                if (bbVar != null) {
                    bbVar.b.W2.N(false);
                    return;
                }
                return;
            case 21:
                kc kcVar2 = (kc) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), kcVar2.B0.getMatrix(), true);
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
                j9.y yVar = (j9.y) this.b;
                j9.e0 e0Var = (j9.e0) this.c;
                try {
                    try {
                        e0Var.o(((j9.q) this.d).apply(v7.q8.a(yVar)));
                        return;
                    } catch (Throwable th3) {
                        e0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    e0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    e0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    e0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    e0Var.n(e);
                    return;
                }
            case 23:
                j9.e0 e0Var2 = (j9.e0) this.b;
                v2 v2Var = (v2) this.c;
                t1 t1Var = (t1) this.d;
                try {
                    if (e0Var2.a instanceof j9.a) {
                        return;
                    }
                    v2Var.run();
                    e0Var2.m(t1Var);
                    return;
                } catch (Throwable th4) {
                    e0Var2.n(th4);
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
                    fi.q qVar2 = new fi.q();
                    qVar2.a = user2;
                    qVar2.b = z10;
                    arrayList13.add(qVar2);
                }
                callback2.run(arrayList13);
                return;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                u1 u1Var = (u1) this.d;
                zArr2[0] = false;
                if (tLObject7 instanceof TLRPC.TL_boolTrue) {
                    u1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 26:
                f3 f3Var = (f3) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                k3 k3Var = f3Var.d;
                if (!(tLObject8 instanceof TLRPC.TL_boolTrue)) {
                    new zc(k3Var.p0, k3Var.E).Y(tL_error2).k(true);
                    return;
                }
                b3 b3Var = k3Var.x;
                b3Var.getClass();
                b3Var.y("emoji_status_access_requested", b1.A("cancelled", "status"));
                return;
            case 27:
                f4 f4Var = (f4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                zc.a0(f4Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, fi.l.H0(connectedbotstarref.commission_permille), UserObject.getUserName(user3))), R.raw.copy).j();
                return;
            case 28:
                f4.B0((f4) this.b, (TLObject) this.c, (a2) this.d);
                return;
            default:
                ((hg.f0) this.b).b((a0.h) this.d, (ArrayList) this.c);
                return;
        }
    }
}
