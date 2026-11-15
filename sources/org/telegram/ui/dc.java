package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class dc extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ qc c;

    public dc(qc qcVar) {
        this.c = qcVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 5 || i7 == 6;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.S;
    }

    @Override // v4.h0
    public final int d(int i7) {
        qc qcVar = this.c;
        if (i7 == qcVar.T) {
            return 0;
        }
        if (i7 == qcVar.X) {
            return 2;
        }
        if (i7 == qcVar.a0) {
            return 1;
        }
        if (i7 == qcVar.U) {
            return 3;
        }
        if (i7 == qcVar.c0) {
            return 4;
        }
        if (i7 == qcVar.V || i7 == qcVar.d0 || i7 == qcVar.g0 || i7 == qcVar.i0 || i7 == qcVar.k0) {
            return 6;
        }
        return (i7 == qcVar.Y || i7 == qcVar.f0) ? 5 : 7;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        int i14;
        qc qcVar = this.c;
        long j3 = qcVar.a;
        int i15 = e1Var.f;
        View view = e1Var.a;
        if (i15 == 1) {
            jc jcVar = (jc) view;
            pl0 pl0Var = jcVar.a;
            ic icVar = jcVar.b;
            i10 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            pl0Var.b(i10, qcVar.s, false);
            icVar.b(qcVar.s, false);
            icVar.d(qcVar.x, false, false);
            icVar.setForum(qcVar.Y0());
            icVar.e(org.telegram.messenger.m5.f(qcVar.E), false, false);
            icVar.a(qcVar.f);
            return;
        }
        if (i15 == 3) {
            ((hc) view).a(qcVar.f, false);
            return;
        }
        if (i15 == 4) {
            ((fm0) view).a(qcVar.s, false);
            return;
        }
        if (i15 == 5) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i7 == qcVar.f0) {
                l8Var.k(org.telegram.messenger.hd.M0(2131752324, null), false);
                return;
            }
            l8Var.k(org.telegram.messenger.hd.M0(qcVar.W0(), null), false);
            if (qcVar.b < qcVar.G0()) {
                l8Var.j(qcVar.G0());
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
            if (i7 == qcVar.b0) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            if (i7 == qcVar.W) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131752310, null));
                return;
            }
            if (i7 == qcVar.Z) {
                y8Var.setText(org.telegram.messenger.hd.M0(qcVar.U0(), null));
                return;
            }
            if (i7 == qcVar.e0) {
                y8Var.setText(org.telegram.messenger.hd.M0(qcVar.R0(), null));
                return;
            }
            if (i7 == qcVar.h0) {
                y8Var.setText(org.telegram.messenger.hd.M0(qcVar.L0(), null));
                return;
            }
            if (i7 == qcVar.j0) {
                y8Var.setText(org.telegram.messenger.hd.M0(qcVar.H0(), null));
                return;
            }
            if (i7 == qcVar.l0) {
                y8Var.setText(org.telegram.messenger.hd.M0(qcVar.S0(), null));
                return;
            } else {
                if (i7 == 0) {
                    y8Var.setText("");
                    y8Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        ec ecVar = (ec) view;
        ecVar.e = false;
        org.telegram.ui.ActionBar.j5 j5Var = ecVar.a;
        ecVar.setWillNotDraw(true);
        if (i7 == qcVar.V) {
            i14 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            ecVar.a(i14, qcVar.f, true);
            j5Var.l(org.telegram.messenger.hd.M0(2131752309, null), false);
            if (qcVar.b < qcVar.getMessagesController().r5) {
                ecVar.e(qcVar.getMessagesController().r5);
            } else {
                ecVar.e(0);
            }
            ecVar.c(qcVar.n, false, false);
            return;
        }
        if (i7 == qcVar.d0) {
            i13 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            ecVar.a(i13, qcVar.s, false);
            j5Var.l(org.telegram.messenger.hd.M0(2131752319, null), false);
            boolean z10 = qcVar.f0 >= 0;
            ecVar.e = z10;
            ecVar.setWillNotDraw(!z10);
            if (qcVar.b < qcVar.Q0()) {
                ecVar.e(qcVar.Q0());
            } else {
                ecVar.e(0);
            }
            ecVar.c(qcVar.x, false, false);
            return;
        }
        if (i7 == qcVar.g0) {
            i12 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            ecVar.a(i12, qcVar.s, false);
            j5Var.l(org.telegram.messenger.hd.M0(qcVar.N0(), null), false);
            if (qcVar.b < qcVar.M0()) {
                ecVar.e(qcVar.M0());
            } else {
                ecVar.e(0);
            }
            ecVar.c(org.telegram.messenger.m5.f(qcVar.E), org.telegram.messenger.m5.B(qcVar.E), false);
            return;
        }
        if (i7 != qcVar.i0) {
            if (i7 == qcVar.k0) {
                j5Var.l(org.telegram.messenger.hd.M0(qcVar.T0(), null), false);
                ecVar.e(0);
                TLRPC.ChatFull N0 = qcVar.getMessagesController().N0(-j3);
                if (N0 == null || (stickerSet = N0.stickerset) == null) {
                    ecVar.c(0L, false, false);
                    return;
                } else {
                    ecVar.d(qcVar.J0(stickerSet));
                    return;
                }
            }
            return;
        }
        i11 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
        ecVar.a(i11, qcVar.s, false);
        j5Var.l(org.telegram.messenger.hd.M0(qcVar.I0(), null), false);
        if (qcVar.b < qcVar.O0()) {
            ecVar.e(qcVar.O0());
        } else {
            ecVar.e(0);
        }
        TLRPC.ChatFull N02 = qcVar.getMessagesController().N0(-j3);
        if (N02 == null || (stickerSet2 = N02.emojiset) == null) {
            ecVar.c(0L, false, false);
        } else {
            ecVar.c(qcVar.K0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
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
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.e6 e6Var8;
        int i13;
        qc qcVar = this.c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            o4Var = ((org.telegram.ui.ActionBar.e2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.a;
            e6Var8 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(parentActivity, o4Var, P0, j3, e6Var8);
            z9Var.G = true;
            z9Var.setImportantForAccessibility(4);
            z9Var.x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            Drawable f10 = hi.x5.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            z9Var.setOverrideBackground(f10);
            frameLayout = z9Var;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var7 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            oc ocVar = new oc(i12, parentActivity2, e6Var7);
            ocVar.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.d4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar.a(j10, false);
            ocVar.setGalleryWallpaper(qcVar.H);
            final int i14 = 0;
            ocVar.setOnEmoticonSelected(new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.cc
                public final /* synthetic */ dc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i14) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.b.c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            break;
                        default:
                            qc qcVar3 = this.b.c;
                            qcVar3.s = ((Integer) obj).intValue();
                            if (qcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                qcVar3.E = null;
                            }
                            qcVar3.e1(true);
                            qcVar3.i1();
                            qcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = ocVar;
        } else if (i7 == 5) {
            frameLayout = new org.telegram.ui.Cells.l8(qcVar.getParentActivity(), qcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = qcVar.getParentActivity();
            e6Var6 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            ec ecVar = new ec(parentActivity3);
            ecVar.e = false;
            ecVar.d = e6Var6;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(parentActivity3);
            ecVar.a = j5Var;
            j5Var.setTextSize(16);
            org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, e6Var6);
            ecVar.addView(j5Var, c8.ja.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ecVar.c = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, ecVar, false);
            frameLayout = ecVar;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var5 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, e6Var5);
            hcVar.b.setOnItemClickListener(new fi.i4(5, this, hcVar));
            frameLayout = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.e2) qcVar).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            fm0 fm0Var = new fm0(0, i10, parentActivity5, e6Var4);
            fm0Var.setDivider(false);
            final int i15 = 1;
            fm0Var.setOnColorClick(new org.telegram.messenger.z10(this) { // from class: org.telegram.ui.cc
                public final /* synthetic */ dc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.z10
                public final void a(Object obj) {
                    switch (i15) {
                        case 0:
                            String str = (String) obj;
                            qc qcVar2 = this.b.c;
                            if (str == null) {
                                qcVar2.G = qcVar2.H;
                            } else if (str.equals("❌")) {
                                qcVar2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                qcVar2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                qcVar2.G.settings.emoticon = str;
                            }
                            qcVar2.e1(true);
                            qcVar2.h1(true);
                            break;
                        default:
                            qc qcVar3 = this.b.c;
                            qcVar3.s = ((Integer) obj).intValue();
                            if (qcVar3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                qcVar3.E = null;
                            }
                            qcVar3.e1(true);
                            qcVar3.i1();
                            qcVar3.g1(true);
                            break;
                    }
                }
            });
            frameLayout = fm0Var;
        } else if (i7 == 1) {
            FrameLayout jcVar = new jc(qcVar, qcVar.getParentActivity());
            frameLayout = jcVar;
            if (qcVar.d) {
                jcVar.setTag(-33024);
                frameLayout = jcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = qcVar.getParentActivity();
            e6Var3 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.n4(parentActivity6, e6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            e6Var2 = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            frameLayout = new rl0(parentActivity7, e6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            e6Var = ((org.telegram.ui.ActionBar.e2) qcVar).resourceProvider;
            org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(parentActivity8, e6Var);
            pzVar.setIsSingleCell(true);
            pzVar.setViewType(35);
            frameLayout = pzVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(qcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        View view = e1Var.a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.z9) {
                ((org.telegram.ui.Cells.z9) view).setOverrideBackground(qcVar.I);
                return;
            } else {
                qc.f1(view);
                return;
            }
        }
        ic icVar = ((jc) view).b;
        TLRPC.EmojiStatus emojiStatus = qcVar.E;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            icVar.c(org.telegram.messenger.cp.a(emojiStatus), false);
            icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
        } else {
            icVar.b(qcVar.s, false);
            icVar.d(qcVar.x, false, false);
        }
        icVar.e(org.telegram.messenger.m5.f(qcVar.E), org.telegram.messenger.m5.B(qcVar.E), false);
        icVar.setForum(qcVar.Y0());
        icVar.a(qcVar.f);
    }
}
