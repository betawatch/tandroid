package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ n70 f;

    public l70(n70 n70Var, Context context) {
        this.f = n70Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            ((org.telegram.ui.Cells.f4) c1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.Q;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((k70) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new k70(0, true));
        n70 n70Var = this.f;
        if (n70Var.P == 5) {
            arrayList.add(new k70(6, true));
            arrayList.add(new k70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new k70(4, true));
            arrayList.add(new k70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (n70Var.T != null) {
            arrayList.add(new k70(1, true));
            arrayList.add(new k70(3, true));
            arrayList.add(new k70(0, true));
        }
        if (n70Var.K.size() > 0) {
            arrayList.add(new k70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < n70Var.K.size(); i10++) {
                arrayList.add(new k70(2, true));
            }
            arrayList.add(new k70(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.e;
        n70 n70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (n70Var.T != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", n70Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(n70Var.getMessagesController().getUser((Long) n70Var.K.get(i10 - this.d)), null, null);
                f4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ea) view).b(n70Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = n70Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) n70Var).fragmentBeginToShow;
                r8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((k70) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                r8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                r8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setHeight(46);
            view = l4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.r8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.e9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.r8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ea(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
