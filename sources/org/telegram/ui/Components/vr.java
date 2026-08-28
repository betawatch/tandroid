package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vr {
    public final int a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ wr j;

    public vr(wr wrVar, int i9, ArrayList arrayList) {
        this.j = wrVar;
        this.a = i9;
        int size = arrayList.size();
        this.g = size;
        this.i = 0;
        if (size > 0) {
            this.c = arrayList;
            this.d = new boolean[size];
            this.f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i9 = 0; i9 < this.g; i9++) {
            if (!this.d[i9] || ((zArr = this.e) != null && !zArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return (this.e != null ? this.h : this.g) > 1;
    }

    public final boolean c() {
        return (this.e != null ? this.h : this.g) > 0;
    }

    public final void d() {
        int i9;
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        while (true) {
            int i10 = this.g;
            zArr = this.d;
            if (i9 >= i10) {
                break;
            } else {
                i9 = (zArr[i9] && ((zArr2 = this.e) == null || zArr2[i9])) ? 0 : i9 + 1;
            }
        }
        z10 = true;
        Arrays.fill(zArr, !z10);
        f();
        this.j.T.N(true);
    }

    public final void e(int i9) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i9]) {
            boolean[] zArr2 = this.d;
            boolean z10 = zArr2[i9];
            zArr2[i9] = !z10;
            if (z10) {
                this.i--;
            } else {
                this.i++;
            }
            this.j.T.N(true);
        }
    }

    public final void f() {
        this.i = 0;
        this.h = 0;
        for (int i9 = 0; i9 < this.g; i9++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i9]) {
                    this.i++;
                }
            } else if (zArr[i9]) {
                this.h++;
                if (zArr2[i9]) {
                    this.i++;
                }
            }
        }
    }

    public final void g() {
        TLObject tLObject;
        int i9 = this.g;
        if (i9 == 0) {
            return;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i10]) {
                tLObject = (TLObject) this.c.get(i10);
                break;
            }
        }
        tLObject = null;
        String forcedFirstName = tLObject instanceof TLRPC.User ? UserObject.getForcedFirstName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        int i11 = this.a;
        if (i11 == 0) {
            this.b = LocaleController.getString(R.string.DeleteReportSpam);
            return;
        }
        if (i11 == 1) {
            this.b = b() ? LocaleController.getString(R.string.DeleteAllMessagesFromUsers) : LocaleController.formatString(R.string.DeleteAllFrom, forcedFirstName);
            return;
        }
        if (i11 == 3) {
            this.b = b() ? LocaleController.getString(R.string.DeleteAllReactionsFromUsers) : LocaleController.formatString(R.string.DeleteAllReactionsFrom, forcedFirstName);
        } else if (i11 == 2) {
            if (this.j.c0) {
                this.b = b() ? LocaleController.getString(R.string.DeleteRestrictUsers) : LocaleController.formatString(R.string.DeleteRestrict, forcedFirstName);
            } else {
                this.b = b() ? LocaleController.getString(R.string.DeleteBanUsers) : LocaleController.formatString(R.string.DeleteBan, forcedFirstName);
            }
        }
    }
}
