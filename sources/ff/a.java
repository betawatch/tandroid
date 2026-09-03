package ff;

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
import org.telegram.ui.sg1;
import org.telegram.ui.web.f2;
import ph.c7;
import ph.e6;
import ph.f1;
import ph.l6;
import ph.q7;
import ph.t6;
import rh.n3;
import tf.k1;
import uf.d0;
import uf.k;
import uf.n0;
import uf.p1;
import uf.x0;
import vh.v4;
import vh.w;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        final Comparator eVar;
        final Comparator eVar2;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 29;
        int i13 = 5;
        int i14 = 7;
        int i15 = 12;
        final int i16 = 0;
        int i17 = 2;
        final int i18 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(i12, (e) obj, tLObject));
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
                        eVar = new t(collator, i17);
                    } else {
                        eVar = new e5.e(13);
                    }
                    Collections.sort(arrayList, eVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: gg.h0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i16) {
                                    case 0:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(c2Var, hashMap, arrayList, i13));
                    break;
                }
                break;
            case 3:
                h0 h0Var = (h0) obj;
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
                        eVar2 = new t(collator2, i17);
                    } else {
                        eVar2 = new e5.e(13);
                    }
                    Collections.sort(arrayList2, eVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: gg.h0
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h0Var, hashMap2, arrayList2, 8));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c(9, (v2) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((q) obj, tLObject, tL_error, 20));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c(27, (y) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c(28, (z) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new n2(10, tLObject, (h0) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new n2(i15, (l7) obj, tLObject));
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
                AndroidUtilities.runOnUIThread(new n5((q7) obj, i18));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new n4(i17, (f6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new n4(i11, (h6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new sg1(15, (f2) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new sg1(19, (f1) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new e6(i16, (l6) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new e6(i18, (t6) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new e6(i17, (c7) obj, tLObject));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new e6(18, (n3) obj, tL_error));
                break;
            case 20:
                tf.c cVar = (tf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new e6(22, cVar, tLObject));
                    break;
                }
                break;
            case 21:
                tf.z zVar = (tf.z) obj;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new e6(23, zVar, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new k1((uf.c) obj, tL_error, tLObject, i18));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new e6(i12, (uf.f) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new k1((k) obj, tL_error, tLObject, i17));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new k1((n0) obj, tL_error, tLObject, 6));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new k1((x0) obj, tL_error, tLObject, i14));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new d0(i13, (p1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new d0(i14, (w) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new d0(i15, (v4) obj, tLObject));
                break;
        }
    }
}
