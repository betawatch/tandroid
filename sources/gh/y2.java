package gh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import hh.k7;
import hh.m7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y2 extends g71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 b;
    public final /* synthetic */ wq0 c;

    public y2(wq0 wq0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = wq0Var;
        this.a = i10;
        this.b = c6Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final void a(ArrayList arrayList) {
        wq0 wq0Var = this.c;
        o2 o2Var = wq0Var.J;
        k7 k7Var = wq0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        k7Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = k7Var.e;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        k7Var.j();
        t3 currentPage = wq0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? k7Var.f(currentPage.e.d) + 1 : 0;
            wq0Var.n.e(0.0f, f10, f10);
        }
        AndroidUtilities.cancelRunOnUIThread(o2Var);
        AndroidUtilities.runOnUIThread(o2Var, 1000L);
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        m7 m7Var;
        boolean z10;
        wq0 wq0Var = this.c;
        k7 k7Var = wq0Var.e;
        t3 t3Var = (t3) view;
        if (i11 == 0) {
            m7Var = wq0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                k7Var.getClass();
            } else if (i12 < k7Var.d().size()) {
                m7Var = k7Var.e(((TL_stars.TL_starGiftCollection) k7Var.d().get(i12)).collection_id);
                z10 = true;
            }
            m7Var = null;
            z10 = true;
        }
        t3Var.d = z10;
        t3Var.e = m7Var;
        if (m7Var != null) {
            m7Var.a();
        }
        t3Var.f(false);
        LinearLayout linearLayout = t3Var.A;
        if (linearLayout != null) {
            linearLayout.setVisibility(t3Var.a.e.h() ? 0 : 8);
        }
        t3Var.setVisibleHeight(wq0Var.M);
        t3Var.setHasTabs(!k7Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.g71
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new t3(this.c, this.a, this.b);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.g71
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
