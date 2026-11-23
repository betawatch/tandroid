package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ e50 f;

    public c50(e50 e50Var, Context context) {
        this.f = e50Var;
        this.c = context;
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        if (f1Var.f == 2) {
            ((org.telegram.ui.Cells.i4) f1Var.a).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        return i7 == 6 && this.f.R;
    }

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((b50) this.e.get(i7)).a;
    }

    @Override // v4.i0
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new b50(0, true));
        e50 e50Var = this.f;
        if (e50Var.Q == 5) {
            arrayList.add(new b50(6, true));
            arrayList.add(new b50(org.telegram.messenger.gd.N0(2131750571, null)));
        } else {
            arrayList.add(new b50(4, true));
            arrayList.add(new b50(org.telegram.messenger.gd.N0(2131749262, null)));
        }
        if (e50Var.U != null) {
            arrayList.add(new b50(1, true));
            arrayList.add(new b50(3, true));
            arrayList.add(new b50(0, true));
        }
        if (e50Var.L.size() > 0) {
            arrayList.add(new b50(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < e50Var.L.size(); i7++) {
                arrayList.add(new b50(2, true));
            }
            arrayList.add(new b50(7, true));
        }
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10 = f1Var.f;
        View view = f1Var.a;
        ArrayList arrayList = this.e;
        e50 e50Var = this.f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (e50Var.U != null && i7 == 1) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131753958, null));
                    break;
                } else {
                    o4Var.setText(org.telegram.messenger.gd.G(e50Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                i4Var.d(e50Var.getMessagesController().c2((Long) e50Var.L.get(i7 - this.d)), null, null);
                i4Var.setDrawDivider(i7 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.w9) view).b(e50Var.U, false);
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i11 = e50Var.X;
                String N0 = i11 == 0 ? org.telegram.messenger.gd.N0(2131747245, null) : org.telegram.messenger.gd.c0(i11);
                String N02 = org.telegram.messenger.gd.N0(2131753847, null);
                z10 = ((org.telegram.ui.ActionBar.g2) e50Var).fragmentBeginToShow;
                m8Var.u(N02, N0, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((b50) arrayList.get(i7)).c);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.n(R.drawable.msg_topics, org.telegram.messenger.gd.N0(2131752269, null), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 0) {
            view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        } else if (i7 == 1) {
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context);
            o4Var.setHeight(46);
            view = o4Var;
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.i4(context, 0, 3, false);
        } else if (i7 == 4) {
            view = new org.telegram.ui.Cells.m8(context);
        } else if (i7 == 5) {
            view = new org.telegram.ui.Cells.z8(context);
        } else if (i7 == 6) {
            view = new org.telegram.ui.Cells.m8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i7 != 7) {
            view = new org.telegram.ui.Cells.w9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.mj0(view);
    }
}
