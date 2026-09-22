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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ok0 extends og.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public ok0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.kl0
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
        return ((nk0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        nk0 nk0Var = (nk0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((nk0) arrayList.get(i11)).a != 4;
        int i12 = c1Var.f;
        View view = c1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.m4) view).setText(nk0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.w8) view).f("" + ((Object) nk0Var.e), nk0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.ab) view).g(nk0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.y8) view).b(nk0Var.h, "" + ((Object) nk0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (nk0Var.e != null) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(nk0Var.e);
                    break;
                } else {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ea) view).c(nk0Var.e, nk0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                j5Var.setDrawLine(true);
                j5Var.setChecked(nk0Var.i);
                j5Var.b(nk0Var.e, nk0Var.f, nk0Var.d, nk0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (nk0Var.d != 0) {
                    r8Var.e(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                    r8Var.m(nk0Var.d, "" + ((Object) nk0Var.e), z10);
                    break;
                } else {
                    r8Var.e(-1, org.telegram.ui.ActionBar.i6.p7);
                    r8Var.i("" + ((Object) nk0Var.e), z10);
                    break;
                }
            case 8:
                mk0 mk0Var = (mk0) view;
                mk0Var.e(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
                CharSequence charSequence = nk0Var.e;
                org.telegram.messenger.vl.r(mk0Var.Q.animate().rotation(nk0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.qr.h, 340L);
                mk0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.e6 e6Var;
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
                m4Var = new org.telegram.ui.Cells.ab(context, 6, 0, false);
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
                e6Var = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, e6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                mk0 mk0Var = new mk0(context);
                ImageView imageView = new ImageView(context);
                mk0Var.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                mk0Var.addView(imageView, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = mk0Var;
                break;
        }
        return new org.telegram.ui.Components.vk0(m4Var);
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
            nk0 nk0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (nk0) arrayList3.get(b10);
            if (nk0Var == null || nk0Var.c != 102) {
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
