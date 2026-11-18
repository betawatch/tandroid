package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ w6(h8 h8Var, String[] strArr, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = h8Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        h8 h8Var = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                v7 v7Var = h8Var.d;
                boolean isEmpty = v7Var.l.isEmpty();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = v7Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M3))) {
                        Integer num = (Integer) v7Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i11 = s7.b;
                        l41 K = l41.K(s7.class);
                        K.H = stargiftattributepattern;
                        K.m = lowerCase;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z11 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z11);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(k7.i(gd.M0(2131749992, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                v7 v7Var2 = h8Var.d;
                boolean isEmpty2 = v7Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj4 = arrayList.get(i12);
                    i12++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = v7Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                        Integer num2 = (Integer) v7Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        int i13 = h7.b;
                        l41 K2 = l41.K(h7.class);
                        K2.H = stargiftattributebackdrop;
                        K2.m = lowerCase2;
                        K2.A = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z12 = (isEmpty2 || contains2) ? false : true;
                        }
                        K2.L(z12);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(k7.i(gd.M0(2131749999, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                v7 v7Var3 = h8Var.d;
                boolean isEmpty3 = v7Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = v7Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M33))) {
                        Integer num3 = (Integer) v7Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        ?? intValue3 = num3 == null ? z13 : num3.intValue();
                        int i15 = p7.b;
                        l41 K3 = l41.K(p7.class);
                        K3.H = stargiftattributemodel;
                        K3.m = lowerCase3;
                        K3.A = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z14 = (isEmpty3 || contains3) ? z13 : true;
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(k7.i(gd.M0(2131749994, null)));
                    break;
                }
                break;
        }
    }
}
