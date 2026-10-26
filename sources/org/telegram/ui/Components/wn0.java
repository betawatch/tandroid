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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ wn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.pp0 pp0Var;
        org.telegram.ui.lp0 lp0Var;
        int i11;
        int i12;
        bh.x0 x0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                co0 co0Var = (co0) this.c;
                org.telegram.ui.ActionBar.r2 r2Var = co0Var.G;
                bo0 bo0Var = co0Var.c;
                MessageObject E = bo0Var.E(i10);
                if (E != null) {
                    if (!co0Var.I.g()) {
                        if (view instanceof yn0) {
                            org.telegram.ui.Cells.o7 o7Var = ((yn0) view).a;
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
                                        PhotoViewer.u1().M2(null, r2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.u1().M2(null, r2Var, null);
                                        PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.gu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, co0Var.F, r2Var);
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
                            co0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.n7) {
                            ((org.telegram.ui.Cells.n7) view).a();
                            break;
                        }
                    } else {
                        co0Var.I.e(E, view, 0);
                        org.telegram.ui.z00 z00Var = co0Var.J;
                        int id2 = E.getId();
                        z00Var.a = E.getDialogId();
                        z00Var.b = id2;
                        bo0Var.m(i10);
                        if (!co0Var.I.g()) {
                            bo0Var.q(0, bo0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.lp0 lp0Var2 = (org.telegram.ui.lp0) this.c;
                org.telegram.ui.rp0 rp0Var = lp0Var2.p0;
                ArrayList arrayList2 = lp0Var2.l0;
                if (!(view instanceof org.telegram.ui.kp0)) {
                    int i13 = lp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = lp0Var2.b0;
                        if (i10 >= i15 && i10 < lp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (lp0Var2.K != null) {
                                if (lp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            lp0Var2.n = 0L;
                                            lp0Var2.h = -1;
                                            lp0Var2.r = null;
                                            lp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        lp0Var2.n = 0L;
                                        lp0Var2.h = -1;
                                        lp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        lp0Var2.s = null;
                                    }
                                    lp0Var2.I = tL_starGiftUnique;
                                    lp0Var2.j(true);
                                    lp0Var2.i();
                                    lp0Var2.f(true);
                                    org.telegram.ui.kp0 kp0Var = lp0Var2.y;
                                    if (kp0Var != null) {
                                        kp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        lp0Var2.n = 0L;
                                        lp0Var2.h = -1;
                                        lp0Var2.I = null;
                                        lp0Var2.r = null;
                                        lp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    lp0Var2.n = 0L;
                                    lp0Var2.h = -1;
                                    lp0Var2.I = null;
                                    lp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    lp0Var2.s = null;
                                }
                                lp0Var2.j(true);
                                lp0Var2.i();
                                lp0Var2.f(true);
                                org.telegram.ui.kp0 kp0Var2 = lp0Var2.y;
                                if (kp0Var2 != null) {
                                    kp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        lp0Var2.h = -1;
                        lp0Var2.n = 0L;
                        lp0Var2.r = null;
                        lp0Var2.s = null;
                        lp0Var2.I = null;
                        lp0Var2.i();
                        if (i14 == 0) {
                            rp0Var.h.i();
                        }
                        org.telegram.ui.kp0 kp0Var3 = lp0Var2.y;
                        if (kp0Var3 != null) {
                            kp0Var3.b(true);
                        }
                        lp0Var2.j(true);
                        lp0Var2.f(true);
                        org.telegram.ui.lp0 lp0Var3 = rp0Var.n;
                        if (lp0Var3 != null && (pp0Var = lp0Var3.a) != null && (lp0Var = rp0Var.h) != null) {
                            pp0Var.a(lp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.kp0 kp0Var4 = (org.telegram.ui.kp0) view;
                    int i17 = lp0Var2.m0;
                    if (lp0Var2.o0 == null) {
                        r5 r5Var = kp0Var4.c;
                        org.telegram.ui.t51[] t51VarArr = new org.telegram.ui.t51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (r5Var != null) {
                            r5Var.f();
                            kp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(r5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(kp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.hp0 hp0Var = new org.telegram.ui.hp0(lp0Var2, rp0Var, lp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, rp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, kp0Var4.a(), kp0Var4, t51VarArr);
                        hp0Var.g1 = true;
                        long j11 = lp0Var2.n;
                        hp0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        hp0Var.setSaveState(3);
                        hp0Var.y(r5Var, kp0Var4);
                        org.telegram.ui.ip0 ip0Var = new org.telegram.ui.ip0(lp0Var2, hp0Var);
                        lp0Var2.o0 = ip0Var;
                        t51VarArr[0] = ip0Var;
                        ip0Var.showAsDropDown(kp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        t51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) this.c;
                boolean z11 = view instanceof org.telegram.ui.l51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.g51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                c61Var.i(i10, (org.telegram.ui.g51) view);
                                if (i18 != 1 && i18 != 11) {
                                    c61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            c61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                c61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.l51 l51Var = (org.telegram.ui.l51) view;
                        if (l51Var.s || (((x0Var = l51Var.x) != null && x0Var.a) || i18 == 13 || i18 == 14)) {
                            c61Var.l();
                            c61Var.r(l51Var, l51Var.x);
                        } else if (!l51Var.Q || (document = l51Var.d) == null) {
                            c61Var.o(l51Var, l51Var.e);
                        } else if (c61Var.W == 6) {
                            c61Var.p(l51Var, Long.valueOf(document.id), document, l51Var.v, null);
                        } else {
                            c61Var.p(l51Var, null, document, l51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            c61Var.performHapticFeedback(3, 1);
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
