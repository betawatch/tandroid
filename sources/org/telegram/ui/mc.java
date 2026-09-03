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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mc extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ bd c;

    public mc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.O;
    }

    @Override // f2.p0
    public final int j(int i10) {
        bd bdVar = this.c;
        if (i10 == bdVar.P) {
            return 0;
        }
        if (i10 == bdVar.T) {
            return 2;
        }
        if (i10 == bdVar.W) {
            return 1;
        }
        if (i10 == bdVar.Q) {
            return 3;
        }
        if (i10 == bdVar.Y) {
            return 4;
        }
        if (i10 == bdVar.R || i10 == bdVar.Z || i10 == bdVar.c0 || i10 == bdVar.e0 || i10 == bdVar.g0) {
            return 6;
        }
        return (i10 == bdVar.U || i10 == bdVar.b0) ? 5 : 7;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j10 = bdVar.a;
        int i16 = m1Var.f;
        View view = m1Var.a;
        if (i16 == 1) {
            tc tcVar = (tc) view;
            to0 to0Var = tcVar.a;
            sc scVar = tcVar.b;
            i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            to0Var.b(i11, bdVar.s, false);
            scVar.b(bdVar.s, false);
            scVar.d(bdVar.w, false, false);
            scVar.setForum(bdVar.R0());
            scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), false, false);
            scVar.a(bdVar.f);
            return;
        }
        if (i16 == 3) {
            ((rc) view).a(bdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((kp0) view).a(bdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (i10 == bdVar.b0) {
                o8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            o8Var.i(LocaleController.getString(bdVar.P0()), false);
            if (bdVar.b < bdVar.z0()) {
                o8Var.h(bdVar.z0());
                return;
            } else {
                o8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i10 == bdVar.X) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
            if (i10 == bdVar.S) {
                a9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == bdVar.V) {
                a9Var.setText(LocaleController.getString(bdVar.N0()));
                return;
            }
            if (i10 == bdVar.a0) {
                a9Var.setText(LocaleController.getString(bdVar.K0()));
                return;
            }
            if (i10 == bdVar.d0) {
                a9Var.setText(LocaleController.getString(bdVar.E0()));
                return;
            }
            if (i10 == bdVar.f0) {
                a9Var.setText(LocaleController.getString(bdVar.A0()));
                return;
            }
            if (i10 == bdVar.h0) {
                a9Var.setText(LocaleController.getString(bdVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        nc ncVar = (nc) view;
        ncVar.e = false;
        org.telegram.ui.ActionBar.l5 l5Var = ncVar.a;
        ncVar.setWillNotDraw(true);
        if (i10 == bdVar.R) {
            i15 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ncVar.a(i15, bdVar.f, true);
            l5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                ncVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                ncVar.e(0);
            }
            ncVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.Z) {
            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ncVar.a(i14, bdVar.s, false);
            l5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z4 = bdVar.b0 >= 0;
            ncVar.e = z4;
            ncVar.setWillNotDraw(!z4);
            if (bdVar.b < bdVar.J0()) {
                ncVar.e(bdVar.J0());
            } else {
                ncVar.e(0);
            }
            ncVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ncVar.a(i13, bdVar.s, false);
            l5Var.l(LocaleController.getString(bdVar.G0()), false);
            if (bdVar.b < bdVar.F0()) {
                ncVar.e(bdVar.F0());
            } else {
                ncVar.e(0);
            }
            ncVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.e0) {
            if (i10 == bdVar.g0) {
                l5Var.l(LocaleController.getString(bdVar.M0()), false);
                ncVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    ncVar.c(0L, false, false);
                    return;
                } else {
                    ncVar.d(bdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        ncVar.a(i12, bdVar.s, false);
        l5Var.l(LocaleController.getString(bdVar.B0()), false);
        if (bdVar.b < bdVar.H0()) {
            ncVar.e(bdVar.H0());
        } else {
            ncVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            ncVar.c(0L, false, false);
        } else {
            ncVar.c(bdVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.g6 g6Var8;
        int i14;
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            f5Var = ((org.telegram.ui.ActionBar.p2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j10 = bdVar.a;
            g6Var8 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(parentActivity, f5Var, I0, j10, g6Var8);
            eaVar.x = true;
            eaVar.setImportantForAccessibility(4);
            eaVar.r = bdVar;
            Drawable drawable = bdVar.E;
            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            Drawable f10 = qh.i5.f(drawable, i14, bdVar.C, bdVar.G);
            bdVar.E = f10;
            eaVar.setOverrideBackground(f10);
            frameLayout = eaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var7 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, g6Var7);
            zcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.C);
            if (wallpaperEmoticon == null && bdVar.C == null && bdVar.D != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, false);
            zcVar.setGalleryWallpaper(bdVar.D);
            final int i15 = 0;
            zcVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.lc
                public final /* synthetic */ mc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.b.c;
                            if (str == null) {
                                bdVar2.C = bdVar2.D;
                            } else if (str.equals("❌")) {
                                bdVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.C.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = zcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.o8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            g6Var6 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            nc ncVar = new nc(parentActivity3);
            ncVar.e = false;
            ncVar.d = g6Var6;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(parentActivity3);
            ncVar.a = l5Var;
            l5Var.setTextSize(16);
            l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var6));
            ncVar.addView(l5Var, k7.c6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ncVar.c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, ncVar, false);
            frameLayout = ncVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var5 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, g6Var5);
            rcVar.b.setOnItemClickListener(new hg.v0(5, this, rcVar));
            frameLayout = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            kp0 kp0Var = new kp0(0, i11, parentActivity5, g6Var4);
            kp0Var.setDivider(false);
            final int i16 = 1;
            kp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.lc
                public final /* synthetic */ mc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            bd bdVar2 = this.b.c;
                            if (str == null) {
                                bdVar2.C = bdVar2.D;
                            } else if (str.equals("❌")) {
                                bdVar2.C = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.C = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.C.settings.emoticon = str;
                            }
                            bdVar2.X0(true);
                            bdVar2.a1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.X0(true);
                            bdVar3.b1();
                            bdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = kp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(bdVar, bdVar.getParentActivity());
            frameLayout = tcVar;
            if (bdVar.d) {
                tcVar.setTag(-33024);
                frameLayout = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            g6Var3 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, g6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            g6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            frameLayout = new vo0(parentActivity7, g6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            g6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(parentActivity8, g6Var);
            u00Var.setIsSingleCell(true);
            u00Var.setViewType(35);
            frameLayout = u00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }

    @Override // f2.p0
    public final void y(f2.m1 m1Var) {
        View view = m1Var.a;
        boolean z4 = view instanceof tc;
        bd bdVar = this.c;
        if (!z4) {
            if (view instanceof org.telegram.ui.Cells.ea) {
                ((org.telegram.ui.Cells.ea) view).setOverrideBackground(bdVar.E);
                return;
            } else {
                bd.Y0(view);
                return;
            }
        }
        sc scVar = ((tc) view).b;
        TLRPC.EmojiStatus emojiStatus = bdVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            scVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.y).pattern_document_id, true, false);
        } else {
            scVar.b(bdVar.s, false);
            scVar.d(bdVar.w, false, false);
        }
        scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
        scVar.setForum(bdVar.R0());
        scVar.a(bdVar.f);
    }
}
