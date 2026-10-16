package org.telegram.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class av extends org.telegram.ui.Components.mm0 {
    public static final /* synthetic */ int n3 = 0;
    public boolean V2;
    public int W2;
    public final s4.b0 X2;
    public final yu Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final float[] b3;
    public final int[] c3;
    public final ArrayList d3;
    public zu[] e3;
    public zu[] f3;
    public final boolean[] g3;
    public long h3;
    public long i3;
    public long j3;
    public boolean k3;
    public xu l3;
    public final /* synthetic */ ev m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(ev evVar, Activity activity) {
        super(activity, null);
        this.m3 = evVar;
        this.V2 = false;
        this.W2 = 0;
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new float[7];
        this.c3 = new int[7];
        this.d3 = new ArrayList();
        this.g3 = new boolean[7];
        s4.b0 b0Var = new s4.b0();
        this.X2 = b0Var;
        setLayoutManager(b0Var);
        yu yuVar = new yu(this, 0);
        this.Y2 = yuVar;
        setAdapter(yuVar);
        p1();
        setOnItemClickListener(new i(this, 8));
        s4.k kVar = new s4.k();
        kVar.n(220L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.m = false;
        setItemAnimator(kVar);
    }

    public final void A1() {
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
        this.h3 = x1(6) + z1(6);
        this.i3 = x1(6);
        this.j3 = z1(6);
        if (this.e3 == null) {
            this.e3 = new zu[7];
        }
        if (this.f3 == null) {
            this.f3 = new zu[7];
        }
        int i19 = 0;
        while (true) {
            int[] iArr = ev.n;
            int length = iArr.length;
            float[] fArr = this.b3;
            if (i19 >= length) {
                Arrays.sort(this.e3, new org.telegram.ui.ActionBar.l5(24));
                AndroidUtilities.roundPercents(fArr, this.c3);
                Arrays.fill(this.g3, true);
                return;
            }
            int i20 = iArr[i19];
            long x12 = x1(i20) + z1(i20);
            zu[] zuVarArr = this.f3;
            zu[] zuVarArr2 = this.e3;
            long x13 = x1(iArr[i19]);
            long z12 = z1(iArr[i19]);
            int i21 = iArr[i19];
            int i22 = this.W2;
            ev evVar = this.m3;
            if (i22 == 1 || i22 == 2 || i22 == 3) {
                i10 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                i11 = 1;
                recivedItemsCount = StatsController.getInstance(i10).getRecivedItemsCount(this.W2 - 1, i21);
            } else {
                i16 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                int recivedItemsCount2 = StatsController.getInstance(i16).getRecivedItemsCount(0, i21);
                i17 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                int recivedItemsCount3 = StatsController.getInstance(i17).getRecivedItemsCount(1, i21) + recivedItemsCount2;
                i18 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                recivedItemsCount = StatsController.getInstance(i18).getRecivedItemsCount(2, i21) + recivedItemsCount3;
                i11 = 1;
            }
            int i23 = iArr[i19];
            int i24 = this.W2;
            if (i24 == i11 || i24 == 2 || i24 == 3) {
                i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                z10 = true;
                sentItemsCount = StatsController.getInstance(i12).getSentItemsCount(this.W2 - 1, i23);
            } else {
                i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                int sentItemsCount2 = StatsController.getInstance(i13).getSentItemsCount(0, i23);
                i14 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                int sentItemsCount3 = StatsController.getInstance(i14).getSentItemsCount(1, i23) + sentItemsCount2;
                i15 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
                sentItemsCount = StatsController.getInstance(i15).getSentItemsCount(2, i23) + sentItemsCount3;
                z10 = true;
            }
            zu zuVar = new zu();
            zuVar.d = i19;
            zuVar.c = x12;
            zuVar.b = z10;
            zuVar.e = x13;
            zuVar.g = recivedItemsCount;
            zuVar.f = z12;
            zuVar.h = sentItemsCount;
            zuVarArr2[i19] = zuVar;
            zuVarArr[i19] = zuVar;
            fArr[i19] = x12 / this.h3;
            i19++;
        }
    }

    public final void B1(boolean z10) {
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
        ArrayList arrayList4 = this.Z2;
        arrayList4.clear();
        ArrayList arrayList5 = this.a3;
        arrayList4.addAll(arrayList5);
        arrayList5.clear();
        boolean z13 = false;
        arrayList5.add(new vu(0, false));
        long j10 = 0;
        int i13 = 1;
        String formatString = this.h3 > 0 ? LocaleController.formatString(R.string.YourNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1())) : LocaleController.formatString(R.string.NoNetworkUsageSince, LocaleController.getInstance().getFormatterStats().format(y1()));
        arrayList5.add(new vu(1, formatString));
        ArrayList arrayList6 = new ArrayList();
        int i14 = 0;
        while (true) {
            zu[] zuVarArr = this.e3;
            if (i14 >= zuVarArr.length) {
                break;
            }
            zu zuVar = zuVarArr[i14];
            long j11 = j10;
            long j12 = zuVar.c;
            int i15 = zuVar.d;
            int i16 = (this.k3 || this.d3.contains(Integer.valueOf(i15))) ? i13 : 0;
            if (j12 > j11 || i16 != 0) {
                int i17 = this.c3[i15];
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
                uu uuVar = new uu();
                i12 = i13;
                ArrayList arrayList7 = arrayList6;
                uuVar.a = 0.1d;
                spannableString.setSpan(uuVar, 0, spannableString.length(), 33);
                int i18 = ev.f[i15];
                int[] iArr = ev.d[i15];
                int i19 = iArr[0];
                int i20 = iArr[i12];
                if (j12 == j11) {
                    concat = LocaleController.getString(ev.h[i15]);
                } else {
                    CharSequence string2 = LocaleController.getString(ev.h[i15]);
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = string2;
                    charSequenceArr[i12] = "  ";
                    charSequenceArr[2] = spannableString;
                    concat = TextUtils.concat(charSequenceArr);
                }
                vu vuVar = new vu(i14, i18, i19, i20, concat, AndroidUtilities.formatFileSize(j12));
                arrayList3 = arrayList7;
                arrayList3.add(vuVar);
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
            int i22 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.n2;
            int w02 = org.telegram.ui.ActionBar.g6.w0(i22, c6Var);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            mutate.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString2.setSpan(new ImageSpan(mutate, 2), 0, i21, 33);
            SpannableString spannableString3 = new SpannableString("v");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_download).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i22, c6Var), mode));
            mutate2.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
            spannableString3.setSpan(new ImageSpan(mutate2, 2), 0, 1, 33);
            int i23 = 0;
            while (i23 < arrayList8.size()) {
                int i24 = ((vu) arrayList8.get(i23)).h;
                if (i24 < 0 || this.g3[i24]) {
                    z12 = z13;
                    arrayList2 = arrayList8;
                } else {
                    zu zuVar2 = this.e3[i24];
                    int[] iArr2 = ev.n;
                    int i25 = zuVar2.d;
                    int i26 = zuVar2.g;
                    int i27 = zuVar2.h;
                    long j14 = zuVar2.e;
                    z12 = z13;
                    ArrayList arrayList9 = arrayList8;
                    long j15 = zuVar2.f;
                    int i28 = iArr2[i25];
                    if (i28 == 0) {
                        if (j15 > j13 || i27 > 0) {
                            i23++;
                            arrayList2 = arrayList9;
                            arrayList2.add(i23, vu.b(LocaleController.formatPluralStringComma("OutgoingCallsCount", i27), AndroidUtilities.formatFileSize(j15)));
                        } else {
                            arrayList2 = arrayList9;
                        }
                        if (j14 > j13 || i26 > 0) {
                            i23++;
                            arrayList2.add(i23, vu.b(LocaleController.formatPluralStringComma("IncomingCallsCount", i26), AndroidUtilities.formatFileSize(j14)));
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
                                arrayList2.add(i23, vu.b(TextUtils.concat(charSequenceArr2), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i26 > 0) {
                                i23++;
                                SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("FilesReceivedCount", i26));
                                CharSequence[] charSequenceArr3 = new CharSequence[3];
                                charSequenceArr3[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr3[1] = " ";
                                charSequenceArr3[2] = replaceTags2;
                                arrayList2.add(i23, vu.b(TextUtils.concat(charSequenceArr3), AndroidUtilities.formatFileSize(j14)));
                            }
                        } else {
                            if (j15 > j13 || i27 > 0) {
                                i23++;
                                String string3 = LocaleController.getString(R.string.BytesSent);
                                CharSequence[] charSequenceArr4 = new CharSequence[3];
                                charSequenceArr4[z12 ? 1 : 0] = spannableString2;
                                charSequenceArr4[1] = " ";
                                charSequenceArr4[2] = string3;
                                arrayList2.add(i23, vu.b(TextUtils.concat(charSequenceArr4), AndroidUtilities.formatFileSize(j15)));
                            }
                            if (j14 > j13 || i26 > 0) {
                                i23++;
                                String string4 = LocaleController.getString(R.string.BytesReceived);
                                CharSequence[] charSequenceArr5 = new CharSequence[3];
                                charSequenceArr5[z12 ? 1 : 0] = spannableString3;
                                charSequenceArr5[1] = " ";
                                charSequenceArr5[2] = string4;
                                arrayList2.add(i23, vu.b(TextUtils.concat(charSequenceArr5), AndroidUtilities.formatFileSize(j14)));
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
            if (!this.k3) {
                arrayList5.add(new vu(3, LocaleController.getString(R.string.DataUsageSectionsInfo) + "\n"));
            }
        }
        if (!this.k3) {
            arrayList5.add(new vu(4, LocaleController.getString(R.string.TotalNetworkUsage)));
            arrayList5.add(new vu(-1, R.drawable.msg_filled_data_sent, -11565578, -13276952, LocaleController.getString(R.string.BytesSent), AndroidUtilities.formatFileSize(this.j3)));
            arrayList5.add(new vu(-1, R.drawable.msg_filled_data_received, -11154873, -14175180, LocaleController.getString(R.string.BytesReceived), AndroidUtilities.formatFileSize(this.i3)));
        }
        if (arrayList.isEmpty()) {
            i10 = 3;
        } else {
            i10 = 3;
            arrayList5.add(new vu(3, formatString));
        }
        if (this.W2 != 0) {
            if (arrayList.isEmpty()) {
                arrayList5.add(new vu(i10, z11));
            }
            arrayList5.add(new vu(-2, R.drawable.msg_download_settings, -11565578, -13276952, LocaleController.getString(R.string.AutomaticDownloadSettings), null));
            int i29 = this.W2;
            if (i29 != 1) {
                i11 = 3;
                string = i29 != 3 ? LocaleController.getString(R.string.AutomaticDownloadSettingsInfoWiFi) : LocaleController.getString(R.string.AutomaticDownloadSettingsInfoRoaming);
            } else {
                i11 = 3;
                string = LocaleController.getString(R.string.AutomaticDownloadSettingsInfoMobile);
            }
            arrayList5.add(new vu(i11, string));
        }
        if (!arrayList.isEmpty()) {
            arrayList5.add(new vu(5, LocaleController.getString(R.string.ResetStatistics)));
        }
        arrayList5.add(new vu(3, false));
        yu yuVar = this.Y2;
        if (yuVar != null) {
            if (z10) {
                yuVar.E(arrayList4, arrayList5);
            } else {
                yuVar.l();
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public final long x1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.W2;
        ev evVar = this.m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
            return StatsController.getInstance(i11).getReceivedBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long receivedBytesCount = StatsController.getInstance(i12).getReceivedBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long receivedBytesCount2 = StatsController.getInstance(i13).getReceivedBytesCount(1, i10) + receivedBytesCount;
        i14 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        return StatsController.getInstance(i14).getReceivedBytesCount(2, i10) + receivedBytesCount2;
    }

    public final long y1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.W2;
        ev evVar = this.m3;
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            i10 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
            return StatsController.getInstance(i10).getResetStatsDate(this.W2 - 1);
        }
        i11 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long resetStatsDate = StatsController.getInstance(i11).getResetStatsDate(0);
        i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long resetStatsDate2 = StatsController.getInstance(i12).getResetStatsDate(1);
        i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
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

    public final long z1(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.W2;
        ev evVar = this.m3;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i11 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
            return StatsController.getInstance(i11).getSentBytesCount(this.W2 - 1, i10);
        }
        i12 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long sentBytesCount = StatsController.getInstance(i12).getSentBytesCount(0, i10);
        i13 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        long sentBytesCount2 = StatsController.getInstance(i13).getSentBytesCount(1, i10) + sentBytesCount;
        i14 = ((org.telegram.ui.ActionBar.m2) evVar).currentAccount;
        return StatsController.getInstance(i14).getSentBytesCount(2, i10) + sentBytesCount2;
    }
}
