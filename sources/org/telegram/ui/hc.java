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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hc extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ vc c;

    public hc(vc vcVar) {
        this.c = vcVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.N;
    }

    @Override // f2.p0
    public final int j(int i10) {
        vc vcVar = this.c;
        if (i10 == vcVar.O) {
            return 0;
        }
        if (i10 == vcVar.S) {
            return 2;
        }
        if (i10 == vcVar.V) {
            return 1;
        }
        if (i10 == vcVar.P) {
            return 3;
        }
        if (i10 == vcVar.X) {
            return 4;
        }
        if (i10 == vcVar.Q || i10 == vcVar.Y || i10 == vcVar.b0 || i10 == vcVar.d0 || i10 == vcVar.f0) {
            return 6;
        }
        return (i10 == vcVar.T || i10 == vcVar.a0) ? 5 : 7;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        vc vcVar = this.c;
        long j10 = vcVar.a;
        int i16 = n1Var.f;
        View view = n1Var.a;
        if (i16 == 1) {
            oc ocVar = (oc) view;
            ho0 ho0Var = ocVar.a;
            nc ncVar = ocVar.b;
            i11 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            ho0Var.b(i11, vcVar.s, false);
            ncVar.b(vcVar.s, false);
            ncVar.d(vcVar.w, false, false);
            ncVar.setForum(vcVar.R0());
            ncVar.e(DialogObject.getEmojiStatusDocumentId(vcVar.y), false, false);
            ncVar.a(vcVar.f);
            return;
        }
        if (i16 == 3) {
            ((mc) view).a(vcVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((wo0) view).a(vcVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == vcVar.a0) {
                m8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            m8Var.i(LocaleController.getString(vcVar.P0()), false);
            if (vcVar.b < vcVar.z0()) {
                m8Var.h(vcVar.z0());
                return;
            } else {
                m8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i10 == vcVar.W) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            if (i10 == vcVar.R) {
                y8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == vcVar.U) {
                y8Var.setText(LocaleController.getString(vcVar.N0()));
                return;
            }
            if (i10 == vcVar.Z) {
                y8Var.setText(LocaleController.getString(vcVar.K0()));
                return;
            }
            if (i10 == vcVar.c0) {
                y8Var.setText(LocaleController.getString(vcVar.E0()));
                return;
            }
            if (i10 == vcVar.e0) {
                y8Var.setText(LocaleController.getString(vcVar.A0()));
                return;
            }
            if (i10 == vcVar.g0) {
                y8Var.setText(LocaleController.getString(vcVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        ic icVar = (ic) view;
        icVar.e = false;
        org.telegram.ui.ActionBar.h5 h5Var = icVar.a;
        icVar.setWillNotDraw(true);
        if (i10 == vcVar.Q) {
            i15 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            icVar.a(i15, vcVar.f, true);
            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (vcVar.b < vcVar.getMessagesController().channelBgIconLevelMin) {
                icVar.e(vcVar.getMessagesController().channelBgIconLevelMin);
            } else {
                icVar.e(0);
            }
            icVar.c(vcVar.n, false, false);
            return;
        }
        if (i10 == vcVar.Y) {
            i14 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            icVar.a(i14, vcVar.s, false);
            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = vcVar.a0 >= 0;
            icVar.e = z10;
            icVar.setWillNotDraw(!z10);
            if (vcVar.b < vcVar.J0()) {
                icVar.e(vcVar.J0());
            } else {
                icVar.e(0);
            }
            icVar.c(vcVar.w, false, false);
            return;
        }
        if (i10 == vcVar.b0) {
            i13 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            icVar.a(i13, vcVar.s, false);
            h5Var.l(LocaleController.getString(vcVar.G0()), false);
            if (vcVar.b < vcVar.F0()) {
                icVar.e(vcVar.F0());
            } else {
                icVar.e(0);
            }
            icVar.c(DialogObject.getEmojiStatusDocumentId(vcVar.y), DialogObject.isEmojiStatusCollectible(vcVar.y), false);
            return;
        }
        if (i10 != vcVar.d0) {
            if (i10 == vcVar.f0) {
                h5Var.l(LocaleController.getString(vcVar.M0()), false);
                icVar.e(0);
                TLRPC.ChatFull chatFull = vcVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    icVar.c(0L, false, false);
                    return;
                } else {
                    icVar.d(vcVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
        icVar.a(i12, vcVar.s, false);
        h5Var.l(LocaleController.getString(vcVar.B0()), false);
        if (vcVar.b < vcVar.H0()) {
            icVar.e(vcVar.H0());
        } else {
            icVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = vcVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            icVar.c(0L, false, false);
        } else {
            icVar.c(vcVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        org.telegram.ui.ActionBar.c6 c6Var6;
        int i13;
        org.telegram.ui.ActionBar.c6 c6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var8;
        int i14;
        vc vcVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = vcVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.o2) vcVar).parentLayout;
            int I0 = vcVar.I0();
            long j10 = vcVar.a;
            c6Var8 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(parentActivity, b5Var, I0, j10, c6Var8);
            caVar.x = true;
            caVar.setImportantForAccessibility(4);
            caVar.r = vcVar;
            Drawable drawable = vcVar.D;
            i14 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            Drawable f9 = nh.f6.f(drawable, i14, vcVar.B, vcVar.F);
            vcVar.D = f9;
            caVar.setOverrideBackground(f9);
            frameLayout = caVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = vcVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            tc tcVar = new tc(i13, parentActivity2, c6Var7);
            tcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(vcVar.B);
            if (wallpaperEmoticon == null && vcVar.B == null && vcVar.C != null) {
                wallpaperEmoticon = "❌";
            }
            tcVar.a(wallpaperEmoticon, false);
            tcVar.setGalleryWallpaper(vcVar.C);
            final int i15 = 0;
            tcVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.gc
                public final /* synthetic */ hc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            vc vcVar2 = this.b.c;
                            if (str == null) {
                                vcVar2.B = vcVar2.C;
                            } else if (str.equals("❌")) {
                                vcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vcVar2.B.settings.emoticon = str;
                            }
                            vcVar2.X0(true);
                            vcVar2.a1(true);
                            break;
                        default:
                            vc vcVar3 = this.b.c;
                            vcVar3.s = ((Integer) obj).intValue();
                            if (vcVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                vcVar3.y = null;
                            }
                            vcVar3.X0(true);
                            vcVar3.b1();
                            vcVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = tcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.m8(vcVar.getParentActivity(), vcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = vcVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            ic icVar = new ic(parentActivity3);
            icVar.e = false;
            icVar.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            icVar.a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            icVar.addView(h5Var, i7.f6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            icVar.c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, icVar, false);
            frameLayout = icVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = vcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            mc mcVar = new mc(i12, parentActivity4, c6Var5);
            mcVar.b.setOnItemClickListener(new eg.w0(6, this, mcVar));
            frameLayout = mcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = vcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.o2) vcVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            wo0 wo0Var = new wo0(0, i11, parentActivity5, c6Var4);
            wo0Var.setDivider(false);
            final int i16 = 1;
            wo0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.gc
                public final /* synthetic */ hc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            vc vcVar2 = this.b.c;
                            if (str == null) {
                                vcVar2.B = vcVar2.C;
                            } else if (str.equals("❌")) {
                                vcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vcVar2.B.settings.emoticon = str;
                            }
                            vcVar2.X0(true);
                            vcVar2.a1(true);
                            break;
                        default:
                            vc vcVar3 = this.b.c;
                            vcVar3.s = ((Integer) obj).intValue();
                            if (vcVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                vcVar3.y = null;
                            }
                            vcVar3.X0(true);
                            vcVar3.b1();
                            vcVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = wo0Var;
        } else if (i10 == 1) {
            FrameLayout ocVar = new oc(vcVar, vcVar.getParentActivity());
            frameLayout = ocVar;
            if (vcVar.d) {
                ocVar.setTag(-33024);
                frameLayout = ocVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = vcVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.k4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = vcVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            frameLayout = new jo0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = vcVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.o2) vcVar).resourceProvider;
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(parentActivity8, c6Var);
            p00Var.setIsSingleCell(true);
            p00Var.setViewType(35);
            frameLayout = p00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(vcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        View view = n1Var.a;
        boolean z10 = view instanceof oc;
        vc vcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ca) {
                ((org.telegram.ui.Cells.ca) view).setOverrideBackground(vcVar.D);
                return;
            } else {
                vc.Y0(view);
                return;
            }
        }
        nc ncVar = ((oc) view).b;
        TLRPC.EmojiStatus emojiStatus = vcVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            ncVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            ncVar.d(((TLRPC.TL_emojiStatusCollectible) vcVar.y).pattern_document_id, true, false);
        } else {
            ncVar.b(vcVar.s, false);
            ncVar.d(vcVar.w, false, false);
        }
        ncVar.e(DialogObject.getEmojiStatusDocumentId(vcVar.y), DialogObject.isEmojiStatusCollectible(vcVar.y), false);
        ncVar.setForum(vcVar.R0());
        ncVar.a(vcVar.f);
    }
}
