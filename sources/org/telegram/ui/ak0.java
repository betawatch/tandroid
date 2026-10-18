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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ak0 extends pg.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.I.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i10 >= notificationsCustomSettingsActivity.I.size()) {
            return 5;
        }
        return ((zj0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        zj0 zj0Var = (zj0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((zj0) arrayList.get(i11)).a != 4;
        int i12 = b1Var.f;
        View view = b1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.l4) view).setText(zj0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.v8) view).f("" + ((Object) zj0Var.e), zj0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.va) view).g(zj0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.x8) view).b(zj0Var.h, "" + ((Object) zj0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                if (zj0Var.e != null) {
                    d9Var.setFixedSize(0);
                    d9Var.setText(zj0Var.e);
                    break;
                } else {
                    d9Var.setFixedSize(12);
                    d9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ba) view).c(zj0Var.e, zj0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                i5Var.setDrawLine(true);
                i5Var.setChecked(zj0Var.i);
                i5Var.b(zj0Var.e, zj0Var.f, zj0Var.d, zj0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                if (zj0Var.d != 0) {
                    q8Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                    q8Var.m(zj0Var.d, "" + ((Object) zj0Var.e), z10);
                    break;
                } else {
                    q8Var.e(-1, org.telegram.ui.ActionBar.h6.p7);
                    q8Var.i("" + ((Object) zj0Var.e), z10);
                    break;
                }
            case 8:
                yj0 yj0Var = (yj0) view;
                yj0Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                CharSequence charSequence = zj0Var.e;
                org.telegram.messenger.kk.t(yj0Var.R.animate().rotation(zj0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.bs.h, 340L);
                yj0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.va(6, 0, context, false);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.x8(context, null);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.d9(context);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 6:
                d6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.d, d6Var, true);
                break;
            case 7:
            default:
                l4Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                yj0 yj0Var = new yj0(context);
                ImageView imageView = new ImageView(context);
                yj0Var.R = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                yj0Var.addView(imageView, w7.z5.a(24.0f, 17.0f, 0.0f, 17.0f, 0.0f, 24, (LocaleController.isRTL ? 3 : 5) | 16));
                l4Var = yj0Var;
                break;
        }
        return new org.telegram.ui.Components.sl0(l4Var);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
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
            int b10 = b1Var.b();
            View view = b1Var.a;
            zj0 zj0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (zj0) arrayList3.get(b10);
            if (zj0Var == null || zj0Var.c != 102) {
                int i11 = b1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.l4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.v8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.x8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.ba) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
