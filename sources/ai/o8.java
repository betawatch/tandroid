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
import org.telegram.ui.Components.og0;
import org.telegram.ui.mb1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator mb1Var;
        final Comparator mb1Var2;
        int i10 = this.a;
        int i11 = 17;
        int i12 = 11;
        int i13 = 26;
        int i14 = 5;
        int i15 = 2;
        int i16 = 28;
        final int i17 = 0;
        final int i18 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((ci.m9) obj, 12));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(15, (w8) obj, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(i11, (y8) obj, tLObject));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ca(15, (ci.v1) obj, tLObject));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ca(i13, (ci.d8) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ca(27, (ci.l8) obj, tLObject));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ca(i16, (ci.u8) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ci.y8(21, (ei.p4) obj, tL_error));
                break;
            case 8:
                gg.c cVar = (gg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ci.y8(25, cVar, tLObject));
                    break;
                }
                break;
            case 9:
                gg.h0 h0Var = (gg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new ci.y8(27, h0Var, tLObject));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.t((hg.d) obj, tL_error, tLObject, i14));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.w1(i15, (hg.g) obj, tLObject));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new gg.t((hg.n) obj, tL_error, tLObject, 6));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.w0) obj, tL_error, tLObject, 10));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g1) obj, tL_error, tLObject, i12));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.w1(8, (hg.c2) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new gg.w1(12, (ii.x) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new gg.w1(i11, (ii.c5) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(i18, (org.telegram.ui.web.g2) obj, tLObject));
                break;
            case 19:
                tg.x0 x0Var = (tg.x0) obj;
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
                        mb1Var = new f8(collator, i14);
                    } else {
                        mb1Var = new mb1(9);
                    }
                    Collections.sort(arrayList, mb1Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: tg.p
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return mb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return mb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new og0(x0Var, hashMap, arrayList, 29));
                    break;
                }
                break;
            case 20:
                ii.q1 q1Var = (ii.q1) obj;
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
                        mb1Var2 = new f8(collator2, i14);
                    } else {
                        mb1Var2 = new mb1(9);
                    }
                    Collections.sort(arrayList2, mb1Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: tg.p
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return mb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return mb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new tg.q(q1Var, hashMap2, arrayList2, i15));
                    break;
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(i16, (tg.m1) obj, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new u2.p0(i15, (vf.c) obj, tLObject));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new tg.q(obj, tLObject, (Object) tL_error, 3));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new tg.q(obj, tLObject, (Object) tL_error, i12));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new u2.p0(13, (yh.l) obj, tLObject));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new u2.p0(14, (yh.m) obj, tLObject));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new u2.p0(i13, tLObject, (ii.q1) obj));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new u2.p0(i16, (yh.e5) obj, tLObject));
                break;
            default:
                yh.h8 h8Var = (yh.h8) obj;
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
