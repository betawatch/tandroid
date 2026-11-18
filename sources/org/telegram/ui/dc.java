package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dc extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ qc c;

    public dc(qc qcVar) {
        this.c = qcVar;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 5 || i7 == 6;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.S;
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        TLRPC.StickerSet stickerSet;
        int i11;
        TLRPC.StickerSet stickerSet2;
        int i12;
        int i13;
        int i14;
        qc qcVar = this.c;
        long j3 = qcVar.a;
        int i15 = f1Var.f;
        View view = f1Var.a;
        if (i15 == 1) {
            jc jcVar = (jc) view;
            sl0 sl0Var = jcVar.a;
            ic icVar = jcVar.b;
            i10 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            sl0Var.b(i10, qcVar.s, false);
            icVar.b(qcVar.s, false);
            icVar.d(qcVar.x, false, false);
            icVar.setForum(qcVar.Y0());
            icVar.e(org.telegram.messenger.n5.f(qcVar.E), false, false);
            icVar.a(qcVar.f);
            return;
        }
        if (i15 == 3) {
            ((hc) view).a(qcVar.f, false);
            return;
        }
        if (i15 == 4) {
            ((im0) view).a(qcVar.s, false);
            return;
        }
        if (i15 == 5) {
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (i7 == qcVar.f0) {
                n8Var.k(org.telegram.messenger.gd.M0(2131752313, null), false);
                return;
            }
            n8Var.k(org.telegram.messenger.gd.M0(qcVar.W0(), null), false);
            if (qcVar.b < qcVar.G0()) {
                n8Var.j(qcVar.G0());
                return;
            } else {
                n8Var.j(0);
                return;
            }
        }
        if (i15 != 6) {
            if (i15 != 7) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i7 == qcVar.b0) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
            if (i7 == qcVar.W) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131752299, null));
                return;
            }
            if (i7 == qcVar.Z) {
                a9Var.setText(org.telegram.messenger.gd.M0(qcVar.U0(), null));
                return;
            }
            if (i7 == qcVar.e0) {
                a9Var.setText(org.telegram.messenger.gd.M0(qcVar.R0(), null));
                return;
            }
            if (i7 == qcVar.h0) {
                a9Var.setText(org.telegram.messenger.gd.M0(qcVar.L0(), null));
                return;
            }
            if (i7 == qcVar.j0) {
                a9Var.setText(org.telegram.messenger.gd.M0(qcVar.H0(), null));
                return;
            }
            if (i7 == qcVar.l0) {
                a9Var.setText(org.telegram.messenger.gd.M0(qcVar.S0(), null));
                return;
            } else {
                if (i7 == 0) {
                    a9Var.setText("");
                    a9Var.setFixedSize(12);
                    return;
                }
                return;
            }
        }
        ec ecVar = (ec) view;
        ecVar.e = false;
        org.telegram.ui.ActionBar.n5 n5Var = ecVar.a;
        ecVar.setWillNotDraw(true);
        if (i7 == qcVar.V) {
            i14 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            ecVar.a(i14, qcVar.f, true);
            n5Var.l(org.telegram.messenger.gd.M0(2131752298, null), false);
            if (qcVar.b < qcVar.getMessagesController().t5) {
                ecVar.e(qcVar.getMessagesController().t5);
            } else {
                ecVar.e(0);
            }
            ecVar.c(qcVar.n, false, false);
            return;
        }
        if (i7 == qcVar.d0) {
            i13 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            ecVar.a(i13, qcVar.s, false);
            n5Var.l(org.telegram.messenger.gd.M0(2131752308, null), false);
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
            i12 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            ecVar.a(i12, qcVar.s, false);
            n5Var.l(org.telegram.messenger.gd.M0(qcVar.N0(), null), false);
            if (qcVar.b < qcVar.M0()) {
                ecVar.e(qcVar.M0());
            } else {
                ecVar.e(0);
            }
            ecVar.c(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
            return;
        }
        if (i7 != qcVar.i0) {
            if (i7 == qcVar.k0) {
                n5Var.l(org.telegram.messenger.gd.M0(qcVar.T0(), null), false);
                ecVar.e(0);
                TLRPC.ChatFull P0 = qcVar.getMessagesController().P0(-j3);
                if (P0 == null || (stickerSet = P0.stickerset) == null) {
                    ecVar.c(0L, false, false);
                    return;
                } else {
                    ecVar.d(qcVar.J0(stickerSet));
                    return;
                }
            }
            return;
        }
        i11 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
        ecVar.a(i11, qcVar.s, false);
        n5Var.l(org.telegram.messenger.gd.M0(qcVar.I0(), null), false);
        if (qcVar.b < qcVar.O0()) {
            ecVar.e(qcVar.O0());
        } else {
            ecVar.e(0);
        }
        TLRPC.ChatFull P02 = qcVar.getMessagesController().P0(-j3);
        if (P02 == null || (stickerSet2 = P02.emojiset) == null) {
            ecVar.c(0L, false, false);
        } else {
            ecVar.c(qcVar.K0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var4;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var5;
        org.telegram.ui.ActionBar.i6 i6Var6;
        int i12;
        org.telegram.ui.ActionBar.i6 i6Var7;
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.i6 i6Var8;
        int i13;
        qc qcVar = this.c;
        if (i7 == 0) {
            Activity parentActivity = qcVar.getParentActivity();
            s4Var = ((org.telegram.ui.ActionBar.h2) qcVar).parentLayout;
            int P0 = qcVar.P0();
            long j3 = qcVar.a;
            i6Var8 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(parentActivity, s4Var, P0, j3, i6Var8);
            baVar.G = true;
            baVar.setImportantForAccessibility(4);
            baVar.x = qcVar;
            Drawable drawable = qcVar.I;
            i13 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            Drawable f10 = hi.w5.f(drawable, i13, qcVar.G, qcVar.K);
            qcVar.I = f10;
            baVar.setOverrideBackground(f10);
            frameLayout = baVar;
        } else if (i7 == 2) {
            Activity parentActivity2 = qcVar.getParentActivity();
            i12 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var7 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            oc ocVar = new oc(i12, parentActivity2, i6Var7);
            ocVar.setWithRemovedStub(true);
            String j10 = org.telegram.messenger.f4.j(qcVar.G);
            if (j10 == null && qcVar.G == null && qcVar.H != null) {
                j10 = "❌";
            }
            ocVar.a(j10, false);
            ocVar.setGalleryWallpaper(qcVar.H);
            final int i14 = 0;
            ocVar.setOnEmoticonSelected(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.cc
                public final /* synthetic */ dc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
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
            frameLayout = new org.telegram.ui.Cells.n8(qcVar.getParentActivity(), qcVar.getResourceProvider());
        } else if (i7 == 6) {
            Activity parentActivity3 = qcVar.getParentActivity();
            i6Var6 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            ec ecVar = new ec(parentActivity3);
            ecVar.e = false;
            ecVar.d = i6Var6;
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(parentActivity3);
            ecVar.a = n5Var;
            n5Var.setTextSize(16);
            org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var6);
            ecVar.addView(n5Var, c8.ma.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            ecVar.c = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 13, ecVar, false);
            frameLayout = ecVar;
        } else if (i7 == 3) {
            Activity parentActivity4 = qcVar.getParentActivity();
            i11 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var5 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            hc hcVar = new hc(i11, parentActivity4, i6Var5);
            hcVar.b.setOnItemClickListener(new fi.g4(5, this, hcVar));
            frameLayout = hcVar;
        } else if (i7 == 4) {
            Activity parentActivity5 = qcVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.h2) qcVar).currentAccount;
            i6Var4 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            im0 im0Var = new im0(0, i10, parentActivity5, i6Var4);
            im0Var.setDivider(false);
            final int i15 = 1;
            im0Var.setOnColorClick(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.cc
                public final /* synthetic */ dc b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
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
            frameLayout = im0Var;
        } else if (i7 == 1) {
            FrameLayout jcVar = new jc(qcVar, qcVar.getParentActivity());
            frameLayout = jcVar;
            if (qcVar.d) {
                jcVar.setTag(-33024);
                frameLayout = jcVar;
            }
        } else if (i7 == 8) {
            Activity parentActivity6 = qcVar.getParentActivity();
            i6Var3 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            frameLayout = new org.telegram.ui.Cells.o4(parentActivity6, i6Var3);
        } else if (i7 == 9) {
            Activity parentActivity7 = qcVar.getParentActivity();
            i6Var2 = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            frameLayout = new ul0(parentActivity7, i6Var2, false);
        } else if (i7 == 10) {
            Activity parentActivity8 = qcVar.getParentActivity();
            i6Var = ((org.telegram.ui.ActionBar.h2) qcVar).resourceProvider;
            org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(parentActivity8, i6Var);
            wzVar.setIsSingleCell(true);
            wzVar.setViewType(35);
            frameLayout = wzVar;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(qcVar.getParentActivity());
        }
        return new org.telegram.ui.Components.kj0(frameLayout);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        View view = f1Var.a;
        boolean z10 = view instanceof jc;
        qc qcVar = this.c;
        if (!z10) {
            if (view instanceof org.telegram.ui.Cells.ba) {
                ((org.telegram.ui.Cells.ba) view).setOverrideBackground(qcVar.I);
                return;
            } else {
                qc.f1(view);
                return;
            }
        }
        ic icVar = ((jc) view).b;
        TLRPC.EmojiStatus emojiStatus = qcVar.E;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            icVar.c(org.telegram.messenger.bp.a(emojiStatus), false);
            icVar.d(((TLRPC.TL_emojiStatusCollectible) qcVar.E).pattern_document_id, true, false);
        } else {
            icVar.b(qcVar.s, false);
            icVar.d(qcVar.x, false, false);
        }
        icVar.e(org.telegram.messenger.n5.f(qcVar.E), org.telegram.messenger.n5.B(qcVar.E), false);
        icVar.setForum(qcVar.Y0());
        icVar.a(qcVar.f);
    }
}
