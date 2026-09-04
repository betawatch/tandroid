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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm0 implements zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ pm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.zp0 zp0Var;
        org.telegram.ui.vp0 vp0Var;
        int i11;
        int i12;
        ah.j1 j1Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                vm0 vm0Var = (vm0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = vm0Var.G;
                um0 um0Var = vm0Var.c;
                MessageObject E = um0Var.E(i10);
                if (E != null) {
                    if (!vm0Var.I.g()) {
                        if (view instanceof rm0) {
                            org.telegram.ui.Cells.j7 j7Var = ((rm0) view).a;
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
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, n2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.su0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, vm0Var.F, n2Var);
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
                            vm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            ((org.telegram.ui.Cells.i7) view).a();
                            break;
                        }
                    } else {
                        vm0Var.I.d(E, view, 0);
                        org.telegram.ui.p10 p10Var = vm0Var.J;
                        int id2 = E.getId();
                        p10Var.a = E.getDialogId();
                        p10Var.b = id2;
                        um0Var.m(i10);
                        if (!vm0Var.I.g()) {
                            um0Var.q(0, um0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.vp0 vp0Var2 = (org.telegram.ui.vp0) this.c;
                org.telegram.ui.bq0 bq0Var = vp0Var2.p0;
                ArrayList arrayList2 = vp0Var2.l0;
                if (!(view instanceof org.telegram.ui.up0)) {
                    int i13 = vp0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = vp0Var2.b0;
                        if (i10 >= i15 && i10 < vp0Var2.c0) {
                            int i16 = i10 - i15;
                            if (vp0Var2.K != null) {
                                if (vp0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            vp0Var2.n = 0L;
                                            vp0Var2.h = -1;
                                            vp0Var2.r = null;
                                            vp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        vp0Var2.n = 0L;
                                        vp0Var2.h = -1;
                                        vp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        vp0Var2.s = null;
                                    }
                                    vp0Var2.I = tL_starGiftUnique;
                                    vp0Var2.j(true);
                                    vp0Var2.i();
                                    vp0Var2.f(true);
                                    org.telegram.ui.up0 up0Var = vp0Var2.y;
                                    if (up0Var != null) {
                                        up0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        vp0Var2.n = 0L;
                                        vp0Var2.h = -1;
                                        vp0Var2.I = null;
                                        vp0Var2.r = null;
                                        vp0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    vp0Var2.n = 0L;
                                    vp0Var2.h = -1;
                                    vp0Var2.I = null;
                                    vp0Var2.r = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    vp0Var2.s = null;
                                }
                                vp0Var2.j(true);
                                vp0Var2.i();
                                vp0Var2.f(true);
                                org.telegram.ui.up0 up0Var2 = vp0Var2.y;
                                if (up0Var2 != null) {
                                    up0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        vp0Var2.h = -1;
                        vp0Var2.n = 0L;
                        vp0Var2.r = null;
                        vp0Var2.s = null;
                        vp0Var2.I = null;
                        vp0Var2.i();
                        if (i14 == 0) {
                            bq0Var.h.i();
                        }
                        org.telegram.ui.up0 up0Var3 = vp0Var2.y;
                        if (up0Var3 != null) {
                            up0Var3.b(true);
                        }
                        vp0Var2.j(true);
                        vp0Var2.f(true);
                        org.telegram.ui.vp0 vp0Var3 = bq0Var.n;
                        if (vp0Var3 != null && (zp0Var = vp0Var3.a) != null && (vp0Var = bq0Var.h) != null) {
                            zp0Var.a(vp0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.up0 up0Var4 = (org.telegram.ui.up0) view;
                    int i17 = vp0Var2.m0;
                    if (vp0Var2.o0 == null) {
                        o5 o5Var = up0Var4.c;
                        org.telegram.ui.a71[] a71VarArr = new org.telegram.ui.a71[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (o5Var != null) {
                            o5Var.f();
                            up0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(o5Var.getBounds());
                            int dp = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(up0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = AndroidUtilities.dp(12.0f) + (rect.centerX() - (AndroidUtilities.displaySize.x - min2));
                            i11 = dp;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.rp0 rp0Var = new org.telegram.ui.rp0(vp0Var2, bq0Var, vp0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, bq0Var.getResourceProvider(), i17 == 1 ? 24 : 16, up0Var4.a(), up0Var4, a71VarArr);
                        rp0Var.g1 = true;
                        long j10 = vp0Var2.n;
                        rp0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        rp0Var.setSaveState(3);
                        rp0Var.y(o5Var, up0Var4);
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(vp0Var2, rp0Var);
                        vp0Var2.o0 = sp0Var;
                        a71VarArr[0] = sp0Var;
                        sp0Var.showAsDropDown(up0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        a71VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) this.c;
                boolean z11 = view instanceof org.telegram.ui.s61;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.n61)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                j71Var.i(i10, (org.telegram.ui.n61) view);
                                if (i18 != 1 && i18 != 11) {
                                    j71Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            j71Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                j71Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.s61 s61Var = (org.telegram.ui.s61) view;
                        if (s61Var.s || (((j1Var = s61Var.x) != null && j1Var.a) || i18 == 13 || i18 == 14)) {
                            j71Var.l();
                            j71Var.r(s61Var, s61Var.x);
                        } else if (!s61Var.Q || (document = s61Var.d) == null) {
                            j71Var.o(s61Var, s61Var.e);
                        } else if (j71Var.W == 6) {
                            j71Var.p(s61Var, Long.valueOf(document.id), document, s61Var.v, null);
                        } else {
                            j71Var.p(s61Var, null, document, s61Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            j71Var.performHapticFeedback(3, 1);
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
