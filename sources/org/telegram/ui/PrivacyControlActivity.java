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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public TLRPC.Photo A0;
    public SpannableString B0;
    public boolean C0;
    public boolean D0;
    public final int E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public final boolean[] G;
    public boolean G0;
    public final boolean[] H;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public ArrayList J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public boolean L0;
    public long M;
    public boolean M0;
    public long N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public int Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public at0 a;
    public int a0;
    public org.telegram.ui.ActionBar.b5 b;
    public int b0;
    public org.telegram.ui.Components.tj0 c;
    public int c0;
    private int currentPhotoForRestRow;
    public bt0 d;
    public int d0;
    public gi.l3 e;
    public int e0;
    private int everybodyRow;
    public final int[] f;
    public int f0;
    public int g0;
    private int giftTypesHeaderRow;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n;
    public int n0;
    private int nobodyRow;
    public int o0;
    public int p0;
    private int photoForRestRow;
    private int priceRow;
    public int q0;
    public final ArrayList r;
    public int r0;
    private int readRow;
    public final ArrayList s;
    public int s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public int t0;
    public final org.telegram.ui.Components.f30 u0;
    public org.telegram.ui.Components.ch0 v0;
    public final boolean[] w;
    public org.telegram.ui.Cells.l8 w0;
    public final boolean[] x;
    public org.telegram.ui.Components.k9 x0;
    public final boolean[] y;
    public jr y0;
    public TLRPC.PhotoSize z0;

    public PrivacyControlActivity(int i3, boolean z10) {
        super(null);
        TLRPC.PhotoSize w10;
        this.f = new int[2];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new boolean[4];
        this.x = new boolean[4];
        this.y = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.H = new boolean[4];
        this.N = 10L;
        this.Q0 = 4;
        this.E = i3;
        if (z10) {
            org.telegram.messenger.g5.r(this.currentAccount).D(false);
        }
        if (i3 == 4) {
            org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
            this.u0 = f30Var;
            f30Var.a = this;
            f30Var.b = this;
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().n);
            if (!org.telegram.messenger.l10.q(b22) || (w10 = org.telegram.messenger.w7.w(b22.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.z0 = w10;
            this.A0 = b22.fallback_photo;
        }
    }

    public static /* synthetic */ void Z(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.z0 = null;
        privacyControlActivity.A0 = null;
        TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().n);
        if (b22 == null || (photo = b22.fallback_photo) == null) {
            return;
        }
        b22.flags &= -4194305;
        b22.fallback_photo = null;
        privacyControlActivity.getMessagesStorage().j2(b22, true);
        privacyControlActivity.O0();
        privacyControlActivity.Q0(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        org.telegram.messenger.hp.s1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
        org.telegram.messenger.hs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.hs.c0, new Object[0]);
    }

    public static /* synthetic */ void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.M0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        org.telegram.messenger.hp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
        org.telegram.messenger.hp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
        org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
        org.telegram.messenger.g0.h3(new hk0(16, privacyControlActivity, zArr));
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().n);
            b22.flags |= TLObject.FLAG_22;
            b22.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            org.telegram.messenger.hs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.hs.c0, new Object[0]);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w10 != null && privacyControlActivity.z0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File K = org.telegram.messenger.w7.K(w10, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.K(privacyControlActivity.z0, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.z0.location.volume_id);
                sb2.append("_");
                String o10 = a1.g.o(privacyControlActivity.z0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.e(w10.location));
            }
            if (w11 == null || privacyControlActivity.z0 == null) {
                return;
            }
            org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
            File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
            org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
            org.telegram.messenger.w7.K(privacyControlActivity.z0.location, null, true, true).renameTo(K2);
        }
    }

    public static void c0(final PrivacyControlActivity privacyControlActivity, View view, final int i3) {
        boolean z10;
        int i10;
        int i11 = privacyControlActivity.E;
        int i12 = 1;
        if (i3 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(privacyControlActivity.getParentActivity(), org.telegram.messenger.bd.M0(2131746297, null), org.telegram.messenger.bd.M0(2131746298, null), org.telegram.messenger.bd.M0(2131746329, null), new ns0(privacyControlActivity, i12), null).a;
            s1Var.show();
            s1Var.i();
            return;
        }
        int i13 = 12;
        int i14 = 0;
        r8 = false;
        boolean z11 = false;
        if (i3 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.f30 f30Var = privacyControlActivity.u0;
            if (f30Var != null) {
                f30Var.n(false, new ai.y1(26), new s5(privacyControlActivity, i13), 0);
                privacyControlActivity.v0.M(0);
                privacyControlActivity.v0.P(43);
                privacyControlActivity.w0.e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
        int i15 = 2;
        if (i11 == 10 && i3 == privacyControlActivity.Q && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.fc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.bd.M0(2131747779, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747780, null)), org.telegram.messenger.bd.M0(2131747781, null), new ns0(privacyControlActivity, i15)).j();
            p2Var.a();
            int i16 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i16;
            org.telegram.messenger.g0.G3(i16, view, null);
            return;
        }
        int i17 = 3;
        if (i11 == 8 && ((i3 == privacyControlActivity.Q || i3 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.fc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.bd.M0(2131747779, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747780, null)), org.telegram.messenger.bd.M0(2131747781, null), new ns0(privacyControlActivity, i17)).j();
            p2Var.a();
            int i18 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i18;
            org.telegram.messenger.g0.G3(i18, view, null);
            return;
        }
        if (i3 == privacyControlActivity.nobodyRow || i3 == privacyControlActivity.everybodyRow || i3 == privacyControlActivity.Q || i3 == privacyControlActivity.i0) {
            if (i11 == 12 && privacyControlActivity.F0()) {
                int i19 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i19;
                org.telegram.messenger.g0.G3(i19, view, null);
                return;
            }
            if (i3 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i3 != privacyControlActivity.everybodyRow) {
                i14 = i3 == privacyControlActivity.i0 ? 3 : 2;
            }
            if (i14 == privacyControlActivity.K) {
                return;
            }
            privacyControlActivity.K = i14;
            org.telegram.ui.Components.ac.e();
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
            return;
        }
        if (i3 == privacyControlActivity.Z || i3 == privacyControlActivity.Y) {
            int i20 = i3 != privacyControlActivity.Y ? 1 : 0;
            if (i20 == privacyControlActivity.L) {
                return;
            }
            privacyControlActivity.L = i20;
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
            return;
        }
        if (i3 == privacyControlActivity.V || i3 == privacyControlActivity.U) {
            if (i11 == 12 && privacyControlActivity.F0()) {
                int i21 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i21;
                org.telegram.messenger.g0.G3(i21, view, null);
                return;
            }
            ArrayList arrayList = i3 == privacyControlActivity.V ? privacyControlActivity.J : privacyControlActivity.I;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i3 == privacyControlActivity.V ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i11 != 0 ? 1 : 0);
            if (i3 == privacyControlActivity.U && i11 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            final boolean z12 = i11 == 12 && ((i10 = privacyControlActivity.K) != 1 ? !(i10 != 2 ? !(i10 == 0 && i3 == privacyControlActivity.V) : i3 != privacyControlActivity.U) : i3 == privacyControlActivity.U);
            bundle.putBoolean("allowMiniapps", z12);
            r40 r40Var = new r40(bundle);
            if (i11 == 10) {
                r40Var.M = org.telegram.messenger.bd.M0(2131746299, null);
            }
            if (i3 == privacyControlActivity.U) {
                if (privacyControlActivity.F[privacyControlActivity.K == 2 ? (char) 0 : (char) 1]) {
                    z10 = true;
                    if (z12 && privacyControlActivity.G[privacyControlActivity.K]) {
                        z11 = true;
                    }
                    r40Var.u0(arrayList, z10, z11);
                    r40Var.x = new n40() { // from class: org.telegram.ui.ts0
                        @Override // org.telegram.ui.n40
                        public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr = privacyControlActivity2.G;
                            int i22 = privacyControlActivity2.V;
                            int i23 = i3;
                            boolean z15 = z12;
                            int i24 = 0;
                            if (i23 == i22) {
                                privacyControlActivity2.J = arrayList2;
                                zArr[privacyControlActivity2.K] = z15 && z14;
                                while (i24 < privacyControlActivity2.J.size()) {
                                    privacyControlActivity2.I.remove(privacyControlActivity2.J.get(i24));
                                    i24++;
                                }
                            } else {
                                boolean[] zArr2 = privacyControlActivity2.F;
                                int i25 = privacyControlActivity2.K;
                                zArr2[i25 == 2 ? (char) 0 : (char) 1] = z13;
                                zArr[i25] = z15 && z14;
                                privacyControlActivity2.I = arrayList2;
                                while (i24 < privacyControlActivity2.I.size()) {
                                    privacyControlActivity2.J.remove(privacyControlActivity2.I.get(i24));
                                    i24++;
                                }
                            }
                            privacyControlActivity2.P0();
                            privacyControlActivity2.a.f();
                        }
                    };
                    r40Var.f0 = true;
                    privacyControlActivity.presentFragment(r40Var);
                    return;
                }
            }
            z10 = false;
            if (z12) {
                z11 = true;
            }
            r40Var.u0(arrayList, z10, z11);
            r40Var.x = new n40() { // from class: org.telegram.ui.ts0
                @Override // org.telegram.ui.n40
                public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                    boolean[] zArr = privacyControlActivity2.G;
                    int i22 = privacyControlActivity2.V;
                    int i23 = i3;
                    boolean z15 = z12;
                    int i24 = 0;
                    if (i23 == i22) {
                        privacyControlActivity2.J = arrayList2;
                        zArr[privacyControlActivity2.K] = z15 && z14;
                        while (i24 < privacyControlActivity2.J.size()) {
                            privacyControlActivity2.I.remove(privacyControlActivity2.J.get(i24));
                            i24++;
                        }
                    } else {
                        boolean[] zArr2 = privacyControlActivity2.F;
                        int i25 = privacyControlActivity2.K;
                        zArr2[i25 == 2 ? (char) 0 : (char) 1] = z13;
                        zArr[i25] = z15 && z14;
                        privacyControlActivity2.I = arrayList2;
                        while (i24 < privacyControlActivity2.I.size()) {
                            privacyControlActivity2.J.remove(privacyControlActivity2.I.get(i24));
                            i24++;
                        }
                    }
                    privacyControlActivity2.P0();
                    privacyControlActivity2.a.f();
                }
            };
            r40Var.f0 = true;
            privacyControlActivity.presentFragment(r40Var);
            return;
        }
        if (i3 == privacyControlActivity.d0) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i3 == privacyControlActivity.readRow) {
            privacyControlActivity.D0 = !privacyControlActivity.D0;
            privacyControlActivity.P0();
            ((org.telegram.ui.Cells.q8) view).setChecked(privacyControlActivity.D0);
            return;
        }
        if (i3 == privacyControlActivity.g0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i3 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.F0 = !privacyControlActivity.F0;
            privacyControlActivity.P0();
            ((org.telegram.ui.Cells.q8) view).setChecked(privacyControlActivity.F0);
            return;
        }
        if (i3 == privacyControlActivity.o0) {
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                int i22 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i22;
                org.telegram.messenger.g0.G3(i22, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F0 = privacyControlActivity.F0();
            privacyControlActivity.J0 = !privacyControlActivity.J0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setChecked(privacyControlActivity.J0);
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                q8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F0 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i3 == privacyControlActivity.n0) {
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                int i23 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i23;
                org.telegram.messenger.g0.G3(i23, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F02 = privacyControlActivity.F0();
            privacyControlActivity.H0 = !privacyControlActivity.H0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
            q8Var2.setChecked(privacyControlActivity.H0);
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                q8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F02 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i3 == privacyControlActivity.p0) {
            if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                int i24 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i24;
                org.telegram.messenger.g0.G3(i24, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F03 = privacyControlActivity.F0();
            privacyControlActivity.L0 = !privacyControlActivity.L0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
            q8Var3.setChecked(privacyControlActivity.L0);
            if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                q8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F03 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i3 == privacyControlActivity.q0) {
            if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                int i25 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i25;
                org.telegram.messenger.g0.G3(i25, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F04 = privacyControlActivity.F0();
            privacyControlActivity.N0 = !privacyControlActivity.N0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.q8 q8Var4 = (org.telegram.ui.Cells.q8) view;
            q8Var4.setChecked(privacyControlActivity.N0);
            if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                q8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F04 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i3 == privacyControlActivity.r0) {
            if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                int i26 = -privacyControlActivity.Q0;
                privacyControlActivity.Q0 = i26;
                org.telegram.messenger.g0.G3(i26, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F05 = privacyControlActivity.F0();
            privacyControlActivity.P0 = !privacyControlActivity.P0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.q8 q8Var5 = (org.telegram.ui.Cells.q8) view;
            q8Var5.setChecked(privacyControlActivity.P0);
            if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                q8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F05 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
            }
        }
    }

    public static void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.fc.a0(privacyControlActivity).f0(tL_error, false);
            return;
        }
        org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.I0();
        }
    }

    public static /* synthetic */ void e0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            privacyControlActivity.M0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        org.telegram.messenger.hp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
        org.telegram.messenger.hp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
        org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.E, privacyrules.rules);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.I0();
        }
    }

    public static void w0(PrivacyControlActivity privacyControlActivity) {
        bt0 bt0Var;
        int[] iArr = privacyControlActivity.f;
        if (privacyControlActivity.e == null || (bt0Var = privacyControlActivity.d) == null || privacyControlActivity.fragmentView == null) {
            return;
        }
        if (bt0Var.getParent() != privacyControlActivity.c || !privacyControlActivity.d.isAttachedToWindow()) {
            privacyControlActivity.e.f(false);
            return;
        }
        privacyControlActivity.d.getLocationInWindow(iArr);
        int i3 = iArr[0];
        int i10 = iArr[1];
        privacyControlActivity.fragmentView.getLocationInWindow(iArr);
        privacyControlActivity.e.x(privacyControlActivity.d.b.getForwardNameCenterX() + privacyControlActivity.d.b.getLeft() + (i3 - iArr[0]), org.telegram.messenger.g0.L(44.0f) + privacyControlActivity.d.getPaddingTop() + (i10 - iArr[1]), false);
    }

    public final void E0() {
        final AtomicInteger atomicInteger;
        int i3 = this.E;
        if (i3 == 10) {
            boolean[] zArr = {true, false};
            if (this.K == 3) {
                ArrayList arrayList = this.r;
                Collections.sort(arrayList);
                Collections.sort(this.I);
                if (!arrayList.equals(this.I)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.K != 0 && this.I.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i10 = 0; i10 < this.I.size(); i10++) {
                            Long l10 = (Long) this.I.get(i10);
                            long longValue = l10.longValue();
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(l10);
                                if (a22 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.hp.s1(this.currentAccount).q1(a22));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new xy(22, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
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
            int i11 = this.K;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.N;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i11 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ai.q1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 17));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i3 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.K == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.L == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                final int i12 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) { // from class: org.telegram.ui.os0
                    public final /* synthetic */ PrivacyControlActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i12) {
                            case 0:
                                final int i13 = 0;
                                final PrivacyControlActivity privacyControlActivity = this.b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                PrivacyControlActivity.d0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                PrivacyControlActivity.e0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i14 = 1;
                                final PrivacyControlActivity privacyControlActivity2 = this.b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qs0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                            default:
                                                PrivacyControlActivity.e0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i3 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i3 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i3 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i3 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i3 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i3 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i3 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i3 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i3 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i3 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.K != 0 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.I.size(); i13++) {
                Long l11 = (Long) this.I.get(i13);
                long longValue2 = l11.longValue();
                if (org.telegram.messenger.m5.E(longValue2)) {
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(this.currentAccount).a2(l11);
                    if (a23 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.hp.s1(this.currentAccount).q1(a23));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.K != 1 && this.J.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.J.size(); i14++) {
                Long l12 = (Long) this.J.get(i14);
                long longValue3 = l12.longValue();
                if (org.telegram.messenger.m5.E(longValue3)) {
                    TLRPC.User a24 = getMessagesController().a2(l12);
                    if (a24 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().q1(a24));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i15 = this.K;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.K;
        if (i16 != 0) {
            if (this.F[i16 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.K;
        if (this.G[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i18 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) { // from class: org.telegram.ui.os0
            public final /* synthetic */ PrivacyControlActivity b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i18) {
                    case 0:
                        final int i132 = 0;
                        final PrivacyControlActivity privacyControlActivity = this.b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qs0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i132) {
                                    case 0:
                                        PrivacyControlActivity.d0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        PrivacyControlActivity.e0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i142 = 1;
                        final PrivacyControlActivity privacyControlActivity2 = this.b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.qs0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i142) {
                                    case 0:
                                        PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                    default:
                                        PrivacyControlActivity.e0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i3 != 0 || this.D0 == this.C0) {
            atomicInteger = atomicInteger2;
        } else {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.D0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i19 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) { // from class: org.telegram.ui.ps0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i19) {
                        case 0:
                            final int i20 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ss0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i20) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.C0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z11 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z11 != setglobalprivacysettings4.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z12;
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
                                                privacyControlActivity3.G0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.I0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.K0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.M0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.O0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i21 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ss0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z12;
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
                                                privacyControlActivity3.G0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.I0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.K0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.M0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.O0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
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
        if (i3 == 12 && (this.F0 != this.E0 || this.J0 != this.I0 || this.H0 != this.G0 || this.L0 != this.K0 || this.P0 != this.O0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.F0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.H0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.J0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.L0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.P0;
            }
            final int i20 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) { // from class: org.telegram.ui.ps0
                public final /* synthetic */ PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            final int i202 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ss0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i202) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z12;
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
                                                privacyControlActivity3.G0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.I0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.K0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.M0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.O0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i21 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ss0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z11 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z12;
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
                                                privacyControlActivity3.G0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.I0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.K0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.M0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.O0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
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
            this.b.b(true);
        }
    }

    public final boolean F0() {
        return (this.L0 || this.H0 || this.J0) ? false : true;
    }

    public final boolean G0(boolean z10) {
        if (!this.b.x.f) {
            return true;
        }
        int i3 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131743736, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131746778, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new rs0(this, i3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new rs0(this, 2));
            showDialog(s1Var);
        }
        return false;
    }

    public final void H0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i3;
        int i10;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.r;
        int i11 = this.E;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).Y;
            int i12 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.K = i12;
            this.h = i12;
            this.J = new ArrayList();
            this.I = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.N = 10L;
                this.M = 10L;
            } else {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().I6, 1L);
                this.N = k10;
                this.M = k10;
                this.K = 3;
                this.h = 3;
            }
            ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(13);
            this.I = new ArrayList();
            if (v != null) {
                for (int i13 = 0; i13 < v.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = a1.g.h(i14, 1, -tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.I);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.I.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.I);
            return;
        }
        boolean z10 = i11 == 1;
        boolean[] zArr4 = this.w;
        zArr4[0] = z10;
        boolean[] zArr5 = this.F;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.x;
        zArr6[0] = false;
        boolean[] zArr7 = this.G;
        zArr7[0] = false;
        boolean z11 = i11 == 12;
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.y;
        zArr8[0] = false;
        boolean[] zArr9 = this.H;
        zArr9[0] = false;
        boolean z12 = i11 == 12;
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.I = new ArrayList();
        this.J = new ArrayList();
        ArrayList v10 = org.telegram.messenger.g5.r(this.currentAccount).v(i11);
        if (v10 == null || v10.size() == 0) {
            this.K = 1;
        } else {
            Boolean bool2 = null;
            int i15 = 0;
            boolean z13 = false;
            boolean z14 = false;
            char c2 = 65535;
            while (i15 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = a1.g.h(i16, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.I);
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
                        int i17 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i17 < size3; size3 = size3) {
                            i17 = a1.g.h(i17, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.J);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.J.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
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
                                            c2 = 2;
                                            z14 = true;
                                        } else if (c2 == 65535) {
                                            if (!z15) {
                                                if (!z16 || z14) {
                                                    c2 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c2 = 1;
                                }
                                c2 = 0;
                            }
                            bool2 = bool;
                        }
                        i15++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        v10 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i15++;
                zArr5 = zArr3;
                zArr6 = zArr;
                v10 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c2 == 0 || (c2 == 65535 && (this.J.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i3 = 2;
                this.K = 0;
            } else {
                i3 = 2;
                if (c2 != 2) {
                    if (c2 != 65535 || this.J.size() <= 0 || this.I.size() <= 0) {
                        if (c2 != 1) {
                            i10 = (c2 == 65535 && (this.I.size() > 0 || (bool2 != null && bool2.booleanValue()))) ? 1 : 1;
                            i3 = 2;
                        }
                        this.K = i10;
                        i3 = 2;
                    } else {
                        i3 = 2;
                    }
                }
                this.K = i3;
            }
            int i18 = this.K;
            char c10 = i18 == i3 ? (char) 0 : (char) 1;
            zArr11[c10] = z13;
            zArr12[c10] = z13;
            boolean z17 = bool2 != null;
            zArr10[i18] = z17;
            zArr7[i18] = z17;
            zArr8[i18] = false;
            zArr9[i18] = false;
            org.telegram.ui.ActionBar.b5 b5Var = this.b;
            if (b5Var != null) {
                b5Var.a(false, false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        this.h = this.K;
        arrayList2.addAll(this.I);
        arrayList3.addAll(this.J);
        if (i11 == 6) {
            ArrayList v11 = org.telegram.messenger.g5.r(this.currentAccount).v(7);
            if (v11 == null || v11.size() == 0) {
                this.L = 0;
            } else {
                int i19 = 0;
                while (true) {
                    if (i19 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.L = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.L = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.L = 1;
                            break;
                        }
                        i19++;
                    }
                }
            }
            this.n = this.L;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().Y;
            boolean z18 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.C0 = z18;
            this.D0 = z18;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().Y;
            boolean z19 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.E0 = z19;
            this.F0 = z19;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.H0 = true;
                this.G0 = true;
                this.J0 = true;
                this.I0 = true;
                this.L0 = true;
                this.K0 = true;
                this.N0 = true;
                this.M0 = true;
                this.P0 = true;
                this.O0 = true;
            } else {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.H0 = z20;
                this.G0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.J0 = z21;
                this.I0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.L0 = z22;
                this.K0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.N0 = z23;
                this.M0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.P0 = z24;
                this.O0 = z24;
            }
        }
        Q0(false);
        org.telegram.messenger.g0.b4(this.c);
    }

    public final void I0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        this.b.b(false);
        int i3 = 1;
        int i10 = this.E;
        if ((i10 == 10 || i10 == 1 || i10 == 2) && this.K != 0 && (globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).Y) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = iArr[i11];
                ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(i12);
                if (i12 != i10) {
                    if (v != null) {
                        int size = v.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = v.get(i13);
                            i13++;
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
                        String M0 = org.telegram.messenger.bd.M0(i12 == 1 ? 2131752147 : 2131752149, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(i12 == 1 ? 2131752148 : 2131752150, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752146, null), new k2.q(this, i12, 17));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new rs0(this, i3));
                        alertDialog$Builder.p();
                        return;
                    }
                }
            }
        }
        finishFragment();
    }

    public final boolean J0() {
        ArrayList arrayList;
        int i3 = this.E;
        if (i3 == 0 && ((this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty())) && this.C0 != this.D0)) {
            return true;
        }
        if (i3 == 12 && (this.E0 != this.F0 || this.I0 != this.J0 || this.G0 != this.H0 || this.K0 != this.L0 || this.M0 != this.N0 || this.O0 != this.P0)) {
            return true;
        }
        int i10 = this.h;
        int i11 = this.K;
        if (i10 != i11) {
            return true;
        }
        if (i3 == 6 && i11 == 1 && this.n != this.L) {
            return true;
        }
        if (i11 != 0) {
            if (this.w[i11 == 2 ? (char) 0 : (char) 1] != this.F[i11 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i3 == 10 && i11 == 3 && this.N != this.M) || this.x[i11] != this.G[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.s;
        if (arrayList2.size() != this.J.size()) {
            return true;
        }
        ArrayList arrayList3 = this.r;
        if (arrayList3.size() != this.I.size()) {
            return true;
        }
        if (i3 != 10 || this.K == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.I);
            if (!arrayList3.equals(this.I)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.J);
            if (!arrayList2.equals(this.J)) {
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        if (getParentActivity() == null) {
            return;
        }
        int i3 = this.E;
        if (i3 == 10 && this.K == 3 && !getUserConfig().q()) {
            showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) this, 27, true));
            return;
        }
        if (this.K != 0 && i3 == 0 && !getUserConfig().q()) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                if (i3 == 1) {
                    s1Var.U = org.telegram.messenger.bd.M0(2131742891, null);
                } else {
                    s1Var.U = org.telegram.messenger.bd.M0(2131751686, null);
                }
                s1Var.S = org.telegram.messenger.bd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new rb0(16, this, e12));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                showDialog(s1Var);
                return;
            }
        }
        E0();
    }

    public final void L0() {
        bt0 bt0Var = this.d;
        if (bt0Var != null) {
            bt0Var.e.k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i3 = this.K;
            if (i3 == 0) {
                String M0 = org.telegram.messenger.bd.M0(2131746843, null);
                gi.l3 l3Var = this.e;
                if (l3Var != null) {
                    l3Var.u(M0);
                }
                this.d.e.k.fwd_from.from_id.user_id = 1L;
            } else if (i3 == 1) {
                String M02 = org.telegram.messenger.bd.M0(2131746839, null);
                gi.l3 l3Var2 = this.e;
                if (l3Var2 != null) {
                    l3Var2.u(M02);
                }
                this.d.e.k.fwd_from.from_id.user_id = 0L;
            } else {
                String M03 = org.telegram.messenger.bd.M0(2131746844, null);
                gi.l3 l3Var3 = this.e;
                if (l3Var3 != null) {
                    l3Var3.u(M03);
                }
                this.d.e.k.fwd_from.from_id.user_id = 1L;
            }
            this.d.b.G1();
        }
    }

    public final void M0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131746846, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        showDialog(s1Var);
    }

    public final void N0() {
        org.telegram.ui.Components.fc.a0(this).L(R.raw.star_premium_2, org.telegram.messenger.bd.M0(2131747779, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747780, null)), org.telegram.messenger.bd.M0(2131747781, null), new ns0(this, 0)).j();
    }

    public final void O0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.l8 l8Var = this.w0;
        if (l8Var != null) {
            if (this.z0 == null) {
                l8Var.getTextView().k(org.telegram.messenger.bd.a0("SetPhotoForRest", null, 2131745527, new Object[0]));
                this.w0.setNeedDivider(false);
            } else {
                l8Var.getTextView().k(org.telegram.messenger.bd.a0("UpdatePhotoForRest", null, 2131743827, new Object[0]));
                this.w0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.x0;
        if (k9Var == null || (photoSize = this.z0) == null) {
            return;
        }
        TLRPC.Photo photo = this.A0;
        if (photo != null) {
            k9Var.j(org.telegram.messenger.ac.i(photoSize, photo), "50_50", null, org.telegram.messenger.h10.i(this.currentAccount).f());
        } else {
            k9Var.j(org.telegram.messenger.ac.e(photoSize.location), "50_50", null, org.telegram.messenger.h10.i(this.currentAccount).f());
        }
    }

    public final void P0() {
        this.b.a(J0(), true);
    }

    public final void Q0(boolean z10) {
        xs0 xs0Var;
        ArrayList arrayList;
        int i3;
        TLRPC.UserFull b22;
        if (z10) {
            xs0Var = new xs0(this);
            xs0Var.f(xs0Var.c);
            xs0Var.b = this.t0;
        } else {
            xs0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.b0 = -1;
        this.O = -1;
        this.setBirthdayRow = -1;
        this.a0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.U = -1;
        this.V = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.R = -1;
        this.S = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.T = -1;
        this.W = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.priceRow = -1;
        this.l0 = -1;
        this.k0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.showGiftIconRow = -1;
        this.m0 = -1;
        this.giftTypesHeaderRow = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = 0;
        int i10 = this.E;
        if (i10 == 12) {
            this.showGiftIconRow = 0;
            this.t0 = 2;
            this.m0 = 1;
        }
        if (i10 == 11 && (b22 = getMessagesController().b2(getUserConfig().e())) != null && b22.birthday == null) {
            int i11 = this.t0;
            this.t0 = i11 + 1;
            this.setBirthdayRow = i11;
        }
        if (i10 == 5) {
            int i12 = this.t0;
            this.t0 = i12 + 1;
            this.O = i12;
        }
        int i13 = this.t0;
        this.P = i13;
        this.everybodyRow = i13 + 1;
        int i14 = i13 + 3;
        this.t0 = i14;
        this.Q = i13 + 2;
        if (i10 == 4 || i10 == 9 || i10 == 14 || i10 == 0 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 1 || i10 == 11 || i10 == 12) {
            this.t0 = i13 + 4;
            this.nobodyRow = i14;
        }
        if (getMessagesController().L6 && i10 == 10) {
            int i15 = this.t0;
            this.t0 = i15 + 1;
            this.i0 = i15;
        }
        if (i10 == 6 && this.K == 1) {
            int i16 = this.t0;
            this.a0 = i16;
            this.X = i16 + 1;
            this.Y = i16 + 2;
            this.t0 = i16 + 4;
            this.Z = i16 + 3;
        }
        if (i10 == 10 && this.K == 3) {
            int i17 = this.t0;
            this.t0 = i17 + 1;
            this.S = i17;
        } else {
            int i18 = this.t0;
            this.t0 = i18 + 1;
            this.R = i18;
        }
        if (i10 == 10) {
            if (this.K == 3) {
                int i19 = this.t0;
                this.j0 = i19;
                this.t0 = i19 + 2;
                this.priceRow = i19 + 1;
                if (!getUserConfig().q()) {
                    int i20 = this.t0;
                    this.t0 = i20 + 1;
                    this.k0 = i20;
                }
                int i21 = this.t0;
                this.t0 = i21 + 1;
                this.l0 = i21;
                if (getUserConfig().q()) {
                    int i22 = this.t0;
                    this.T = i22;
                    this.U = i22 + 1;
                    this.t0 = i22 + 3;
                    this.W = i22 + 2;
                }
            }
        } else if (i10 != 8 || getUserConfig().q()) {
            int i23 = this.t0;
            int i24 = i23 + 1;
            this.t0 = i24;
            this.T = i23;
            int i25 = this.K;
            if (i25 == 1 || i25 == 2) {
                this.t0 = i23 + 2;
                this.U = i24;
            }
            if (i25 == 0 || i25 == 2) {
                int i26 = this.t0;
                this.t0 = i26 + 1;
                this.V = i26;
            }
            int i27 = this.t0;
            int i28 = i27 + 1;
            this.t0 = i28;
            this.W = i27;
            if (i10 == 2) {
                this.c0 = i28;
                this.d0 = i27 + 2;
                this.t0 = i27 + 4;
                this.e0 = i27 + 3;
            }
            if (i10 == 4 && (this.J.size() > 0 || (i3 = this.K) == 2 || i3 == 1)) {
                int i29 = this.t0;
                int i30 = i29 + 1;
                this.t0 = i30;
                this.photoForRestRow = i29;
                if (this.z0 != null) {
                    this.t0 = i29 + 2;
                    this.currentPhotoForRestRow = i30;
                }
                int i31 = this.t0;
                this.t0 = i31 + 1;
                this.b0 = i31;
            }
            if (i10 == 0 && (this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty()))) {
                int i32 = this.t0;
                this.readRow = i32;
                this.t0 = i32 + 2;
                this.f0 = i32 + 1;
            }
            if (i10 == 0 && !getMessagesController().D3()) {
                int i33 = this.t0;
                this.g0 = i33;
                this.t0 = i33 + 2;
                this.h0 = i33 + 1;
            }
        }
        if (i10 == 12) {
            int i34 = this.t0;
            this.giftTypesHeaderRow = i34;
            this.o0 = i34 + 1;
            this.n0 = i34 + 2;
            this.p0 = i34 + 3;
            this.q0 = i34 + 4;
            this.r0 = i34 + 5;
            this.t0 = i34 + 7;
            this.s0 = i34 + 6;
        }
        L0();
        at0 at0Var = this.a;
        if (at0Var != null) {
            if (!z10) {
                at0Var.f();
                return;
            }
            int childCount = this.c.getChildCount();
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt = this.c.getChildAt(i35);
                if (childAt instanceof org.telegram.ui.Cells.h6) {
                    org.telegram.ui.Components.tj0 tj0Var = this.c;
                    View F = tj0Var.F(childAt);
                    u4.d1 T = F == null ? null : tj0Var.T(F);
                    if (T != null) {
                        int b10 = T.b();
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                        int i36 = this.everybodyRow;
                        if (b10 == i36 || b10 == this.Q || b10 == this.nobodyRow || b10 == this.i0) {
                            h6Var.a(this.K == (b10 == i36 ? 0 : b10 == this.Q ? 2 : b10 == this.nobodyRow ? 1 : 3), true);
                        } else {
                            h6Var.a(this.L == (b10 == this.Z ? 1 : 0), true);
                        }
                    }
                }
            }
            xs0Var.f(xs0Var.d);
            u4.o.c(xs0Var, true).c(this.a);
            org.telegram.messenger.g0.b4(this.c);
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.us0
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.z0 = photoSize3;
                privacyControlActivity.A0 = null;
                privacyControlActivity.O0();
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
                        int i3 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i3 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l(privacyControlActivity, 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    org.telegram.ui.Components.fc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.bd.M0(2131747273, null), null, null).j();
                }
                privacyControlActivity.Q0(false);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        return G0(true);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i3 = this.E;
        if (i3 == 5) {
            this.d = new bt0(this, context);
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (i3 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746798, null));
        } else if (i3 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746845, null));
        } else if (i3 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746785, null));
        } else if (i3 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746875, null));
        } else if (i3 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746812, null));
        } else if (i3 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746808, null));
        } else if (i3 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752596, null));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746825, null));
        } else if (i3 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746766, null));
        } else if (i3 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746823, null));
        } else if (i3 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746818, null));
        } else if (i3 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746868, null));
        } else if (i3 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746837, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 0));
        this.simpleActionBar.o();
        org.telegram.ui.ActionBar.b5 n4 = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        this.b = n4;
        n4.a(J0(), false);
        this.a = new at0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.c = tj0Var;
        tj0Var.r1();
        this.c.setLayoutManager(new u4.b0(1, false));
        this.c.setSectionsDrawBackground(true);
        this.c.setVerticalScrollBarEnabled(false);
        ((u4.k) this.c.getItemAnimator()).C = false;
        frameLayout.addView(this.c, b8.mf.c(-1.0f, -1));
        int i10 = 26;
        if (this.d != null) {
            gi.l3 l3Var = new gi.l3(context, 1);
            l3Var.r(true);
            l3Var.h = org.telegram.messenger.g0.L(250.0f);
            l3Var.d = -1L;
            l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
            l3Var.U = false;
            this.e = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
            this.e.l(getBaseSimpleGlass().c);
            frameLayout.addView(this.e, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
            this.c.j(new h3(this, i10));
        }
        this.c.setAdapter(this.a);
        this.c.setOnItemClickListener(new h(this, i10));
        ws0 ws0Var = new ws0(this);
        ws0Var.n(350L);
        ws0Var.o(org.telegram.ui.Components.xq.h);
        ws0Var.C = false;
        this.c.setItemAnimator(ws0Var);
        L0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        bt0 bt0Var;
        if (i3 == org.telegram.messenger.hs.k0) {
            H0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.i4) {
            this.c.g1();
        } else {
            if (i3 != org.telegram.messenger.hs.z4 || (bt0Var = this.d) == null) {
                return;
            }
            bt0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bc));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        return G0(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        H0();
        Q0(false);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.k0);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.z4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.k0);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.z4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.f30 f30Var = this.u0;
        if (f30Var != null) {
            f30Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        Q0(false);
        org.telegram.ui.Components.f30 f30Var = this.u0;
        if (f30Var != null) {
            f30Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            bt0 bt0Var = this.d;
            if (bt0Var != null) {
                bt0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public PrivacyControlActivity(int i3) {
        this(i3, false);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
    }
}
