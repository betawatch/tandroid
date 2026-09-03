package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ dd c;

    public pc(dd ddVar) {
        this.c = ddVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.O;
    }

    @Override // f2.o0
    public final int j(int i10) {
        dd ddVar = this.c;
        if (i10 == ddVar.P) {
            return 0;
        }
        if (i10 == ddVar.T) {
            return 2;
        }
        if (i10 == ddVar.W) {
            return 1;
        }
        if (i10 == ddVar.Q) {
            return 3;
        }
        if (i10 == ddVar.Y) {
            return 4;
        }
        if (i10 == ddVar.R || i10 == ddVar.Z || i10 == ddVar.c0 || i10 == ddVar.e0 || i10 == ddVar.g0) {
            return 6;
        }
        return (i10 == ddVar.U || i10 == ddVar.b0) ? 5 : 7;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        dd ddVar = this.c;
        long j10 = ddVar.a;
        int i16 = l1Var.f;
        View view = l1Var.a;
        if (i16 == 1) {
            wc wcVar = (wc) view;
            to0 to0Var = wcVar.a;
            vc vcVar = wcVar.b;
            i11 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            to0Var.b(i11, ddVar.s, false);
            vcVar.b(ddVar.s, false);
            vcVar.d(ddVar.w, false, false);
            vcVar.setForum(ddVar.R0());
            vcVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.y), false, false);
            vcVar.a(ddVar.f);
            return;
        }
        if (i16 == 3) {
            ((uc) view).a(ddVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((kp0) view).a(ddVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (i10 == ddVar.b0) {
                n8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            n8Var.i(LocaleController.getString(ddVar.P0()), false);
            if (ddVar.b < ddVar.z0()) {
                n8Var.h(ddVar.z0());
                return;
            } else {
                n8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i10 == ddVar.X) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
            if (i10 == ddVar.S) {
                z8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == ddVar.V) {
                z8Var.setText(LocaleController.getString(ddVar.N0()));
                return;
            }
            if (i10 == ddVar.a0) {
                z8Var.setText(LocaleController.getString(ddVar.K0()));
                return;
            }
            if (i10 == ddVar.d0) {
                z8Var.setText(LocaleController.getString(ddVar.E0()));
                return;
            }
            if (i10 == ddVar.f0) {
                z8Var.setText(LocaleController.getString(ddVar.A0()));
                return;
            }
            if (i10 == ddVar.h0) {
                z8Var.setText(LocaleController.getString(ddVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        qc qcVar = (qc) view;
        qcVar.e = false;
        org.telegram.ui.ActionBar.k5 k5Var = qcVar.a;
        qcVar.setWillNotDraw(true);
        if (i10 == ddVar.R) {
            i15 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            qcVar.a(i15, ddVar.f, true);
            k5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (ddVar.b < ddVar.getMessagesController().channelBgIconLevelMin) {
                qcVar.e(ddVar.getMessagesController().channelBgIconLevelMin);
            } else {
                qcVar.e(0);
            }
            qcVar.c(ddVar.n, false, false);
            return;
        }
        if (i10 == ddVar.Z) {
            i14 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            qcVar.a(i14, ddVar.s, false);
            k5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z4 = ddVar.b0 >= 0;
            qcVar.e = z4;
            qcVar.setWillNotDraw(!z4);
            if (ddVar.b < ddVar.J0()) {
                qcVar.e(ddVar.J0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(ddVar.w, false, false);
            return;
        }
        if (i10 == ddVar.c0) {
            i13 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            qcVar.a(i13, ddVar.s, false);
            k5Var.l(LocaleController.getString(ddVar.G0()), false);
            if (ddVar.b < ddVar.F0()) {
                qcVar.e(ddVar.F0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(DialogObject.getEmojiStatusDocumentId(ddVar.y), DialogObject.isEmojiStatusCollectible(ddVar.y), false);
            return;
        }
        if (i10 != ddVar.e0) {
            if (i10 == ddVar.g0) {
                k5Var.l(LocaleController.getString(ddVar.M0()), false);
                qcVar.e(0);
                TLRPC.ChatFull chatFull = ddVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    qcVar.c(0L, false, false);
                    return;
                } else {
                    qcVar.d(ddVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
        qcVar.a(i12, ddVar.s, false);
        k5Var.l(LocaleController.getString(ddVar.B0()), false);
        if (ddVar.b < ddVar.H0()) {
            qcVar.e(ddVar.H0());
        } else {
            qcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = ddVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            qcVar.c(0L, false, false);
        } else {
            qcVar.c(ddVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        org.telegram.ui.ActionBar.f6 f6Var6;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        dd ddVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = ddVar.getParentActivity();
            e5Var = ((org.telegram.ui.ActionBar.p2) ddVar).parentLayout;
            int I0 = ddVar.I0();
            long j10 = ddVar.a;
            f6Var8 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(parentActivity, e5Var, I0, j10, f6Var8);
            daVar.x = true;
            daVar.setImportantForAccessibility(4);
            daVar.r = ddVar;
            Drawable drawable = ddVar.E;
            i14 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            Drawable f10 = ph.k5.f(drawable, i14, ddVar.C, ddVar.G);
            ddVar.E = f10;
            daVar.setOverrideBackground(f10);
            frameLayout = daVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = ddVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            bd bdVar = new bd(i13, parentActivity2, f6Var7);
            bdVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(ddVar.C);
            if (wallpaperEmoticon == null && ddVar.C == null && ddVar.D != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar.a(wallpaperEmoticon, false);
            bdVar.setGalleryWallpaper(ddVar.D);
            final int i15 = 0;
            bdVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.b.c;
                            if (str == null) {
                                ddVar2.C = ddVar2.D;
                            } else if (str.equals("❌")) {
                                ddVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.C.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            break;
                        default:
                            dd ddVar3 = this.b.c;
                            ddVar3.s = ((Integer) obj).intValue();
                            if (ddVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = bdVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.n8(ddVar.getParentActivity(), ddVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = ddVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            qc qcVar = new qc(parentActivity3);
            qcVar.e = false;
            qcVar.d = f6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            qcVar.a = k5Var;
            k5Var.setTextSize(16);
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            qcVar.addView(k5Var, k7.b6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            qcVar.c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, qcVar, false);
            frameLayout = qcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = ddVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            uc ucVar = new uc(i12, parentActivity4, f6Var5);
            ucVar.b.setOnItemClickListener(new gg.v0(6, this, ucVar));
            frameLayout = ucVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = ddVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) ddVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            kp0 kp0Var = new kp0(0, i11, parentActivity5, f6Var4);
            kp0Var.setDivider(false);
            final int i16 = 1;
            kp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.b.c;
                            if (str == null) {
                                ddVar2.C = ddVar2.D;
                            } else if (str.equals("❌")) {
                                ddVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.C.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            break;
                        default:
                            dd ddVar3 = this.b.c;
                            ddVar3.s = ((Integer) obj).intValue();
                            if (ddVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = kp0Var;
        } else if (i10 == 1) {
            FrameLayout wcVar = new wc(ddVar, ddVar.getParentActivity());
            frameLayout = wcVar;
            if (ddVar.d) {
                wcVar.setTag(-33024);
                frameLayout = wcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = ddVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.l4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = ddVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            frameLayout = new vo0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = ddVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.p2) ddVar).resourceProvider;
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity8, f6Var);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(35);
            frameLayout = u00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.z8(ddVar.getParentActivity());
        }
        return new org.telegram.ui.Components.dl0(frameLayout);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        View view = l1Var.a;
        boolean z4 = view instanceof wc;
        dd ddVar = this.c;
        if (!z4) {
            if (view instanceof org.telegram.ui.Cells.da) {
                ((org.telegram.ui.Cells.da) view).setOverrideBackground(ddVar.E);
                return;
            } else {
                dd.Y0(view);
                return;
            }
        }
        vc vcVar = ((wc) view).b;
        TLRPC.EmojiStatus emojiStatus = ddVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            vcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            vcVar.d(((TLRPC.TL_emojiStatusCollectible) ddVar.y).pattern_document_id, true, false);
        } else {
            vcVar.b(ddVar.s, false);
            vcVar.d(ddVar.w, false, false);
        }
        vcVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.y), DialogObject.isEmojiStatusCollectible(ddVar.y), false);
        vcVar.setForum(ddVar.R0());
        vcVar.a(ddVar.f);
    }
}
