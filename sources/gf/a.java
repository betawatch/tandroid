package gf;

import android.os.Build;
import d4.t;
import dg.h0;
import hg.c2;
import hg.v2;
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
import mh.eb;
import mh.l7;
import mh.m2;
import mh.p;
import mh.x;
import mh.y;
import oh.f6;
import oh.h6;
import oh.t3;
import oh.z1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bh1;
import org.telegram.ui.web.f2;
import qh.a7;
import qh.f1;
import qh.i6;
import qh.l6;
import qh.o7;
import qh.r6;
import sh.n3;
import uf.h1;
import uf.z;
import vf.k;
import vf.k0;
import vf.n0;
import vf.p1;
import vf.x0;
import wh.u4;
import wh.w;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        final Comparator fVar;
        final Comparator fVar2;
        int i10 = this.a;
        int i11 = 29;
        int i12 = 28;
        int i13 = 7;
        int i14 = 8;
        int i15 = 11;
        int i16 = 13;
        int i17 = 2;
        int i18 = 4;
        final int i19 = 0;
        final int i20 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(i11, (e) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f) obj, tLObject, tL_error, i18));
                break;
            case 2:
                c2 c2Var = (c2) obj;
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
                        fVar = new t(collator, i17);
                    } else {
                        fVar = new e5.f(13);
                    }
                    Collections.sort(arrayList, fVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: hg.h0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i19) {
                                    case 0:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(c2Var, hashMap, arrayList, 5));
                    break;
                }
                break;
            case 3:
                h0 h0Var = (h0) obj;
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
                        fVar2 = new t(collator2, i17);
                    } else {
                        fVar2 = new e5.f(13);
                    }
                    Collections.sort(arrayList2, fVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: hg.h0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i20) {
                                    case 0:
                                        return fVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h0Var, hashMap2, arrayList2, i14));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c(i15, (v2) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((p) obj, tLObject, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c(27, (x) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c(i12, (y) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new m2(10, tLObject, (h0) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new m2(12, (l7) obj, tLObject));
                break;
            case 10:
                eb ebVar = (eb) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(ebVar.c).putMessages(new ArrayList<>(Arrays.asList(ebVar.H.messageOwner)), true, true, true, 0, 0, 0L);
                    break;
                } else {
                    ebVar.getClass();
                    break;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new t3((o7) obj, i18));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new z1(5, (f6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new z1(i13, (h6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new bh1(i16, (f2) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new bh1(18, (f1) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new bh1(i11, (i6) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new l6(i19, (r6) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new l6(i20, (a7) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new l6(17, (n3) obj, tL_error));
                break;
            case 20:
                uf.c cVar = (uf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new l6(22, cVar, tLObject));
                    break;
                }
                break;
            case 21:
                z zVar = (z) obj;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new l6(23, zVar, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new h1((vf.c) obj, tL_error, tLObject, i17));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new l6(i12, (vf.f) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new h1((k) obj, tL_error, tLObject, 3));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new h1((n0) obj, tL_error, tLObject, i13));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new h1((x0) obj, tL_error, tLObject, i14));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new k0(i18, (p1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new k0(6, (w) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k0(i15, (u4) obj, tLObject));
                break;
        }
    }
}
