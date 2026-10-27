package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lk0 extends qg.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public lk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.mm0
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
        return ((kk0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        kk0 kk0Var = (kk0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((kk0) arrayList.get(i11)).a != 4;
        int i12 = e1Var.f;
        View view = e1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.q4) view).setText(kk0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.a9) view).f("" + ((Object) kk0Var.e), kk0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.ab) view).f(kk0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.c9) view).b(kk0Var.h, "" + ((Object) kk0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (kk0Var.e != null) {
                    i9Var.setFixedSize(0);
                    i9Var.setText(kk0Var.e);
                    break;
                } else {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ga) view).c(kk0Var.e, kk0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                n5Var.setDrawLine(true);
                n5Var.setChecked(kk0Var.i);
                n5Var.b(kk0Var.e, kk0Var.f, kk0Var.d, kk0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (kk0Var.d != 0) {
                    v8Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                    v8Var.o(kk0Var.d, "" + ((Object) kk0Var.e), z10);
                    break;
                } else {
                    v8Var.g(-1, org.telegram.ui.ActionBar.y6.p7);
                    v8Var.k("" + ((Object) kk0Var.e), z10);
                    break;
                }
            case 8:
                jk0 jk0Var = (jk0) view;
                jk0Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                CharSequence charSequence = kk0Var.e;
                org.telegram.messenger.wh.q(jk0Var.W.animate().rotation(kk0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.ds.h, 340L);
                jk0Var.k(charSequence, z10);
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
                jk0 jk0Var = new jk0(context);
                ImageView imageView = new ImageView(context);
                jk0Var.W = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                imageView.setImageResource(R.drawable.msg_expand);
                jk0Var.addView(imageView, org.telegram.ui.Components.kb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                q4Var = jk0Var;
                break;
        }
        return new org.telegram.ui.Components.wl0(q4Var);
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
            kk0 kk0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (kk0) arrayList3.get(b10);
            if (kk0Var == null || kk0Var.c != 102) {
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
