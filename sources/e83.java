// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e83 extends o39 {
    public static final /* synthetic */ int x3 = 0;
    public boolean f3;
    public int g3;
    public final t26 h3;
    public final c83 i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final float[] l3;
    public final int[] m3;
    public final ArrayList n3;
    public d83[] o3;
    public d83[] p3;
    public final boolean[] q3;
    public long r3;
    public long s3;
    public long t3;
    public boolean u3;
    public b83 v3;
    public final /* synthetic */ h83 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e83(h83 h83Var, Activity activity) {
        super(activity, null);
        qw4 qw4Var;
        this.w3 = h83Var;
        this.f3 = false;
        this.g3 = 0;
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new float[7];
        this.m3 = new int[7];
        this.n3 = new ArrayList();
        this.q3 = new boolean[7];
        qw4Var = ((d) h83Var).glassEngine;
        qw4Var.b(this);
        setClipToPadding(false);
        setCaptureSectionsDecoratorAllowed(true);
        t26 t26Var = new t26();
        this.h3 = t26Var;
        setLayoutManager(t26Var);
        c83 c83Var = new c83(this, (byte) 0);
        this.i3 = c83Var;
        setAdapter(c83Var);
        r1();
        setOnItemClickListener(new u(this, (byte) 19));
        gb3 gb3Var = new gb3();
        gb3Var.n(220L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        setItemAnimator(gb3Var);
        dg0.e(this, h83Var.h, h83Var.n, gl.L(42.0f) + a.getCurrentActionBarHeight(), 0);
    }

    public final long A1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.g3;
        h83 h83Var = this.w3;
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i = ((d) h83Var).currentAccount;
            return yxa.c(i).h[this.g3 - 1];
        }
        i2 = ((d) h83Var).currentAccount;
        long j = yxa.c(i2).h[0];
        i3 = ((d) h83Var).currentAccount;
        long j2 = yxa.c(i3).h[1];
        i4 = ((d) h83Var).currentAccount;
        long[] jArr = {j, j2, yxa.c(i4).h[2]};
        long j3 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < 3; i6++) {
            long j4 = jArr[i6];
            if (j3 > j4) {
                j3 = j4;
            }
        }
        return j3;
    }

    public final long B1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        h83 h83Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) h83Var).currentAccount;
            return yxa.c(i2).e(this.g3 - 1, i);
        }
        i3 = ((d) h83Var).currentAccount;
        long e = yxa.c(i3).e(0, i);
        i4 = ((d) h83Var).currentAccount;
        long e2 = yxa.c(i4).e(1, i) + e;
        i5 = ((d) h83Var).currentAccount;
        return yxa.c(i5).e(2, i) + e2;
    }

    public final void C1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this.r3 = z1(6) + B1(6);
        this.s3 = z1(6);
        this.t3 = B1(6);
        if (this.o3 == null) {
            this.o3 = new d83[7];
        }
        if (this.p3 == null) {
            this.p3 = new d83[7];
        }
        int i14 = 0;
        while (true) {
            int[] iArr = h83.y;
            int length = iArr.length;
            float[] fArr = this.l3;
            if (i14 >= length) {
                Arrays.sort(this.o3, new mz2((byte) 3));
                gl.b3(fArr, this.m3);
                Arrays.fill(this.q3, true);
                return;
            }
            int i15 = iArr[i14];
            long z1 = z1(i15) + B1(i15);
            d83[] d83VarArr = this.p3;
            d83[] d83VarArr2 = this.o3;
            long z12 = z1(iArr[i14]);
            long B1 = B1(iArr[i14]);
            int i16 = iArr[i14];
            int i17 = this.g3;
            h83 h83Var = this.w3;
            if (i17 == 1 || i17 == 2) {
                i = 2;
            } else {
                i = 2;
                if (i17 != 3) {
                    i11 = ((d) h83Var).currentAccount;
                    int i18 = yxa.c(i11).f[0][i16];
                    i12 = ((d) h83Var).currentAccount;
                    int i19 = yxa.c(i12).f[1][i16] + i18;
                    i13 = ((d) h83Var).currentAccount;
                    i3 = yxa.c(i13).f[2][i16] + i19;
                    i4 = iArr[i14];
                    i5 = this.g3;
                    if (i5 != 1 || i5 == i || i5 == 3) {
                        i6 = ((d) h83Var).currentAccount;
                        i7 = yxa.c(i6).e[this.g3 - 1][i4];
                    } else {
                        i8 = ((d) h83Var).currentAccount;
                        int i20 = yxa.c(i8).e[0][i4];
                        i9 = ((d) h83Var).currentAccount;
                        int i21 = yxa.c(i9).e[1][i4] + i20;
                        i10 = ((d) h83Var).currentAccount;
                        i7 = yxa.c(i10).e[2][i4] + i21;
                    }
                    d83 d83Var = new d83();
                    d83Var.d = i14;
                    d83Var.c = z1;
                    d83Var.b = true;
                    d83Var.e = z12;
                    d83Var.g = i3;
                    d83Var.f = B1;
                    d83Var.h = i7;
                    d83VarArr2[i14] = d83Var;
                    d83VarArr[i14] = d83Var;
                    fArr[i14] = z1 / this.r3;
                    i14++;
                }
            }
            i2 = ((d) h83Var).currentAccount;
            i3 = yxa.c(i2).f[this.g3 - 1][i16];
            i4 = iArr[i14];
            i5 = this.g3;
            if (i5 != 1) {
            }
            i6 = ((d) h83Var).currentAccount;
            i7 = yxa.c(i6).e[this.g3 - 1][i4];
            d83 d83Var2 = new d83();
            d83Var2.d = i14;
            d83Var2.c = z1;
            d83Var2.b = true;
            d83Var2.e = z12;
            d83Var2.g = i3;
            d83Var2.f = B1;
            d83Var2.h = i7;
            d83VarArr2[i14] = d83Var2;
            d83VarArr[i14] = d83Var2;
            fArr[i14] = z1 / this.r3;
            i14++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(boolean z) {
        int i;
        String str;
        int i2;
        String M0;
        SpannableString spannableString;
        int i3;
        SpannableString spannableString2;
        char c;
        boolean z2;
        CharSequence concat;
        ArrayList arrayList = this.j3;
        arrayList.clear();
        ArrayList arrayList2 = this.k3;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new z73(0, false));
        long j = 0;
        int i4 = 1;
        String a0 = this.r3 > 0 ? k96.a0(null, null, 2131742545, k96.D0().y0().format(A1())) : k96.a0(null, null, 2131747997, k96.D0().y0().format(A1()));
        arrayList2.add(new z73(1, a0));
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (true) {
            d83[] d83VarArr = this.o3;
            if (i5 >= d83VarArr.length) {
                break;
            }
            d83 d83Var = d83VarArr[i5];
            long j2 = j;
            long j3 = d83Var.c;
            int i6 = d83Var.d;
            if (this.u3) {
                c = 2;
            } else {
                c = 2;
                if (!this.n3.contains(Integer.valueOf(i6))) {
                    z2 = false;
                    if (j3 <= j2 || z2) {
                        int i7 = this.m3[i6];
                        SpannableString spannableString3 = new SpannableString(i7 > 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i7)));
                        spannableString3.setSpan(new z3c(gl.o()), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString3.length(), 33);
                        spannableString3.setSpan(new y73(), 0, spannableString3.length(), 33);
                        int i8 = h83.w[i6];
                        int[] iArr = h83.r[i6];
                        int i9 = iArr[0];
                        int i10 = iArr[1];
                        if (j3 != j2) {
                            concat = k96.M0(h83.x[i6], null);
                        } else {
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = k96.M0(h83.x[i6], null);
                            charSequenceArr[1] = "  ";
                            charSequenceArr[c] = spannableString3;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        arrayList3.add(new z73(i5, i8, i9, i10, concat, gl.i0(j3, false, false)));
                    }
                    i5++;
                    j = j2;
                }
            }
            z2 = true;
            if (j3 <= j2) {
            }
            int i72 = this.m3[i6];
            SpannableString spannableString32 = new SpannableString(i72 > 0 ? String.format("<%d%%", 1) : String.format("%d%%", Integer.valueOf(i72)));
            spannableString32.setSpan(new z3c(gl.o()), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString32.length(), 33);
            spannableString32.setSpan(new y73(), 0, spannableString32.length(), 33);
            int i82 = h83.w[i6];
            int[] iArr2 = h83.r[i6];
            int i92 = iArr2[0];
            int i102 = iArr2[1];
            if (j3 != j2) {
            }
            arrayList3.add(new z73(i5, i82, i92, i102, concat, gl.i0(j3, false, false)));
            i5++;
            j = j2;
        }
        long j4 = j;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i11 = bkb.F6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            wjb wjbVar = this.o2;
            zkb.x(this, mutate, i11, wjbVar, mode);
            mutate.setBounds(0, gl.L(2.0f), gl.L(16.0f), gl.L(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            zkb.x(this, mutate2, i11, wjbVar, mode);
            mutate2.setBounds(0, gl.L(2.0f), gl.L(16.0f), gl.L(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                int i13 = ((z73) arrayList3.get(i12)).h;
                if (i13 < 0 || this.q3[i13]) {
                    spannableString = spannableString4;
                    i3 = i4;
                    spannableString2 = spannableString5;
                } else {
                    d83 d83Var2 = this.o3[i13];
                    int[] iArr3 = h83.y;
                    int i14 = d83Var2.d;
                    int i15 = d83Var2.g;
                    int i16 = d83Var2.h;
                    spannableString2 = spannableString5;
                    long j5 = d83Var2.f;
                    spannableString = spannableString4;
                    long j6 = d83Var2.e;
                    int i17 = iArr3[i14];
                    if (i17 == 0) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, z73.b(k96.H(',', "OutgoingCallsCount", i16), gl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, z73.b(k96.H(',', "IncomingCallsCount", i15), gl.i0(j6, false, false)));
                        }
                    } else if (i17 != 1) {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, z73.b(TextUtils.concat(spannableString, " ", gl.T2(k96.H(',', "FilesSentCount", i16))), gl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            arrayList3.add(i12, z73.b(TextUtils.concat(spannableString2, " ", gl.T2(k96.H(',', "FilesReceivedCount", i15))), gl.i0(j6, false, false)));
                        }
                    } else {
                        if (j5 > j4 || i16 > 0) {
                            i12++;
                            arrayList3.add(i12, z73.b(TextUtils.concat(spannableString, " ", k96.M0(2131752639, null)), gl.i0(j5, false, false)));
                        }
                        if (j6 > j4 || i15 > 0) {
                            i12++;
                            i3 = 1;
                            arrayList3.add(i12, z73.b(TextUtils.concat(spannableString2, " ", k96.M0(2131752640, null)), gl.i0(j6, false, false)));
                        }
                    }
                    i3 = 1;
                }
                i12 += i3;
                spannableString5 = spannableString2;
                spannableString4 = spannableString;
                i4 = 1;
            }
            arrayList2.addAll(arrayList3);
            if (!this.u3) {
                arrayList2.add(new z73(3, k96.M0(2131751663, null).concat("\n")));
            }
        }
        if (!this.u3) {
            arrayList2.add(new z73(4, k96.M0(2131743732, null)));
            arrayList2.add(new z73(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, k96.M0(2131752639, null), gl.i0(this.t3, false, false)));
            arrayList2.add(new z73(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, k96.M0(2131752640, null), gl.i0(this.s3, false, false)));
        }
        if (arrayList3.isEmpty()) {
            i = 3;
        } else {
            i = 3;
            arrayList2.add(new z73(3, a0));
        }
        if (this.g3 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new z73(i, false));
            }
            arrayList2.add(new z73(-2, R.drawable.msg_download_settings, -11565578, -13276952, k96.M0(2131753768, null), null));
            int i18 = this.g3;
            if (i18 != 1) {
                i2 = 3;
                if (i18 != 3) {
                    str = null;
                    M0 = k96.M0(2131753765, null);
                } else {
                    str = null;
                    M0 = k96.M0(2131753766, null);
                }
            } else {
                str = null;
                i2 = 3;
                M0 = k96.M0(2131753767, null);
            }
            arrayList2.add(new z73(i2, M0));
        } else {
            str = null;
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new z73(5, k96.M0(2131745898, str)));
        }
        arrayList2.add(new z73(3, false));
        c83 c83Var = this.i3;
        if (c83Var != null) {
            if (z) {
                c83Var.E(arrayList, arrayList2);
            } else {
                c83Var.f();
            }
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    public final long z1(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.g3;
        h83 h83Var = this.w3;
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            i2 = ((d) h83Var).currentAccount;
            return yxa.c(i2).d(this.g3 - 1, i);
        }
        i3 = ((d) h83Var).currentAccount;
        long d = yxa.c(i3).d(0, i);
        i4 = ((d) h83Var).currentAccount;
        long d2 = yxa.c(i4).d(1, i) + d;
        i5 = ((d) h83Var).currentAccount;
        return yxa.c(i5).d(2, i) + d2;
    }
}
