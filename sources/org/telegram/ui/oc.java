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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class oc extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ cd c;

    public oc(cd cdVar) {
        this.c = cdVar;
    }

    @Override // org.telegram.ui.Components.yl0
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
            cp0 cp0Var = vcVar.a;
            uc ucVar = vcVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            cp0Var.b(i11, cdVar.s, false);
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
            ((tp0) view).a(cdVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == cdVar.e0) {
                r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            r8Var.i(LocaleController.getString(cdVar.P0()), false);
            if (cdVar.b < cdVar.z0()) {
                r8Var.h(cdVar.z0());
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
            if (i10 == cdVar.a0) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            if (i10 == cdVar.V) {
                e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == cdVar.Y) {
                e9Var.setText(LocaleController.getString(cdVar.N0()));
                return;
            }
            if (i10 == cdVar.d0) {
                e9Var.setText(LocaleController.getString(cdVar.K0()));
                return;
            }
            if (i10 == cdVar.g0) {
                e9Var.setText(LocaleController.getString(cdVar.E0()));
                return;
            }
            if (i10 == cdVar.i0) {
                e9Var.setText(LocaleController.getString(cdVar.A0()));
                return;
            }
            if (i10 == cdVar.k0) {
                e9Var.setText(LocaleController.getString(cdVar.L0()));
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
        org.telegram.ui.ActionBar.i5 i5Var = pcVar.a;
        pcVar.setWillNotDraw(true);
        if (i10 == cdVar.U) {
            i15 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            pcVar.a(i15, cdVar.f, true);
            i5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (cdVar.b < cdVar.getMessagesController().channelBgIconLevelMin) {
                pcVar.e(cdVar.getMessagesController().channelBgIconLevelMin);
            } else {
                pcVar.e(0);
            }
            pcVar.c(cdVar.n, false, false);
            return;
        }
        if (i10 == cdVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            pcVar.a(i14, cdVar.s, false);
            i5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = cdVar.e0 >= 0;
            pcVar.e = z10;
            pcVar.setWillNotDraw(!z10);
            if (cdVar.b < cdVar.J0()) {
                pcVar.e(cdVar.J0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(cdVar.w, false, false);
            return;
        }
        if (i10 == cdVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            pcVar.a(i13, cdVar.s, false);
            i5Var.l(LocaleController.getString(cdVar.G0()), false);
            if (cdVar.b < cdVar.F0()) {
                pcVar.e(cdVar.F0());
            } else {
                pcVar.e(0);
            }
            pcVar.c(DialogObject.getEmojiStatusDocumentId(cdVar.y), DialogObject.isEmojiStatusCollectible(cdVar.y), false);
            return;
        }
        if (i10 != cdVar.h0) {
            if (i10 == cdVar.j0) {
                i5Var.l(LocaleController.getString(cdVar.M0()), false);
                pcVar.e(0);
                TLRPC.ChatFull chatFull = cdVar.getMessagesController().getChatFull(-j3);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    pcVar.c(0L, false, false);
                    return;
                } else {
                    pcVar.d(cdVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
        pcVar.a(i12, cdVar.s, false);
        i5Var.l(LocaleController.getString(cdVar.B0()), false);
        if (cdVar.b < cdVar.H0()) {
            pcVar.e(cdVar.H0());
        } else {
            pcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = cdVar.getMessagesController().getChatFull(-j3);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            pcVar.c(0L, false, false);
        } else {
            pcVar.c(cdVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var4;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        org.telegram.ui.ActionBar.d6 d6Var6;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        cd cdVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = cdVar.getParentActivity();
            c5Var = ((org.telegram.ui.ActionBar.n2) cdVar).parentLayout;
            int I0 = cdVar.I0();
            long j3 = cdVar.a;
            d6Var8 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(parentActivity, c5Var, I0, j3, d6Var8);
            iaVar.x = true;
            iaVar.setImportantForAccessibility(4);
            iaVar.r = cdVar;
            Drawable drawable = cdVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            Drawable f7 = ci.b7.f(drawable, i14, cdVar.F, cdVar.J);
            cdVar.H = f7;
            iaVar.setOverrideBackground(f7);
            frameLayout = iaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = cdVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            ad adVar = new ad(i13, parentActivity2, d6Var7);
            adVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(cdVar.F);
            if (wallpaperEmoticon == null && cdVar.F == null && cdVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            adVar.a(wallpaperEmoticon, false);
            adVar.setGalleryWallpaper(cdVar.G);
            final int i15 = 0;
            adVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.nc
                public final /* synthetic */ oc b;

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
            frameLayout = new org.telegram.ui.Cells.r8(cdVar.getParentActivity(), cdVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = cdVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            pc pcVar = new pc(parentActivity3);
            pcVar.e = false;
            pcVar.d = d6Var6;
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(parentActivity3);
            pcVar.a = i5Var;
            i5Var.setTextSize(16);
            i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var6));
            pcVar.addView(i5Var, w7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            pcVar.c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, pcVar, false);
            frameLayout = pcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = cdVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, d6Var5);
            tcVar.b.setOnItemClickListener(new ai.n6(5, this, tcVar));
            frameLayout = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = cdVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) cdVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            tp0 tp0Var = new tp0(0, i11, parentActivity5, d6Var4);
            tp0Var.setDivider(false);
            final int i16 = 1;
            tp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.nc
                public final /* synthetic */ oc b;

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
            frameLayout = tp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(cdVar, cdVar.getParentActivity());
            frameLayout = vcVar;
            if (cdVar.d) {
                vcVar.setTag(-33024);
                frameLayout = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = cdVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = cdVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            frameLayout = new ep0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = cdVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.n2) cdVar).resourceProvider;
            org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(parentActivity8, d6Var);
            w00Var.setIsSingleCell(true);
            w00Var.setViewType(35);
            frameLayout = w00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(cdVar.getParentActivity());
        }
        return new org.telegram.ui.Components.il0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view instanceof vc;
        cd cdVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ia) {
                ((org.telegram.ui.Cells.ia) view).setOverrideBackground(cdVar.H);
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
