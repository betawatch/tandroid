package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.jp0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nm implements RequestDelegate {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ nm(vp vpVar, long j10, String str, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_channels_updateUsername tL_channels_updateUsername, Runnable runnable2) {
        this.b = vpVar;
        this.d = j10;
        this.c = str;
        this.e = runnable;
        this.g = k2Var;
        this.h = tL_channels_updateUsername;
        this.f = runnable2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        vp vpVar;
        TLRPC.Photo photo;
        vp vpVar2;
        String str;
        switch (this.a) {
            case 0:
                vp vpVar3 = (vp) this.b;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.g;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = (TLRPC.TL_channels_updateUsername) this.h;
                Runnable runnable2 = (Runnable) this.f;
                if (!(tLObject instanceof TLRPC.TL_boolTrue) && (tL_error == null || !"USERNAME_NOT_MODIFIED".equals(tL_error.text))) {
                    org.telegram.ui.Components.s4.e0(d20.s0, tL_error, k2Var, tL_channels_updateUsername, new Object[0]);
                    runnable2.run();
                    break;
                } else {
                    i0.g3(new wm(vpVar3, this.d, this.c, runnable, 7));
                    break;
                }
            case 1:
                vp vpVar4 = (vp) this.b;
                TLRPC.TL_inputChatPhoto tL_inputChatPhoto = (TLRPC.TL_inputChatPhoto) this.f;
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) this.g;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.h;
                Runnable runnable3 = (Runnable) this.e;
                if (tL_error == null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z10 = false;
                    if (tL_inputChatPhoto == null) {
                        int size = updates.updates.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.Update update = updates.updates.get(i10);
                                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewChannelMessage) update).message.action;
                                    if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                        photo = messageAction.photo;
                                        if (photo instanceof TLRPC.TL_photo) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i10++;
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
                                    i10++;
                                }
                                vpVar.L3(updates, z10);
                                i0.g3(new oi(10, vpVar, runnable3));
                                break;
                            } else {
                                photo = null;
                            }
                        }
                        if (photo != null) {
                            TLRPC.PhotoSize w9 = b8.w(photo.sizes, zs.g2, false, null, false);
                            TLRPC.VideoSize videoSize = photo.video_sizes.isEmpty() ? null : photo.video_sizes.get(0);
                            if (w9 == null || fileLocation == null) {
                                vpVar2 = vpVar4;
                            } else {
                                vpVar4.getFileLoader().getClass();
                                File K = b8.K(w9, null, true, true);
                                vpVar4.getFileLoader().getClass();
                                b8.K(fileLocation, null, true, true).renameTo(K);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(fileLocation.volume_id);
                                sb2.append("_");
                                String p5 = a1.g.p(sb2, fileLocation.local_id, "@50_50");
                                StringBuilder sb3 = new StringBuilder();
                                vpVar2 = vpVar4;
                                sb3.append(w9.location.volume_id);
                                sb3.append("_");
                                hc.D().R(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), ic.i(w9, photo), true);
                            }
                            TLRPC.PhotoSize w10 = b8.w(photo.sizes, 800, false, null, false);
                            if (w10 != null && fileLocation2 != null) {
                                vpVar2.getFileLoader().getClass();
                                File K2 = b8.K(w10, null, true, true);
                                vpVar2.getFileLoader().getClass();
                                b8.K(fileLocation2, null, true, true).renameTo(K2);
                            }
                            if (videoSize != null && (str = this.c) != null) {
                                vpVar2.getFileLoader().getClass();
                                new File(str).renameTo(b8.K(videoSize, "mp4", true, true));
                            }
                            vpVar = vpVar2;
                            vpVar.T0(-this.d);
                            z10 = false;
                            vpVar.L3(updates, z10);
                            i0.g3(new oi(10, vpVar, runnable3));
                        }
                    }
                    vpVar = vpVar4;
                    vpVar.L3(updates, z10);
                    i0.g3(new oi(10, vpVar, runnable3));
                }
                break;
            default:
                final t10 t10Var = (t10) this.b;
                final jj jjVar = (jj) this.e;
                final c3.s sVar = (c3.s) this.f;
                final jp0 jp0Var = (jp0) this.g;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.h;
                t10Var.getClass();
                boolean z11 = tLObject instanceof TLRPC.TL_messages_translateResult;
                final String str2 = this.c;
                final long j10 = this.d;
                if (!z11) {
                    final int i11 = 1;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.d10
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    t10 t10Var2 = t10Var;
                                    t10Var2.getClass();
                                    jj jjVar2 = jjVar;
                                    TLRPC.Message message = jjVar2.k;
                                    message.translatedToLanguage = str2;
                                    message.translatedText = null;
                                    hs messagesStorage = t10Var2.getMessagesStorage();
                                    c3.s sVar2 = sVar;
                                    messagesStorage.X1(sVar2.a, jjVar2.k);
                                    t10Var2.L.remove(sVar2);
                                    i0.h3(jp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                    break;
                                default:
                                    t10 t10Var3 = t10Var;
                                    t10Var3.getClass();
                                    jj jjVar3 = jjVar;
                                    TLRPC.Message message2 = jjVar3.k;
                                    message2.translatedToLanguage = str2;
                                    message2.translatedText = null;
                                    hs messagesStorage2 = t10Var3.getMessagesStorage();
                                    c3.s sVar3 = sVar;
                                    messagesStorage2.X1(sVar3.a, jjVar3.k);
                                    t10Var3.L.remove(sVar3);
                                    i0.h3(jp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        i0.g3(new e10(t10Var, jjVar, str2, tL_textWithEntities, arrayList.get(0), sVar, jp0Var, j10));
                        break;
                    } else {
                        final int i12 = 0;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.d10
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        t10 t10Var2 = t10Var;
                                        t10Var2.getClass();
                                        jj jjVar2 = jjVar;
                                        TLRPC.Message message = jjVar2.k;
                                        message.translatedToLanguage = str2;
                                        message.translatedText = null;
                                        hs messagesStorage = t10Var2.getMessagesStorage();
                                        c3.s sVar2 = sVar;
                                        messagesStorage.X1(sVar2.a, jjVar2.k);
                                        t10Var2.L.remove(sVar2);
                                        i0.h3(jp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        break;
                                    default:
                                        t10 t10Var3 = t10Var;
                                        t10Var3.getClass();
                                        jj jjVar3 = jjVar;
                                        TLRPC.Message message2 = jjVar3.k;
                                        message2.translatedToLanguage = str2;
                                        message2.translatedText = null;
                                        hs messagesStorage2 = t10Var3.getMessagesStorage();
                                        c3.s sVar3 = sVar;
                                        messagesStorage2.X1(sVar3.a, jjVar3.k);
                                        t10Var3.L.remove(sVar3);
                                        i0.h3(jp0Var, Math.max(0L, 400 - (System.currentTimeMillis() - j10)));
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ nm(vp vpVar, TLRPC.TL_inputChatPhoto tL_inputChatPhoto, TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, String str, long j10, Runnable runnable) {
        this.b = vpVar;
        this.f = tL_inputChatPhoto;
        this.g = fileLocation;
        this.h = fileLocation2;
        this.c = str;
        this.d = j10;
        this.e = runnable;
    }

    public /* synthetic */ nm(t10 t10Var, jj jjVar, String str, c3.s sVar, jp0 jp0Var, long j10, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = t10Var;
        this.e = jjVar;
        this.c = str;
        this.f = sVar;
        this.g = jp0Var;
        this.d = j10;
        this.h = tL_textWithEntities;
    }
}
