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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e9 extends org.telegram.ui.Components.z41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.z41.h(new e9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.z41
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        boolean z12;
        ?? r12;
        int i12;
        g9 g9Var = (g9) a51Var.G;
        f9 f9Var = (f9) view;
        View.OnClickListener onClickListener = a51Var.D;
        int i13 = f9Var.a;
        org.telegram.ui.Components.u8 u8Var = f9Var.b;
        org.telegram.ui.Cells.k6 k6Var = f9Var.d;
        ImageView imageView = f9Var.c;
        boolean z13 = g9Var.e;
        ArrayList arrayList = g9Var.c;
        ArrayList arrayList2 = g9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = org.telegram.messenger.cd.X ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder i14 = sc.e.i(str, "  ");
            i10 = 1;
            i14.append(org.telegram.messenger.cd.t(message.date));
            spannableString = new SpannableString(i14.toString());
            z11 = false;
        } else {
            i10 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.cd.t(message.date)));
        }
        int i15 = g9Var.d;
        Object obj = null;
        if (i15 != 0) {
            if (i15 == i10) {
                if (f9Var.h == null) {
                    Drawable mutate = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i12 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.a7.y(k6Var, mutate, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
                    f9Var.h = mutate;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(f9Var.h, i12), str.length(), str.length() + 1, 33);
            } else if (i15 == 2) {
                Drawable mutate2 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i15 == 3) {
                Drawable mutate3 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (f9Var.f == null) {
                Drawable mutate4 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.a7.y(k6Var, mutate4, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
                f9Var.f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(f9Var.f, i11), str.length(), str.length() + 1, 33);
        }
        if (g9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i16 = 0; i16 < Math.min(3, arrayList2.size()); i16++) {
                if (i16 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.o5.u((TLObject) arrayList2.get(i16)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.cd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.d20.i(i13).f());
            k6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.k6 k6Var2 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            k6Var2.z(obj, null, sb2.toString(), spannableString, false, false);
            u8Var.setVisibility(r12);
            k6Var.r.f();
            k6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i17 = 0; i17 < min; i17++) {
                u8Var.b(i17, i13, (TLObject) arrayList3.get(i17));
            }
            z12 = false;
            u8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            k6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.k6 k6Var3 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            k6Var3.z(obj, null, null, spannableString2, false, false);
            u8Var.setVisibility(8);
            k6Var.f = false;
        }
        imageView.setTag(g9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = a51Var.e;
        org.telegram.ui.Components.ep epVar = f9Var.e;
        if (epVar == null) {
            return;
        }
        epVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new f9(context, i10);
    }
}
