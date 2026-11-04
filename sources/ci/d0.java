package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator i1Var;
        final Comparator i1Var2;
        int i3 = this.a;
        int i10 = 22;
        int i11 = 27;
        int i12 = 9;
        int i13 = 28;
        int i14 = 2;
        int i15 = 6;
        final int i16 = 0;
        final int i17 = 1;
        Object obj = this.b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new e0(i16, (f0) obj, tLObject));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new e0(i17, (g0) obj, tLObject));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new e0(tLObject, (ai.v2) obj));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new e0(15, (v8) obj, tLObject));
                break;
            case 4:
                tc tcVar = (tc) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    qr.a0(tcVar.k1).j1(new ArrayList(Arrays.asList(tcVar.D1.k)), true, true, true, 0, false, 0, 0L);
                    break;
                } else {
                    tcVar.getClass();
                    break;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ei.z5((gi.c8) obj, i17));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ei.b0(10, (ei.l6) obj, tLObject));
                break;
            case 7:
                org.telegram.messenger.g0.h3(new ei.b0(12, (ei.n6) obj, tLObject));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new g2.c(i12, (gi.r1) obj, tLObject));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new g2.c(19, (gi.x6) obj, tLObject));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new g2.c(21, (gi.f7) obj, tLObject));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new g2.c(i10, (gi.m7) obj, tLObject));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new ii.e(i15, (ii.d4) obj, tL_error));
                break;
            case 13:
                kg.e0 e0Var = (kg.e0) obj;
                e0Var.getClass();
                org.telegram.messenger.g0.h3(new ii.e(13, e0Var, tLObject));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new ei.h9((lg.c) obj, tL_error, tLObject, i11));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new ii.e(i10, (lg.f) obj, tLObject));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new ei.h9((lg.m) obj, tL_error, tLObject, i13));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new lg.y((lg.t0) obj, tL_error, tLObject, i14));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new lg.y((lg.d1) obj, tL_error, tLObject, 3));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new ii.e(i11, (lg.u1) obj, tLObject));
                break;
            case 20:
                org.telegram.messenger.g0.h3(new m2.s(4, (mi.v) obj, tLObject));
                break;
            case 21:
                org.telegram.messenger.g0.h3(new m2.s(i12, (mi.z4) obj, tLObject));
                break;
            case 22:
                org.telegram.messenger.g0.h3(new hc1(11, (org.telegram.ui.web.s1) obj, tLObject));
                break;
            case 23:
                xg.u0 u0Var = (xg.u0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i18 = 0; i18 < tL_help_countriesList.countries.size(); i18++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i18);
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
                        Collator collator = Collator.getInstance(bd.E0().y != null ? bd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        i1Var = new y4(collator, i15);
                    } else {
                        i1Var = new vg.i1(1);
                    }
                    Collections.sort(arrayList, i1Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: xg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i16) {
                                    case 0:
                                        return i1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return i1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new iv0((u10) u0Var, hashMap, arrayList, 25));
                    break;
                }
                break;
            case 24:
                gi.j8 j8Var = (gi.j8) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i19 = 0; i19 < tL_help_countriesList2.countries.size(); i19++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i19);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = bd.M0(2131750529, null);
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
                        Collator collator2 = Collator.getInstance(bd.E0().y != null ? bd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        i1Var2 = new y4(collator2, i15);
                    } else {
                        i1Var2 = new vg.i1(1);
                    }
                    Collections.sort(arrayList2, i1Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: xg.q
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return i1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return i1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new iv0((u10) j8Var, hashMap2, arrayList2, i13));
                    break;
                }
                break;
            case 25:
                org.telegram.messenger.g0.h3(new u9.a(29, (xg.e1) obj, tLObject));
                break;
            case 26:
                org.telegram.messenger.g0.h3(new xh.i(7, (zf.c) obj, tLObject));
                break;
            default:
                org.telegram.messenger.g0.h3(new z9.o((zf.d) obj, tLObject, tL_error, i14));
                break;
        }
    }
}
