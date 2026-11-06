package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import di.k6;
import fi.h9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.oa;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.an;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m1 extends oj0 implements ls {
    public k6 D;
    public final Context c;
    public final an f;
    public int h;
    public int n;
    public final f6 s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = p10.s0;
    public final h9 E = new h9(this, 21);

    public m1(Context context, an anVar, f6 f6Var, int i7, boolean z9) {
        this.s = f6Var;
        this.c = context;
        this.f = anVar;
        this.w = i7;
        this.x = z9;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 2;
    }

    public final Object E(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i7);
    }

    @Override // v4.g0
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 < this.e.size() ? 0 : 1;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.x5 && objArr[0] == this.D) {
            f();
        }
    }

    @Override // v4.g0
    public final void f() {
        int b10 = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.r;
        int i10 = this.w;
        ArrayList arrayList2 = i10 == 0 ? ui.b0(i7).Y0 : oa.a(i7).b(i10).a;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            ij ijVar = (ij) arrayList2.get(i12);
            if ((!ijVar.A2() || ijVar.Q2) && !hashSet.contains(Integer.valueOf(ijVar.f1()))) {
                arrayList.add(ijVar);
                hashSet.add(Integer.valueOf(ijVar.f1()));
            }
        }
        int i13 = this.n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!oa.a(i7).b(i10).n && this.h != 0) {
                i11 = Utilities.j(oa.a(i7).b(i10).m - this.h, 3, 0);
            }
            this.n = i11;
        } else {
            if (!ui.b0(i7).W1() && this.h != 0) {
                i11 = Utilities.j(ui.b0(i7).j0() - this.h, 3, 0);
            }
            this.n = i11;
        }
        int b11 = b();
        if (b10 >= b11) {
            super.f();
            return;
        }
        if (i13 > 0) {
            k(b10 - i13, i13);
        }
        o(b10, b11 - b10);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10;
        int i11;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            if (i12 == 2) {
                ((l1) view).a(this.D);
                return;
            }
            return;
        }
        t2 t2Var = (t2) view;
        t2Var.s2 = true;
        ij ijVar = (ij) E(i7);
        long B0 = ij.B0(ijVar.k);
        int i13 = ijVar.k.date;
        if (this.x) {
            t2Var.r0 = true;
            long Q1 = ijVar.Q1();
            TLRPC.Message message = ijVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i10 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i11 = message.date;
            } else {
                if (i10 == 0) {
                    i11 = messageFwdHeader.saved_date;
                }
                z9 = false;
                B0 = Q1;
            }
            i10 = i11;
            z9 = false;
            B0 = Q1;
        } else {
            if (ijVar.Q3() || t3.o0(this.r, B0)) {
                B0 = ijVar.Z0();
            }
            z9 = true;
            i10 = i13;
        }
        t2Var.d0(B0, ijVar, i10, z9, false);
        t2Var.setDialogCellDelegate(new j1(this));
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View t2Var;
        View view;
        if (i7 != 0) {
            f6 f6Var = this.s;
            Context context = this.c;
            if (i7 == 1) {
                lz lzVar = new lz(context, f6Var);
                lzVar.setIsSingleCell(true);
                lzVar.setViewType(7);
                view = lzVar;
            } else if (i7 != 2) {
                t2Var = null;
            } else {
                view = new l1(context, f6Var);
            }
            t2Var = view;
        } else {
            t2Var = new t2(null, this.c, true, this.r, this.s);
        }
        return g.r(t2Var, t2Var, -1, -2);
    }
}
