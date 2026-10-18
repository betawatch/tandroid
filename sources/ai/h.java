package ai;

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
import org.telegram.ui.Components.ay0;
import org.telegram.ui.kg0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator kg0Var;
        final Comparator kg0Var2;
        int i10 = this.a;
        int i11 = 20;
        int i12 = 25;
        int i13 = 29;
        int i14 = 26;
        int i15 = 6;
        int i16 = 23;
        int i17 = 16;
        int i18 = 24;
        final int i19 = 0;
        final int i20 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.l0((x) obj, tLObject, tL_error, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(13, (h0) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(14, (i0) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new a1.f(i14, tLObject, (r0) obj));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a1.f(28, (y9) obj, tLObject));
                break;
            case 5:
                le leVar = (le) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(leVar.c).putMessages(new ArrayList<>(Arrays.asList(leVar.L.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    leVar.getClass();
                    break;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.d((ei.a9) obj, i17));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new pa(19, (ci.t6) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new pa(21, (ci.v6) obj, tLObject));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ci.u7(i18, (ei.t1) obj, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.p6(5, (ei.s7) obj, tLObject));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ei.p6((ei.a8) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ei.p6(7, (ei.j8) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ei.p6(i11, (gi.f4) obj, tL_error));
                break;
            case 14:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ei.p6(i16, cVar, tLObject));
                    break;
                }
                break;
            case 15:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new ei.p6(i12, h0Var, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.c) obj, tL_error, tLObject, i16));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new hi.t(3, (ig.f) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.m) obj, tL_error, tLObject, i18));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.v0) obj, tL_error, tLObject, 28));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.f1) obj, tL_error, tLObject, i13));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new hi.t(9, (ig.a2) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hi.t(i11, (ki.x) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new hi.t(i12, (ki.a5) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.v3(i13, (org.telegram.ui.web.h2) obj, tLObject));
                break;
            case 25:
                ug.w0 w0Var = (ug.w0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i21 = 0; i21 < tL_help_countriesList.countries.size(); i21++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i21);
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
                        kg0Var = new t5(collator, i15);
                    } else {
                        kg0Var = new kg0(16);
                    }
                    Collections.sort(arrayList, kg0Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: ug.p
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return kg0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return kg0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ay0(w0Var, hashMap, arrayList, i16));
                    break;
                }
                break;
            case 26:
                ig.l0 l0Var = (ig.l0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i22 = 0; i22 < tL_help_countriesList2.countries.size(); i22++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i22);
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
                        kg0Var2 = new t5(collator2, i15);
                    } else {
                        kg0Var2 = new kg0(16);
                    }
                    Collections.sort(arrayList2, kg0Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: ug.p
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i20) {
                                    case 0:
                                        return kg0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return kg0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ay0(l0Var, hashMap2, arrayList2, i14));
                    break;
                }
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new u2.q0(8, (ug.m1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new u2.q0(10, (wf.c) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ay0((wf.d) obj, tLObject, tL_error, 27));
                break;
        }
    }
}
