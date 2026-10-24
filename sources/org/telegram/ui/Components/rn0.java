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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ rn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.jp0 jp0Var;
        org.telegram.ui.fp0 fp0Var;
        int i11;
        int i12;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                xn0 xn0Var = (xn0) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = xn0Var.G;
                wn0 wn0Var = xn0Var.c;
                MessageObject E = wn0Var.E(i10);
                if (E != null) {
                    if (!xn0Var.I.g()) {
                        if (view instanceof tn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((tn0) view).a;
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
                                        PhotoViewer.u1().M2(null, o2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.u1().M2(null, o2Var, null);
                                        PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.cu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, xn0Var.F, o2Var);
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
                            xn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) view).a();
                            break;
                        }
                    } else {
                        xn0Var.I.d(E, view, 0);
                        org.telegram.ui.a10 a10Var = xn0Var.J;
                        int id2 = E.getId();
                        a10Var.a = E.getDialogId();
                        a10Var.b = id2;
                        wn0Var.m(i10);
                        if (!xn0Var.I.g()) {
                            wn0Var.q(0, wn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.fp0 fp0Var2 = (org.telegram.ui.fp0) this.c;
                org.telegram.ui.lp0 lp0Var = fp0Var2.p0;
                ArrayList arrayList2 = fp0Var2.l0;
                if (!(view instanceof org.telegram.ui.ep0)) {
                    int i13 = fp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = fp0Var2.b0;
                        if (i10 >= i15 && i10 < fp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (fp0Var2.K != null) {
                                if (fp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            fp0Var2.n = 0L;
                                            fp0Var2.h = -1;
                                            fp0Var2.r = null;
                                            fp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        fp0Var2.n = 0L;
                                        fp0Var2.h = -1;
                                        fp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        fp0Var2.s = null;
                                    }
                                    fp0Var2.I = tL_starGiftUnique;
                                    fp0Var2.j(true);
                                    fp0Var2.i();
                                    fp0Var2.f(true);
                                    org.telegram.ui.ep0 ep0Var = fp0Var2.y;
                                    if (ep0Var != null) {
                                        ep0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        fp0Var2.n = 0L;
                                        fp0Var2.h = -1;
                                        fp0Var2.I = null;
                                        fp0Var2.r = null;
                                        fp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    fp0Var2.n = 0L;
                                    fp0Var2.h = -1;
                                    fp0Var2.I = null;
                                    fp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    fp0Var2.s = null;
                                }
                                fp0Var2.j(true);
                                fp0Var2.i();
                                fp0Var2.f(true);
                                org.telegram.ui.ep0 ep0Var2 = fp0Var2.y;
                                if (ep0Var2 != null) {
                                    ep0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        fp0Var2.h = -1;
                        fp0Var2.n = 0L;
                        fp0Var2.r = null;
                        fp0Var2.s = null;
                        fp0Var2.I = null;
                        fp0Var2.i();
                        if (i14 == 0) {
                            lp0Var.h.i();
                        }
                        org.telegram.ui.ep0 ep0Var3 = fp0Var2.y;
                        if (ep0Var3 != null) {
                            ep0Var3.b(true);
                        }
                        fp0Var2.j(true);
                        fp0Var2.f(true);
                        org.telegram.ui.fp0 fp0Var3 = lp0Var.n;
                        if (fp0Var3 != null && (jp0Var = fp0Var3.a) != null && (fp0Var = lp0Var.h) != null) {
                            jp0Var.a(fp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.ep0 ep0Var4 = (org.telegram.ui.ep0) view;
                    int i17 = fp0Var2.m0;
                    if (fp0Var2.o0 == null) {
                        p5 p5Var = ep0Var4.c;
                        org.telegram.ui.s51[] s51VarArr = new org.telegram.ui.s51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            ep0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(ep0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.bp0 bp0Var = new org.telegram.ui.bp0(fp0Var2, lp0Var, fp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, lp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, ep0Var4.a(), ep0Var4, s51VarArr);
                        bp0Var.g1 = true;
                        long j11 = fp0Var2.n;
                        bp0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        bp0Var.setSaveState(3);
                        bp0Var.y(p5Var, ep0Var4);
                        org.telegram.ui.cp0 cp0Var = new org.telegram.ui.cp0(fp0Var2, bp0Var);
                        fp0Var2.o0 = cp0Var;
                        s51VarArr[0] = cp0Var;
                        cp0Var.showAsDropDown(ep0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        s51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.c;
                boolean z11 = view instanceof org.telegram.ui.k51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.f51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                b61Var.i(i10, (org.telegram.ui.f51) view);
                                if (i18 != 1 && i18 != 11) {
                                    b61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            b61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                b61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.k51 k51Var = (org.telegram.ui.k51) view;
                        if (k51Var.s || (((i1Var = k51Var.x) != null && i1Var.a) || i18 == 13 || i18 == 14)) {
                            b61Var.l();
                            b61Var.r(k51Var, k51Var.x);
                        } else if (!k51Var.Q || (document = k51Var.d) == null) {
                            b61Var.o(k51Var, k51Var.e);
                        } else if (b61Var.W == 6) {
                            b61Var.p(k51Var, Long.valueOf(document.id), document, k51Var.v, null);
                        } else {
                            b61Var.p(k51Var, null, document, k51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            b61Var.performHapticFeedback(3, 1);
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
