package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class mk0 extends og.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public mk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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
        return ((lk0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        lk0 lk0Var = (lk0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((lk0) arrayList.get(i11)).a != 4;
        int i12 = c1Var.f;
        View view = c1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.m4) view).setText(lk0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.w8) view).f("" + ((Object) lk0Var.e), lk0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.za) view).g(lk0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.y8) view).b(lk0Var.h, "" + ((Object) lk0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (lk0Var.e != null) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(lk0Var.e);
                    break;
                } else {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ea) view).c(lk0Var.e, lk0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                j5Var.setDrawLine(true);
                j5Var.setChecked(lk0Var.i);
                j5Var.b(lk0Var.e, lk0Var.f, lk0Var.d, lk0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (lk0Var.d != 0) {
                    r8Var.e(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                    r8Var.m(lk0Var.d, "" + ((Object) lk0Var.e), z10);
                    break;
                } else {
                    r8Var.e(-1, org.telegram.ui.ActionBar.i6.p7);
                    r8Var.i("" + ((Object) lk0Var.e), z10);
                    break;
                }
            case 8:
                kk0 kk0Var = (kk0) view;
                kk0Var.e(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                CharSequence charSequence = lk0Var.e;
                org.telegram.messenger.ok.s(kk0Var.Q.animate().rotation(lk0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.tr.h, 340L);
                kk0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.za(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ea(context);
                break;
            case 6:
                d6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, d6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                kk0 kk0Var = new kk0(context);
                ImageView imageView = new ImageView(context);
                kk0Var.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                kk0Var.addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = kk0Var;
                break;
        }
        return new org.telegram.ui.Components.il0(m4Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
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
            int b10 = c1Var.b();
            View view = c1Var.a;
            lk0 lk0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (lk0) arrayList3.get(b10);
            if (lk0Var == null || lk0Var.c != 102) {
                int i11 = c1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.w8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.y8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.ea) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
