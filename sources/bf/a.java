package bf;

import android.os.Build;
import bg.g3;
import bg.i;
import bg.l0;
import bg.m2;
import e5.u;
import gh.a0;
import gh.jb;
import gh.n7;
import gh.r;
import gh.z;
import h3.g0;
import ih.g;
import ih.h6;
import ih.j6;
import ih.j7;
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
import kh.a8;
import kh.c9;
import kh.k8;
import kh.o8;
import kh.s7;
import kh.u1;
import mh.g4;
import of.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ai1;
import org.telegram.ui.web.b2;
import pf.r1;
import qh.r4;
import qh.v;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator eVar;
        final Comparator eVar2;
        int i9 = this.a;
        int i10 = 17;
        int i11 = 13;
        int i12 = 6;
        int i13 = 25;
        int i14 = 9;
        int i15 = 10;
        int i16 = 24;
        final int i17 = 1;
        final int i18 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(i12, (d) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((e) obj, tLObject, tL_error, 3));
                break;
            case 2:
                m2 m2Var = (m2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < tL_help_countriesList.countries.size(); i19++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i19);
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
                        eVar = new l0(collator, i18);
                    } else {
                        eVar = new a5.e(10);
                    }
                    Collections.sort(arrayList, eVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: bg.m0
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
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(m2Var, hashMap, arrayList, 4));
                    break;
                }
                break;
            case 3:
                i iVar = (i) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i20 = 0; i20 < tL_help_countriesList2.countries.size(); i20++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i20);
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
                        eVar2 = new l0(collator2, i18);
                    } else {
                        eVar2 = new a5.e(10);
                    }
                    Collections.sort(arrayList2, eVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: bg.m0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(iVar, hashMap2, arrayList2, 7));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a1.e(16, (g3) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((r) obj, tLObject, tL_error, i10));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new u(i14, (z) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new u(i15, (a0) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new u(22, tLObject, (i) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new u(i16, (n7) obj, tLObject));
                break;
            case 10:
                jb jbVar = (jb) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(jbVar.c).putMessages(new ArrayList<>(Arrays.asList(jbVar.G.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    jbVar.getClass();
                    break;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new g((c9) obj, i15));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new g0(i10, (h6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new g0(19, (j6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new j7(i11, (u1) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new j7(i16, (s7) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new j7(i13, (a8) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new j7(26, (k8) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new o8(i14, (g4) obj, tL_error));
                break;
            case 19:
                of.c cVar = (of.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new o8(i11, cVar, tLObject));
                    break;
                }
                break;
            case 20:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                AndroidUtilities.runOnUIThread(new o8(14, f0Var, tLObject));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new ai1(i14, (b2) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new pf.a(obj, (Object) tL_error, (Object) tLObject, 0));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ai1(12, (pf.g) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new pf.a(obj, (Object) tL_error, (Object) tLObject, 1));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new pf.a(obj, (Object) tL_error, (Object) tLObject, 5));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new pf.a(obj, (Object) tL_error, (Object) tLObject, 6));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new ai1(18, (r1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new ai1(20, (v) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ai1(i13, (r4) obj, tLObject));
                break;
        }
    }
}
