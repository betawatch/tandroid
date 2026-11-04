package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x4 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ x4(i6 i6Var, String[] strArr, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = i6Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        i6 i6Var = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                w5 w5Var = i6Var.d;
                boolean isEmpty = w5Var.l.isEmpty();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = w5Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) w5Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i11 = t5.b;
                        r31 K = r31.K(t5.class);
                        K.G = stargiftattributepattern;
                        K.l = lowerCase;
                        K.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z11 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z11);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(m5.i(bd.M0(2131750016, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                w5 w5Var2 = i6Var.d;
                boolean isEmpty2 = w5Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = w5Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) w5Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        int i13 = k5.b;
                        r31 K2 = r31.K(k5.class);
                        K2.G = stargiftattributebackdrop;
                        K2.l = lowerCase2;
                        K2.z = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z12 = (isEmpty2 || contains2) ? false : true;
                        }
                        K2.L(z12);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(m5.i(bd.M0(2131750023, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                w5 w5Var3 = i6Var.d;
                boolean isEmpty3 = w5Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = w5Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) w5Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        ?? intValue3 = num3 == null ? z13 : num3.intValue();
                        int i15 = q5.b;
                        r31 K3 = r31.K(q5.class);
                        K3.G = stargiftattributemodel;
                        K3.l = lowerCase3;
                        K3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z14 = (isEmpty3 || contains3) ? z13 : true;
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(m5.i(bd.M0(2131750018, null)));
                    break;
                }
                break;
        }
    }
}
