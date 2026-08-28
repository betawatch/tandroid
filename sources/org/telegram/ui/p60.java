package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p60 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ r60 f;

    public p60(r60 r60Var, Context context) {
        this.f = r60Var;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        if (q1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) q1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 3 || i9 == 4) {
            return true;
        }
        return i9 == 6 && this.f.M;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((o60) this.e.get(i9)).a;
    }

    @Override // f2.r0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new o60(0, true));
        r60 r60Var = this.f;
        if (r60Var.L == 5) {
            arrayList.add(new o60(6, true));
            arrayList.add(new o60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new o60(4, true));
            arrayList.add(new o60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (r60Var.P != null) {
            arrayList.add(new o60(1, true));
            arrayList.add(new o60(3, true));
            arrayList.add(new o60(0, true));
        }
        if (r60Var.G.size() > 0) {
            arrayList.add(new o60(1, true));
            this.d = arrayList.size();
            for (int i9 = 0; i9 < r60Var.G.size(); i9++) {
                arrayList.add(new o60(2, true));
            }
            arrayList.add(new o60(7, true));
        }
        super.l();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int i10 = q1Var.f;
        View view = q1Var.a;
        ArrayList arrayList = this.e;
        r60 r60Var = this.f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (r60Var.P != null && i9 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", r60Var.G.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(r60Var.getMessagesController().getUser((Long) r60Var.G.get(i9 - this.d)), null, null);
                g4Var.setDrawDivider(i9 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ba) view).b(r60Var.P, false);
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                int i11 = r60Var.S;
                String string = i11 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i11);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) r60Var).fragmentBeginToShow;
                p8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.b9) view).setText(((o60) arrayList.get(i9)).c);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                p8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                p8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 == 0) {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else if (i9 == 1) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setHeight(46);
            view = m4Var;
        } else if (i9 == 2) {
            view = new org.telegram.ui.Cells.g4(context, 0, 3, false);
        } else if (i9 == 4) {
            view = new org.telegram.ui.Cells.p8(context);
        } else if (i9 == 5) {
            view = new org.telegram.ui.Cells.b9(context);
        } else if (i9 == 6) {
            view = new org.telegram.ui.Cells.p8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i9 != 7) {
            view = new org.telegram.ui.Cells.ba(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
