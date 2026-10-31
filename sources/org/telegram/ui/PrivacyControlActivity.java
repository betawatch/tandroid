package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final boolean[] D;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public ArrayList F;
    public boolean F0;
    public ArrayList G;
    public boolean G0;
    public int H;
    public boolean H0;
    public int I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public su0 a;
    public int a0;
    public org.telegram.ui.ActionBar.l5 b;
    public int b0;
    public org.telegram.ui.Components.tk0 c;
    public int c0;
    private int currentPhotoForRestRow;
    public tu0 d;
    public int d0;
    public int e;
    public int e0;
    private int everybodyRow;
    public int f;
    public int f0;
    public int g0;
    private int giftTypesHeaderRow;
    public final ArrayList h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final ArrayList n;
    public int n0;
    private int nobodyRow;
    public int o0;
    public int p0;
    private int photoForRestRow;
    private int priceRow;
    public int q0;
    public final boolean[] r;
    public final org.telegram.ui.Components.b40 r0;
    private int readRow;
    public final boolean[] s;
    public org.telegram.ui.Components.bi0 s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public org.telegram.ui.Cells.p8 t0;
    public org.telegram.ui.Components.g9 u0;
    public ls v0;
    public final boolean[] w;
    public TLRPC.PhotoSize w0;
    public final int x;
    public TLRPC.Photo x0;
    public final boolean[] y;
    public SpannableString y0;
    public boolean z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        super(null);
        TLRPC.PhotoSize w9;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new boolean[4];
        this.s = new boolean[4];
        this.w = new boolean[4];
        this.y = new boolean[4];
        this.D = new boolean[4];
        this.E = new boolean[4];
        this.K = 10L;
        this.N0 = 4;
        this.x = i10;
        if (z10) {
            org.telegram.messenger.i5.r(this.currentAccount).D(false);
        }
        if (i10 == 4) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            this.r0 = b40Var;
            b40Var.a = this;
            b40Var.b = this;
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().n);
            if (!org.telegram.messenger.h20.q(a2) || (w9 = org.telegram.messenger.b8.w(a2.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.w0 = w9;
            this.x0 = a2.fallback_photo;
        }
    }

    public static /* synthetic */ void Y(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.w0 = null;
        privacyControlActivity.x0 = null;
        TLRPC.UserFull a2 = privacyControlActivity.getMessagesController().a2(privacyControlActivity.getUserConfig().n);
        if (a2 == null || (photo = a2.fallback_photo) == null) {
            return;
        }
        a2.flags &= -4194305;
        a2.fallback_photo = null;
        privacyControlActivity.getMessagesStorage().j2(a2, true);
        privacyControlActivity.H0();
        privacyControlActivity.J0(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
        org.telegram.messenger.zs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.zs.c0, new Object[0]);
    }

    public static /* synthetic */ void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.F0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).V3(privacyrules.users, false);
        org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).P3(privacyrules.chats, false);
        org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
        org.telegram.messenger.i0.g3(new et0(4, privacyControlActivity, zArr));
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull a2 = privacyControlActivity.getMessagesController().a2(privacyControlActivity.getUserConfig().n);
            a2.flags |= TLObject.FLAG_22;
            a2.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(a2, true);
            org.telegram.messenger.zs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.zs.c0, new Object[0]);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w9 != null && privacyControlActivity.w0 != null) {
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.b8.K(privacyControlActivity.w0, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.w0.location.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, privacyControlActivity.w0.location.local_id, "@50_50");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.ic.e(w9.location));
            }
            if (w10 == null || privacyControlActivity.w0 == null) {
                return;
            }
            org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
            File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
            org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
            org.telegram.messenger.b8.K(privacyControlActivity.w0.location, null, true, true).renameTo(K2);
        }
    }

    public static void b0(final PrivacyControlActivity privacyControlActivity, View view, final int i10) {
        boolean z10;
        int i11;
        int i12 = privacyControlActivity.x;
        int i13 = 1;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(privacyControlActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131746304, null), org.telegram.messenger.cd.L0(2131746305, null), org.telegram.messenger.cd.L0(2131746336, null), new gu0(privacyControlActivity, i13), null).a;
            x1Var.show();
            x1Var.i();
            return;
        }
        int i14 = 12;
        int i15 = 0;
        r8 = false;
        boolean z11 = false;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.b40 b40Var = privacyControlActivity.r0;
            if (b40Var != null) {
                b40Var.n(false, new ag.f3(13), new q5(privacyControlActivity, i14), 0);
                privacyControlActivity.s0.M(0);
                privacyControlActivity.s0.P(43);
                privacyControlActivity.t0.e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
        int i16 = 2;
        if (i12 == 10 && i10 == privacyControlActivity.N && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(privacyControlActivity, i16)).j();
            t2Var.a();
            int i17 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i17;
            org.telegram.messenger.i0.F3(i17, view, null);
            return;
        }
        int i18 = 3;
        if (i12 == 8 && ((i10 == privacyControlActivity.N || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(privacyControlActivity, i18)).j();
            t2Var.a();
            int i19 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i19;
            org.telegram.messenger.i0.F3(i19, view, null);
            return;
        }
        if (i10 == privacyControlActivity.nobodyRow || i10 == privacyControlActivity.everybodyRow || i10 == privacyControlActivity.N || i10 == privacyControlActivity.f0) {
            if (i12 == 12 && privacyControlActivity.y0()) {
                int i20 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i20;
                org.telegram.messenger.i0.F3(i20, view, null);
                return;
            }
            if (i10 == privacyControlActivity.nobodyRow) {
                i15 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                i15 = i10 == privacyControlActivity.f0 ? 3 : 2;
            }
            if (i15 == privacyControlActivity.H) {
                return;
            }
            privacyControlActivity.H = i15;
            org.telegram.ui.Components.wb.e();
            privacyControlActivity.I0();
            privacyControlActivity.J0(true);
            return;
        }
        if (i10 == privacyControlActivity.W || i10 == privacyControlActivity.V) {
            int i21 = i10 != privacyControlActivity.V ? 1 : 0;
            if (i21 == privacyControlActivity.I) {
                return;
            }
            privacyControlActivity.I = i21;
            privacyControlActivity.I0();
            privacyControlActivity.J0(true);
            return;
        }
        if (i10 == privacyControlActivity.S || i10 == privacyControlActivity.R) {
            if (i12 == 12 && privacyControlActivity.y0()) {
                int i22 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i22;
                org.telegram.messenger.i0.F3(i22, view, null);
                return;
            }
            ArrayList arrayList = i10 == privacyControlActivity.S ? privacyControlActivity.G : privacyControlActivity.F;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i10 == privacyControlActivity.S ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i12 != 0 ? 1 : 0);
            if (i10 == privacyControlActivity.R && i12 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            final boolean z12 = i12 == 12 && ((i11 = privacyControlActivity.H) != 1 ? !(i11 != 2 ? !(i11 == 0 && i10 == privacyControlActivity.S) : i10 != privacyControlActivity.R) : i10 == privacyControlActivity.R);
            bundle.putBoolean("allowMiniapps", z12);
            v50 v50Var = new v50(bundle);
            if (i12 == 10) {
                v50Var.L = org.telegram.messenger.cd.L0(2131746306, null);
            }
            if (i10 == privacyControlActivity.R) {
                if (privacyControlActivity.y[privacyControlActivity.H == 2 ? (char) 0 : (char) 1]) {
                    z10 = true;
                    if (z12 && privacyControlActivity.D[privacyControlActivity.H]) {
                        z11 = true;
                    }
                    v50Var.t0(arrayList, z10, z11);
                    v50Var.x = new r50() { // from class: org.telegram.ui.mu0
                        @Override // org.telegram.ui.r50
                        public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr = privacyControlActivity2.D;
                            int i23 = privacyControlActivity2.S;
                            int i24 = i10;
                            boolean z15 = z12;
                            int i25 = 0;
                            if (i24 == i23) {
                                privacyControlActivity2.G = arrayList2;
                                zArr[privacyControlActivity2.H] = z15 && z14;
                                while (i25 < privacyControlActivity2.G.size()) {
                                    privacyControlActivity2.F.remove(privacyControlActivity2.G.get(i25));
                                    i25++;
                                }
                            } else {
                                boolean[] zArr2 = privacyControlActivity2.y;
                                int i26 = privacyControlActivity2.H;
                                zArr2[i26 == 2 ? (char) 0 : (char) 1] = z13;
                                zArr[i26] = z15 && z14;
                                privacyControlActivity2.F = arrayList2;
                                while (i25 < privacyControlActivity2.F.size()) {
                                    privacyControlActivity2.G.remove(privacyControlActivity2.F.get(i25));
                                    i25++;
                                }
                            }
                            privacyControlActivity2.I0();
                            privacyControlActivity2.a.f();
                        }
                    };
                    v50Var.e0 = true;
                    privacyControlActivity.presentFragment(v50Var);
                    return;
                }
            }
            z10 = false;
            if (z12) {
                z11 = true;
            }
            v50Var.t0(arrayList, z10, z11);
            v50Var.x = new r50() { // from class: org.telegram.ui.mu0
                @Override // org.telegram.ui.r50
                public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                    boolean[] zArr = privacyControlActivity2.D;
                    int i23 = privacyControlActivity2.S;
                    int i24 = i10;
                    boolean z15 = z12;
                    int i25 = 0;
                    if (i24 == i23) {
                        privacyControlActivity2.G = arrayList2;
                        zArr[privacyControlActivity2.H] = z15 && z14;
                        while (i25 < privacyControlActivity2.G.size()) {
                            privacyControlActivity2.F.remove(privacyControlActivity2.G.get(i25));
                            i25++;
                        }
                    } else {
                        boolean[] zArr2 = privacyControlActivity2.y;
                        int i26 = privacyControlActivity2.H;
                        zArr2[i26 == 2 ? (char) 0 : (char) 1] = z13;
                        zArr[i26] = z15 && z14;
                        privacyControlActivity2.F = arrayList2;
                        while (i25 < privacyControlActivity2.F.size()) {
                            privacyControlActivity2.G.remove(privacyControlActivity2.F.get(i25));
                            i25++;
                        }
                    }
                    privacyControlActivity2.I0();
                    privacyControlActivity2.a.f();
                }
            };
            v50Var.e0 = true;
            privacyControlActivity.presentFragment(v50Var);
            return;
        }
        if (i10 == privacyControlActivity.a0) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i10 == privacyControlActivity.readRow) {
            privacyControlActivity.A0 = !privacyControlActivity.A0;
            privacyControlActivity.I0();
            ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.A0);
            return;
        }
        if (i10 == privacyControlActivity.d0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i10 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.C0 = !privacyControlActivity.C0;
            privacyControlActivity.I0();
            ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.C0);
            return;
        }
        if (i10 == privacyControlActivity.l0) {
            if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                int i23 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i23;
                org.telegram.messenger.i0.F3(i23, view, null);
                privacyControlActivity.G0();
                return;
            }
            boolean y02 = privacyControlActivity.y0();
            privacyControlActivity.G0 = !privacyControlActivity.G0;
            privacyControlActivity.I0();
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setChecked(privacyControlActivity.G0);
            if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                t8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (y02 != privacyControlActivity.y0()) {
                privacyControlActivity.J0(true);
                org.telegram.messenger.i0.a4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.k0) {
            if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().q()) {
                int i24 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i24;
                org.telegram.messenger.i0.F3(i24, view, null);
                privacyControlActivity.G0();
                return;
            }
            boolean y03 = privacyControlActivity.y0();
            privacyControlActivity.E0 = !privacyControlActivity.E0;
            privacyControlActivity.I0();
            org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
            t8Var2.setChecked(privacyControlActivity.E0);
            if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().q()) {
                t8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (y03 != privacyControlActivity.y0()) {
                privacyControlActivity.J0(true);
                org.telegram.messenger.i0.a4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.m0) {
            if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                int i25 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i25;
                org.telegram.messenger.i0.F3(i25, view, null);
                privacyControlActivity.G0();
                return;
            }
            boolean y04 = privacyControlActivity.y0();
            privacyControlActivity.I0 = !privacyControlActivity.I0;
            privacyControlActivity.I0();
            org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
            t8Var3.setChecked(privacyControlActivity.I0);
            if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                t8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (y04 != privacyControlActivity.y0()) {
                privacyControlActivity.J0(true);
                org.telegram.messenger.i0.a4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.n0) {
            if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                int i26 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i26;
                org.telegram.messenger.i0.F3(i26, view, null);
                privacyControlActivity.G0();
                return;
            }
            boolean y05 = privacyControlActivity.y0();
            privacyControlActivity.K0 = !privacyControlActivity.K0;
            privacyControlActivity.I0();
            org.telegram.ui.Cells.t8 t8Var4 = (org.telegram.ui.Cells.t8) view;
            t8Var4.setChecked(privacyControlActivity.K0);
            if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                t8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (y05 != privacyControlActivity.y0()) {
                privacyControlActivity.J0(true);
                org.telegram.messenger.i0.a4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.o0) {
            if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                int i27 = -privacyControlActivity.N0;
                privacyControlActivity.N0 = i27;
                org.telegram.messenger.i0.F3(i27, view, null);
                privacyControlActivity.G0();
                return;
            }
            boolean y06 = privacyControlActivity.y0();
            privacyControlActivity.M0 = !privacyControlActivity.M0;
            privacyControlActivity.I0();
            org.telegram.ui.Cells.t8 t8Var5 = (org.telegram.ui.Cells.t8) view;
            t8Var5.setChecked(privacyControlActivity.M0);
            if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                t8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (y06 != privacyControlActivity.y0()) {
                privacyControlActivity.J0(true);
                org.telegram.messenger.i0.a4(privacyControlActivity.c);
            }
        }
    }

    public static void c0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).f0(tL_error, false);
            return;
        }
        org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.B0();
        }
    }

    public static /* synthetic */ void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            privacyControlActivity.F0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).V3(privacyrules.users, false);
        org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).P3(privacyrules.chats, false);
        org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.x, privacyrules.rules);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.B0();
        }
    }

    public final void A0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i10;
        int i11;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.h;
        int i12 = this.x;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).X;
            int i13 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.H = i13;
            this.e = i13;
            this.G = new ArrayList();
            this.F = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.K = 10L;
                this.J = 10L;
            } else {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().J6, 1L);
                this.K = k10;
                this.J = k10;
                this.H = 3;
                this.e = 3;
            }
            ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(13);
            this.F = new ArrayList();
            if (v != null) {
                for (int i14 = 0; i14 < v.size(); i14++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i14);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i15 = 0;
                        while (i15 < size) {
                            i15 = c3.i0.k(i15, 1, -tL_privacyValueAllowChatParticipants.chats.get(i15).longValue(), this.F);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.F);
            return;
        }
        boolean z10 = i12 == 1;
        boolean[] zArr4 = this.r;
        zArr4[0] = z10;
        boolean[] zArr5 = this.y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.s;
        zArr6[0] = false;
        boolean[] zArr7 = this.D;
        zArr7[0] = false;
        boolean z11 = i12 == 12;
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.w;
        zArr8[0] = false;
        boolean[] zArr9 = this.E;
        zArr9[0] = false;
        boolean z12 = i12 == 12;
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.F = new ArrayList();
        this.G = new ArrayList();
        ArrayList v10 = org.telegram.messenger.i5.r(this.currentAccount).v(i12);
        if (v10 == null || v10.size() == 0) {
            this.H = 1;
        } else {
            Boolean bool2 = null;
            int i16 = 0;
            boolean z13 = false;
            boolean z14 = false;
            char c10 = 65535;
            while (i16 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i16);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        i17 = c3.i0.k(i17, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i17).longValue(), this.F);
                        zArr6 = zArr6;
                        v10 = v10;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    zArr = zArr6;
                    arrayList = v10;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = v10;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int i18 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i18 < size3; size3 = size3) {
                            i18 = c3.i0.k(i18, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i18).longValue(), this.G);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.G.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z13 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z15 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z15) {
                                    boolean z16 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z16 || z14) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c10 = 2;
                                            z14 = true;
                                        } else if (c10 == 65535) {
                                            if (!z15) {
                                                if (!z16 || z14) {
                                                    c10 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c10 = 1;
                                }
                                c10 = 0;
                            }
                            bool2 = bool;
                        }
                        i16++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        v10 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i16++;
                zArr5 = zArr3;
                zArr6 = zArr;
                v10 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c10 == 0 || (c10 == 65535 && (this.G.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i10 = 2;
                this.H = 0;
            } else {
                i10 = 2;
                if (c10 != 2) {
                    if (c10 != 65535 || this.G.size() <= 0 || this.F.size() <= 0) {
                        if (c10 != 1) {
                            i11 = (c10 == 65535 && (this.F.size() > 0 || (bool2 != null && bool2.booleanValue()))) ? 1 : 1;
                            i10 = 2;
                        }
                        this.H = i11;
                        i10 = 2;
                    } else {
                        i10 = 2;
                    }
                }
                this.H = i10;
            }
            int i19 = this.H;
            char c11 = i19 == i10 ? (char) 0 : (char) 1;
            zArr11[c11] = z13;
            zArr12[c11] = z13;
            boolean z17 = bool2 != null;
            zArr10[i19] = z17;
            zArr7[i19] = z17;
            zArr8[i19] = false;
            zArr9[i19] = false;
            org.telegram.ui.ActionBar.l5 l5Var = this.b;
            if (l5Var != null) {
                l5Var.a(false, false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList3.clear();
        this.e = this.H;
        arrayList2.addAll(this.F);
        arrayList3.addAll(this.G);
        if (i12 == 6) {
            ArrayList v11 = org.telegram.messenger.i5.r(this.currentAccount).v(7);
            if (v11 == null || v11.size() == 0) {
                this.I = 0;
            } else {
                int i20 = 0;
                while (true) {
                    if (i20 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i20);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.I = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.I = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.I = 1;
                            break;
                        }
                        i20++;
                    }
                }
            }
            this.f = this.I;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
            boolean z18 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.z0 = z18;
            this.A0 = z18;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().X;
            boolean z19 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.B0 = z19;
            this.C0 = z19;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.E0 = true;
                this.D0 = true;
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
            } else {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.E0 = z20;
                this.D0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.G0 = z21;
                this.F0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.I0 = z22;
                this.H0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.K0 = z23;
                this.J0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.M0 = z24;
                this.L0 = z24;
            }
        }
        J0(false);
        org.telegram.messenger.i0.a4(this.c);
    }

    public final void B0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        this.b.b(false);
        int i10 = 1;
        int i11 = this.x;
        if ((i11 == 10 || i11 == 1 || i11 == 2) && this.H != 0 && (globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).X) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr[i12];
                ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(i13);
                if (i13 != i11) {
                    if (v != null) {
                        int size = v.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = v.get(i14);
                            i14++;
                            TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) obj;
                            if (TLRPC.TL_privacyValueAllowAll.class.isInstance(privacyRule2)) {
                                privacyRule = (TLRPC.PrivacyRule) TLRPC.TL_privacyValueAllowAll.class.cast(privacyRule2);
                                break;
                            }
                        }
                    }
                    privacyRule = null;
                    if (privacyRule != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.resourceProvider);
                        String L0 = org.telegram.messenger.cd.L0(i13 == 1 ? 2131752147 : 2131752149, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(i13 == 1 ? 2131752148 : 2131752150, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752146, null), new i2.q(this, i13, 18));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new ku0(this, i10));
                        alertDialog$Builder.p();
                        return;
                    }
                }
            }
        }
        finishFragment();
    }

    public final boolean C0() {
        ArrayList arrayList;
        int i10 = this.x;
        if (i10 == 0 && ((this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty())) && this.z0 != this.A0)) {
            return true;
        }
        if (i10 == 12 && (this.B0 != this.C0 || this.F0 != this.G0 || this.D0 != this.E0 || this.H0 != this.I0 || this.J0 != this.K0 || this.L0 != this.M0)) {
            return true;
        }
        int i11 = this.e;
        int i12 = this.H;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.f != this.I) {
            return true;
        }
        if (i12 != 0) {
            if (this.r[i12 == 2 ? (char) 0 : (char) 1] != this.y[i12 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.K != this.J) || this.s[i12] != this.D[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.n;
        if (arrayList2.size() != this.G.size()) {
            return true;
        }
        ArrayList arrayList3 = this.h;
        if (arrayList3.size() != this.F.size()) {
            return true;
        }
        if (i10 != 10 || this.H == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.F);
            if (!arrayList3.equals(this.F)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.G);
            if (!arrayList2.equals(this.G)) {
                return true;
            }
        }
        return false;
    }

    public final void D0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.x;
        if (i10 == 10 && this.H == 3 && !getUserConfig().q()) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 27, true));
            return;
        }
        if (this.H != 0 && i10 == 0 && !getUserConfig().q()) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                if (i10 == 1) {
                    x1Var.T = org.telegram.messenger.cd.L0(2131742907, null);
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131751686, null);
                }
                x1Var.R = org.telegram.messenger.cd.L0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new ep0(7, this, d12));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                showDialog(x1Var);
                return;
            }
        }
        x0();
    }

    public final void E0() {
        tu0 tu0Var = this.d;
        if (tu0Var != null) {
            tu0Var.f.k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.H;
            if (i10 == 0) {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746850, null));
                this.d.f.k.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746846, null));
                this.d.f.k.fwd_from.from_id.user_id = 0L;
            } else {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746851, null));
                this.d.f.k.fwd_from.from_id.user_id = 1L;
            }
            this.d.b.E1();
        }
    }

    public final void F0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(R.string.AppName, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131746853, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        showDialog(x1Var);
    }

    public final void G0() {
        org.telegram.ui.Components.cc.a0(this).L(R.raw.star_premium_2, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(this, 0)).j();
    }

    public final void H0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.p8 p8Var = this.t0;
        if (p8Var != null) {
            if (this.w0 == null) {
                p8Var.getTextView().k(org.telegram.messenger.cd.a0("SetPhotoForRest", null, 2131745534, new Object[0]));
                this.t0.setNeedDivider(false);
            } else {
                p8Var.getTextView().k(org.telegram.messenger.cd.a0("UpdatePhotoForRest", null, 2131743843, new Object[0]));
                this.t0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.u0;
        if (g9Var == null || (photoSize = this.w0) == null) {
            return;
        }
        TLRPC.Photo photo = this.x0;
        if (photo != null) {
            g9Var.j(org.telegram.messenger.ic.i(photoSize, photo), "50_50", null, org.telegram.messenger.d20.i(this.currentAccount).f());
        } else {
            g9Var.j(org.telegram.messenger.ic.e(photoSize.location), "50_50", null, org.telegram.messenger.d20.i(this.currentAccount).f());
        }
    }

    public final void I0() {
        this.b.a(C0(), true);
    }

    public final void J0(boolean z10) {
        pu0 pu0Var;
        ArrayList arrayList;
        int i10;
        TLRPC.UserFull a2;
        if (z10) {
            pu0Var = new pu0(this);
            pu0Var.f(pu0Var.c);
            pu0Var.b = this.q0;
        } else {
            pu0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.Y = -1;
        this.L = -1;
        this.setBirthdayRow = -1;
        this.X = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.R = -1;
        this.S = -1;
        this.Z = -1;
        this.a0 = -1;
        this.O = -1;
        this.P = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.Q = -1;
        this.T = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.priceRow = -1;
        this.i0 = -1;
        this.h0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.showGiftIconRow = -1;
        this.j0 = -1;
        this.giftTypesHeaderRow = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = 0;
        int i11 = this.x;
        if (i11 == 12) {
            this.showGiftIconRow = 0;
            this.q0 = 2;
            this.j0 = 1;
        }
        if (i11 == 11 && (a2 = getMessagesController().a2(getUserConfig().e())) != null && a2.birthday == null) {
            int i12 = this.q0;
            this.q0 = i12 + 1;
            this.setBirthdayRow = i12;
        }
        if (i11 == 5) {
            int i13 = this.q0;
            this.q0 = i13 + 1;
            this.L = i13;
        }
        int i14 = this.q0;
        this.M = i14;
        this.everybodyRow = i14 + 1;
        int i15 = i14 + 3;
        this.q0 = i15;
        this.N = i14 + 2;
        if (i11 == 4 || i11 == 9 || i11 == 14 || i11 == 0 || i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 1 || i11 == 11 || i11 == 12) {
            this.q0 = i14 + 4;
            this.nobodyRow = i15;
        }
        if (getMessagesController().M6 && i11 == 10) {
            int i16 = this.q0;
            this.q0 = i16 + 1;
            this.f0 = i16;
        }
        if (i11 == 6 && this.H == 1) {
            int i17 = this.q0;
            this.X = i17;
            this.U = i17 + 1;
            this.V = i17 + 2;
            this.q0 = i17 + 4;
            this.W = i17 + 3;
        }
        if (i11 == 10 && this.H == 3) {
            int i18 = this.q0;
            this.q0 = i18 + 1;
            this.P = i18;
        } else {
            int i19 = this.q0;
            this.q0 = i19 + 1;
            this.O = i19;
        }
        if (i11 == 10) {
            if (this.H == 3) {
                int i20 = this.q0;
                this.g0 = i20;
                this.q0 = i20 + 2;
                this.priceRow = i20 + 1;
                if (!getUserConfig().q()) {
                    int i21 = this.q0;
                    this.q0 = i21 + 1;
                    this.h0 = i21;
                }
                int i22 = this.q0;
                this.q0 = i22 + 1;
                this.i0 = i22;
                if (getUserConfig().q()) {
                    int i23 = this.q0;
                    this.Q = i23;
                    this.R = i23 + 1;
                    this.q0 = i23 + 3;
                    this.T = i23 + 2;
                }
            }
        } else if (i11 != 8 || getUserConfig().q()) {
            int i24 = this.q0;
            int i25 = i24 + 1;
            this.q0 = i25;
            this.Q = i24;
            int i26 = this.H;
            if (i26 == 1 || i26 == 2) {
                this.q0 = i24 + 2;
                this.R = i25;
            }
            if (i26 == 0 || i26 == 2) {
                int i27 = this.q0;
                this.q0 = i27 + 1;
                this.S = i27;
            }
            int i28 = this.q0;
            int i29 = i28 + 1;
            this.q0 = i29;
            this.T = i28;
            if (i11 == 2) {
                this.Z = i29;
                this.a0 = i28 + 2;
                this.q0 = i28 + 4;
                this.b0 = i28 + 3;
            }
            if (i11 == 4 && (this.G.size() > 0 || (i10 = this.H) == 2 || i10 == 1)) {
                int i30 = this.q0;
                int i31 = i30 + 1;
                this.q0 = i31;
                this.photoForRestRow = i30;
                if (this.w0 != null) {
                    this.q0 = i30 + 2;
                    this.currentPhotoForRestRow = i31;
                }
                int i32 = this.q0;
                this.q0 = i32 + 1;
                this.Y = i32;
            }
            if (i11 == 0 && (this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty()))) {
                int i33 = this.q0;
                this.readRow = i33;
                this.q0 = i33 + 2;
                this.c0 = i33 + 1;
            }
            if (i11 == 0 && !getMessagesController().A3()) {
                int i34 = this.q0;
                this.d0 = i34;
                this.q0 = i34 + 2;
                this.e0 = i34 + 1;
            }
        }
        if (i11 == 12) {
            int i35 = this.q0;
            this.giftTypesHeaderRow = i35;
            this.l0 = i35 + 1;
            this.k0 = i35 + 2;
            this.m0 = i35 + 3;
            this.n0 = i35 + 4;
            this.o0 = i35 + 5;
            this.q0 = i35 + 7;
            this.p0 = i35 + 6;
        }
        E0();
        su0 su0Var = this.a;
        if (su0Var != null) {
            if (!z10) {
                su0Var.f();
                return;
            }
            int childCount = this.c.getChildCount();
            for (int i36 = 0; i36 < childCount; i36++) {
                View childAt = this.c.getChildAt(i36);
                if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Components.tk0 tk0Var = this.c;
                    View F = tk0Var.F(childAt);
                    s4.c1 T = F == null ? null : tk0Var.T(F);
                    if (T != null) {
                        int b10 = T.b();
                        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                        int i37 = this.everybodyRow;
                        if (b10 == i37 || b10 == this.N || b10 == this.nobodyRow || b10 == this.f0) {
                            m6Var.a(this.H == (b10 == i37 ? 0 : b10 == this.N ? 2 : b10 == this.nobodyRow ? 1 : 3), true);
                        } else {
                            m6Var.a(this.I == (b10 == this.W ? 1 : 0), true);
                        }
                    }
                }
            }
            pu0Var.f(pu0Var.d);
            s4.n.c(pu0Var, true).c(this.a);
            org.telegram.messenger.i0.a4(this.c);
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.nu0
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.w0 = photoSize3;
                privacyControlActivity.x0 = null;
                privacyControlActivity.H0();
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile3 != null || inputFile4 != null) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new k(privacyControlActivity, 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    org.telegram.ui.Components.cc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.cd.L0(2131747281, null), null, null).j();
                }
                privacyControlActivity.J0(false);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return z0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i10 = this.x;
        if (i10 == 5) {
            tu0 tu0Var = new tu0(context);
            tu0Var.setWillNotDraw(false);
            tu0Var.setClipToPadding(false);
            tu0Var.d = org.telegram.ui.ActionBar.t6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
            tu0Var.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = org.telegram.messenger.cd.L0(2131746847, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = org.telegram.messenger.zs.k4;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = org.telegram.messenger.d20.i(this.currentAccount).e();
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(this.currentAccount, tL_message, true, false);
            tu0Var.f = jjVar;
            jjVar.T = 1L;
            jjVar.Q1 = false;
            org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, this.currentAccount);
            tu0Var.b = q1Var;
            q1Var.setDelegate(new t7.u(15));
            q1Var.d6 = false;
            q1Var.setFullyDraw(true);
            q1Var.s3(jjVar, null, false, false, false, false);
            tu0Var.addView(q1Var, w7.b6.o(-1, -2));
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(1, context, null, true);
            tu0Var.e = q30Var;
            tu0Var.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.d = tu0Var;
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (i10 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746805, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746852, null));
        } else if (i10 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746792, null));
        } else if (i10 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746882, null));
        } else if (i10 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746819, null));
        } else if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746815, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752596, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746832, null));
        } else if (i10 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746773, null));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746830, null));
        } else if (i10 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746825, null));
        } else if (i10 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746875, null));
        } else if (i10 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746844, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 20));
        this.simpleActionBar.o();
        org.telegram.ui.ActionBar.l5 n10 = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        this.b = n10;
        n10.a(C0(), false);
        this.a = new su0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.c = tk0Var;
        tk0Var.r1();
        this.c.setLayoutManager(new s4.a0(1, false));
        this.c.setSectionsDrawBackground(true);
        this.c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.c.getItemAnimator()).C = false;
        frameLayout.addView(this.c, w7.b6.c(-1.0f, -1));
        this.c.setAdapter(this.a);
        this.c.setOnItemClickListener(new g(this, 26));
        ou0 ou0Var = new ou0(this);
        ou0Var.n(350L);
        ou0Var.o(org.telegram.ui.Components.gr.h);
        ou0Var.C = false;
        this.c.setItemAnimator(ou0Var);
        E0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tu0 tu0Var;
        if (i10 == org.telegram.messenger.zs.k0) {
            A0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.i4) {
            this.c.g1();
        } else {
            if (i10 != org.telegram.messenger.zs.z4 || (tu0Var = this.d) == null) {
                return;
            }
            tu0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bc));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        return z0(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        J0(false);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.k0);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.z4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.i4);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.k0);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.z4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.i4);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.b40 b40Var = this.r0;
        if (b40Var != null) {
            b40Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        J0(false);
        org.telegram.ui.Components.b40 b40Var = this.r0;
        if (b40Var != null) {
            b40Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            tu0 tu0Var = this.d;
            if (tu0Var != null) {
                tu0Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0() {
        final PrivacyControlActivity privacyControlActivity;
        int i10 = this.x;
        if (i10 == 10) {
            boolean[] zArr = {true, false};
            if (this.H == 3) {
                ArrayList arrayList = this.h;
                Collections.sort(arrayList);
                Collections.sort(this.F);
                if (!arrayList.equals(this.F)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.H != 0 && this.F.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.F.size(); i11++) {
                            Long l4 = (Long) this.F.get(i11);
                            long longValue = l4.longValue();
                            if (org.telegram.messenger.o5.E(longValue)) {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(l4);
                                if (Z1 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.vp.r1(this.currentAccount).p1(Z1));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new ul0(3, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            int i12 = this.H;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.K;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i12 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new mb(this, zArr, globalPrivacySettings, setglobalprivacysettings));
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.H == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.I == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger.incrementAndGet();
                final int i13 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) { // from class: org.telegram.ui.hu0
                    public final /* synthetic */ PrivacyControlActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i14 = 0;
                                final PrivacyControlActivity privacyControlActivity2 = this.b;
                                final AtomicInteger atomicInteger2 = atomicInteger;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ju0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                PrivacyControlActivity.c0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                                break;
                                            default:
                                                PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i15 = 1;
                                final PrivacyControlActivity privacyControlActivity3 = this.b;
                                final AtomicInteger atomicInteger3 = atomicInteger;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ju0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                PrivacyControlActivity.c0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                PrivacyControlActivity.d0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i10 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i10 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i10 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i10 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i10 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i10 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i10 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i10 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i10 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i10 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.H != 0 && this.F.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i14 = 0; i14 < this.F.size(); i14++) {
                Long l10 = (Long) this.F.get(i14);
                long longValue2 = l10.longValue();
                if (org.telegram.messenger.o5.E(longValue2)) {
                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(l10);
                    if (Z12 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.vp.r1(this.currentAccount).p1(Z12));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.H != 1 && this.G.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i15 = 0; i15 < this.G.size(); i15++) {
                Long l11 = (Long) this.G.get(i15);
                long longValue3 = l11.longValue();
                if (org.telegram.messenger.o5.E(longValue3)) {
                    TLRPC.User Z13 = getMessagesController().Z1(l11);
                    if (Z13 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().p1(Z13));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i16 = this.H;
        if (i16 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i16 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i16 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i17 = this.H;
        if (i17 != 0) {
            if (this.y[i17 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i18 = this.H;
        if (this.D[i18]) {
            if (i18 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger.incrementAndGet();
        final int i19 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) { // from class: org.telegram.ui.hu0
            public final /* synthetic */ PrivacyControlActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i19) {
                    case 0:
                        final int i142 = 0;
                        final PrivacyControlActivity privacyControlActivity2 = this.b;
                        final AtomicInteger atomicInteger2 = atomicInteger;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ju0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i142) {
                                    case 0:
                                        PrivacyControlActivity.c0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                        break;
                                    default:
                                        PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i152 = 1;
                        final PrivacyControlActivity privacyControlActivity3 = this.b;
                        final AtomicInteger atomicInteger3 = atomicInteger;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.ju0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i152) {
                                    case 0:
                                        PrivacyControlActivity.c0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        PrivacyControlActivity.d0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i10 != 0 || this.A0 == this.z0) {
            privacyControlActivity = this;
        } else {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.A0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            final int i20 = 0;
            privacyControlActivity = this;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(privacyControlActivity) { // from class: org.telegram.ui.iu0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = privacyControlActivity;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            final int i21 = 0;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lu0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity3.z0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity3.B0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z11 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z11 != setglobalprivacysettings4.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z12 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z12;
                                            globalPrivacySettings8.display_gifts_button = z12;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.D0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity4.L0 = !z17;
                                            }
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i22 = 1;
                            final PrivacyControlActivity privacyControlActivity3 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lu0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity3;
                                            privacyControlActivity32.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity32.z0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity3;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.D0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity4.L0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (i10 == 12 && (privacyControlActivity.C0 != privacyControlActivity.B0 || privacyControlActivity.G0 != privacyControlActivity.F0 || privacyControlActivity.E0 != privacyControlActivity.D0 || privacyControlActivity.I0 != privacyControlActivity.H0 || privacyControlActivity.M0 != privacyControlActivity.L0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = privacyControlActivity.C0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !privacyControlActivity.E0;
                disallowedGiftsSettings.disallow_limited_stargifts = !privacyControlActivity.G0;
                disallowedGiftsSettings.disallow_unique_stargifts = !privacyControlActivity.I0;
                disallowedGiftsSettings.disallow_premium_gifts = !privacyControlActivity.M0;
            }
            final int i21 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(privacyControlActivity) { // from class: org.telegram.ui.iu0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = privacyControlActivity;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i21) {
                        case 0:
                            final int i212 = 0;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lu0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (i212) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity2;
                                            privacyControlActivity32.getClass();
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity32.z0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.D0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity4.L0 = !z17;
                                            }
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i22 = 1;
                            final PrivacyControlActivity privacyControlActivity3 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.lu0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity3;
                                            privacyControlActivity32.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity32.z0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity3;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z11 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z12;
                                            globalPrivacySettings822.display_gifts_button = z12;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.D0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity4.L0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            privacyControlActivity.b.b(true);
        }
    }

    public final boolean y0() {
        return (this.I0 || this.E0 || this.G0) ? false : true;
    }

    public final boolean z0(boolean z10) {
        if (!this.b.x.f) {
            return true;
        }
        int i10 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131743752, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131746785, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new ku0(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new ku0(this, 2));
            showDialog(x1Var);
        }
        return false;
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void H(float f7) {
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
    }
}
