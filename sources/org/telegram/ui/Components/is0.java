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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class is0 extends sj0 {
    public int F;
    public final /* synthetic */ ws0 H;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public dh.n0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int E = -1;
    public final sp0 G = new sp0(this, 5);

    public is0(ws0 ws0Var, Context context) {
        this.H = ws0Var;
        this.c = context;
        this.d = ws0Var.y1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(dh.n0 n0Var, String str) {
        String str2;
        if (TextUtils.equals(str, this.x)) {
            dh.n0 n0Var2 = this.y;
            if (n0Var2 == null && n0Var == null) {
                return;
            }
            if (n0Var2 != null && n0Var2.equals(n0Var)) {
                return;
            }
        }
        this.x = str;
        this.y = n0Var;
        int i3 = this.E;
        int i10 = this.d;
        if (i3 >= 0) {
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
            org.telegram.messenger.nv G1 = org.telegram.messenger.hp.s1(i10).G1();
            ArrayList arrayList2 = G1.j;
            int i12 = G1.a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String O3 = org.telegram.messenger.g0.O3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList2.get(i13);
                    long j10 = mvVar.a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.bd.M0(2131754252, null);
                    } else if (j10 == org.telegram.messenger.h10.i(i12).e()) {
                        str2 = org.telegram.messenger.bd.M0(2131748311, null);
                        str3 = org.telegram.messenger.bd.M0(2131745911, null);
                    } else if (mvVar.a >= 0) {
                        str2 = org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(mvVar.a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-mvVar.a));
                        str2 = M0 != null ? M0.title : "";
                    }
                    if (str2 != null) {
                        String O32 = org.telegram.messenger.g0.O3(str2.toLowerCase());
                        if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                            arrayList3.add(mvVar);
                        } else if (str3 != null) {
                            String O33 = org.telegram.messenger.g0.O3(str3.toLowerCase());
                            if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                arrayList3.add(mvVar);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            rr0[] rr0VarArr = this.H.n0;
            if (i11 >= rr0VarArr.length) {
                break;
            }
            rr0 rr0Var = rr0VarArr[i11];
            if (rr0Var.F == 11) {
                rr0Var.w.e(true, true);
            }
            i11++;
        }
        if (this.y == null) {
            f();
        }
        sp0 sp0Var = this.G;
        org.telegram.messenger.g0.r(sp0Var);
        org.telegram.messenger.g0.i3(sp0Var, this.y != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i3 = this.d;
        tL_messages_search.peer = org.telegram.messenger.hp.s1(i3).j1(org.telegram.messenger.h10.i(i3).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        dh.n0 n0Var = this.y;
        if (n0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(n0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i10 = this.F + 1;
        this.F = i10;
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(this, i10, tL_messages_search, 19);
        if (this.y == null) {
            f4Var.run();
            return;
        }
        org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
        a02.a.c(new org.telegram.messenger.gr(a02, this.x, 0L, this.y.g(), 100, this.n.size(), false, new ei.f2(1, this, f4Var)));
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        rr0[] rr0VarArr = this.H.n0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i3 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList3.get(i3);
            if (ziVar != null && !hashSet.contains(Integer.valueOf(ziVar.f1()))) {
                hashSet.add(Integer.valueOf(ziVar.f1()));
                arrayList2.add(ziVar);
            }
            i3++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i10);
            if (ziVar2 != null && !hashSet.contains(Integer.valueOf(ziVar2.f1()))) {
                hashSet.add(Integer.valueOf(ziVar2.f1()));
                arrayList2.add(ziVar2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < rr0VarArr.length; i11++) {
                if (rr0VarArr[i11].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    yh.l lVar = rr0VarArr[i11].w.d;
                    if (this.y == null || !TextUtils.isEmpty(this.x)) {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131748174, this.x);
                    } else {
                        String M0 = org.telegram.messenger.bd.M0(2131748172, null);
                        dh.n0 n0Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = rr0VarArr[i11].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(n0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new p5(n0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = n0Var.f;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    }
                    lVar.setText(a02);
                    rr0VarArr[i11].w.f.setVisibility(8);
                    rr0VarArr[i11].w.e(false, true);
                }
            }
        }
        f();
    }

    @Override // u4.h0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // u4.h0
    public final long c(int i3) {
        int hash;
        if (i3 < 0) {
            return i3;
        }
        ArrayList arrayList = this.e;
        if (i3 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.mv) arrayList.get(i3)).a));
        } else {
            int size = i3 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.zi) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.zi) arrayList2.get(size)).f1()));
        }
        return hash;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 23;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (i3 < 0) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.t2 = i3 + 1 < b();
            ArrayList arrayList = this.e;
            if (i3 < arrayList.size()) {
                org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i3);
                t2Var.d0(mvVar.a, mvVar.d, mvVar.c(), false, false);
                return;
            }
            int size = i3 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(size);
                t2Var.d0(ziVar.Q1(), ziVar, ziVar.k.date, false, false);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        kg.x xVar = new kg.x(1, this.c, true);
        ws0 ws0Var = this.H;
        xVar.setDialogCellDelegate(ws0Var);
        xVar.s0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, xVar, ws0Var.I1);
        return new bj0(xVar);
    }
}
