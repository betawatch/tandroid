// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc9 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd9 b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ gc9(nd9 nd9Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = nd9Var;
        this.c = strArr;
        this.d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // icc
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        boolean z;
        String str3;
        byte b = this.a;
        boolean z2 = false;
        String str4 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                nd9Var.getClass();
                String lowerCase = strArr[0].toLowerCase();
                String I3 = hl.I3(lowerCase);
                ed9 ed9Var = nd9Var.e;
                boolean isEmpty = ed9Var.l.isEmpty();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj3;
                    boolean contains = ed9Var.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase) || stargiftattributebackdrop.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) ed9Var.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i2 = oc9.b;
                        b8c K = b8c.K(oc9.class);
                        K.H = stargiftattributebackdrop;
                        K.m = lowerCase;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z3 = (isEmpty || contains) ? false : true;
                        }
                        K.L(z3);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(uc9.i(ob6.M0(2131749963, null)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                nd9Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I32 = hl.I3(lowerCase2);
                ed9 ed9Var2 = nd9Var.e;
                boolean isEmpty2 = ed9Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj4;
                    boolean contains2 = ed9Var2.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z4 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase2) || stargiftattributemodel.name.toLowerCase().startsWith(I32) || uh9.t(" ", lowerCase2, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I32))) {
                        Integer num2 = (Integer) ed9Var2.n.get(Long.valueOf(stargiftattributemodel.document.id));
                        int intValue2 = num2 == null ? 0 : num2.intValue();
                        int i4 = yc9.b;
                        b8c K2 = b8c.K(yc9.class);
                        K2.H = stargiftattributemodel;
                        K2.m = lowerCase2;
                        K2.A = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            z4 = (isEmpty2 || contains2) ? false : true;
                        }
                        K2.L(z4);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(uc9.i(ob6.M0(2131749957, null)));
                    break;
                }
                break;
            case 2:
                ArrayList arrayList4 = (ArrayList) obj;
                nd9Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I33 = hl.I3(lowerCase3);
                int size3 = arrayList.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj5 = arrayList.get(i5);
                    i5++;
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                    String str5 = starGift.title;
                    String lowerCase4 = str5 == null ? "" : str5.toLowerCase();
                    if (TextUtils.isEmpty(lowerCase3) || lowerCase4.startsWith(lowerCase3) || lowerCase4.startsWith(I33)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (uh9.t(str2, lowerCase3, lowerCase4) || lowerCase4.contains(str2.concat(I33))) ? " " : str2;
                    }
                    int i6 = sc9.b;
                    b8c K3 = b8c.K(sc9.class);
                    K3.H = starGift;
                    K3.m = lowerCase3;
                    K3.L(nd9Var.e.b.contains(Long.valueOf(starGift.id)));
                    arrayList4.add(K3);
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(uc9.i(ob6.M0(2131749961, null)));
                    break;
                }
                break;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                nd9Var.getClass();
                String lowerCase5 = strArr[0].toLowerCase();
                String I34 = hl.I3(lowerCase5);
                ed9 ed9Var3 = nd9Var.e;
                boolean isEmpty3 = ed9Var3.m.isEmpty();
                int size4 = arrayList.size();
                int i7 = 0;
                while (i7 < size4) {
                    Object obj6 = arrayList.get(i7);
                    i7++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj6;
                    boolean contains3 = ed9Var3.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z5 = !contains3;
                    if (TextUtils.isEmpty(lowerCase5) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase5) || stargiftattributepattern.name.toLowerCase().startsWith(I34) || uh9.t(str4, lowerCase5, stargiftattributepattern.name.toLowerCase())) {
                        z = z2;
                    } else {
                        z = z2;
                        if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I34))) {
                            str3 = str4;
                            z2 = z;
                            str4 = str3;
                        }
                    }
                    str3 = str4;
                    Integer num3 = (Integer) ed9Var3.p.get(Long.valueOf(stargiftattributepattern.document.id));
                    ?? intValue3 = num3 == null ? z : num3.intValue();
                    int i8 = bd9.b;
                    b8c K4 = b8c.K(bd9.class);
                    K4.H = stargiftattributepattern;
                    K4.m = lowerCase5;
                    K4.A = intValue3;
                    if (!TextUtils.isEmpty(lowerCase5)) {
                        z5 = (isEmpty3 || contains3) ? z : true;
                    }
                    K4.L(z5);
                    arrayList5.add(K4);
                    z2 = z;
                    str4 = str3;
                }
                if (arrayList5.isEmpty()) {
                    arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                    break;
                }
                break;
        }
    }
}
