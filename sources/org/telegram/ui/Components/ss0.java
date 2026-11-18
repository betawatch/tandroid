package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ss0 extends bk0 {
    public int F;
    public final /* synthetic */ gt0 H;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public ch.p0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int E = -1;
    public final ap0 G = new ap0(this, 6);

    public ss0(gt0 gt0Var, Context context) {
        this.H = gt0Var;
        this.c = context;
        this.d = gt0Var.y1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(ch.p0 p0Var, String str) {
        String str2;
        if (TextUtils.equals(str, this.x)) {
            ch.p0 p0Var2 = this.y;
            if (p0Var2 == null && p0Var == null) {
                return;
            }
            if (p0Var2 != null && p0Var2.equals(p0Var)) {
                return;
            }
        }
        this.x = str;
        this.y = p0Var;
        int i7 = this.E;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.E, true);
            this.E = -1;
        }
        this.n.clear();
        this.h.clear();
        this.f.clear();
        int i11 = 0;
        this.w = 0;
        this.s = false;
        this.r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.y == null) {
            org.telegram.messenger.pv I1 = org.telegram.messenger.mp.u1(i10).I1();
            ArrayList arrayList2 = I1.j;
            int i12 = I1.a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String M3 = org.telegram.messenger.g0.M3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList2.get(i13);
                    long j3 = ovVar.a;
                    String str3 = null;
                    if (j3 == 2666000) {
                        str2 = org.telegram.messenger.gd.M0(2131754250, null);
                    } else if (j3 == org.telegram.messenger.j10.i(i12).e()) {
                        str2 = org.telegram.messenger.gd.M0(2131748111, null);
                        str3 = org.telegram.messenger.gd.M0(2131745706, null);
                    } else if (ovVar.a >= 0) {
                        str2 = org.telegram.messenger.o10.q(org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(ovVar.a)));
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(-ovVar.a));
                        str2 = O0 != null ? O0.title : "";
                    }
                    if (str2 != null) {
                        String M32 = org.telegram.messenger.g0.M3(str2.toLowerCase());
                        if (M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                            arrayList3.add(ovVar);
                        } else if (str3 != null) {
                            String M33 = org.telegram.messenger.g0.M3(str3.toLowerCase());
                            if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                arrayList3.add(ovVar);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            bs0[] bs0VarArr = this.H.n0;
            if (i11 >= bs0VarArr.length) {
                break;
            }
            bs0 bs0Var = bs0VarArr[i11];
            if (bs0Var.F == 11) {
                bs0Var.w.e(true, true);
            }
            i11++;
        }
        if (this.y == null) {
            f();
        }
        ap0 ap0Var = this.G;
        org.telegram.messenger.g0.r(ap0Var);
        org.telegram.messenger.g0.h3(ap0Var, this.y != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.j10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        ch.p0 p0Var = this.y;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.fj) i5.c.h(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i10 = this.F + 1;
        this.F = i10;
        org.telegram.ui.b0 b0Var = new org.telegram.ui.b0(this, i10, tL_messages_search, 22);
        if (this.y == null) {
            b0Var.run();
            return;
        }
        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
        a02.a.c(new org.telegram.messenger.jr(a02, this.x, 0L, this.y.g(), 100, this.n.size(), false, new fi.w1(1, this, b0Var)));
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        bs0[] bs0VarArr = this.H.n0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i7 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList3.get(i7);
            if (fjVar != null && !hashSet.contains(Integer.valueOf(fjVar.e1()))) {
                hashSet.add(Integer.valueOf(fjVar.e1()));
                arrayList2.add(fjVar);
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(i10);
            if (fjVar2 != null && !hashSet.contains(Integer.valueOf(fjVar2.e1()))) {
                hashSet.add(Integer.valueOf(fjVar2.e1()));
                arrayList2.add(fjVar2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < bs0VarArr.length; i11++) {
                if (bs0VarArr[i11].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    xh.l lVar = bs0VarArr[i11].w.d;
                    if (this.y == null || !TextUtils.isEmpty(this.x)) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131747974, this.x);
                    } else {
                        String M0 = org.telegram.messenger.gd.M0(2131747972, null);
                        ch.p0 p0Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = bs0VarArr[i11].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(p0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new x5(p0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = p0Var.f;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    }
                    lVar.setText(a02);
                    bs0VarArr[i11].w.f.setVisibility(8);
                    bs0VarArr[i11].w.e(false, true);
                }
            }
        }
        f();
    }

    @Override // v4.i0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.i0
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.ov) arrayList.get(i7)).a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.fj) arrayList2.get(size)).P1()), Integer.valueOf(((org.telegram.messenger.fj) arrayList2.get(size)).e1()));
        }
        return hash;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 23;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 < 0) {
            return;
        }
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.t2 = i7 + 1 < b();
            ArrayList arrayList = this.e;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.ov ovVar = (org.telegram.messenger.ov) arrayList.get(i7);
                t2Var.d0(ovVar.a, ovVar.d, ovVar.c(), false, false);
                return;
            }
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(size);
                t2Var.d0(fjVar.P1(), fjVar, fjVar.k.date, false, false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.c, true);
        gt0 gt0Var = this.H;
        a0Var.setDialogCellDelegate(gt0Var);
        a0Var.s0 = true;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, a0Var, gt0Var.I1);
        return new kj0(a0Var);
    }
}
