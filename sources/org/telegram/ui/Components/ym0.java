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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ym0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.hp0 hp0Var;
        org.telegram.ui.dp0 dp0Var;
        int i11;
        int i12;
        ng.q0 q0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                en0 en0Var = (en0) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = en0Var.D;
                dn0 dn0Var = en0Var.c;
                MessageObject E = dn0Var.E(i10);
                if (E != null) {
                    if (!en0Var.F.f()) {
                        if (view instanceof an0) {
                            org.telegram.ui.Cells.i7 i7Var = ((an0) view).a;
                            MessageObject message = i7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (i7Var.D) {
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
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.au0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, en0Var.C, p2Var);
                                    }
                                }
                            } else if (i7Var.C) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                i7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                i7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            en0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).a();
                            break;
                        }
                    } else {
                        en0Var.F.d(E, view, 0);
                        org.telegram.ui.l10 l10Var = en0Var.G;
                        int id2 = E.getId();
                        l10Var.a = E.getDialogId();
                        l10Var.b = id2;
                        dn0Var.m(i10);
                        if (!en0Var.F.f()) {
                            dn0Var.q(0, dn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.dp0 dp0Var2 = (org.telegram.ui.dp0) this.c;
                org.telegram.ui.ip0 ip0Var = dp0Var2.g0;
                ArrayList arrayList2 = dp0Var2.c0;
                if (!(view instanceof org.telegram.ui.cp0)) {
                    int i13 = dp0Var2.N;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = dp0Var2.Q;
                        if (i10 >= i15 && i10 < dp0Var2.R) {
                            int i16 = i10 - i15;
                            if (dp0Var2.C != null) {
                                if (dp0Var2.B != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            dp0Var2.r = 0L;
                                            dp0Var2.n = -1;
                                            dp0Var2.s = null;
                                            dp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        dp0Var2.r = 0L;
                                        dp0Var2.n = -1;
                                        dp0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        dp0Var2.v = null;
                                    }
                                    dp0Var2.y = tL_starGiftUnique;
                                    dp0Var2.i(true);
                                    dp0Var2.h();
                                    dp0Var2.f();
                                    org.telegram.ui.cp0 cp0Var = dp0Var2.x;
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
                                        dp0Var2.r = 0L;
                                        dp0Var2.n = -1;
                                        dp0Var2.y = null;
                                        dp0Var2.s = null;
                                        dp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    dp0Var2.r = 0L;
                                    dp0Var2.n = -1;
                                    dp0Var2.y = null;
                                    dp0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    dp0Var2.v = null;
                                }
                                dp0Var2.i(true);
                                dp0Var2.h();
                                dp0Var2.f();
                                org.telegram.ui.cp0 cp0Var2 = dp0Var2.x;
                                if (cp0Var2 != null) {
                                    cp0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        dp0Var2.n = -1;
                        dp0Var2.r = 0L;
                        dp0Var2.s = null;
                        dp0Var2.v = null;
                        dp0Var2.y = null;
                        dp0Var2.h();
                        if (i14 == 0) {
                            ip0Var.f.h();
                        }
                        org.telegram.ui.cp0 cp0Var3 = dp0Var2.x;
                        if (cp0Var3 != null) {
                            cp0Var3.b(true);
                        }
                        dp0Var2.i(true);
                        dp0Var2.f();
                        org.telegram.ui.dp0 dp0Var3 = ip0Var.h;
                        if (dp0Var3 != null && (hp0Var = dp0Var3.a) != null && (dp0Var = ip0Var.f) != null) {
                            hp0Var.a(dp0Var.n);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.cp0 cp0Var4 = (org.telegram.ui.cp0) view;
                    int i17 = dp0Var2.d0;
                    if (dp0Var2.f0 == null) {
                        j5 j5Var = cp0Var4.c;
                        org.telegram.ui.i61[] i61VarArr = new org.telegram.ui.i61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            cp0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            i12 = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(cp0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.zo0 zo0Var = new org.telegram.ui.zo0(dp0Var2, ip0Var, dp0Var2.getContext(), Integer.valueOf(i11), i17 == 1 ? 5 : 7, ip0Var.getResourceProvider(), i17 == 1 ? 24 : 16, cp0Var4.a(), cp0Var4, i61VarArr);
                        zo0Var.d1 = true;
                        long j11 = dp0Var2.r;
                        zo0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        zo0Var.setSaveState(3);
                        zo0Var.y(j5Var, cp0Var4);
                        org.telegram.ui.ap0 ap0Var = new org.telegram.ui.ap0(dp0Var2, zo0Var);
                        dp0Var2.f0 = ap0Var;
                        i61VarArr[0] = ap0Var;
                        ap0Var.showAsDropDown(cp0Var4, 0, i12, (LocaleController.isRTL ? 3 : 5) | 48);
                        i61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) this.c;
                boolean z10 = view instanceof org.telegram.ui.a61;
                int i18 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.v51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                r61Var.i(i10, (org.telegram.ui.v51) view);
                                if (i18 != 1 && i18 != 11) {
                                    r61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            r61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                r61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) view;
                        if (a61Var.s || (((q0Var = a61Var.x) != null && q0Var.a) || i18 == 13 || i18 == 14)) {
                            r61Var.l();
                            r61Var.r(a61Var, a61Var.x);
                        } else if (!a61Var.N || (document = a61Var.d) == null) {
                            r61Var.o(a61Var, a61Var.e);
                        } else if (r61Var.T == 6) {
                            r61Var.p(a61Var, Long.valueOf(document.id), document, a61Var.v, null);
                        } else {
                            r61Var.p(a61Var, null, document, a61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            r61Var.performHapticFeedback(3, 1);
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
