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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class pc extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ dd c;

    public pc(dd ddVar) {
        this.c = ddVar;
    }

    @Override // org.telegram.ui.Components.hm0
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
        dd ddVar = this.c;
        if (i10 == ddVar.S) {
            return 0;
        }
        if (i10 == ddVar.W) {
            return 2;
        }
        if (i10 == ddVar.Z) {
            return 1;
        }
        if (i10 == ddVar.T) {
            return 3;
        }
        if (i10 == ddVar.b0) {
            return 4;
        }
        if (i10 == ddVar.U || i10 == ddVar.c0 || i10 == ddVar.f0 || i10 == ddVar.h0 || i10 == ddVar.j0) {
            return 6;
        }
        return (i10 == ddVar.X || i10 == ddVar.e0) ? 5 : 7;
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
        dd ddVar = this.c;
        long j10 = ddVar.a;
        int i16 = b1Var.f;
        View view = b1Var.a;
        if (i16 == 1) {
            vc vcVar = (vc) view;
            qo0 qo0Var = vcVar.a;
            uc ucVar = vcVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            qo0Var.b(i11, ddVar.s, false);
            ucVar.b(ddVar.s, false);
            ucVar.d(ddVar.w, false, false);
            ucVar.setForum(ddVar.R0());
            ucVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.y), false, false);
            ucVar.a(ddVar.f);
            return;
        }
        if (i16 == 3) {
            ((tc) view).a(ddVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((hp0) view).a(ddVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i10 == ddVar.e0) {
                q8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            q8Var.i(LocaleController.getString(ddVar.P0()), false);
            if (ddVar.b < ddVar.z0()) {
                q8Var.h(ddVar.z0());
                return;
            } else {
                q8Var.h(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setFixedSize(0);
            if (i10 == ddVar.a0) {
                d9Var.setFixedSize(12);
                d9Var.setText("");
                return;
            }
            if (i10 == ddVar.V) {
                d9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == ddVar.Y) {
                d9Var.setText(LocaleController.getString(ddVar.N0()));
                return;
            }
            if (i10 == ddVar.d0) {
                d9Var.setText(LocaleController.getString(ddVar.K0()));
                return;
            }
            if (i10 == ddVar.g0) {
                d9Var.setText(LocaleController.getString(ddVar.E0()));
                return;
            }
            if (i10 == ddVar.i0) {
                d9Var.setText(LocaleController.getString(ddVar.A0()));
                return;
            }
            if (i10 == ddVar.k0) {
                d9Var.setText(LocaleController.getString(ddVar.L0()));
                return;
            } else {
                if (i10 == 0) {
                    d9Var.setText("");
                    d9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        qc qcVar = (qc) view;
        qcVar.e = false;
        org.telegram.ui.ActionBar.j5 j5Var = qcVar.a;
        qcVar.setWillNotDraw(true);
        if (i10 == ddVar.U) {
            i15 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            qcVar.a(i15, ddVar.f, true);
            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (ddVar.b < ddVar.getMessagesController().channelBgIconLevelMin) {
                qcVar.e(ddVar.getMessagesController().channelBgIconLevelMin);
            } else {
                qcVar.e(0);
            }
            qcVar.c(ddVar.n, false, false);
            return;
        }
        if (i10 == ddVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            qcVar.a(i14, ddVar.s, false);
            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = ddVar.e0 >= 0;
            qcVar.e = z10;
            qcVar.setWillNotDraw(!z10);
            if (ddVar.b < ddVar.J0()) {
                qcVar.e(ddVar.J0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(ddVar.w, false, false);
            return;
        }
        if (i10 == ddVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            qcVar.a(i13, ddVar.s, false);
            j5Var.l(LocaleController.getString(ddVar.G0()), false);
            if (ddVar.b < ddVar.F0()) {
                qcVar.e(ddVar.F0());
            } else {
                qcVar.e(0);
            }
            qcVar.c(DialogObject.getEmojiStatusDocumentId(ddVar.y), DialogObject.isEmojiStatusCollectible(ddVar.y), false);
            return;
        }
        if (i10 != ddVar.h0) {
            if (i10 == ddVar.j0) {
                j5Var.l(LocaleController.getString(ddVar.M0()), false);
                qcVar.e(0);
                TLRPC.ChatFull chatFull = ddVar.getMessagesController().getChatFull(-j10);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    qcVar.c(0L, false, false);
                    return;
                } else {
                    qcVar.d(ddVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
        qcVar.a(i12, ddVar.s, false);
        j5Var.l(LocaleController.getString(ddVar.B0()), false);
        if (ddVar.b < ddVar.H0()) {
            qcVar.e(ddVar.H0());
        } else {
            qcVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = ddVar.getMessagesController().getChatFull(-j10);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            qcVar.c(0L, false, false);
        } else {
            qcVar.c(ddVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d6 d6Var8;
        int i14;
        dd ddVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = ddVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) ddVar).parentLayout;
            int I0 = ddVar.I0();
            long j10 = ddVar.a;
            d6Var8 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(parentActivity, d5Var, I0, j10, d6Var8);
            faVar.x = true;
            faVar.setImportantForAccessibility(4);
            faVar.r = ddVar;
            Drawable drawable = ddVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            Drawable f7 = ei.r6.f(drawable, i14, ddVar.F, ddVar.J);
            ddVar.H = f7;
            faVar.setOverrideBackground(f7);
            frameLayout = faVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = ddVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var7 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            bd bdVar = new bd(i13, parentActivity2, d6Var7);
            bdVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(ddVar.F);
            if (wallpaperEmoticon == null && ddVar.F == null && ddVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            bdVar.a(wallpaperEmoticon, false);
            bdVar.setGalleryWallpaper(ddVar.G);
            final int i15 = 0;
            bdVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.b.c;
                            if (str == null) {
                                ddVar2.F = ddVar2.G;
                            } else if (str.equals("❌")) {
                                ddVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.F.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            break;
                        default:
                            dd ddVar3 = this.b.c;
                            ddVar3.s = ((Integer) obj).intValue();
                            if (ddVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = bdVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.q8(ddVar.getParentActivity(), ddVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = ddVar.getParentActivity();
            d6Var6 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            qc qcVar = new qc(parentActivity3);
            qcVar.e = false;
            qcVar.d = d6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            qcVar.a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var6));
            qcVar.addView(j5Var, w7.z5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -1, 23));
            qcVar.c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, qcVar, false);
            frameLayout = qcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = ddVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var5 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            tc tcVar = new tc(i12, parentActivity4, d6Var5);
            tcVar.b.setOnItemClickListener(new ci.y4(5, this, tcVar));
            frameLayout = tcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = ddVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) ddVar).currentAccount;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            hp0 hp0Var = new hp0(0, i11, parentActivity5, d6Var4);
            hp0Var.setDivider(false);
            final int i16 = 1;
            hp0Var.setOnColorClick(new Utilities.Callback(this) { // from class: org.telegram.ui.oc
                public final /* synthetic */ pc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            dd ddVar2 = this.b.c;
                            if (str == null) {
                                ddVar2.F = ddVar2.G;
                            } else if (str.equals("❌")) {
                                ddVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                ddVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                ddVar2.F.settings.emoticon = str;
                            }
                            ddVar2.X0(true);
                            ddVar2.a1(true);
                            break;
                        default:
                            dd ddVar3 = this.b.c;
                            ddVar3.s = ((Integer) obj).intValue();
                            if (ddVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                ddVar3.y = null;
                            }
                            ddVar3.X0(true);
                            ddVar3.b1();
                            ddVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = hp0Var;
        } else if (i10 == 1) {
            FrameLayout vcVar = new vc(ddVar, ddVar.getParentActivity());
            frameLayout = vcVar;
            if (ddVar.d) {
                vcVar.setTag(-33024);
                frameLayout = vcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = ddVar.getParentActivity();
            d6Var3 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.l4(parentActivity6, d6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = ddVar.getParentActivity();
            d6Var2 = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            frameLayout = new so0(parentActivity7, d6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = ddVar.getParentActivity();
            d6Var = ((org.telegram.ui.ActionBar.n2) ddVar).resourceProvider;
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(parentActivity8, d6Var);
            b10Var.setIsSingleCell(true);
            b10Var.setViewType(35);
            frameLayout = b10Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.d9(ddVar.getParentActivity());
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        View view = b1Var.a;
        boolean z10 = view instanceof vc;
        dd ddVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.fa) {
                ((org.telegram.ui.Cells.fa) view).setOverrideBackground(ddVar.H);
                return;
            } else {
                dd.Y0(view);
                return;
            }
        }
        uc ucVar = ((vc) view).b;
        TLRPC.EmojiStatus emojiStatus = ddVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            ucVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            ucVar.d(((TLRPC.TL_emojiStatusCollectible) ddVar.y).pattern_document_id, true, false);
        } else {
            ucVar.b(ddVar.s, false);
            ucVar.d(ddVar.w, false, false);
        }
        ucVar.e(DialogObject.getEmojiStatusDocumentId(ddVar.y), DialogObject.isEmojiStatusCollectible(ddVar.y), false);
        ucVar.setForum(ddVar.R0());
        ucVar.a(ddVar.f);
    }
}
