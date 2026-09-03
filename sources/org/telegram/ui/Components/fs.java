package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fs {
    public final int a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ gs j;

    public fs(gs gsVar, int i10, ArrayList arrayList) {
        this.j = gsVar;
        this.a = i10;
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
        for (int i10 = 0; i10 < this.g; i10++) {
            if (!this.d[i10] || ((zArr = this.e) != null && !zArr[i10])) {
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
        int i10;
        boolean[] zArr;
        boolean[] zArr2;
        boolean z4 = false;
        while (true) {
            int i11 = this.g;
            zArr = this.d;
            if (i10 >= i11) {
                break;
            } else {
                i10 = (zArr[i10] && ((zArr2 = this.e) == null || zArr2[i10])) ? 0 : i10 + 1;
            }
        }
        z4 = true;
        Arrays.fill(zArr, !z4);
        f();
        this.j.U.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i10]) {
            boolean[] zArr2 = this.d;
            boolean z4 = zArr2[i10];
            zArr2[i10] = !z4;
            if (z4) {
                this.i--;
            } else {
                this.i++;
            }
            this.j.U.N(true);
        }
    }

    public final void f() {
        this.i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.g; i10++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.i++;
                }
            }
        }
    }

    public final void g() {
        TLObject tLObject;
        int i10 = this.g;
        if (i10 == 0) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i11]) {
                tLObject = (TLObject) this.c.get(i11);
                break;
            }
        }
        tLObject = null;
        String forcedFirstName = tLObject instanceof TLRPC.User ? UserObject.getForcedFirstName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        int i12 = this.a;
        if (i12 == 0) {
            this.b = LocaleController.getString(R.string.DeleteReportSpam);
            return;
        }
        if (i12 == 1) {
            this.b = b() ? LocaleController.getString(R.string.DeleteAllMessagesFromUsers) : LocaleController.formatString(R.string.DeleteAllFrom, forcedFirstName);
            return;
        }
        if (i12 == 3) {
            this.b = b() ? LocaleController.getString(R.string.DeleteAllReactionsFromUsers) : LocaleController.formatString(R.string.DeleteAllReactionsFrom, forcedFirstName);
        } else if (i12 == 2) {
            if (this.j.d0) {
                this.b = b() ? LocaleController.getString(R.string.DeleteRestrictUsers) : LocaleController.formatString(R.string.DeleteRestrict, forcedFirstName);
            } else {
                this.b = b() ? LocaleController.getString(R.string.DeleteBanUsers) : LocaleController.formatString(R.string.DeleteBan, forcedFirstName);
            }
        }
    }
}
