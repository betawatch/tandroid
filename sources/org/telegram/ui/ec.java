package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ec extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ rc c;

    public ec(rc rcVar) {
        this.c = rcVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 5 || i7 == 6;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.R;
    }

    @Override // v4.g0
    public final int d(int i7) {
        rc rcVar = this.c;
        if (i7 == rcVar.S) {
            return 0;
        }
        if (i7 == rcVar.W) {
            return 2;
        }
        if (i7 == rcVar.Z) {
            return 1;
        }
        if (i7 == rcVar.T) {
            return 3;
        }
        if (i7 == rcVar.b0) {
            return 4;
        }
        if (i7 == rcVar.U || i7 == rcVar.c0 || i7 == rcVar.f0 || i7 == rcVar.h0 || i7 == rcVar.j0) {
            return 6;
        }
        return (i7 == rcVar.X || i7 == rcVar.e0) ? 5 : 7;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        int i14;
        rc rcVar = this.c;
        long j3 = rcVar.a;
        int i15 = d1Var.f;
        View view = d1Var.a;
        if (i15 == 1) {
            kc kcVar = (kc) view;
            ol0 ol0Var = kcVar.a;
            jc jcVar = kcVar.b;
            i10 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            ol0Var.b(i10, rcVar.s, false);
            jcVar.b(rcVar.s, false);
            jcVar.d(rcVar.x, false, false);
            jcVar.setForum(rcVar.Y0());
            jcVar.e(org.telegram.messenger.m5.f(rcVar.D), false, false);
            jcVar.a(rcVar.f);
            return;
        }
        if (i15 == 3) {
            ((ic) view).a(rcVar.f, false);
            return;
        }
        if (i15 == 4) {
            ((em0) view).a(rcVar.s, false);
            return;
        }
        if (i15 == 5) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i7 == rcVar.e0) {
                m8Var.k(org.telegram.messenger.id.M0(2131752324, null), false);
                return;
            }
            m8Var.k(org.telegram.messenger.id.M0(rcVar.W0(), null), false);
            if (rcVar.b < rcVar.G0()) {
                m8Var.j(rcVar.G0());
                return;
            } else {
                m8Var.j(0);
                return;
            }
        }
        if (i15 != 6) {
            if (i15 != 7) {
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i7 == rcVar.a0) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
            if (i7 == rcVar.V) {
                z8Var.setText(org.telegram.messenger.id.M0(2131752310, null));
                return;
            }
            if (i7 == rcVar.Y) {
                z8Var.setText(org.telegram.messenger.id.M0(rcVar.U0(), null));
                return;
            }
            if (i7 == rcVar.d0) {
                z8Var.setText(org.telegram.messenger.id.M0(rcVar.R0(), null));
                return;
            }
            if (i7 == rcVar.g0) {
                z8Var.setText(org.telegram.messenger.id.M0(rcVar.L0(), null));
                return;
            }
            if (i7 == rcVar.i0) {
                z8Var.setText(org.telegram.messenger.id.M0(rcVar.H0(), null));
                return;
            }
            if (i7 == rcVar.k0) {
                z8Var.setText(org.telegram.messenger.id.M0(rcVar.S0(), null));
                return;
            } else {
                if (i7 == 0) {
                    z8Var.setText("");
                    z8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        fc fcVar = (fc) view;
        fcVar.e = false;
        org.telegram.ui.ActionBar.k5 k5Var = fcVar.a;
        fcVar.setWillNotDraw(true);
        if (i7 == rcVar.U) {
            i14 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            fcVar.a(i14, rcVar.f, true);
            k5Var.l(org.telegram.messenger.id.M0(2131752309, null), false);
            if (rcVar.b < rcVar.getMessagesController().q5) {
                fcVar.e(rcVar.getMessagesController().q5);
            } else {
                fcVar.e(0);
            }
            fcVar.c(rcVar.n, false, false);
            return;
        }
        if (i7 == rcVar.c0) {
            i13 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            fcVar.a(i13, rcVar.s, false);
            k5Var.l(org.telegram.messenger.id.M0(2131752319, null), false);
            boolean z9 = rcVar.e0 >= 0;
            fcVar.e = z9;
            fcVar.setWillNotDraw(!z9);
            if (rcVar.b < rcVar.Q0()) {
                fcVar.e(rcVar.Q0());
            } else {
                fcVar.e(0);
            }
            fcVar.c(rcVar.x, false, false);
            return;
        }
        if (i7 == rcVar.f0) {
            i12 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            fcVar.a(i12, rcVar.s, false);
            k5Var.l(org.telegram.messenger.id.M0(rcVar.N0(), null), false);
            if (rcVar.b < rcVar.M0()) {
                fcVar.e(rcVar.M0());
            } else {
                fcVar.e(0);
            }
            fcVar.c(org.telegram.messenger.m5.f(rcVar.D), org.telegram.messenger.m5.B(rcVar.D), false);
            return;
        }
        if (i7 != rcVar.h0) {
            if (i7 == rcVar.j0) {
                k5Var.l(org.telegram.messenger.id.M0(rcVar.T0(), null), false);
                fcVar.e(0);
                TLRPC.ChatFull N0 = rcVar.getMessagesController().N0(-j3);
                if (N0 == null || (stickerSet = N0.stickerset) == null) {
                    fcVar.c(0L, false, false);
                    return;
                } else {
                    fcVar.d(rcVar.J0(stickerSet));
                    return;
                }
            }
            return;
        }
        i11 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
        fcVar.a(i11, rcVar.s, false);
        k5Var.l(org.telegram.messenger.id.M0(rcVar.I0(), null), false);
        if (rcVar.b < rcVar.O0()) {
            fcVar.e(rcVar.O0());
        } else {
            fcVar.e(0);
        }
        TLRPC.ChatFull N02 = rcVar.getMessagesController().N0(-j3);
        if (N02 == null || (stickerSet2 = N02.emojiset) == null) {
            fcVar.c(0L, false, false);
        } else {
            fcVar.c(rcVar.K0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var5;
        org.telegram.ui.ActionBar.f6 f6Var6;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i13;
        rc rcVar = this.c;
        if (i7 == 0) {
            Activity parentActivity = rcVar.getParentActivity();
            q4Var = ((org.telegram.ui.ActionBar.f2) rcVar).parentLayout;
            int P0 = rcVar.P0();
            long j3 = rcVar.a;
            f6Var8 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, q4Var, P0, j3, f6Var8);
            z9Var.F = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.x = rcVar;
            Drawable drawable = rcVar.H;
            i13 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            Drawable f10 = fi.y5.f(drawable, i13, rcVar.F, rcVar.J);
            rcVar.H = f10;
            z9Var.setOverrideBackground(f10);
            frameLayout = z9Var;
        } else if (i7 == 2) {
            Activity parentActivity2 = rcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            f6Var7 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            pc pcVar = new pc(i12, parentActivity2, f6Var7);
            pcVar.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.d4.j(rcVar.F);
            if (j10 == null && rcVar.F == null && rcVar.G != null) {
                j10 = "❌";
            }
            pcVar.a(j10, false);
            pcVar.setGalleryWallpaper(rcVar.G);
            final int i14 = 0;
            pcVar.setOnEmoticonSelected(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.dc
                public final /* synthetic */ ec b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i14) {
                        case 0:
                            String str = (String) obj;
                            rc rcVar2 = this.b.c;
                            if (str == null) {
                                rcVar2.F = rcVar2.G;
                            } else if (str.equals("❌")) {
                                rcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                rcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                rcVar2.F.settings.emoticon = str;
                            }
                            rcVar2.e1(true);
                            rcVar2.h1(true);
                            break;
                        default:
                            rc rcVar3 = this.b.c;
                            rcVar3.s = ((Integer) obj).intValue();
                            if (rcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                rcVar3.D = null;
                            }
                            rcVar3.e1(true);
                            rcVar3.i1();
                            rcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = pcVar;
        } else if (i7 == 5) {
            frameLayout = new org.telegram.ui.Cells.m8(rcVar.getParentActivity(), rcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = rcVar.getParentActivity();
            f6Var6 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            fc fcVar = new fc(parentActivity3);
            fcVar.e = false;
            fcVar.d = f6Var6;
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(parentActivity3);
            fcVar.a = k5Var;
            k5Var.setTextSize(16);
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var6);
            fcVar.addView(k5Var, c8.ha.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            fcVar.c = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, fcVar, false);
            frameLayout = fcVar;
        } else if (i7 == 3) {
            Activity parentActivity4 = rcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            f6Var5 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            ic icVar = new ic(i11, parentActivity4, f6Var5);
            icVar.b.setOnItemClickListener(new di.p4(5, this, icVar));
            frameLayout = icVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = rcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.f2) rcVar).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            em0 em0Var = new em0(0, i10, parentActivity5, f6Var4);
            em0Var.setDivider(false);
            final int i15 = 1;
            em0Var.setOnColorClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.dc
                public final /* synthetic */ ec b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            rc rcVar2 = this.b.c;
                            if (str == null) {
                                rcVar2.F = rcVar2.G;
                            } else if (str.equals("❌")) {
                                rcVar2.F = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                rcVar2.F = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                rcVar2.F.settings.emoticon = str;
                            }
                            rcVar2.e1(true);
                            rcVar2.h1(true);
                            break;
                        default:
                            rc rcVar3 = this.b.c;
                            rcVar3.s = ((Integer) obj).intValue();
                            if (rcVar3.D instanceof TLRPC.TL_emojiStatusCollectible) {
                                rcVar3.D = null;
                            }
                            rcVar3.e1(true);
                            rcVar3.i1();
                            rcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = em0Var;
        } else if (i7 == 1) {
            FrameLayout kcVar = new kc(rcVar, rcVar.getParentActivity());
            frameLayout = kcVar;
            if (rcVar.d) {
                kcVar.setTag(-33024);
                frameLayout = kcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = rcVar.getParentActivity();
            f6Var3 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.n4(parentActivity6, f6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = rcVar.getParentActivity();
            f6Var2 = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            frameLayout = new ql0(parentActivity7, f6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = rcVar.getParentActivity();
            f6Var = ((org.telegram.ui.ActionBar.f2) rcVar).resourceProvider;
            org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(parentActivity8, f6Var);
            mzVar.setIsSingleCell(true);
            mzVar.setViewType(35);
            frameLayout = mzVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.z8(rcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        View view = d1Var.a;
        boolean z9 = view instanceof kc;
        rc rcVar = this.c;
        if (!z9) {
            if (view instanceof org.telegram.ui.Cells.z9) {
                ((org.telegram.ui.Cells.z9) view).setOverrideBackground(rcVar.H);
                return;
            } else {
                rc.f1(view);
                return;
            }
        }
        jc jcVar = ((kc) view).b;
        TLRPC.EmojiStatus emojiStatus = rcVar.D;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            jcVar.c(org.telegram.messenger.fp.a(emojiStatus), false);
            jcVar.d(((TLRPC.TL_emojiStatusCollectible) rcVar.D).pattern_document_id, true, false);
        } else {
            jcVar.b(rcVar.s, false);
            jcVar.d(rcVar.x, false, false);
        }
        jcVar.e(org.telegram.messenger.m5.f(rcVar.D), org.telegram.messenger.m5.B(rcVar.D), false);
        jcVar.setForum(rcVar.Y0());
        jcVar.a(rcVar.f);
    }
}
