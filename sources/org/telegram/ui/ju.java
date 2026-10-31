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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ju extends org.telegram.ui.Components.tk0 {
    public static final /* synthetic */ int w3 = 0;
    public boolean e3;
    public int f3;
    public final s4.a0 g3;
    public final org.telegram.ui.Components.cj0 h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final float[] k3;
    public final int[] l3;
    public final ArrayList m3;
    public iu[] n3;
    public iu[] o3;
    public final boolean[] p3;
    public long q3;
    public long r3;
    public long s3;
    public boolean t3;
    public hu u3;
    public final /* synthetic */ mu v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(mu muVar, Activity activity) {
        super(activity, null);
        ei.r rVar;
        this.v3 = muVar;
        this.e3 = false;
        this.f3 = 0;
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new float[7];
        this.l3 = new int[7];
        this.m3 = new ArrayList();
        this.p3 = new boolean[7];
        rVar = ((org.telegram.ui.ActionBar.k2) muVar).glassEngine;
        rVar.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        s4.a0 a0Var = new s4.a0();
        this.g3 = a0Var;
        setLayoutManager(a0Var);
        org.telegram.ui.Components.cj0 cj0Var = new org.telegram.ui.Components.cj0(this, 1);
        this.h3 = cj0Var;
        setAdapter(cj0Var);
        r1();
        setOnItemClickListener(new g(this, 8));
        s4.j jVar = new s4.j();
        jVar.n(220L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        setItemAnimator(jVar);
        ei.b.e(this, muVar.h, muVar.n, org.telegram.messenger.i0.L(42.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f3;
        mu muVar = this.v3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
            return org.telegram.messenger.uz.e(i10).h[this.f3 - 1];
        }
        i11 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long j10 = org.telegram.messenger.uz.e(i11).h[0];
        i12 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long j11 = org.telegram.messenger.uz.e(i12).h[1];
        i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long[] jArr = {j10, j11, org.telegram.messenger.uz.e(i13).h[2]};
        long j12 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j13 = jArr[i15];
            if (j12 > j13) {
                j12 = j13;
            }
        }
        return j12;
    }

    public final long B1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f3;
        mu muVar = this.v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
            return org.telegram.messenger.uz.e(i11).g(this.f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long g10 = org.telegram.messenger.uz.e(i12).g(0, i10);
        i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long g11 = org.telegram.messenger.uz.e(i13).g(1, i10) + g10;
        i14 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        return org.telegram.messenger.uz.e(i14).g(2, i10) + g11;
    }

    public final void C1() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        this.q3 = z1(6) + B1(6);
        this.r3 = z1(6);
        this.s3 = B1(6);
        if (this.n3 == null) {
            this.n3 = new iu[7];
        }
        if (this.o3 == null) {
            this.o3 = new iu[7];
        }
        int i21 = 0;
        while (true) {
            int[] iArr = mu.y;
            int length = iArr.length;
            float[] fArr = this.k3;
            if (i21 >= length) {
                Arrays.sort(this.n3, new f6(23));
                org.telegram.messenger.i0.e3(fArr, this.l3);
                Arrays.fill(this.p3, true);
                return;
            }
            int i22 = iArr[i21];
            long z12 = z1(i22) + B1(i22);
            iu[] iuVarArr = this.o3;
            iu[] iuVarArr2 = this.n3;
            long z13 = z1(iArr[i21]);
            long B1 = B1(iArr[i21]);
            int i23 = iArr[i21];
            int i24 = this.f3;
            mu muVar = this.v3;
            if (i24 == 1 || i24 == 2 || i24 == 3) {
                i10 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                i11 = 1;
                i12 = org.telegram.messenger.uz.e(i10).f[this.f3 - 1][i23];
            } else {
                i18 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                int i25 = org.telegram.messenger.uz.e(i18).f[0][i23];
                i19 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                int i26 = org.telegram.messenger.uz.e(i19).f[1][i23] + i25;
                i20 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                i12 = org.telegram.messenger.uz.e(i20).f[2][i23] + i26;
                i11 = 1;
            }
            int i27 = iArr[i21];
            int i28 = this.f3;
            if (i28 != i11) {
                int i29 = i11;
                if (i28 != 2 && i28 != 3) {
                    i15 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                    int i30 = org.telegram.messenger.uz.e(i15).e[0][i27];
                    i16 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                    int i31 = org.telegram.messenger.uz.e(i16).e[i29][i27] + i30;
                    i17 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
                    i14 = org.telegram.messenger.uz.e(i17).e[2][i27] + i31;
                    z10 = true;
                    iu iuVar = new iu();
                    iuVar.d = i21;
                    iuVar.c = z12;
                    iuVar.b = z10;
                    iuVar.e = z13;
                    iuVar.g = i12;
                    iuVar.f = B1;
                    iuVar.h = i14;
                    iuVarArr2[i21] = iuVar;
                    iuVarArr[i21] = iuVar;
                    fArr[i21] = z12 / this.q3;
                    i21++;
                }
            }
            i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
            z10 = true;
            i14 = org.telegram.messenger.uz.e(i13).e[this.f3 - 1][i27];
            iu iuVar2 = new iu();
            iuVar2.d = i21;
            iuVar2.c = z12;
            iuVar2.b = z10;
            iuVar2.e = z13;
            iuVar2.g = i12;
            iuVar2.f = B1;
            iuVar2.h = i14;
            iuVarArr2[i21] = iuVar2;
            iuVarArr[i21] = iuVar2;
            fArr[i21] = z12 / this.q3;
            i21++;
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
        int i10;
        String str;
        int i11;
        String L0;
        SpannableString spannableString;
        int i12;
        int i13;
        char c10;
        int i14;
        int i15;
        String format;
        int i16;
        CharSequence concat;
        ArrayList arrayList = this.i3;
        arrayList.clear();
        ArrayList arrayList2 = this.j3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new fu(0, false));
        long j10 = 0;
        int i17 = 1;
        String a02 = this.q3 > 0 ? org.telegram.messenger.cd.a0(null, null, 2131742833, org.telegram.messenger.cd.D0().y0().format(A1())) : org.telegram.messenger.cd.a0(null, null, 2131748206, org.telegram.messenger.cd.D0().y0().format(A1()));
        arrayList2.add(new fu(1, a02));
        ArrayList arrayList3 = new ArrayList();
        int i18 = 0;
        while (true) {
            iu[] iuVarArr = this.n3;
            if (i18 >= iuVarArr.length) {
                break;
            }
            iu iuVar = iuVarArr[i18];
            long j11 = j10;
            long j12 = iuVar.c;
            int i19 = iuVar.d;
            if (this.t3) {
                c10 = 2;
            } else {
                c10 = 2;
                if (!this.m3.contains(Integer.valueOf(i19))) {
                    i14 = 0;
                    if (j12 <= j11 || i14 != 0) {
                        i15 = this.l3[i19];
                        if (i15 > 0) {
                            Object[] objArr = new Object[i17];
                            objArr[0] = Integer.valueOf(i17);
                            format = String.format("<%d%%", objArr);
                        } else {
                            Integer valueOf = Integer.valueOf(i15);
                            Object[] objArr2 = new Object[i17];
                            objArr2[0] = valueOf;
                            format = String.format("%d%%", objArr2);
                        }
                        SpannableString spannableString2 = new SpannableString(format);
                        spannableString2.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
                        spannableString2.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString2.length(), 33);
                        eu euVar = new eu();
                        i16 = i17;
                        euVar.a = 0.1d;
                        spannableString2.setSpan(euVar, 0, spannableString2.length(), 33);
                        int i20 = mu.w[i19];
                        int[] iArr = mu.r[i19];
                        int i21 = iArr[0];
                        int i22 = iArr[i16];
                        if (j12 != j11) {
                            concat = org.telegram.messenger.cd.L0(mu.x[i19], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = org.telegram.messenger.cd.L0(mu.x[i19], null);
                            charSequenceArr[i16] = "  ";
                            charSequenceArr[c10] = spannableString2;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new fu(i18, i20, i21, i22, concat, org.telegram.messenger.i0.i0(j12, false, false)));
                    } else {
                        i16 = i17;
                    }
                    i18++;
                    j10 = j11;
                    i17 = i16;
                }
            }
            i14 = i17;
            if (j12 <= j11) {
            }
            i15 = this.l3[i19];
            if (i15 > 0) {
            }
            SpannableString spannableString22 = new SpannableString(format);
            spannableString22.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableString22.length(), 33);
            spannableString22.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString22.length(), 33);
            eu euVar2 = new eu();
            i16 = i17;
            euVar2.a = 0.1d;
            spannableString22.setSpan(euVar2, 0, spannableString22.length(), 33);
            int i202 = mu.w[i19];
            int[] iArr2 = mu.r[i19];
            int i212 = iArr2[0];
            int i222 = iArr2[i16];
            if (j12 != j11) {
            }
            arrayList3.add(new fu(i18, i202, i212, i222, concat, org.telegram.messenger.i0.i0(j12, false, false)));
            i18++;
            j10 = j11;
            i17 = i16;
        }
        int i23 = i17;
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString3 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i24 = org.telegram.ui.ActionBar.t6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.p6 p6Var = this.n2;
            org.telegram.ui.ActionBar.a7.y(this, mutate, i24, p6Var, mode);
            mutate.setBounds(0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate, 2), 0, i23, 33);
            SpannableString spannableString4 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate2, i24, p6Var, mode);
            mutate2.setBounds(0, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i25 = 0;
            while (i25 < arrayList3.size()) {
                int i26 = ((fu) arrayList3.get(i25)).h;
                if (i26 < 0 || this.p3[i26]) {
                    spannableString = spannableString3;
                    i12 = i25;
                } else {
                    iu iuVar2 = this.n3[i26];
                    int[] iArr3 = mu.y;
                    int i27 = iuVar2.d;
                    int i28 = iuVar2.g;
                    int i29 = iuVar2.h;
                    int i30 = i25;
                    long j14 = iuVar2.e;
                    spannableString = spannableString3;
                    long j15 = iuVar2.f;
                    int i31 = iArr3[i27];
                    if (i31 == 0) {
                        if (j15 > j13 || i29 > 0) {
                            int i32 = i30 + 1;
                            arrayList3.add(i32, fu.b(org.telegram.messenger.cd.H(',', "OutgoingCallsCount", i29), org.telegram.messenger.i0.i0(j15, false, false)));
                            i30 = i32;
                        }
                        if (j14 > j13 || i28 > 0) {
                            i13 = i30 + 1;
                            arrayList3.add(i13, fu.b(org.telegram.messenger.cd.H(',', "IncomingCallsCount", i28), org.telegram.messenger.i0.i0(j14, false, false)));
                            i12 = i13;
                        }
                        i12 = i30;
                    } else {
                        if (i31 != 1) {
                            if (j15 > j13 || i29 > 0) {
                                int i33 = i30 + 1;
                                arrayList3.add(i33, fu.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "FilesSentCount", i29))), org.telegram.messenger.i0.i0(j15, false, false)));
                                i30 = i33;
                            }
                            if (j14 > j13 || i28 > 0) {
                                i13 = i30 + 1;
                                arrayList3.add(i13, fu.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.i0.W2(org.telegram.messenger.cd.H(',', "FilesReceivedCount", i28))), org.telegram.messenger.i0.i0(j14, false, false)));
                                i12 = i13;
                            }
                        } else {
                            if (j15 > j13 || i29 > 0) {
                                int i34 = i30 + 1;
                                arrayList3.add(i34, fu.b(TextUtils.concat(spannableString, " ", org.telegram.messenger.cd.L0(2131752651, null)), org.telegram.messenger.i0.i0(j15, false, false)));
                                i30 = i34;
                            }
                            if (j14 > j13 || i28 > 0) {
                                int i35 = i30 + 1;
                                arrayList3.add(i35, fu.b(TextUtils.concat(spannableString4, " ", org.telegram.messenger.cd.L0(2131752652, null)), org.telegram.messenger.i0.i0(j14, false, false)));
                                i12 = i35;
                            }
                        }
                        i12 = i30;
                    }
                }
                i25 = i12 + 1;
                spannableString3 = spannableString;
            }
            arrayList2.addAll(arrayList3);
            if (!this.t3) {
                arrayList2.add(new fu(3, org.telegram.messenger.cd.L0(2131751676, null) + "\n"));
            }
        }
        if (!this.t3) {
            arrayList2.add(new fu(4, org.telegram.messenger.cd.L0(2131743996, null)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, org.telegram.messenger.cd.L0(2131752651, null), org.telegram.messenger.i0.i0(this.s3, false, false)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, org.telegram.messenger.cd.L0(2131752652, null), org.telegram.messenger.i0.i0(this.r3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList2.add(new fu(3, a02));
        }
        if (this.f3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new fu(i10, false));
            }
            arrayList2.add(new fu(-2, R.drawable.msg_download_settings, -11565578, -13276952, org.telegram.messenger.cd.L0(2131753771, null), null));
            int i36 = this.f3;
            if (i36 != 1) {
                i11 = 3;
                if (i36 != 3) {
                    str = null;
                    L0 = org.telegram.messenger.cd.L0(2131753768, null);
                } else {
                    str = null;
                    L0 = org.telegram.messenger.cd.L0(2131753769, null);
                }
            } else {
                str = null;
                i11 = 3;
                L0 = org.telegram.messenger.cd.L0(2131753770, null);
            }
            arrayList2.add(new fu(i11, L0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new fu(5, org.telegram.messenger.cd.L0(2131746108, str)));
        }
        arrayList2.add(new fu(3, false));
        org.telegram.ui.Components.cj0 cj0Var = this.h3;
        if (cj0Var != null) {
            if (z10) {
                cj0Var.E(arrayList, arrayList2);
            } else {
                cj0Var.f();
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f3;
        mu muVar = this.v3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
            return org.telegram.messenger.uz.e(i11).f(this.f3 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long f7 = org.telegram.messenger.uz.e(i12).f(0, i10);
        i13 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        long f10 = org.telegram.messenger.uz.e(i13).f(1, i10) + f7;
        i14 = ((org.telegram.ui.ActionBar.k2) muVar).currentAccount;
        return org.telegram.messenger.uz.e(i14).f(2, i10) + f10;
    }
}
