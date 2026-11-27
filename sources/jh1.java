// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jh1 extends c79 {
    public final /* synthetic */ wh1 c;

    public jh1(wh1 wh1Var) {
        this.c = wh1Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 5 || i == 6;
    }

    @Override // j79
    public final int b() {
        return this.c.S;
    }

    @Override // j79
    public final int d(int i) {
        wh1 wh1Var = this.c;
        if (i == wh1Var.T) {
            return 0;
        }
        if (i == wh1Var.X) {
            return 2;
        }
        if (i == wh1Var.a0) {
            return 1;
        }
        if (i == wh1Var.U) {
            return 3;
        }
        if (i == wh1Var.c0) {
            return 4;
        }
        if (i == wh1Var.V || i == wh1Var.d0 || i == wh1Var.g0 || i == wh1Var.i0 || i == wh1Var.k0) {
            return 6;
        }
        return (i == wh1Var.Y || i == wh1Var.f0) ? 5 : 7;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        TLRPC.StickerSet stickerSet;
        int i3;
        TLRPC.StickerSet stickerSet2;
        int i4;
        int i5;
        int i6;
        wh1 wh1Var = this.c;
        long j = wh1Var.a;
        int i7 = f89Var.f;
        View view = f89Var.a;
        if (i7 == 1) {
            ph1 ph1Var = (ph1) view;
            k38 k38Var = ph1Var.a;
            oh1 oh1Var = ph1Var.b;
            i2 = ((e) wh1Var).currentAccount;
            k38Var.b(i2, wh1Var.s, false);
            oh1Var.b(wh1Var.s, false);
            oh1Var.d(wh1Var.x, false, false);
            oh1Var.setForum(wh1Var.V0());
            oh1Var.e(wf3.f(wh1Var.E), false, false);
            oh1Var.a(wh1Var.f);
            return;
        }
        if (i7 == 3) {
            ((nh1) view).a(wh1Var.f, false);
            return;
        }
        if (i7 == 4) {
            ((d48) view).a(wh1Var.s, false);
            return;
        }
        if (i7 == 5) {
            skb skbVar = (skb) view;
            if (i == wh1Var.f0) {
                skbVar.k(ob6.M0(2131752294, null), false);
                return;
            }
            skbVar.k(ob6.M0(wh1Var.T0(), null), false);
            if (wh1Var.b < wh1Var.D0()) {
                skbVar.j(wh1Var.D0());
                return;
            } else {
                skbVar.j(0);
                return;
            }
        }
        if (i7 != 6) {
            if (i7 == 7) {
                ilb ilbVar = (ilb) view;
                ilbVar.setFixedSize(0);
                if (i == wh1Var.b0) {
                    ilbVar.setFixedSize(12);
                    ilbVar.setText("");
                    return;
                }
                if (i == wh1Var.W) {
                    ilbVar.setText(ob6.M0(2131752276, null));
                    return;
                }
                if (i == wh1Var.Z) {
                    ilbVar.setText(ob6.M0(wh1Var.R0(), null));
                    return;
                }
                if (i == wh1Var.e0) {
                    ilbVar.setText(ob6.M0(wh1Var.O0(), null));
                    return;
                }
                if (i == wh1Var.h0) {
                    ilbVar.setText(ob6.M0(wh1Var.I0(), null));
                    return;
                }
                if (i == wh1Var.j0) {
                    ilbVar.setText(ob6.M0(wh1Var.E0(), null));
                    return;
                }
                if (i == wh1Var.l0) {
                    ilbVar.setText(ob6.M0(wh1Var.P0(), null));
                    return;
                } else {
                    if (i == 0) {
                        ilbVar.setText("");
                        ilbVar.setFixedSize(12);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        kh1 kh1Var = (kh1) view;
        kh1Var.e = false;
        ema emaVar = kh1Var.a;
        kh1Var.setWillNotDraw(true);
        if (i == wh1Var.V) {
            i6 = ((e) wh1Var).currentAccount;
            kh1Var.a(i6, wh1Var.f, true);
            emaVar.l(ob6.M0(2131752275, null), false);
            if (wh1Var.b < wh1Var.getMessagesController().k4.d2.f()) {
                kh1Var.e(wh1Var.getMessagesController().k4.d2.f());
            } else {
                kh1Var.e(0);
            }
            kh1Var.c(wh1Var.n, false, false);
            return;
        }
        if (i == wh1Var.d0) {
            i5 = ((e) wh1Var).currentAccount;
            kh1Var.a(i5, wh1Var.s, false);
            emaVar.l(ob6.M0(2131752289, null), false);
            boolean z = wh1Var.f0 >= 0;
            kh1Var.e = z;
            kh1Var.setWillNotDraw(!z);
            if (wh1Var.b < wh1Var.N0()) {
                kh1Var.e(wh1Var.N0());
            } else {
                kh1Var.e(0);
            }
            kh1Var.c(wh1Var.x, false, false);
            return;
        }
        if (i == wh1Var.g0) {
            i4 = ((e) wh1Var).currentAccount;
            kh1Var.a(i4, wh1Var.s, false);
            emaVar.l(ob6.M0(wh1Var.K0(), null), false);
            if (wh1Var.b < wh1Var.J0()) {
                kh1Var.e(wh1Var.J0());
            } else {
                kh1Var.e(0);
            }
            kh1Var.c(wf3.f(wh1Var.E), wf3.A(wh1Var.E), false);
            return;
        }
        if (i != wh1Var.i0) {
            if (i == wh1Var.k0) {
                emaVar.l(ob6.M0(wh1Var.Q0(), null), false);
                kh1Var.e(0);
                TLRPC.ChatFull N0 = wh1Var.getMessagesController().N0(-j);
                if (N0 == null || (stickerSet = N0.stickerset) == null) {
                    kh1Var.c(0L, false, false);
                    return;
                } else {
                    kh1Var.d(wh1Var.G0(stickerSet));
                    return;
                }
            }
            return;
        }
        i3 = ((e) wh1Var).currentAccount;
        kh1Var.a(i3, wh1Var.s, false);
        emaVar.l(ob6.M0(wh1Var.F0(), null), false);
        if (wh1Var.b < wh1Var.L0()) {
            kh1Var.e(wh1Var.L0());
        } else {
            kh1Var.e(0);
        }
        TLRPC.ChatFull N02 = wh1Var.getMessagesController().N0(-j);
        if (N02 == null || (stickerSet2 = N02.emojiset) == null) {
            kh1Var.c(0L, false, false);
        } else {
            kh1Var.c(wh1Var.H0(stickerSet2), false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        int i2;
        vnb vnbVar4;
        int i3;
        vnb vnbVar5;
        FrameLayout frameLayout;
        vnb vnbVar6;
        int i4;
        vnb vnbVar7;
        wk5 wk5Var;
        vnb vnbVar8;
        int i5;
        final byte b = 1;
        wh1 wh1Var = this.c;
        if (i == 0) {
            Activity parentActivity = wh1Var.getParentActivity();
            wk5Var = ((e) wh1Var).parentLayout;
            int M0 = wh1Var.M0();
            long j = wh1Var.a;
            vnbVar8 = ((e) wh1Var).resourceProvider;
            sqb sqbVar = new sqb(parentActivity, wk5Var, M0, j, vnbVar8);
            sqbVar.G = true;
            sqbVar.setImportantForAccessibility(4);
            sqbVar.x = wh1Var;
            Drawable drawable = wh1Var.I;
            i5 = ((e) wh1Var).currentAccount;
            Drawable e = mm8.e(drawable, i5, wh1Var.G, wh1Var.K);
            wh1Var.I = e;
            sqbVar.setOverrideBackground(e);
            frameLayout = sqbVar;
        } else {
            final byte b2 = 0;
            if (i == 2) {
                Activity parentActivity2 = wh1Var.getParentActivity();
                i4 = ((e) wh1Var).currentAccount;
                vnbVar7 = ((e) wh1Var).resourceProvider;
                uh1 uh1Var = new uh1(i4, vnbVar7, parentActivity2);
                uh1Var.setWithRemovedStub(true);
                String h = af2.h(wh1Var.G);
                if (h == null && wh1Var.G == null && wh1Var.H != null) {
                    h = "❌";
                }
                uh1Var.a(h, false);
                uh1Var.setGalleryWallpaper(wh1Var.H);
                uh1Var.setOnEmoticonSelected(new pcc(this) { // from class: ih1
                    public final /* synthetic */ jh1 b;

                    {
                        this.b = this;
                    }

                    @Override // pcc
                    public final void a(Object obj) {
                        byte b3 = b2;
                        jh1 jh1Var = this.b;
                        switch (b3) {
                            case 0:
                                String str = (String) obj;
                                wh1 wh1Var2 = jh1Var.c;
                                if (str == null) {
                                    wh1Var2.G = wh1Var2.H;
                                } else if (str.equals("❌")) {
                                    wh1Var2.G = null;
                                } else {
                                    TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                    wh1Var2.G = tL_wallPaperNoFile;
                                    tL_wallPaperNoFile.id = 0L;
                                    tL_wallPaperNoFile.flags |= 4;
                                    tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                    wh1Var2.G.settings.emoticon = str;
                                }
                                wh1Var2.e1(true);
                                wh1Var2.h1(true);
                                break;
                            default:
                                wh1 wh1Var3 = jh1Var.c;
                                wh1Var3.s = ((Integer) obj).intValue();
                                if (wh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                    wh1Var3.E = null;
                                }
                                wh1Var3.e1(true);
                                wh1Var3.i1();
                                wh1Var3.g1(true);
                                break;
                        }
                    }
                });
                frameLayout = uh1Var;
            } else if (i == 5) {
                frameLayout = new skb(wh1Var.getParentActivity(), wh1Var.getResourceProvider());
            } else {
                byte b3 = 6;
                if (i == 6) {
                    Activity parentActivity3 = wh1Var.getParentActivity();
                    vnbVar6 = ((e) wh1Var).resourceProvider;
                    kh1 kh1Var = new kh1(parentActivity3);
                    kh1Var.e = false;
                    kh1Var.d = vnbVar6;
                    ema emaVar = new ema(parentActivity3);
                    kh1Var.a = emaVar;
                    emaVar.setTextSize(16);
                    yob.W(emaVar, aob.G6, vnbVar6);
                    kh1Var.addView(emaVar, tre.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
                    kh1Var.c = new ul(hl.L(24.0f), 13, kh1Var, false);
                    frameLayout = kh1Var;
                } else if (i == 3) {
                    Activity parentActivity4 = wh1Var.getParentActivity();
                    i3 = ((e) wh1Var).currentAccount;
                    vnbVar5 = ((e) wh1Var).resourceProvider;
                    nh1 nh1Var = new nh1(i3, vnbVar5, parentActivity4);
                    nh1Var.b.setOnItemClickListener(new l0(this, nh1Var, b3));
                    frameLayout = nh1Var;
                } else if (i == 4) {
                    Activity parentActivity5 = wh1Var.getParentActivity();
                    i2 = ((e) wh1Var).currentAccount;
                    vnbVar4 = ((e) wh1Var).resourceProvider;
                    d48 d48Var = new d48(0, i2, vnbVar4, parentActivity5);
                    d48Var.setDivider(false);
                    d48Var.setOnColorClick(new pcc(this) { // from class: ih1
                        public final /* synthetic */ jh1 b;

                        {
                            this.b = this;
                        }

                        @Override // pcc
                        public final void a(Object obj) {
                            byte b32 = b;
                            jh1 jh1Var = this.b;
                            switch (b32) {
                                case 0:
                                    String str = (String) obj;
                                    wh1 wh1Var2 = jh1Var.c;
                                    if (str == null) {
                                        wh1Var2.G = wh1Var2.H;
                                    } else if (str.equals("❌")) {
                                        wh1Var2.G = null;
                                    } else {
                                        TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                        wh1Var2.G = tL_wallPaperNoFile;
                                        tL_wallPaperNoFile.id = 0L;
                                        tL_wallPaperNoFile.flags |= 4;
                                        tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                        wh1Var2.G.settings.emoticon = str;
                                    }
                                    wh1Var2.e1(true);
                                    wh1Var2.h1(true);
                                    break;
                                default:
                                    wh1 wh1Var3 = jh1Var.c;
                                    wh1Var3.s = ((Integer) obj).intValue();
                                    if (wh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                        wh1Var3.E = null;
                                    }
                                    wh1Var3.e1(true);
                                    wh1Var3.i1();
                                    wh1Var3.g1(true);
                                    break;
                            }
                        }
                    });
                    frameLayout = d48Var;
                } else if (i == 1) {
                    FrameLayout ph1Var = new ph1(wh1Var, wh1Var.getParentActivity());
                    frameLayout = ph1Var;
                    if (wh1Var.d) {
                        ph1Var.setTag(-33024);
                        frameLayout = ph1Var;
                    }
                } else if (i == 8) {
                    Activity parentActivity6 = wh1Var.getParentActivity();
                    vnbVar3 = ((e) wh1Var).resourceProvider;
                    frameLayout = new mf5(parentActivity6, vnbVar3);
                } else if (i == 9) {
                    Activity parentActivity7 = wh1Var.getParentActivity();
                    vnbVar2 = ((e) wh1Var).resourceProvider;
                    frameLayout = new m38(vnbVar2, parentActivity7, false);
                } else if (i == 10) {
                    Activity parentActivity8 = wh1Var.getParentActivity();
                    vnbVar = ((e) wh1Var).resourceProvider;
                    tk4 tk4Var = new tk4(parentActivity8, vnbVar);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.setViewType(35);
                    frameLayout = tk4Var;
                } else {
                    frameLayout = new ilb(wh1Var.getParentActivity());
                }
            }
        }
        return new n69(frameLayout);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        boolean z = view instanceof ph1;
        wh1 wh1Var = this.c;
        if (!z) {
            if (view instanceof sqb) {
                ((sqb) view).setOverrideBackground(wh1Var.I);
                return;
            } else {
                wh1.f1(view);
                return;
            }
        }
        oh1 oh1Var = ((ph1) view).b;
        TLRPC.EmojiStatus emojiStatus = wh1Var.E;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            oh1Var.c(kc7.a(emojiStatus), false);
            oh1Var.d(((TLRPC.TL_emojiStatusCollectible) wh1Var.E).pattern_document_id, true, false);
        } else {
            oh1Var.b(wh1Var.s, false);
            oh1Var.d(wh1Var.x, false, false);
        }
        oh1Var.e(wf3.f(wh1Var.E), wf3.A(wh1Var.E), false);
        oh1Var.setForum(wh1Var.V0());
        oh1Var.a(wh1Var.f);
    }
}
