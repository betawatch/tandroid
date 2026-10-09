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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ vn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.yp0 yp0Var;
        org.telegram.ui.up0 up0Var;
        int i11;
        int i12;
        zg.n0 n0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                bo0 bo0Var = (bo0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = bo0Var.G;
                ao0 ao0Var = bo0Var.c;
                MessageObject E = ao0Var.E(i10);
                if (E != null) {
                    if (!bo0Var.I.g()) {
                        if (view instanceof xn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((xn0) view).a;
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
                                        PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.uu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, bo0Var.F, n2Var);
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
                            bo0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) view).a();
                            break;
                        }
                    } else {
                        bo0Var.I.e(E, view, 0);
                        org.telegram.ui.o10 o10Var = bo0Var.J;
                        int id2 = E.getId();
                        o10Var.a = E.getDialogId();
                        o10Var.b = id2;
                        ao0Var.m(i10);
                        if (!bo0Var.I.g()) {
                            ao0Var.q(0, ao0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.up0 up0Var2 = (org.telegram.ui.up0) this.c;
                org.telegram.ui.aq0 aq0Var = up0Var2.p0;
                ArrayList arrayList2 = up0Var2.l0;
                if (!(view instanceof org.telegram.ui.tp0)) {
                    int i13 = up0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = up0Var2.b0;
                        if (i10 >= i15 && i10 < up0Var2.c0) {
                            int i16 = i10 - i15;
                            if (up0Var2.K != null) {
                                if (up0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            up0Var2.n = 0L;
                                            up0Var2.h = -1;
                                            up0Var2.r = null;
                                            up0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        up0Var2.n = 0L;
                                        up0Var2.h = -1;
                                        up0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        up0Var2.s = null;
                                    }
                                    up0Var2.I = tL_starGiftUnique;
                                    up0Var2.j(true);
                                    up0Var2.i();
                                    up0Var2.f(true);
                                    org.telegram.ui.tp0 tp0Var = up0Var2.y;
                                    if (tp0Var != null) {
                                        tp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        up0Var2.n = 0L;
                                        up0Var2.h = -1;
                                        up0Var2.I = null;
                                        up0Var2.r = null;
                                        up0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    up0Var2.n = 0L;
                                    up0Var2.h = -1;
                                    up0Var2.I = null;
                                    up0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    up0Var2.s = null;
                                }
                                up0Var2.j(true);
                                up0Var2.i();
                                up0Var2.f(true);
                                org.telegram.ui.tp0 tp0Var2 = up0Var2.y;
                                if (tp0Var2 != null) {
                                    tp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        up0Var2.h = -1;
                        up0Var2.n = 0L;
                        up0Var2.r = null;
                        up0Var2.s = null;
                        up0Var2.I = null;
                        up0Var2.i();
                        if (i14 == 0) {
                            aq0Var.h.i();
                        }
                        org.telegram.ui.tp0 tp0Var3 = up0Var2.y;
                        if (tp0Var3 != null) {
                            tp0Var3.b(true);
                        }
                        up0Var2.j(true);
                        up0Var2.f(true);
                        org.telegram.ui.up0 up0Var3 = aq0Var.n;
                        if (up0Var3 != null && (yp0Var = up0Var3.a) != null && (up0Var = aq0Var.h) != null) {
                            yp0Var.a(up0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.tp0 tp0Var4 = (org.telegram.ui.tp0) view;
                    int i17 = up0Var2.m0;
                    if (up0Var2.o0 == null) {
                        q5 q5Var = tp0Var4.c;
                        org.telegram.ui.b71[] b71VarArr = new org.telegram.ui.b71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            tp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(tp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.qp0 qp0Var = new org.telegram.ui.qp0(up0Var2, aq0Var, up0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, aq0Var.getResourceProvider(), i17 == 1 ? 24 : 16, tp0Var4.a(), tp0Var4, b71VarArr);
                        qp0Var.g1 = true;
                        long j10 = up0Var2.n;
                        qp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        qp0Var.setSaveState(3);
                        qp0Var.y(q5Var, tp0Var4);
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(up0Var2, qp0Var);
                        up0Var2.o0 = rp0Var;
                        b71VarArr[0] = rp0Var;
                        rp0Var.showAsDropDown(tp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        b71VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.k71 k71Var = (org.telegram.ui.k71) this.c;
                boolean z11 = view instanceof org.telegram.ui.t61;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.o61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                k71Var.i(i10, (org.telegram.ui.o61) view);
                                if (i18 != 1 && i18 != 11) {
                                    k71Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            k71Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                k71Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.t61 t61Var = (org.telegram.ui.t61) view;
                        if (t61Var.s || (((n0Var = t61Var.x) != null && n0Var.a) || i18 == 13 || i18 == 14)) {
                            k71Var.l();
                            k71Var.r(t61Var, t61Var.x);
                        } else if (!t61Var.Q || (document = t61Var.d) == null) {
                            k71Var.o(t61Var, t61Var.e);
                        } else if (k71Var.W == 6) {
                            k71Var.p(t61Var, Long.valueOf(document.id), document, t61Var.v, null);
                        } else {
                            k71Var.p(t61Var, null, document, t61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            k71Var.performHapticFeedback(3, 1);
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
