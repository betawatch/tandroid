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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i9 extends org.telegram.ui.Components.t61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new i9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        Object obj;
        boolean z12;
        ?? r12;
        int i12;
        k9 k9Var = (k9) u61Var.G;
        j9 j9Var = (j9) view;
        View.OnClickListener onClickListener = u61Var.D;
        int i13 = j9Var.a;
        org.telegram.ui.Components.m9 m9Var = j9Var.b;
        org.telegram.ui.Cells.m6 m6Var = j9Var.d;
        ImageView imageView = j9Var.c;
        boolean z13 = k9Var.e;
        ArrayList arrayList = k9Var.c;
        ArrayList arrayList2 = k9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder l4 = org.telegram.ui.Components.b10.l(str, "  ");
            i10 = 1;
            l4.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(l4.toString());
            z11 = false;
        } else {
            i10 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i14 = k9Var.d;
        if (i14 != 0) {
            if (i14 == i10) {
                if (j9Var.h == null) {
                    Drawable mutate = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i12 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.f7.y(m6Var, mutate, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
                    j9Var.h = mutate;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(j9Var.h, i12), str.length(), str.length() + 1, 33);
            } else if (i14 == 2) {
                Drawable mutate2 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i14 != 3) {
                obj = null;
            } else {
                Drawable mutate3 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (j9Var.f == null) {
                Drawable mutate4 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.f7.y(m6Var, mutate4, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
                j9Var.f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(j9Var.f, i11), str.length(), str.length() + 1, 33);
        }
        if (k9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i15 = 0; i15 < Math.min(3, arrayList2.size()); i15++) {
                if (i15 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i15)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i13).getCurrentUser());
            m6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.m6 m6Var2 = j9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            m6Var2.s(obj, null, sb2.toString(), spannableString, false, false);
            m9Var.setVisibility(r12);
            m6Var.r.clearImage();
            m6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                m9Var.b(i16, (TLObject) arrayList3.get(i16), i13);
            }
            z12 = false;
            m9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            m6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.m6 m6Var3 = j9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            m6Var3.s(obj, null, null, spannableString2, false, false);
            m9Var.setVisibility(8);
            m6Var.f = false;
        }
        imageView.setTag(k9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = u61Var.e;
        org.telegram.ui.Components.aq aqVar = j9Var.e;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new j9(context, i10);
    }
}
