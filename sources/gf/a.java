package gf;

import android.os.Build;
import cg.h0;
import d4.t;
import gg.c2;
import gg.v2;
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
import lh.eb;
import lh.l7;
import lh.n2;
import lh.q;
import lh.y;
import lh.z;
import nh.f6;
import nh.h6;
import nh.n4;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kg1;
import org.telegram.ui.web.e2;
import ph.d7;
import ph.g1;
import ph.m6;
import ph.r7;
import ph.u6;
import rh.o3;
import tf.h1;
import uf.k;
import uf.m0;
import uf.p1;
import uf.v0;
import uf.x0;
import vh.u4;
import vh.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i11 = 4;
        int i12 = 20;
        int i13 = 27;
        int i14 = 8;
        int i15 = 3;
        int i16 = 5;
        int i17 = 10;
        final int i18 = 0;
        int i19 = 2;
        final int i20 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(29, (e) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f) obj, tLObject, tL_error, i11));
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
                        fVar = new t(collator, i19);
                    } else {
                        fVar = new e5.f(13);
                    }
                    Collections.sort(arrayList, fVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: gg.h0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(c2Var, hashMap, arrayList, i16));
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
                        fVar2 = new t(collator2, i19);
                    } else {
                        fVar2 = new e5.f(13);
                    }
                    Collections.sort(arrayList2, fVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: gg.h0
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
                AndroidUtilities.runOnUIThread(new c(9, (v2) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((q) obj, tLObject, tL_error, i12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c(i13, (y) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c(28, (z) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new n2(i17, tLObject, (h0) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new n2(12, (l7) obj, tLObject));
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
                AndroidUtilities.runOnUIThread(new n5((r7) obj, i20));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new n4(i19, (f6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new n4(i11, (h6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new kg1(15, (e2) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new kg1(19, (g1) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ph.f6(i18, (m6) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new ph.f6(i20, (u6) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ph.f6(i19, (d7) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new ph.f6(16, (o3) obj, tL_error));
                break;
            case 20:
                tf.c cVar = (tf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ph.f6(i12, cVar, tLObject));
                    break;
                }
                break;
            case 21:
                tf.z zVar = (tf.z) obj;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new ph.f6(21, zVar, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new h1((uf.c) obj, tL_error, tLObject, i19));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new ph.f6(i13, (uf.f) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new h1((k) obj, tL_error, tLObject, i15));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new h1((m0) obj, tL_error, tLObject, 7));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new h1((x0) obj, tL_error, tLObject, i14));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new v0(i15, (p1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new v0(i16, (v) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new v0(i17, (u4) obj, tLObject));
                break;
        }
    }
}
