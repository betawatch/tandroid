package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i70 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ k70 f;

    public i70(k70 k70Var, Context context) {
        this.f = k70Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) c1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.ul0
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
        return ((h70) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new h70(0, true));
        k70 k70Var = this.f;
        if (k70Var.P == 5) {
            arrayList.add(new h70(6, true));
            arrayList.add(new h70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new h70(4, true));
            arrayList.add(new h70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (k70Var.T != null) {
            arrayList.add(new h70(1, true));
            arrayList.add(new h70(3, true));
            arrayList.add(new h70(0, true));
        }
        if (k70Var.K.size() > 0) {
            arrayList.add(new h70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < k70Var.K.size(); i10++) {
                arrayList.add(new h70(2, true));
            }
            arrayList.add(new h70(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.e;
        k70 k70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (k70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", k70Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(k70Var.getMessagesController().getUser((Long) k70Var.K.get(i10 - this.d)), null, null);
                g4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ga) view).b(k70Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                int i12 = k70Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.p2) k70Var).fragmentBeginToShow;
                s8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.f9) view).setText(((h70) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                s8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                s8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setHeight(46);
            view = m4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.g4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.s8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.f9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.s8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ga(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
