package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.StatsController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ku extends org.telegram.ui.Components.mm0 {
    public static final /* synthetic */ int q3 = 0;
    public boolean Y2;
    public int Z2;
    public final s4.b0 a3;
    public final iu b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public final float[] e3;
    public final int[] f3;
    public final ArrayList g3;
    public ju[] h3;
    public ju[] i3;
    public final boolean[] j3;
    public long k3;
    public long l3;
    public long m3;
    public boolean n3;
    public hu o3;
    public final /* synthetic */ ou p3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(ou ouVar, Activity activity) {
        super(activity, null);
        this.p3 = ouVar;
        this.Y2 = false;
        this.Z2 = 0;
        this.c3 = new ArrayList();
        this.d3 = new ArrayList();
        this.e3 = new float[7];
        this.f3 = new int[7];
        this.g3 = new ArrayList();
        this.j3 = new boolean[7];
        s4.b0 b0Var = new s4.b0();
        this.a3 = b0Var;
        setLayoutManager(b0Var);
        iu iuVar = new iu(this, 0);
        this.b3 = iuVar;
        setAdapter(iuVar);
        t1();
        setOnItemClickListener(new h(this, 8));
        s4.k kVar = new s4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.bs.h);
        kVar.C = false;
        kVar.m = false;
        setItemAnimator(kVar);
    }

    public final long C1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Z2;
        ou ouVar = this.p3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.Z2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long D1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.Z2;
        ou ouVar = this.p3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.Z2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i13).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i15 = 0; i15 < 3; i15++) {
            long j11 = jArr[i15];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long E1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.Z2;
        ou ouVar = this.p3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.Z2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }

    public final void F1() {
        int i10;
        int i11;
        int recivedItemsCount;
        int i12;
        boolean z10;
        int sentItemsCount;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        this.k3 = C1(6) + E1(6);
        this.l3 = C1(6);
        this.m3 = E1(6);
        if (this.h3 == null) {
            this.h3 = new ju[7];
        }
        if (this.i3 == null) {
            this.i3 = new ju[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = ou.n;
            int length = iArr.length;
            float[] fArr = this.e3;
            if (i19 >= length) {
                Arrays.sort(this.h3, new org.telegram.ui.ActionBar.l4(28));
                AndroidUtilities.roundPercents(fArr, this.f3);
                Arrays.fill(this.j3, true);
                return;
            }
            int i20 = iArr[i19];
            long C1 = C1(i20) + E1(i20);
            ju[] juVarArr = this.i3;
            ju[] juVarArr2 = this.h3;
            long C12 = C1(iArr[i19]);
            long E1 = E1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.Z2;
            ou ouVar = this.p3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.Z2 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.Z2;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.Z2 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z10 = true;
            }
            ju juVar = new ju();
            juVar.d = i19;
            juVar.c = C1;
            juVar.b = z10;
            juVar.e = C12;
            juVar.g = recivedItemsCount;
            juVar.f = E1;
            juVar.h = sentItemsCount;
            juVarArr2[i19] = juVar;
            juVarArr[i19] = juVar;
            fArr[i19] = C1 / this.k3;
            i19++;
        }
    }

    public final void G1(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        int i10;
        int i11;
        String string;
        boolean z12;
        ArrayList arrayList2;
        String format;
        int i12;
        CharSequence concat;
        ArrayList arrayList3;
        ArrayList arrayList4 = this.c3;
        arrayList4.clear();
        ArrayList arrayList5 = this.d3;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        boolean z13 = false;
        arrayList5.add(new fu(0, false));
        long j10 = 0;
        int i13 = 1;
        String formatString = this.k3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(D1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(D1()));
        arrayList5.add(new fu(1, formatString));
        ArrayList arrayList6 = new ArrayList();
        int i14 = 0;
        while (true) {
            ju[] juVarArr = this.h3;
            if (i14 >= juVarArr.length) {
                break;
            }
            ju juVar = juVarArr[i14];
            long j11 = j10;
            long j12 = juVar.c;
            int i15 = juVar.d;
            int i16 = (this.n3 || this.g3.contains(Integer.valueOf(i15))) ? i13 : 0;
            if (j12 > j11 || i16 != 0) {
                int i17 = this.f3[i15];
                if (i17 <= 0) {
                    Object[] objArr = new Object[i13];
                    objArr[0] = Integer.valueOf(i13);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i17);
                    Object[] objArr2 = new Object[i13];
                    objArr2[0] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                spannableString.setSpan(new RelativeSizeSpan(0.8f), 0, spannableString.length(), 33);
                eu euVar = new eu();
                i12 = i13;
                ArrayList arrayList7 = arrayList6;
                euVar.a = 0.1d;
                spannableString.setSpan(euVar, 0, spannableString.length(), 33);
                int i18 = ou.f[i15];
                int[] iArr = ou.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[i12];
                if (j12 == j11) {
                    concat = LocaleController.getString(ou.h[i15]);
                } else {
                    CharSequence string2 = LocaleController.getString(ou.h[i15]);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = string2;
                    charSequenceArr[i12] = "  ";
                    charSequenceArr[2] = spannableString;
                    concat = TextUtils.concat(charSequenceArr);
                }
                fu fuVar = new fu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j12));
                arrayList3 = arrayList7;
                arrayList3.add(fuVar);
            } else {
                i12 = i13;
                arrayList3 = arrayList6;
            }
            i14++;
            arrayList6 = arrayList3;
            j10 = j11;
            i13 = i12;
        }
        int i21 = i13;
        ArrayList arrayList8 = arrayList6;
        long j13 = j10;
        if (arrayList8.isEmpty()) {
            z11 = false;
            arrayList = arrayList8;
        } else {
            SpannableString spannableString2 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i22 = org.telegram.ui.ActionBar.k6.G6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.g6 g6Var = this.n2;
            org.telegram.ui.ActionBar.r6.z(this, mutate, i22, g6Var, mode);
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString2.setSpan(new ImageSpan(mutate, 2), 0, i21, 33);
            SpannableString spannableString3 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            org.telegram.ui.ActionBar.r6.z(this, mutate2, i22, g6Var, mode);
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i23 = 0;
            while (i23 < arrayList8.size()) {
                int i24 = ((fu) arrayList8.get(i23)).h;
                if (i24 < 0 || this.j3[i24]) {
                    z12 = z13;
                    arrayList2 = arrayList8;
                } else {
                    ju juVar2 = this.h3[i24];
                    int[] iArr2 = ou.n;
                    int i25 = juVar2.d;
                    int i26 = juVar2.g;
                    int i27 = juVar2.h;
                    long j14 = juVar2.e;
                    z12 = z13;
                    ArrayList arrayList9 = arrayList8;
                    long j15 = juVar2.f;
                    int i28 = iArr2[i25];
                    if (i28 == 0) {
                        if (j15 > j13 || i27 > 0) {
                            i23++;
                            arrayList2 = arrayList9;
                            arrayList2.add(i23, fu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i27), AndroidUtilities.formatFileSize(j15)));
                        } else {
                            arrayList2 = arrayList9;
                        }
                        if (j14 > j13 || i26 > 0) {
                            i23++;
                            arrayList2.add(i23, fu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        arrayList2 = arrayList9;
                        if (i28 != 1) {
                            if (j15 > j13 || i27 > 0) {
                                i23++;
                                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i27));
                                CharSequence[] charSequenceArr2 = new CharSequence[3];
                                charSequenceArr2[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr2[1] = " ";
                                charSequenceArr2[2] = replaceTags;
                                arrayList2.add(i23, fu.b(TextUtils.concat(charSequenceArr2), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i26 > 0) {
                                i23++;
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i26));
                                CharSequence[] charSequenceArr3 = new CharSequence[3];
                                charSequenceArr3[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr3[1] = " ";
                                charSequenceArr3[2] = replaceTags2;
                                arrayList2.add(i23, fu.b(TextUtils.concat(charSequenceArr3), AndroidUtilities.formatFileSize(j14)));
                            }
                        } else {
                            if (j15 > j13 || i27 > 0) {
                                i23++;
                                String string3 = LocaleController.getString(R.string.BytesSent);
                                CharSequence[] charSequenceArr4 = new CharSequence[3];
                                charSequenceArr4[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr4[1] = " ";
                                charSequenceArr4[2] = string3;
                                arrayList2.add(i23, fu.b(TextUtils.concat(charSequenceArr4), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i26 > 0) {
                                i23++;
                                String string4 = LocaleController.getString(R.string.BytesReceived);
                                CharSequence[] charSequenceArr5 = new CharSequence[3];
                                charSequenceArr5[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr5[1] = " ";
                                charSequenceArr5[2] = string4;
                                arrayList2.add(i23, fu.b(TextUtils.concat(charSequenceArr5), AndroidUtilities.formatFileSize(j14)));
                                i23++;
                                arrayList8 = arrayList2;
                                z13 = z12;
                            }
                        }
                    }
                }
                i23++;
                arrayList8 = arrayList2;
                z13 = z12;
            }
            z11 = z13;
            arrayList = arrayList8;
            arrayList5.addAll(arrayList);
            if (!this.n3) {
                arrayList5.add(new fu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.n3) {
            arrayList5.add(new fu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList5.add(new fu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.m3)));
            arrayList5.add(new fu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.l3)));
        }
        if (arrayList.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList5.add(new fu(3, formatString));
        }
        if (this.Z2 != 0) {
            if (arrayList.isEmpty()) {
                arrayList5.add(new fu(i10, z11));
            }
            arrayList5.add(new fu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i29 = this.Z2;
            if (i29 != 1) {
                i11 = 3;
                string = i29 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList5.add(new fu(i11, string));
        }
        if (!arrayList.isEmpty()) {
            arrayList5.add(new fu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList5.add(new fu(3, false));
        iu iuVar = this.b3;
        if (iuVar != null) {
            if (z10) {
                iuVar.E(arrayList4, arrayList5);
            } else {
                iuVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }
}
