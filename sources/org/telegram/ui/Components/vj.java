package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vj extends tj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public vj(org.telegram.ui.ts tsVar, Context context, HashMap hashMap) {
        this.c = 1;
        this.n = tsVar;
        this.f = new ArrayList();
        this.d = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((org.telegram.ui.ps) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        switch (this.c) {
            case 0:
                if (e1Var.f == 1) {
                }
                break;
        }
        return true;
    }

    public wj E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (wj) arrayList2.get(i7);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i7 == size || i7 == size + 1 || (f10 = i5.c.f(2, i7, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (wj) arrayList.get(f10);
    }

    @Override // v4.h0
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

    @Override // v4.h0
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

    @Override // v4.h0
    public void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((dk) this.n).Y();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = this.c;
        Object obj = this.n;
        String str = null;
        switch (i10) {
            case 0:
                dk dkVar = (dk) obj;
                int i11 = e1Var.f;
                View view = e1Var.a;
                if (i11 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (!dkVar.d0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746368, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131746367, null));
                        break;
                    }
                } else if (i11 == 1) {
                    wj E = E(i7);
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                    int i12 = E.a;
                    if (i12 != 0) {
                        g7Var.d(E.b, E.c, null, null, i12, i7 != this.e.size() - 1);
                    } else {
                        g7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        g7Var.b(false, !dkVar.V);
                        break;
                    } else {
                        g7Var.b(dkVar.S.containsKey(file.toString()), !dkVar.V);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.e.get(i7);
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) e1Var.a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.ts.a0(psVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.ts) obj).h) {
                    str = "+" + psVar.c;
                }
                v9Var.c(m10, str, false, false);
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View n4Var;
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = ((dk) this.n).a;
                Context context = this.d;
                if (i7 == 0) {
                    n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                        }
                        return new cj0(view);
                    }
                    n4Var = new org.telegram.ui.Cells.g7(1, context, e6Var);
                }
                view = n4Var;
                return new cj0(view);
            default:
                return new cj0(org.telegram.ui.ts.Z(this.d));
        }
    }

    public vj(dk dkVar, Context context) {
        this.c = 0;
        this.n = dkVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
