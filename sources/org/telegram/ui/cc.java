package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cc extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ pc c;

    public cc(pc pcVar) {
        this.c = pcVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 5 || i3 == 6;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.S;
    }

    @Override // u4.h0
    public final int d(int i3) {
        pc pcVar = this.c;
        if (i3 == pcVar.T) {
            return 0;
        }
        if (i3 == pcVar.X) {
            return 2;
        }
        if (i3 == pcVar.a0) {
            return 1;
        }
        if (i3 == pcVar.U) {
            return 3;
        }
        if (i3 == pcVar.c0) {
            return 4;
        }
        if (i3 == pcVar.V || i3 == pcVar.d0 || i3 == pcVar.g0 || i3 == pcVar.i0 || i3 == pcVar.k0) {
            return 6;
        }
        return (i3 == pcVar.Y || i3 == pcVar.f0) ? 5 : 7;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        int i14;
        pc pcVar = this.c;
        long j10 = pcVar.a;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 1) {
            ic icVar = (ic) view;
            jl0 jl0Var = icVar.a;
            hc hcVar = icVar.b;
            i10 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            jl0Var.b(i10, pcVar.s, false);
            hcVar.b(pcVar.s, false);
            hcVar.d(pcVar.x, false, false);
            hcVar.setForum(pcVar.Y0());
            hcVar.e(org.telegram.messenger.m5.f(pcVar.E), false, false);
            hcVar.a(pcVar.f);
            return;
        }
        if (i15 == 3) {
            ((gc) view).a(pcVar.f, false);
            return;
        }
        if (i15 == 4) {
            ((zl0) view).a(pcVar.s, false);
            return;
        }
        if (i15 == 5) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i3 == pcVar.f0) {
                l8Var.k(org.telegram.messenger.bd.M0(2131752324, null), false);
                return;
            }
            l8Var.k(org.telegram.messenger.bd.M0(pcVar.W0(), null), false);
            if (pcVar.b < pcVar.G0()) {
                l8Var.j(pcVar.G0());
                return;
            } else {
                l8Var.j(0);
                return;
            }
        }
        if (i15 != 6) {
            if (i15 != 7) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i3 == pcVar.b0) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            if (i3 == pcVar.W) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131752310, null));
                return;
            }
            if (i3 == pcVar.Z) {
                y8Var.setText(org.telegram.messenger.bd.M0(pcVar.U0(), null));
                return;
            }
            if (i3 == pcVar.e0) {
                y8Var.setText(org.telegram.messenger.bd.M0(pcVar.R0(), null));
                return;
            }
            if (i3 == pcVar.h0) {
                y8Var.setText(org.telegram.messenger.bd.M0(pcVar.L0(), null));
                return;
            }
            if (i3 == pcVar.j0) {
                y8Var.setText(org.telegram.messenger.bd.M0(pcVar.H0(), null));
                return;
            }
            if (i3 == pcVar.l0) {
                y8Var.setText(org.telegram.messenger.bd.M0(pcVar.S0(), null));
                return;
            } else {
                if (i3 == 0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        dc dcVar = (dc) view;
        dcVar.e = false;
        org.telegram.ui.ActionBar.k5 k5Var = dcVar.a;
        dcVar.setWillNotDraw(true);
        if (i3 == pcVar.V) {
            i14 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            dcVar.a(i14, pcVar.f, true);
            k5Var.l(org.telegram.messenger.bd.M0(2131752309, null), false);
            if (pcVar.b < pcVar.getMessagesController().q5) {
                dcVar.e(pcVar.getMessagesController().q5);
            } else {
                dcVar.e(0);
            }
            dcVar.c(pcVar.n, false, false);
            return;
        }
        if (i3 == pcVar.d0) {
            i13 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            dcVar.a(i13, pcVar.s, false);
            k5Var.l(org.telegram.messenger.bd.M0(2131752319, null), false);
            boolean z10 = pcVar.f0 >= 0;
            dcVar.e = z10;
            dcVar.setWillNotDraw(!z10);
            if (pcVar.b < pcVar.Q0()) {
                dcVar.e(pcVar.Q0());
            } else {
                dcVar.e(0);
            }
            dcVar.c(pcVar.x, false, false);
            return;
        }
        if (i3 == pcVar.g0) {
            i12 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            dcVar.a(i12, pcVar.s, false);
            k5Var.l(org.telegram.messenger.bd.M0(pcVar.N0(), null), false);
            if (pcVar.b < pcVar.M0()) {
                dcVar.e(pcVar.M0());
            } else {
                dcVar.e(0);
            }
            dcVar.c(org.telegram.messenger.m5.f(pcVar.E), org.telegram.messenger.m5.B(pcVar.E), false);
            return;
        }
        if (i3 != pcVar.i0) {
            if (i3 == pcVar.k0) {
                k5Var.l(org.telegram.messenger.bd.M0(pcVar.T0(), null), false);
                dcVar.e(0);
                TLRPC.ChatFull N0 = pcVar.getMessagesController().N0(-j10);
                if (N0 == null || (stickerSet = N0.stickerset) == null) {
                    dcVar.c(0L, false, false);
                    return;
                } else {
                    dcVar.d(pcVar.J0(stickerSet));
                    return;
                }
            }
            return;
        }
        i11 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
        dcVar.a(i11, pcVar.s, false);
        k5Var.l(org.telegram.messenger.bd.M0(pcVar.I0(), null), false);
        if (pcVar.b < pcVar.O0()) {
            dcVar.e(pcVar.O0());
        } else {
            dcVar.e(0);
        }
        TLRPC.ChatFull N02 = pcVar.getMessagesController().N0(-j10);
        if (N02 == null || (stickerSet2 = N02.emojiset) == null) {
            dcVar.c(0L, false, false);
        } else {
            dcVar.c(pcVar.K0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i13;
        pc pcVar = this.c;
        if (i3 == 0) {
            Activity parentActivity = pcVar.getParentActivity();
            q4Var = ((org.telegram.ui.ActionBar.d2) pcVar).parentLayout;
            int P0 = pcVar.P0();
            long j10 = pcVar.a;
            e6Var8 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, q4Var, P0, j10, e6Var8);
            z9Var.G = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.x = pcVar;
            Drawable drawable = pcVar.I;
            i13 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            Drawable f10 = gi.y5.f(drawable, i13, pcVar.G, pcVar.K);
            pcVar.I = f10;
            z9Var.setOverrideBackground(f10);
            frameLayout = z9Var;
        } else if (i3 == 2) {
            Activity parentActivity2 = pcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            nc ncVar = new nc(i12, parentActivity2, e6Var7);
            ncVar.setWithRemovedStub(true);
            String j11 = org.telegram.messenger.d4.j(pcVar.G);
            if (j11 == null && pcVar.G == null && pcVar.H != null) {
                j11 = "❌";
            }
            ncVar.a(j11, false);
            ncVar.setGalleryWallpaper(pcVar.H);
            final int i14 = 0;
            ncVar.setOnEmoticonSelected(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.bc
                public final /* synthetic */ cc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i14) {
                        case 0:
                            String str = (String) obj;
                            pc pcVar2 = this.b.c;
                            if (str == null) {
                                pcVar2.G = pcVar2.H;
                            } else if (str.equals("❌")) {
                                pcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                pcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                pcVar2.G.settings.emoticon = str;
                            }
                            pcVar2.e1(true);
                            pcVar2.h1(true);
                            break;
                        default:
                            pc pcVar3 = this.b.c;
                            pcVar3.s = ((Integer) obj).intValue();
                            if (pcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                pcVar3.E = null;
                            }
                            pcVar3.e1(true);
                            pcVar3.i1();
                            pcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = ncVar;
        } else if (i3 == 5) {
            frameLayout = new org.telegram.ui.Cells.l8(pcVar.getParentActivity(), pcVar.getResourceProvider());
        } else if (i3 == 6) {
            Activity parentActivity3 = pcVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            dc dcVar = new dc(parentActivity3);
            dcVar.e = false;
            dcVar.d = e6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            dcVar.a = k5Var;
            k5Var.setTextSize(16);
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var6);
            dcVar.addView(k5Var, b8.mf.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            dcVar.c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, dcVar, false);
            frameLayout = dcVar;
        } else if (i3 == 3) {
            Activity parentActivity4 = pcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            gc gcVar = new gc(i11, parentActivity4, e6Var5);
            gcVar.b.setOnItemClickListener(new ei.q4(5, this, gcVar));
            frameLayout = gcVar;
        } else if (i3 == 4) {
            Activity parentActivity5 = pcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.d2) pcVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            zl0 zl0Var = new zl0(0, i10, parentActivity5, e6Var4);
            zl0Var.setDivider(false);
            final int i15 = 1;
            zl0Var.setOnColorClick(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.bc
                public final /* synthetic */ cc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            pc pcVar2 = this.b.c;
                            if (str == null) {
                                pcVar2.G = pcVar2.H;
                            } else if (str.equals("❌")) {
                                pcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                pcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                pcVar2.G.settings.emoticon = str;
                            }
                            pcVar2.e1(true);
                            pcVar2.h1(true);
                            break;
                        default:
                            pc pcVar3 = this.b.c;
                            pcVar3.s = ((Integer) obj).intValue();
                            if (pcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                pcVar3.E = null;
                            }
                            pcVar3.e1(true);
                            pcVar3.i1();
                            pcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = zl0Var;
        } else if (i3 == 1) {
            FrameLayout icVar = new ic(pcVar, pcVar.getParentActivity());
            frameLayout = icVar;
            if (pcVar.d) {
                icVar.setTag(-33024);
                frameLayout = icVar;
            }
        } else if (i3 == 8) {
            Activity parentActivity6 = pcVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.n4(parentActivity6, e6Var3);
        } else if (i3 == 9) {
            Activity parentActivity7 = pcVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            frameLayout = new ll0(parentActivity7, e6Var2, false);
        } else if (i3 == 10) {
            Activity parentActivity8 = pcVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.d2) pcVar).resourceProvider;
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(parentActivity8, e6Var);
            izVar.setIsSingleCell(true);
            izVar.setViewType(35);
            frameLayout = izVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(pcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.bj0(frameLayout);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        View view = d1Var.a;
        boolean z10 = view instanceof ic;
        pc pcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.z9) {
                ((org.telegram.ui.Cells.z9) view).setOverrideBackground(pcVar.I);
                return;
            } else {
                pc.f1(view);
                return;
            }
        }
        hc hcVar = ((ic) view).b;
        TLRPC.EmojiStatus emojiStatus = pcVar.E;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            hcVar.c(org.telegram.messenger.wo.a(emojiStatus), false);
            hcVar.d(((TLRPC.TL_emojiStatusCollectible) pcVar.E).pattern_document_id, true, false);
        } else {
            hcVar.b(pcVar.s, false);
            hcVar.d(pcVar.x, false, false);
        }
        hcVar.e(org.telegram.messenger.m5.f(pcVar.E), org.telegram.messenger.m5.B(pcVar.E), false);
        hcVar.setForum(pcVar.Y0());
        hcVar.a(pcVar.f);
    }
}
