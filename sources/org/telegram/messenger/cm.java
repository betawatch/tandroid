package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.qn0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ cm(hp hpVar, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = hpVar;
        this.d = j10;
        this.c = str;
        this.e = runnable;
        this.g = d2Var;
        this.h = tL_channels_updateUsername;
        this.f = runnable2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hp hpVar;
        TLRPC.Photo photo;
        hp hpVar2;
        String str;
        switch (this.a) {
            case 0:
                hp hpVar3 = (hp) this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.t4.e0(h10.t0, tL_error, d2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    break;
                } else {
                    g0.h3(new zl(hpVar3, this.d, this.c, runnable, 6));
                    break;
                }
            case 1:
                hp hpVar4 = (hp) this.b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                TLRPC.Update update = updates.updates.get(i3);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i3++;
                                } else {
                                    if (update instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.MessageAction messageAction2 = ((TL_update.TL_updateNewMessage) update).message.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                            photo = messageAction2.photo;
                                            if (photo instanceof TLRPC.TL_photo) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                    i3++;
                                }
                                hpVar.O3(updates, z10);
                                g0.h3(new yh(15, hpVar, runnable3));
                                break;
                            } else {
                                photo = null;
                            }
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = w7.w(photo.sizes, hs.g2, false, null, false);
                            TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                            if (w10 == null || fileLocation == null) {
                                hpVar2 = hpVar4;
                            } else {
                                hpVar4.getFileLoader().getClass();
                                File K = w7.K(w10, null, true, true);
                                hpVar4.getFileLoader().getClass();
                                w7.K(fileLocation, null, true, true).renameTo(K);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String o10 = a1.g.o(fileLocation.local_id, "@50_50", sb2);
                                StringBuilder sb3 = new StringBuilder();
                                hpVar2 = hpVar4;
                                sb3.append(w10.location.volume_id);
                                sb3.append("_");
                                zb.D().R(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), ac.i(w10, photo), true);
                            }
                            TLRPC.PhotoSize w11 = w7.w(photo.sizes, 800, false, null, false);
                            if (w11 != null && fileLocation2 != null) {
                                hpVar2.getFileLoader().getClass();
                                File K2 = w7.K(w11, null, true, true);
                                hpVar2.getFileLoader().getClass();
                                w7.K(fileLocation2, null, true, true).renameTo(K2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                hpVar2.getFileLoader().getClass();
                                new File(str).renameTo(w7.K(videoSize, "mp4", true, true));
                            }
                            hpVar = hpVar2;
                            hpVar.U0(-this.d);
                            z10 = false;
                            hpVar.O3(updates, z10);
                            g0.h3(new yh(15, hpVar, runnable3));
                        }
                    }
                    hpVar = hpVar4;
                    hpVar.O3(updates, z10);
                    g0.h3(new yh(15, hpVar, runnable3));
                }
                break;
            default:
                final x00 x00Var = (x00) this.b;
                final zi ziVar = (zi) this.e;
                final e3.s sVar = (e3.s) this.f;
                final qn0 qn0Var = (qn0) this.g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                x00Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.c;
                final long j10 = this.d;
                if (!z11) {
                    final int i10 = 1;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.i00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    x00 x00Var2 = x00Var;
                                    x00Var2.getClass();
                                    zi ziVar2 = ziVar;
                                    TLRPC.Message message = ziVar2.k;
                                    message.translatedToLanguage = str2;
                                    message.translatedText = null;
                                    qr messagesStorage = x00Var2.getMessagesStorage();
                                    e3.s sVar2 = sVar;
                                    messagesStorage.X1(sVar2.a, ziVar2.k);
                                    x00Var2.M.remove(sVar2);
                                    g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                    break;
                                default:
                                    x00 x00Var3 = x00Var;
                                    x00Var3.getClass();
                                    zi ziVar3 = ziVar;
                                    TLRPC.Message message2 = ziVar3.k;
                                    message2.translatedToLanguage = str2;
                                    message2.translatedText = null;
                                    qr messagesStorage2 = x00Var3.getMessagesStorage();
                                    e3.s sVar3 = sVar;
                                    messagesStorage2.X1(sVar3.a, ziVar3.k);
                                    x00Var3.M.remove(sVar3);
                                    g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.h3(new ci.w3(x00Var, ziVar, str2, tL_textWithEntities, arrayList.get(0), sVar, qn0Var, j10));
                        break;
                    } else {
                        final int i11 = 0;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.i00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        x00 x00Var2 = x00Var;
                                        x00Var2.getClass();
                                        zi ziVar2 = ziVar;
                                        TLRPC.Message message = ziVar2.k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        qr messagesStorage = x00Var2.getMessagesStorage();
                                        e3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.a, ziVar2.k);
                                        x00Var2.M.remove(sVar2);
                                        g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        break;
                                    default:
                                        x00 x00Var3 = x00Var;
                                        x00Var3.getClass();
                                        zi ziVar3 = ziVar;
                                        TLRPC.Message message2 = ziVar3.k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        qr messagesStorage2 = x00Var3.getMessagesStorage();
                                        e3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.a, ziVar3.k);
                                        x00Var3.M.remove(sVar3);
                                        g0.i3(qn0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ cm(hp hpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.b = hpVar;
        this.f = tL_inputChatPhoto;
        this.g = fileLocation;
        this.h = fileLocation2;
        this.c = str;
        this.d = j10;
        this.e = runnable;
    }

    public /* synthetic */ cm(x00 x00Var, zi ziVar, String str, e3.s sVar, qn0 qn0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = x00Var;
        this.e = ziVar;
        this.c = str;
        this.f = sVar;
        this.g = qn0Var;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
