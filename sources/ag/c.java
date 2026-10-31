package ag;

import android.os.Build;
import bi.l5;
import bi.v6;
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
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import rh.v5;
import rh.y8;
import th.r4;
import th.t4;
import vh.f5;
import vh.i6;
import vh.n5;
import vh.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator dVar;
        final Comparator dVar2;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 8;
        int i13 = 13;
        int i14 = 29;
        int i15 = 12;
        int i16 = 2;
        final int i17 = 1;
        final int i18 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new a3.l0((f) obj, tL_error, tLObject, i17));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new a1.f(7, (k) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new a3.l0((w) obj, tL_error, tLObject, i16));
                break;
            case 3:
                org.telegram.messenger.i0.g3(new a3.l0((v1) obj, tL_error, tLObject, i11));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new a3.l0((h2) obj, tL_error, tLObject, 7));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new a1.f(i15, (i3) obj, tLObject));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new a1.f(18, (bi.z) obj, tLObject));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new a1.f(23, (l5) obj, tLObject));
                break;
            case 8:
                mg.s1 s1Var = (mg.s1) obj;
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
                        Collator collator = Collator.getInstance(cd.D0().y != null ? cd.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        dVar = new v6(collator, i16);
                    } else {
                        dVar = new a4.d(11);
                    }
                    Collections.sort(arrayList, dVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: mg.d0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return dVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return dVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.i0.g3(new li.s(s1Var, hashMap, arrayList, 5));
                    break;
                }
                break;
            case 9:
                l lVar = (l) obj;
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
                                String L0 = cd.L0(2131750530, null);
                                tL_help_country2.default_name = L0;
                                tL_help_country2.name = L0;
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
                        Collator collator2 = Collator.getInstance(cd.D0().y != null ? cd.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        dVar2 = new v6(collator2, i16);
                    } else {
                        dVar2 = new a4.d(11);
                    }
                    Collections.sort(arrayList2, dVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: mg.d0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return dVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return dVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.i0.g3(new li.s(lVar, hashMap2, arrayList2, i12));
                    break;
                }
                break;
            case 10:
                org.telegram.messenger.i0.g3(new k2.u(i14, (mg.i2) obj, tLObject));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new mh.k(3, (of.c) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new li.s((of.d) obj, tLObject, tL_error, i15));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k3(i14, (org.telegram.ui.web.w1) obj, tLObject));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.v1(i14, (rh.n) obj, tLObject));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new rh.o(i18, (rh.p) obj, tLObject));
                break;
            case 16:
                org.telegram.messenger.i0.g3(new rh.o(tLObject, (ph.h1) obj));
                break;
            case 17:
                org.telegram.messenger.i0.g3(new rh.o(14, (v5) obj, tLObject));
                break;
            case 18:
                y8 y8Var = (y8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hs.a0(y8Var.j1).j1(new ArrayList(Arrays.asList(y8Var.C1.k)), true, true, true, 0, false, 0, 0L);
                    break;
                } else {
                    y8Var.getClass();
                    break;
                }
            case 19:
                org.telegram.messenger.i0.g3(new sg.v((i6) obj, i13));
                break;
            case 20:
                org.telegram.messenger.i0.g3(new th.o0(i11, (r4) obj, tLObject));
                break;
            case 21:
                org.telegram.messenger.i0.g3(new th.o0(i12, (t4) obj, tLObject));
                break;
            case 22:
                org.telegram.messenger.i0.g3(new vh.d1(i18, (vh.e1) obj, tLObject));
                break;
            case 23:
                org.telegram.messenger.i0.g3(new vh.d1(10, (f5) obj, tLObject));
                break;
            case 24:
                org.telegram.messenger.i0.g3(new vh.d1(i15, (n5) obj, tLObject));
                break;
            case 25:
                org.telegram.messenger.i0.g3(new vh.d1(i13, (t5) obj, tLObject));
                break;
            case 26:
                org.telegram.messenger.i0.g3(new vh.d1(28, (xh.i3) obj, tL_error));
                break;
            case 27:
                zf.c cVar = (zf.c) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new yh.o(i16, cVar, tLObject));
                    break;
                }
                break;
            default:
                zf.z zVar = (zf.z) obj;
                zVar.getClass();
                org.telegram.messenger.i0.g3(new yh.o(4, zVar, tLObject));
                break;
        }
    }
}
