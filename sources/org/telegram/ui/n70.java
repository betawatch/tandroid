package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ p70 f;

    public n70(p70 p70Var, Context context) {
        this.f = p70Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) b1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.Q;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((m70) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new m70(0, true));
        p70 p70Var = this.f;
        if (p70Var.P == 5) {
            arrayList.add(new m70(6, true));
            arrayList.add(new m70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new m70(4, true));
            arrayList.add(new m70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (p70Var.T != null) {
            arrayList.add(new m70(1, true));
            arrayList.add(new m70(3, true));
            arrayList.add(new m70(0, true));
        }
        if (p70Var.K.size() > 0) {
            arrayList.add(new m70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < p70Var.K.size(); i10++) {
                arrayList.add(new m70(2, true));
            }
            arrayList.add(new m70(7, true));
        }
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.e;
        p70 p70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (p70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", p70Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(p70Var.getMessagesController().getUser((Long) p70Var.K.get(i10 - this.d)), null, null);
                g4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ca) view).b(p70Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = p70Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.m2) p70Var).fragmentBeginToShow;
                r8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((m70) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                r8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                r8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setHeight(46);
            view = m4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.g4(0, 3, context, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.r8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.e9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.r8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ca(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
