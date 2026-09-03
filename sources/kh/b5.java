package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ o5 c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ b5(String[] strArr, o5 o5Var, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = strArr;
        this.c = o5Var;
        this.d = arrayList;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        int i10 = this.a;
        String str4 = " ";
        ArrayList arrayList = this.d;
        o5 o5Var = this.c;
        String[] strArr = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                a5 a5Var = o5Var.c;
                boolean isEmpty = a5Var.j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = a5Var.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z4 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.y3.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) a5Var.m.get(Long.valueOf(stargiftattributemodel.document.id));
                        int intValue = num == null ? 0 : num.intValue();
                        int i12 = u4.a;
                        i51 J = i51.J(u4.class);
                        J.G = stargiftattributemodel;
                        J.l = lowerCase;
                        J.z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z4 = (isEmpty || contains) ? false : true;
                        }
                        J.K(z4);
                        arrayList2.add(J);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    break;
                }
                break;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                a5 a5Var2 = o5Var.c;
                boolean isEmpty2 = a5Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = a5Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z10 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (org.telegram.messenger.y3.w(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || org.telegram.messenger.y3.w(str2, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) ? " " : str2;
                    }
                    Integer num2 = (Integer) a5Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int intValue2 = num2 == null ? 0 : num2.intValue();
                    int i14 = n4.a;
                    i51 J2 = i51.J(n4.class);
                    J2.G = stargiftattributebackdrop;
                    J2.l = lowerCase2;
                    J2.z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z10 = (isEmpty2 || contains2) ? false : true;
                    }
                    J2.K(z10);
                    arrayList3.add(J2);
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                a5 a5Var3 = o5Var.c;
                boolean isEmpty3 = a5Var3.l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = a5Var3.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z11 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) || org.telegram.messenger.y3.w(str4, lowerCase3, stargiftattributepattern.name.toLowerCase()) || org.telegram.messenger.y3.w(str4, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str3 = str4;
                        Integer num3 = (Integer) a5Var3.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        int intValue3 = num3 == null ? 0 : num3.intValue();
                        int i16 = x4.a;
                        i51 J3 = i51.J(x4.class);
                        J3.G = stargiftattributepattern;
                        J3.l = lowerCase3;
                        J3.z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z11 = (isEmpty3 || contains3) ? false : true;
                        }
                        J3.K(z11);
                        arrayList4.add(J3);
                    } else {
                        str3 = str4;
                    }
                    str4 = str3;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    break;
                }
                break;
        }
    }
}
