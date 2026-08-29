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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b9 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new b9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        SpannableString spannableString;
        boolean z11;
        ?? r12;
        d9 d9Var = (d9) w41Var.G;
        c9 c9Var = (c9) view;
        View.OnClickListener onClickListener = w41Var.D;
        int i10 = c9Var.a;
        org.telegram.ui.Components.h9 h9Var = c9Var.b;
        org.telegram.ui.Cells.f6 f6Var = c9Var.d;
        ImageView imageView = c9Var.c;
        boolean z12 = d9Var.e;
        ArrayList arrayList = d9Var.c;
        ArrayList arrayList2 = d9Var.b;
        imageView.setImageResource(z12 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder f9 = u3.c.f(str, "  ");
            f9.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(f9.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i11 = d9Var.d;
        if (i11 == 0) {
            Drawable mutate = c9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 1) {
            Drawable mutate2 = c9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 2) {
            Drawable mutate3 = c9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 3) {
            Drawable mutate4 = c9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (d9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < Math.min(3, arrayList2.size()); i12++) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i12)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i10).getCurrentUser());
            f6Var.setAllowEmojiStatus(r12);
            c9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(r12) : null, null, sb2.toString(), spannableString, false, false);
            h9Var.setVisibility(r12);
            f6Var.r.clearImage();
            f6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i13 = 0; i13 < min; i13++) {
                h9Var.b(i13, (TLObject) arrayList3.get(i13), i10);
            }
            z11 = false;
            h9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            f6Var.setAllowEmojiStatus(true);
            c9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(0) : null, null, null, spannableString2, false, false);
            h9Var.setVisibility(8);
            f6Var.f = false;
        }
        imageView.setTag(d9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = w41Var.e;
        org.telegram.ui.Components.hp hpVar = c9Var.e;
        if (hpVar == null) {
            return;
        }
        hpVar.a(z13, z11);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c9(context, i10);
    }
}
