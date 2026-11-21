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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e9 extends org.telegram.ui.Components.n41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.n41.h(new e9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.n41
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        int i7;
        boolean z11;
        SpannableString spannableString;
        int i10;
        boolean z12;
        ?? r12;
        int i11;
        g9 g9Var = (g9) o41Var.H;
        f9 f9Var = (f9) view;
        View.OnClickListener onClickListener = o41Var.E;
        int i12 = f9Var.a;
        org.telegram.ui.Components.e9 e9Var = f9Var.b;
        org.telegram.ui.Cells.h6 h6Var = f9Var.d;
        ImageView imageView = f9Var.c;
        boolean z13 = g9Var.e;
        ArrayList arrayList = g9Var.c;
        ArrayList arrayList2 = g9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = org.telegram.messenger.gd.a0 ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder n10 = p5.c.n(str, "  ");
            i7 = 1;
            n10.append(org.telegram.messenger.gd.t(message.date));
            spannableString = new SpannableString(n10.toString());
            z11 = false;
        } else {
            i7 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.gd.t(message.date)));
        }
        int i13 = g9Var.d;
        Object obj = null;
        if (i13 != 0) {
            if (i13 == i7) {
                if (f9Var.h == null) {
                    Drawable mutate = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i11 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.t6.x(h6Var, mutate, org.telegram.ui.ActionBar.m6.A6, null, PorterDuff.Mode.MULTIPLY);
                    f9Var.h = mutate;
                } else {
                    i11 = 0;
                }
                spannableString.setSpan(new ImageSpan(f9Var.h, i11), str.length(), str.length() + 1, 33);
            } else if (i13 == 2) {
                Drawable mutate2 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i13 == 3) {
                Drawable mutate3 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (f9Var.f == null) {
                Drawable mutate4 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i10 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.t6.x(h6Var, mutate4, org.telegram.ui.ActionBar.m6.A6, null, PorterDuff.Mode.MULTIPLY);
                f9Var.f = mutate4;
            } else {
                i10 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(f9Var.f, i10), str.length(), str.length() + 1, 33);
        }
        if (g9Var.a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i14 = 0; i14 < Math.min(3, arrayList2.size()); i14++) {
                if (i14 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.n5.u((TLObject) arrayList2.get(i14)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.gd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.j10.i(i12).f());
            h6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.h6 h6Var2 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            h6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            e9Var.setVisibility(r12);
            h6Var.r.f();
            h6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i15 = 0; i15 < min; i15++) {
                e9Var.b(i15, i12, (TLObject) arrayList3.get(i15));
            }
            z12 = false;
            e9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            h6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.h6 h6Var3 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            h6Var3.x(obj, null, null, spannableString2, false, false);
            e9Var.setVisibility(8);
            h6Var.f = false;
        }
        imageView.setTag(g9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = o41Var.e;
        org.telegram.ui.Components.op opVar = f9Var.e;
        if (opVar == null) {
            return;
        }
        opVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new f9(context, i7);
    }
}
