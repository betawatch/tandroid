package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.ru;
import org.telegram.ui.su;
import org.telegram.ui.uu;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eb(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        yj0 yj0Var;
        int i10 = this.a;
        char c10 = 1;
        Object obj = this.f;
        boolean z10 = this.c;
        int i11 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z10) {
                    str = UserConfig.getInstance(i11).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkTonGiftStickers();
                        break;
                    }
                } else {
                    str = UserConfig.getInstance(i11).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i11).checkPremiumGiftStickers();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i11).getStickerSetByEmojiOrName(str);
                }
                if (stickerSetByName != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < stickerSetByName.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = stickerSetByName.packs.get(i12);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i12++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i13 = 0; i13 < stickerSetByName.documents.size(); i13++) {
                                    document = stickerSetByName.documents.get(i13);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new oc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", stickerSetByName, 1);
                    break;
                } else {
                    MediaDataController.getInstance(i11).loadStickersByEmojiOrName(str, false, stickerSetByName == null);
                    break;
                }
                break;
            case 1:
                m4.p0 p0Var = (m4.p0) obj3;
                n4.t tVar = (n4.t) obj2;
                m4.o0 o0Var = (m4.o0) obj;
                m4.f0 f0Var = p0Var.g;
                if (!f0Var.j()) {
                    if (((n4.n) p0Var.m.b).a.isActive()) {
                        m4.v L = p0Var.L(tVar);
                        if (p0Var.f.x(L, i11)) {
                            pb.a aVar = f0Var.e;
                            f0Var.s(L);
                            aVar.getClass();
                            try {
                                o0Var.f(L);
                            } catch (RemoteException e) {
                                e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                            }
                            if (z10) {
                                new SparseBooleanArray().append(i11, true);
                                f0Var.p(L);
                                break;
                            }
                        } else if (i11 == 1 && !f0Var.t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder n10 = i2.o1.n(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        n10.append(tVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", n10.toString());
                        break;
                    }
                }
                break;
            case 2:
                ((MessagesController) obj3).lambda$startShortPoll$332((TLRPC.Chat) obj2, z10, i11, (q0.a) obj);
                break;
            case 3:
                at atVar = (at) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = atVar.V;
                int i14 = atVar.P;
                if (i11 == atVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, atVar.g0)) {
                    atVar.b0 = false;
                    if (!z10) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i14).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i14).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i14).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size) {
                            TLRPC.Message message = arrayList2.get(i15);
                            i15++;
                            MessageObject messageObject = new MessageObject(i14, message, false, true);
                            messageObject.setQuery(atVar.g0);
                            arrayList.add(messageObject);
                        }
                        atVar.d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        atVar.e0 = messages_messages.next_rate;
                    }
                    atVar.N(true);
                    break;
                }
                break;
            case 4:
                ct ctVar = (ct) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = ctVar.R;
                int i16 = ctVar.P;
                if (i11 == ctVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, ctVar.d0)) {
                    ctVar.Y = false;
                    if (!z10) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i16).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i16).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i16).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i17);
                            i17++;
                            MessageObject messageObject2 = new MessageObject(i16, message2, false, true);
                            messageObject2.setQuery(ctVar.d0);
                            arrayList3.add(messageObject2);
                        }
                        ctVar.a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        ctVar.b0 = messages_messages2.next_rate;
                    }
                    ctVar.N(true);
                    break;
                }
                break;
            case 5:
                su suVar = (su) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                uu uuVar = suVar.c;
                uuVar.a();
                org.telegram.ui.Cells.r8 r8Var = uuVar.e;
                uuVar.c();
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false);
                yj0 yj0Var2 = uuVar.d;
                yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = uuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        uuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = uuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = uuVar.n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    uuVar.h = ofFloat;
                    float f7 = z10 ? 50.0f : 200.0f;
                    yj0Var = yj0Var2;
                    ofFloat.addUpdateListener(new ru(suVar, f7, i18, x03, activity));
                    uuVar.h.addListener(new org.telegram.ui.v0(activity, x03, c10 == true ? 1 : 0));
                    uuVar.h.setDuration(350L);
                    uuVar.h.start();
                } else {
                    yj0Var = yj0Var2;
                }
                if (org.telegram.ui.ActionBar.k6.i1()) {
                    r8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                    r8Var.w += 2;
                } else {
                    r8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                    r8Var.w += 2;
                }
                org.telegram.ui.ActionBar.k6.J1(o2Var);
                break;
            default:
                qg.s0 s0Var = (qg.s0) obj3;
                Runnable runnable = (Runnable) obj;
                s0Var.d((qg.t0) obj2, i11, z10 ? s0Var.h : null);
                if (z10) {
                    s0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ eb(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.a = 1;
        this.d = p0Var;
        this.b = i10;
        this.e = tVar;
        this.f = o0Var;
        this.c = z10;
    }

    public /* synthetic */ eb(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 2;
        this.d = messagesController;
        this.e = chat;
        this.c = z10;
        this.b = i10;
        this.f = aVar;
    }

    public /* synthetic */ eb(b71 b71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = b71Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
        this.f = tLObject;
    }

    public /* synthetic */ eb(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 0;
        this.c = z10;
        this.b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
