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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nc extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ bd c;

    public nc(bd bdVar) {
        this.c = bdVar;
    }

    @Override // org.telegram.ui.Components.rl0
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        bd bdVar = this.c;
        long j10 = bdVar.a;
        int i16 = l1Var.f;
        View view = l1Var.a;
        if (i16 == 1) {
            uc ucVar = (uc) view;
            po0 po0Var = ucVar.a;
            tc tcVar = ucVar.b;
            i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            po0Var.b(i11, bdVar.s, false);
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
            ((ep0) view).a(bdVar.s, false);
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
        oc ocVar = (oc) view;
        ocVar.e = false;
        org.telegram.ui.ActionBar.k5 k5Var = ocVar.a;
        ocVar.setWillNotDraw(true);
        if (i10 == bdVar.R) {
            i15 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ocVar.a(i15, bdVar.f, true);
            k5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (bdVar.b < bdVar.getMessagesController().channelBgIconLevelMin) {
                ocVar.e(bdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.n, false, false);
            return;
        }
        if (i10 == bdVar.Z) {
            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ocVar.a(i14, bdVar.s, false);
            k5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z4 = bdVar.b0 >= 0;
            ocVar.e = z4;
            ocVar.setWillNotDraw(!z4);
            if (bdVar.b < bdVar.J0()) {
                ocVar.e(bdVar.J0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(bdVar.w, false, false);
            return;
        }
        if (i10 == bdVar.c0) {
            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            ocVar.a(i13, bdVar.s, false);
            k5Var.l(LocaleController.getString(bdVar.G0()), false);
            if (bdVar.b < bdVar.F0()) {
                ocVar.e(bdVar.F0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(DialogObject.getEmojiStatusDocumentId(bdVar.y), DialogObject.isEmojiStatusCollectible(bdVar.y), false);
            return;
        }
        if (i10 != bdVar.e0) {
            if (i10 == bdVar.g0) {
                k5Var.l(LocaleController.getString(bdVar.M0()), false);
                ocVar.e(0);
                TLRPC.ChatFull chatFull = bdVar.getMessagesController().getChatFull(-j10);
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
        i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
        ocVar.a(i12, bdVar.s, false);
        k5Var.l(LocaleController.getString(bdVar.B0()), false);
        if (bdVar.b < bdVar.H0()) {
            ocVar.e(bdVar.H0());
        } else {
            ocVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = bdVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            ocVar.c(0L, false, false);
        } else {
            ocVar.c(bdVar.D0(stickerSet2), false, false);
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
        bd bdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = bdVar.getParentActivity();
            e5Var = ((org.telegram.ui.ActionBar.p2) bdVar).parentLayout;
            int I0 = bdVar.I0();
            long j10 = bdVar.a;
            f6Var8 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(parentActivity, e5Var, I0, j10, f6Var8);
            eaVar.x = true;
            eaVar.setImportantForAccessibility(4);
            eaVar.r = bdVar;
            Drawable drawable = bdVar.E;
            i14 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            Drawable f10 = ph.l5.f(drawable, i14, bdVar.C, bdVar.G);
            bdVar.E = f10;
            eaVar.setOverrideBackground(f10);
            frameLayout = eaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = bdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            zc zcVar = new zc(i13, parentActivity2, f6Var7);
            zcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(bdVar.C);
            if (wallpaperEmoticon == null && bdVar.C == null && bdVar.D != null) {
                wallpaperEmoticon = "❌";
            }
            zcVar.a(wallpaperEmoticon, false);
            zcVar.setGalleryWallpaper(bdVar.D);
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
            f6Var6 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            oc ocVar = new oc(parentActivity3);
            ocVar.e = false;
            ocVar.d = f6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            ocVar.a = k5Var;
            k5Var.setTextSize(16);
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            ocVar.addView(k5Var, k7.b6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ocVar.c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, ocVar, false);
            frameLayout = ocVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = bdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            sc scVar = new sc(i12, parentActivity4, f6Var5);
            scVar.b.setOnItemClickListener(new gg.v0(6, this, scVar));
            frameLayout = scVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = bdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) bdVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            ep0 ep0Var = new ep0(0, i11, parentActivity5, f6Var4);
            ep0Var.setDivider(false);
            final int i16 = 1;
            ep0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.mc
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
            frameLayout = ep0Var;
        } else if (i10 == 1) {
            FrameLayout ucVar = new uc(bdVar, bdVar.getParentActivity());
            frameLayout = ucVar;
            if (bdVar.d) {
                ucVar.setTag(-33024);
                frameLayout = ucVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = bdVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = bdVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            frameLayout = new ro0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = bdVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.p2) bdVar).resourceProvider;
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity8, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(35);
            frameLayout = t00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(bdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        View view = l1Var.a;
        boolean z4 = view instanceof uc;
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
