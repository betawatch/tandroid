package bi;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import di.k8;
import di.m8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g3 extends n61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;
    public final /* synthetic */ wp0 c;

    public g3(wp0 wp0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = wp0Var;
        this.a = i7;
        this.b = e6Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final void a(ArrayList arrayList) {
        wp0 wp0Var = this.c;
        t2 t2Var = wp0Var.R;
        k8 k8Var = wp0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        k8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = k8Var.e;
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        k8Var.j();
        c4 currentPage = wp0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? k8Var.f(currentPage.e.d) + 1 : 0;
            wp0Var.n.e(0.0f, f10, f10);
        }
        org.telegram.messenger.g0.r(t2Var);
        org.telegram.messenger.g0.i3(t2Var, 1000L);
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        m8 m8Var;
        boolean z10;
        wp0 wp0Var = this.c;
        k8 k8Var = wp0Var.e;
        c4 c4Var = (c4) view;
        if (i10 == 0) {
            m8Var = wp0Var.d;
            z10 = false;
        } else {
            int i11 = i7 - 1;
            if (i11 < 0) {
                k8Var.getClass();
            } else if (i11 < k8Var.d().size()) {
                m8Var = k8Var.e(((TL_stars.TL_starGiftCollection) k8Var.d().get(i11)).collection_id);
                z10 = true;
            }
            m8Var = null;
            z10 = true;
        }
        c4Var.d = z10;
        c4Var.e = m8Var;
        if (m8Var != null) {
            m8Var.a();
        }
        c4Var.f(false);
        LinearLayout linearLayout = c4Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(c4Var.a.e.h() ? 0 : 8);
        }
        c4Var.setVisibleHeight(wp0Var.U);
        c4Var.setHasTabs(!k8Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.n61
    public final boolean c(int i7) {
        return i7 != 0;
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        wp0 wp0Var = this.c;
        c4 c4Var = new c4(wp0Var, i10, e6Var);
        ri.q qVar = wp0Var.O;
        if (qVar != null) {
            qVar.b(c4Var.f);
        }
        return c4Var;
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.n61
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return hd.M0(2131750248, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return i7 == 0 ? 0 : 1;
    }
}
