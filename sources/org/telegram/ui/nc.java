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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nc extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ ad c;

    public nc(ad adVar) {
        this.c = adVar;
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
        ad adVar = this.c;
        if (i10 == adVar.S) {
            return 0;
        }
        if (i10 == adVar.W) {
            return 2;
        }
        if (i10 == adVar.Z) {
            return 1;
        }
        if (i10 == adVar.T) {
            return 3;
        }
        if (i10 == adVar.b0) {
            return 4;
        }
        if (i10 == adVar.U || i10 == adVar.c0 || i10 == adVar.f0 || i10 == adVar.h0 || i10 == adVar.j0) {
            return 6;
        }
        return (i10 == adVar.X || i10 == adVar.e0) ? 5 : 7;
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
        ad adVar = this.c;
        long j3 = adVar.a;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 1) {
            tc tcVar = (tc) view;
            gp0 gp0Var = tcVar.a;
            sc scVar = tcVar.b;
            i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            gp0Var.b(i11, adVar.s, false);
            scVar.b(adVar.s, false);
            scVar.d(adVar.w, false, false);
            scVar.setForum(adVar.R0());
            scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.y), false, false);
            scVar.a(adVar.f);
            return;
        }
        if (i16 == 3) {
            ((rc) view).a(adVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((xp0) view).a(adVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == adVar.e0) {
                r8Var.i(LocaleController.getString(R.string.ChannelProfileColorReset), false);
                return;
            }
            r8Var.i(LocaleController.getString(adVar.P0()), false);
            if (adVar.b < adVar.z0()) {
                r8Var.h(adVar.z0());
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
            if (i10 == adVar.a0) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            if (i10 == adVar.V) {
                e9Var.setText(LocaleController.getString(R.string.ChannelReplyInfo));
                return;
            }
            if (i10 == adVar.Y) {
                e9Var.setText(LocaleController.getString(adVar.N0()));
                return;
            }
            if (i10 == adVar.d0) {
                e9Var.setText(LocaleController.getString(adVar.K0()));
                return;
            }
            if (i10 == adVar.g0) {
                e9Var.setText(LocaleController.getString(adVar.E0()));
                return;
            }
            if (i10 == adVar.i0) {
                e9Var.setText(LocaleController.getString(adVar.A0()));
                return;
            }
            if (i10 == adVar.k0) {
                e9Var.setText(LocaleController.getString(adVar.L0()));
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
        if (i10 == adVar.U) {
            i15 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            ocVar.a(i15, adVar.f, true);
            j5Var.l(LocaleController.getString(R.string.ChannelReplyLogo), false);
            if (adVar.b < adVar.getMessagesController().channelBgIconLevelMin) {
                ocVar.e(adVar.getMessagesController().channelBgIconLevelMin);
            } else {
                ocVar.e(0);
            }
            ocVar.c(adVar.n, false, false);
            return;
        }
        if (i10 == adVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            ocVar.a(i14, adVar.s, false);
            j5Var.l(LocaleController.getString(R.string.ChannelProfileLogo), false);
            boolean z10 = adVar.e0 >= 0;
            ocVar.e = z10;
            ocVar.setWillNotDraw(!z10);
            if (adVar.b < adVar.J0()) {
                ocVar.e(adVar.J0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(adVar.w, false, false);
            return;
        }
        if (i10 == adVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            ocVar.a(i13, adVar.s, false);
            j5Var.l(LocaleController.getString(adVar.G0()), false);
            if (adVar.b < adVar.F0()) {
                ocVar.e(adVar.F0());
            } else {
                ocVar.e(0);
            }
            ocVar.c(DialogObject.getEmojiStatusDocumentId(adVar.y), DialogObject.isEmojiStatusCollectible(adVar.y), false);
            return;
        }
        if (i10 != adVar.h0) {
            if (i10 == adVar.j0) {
                j5Var.l(LocaleController.getString(adVar.M0()), false);
                ocVar.e(0);
                TLRPC.ChatFull chatFull = adVar.getMessagesController().getChatFull(-j3);
                if (chatFull == null || (stickerSet = chatFull.stickerset) == null) {
                    ocVar.c(0L, false, false);
                    return;
                } else {
                    ocVar.d(adVar.C0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
        ocVar.a(i12, adVar.s, false);
        j5Var.l(LocaleController.getString(adVar.B0()), false);
        if (adVar.b < adVar.H0()) {
            ocVar.e(adVar.H0());
        } else {
            ocVar.e(0);
        }
        TLRPC.ChatFull chatFull2 = adVar.getMessagesController().getChatFull(-j3);
        if (chatFull2 == null || (stickerSet2 = chatFull2.emojiset) == null) {
            ocVar.c(0L, false, false);
        } else {
            ocVar.c(adVar.D0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
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
        ad adVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = adVar.getParentActivity();
            d5Var = ((org.telegram.ui.ActionBar.n2) adVar).parentLayout;
            int I0 = adVar.I0();
            long j3 = adVar.a;
            e6Var8 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(parentActivity, d5Var, I0, j3, e6Var8);
            jaVar.x = true;
            jaVar.setImportantForAccessibility(4);
            jaVar.r = adVar;
            Drawable drawable = adVar.H;
            i14 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            Drawable f7 = ci.d7.f(drawable, i14, adVar.F, adVar.J);
            adVar.H = f7;
            jaVar.setOverrideBackground(f7);
            frameLayout = jaVar;
        } else if (i10 == 2) {
            Activity parentActivity2 = adVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            yc ycVar = new yc(i13, parentActivity2, e6Var7);
            ycVar.setWithRemovedStub(true);
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(adVar.F);
            if (wallpaperEmoticon == null && adVar.F == null && adVar.G != null) {
                wallpaperEmoticon = "❌";
            }
            ycVar.a(wallpaperEmoticon, false);
            ycVar.setGalleryWallpaper(adVar.G);
            final int i15 = 0;
            ycVar.setOnEmoticonSelected(new Utilities.Callback(this) { // from class: org.telegram.ui.mc
                public final /* synthetic */ nc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            ad adVar2 = this.b.c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            break;
                        default:
                            ad adVar3 = this.b.c;
                            adVar3.s = ((Integer) obj).intValue();
                            if (adVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = ycVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.r8(adVar.getParentActivity(), adVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = adVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            oc ocVar = new oc(parentActivity3);
            ocVar.e = false;
            ocVar.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            ocVar.a = j5Var;
            j5Var.setTextSize(16);
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var6));
            ocVar.addView(j5Var, w7.x5.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ocVar.c = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 13, ocVar, false);
            frameLayout = ocVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = adVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            rc rcVar = new rc(i12, parentActivity4, e6Var5);
            rcVar.b.setOnItemClickListener(new ai.o6(5, this, rcVar));
            frameLayout = rcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = adVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.n2) adVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
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
                            ad adVar2 = this.b.c;
                            if (str == null) {
                                adVar2.F = adVar2.G;
                            } else if (str.equals("❌")) {
                                adVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                adVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                adVar2.F.settings.emoticon = str;
                            }
                            adVar2.X0(true);
                            adVar2.a1(true);
                            break;
                        default:
                            ad adVar3 = this.b.c;
                            adVar3.s = ((Integer) obj).intValue();
                            if (adVar3.y instanceof TLRPC.TL_emojiStatusCollectible) {
                                adVar3.y = null;
                            }
                            adVar3.X0(true);
                            adVar3.b1();
                            adVar3.Z0(true);
                            break;
                    }
                }
            });
            frameLayout = xp0Var;
        } else if (i10 == 1) {
            FrameLayout tcVar = new tc(adVar, adVar.getParentActivity());
            frameLayout = tcVar;
            if (adVar.d) {
                tcVar.setTag(-33024);
                frameLayout = tcVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = adVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.m4(parentActivity6, e6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = adVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            frameLayout = new ip0(parentActivity7, e6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = adVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.n2) adVar).resourceProvider;
            org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(parentActivity8, e6Var);
            t00Var.setIsSingleCell(true);
            t00Var.setViewType(35);
            frameLayout = t00Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(adVar.getParentActivity());
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view instanceof tc;
        ad adVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ja) {
                ((org.telegram.ui.Cells.ja) view).setOverrideBackground(adVar.H);
                return;
            } else {
                ad.Y0(view);
                return;
            }
        }
        sc scVar = ((tc) view).b;
        TLRPC.EmojiStatus emojiStatus = adVar.y;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            scVar.c(MessagesController.PeerColor.fromCollectible(emojiStatus), false);
            scVar.d(((TLRPC.TL_emojiStatusCollectible) adVar.y).pattern_document_id, true, false);
        } else {
            scVar.b(adVar.s, false);
            scVar.d(adVar.w, false, false);
        }
        scVar.e(DialogObject.getEmojiStatusDocumentId(adVar.y), DialogObject.isEmojiStatusCollectible(adVar.y), false);
        scVar.setForum(adVar.R0());
        scVar.a(adVar.f);
    }
}
