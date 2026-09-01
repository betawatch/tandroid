package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d70 extends org.telegram.ui.Components.sl0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ f70 f;

    public d70(f70 f70Var, Context context) {
        this.f = f70Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.m1 m1Var) {
        if (m1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) m1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.N;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((c70) this.e.get(i10)).a;
    }

    @Override // f2.p0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new c70(0, true));
        f70 f70Var = this.f;
        if (f70Var.M == 5) {
            arrayList.add(new c70(6, true));
            arrayList.add(new c70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new c70(4, true));
            arrayList.add(new c70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (f70Var.Q != null) {
            arrayList.add(new c70(1, true));
            arrayList.add(new c70(3, true));
            arrayList.add(new c70(0, true));
        }
        if (f70Var.H.size() > 0) {
            arrayList.add(new c70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < f70Var.H.size(); i10++) {
                arrayList.add(new c70(2, true));
            }
            arrayList.add(new c70(7, true));
        }
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        int i11 = m1Var.f;
        View view = m1Var.a;
        ArrayList arrayList = this.e;
        f70 f70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (f70Var.Q != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", f70Var.H.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(f70Var.getMessagesController().getUser((Long) f70Var.H.get(i10 - this.d)), null, null);
                g4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.aa) view).b(f70Var.Q, false);
                break;
            case 4:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                int i12 = f70Var.T;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z4 = ((org.telegram.ui.ActionBar.p2) f70Var).fragmentBeginToShow;
                o8Var.s(string2, string, z4, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.a9) view).setText(((c70) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.o8 o8Var2 = (org.telegram.ui.Cells.o8) view;
                o8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                o8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.z6(context, (b) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setHeight(46);
            view = m4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.g4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.o8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.a9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.o8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.aa(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
