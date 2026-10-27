package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ xn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.rp0 rp0Var;
        org.telegram.ui.np0 np0Var;
        int i11;
        int i12;
        bh.x0 x0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                do0 do0Var = (do0) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = do0Var.G;
                co0 co0Var = do0Var.c;
                MessageObject E = co0Var.E(i10);
                if (E != null) {
                    if (!do0Var.I.g()) {
                        if (view instanceof zn0) {
                            org.telegram.ui.Cells.o7 o7Var = ((zn0) view).a;
                            MessageObject message = o7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (o7Var.G) {
                                if (message.isRoundVideo() || message.isVoice()) {
                                    MediaController.getInstance().playMessage(message);
                                    break;
                                } else {
                                    boolean canPreviewDocument = message.canPreviewDocument();
                                    if (!canPreviewDocument) {
                                        TLRPC.Message message2 = message.messageOwner;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.messageOwner.peer_id.channel_id != 0) {
                                            j10 = 0;
                                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.channel_id));
                                        } else {
                                            j10 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.messageOwner.peer_id.chat_id != j10 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        canPreviewDocument = canPreviewDocument || z10;
                                    }
                                    if (canPreviewDocument) {
                                        PhotoViewer.v1().N2(null, r2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.v1().N2(null, r2Var, null);
                                        PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.iu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, do0Var.F, r2Var);
                                    }
                                }
                            } else if (o7Var.F) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                o7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                o7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            do0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.n7) {
                            ((org.telegram.ui.Cells.n7) view).a();
                            break;
                        }
                    } else {
                        do0Var.I.e(E, view, 0);
                        org.telegram.ui.b10 b10Var = do0Var.J;
                        int id2 = E.getId();
                        b10Var.a = E.getDialogId();
                        b10Var.b = id2;
                        co0Var.m(i10);
                        if (!do0Var.I.g()) {
                            co0Var.q(0, co0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.np0 np0Var2 = (org.telegram.ui.np0) this.c;
                org.telegram.ui.tp0 tp0Var = np0Var2.p0;
                ArrayList arrayList2 = np0Var2.l0;
                if (!(view instanceof org.telegram.ui.mp0)) {
                    int i13 = np0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = np0Var2.b0;
                        if (i10 >= i15 && i10 < np0Var2.c0) {
                            int i16 = i10 - i15;
                            if (np0Var2.K != null) {
                                if (np0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            np0Var2.n = 0L;
                                            np0Var2.h = -1;
                                            np0Var2.r = null;
                                            np0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        np0Var2.n = 0L;
                                        np0Var2.h = -1;
                                        np0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        np0Var2.s = null;
                                    }
                                    np0Var2.I = tL_starGiftUnique;
                                    np0Var2.j(true);
                                    np0Var2.i();
                                    np0Var2.f(true);
                                    org.telegram.ui.mp0 mp0Var = np0Var2.y;
                                    if (mp0Var != null) {
                                        mp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        np0Var2.n = 0L;
                                        np0Var2.h = -1;
                                        np0Var2.I = null;
                                        np0Var2.r = null;
                                        np0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    np0Var2.n = 0L;
                                    np0Var2.h = -1;
                                    np0Var2.I = null;
                                    np0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    np0Var2.s = null;
                                }
                                np0Var2.j(true);
                                np0Var2.i();
                                np0Var2.f(true);
                                org.telegram.ui.mp0 mp0Var2 = np0Var2.y;
                                if (mp0Var2 != null) {
                                    mp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        np0Var2.h = -1;
                        np0Var2.n = 0L;
                        np0Var2.r = null;
                        np0Var2.s = null;
                        np0Var2.I = null;
                        np0Var2.i();
                        if (i14 == 0) {
                            tp0Var.h.i();
                        }
                        org.telegram.ui.mp0 mp0Var3 = np0Var2.y;
                        if (mp0Var3 != null) {
                            mp0Var3.b(true);
                        }
                        np0Var2.j(true);
                        np0Var2.f(true);
                        org.telegram.ui.np0 np0Var3 = tp0Var.n;
                        if (np0Var3 != null && (rp0Var = np0Var3.a) != null && (np0Var = tp0Var.h) != null) {
                            rp0Var.a(np0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.mp0 mp0Var4 = (org.telegram.ui.mp0) view;
                    int i17 = np0Var2.m0;
                    if (np0Var2.o0 == null) {
                        r5 r5Var = mp0Var4.c;
                        org.telegram.ui.w51[] w51VarArr = new org.telegram.ui.w51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (r5Var != null) {
                            r5Var.f();
                            mp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(r5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(mp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(np0Var2, tp0Var, np0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, tp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, mp0Var4.a(), mp0Var4, w51VarArr);
                        jp0Var.g1 = true;
                        long j11 = np0Var2.n;
                        jp0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        jp0Var.setSaveState(3);
                        jp0Var.y(r5Var, mp0Var4);
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(np0Var2, jp0Var);
                        np0Var2.o0 = kp0Var;
                        w51VarArr[0] = kp0Var;
                        kp0Var.showAsDropDown(mp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        w51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) this.c;
                boolean z11 = view instanceof org.telegram.ui.o51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.j51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                f61Var.i(i10, (org.telegram.ui.j51) view);
                                if (i18 != 1 && i18 != 11) {
                                    f61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            f61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                f61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.o51 o51Var = (org.telegram.ui.o51) view;
                        if (o51Var.s || (((x0Var = o51Var.x) != null && x0Var.a) || i18 == 13 || i18 == 14)) {
                            f61Var.l();
                            f61Var.r(o51Var, o51Var.x);
                        } else if (!o51Var.Q || (document = o51Var.d) == null) {
                            f61Var.o(o51Var, o51Var.e);
                        } else if (f61Var.W == 6) {
                            f61Var.p(o51Var, Long.valueOf(document.id), document, o51Var.v, null);
                        } else {
                            f61Var.p(o51Var, null, document, o51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            f61Var.performHapticFeedback(3, 1);
                        }
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
