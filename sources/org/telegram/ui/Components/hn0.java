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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ hn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.up0 up0Var;
        org.telegram.ui.qp0 qp0Var;
        int i11;
        int i12;
        zg.m0 m0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                on0 on0Var = (on0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = on0Var.G;
                nn0 nn0Var = on0Var.c;
                MessageObject E = nn0Var.E(i10);
                if (E != null) {
                    if (!on0Var.I.g()) {
                        if (view instanceof kn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((kn0) view).a;
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
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.ou0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, on0Var.F, n2Var);
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
                            on0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) view).a();
                            break;
                        }
                    } else {
                        on0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = on0Var.J;
                        int id2 = E.getId();
                        p10Var.a = E.getDialogId();
                        p10Var.b = id2;
                        nn0Var.m(i10);
                        if (!on0Var.I.g()) {
                            nn0Var.q(0, nn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.qp0 qp0Var2 = (org.telegram.ui.qp0) this.c;
                org.telegram.ui.wp0 wp0Var = qp0Var2.p0;
                ArrayList arrayList2 = qp0Var2.l0;
                if (!(view instanceof org.telegram.ui.pp0)) {
                    int i13 = qp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = qp0Var2.b0;
                        if (i10 >= i15 && i10 < qp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (qp0Var2.K != null) {
                                if (qp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            qp0Var2.n = 0L;
                                            qp0Var2.h = -1;
                                            qp0Var2.r = null;
                                            qp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        qp0Var2.n = 0L;
                                        qp0Var2.h = -1;
                                        qp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        qp0Var2.s = null;
                                    }
                                    qp0Var2.I = tL_starGiftUnique;
                                    qp0Var2.j(true);
                                    qp0Var2.i();
                                    qp0Var2.f(true);
                                    org.telegram.ui.pp0 pp0Var = qp0Var2.y;
                                    if (pp0Var != null) {
                                        pp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        qp0Var2.n = 0L;
                                        qp0Var2.h = -1;
                                        qp0Var2.I = null;
                                        qp0Var2.r = null;
                                        qp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    qp0Var2.n = 0L;
                                    qp0Var2.h = -1;
                                    qp0Var2.I = null;
                                    qp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    qp0Var2.s = null;
                                }
                                qp0Var2.j(true);
                                qp0Var2.i();
                                qp0Var2.f(true);
                                org.telegram.ui.pp0 pp0Var2 = qp0Var2.y;
                                if (pp0Var2 != null) {
                                    pp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        qp0Var2.h = -1;
                        qp0Var2.n = 0L;
                        qp0Var2.r = null;
                        qp0Var2.s = null;
                        qp0Var2.I = null;
                        qp0Var2.i();
                        if (i14 == 0) {
                            wp0Var.h.i();
                        }
                        org.telegram.ui.pp0 pp0Var3 = qp0Var2.y;
                        if (pp0Var3 != null) {
                            pp0Var3.b(true);
                        }
                        qp0Var2.j(true);
                        qp0Var2.f(true);
                        org.telegram.ui.qp0 qp0Var3 = wp0Var.n;
                        if (qp0Var3 != null && (up0Var = qp0Var3.a) != null && (qp0Var = wp0Var.h) != null) {
                            up0Var.a(qp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.pp0 pp0Var4 = (org.telegram.ui.pp0) view;
                    int i17 = qp0Var2.m0;
                    if (qp0Var2.o0 == null) {
                        o5 o5Var = pp0Var4.c;
                        org.telegram.ui.r61[] r61VarArr = new org.telegram.ui.r61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            pp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(pp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.mp0 mp0Var = new org.telegram.ui.mp0(qp0Var2, wp0Var, qp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, wp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, pp0Var4.a(), pp0Var4, r61VarArr);
                        mp0Var.g1 = true;
                        long j10 = qp0Var2.n;
                        mp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        mp0Var.setSaveState(3);
                        mp0Var.y(o5Var, pp0Var4);
                        org.telegram.ui.np0 np0Var = new org.telegram.ui.np0(qp0Var2, mp0Var);
                        qp0Var2.o0 = np0Var;
                        r61VarArr[0] = np0Var;
                        np0Var.showAsDropDown(pp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
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
                        if (j61Var.s || (((m0Var = j61Var.x) != null && m0Var.a) || i18 == 13 || i18 == 14)) {
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
