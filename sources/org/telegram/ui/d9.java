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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d9 extends org.telegram.ui.Components.a41 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.a41.h(new d9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.a41
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        int i7;
        boolean z11;
        SpannableString spannableString;
        int i10;
        boolean z12;
        ?? r12;
        int i11;
        f9 f9Var = (f9) b41Var.G;
        e9 e9Var = (e9) view;
        View.OnClickListener onClickListener = b41Var.D;
        int i12 = e9Var.a;
        org.telegram.ui.Components.w8 w8Var = e9Var.b;
        org.telegram.ui.Cells.f6 f6Var = e9Var.d;
        ImageView imageView = e9Var.c;
        boolean z13 = f9Var.e;
        ArrayList arrayList = f9Var.c;
        ArrayList arrayList2 = f9Var.b;
        imageView.setImageResource(z13 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = org.telegram.messenger.hd.a0 ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder m10 = r.b.m(str, "  ");
            i7 = 1;
            m10.append(org.telegram.messenger.hd.t(message.date));
            spannableString = new SpannableString(m10.toString());
            z11 = false;
        } else {
            i7 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.hd.t(message.date)));
        }
        int i13 = f9Var.d;
        Object obj = null;
        if (i13 != 0) {
            if (i13 == i7) {
                if (e9Var.h == null) {
                    Drawable mutate = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i11 = 0;
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.q6.x(f6Var, mutate, org.telegram.ui.ActionBar.j6.A6, null, PorterDuff.Mode.MULTIPLY);
                    e9Var.h = mutate;
                } else {
                    i11 = 0;
                }
                spannableString.setSpan(new ImageSpan(e9Var.h, i11), str.length(), str.length() + 1, 33);
            } else if (i13 == 2) {
                Drawable mutate2 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.r7, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
            } else if (i13 == 3) {
                Drawable mutate3 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                boolean z14 = z11;
                mutate3.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.r7, z14), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (e9Var.f == null) {
                Drawable mutate4 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i10 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.q6.x(f6Var, mutate4, org.telegram.ui.ActionBar.j6.A6, null, PorterDuff.Mode.MULTIPLY);
                e9Var.f = mutate4;
            } else {
                i10 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(e9Var.f, i10), str.length(), str.length() + 1, 33);
        }
        if (f9Var.a != 0) {
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
                sb2.append(org.telegram.messenger.hd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.m10.i(i12).f());
            f6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.f6 f6Var2 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            f6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            w8Var.setVisibility(r12);
            f6Var.r.f();
            f6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i15 = 0; i15 < min; i15++) {
                w8Var.b(i15, i12, (TLObject) arrayList3.get(i15));
            }
            z12 = false;
            w8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            f6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.f6 f6Var3 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            f6Var3.x(obj, null, null, spannableString2, false, false);
            w8Var.setVisibility(8);
            f6Var.f = false;
        }
        imageView.setTag(f9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = b41Var.e;
        org.telegram.ui.Components.fp fpVar = e9Var.e;
        if (fpVar == null) {
            return;
        }
        fpVar.a(z15, z12);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e9(context, i7);
    }
}
