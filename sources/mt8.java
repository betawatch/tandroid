// default package

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mt8 extends nic {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ cga c;

    public mt8(cga cgaVar, int i, vnb vnbVar) {
        this.c = cgaVar;
        this.a = i;
        this.b = vnbVar;
    }

    @Override // nic
    public final void a(ArrayList arrayList) {
        cga cgaVar = this.c;
        ft8 ft8Var = cgaVar.R;
        zwa zwaVar = cgaVar.e;
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
        zwaVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = zwaVar.e;
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
        zwaVar.j();
        au8 currentPage = cgaVar.getCurrentPage();
        if (currentPage != null) {
            int f = currentPage.d ? zwaVar.f(currentPage.e.d) + 1 : 0;
            cgaVar.n.f(0.0f, f, f);
        }
        hl.r(ft8Var);
        hl.d3(ft8Var, 1000L);
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        axa axaVar;
        boolean z;
        au8 au8Var = (au8) view;
        cga cgaVar = this.c;
        zwa zwaVar = cgaVar.e;
        if (i2 == 0) {
            axaVar = cgaVar.d;
            z = false;
        } else {
            int i3 = i - 1;
            if (i3 < 0) {
                zwaVar.getClass();
            } else if (i3 < zwaVar.d().size()) {
                axaVar = zwaVar.e(((TL_stars.TL_starGiftCollection) zwaVar.d().get(i3)).collection_id);
                z = true;
            }
            axaVar = null;
            z = true;
        }
        au8Var.d = z;
        au8Var.e = axaVar;
        if (axaVar != null) {
            axaVar.a();
        }
        au8Var.f(false);
        LinearLayout linearLayout = au8Var.E;
        if (linearLayout != null) {
            linearLayout.setVisibility(au8Var.a.e.h() ? 0 : 8);
        }
        au8Var.setVisibleHeight(cgaVar.U);
        au8Var.setHasTabs(!zwaVar.d().isEmpty());
    }

    @Override // nic
    public final boolean c(int i) {
        return i != 0;
    }

    @Override // nic
    public final View d(int i) {
        if (i == -1) {
            return null;
        }
        int i2 = this.a;
        vnb vnbVar = this.b;
        cga cgaVar = this.c;
        au8 au8Var = new au8(cgaVar, i2, vnbVar);
        vy4 vy4Var = cgaVar.O;
        if (vy4Var != null) {
            vy4Var.b(au8Var.f);
        }
        return au8Var;
    }

    @Override // nic
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override // nic
    public final int f(int i) {
        if (i == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1)).collection_id;
    }

    @Override // nic
    public final CharSequence g(int i) {
        if (i == 0) {
            return ob6.M0(2131750207, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(hl.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new hm(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override // nic
    public final int h(int i) {
        return i == 0 ? 0 : 1;
    }
}
