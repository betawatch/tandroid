// default package

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aq8 extends oec {
    public final /* synthetic */ int a;
    public final /* synthetic */ wjb b;
    public final /* synthetic */ lca c;

    public aq8(lca lcaVar, int i, wjb wjbVar) {
        this.c = lcaVar;
        this.a = i;
        this.b = wjbVar;
    }

    @Override // oec
    public final void a(ArrayList arrayList) {
        lca lcaVar = this.c;
        tp8 tp8Var = lcaVar.R;
        wsa wsaVar = lcaVar.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        wsaVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = wsaVar.e;
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        wsaVar.j();
        pq8 currentPage = lcaVar.getCurrentPage();
        if (currentPage != null) {
            int f = currentPage.d ? wsaVar.f(currentPage.e.d) + 1 : 0;
            lcaVar.n.f(0.0f, f, f);
        }
        gl.r(tp8Var);
        gl.d3(tp8Var, 1000L);
    }

    @Override // oec
    public final void b(View view, int i, int i2) {
        xsa xsaVar;
        boolean z;
        pq8 pq8Var = (pq8) view;
        lca lcaVar = this.c;
        wsa wsaVar = lcaVar.e;
        if (i2 == 0) {
            xsaVar = lcaVar.d;
            z = false;
        } else {
            int i3 = i - 1;
            if (i3 < 0) {
                wsaVar.getClass();
            } else if (i3 < wsaVar.d().size()) {
                xsaVar = wsaVar.e(((TL_stars.TL_starGiftCollection) wsaVar.d().get(i3)).collection_id);
                z = true;
            }
            xsaVar = null;
            z = true;
        }
        pq8Var.d = z;
        pq8Var.e = xsaVar;
        if (xsaVar != null) {
            xsaVar.a();
        }
        pq8Var.f(false);
        LinearLayout linearLayout = pq8Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(pq8Var.a.e.h() ? 0 : 8);
        }
        pq8Var.setVisibleHeight(lcaVar.U);
        pq8Var.setHasTabs(!wsaVar.d().isEmpty());
    }

    @Override // oec
    public final boolean c(int i) {
        return i != 0;
    }

    @Override // oec
    public final View d(int i) {
        if (i == -1) {
            return null;
        }
        int i2 = this.a;
        wjb wjbVar = this.b;
        lca lcaVar = this.c;
        pq8 pq8Var = new pq8(lcaVar, i2, wjbVar);
        qw4 qw4Var = lcaVar.O;
        if (qw4Var != null) {
            qw4Var.b(pq8Var.f);
        }
        return pq8Var;
    }

    @Override // oec
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // oec
    public final int f(int i) {
        if (i == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1)).collection_id;
    }

    @Override // oec
    public final CharSequence g(int i) {
        if (i == 0) {
            return k96.M0(2131750232, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(gl.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new gm(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // oec
    public final int h(int i) {
        return i == 0 ? 0 : 1;
    }
}
