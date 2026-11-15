package di;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.an;
import org.telegram.ui.rg;
import org.telegram.ui.si;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m4(Object obj, long j3, long j10, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = j3;
        this.c = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[LOOP:1: B:35:0x0108->B:37:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i10 = this.a;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                y4 y4Var = (y4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.o5 o5Var = y4Var.F;
                if (this.b == this.c) {
                    y4Var.e0 = arrayList;
                    o5Var.animate().alpha(y4Var.s ? 0.0f : y4Var.e0 != null ? 1.0f : 0.25f).setInterpolator(er.h).setDuration(420L).start();
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
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(((TL_stars.starGiftAttributeModel) obj3).document, o5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(hd.M0(2131749754, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                                o5Var.setText(spannableStringBuilder);
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
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.I2(hd.M0(2131749754, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
                    o5Var.setText(spannableStringBuilder);
                }
                break;
            case 1:
                an.m1((an) obj2, this.b, this.c, (Long) obj);
                break;
            default:
                si siVar = (si) obj2;
                Long l10 = (Long) obj;
                an anVar = siVar.b;
                if (anVar.getParentActivity() != null) {
                    Activity parentActivity = anVar.getParentActivity();
                    String M0 = hd.M0(2131746291, null);
                    int i12 = org.telegram.messenger.t3.p0(anVar.e) ? 2131746295 : 2131746296;
                    long j3 = this.b;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i12, org.telegram.messenger.m5.t(j3)));
                    String H = l10.longValue() > 0 ? hd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue()) : null;
                    String M02 = hd.M0(2131751817, null);
                    rg rgVar = new rg(siVar, j3, this.c, l10, 1);
                    e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                    org.telegram.ui.Components.t4.f0(parentActivity, M0, X2, H, M02, rgVar, e6Var, true);
                    break;
                }
                break;
        }
    }
}
