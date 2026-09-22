package org.telegram.ui;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl0 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ fl0(h71 h71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = h71Var;
        this.b = str;
        this.c = z10;
        this.f = arrayList;
        this.g = hashMap;
        this.h = arrayList2;
        this.i = linkedHashSet;
        this.j = linkedHashSet2;
        this.k = arrayList3;
        this.l = arrayList4;
        this.d = z11;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.e;
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f;
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.g;
                final boolean z10 = this.c;
                final String str = this.b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.i;
                final String[] strArr = (String[]) this.j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.l;
                final Integer num = (Integer) obj;
                if (iArr[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
                    b2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.bl0
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj2, Object obj3) {
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.b2.this.dismiss();
                            org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                            if (urlAuthResult2 != null) {
                                f3Var2.dismiss();
                                il0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, d1Var);
                                return;
                            }
                            if (tL_error != null) {
                                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    org.telegram.ui.Cells.q3.r(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                                    return;
                                }
                                f3Var2.dismiss();
                                org.telegram.ui.Components.vc a2 = il0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str3 = str2;
                                a2.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Gi, e6Var)), i10).j();
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                final h71 h71Var = (h71) this.e;
                final String str3 = this.b;
                final boolean z12 = this.c;
                final ArrayList arrayList = (ArrayList) this.f;
                final HashMap hashMap = (HashMap) this.g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.j;
                final ArrayList arrayList3 = (ArrayList) this.k;
                final ArrayList arrayList4 = (ArrayList) this.l;
                final boolean z13 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.r51
                    @Override // java.lang.Runnable
                    public final void run() {
                        h71 h71Var2 = h71.this;
                        k51 k51Var = h71Var2.I1;
                        if (k51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(k51Var);
                            h71Var2.I1 = null;
                        }
                        String str4 = h71Var2.z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        h71Var2.y1 = true;
                        h71Var2.z(true, z12);
                        y51 y51Var = h71Var2.f0;
                        if (y51Var != null) {
                            y51Var.d(true);
                        }
                        ArrayList arrayList5 = h71Var2.A1;
                        if (arrayList5 == null) {
                            h71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = h71Var2.D1;
                        if (arrayList6 == null) {
                            h71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = h71Var2.C1;
                        if (arrayList7 == null) {
                            h71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = h71Var2.B1;
                        if (arrayList8 == null) {
                            h71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        h71Var2.i0.u0(0);
                        int i11 = h71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (arrayList9.isEmpty()) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    h71Var2.A1.add(zg.p0.c(tL_availableReaction));
                                }
                            } else {
                                h71Var2.A1.addAll(arrayList9);
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                h71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = h71Var2.A1;
                            zg.p0 p0Var = new zg.p0();
                            long longValue = l4.longValue();
                            p0Var.g = longValue;
                            p0Var.h = longValue;
                            arrayList11.add(p0Var);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            h71Var2.A1.add(zg.p0.b((String) it2.next()));
                        }
                        h71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj2 = arrayList12.get(i10);
                            i10++;
                            h71Var2.C1.addAll((ArrayList) obj2);
                        }
                        h71Var2.q0.E(true ^ z13);
                    }
                });
                break;
        }
    }

    public /* synthetic */ fl0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.d1 d1Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.e = iArr;
        this.f = tL_messages_requestUrlAuth;
        this.g = f3Var;
        this.c = z10;
        this.b = str;
        this.i = urlAuthResult;
        this.j = strArr;
        this.d = z11;
        this.k = d1Var;
        this.h = str2;
        this.l = e6Var;
    }
}
