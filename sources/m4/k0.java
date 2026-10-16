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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import zh.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k0(p0 p0Var, int i10, n4.t tVar, o0 o0Var, boolean z10) {
        this.a = 0;
        this.d = p0Var;
        this.c = i10;
        this.e = tVar;
        this.f = o0Var;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.d;
                n4.t tVar = (n4.t) this.e;
                o0 o0Var = (o0) this.f;
                e0 e0Var = p0Var.g;
                if (!e0Var.j()) {
                    boolean isActive = ((n4.n) p0Var.m.b).a.isActive();
                    int i10 = this.c;
                    if (isActive) {
                        v L = p0Var.L(tVar);
                        if (p0Var.f.u(L, i10)) {
                            pb.a aVar = e0Var.e;
                            e0Var.s(L);
                            aVar.getClass();
                            try {
                                o0Var.e(L);
                            } catch (RemoteException e) {
                                e2.a.m("MediaSessionLegacyStub", "Exception in " + L, e);
                            }
                            if (this.b) {
                                new SparseBooleanArray().append(i10, true);
                                e0Var.p(L);
                                break;
                            }
                        } else if (i10 == 1 && !e0Var.t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder l4 = i2.d.l(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(tVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        break;
                    }
                }
                break;
            case 1:
                ((MessagesController) this.d).lambda$startShortPoll$332((TLRPC.Chat) this.e, this.b, this.c, (q0.a) this.f);
                break;
            case 2:
                et etVar = (et) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f;
                ArrayList arrayList = etVar.T;
                int i11 = etVar.N;
                if (this.c == etVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, etVar.e0)) {
                    etVar.Z = false;
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
                            messageObject.setQuery(etVar.e0);
                            arrayList.add(messageObject);
                        }
                        etVar.b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        etVar.c0 = messages_messages.next_rate;
                    }
                    etVar.N(true);
                    break;
                }
                break;
            case 3:
                gt gtVar = (gt) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                ArrayList arrayList3 = gtVar.P;
                int i13 = gtVar.N;
                if (this.c == gtVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, gtVar.b0)) {
                    gtVar.W = false;
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
                            messageObject2.setQuery(gtVar.b0);
                            arrayList3.add(messageObject2);
                        }
                        gtVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        gtVar.Z = messages_messages2.next_rate;
                    }
                    gtVar.N(true);
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
                    imageReceiver.setDelegate(new u6(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.a7, 0.3f);
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

    public /* synthetic */ k0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 1;
        this.d = messagesController;
        this.e = chat;
        this.b = z10;
        this.c = i10;
        this.f = aVar;
    }

    public /* synthetic */ k0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = a71Var;
        this.c = i10;
        this.e = tL_messages_searchGlobal;
        this.b = z10;
        this.f = tLObject;
    }

    public /* synthetic */ k0(qg.q0 q0Var, qg.r0 r0Var, int i10, boolean z10, Runnable runnable) {
        this.a = 4;
        this.d = q0Var;
        this.e = r0Var;
        this.c = i10;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ k0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 5;
        this.b = z10;
        this.c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
