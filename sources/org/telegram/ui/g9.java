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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class g9 extends org.telegram.ui.Components.g61 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new g9());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        SpannableString spannableString;
        boolean z11;
        ?? r12;
        i9 i9Var = (i9) h61Var.G;
        h9 h9Var = (h9) view;
        View.OnClickListener onClickListener = h61Var.D;
        int i10 = h9Var.a;
        org.telegram.ui.Components.k9 k9Var = h9Var.b;
        org.telegram.ui.Cells.i6 i6Var = h9Var.d;
        ImageView imageView = h9Var.c;
        boolean z12 = i9Var.e;
        ArrayList arrayList = i9Var.c;
        ArrayList arrayList2 = i9Var.b;
        imageView.setImageResource(z12 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder j3 = sa.e.j(str, "  ");
            j3.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(j3.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i11 = i9Var.d;
        if (i11 == 0) {
            Drawable mutate = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 1) {
            Drawable mutate2 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 2) {
            Drawable mutate3 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
            mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 3) {
            Drawable mutate4 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (i9Var.a != 0) {
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
            i6Var.setAllowEmojiStatus(r12);
            h9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(r12) : null, null, sb2.toString(), spannableString, false, false);
            k9Var.setVisibility(r12);
            i6Var.r.clearImage();
            i6Var.f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i13 = 0; i13 < min; i13++) {
                k9Var.b(i13, (TLObject) arrayList3.get(i13), i10);
            }
            z11 = false;
            k9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            i6Var.setAllowEmojiStatus(true);
            h9Var.d.t(!arrayList2.isEmpty() ? arrayList2.get(0) : null, null, null, spannableString2, false, false);
            k9Var.setVisibility(8);
            i6Var.f = false;
        }
        imageView.setTag(i9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = h61Var.e;
        org.telegram.ui.Components.qp qpVar = h9Var.e;
        if (qpVar == null) {
            return;
        }
        qpVar.a(z13, z11);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h9(context, i10);
    }
}
