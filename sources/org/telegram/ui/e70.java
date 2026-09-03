package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ g70 f;

    public e70(g70 g70Var, Context context) {
        this.f = g70Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        if (l1Var.f == 2) {
            ((org.telegram.ui.Cells.f4) l1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.N;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((d70) this.e.get(i10)).a;
    }

    @Override // f2.o0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new d70(0, true));
        g70 g70Var = this.f;
        if (g70Var.M == 5) {
            arrayList.add(new d70(6, true));
            arrayList.add(new d70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new d70(4, true));
            arrayList.add(new d70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (g70Var.Q != null) {
            arrayList.add(new d70(1, true));
            arrayList.add(new d70(3, true));
            arrayList.add(new d70(0, true));
        }
        if (g70Var.H.size() > 0) {
            arrayList.add(new d70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < g70Var.H.size(); i10++) {
                arrayList.add(new d70(2, true));
            }
            arrayList.add(new d70(7, true));
        }
        super.l();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        int i11 = l1Var.f;
        View view = l1Var.a;
        ArrayList arrayList = this.e;
        g70 g70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (g70Var.Q != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", g70Var.H.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(g70Var.getMessagesController().getUser((Long) g70Var.H.get(i10 - this.d)), null, null);
                f4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.z9) view).b(g70Var.Q, false);
                break;
            case 4:
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                int i12 = g70Var.T;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z4 = ((org.telegram.ui.ActionBar.p2) g70Var).fragmentBeginToShow;
                n8Var.s(string2, string, z4, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.z8) view).setText(((d70) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                n8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                n8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.y6(context, (b) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setHeight(46);
            view = l4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.n8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.z8(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.n8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.z9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.dl0(view);
    }
}
