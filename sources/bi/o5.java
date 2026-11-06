package bi;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.rg;
import org.telegram.ui.si;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o5(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[LOOP:1: B:35:0x0108->B:37:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i7;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10 = this.a;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                d6 d6Var = (d6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.q5 q5Var = d6Var.E;
                if (this.b == this.c) {
                    d6Var.d0 = arrayList;
                    q5Var.animate().alpha(d6Var.s ? 0.0f : d6Var.d0 != null ? 1.0f : 0.25f).setInterpolator(xq.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r5(((TL_stars.starGiftAttributeModel) obj3).document, q5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131749753, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                                q5Var.setText(spannableStringBuilder);
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
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131749753, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    q5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                an.h1((an) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                si siVar = (si) obj2;
                Long l10 = (Long) obj;
                an anVar = siVar.b;
                if (anVar.getParentActivity() != null) {
                    Activity parentActivity = anVar.getParentActivity();
                    String M0 = org.telegram.messenger.hd.M0(2131746290, null);
                    int i12 = org.telegram.messenger.t3.p0(anVar.e) ? 2131746294 : 2131746295;
                    long j3 = this.b;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i12, org.telegram.messenger.m5.t(j3)));
                    String H = l10.longValue() > 0 ? org.telegram.messenger.hd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String M02 = org.telegram.messenger.hd.M0(2131751817, null);
                    rg rgVar = new rg(siVar, j3, this.c, l10, 1);
                    f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                    org.telegram.ui.Components.v4.f0(parentActivity, M0, X2, H, M02, rgVar, f6Var, true);
                    break;
                }
                break;
        }
    }
}
