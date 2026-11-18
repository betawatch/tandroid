package bi;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n5 extends y61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 b;
    public final /* synthetic */ eq0 c;

    public n5(eq0 eq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = eq0Var;
        this.a = i7;
        this.b = i6Var;
    }

    @Override // org.telegram.ui.Components.y61
    public final void a(ArrayList arrayList) {
        eq0 eq0Var = this.c;
        b5 b5Var = eq0Var.R;
        di.m8 m8Var = eq0Var.e;
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
        m8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = m8Var.e;
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
        m8Var.j();
        j6 currentPage = eq0Var.getCurrentPage();
        if (currentPage != null) {
            int f10 = currentPage.d ? m8Var.f(currentPage.e.d) + 1 : 0;
            eq0Var.n.f(0.0f, f10, f10);
        }
        org.telegram.messenger.g0.r(b5Var);
        org.telegram.messenger.g0.h3(b5Var, 1000L);
    }

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        di.o8 o8Var;
        boolean z10;
        eq0 eq0Var = this.c;
        di.m8 m8Var = eq0Var.e;
        j6 j6Var = (j6) view;
        if (i10 == 0) {
            o8Var = eq0Var.d;
            z10 = false;
        } else {
            int i11 = i7 - 1;
            if (i11 < 0) {
                m8Var.getClass();
            } else if (i11 < m8Var.d().size()) {
                o8Var = m8Var.e(((TL_stars.TL_starGiftCollection) m8Var.d().get(i11)).collection_id);
                z10 = true;
            }
            o8Var = null;
            z10 = true;
        }
        j6Var.d = z10;
        j6Var.e = o8Var;
        if (o8Var != null) {
            o8Var.a();
        }
        j6Var.f(false);
        LinearLayout linearLayout = j6Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(j6Var.a.e.h() ? 0 : 8);
        }
        j6Var.setVisibleHeight(eq0Var.U);
        j6Var.setHasTabs(!m8Var.d().isEmpty());
    }

    @Override // org.telegram.ui.Components.y61
    public final boolean c(int i7) {
        return i7 != 0;
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        eq0 eq0Var = this.c;
        j6 j6Var = new j6(eq0Var, i10, i6Var);
        ri.q qVar = eq0Var.O;
        if (qVar != null) {
            qVar.b(j6Var.f);
        }
        return j6Var;
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // org.telegram.ui.Components.y61
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i7 - 1)).collection_id;
    }

    @Override // org.telegram.ui.Components.y61
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return gd.M0(2131750232, null);
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

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        return i7 == 0 ? 0 : 1;
    }
}
