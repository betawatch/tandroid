package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a50 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ c50 f;

    public a50(c50 c50Var, Context context) {
        this.f = c50Var;
        this.c = context;
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        if (e1Var.f == 2) {
            ((org.telegram.ui.Cells.h4) e1Var.a).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        return i7 == 6 && this.f.R;
    }

    @Override // v4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((z40) this.e.get(i7)).a;
    }

    @Override // v4.h0
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new z40(0, true));
        c50 c50Var = this.f;
        if (c50Var.Q == 5) {
            arrayList.add(new z40(6, true));
            arrayList.add(new z40(org.telegram.messenger.hd.M0(2131750588, null)));
        } else {
            arrayList.add(new z40(4, true));
            arrayList.add(new z40(org.telegram.messenger.hd.M0(2131749455, null)));
        }
        if (c50Var.U != null) {
            arrayList.add(new z40(1, true));
            arrayList.add(new z40(3, true));
            arrayList.add(new z40(0, true));
        }
        if (c50Var.L.size() > 0) {
            arrayList.add(new z40(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < c50Var.L.size(); i7++) {
                arrayList.add(new z40(2, true));
            }
            arrayList.add(new z40(7, true));
        }
        super.f();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.e;
        c50 c50Var = this.f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (c50Var.U != null && i7 == 1) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753961, null));
                    break;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.G(c50Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(c50Var.getMessagesController().a2((Long) c50Var.L.get(i7 - this.d)), null, null);
                h4Var.setDrawDivider(i7 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.v9) view).b(c50Var.U, false);
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i11 = c50Var.X;
                String M0 = i11 == 0 ? org.telegram.messenger.hd.M0(2131747439, null) : org.telegram.messenger.hd.c0(i11);
                String M02 = org.telegram.messenger.hd.M0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.e2) c50Var).fragmentBeginToShow;
                l8Var.u(M02, M0, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((z40) arrayList.get(i7)).c);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.n(R.drawable.msg_topics, org.telegram.messenger.hd.M0(2131752281, null), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 0) {
            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        } else if (i7 == 1) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setHeight(46);
            view = n4Var;
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.h4(context, 0, 3, false);
        } else if (i7 == 4) {
            view = new org.telegram.ui.Cells.l8(context);
        } else if (i7 == 5) {
            view = new org.telegram.ui.Cells.y8(context);
        } else if (i7 == 6) {
            view = new org.telegram.ui.Cells.l8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i7 != 7) {
            view = new org.telegram.ui.Cells.v9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.cj0(view);
    }
}
