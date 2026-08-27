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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ dm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.zo0 zo0Var;
        org.telegram.ui.vo0 vo0Var;
        int i11;
        int i12;
        ig.q0 q0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                jm0 jm0Var = (jm0) this.c;
                org.telegram.ui.ActionBar.n2 n2Var = jm0Var.C;
                im0 im0Var = jm0Var.c;
                MessageObject E = im0Var.E(i10);
                if (E != null) {
                    if (!jm0Var.E.f()) {
                        if (view instanceof fm0) {
                            org.telegram.ui.Cells.f7 f7Var = ((fm0) view).a;
                            MessageObject message = f7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (f7Var.C) {
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
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.st0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, jm0Var.B, n2Var);
                                    }
                                }
                            } else if (f7Var.B) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                f7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                f7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            jm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.e7) {
                            ((org.telegram.ui.Cells.e7) view).a();
                            break;
                        }
                    } else {
                        jm0Var.E.d(E, view, 0);
                        org.telegram.ui.a10 a10Var = jm0Var.F;
                        int id2 = E.getId();
                        a10Var.a = E.getDialogId();
                        a10Var.b = id2;
                        im0Var.m(i10);
                        if (!jm0Var.E.f()) {
                            im0Var.q(0, im0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.vo0 vo0Var2 = (org.telegram.ui.vo0) this.c;
                org.telegram.ui.ap0 ap0Var = vo0Var2.f0;
                ArrayList arrayList2 = vo0Var2.b0;
                if (!(view instanceof org.telegram.ui.uo0)) {
                    int i13 = vo0Var2.M;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = vo0Var2.P;
                        if (i10 >= i15 && i10 < vo0Var2.Q) {
                            int i16 = i10 - i15;
                            if (vo0Var2.B != null) {
                                if (vo0Var2.A != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            vo0Var2.r = 0L;
                                            vo0Var2.n = -1;
                                            vo0Var2.s = null;
                                            vo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        vo0Var2.r = 0L;
                                        vo0Var2.n = -1;
                                        vo0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        vo0Var2.v = null;
                                    }
                                    vo0Var2.y = tL_starGiftUnique;
                                    vo0Var2.i(true);
                                    vo0Var2.h();
                                    vo0Var2.f();
                                    org.telegram.ui.uo0 uo0Var = vo0Var2.x;
                                    if (uo0Var != null) {
                                        uo0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        vo0Var2.r = 0L;
                                        vo0Var2.n = -1;
                                        vo0Var2.y = null;
                                        vo0Var2.s = null;
                                        vo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    vo0Var2.r = 0L;
                                    vo0Var2.n = -1;
                                    vo0Var2.y = null;
                                    vo0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    vo0Var2.v = null;
                                }
                                vo0Var2.i(true);
                                vo0Var2.h();
                                vo0Var2.f();
                                org.telegram.ui.uo0 uo0Var2 = vo0Var2.x;
                                if (uo0Var2 != null) {
                                    uo0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        vo0Var2.n = -1;
                        vo0Var2.r = 0L;
                        vo0Var2.s = null;
                        vo0Var2.v = null;
                        vo0Var2.y = null;
                        vo0Var2.h();
                        if (i14 == 0) {
                            ap0Var.f.h();
                        }
                        org.telegram.ui.uo0 uo0Var3 = vo0Var2.x;
                        if (uo0Var3 != null) {
                            uo0Var3.b(true);
                        }
                        vo0Var2.i(true);
                        vo0Var2.f();
                        org.telegram.ui.vo0 vo0Var3 = ap0Var.h;
                        if (vo0Var3 != null && (zo0Var = vo0Var3.a) != null && (vo0Var = ap0Var.f) != null) {
                            zo0Var.a(vo0Var.n);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.uo0 uo0Var4 = (org.telegram.ui.uo0) view;
                    int i17 = vo0Var2.c0;
                    if (vo0Var2.e0 == null) {
                        i5 i5Var = uo0Var4.c;
                        org.telegram.ui.r51[] r51VarArr = new org.telegram.ui.r51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (i5Var != null) {
                            i5Var.f();
                            uo0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(i5Var.getBounds());
                            i12 = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(uo0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.ro0 ro0Var = new org.telegram.ui.ro0(vo0Var2, ap0Var, vo0Var2.getContext(), Integer.valueOf(i11), i17 == 1 ? 5 : 7, ap0Var.getResourceProvider(), i17 == 1 ? 24 : 16, uo0Var4.a(), uo0Var4, r51VarArr);
                        ro0Var.c1 = true;
                        long j11 = vo0Var2.r;
                        ro0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        ro0Var.setSaveState(3);
                        ro0Var.y(i5Var, uo0Var4);
                        org.telegram.ui.so0 so0Var = new org.telegram.ui.so0(vo0Var2, ro0Var);
                        vo0Var2.e0 = so0Var;
                        r51VarArr[0] = so0Var;
                        so0Var.showAsDropDown(uo0Var4, 0, i12, (LocaleController.isRTL ? 3 : 5) | 48);
                        r51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) this.c;
                boolean z11 = view instanceof org.telegram.ui.j51;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.e51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                a61Var.i(i10, (org.telegram.ui.e51) view);
                                if (i18 != 1 && i18 != 11) {
                                    a61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            a61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                a61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.j51 j51Var = (org.telegram.ui.j51) view;
                        if (j51Var.s || (((q0Var = j51Var.x) != null && q0Var.a) || i18 == 13 || i18 == 14)) {
                            a61Var.l();
                            a61Var.r(j51Var, j51Var.x);
                        } else if (!j51Var.M || (document = j51Var.d) == null) {
                            a61Var.o(j51Var, j51Var.e);
                        } else if (a61Var.S == 6) {
                            a61Var.p(j51Var, Long.valueOf(document.id), document, j51Var.v, null);
                        } else {
                            a61Var.p(j51Var, null, document, j51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            a61Var.performHapticFeedback(3, 1);
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
