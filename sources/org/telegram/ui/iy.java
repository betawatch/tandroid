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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ ly d;

    public iy(ly lyVar, Context context) {
        this.d = lyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
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
        ly lyVar = this.d;
        if (i10 == lyVar.h) {
            return 1;
        }
        return i10 == lyVar.s ? 0 : 3;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        ly lyVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == lyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = lyVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                d9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Long l4 = (Long) lyVar.e.get(i10 - lyVar.n);
            long longValue = l4.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                f4Var.e(lyVar.getMessagesController().getUser(l4), null, null, i10 != lyVar.r - 1);
                return;
            } else {
                f4Var.e(lyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != lyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
        q8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.zq(drawable, drawable2), lyVar.n != -1);
        q8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            frameLayout = d9Var;
        } else if (i10 == 1) {
            FrameLayout q8Var = new org.telegram.ui.Cells.q8(context);
            q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = q8Var;
        } else if (i10 != 2) {
            FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            f4Var.setTag(R.id.object_tag, imageView);
            f4Var.addView(imageView, w7.z5.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new ei.p1(5, this, f4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = f4Var;
        } else {
            ly lyVar = this.d;
            ky kyVar = new ky(lyVar, context);
            lyVar.f = kyVar;
            frameLayout = kyVar;
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 == 1) {
            b1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
        }
    }
}
