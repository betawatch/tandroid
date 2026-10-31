package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lc extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ zc c;

    public lc(zc zcVar) {
        this.c = zcVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 5 || i10 == 6;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.R;
    }

    @Override // s4.g0
    public final int d(int i10) {
        zc zcVar = this.c;
        if (i10 == zcVar.S) {
            return 0;
        }
        if (i10 == zcVar.W) {
            return 2;
        }
        if (i10 == zcVar.Z) {
            return 1;
        }
        if (i10 == zcVar.T) {
            return 3;
        }
        if (i10 == zcVar.b0) {
            return 4;
        }
        if (i10 == zcVar.U || i10 == zcVar.c0 || i10 == zcVar.f0 || i10 == zcVar.h0 || i10 == zcVar.j0) {
            return 6;
        }
        return (i10 == zcVar.X || i10 == zcVar.e0) ? 5 : 7;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.StickerSet stickerSet;
        int i12;
        TLRPC.StickerSet stickerSet2;
        int i13;
        int i14;
        int i15;
        zc zcVar = this.c;
        long j10 = zcVar.a;
        int i16 = c1Var.f;
        View view = c1Var.a;
        if (i16 == 1) {
            sc scVar = (sc) view;
            an0 an0Var = scVar.a;
            rc rcVar = scVar.b;
            i11 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            an0Var.b(i11, zcVar.s, false);
            rcVar.b(zcVar.s, false);
            rcVar.d(zcVar.x, false, false);
            rcVar.setForum(zcVar.X0());
            rcVar.e(org.telegram.messenger.o5.f(zcVar.D), false, false);
            rcVar.a(zcVar.f);
            return;
        }
        if (i16 == 3) {
            ((qc) view).a(zcVar.f, false);
            return;
        }
        if (i16 == 4) {
            ((qn0) view).a(zcVar.s, false);
            return;
        }
        if (i16 == 5) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == zcVar.e0) {
                p8Var.k(org.telegram.messenger.cd.L0(2131752324, null), false);
                return;
            }
            p8Var.k(org.telegram.messenger.cd.L0(zcVar.V0(), null), false);
            if (zcVar.b < zcVar.F0()) {
                p8Var.j(zcVar.F0());
                return;
            } else {
                p8Var.j(0);
                return;
            }
        }
        if (i16 != 6) {
            if (i16 != 7) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setFixedSize(0);
            if (i10 == zcVar.a0) {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
            if (i10 == zcVar.V) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131752310, null));
                return;
            }
            if (i10 == zcVar.Y) {
                b9Var.setText(org.telegram.messenger.cd.L0(zcVar.T0(), null));
                return;
            }
            if (i10 == zcVar.d0) {
                b9Var.setText(org.telegram.messenger.cd.L0(zcVar.Q0(), null));
                return;
            }
            if (i10 == zcVar.g0) {
                b9Var.setText(org.telegram.messenger.cd.L0(zcVar.K0(), null));
                return;
            }
            if (i10 == zcVar.i0) {
                b9Var.setText(org.telegram.messenger.cd.L0(zcVar.G0(), null));
                return;
            }
            if (i10 == zcVar.k0) {
                b9Var.setText(org.telegram.messenger.cd.L0(zcVar.R0(), null));
                return;
            } else {
                if (i10 == 0) {
                    b9Var.setText("");
                    b9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        mc mcVar = (mc) view;
        mcVar.e = false;
        org.telegram.ui.ActionBar.u5 u5Var = mcVar.a;
        mcVar.setWillNotDraw(true);
        if (i10 == zcVar.U) {
            i15 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            mcVar.a(i15, zcVar.f, true);
            u5Var.l(org.telegram.messenger.cd.L0(2131752309, null), false);
            if (zcVar.b < zcVar.getMessagesController().r5) {
                mcVar.e(zcVar.getMessagesController().r5);
            } else {
                mcVar.e(0);
            }
            mcVar.c(zcVar.n, false, false);
            return;
        }
        if (i10 == zcVar.c0) {
            i14 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            mcVar.a(i14, zcVar.s, false);
            u5Var.l(org.telegram.messenger.cd.L0(2131752319, null), false);
            boolean z10 = zcVar.e0 >= 0;
            mcVar.e = z10;
            mcVar.setWillNotDraw(!z10);
            if (zcVar.b < zcVar.P0()) {
                mcVar.e(zcVar.P0());
            } else {
                mcVar.e(0);
            }
            mcVar.c(zcVar.x, false, false);
            return;
        }
        if (i10 == zcVar.f0) {
            i13 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            mcVar.a(i13, zcVar.s, false);
            u5Var.l(org.telegram.messenger.cd.L0(zcVar.M0(), null), false);
            if (zcVar.b < zcVar.L0()) {
                mcVar.e(zcVar.L0());
            } else {
                mcVar.e(0);
            }
            mcVar.c(org.telegram.messenger.o5.f(zcVar.D), org.telegram.messenger.o5.B(zcVar.D), false);
            return;
        }
        if (i10 != zcVar.h0) {
            if (i10 == zcVar.j0) {
                u5Var.l(org.telegram.messenger.cd.L0(zcVar.S0(), null), false);
                mcVar.e(0);
                TLRPC.ChatFull M0 = zcVar.getMessagesController().M0(-j10);
                if (M0 == null || (stickerSet = M0.stickerset) == null) {
                    mcVar.c(0L, false, false);
                    return;
                } else {
                    mcVar.d(zcVar.I0(stickerSet));
                    return;
                }
            }
            return;
        }
        i12 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
        mcVar.a(i12, zcVar.s, false);
        u5Var.l(org.telegram.messenger.cd.L0(zcVar.H0(), null), false);
        if (zcVar.b < zcVar.N0()) {
            mcVar.e(zcVar.N0());
        } else {
            mcVar.e(0);
        }
        TLRPC.ChatFull M02 = zcVar.getMessagesController().M0(-j10);
        if (M02 == null || (stickerSet2 = M02.emojiset) == null) {
            mcVar.c(0L, false, false);
        } else {
            mcVar.c(zcVar.J0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var4;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var5;
        org.telegram.ui.ActionBar.p6 p6Var6;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.p6 p6Var8;
        int i14;
        zc zcVar = this.c;
        if (i10 == 0) {
            Activity parentActivity = zcVar.getParentActivity();
            z4Var = ((org.telegram.ui.ActionBar.k2) zcVar).parentLayout;
            int O0 = zcVar.O0();
            long j10 = zcVar.a;
            p6Var8 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, z4Var, O0, j10, p6Var8);
            z9Var.F = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.x = zcVar;
            Drawable drawable = zcVar.H;
            i14 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            Drawable f7 = vh.k4.f(drawable, i14, zcVar.F, zcVar.J);
            zcVar.H = f7;
            z9Var.setOverrideBackground(f7);
            frameLayout = z9Var;
        } else if (i10 == 2) {
            Activity parentActivity2 = zcVar.getParentActivity();
            i13 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var7 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            xc xcVar = new xc(i13, parentActivity2, p6Var7);
            xcVar.setWithRemovedStub(true);
            String j11 = org.telegram.messenger.g4.j(zcVar.F);
            if (j11 == null && zcVar.F == null && zcVar.G != null) {
                j11 = "❌";
            }
            xcVar.a(j11, false);
            xcVar.setGalleryWallpaper(zcVar.G);
            final int i15 = 0;
            xcVar.setOnEmoticonSelected(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.kc
                public final /* synthetic */ lc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            zc zcVar2 = this.b.c;
                            if (str == null) {
                                zcVar2.F = zcVar2.G;
                            } else if (str.equals("❌")) {
                                zcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                zcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                zcVar2.F.settings.emoticon = str;
                            }
                            zcVar2.d1(true);
                            zcVar2.g1(true);
                            break;
                        default:
                            zc zcVar3 = this.b.c;
                            zcVar3.s = ((Integer) obj).intValue();
                            if (zcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                zcVar3.D = null;
                            }
                            zcVar3.d1(true);
                            zcVar3.h1();
                            zcVar3.f1(true);
                            break;
                    }
                }
            });
            frameLayout = xcVar;
        } else if (i10 == 5) {
            frameLayout = new org.telegram.ui.Cells.p8(zcVar.getParentActivity(), zcVar.getResourceProvider());
        } else if (i10 == 6) {
            Activity parentActivity3 = zcVar.getParentActivity();
            p6Var6 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            mc mcVar = new mc(parentActivity3);
            mcVar.e = false;
            mcVar.d = p6Var6;
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(parentActivity3);
            mcVar.a = u5Var;
            u5Var.setTextSize(16);
            org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var6);
            mcVar.addView(u5Var, w7.b6.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            mcVar.c = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), 13, mcVar, false);
            frameLayout = mcVar;
        } else if (i10 == 3) {
            Activity parentActivity4 = zcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var5 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            qc qcVar = new qc(i12, parentActivity4, p6Var5);
            qcVar.b.setOnItemClickListener(new mg.q0(4, this, qcVar));
            frameLayout = qcVar;
        } else if (i10 == 4) {
            Activity parentActivity5 = zcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.k2) zcVar).currentAccount;
            p6Var4 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            qn0 qn0Var = new qn0(0, i11, parentActivity5, p6Var4);
            qn0Var.setDivider(false);
            final int i16 = 1;
            qn0Var.setOnColorClick(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.kc
                public final /* synthetic */ lc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            String str = (String) obj;
                            zc zcVar2 = this.b.c;
                            if (str == null) {
                                zcVar2.F = zcVar2.G;
                            } else if (str.equals("❌")) {
                                zcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                zcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                zcVar2.F.settings.emoticon = str;
                            }
                            zcVar2.d1(true);
                            zcVar2.g1(true);
                            break;
                        default:
                            zc zcVar3 = this.b.c;
                            zcVar3.s = ((Integer) obj).intValue();
                            if (zcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                zcVar3.D = null;
                            }
                            zcVar3.d1(true);
                            zcVar3.h1();
                            zcVar3.f1(true);
                            break;
                    }
                }
            });
            frameLayout = qn0Var;
        } else if (i10 == 1) {
            FrameLayout scVar = new sc(zcVar, zcVar.getParentActivity());
            frameLayout = scVar;
            if (zcVar.d) {
                scVar.setTag(-33024);
                frameLayout = scVar;
            }
        } else if (i10 == 8) {
            Activity parentActivity6 = zcVar.getParentActivity();
            p6Var3 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.p4(parentActivity6, p6Var3);
        } else if (i10 == 9) {
            Activity parentActivity7 = zcVar.getParentActivity();
            p6Var2 = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            frameLayout = new cn0(parentActivity7, p6Var2, false);
        } else if (i10 == 10) {
            Activity parentActivity8 = zcVar.getParentActivity();
            p6Var = ((org.telegram.ui.ActionBar.k2) zcVar).resourceProvider;
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(parentActivity8, p6Var);
            zzVar.setIsSingleCell(true);
            zzVar.setViewType(35);
            frameLayout = zzVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.b9(zcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.ck0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        boolean z10 = view instanceof sc;
        zc zcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.z9) {
                ((org.telegram.ui.Cells.z9) view).setOverrideBackground(zcVar.H);
                return;
            } else {
                zc.e1(view);
                return;
            }
        }
        rc rcVar = ((sc) view).b;
        TLRPC.EmojiStatus emojiStatus = zcVar.D;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            rcVar.c(org.telegram.messenger.kp.a(emojiStatus), false);
            rcVar.d(((TLRPC.TL_emojiStatusCollectible) zcVar.D).pattern_document_id, true, false);
        } else {
            rcVar.b(zcVar.s, false);
            rcVar.d(zcVar.x, false, false);
        }
        rcVar.e(org.telegram.messenger.o5.f(zcVar.D), org.telegram.messenger.o5.B(zcVar.D), false);
        rcVar.setForum(zcVar.X0());
        rcVar.a(zcVar.f);
    }
}
