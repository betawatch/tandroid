package bi;

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
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.qu;
import org.telegram.ui.ru;
import org.telegram.ui.tu;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ db(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
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
                    imageReceiver.setDelegate(new hc(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.a7, 0.3f);
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
                        m4.w L = p0Var.L(tVar);
                        if (p0Var.f.v(L, i11)) {
                            qb.a aVar = f0Var.e;
                            f0Var.s(L);
                            aVar.getClass();
                            try {
                                o0Var.i(L);
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
                        StringBuilder k10 = ic.a.k(i11, "Ignore incoming player command before initialization. command=", ", pid=");
                        k10.append(tVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", k10.toString());
                        break;
                    }
                }
                break;
            case 2:
                ((MessagesController) obj3).lambda$startShortPoll$334((TLRPC.Chat) obj2, z10, i11, (q0.a) obj);
                break;
            case 3:
                ct ctVar = (ct) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = ctVar.V;
                int i14 = ctVar.P;
                if (i11 == ctVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, ctVar.g0)) {
                    ctVar.b0 = false;
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
                            messageObject.setQuery(ctVar.g0);
                            arrayList.add(messageObject);
                        }
                        ctVar.d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        ctVar.e0 = messages_messages.next_rate;
                    }
                    ctVar.O(true);
                    break;
                }
                break;
            case 4:
                et etVar = (et) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = etVar.R;
                int i16 = etVar.P;
                if (i11 == etVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, etVar.d0)) {
                    etVar.Y = false;
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
                            messageObject2.setQuery(etVar.d0);
                            arrayList3.add(messageObject2);
                        }
                        etVar.a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        etVar.b0 = messages_messages2.next_rate;
                    }
                    etVar.O(true);
                    break;
                }
                break;
            case 5:
                ru ruVar = (ru) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                tu tuVar = ruVar.c;
                tuVar.a();
                org.telegram.ui.Cells.v8 v8Var = tuVar.e;
                tuVar.c();
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false);
                yj0 yj0Var2 = tuVar.d;
                yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = tuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        tuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = tuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i11 = tuVar.n;
                    }
                    int i18 = i11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    tuVar.h = ofFloat;
                    float f7 = z10 ? 50.0f : 200.0f;
                    yj0Var = yj0Var2;
                    ofFloat.addUpdateListener(new qu(ruVar, f7, i18, x03, activity));
                    tuVar.h.addListener(new org.telegram.ui.t0(activity, x03, c10 == true ? 1 : 0));
                    tuVar.h.setDuration(350L);
                    tuVar.h.start();
                } else {
                    yj0Var = yj0Var2;
                }
                if (org.telegram.ui.ActionBar.y6.i1()) {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                    v8Var.w += 2;
                } else {
                    v8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                    v8Var.w += 2;
                }
                org.telegram.ui.ActionBar.y6.J1(r2Var);
                break;
            default:
                rg.q0 q0Var = (rg.q0) obj3;
                Runnable runnable = (Runnable) obj;
                q0Var.d((rg.r0) obj2, i11, z10 ? q0Var.h : null);
                if (z10) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ db(m4.p0 p0Var, int i10, n4.t tVar, m4.o0 o0Var, boolean z10) {
        this.a = 1;
        this.d = p0Var;
        this.b = i10;
        this.e = tVar;
        this.f = o0Var;
        this.c = z10;
    }

    public /* synthetic */ db(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 2;
        this.d = messagesController;
        this.e = chat;
        this.c = z10;
        this.b = i10;
        this.f = aVar;
    }

    public /* synthetic */ db(k71 k71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = k71Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
        this.f = tLObject;
    }

    public /* synthetic */ db(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 0;
        this.c = z10;
        this.b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
