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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ cn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.aq0 aq0Var;
        org.telegram.ui.wp0 wp0Var;
        int i11;
        int i12;
        zg.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                jn0 jn0Var = (jn0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = jn0Var.G;
                in0 in0Var = jn0Var.c;
                MessageObject E = in0Var.E(i10);
                if (E != null) {
                    if (!jn0Var.I.g()) {
                        if (view instanceof fn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((fn0) view).a;
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
                                        PhotoViewer.t1().J2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().J2(null, n2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.tu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, jn0Var.F, n2Var);
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
                            jn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.j7) {
                            ((org.telegram.ui.Cells.j7) view).a();
                            break;
                        }
                    } else {
                        jn0Var.I.e(E, view, 0);
                        org.telegram.ui.p10 p10Var = jn0Var.J;
                        int id2 = E.getId();
                        p10Var.a = E.getDialogId();
                        p10Var.b = id2;
                        in0Var.m(i10);
                        if (!jn0Var.I.g()) {
                            in0Var.q(0, in0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.wp0 wp0Var2 = (org.telegram.ui.wp0) this.c;
                org.telegram.ui.cq0 cq0Var = wp0Var2.p0;
                ArrayList arrayList2 = wp0Var2.l0;
                if (!(view instanceof org.telegram.ui.vp0)) {
                    int i13 = wp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = wp0Var2.b0;
                        if (i10 >= i15 && i10 < wp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (wp0Var2.K != null) {
                                if (wp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            wp0Var2.n = 0L;
                                            wp0Var2.h = -1;
                                            wp0Var2.r = null;
                                            wp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        wp0Var2.n = 0L;
                                        wp0Var2.h = -1;
                                        wp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        wp0Var2.s = null;
                                    }
                                    wp0Var2.I = tL_starGiftUnique;
                                    wp0Var2.j(true);
                                    wp0Var2.i();
                                    wp0Var2.f(true);
                                    org.telegram.ui.vp0 vp0Var = wp0Var2.y;
                                    if (vp0Var != null) {
                                        vp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        wp0Var2.n = 0L;
                                        wp0Var2.h = -1;
                                        wp0Var2.I = null;
                                        wp0Var2.r = null;
                                        wp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    wp0Var2.n = 0L;
                                    wp0Var2.h = -1;
                                    wp0Var2.I = null;
                                    wp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    wp0Var2.s = null;
                                }
                                wp0Var2.j(true);
                                wp0Var2.i();
                                wp0Var2.f(true);
                                org.telegram.ui.vp0 vp0Var2 = wp0Var2.y;
                                if (vp0Var2 != null) {
                                    vp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        wp0Var2.h = -1;
                        wp0Var2.n = 0L;
                        wp0Var2.r = null;
                        wp0Var2.s = null;
                        wp0Var2.I = null;
                        wp0Var2.i();
                        if (i14 == 0) {
                            cq0Var.h.i();
                        }
                        org.telegram.ui.vp0 vp0Var3 = wp0Var2.y;
                        if (vp0Var3 != null) {
                            vp0Var3.b(true);
                        }
                        wp0Var2.j(true);
                        wp0Var2.f(true);
                        org.telegram.ui.wp0 wp0Var3 = cq0Var.n;
                        if (wp0Var3 != null && (aq0Var = wp0Var3.a) != null && (wp0Var = cq0Var.h) != null) {
                            aq0Var.a(wp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.vp0 vp0Var4 = (org.telegram.ui.vp0) view;
                    int i17 = wp0Var2.m0;
                    if (wp0Var2.o0 == null) {
                        o5 o5Var = vp0Var4.c;
                        org.telegram.ui.x61[] x61VarArr = new org.telegram.ui.x61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            vp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(vp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(wp0Var2, cq0Var, wp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, cq0Var.getResourceProvider(), i17 == 1 ? 24 : 16, vp0Var4.a(), vp0Var4, x61VarArr);
                        sp0Var.g1 = true;
                        long j10 = wp0Var2.n;
                        sp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        sp0Var.setSaveState(3);
                        sp0Var.y(o5Var, vp0Var4);
                        org.telegram.ui.tp0 tp0Var = new org.telegram.ui.tp0(wp0Var2, sp0Var);
                        wp0Var2.o0 = tp0Var;
                        x61VarArr[0] = tp0Var;
                        tp0Var.showAsDropDown(vp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        x61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.g71 g71Var = (org.telegram.ui.g71) this.c;
                boolean z11 = view instanceof org.telegram.ui.p61;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.k61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                g71Var.i(i10, (org.telegram.ui.k61) view);
                                if (i18 != 1 && i18 != 11) {
                                    g71Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            g71Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                g71Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.p61 p61Var = (org.telegram.ui.p61) view;
                        if (p61Var.s || (((o0Var = p61Var.x) != null && o0Var.a) || i18 == 13 || i18 == 14)) {
                            g71Var.l();
                            g71Var.r(p61Var, p61Var.x);
                        } else if (!p61Var.Q || (document = p61Var.d) == null) {
                            g71Var.o(p61Var, p61Var.e);
                        } else if (g71Var.W == 6) {
                            g71Var.p(p61Var, Long.valueOf(document.id), document, p61Var.v, null);
                        } else {
                            g71Var.p(p61Var, null, document, p61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            g71Var.performHapticFeedback(3, 1);
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
