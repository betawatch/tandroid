package ef;

import a4.v;
import ag.i0;
import android.os.Build;
import eg.d2;
import eg.w2;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jh.db;
import jh.k7;
import jh.q;
import jh.y;
import jh.z;
import lh.e6;
import lh.g6;
import lh.m5;
import lh.r3;
import nh.b6;
import nh.g7;
import nh.o7;
import nh.o8;
import nh.r1;
import nh.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import ph.n3;
import rf.a0;
import sf.g;
import sf.o1;
import sf.s1;
import th.s4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator eVar;
        final Comparator eVar2;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 6;
        int i13 = 4;
        int i14 = 26;
        int i15 = 5;
        int i16 = 2;
        int i17 = 9;
        final int i18 = 0;
        final int i19 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(29, (e) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f) obj, tLObject, tL_error, i13));
                break;
            case 2:
                d2 d2Var = (d2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = 0; i20 < tL_help_countriesList.countries.size(); i20++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i20);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        eVar = new v(collator, i16);
                    } else {
                        eVar = new c5.e(13);
                    }
                    Collections.sort(arrayList, eVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: eg.i0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(d2Var, hashMap, arrayList, i15));
                    break;
                }
                break;
            case 3:
                i0 i0Var = (i0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i21 = 0; i21 < tL_help_countriesList2.countries.size(); i21++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i21);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList2.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        eVar2 = new v(collator2, i16);
                    } else {
                        eVar2 = new c5.e(13);
                    }
                    Collections.sort(arrayList2, eVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: eg.i0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(i0Var, hashMap2, arrayList2, i11));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c(i17, (w2) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((q) obj, tLObject, tL_error, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c(25, (y) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c(i14, (z) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jh.w2(tLObject, (i0) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new jh.w2(10, (k7) obj, tLObject));
                break;
            case 10:
                db dbVar = (db) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(dbVar.c).putMessages(new ArrayList<>(Arrays.asList(dbVar.G.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    dbVar.getClass();
                    break;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new m5((o8) obj, i19));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new r3(3, (e6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new r3(i15, (g6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new r3(i14, (r1) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new b6(7, (g7) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new b6(i11, (o7) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new b6(i17, (y7) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(i12, (org.telegram.ui.web.d2) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(14, (n3) obj, tL_error));
                break;
            case 20:
                rf.c cVar = (rf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(20, cVar, tLObject));
                    break;
                }
                break;
            case 21:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(21, a0Var, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new sf.a(obj, (Object) tL_error, (Object) tLObject, 0));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(i14, (g) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new sf.a(obj, (Object) tL_error, (Object) tLObject, 1));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new sf.a(obj, (Object) tL_error, (Object) tLObject, 5));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new sf.a(obj, (Object) tL_error, (Object) tLObject, 6));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new o1(i16, (s1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new o1(i13, (th.v) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new o1(i17, (s4) obj, tLObject));
                break;
        }
    }
}
