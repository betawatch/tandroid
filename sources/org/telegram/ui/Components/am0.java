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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ am0(FrameLayout frameLayout, int i9, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i9;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.yo0 yo0Var;
        org.telegram.ui.uo0 uo0Var;
        int i10;
        int i11;
        hg.r0 r0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                gm0 gm0Var = (gm0) this.c;
                org.telegram.ui.ActionBar.o2 o2Var = gm0Var.C;
                fm0 fm0Var = gm0Var.c;
                MessageObject E = fm0Var.E(i9);
                if (E != null) {
                    if (!gm0Var.E.f()) {
                        if (view instanceof cm0) {
                            org.telegram.ui.Cells.i7 i7Var = ((cm0) view).a;
                            MessageObject message = i7Var.getMessage();
                            TLRPC.Document document2 = message.getDocument();
                            if (i7Var.C) {
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
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.t1().K2(null, o2Var, null);
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.rt0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, gm0Var.B, o2Var);
                                    }
                                }
                            } else if (i7Var.B) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                i7Var.f(true);
                            } else {
                                E.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, E, 0, 0);
                                i7Var.f(true);
                                DownloadController.getInstance(this.b).updateFilesLoadingPriority();
                            }
                            gm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).a();
                            break;
                        }
                    } else {
                        gm0Var.E.d(E, view, 0);
                        org.telegram.ui.x00 x00Var = gm0Var.F;
                        int id2 = E.getId();
                        x00Var.a = E.getDialogId();
                        x00Var.b = id2;
                        fm0Var.m(i9);
                        if (!gm0Var.E.f()) {
                            fm0Var.q(0, fm0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.uo0 uo0Var2 = (org.telegram.ui.uo0) this.c;
                org.telegram.ui.zo0 zo0Var = uo0Var2.f0;
                ArrayList arrayList2 = uo0Var2.b0;
                if (!(view instanceof org.telegram.ui.to0)) {
                    int i12 = uo0Var2.M;
                    int i13 = this.b;
                    if (i9 != i12) {
                        int i14 = uo0Var2.P;
                        if (i9 >= i14 && i9 < uo0Var2.Q) {
                            int i15 = i9 - i14;
                            if (uo0Var2.B != null) {
                                if (uo0Var2.A != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            uo0Var2.r = 0L;
                                            uo0Var2.n = -1;
                                            uo0Var2.s = null;
                                            uo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        uo0Var2.r = 0L;
                                        uo0Var2.n = -1;
                                        uo0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        uo0Var2.v = null;
                                    }
                                    uo0Var2.y = tL_starGiftUnique;
                                    uo0Var2.i(true);
                                    uo0Var2.h();
                                    uo0Var2.f();
                                    org.telegram.ui.to0 to0Var = uo0Var2.x;
                                    if (to0Var != null) {
                                        to0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        uo0Var2.r = 0L;
                                        uo0Var2.n = -1;
                                        uo0Var2.y = null;
                                        uo0Var2.s = null;
                                        uo0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    uo0Var2.r = 0L;
                                    uo0Var2.n = -1;
                                    uo0Var2.y = null;
                                    uo0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    uo0Var2.v = null;
                                }
                                uo0Var2.i(true);
                                uo0Var2.h();
                                uo0Var2.f();
                                org.telegram.ui.to0 to0Var2 = uo0Var2.x;
                                if (to0Var2 != null) {
                                    to0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        uo0Var2.n = -1;
                        uo0Var2.r = 0L;
                        uo0Var2.s = null;
                        uo0Var2.v = null;
                        uo0Var2.y = null;
                        uo0Var2.h();
                        if (i13 == 0) {
                            zo0Var.f.h();
                        }
                        org.telegram.ui.to0 to0Var3 = uo0Var2.x;
                        if (to0Var3 != null) {
                            to0Var3.b(true);
                        }
                        uo0Var2.i(true);
                        uo0Var2.f();
                        org.telegram.ui.uo0 uo0Var3 = zo0Var.h;
                        if (uo0Var3 != null && (yo0Var = uo0Var3.a) != null && (uo0Var = zo0Var.f) != null) {
                            yo0Var.a(uo0Var.n);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.to0 to0Var4 = (org.telegram.ui.to0) view;
                    int i16 = uo0Var2.c0;
                    if (uo0Var2.e0 == null) {
                        i5 i5Var = to0Var4.c;
                        org.telegram.ui.s51[] s51VarArr = new org.telegram.ui.s51[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (i5Var != null) {
                            i5Var.f();
                            to0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(i5Var.getBounds());
                            i11 = i16 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(to0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i10 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.qo0 qo0Var = new org.telegram.ui.qo0(uo0Var2, zo0Var, uo0Var2.getContext(), Integer.valueOf(i10), i16 == 1 ? 5 : 7, zo0Var.getResourceProvider(), i16 == 1 ? 24 : 16, to0Var4.a(), to0Var4, s51VarArr);
                        qo0Var.c1 = true;
                        long j11 = uo0Var2.r;
                        qo0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        qo0Var.setSaveState(3);
                        qo0Var.y(i5Var, to0Var4);
                        org.telegram.ui.ro0 ro0Var = new org.telegram.ui.ro0(uo0Var2, qo0Var);
                        uo0Var2.e0 = ro0Var;
                        s51VarArr[0] = ro0Var;
                        ro0Var.showAsDropDown(to0Var4, 0, i11, (LocaleController.isRTL ? 3 : 5) | 48);
                        s51VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) this.c;
                boolean z11 = view instanceof org.telegram.ui.k51;
                int i17 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.f51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                b61Var.i(i9, (org.telegram.ui.f51) view);
                                if (i17 != 1 && i17 != 11) {
                                    b61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            b61Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                b61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.k51 k51Var = (org.telegram.ui.k51) view;
                        if (k51Var.s || (((r0Var = k51Var.x) != null && r0Var.a) || i17 == 13 || i17 == 14)) {
                            b61Var.l();
                            b61Var.r(k51Var, k51Var.x);
                        } else if (!k51Var.M || (document = k51Var.d) == null) {
                            b61Var.o(k51Var, k51Var.e);
                        } else if (b61Var.S == 6) {
                            b61Var.p(k51Var, Long.valueOf(document.id), document, k51Var.v, null);
                        } else {
                            b61Var.p(k51Var, null, document, k51Var.v, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            b61Var.performHapticFeedback(3, 1);
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
