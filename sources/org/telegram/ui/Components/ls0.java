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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ls0 extends pj0 {
    public int E;
    public final /* synthetic */ zs0 G;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public ch.o0 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int D = -1;
    public final kr0 F = new kr0(this, 3);

    public ls0(zs0 zs0Var, Context context) {
        this.G = zs0Var;
        this.c = context;
        this.d = zs0Var.x1.getCurrentAccount();
        C(true);
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(ch.o0 o0Var, String str) {
        String str2;
        if (TextUtils.equals(str, this.x)) {
            ch.o0 o0Var2 = this.y;
            if (o0Var2 == null && o0Var == null) {
                return;
            }
            if (o0Var2 != null && o0Var2.equals(o0Var)) {
                return;
            }
        }
        this.x = str;
        this.y = o0Var;
        int i7 = this.D;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.D, true);
            this.D = -1;
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
            org.telegram.messenger.vv G1 = org.telegram.messenger.qp.s1(i10).G1();
            ArrayList arrayList2 = G1.j;
            int i12 = G1.a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String O3 = org.telegram.messenger.g0.O3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList2.get(i13);
                    long j3 = uvVar.a;
                    String str3 = null;
                    if (j3 == 2666000) {
                        str2 = org.telegram.messenger.id.M0(2131754252, null);
                    } else if (j3 == org.telegram.messenger.p10.i(i12).e()) {
                        str2 = org.telegram.messenger.id.M0(2131748303, null);
                        str3 = org.telegram.messenger.id.M0(2131745901, null);
                    } else if (uvVar.a >= 0) {
                        str2 = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(uvVar.a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-uvVar.a));
                        str2 = M0 != null ? M0.title : "";
                    }
                    if (str2 != null) {
                        String O32 = org.telegram.messenger.g0.O3(str2.toLowerCase());
                        if (O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                            arrayList3.add(uvVar);
                        } else if (str3 != null) {
                            String O33 = org.telegram.messenger.g0.O3(str3.toLowerCase());
                            if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                arrayList3.add(uvVar);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            ur0[] ur0VarArr = this.G.m0;
            if (i11 >= ur0VarArr.length) {
                break;
            }
            ur0 ur0Var = ur0VarArr[i11];
            if (ur0Var.E == 11) {
                ur0Var.w.e(true, true);
            }
            i11++;
        }
        if (this.y == null) {
            f();
        }
        kr0 kr0Var = this.F;
        org.telegram.messenger.g0.r(kr0Var);
        org.telegram.messenger.g0.i3(kr0Var, this.y != null ? 60L : 600L);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.p10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        ch.o0 o0Var = this.y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i10 = this.E + 1;
        this.E = i10;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i10, tL_messages_search, 18);
        if (this.y == null) {
            q8Var.run();
            return;
        }
        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
        a02.a.c(new org.telegram.messenger.or(a02, this.x, 0L, this.y.g(), 100, this.n.size(), false, new di.b2(1, this, q8Var)));
    }

    public final void G(boolean z9) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        ur0[] ur0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i7 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList3.get(i7);
            if (ijVar != null && !hashSet.contains(Integer.valueOf(ijVar.e1()))) {
                hashSet.add(Integer.valueOf(ijVar.e1()));
                arrayList2.add(ijVar);
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i10);
            if (ijVar2 != null && !hashSet.contains(Integer.valueOf(ijVar2.e1()))) {
                hashSet.add(Integer.valueOf(ijVar2.e1()));
                arrayList2.add(ijVar2);
            }
            i10++;
        }
        if (!z9 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < ur0VarArr.length; i11++) {
                if (ur0VarArr[i11].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    xh.l lVar = ur0VarArr[i11].w.d;
                    if (this.y == null || !TextUtils.isEmpty(this.x)) {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131748166, this.x);
                    } else {
                        String M0 = org.telegram.messenger.id.M0(2131748164, null);
                        ch.o0 o0Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = ur0VarArr[i11].w.d.getPaint().getFontMetricsInt();
                        if (TextUtils.isEmpty(o0Var.f)) {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new r5(o0Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        } else {
                            charSequence = o0Var.f;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    }
                    lVar.setText(a02);
                    ur0VarArr[i11].w.f.setVisibility(8);
                    ur0VarArr[i11].w.e(false, true);
                }
            }
        }
        f();
    }

    @Override // v4.g0
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override // v4.g0
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.uv) arrayList.get(i7)).a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return size;
            }
            hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).P1()), Integer.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).e1()));
        }
        return hash;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 23;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 < 0) {
            return;
        }
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.t2) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
            t2Var.s2 = i7 + 1 < b();
            ArrayList arrayList = this.e;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
                t2Var.d0(uvVar.a, uvVar.d, uvVar.c(), false, false);
                return;
            }
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size < arrayList2.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(size);
                t2Var.d0(ijVar.P1(), ijVar, ijVar.k.date, false, false);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.c, true);
        zs0 zs0Var = this.G;
        a0Var.setDialogCellDelegate(zs0Var);
        a0Var.r0 = true;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, a0Var, zs0Var.H1);
        return new yi0(a0Var);
    }
}
