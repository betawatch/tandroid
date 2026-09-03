package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lj extends ol0 {
    public final int r = UserConfig.selectedAccount;
    public final Context s;
    public final /* synthetic */ sj v;

    public lj(sj sjVar, Context context) {
        this.v = sjVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i12).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i12).phoneBookSectionsArray;
        if (i11 < arrayList.size()) {
            return hashMap.get(arrayList.get(i11)).size();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i13).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i13).phoneBookSectionsArray;
        if (i12 < arrayList.size()) {
            ArrayList<Object> arrayList2 = hashMap.get(arrayList.get(i12));
            if (i11 < arrayList2.size()) {
                return arrayList2.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.ol0
    public final int R() {
        return ContactsController.getInstance(this.r).phoneBookSectionsArray.size() + 2;
    }

    @Override // org.telegram.ui.Components.ol0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.ol0
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        if (i10 == 0 || i10 == R() - 1) {
            return false;
        }
        int i12 = this.r;
        return i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 + (-1))).size();
    }

    @Override // org.telegram.ui.Components.ol0
    public final void W(int i10, int i11, f2.m1 m1Var) {
        TLRPC.User user;
        if (m1Var.f == 0) {
            rj rjVar = (rj) m1Var.a;
            Object O = O(i10, i11);
            boolean z4 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z4 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new jj(contact, 0), z4);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                rjVar.a(user, null, new kj(0, user), z4);
            }
            boolean containsKey = this.v.w.containsKey(hj.a(O));
            np npVar = rjVar.d;
            if (npVar.getVisibility() != 0) {
                npVar.setVisibility(0);
            }
            npVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.ol0, f2.p0
    public final void l() {
        X(false);
        this.v.N();
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View rjVar;
        Context context = this.s;
        if (i10 == 0) {
            rjVar = new rj(context, this.v.a);
        } else if (i10 != 1) {
            rjVar = new View(context);
            rjVar.setTag(-33024);
        } else {
            rjVar = new View(context);
            rjVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            rjVar.setTag(-33024);
        }
        return new el0(rjVar);
    }
}
