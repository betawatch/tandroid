package dg;

import android.text.TextUtils;
import java.util.ArrayList;
import mh.m9;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a1(c1 c1Var, d1 d1Var, int i10, boolean z4, Runnable runnable) {
        this.a = 0;
        this.d = c1Var;
        this.e = d1Var;
        this.c = i10;
        this.b = z4;
        this.f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.d;
                d1 d1Var = (d1) this.e;
                Runnable runnable = (Runnable) this.f;
                boolean z4 = this.b;
                c1Var.d(d1Var, this.c, z4 ? c1Var.h : null);
                if (z4) {
                    c1Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f;
                boolean z10 = this.b;
                int i10 = this.c;
                if (z10) {
                    str = UserConfig.getInstance(i10).premiumTonStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkTonGiftStickers();
                        break;
                    }
                } else {
                    str = UserConfig.getInstance(i10).premiumGiftsStickerPack;
                    if (str == null) {
                        MediaDataController.getInstance(i10).checkPremiumGiftStickers();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(str);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(str);
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                if (tL_messages_stickerSet != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i11);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i11++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                                    document = tL_messages_stickerSet.documents.get(i12);
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
                    imageReceiver.setDelegate(new m9(zArr));
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, k6.a7, 0.3f);
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 160, true, null, true);
                    imageReceiver.setAutoRepeat(0);
                    imageReceiver.setImage(ImageLocation.getForDocument(document), "160_160_nr", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", svgThumb, document.size, "tgs", tL_messages_stickerSet, 1);
                    break;
                } else {
                    MediaDataController.getInstance(i10).loadStickersByEmojiOrName(str, false, tL_messages_stickerSet == null);
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.b, this.c, (q0.a) this.f);
                break;
            case 3:
                rs rsVar = (rs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f;
                ArrayList arrayList = rsVar.Q;
                int i13 = rsVar.K;
                if (this.c == rsVar.a0 && TextUtils.equals(tL_messages_searchGlobal.q, rsVar.b0)) {
                    rsVar.W = false;
                    if (!this.b) {
                        arrayList.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        MessagesStorage.getInstance(i13).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i13).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i13).putChats(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList2.get(i14);
                            i14++;
                            MessageObject messageObject = new MessageObject(i13, message, false, true);
                            messageObject.setQuery(rsVar.b0);
                            arrayList.add(messageObject);
                        }
                        rsVar.Y = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        rsVar.Z = messages_messages.next_rate;
                    }
                    rsVar.N(true);
                    break;
                }
                break;
            default:
                ts tsVar = (ts) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                ArrayList arrayList3 = tsVar.M;
                int i15 = tsVar.K;
                if (this.c == tsVar.X && TextUtils.equals(tL_messages_searchGlobal2.q, tsVar.Y)) {
                    tsVar.T = false;
                    if (!this.b) {
                        arrayList3.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        MessagesStorage.getInstance(i15).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i15).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i15).putChats(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList4 = messages_messages2.messages;
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TLRPC.Message message2 = arrayList4.get(i16);
                            i16++;
                            MessageObject messageObject2 = new MessageObject(i15, message2, false, true);
                            messageObject2.setQuery(tsVar.Y);
                            arrayList3.add(messageObject2);
                        }
                        tsVar.V = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        tsVar.W = messages_messages2.next_rate;
                    }
                    tsVar.N(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a1(MessagesController messagesController, TLRPC.Chat chat, boolean z4, int i10, q0.a aVar) {
        this.a = 2;
        this.d = messagesController;
        this.e = chat;
        this.b = z4;
        this.c = i10;
        this.f = aVar;
    }

    public /* synthetic */ a1(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = w51Var;
        this.c = i10;
        this.e = tL_messages_searchGlobal;
        this.b = z4;
        this.f = tLObject;
    }

    public /* synthetic */ a1(boolean z4, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 1;
        this.b = z4;
        this.c = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
