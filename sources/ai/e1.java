package ai;

import android.os.Build;
import android.util.Log;
import di.ga;
import di.mc;
import di.o8;
import di.s4;
import fi.a6;
import fi.b6;
import fi.d6;
import hi.b8;
import hi.d7;
import hi.l7;
import hi.v6;
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
import java.util.concurrent.CountDownLatch;
import ki.t3;
import oi.x4;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator qw0Var;
        final Comparator qw0Var2;
        int i7 = 10;
        int i10 = 2;
        int i11 = 27;
        int i12 = 3;
        int i13 = 12;
        int i14 = 13;
        int i15 = 24;
        final int i16 = 1;
        final int i17 = 0;
        switch (this.a) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    int size = arrayList2.size();
                    while (i17 < size) {
                        Object obj = arrayList2.get(i17);
                        i17++;
                        if (obj instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (j1.class) {
                        j1.a = arrayList;
                        j1.k(arrayList);
                    }
                    Log.d("Dictation", "speech models: " + arrayList.size() + " from the server");
                    DictationAsr.L();
                    DictationAsr.n();
                } else {
                    p5.c.t(new StringBuilder("speech models: list failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                }
                synchronized (j1.class) {
                    j1.c = null;
                }
                countDownLatch.countDown();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new c1.c(i15, (di.b0) this.b, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new c1.c(25, (di.c0) this.b, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.w2(i7, tLObject, (g0) this.b));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new di.w2(i13, (o8) this.b, tLObject));
                return;
            case 5:
                mc mcVar = (mc) this.b;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    tr.a0(mcVar.n1).j1(new ArrayList(Arrays.asList(mcVar.G1.k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    mcVar.getClass();
                    return;
                }
            case 6:
                org.telegram.messenger.g0.g3(new f2.a((b8) this.b, i14));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new a6(i17, (b6) this.b, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new a6(i10, (d6) this.b, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new hi.r1(i17, (hi.s1) this.b, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new hi.r1(i7, (v6) this.b, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new hi.r1(i13, (d7) this.b, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new hi.r1(i14, (l7) this.b, tLObject));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ii.a((q10) this.b, tLObject, tL_error, i17));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new hi.r1(20, (ii.m) this.b, tLObject));
                return;
            case 15:
                jg.h0 h0Var = (jg.h0) this.b;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new hi.r1(22, h0Var, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new ga((kg.c) this.b, tL_error, tLObject, 26));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new hi.r1(29, (kg.f) this.b, tLObject));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new ga((kg.n) this.b, tL_error, tLObject, i11));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new kg.i0((kg.v0) this.b, tL_error, tLObject, i16));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new kg.i0((kg.f1) this.b, tL_error, tLObject, i10));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new kg.h0(4, (kg.w1) this.b, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new kg.h0(i13, (t3) this.b, tL_error));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new kg.h0(28, (oi.u) this.b, tLObject));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new oi.s2(i12, (x4) this.b, tLObject));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new c5(i15, (org.telegram.ui.web.t1) this.b, tLObject));
                return;
            case 26:
                wg.u0 u0Var = (wg.u0) this.b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
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
                                arrayList3.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(gd.E0().y != null ? gd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        qw0Var = new s4(collator, 6);
                    } else {
                        qw0Var = new qw0(13);
                    }
                    Collections.sort(arrayList3, qw0Var);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new sv0(u0Var, hashMap, arrayList3, i11));
                    return;
                }
                return;
            case 27:
                ug.z zVar = (ug.z) this.b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < tL_help_countriesList2.countries.size(); i19++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i19);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = gd.M0(2131750505, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList4.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(gd.E0().y != null ? gd.E0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        qw0Var2 = new s4(collator2, 6);
                    } else {
                        qw0Var2 = new qw0(13);
                    }
                    Collections.sort(arrayList4, qw0Var2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() { // from class: wg.o
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i16) {
                                    case 0:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new wg.q(zVar, hashMap2, arrayList4, i17));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new wg.r(i12, (wg.d1) this.b, tLObject));
                return;
        }
    }
}
