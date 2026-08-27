package j3;

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
import h3.q2;
import h7.z5;
import hh.y9;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import jh.a6;
import jh.b6;
import jh.c4;
import jh.e4;
import jh.g3;
import jh.g6;
import jh.h3;
import jh.i3;
import jh.i9;
import jh.j6;
import jh.l2;
import jh.l6;
import jh.r9;
import jh.s6;
import jh.u3;
import jh.x3;
import jh.x6;
import jh.z8;
import lh.k9;
import lh.ka;
import lh.l3;
import lh.o1;
import lh.o3;
import lh.o9;
import lh.q9;
import lh.sb;
import lh.y1;
import lh.z1;
import lh.z7;
import nh.b3;
import nh.q1;
import nh.s3;
import nh.t2;
import nh.w2;
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
import org.telegram.messenger.h2;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.y4;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    /* JADX WARN: Type inference failed for: r10v0, types: [j4.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v40, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r2v42, types: [android.graphics.Bitmap] */
    @Override // java.lang.Runnable
    public final void run() {
        ig.d dVar;
        TLRPC.TL_availableReaction tL_availableReaction;
        TLRPC.TL_availableReaction tL_availableReaction2;
        k5 k5Var;
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
        int[] iArr2 = null;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.d;
        ?? r10 = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                o oVar = ((n) obj2).b;
                int i15 = d5.g0.a;
                oVar.getClass();
                i3.f fVar = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1009, new q2(k10, (h3.t0) r10, (k3.l) obj, 11));
                break;
            case 1:
                j4.g0 g0Var = (j4.g0) obj2;
                r10.b(g0Var.a, g0Var.b, (j4.x) obj);
                break;
            case 2:
                i3 i3Var = (i3) obj2;
                ig.q0 q0Var = (ig.q0) r10;
                View view = (View) obj;
                e4 e4Var = i3Var.a;
                e4Var.q3 = true;
                c4 c4Var = e4Var.K1;
                ImageReceiver imageReceiver = e4Var.h3;
                boolean[] zArr = {false};
                x6 x6Var = e4Var.A0;
                x6Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new l2(i13, x6Var)).setDuration(150L).start();
                int dp = AndroidUtilities.dp(8.0f);
                x6 x6Var2 = new x6(e4Var.getContext(), e4Var.t1);
                e4Var.A0 = x6Var2;
                x6Var2.setPadding(dp, dp, dp, dp);
                e4Var.z0.addView(e4Var.A0, z5.e(40, 40, 3));
                k5 k5Var2 = e4Var.k3;
                if (k5Var2 != null) {
                    k5Var2.o(e4Var);
                    dVar = null;
                    e4Var.k3 = null;
                } else {
                    dVar = null;
                }
                ig.d dVar2 = e4Var.i3;
                if (dVar2 != null) {
                    dVar2.d(e4Var);
                    e4Var.i3 = dVar;
                }
                e4Var.l3 = false;
                if (q0Var.g != 0) {
                    e4Var.l3 = true;
                    k5 k5Var3 = new k5(2, e4Var.y2, q0Var.g);
                    e4Var.k3 = k5Var3;
                    k5Var3.a(e4Var);
                } else if (q0Var.f != null && (tL_availableReaction = MediaDataController.getInstance(e4Var.y2).getReactionsMap().get(q0Var.f)) != null) {
                    e4Var.j3.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ig.m0.a(), null, null, null, 0);
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().L(0, false, true);
                    }
                }
                e4Var.A0.setReaction(q0Var);
                if (e4Var.z1) {
                    TL_stories.StoryItem storyItem3 = c4Var.a;
                    if (storyItem3.sent_reaction == null) {
                        if (storyItem3.views == null) {
                            storyItem3.views = new TL_stories.TL_storyViews();
                        }
                        TL_stories.StoryItem storyItem4 = c4Var.a;
                        TL_stories.StoryViews storyViews = storyItem4.views;
                        storyViews.reactions_count++;
                        ig.s0.b(null, storyItem4.sent_reaction, storyViews);
                        e4Var.k1(true);
                    }
                }
                if (q0Var.g != 0 && (k5Var = e4Var.A0.f) != null) {
                    ig.d a2 = ig.d.a(k5Var, false, true);
                    e4Var.i3 = a2;
                    a2.f(e4Var);
                }
                e4Var.O1.g0(e4Var.x1, c4Var.a, q0Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                int[] iArr4 = new int[2];
                e4Var.getLocationInWindow(iArr4);
                e4Var.s3 = iArr3[0] - iArr4[0];
                e4Var.t3 = iArr3[1] - iArr4[1];
                e4Var.u3 = view.getMeasuredHeight();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e4Var.r3 = 0.0f;
                e4Var.invalidate();
                x6 x6Var3 = e4Var.A0;
                x6Var3.setAllowDrawReaction(false);
                ImageReceiver imageReceiver2 = x6Var3.e;
                if (q0Var.g == 0 && (tL_availableReaction2 = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f)) != null) {
                    imageReceiver2.setImage(ImageLocation.getForDocument(tL_availableReaction2.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction2, 1);
                    imageReceiver2.setAutoRepeat(0);
                }
                ofFloat.addUpdateListener(new g3(i3Var, ofFloat, zArr, i14));
                ofFloat.addListener(new h3(i3Var, zArr, x6Var3, i14));
                ofFloat.setDuration(220L);
                ofFloat.start();
                e4Var.b1(false);
                break;
            case 3:
                x3 x3Var = (x3) obj2;
                c6 c6Var = (c6) r10;
                e4 e4Var2 = x3Var.l;
                y4.S(e4Var2.getContext(), null, c6Var, new ag.l0(x3Var, (TL_stories.StoryItem) obj, c6Var, 9));
                x3 x3Var2 = e4Var2.p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                    break;
                }
                break;
            case 4:
                b6 b6Var = (b6) obj2;
                TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) r10;
                Utilities.Callback callback = (Utilities.Callback) obj;
                while (i14 < b6Var.i.size()) {
                    MessageObject messageObject2 = (MessageObject) b6Var.i.get(i14);
                    if (messageObject2 != null && (storyItem = messageObject2.storyItem) != null && (messageMedia = storyItem.media) != null && (document = storyItem5.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                        callback.run(document2);
                        break;
                    } else {
                        i14++;
                    }
                }
                callback.run(null);
                break;
            case 5:
                s6 s6Var = (s6) obj2;
                TLObject tLObject = (TLObject) r10;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i16 = s6Var.a;
                s6Var.R = true;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    s6Var.S = null;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else if (tLObject instanceof TL_stories.canSendStoryCount) {
                    s6Var.S = new l6(1, ((TL_stories.canSendStoryCount) tLObject).count_remains, -1L);
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
                    break;
                } else {
                    s6Var.n(tL_error);
                    break;
                }
            case 6:
                a6 a6Var = (a6) r10;
                h2 h2Var = (h2) obj;
                ArrayList arrayList = ((b6) obj2).i;
                while (i14 < arrayList.size()) {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                    if (messageObject3 != null && (storyItem2 = messageObject3.storyItem) != null && (messageMedia2 = storyItem2.media) != null) {
                        TLRPC.MessageMedia messageMedia3 = a6Var.media;
                        TLRPC.Document document3 = messageMedia3.document;
                        if (document3 != null) {
                            TLRPC.Document document4 = messageMedia2.document;
                            if (document4 != null) {
                                if (document4.id == document3.id) {
                                    h2Var.run((a6) storyItem2);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        TLRPC.Photo photo2 = messageMedia3.photo;
                        if (photo2 != null && (photo = messageMedia2.photo) != null && photo.id == photo2.id) {
                            h2Var.run((a6) storyItem2);
                            break;
                        }
                    }
                    i14++;
                }
                h2Var.run(null);
                break;
            case 7:
                b6 b6Var2 = (b6) obj2;
                TLObject tLObject2 = (TLObject) r10;
                Runnable runnable = (Runnable) obj;
                g6 g6Var = b6Var2.q;
                ArrayList arrayList2 = b6Var2.G;
                ArrayList arrayList3 = b6Var2.i;
                ArrayList arrayList4 = b6Var2.H;
                b6Var2.F = 0;
                b6Var2.C = false;
                b6Var2.D = true;
                b6Var2.r = true;
                ArrayList arrayList5 = new ArrayList();
                if (tLObject2 instanceof Vector) {
                    ArrayList arrayList6 = ((Vector) tLObject2).objects;
                    int size = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj3 = arrayList6.get(i17);
                        i17++;
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
                int i18 = 0;
                while (i18 < size2) {
                    Object obj4 = arrayList5.get(i18);
                    i18++;
                    TL_bots.botPreviewMedia botpreviewmedia = (TL_bots.botPreviewMedia) obj4;
                    int i19 = size2;
                    MessageObject messageObject4 = new MessageObject(b6Var2.c, new a6(b6Var2, b6Var2.d, botpreviewmedia));
                    int i20 = 0;
                    while (true) {
                        if (i20 >= arrayList7.size()) {
                            messageObject = null;
                        } else if (MessagesController.equals(((MessageObject) arrayList7.get(i20)).storyItem.media, botpreviewmedia.media)) {
                            messageObject = (MessageObject) arrayList7.get(i20);
                        } else {
                            i20++;
                        }
                    }
                    TL_stories.StoryItem storyItem6 = messageObject4.storyItem;
                    TLRPC.Message message = messageObject4.messageOwner;
                    if (messageObject == null) {
                        id2 = b6Var2.I;
                        b6Var2.I = id2 + 1;
                    } else {
                        id2 = messageObject.getId();
                    }
                    message.id = id2;
                    storyItem6.id = id2;
                    messageObject4.parentStoriesList = b6Var2;
                    messageObject4.generateThumbs(false);
                    if (arrayList4.isEmpty()) {
                        arrayList4.add(new ArrayList());
                    }
                    ((ArrayList) arrayList4.get(0)).add(Integer.valueOf(messageObject4.getId()));
                    arrayList3.add(messageObject4);
                    size2 = i19;
                }
                AndroidUtilities.cancelRunOnUIThread(g6Var);
                AndroidUtilities.runOnUIThread(g6Var);
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    break;
                }
                break;
            case 8:
                i9 i9Var = ((z8) obj2).d;
                i9Var.j0.D(i9Var.h, ((j6) r10).d, (ArrayList) obj);
                break;
            case 9:
                r9 r9Var = (r9) obj2;
                TLObject tLObject3 = (TLObject) r10;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) obj;
                y9 y9Var = r9Var.f;
                int i21 = r9Var.b;
                r9.g = System.currentTimeMillis();
                if (tLObject3 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject3;
                    MessagesController.getInstance(i21).putUsers(tL_stories_storyViews.users, false);
                    if (!r9Var.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        r9Var.d = 0;
                        r9Var.e = false;
                        break;
                    } else {
                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    }
                }
                r9Var.d = 0;
                if (r9Var.e) {
                    AndroidUtilities.cancelRunOnUIThread(y9Var);
                    AndroidUtilities.runOnUIThread(y9Var, 10000L);
                    break;
                }
                break;
            case 10:
                y1 y1Var = (y1) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList8 = y1Var.v;
                z1 z1Var = y1Var.J;
                ArrayList arrayList9 = y1Var.s;
                if (TextUtils.equals((String) r10, y1Var.D)) {
                    y1Var.x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    y1Var.y.clear();
                    y1Var.n.clear();
                    y1Var.x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (tLObject4 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject4;
                        arrayList9.addAll(tL_messages_stickers.stickers);
                        y1Var.x = tL_messages_stickers.stickers.size() + y1Var.x;
                    }
                    y1Var.E = y1Var.D;
                    y1Var.l();
                    o1.w1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    break;
                }
                break;
            case 11:
                l3 l3Var = (l3) obj2;
                String str = (String) obj;
                float f10 = l3Var.G;
                if (r10 != 0) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (r10 instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) r10;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        l3Var.c(photoEntry, options);
                        z7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c10 = l3Var.c(photoEntry, options);
                        if (c10 != 0 && c10.getHeight() / c10.getWidth() < f10) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = lh.n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i22 = photoEntry.gradientTopColor;
                                if (i22 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i22, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if (!(r10 instanceof z7) || (file = ((z7) r10).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        z7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new m(l3Var, str, iArr2, 12));
                break;
            case 12:
                l3 l3Var2 = (l3) obj2;
                String str2 = (String) r10;
                Pair pair = (Pair) obj;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr5 = (int[]) pair.second;
                Paint paint = l3Var2.d;
                if (bitmap != null) {
                    if (str2 != null) {
                        l3.b0.put(str2, bitmap);
                        HashMap hashMap = l3.a0;
                        Integer num = (Integer) hashMap.get(str2);
                        if (num != null) {
                            hashMap.put(str2, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str2, 1);
                        }
                    }
                    if (TextUtils.equals(str2, l3Var2.N)) {
                        l3Var2.a = bitmap;
                        if (iArr5 == null) {
                            paint.setShader(null);
                            l3Var2.e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr5, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            l3Var2.e = linearGradient;
                            paint.setShader(linearGradient);
                        }
                        l3Var2.h();
                        l3Var2.invalidate();
                        break;
                    } else {
                        l3.d(str2);
                        break;
                    }
                }
                break;
            case 13:
                o3 o3Var = (o3) obj2;
                TLObject tLObject5 = (TLObject) r10;
                MessagesController messagesController = (MessagesController) obj;
                o3Var.r = true;
                o3Var.d = false;
                if (tLObject5 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject5;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(o3Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    o3Var.E();
                    break;
                }
                break;
            case 14:
                String[] strArr = (String[]) obj2;
                int[][] iArr6 = (int[][]) r10;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) obj;
                while (i14 < strArr.length) {
                    String str3 = strArr[i14];
                    if (str3 != null) {
                        AnimatedFileNative.d(str3, iArr6[i14], 0L);
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(bVar);
                break;
            case 15:
                AnimatedFileNative.d((String) obj2, ((int[][]) r10)[0], 0L);
                AndroidUtilities.runOnUIThread((androidx.car.app.utils.b) obj);
                break;
            case 16:
                k9 k9Var = (k9) obj2;
                TLObject tLObject6 = (TLObject) r10;
                MessagesController messagesController2 = (MessagesController) obj;
                q9 q9Var = k9Var.S;
                k9Var.v.setLoading(false);
                if (tLObject6 != null) {
                    int i23 = q9.Z;
                    ArrayList h12 = q9Var.h1();
                    for (int i24 = 0; i24 < h12.size(); i24++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i24);
                        if (user != null && (contains = k9Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                q9Var.f1();
                if (q9Var.V) {
                    i11 = ((e3) q9Var).currentAccount;
                    q9Var.g1(new o9(1, i11, (ArrayList) null), new u3(q9Var, i13), false);
                    break;
                } else {
                    q9Var.f1();
                    q9Var.b.D(0);
                    break;
                }
                break;
            case 17:
                ((z7) r10).O0 = (File) obj;
                ka kaVar = ((sb) obj2).Z0;
                if (kaVar != null) {
                    kaVar.b.U2.N(false);
                    break;
                }
                break;
            case 18:
                sb sbVar = (sb) obj2;
                Bitmap bitmap2 = (Bitmap) r10;
                Runnable runnable2 = (Runnable) obj;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), sbVar.x0.getMatrix(), true);
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
                ArrayList arrayList10 = (ArrayList) obj2;
                HashMap hashMap2 = (HashMap) r10;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                ArrayList arrayList11 = new ArrayList();
                for (int i25 = 0; i25 < arrayList10.size(); i25++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList10.get(i25);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    nh.p pVar = new nh.p();
                    pVar.a = user2;
                    pVar.b = z10;
                    arrayList11.add(pVar);
                }
                callback2.run(arrayList11);
                break;
            case 20:
                q1 q1Var = (q1) obj;
                ((boolean[]) obj2)[0] = false;
                if (((TLObject) r10) instanceof TLRPC.TL_boolTrue) {
                    q1Var.run(Boolean.TRUE);
                    break;
                }
                break;
            case 21:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                b3 b3Var = ((w2) obj2).d;
                if (((TLObject) r10) instanceof TLRPC.TL_boolTrue) {
                    t2 t2Var = b3Var.x;
                    t2Var.getClass();
                    t2Var.v("emoji_status_access_requested", z0.x("cancelled", "status"));
                    break;
                } else {
                    new mc(b3Var.l0, b3Var.A).Y(tL_error2).k(true);
                    break;
                }
            case 22:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) r10;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                mc.a0((s3) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, nh.k.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                break;
            case 23:
                s3.A0((s3) obj2, (TLObject) r10, (b2) obj);
                break;
            case 24:
                ((VideoAds) obj2).lambda$show$3((ec) r10, (TLRPC.TL_sponsoredMessage) obj);
                break;
            case 25:
                ((VideoAds) obj2).lambda$show$5((ec) r10, (boolean[]) obj);
                break;
            case 26:
                ((VideoPlayerHolderBase) obj2).lambda$release$3((TLRPC.Document) r10, (Runnable) obj);
                break;
            case 27:
                ((Utilities.Callback2) obj2).run((TLObject) r10, (TLRPC.TL_error) obj);
                break;
            case 28:
                ((Utilities.Callback2) obj2).run((TLRPC.Updates) r10, (TLRPC.TL_error) obj);
                break;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                n2 n2Var = (n2) r10;
                n2 n2Var2 = (n2) obj;
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
                actionBarLayout.m(n2Var);
                n2Var.setRemovingFromStack(false);
                n2Var.onTransitionAnimationEnd(false, true);
                n2Var2.onTransitionAnimationEnd(true, true);
                n2Var2.onBecomeFullyVisible();
                break;
        }
    }
}
