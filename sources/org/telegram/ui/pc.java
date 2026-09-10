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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ cd c;

    public pc(cd cdVar) {
        this.c = cdVar;
    }

    @Override // org.telegram.ui.Components.ul0
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
        cd cdVar = this.c;
        if (i10 == cdVar.S) {
            return 0;
        }
        if (i10 == cdVar.W) {
            return 2;
        }
        if (i10 == cdVar.Z) {
            return 1;
        }
        if (i10 == cdVar.T) {
            return 3;
        }
        if (i10 == cdVar.b0) {
            return 4;
        }
        if (i10 == cdVar.U || i10 == cdVar.c0 || i10 == cdVar.f0 || i10 == cdVar.h0 || i10 == cdVar.j0) {
            return 6;
        }
        return (i10 == cdVar.X || i10 == cdVar.e0) ? 5 : 7;
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
        cd cdVar = this.c;
        long j3 = cdVar.a;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 1) {
            vc vcVar = (vc) view;
            gp0 gp0Var = vcVar.a;
            uc ucVar = vcVar.b;
            i11 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            gp0Var.b(i11, cdVar.s, false);
            ucVar.b(cdVar.s, false);
            ucVar.d(cdVar.w, false, false);
            ucVar.setForum(cdVar.R0());
            ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.y), false, false);
            ucVar.a(cdVar.f);
            return;
        }
        if (i16 == 3) {
            ((tc) view).a(cdVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((xp0) view).a(cdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == cdVar.e0) {
                s8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            s8Var.i(LocaleController.getString(cdVar.P0()), false);
            if (cdVar.b < cdVar.z0()) {
                s8Var.h(cdVar.z0());
                return;
            } else {
                s8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setFixedSize(0);
            if (i10 == cdVar.a0) {
                f9Var.setFixedSize(12);
                f9Var.setText("");
                return;
            }
            if (i10 == cdVar.V) {
                f9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == cdVar.Y) {
                f9Var.setText(LocaleController.getString(cdVar.N0()));
                return;
            }
            if (i10 == cdVar.d0) {
                f9Var.setText(LocaleController.getString(cdVar.K0()));
                return;
            }
            if (i10 == cdVar.g0) {
                f9Var.setText(LocaleController.getString(cdVar.E0()));
                return;
            }
            if (i10 == cdVar.i0) {
                f9Var.setText(LocaleController.getString(cdVar.A0()));
                return;
            }
            if (i10 == cdVar.k0) {
                f9Var.setText(LocaleController.getString(cdVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    f9Var.setText("");
                    f9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        qc qcVar = (qc) view;
        qcVar.e = false;
        org.telegram.ui.ActionBar.l5 l5Var = qcVar.a;
        qcVar.setWillNotDraw(true);
        if (i10 == cdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            qcVar.a(i15, cdVar.f, true);
            l5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (cdVar.b < cdVar.getMessagesController().channelBgIconLevelMin) {
                qcVar.e(cdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                qcVar.e(0);
            }
            qcVar.c(cdVar.n, false, false);
            return;
        }
        if (i10 == cdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            qcVar.a(i14, cdVar.s, false);
            l5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = cdVar.e0 >= 0;
            qcVar.e = z10;
            qcVar.setWillNotDraw(!z10);
            if (cdVar.b < cdVar.J0()) {
                qcVar.e(cdVar.J0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(cdVar.w, false, false);
            return;
        }
        if (i10 == cdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            qcVar.a(i13, cdVar.s, false);
            l5Var.l(LocaleController.getString(cdVar.G0()), false);
            if (cdVar.b < cdVar.F0()) {
                qcVar.e(cdVar.F0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(DialogObject.getEmojiStatusDocumentId(cdVar.y), DialogObject.isEmojiStatusCollectible(cdVar.y), false);
            return;
        }
        if (i10 != cdVar.h0) {
            if (i10 == cdVar.j0) {
                l5Var.l(LocaleController.getString(cdVar.M0()), false);
                qcVar.e(0);
                TLRPC.ChatFull chatFull = cdVar.getMessagesController().getChatFull(-j3);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    qcVar.c(0L, false, false);
                    return;
                } else {
                    qcVar.d(cdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
        qcVar.a(i12, cdVar.s, false);
        l5Var.l(LocaleController.getString(cdVar.B0()), false);
        if (cdVar.b < cdVar.H0()) {
            qcVar.e(cdVar.H0());
        } else {
            qcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = cdVar.getMessagesController().getChatFull(-j3);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            qcVar.c(0L, false, false);
        } else {
            qcVar.c(cdVar.D0(stickerSet2), false, false);
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
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i14;
        cd cdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = cdVar.getParentActivity();
            f5Var = ((org.telegram.ui.ActionBar.p2) cdVar).parentLayout;
            int I0 = cdVar.I0();
            long j3 = cdVar.a;
            f6Var8 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(parentActivity, f5Var, I0, j3, f6Var8);
            kaVar.x = true;
            kaVar.setImportantForAccessibility(4);
            kaVar.r = cdVar;
            Drawable drawable = cdVar.H;
            i14 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            Drawable f7 = bi.e8.f(drawable, i14, cdVar.F, cdVar.J);
            cdVar.H = f7;
            kaVar.setOverrideBackground(f7);
            frameLayout = kaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = cdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            ad adVar = new ad(i13, parentActivity2, f6Var7);
            adVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(cdVar.F);
            if (wallpaperEmoticon == null && cdVar.F == null && cdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            adVar.a(wallpaperEmoticon, false);
            adVar.setGalleryWallpaper(cdVar.G);
            final int i15 = 0;
            adVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.b.c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            break;
                        default:
                            cd cdVar3 = this.b.c;
                            cdVar3.s = ((Integer) obj).intValue();
                            if (cdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = adVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.s8(cdVar.getParentActivity(), cdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = cdVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            qc qcVar = new qc(parentActivity3);
            qcVar.e = false;
            qcVar.d = f6Var6;
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(parentActivity3);
            qcVar.a = l5Var;
            l5Var.setTextSize(16);
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var6));
            qcVar.addView(l5Var, w7.a6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            qcVar.c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, qcVar, false);
            frameLayout = qcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = cdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, f6Var5);
            tcVar.b.setOnItemClickListener(new ai.b0(4, this, tcVar));
            frameLayout = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = cdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.p2) cdVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            xp0 xp0Var = new xp0(0, i11, parentActivity5, f6Var4);
            xp0Var.setDivider(false);
            final int i16 = 1;
            xp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            cd cdVar2 = this.b.c;
                            if (str == null) {
                                cdVar2.F = cdVar2.G;
                            } else if (str.equals("❌")) {
                                cdVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                cdVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                cdVar2.F.settings.emoticon = str;
                            }
                            cdVar2.X0(true);
                            cdVar2.a1(true);
                            break;
                        default:
                            cd cdVar3 = this.b.c;
                            cdVar3.s = ((Integer) obj).intValue();
                            if (cdVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                cdVar3.y = null;
                            }
                            cdVar3.X0(true);
                            cdVar3.b1();
                            cdVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = xp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(cdVar, cdVar.getParentActivity());
            frameLayout = vcVar;
            if (cdVar.d) {
                vcVar.setTag(-33024);
                frameLayout = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = cdVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, f6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = cdVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            frameLayout = new ip0(parentActivity7, f6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = cdVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.p2) cdVar).resourceProvider;
            org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(parentActivity8, f6Var);
            a10Var.setIsSingleCell(true);
            a10Var.setViewType(35);
            frameLayout = a10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.f9(cdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.fl0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view instanceof vc;
        cd cdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ka) {
                ((org.telegram.ui.Cells.ka) view).setOverrideBackground(cdVar.H);
                return;
            } else {
                cd.Y0(view);
                return;
            }
        }
        uc ucVar = ((vc) view).b;
        TLRPC.EmojiStatus emojiStatus = cdVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            ucVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            ucVar.d(((TLRPC.TL_emojiStatusCollectible) cdVar.y).pattern_document_id, true, false);
        } else {
            ucVar.b(cdVar.s, false);
            ucVar.d(cdVar.w, false, false);
        }
        ucVar.e(DialogObject.getEmojiStatusDocumentId(cdVar.y), DialogObject.isEmojiStatusCollectible(cdVar.y), false);
        ucVar.setForum(cdVar.R0());
        ucVar.a(cdVar.f);
    }
}
