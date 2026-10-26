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
import org.telegram.ui.Components.ny0;
import org.telegram.ui.bv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator bvVar;
        final Comparator bvVar2;
        int i10 = this.a;
        int i11 = 18;
        int i12 = 23;
        int i13 = 6;
        int i14 = 25;
        int i15 = 2;
        int i16 = 27;
        int i17 = 24;
        int i18 = 20;
        final int i19 = 1;
        final int i20 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(i16, (j0) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(28, (k0) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new f2(10, tLObject, (ai.i) obj));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new f2(12, (t9) obj, tLObject));
                break;
            case 4:
                be beVar = (be) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(beVar.c).putMessages(new ArrayList<>(Arrays.asList(beVar.L.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    beVar.getClass();
                    break;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new u6((fi.w8) obj, i12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new di.b4(3, (di.t6) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new di.b4(5, (di.v6) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new e2.q0(5, (fi.s1) obj, tLObject));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new e2.q0(15, (fi.o7) obj, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new e2.q0(17, (fi.w7) obj, tLObject));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new e2.q0(i11, (fi.f8) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new hi.u2(3, (hi.o4) obj, tL_error));
                break;
            case 13:
                ig.c cVar = (ig.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new hi.u2(7, cVar, tLObject));
                    break;
                }
                break;
            case 14:
                ig.i0 i0Var = (ig.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new hi.u2(9, i0Var, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.c) obj, tL_error, tLObject, i17));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new hi.u2(i18, (jg.f) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.n) obj, tL_error, tLObject, i14));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.v0) obj, tL_error, tLObject, 29));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new jg.f1(obj, (Object) tL_error, (Object) tLObject, i20));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new hi.u2(26, (jg.c2) obj, tLObject));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new k2.e0(i15, (li.w) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new k2.e0(7, (li.a5) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(i11, (org.telegram.ui.web.f2) obj, tLObject));
                break;
            case 24:
                vg.x0 x0Var = (vg.x0) obj;
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
                        bvVar = new p5(collator, i13);
                    } else {
                        bvVar = new bv(20);
                    }
                    Collections.sort(arrayList, bvVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: vg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i20) {
                                    case 0:
                                        return bvVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return bvVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ny0(x0Var, hashMap, arrayList, i18));
                    break;
                }
                break;
            case 25:
                ig.o oVar = (ig.o) obj;
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
                        bvVar2 = new p5(collator2, i13);
                    } else {
                        bvVar2 = new bv(20);
                    }
                    Collections.sort(arrayList2, bvVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: vg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return bvVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return bvVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ny0(oVar, hashMap2, arrayList2, i12));
                    break;
                }
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new sg.u(i14, (vg.n1) obj, tLObject));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new vi.i0(i15, (xf.c) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ny0((xf.d) obj, tLObject, tL_error, i16));
                break;
        }
    }
}
