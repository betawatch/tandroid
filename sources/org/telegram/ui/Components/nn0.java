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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn0 implements wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ nn0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.hp0 hp0Var;
        org.telegram.ui.dp0 dp0Var;
        int i11;
        int i12;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                tn0 tn0Var = (tn0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = tn0Var.G;
                sn0 sn0Var = tn0Var.c;
                MessageObject E = sn0Var.E(i10);
                if (E != null) {
                    if (!tn0Var.I.g()) {
                        if (view instanceof pn0) {
                            org.telegram.ui.Cells.i7 i7Var = ((pn0) view).a;
                            MessageObject message = i7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (i7Var.G) {
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
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        PhotoViewer.t1().b2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.bu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, tn0Var.F, n2Var);
                                    }
                                }
                            } else if (i7Var.F) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                i7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                i7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            tn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).a();
                            break;
                        }
                    } else {
                        tn0Var.I.d(E, view, 0);
                        org.telegram.ui.y00 y00Var = tn0Var.J;
                        int id2 = E.getId();
                        y00Var.a = E.getDialogId();
                        y00Var.b = id2;
                        sn0Var.m(i10);
                        if (!tn0Var.I.g()) {
                            sn0Var.q(0, sn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.dp0 dp0Var2 = (org.telegram.ui.dp0) this.c;
                org.telegram.ui.jp0 jp0Var = dp0Var2.p0;
                ArrayList arrayList2 = dp0Var2.l0;
                if (!(view instanceof org.telegram.ui.cp0)) {
                    int i13 = dp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = dp0Var2.b0;
                        if (i10 >= i15 && i10 < dp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (dp0Var2.K != null) {
                                if (dp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            dp0Var2.n = 0L;
                                            dp0Var2.h = -1;
                                            dp0Var2.r = null;
                                            dp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        dp0Var2.n = 0L;
                                        dp0Var2.h = -1;
                                        dp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        dp0Var2.s = null;
                                    }
                                    dp0Var2.I = tL_starGiftUnique;
                                    dp0Var2.j(true);
                                    dp0Var2.i();
                                    dp0Var2.f(true);
                                    org.telegram.ui.cp0 cp0Var = dp0Var2.y;
                                    if (cp0Var != null) {
                                        cp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        dp0Var2.n = 0L;
                                        dp0Var2.h = -1;
                                        dp0Var2.I = null;
                                        dp0Var2.r = null;
                                        dp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    dp0Var2.n = 0L;
                                    dp0Var2.h = -1;
                                    dp0Var2.I = null;
                                    dp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    dp0Var2.s = null;
                                }
                                dp0Var2.j(true);
                                dp0Var2.i();
                                dp0Var2.f(true);
                                org.telegram.ui.cp0 cp0Var2 = dp0Var2.y;
                                if (cp0Var2 != null) {
                                    cp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        dp0Var2.h = -1;
                        dp0Var2.n = 0L;
                        dp0Var2.r = null;
                        dp0Var2.s = null;
                        dp0Var2.I = null;
                        dp0Var2.i();
                        if (i14 == 0) {
                            jp0Var.h.i();
                        }
                        org.telegram.ui.cp0 cp0Var3 = dp0Var2.y;
                        if (cp0Var3 != null) {
                            cp0Var3.b(true);
                        }
                        dp0Var2.j(true);
                        dp0Var2.f(true);
                        org.telegram.ui.dp0 dp0Var3 = jp0Var.n;
                        if (dp0Var3 != null && (hp0Var = dp0Var3.a) != null && (dp0Var = jp0Var.h) != null) {
                            hp0Var.a(dp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.cp0 cp0Var4 = (org.telegram.ui.cp0) view;
                    int i17 = dp0Var2.m0;
                    if (dp0Var2.o0 == null) {
                        p5 p5Var = cp0Var4.c;
                        org.telegram.ui.q51[] q51VarArr = new org.telegram.ui.q51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            cp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(cp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.zo0 zo0Var = new org.telegram.ui.zo0(dp0Var2, jp0Var, dp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, jp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, cp0Var4.a(), cp0Var4, q51VarArr);
                        zo0Var.g1 = true;
                        long j11 = dp0Var2.n;
                        zo0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        zo0Var.setSaveState(3);
                        zo0Var.y(p5Var, cp0Var4);
                        org.telegram.ui.ap0 ap0Var = new org.telegram.ui.ap0(dp0Var2, zo0Var);
                        dp0Var2.o0 = ap0Var;
                        q51VarArr[0] = ap0Var;
                        ap0Var.showAsDropDown(cp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        q51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) this.c;
                boolean z11 = view instanceof org.telegram.ui.i51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.d51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                z51Var.i(i10, (org.telegram.ui.d51) view);
                                if (i18 != 1 && i18 != 11) {
                                    z51Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            z51Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                z51Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.i51 i51Var = (org.telegram.ui.i51) view;
                        if (i51Var.s || (((i1Var = i51Var.x) != null && i1Var.a) || i18 == 13 || i18 == 14)) {
                            z51Var.l();
                            z51Var.r(i51Var, i51Var.x);
                        } else if (!i51Var.Q || (document = i51Var.d) == null) {
                            z51Var.o(i51Var, i51Var.e);
                        } else if (z51Var.W == 6) {
                            z51Var.p(i51Var, Long.valueOf(document.id), document, i51Var.v, null);
                        } else {
                            z51Var.p(i51Var, null, document, i51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            z51Var.performHapticFeedback(3, 1);
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
