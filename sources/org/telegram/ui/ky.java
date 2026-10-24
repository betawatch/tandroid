package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ ny f;

    public ky(ny nyVar, Context context) {
        this.f = nyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // s4.g0
    public final int h() {
        return this.f.v;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        ny nyVar = this.f;
        if (i10 == nyVar.h) {
            return 1;
        }
        return i10 == nyVar.s ? 0 : 3;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        ny nyVar = this.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == nyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = nyVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                e9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Long l4 = (Long) nyVar.e.get(i10 - nyVar.n);
            long longValue = l4.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                f4Var.e(nyVar.getMessagesController().getUser(l4), null, null, i10 != nyVar.r - 1);
                return;
            } else {
                f4Var.e(nyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != nyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        r8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i13 = org.telegram.ui.ActionBar.k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.z(r8Var, drawable, i13, null, mode);
        org.telegram.ui.ActionBar.r6.z(r8Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
        r8Var.p(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.yq(drawable, drawable2), nyVar.n != -1);
        r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
            frameLayout = e9Var;
        } else if (i10 == 1) {
            FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
            frameLayout = r8Var;
        } else if (i10 != 2) {
            FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            f4Var.setTag(R.id.object_tag, imageView);
            f4Var.addView(imageView, w7.z5.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new ei.p1(5, this, f4Var));
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = f4Var;
        } else {
            ny nyVar = this.f;
            my myVar = new my(nyVar, context);
            nyVar.f = myVar;
            frameLayout = myVar;
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 == 1) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, b1Var.a, null);
        }
    }
}
