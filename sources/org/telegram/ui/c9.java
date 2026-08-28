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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.Components.k41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new c9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        SpannableString spannableString;
        boolean z11;
        ?? r12;
        e9 e9Var = (e9) l41Var.G;
        d9 d9Var = (d9) view;
        View.OnClickListener onClickListener = l41Var.D;
        int i9 = d9Var.a;
        org.telegram.ui.Components.c9 c9Var = d9Var.b;
        org.telegram.ui.Cells.h6 h6Var = d9Var.d;
        ImageView imageView = d9Var.c;
        boolean z12 = e9Var.e;
        ArrayList arrayList = e9Var.c;
        ArrayList arrayList2 = e9Var.b;
        imageView.setImageResource(z12 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder e10 = ta.b.e(str, "  ");
            e10.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(e10.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i10 = e9Var.d;
        if (i10 == 0) {
            Drawable mutate = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
        } else if (i10 == 1) {
            Drawable mutate2 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
        } else if (i10 == 2) {
            Drawable mutate3 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
        } else if (i10 == 3) {
            Drawable mutate4 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (e9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < Math.min(3, arrayList2.size()); i11++) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i11)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i9).getCurrentUser());
            h6Var.setAllowEmojiStatus(r12);
            d9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(r12) : null, null, sb2.toString(), spannableString, false, false);
            c9Var.setVisibility(r12);
            h6Var.r.clearImage();
            h6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i12 = 0; i12 < min; i12++) {
                c9Var.b(i12, (TLObject) arrayList3.get(i12), i9);
            }
            z11 = false;
            c9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            h6Var.setAllowEmojiStatus(true);
            d9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(0) : null, null, null, spannableString2, false, false);
            c9Var.setVisibility(8);
            h6Var.f = false;
        }
        imageView.setTag(e9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = l41Var.e;
        org.telegram.ui.Components.dp dpVar = d9Var.e;
        if (dpVar == null) {
            return;
        }
        dpVar.a(z13, z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new d9(context, i9);
    }
}
