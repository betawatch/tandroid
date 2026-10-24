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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nc extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ bd c;

    public nc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.R;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j10 = bdVar.a;
        int i16 = b1Var.f;
        View view = b1Var.a;
        if (i16 == 1) {
            tc tcVar = (tc) view;
            ro0 ro0Var = tcVar.a;
            sc scVar = tcVar.b;
            i11 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            ro0Var.b(i11, bdVar.s, false);
            scVar.b(bdVar.s, false);
            scVar.d(bdVar.w, false, false);
            scVar.setForum(bdVar.T0());
            scVar.e(DialogObject.getEmojiStatusDocumentId(bdVar.y), false, false);
            scVar.a(bdVar.f);
            return;
        }
        if (i16 == 3) {
            ((rc) view).a(bdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((ip0) view).a(bdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == bdVar.e0) {
                r8Var.k(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            r8Var.k(LocaleController.getString(bdVar.R0()), false);
            if (bdVar.b < bdVar.B0()) {
                r8Var.j(bdVar.B0());
                return;
            } else {
                r8Var.j(0);
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
                e9Var.setText(LocaleController.getString(bdVar.P0()));
                return;
            }
            if (i10 == bdVar.d0) {
                e9Var.setText(LocaleController.getString(bdVar.M0()));
                return;
            }
            if (i10 == bdVar.g0) {
                e9Var.setText(LocaleController.getString(bdVar.G0()));
                return;
            }
            if (i10 == bdVar.i0) {
                e9Var.setText(LocaleController.getString(bdVar.C0()));
                return;
            }
            if (i10 == bdVar.k0) {
                e9Var.setText(LocaleController.getString(bdVar.N0()));
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
        org.telegram.ui.ActionBar.n5 n5Var = ocVar.a;
        ocVar.setWillNotDraw(true);
        if (i10 == bdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            ocVar.a(i15, bdVar.f, true);
            n5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            ocVar.a(i14, bdVar.s, false);
            n5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = bdVar.e0 >= 0;
            ocVar.e = z10;
            ocVar.setWillNotDraw(!z10);
            if (bdVar.b < bdVar.L0()) {
                ocVar.e(bdVar.L0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            ocVar.a(i13, bdVar.s, false);
            n5Var.l(LocaleController.getString(bdVar.I0()), false);
            if (bdVar.b < bdVar.H0()) {
                ocVar.e(bdVar.H0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.h0) {
            if (i10 == bdVar.j0) {
                n5Var.l(LocaleController.getString(bdVar.O0()), false);
                ocVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    ocVar.c(0L, false, false);
                    return;
                } else {
                    ocVar.d(bdVar.E0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
        ocVar.a(i12, bdVar.s, false);
        n5Var.l(LocaleController.getString(bdVar.D0()), false);
        if (bdVar.b < bdVar.J0()) {
            ocVar.e(bdVar.J0());
        } else {
            ocVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            ocVar.c(0L, false, false);
        } else {
            ocVar.c(bdVar.F0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.g6 g6Var8;
        int i14;
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            h5Var = ((org.telegram.ui.ActionBar.o2) bdVar).parentLayout;
            int K0 = bdVar.K0();
            long j10 = bdVar.a;
            g6Var8 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(parentActivity, h5Var, K0, j10, g6Var8);
            gaVar.x = true;
            gaVar.setImportantForAccessibility(4);
            gaVar.r = bdVar;
            Drawable drawable = bdVar.H;
            i14 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            Drawable f7 = ei.r6.f(drawable, i14, bdVar.F, bdVar.J);
            bdVar.H = f7;
            gaVar.setOverrideBackground(f7);
            frameLayout = gaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var7 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, g6Var7);
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
                            bdVar2.Z0(true);
                            bdVar2.c1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.Z0(true);
                            bdVar3.d1();
                            bdVar3.b1(true);
                            break;
                    }
                }
            });
            frameLayout = zcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.r8(bdVar.getParentActivity(), bdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = bdVar.getParentActivity();
            g6Var6 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            oc ocVar = new oc(parentActivity3);
            ocVar.e = false;
            ocVar.d = g6Var6;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(parentActivity3);
            ocVar.a = n5Var;
            n5Var.setTextSize(16);
            org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, g6Var6);
            ocVar.addView(n5Var, w7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ocVar.c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, ocVar, false);
            frameLayout = ocVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var5 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, g6Var5);
            rcVar.b.setOnItemClickListener(new ci.x4(5, this, rcVar));
            frameLayout = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) bdVar).currentAccount;
            g6Var4 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            ip0 ip0Var = new ip0(0, i11, parentActivity5, g6Var4);
            ip0Var.setDivider(false);
            final int i16 = 1;
            ip0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.mc
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
                            bdVar2.Z0(true);
                            bdVar2.c1(true);
                            break;
                        default:
                            bd bdVar3 = this.b.c;
                            bdVar3.s = ((Integer) obj).intValue();
                            if (bdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                bdVar3.y = null;
                            }
                            bdVar3.Z0(true);
                            bdVar3.d1();
                            bdVar3.b1(true);
                            break;
                    }
                }
            });
            frameLayout = ip0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(bdVar, bdVar.getParentActivity());
            frameLayout = tcVar;
            if (bdVar.d) {
                tcVar.setTag(-33024);
                frameLayout = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            g6Var3 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.l4(parentActivity6, g6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            g6Var2 = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            frameLayout = new to0(parentActivity7, g6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            g6Var = ((org.telegram.ui.ActionBar.o2) bdVar).resourceProvider;
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(parentActivity8, g6Var);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(35);
            frameLayout = b10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        boolean z10 = view instanceof tc;
        bd bdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ga) {
                ((org.telegram.ui.Cells.ga) view).setOverrideBackground(bdVar.H);
                return;
            } else {
                bd.a1(view);
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
        scVar.setForum(bdVar.T0());
        scVar.a(bdVar.f);
    }
}
