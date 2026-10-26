package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class jk0 extends qg.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.I.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i10 >= notificationsCustomSettingsActivity.I.size()) {
            return 5;
        }
        return ((ik0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ik0 ik0Var = (ik0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((ik0) arrayList.get(i11)).a != 4;
        int i12 = e1Var.f;
        View view = e1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.q4) view).setText(ik0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.a9) view).f("" + ((Object) ik0Var.e), ik0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.ab) view).f(ik0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.c9) view).b(ik0Var.h, "" + ((Object) ik0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (ik0Var.e != null) {
                    i9Var.setFixedSize(0);
                    i9Var.setText(ik0Var.e);
                    break;
                } else {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ga) view).c(ik0Var.e, ik0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setDrawLine(true);
                n5Var.setChecked(ik0Var.i);
                n5Var.b(ik0Var.e, ik0Var.f, ik0Var.d, ik0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (ik0Var.d != 0) {
                    v8Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                    v8Var.o(ik0Var.d, "" + ((Object) ik0Var.e), z10);
                    break;
                } else {
                    v8Var.g(-1, org.telegram.ui.ActionBar.y6.p7);
                    v8Var.k("" + ((Object) ik0Var.e), z10);
                    break;
                }
            case 8:
                hk0 hk0Var = (hk0) view;
                hk0Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                CharSequence charSequence = ik0Var.e;
                org.telegram.messenger.vh.q(hk0Var.W.animate().rotation(ik0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.ds.h, 340L);
                hk0Var.k(charSequence, z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 1:
                q4Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.ab(context, 6, 0, false);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.c9(context, null);
                break;
            case 4:
                q4Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 5:
                q4Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 6:
                u6Var = ((org.telegram.ui.ActionBar.r2) notificationsCustomSettingsActivity).resourceProvider;
                q4Var = new org.telegram.ui.Cells.n5(21, 64, this.d, u6Var, true);
                break;
            case 7:
            default:
                q4Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 8:
                hk0 hk0Var = new hk0(context);
                ImageView imageView = new ImageView(context);
                hk0Var.W = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                imageView.setImageResource(R.drawable.msg_expand);
                hk0Var.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                q4Var = hk0Var;
                break;
        }
        return new org.telegram.ui.Components.vl0(q4Var);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = e1Var.b();
            View view = e1Var.a;
            ik0 ik0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (ik0) arrayList3.get(b10);
            if (ik0Var == null || ik0Var.c != 102) {
                int i11 = e1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.q4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.a9) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.c9) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.ga) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
