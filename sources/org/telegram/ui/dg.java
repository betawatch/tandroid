package org.telegram.ui;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[LOOP:1: B:19:0x0085->B:21:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        org.telegram.ui.ActionBar.p6 p6Var;
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        int i11 = this.a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                un.T0((un) obj2, this.b, this.c, (Long) obj);
                break;
            case 1:
                nj njVar = (nj) obj2;
                Long l4 = (Long) obj;
                un unVar = njVar.b;
                if (unVar.getParentActivity() != null) {
                    Activity parentActivity = unVar.getParentActivity();
                    String L0 = org.telegram.messenger.cd.L0(2131746306, null);
                    int i12 = org.telegram.messenger.w3.p0(unVar.e) ? 2131746310 : 2131746311;
                    long j10 = this.b;
                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i12, org.telegram.messenger.o5.t(j10)));
                    String H = l4.longValue() > 0 ? org.telegram.messenger.cd.H(',', "RemoveMessageFeeRefund", (int) l4.longValue()) : null;
                    String L02 = org.telegram.messenger.cd.L0(2131751817, null);
                    jh jhVar = new jh(njVar, j10, this.c, l4, 1);
                    p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                    org.telegram.ui.Components.s4.h0(parentActivity, L0, W2, H, L02, jhVar, p6Var, true);
                    break;
                }
                break;
            default:
                rh.a3 a3Var = (rh.a3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.n5 n5Var = a3Var.E;
                if (this.b == this.c) {
                    a3Var.d0 = arrayList;
                    n5Var.animate().alpha(a3Var.s ? 0.0f : a3Var.d0 != null ? 1.0f : 0.25f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if ((arrayList.get(i13) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i13)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i13));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = arrayList2.get(i10);
                                    i10++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(((TL_stars.starGiftAttributeModel) obj3).document, n5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131749763, null), false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
                                n5Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i10 = 0;
                    while (i10 < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131749763, null), false, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
                    n5Var.setText(spannableStringBuilder);
                }
                break;
        }
    }
}
