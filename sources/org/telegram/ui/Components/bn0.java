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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ bn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.rp0 rp0Var;
        org.telegram.ui.np0 np0Var;
        int i11;
        int i12;
        zg.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                in0 in0Var = (in0) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = in0Var.G;
                hn0 hn0Var = in0Var.c;
                MessageObject E = hn0Var.E(i10);
                if (E != null) {
                    if (!in0Var.I.g()) {
                        if (view instanceof en0) {
                            org.telegram.ui.Cells.k7 k7Var = ((en0) view).a;
                            MessageObject message = k7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (k7Var.G) {
                                if (message.isRoundVideo() || message.isVoice()) {
                                    MediaController.getInstance().playMessage(message);
                                    break;
                                } else {
                                    boolean canPreviewDocument = message.canPreviewDocument();
                                    if (!canPreviewDocument) {
                                        TLRPC.Message message2 = message.messageOwner;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.messageOwner.peer_id.channel_id != 0) {
                                            j3 = 0;
                                            chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.channel_id));
                                        } else {
                                            j3 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.messageOwner.peer_id.chat_id != j3 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(E.messageOwner.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        canPreviewDocument = canPreviewDocument || z10;
                                    }
                                    if (canPreviewDocument) {
                                        PhotoViewer.t1().J2(null, m2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().J2(null, m2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.lu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, in0Var.F, m2Var);
                                    }
                                }
                            } else if (k7Var.F) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                k7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                k7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            in0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) view).a();
                            break;
                        }
                    } else {
                        in0Var.I.e(E, view, 0);
                        org.telegram.ui.l10 l10Var = in0Var.J;
                        int id2 = E.getId();
                        l10Var.a = E.getDialogId();
                        l10Var.b = id2;
                        hn0Var.m(i10);
                        if (!in0Var.I.g()) {
                            hn0Var.q(0, hn0Var.c.r);
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
                        o5 o5Var = mp0Var4.c;
                        org.telegram.ui.r61[] r61VarArr = new org.telegram.ui.r61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            mp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(mp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.jp0 jp0Var = new org.telegram.ui.jp0(np0Var2, tp0Var, np0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, tp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, mp0Var4.a(), mp0Var4, r61VarArr);
                        jp0Var.g1 = true;
                        long j10 = np0Var2.n;
                        jp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        jp0Var.setSaveState(3);
                        jp0Var.y(o5Var, mp0Var4);
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(np0Var2, jp0Var);
                        np0Var2.o0 = kp0Var;
                        r61VarArr[0] = kp0Var;
                        kp0Var.showAsDropDown(mp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        r61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) this.c;
                boolean z11 = view instanceof org.telegram.ui.j61;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.e61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                a71Var.i(i10, (org.telegram.ui.e61) view);
                                if (i18 != 1 && i18 != 11) {
                                    a71Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            a71Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                a71Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.j61 j61Var = (org.telegram.ui.j61) view;
                        if (j61Var.s || (((o0Var = j61Var.x) != null && o0Var.a) || i18 == 13 || i18 == 14)) {
                            a71Var.l();
                            a71Var.r(j61Var, j61Var.x);
                        } else if (!j61Var.Q || (document = j61Var.d) == null) {
                            a71Var.o(j61Var, j61Var.e);
                        } else if (a71Var.W == 6) {
                            a71Var.p(j61Var, Long.valueOf(document.id), document, j61Var.v, null);
                        } else {
                            a71Var.p(j61Var, null, document, j61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            a71Var.performHapticFeedback(3, 1);
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
