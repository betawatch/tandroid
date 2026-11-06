package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class oj extends oj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public oj(org.telegram.ui.qs qsVar, Context context, HashMap hashMap) {
        this.c = 1;
        this.n = qsVar;
        this.f = new ArrayList();
        this.d = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((org.telegram.ui.ms) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                if (d1Var.f == 1) {
                }
                break;
        }
        return true;
    }

    public pj E(int i7) {
        int g10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (pj) arrayList2.get(i7);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i7 == size || i7 == size + 1 || (g10 = jg.g.g(2, i7, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (pj) arrayList.get(g10);
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final int d(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i7 == size) {
                    return 2;
                }
                return i7 == size + 1 ? 0 : 1;
            default:
                return 0;
        }
    }

    @Override // v4.g0
    public void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((vj) this.n).X();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = this.c;
        Object obj = this.n;
        String str = null;
        switch (i10) {
            case 0:
                vj vjVar = (vj) obj;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (!vjVar.c0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746367, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746366, null));
                        break;
                    }
                } else if (i11 == 1) {
                    pj E = E(i7);
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                    int i12 = E.a;
                    if (i12 != 0) {
                        h7Var.d(E.b, E.c, null, null, i12, i7 != this.e.size() - 1);
                    } else {
                        h7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        h7Var.b(false, !vjVar.U);
                        break;
                    } else {
                        h7Var.b(vjVar.R.containsKey(file.toString()), !vjVar.U);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.e.get(i7);
                org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) d1Var.a;
                CharSequence m10 = org.telegram.messenger.i6.m(org.telegram.ui.qs.a0(msVar), w9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.qs) obj).h) {
                    str = "+" + msVar.c;
                }
                w9Var.c(m10, str, false, false);
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.ActionBar.f6 f6Var = ((vj) this.n).a;
                Context context = this.d;
                if (i7 == 0) {
                    n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new xi0(view);
                    }
                    n4Var = new org.telegram.ui.Cells.h7(1, context, f6Var);
                }
                view = n4Var;
                return new xi0(view);
            default:
                return new xi0(org.telegram.ui.qs.Z(this.d));
        }
    }

    public oj(vj vjVar, Context context) {
        this.c = 0;
        this.n = vjVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
