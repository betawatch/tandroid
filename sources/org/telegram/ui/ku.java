package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ku extends org.telegram.ui.Components.wk0 {
    public static final /* synthetic */ int l3 = 0;
    public boolean T2;
    public int U2;
    public final f2.m0 V2;
    public final iu W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final float[] Z2;
    public final int[] a3;
    public final ArrayList b3;
    public ju[] c3;
    public ju[] d3;
    public final boolean[] e3;
    public long f3;
    public long g3;
    public long h3;
    public boolean i3;
    public hu j3;
    public final /* synthetic */ ou k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(ou ouVar, Activity activity) {
        super(activity, null);
        this.k3 = ouVar;
        this.T2 = false;
        this.U2 = 0;
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new float[7];
        this.a3 = new int[7];
        this.b3 = new ArrayList();
        this.e3 = new boolean[7];
        f2.m0 m0Var = new f2.m0();
        this.V2 = m0Var;
        setLayoutManager(m0Var);
        iu iuVar = new iu(this, 0);
        this.W2 = iuVar;
        setAdapter(iuVar);
        p1();
        setOnItemClickListener(new i(this, 7));
        f2.n nVar = new f2.n();
        nVar.n(220L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.m = false;
        setItemAnimator(nVar);
    }

    public final void A1(boolean z10) {
        int i9;
        int i10;
        String string;
        SpannableString spannableString;
        SpannableString spannableString2;
        String format;
        ArrayList arrayList = this.X2;
        arrayList.clear();
        ArrayList arrayList2 = this.Y2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = 0;
        arrayList2.add(new fu(0, false));
        int i12 = 1;
        long j10 = 0;
        String formatString = this.f3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(x1()));
        arrayList2.add(new fu(1, formatString));
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        while (true) {
            ju[] juVarArr = this.c3;
            if (i13 >= juVarArr.length) {
                break;
            }
            ju juVar = juVarArr[i13];
            long j11 = j10;
            long j12 = juVar.c;
            int i14 = juVar.d;
            boolean z11 = this.i3 || this.b3.contains(Integer.valueOf(i14));
            if (j12 > j11 || z11) {
                int i15 = this.a3[i14];
                if (i15 <= 0) {
                    Object[] objArr = new Object[i12];
                    objArr[i11] = Integer.valueOf(i12);
                    format = String.format("<%d%%", objArr);
                } else {
                    Integer valueOf = Integer.valueOf(i15);
                    Object[] objArr2 = new Object[i12];
                    objArr2[i11] = valueOf;
                    format = String.format("%d%%", objArr2);
                }
                SpannableString spannableString3 = new SpannableString(format);
                spannableString3.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), i11, spannableString3.length(), 33);
                spannableString3.setSpan(new RelativeSizeSpan(0.8f), i11, spannableString3.length(), 33);
                eu euVar = new eu();
                euVar.a = 0.1d;
                spannableString3.setSpan(euVar, 0, spannableString3.length(), 33);
                int i16 = ou.f[i14];
                int[] iArr = ou.d[i14];
                arrayList3.add(new fu(i13, i16, iArr[0], iArr[1], j12 == j11 ? LocaleController.getString(ou.h[i14]) : TextUtils.concat(LocaleController.getString(ou.h[i14]), "  ", spannableString3), AndroidUtilities.formatFileSize(j12)));
            }
            i13++;
            j10 = j11;
            i12 = 1;
            i11 = 0;
        }
        long j13 = j10;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString4 = new SpannableString("^");
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_upload).mutate();
            int i17 = org.telegram.ui.ActionBar.f6.G6;
            org.telegram.ui.ActionBar.b6 b6Var = this.l2;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i17, b6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString4.setSpan(new ImageSpan(mutate, 2), 0, 1, 33);
            SpannableString spannableString5 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i17, b6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString5.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i18 = 0;
            while (i18 < arrayList3.size()) {
                int i19 = ((fu) arrayList3.get(i18)).h;
                if (i19 < 0 || this.e3[i19]) {
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                } else {
                    ju juVar2 = this.c3[i19];
                    int[] iArr2 = ou.n;
                    int i20 = juVar2.d;
                    int i21 = juVar2.g;
                    int i22 = juVar2.h;
                    long j14 = juVar2.e;
                    spannableString = spannableString4;
                    spannableString2 = spannableString5;
                    long j15 = juVar2.f;
                    int i23 = iArr2[i20];
                    if (i23 == 0) {
                        if (j15 > j13 || i22 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i22), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i21 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i21), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else if (i23 != 1) {
                        if (j15 > j13 || i22 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(TextUtils.concat(spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesSentCount", i22))), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i21 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(TextUtils.concat(spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i21))), AndroidUtilities.formatFileSize(j14)));
                        }
                    } else {
                        if (j15 > j13 || i22 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(TextUtils.concat(spannableString, " ", LocaleController.getString(R.string.BytesSent)), AndroidUtilities.formatFileSize(j15)));
                        }
                        if (j14 > j13 || i21 > 0) {
                            i18++;
                            arrayList3.add(i18, fu.b(TextUtils.concat(spannableString2, " ", LocaleController.getString(R.string.BytesReceived)), AndroidUtilities.formatFileSize(j14)));
                            i18++;
                            spannableString4 = spannableString;
                            spannableString5 = spannableString2;
                        }
                    }
                }
                i18++;
                spannableString4 = spannableString;
                spannableString5 = spannableString2;
            }
            arrayList2.addAll(arrayList3);
            if (!this.i3) {
                arrayList2.add(new fu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.i3) {
            arrayList2.add(new fu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.h3)));
            arrayList2.add(new fu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.g3)));
        }
        if (arrayList3.isEmpty()) {
            i9 = 3;
        } else {
            i9 = 3;
            arrayList2.add(new fu(3, formatString));
        }
        if (this.U2 != 0) {
            if (arrayList3.isEmpty()) {
                arrayList2.add(new fu(i9, false));
            }
            arrayList2.add(new fu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i24 = this.U2;
            if (i24 != 1) {
                i10 = 3;
                string = i24 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i10 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList2.add(new fu(i10, string));
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new fu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList2.add(new fu(3, false));
        iu iuVar = this.W2;
        if (iuVar != null) {
            if (z10) {
                iuVar.E(arrayList, arrayList2);
            } else {
                iuVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public final long w1(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.U2;
        ou ouVar = this.k3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i10).getReceivedBytesCount(this.U2 - 1, i9);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i11).getReceivedBytesCount(0, i9);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i12).getReceivedBytesCount(1, i9) + receivedBytesCount;
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i13).getReceivedBytesCount(2, i9) + receivedBytesCount2;
    }

    public final long x1() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.U2;
        ou ouVar = this.k3;
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            i9 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i9).getResetStatsDate(this.U2 - 1);
        }
        i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i10).getResetStatsDate(0);
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i11).getResetStatsDate(1);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long[] jArr = {resetStatsDate, resetStatsDate2, StatsController.getInstance(i12).getResetStatsDate(2)};
        long j10 = Long.MAX_VALUE;
        for (int i14 = 0; i14 < 3; i14++) {
            long j11 = jArr[i14];
            if (j10 > j11) {
                j10 = j11;
            }
        }
        return j10;
    }

    public final long y1(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.U2;
        ou ouVar = this.k3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
            return StatsController.getInstance(i10).getSentBytesCount(this.U2 - 1, i9);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i11).getSentBytesCount(0, i9);
        i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i12).getSentBytesCount(1, i9) + sentBytesCount;
        i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
        return StatsController.getInstance(i13).getSentBytesCount(2, i9) + sentBytesCount2;
    }

    public final void z1() {
        int i9;
        int i10;
        int recivedItemsCount;
        int i11;
        boolean z10;
        int sentItemsCount;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f3 = w1(6) + y1(6);
        this.g3 = w1(6);
        this.h3 = y1(6);
        if (this.c3 == null) {
            this.c3 = new ju[7];
        }
        if (this.d3 == null) {
            this.d3 = new ju[7];
        }
        int i18 = 0;
        while (true) {
            int[] iArr = ou.n;
            int length = iArr.length;
            float[] fArr = this.Z2;
            if (i18 >= length) {
                Arrays.sort(this.c3, new org.telegram.ui.Components.jn0(6));
                AndroidUtilities.roundPercents(fArr, this.a3);
                Arrays.fill(this.e3, true);
                return;
            }
            int i19 = iArr[i18];
            long w12 = w1(i19) + y1(i19);
            ju[] juVarArr = this.d3;
            ju[] juVarArr2 = this.c3;
            long w13 = w1(iArr[i18]);
            long y12 = y1(iArr[i18]);
            int i20 = iArr[i18];
            int i21 = this.U2;
            ou ouVar = this.k3;
            if (i21 == 1 || i21 == 2 || i21 == 3) {
                i9 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                i10 = 1;
                recivedItemsCount = StatsController.getInstance(i9).getRecivedItemsCount(this.U2 - 1, i20);
            } else {
                i15 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i15).getRecivedItemsCount(0, i20);
                i16 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i16).getRecivedItemsCount(1, i20) + recivedItemsCount2;
                i17 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i17).getRecivedItemsCount(2, i20) + recivedItemsCount3;
                i10 = 1;
            }
            int i22 = iArr[i18];
            int i23 = this.U2;
            if (i23 == i10 || i23 == 2 || i23 == 3) {
                i11 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i11).getSentItemsCount(this.U2 - 1, i22);
            } else {
                i12 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i12).getSentItemsCount(0, i22);
                i13 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i13).getSentItemsCount(1, i22) + sentItemsCount2;
                i14 = ((org.telegram.ui.ActionBar.o2) ouVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i14).getSentItemsCount(2, i22) + sentItemsCount3;
                z10 = true;
            }
            ju juVar = new ju();
            juVar.d = i18;
            juVar.c = w12;
            juVar.b = z10;
            juVar.e = w13;
            juVar.g = recivedItemsCount;
            juVar.f = y12;
            juVar.h = sentItemsCount;
            juVarArr2[i18] = juVar;
            juVarArr[i18] = juVar;
            fArr[i18] = w12 / this.f3;
            i18++;
        }
    }
}
