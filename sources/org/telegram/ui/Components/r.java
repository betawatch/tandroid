package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r implements TextWatcher {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ LinearLayout d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ TextView f;
    public final /* synthetic */ ScrollView h;

    public r(ImageView imageView, int i7, int i10, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.a = imageView;
        this.b = i7;
        this.c = i10;
        this.d = linearLayout;
        this.e = arrayList;
        this.f = textView;
        this.h = scrollView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        LinearLayout linearLayout;
        int i7;
        String str;
        String lowerCase = editable.toString().trim().toLowerCase();
        boolean isEmpty = lowerCase.isEmpty();
        int i10 = 8;
        this.a.setVisibility(editable.length() > 0 ? 0 : 8);
        int i11 = this.b;
        while (true) {
            linearLayout = this.d;
            i7 = this.c;
            if (i11 >= i7) {
                break;
            }
            linearLayout.getChildAt(i11).setVisibility(!isEmpty ? 8 : 0);
            i11++;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i12 >= arrayList.size() || i7 + i12 >= linearLayout.getChildCount()) {
                break;
            }
            org.telegram.messenger.r00 r00Var = (org.telegram.messenger.r00) arrayList.get(i12);
            String str2 = r00Var.d;
            if (str2 == null) {
                str2 = (r00Var.b + " " + r00Var.c).toLowerCase();
            }
            boolean z10 = isEmpty || str2.contains(lowerCase) || ((str = r00Var.a) != null && str.toLowerCase().startsWith(lowerCase));
            linearLayout.getChildAt(i7 + i12).setVisibility(z10 ? 0 : 8);
            if (z10) {
                i13++;
            }
            i12++;
        }
        if (!isEmpty && i13 == 0) {
            i10 = 0;
        }
        this.f.setVisibility(i10);
        this.h.scrollTo(0, 0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
