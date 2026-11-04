package ci;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ng;
import org.telegram.ui.oi;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(Object obj, long j10, long j11, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[LOOP:1: B:35:0x0108->B:37:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10 = this.a;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.o5 o5Var = h5Var.F;
                if (this.b == this.c) {
                    h5Var.e0 = arrayList;
                    o5Var.animate().alpha(h5Var.s ? 0.0f : h5Var.e0 != null ? 1.0f : 0.25f).setInterpolator(xq.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if ((arrayList.get(i11) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i11)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i11));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i3 = 0;
                                while (i3 < size) {
                                    Object obj3 = arrayList2.get(i3);
                                    i3++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(((TL_stars.starGiftAttributeModel) obj3).document, o5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(bd.M0(2131749762, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                                o5Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i3 = 0;
                    while (i3 < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(bd.M0(2131749762, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    o5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                wm.h1((wm) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                oi oiVar = (oi) obj2;
                Long l10 = (Long) obj;
                wm wmVar = oiVar.b;
                if (wmVar.getParentActivity() != null) {
                    Activity parentActivity = wmVar.getParentActivity();
                    String M0 = bd.M0(2131746299, null);
                    int i12 = org.telegram.messenger.t3.p0(wmVar.e) ? 2131746303 : 2131746304;
                    long j10 = this.b;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, i12, org.telegram.messenger.m5.t(j10)));
                    String H = l10.longValue() > 0 ? bd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String M02 = bd.M0(2131751817, null);
                    ng ngVar = new ng(oiVar, j10, this.c, l10, 1);
                    e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                    org.telegram.ui.Components.t4.h0(parentActivity, M0, X2, H, M02, ngVar, e6Var, true);
                    break;
                }
                break;
        }
    }
}
