package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.z7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class w6 {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public v6 g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public i6 n;

    public w6(int i7, View view) {
        this.i = new boolean[1];
        this.e = i7;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof wt) {
            this.a = ((wt) view).getEditText();
        }
    }

    public static boolean b(int i7, View view) {
        if (i7 < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i7;
    }

    public final void a(Object obj, View view, int i7) {
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f;
        if (str != null && (obj instanceof qh0)) {
            ((qh0) obj).h(i7, str);
        }
        int i10 = this.j;
        if ((131072 & i10) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        if ((i10 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof u90)) {
                view2.setBackgroundColor(i7);
                return;
            }
            u90 u90Var = (u90) background;
            u90Var.a.setColor(i7);
            u90Var.b = null;
            return;
        }
        if (obj instanceof mt) {
            if ((8388608 & i10) != 0) {
                mt mtVar = (mt) obj;
                mtVar.setHintColor(i7);
                mtVar.setHintTextColor(i7);
                return;
            } else if ((16777216 & i10) != 0) {
                ((mt) obj).setCursorColor(i7);
                return;
            } else {
                ((mt) obj).setTextColor(i7);
                return;
            }
        }
        if (obj instanceof n5) {
            if ((i10 & 2) != 0) {
                ((n5) obj).setLinkTextColor(i7);
                return;
            } else {
                ((n5) obj).setTextColor(i7);
                return;
            }
        }
        if (obj instanceof TextView) {
            TextView textView = (TextView) obj;
            if ((i10 & 8) != 0) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (compoundDrawables != null) {
                    for (Drawable drawable : compoundDrawables) {
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    return;
                }
                return;
            }
            if ((i10 & 2) != 0) {
                textView.getPaint().linkColor = i7;
                textView.invalidate();
                return;
            }
            if ((i10 & 33554432) == 0) {
                textView.setTextColor(i7);
                return;
            }
            CharSequence text = textView.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                k41[] k41VarArr = (k41[]) spannedString.getSpans(0, spannedString.length(), k41.class);
                if (k41VarArr == null || k41VarArr.length <= 0) {
                    return;
                }
                for (k41 k41Var : k41VarArr) {
                    k41Var.b = i7;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof lq)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i10 & 32) != 0 ? ((lq) drawable2).a : ((lq) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof p9) {
            p9 p9Var = (p9) obj;
            Drawable drawable4 = p9Var.getImageReceiver() != null ? p9Var.getImageReceiver().n0 : null;
            if (!(drawable4 instanceof lq)) {
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable5 = (i10 & 32) != 0 ? ((lq) drawable4).a : ((lq) drawable4).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof t70) {
                if ((i10 & 32) != 0) {
                    t70.k.setColor(i7);
                    return;
                } else {
                    ((t70) obj).h.setColor(i7);
                    return;
                }
            }
            if (obj instanceof lq) {
                Drawable drawable6 = (i10 & 32) != 0 ? ((lq) obj).a : ((lq) obj).b;
                if (drawable6 != null) {
                    drawable6.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                n6.H1((Drawable) obj, i7, (65536 & i10) != 0);
                return;
            } else if (obj instanceof GradientDrawable) {
                ((GradientDrawable) obj).setColor(i7);
                return;
            } else {
                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                return;
            }
        }
        if (obj instanceof CheckBox) {
            if ((i10 & TLObject.FLAG_13) != 0) {
                ((CheckBox) obj).setBackgroundColor(i7);
                return;
            } else {
                if ((i10 & TLObject.FLAG_14) != 0) {
                    ((CheckBox) obj).setCheckColor(i7);
                    return;
                }
                return;
            }
        }
        if (obj instanceof GroupCreateCheckBox) {
            ((GroupCreateCheckBox) obj).updateColors();
            throw null;
        }
        if (obj instanceof RadioButton) {
            if ((i10 & TLObject.FLAG_13) != 0) {
                RadioButton radioButton = (RadioButton) obj;
                radioButton.setBackgroundColor(i7);
                radioButton.invalidate();
                return;
            } else {
                if ((i10 & TLObject.FLAG_14) != 0) {
                    RadioButton radioButton2 = (RadioButton) obj;
                    radioButton2.setCheckedColor(i7);
                    radioButton2.invalidate();
                    return;
                }
                return;
            }
        }
        if (obj instanceof TextPaint) {
            if ((i10 & 2) != 0) {
                ((TextPaint) obj).linkColor = i7;
                return;
            } else {
                ((TextPaint) obj).setColor(i7);
                return;
            }
        }
        if (obj instanceof u70) {
            if ((i10 & 2048) != 0) {
                ((u70) obj).setProgressColor(i7);
                return;
            } else {
                ((u70) obj).setBackColor(i7);
                return;
            }
        }
        if (obj instanceof RadialProgressView) {
            ((RadialProgressView) obj).setProgressColor(i7);
            return;
        }
        if (obj instanceof Paint) {
            ((Paint) obj).setColor(i7);
            view.invalidate();
            return;
        }
        if (obj instanceof an0) {
            if ((i10 & 2048) != 0) {
                ((an0) obj).setOuterColor(i7);
                return;
            } else {
                ((an0) obj).setInnerColor(i7);
                return;
            }
        }
        if (obj instanceof z7) {
            if ((i10 & 33554432) != 0) {
                int i11 = 0;
                while (i11 < 2) {
                    z7 z7Var = (z7) obj;
                    TextView textView2 = i11 == 0 ? z7Var.getTextView() : z7Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            k41[] k41VarArr2 = (k41[]) spannedString2.getSpans(0, spannedString2.length(), k41.class);
                            if (k41VarArr2 != null && k41VarArr2.length > 0) {
                                for (k41 k41Var2 : k41VarArr2) {
                                    k41Var2.b = i7;
                                }
                            }
                        }
                    }
                    i11++;
                }
                return;
            }
            if ((i10 & 4) != 0) {
                if ((262144 & i10) == 0 || b(this.e, (View) obj)) {
                    int i12 = 0;
                    while (i12 < 2) {
                        z7 z7Var2 = (z7) obj;
                        TextView textView3 = i12 == 0 ? z7Var2.getTextView() : z7Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i7);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                k41[] k41VarArr3 = (k41[]) spannedString3.getSpans(0, spannedString3.length(), k41.class);
                                if (k41VarArr3 != null && k41VarArr3.length > 0) {
                                    for (k41 k41Var3 : k41VarArr3) {
                                        k41Var3.b = i7;
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                }
            }
        }
    }

    public final int c() {
        i6 i6Var = this.n;
        int i7 = this.e;
        Integer valueOf = i6Var != null ? Integer.valueOf(i6Var.i(i7)) : null;
        return valueOf != null ? valueOf.intValue() : n6.x0(null, i7, false);
    }

    public final void d(int i7, View view) {
        Class[] clsArr;
        boolean z10;
        String str;
        Field field;
        Object obj;
        if (view == null || (clsArr = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            Class cls = clsArr[i10];
            if (cls != null && cls.isInstance(view)) {
                view.invalidate();
                int i11 = this.j;
                int i12 = 262144 & i11;
                String[] strArr = this.k;
                int i13 = this.e;
                if (i12 == 0 || b(i13, view)) {
                    view.invalidate();
                    if (strArr == null && (i11 & 32) != 0) {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i11 & 16) == 0) {
                                if (background instanceof lq) {
                                    background = ((lq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    n6.H1(background, i7, (i11 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof lq) {
                                Drawable drawable = ((lq) background).a;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i7);
                                }
                            }
                        }
                    } else if ((i11 & 16) != 0) {
                        view.setBackgroundColor(i7);
                    } else if ((i11 & 4) != 0) {
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(i7);
                        } else if (view instanceof z7) {
                            int i14 = 0;
                            while (i14 < 2) {
                                z7 z7Var = (z7) view;
                                TextView textView = i14 == 0 ? z7Var.getTextView() : z7Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i7);
                                }
                                i14++;
                            }
                        }
                    } else if ((536870912 & i11) == 0) {
                        if ((i11 & TLObject.FLAG_12) != 0) {
                            view.setBackgroundDrawable(n6.N0(false));
                        } else if ((268435456 & i11) != 0) {
                            view.setBackgroundDrawable(n6.N0(true));
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (strArr != null) {
                    if (i10 < strArr.length && (str = strArr[i10]) != null) {
                        String str2 = cls + "_" + str;
                        HashMap hashMap = this.m;
                        if (hashMap == null || !hashMap.containsKey(str2)) {
                            HashMap hashMap2 = this.l;
                            if (hashMap2 != null) {
                                try {
                                    field = (Field) hashMap2.get(str2);
                                } catch (Throwable th2) {
                                    a8.g(th2, true);
                                    if (hashMap != null) {
                                        hashMap.put(str2, Boolean.TRUE);
                                    }
                                }
                            } else {
                                field = null;
                            }
                            if (field == null && (field = cls.getDeclaredField(str)) != null) {
                                field.setAccessible(true);
                                if (hashMap2 != null) {
                                    hashMap2.put(str2, field);
                                }
                            }
                            if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || b(i13, (View) obj))) {
                                if (obj instanceof Integer) {
                                    field.set(view, Integer.valueOf(i7));
                                } else {
                                    a(obj, view, i7);
                                }
                            }
                        }
                    }
                } else if (view instanceof n20) {
                    ((n20) view).updateColors();
                }
            }
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        int i10 = this.e;
        if (z11) {
            n6.A1(i10, i7, z10);
        }
        Paint[] paintArr = this.b;
        int i11 = this.j;
        if (paintArr != null) {
            for (int i12 = 0; i12 < paintArr.length; i12++) {
                if ((i11 & 2) != 0) {
                    Paint paint = paintArr[i12];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i7;
                    }
                }
                paintArr[i12].setColor(i7);
            }
        }
        Drawable[] drawableArr = this.c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof x1) {
                        ((x1) drawable).a(i7);
                    } else if (drawable instanceof vk0) {
                        ((vk0) drawable).b(i7);
                    } else if (drawable instanceof nh0) {
                        String str = this.f;
                        if (str != null) {
                            ((nh0) drawable).Q(i7, str);
                        }
                    } else if (drawable instanceof lq) {
                        if ((i11 & 32) != 0) {
                            ((lq) drawable).a.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((lq) drawable).b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof a9) {
                        ((a9) drawable).h(i7);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.a.setColor(i7);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.a;
        if (view != null && clsArr == null && this.k == null && ((i11 & 262144) == 0 || b(i10, view))) {
            if ((i11 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof u90) {
                    u90 u90Var = (u90) background;
                    u90Var.a.setColor(i7);
                    u90Var.b = null;
                } else {
                    view.setBackgroundColor(i7);
                }
            }
            if ((i11 & 32) != 0) {
                if ((i11 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof lq) {
                        background2 = (i11 & 65536) != 0 ? ((lq) background2).a : ((lq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            n6.H1(background2, i7, (i11 & 65536) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i7);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                } else if (view instanceof EditTextBoldCursor) {
                    ((EditTextBoldCursor) view).setErrorLineColor(i7);
                }
            }
        }
        if (view instanceof k) {
            if ((i11 & 64) != 0) {
                ((k) view).F(i7, false);
            }
            if ((i11 & 128) != 0) {
                ((k) view).setTitleColor(i7);
            }
            if ((i11 & 256) != 0) {
                ((k) view).E(i7, false);
            }
            if ((i11 & 1024) != 0) {
                ((k) view).setSubtitleColor(i7);
            }
            if ((2097152 & i11) != 0) {
                ((k) view).setActionModeTopColor(i7);
            }
            if ((67108864 & i11) != 0) {
                ((k) view).L(i7, true);
            }
            if ((134217728 & i11) != 0) {
                ((k) view).L(i7, false);
            }
            if ((1073741824 & i11) != 0) {
                ((k) view).I(i7, (i11 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i11) != 0) {
                ((k) view).H(i7, false);
            }
        }
        if (view instanceof sy) {
            if ((i11 & 4) != 0) {
                ((sy) view).setTextColor(i7);
            } else if ((i11 & 2048) != 0) {
                ((sy) view).setProgressBarColor(i7);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i7);
        } else if (view instanceof u70) {
            if ((i11 & 2048) != 0) {
                ((u70) view).setProgressColor(i7);
            } else {
                ((u70) view).setBackColor(i7);
            }
        } else if (view instanceof nq) {
            ((nq) view).updateColors();
        } else if ((view instanceof an0) && (i11 & 2048) != 0) {
            ((an0) view).setOuterColor(i7);
        }
        if ((i11 & 4) != 0 && ((i11 & 262144) == 0 || b(i10, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i7);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i7);
            } else if (view instanceof n5) {
                ((n5) view).setTextColor(i7);
            } else if (view instanceof ao) {
                ((ao) view).setTextColor(i7);
            }
        }
        if ((16777216 & i11) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i7);
        }
        if ((8388608 & i11) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i11 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i7);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i7);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i7);
            }
        }
        if ((i11 & 8) != 0 && ((262144 & i11) == 0 || b(i10, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i11) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        n6.H1(drawable2, i7, (65536 & i11) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof p9)) {
                if (view instanceof n5) {
                    ((n5) view).setSideDrawablesColor(i7);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i11 & 32768) != 0) {
            org.telegram.messenger.g0.x3((ScrollView) view, i7);
        }
        if ((view instanceof c5.l) && (i11 & 32768) != 0) {
            org.telegram.messenger.g0.A3((c5.l) view, i7);
        }
        boolean z12 = view instanceof ek0;
        if (z12) {
            ek0 ek0Var = (ek0) view;
            if ((i11 & TLObject.FLAG_12) != 0) {
                ek0Var.setListSelectorColor(Integer.valueOf(i7));
            }
            if ((33554432 & i11) != 0) {
                ek0Var.x1();
            }
            if ((32768 & i11) != 0) {
                ek0Var.setGlowColor(i7);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i11 & TLObject.FLAG_12) != 0) {
                view.setBackgroundDrawable(n6.N0(false));
            } else if ((268435456 & i11) != 0) {
                view.setBackgroundDrawable(n6.N0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                ek0 ek0Var2 = (ek0) view;
                ek0Var2.getRecycledViewPool().a();
                int hiddenChildCount = ek0Var2.getHiddenChildCount();
                for (int i13 = 0; i13 < hiddenChildCount; i13++) {
                    d(i7, ek0Var2.V(i13));
                }
                int cachedChildCount = ek0Var2.getCachedChildCount();
                for (int i14 = 0; i14 < cachedChildCount; i14++) {
                    d(i7, ek0Var2.P(i14));
                }
                int attachedScrapChildCount = ek0Var2.getAttachedScrapChildCount();
                for (int i15 = 0; i15 < attachedScrapChildCount; i15++) {
                    d(i7, ek0Var2.O(i15));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    d(i7, viewGroup.getChildAt(i16));
                }
            }
            d(i7, view);
        }
        v6 v6Var = this.g;
        if (v6Var != null) {
            v6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public w6(View view, int i7, Class[] clsArr, Paint paint, Drawable[] drawableArr, v6 v6Var, int i10) {
        this.i = new boolean[1];
        this.e = i10;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i7;
        this.d = clsArr;
        this.g = v6Var;
        if (view instanceof wt) {
            this.a = ((wt) view).getEditText();
        }
    }

    public w6(qh0 qh0Var, nh0[] nh0VarArr, String str, int i7) {
        this.i = new boolean[1];
        this.e = i7;
        this.f = str;
        this.c = nh0VarArr;
        this.a = qh0Var;
        this.j = 0;
        this.d = null;
    }

    public w6(View view, int i7, Class[] clsArr, String[] strArr, Drawable[] drawableArr, v6 v6Var, int i10) {
        this.i = new boolean[1];
        this.e = i10;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i7;
        this.d = clsArr;
        this.k = strArr;
        this.g = v6Var;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof wt) {
            this.a = ((wt) view).getEditText();
        }
    }
}
