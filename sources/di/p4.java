package di;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
import org.telegram.ui.bn;
import org.telegram.ui.rg;
import org.telegram.ui.ti;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p4(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[LOOP:1: B:35:0x0108->B:37:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i10 = this.a;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                b5 b5Var = (b5) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w5 w5Var = b5Var.F;
                if (this.b == this.c) {
                    b5Var.e0 = arrayList;
                    w5Var.animate().alpha(b5Var.s ? 0.0f : b5Var.e0 != null ? 1.0f : 0.25f).setInterpolator(lr.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if ((arrayList.get(i11) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i11)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i11));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i7 = 0;
                                while (i7 < size) {
                                    Object obj3 = arrayList2.get(i7);
                                    i7++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(((TL_stars.starGiftAttributeModel) obj3).document, w5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(gd.M0(2131749738, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                                w5Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i7 = 0;
                    while (i7 < size) {
                    }
                    if (spannableStringBuilder.length() > 0) {
                    }
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(gd.M0(2131749738, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    w5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                bn.m1((bn) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                ti tiVar = (ti) obj2;
                Long l10 = (Long) obj;
                bn bnVar = tiVar.b;
                if (bnVar.getParentActivity() != null) {
                    Activity parentActivity = bnVar.getParentActivity();
                    String M0 = gd.M0(2131746096, null);
                    int i12 = org.telegram.messenger.v3.p0(bnVar.e) ? 2131746100 : 2131746101;
                    long j3 = this.b;
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, i12, org.telegram.messenger.n5.t(j3)));
                    String H = l10.longValue() > 0 ? gd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String M02 = gd.M0(2131751806, null);
                    rg rgVar = new rg(tiVar, j3, this.c, l10, 1);
                    i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                    org.telegram.ui.Components.b5.f0(parentActivity, M0, W2, H, M02, rgVar, i6Var, true);
                    break;
                }
                break;
        }
    }
}
