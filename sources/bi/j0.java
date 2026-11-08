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
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
import org.telegram.ui.un0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator un0Var;
        final Comparator un0Var2;
        int i7 = this.a;
        int i10 = 16;
        int i11 = 26;
        int i12 = 6;
        int i13 = 21;
        int i14 = 23;
        int i15 = 8;
        int i16 = 24;
        final int i17 = 0;
        final int i18 = 1;
        Object obj = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new a1.e(i14, (k0) obj, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a1.e(i16, (l0) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new a4(i12, tLObject, (ai.i) obj));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new a4(i15, (v9) obj, tLObject));
                break;
            case 4:
                ce ceVar = (ce) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    yr.a0(ceVar.j1).j1(new ArrayList(Arrays.asList(ceVar.C1.k)), true, true, true, 0, false, 0, 0L);
                    break;
                } else {
                    ceVar.getClass();
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ab((fi.d8) obj, i11));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new di.z0(7, (di.k6) obj, tLObject));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new di.z0(9, (di.m6) obj, tLObject));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new f2.h(3, (fi.r1) obj, tLObject));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new f2.h(13, (fi.w6) obj, tLObject));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new f2.h(15, (fi.e7) obj, tLObject));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new f2.h(i10, (fi.m7) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ha.b(7, (hi.c4) obj, tL_error));
                break;
            case 13:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                org.telegram.messenger.g0.h3(new ha.b(12, h0Var, tLObject));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new fi.x1((kg.c) obj, tL_error, tLObject, 22));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new ha.b(i10, (kg.f) obj, tLObject));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new fi.x1((kg.m) obj, tL_error, tLObject, i14));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new fi.x1((kg.s0) obj, tL_error, tLObject, 27));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new fi.x1((kg.c1) obj, tL_error, tLObject, 28));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new ha.b(i13, (kg.t1) obj, tLObject));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new ha.b(i11, (li.v) obj, tLObject));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new li.j3(i18, (li.y4) obj, tLObject));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(i12, (org.telegram.ui.web.u1) obj, tLObject));
                break;
            case 23:
                wg.u0 u0Var = (wg.u0) obj;
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
                        Collator collator = Collator.getInstance(org.telegram.messenger.id.E0().y != null ? org.telegram.messenger.id.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        un0Var = new s5(collator, 8);
                    } else {
                        un0Var = new un0(14);
                    }
                    Collections.sort(arrayList, un0Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return un0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return un0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new r31(u0Var, hashMap, arrayList, 20));
                    break;
                }
                break;
            case 24:
                ii.c cVar = (ii.c) obj;
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
                                String M0 = org.telegram.messenger.id.M0(2131750522, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
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
                        Collator collator2 = Collator.getInstance(org.telegram.messenger.id.E0().y != null ? org.telegram.messenger.id.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        un0Var2 = new s5(collator2, 8);
                    } else {
                        un0Var2 = new un0(14);
                    }
                    Collections.sort(arrayList2, un0Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return un0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return un0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new r31(cVar, hashMap2, arrayList2, i14));
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.g0.h3(new u9.f(i13, (wg.f1) obj, tLObject));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new u9.f(29, (yf.d) obj, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new r31((yf.e) obj, tLObject, tL_error));
                break;
        }
    }
}
