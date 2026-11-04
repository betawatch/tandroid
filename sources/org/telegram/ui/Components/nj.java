package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nj extends sj0 {
    public final /* synthetic */ int c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public nj(org.telegram.ui.os osVar, Context context, HashMap hashMap) {
        this.c = 1;
        this.n = osVar;
        this.f = new ArrayList();
        this.d = context;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                this.f.add((org.telegram.ui.ks) it2.next());
            }
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                if (d1Var.f == 1) {
                }
                break;
        }
        return true;
    }

    public oj E(int i3) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i3 < size) {
            return (oj) arrayList2.get(i3);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i3 == size || i3 == size + 1 || (f10 = k2.p1.f(2, i3, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (oj) arrayList.get(f10);
    }

    @Override // u4.h0
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

    @Override // u4.h0
    public final int d(int i3) {
        switch (this.c) {
            case 0:
                if (i3 == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i3 == size) {
                    return 2;
                }
                return i3 == size + 1 ? 0 : 1;
            default:
                return 0;
        }
    }

    @Override // u4.h0
    public void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((uj) this.n).X();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = this.c;
        Object obj = this.n;
        String str = null;
        switch (i10) {
            case 0:
                uj ujVar = (uj) obj;
                int i11 = d1Var.f;
                View view = d1Var.a;
                if (i11 == 0) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (!ujVar.d0) {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131746376, null));
                        break;
                    } else {
                        n4Var.setText(org.telegram.messenger.bd.M0(2131746375, null));
                        break;
                    }
                } else if (i11 == 1) {
                    oj E = E(i3);
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                    int i12 = E.a;
                    if (i12 != 0) {
                        g7Var.d(E.b, E.c, null, null, i12, i3 != this.e.size() - 1);
                    } else {
                        g7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        g7Var.b(false, !ujVar.V);
                        break;
                    } else {
                        g7Var.b(ujVar.S.containsKey(file.toString()), !ujVar.V);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) this.e.get(i3);
                org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) d1Var.a;
                CharSequence m10 = org.telegram.messenger.i6.m(org.telegram.ui.os.a0(ksVar), v9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.os) obj).h) {
                    str = "+" + ksVar.c;
                }
                v9Var.c(m10, str, false, false);
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View n4Var;
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.ActionBar.e6 e6Var = ((uj) this.n).a;
                Context context = this.d;
                if (i3 == 0) {
                    n4Var = new org.telegram.ui.Cells.n4(context, e6Var);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
                        }
                        return new bj0(view);
                    }
                    n4Var = new org.telegram.ui.Cells.g7(1, context, e6Var);
                }
                view = n4Var;
                return new bj0(view);
            default:
                return new bj0(org.telegram.ui.os.Z(this.d));
        }
    }

    public nj(uj ujVar, Context context) {
        this.c = 0;
        this.n = ujVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
