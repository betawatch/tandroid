package bi;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fq0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t5 extends c71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b;
    public final /* synthetic */ fq0 c;

    public t5(fq0 fq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = fq0Var;
        this.a = i7;
        this.b = i6Var;
    }

    @Override // org.telegram.ui.Components.c71
    public final void a(ArrayList arrayList) {
        fq0 fq0Var = this.c;
        h5 h5Var = fq0Var.R;
        di.n8 n8Var = fq0Var.e;
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
        n8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = n8Var.e;
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
        n8Var.j();
        p6 currentPage = fq0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? n8Var.f(currentPage.e.d) + 1 : 0;
            fq0Var.n.f(0.0f, f10, f10);
        }
        org.telegram.messenger.g0.r(h5Var);
        org.telegram.messenger.g0.h3(h5Var, 1000L);
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        di.p8 p8Var;
        boolean z10;
        fq0 fq0Var = this.c;
        di.n8 n8Var = fq0Var.e;
        p6 p6Var = (p6) view;
        if (i10 == 0) {
            p8Var = fq0Var.d;
            z10 = false;
        } else {
            int i11 = i7 - 1;
            if (i11 < 0) {
                n8Var.getClass();
            } else if (i11 < n8Var.d().size()) {
                p8Var = n8Var.e(((TL_stars.TL_starGiftCollection) n8Var.d().get(i11)).collection_id);
                z10 = true;
            }
            p8Var = null;
            z10 = true;
        }
        p6Var.d = z10;
        p6Var.e = p8Var;
        if (p8Var != null) {
            p8Var.a();
        }
        p6Var.f(false);
        LinearLayout linearLayout = p6Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(p6Var.a.e.h() ? 0 : 8);
        }
        p6Var.setVisibleHeight(fq0Var.U);
        p6Var.setHasTabs(!n8Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.c71
    public final boolean c(int i7) {
        return i7 != 0;
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        fq0 fq0Var = this.c;
        p6 p6Var = new p6(fq0Var, i10, i6Var);
        ri.q qVar = fq0Var.O;
        if (qVar != null) {
            qVar.b(p6Var.f);
        }
        return p6Var;
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.c71
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.c71
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return gd.N0(2131750231, null);
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
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        return i7 == 0 ? 0 : 1;
    }
}
