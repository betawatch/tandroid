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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ bd c;

    public oc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.R;
    }

    @Override // s4.h0
    public final int j(int i10) {
        bd bdVar = this.c;
        if (i10 == bdVar.S) {
            return 0;
        }
        if (i10 == bdVar.W) {
            return 2;
        }
        if (i10 == bdVar.Z) {
            return 1;
        }
        if (i10 == bdVar.T) {
            return 3;
        }
        if (i10 == bdVar.b0) {
            return 4;
        }
        if (i10 == bdVar.U || i10 == bdVar.c0 || i10 == bdVar.f0 || i10 == bdVar.h0 || i10 == bdVar.j0) {
            return 6;
        }
        return (i10 == bdVar.X || i10 == bdVar.e0) ? 5 : 7;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j3 = bdVar.a;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 1) {
            uc ucVar = (uc) view;
            hp0 hp0Var = ucVar.a;
            tc tcVar = ucVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            hp0Var.b(i11, bdVar.s, false);
            tcVar.b(bdVar.s, false);
            tcVar.d(bdVar.w, false, false);
            tcVar.setForum(bdVar.R0());
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), false, false);
            tcVar.a(bdVar.f);
            return;
        }
        if (i16 == 3) {
            ((sc) view).a(bdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((yp0) view).a(bdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == bdVar.e0) {
                r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            r8Var.i(LocaleController.getString(bdVar.P0()), false);
            if (bdVar.b < bdVar.z0()) {
                r8Var.h(bdVar.z0());
                return;
            } else {
                r8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setFixedSize(0);
            if (i10 == bdVar.a0) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            if (i10 == bdVar.V) {
                e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == bdVar.Y) {
                e9Var.setText(LocaleController.getString(bdVar.N0()));
                return;
            }
            if (i10 == bdVar.d0) {
                e9Var.setText(LocaleController.getString(bdVar.K0()));
                return;
            }
            if (i10 == bdVar.g0) {
                e9Var.setText(LocaleController.getString(bdVar.E0()));
                return;
            }
            if (i10 == bdVar.i0) {
                e9Var.setText(LocaleController.getString(bdVar.A0()));
                return;
            }
            if (i10 == bdVar.k0) {
                e9Var.setText(LocaleController.getString(bdVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    e9Var.setText("");
                    e9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        pc pcVar = (pc) view;
        pcVar.e = false;
        org.telegram.ui.ActionBar.j5 j5Var = pcVar.a;
        pcVar.setWillNotDraw(true);
        if (i10 == bdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            pcVar.a(i15, bdVar.f, true);
            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                pcVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                pcVar.e(0);
            }
            pcVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            pcVar.a(i14, bdVar.s, false);
            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = bdVar.e0 >= 0;
            pcVar.e = z10;
            pcVar.setWillNotDraw(!z10);
            if (bdVar.b < bdVar.J0()) {
                pcVar.e(bdVar.J0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            pcVar.a(i13, bdVar.s, false);
            j5Var.l(LocaleController.getString(bdVar.G0()), false);
            if (bdVar.b < bdVar.F0()) {
                pcVar.e(bdVar.F0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.h0) {
            if (i10 == bdVar.j0) {
                j5Var.l(LocaleController.getString(bdVar.M0()), false);
                pcVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j3);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    pcVar.c(0L, false, false);
                    return;
                } else {
                    pcVar.d(bdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        pcVar.a(i12, bdVar.s, false);
        j5Var.l(LocaleController.getString(bdVar.B0()), false);
        if (bdVar.b < bdVar.H0()) {
            pcVar.e(bdVar.H0());
        } else {
            pcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j3);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            pcVar.c(0L, false, false);
        } else {
            pcVar.c(bdVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j3 = bdVar.a;
            f6Var8 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(parentActivity, d5Var, I0, j3, f6Var8);
            iaVar.x = true;
            iaVar.setImportantForAccessibility(4);
            iaVar.r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            Drawable f7 = di.d7.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            iaVar.setOverrideBackground(f7);
            frameLayout = iaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, f6Var7);
            zcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, false);
            zcVar.setGalleryWallpaper(bdVar.G);
            final int i15 = 0;
            zcVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.nc
                public final /* synthetic */ oc b;

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
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
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
            frameLayout = new org.telegram.ui.Cells.r8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            pc pcVar = new pc(parentActivity3);
            pcVar.e = false;
            pcVar.d = f6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            pcVar.a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            pcVar.addView(j5Var, w7.x5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            pcVar.c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, pcVar, false);
            frameLayout = pcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, f6Var5);
            scVar.b.setOnItemClickListener(new bi.x5(5, this, scVar));
            frameLayout = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            yp0 yp0Var = new yp0(0, i11, parentActivity5, f6Var4);
            yp0Var.setDivider(false);
            final int i16 = 1;
            yp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.nc
                public final /* synthetic */ oc b;

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
                                bdVar2.F = bdVar2.G;
                            } else if (str.equals("❌")) {
                                bdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                bdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                bdVar2.F.settings.emoticon = str;
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
            frameLayout = yp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            frameLayout = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                frameLayout = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.l4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            frameLayout = new jp0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity8, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(35);
            frameLayout = t00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ia) {
                ((org.telegram.ui.Cells.ia) view).setOverrideBackground(bdVar.H);
                return;
            } else {
                bd.Y0(view);
                return;
            }
        }
        tc tcVar = ((uc) view).b;
        TLRPC.EmojiStatus emojiStatus = bdVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            tcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            tcVar.d(((TLRPC.TL_emojiStatusCollectible) bdVar.y).pattern_document_id, true, false);
        } else {
            tcVar.b(bdVar.s, false);
            tcVar.d(bdVar.w, false, false);
        }
        tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
        tcVar.setForum(bdVar.R0());
        tcVar.a(bdVar.f);
    }
}
