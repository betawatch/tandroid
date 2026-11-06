package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ d50 f;

    public b50(d50 d50Var, Context context) {
        this.f = d50Var;
        this.c = context;
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        if (d1Var.f == 2) {
            ((org.telegram.ui.Cells.h4) d1Var.a).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        return i7 == 6 && this.f.Q;
    }

    @Override // v4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((a50) this.e.get(i7)).a;
    }

    @Override // v4.g0
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new a50(0, true));
        d50 d50Var = this.f;
        if (d50Var.P == 5) {
            arrayList.add(new a50(6, true));
            arrayList.add(new a50(org.telegram.messenger.hd.M0(2131750589, null)));
        } else {
            arrayList.add(new a50(4, true));
            arrayList.add(new a50(org.telegram.messenger.hd.M0(2131749454, null)));
        }
        if (d50Var.T != null) {
            arrayList.add(new a50(1, true));
            arrayList.add(new a50(3, true));
            arrayList.add(new a50(0, true));
        }
        if (d50Var.K.size() > 0) {
            arrayList.add(new a50(1, true));
            this.d = arrayList.size();
            for (int i7 = 0; i7 < d50Var.K.size(); i7++) {
                arrayList.add(new a50(2, true));
            }
            arrayList.add(new a50(7, true));
        }
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.e;
        d50 d50Var = this.f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (d50Var.T != null && i7 == 1) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131753961, null));
                    break;
                } else {
                    n4Var.setText(org.telegram.messenger.hd.G(d50Var.K.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(d50Var.getMessagesController().a2((Long) d50Var.K.get(i7 - this.d)), null, null);
                h4Var.setDrawDivider(i7 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.w9) view).b(d50Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i11 = d50Var.W;
                String M0 = i11 == 0 ? org.telegram.messenger.hd.M0(2131747438, null) : org.telegram.messenger.hd.c0(i11);
                String M02 = org.telegram.messenger.hd.M0(2131753850, null);
                z9 = ((org.telegram.ui.ActionBar.f2) d50Var).fragmentBeginToShow;
                m8Var.u(M02, M0, z9, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((a50) arrayList.get(i7)).c);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.n(R.drawable.msg_topics, org.telegram.messenger.hd.M0(2131752281, null), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 0) {
            view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        } else if (i7 == 1) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setHeight(46);
            view = n4Var;
        } else if (i7 == 2) {
            view = new org.telegram.ui.Cells.h4(context, 0, 3, false);
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
        return new org.telegram.ui.Components.xi0(view);
    }
}
