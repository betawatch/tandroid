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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ ny f;

    public ky(ny nyVar, Context context) {
        this.f = nyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // s4.h0
    public final int h() {
        return this.f.v;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        ny nyVar = this.f;
        if (i11 == 0) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
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
                i9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            Long l4 = (Long) nyVar.e.get(i10 - nyVar.n);
            long longValue = l4.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                k4Var.e(nyVar.getMessagesController().getUser(l4), null, null, i10 != nyVar.r - 1);
                return;
            } else {
                k4Var.e(nyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != nyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
        v8Var.g(-1, org.telegram.ui.ActionBar.y6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i13 = org.telegram.ui.ActionBar.y6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i13, null, mode);
        org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.k7, null, mode);
        v8Var.p(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.ar(drawable, drawable2), nyVar.n != -1);
        v8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout i9Var = new org.telegram.ui.Cells.i9(context);
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, i9Var, null);
            frameLayout = i9Var;
        } else if (i10 == 1) {
            FrameLayout v8Var = new org.telegram.ui.Cells.v8(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, null);
            frameLayout = v8Var;
        } else if (i10 != 2) {
            FrameLayout k4Var = new org.telegram.ui.Cells.k4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            k4Var.setTag(R.id.object_tag, imageView);
            k4Var.addView(imageView, org.telegram.ui.Components.kb1.h(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new fi.o1(5, this, k4Var));
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = k4Var;
        } else {
            ny nyVar = this.f;
            my myVar = new my(nyVar, context);
            nyVar.f = myVar;
            frameLayout = myVar;
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 == 3 || i10 == 1) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, e1Var.a, null);
        }
    }
}
