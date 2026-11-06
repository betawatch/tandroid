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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public SpannableString A0;
    public boolean B0;
    public boolean C0;
    public final int D;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public final boolean[] G;
    public boolean G0;
    public ArrayList H;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public long L;
    public boolean L0;
    public long M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public int P0;
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
    public jt0 a;
    public int a0;
    public org.telegram.ui.ActionBar.b5 b;
    public int b0;
    public org.telegram.ui.Components.pj0 c;
    public int c0;
    private int currentPhotoForRestRow;
    public kt0 d;
    public int d0;
    public fi.m3 e;
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
    public final org.telegram.ui.Components.j30 t0;
    public org.telegram.ui.Components.zg0 u0;
    public org.telegram.ui.Cells.m8 v0;
    public final boolean[] w;
    public org.telegram.ui.Components.l9 w0;
    public final boolean[] x;
    public lr x0;
    public final boolean[] y;
    public TLRPC.PhotoSize y0;
    public TLRPC.Photo z0;

    public PrivacyControlActivity(int i7, boolean z9) {
        super(null);
        TLRPC.PhotoSize w10;
        this.f = new int[2];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new boolean[4];
        this.x = new boolean[4];
        this.y = new boolean[4];
        this.E = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.M = 10L;
        this.P0 = 4;
        this.D = i7;
        if (z9) {
            org.telegram.messenger.g5.r(this.currentAccount).D(false);
        }
        if (i7 == 4) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            this.t0 = j30Var;
            j30Var.a = this;
            j30Var.b = this;
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().n);
            if (!org.telegram.messenger.t10.q(b22) || (w10 = org.telegram.messenger.w7.w(b22.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.y0 = w10;
            this.z0 = b22.fallback_photo;
        }
    }

    public static /* synthetic */ void Z(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.y0 = null;
        privacyControlActivity.z0 = null;
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
        org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
        org.telegram.messenger.qs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.qs.c0, new Object[0]);
    }

    public static /* synthetic */ void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.M0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
        org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
        org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
        org.telegram.messenger.g0.h3(new qn0(11, privacyControlActivity, zArr));
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().n);
            b22.flags |= TLObject.FLAG_22;
            b22.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            org.telegram.messenger.qs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.qs.c0, new Object[0]);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w10 != null && privacyControlActivity.y0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.y0, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.y0.location.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(privacyControlActivity.y0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.e(w10.location));
            }
            if (w11 == null || privacyControlActivity.y0 == null) {
                return;
            }
            org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
            File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
            org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
            org.telegram.messenger.w7.J(privacyControlActivity.y0.location, null, true, true).renameTo(J2);
        }
    }

    public static void c0(final PrivacyControlActivity privacyControlActivity, View view, final int i7) {
        boolean z9;
        int i10;
        int i11 = privacyControlActivity.D;
        int i12 = 1;
        if (i7 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(privacyControlActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746288, null), org.telegram.messenger.hd.M0(2131746289, null), org.telegram.messenger.hd.M0(2131746320, null), new xs0(privacyControlActivity, i12), null).a;
            u1Var.show();
            u1Var.i();
            return;
        }
        int i13 = 12;
        int i14 = 0;
        r8 = false;
        boolean z10 = false;
        if (i7 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.j30 j30Var = privacyControlActivity.t0;
            if (j30Var != null) {
                j30Var.n(false, new ai.m0(22), new q5(privacyControlActivity, i13), 0);
                privacyControlActivity.u0.M(0);
                privacyControlActivity.u0.P(43);
                privacyControlActivity.v0.e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
        int i15 = 2;
        if (i11 == 10 && i7 == privacyControlActivity.P && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(privacyControlActivity, i15)).j();
            p2Var.a();
            int i16 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i16;
            org.telegram.messenger.g0.G3(i16, view, null);
            return;
        }
        int i17 = 3;
        if (i11 == 8 && ((i7 == privacyControlActivity.P || i7 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.hc.a0(privacyControlActivity).L(R.raw.star_premium_2, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(privacyControlActivity, i17)).j();
            p2Var.a();
            int i18 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i18;
            org.telegram.messenger.g0.G3(i18, view, null);
            return;
        }
        if (i7 == privacyControlActivity.nobodyRow || i7 == privacyControlActivity.everybodyRow || i7 == privacyControlActivity.P || i7 == privacyControlActivity.h0) {
            if (i11 == 12 && privacyControlActivity.F0()) {
                int i19 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i19;
                org.telegram.messenger.g0.G3(i19, view, null);
                return;
            }
            if (i7 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i7 != privacyControlActivity.everybodyRow) {
                i14 = i7 == privacyControlActivity.h0 ? 3 : 2;
            }
            if (i14 == privacyControlActivity.J) {
                return;
            }
            privacyControlActivity.J = i14;
            org.telegram.ui.Components.cc.e();
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
            return;
        }
        if (i7 == privacyControlActivity.Y || i7 == privacyControlActivity.X) {
            int i20 = i7 != privacyControlActivity.X ? 1 : 0;
            if (i20 == privacyControlActivity.K) {
                return;
            }
            privacyControlActivity.K = i20;
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
            return;
        }
        if (i7 == privacyControlActivity.U || i7 == privacyControlActivity.T) {
            if (i11 == 12 && privacyControlActivity.F0()) {
                int i21 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i21;
                org.telegram.messenger.g0.G3(i21, view, null);
                return;
            }
            ArrayList arrayList = i7 == privacyControlActivity.U ? privacyControlActivity.I : privacyControlActivity.H;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i7 == privacyControlActivity.U ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i11 != 0 ? 1 : 0);
            if (i7 == privacyControlActivity.T && i11 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            final boolean z11 = i11 == 12 && ((i10 = privacyControlActivity.J) != 1 ? !(i10 != 2 ? !(i10 == 0 && i7 == privacyControlActivity.U) : i7 != privacyControlActivity.T) : i7 == privacyControlActivity.T);
            bundle.putBoolean("allowMiniapps", z11);
            w40 w40Var = new w40(bundle);
            if (i11 == 10) {
                w40Var.L = org.telegram.messenger.hd.M0(2131746290, null);
            }
            if (i7 == privacyControlActivity.T) {
                if (privacyControlActivity.E[privacyControlActivity.J == 2 ? (char) 0 : (char) 1]) {
                    z9 = true;
                    if (z11 && privacyControlActivity.F[privacyControlActivity.J]) {
                        z10 = true;
                    }
                    w40Var.u0(arrayList, z9, z10);
                    w40Var.x = new s40() { // from class: org.telegram.ui.dt0
                        @Override // org.telegram.ui.s40
                        public final void a(ArrayList arrayList2, boolean z12, boolean z13) {
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr = privacyControlActivity2.F;
                            int i22 = privacyControlActivity2.U;
                            int i23 = i7;
                            boolean z14 = z11;
                            int i24 = 0;
                            if (i23 == i22) {
                                privacyControlActivity2.I = arrayList2;
                                zArr[privacyControlActivity2.J] = z14 && z13;
                                while (i24 < privacyControlActivity2.I.size()) {
                                    privacyControlActivity2.H.remove(privacyControlActivity2.I.get(i24));
                                    i24++;
                                }
                            } else {
                                boolean[] zArr2 = privacyControlActivity2.E;
                                int i25 = privacyControlActivity2.J;
                                zArr2[i25 == 2 ? (char) 0 : (char) 1] = z12;
                                zArr[i25] = z14 && z13;
                                privacyControlActivity2.H = arrayList2;
                                while (i24 < privacyControlActivity2.H.size()) {
                                    privacyControlActivity2.I.remove(privacyControlActivity2.H.get(i24));
                                    i24++;
                                }
                            }
                            privacyControlActivity2.P0();
                            privacyControlActivity2.a.f();
                        }
                    };
                    w40Var.e0 = true;
                    privacyControlActivity.presentFragment(w40Var);
                    return;
                }
            }
            z9 = false;
            if (z11) {
                z10 = true;
            }
            w40Var.u0(arrayList, z9, z10);
            w40Var.x = new s40() { // from class: org.telegram.ui.dt0
                @Override // org.telegram.ui.s40
                public final void a(ArrayList arrayList2, boolean z12, boolean z13) {
                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                    boolean[] zArr = privacyControlActivity2.F;
                    int i22 = privacyControlActivity2.U;
                    int i23 = i7;
                    boolean z14 = z11;
                    int i24 = 0;
                    if (i23 == i22) {
                        privacyControlActivity2.I = arrayList2;
                        zArr[privacyControlActivity2.J] = z14 && z13;
                        while (i24 < privacyControlActivity2.I.size()) {
                            privacyControlActivity2.H.remove(privacyControlActivity2.I.get(i24));
                            i24++;
                        }
                    } else {
                        boolean[] zArr2 = privacyControlActivity2.E;
                        int i25 = privacyControlActivity2.J;
                        zArr2[i25 == 2 ? (char) 0 : (char) 1] = z12;
                        zArr[i25] = z14 && z13;
                        privacyControlActivity2.H = arrayList2;
                        while (i24 < privacyControlActivity2.H.size()) {
                            privacyControlActivity2.I.remove(privacyControlActivity2.H.get(i24));
                            i24++;
                        }
                    }
                    privacyControlActivity2.P0();
                    privacyControlActivity2.a.f();
                }
            };
            w40Var.e0 = true;
            privacyControlActivity.presentFragment(w40Var);
            return;
        }
        if (i7 == privacyControlActivity.c0) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i7 == privacyControlActivity.readRow) {
            privacyControlActivity.C0 = !privacyControlActivity.C0;
            privacyControlActivity.P0();
            ((org.telegram.ui.Cells.r8) view).setChecked(privacyControlActivity.C0);
            return;
        }
        if (i7 == privacyControlActivity.f0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i7 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.E0 = !privacyControlActivity.E0;
            privacyControlActivity.P0();
            ((org.telegram.ui.Cells.r8) view).setChecked(privacyControlActivity.E0);
            return;
        }
        if (i7 == privacyControlActivity.n0) {
            if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                int i22 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i22;
                org.telegram.messenger.g0.G3(i22, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F0 = privacyControlActivity.F0();
            privacyControlActivity.I0 = !privacyControlActivity.I0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setChecked(privacyControlActivity.I0);
            if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                r8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F0 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i7 == privacyControlActivity.m0) {
            if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                int i23 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i23;
                org.telegram.messenger.g0.G3(i23, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F02 = privacyControlActivity.F0();
            privacyControlActivity.G0 = !privacyControlActivity.G0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
            r8Var2.setChecked(privacyControlActivity.G0);
            if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                r8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F02 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i7 == privacyControlActivity.o0) {
            if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                int i24 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i24;
                org.telegram.messenger.g0.G3(i24, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F03 = privacyControlActivity.F0();
            privacyControlActivity.K0 = !privacyControlActivity.K0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
            r8Var3.setChecked(privacyControlActivity.K0);
            if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                r8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F03 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i7 == privacyControlActivity.p0) {
            if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                int i25 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i25;
                org.telegram.messenger.g0.G3(i25, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F04 = privacyControlActivity.F0();
            privacyControlActivity.M0 = !privacyControlActivity.M0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.r8 r8Var4 = (org.telegram.ui.Cells.r8) view;
            r8Var4.setChecked(privacyControlActivity.M0);
            if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                r8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F04 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
                return;
            }
            return;
        }
        if (i7 == privacyControlActivity.q0) {
            if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().q()) {
                int i26 = -privacyControlActivity.P0;
                privacyControlActivity.P0 = i26;
                org.telegram.messenger.g0.G3(i26, view, null);
                privacyControlActivity.N0();
                return;
            }
            boolean F05 = privacyControlActivity.F0();
            privacyControlActivity.O0 = !privacyControlActivity.O0;
            privacyControlActivity.P0();
            org.telegram.ui.Cells.r8 r8Var5 = (org.telegram.ui.Cells.r8) view;
            r8Var5.setChecked(privacyControlActivity.O0);
            if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().q()) {
                r8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (F05 != privacyControlActivity.F0()) {
                privacyControlActivity.Q0(true);
                org.telegram.messenger.g0.b4(privacyControlActivity.c);
            }
        }
    }

    public static void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.hc.a0(privacyControlActivity).f0(tL_error, false);
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
        org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
        org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
        org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.D, privacyrules.rules);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.I0();
        }
    }

    public static void w0(PrivacyControlActivity privacyControlActivity) {
        kt0 kt0Var;
        int[] iArr = privacyControlActivity.f;
        if (privacyControlActivity.e == null || (kt0Var = privacyControlActivity.d) == null || privacyControlActivity.fragmentView == null) {
            return;
        }
        if (kt0Var.getParent() != privacyControlActivity.c || !privacyControlActivity.d.isAttachedToWindow()) {
            privacyControlActivity.e.f(false);
            return;
        }
        privacyControlActivity.d.getLocationInWindow(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        privacyControlActivity.fragmentView.getLocationInWindow(iArr);
        privacyControlActivity.e.x(privacyControlActivity.d.b.getForwardNameCenterX() + privacyControlActivity.d.b.getLeft() + (i7 - iArr[0]), org.telegram.messenger.g0.L(44.0f) + privacyControlActivity.d.getPaddingTop() + (i10 - iArr[1]), false);
    }

    public final void E0() {
        final AtomicInteger atomicInteger;
        int i7 = this.D;
        if (i7 == 10) {
            boolean[] zArr = {true, false};
            if (this.J == 3) {
                ArrayList arrayList = this.r;
                Collections.sort(arrayList);
                Collections.sort(this.H);
                if (!arrayList.equals(this.H)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.J != 0 && this.H.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i10 = 0; i10 < this.H.size(); i10++) {
                            Long l10 = (Long) this.H.get(i10);
                            long longValue = l10.longValue();
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(l10);
                                if (a22 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.qp.s1(this.currentAccount).q1(a22));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new h50(19, this, zArr));
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
            int i11 = this.J;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.M;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i11 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.g2(this, zArr, globalPrivacySettings, setglobalprivacysettings, 16));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i7 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.J == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.K == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                final int i12 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) { // from class: org.telegram.ui.ys0
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
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.at0
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
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.at0
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
        } else if (i7 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i7 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i7 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i7 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i7 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i7 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i7 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i7 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i7 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i7 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.J != 0 && this.H.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.H.size(); i13++) {
                Long l11 = (Long) this.H.get(i13);
                long longValue2 = l11.longValue();
                if (org.telegram.messenger.m5.E(longValue2)) {
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(this.currentAccount).a2(l11);
                    if (a23 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.qp.s1(this.currentAccount).q1(a23));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.J != 1 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.I.size(); i14++) {
                Long l12 = (Long) this.I.get(i14);
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
        int i15 = this.J;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.J;
        if (i16 != 0) {
            if (this.E[i16 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.J;
        if (this.F[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i18 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) { // from class: org.telegram.ui.ys0
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
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.at0
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
                        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.at0
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
        if (i7 != 0 || this.C0 == this.B0) {
            atomicInteger = atomicInteger2;
        } else {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.C0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i19 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) { // from class: org.telegram.ui.zs0
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
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ct0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i20) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z9 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.B0 = z9;
                                            globalPrivacySettings7.hide_read_marks = z9;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z10 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z10 != setglobalprivacysettings4.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z11 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z11;
                                            globalPrivacySettings8.display_gifts_button = z11;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z12 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z12;
                                                privacyControlActivity3.F0 = !z12;
                                                boolean z13 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z13;
                                                privacyControlActivity3.H0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z14;
                                                privacyControlActivity3.J0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z15;
                                                privacyControlActivity3.L0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z16;
                                                privacyControlActivity3.N0 = !z16;
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
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ct0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z9 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z9;
                                            globalPrivacySettings8.hide_read_marks = z9;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z10 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z10 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z11 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z11;
                                            globalPrivacySettings82.display_gifts_button = z11;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z12 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z12;
                                                privacyControlActivity3.F0 = !z12;
                                                boolean z13 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z13;
                                                privacyControlActivity3.H0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z14;
                                                privacyControlActivity3.J0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z15;
                                                privacyControlActivity3.L0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z16;
                                                privacyControlActivity3.N0 = !z16;
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
        if (i7 == 12 && (this.E0 != this.D0 || this.I0 != this.H0 || this.G0 != this.F0 || this.K0 != this.J0 || this.O0 != this.N0)) {
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
            globalPrivacySettings8.display_gifts_button = this.E0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.G0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.I0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.K0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.O0;
            }
            final int i20 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) { // from class: org.telegram.ui.zs0
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
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ct0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i202) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z9 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z9;
                                            globalPrivacySettings72.hide_read_marks = z9;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z10 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z10 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z11 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z11;
                                            globalPrivacySettings82.display_gifts_button = z11;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z12 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z12;
                                                privacyControlActivity3.F0 = !z12;
                                                boolean z13 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z13;
                                                privacyControlActivity3.H0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z14;
                                                privacyControlActivity3.J0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z15;
                                                privacyControlActivity3.L0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z16;
                                                privacyControlActivity3.N0 = !z16;
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
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ct0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z9 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z9;
                                            globalPrivacySettings82.hide_read_marks = z9;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                break;
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z10 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z10 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z11 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z11;
                                            globalPrivacySettings822.display_gifts_button = z11;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z12 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z12;
                                                privacyControlActivity3.F0 = !z12;
                                                boolean z13 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z13;
                                                privacyControlActivity3.H0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z14;
                                                privacyControlActivity3.J0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z15;
                                                privacyControlActivity3.L0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z16;
                                                privacyControlActivity3.N0 = !z16;
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
        return (this.K0 || this.G0 || this.I0) ? false : true;
    }

    public final boolean G0(boolean z9) {
        if (!this.b.x.f) {
            return true;
        }
        int i7 = 0;
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743727, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131746769, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new bt0(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747579, null), new bt0(this, 2));
            showDialog(u1Var);
        }
        return false;
    }

    public final void H0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i7;
        int i10;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.r;
        int i11 = this.D;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).X;
            int i12 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.J = i12;
            this.h = i12;
            this.I = new ArrayList();
            this.H = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.M = 10L;
                this.L = 10L;
            } else {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().I6, 1L);
                this.M = k10;
                this.L = k10;
                this.J = 3;
                this.h = 3;
            }
            ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(13);
            this.H = new ArrayList();
            if (v != null) {
                for (int i13 = 0; i13 < v.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = com.google.android.recaptcha.internal.a.g(i14, 1, -tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.H);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.H);
            return;
        }
        boolean z9 = i11 == 1;
        boolean[] zArr4 = this.w;
        zArr4[0] = z9;
        boolean[] zArr5 = this.E;
        zArr5[0] = z9;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.x;
        zArr6[0] = false;
        boolean[] zArr7 = this.F;
        zArr7[0] = false;
        boolean z10 = i11 == 12;
        zArr6[1] = z10;
        zArr7[1] = z10;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.y;
        zArr8[0] = false;
        boolean[] zArr9 = this.G;
        zArr9[0] = false;
        boolean z11 = i11 == 12;
        zArr8[1] = z11;
        zArr9[1] = z11;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.H = new ArrayList();
        this.I = new ArrayList();
        ArrayList v10 = org.telegram.messenger.g5.r(this.currentAccount).v(i11);
        if (v10 == null || v10.size() == 0) {
            this.J = 1;
        } else {
            Boolean bool2 = null;
            int i15 = 0;
            boolean z12 = false;
            boolean z13 = false;
            char c10 = 65535;
            while (i15 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = com.google.android.recaptcha.internal.a.g(i16, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.H);
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
                            i17 = com.google.android.recaptcha.internal.a.g(i17, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.I);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z12 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z14 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z14) {
                                    boolean z15 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z15 || z13) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c10 = 2;
                                            z13 = true;
                                        } else if (c10 == 65535) {
                                            if (!z14) {
                                                if (!z15 || z13) {
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
            if (c10 == 0 || (c10 == 65535 && (this.I.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i7 = 2;
                this.J = 0;
            } else {
                i7 = 2;
                if (c10 != 2) {
                    if (c10 != 65535 || this.I.size() <= 0 || this.H.size() <= 0) {
                        if (c10 != 1) {
                            i10 = (c10 == 65535 && (this.H.size() > 0 || (bool2 != null && bool2.booleanValue()))) ? 1 : 1;
                            i7 = 2;
                        }
                        this.J = i10;
                        i7 = 2;
                    } else {
                        i7 = 2;
                    }
                }
                this.J = i7;
            }
            int i18 = this.J;
            char c11 = i18 == i7 ? (char) 0 : (char) 1;
            zArr11[c11] = z12;
            zArr12[c11] = z12;
            boolean z16 = bool2 != null;
            zArr10[i18] = z16;
            zArr7[i18] = z16;
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
        this.h = this.J;
        arrayList2.addAll(this.H);
        arrayList3.addAll(this.I);
        if (i11 == 6) {
            ArrayList v11 = org.telegram.messenger.g5.r(this.currentAccount).v(7);
            if (v11 == null || v11.size() == 0) {
                this.K = 0;
            } else {
                int i19 = 0;
                while (true) {
                    if (i19 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.K = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.K = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.K = 1;
                            break;
                        }
                        i19++;
                    }
                }
            }
            this.n = this.K;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
            boolean z17 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.B0 = z17;
            this.C0 = z17;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().X;
            boolean z18 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.D0 = z18;
            this.E0 = z18;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
                this.O0 = true;
                this.N0 = true;
            } else {
                boolean z19 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.G0 = z19;
                this.F0 = z19;
                boolean z20 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.I0 = z20;
                this.H0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.K0 = z21;
                this.J0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.M0 = z22;
                this.L0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.O0 = z23;
                this.N0 = z23;
            }
        }
        Q0(false);
        org.telegram.messenger.g0.b4(this.c);
    }

    public final void I0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        this.b.b(false);
        int i7 = 1;
        int i10 = this.D;
        if ((i10 == 10 || i10 == 1 || i10 == 2) && this.J != 0 && (globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).X) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
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
                        String M0 = org.telegram.messenger.hd.M0(i12 == 1 ? 2131752147 : 2131752149, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.M0(i12 == 1 ? 2131752148 : 2131752150, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752146, null), new l2.q(this, i12, 16));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new bt0(this, i7));
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
        int i7 = this.D;
        if (i7 == 0 && ((this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty())) && this.B0 != this.C0)) {
            return true;
        }
        if (i7 == 12 && (this.D0 != this.E0 || this.H0 != this.I0 || this.F0 != this.G0 || this.J0 != this.K0 || this.L0 != this.M0 || this.N0 != this.O0)) {
            return true;
        }
        int i10 = this.h;
        int i11 = this.J;
        if (i10 != i11) {
            return true;
        }
        if (i7 == 6 && i11 == 1 && this.n != this.K) {
            return true;
        }
        if (i11 != 0) {
            if (this.w[i11 == 2 ? (char) 0 : (char) 1] != this.E[i11 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i7 == 10 && i11 == 3 && this.M != this.L) || this.x[i11] != this.F[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.s;
        if (arrayList2.size() != this.I.size()) {
            return true;
        }
        ArrayList arrayList3 = this.r;
        if (arrayList3.size() != this.H.size()) {
            return true;
        }
        if (i7 != 10 || this.J == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.H);
            if (!arrayList3.equals(this.H)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.I);
            if (!arrayList2.equals(this.I)) {
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.D;
        if (i7 == 10 && this.J == 3 && !getUserConfig().q()) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 27, true));
            return;
        }
        if (this.J != 0 && i7 == 0 && !getUserConfig().q()) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                if (i7 == 1) {
                    u1Var.T = org.telegram.messenger.hd.M0(2131742882, null);
                } else {
                    u1Var.T = org.telegram.messenger.hd.M0(2131751686, null);
                }
                u1Var.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new lk0(8, this, e12));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(u1Var);
                return;
            }
        }
        E0();
    }

    public final void L0() {
        kt0 kt0Var = this.d;
        if (kt0Var != null) {
            kt0Var.e.k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i7 = this.J;
            if (i7 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131746834, null);
                fi.m3 m3Var = this.e;
                if (m3Var != null) {
                    m3Var.u(M0);
                }
                this.d.e.k.fwd_from.from_id.user_id = 1L;
            } else if (i7 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131746830, null);
                fi.m3 m3Var2 = this.e;
                if (m3Var2 != null) {
                    m3Var2.u(M02);
                }
                this.d.e.k.fwd_from.from_id.user_id = 0L;
            } else {
                String M03 = org.telegram.messenger.hd.M0(2131746835, null);
                fi.m3 m3Var3 = this.e;
                if (m3Var3 != null) {
                    m3Var3.u(M03);
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
        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131746837, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        showDialog(u1Var);
    }

    public final void N0() {
        org.telegram.ui.Components.hc.a0(this).L(R.raw.star_premium_2, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(this, 0)).j();
    }

    public final void O0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.m8 m8Var = this.v0;
        if (m8Var != null) {
            if (this.y0 == null) {
                m8Var.getTextView().k(org.telegram.messenger.hd.a0("SetPhotoForRest", null, 2131745518, new Object[0]));
                this.v0.setNeedDivider(false);
            } else {
                m8Var.getTextView().k(org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743818, new Object[0]));
                this.v0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.w0;
        if (l9Var == null || (photoSize = this.y0) == null) {
            return;
        }
        TLRPC.Photo photo = this.z0;
        if (photo != null) {
            l9Var.j(org.telegram.messenger.hc.i(photoSize, photo), "50_50", null, org.telegram.messenger.p10.i(this.currentAccount).f());
        } else {
            l9Var.j(org.telegram.messenger.hc.e(photoSize.location), "50_50", null, org.telegram.messenger.p10.i(this.currentAccount).f());
        }
    }

    public final void P0() {
        this.b.a(J0(), true);
    }

    public final void Q0(boolean z9) {
        gt0 gt0Var;
        ArrayList arrayList;
        int i7;
        TLRPC.UserFull b22;
        if (z9) {
            gt0Var = new gt0(this);
            gt0Var.f(gt0Var.c);
            gt0Var.b = this.s0;
        } else {
            gt0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.a0 = -1;
        this.N = -1;
        this.setBirthdayRow = -1;
        this.Z = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.T = -1;
        this.U = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.Q = -1;
        this.R = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.S = -1;
        this.V = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.priceRow = -1;
        this.k0 = -1;
        this.j0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.showGiftIconRow = -1;
        this.l0 = -1;
        this.giftTypesHeaderRow = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = 0;
        int i10 = this.D;
        if (i10 == 12) {
            this.showGiftIconRow = 0;
            this.s0 = 2;
            this.l0 = 1;
        }
        if (i10 == 11 && (b22 = getMessagesController().b2(getUserConfig().e())) != null && b22.birthday == null) {
            int i11 = this.s0;
            this.s0 = i11 + 1;
            this.setBirthdayRow = i11;
        }
        if (i10 == 5) {
            int i12 = this.s0;
            this.s0 = i12 + 1;
            this.N = i12;
        }
        int i13 = this.s0;
        this.O = i13;
        this.everybodyRow = i13 + 1;
        int i14 = i13 + 3;
        this.s0 = i14;
        this.P = i13 + 2;
        if (i10 == 4 || i10 == 9 || i10 == 14 || i10 == 0 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 1 || i10 == 11 || i10 == 12) {
            this.s0 = i13 + 4;
            this.nobodyRow = i14;
        }
        if (getMessagesController().L6 && i10 == 10) {
            int i15 = this.s0;
            this.s0 = i15 + 1;
            this.h0 = i15;
        }
        if (i10 == 6 && this.J == 1) {
            int i16 = this.s0;
            this.Z = i16;
            this.W = i16 + 1;
            this.X = i16 + 2;
            this.s0 = i16 + 4;
            this.Y = i16 + 3;
        }
        if (i10 == 10 && this.J == 3) {
            int i17 = this.s0;
            this.s0 = i17 + 1;
            this.R = i17;
        } else {
            int i18 = this.s0;
            this.s0 = i18 + 1;
            this.Q = i18;
        }
        if (i10 == 10) {
            if (this.J == 3) {
                int i19 = this.s0;
                this.i0 = i19;
                this.s0 = i19 + 2;
                this.priceRow = i19 + 1;
                if (!getUserConfig().q()) {
                    int i20 = this.s0;
                    this.s0 = i20 + 1;
                    this.j0 = i20;
                }
                int i21 = this.s0;
                this.s0 = i21 + 1;
                this.k0 = i21;
                if (getUserConfig().q()) {
                    int i22 = this.s0;
                    this.S = i22;
                    this.T = i22 + 1;
                    this.s0 = i22 + 3;
                    this.V = i22 + 2;
                }
            }
        } else if (i10 != 8 || getUserConfig().q()) {
            int i23 = this.s0;
            int i24 = i23 + 1;
            this.s0 = i24;
            this.S = i23;
            int i25 = this.J;
            if (i25 == 1 || i25 == 2) {
                this.s0 = i23 + 2;
                this.T = i24;
            }
            if (i25 == 0 || i25 == 2) {
                int i26 = this.s0;
                this.s0 = i26 + 1;
                this.U = i26;
            }
            int i27 = this.s0;
            int i28 = i27 + 1;
            this.s0 = i28;
            this.V = i27;
            if (i10 == 2) {
                this.b0 = i28;
                this.c0 = i27 + 2;
                this.s0 = i27 + 4;
                this.d0 = i27 + 3;
            }
            if (i10 == 4 && (this.I.size() > 0 || (i7 = this.J) == 2 || i7 == 1)) {
                int i29 = this.s0;
                int i30 = i29 + 1;
                this.s0 = i30;
                this.photoForRestRow = i29;
                if (this.y0 != null) {
                    this.s0 = i29 + 2;
                    this.currentPhotoForRestRow = i30;
                }
                int i31 = this.s0;
                this.s0 = i31 + 1;
                this.a0 = i31;
            }
            if (i10 == 0 && (this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty()))) {
                int i32 = this.s0;
                this.readRow = i32;
                this.s0 = i32 + 2;
                this.e0 = i32 + 1;
            }
            if (i10 == 0 && !getMessagesController().D3()) {
                int i33 = this.s0;
                this.f0 = i33;
                this.s0 = i33 + 2;
                this.g0 = i33 + 1;
            }
        }
        if (i10 == 12) {
            int i34 = this.s0;
            this.giftTypesHeaderRow = i34;
            this.n0 = i34 + 1;
            this.m0 = i34 + 2;
            this.o0 = i34 + 3;
            this.p0 = i34 + 4;
            this.q0 = i34 + 5;
            this.s0 = i34 + 7;
            this.r0 = i34 + 6;
        }
        L0();
        jt0 jt0Var = this.a;
        if (jt0Var != null) {
            if (!z9) {
                jt0Var.f();
                return;
            }
            int childCount = this.c.getChildCount();
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt = this.c.getChildAt(i35);
                if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Components.pj0 pj0Var = this.c;
                    View F = pj0Var.F(childAt);
                    v4.d1 T = F == null ? null : pj0Var.T(F);
                    if (T != null) {
                        int b10 = T.b();
                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                        int i36 = this.everybodyRow;
                        if (b10 == i36 || b10 == this.P || b10 == this.nobodyRow || b10 == this.h0) {
                            i6Var.a(this.J == (b10 == i36 ? 0 : b10 == this.P ? 2 : b10 == this.nobodyRow ? 1 : 3), true);
                        } else {
                            i6Var.a(this.K == (b10 == this.Y ? 1 : 0), true);
                        }
                    }
                }
            }
            gt0Var.f(gt0Var.d);
            v4.o.c(gt0Var, true).c(this.a);
            org.telegram.messenger.g0.b4(this.c);
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.et0
            @Override // java.lang.Runnable
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.y0 = photoSize3;
                privacyControlActivity.z0 = null;
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
                        int i7 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i7 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    org.telegram.ui.Components.hc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.hd.M0(2131747264, null), null, null).j();
                }
                privacyControlActivity.Q0(false);
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        return G0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i7 = this.D;
        if (i7 == 5) {
            this.d = new kt0(this, context);
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (i7 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746789, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746836, null));
        } else if (i7 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746776, null));
        } else if (i7 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746866, null));
        } else if (i7 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746803, null));
        } else if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746799, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746816, null));
        } else if (i7 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746757, null));
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746814, null));
        } else if (i7 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746809, null));
        } else if (i7 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746859, null));
        } else if (i7 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746828, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 29));
        this.simpleActionBar.o();
        org.telegram.ui.ActionBar.b5 n10 = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        this.b = n10;
        n10.a(J0(), false);
        this.a = new jt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.c = pj0Var;
        pj0Var.r1();
        this.c.setLayoutManager(new v4.b0(1, false));
        this.c.setSectionsDrawBackground(true);
        this.c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.c.getItemAnimator()).C = false;
        frameLayout.addView(this.c, c8.ha.c(-1.0f, -1));
        int i10 = 26;
        if (this.d != null) {
            fi.m3 m3Var = new fi.m3(context, 1);
            m3Var.r(true);
            m3Var.h = org.telegram.messenger.g0.L(250.0f);
            m3Var.d = -1L;
            m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
            m3Var.T = false;
            this.e = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
            this.e.l(getBaseSimpleGlass().c);
            frameLayout.addView(this.e, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
            this.c.j(new g3(this, i10));
        }
        this.c.setAdapter(this.a);
        this.c.setOnItemClickListener(new h(this, i10));
        ft0 ft0Var = new ft0(this);
        ft0Var.n(350L);
        ft0Var.o(org.telegram.ui.Components.xq.h);
        ft0Var.C = false;
        this.c.setItemAnimator(ft0Var);
        L0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        kt0 kt0Var;
        if (i7 == org.telegram.messenger.qs.k0) {
            H0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.i4) {
            this.c.g1();
        } else {
            if (i7 != org.telegram.messenger.qs.z4 || (kt0Var = this.d) == null) {
                return;
            }
            kt0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ wq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        return G0(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        H0();
        Q0(false);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.k0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.z4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.k0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.z4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.j30 j30Var = this.t0;
        if (j30Var != null) {
            j30Var.i();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        Q0(false);
        org.telegram.ui.Components.j30 j30Var = this.t0;
        if (j30Var != null) {
            j30Var.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            kt0 kt0Var = this.d;
            if (kt0Var != null) {
                kt0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public PrivacyControlActivity(int i7) {
        this(i7, false);
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void H(float f10) {
    }

    @Override // org.telegram.ui.Components.i30
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.i30
    public final void O(boolean z9, boolean z10) {
    }
}
