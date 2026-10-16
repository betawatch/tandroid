package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ez extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ hz d;

    public ez(hz hzVar, Context context) {
        this.d = hzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        hz hzVar = this.d;
        if (i10 == hzVar.h) {
            return 1;
        }
        return i10 == hzVar.s ? 0 : 3;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        hz hzVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == hzVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = hzVar.w;
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
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Long l4 = (Long) hzVar.e.get(i10 - hzVar.n);
            long longValue = l4.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                g4Var.e(hzVar.getMessagesController().getUser(l4), null, null, i10 != hzVar.r - 1);
                return;
            } else {
                g4Var.e(hzVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != hzVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
        r8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.cr(drawable, drawable2), hzVar.n != -1);
        r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            frameLayout = e9Var;
        } else if (i10 == 1) {
            FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
            r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = r8Var;
        } else if (i10 != 2) {
            FrameLayout g4Var = new org.telegram.ui.Cells.g4(0, 0, context, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            g4Var.setTag(R.id.object_tag, imageView);
            g4Var.addView(imageView, w7.z5.a(-1.0f, 10.0f, 0.0f, 10.0f, 0.0f, 40, (LocaleController.isRTL ? 3 : 5) | 16));
            imageView.setOnTouchListener(new di.p1(5, this, g4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = g4Var;
        } else {
            hz hzVar = this.d;
            gz gzVar = new gz(hzVar, context);
            hzVar.f = gzVar;
            frameLayout = gzVar;
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 == 1) {
            b1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
    }
}
