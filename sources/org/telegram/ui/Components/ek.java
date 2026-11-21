package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ek extends dk0 {
    public final /* synthetic */ int c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final /* synthetic */ Object n;

    public ek(org.telegram.ui.us usVar, Context context, HashMap hashMap) {
        this.c = 1;
        this.n = usVar;
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

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                if (f1Var.f == 1) {
                }
                break;
        }
        return true;
    }

    public fk E(int i7) {
        int f10;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i7 < size) {
            return (fk) arrayList2.get(i7);
        }
        if (!this.f.isEmpty() || arrayList.isEmpty() || i7 == size || i7 == size + 1 || (f10 = i5.c.f(2, i7, arrayList2)) >= arrayList.size()) {
            return null;
        }
        return (fk) arrayList.get(f10);
    }

    @Override // v4.i0
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

    @Override // v4.i0
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

    @Override // v4.i0
    public void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((mk) this.n).Y();
                break;
            default:
                super.f();
                break;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = this.c;
        Object obj = this.n;
        String str = null;
        switch (i10) {
            case 0:
                mk mkVar = (mk) obj;
                int i11 = f1Var.f;
                View view = f1Var.a;
                if (i11 == 0) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (!mkVar.d0) {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131746172, null));
                        break;
                    } else {
                        o4Var.setText(org.telegram.messenger.gd.N0(2131746171, null));
                        break;
                    }
                } else if (i11 == 1) {
                    fk E = E(i7);
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                    int i12 = E.a;
                    if (i12 != 0) {
                        i7Var.d(E.b, E.c, null, null, i12, i7 != this.e.size() - 1);
                    } else {
                        i7Var.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                    }
                    File file = E.f;
                    if (file == null) {
                        i7Var.b(false, !mkVar.V);
                        break;
                    } else {
                        i7Var.b(mkVar.S.containsKey(file.toString()), !mkVar.V);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ps psVar = (org.telegram.ui.ps) this.e.get(i7);
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) f1Var.a;
                CharSequence m10 = org.telegram.messenger.j6.m(org.telegram.ui.us.a0(psVar), x9Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((org.telegram.ui.us) obj).h) {
                    str = "+" + psVar.c;
                }
                x9Var.c(m10, str, false, false);
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View o4Var;
        View view;
        switch (this.c) {
            case 0:
                org.telegram.ui.ActionBar.h6 h6Var = ((mk) this.n).a;
                Context context = this.d;
                if (i7 == 0) {
                    o4Var = new org.telegram.ui.Cells.o4(context, h6Var);
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            view = new View(context);
                            view.setTag(-33024);
                        } else {
                            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                        }
                        return new mj0(view);
                    }
                    o4Var = new org.telegram.ui.Cells.i7(1, context, h6Var);
                }
                view = o4Var;
                return new mj0(view);
            default:
                return new mj0(org.telegram.ui.us.Z(this.d));
        }
    }

    public ek(mk mkVar, Context context) {
        this.c = 0;
        this.n = mkVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
