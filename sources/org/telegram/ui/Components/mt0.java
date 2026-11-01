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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mt0 extends tk0 {
    public int E;
    public final /* synthetic */ au0 G;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public sg.o0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int D = -1;
    public final vo0 F = new vo0(this, 8);

    public mt0(au0 au0Var, Context context) {
        this.G = au0Var;
        this.c = context;
        this.d = au0Var.x1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(String str, sg.o0 o0Var) {
        String str2;
        if (TextUtils.equals(str, this.x)) {
            sg.o0 o0Var2 = this.y;
            if (o0Var2 == null && o0Var == null) {
                return;
            }
            if (o0Var2 != null && o0Var2.equals(o0Var)) {
                return;
            }
        }
        this.x = str;
        this.y = o0Var;
        int i10 = this.D;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.D, true);
            this.D = -1;
        }
        this.n.clear();
        this.h.clear();
        this.f.clear();
        int i12 = 0;
        this.w = 0;
        this.s = false;
        this.r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.y == null) {
            org.telegram.messenger.hw F1 = org.telegram.messenger.wp.r1(i11).F1();
            ArrayList arrayList2 = F1.j;
            int i13 = F1.a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String N3 = org.telegram.messenger.i0.N3(str.toLowerCase());
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList2.get(i14);
                    long j10 = gwVar.a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.dd.L0(2131754252, null);
                    } else if (j10 == org.telegram.messenger.e20.i(i13).e()) {
                        str2 = org.telegram.messenger.dd.L0(2131748318, null);
                        str3 = org.telegram.messenger.dd.L0(2131745918, null);
                    } else if (gwVar.a >= 0) {
                        str2 = org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(gwVar.a)));
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-gwVar.a));
                        str2 = L0 != null ? L0.title : "";
                    }
                    if (str2 != null) {
                        String N32 = org.telegram.messenger.i0.N3(str2.toLowerCase());
                        if (N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                            arrayList3.add(gwVar);
                        } else if (str3 != null) {
                            String N33 = org.telegram.messenger.i0.N3(str3.toLowerCase());
                            if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                arrayList3.add(gwVar);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            ts0[] ts0VarArr = this.G.m0;
            if (i12 >= ts0VarArr.length) {
                break;
            }
            ts0 ts0Var = ts0VarArr[i12];
            if (ts0Var.E == 11) {
                ts0Var.w.e(true, true);
            }
            i12++;
        }
        if (this.y == null) {
            f();
        }
        vo0 vo0Var = this.F;
        org.telegram.messenger.i0.r(vo0Var);
        org.telegram.messenger.i0.h3(vo0Var, this.y != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = org.telegram.messenger.wp.r1(i10).i1(org.telegram.messenger.e20.i(i10).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        sg.o0 o0Var = this.y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.kj) i0.a.g(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i11 = this.E + 1;
        this.E = i11;
        ki0 ki0Var = new ki0(this, i11, tL_messages_search, 5);
        if (this.y == null) {
            ki0Var.run();
            return;
        }
        org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i10);
        a02.a.c(new org.telegram.messenger.yr(a02, this.x, 0L, this.y.g(), 100, this.n.size(), false, new kt0(0, this, ki0Var)));
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        ts0[] ts0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i10 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList3.get(i10);
            if (kjVar != null && !hashSet.contains(Integer.valueOf(kjVar.f1()))) {
                hashSet.add(Integer.valueOf(kjVar.f1()));
                arrayList2.add(kjVar);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.n;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i11);
            if (kjVar2 != null && !hashSet.contains(Integer.valueOf(kjVar2.f1()))) {
                hashSet.add(Integer.valueOf(kjVar2.f1()));
                arrayList2.add(kjVar2);
            }
            i11++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < ts0VarArr.length; i12++) {
                if (ts0VarArr[i12].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    nh.p pVar = ts0VarArr[i12].w.d;
                    if (this.y == null || !TextUtils.isEmpty(this.x)) {
                        a02 = org.telegram.messenger.dd.a0(null, null, 2131748182, this.x);
                    } else {
                        String L0 = org.telegram.messenger.dd.L0(2131748180, null);
                        sg.o0 o0Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = ts0VarArr[i12].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(o0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new o5(o0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = o0Var.f;
                        }
                        a02 = org.telegram.messenger.i0.J2(L0, charSequence, "%s");
                    }
                    pVar.setText(a02);
                    ts0VarArr[i12].w.f.setVisibility(8);
                    ts0VarArr[i12].w.e(false, true);
                }
            }
        }
        f();
    }

    @Override // s4.g0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.g0
    public final long c(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.gw) arrayList.get(i10)).a));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.kj) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.kj) arrayList2.get(size)).f1()));
        }
        return hash;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 23;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (i10 < 0) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.v2) {
            org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
            v2Var.s2 = i10 + 1 < b();
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList.get(i10);
                v2Var.d0(gwVar.a, gwVar.d, gwVar.c(), false, false);
                return;
            }
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(size);
                v2Var.d0(kjVar.Q1(), kjVar, kjVar.k.date, false, false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        lt0 lt0Var = new lt0(0, this.c, true);
        au0 au0Var = this.G;
        lt0Var.setDialogCellDelegate(au0Var);
        lt0Var.r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, lt0Var, au0Var.H1);
        return new dk0(lt0Var);
    }
}
