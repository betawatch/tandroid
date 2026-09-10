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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zs;
import xh.e7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f0(l0 l0Var, int i10, n4.a0 a0Var, k0 k0Var, boolean z10) {
        this.a = 0;
        this.d = l0Var;
        this.b = i10;
        this.e = a0Var;
        this.f = k0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.d;
                n4.a0 a0Var = (n4.a0) this.e;
                k0 k0Var = (k0) this.f;
                b0 b0Var = l0Var.g;
                if (!b0Var.j()) {
                    boolean isActive = ((n4.r) l0Var.k.b).a.isActive();
                    int i10 = this.b;
                    if (isActive) {
                        r L = l0Var.L(a0Var);
                        if (l0Var.f.A(L, i10)) {
                            na.d dVar = b0Var.e;
                            b0Var.s(L);
                            dVar.getClass();
                            try {
                                k0Var.h(L);
                            } catch (RemoteException e) {
                                e2.a.o("MediaSessionLegacyStub", "Exception in " + L, e);
                            }
                            if (this.c) {
                                new SparseBooleanArray().append(i10, true);
                                b0Var.p(L);
                                break;
                            }
                        } else if (i10 == 1 && !b0Var.t.u()) {
                            e2.a.n("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder m10 = hc.b.m(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        m10.append(a0Var.a.b);
                        e2.a.n("MediaSessionLegacyStub", m10.toString());
                        break;
                    }
                }
                break;
            case 1:
                og.v0 v0Var = (og.v0) this.d;
                og.w0 w0Var = (og.w0) this.e;
                Runnable runnable = (Runnable) this.f;
                boolean z10 = this.c;
                v0Var.d(w0Var, this.b, z10 ? v0Var.h : null);
                if (z10) {
                    v0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                ((MessagesController) this.d).lambda$startShortPoll$333((TLRPC.Chat) this.e, this.c, this.b, (q0.a) this.f);
                break;
            case 3:
                xs xsVar = (xs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject = (TLObject) this.f;
                ArrayList arrayList = xsVar.T;
                int i11 = xsVar.N;
                if (this.b == xsVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, xsVar.e0)) {
                    xsVar.Z = false;
                    if (!this.c) {
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
                            messageObject.setQuery(xsVar.e0);
                            arrayList.add(messageObject);
                        }
                        xsVar.b0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList.size(), messages_messages.count);
                        xsVar.c0 = messages_messages.next_rate;
                    }
                    xsVar.N(true);
                    break;
                }
                break;
            case 4:
                zs zsVar = (zs) this.d;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                ArrayList arrayList3 = zsVar.P;
                int i13 = zsVar.N;
                if (this.b == zsVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, zsVar.b0)) {
                    zsVar.W = false;
                    if (!this.c) {
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
                            messageObject2.setQuery(zsVar.b0);
                            arrayList3.add(messageObject2);
                        }
                        zsVar.Y = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList3.size(), messages_messages2.count);
                        zsVar.Z = messages_messages2.next_rate;
                    }
                    zsVar.N(true);
                    break;
                }
                break;
            default:
                String str2 = (String) this.d;
                ImageReceiver imageReceiver = (ImageReceiver) this.e;
                boolean[] zArr = (boolean[]) this.f;
                boolean z11 = this.c;
                int i15 = this.b;
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
                    imageReceiver.setDelegate(new e7(zArr));
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

    public /* synthetic */ f0(og.v0 v0Var, og.w0 w0Var, int i10, boolean z10, Runnable runnable) {
        this.a = 1;
        this.d = v0Var;
        this.e = w0Var;
        this.b = i10;
        this.c = z10;
        this.f = runnable;
    }

    public /* synthetic */ f0(MessagesController messagesController, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 2;
        this.d = messagesController;
        this.e = chat;
        this.c = z10;
        this.b = i10;
        this.f = aVar;
    }

    public /* synthetic */ f0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = j61Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
        this.f = tLObject;
    }

    public /* synthetic */ f0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 5;
        this.c = z10;
        this.b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
