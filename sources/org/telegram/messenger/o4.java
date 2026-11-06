package org.telegram.messenger;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i70;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Serializable i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Cloneable m;

    public /* synthetic */ o4(g5 g5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i7, HashMap hashMap3, boolean z9, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = g5Var;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i7;
        this.g = hashMap3;
        this.b = z9;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.j;
                boolean[] zArr = (boolean[]) this.k;
                HashMap hashMap2 = (HashMap) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.l;
                int i7 = this.c;
                HashMap hashMap3 = (HashMap) this.g;
                boolean z11 = this.b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.m;
                HashMap hashMap5 = (HashMap) this.i;
                boolean z12 = true;
                g5Var.m0++;
                if (tL_error == null) {
                    if (r2.a) {
                        a8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        z10 = true;
                        z9 = false;
                    } else {
                        int i10 = 0;
                        while (i10 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i10).longValue()));
                            i10++;
                            z12 = z12;
                        }
                        z10 = z12;
                        z9 = false;
                        z9 = false;
                        zArr[0] = z10;
                        if (r2.a) {
                            a8.b("result has retry contacts");
                        }
                    }
                    for (int i11 = z9 ? 1 : 0; i11 < tL_contacts_importedContacts.popular_invites.size(); i11++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i11);
                        d5 d5Var = (d5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (d5Var != null) {
                            d5Var.l = tL_popularContact.importers;
                        }
                    }
                    boolean z13 = z10;
                    g5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z13, z13);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = z9 ? 1 : 0;
                    while (i12 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i12).user_id;
                        arrayList2.add(tL_contact);
                        i12++;
                        g5Var = g5Var;
                    }
                    g0.h3(new dg(g5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    boolean z14 = false;
                    int i13 = 0;
                    while (i13 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i13).client_id));
                        i13++;
                        z14 = z14;
                    }
                    z9 = z14;
                    zArr[z9 ? 1 : 0] = true;
                    if (r2.a) {
                        org.telegram.ui.Cells.f1.u(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (g5Var.m0 == i7) {
                    if (!hashMap.isEmpty()) {
                        boolean z15 = z9;
                        g5Var.getMessagesStorage().Z0(hashMap, z15, z15);
                    }
                    Utilities.d.c(new zg(g5Var, hashMap3, hashMap2, z11, hashMap4, arrayList, hashMap5, zArr));
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                org.telegram.ui.q10 q10Var = (org.telegram.ui.q10) this.e;
                boolean z16 = this.b;
                Long l10 = (Long) this.f;
                vf.b bVar = (vf.b) this.g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.i;
                Integer num2 = (Integer) this.j;
                byte[] bArr = (byte[]) this.k;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.l;
                int i14 = this.c;
                Bundle bundle = (Bundle) this.m;
                String str = LaunchActivity.B1;
                g0.h3(new i70(launchActivity, q10Var, tLObject, z16, l10, bVar, l11, num, num2, bArr, f2Var, i14, bundle));
                break;
        }
    }

    public /* synthetic */ o4(LaunchActivity launchActivity, org.telegram.ui.q10 q10Var, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.d = launchActivity;
        this.e = q10Var;
        this.b = z9;
        this.f = l10;
        this.g = bVar;
        this.h = l11;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = f2Var;
        this.c = i7;
        this.m = bundle;
    }
}
