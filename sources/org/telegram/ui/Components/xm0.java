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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ xm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.fp0 fp0Var;
        org.telegram.ui.bp0 bp0Var;
        int i11;
        int i12;
        mg.q0 q0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                dn0 dn0Var = (dn0) this.c;
                org.telegram.ui.ActionBar.p2 p2Var = dn0Var.D;
                cn0 cn0Var = dn0Var.c;
                MessageObject E = cn0Var.E(i10);
                if (E != null) {
                    if (!dn0Var.F.f()) {
                        if (view instanceof zm0) {
                            org.telegram.ui.Cells.i7 i7Var = ((zm0) view).a;
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
                                        PhotoViewer.t1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.yt0());
                                        break;
                                    } else {
                                        AndroidUtilities.openDocument(message, dn0Var.C, p2Var);
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
                            dn0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            ((org.telegram.ui.Cells.h7) view).a();
                            break;
                        }
                    } else {
                        dn0Var.F.d(E, view, 0);
                        org.telegram.ui.l10 l10Var = dn0Var.G;
                        int id2 = E.getId();
                        l10Var.a = E.getDialogId();
                        l10Var.b = id2;
                        cn0Var.m(i10);
                        if (!dn0Var.F.f()) {
                            cn0Var.q(0, cn0Var.c.r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.bp0 bp0Var2 = (org.telegram.ui.bp0) this.c;
                org.telegram.ui.gp0 gp0Var = bp0Var2.g0;
                ArrayList arrayList2 = bp0Var2.c0;
                if (!(view instanceof org.telegram.ui.ap0)) {
                    int i13 = bp0Var2.N;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = bp0Var2.Q;
                        if (i10 >= i15 && i10 < bp0Var2.R) {
                            int i16 = i10 - i15;
                            if (bp0Var2.C != null) {
                                if (bp0Var2.B != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            bp0Var2.r = 0L;
                                            bp0Var2.n = -1;
                                            bp0Var2.s = null;
                                            bp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        bp0Var2.r = 0L;
                                        bp0Var2.n = -1;
                                        bp0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        bp0Var2.v = null;
                                    }
                                    bp0Var2.y = tL_starGiftUnique;
                                    bp0Var2.i(true);
                                    bp0Var2.h();
                                    bp0Var2.f();
                                    org.telegram.ui.ap0 ap0Var = bp0Var2.x;
                                    if (ap0Var != null) {
                                        ap0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        bp0Var2.r = 0L;
                                        bp0Var2.n = -1;
                                        bp0Var2.y = null;
                                        bp0Var2.s = null;
                                        bp0Var2.v = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    bp0Var2.r = 0L;
                                    bp0Var2.n = -1;
                                    bp0Var2.y = null;
                                    bp0Var2.s = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    bp0Var2.v = null;
                                }
                                bp0Var2.i(true);
                                bp0Var2.h();
                                bp0Var2.f();
                                org.telegram.ui.ap0 ap0Var2 = bp0Var2.x;
                                if (ap0Var2 != null) {
                                    ap0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        bp0Var2.n = -1;
                        bp0Var2.r = 0L;
                        bp0Var2.s = null;
                        bp0Var2.v = null;
                        bp0Var2.y = null;
                        bp0Var2.h();
                        if (i14 == 0) {
                            gp0Var.f.h();
                        }
                        org.telegram.ui.ap0 ap0Var3 = bp0Var2.x;
                        if (ap0Var3 != null) {
                            ap0Var3.b(true);
                        }
                        bp0Var2.i(true);
                        bp0Var2.f();
                        org.telegram.ui.bp0 bp0Var3 = gp0Var.h;
                        if (bp0Var3 != null && (fp0Var = bp0Var3.a) != null && (bp0Var = gp0Var.f) != null) {
                            fp0Var.a(bp0Var.n);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.ap0 ap0Var4 = (org.telegram.ui.ap0) view;
                    int i17 = bp0Var2.d0;
                    if (bp0Var2.f0 == null) {
                        j5 j5Var = ap0Var4.c;
                        org.telegram.ui.g61[] g61VarArr = new org.telegram.ui.g61[1];
                        int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                        int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                        if (j5Var != null) {
                            j5Var.f();
                            ap0Var4.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(j5Var.getBounds());
                            i12 = i17 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(ap0Var4.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.xo0 xo0Var = new org.telegram.ui.xo0(bp0Var2, gp0Var, bp0Var2.getContext(), Integer.valueOf(i11), i17 == 1 ? 5 : 7, gp0Var.getResourceProvider(), i17 == 1 ? 24 : 16, ap0Var4.a(), ap0Var4, g61VarArr);
                        xo0Var.d1 = true;
                        long j11 = bp0Var2.r;
                        xo0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        xo0Var.setSaveState(3);
                        xo0Var.y(j5Var, ap0Var4);
                        org.telegram.ui.yo0 yo0Var = new org.telegram.ui.yo0(bp0Var2, xo0Var);
                        bp0Var2.f0 = yo0Var;
                        g61VarArr[0] = yo0Var;
                        yo0Var.showAsDropDown(ap0Var4, 0, i12, (LocaleController.isRTL ? 3 : 5) | 48);
                        g61VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) this.c;
                boolean z10 = view instanceof org.telegram.ui.y51;
                int i18 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.t51)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                q61Var.i(i10, (org.telegram.ui.t51) view);
                                if (i18 != 1 && i18 != 11) {
                                    q61Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            q61Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                q61Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.y51 y51Var = (org.telegram.ui.y51) view;
                        if (y51Var.s || (((q0Var = y51Var.x) != null && q0Var.a) || i18 == 13 || i18 == 14)) {
                            q61Var.l();
                            q61Var.r(y51Var, y51Var.x);
                        } else if (!y51Var.N || (document = y51Var.d) == null) {
                            q61Var.o(y51Var, y51Var.e);
                        } else if (q61Var.T == 6) {
                            q61Var.p(y51Var, Long.valueOf(document.id), document, y51Var.v, null);
                        } else {
                            q61Var.p(y51Var, null, document, y51Var.v, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            q61Var.performHapticFeedback(3, 1);
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
