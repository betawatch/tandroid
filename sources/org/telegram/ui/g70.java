package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ i70 f;

    public g70(i70 i70Var, Context context) {
        this.f = i70Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            ((org.telegram.ui.Cells.g4) c1Var.a).a.getImageReceiver().cancelLoadImage();
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
        return ((f70) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new f70(0, true));
        i70 i70Var = this.f;
        if (i70Var.P == 5) {
            arrayList.add(new f70(6, true));
            arrayList.add(new f70(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new f70(4, true));
            arrayList.add(new f70(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (i70Var.T != null) {
            arrayList.add(new f70(1, true));
            arrayList.add(new f70(3, true));
            arrayList.add(new f70(0, true));
        }
        if (i70Var.K.size() > 0) {
            arrayList.add(new f70(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < i70Var.K.size(); i10++) {
                arrayList.add(new f70(2, true));
            }
            arrayList.add(new f70(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.e;
        i70 i70Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i70Var.T != null && i10 == 1) {
                    m4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    m4Var.setText(LocaleController.formatPluralString("Members", i70Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                g4Var.d(i70Var.getMessagesController().getUser((Long) i70Var.K.get(i10 - this.d)), null, null);
                g4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.fa) view).b(i70Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                int i12 = i70Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.n2) i70Var).fragmentBeginToShow;
                s8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.f9) view).setText(((f70) arrayList.get(i10)).c);
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
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
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
            view = new org.telegram.ui.Cells.fa(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
