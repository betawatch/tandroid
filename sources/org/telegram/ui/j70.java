package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j70 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ l70 f;

    public j70(l70 l70Var, Context context) {
        this.f = l70Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) c1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.kl0
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
        return ((i70) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new i70(0, true));
        l70 l70Var = this.f;
        if (l70Var.P == 5) {
            arrayList.add(new i70(6, true));
            arrayList.add(new i70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new i70(4, true));
            arrayList.add(new i70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (l70Var.T != null) {
            arrayList.add(new i70(1, true));
            arrayList.add(new i70(3, true));
            arrayList.add(new i70(0, true));
        }
        if (l70Var.K.size() > 0) {
            arrayList.add(new i70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < l70Var.K.size(); i10++) {
                arrayList.add(new i70(2, true));
            }
            arrayList.add(new i70(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.e;
        l70 l70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (l70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", l70Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(l70Var.getMessagesController().getUser((Long) l70Var.K.get(i10 - this.d)), null, null);
                g4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ea) view).b(l70Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = l70Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.n2) l70Var).fragmentBeginToShow;
                r8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((i70) arrayList.get(i10)).c);
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
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setHeight(46);
            view = m4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.g4(context, 0, 3, false);
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
        return new org.telegram.ui.Components.vk0(view);
    }
}
