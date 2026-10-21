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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class on0 implements xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ on0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.gp0 gp0Var;
        org.telegram.ui.cp0 cp0Var;
        int i11;
        int i12;
        ah.i1 i1Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                un0 un0Var = (un0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = un0Var.G;
                tn0 tn0Var = un0Var.c;
                MessageObject E = tn0Var.E(i10);
                if (E != null) {
                    if (!un0Var.I.g()) {
                        if (view instanceof qn0) {
                            org.telegram.ui.Cells.i7 i7Var = ((qn0) view).a;
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
                                        PhotoViewer.u1().M2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.u1().M2(null, n2Var, null);
                                        PhotoViewer.u1().d2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.zt0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, un0Var.F, n2Var);
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
                            un0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).a();
                            break;
                        }
                    } else {
                        un0Var.I.d(E, view, 0);
                        org.telegram.ui.w00 w00Var = un0Var.J;
                        int id2 = E.getId();
                        w00Var.a = E.getDialogId();
                        w00Var.b = id2;
                        tn0Var.m(i10);
                        if (!un0Var.I.g()) {
                            tn0Var.q(0, tn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.cp0 cp0Var2 = (org.telegram.ui.cp0) this.c;
                org.telegram.ui.ip0 ip0Var = cp0Var2.p0;
                ArrayList arrayList2 = cp0Var2.l0;
                if (!(view instanceof org.telegram.ui.bp0)) {
                    int i13 = cp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = cp0Var2.b0;
                        if (i10 >= i15 && i10 < cp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (cp0Var2.K != null) {
                                if (cp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            cp0Var2.n = 0L;
                                            cp0Var2.h = -1;
                                            cp0Var2.r = null;
                                            cp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        cp0Var2.n = 0L;
                                        cp0Var2.h = -1;
                                        cp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        cp0Var2.s = null;
                                    }
                                    cp0Var2.I = tL_starGiftUnique;
                                    cp0Var2.j(true);
                                    cp0Var2.i();
                                    cp0Var2.f(true);
                                    org.telegram.ui.bp0 bp0Var = cp0Var2.y;
                                    if (bp0Var != null) {
                                        bp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        cp0Var2.n = 0L;
                                        cp0Var2.h = -1;
                                        cp0Var2.I = null;
                                        cp0Var2.r = null;
                                        cp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    cp0Var2.n = 0L;
                                    cp0Var2.h = -1;
                                    cp0Var2.I = null;
                                    cp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    cp0Var2.s = null;
                                }
                                cp0Var2.j(true);
                                cp0Var2.i();
                                cp0Var2.f(true);
                                org.telegram.ui.bp0 bp0Var2 = cp0Var2.y;
                                if (bp0Var2 != null) {
                                    bp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        cp0Var2.h = -1;
                        cp0Var2.n = 0L;
                        cp0Var2.r = null;
                        cp0Var2.s = null;
                        cp0Var2.I = null;
                        cp0Var2.i();
                        if (i14 == 0) {
                            ip0Var.h.i();
                        }
                        org.telegram.ui.bp0 bp0Var3 = cp0Var2.y;
                        if (bp0Var3 != null) {
                            bp0Var3.b(true);
                        }
                        cp0Var2.j(true);
                        cp0Var2.f(true);
                        org.telegram.ui.cp0 cp0Var3 = ip0Var.n;
                        if (cp0Var3 != null && (gp0Var = cp0Var3.a) != null && (cp0Var = ip0Var.h) != null) {
                            gp0Var.a(cp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.bp0 bp0Var4 = (org.telegram.ui.bp0) view;
                    int i17 = cp0Var2.m0;
                    if (cp0Var2.o0 == null) {
                        p5 p5Var = bp0Var4.c;
                        org.telegram.ui.o51[] o51VarArr = new org.telegram.ui.o51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (p5Var != null) {
                            p5Var.f();
                            bp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(p5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(bp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.yo0 yo0Var = new org.telegram.ui.yo0(cp0Var2, ip0Var, cp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, ip0Var.getResourceProvider(), i17 == 1 ? 24 : 16, bp0Var4.a(), bp0Var4, o51VarArr);
                        yo0Var.g1 = true;
                        long j11 = cp0Var2.n;
                        yo0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        yo0Var.setSaveState(3);
                        yo0Var.y(p5Var, bp0Var4);
                        org.telegram.ui.zo0 zo0Var = new org.telegram.ui.zo0(cp0Var2, yo0Var);
                        cp0Var2.o0 = zo0Var;
                        o51VarArr[0] = zo0Var;
                        zo0Var.showAsDropDown(bp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        o51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.x51 x51Var = (org.telegram.ui.x51) this.c;
                boolean z11 = view instanceof org.telegram.ui.g51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.b51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                x51Var.i(i10, (org.telegram.ui.b51) view);
                                if (i18 != 1 && i18 != 11) {
                                    x51Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            x51Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                x51Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.g51 g51Var = (org.telegram.ui.g51) view;
                        if (g51Var.s || (((i1Var = g51Var.x) != null && i1Var.a) || i18 == 13 || i18 == 14)) {
                            x51Var.l();
                            x51Var.r(g51Var, g51Var.x);
                        } else if (!g51Var.Q || (document = g51Var.d) == null) {
                            x51Var.o(g51Var, g51Var.e);
                        } else if (x51Var.W == 6) {
                            x51Var.p(g51Var, Long.valueOf(document.id), document, g51Var.v, null);
                        } else {
                            x51Var.p(g51Var, null, document, g51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            x51Var.performHapticFeedback(3, 1);
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
