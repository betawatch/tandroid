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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ek0 extends bg.c {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.F.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i10 >= notificationsCustomSettingsActivity.F.size()) {
            return 5;
        }
        return ((dk0) notificationsCustomSettingsActivity.F.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList arrayList = this.e.F;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        dk0 dk0Var = (dk0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z4 = i11 < arrayList.size() && ((dk0) arrayList.get(i11)).a != 4;
        int i12 = l1Var.f;
        View view = l1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.m4) view).setText(dk0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.s8) view).f("" + ((Object) dk0Var.e), dk0Var.i, z4);
                break;
            case 2:
                ((org.telegram.ui.Cells.va) view).g(dk0Var.g, null, z4);
                break;
            case 3:
                ((org.telegram.ui.Cells.u8) view).b(dk0Var.h, "" + ((Object) dk0Var.e), z4);
                break;
            case 4:
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (dk0Var.e != null) {
                    a9Var.setFixedSize(0);
                    a9Var.setText(dk0Var.e);
                    break;
                } else {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.aa) view).c(dk0Var.e, dk0Var.f, false, z4);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                j5Var.setDrawLine(true);
                j5Var.setChecked(dk0Var.i);
                j5Var.b(dk0Var.e, dk0Var.f, dk0Var.d, dk0Var.i, 0, false, z4, true);
                break;
            case 7:
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                if (dk0Var.d != 0) {
                    o8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                    o8Var.m(dk0Var.d, "" + ((Object) dk0Var.e), z4);
                    break;
                } else {
                    o8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    o8Var.i("" + ((Object) dk0Var.e), z4);
                    break;
                }
            case 8:
                ck0 ck0Var = (ck0) view;
                ck0Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                CharSequence charSequence = dk0Var.e;
                b.p(ck0Var.N.animate().rotation(dk0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.nr.h, 340L);
                ck0Var.i(charSequence, z4);
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.va(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.u8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.aa(context);
                break;
            case 6:
                f6Var = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, f6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.o8(context);
                break;
            case 8:
                ck0 ck0Var = new ck0(context);
                ImageView imageView = new ImageView(context);
                ck0Var.N = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                ck0Var.addView(imageView, k7.b6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = ck0Var;
                break;
        }
        return new org.telegram.ui.Components.el0(m4Var);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.F;
        int i10 = notificationsCustomSettingsActivity.s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = l1Var.b();
            View view = l1Var.a;
            dk0 dk0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (dk0) arrayList3.get(b10);
            if (dk0Var == null || dk0Var.c != 102) {
                int i11 = l1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.s8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.u8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.aa) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
