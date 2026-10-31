package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pj extends sk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public pj(org.telegram.ui.rt rtVar, Context context, HashMap hashMap) {
        this.c = 1;
        this.n = rtVar;
        this.f = new ArrayList();
        this.d = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((org.telegram.ui.nt) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                if (c1Var.f == 1) {
                }
                break;
        }
        return true;
    }

    public qj E(int i10) {
        int e;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i10 < size) {
            return (qj) arrayList2.get(i10);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i10 == size || i10 == size + 1 || (e = sc.e.e(2, i10, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (qj) arrayList.get(e);
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.e.size();
                if (this.f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override // s4.g0
    public final int d(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i10 == size) {
                    return 2;
                }
                return i10 == size + 1 ? 0 : 1;
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((xj) this.n).W();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = this.c;
        Object obj = this.n;
        String str = null;
        switch (i11) {
            case 0:
                xj xjVar = (xj) obj;
                int i12 = c1Var.f;
                View view = c1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                    if (!xjVar.c0) {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131746383, null));
                        break;
                    } else {
                        p4Var.setText(org.telegram.messenger.cd.L0(2131746382, null));
                        break;
                    }
                } else if (i12 == 1) {
                    qj E = E(i10);
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                    int i13 = E.a;
                    if (i13 != 0) {
                        l7Var.d(E.b, E.c, null, null, i13, i10 != this.e.size() - 1);
                    } else {
                        l7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        l7Var.b(false, !xjVar.U);
                        break;
                    } else {
                        l7Var.b(xjVar.R.containsKey(file.toString()), !xjVar.U);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.e.get(i10);
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) c1Var.a;
                CharSequence m10 = org.telegram.messenger.k6.m(org.telegram.ui.rt.Z(ntVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.rt) obj).h) {
                    str = "+" + ntVar.c;
                }
                x9Var.c(m10, str, false, false);
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View p4Var;
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.ActionBar.p6 p6Var = ((xj) this.n).a;
                Context context = this.d;
                if (i10 == 0) {
                    p4Var = new org.telegram.ui.Cells.p4(context, p6Var);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new ck0(view);
                    }
                    p4Var = new org.telegram.ui.Cells.l7(1, context, p6Var);
                }
                view = p4Var;
                return new ck0(view);
            default:
                return new ck0(org.telegram.ui.rt.Y(this.d));
        }
    }

    public pj(xj xjVar, Context context) {
        this.c = 0;
        this.n = xjVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
