package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class k91 extends LinearLayout {
    public final org.telegram.ui.ActionBar.f1[] a;

    public k91(ContextThemeWrapper contextThemeWrapper, final qr0 qr0Var) {
        super(contextThemeWrapper);
        this.a = new org.telegram.ui.ActionBar.f1[]{r3, r3, r2, r2, r2};
        setOrientation(1);
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_0_2, LocaleController.getString(R.string.SpeedVerySlow), false, null);
        c10.c(-328966, -328966);
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                qr0 qr0Var2 = qr0Var;
                switch (i11) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        c10.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow), false, null);
        c11.c(-328966, -328966);
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                qr0 qr0Var2 = qr0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        c11.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c12 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal), false, null);
        c12.c(-328966, -328966);
        final int i12 = 2;
        c12.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                qr0 qr0Var2 = qr0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        c12.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c13 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast), false, null);
        c13.c(-328966, -328966);
        final int i13 = 3;
        c13.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i13;
                qr0 qr0Var2 = qr0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        c13.setSelectorColor(268435455);
        org.telegram.ui.ActionBar.f1 c14 = org.telegram.ui.ActionBar.v0.c(false, false, this, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedVeryFast), false, null);
        c14.c(-328966, -328966);
        final int i14 = 4;
        c14.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i14;
                qr0 qr0Var2 = qr0Var;
                switch (i112) {
                    case 0:
                        PhotoViewer photoViewer = qr0Var2.a;
                        Drawable[] drawableArr = PhotoViewer.T8;
                        photoViewer.D0(true, true, 0.2f);
                        break;
                    case 1:
                        PhotoViewer photoViewer2 = qr0Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.T8;
                        photoViewer2.D0(true, true, 0.5f);
                        break;
                    case 2:
                        PhotoViewer photoViewer3 = qr0Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.T8;
                        photoViewer3.D0(true, true, 1.0f);
                        break;
                    case 3:
                        PhotoViewer photoViewer4 = qr0Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.T8;
                        photoViewer4.D0(true, true, 1.5f);
                        break;
                    default:
                        PhotoViewer photoViewer5 = qr0Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.T8;
                        photoViewer5.D0(true, true, 2.0f);
                        break;
                }
            }
        });
        c14.setSelectorColor(268435455);
        View v51Var = new v51(contextThemeWrapper, 1);
        v51Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        v51Var.setBackgroundColor(-15198184);
        addView(v51Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) v51Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        v51Var.setLayoutParams(layoutParams);
    }
}
