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
import org.telegram.ui.c70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public /* synthetic */ o4(g5 g5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i3, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = g5Var;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i3;
        this.g = hashMap3;
        this.b = z10;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.j;
                boolean[] zArr = (boolean[]) this.k;
                HashMap hashMap2 = (HashMap) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.l;
                int i3 = this.c;
                HashMap hashMap3 = (HashMap) this.g;
                boolean z12 = this.b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.m;
                HashMap hashMap5 = (HashMap) this.i;
                boolean z13 = true;
                g5Var.n0++;
                if (tL_error == null) {
                    if (r2.a) {
                        a8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        z11 = true;
                        z10 = false;
                    } else {
                        int i10 = 0;
                        while (i10 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i10).longValue()));
                            i10++;
                            z13 = z13;
                        }
                        z11 = z13;
                        z10 = false;
                        z10 = false;
                        zArr[0] = z11;
                        if (r2.a) {
                            a8.b("result has retry contacts");
                        }
                    }
                    for (int i11 = z10 ? 1 : 0; i11 < tL_contacts_importedContacts.popular_invites.size(); i11++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i11);
                        d5 d5Var = (d5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (d5Var != null) {
                            d5Var.l = tL_popularContact.importers;
                        }
                    }
                    boolean z14 = z11;
                    g5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z14, z14);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = z10 ? 1 : 0;
                    while (i12 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i12).user_id;
                        arrayList2.add(tL_contact);
                        i12++;
                        g5Var = g5Var;
                    }
                    g0.h3(new vf(g5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    boolean z15 = false;
                    int i13 = 0;
                    while (i13 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i13).client_id));
                        i13++;
                        z15 = z15;
                    }
                    z10 = z15;
                    zArr[z10 ? 1 : 0] = true;
                    if (r2.a) {
                        k2.p1.w(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (g5Var.n0 == i3) {
                    if (!hashMap.isEmpty()) {
                        boolean z16 = z10;
                        g5Var.getMessagesStorage().Z0(hashMap, z16, z16);
                    }
                    Utilities.d.c(new rg(g5Var, hashMap3, hashMap2, z12, hashMap4, arrayList, hashMap5, zArr));
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) this.e;
                boolean z17 = this.b;
                Long l10 = (Long) this.f;
                sf.b bVar = (sf.b) this.g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.i;
                Integer num2 = (Integer) this.j;
                byte[] bArr = (byte[]) this.k;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.l;
                int i14 = this.c;
                Bundle bundle = (Bundle) this.m;
                String str = LaunchActivity.E1;
                g0.h3(new c70(launchActivity, lyVar, tLObject, z17, l10, bVar, l11, num, num2, bArr, d2Var, i14, bundle));
                break;
        }
    }

    public /* synthetic */ o4(LaunchActivity launchActivity, org.telegram.ui.ly lyVar, boolean z10, Long l10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3, Bundle bundle) {
        this.d = launchActivity;
        this.e = lyVar;
        this.b = z10;
        this.f = l10;
        this.g = bVar;
        this.h = l11;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = d2Var;
        this.c = i3;
        this.m = bundle;
    }
}
