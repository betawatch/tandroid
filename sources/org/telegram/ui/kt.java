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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kt extends org.telegram.ui.Components.pj0 {
    public static final /* synthetic */ int w3 = 0;
    public boolean e3;
    public int f3;
    public final v4.b0 g3;
    public final org.telegram.ui.Components.yh0 h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final float[] k3;
    public final int[] l3;
    public final ArrayList m3;
    public jt[] n3;
    public jt[] o3;
    public final boolean[] p3;
    public long q3;
    public long r3;
    public long s3;
    public boolean t3;
    public ht u3;
    public final /* synthetic */ nt v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(nt ntVar, Activity activity) {
        super(activity, null);
        oi.q qVar;
        this.v3 = ntVar;
        this.e3 = false;
        this.f3 = 0;
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new float[7];
        this.l3 = new int[7];
        this.m3 = new ArrayList();
        this.p3 = new boolean[7];
        qVar = ((org.telegram.ui.ActionBar.f2) ntVar).glassEngine;
        qVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        v4.b0 b0Var = new v4.b0();
        this.g3 = b0Var;
        setLayoutManager(b0Var);
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(this, 1);
        this.h3 = yh0Var;
        setAdapter(yh0Var);
        r1();
        setOnItemClickListener(new h(this, 8));
        v4.k kVar = new v4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.m = false;
        setItemAnimator(kVar);
        oi.a.e(this, ntVar.h, ntVar.n, org.telegram.messenger.g0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13 = this.f3;
        nt ntVar = this.v3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i7 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
            return org.telegram.messenger.jz.e(i7).h[this.f3 - 1];
        }
        i10 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long j3 = org.telegram.messenger.jz.e(i10).h[0];
        i11 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long j10 = org.telegram.messenger.jz.e(i11).h[1];
        i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long[] jArr = {j3, j10, org.telegram.messenger.jz.e(i12).h[2]};
        long j11 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j12 = jArr[i14];
            if (j11 > j12) {
                j11 = j12;
            }
        }
        return j11;
    }

    public final long B1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f3;
        nt ntVar = this.v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).g(this.f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long g10 = org.telegram.messenger.jz.e(i11).g(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long g11 = org.telegram.messenger.jz.e(i12).g(1, i7) + g10;
        i13 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        return org.telegram.messenger.jz.e(i13).g(2, i7) + g11;
    }

    public final void C1() {
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.q3 = z1(6) + B1(6);
        this.r3 = z1(6);
        this.s3 = B1(6);
        if (this.n3 == null) {
            this.n3 = new jt[7];
        }
        if (this.o3 == null) {
            this.o3 = new jt[7];
        }
        int i20 = 0;
        while (true) {
            int[] iArr = nt.y;
            int length = iArr.length;
            float[] fArr = this.k3;
            if (i20 >= length) {
                Arrays.sort(this.n3, new pe(24));
                org.telegram.messenger.g0.f3(fArr, this.l3);
                Arrays.fill(this.p3, true);
                return;
            }
            int i21 = iArr[i20];
            long z12 = z1(i21) + B1(i21);
            jt[] jtVarArr = this.o3;
            jt[] jtVarArr2 = this.n3;
            long z13 = z1(iArr[i20]);
            long B1 = B1(iArr[i20]);
            int i22 = iArr[i20];
            int i23 = this.f3;
            nt ntVar = this.v3;
            if (i23 == 1 || i23 == 2 || i23 == 3) {
                i7 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                i10 = 1;
                i11 = org.telegram.messenger.jz.e(i7).f[this.f3 - 1][i22];
            } else {
                i17 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                int i24 = org.telegram.messenger.jz.e(i17).f[0][i22];
                i18 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                int i25 = org.telegram.messenger.jz.e(i18).f[1][i22] + i24;
                i19 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                i11 = org.telegram.messenger.jz.e(i19).f[2][i22] + i25;
                i10 = 1;
            }
            int i26 = iArr[i20];
            int i27 = this.f3;
            if (i27 != i10) {
                int i28 = i10;
                if (i27 != 2 && i27 != 3) {
                    i14 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                    int i29 = org.telegram.messenger.jz.e(i14).e[0][i26];
                    i15 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                    int i30 = org.telegram.messenger.jz.e(i15).e[i28][i26] + i29;
                    i16 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
                    i13 = org.telegram.messenger.jz.e(i16).e[2][i26] + i30;
                    z9 = true;
                    jt jtVar = new jt();
                    jtVar.d = i20;
                    jtVar.c = z12;
                    jtVar.b = z9;
                    jtVar.e = z13;
                    jtVar.g = i11;
                    jtVar.f = B1;
                    jtVar.h = i13;
                    jtVarArr2[i20] = jtVar;
                    jtVarArr[i20] = jtVar;
                    fArr[i20] = z12 / this.q3;
                    i20++;
                }
            }
            i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
            z9 = true;
            i13 = org.telegram.messenger.jz.e(i12).e[this.f3 - 1][i26];
            jt jtVar2 = new jt();
            jtVar2.d = i20;
            jtVar2.c = z12;
            jtVar2.b = z9;
            jtVar2.e = z13;
            jtVar2.g = i11;
            jtVar2.f = B1;
            jtVar2.h = i13;
            jtVarArr2[i20] = jtVar2;
            jtVarArr[i20] = jtVar2;
            fArr[i20] = z12 / this.q3;
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
    public final void D1(boolean z9) {
        int i7;
        String str;
        int i10;
        String M0;
        SpannableString spannableString;
        int i11;
        int i12;
        char c10;
        int i13;
        int i14;
        String format;
        int i15;
        CharSequence concat;
        ArrayList arrayList = this.i3;
        arrayList.clear();
        ArrayList arrayList2 = this.j3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new ft(0, false));
        long j3 = 0;
        int i16 = 1;
        String a02 = this.q3 > 0 ? org.telegram.messenger.id.a0(null, null, 2131742808, org.telegram.messenger.id.E0().z0().format(A1())) : org.telegram.messenger.id.a0(null, null, 2131748189, org.telegram.messenger.id.E0().z0().format(A1()));
        arrayList2.add(new ft(1, a02));
        ArrayList arrayList3 = new ArrayList();
        int i17 = 0;
        while (true) {
            jt[] jtVarArr = this.n3;
            if (i17 >= jtVarArr.length) {
                break;
            }
            jt jtVar = jtVarArr[i17];
            long j10 = j3;
            long j11 = jtVar.c;
            int i18 = jtVar.d;
            if (this.t3) {
                c10 = 2;
            } else {
                c10 = 2;
                if (!this.m3.contains(Integer.valueOf(i18))) {
                    i13 = 0;
                    if (j11 <= j10 || i13 != 0) {
                        i14 = this.l3[i18];
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
                        spannableString2.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableString2.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString2.length(), 33);
                        et etVar = new et();
                        i15 = i16;
                        etVar.a = 0.1d;
                        spannableString2.setSpan(etVar, 0, spannableString2.length(), 33);
                        int i19 = nt.w[i18];
                        int[] iArr = nt.r[i18];
                        int i20 = iArr[0];
                        int i21 = iArr[i15];
                        if (j11 != j10) {
                            concat = org.telegram.messenger.id.M0(nt.x[i18], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = org.telegram.messenger.id.M0(nt.x[i18], null);
                            charSequenceArr[i15] = "  ";
                            charSequenceArr[c10] = spannableString2;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new ft(i17, i19, i20, i21, concat, org.telegram.messenger.g0.i0(j11, false, false)));
                    } else {
                        i15 = i16;
                    }
                    i17++;
                    j3 = j10;
                    i16 = i15;
                }
            }
            i13 = i16;
            if (j11 <= j10) {
            }
            i14 = this.l3[i18];
            if (i14 > 0) {
            }
            SpannableString spannableString22 = new SpannableString(format);
            spannableString22.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), 0, spannableString22.length(), 33);
            spannableString22.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString22.length(), 33);
            et etVar2 = new et();
            i15 = i16;
            etVar2.a = 0.1d;
            spannableString22.setSpan(etVar2, 0, spannableString22.length(), 33);
            int i192 = nt.w[i18];
            int[] iArr2 = nt.r[i18];
            int i202 = iArr2[0];
            int i212 = iArr2[i15];
            if (j11 != j10) {
            }
            arrayList3.add(new ft(i17, i192, i202, i212, concat, org.telegram.messenger.g0.i0(j11, false, false)));
            i17++;
            j3 = j10;
            i16 = i15;
        }
        int i22 = i16;
        long j12 = j3;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString3 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i23 = org.telegram.ui.ActionBar.m6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.h6 h6Var = this.n2;
            org.telegram.ui.ActionBar.t6.x(this, mutate, i23, h6Var, mode);
            mutate.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate, 2), 0, i22, 33);
            SpannableString spannableString4 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            org.telegram.ui.ActionBar.t6.x(this, mutate2, i23, h6Var, mode);
            mutate2.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i24 = 0;
            while (i24 < arrayList3.size()) {
                int i25 = ((ft) arrayList3.get(i24)).h;
                if (i25 < 0 || this.p3[i25]) {
                    spannableString = spannableString3;
                    i11 = i24;
                } else {
                    jt jtVar2 = this.n3[i25];
                    int[] iArr3 = nt.y;
                    int i26 = jtVar2.d;
                    int i27 = jtVar2.g;
                    int i28 = jtVar2.h;
                    int i29 = i24;
                    long j13 = jtVar2.e;
                    spannableString = spannableString3;
                    long j14 = jtVar2.f;
                    int i30 = iArr3[i26];
                    if (i30 == 0) {
                        if (j14 > j12 || i28 > 0) {
                            int i31 = i29 + 1;
                            arrayList3.add(i31, ft.b(org.telegram.messenger.id.H(',', "OutgoingCallsCount", i28), org.telegram.messenger.g0.i0(j14, false, false)));
                            i29 = i31;
                        }
                        if (j13 > j12 || i27 > 0) {
                            i12 = i29 + 1;
                            arrayList3.add(i12, ft.b(org.telegram.messenger.id.H(',', "IncomingCallsCount", i27), org.telegram.messenger.g0.i0(j13, false, false)));
                            i11 = i12;
                        }
                        i11 = i29;
                    } else {
                        if (i30 != 1) {
                            if (j14 > j12 || i28 > 0) {
                                int i32 = i29 + 1;
                                arrayList3.add(i32, ft.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', "FilesSentCount", i28))), org.telegram.messenger.g0.i0(j14, false, false)));
                                i29 = i32;
                            }
                            if (j13 > j12 || i27 > 0) {
                                i12 = i29 + 1;
                                arrayList3.add(i12, ft.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', "FilesReceivedCount", i27))), org.telegram.messenger.g0.i0(j13, false, false)));
                                i11 = i12;
                            }
                        } else {
                            if (j14 > j12 || i28 > 0) {
                                int i33 = i29 + 1;
                                arrayList3.add(i33, ft.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.id.M0(2131752651, null)), org.telegram.messenger.g0.i0(j14, false, false)));
                                i29 = i33;
                            }
                            if (j13 > j12 || i27 > 0) {
                                int i34 = i29 + 1;
                                arrayList3.add(i34, ft.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.id.M0(2131752652, null)), org.telegram.messenger.g0.i0(j13, false, false)));
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
            if (!this.t3) {
                arrayList2.add(new ft(3, org.telegram.messenger.id.M0(2131751675, null) + "\n"));
            }
        }
        if (!this.t3) {
            arrayList2.add(new ft(4, org.telegram.messenger.id.M0(2131743971, null)));
            arrayList2.add(new ft(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, org.telegram.messenger.id.M0(2131752651, null), org.telegram.messenger.g0.i0(this.s3, false, false)));
            arrayList2.add(new ft(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, org.telegram.messenger.id.M0(2131752652, null), org.telegram.messenger.g0.i0(this.r3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i7 = 3;
        } else {
            i7 = 3;
            arrayList2.add(new ft(3, a02));
        }
        if (this.f3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new ft(i7, false));
            }
            arrayList2.add(new ft(-2, R.drawable.msg_download_settings, -11565578, -13276952, org.telegram.messenger.id.M0(2131753771, null), null));
            int i35 = this.f3;
            if (i35 != 1) {
                i10 = 3;
                if (i35 != 3) {
                    str = null;
                    M0 = org.telegram.messenger.id.M0(2131753768, null);
                } else {
                    str = null;
                    M0 = org.telegram.messenger.id.M0(2131753769, null);
                }
            } else {
                str = null;
                i10 = 3;
                M0 = org.telegram.messenger.id.M0(2131753770, null);
            }
            arrayList2.add(new ft(i10, M0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new ft(5, org.telegram.messenger.id.M0(2131746091, str)));
        }
        arrayList2.add(new ft(3, false));
        org.telegram.ui.Components.yh0 yh0Var = this.h3;
        if (yh0Var != null) {
            if (z9) {
                yh0Var.E(arrayList, arrayList2);
            } else {
                yh0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public final long z1(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f3;
        nt ntVar = this.v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
            return org.telegram.messenger.jz.e(i10).f(this.f3 - 1, i7);
        }
        i11 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long f10 = org.telegram.messenger.jz.e(i11).f(0, i7);
        i12 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        long f11 = org.telegram.messenger.jz.e(i12).f(1, i7) + f10;
        i13 = ((org.telegram.ui.ActionBar.f2) ntVar).currentAccount;
        return org.telegram.messenger.jz.e(i13).f(2, i7) + f11;
    }
}
