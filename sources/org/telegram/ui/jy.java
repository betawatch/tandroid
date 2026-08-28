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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jy extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ my d;

    public jy(my myVar, Context context) {
        this.d = myVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 3;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        my myVar = this.d;
        if (i9 == myVar.h) {
            return 1;
        }
        return i9 == myVar.s ? 0 : 3;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        my myVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == myVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = myVar.w;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i11 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                b9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Long l10 = (Long) myVar.e.get(i9 - myVar.n);
            long longValue = l10.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                g4Var.e(myVar.getMessagesController().getUser(l10), null, null, i9 != myVar.r - 1);
                return;
            } else {
                g4Var.e(myVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i9 != myVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        p8Var.e(-1, org.telegram.ui.ActionBar.f6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
        p8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.fq(drawable, drawable2), myVar.n != -1);
        p8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i9 == 0) {
            FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            frameLayout = b9Var;
        } else if (i9 == 1) {
            FrameLayout p8Var = new org.telegram.ui.Cells.p8(context);
            p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = p8Var;
        } else if (i9 != 2) {
            FrameLayout g4Var = new org.telegram.ui.Cells.g4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            g4Var.setTag(R.id.object_tag, imageView);
            g4Var.addView(imageView, g7.e6.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new kh.r1(5, this, g4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = g4Var;
        } else {
            my myVar = this.d;
            ly lyVar = new ly(myVar, context);
            myVar.f = lyVar;
            frameLayout = lyVar;
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 3 || i9 == 1) {
            q1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        }
    }
}
