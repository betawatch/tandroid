package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.Components.tj0 {
    public static final /* synthetic */ int x3 = 0;
    public boolean f3;
    public int g3;
    public final u4.b0 h3;
    public final org.telegram.ui.Components.bi0 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public dt[] o3;
    public dt[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public ct v3;
    public final /* synthetic */ ht w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(ht htVar, Activity activity) {
        super(activity, null);
        pi.q qVar;
        this.w3 = htVar;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.d2) htVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        u4.b0 b0Var = new u4.b0();
        this.h3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(this, 1);
        this.i3 = bi0Var;
        setAdapter(bi0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        u4.k kVar = new u4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        setItemAnimator(kVar);
        pi.a.e(this, htVar.h, htVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.g3;
        ht htVar = this.w3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i3 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i3).h[this.g3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long j10 = org.telegram.messenger.bz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long j11 = org.telegram.messenger.bz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long[] jArr = {j10, j11, org.telegram.messenger.bz.e(i12).h[2]};
        long j12 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j13 = jArr[i14];
            if (j12 > j13) {
                j12 = j13;
            }
        }
        return j12;
    }

    public final long B1(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.g3;
        ht htVar = this.w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i10).g(this.g3 - 1, i3);
        }
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long g7 = org.telegram.messenger.bz.e(i11).g(0, i3);
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long g10 = org.telegram.messenger.bz.e(i12).g(1, i3) + g7;
        i13 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        return org.telegram.messenger.bz.e(i13).g(2, i3) + g10;
    }

    public final void C1() {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.r3 = z1(6) + B1(6);
        this.s3 = z1(6);
        this.t3 = B1(6);
        if (this.o3 == null) {
            this.o3 = new dt[7];
        }
        if (this.p3 == null) {
            this.p3 = new dt[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = ht.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i20 >= length) {
                Arrays.sort(this.o3, new org.telegram.ui.Components.d80(11));
                org.telegram.messenger.g0.f3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
            int i21 = iArr[i20];
            long z12 = z1(i21) + B1(i21);
            dt[] dtVarArr = this.p3;
            dt[] dtVarArr2 = this.o3;
            long z13 = z1(iArr[i20]);
            long B1 = B1(iArr[i20]);
            int i22 = iArr[i20];
            int i23 = this.g3;
            ht htVar = this.w3;
            if (i23 == 1 || i23 == 2 || i23 == 3) {
                i3 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                i10 = 1;
                i11 = org.telegram.messenger.bz.e(i3).f[this.g3 - 1][i22];
            } else {
                i17 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                int i24 = org.telegram.messenger.bz.e(i17).f[0][i22];
                i18 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                int i25 = org.telegram.messenger.bz.e(i18).f[1][i22] + i24;
                i19 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                i11 = org.telegram.messenger.bz.e(i19).f[2][i22] + i25;
                i10 = 1;
            }
            int i26 = iArr[i20];
            int i27 = this.g3;
            if (i27 != i10) {
                int i28 = i10;
                if (i27 != 2 && i27 != 3) {
                    i14 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    int i29 = org.telegram.messenger.bz.e(i14).e[0][i26];
                    i15 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    int i30 = org.telegram.messenger.bz.e(i15).e[i28][i26] + i29;
                    i16 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
                    i13 = org.telegram.messenger.bz.e(i16).e[2][i26] + i30;
                    z10 = true;
                    dt dtVar = new dt();
                    dtVar.d = i20;
                    dtVar.c = z12;
                    dtVar.b = z10;
                    dtVar.e = z13;
                    dtVar.g = i11;
                    dtVar.f = B1;
                    dtVar.h = i13;
                    dtVarArr2[i20] = dtVar;
                    dtVarArr[i20] = dtVar;
                    fArr[i20] = z12 / this.r3;
                    i20++;
                }
            }
            i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            z10 = true;
            i13 = org.telegram.messenger.bz.e(i12).e[this.g3 - 1][i26];
            dt dtVar2 = new dt();
            dtVar2.d = i20;
            dtVar2.c = z12;
            dtVar2.b = z10;
            dtVar2.e = z13;
            dtVar2.g = i11;
            dtVar2.f = B1;
            dtVar2.h = i13;
            dtVarArr2[i20] = dtVar2;
            dtVarArr[i20] = dtVar2;
            fArr[i20] = z12 / this.r3;
            i20++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(boolean z10) {
        int i3;
        String str;
        int i10;
        String M0;
        SpannableString spannableString;
        int i11;
        int i12;
        char c2;
        int i13;
        int i14;
        String format;
        int i15;
        CharSequence concat;
        ArrayList arrayList = this.j3;
        arrayList.clear();
        ArrayList arrayList2 = this.k3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new at(0, false));
        long j10 = 0;
        int i16 = 1;
        String a02 = this.r3 > 0 ? org.telegram.messenger.bd.a0(null, null, 2131742818, org.telegram.messenger.bd.E0().z0().format(A1())) : org.telegram.messenger.bd.a0(null, null, 2131748197, org.telegram.messenger.bd.E0().z0().format(A1()));
        arrayList2.add(new at(1, a02));
        ArrayList arrayList3 = new ArrayList();
        int i17 = 0;
        while (true) {
            dt[] dtVarArr = this.o3;
            if (i17 >= dtVarArr.length) {
                break;
            }
            dt dtVar = dtVarArr[i17];
            long j11 = j10;
            long j12 = dtVar.c;
            int i18 = dtVar.d;
            if (this.u3) {
                c2 = 2;
            } else {
                c2 = 2;
                if (!this.n3.contains(Integer.valueOf(i18))) {
                    i13 = 0;
                    if (j12 <= j11 || i13 != 0) {
                        i14 = this.m3[i18];
                        if (i14 > 0) {
                            Object[] objArr = new Object[i16];
                            objArr[0] = Integer.valueOf(i16);
                            format = String.format("<%d%%", objArr);
                        } else {
                            Integer valueOf = Integer.valueOf(i14);
                            Object[] objArr2 = new Object[i16];
                            objArr2[0] = valueOf;
                            format = String.format("%d%%", objArr2);
                        }
                        SpannableString spannableString2 = new SpannableString(format);
                        spannableString2.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableString2.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString2.length(), 33);
                        zs zsVar = new zs();
                        i15 = i16;
                        zsVar.a = 0.1d;
                        spannableString2.setSpan(zsVar, 0, spannableString2.length(), 33);
                        int i19 = ht.w[i18];
                        int[] iArr = ht.r[i18];
                        int i20 = iArr[0];
                        int i21 = iArr[i15];
                        if (j12 != j11) {
                            concat = org.telegram.messenger.bd.M0(ht.x[i18], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = org.telegram.messenger.bd.M0(ht.x[i18], null);
                            charSequenceArr[i15] = "  ";
                            charSequenceArr[c2] = spannableString2;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new at(i17, i19, i20, i21, concat, org.telegram.messenger.g0.i0(j12, false, false)));
                    } else {
                        i15 = i16;
                    }
                    i17++;
                    j10 = j11;
                    i16 = i15;
                }
            }
            i13 = i16;
            if (j12 <= j11) {
            }
            i14 = this.m3[i18];
            if (i14 > 0) {
            }
            SpannableString spannableString22 = new SpannableString(format);
            spannableString22.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableString22.length(), 33);
            spannableString22.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString22.length(), 33);
            zs zsVar2 = new zs();
            i15 = i16;
            zsVar2.a = 0.1d;
            spannableString22.setSpan(zsVar2, 0, spannableString22.length(), 33);
            int i192 = ht.w[i18];
            int[] iArr2 = ht.r[i18];
            int i202 = iArr2[0];
            int i212 = iArr2[i15];
            if (j12 != j11) {
            }
            arrayList3.add(new at(i17, i192, i202, i212, concat, org.telegram.messenger.g0.i0(j12, false, false)));
            i17++;
            j10 = j11;
            i16 = i15;
        }
        int i22 = i16;
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString3 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i23 = org.telegram.ui.ActionBar.k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.e6 e6Var = this.o2;
            org.telegram.ui.ActionBar.r6.y(this, mutate, i23, e6Var, mode);
            mutate.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate, 2), 0, i22, 33);
            SpannableString spannableString4 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate2, i23, e6Var, mode);
            mutate2.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i24 = 0;
            while (i24 < arrayList3.size()) {
                int i25 = ((at) arrayList3.get(i24)).h;
                if (i25 < 0 || this.q3[i25]) {
                    spannableString = spannableString3;
                    i11 = i24;
                } else {
                    dt dtVar2 = this.o3[i25];
                    int[] iArr3 = ht.y;
                    int i26 = dtVar2.d;
                    int i27 = dtVar2.g;
                    int i28 = dtVar2.h;
                    int i29 = i24;
                    long j14 = dtVar2.e;
                    spannableString = spannableString3;
                    long j15 = dtVar2.f;
                    int i30 = iArr3[i26];
                    if (i30 == 0) {
                        if (j15 > j13 || i28 > 0) {
                            int i31 = i29 + 1;
                            arrayList3.add(i31, at.b(org.telegram.messenger.bd.H(',', "OutgoingCallsCount", i28), org.telegram.messenger.g0.i0(j15, false, false)));
                            i29 = i31;
                        }
                        if (j14 > j13 || i27 > 0) {
                            i12 = i29 + 1;
                            arrayList3.add(i12, at.b(org.telegram.messenger.bd.H(',', "IncomingCallsCount", i27), org.telegram.messenger.g0.i0(j14, false, false)));
                            i11 = i12;
                        }
                        i11 = i29;
                    } else {
                        if (i30 != 1) {
                            if (j15 > j13 || i28 > 0) {
                                int i32 = i29 + 1;
                                arrayList3.add(i32, at.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "FilesSentCount", i28))), org.telegram.messenger.g0.i0(j15, false, false)));
                                i29 = i32;
                            }
                            if (j14 > j13 || i27 > 0) {
                                i12 = i29 + 1;
                                arrayList3.add(i12, at.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.bd.H(',', "FilesReceivedCount", i27))), org.telegram.messenger.g0.i0(j14, false, false)));
                                i11 = i12;
                            }
                        } else {
                            if (j15 > j13 || i28 > 0) {
                                int i33 = i29 + 1;
                                arrayList3.add(i33, at.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.bd.M0(2131752651, null)), org.telegram.messenger.g0.i0(j15, false, false)));
                                i29 = i33;
                            }
                            if (j14 > j13 || i27 > 0) {
                                int i34 = i29 + 1;
                                arrayList3.add(i34, at.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.bd.M0(2131752652, null)), org.telegram.messenger.g0.i0(j14, false, false)));
                                i11 = i34;
                            }
                        }
                        i11 = i29;
                    }
                }
                i24 = i11 + 1;
                spannableString3 = spannableString;
            }
            arrayList2.addAll(arrayList3);
            if (!this.u3) {
                arrayList2.add(new at(3, org.telegram.messenger.bd.M0(2131751676, null) + "\n"));
            }
        }
        if (!this.u3) {
            arrayList2.add(new at(4, org.telegram.messenger.bd.M0(2131743981, null)));
            arrayList2.add(new at(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, org.telegram.messenger.bd.M0(2131752651, null), org.telegram.messenger.g0.i0(this.t3, false, false)));
            arrayList2.add(new at(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, org.telegram.messenger.bd.M0(2131752652, null), org.telegram.messenger.g0.i0(this.s3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i3 = 3;
        } else {
            i3 = 3;
            arrayList2.add(new at(3, a02));
        }
        if (this.g3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new at(i3, false));
            }
            arrayList2.add(new at(-2, R.drawable.msg_download_settings, -11565578, -13276952, org.telegram.messenger.bd.M0(2131753771, null), null));
            int i35 = this.g3;
            if (i35 != 1) {
                i10 = 3;
                if (i35 != 3) {
                    str = null;
                    M0 = org.telegram.messenger.bd.M0(2131753768, null);
                } else {
                    str = null;
                    M0 = org.telegram.messenger.bd.M0(2131753769, null);
                }
            } else {
                str = null;
                i10 = 3;
                M0 = org.telegram.messenger.bd.M0(2131753770, null);
            }
            arrayList2.add(new at(i10, M0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new at(5, org.telegram.messenger.bd.M0(2131746101, str)));
        }
        arrayList2.add(new at(3, false));
        org.telegram.ui.Components.bi0 bi0Var = this.i3;
        if (bi0Var != null) {
            if (z10) {
                bi0Var.E(arrayList, arrayList2);
            } else {
                bi0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public final long z1(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.g3;
        ht htVar = this.w3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
            return org.telegram.messenger.bz.e(i10).f(this.g3 - 1, i3);
        }
        i11 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long f10 = org.telegram.messenger.bz.e(i11).f(0, i3);
        i12 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        long f11 = org.telegram.messenger.bz.e(i12).f(1, i3) + f10;
        i13 = ((org.telegram.ui.ActionBar.d2) htVar).currentAccount;
        return org.telegram.messenger.bz.e(i13).f(2, i3) + f11;
    }
}
