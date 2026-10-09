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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nc extends org.telegram.ui.Components.pm0 {
    public final /* synthetic */ bd c;

    public nc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // s4.i0
    public final int h() {
        return this.c.R;
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j3 = bdVar.a;
        int i16 = d1Var.f;
        View view = d1Var.a;
        if (i16 == 1) {
            uc ucVar = (uc) view;
            gp0 gp0Var = ucVar.a;
            tc tcVar = ucVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            gp0Var.b(i11, bdVar.s, false);
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
            ((xp0) view).a(bdVar.s, false);
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
        oc ocVar = (oc) view;
        ocVar.e = false;
        org.telegram.ui.ActionBar.j5 j5Var = ocVar.a;
        ocVar.setWillNotDraw(true);
        if (i10 == bdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            ocVar.a(i15, bdVar.f, true);
            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            ocVar.a(i14, bdVar.s, false);
            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = bdVar.e0 >= 0;
            ocVar.e = z10;
            ocVar.setWillNotDraw(!z10);
            if (bdVar.b < bdVar.J0()) {
                ocVar.e(bdVar.J0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            ocVar.a(i13, bdVar.s, false);
            j5Var.l(LocaleController.getString(bdVar.G0()), false);
            if (bdVar.b < bdVar.F0()) {
                ocVar.e(bdVar.F0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.h0) {
            if (i10 == bdVar.j0) {
                j5Var.l(LocaleController.getString(bdVar.M0()), false);
                ocVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j3);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    ocVar.c(0L, false, false);
                    return;
                } else {
                    ocVar.d(bdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
        ocVar.a(i12, bdVar.s, false);
        j5Var.l(LocaleController.getString(bdVar.B0()), false);
        if (bdVar.b < bdVar.H0()) {
            ocVar.e(bdVar.H0());
        } else {
            ocVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j3);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            ocVar.c(0L, false, false);
        } else {
            ocVar.c(bdVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var4;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        int i13;
        org.telegram.ui.ActionBar.e6 e6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i14;
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j3 = bdVar.a;
            e6Var8 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, d5Var, I0, j3, e6Var8);
            gaVar.x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            frameLayout = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, e6Var7);
            zcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.F);
            if (wallpaperEmoticon == null && bdVar.F == null && bdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, false);
            zcVar.setGalleryWallpaper(bdVar.G);
            final int i15 = 0;
            zcVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.mc
                public final /* synthetic */ nc b;

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
            e6Var6 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            oc ocVar = new oc(parentActivity3);
            ocVar.e = false;
            ocVar.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            ocVar.a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var6));
            ocVar.addView(j5Var, w7.x5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            ocVar.c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, ocVar, false);
            frameLayout = ocVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, e6Var5);
            scVar.b.setOnItemClickListener(new ai.o6(5, this, scVar));
            frameLayout = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) bdVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            xp0 xp0Var = new xp0(0, i11, parentActivity5, e6Var4);
            xp0Var.setDivider(false);
            final int i16 = 1;
            xp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.mc
                public final /* synthetic */ nc b;

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
            frameLayout = xp0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            frameLayout = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                frameLayout = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, e6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            frameLayout = new ip0(parentActivity7, e6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.n2) bdVar).resourceProvider;
            org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(parentActivity8, e6Var);
            j10Var.setIsSingleCell(true);
            j10Var.setViewType(35);
            frameLayout = j10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        View view = d1Var.a;
        boolean z10 = view instanceof uc;
        bd bdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ga) {
                ((org.telegram.ui.Cells.ga) view).setOverrideBackground(bdVar.H);
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
