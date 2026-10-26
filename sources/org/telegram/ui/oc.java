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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ bd c;

    public oc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j10 = bdVar.a;
        int i16 = e1Var.f;
        View view = e1Var.a;
        if (i16 == 1) {
            uc ucVar = (uc) view;
            xo0 xo0Var = ucVar.a;
            tc tcVar = ucVar.b;
            i11 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            xo0Var.b(i11, bdVar.s, false);
            tcVar.b(bdVar.s, false);
            tcVar.d(bdVar.w, false, false);
            tcVar.setForum(bdVar.U0());
            tcVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), false, false);
            tcVar.a(bdVar.f);
            return;
        }
        if (i16 == 3) {
            ((sc) view).a(bdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((op0) view).a(bdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            if (i10 == bdVar.e0) {
                v8Var.k(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            v8Var.k(LocaleController.getString(bdVar.S0()), false);
            if (bdVar.b < bdVar.C0()) {
                v8Var.j(bdVar.C0());
                return;
            } else {
                v8Var.j(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setFixedSize(0);
            if (i10 == bdVar.a0) {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            }
            if (i10 == bdVar.V) {
                i9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == bdVar.Y) {
                i9Var.setText(LocaleController.getString(bdVar.Q0()));
                return;
            }
            if (i10 == bdVar.d0) {
                i9Var.setText(LocaleController.getString(bdVar.N0()));
                return;
            }
            if (i10 == bdVar.g0) {
                i9Var.setText(LocaleController.getString(bdVar.H0()));
                return;
            }
            if (i10 == bdVar.i0) {
                i9Var.setText(LocaleController.getString(bdVar.D0()));
                return;
            }
            if (i10 == bdVar.k0) {
                i9Var.setText(LocaleController.getString(bdVar.O0()));
                return;
            } else {
                if (i10 == 0) {
                    i9Var.setText("");
                    i9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        pc pcVar = (pc) view;
        pcVar.e = false;
        org.telegram.ui.ActionBar.b6 b6Var = pcVar.a;
        pcVar.setWillNotDraw(true);
        if (i10 == bdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            pcVar.a(i15, bdVar.f, true);
            b6Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                pcVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                pcVar.e(0);
            }
            pcVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            pcVar.a(i14, bdVar.s, false);
            b6Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = bdVar.e0 >= 0;
            pcVar.e = z10;
            pcVar.setWillNotDraw(!z10);
            if (bdVar.b < bdVar.M0()) {
                pcVar.e(bdVar.M0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            pcVar.a(i13, bdVar.s, false);
            b6Var.l(LocaleController.getString(bdVar.J0()), false);
            if (bdVar.b < bdVar.I0()) {
                pcVar.e(bdVar.I0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.h0) {
            if (i10 == bdVar.j0) {
                b6Var.l(LocaleController.getString(bdVar.P0()), false);
                pcVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    pcVar.c(0L, false, false);
                    return;
                } else {
                    pcVar.d(bdVar.F0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
        pcVar.a(i12, bdVar.s, false);
        b6Var.l(LocaleController.getString(bdVar.E0()), false);
        if (bdVar.b < bdVar.K0()) {
            pcVar.e(bdVar.K0());
        } else {
            pcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            pcVar.c(0L, false, false);
        } else {
            pcVar.c(bdVar.G0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var4;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        int i13;
        org.telegram.ui.ActionBar.u6 u6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.u6 u6Var8;
        int i14;
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            j5Var = ((org.telegram.ui.ActionBar.r2) bdVar).parentLayout;
            int L0 = bdVar.L0();
            long j10 = bdVar.a;
            u6Var8 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(parentActivity, j5Var, L0, j10, u6Var8);
            kaVar.x = true;
            kaVar.setImportantForAccessibility(4);
            kaVar.r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            Drawable f7 = fi.o6.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            kaVar.setOverrideBackground(f7);
            frameLayout = kaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var7 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, u6Var7);
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
                            bdVar2.a1(true);
                            bdVar2.d1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.a1(true);
                            bdVar3.e1();
                            bdVar3.c1(true);
                            break;
                    }
                }
            });
            frameLayout = zcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.v8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            u6Var6 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            pc pcVar = new pc(parentActivity3);
            pcVar.e = false;
            pcVar.d = u6Var6;
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(parentActivity3);
            pcVar.a = b6Var;
            b6Var.setTextSize(16);
            org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, u6Var6);
            pcVar.addView(b6Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            pcVar.c = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, pcVar, false);
            frameLayout = pcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var5 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, u6Var5);
            scVar.b.setOnItemClickListener(new di.x4(5, this, scVar));
            frameLayout = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.r2) bdVar).currentAccount;
            u6Var4 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            op0 op0Var = new op0(0, i11, parentActivity5, u6Var4);
            op0Var.setDivider(false);
            final int i16 = 1;
            op0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.nc
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
                            bdVar2.a1(true);
                            bdVar2.d1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.a1(true);
                            bdVar3.e1();
                            bdVar3.c1(true);
                            break;
                    }
                }
            });
            frameLayout = op0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            frameLayout = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                frameLayout = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            u6Var3 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.q4(parentActivity6, u6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            u6Var2 = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            frameLayout = new zo0(parentActivity7, u6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            u6Var = ((org.telegram.ui.ActionBar.r2) bdVar).resourceProvider;
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(parentActivity8, u6Var);
            c10Var.setIsSingleCell(true);
            c10Var.setViewType(35);
            frameLayout = c10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.i9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.vl0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        View view = e1Var.a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ka) {
                ((org.telegram.ui.Cells.ka) view).setOverrideBackground(bdVar.H);
                return;
            } else {
                bd.b1(view);
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
        tcVar.setForum(bdVar.U0());
        tcVar.a(bdVar.f);
    }
}
