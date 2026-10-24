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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.l61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new g9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        Object obj;
        boolean z12;
        ?? r12;
        int i12;
        i9 i9Var = (i9) m61Var.G;
        h9 h9Var = (h9) view;
        View.OnClickListener onClickListener = m61Var.D;
        int i13 = h9Var.a;
        org.telegram.ui.Components.k9 k9Var = h9Var.b;
        org.telegram.ui.Cells.i6 i6Var = h9Var.d;
        ImageView imageView = h9Var.c;
        boolean z13 = i9Var.e;
        ArrayList arrayList = i9Var.c;
        ArrayList arrayList2 = i9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder i14 = si.o0.i(str, "  ");
            i10 = 1;
            i14.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(i14.toString());
            z11 = false;
        } else {
            i10 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i15 = i9Var.d;
        if (i15 != 0) {
            if (i15 == i10) {
                if (h9Var.h == null) {
                    Drawable mutate = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i12 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.z(i6Var, mutate, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                    h9Var.h = mutate;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(h9Var.h, i12), str.length(), str.length() + 1, 33);
            } else if (i15 == 2) {
                Drawable mutate2 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i15 != 3) {
                obj = null;
            } else {
                Drawable mutate3 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (h9Var.f == null) {
                Drawable mutate4 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.r6.z(i6Var, mutate4, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                h9Var.f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(h9Var.f, i11), str.length(), str.length() + 1, 33);
        }
        if (i9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i16 = 0; i16 < Math.min(3, arrayList2.size()); i16++) {
                if (i16 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i16)));
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
            i6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.i6 i6Var2 = h9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            i6Var2.t(obj, null, sb2.toString(), spannableString, false, false);
            k9Var.setVisibility(r12);
            i6Var.r.clearImage();
            i6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i17 = 0; i17 < min; i17++) {
                k9Var.b(i17, (TLObject) arrayList3.get(i17), i13);
            }
            z12 = false;
            k9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            i6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.i6 i6Var3 = h9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            i6Var3.t(obj, null, null, spannableString2, false, false);
            k9Var.setVisibility(8);
            i6Var.f = false;
        }
        imageView.setTag(i9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = m61Var.e;
        org.telegram.ui.Components.xp xpVar = h9Var.e;
        if (xpVar == null) {
            return;
        }
        xpVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new h9(context, i10);
    }
}
