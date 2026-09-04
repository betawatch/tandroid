package m4;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.v51;
import zh.a7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e0(k0 k0Var, int i10, n4.a0 a0Var, j0 j0Var, boolean z10) {
        this.a = 0;
        this.d = k0Var;
        this.c = i10;
        this.e = a0Var;
        this.f = j0Var;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.d;
                n4.a0 a0Var = (n4.a0) this.e;
                j0 j0Var = (j0) this.f;
                a0 a0Var2 = k0Var.g;
                if (!a0Var2.j()) {
                    boolean isActive = ((n4.r) k0Var.k.b).a.isActive();
                    int i10 = this.c;
                    if (isActive) {
                        r L = k0Var.L(a0Var);
                        if (k0Var.f.C(L, i10)) {
                            ob.a aVar = a0Var2.e;
                            a0Var2.s(L);
                            aVar.getClass();
                            try {
                                j0Var.f(L);
                            } catch (RemoteException e7) {
                                e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e7);
                            }
                            if (this.b) {
                                new SparseBooleanArray().append(i10, true);
                                a0Var2.p(L);
                                break;
                            }
                        } else if (i10 == 1 && !a0Var2.t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder l4 = i2.g.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(a0Var.a.b);
                        e2.a.n("MediaSessionLegacyStub", l4.toString());
                        break;
                    }
                }
                break;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.b, this.c, (q0.a) this.f);
                break;
            case 2:
                qs qsVar = (qs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f;
                ArrayList arrayList = qsVar.T;
                int i11 = qsVar.N;
                if (this.c == qsVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, qsVar.e0)) {
                    qsVar.Z = false;
                    if (!this.b) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i11).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            TLRPC.Message message = arrayList2.get(i12);
                            i12++;
                            MessageObject messageObject = new MessageObject(i11, message, false, true);
                            messageObject.setQuery(qsVar.e0);
                            arrayList.add(messageObject);
                        }
                        qsVar.b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        qsVar.c0 = messages_messages.next_rate;
                    }
                    qsVar.N(true);
                    break;
                }
                break;
            case 3:
                ss ssVar = (ss) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                ArrayList arrayList3 = ssVar.P;
                int i13 = ssVar.N;
                if (this.c == ssVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, ssVar.b0)) {
                    ssVar.W = false;
                    if (!this.b) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i13).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i13).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i13).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i14);
                            i14++;
                            MessageObject messageObject2 = new MessageObject(i13, message2, false, true);
                            messageObject2.setQuery(ssVar.b0);
                            arrayList3.add(messageObject2);
                        }
                        ssVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        ssVar.Z = messages_messages2.next_rate;
                    }
                    ssVar.N(true);
                    break;
                }
                break;
            case 4:
                qg.q0 q0Var = (qg.q0) this.d;
                qg.r0 r0Var = (qg.r0) this.e;
                Runnable runnable = (Runnable) this.f;
                boolean z10 = this.b;
                q0Var.d(r0Var, this.c, z10 ? q0Var.h : null);
                if (z10) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f;
                boolean z11 = this.b;
                int i15 = this.c;
                if (z11) {
                    str = UserConfig.getInstance(i15).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i15).checkTonGiftStickers();
                        break;
                    }
                } else {
                    str = UserConfig.getInstance(i15).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i15).checkPremiumGiftStickers();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i15).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i15).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i16);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i16++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                    document = tL_messages_stickerSet.documents.get(i17);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !tL_messages_stickerSet.documents.isEmpty()) {
                        document = tL_messages_stickerSet.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.setAllowStartLottieAnimation(true);
                    imageReceiver.setDelegate(new a7(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, j6.a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    break;
                } else {
                    MediaDataController.getInstance(i15).loadStickersByEmojiOrName(str, false, tL_messages_stickerSet == null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 1;
        this.d = messagesController;
        this.e = chat;
        this.b = z10;
        this.c = i10;
        this.f = aVar;
    }

    public /* synthetic */ e0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = v51Var;
        this.c = i10;
        this.e = tL_messages_searchGlobal;
        this.b = z10;
        this.f = tLObject;
    }

    public /* synthetic */ e0(qg.q0 q0Var, qg.r0 r0Var, int i10, boolean z10, Runnable runnable) {
        this.a = 4;
        this.d = q0Var;
        this.e = r0Var;
        this.c = i10;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ e0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 5;
        this.b = z10;
        this.c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
