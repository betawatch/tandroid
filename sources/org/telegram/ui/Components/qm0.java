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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm0 implements al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ qm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.sp0 sp0Var;
        org.telegram.ui.op0 op0Var;
        int i11;
        int i12;
        zg.p0 p0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                wm0 wm0Var = (wm0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = wm0Var.G;
                vm0 vm0Var = wm0Var.c;
                MessageObject E = vm0Var.E(i10);
                if (E != null) {
                    if (!wm0Var.I.g()) {
                        if (view instanceof sm0) {
                            org.telegram.ui.Cells.j7 j7Var = ((sm0) view).a;
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
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.mu0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, wm0Var.F, n2Var);
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
                            wm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            ((org.telegram.ui.Cells.i7) view).a();
                            break;
                        }
                    } else {
                        wm0Var.I.e(E, view, 0);
                        org.telegram.ui.m10 m10Var = wm0Var.J;
                        int id2 = E.getId();
                        m10Var.a = E.getDialogId();
                        m10Var.b = id2;
                        vm0Var.m(i10);
                        if (!wm0Var.I.g()) {
                            vm0Var.q(0, vm0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.op0 op0Var2 = (org.telegram.ui.op0) this.c;
                org.telegram.ui.up0 up0Var = op0Var2.p0;
                ArrayList arrayList2 = op0Var2.l0;
                if (!(view instanceof org.telegram.ui.np0)) {
                    int i13 = op0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = op0Var2.b0;
                        if (i10 >= i15 && i10 < op0Var2.c0) {
                            int i16 = i10 - i15;
                            if (op0Var2.K != null) {
                                if (op0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            op0Var2.n = 0L;
                                            op0Var2.h = -1;
                                            op0Var2.r = null;
                                            op0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        op0Var2.n = 0L;
                                        op0Var2.h = -1;
                                        op0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        op0Var2.s = null;
                                    }
                                    op0Var2.I = tL_starGiftUnique;
                                    op0Var2.j(true);
                                    op0Var2.i();
                                    op0Var2.f(true);
                                    org.telegram.ui.np0 np0Var = op0Var2.y;
                                    if (np0Var != null) {
                                        np0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        op0Var2.n = 0L;
                                        op0Var2.h = -1;
                                        op0Var2.I = null;
                                        op0Var2.r = null;
                                        op0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    op0Var2.n = 0L;
                                    op0Var2.h = -1;
                                    op0Var2.I = null;
                                    op0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    op0Var2.s = null;
                                }
                                op0Var2.j(true);
                                op0Var2.i();
                                op0Var2.f(true);
                                org.telegram.ui.np0 np0Var2 = op0Var2.y;
                                if (np0Var2 != null) {
                                    np0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        op0Var2.h = -1;
                        op0Var2.n = 0L;
                        op0Var2.r = null;
                        op0Var2.s = null;
                        op0Var2.I = null;
                        op0Var2.i();
                        if (i14 == 0) {
                            up0Var.h.i();
                        }
                        org.telegram.ui.np0 np0Var3 = op0Var2.y;
                        if (np0Var3 != null) {
                            np0Var3.b(true);
                        }
                        op0Var2.j(true);
                        op0Var2.f(true);
                        org.telegram.ui.op0 op0Var3 = up0Var.n;
                        if (op0Var3 != null && (sp0Var = op0Var3.a) != null && (op0Var = up0Var.h) != null) {
                            sp0Var.a(op0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.np0 np0Var4 = (org.telegram.ui.np0) view;
                    int i17 = op0Var2.m0;
                    if (op0Var2.o0 == null) {
                        o5 o5Var = np0Var4.c;
                        org.telegram.ui.q61[] q61VarArr = new org.telegram.ui.q61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            np0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(np0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(op0Var2, up0Var, op0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, up0Var.getResourceProvider(), i17 == 1 ? 24 : 16, np0Var4.a(), np0Var4, q61VarArr);
                        kp0Var.g1 = true;
                        long j10 = op0Var2.n;
                        kp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        kp0Var.setSaveState(3);
                        kp0Var.y(o5Var, np0Var4);
                        org.telegram.ui.lp0 lp0Var = new org.telegram.ui.lp0(op0Var2, kp0Var);
                        op0Var2.o0 = lp0Var;
                        q61VarArr[0] = lp0Var;
                        lp0Var.showAsDropDown(np0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        q61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.z61 z61Var = (org.telegram.ui.z61) this.c;
                boolean z11 = view instanceof org.telegram.ui.i61;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.d61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                z61Var.i(i10, (org.telegram.ui.d61) view);
                                if (i18 != 1 && i18 != 11) {
                                    z61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            z61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                z61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.i61 i61Var = (org.telegram.ui.i61) view;
                        if (i61Var.s || (((p0Var = i61Var.x) != null && p0Var.a) || i18 == 13 || i18 == 14)) {
                            z61Var.l();
                            z61Var.r(i61Var, i61Var.x);
                        } else if (!i61Var.Q || (document = i61Var.d) == null) {
                            z61Var.o(i61Var, i61Var.e);
                        } else if (z61Var.W == 6) {
                            z61Var.p(i61Var, Long.valueOf(document.id), document, i61Var.v, null);
                        } else {
                            z61Var.p(i61Var, null, document, i61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            z61Var.performHapticFeedback(3, 1);
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
