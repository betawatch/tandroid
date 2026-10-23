package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class dk0 extends pg.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
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
        return ((ck0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ck0 ck0Var = (ck0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((ck0) arrayList.get(i11)).a != 4;
        int i12 = b1Var.f;
        View view = b1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.l4) view).setText(ck0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.w8) view).f("" + ((Object) ck0Var.e), ck0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.wa) view).f(ck0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.y8) view).b(ck0Var.h, "" + ((Object) ck0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (ck0Var.e != null) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(ck0Var.e);
                    break;
                } else {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ca) view).c(ck0Var.e, ck0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
                i5Var.setDrawLine(true);
                i5Var.setChecked(ck0Var.i);
                i5Var.b(ck0Var.e, ck0Var.f, ck0Var.d, ck0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                if (ck0Var.d != 0) {
                    r8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                    r8Var.o(ck0Var.d, "" + ((Object) ck0Var.e), z10);
                    break;
                } else {
                    r8Var.g(-1, org.telegram.ui.ActionBar.k6.p7);
                    r8Var.k("" + ((Object) ck0Var.e), z10);
                    break;
                }
            case 8:
                bk0 bk0Var = (bk0) view;
                bk0Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                CharSequence charSequence = ck0Var.e;
                org.telegram.messenger.sl.t(bk0Var.W.animate().rotation(ck0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.bs.h, 340L);
                bk0Var.k(charSequence, z10);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context);
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.w8(context);
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.wa(context, 6, 0, false);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.y8(context, null);
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ca(context);
                break;
            case 6:
                g6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                l4Var = new org.telegram.ui.Cells.i5(21, 64, this.d, g6Var, true);
                break;
            case 7:
            default:
                l4Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                bk0 bk0Var = new bk0(context);
                ImageView imageView = new ImageView(context);
                bk0Var.W = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                imageView.setImageResource(R.drawable.msg_expand);
                bk0Var.addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                l4Var = bk0Var;
                break;
        }
        return new org.telegram.ui.Components.wl0(l4Var);
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
            ck0 ck0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (ck0) arrayList3.get(b10);
            if (ck0Var == null || ck0Var.c != 102) {
                int i11 = b1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.l4) view).a(null, isGlobalNotificationsEnabled);
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
                    ((org.telegram.ui.Cells.ca) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
