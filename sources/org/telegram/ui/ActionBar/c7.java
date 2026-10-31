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
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xy;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c7 {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public b7 g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public p6 n;

    public c7(int i10, View view) {
        this.i = new boolean[1];
        this.e = i10;
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

    public static boolean b(int i10, View view) {
        if (i10 < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i10;
    }

    public final void a(int i10, View view, Object obj) {
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f;
        if (str != null && (obj instanceof ei0)) {
            ((ei0) obj).h(i10, str);
        }
        int i11 = this.j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof aa0)) {
                view2.setBackgroundColor(i10);
                return;
            }
            aa0 aa0Var = (aa0) background;
            aa0Var.a.setColor(i10);
            aa0Var.b = null;
            return;
        }
        if (obj instanceof mt) {
            if ((8388608 & i11) != 0) {
                mt mtVar = (mt) obj;
                mtVar.setHintColor(i10);
                mtVar.setHintTextColor(i10);
                return;
            } else if ((16777216 & i11) != 0) {
                ((mt) obj).setCursorColor(i10);
                return;
            } else {
                ((mt) obj).setTextColor(i10);
                return;
            }
        }
        if (obj instanceof u5) {
            if ((i11 & 2) != 0) {
                ((u5) obj).setLinkTextColor(i10);
                return;
            } else {
                ((u5) obj).setTextColor(i10);
                return;
            }
        }
        if (obj instanceof TextView) {
            TextView textView = (TextView) obj;
            if ((i11 & 8) != 0) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (compoundDrawables != null) {
                    for (Drawable drawable : compoundDrawables) {
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    return;
                }
                return;
            }
            if ((i11 & 2) != 0) {
                textView.getPaint().linkColor = i10;
                textView.invalidate();
                return;
            }
            if ((i11 & 33554432) == 0) {
                textView.setTextColor(i10);
                return;
            }
            CharSequence text = textView.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                x41[] x41VarArr = (x41[]) spannedString.getSpans(0, spannedString.length(), x41.class);
                if (x41VarArr == null || x41VarArr.length <= 0) {
                    return;
                }
                for (x41 x41Var : x41VarArr) {
                    x41Var.b = i10;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof eq)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i11 & 32) != 0 ? ((eq) drawable2).a : ((eq) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof g9) {
            g9 g9Var = (g9) obj;
            Drawable drawable4 = g9Var.getImageReceiver() != null ? g9Var.getImageReceiver().m0 : null;
            if (!(drawable4 instanceof eq)) {
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable5 = (i11 & 32) != 0 ? ((eq) drawable4).a : ((eq) drawable4).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof z70) {
                if ((i11 & 32) != 0) {
                    z70.k.setColor(i10);
                    return;
                } else {
                    ((z70) obj).h.setColor(i10);
                    return;
                }
            }
            if (obj instanceof eq) {
                Drawable drawable6 = (i11 & 32) != 0 ? ((eq) obj).a : ((eq) obj).b;
                if (drawable6 != null) {
                    drawable6.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                t6.H1((Drawable) obj, i10, (65536 & i11) != 0);
                return;
            } else if (obj instanceof GradientDrawable) {
                ((GradientDrawable) obj).setColor(i10);
                return;
            } else {
                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
        }
        if (obj instanceof CheckBox) {
            if ((i11 & TLObject.FLAG_13) != 0) {
                ((CheckBox) obj).setBackgroundColor(i10);
                return;
            } else {
                if ((i11 & TLObject.FLAG_14) != 0) {
                    ((CheckBox) obj).setCheckColor(i10);
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
            if ((i11 & TLObject.FLAG_13) != 0) {
                RadioButton radioButton = (RadioButton) obj;
                radioButton.setBackgroundColor(i10);
                radioButton.invalidate();
                return;
            } else {
                if ((i11 & TLObject.FLAG_14) != 0) {
                    RadioButton radioButton2 = (RadioButton) obj;
                    radioButton2.setCheckedColor(i10);
                    radioButton2.invalidate();
                    return;
                }
                return;
            }
        }
        if (obj instanceof TextPaint) {
            if ((i11 & 2) != 0) {
                ((TextPaint) obj).linkColor = i10;
                return;
            } else {
                ((TextPaint) obj).setColor(i10);
                return;
            }
        }
        if (obj instanceof a80) {
            if ((i11 & 2048) != 0) {
                ((a80) obj).setProgressColor(i10);
                return;
            } else {
                ((a80) obj).setBackColor(i10);
                return;
            }
        }
        if (obj instanceof RadialProgressView) {
            ((RadialProgressView) obj).setProgressColor(i10);
            return;
        }
        if (obj instanceof Paint) {
            ((Paint) obj).setColor(i10);
            view.invalidate();
            return;
        }
        if (obj instanceof nn0) {
            if ((i11 & 2048) != 0) {
                ((nn0) obj).setOuterColor(i10);
                return;
            } else {
                ((nn0) obj).setInnerColor(i10);
                return;
            }
        }
        if (obj instanceof r7) {
            if ((i11 & 33554432) != 0) {
                int i12 = 0;
                while (i12 < 2) {
                    r7 r7Var = (r7) obj;
                    TextView textView2 = i12 == 0 ? r7Var.getTextView() : r7Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            x41[] x41VarArr2 = (x41[]) spannedString2.getSpans(0, spannedString2.length(), x41.class);
                            if (x41VarArr2 != null && x41VarArr2.length > 0) {
                                for (x41 x41Var2 : x41VarArr2) {
                                    x41Var2.b = i10;
                                }
                            }
                        }
                    }
                    i12++;
                }
                return;
            }
            if ((i11 & 4) != 0) {
                if ((262144 & i11) == 0 || b(this.e, (View) obj)) {
                    int i13 = 0;
                    while (i13 < 2) {
                        r7 r7Var2 = (r7) obj;
                        TextView textView3 = i13 == 0 ? r7Var2.getTextView() : r7Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i10);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                x41[] x41VarArr3 = (x41[]) spannedString3.getSpans(0, spannedString3.length(), x41.class);
                                if (x41VarArr3 != null && x41VarArr3.length > 0) {
                                    for (x41 x41Var3 : x41VarArr3) {
                                        x41Var3.b = i10;
                                    }
                                }
                            }
                        }
                        i13++;
                    }
                }
            }
        }
    }

    public final int c() {
        p6 p6Var = this.n;
        int i10 = this.e;
        Integer valueOf = p6Var != null ? Integer.valueOf(p6Var.h(i10)) : null;
        return valueOf != null ? valueOf.intValue() : t6.x0(null, i10, false);
    }

    public final void d(int i10, View view) {
        Class[] clsArr;
        boolean z10;
        String str;
        Field field;
        Object obj;
        if (view == null || (clsArr = this.d) == null) {
            return;
        }
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            Class cls = clsArr[i11];
            if (cls != null && cls.isInstance(view)) {
                view.invalidate();
                int i12 = this.j;
                int i13 = 262144 & i12;
                String[] strArr = this.k;
                int i14 = this.e;
                if (i13 == 0 || b(i14, view)) {
                    view.invalidate();
                    if (strArr == null && (i12 & 32) != 0) {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i12 & 16) == 0) {
                                if (background instanceof eq) {
                                    background = ((eq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    t6.H1(background, i10, (i12 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof eq) {
                                Drawable drawable = ((eq) background).a;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i10);
                                }
                            }
                        }
                    } else if ((i12 & 16) != 0) {
                        view.setBackgroundColor(i10);
                    } else if ((i12 & 4) != 0) {
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(i10);
                        } else if (view instanceof r7) {
                            int i15 = 0;
                            while (i15 < 2) {
                                r7 r7Var = (r7) view;
                                TextView textView = i15 == 0 ? r7Var.getTextView() : r7Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i10);
                                }
                                i15++;
                            }
                        }
                    } else if ((536870912 & i12) == 0) {
                        if ((i12 & TLObject.FLAG_12) != 0) {
                            view.setBackgroundDrawable(t6.N0(false));
                        } else if ((268435456 & i12) != 0) {
                            view.setBackgroundDrawable(t6.N0(true));
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (strArr != null) {
                    if (i11 < strArr.length && (str = strArr[i11]) != null) {
                        String str2 = cls + "_" + str;
                        HashMap hashMap = this.m;
                        if (hashMap == null || !hashMap.containsKey(str2)) {
                            HashMap hashMap2 = this.l;
                            if (hashMap2 != null) {
                                try {
                                    field = (Field) hashMap2.get(str2);
                                } catch (Throwable th2) {
                                    f8.g(th2, true);
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
                            if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || b(i14, (View) obj))) {
                                if (obj instanceof Integer) {
                                    field.set(view, Integer.valueOf(i10));
                                } else {
                                    a(i10, view, obj);
                                }
                            }
                        }
                    }
                } else if (view instanceof s20) {
                    ((s20) view).updateColors();
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        int i11 = this.e;
        if (z11) {
            t6.A1(i11, i10, z10);
        }
        Paint[] paintArr = this.b;
        int i12 = this.j;
        if (paintArr != null) {
            for (int i13 = 0; i13 < paintArr.length; i13++) {
                if ((i12 & 2) != 0) {
                    Paint paint = paintArr[i13];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i10;
                    }
                }
                paintArr[i13].setColor(i10);
            }
        }
        Drawable[] drawableArr = this.c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof c2) {
                        ((c2) drawable).a(i10);
                    } else if (drawable instanceof kl0) {
                        ((kl0) drawable).b(i10);
                    } else if (drawable instanceof bi0) {
                        String str = this.f;
                        if (str != null) {
                            ((bi0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof eq) {
                        if ((i12 & 32) != 0) {
                            ((eq) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((eq) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof r8) {
                        ((r8) drawable).h(i10);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.a.setColor(i10);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.a;
        if (view != null && clsArr == null && this.k == null && ((i12 & 262144) == 0 || b(i11, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof aa0) {
                    aa0 aa0Var = (aa0) background;
                    aa0Var.a.setColor(i10);
                    aa0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof eq) {
                        background2 = (i12 & 65536) != 0 ? ((eq) background2).a : ((eq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            t6.H1(background2, i10, (i12 & 65536) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i10);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                } else if (view instanceof EditTextBoldCursor) {
                    ((EditTextBoldCursor) view).setErrorLineColor(i10);
                }
            }
        }
        if (view instanceof l) {
            if ((i12 & 64) != 0) {
                ((l) view).D(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((l) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((l) view).C(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((l) view).setSubtitleColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((l) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((l) view).I(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((l) view).I(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                ((l) view).G(i10, (i12 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((l) view).F(i10, false);
            }
        }
        if (view instanceof xy) {
            if ((i12 & 4) != 0) {
                ((xy) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((xy) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof a80) {
            if ((i12 & 2048) != 0) {
                ((a80) view).setProgressColor(i10);
            } else {
                ((a80) view).setBackColor(i10);
            }
        } else if (view instanceof iq) {
            ((iq) view).updateColors();
        } else if ((view instanceof nn0) && (i12 & 2048) != 0) {
            ((nn0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof u5) {
                ((u5) view).setTextColor(i10);
            } else if (view instanceof tn) {
                ((tn) view).setTextColor(i10);
            }
        }
        if ((16777216 & i12) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i10);
        }
        if ((8388608 & i12) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i12 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i10);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i10);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i10);
            }
        }
        if ((i12 & 8) != 0 && ((262144 & i12) == 0 || b(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i12) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        t6.H1(drawable2, i10, (65536 & i12) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof g9)) {
                if (view instanceof u5) {
                    ((u5) view).setSideDrawablesColor(i10);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i12 & 32768) != 0) {
            org.telegram.messenger.i0.y3((ScrollView) view, i10);
        }
        if ((view instanceof z4.g) && (i12 & 32768) != 0) {
            org.telegram.messenger.i0.B3((z4.g) view, i10);
        }
        boolean z12 = view instanceof tk0;
        if (z12) {
            tk0 tk0Var = (tk0) view;
            if ((i12 & TLObject.FLAG_12) != 0) {
                tk0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i12) != 0) {
                tk0Var.x1();
            }
            if ((32768 & i12) != 0) {
                tk0Var.setGlowColor(i10);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & TLObject.FLAG_12) != 0) {
                view.setBackgroundDrawable(t6.N0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(t6.N0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                tk0 tk0Var2 = (tk0) view;
                tk0Var2.getRecycledViewPool().a();
                int hiddenChildCount = tk0Var2.getHiddenChildCount();
                for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                    d(i10, tk0Var2.V(i14));
                }
                int cachedChildCount = tk0Var2.getCachedChildCount();
                for (int i15 = 0; i15 < cachedChildCount; i15++) {
                    d(i10, tk0Var2.P(i15));
                }
                int attachedScrapChildCount = tk0Var2.getAttachedScrapChildCount();
                for (int i16 = 0; i16 < attachedScrapChildCount; i16++) {
                    d(i10, tk0Var2.O(i16));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    d(i10, viewGroup.getChildAt(i17));
                }
            }
            d(i10, view);
        }
        b7 b7Var = this.g;
        if (b7Var != null) {
            b7Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public c7(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, b7 b7Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.g = b7Var;
        if (view instanceof wt) {
            this.a = ((wt) view).getEditText();
        }
    }

    public c7(ei0 ei0Var, bi0[] bi0VarArr, String str, int i10) {
        this.i = new boolean[1];
        this.e = i10;
        this.f = str;
        this.c = bi0VarArr;
        this.a = ei0Var;
        this.j = 0;
        this.d = null;
    }

    public c7(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, b7 b7Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.k = strArr;
        this.g = b7Var;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof wt) {
            this.a = ((wt) view).getEditText();
        }
    }
}
