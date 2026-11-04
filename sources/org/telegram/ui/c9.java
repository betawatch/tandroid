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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new c9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        int i3;
        boolean z11;
        SpannableString spannableString;
        int i10;
        boolean z12;
        ?? r12;
        int i11;
        e9 e9Var = (e9) r31Var.G;
        d9 d9Var = (d9) view;
        View.OnClickListener onClickListener = r31Var.D;
        int i12 = d9Var.a;
        org.telegram.ui.Components.x8 x8Var = d9Var.b;
        org.telegram.ui.Cells.f6 f6Var = d9Var.d;
        ImageView imageView = d9Var.c;
        boolean z13 = e9Var.e;
        ArrayList arrayList = e9Var.c;
        ArrayList arrayList2 = e9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = org.telegram.messenger.bd.a0 ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder h = t4.c.h(str, "  ");
            i3 = 1;
            h.append(org.telegram.messenger.bd.t(message.date));
            spannableString = new SpannableString(h.toString());
            z11 = false;
        } else {
            i3 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.bd.t(message.date)));
        }
        int i13 = e9Var.d;
        Object obj = null;
        if (i13 != 0) {
            if (i13 == i3) {
                if (d9Var.h == null) {
                    Drawable mutate = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i11 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(f6Var, mutate, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                    d9Var.h = mutate;
                } else {
                    i11 = 0;
                }
                spannableString.setSpan(new ImageSpan(d9Var.h, i11), str.length(), str.length() + 1, 33);
            } else if (i13 == 2) {
                Drawable mutate2 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i13 == 3) {
                Drawable mutate3 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (d9Var.f == null) {
                Drawable mutate4 = d9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i10 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.r6.y(f6Var, mutate4, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                d9Var.f = mutate4;
            } else {
                i10 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(d9Var.f, i10), str.length(), str.length() + 1, 33);
        }
        if (e9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i14 = 0; i14 < Math.min(3, arrayList2.size()); i14++) {
                if (i14 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.m5.u((TLObject) arrayList2.get(i14)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.bd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.h10.i(i12).f());
            f6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.f6 f6Var2 = d9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            f6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            x8Var.setVisibility(r12);
            f6Var.r.f();
            f6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i15 = 0; i15 < min; i15++) {
                x8Var.b(i15, i12, (TLObject) arrayList3.get(i15));
            }
            z12 = false;
            x8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            f6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.f6 f6Var3 = d9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            f6Var3.x(obj, null, null, spannableString2, false, false);
            x8Var.setVisibility(8);
            f6Var.f = false;
        }
        imageView.setTag(e9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = r31Var.e;
        org.telegram.ui.Components.wo woVar = d9Var.e;
        if (woVar == null) {
            return;
        }
        woVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new d9(context, i3);
    }
}
