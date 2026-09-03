package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f9 extends org.telegram.ui.Components.g51 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new f9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        SpannableString spannableString;
        boolean z10;
        ?? r12;
        h9 h9Var = (h9) h51Var.G;
        g9 g9Var = (g9) view;
        View.OnClickListener onClickListener = h51Var.D;
        int i10 = g9Var.a;
        org.telegram.ui.Components.d9 d9Var = g9Var.b;
        org.telegram.ui.Cells.h6 h6Var = g9Var.d;
        ImageView imageView = g9Var.c;
        boolean z11 = h9Var.e;
        ArrayList arrayList = h9Var.c;
        ArrayList arrayList2 = h9Var.b;
        imageView.setImageResource(z11 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder f10 = w.c.f(str, "  ");
            f10.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(f10.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i11 = h9Var.d;
        if (i11 == 0) {
            Drawable mutate = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 1) {
            Drawable mutate2 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 2) {
            Drawable mutate3 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 3) {
            Drawable mutate4 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (h9Var.a != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i12 = 0; i12 < Math.min(3, arrayList2.size()); i12++) {
                if (i12 > 0) {
                    sb.append(", ");
                }
                sb.append(DialogObject.getShortName((TLObject) arrayList2.get(i12)));
            }
            if (arrayList2.size() > 3) {
                sb.append(" ");
                r12 = 0;
                sb.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i10).getCurrentUser());
            h6Var.setAllowEmojiStatus(r12);
            g9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(r12) : null, null, sb.toString(), spannableString, false, false);
            d9Var.setVisibility(r12);
            h6Var.r.clearImage();
            h6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i13 = 0; i13 < min; i13++) {
                d9Var.b(i13, (TLObject) arrayList3.get(i13), i10);
            }
            z10 = false;
            d9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z10 = false;
            h6Var.setAllowEmojiStatus(true);
            g9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(0) : null, null, null, spannableString2, false, false);
            d9Var.setVisibility(8);
            h6Var.f = false;
        }
        imageView.setTag(h9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z12 = h51Var.e;
        org.telegram.ui.Components.np npVar = g9Var.e;
        if (npVar == null) {
            return;
        }
        npVar.a(z12, z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g9(context, i10);
    }
}
