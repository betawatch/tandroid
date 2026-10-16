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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final void a(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.cq0 cq0Var;
        org.telegram.ui.yp0 yp0Var;
        int i11;
        int i12;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                xn0 xn0Var = (xn0) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = xn0Var.G;
                wn0 wn0Var = xn0Var.c;
                MessageObject E = wn0Var.E(i10);
                if (E != null) {
                    if (!xn0Var.I.g()) {
                        if (view instanceof tn0) {
                            org.telegram.ui.Cells.j7 j7Var = ((tn0) view).a;
                            MessageObject message = j7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (j7Var.G) {
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
                                        PhotoViewer.t1().K2(null, m2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, m2Var, null);
                                        PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.zu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, xn0Var.F, m2Var);
                                    }
                                }
                            } else if (j7Var.F) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                j7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                j7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            xn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            ((org.telegram.ui.Cells.i7) view).a();
                            break;
                        }
                    } else {
                        xn0Var.I.d(E, view, 0);
                        org.telegram.ui.t10 t10Var = xn0Var.J;
                        int id2 = E.getId();
                        t10Var.a = E.getDialogId();
                        t10Var.b = id2;
                        wn0Var.m(i10);
                        if (!xn0Var.I.g()) {
                            wn0Var.q(0, wn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.yp0 yp0Var2 = (org.telegram.ui.yp0) this.c;
                org.telegram.ui.eq0 eq0Var = yp0Var2.p0;
                ArrayList arrayList2 = yp0Var2.l0;
                if (!(view instanceof org.telegram.ui.xp0)) {
                    int i13 = yp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = yp0Var2.b0;
                        if (i10 >= i15 && i10 < yp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (yp0Var2.K != null) {
                                if (yp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            yp0Var2.n = 0L;
                                            yp0Var2.h = -1;
                                            yp0Var2.r = null;
                                            yp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        yp0Var2.n = 0L;
                                        yp0Var2.h = -1;
                                        yp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        yp0Var2.s = null;
                                    }
                                    yp0Var2.I = tL_starGiftUnique;
                                    yp0Var2.j(true);
                                    yp0Var2.i();
                                    yp0Var2.f(true);
                                    org.telegram.ui.xp0 xp0Var = yp0Var2.y;
                                    if (xp0Var != null) {
                                        xp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        yp0Var2.n = 0L;
                                        yp0Var2.h = -1;
                                        yp0Var2.I = null;
                                        yp0Var2.r = null;
                                        yp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    yp0Var2.n = 0L;
                                    yp0Var2.h = -1;
                                    yp0Var2.I = null;
                                    yp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    yp0Var2.s = null;
                                }
                                yp0Var2.j(true);
                                yp0Var2.i();
                                yp0Var2.f(true);
                                org.telegram.ui.xp0 xp0Var2 = yp0Var2.y;
                                if (xp0Var2 != null) {
                                    xp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        yp0Var2.h = -1;
                        yp0Var2.n = 0L;
                        yp0Var2.r = null;
                        yp0Var2.s = null;
                        yp0Var2.I = null;
                        yp0Var2.i();
                        if (i14 == 0) {
                            eq0Var.h.i();
                        }
                        org.telegram.ui.xp0 xp0Var3 = yp0Var2.y;
                        if (xp0Var3 != null) {
                            xp0Var3.b(true);
                        }
                        yp0Var2.j(true);
                        yp0Var2.f(true);
                        org.telegram.ui.yp0 yp0Var3 = eq0Var.n;
                        if (yp0Var3 != null && (cq0Var = yp0Var3.a) != null && (yp0Var = eq0Var.h) != null) {
                            cq0Var.a(yp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.xp0 xp0Var4 = (org.telegram.ui.xp0) view;
                    int i17 = yp0Var2.m0;
                    if (yp0Var2.o0 == null) {
                        q5 q5Var = xp0Var4.c;
                        org.telegram.ui.i71[] i71VarArr = new org.telegram.ui.i71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (q5Var != null) {
                            q5Var.f();
                            xp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(q5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(xp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.up0 up0Var = new org.telegram.ui.up0(yp0Var2, eq0Var, yp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, eq0Var.getResourceProvider(), i17 == 1 ? 24 : 16, xp0Var4.a(), xp0Var4, i71VarArr);
                        up0Var.g1 = true;
                        long j11 = yp0Var2.n;
                        up0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        up0Var.setSaveState(3);
                        up0Var.y(q5Var, xp0Var4);
                        org.telegram.ui.vp0 vp0Var = new org.telegram.ui.vp0(yp0Var2, up0Var);
                        yp0Var2.o0 = vp0Var;
                        i71VarArr[0] = vp0Var;
                        vp0Var.showAsDropDown(xp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        i71VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.r71 r71Var = (org.telegram.ui.r71) this.c;
                boolean z11 = view instanceof org.telegram.ui.a71;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.v61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                r71Var.i(i10, (org.telegram.ui.v61) view);
                                if (i18 != 1 && i18 != 11) {
                                    r71Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            r71Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                r71Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) view;
                        if (a71Var.s || (((i1Var = a71Var.x) != null && i1Var.a) || i18 == 13 || i18 == 14)) {
                            r71Var.l();
                            r71Var.r(a71Var, a71Var.x);
                        } else if (!a71Var.Q || (document = a71Var.d) == null) {
                            r71Var.o(a71Var, a71Var.e);
                        } else if (r71Var.W == 6) {
                            r71Var.p(a71Var, Long.valueOf(document.id), document, a71Var.v, null);
                        } else {
                            r71Var.p(a71Var, null, document, a71Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            r71Var.performHapticFeedback(3, 1);
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
