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
import org.telegram.ui.ds0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator ds0Var;
        final Comparator ds0Var2;
        int i10 = this.a;
        int i11 = 9;
        int i12 = 7;
        int i13 = 5;
        int i14 = 20;
        int i15 = 13;
        int i16 = 14;
        int i17 = 8;
        final int i18 = 0;
        final int i19 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((di.l9) obj, 23));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(26, (g8) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(28, (i8) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new u8(26, (di.v1) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new di.y6(i12, (di.c8) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new di.y6(i17, (di.k8) obj, tLObject));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new di.y6(i11, (di.t8) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new fi.q3(i19, (fi.q4) obj, tL_error));
                break;
            case 8:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new fi.q3(6, cVar, tLObject));
                    break;
                }
                break;
            case 9:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new fi.q3(i17, h0Var, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.t((ig.c) obj, tL_error, tLObject, i17));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new fi.q3(i16, (ig.f) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new hg.t((ig.m) obj, tL_error, tLObject, i11));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.w0) obj, tL_error, tLObject, i15));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.t((ig.g1) obj, tL_error, tLObject, i16));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new fi.q3(i14, (ig.b2) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new fi.q3(27, (ji.x) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ji.v2(2, (ji.e5) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.v(i12, (org.telegram.ui.web.g2) obj, tLObject));
                break;
            case 19:
                ug.x0 x0Var = (ug.x0) obj;
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
                        ds0Var = new q7(collator, i13);
                    } else {
                        ds0Var = new ds0(13);
                    }
                    Collections.sort(arrayList, ds0Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: ug.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return ds0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return ds0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.g(x0Var, hashMap, arrayList, i17));
                    break;
                }
                break;
            case 20:
                ji.p1 p1Var = (ji.p1) obj;
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
                        ds0Var2 = new q7(collator2, i13);
                    } else {
                        ds0Var2 = new ds0(13);
                    }
                    Collections.sort(arrayList2, ds0Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: ug.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return ds0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return ds0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.g(p1Var, hashMap2, arrayList2, 11));
                    break;
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new s9.b(16, (ug.m1) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new s9.b(18, (wf.c) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new pi.g((wf.d) obj, tLObject, tL_error, 12));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new pi.g((zh.g) obj, tLObject, tL_error, i14));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new s9.b(29, (zh.l) obj, tLObject));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new zh.m(i18, (zh.n) obj, tLObject));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new zh.m(tLObject, (ji.p1) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new zh.m(i16, (zh.f5) obj, tLObject));
                break;
            default:
                zh.h8 h8Var = (zh.h8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(h8Var.c).putMessages(new ArrayList<>(Arrays.asList(h8Var.L.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    h8Var.getClass();
                    break;
                }
        }
    }
}
