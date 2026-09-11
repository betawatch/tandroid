package bi;

import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er0;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator f11Var;
        final Comparator f11Var2;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 12;
        int i13 = 4;
        int i14 = 29;
        int i15 = 25;
        final int i16 = 1;
        int i17 = 24;
        int i18 = 5;
        final int i19 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.c((di.o9) obj, 22));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(i17, (d8) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(26, (f8) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new s8(i17, (di.w1) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new di.b7(i18, (di.g8) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new di.b7((di.o8) obj, tLObject));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new di.b7(i11, (di.x8) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new di.b7(i14, (fi.r4) obj, tL_error));
                break;
            case 8:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new fi.j4(i13, cVar, tLObject));
                    break;
                }
                break;
            case 9:
                hg.i0 i0Var = (hg.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new fi.j4(i18, i0Var, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.t((ig.c) obj, tL_error, tLObject, i11));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new fi.j4(i12, (ig.f) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new hg.t((ig.m) obj, tL_error, tLObject, 8));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.w0) obj, tL_error, tLObject, i12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.t((ig.g1) obj, tL_error, tLObject, 13));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new fi.j4(18, (ig.b2) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new fi.j4(i15, (ji.x) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ji.b5(i19, (ji.d5) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(i13, (org.telegram.ui.web.h2) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(i15, (uf.c) obj, tLObject));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new er0((uf.d) obj, tLObject, tL_error, i17));
                break;
            case 21:
                ug.y0 y0Var = (ug.y0) obj;
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
                        f11Var = new l7(collator, i18);
                    } else {
                        f11Var = new f11(9);
                    }
                    Collections.sort(arrayList, f11Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: ug.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return f11Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return f11Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new er0(y0Var, hashMap, arrayList, i15));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
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
                        f11Var2 = new l7(collator2, i18);
                    } else {
                        f11Var2 = new f11(9);
                    }
                    Collections.sort(arrayList2, f11Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: ug.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i16) {
                                    case 0:
                                        return f11Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return f11Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new er0(b1Var, hashMap2, arrayList2, 28));
                    break;
                }
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ug.r(i18, (ug.n1) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new wh.n((zh.g) obj, tLObject, tL_error, 6));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new ug.r(14, (zh.l) obj, tLObject));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new ug.r(15, (zh.m) obj, tLObject));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new ug.r(27, tLObject, (org.telegram.ui.web.b1) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new ug.r(i14, (zh.j5) obj, tLObject));
                break;
            default:
                zh.n8 n8Var = (zh.n8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(n8Var.c).putMessages(new ArrayList<>(Arrays.asList(n8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    n8Var.getClass();
                    break;
                }
        }
    }
}
