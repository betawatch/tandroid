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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ly extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ oy d;

    public ly(oy oyVar, Context context) {
        this.d = oyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        oy oyVar = this.d;
        if (i10 == oyVar.h) {
            return 1;
        }
        return i10 == oyVar.s ? 0 : 3;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        oy oyVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == oyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = oyVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                y8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            Long l10 = (Long) oyVar.e.get(i10 - oyVar.n);
            long longValue = l10.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                e4Var.e(oyVar.getMessagesController().getUser(l10), null, null, i10 != oyVar.r - 1);
                return;
            } else {
                e4Var.e(oyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != oyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
        m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
        m8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.jq(drawable, drawable2), oyVar.n != -1);
        m8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            frameLayout = y8Var;
        } else if (i10 == 1) {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = m8Var;
        } else if (i10 != 2) {
            FrameLayout e4Var = new org.telegram.ui.Cells.e4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            e4Var.setTag(R.id.object_tag, imageView);
            e4Var.addView(imageView, i7.f6.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new nh.o1(5, this, e4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = e4Var;
        } else {
            oy oyVar = this.d;
            ny nyVar = new ny(oyVar, context);
            oyVar.f = nyVar;
            frameLayout = nyVar;
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 == 3 || i10 == 1) {
            n1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        }
    }
}
