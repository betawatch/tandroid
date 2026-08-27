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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jc extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ xc c;

    public jc(xc xcVar) {
        this.c = xcVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.N;
    }

    @Override // f2.q0
    public final int j(int i10) {
        xc xcVar = this.c;
        if (i10 == xcVar.O) {
            return 0;
        }
        if (i10 == xcVar.S) {
            return 2;
        }
        if (i10 == xcVar.V) {
            return 1;
        }
        if (i10 == xcVar.P) {
            return 3;
        }
        if (i10 == xcVar.X) {
            return 4;
        }
        if (i10 == xcVar.Q || i10 == xcVar.Y || i10 == xcVar.b0 || i10 == xcVar.d0 || i10 == xcVar.f0) {
            return 6;
        }
        return (i10 == xcVar.T || i10 == xcVar.a0) ? 5 : 7;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        xc xcVar = this.c;
        long j10 = xcVar.a;
        int i16 = o1Var.f;
        View view = o1Var.a;
        if (i16 == 1) {
            qc qcVar = (qc) view;
            jo0 jo0Var = qcVar.a;
            pc pcVar = qcVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            jo0Var.b(i11, xcVar.s, false);
            pcVar.b(xcVar.s, false);
            pcVar.d(xcVar.w, false, false);
            pcVar.setForum(xcVar.R0());
            pcVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.y), false, false);
            pcVar.a(xcVar.f);
            return;
        }
        if (i16 == 3) {
            ((oc) view).a(xcVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((yo0) view).a(xcVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == xcVar.a0) {
                l8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            l8Var.i(LocaleController.getString(xcVar.P0()), false);
            if (xcVar.b < xcVar.z0()) {
                l8Var.h(xcVar.z0());
                return;
            } else {
                l8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            x8Var.setFixedSize(0);
            if (i10 == xcVar.W) {
                x8Var.setFixedSize(12);
                x8Var.setText("");
                return;
            }
            if (i10 == xcVar.R) {
                x8Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == xcVar.U) {
                x8Var.setText(LocaleController.getString(xcVar.N0()));
                return;
            }
            if (i10 == xcVar.Z) {
                x8Var.setText(LocaleController.getString(xcVar.K0()));
                return;
            }
            if (i10 == xcVar.c0) {
                x8Var.setText(LocaleController.getString(xcVar.E0()));
                return;
            }
            if (i10 == xcVar.e0) {
                x8Var.setText(LocaleController.getString(xcVar.A0()));
                return;
            }
            if (i10 == xcVar.g0) {
                x8Var.setText(LocaleController.getString(xcVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    x8Var.setText("");
                    x8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        kc kcVar = (kc) view;
        kcVar.e = false;
        org.telegram.ui.ActionBar.h5 h5Var = kcVar.a;
        kcVar.setWillNotDraw(true);
        if (i10 == xcVar.Q) {
            i15 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            kcVar.a(i15, xcVar.f, true);
            h5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (xcVar.b < xcVar.getMessagesController().channelBgIconLevelMin) {
                kcVar.e(xcVar.getMessagesController().channelBgIconLevelMin);
            } else {
                kcVar.e(0);
            }
            kcVar.c(xcVar.n, false, false);
            return;
        }
        if (i10 == xcVar.Y) {
            i14 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            kcVar.a(i14, xcVar.s, false);
            h5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = xcVar.a0 >= 0;
            kcVar.e = z10;
            kcVar.setWillNotDraw(!z10);
            if (xcVar.b < xcVar.J0()) {
                kcVar.e(xcVar.J0());
            } else {
                kcVar.e(0);
            }
            kcVar.c(xcVar.w, false, false);
            return;
        }
        if (i10 == xcVar.b0) {
            i13 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            kcVar.a(i13, xcVar.s, false);
            h5Var.l(LocaleController.getString(xcVar.G0()), false);
            if (xcVar.b < xcVar.F0()) {
                kcVar.e(xcVar.F0());
            } else {
                kcVar.e(0);
            }
            kcVar.c(DialogObject.getEmojiStatusDocumentId(xcVar.y), DialogObject.isEmojiStatusCollectible(xcVar.y), false);
            return;
        }
        if (i10 != xcVar.d0) {
            if (i10 == xcVar.f0) {
                h5Var.l(LocaleController.getString(xcVar.M0()), false);
                kcVar.e(0);
                TLRPC.ChatFull chatFull = xcVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    kcVar.c(0L, false, false);
                    return;
                } else {
                    kcVar.d(xcVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
        kcVar.a(i12, xcVar.s, false);
        h5Var.l(LocaleController.getString(xcVar.B0()), false);
        if (xcVar.b < xcVar.H0()) {
            kcVar.e(xcVar.H0());
        } else {
            kcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = xcVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            kcVar.c(0L, false, false);
        } else {
            kcVar.c(xcVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
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
        xc xcVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = xcVar.getParentActivity();
            b5Var = ((org.telegram.ui.ActionBar.n2) xcVar).parentLayout;
            int I0 = xcVar.I0();
            long j10 = xcVar.a;
            c6Var8 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(parentActivity, b5Var, I0, j10, c6Var8);
            baVar.x = true;
            baVar.setImportantForAccessibility(4);
            baVar.r = xcVar;
            Drawable drawable = xcVar.D;
            i14 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            Drawable f10 = lh.q6.f(drawable, i14, xcVar.B, xcVar.F);
            xcVar.D = f10;
            baVar.setOverrideBackground(f10);
            frameLayout = baVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = xcVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            c6Var7 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            vc vcVar = new vc(i13, parentActivity2, c6Var7);
            vcVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(xcVar.B);
            if (wallpaperEmoticon == null && xcVar.B == null && xcVar.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar.a(wallpaperEmoticon, false);
            vcVar.setGalleryWallpaper(xcVar.C);
            final int i15 = 0;
            vcVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.ic
                public final /* synthetic */ jc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.b.c;
                            if (str == null) {
                                xcVar2.B = xcVar2.C;
                            } else if (str.equals("❌")) {
                                xcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                xcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                xcVar2.B.settings.emoticon = str;
                            }
                            xcVar2.X0(true);
                            xcVar2.a1(true);
                            break;
                        default:
                            xc xcVar3 = this.b.c;
                            xcVar3.s = ((Integer) obj).intValue();
                            if (xcVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = vcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.l8(xcVar.getParentActivity(), xcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = xcVar.getParentActivity();
            c6Var6 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            kc kcVar = new kc(parentActivity3);
            kcVar.e = false;
            kcVar.d = c6Var6;
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(parentActivity3);
            kcVar.a = h5Var;
            h5Var.setTextSize(16);
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var6));
            kcVar.addView(h5Var, h7.z5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            kcVar.c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, kcVar, false);
            frameLayout = kcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = xcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            c6Var5 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            oc ocVar = new oc(i12, parentActivity4, c6Var5);
            ocVar.b.setOnItemClickListener(new cg.x0(7, this, ocVar));
            frameLayout = ocVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = xcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) xcVar).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            yo0 yo0Var = new yo0(0, i11, parentActivity5, c6Var4);
            yo0Var.setDivider(false);
            final int i16 = 1;
            yo0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.ic
                public final /* synthetic */ jc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            xc xcVar2 = this.b.c;
                            if (str == null) {
                                xcVar2.B = xcVar2.C;
                            } else if (str.equals("❌")) {
                                xcVar2.B = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                xcVar2.B = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                xcVar2.B.settings.emoticon = str;
                            }
                            xcVar2.X0(true);
                            xcVar2.a1(true);
                            break;
                        default:
                            xc xcVar3 = this.b.c;
                            xcVar3.s = ((Integer) obj).intValue();
                            if (xcVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                xcVar3.y = null;
                            }
                            xcVar3.X0(true);
                            xcVar3.b1();
                            xcVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = yo0Var;
        } else if (i10 == 1) {
            FrameLayout qcVar = new qc(xcVar, xcVar.getParentActivity());
            frameLayout = qcVar;
            if (xcVar.d) {
                qcVar.setTag(-33024);
                frameLayout = qcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = xcVar.getParentActivity();
            c6Var3 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.j4(parentActivity6, c6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = xcVar.getParentActivity();
            c6Var2 = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            frameLayout = new lo0(parentActivity7, c6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = xcVar.getParentActivity();
            c6Var = ((org.telegram.ui.ActionBar.n2) xcVar).resourceProvider;
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(parentActivity8, c6Var);
            h00Var.setIsSingleCell(true);
            h00Var.setViewType(35);
            frameLayout = h00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.x8(xcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.lk0(frameLayout);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        View view = o1Var.a;
        boolean z10 = view instanceof qc;
        xc xcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ba) {
                ((org.telegram.ui.Cells.ba) view).setOverrideBackground(xcVar.D);
                return;
            } else {
                xc.Y0(view);
                return;
            }
        }
        pc pcVar = ((qc) view).b;
        TLRPC.EmojiStatus emojiStatus = xcVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            pcVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            pcVar.d(((TLRPC.TL_emojiStatusCollectible) xcVar.y).pattern_document_id, true, false);
        } else {
            pcVar.b(xcVar.s, false);
            pcVar.d(xcVar.w, false, false);
        }
        pcVar.e(DialogObject.getEmojiStatusDocumentId(xcVar.y), DialogObject.isEmojiStatusCollectible(xcVar.y), false);
        pcVar.setForum(xcVar.R0());
        pcVar.a(xcVar.f);
    }
}
