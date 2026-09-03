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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ wm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.lp0 lp0Var;
        org.telegram.ui.hp0 hp0Var;
        int i11;
        int i12;
        mg.q0 q0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                cn0 cn0Var = (cn0) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = cn0Var.D;
                bn0 bn0Var = cn0Var.c;
                MessageObject E = bn0Var.E(i10);
                if (E != null) {
                    if (!cn0Var.F.f()) {
                        if (view instanceof ym0) {
                            org.telegram.ui.Cells.h7 h7Var = ((ym0) view).a;
                            MessageObject message = h7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (h7Var.D) {
                                if (message.isRoundVideo() || message.isVoice()) {
                                    MediaController.getInstance().playMessage(message);
                                    break;
                                } else {
                                    boolean canPreviewDocument = message.canPreviewDocument();
                                    if (!canPreviewDocument) {
                                        TLRPC.Message message2 = message.messageOwner;
                                        boolean z4 = message2 != null && message2.noforwards;
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
                                            z4 = chat.noforwards;
                                        }
                                        canPreviewDocument = canPreviewDocument || z4;
                                    }
                                    if (canPreviewDocument) {
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, p2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.fu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, cn0Var.C, p2Var);
                                    }
                                }
                            } else if (h7Var.C) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                h7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                h7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            cn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).a();
                            break;
                        }
                    } else {
                        cn0Var.F.d(E, view, 0);
                        org.telegram.ui.m10 m10Var = cn0Var.G;
                        int id2 = E.getId();
                        m10Var.a = E.getDialogId();
                        m10Var.b = id2;
                        bn0Var.m(i10);
                        if (!cn0Var.F.f()) {
                            bn0Var.q(0, bn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.hp0 hp0Var2 = (org.telegram.ui.hp0) this.c;
                org.telegram.ui.np0 np0Var = hp0Var2.m0;
                ArrayList arrayList2 = hp0Var2.i0;
                if (!(view instanceof org.telegram.ui.gp0)) {
                    int i13 = hp0Var2.S;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = hp0Var2.V;
                        if (i10 >= i15 && i10 < hp0Var2.W) {
                            int i16 = i10 - i15;
                            if (hp0Var2.H != null) {
                                if (hp0Var2.G != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            hp0Var2.n = 0L;
                                            hp0Var2.h = -1;
                                            hp0Var2.r = null;
                                            hp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        hp0Var2.n = 0L;
                                        hp0Var2.h = -1;
                                        hp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        hp0Var2.s = null;
                                    }
                                    hp0Var2.F = tL_starGiftUnique;
                                    hp0Var2.j(true);
                                    hp0Var2.i();
                                    hp0Var2.f(true);
                                    org.telegram.ui.gp0 gp0Var = hp0Var2.y;
                                    if (gp0Var != null) {
                                        gp0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        hp0Var2.n = 0L;
                                        hp0Var2.h = -1;
                                        hp0Var2.F = null;
                                        hp0Var2.r = null;
                                        hp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    hp0Var2.n = 0L;
                                    hp0Var2.h = -1;
                                    hp0Var2.F = null;
                                    hp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    hp0Var2.s = null;
                                }
                                hp0Var2.j(true);
                                hp0Var2.i();
                                hp0Var2.f(true);
                                org.telegram.ui.gp0 gp0Var2 = hp0Var2.y;
                                if (gp0Var2 != null) {
                                    gp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        hp0Var2.h = -1;
                        hp0Var2.n = 0L;
                        hp0Var2.r = null;
                        hp0Var2.s = null;
                        hp0Var2.F = null;
                        hp0Var2.i();
                        if (i14 == 0) {
                            np0Var.h.i();
                        }
                        org.telegram.ui.gp0 gp0Var3 = hp0Var2.y;
                        if (gp0Var3 != null) {
                            gp0Var3.b(true);
                        }
                        hp0Var2.j(true);
                        hp0Var2.f(true);
                        org.telegram.ui.hp0 hp0Var3 = np0Var.n;
                        if (hp0Var3 != null && (lp0Var = hp0Var3.a) != null && (hp0Var = np0Var.h) != null) {
                            lp0Var.a(hp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.gp0 gp0Var4 = (org.telegram.ui.gp0) view;
                    int i17 = hp0Var2.j0;
                    if (hp0Var2.l0 == null) {
                        j5 j5Var = gp0Var4.c;
                        org.telegram.ui.n61[] n61VarArr = new org.telegram.ui.n61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            gp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(gp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.dp0 dp0Var = new org.telegram.ui.dp0(hp0Var2, np0Var, hp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, np0Var.getResourceProvider(), i17 == 1 ? 24 : 16, gp0Var4.a(), gp0Var4, n61VarArr);
                        dp0Var.d1 = true;
                        long j11 = hp0Var2.n;
                        dp0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        dp0Var.setSaveState(3);
                        dp0Var.y(j5Var, gp0Var4);
                        org.telegram.ui.ep0 ep0Var = new org.telegram.ui.ep0(hp0Var2, dp0Var);
                        hp0Var2.l0 = ep0Var;
                        n61VarArr[0] = ep0Var;
                        ep0Var.showAsDropDown(gp0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        n61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.x61 x61Var = (org.telegram.ui.x61) this.c;
                boolean z10 = view instanceof org.telegram.ui.f61;
                int i18 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.a61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                x61Var.i(i10, (org.telegram.ui.a61) view);
                                if (i18 != 1 && i18 != 11) {
                                    x61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            x61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                x61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) view;
                        if (f61Var.s || (((q0Var = f61Var.x) != null && q0Var.a) || i18 == 13 || i18 == 14)) {
                            x61Var.l();
                            x61Var.r(f61Var, f61Var.x);
                        } else if (!f61Var.N || (document = f61Var.d) == null) {
                            x61Var.o(f61Var, f61Var.e);
                        } else if (x61Var.T == 6) {
                            x61Var.p(f61Var, Long.valueOf(document.id), document, f61Var.v, null);
                        } else {
                            x61Var.p(f61Var, null, document, f61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            x61Var.performHapticFeedback(3, 1);
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
