package ih;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import jh.i7;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s2 extends q71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 b;
    public final /* synthetic */ gr0 c;

    public s2(gr0 gr0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = gr0Var;
        this.a = i10;
        this.b = c6Var;
    }

    @Override // org.telegram.ui.Components.q71
    public final void a(ArrayList arrayList) {
        gr0 gr0Var = this.c;
        l2 l2Var = gr0Var.J;
        i7 i7Var = gr0Var.e;
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
        i7Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = i7Var.e;
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
        i7Var.j();
        n3 currentPage = gr0Var.getCurrentPage();
        if (currentPage != null) {
            int f9 = currentPage.d ? i7Var.f(currentPage.e.d) + 1 : 0;
            gr0Var.n.e(0.0f, f9, f9);
        }
        AndroidUtilities.cancelRunOnUIThread(l2Var);
        AndroidUtilities.runOnUIThread(l2Var, 1000L);
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        k7 k7Var;
        boolean z10;
        gr0 gr0Var = this.c;
        i7 i7Var = gr0Var.e;
        n3 n3Var = (n3) view;
        if (i11 == 0) {
            k7Var = gr0Var.d;
            z10 = false;
        } else {
            int i12 = i10 - 1;
            if (i12 < 0) {
                i7Var.getClass();
            } else if (i12 < i7Var.d().size()) {
                k7Var = i7Var.e(((TL_stars.TL_starGiftCollection) i7Var.d().get(i12)).collection_id);
                z10 = true;
            }
            k7Var = null;
            z10 = true;
        }
        n3Var.d = z10;
        n3Var.e = k7Var;
        if (k7Var != null) {
            k7Var.a();
        }
        n3Var.f(false);
        LinearLayout linearLayout = n3Var.A;
        if (linearLayout != null) {
            linearLayout.setVisibility(n3Var.a.e.h() ? 0 : 8);
        }
        n3Var.setVisibleHeight(gr0Var.M);
        n3Var.setHasTabs(!i7Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.q71
    public final boolean c(int i10) {
        return i10 != 0;
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new n3(this.c, this.a, this.b);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.q71
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i10 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.q71
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
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return i10 == 0 ? 0 : 1;
    }
}
