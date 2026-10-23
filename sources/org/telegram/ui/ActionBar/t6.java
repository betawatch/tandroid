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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class t6 {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public s6 g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public g6 n;

    public t6(int i10, View view) {
        this.i = new boolean[1];
        this.e = i10;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof qu) {
            this.a = ((qu) view).getEditText();
        }
    }

    public static boolean b(int i10, View view) {
        if (i10 < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i10;
    }

    public final void a(Object obj, View view, int i10) {
        boolean z10 = obj instanceof View;
        if (z10) {
            ((View) obj).invalidate();
        }
        String str = this.f;
        if (str != null && (obj instanceof bk0)) {
            ((bk0) obj).h(i10, str);
        }
        int i11 = this.j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof lb0)) {
                view2.setBackgroundColor(i10);
                return;
            }
            lb0 lb0Var = (lb0) background;
            lb0Var.a.setColor(i10);
            lb0Var.b = null;
            return;
        }
        if (obj instanceof iu) {
            if ((8388608 & i11) != 0) {
                iu iuVar = (iu) obj;
                iuVar.setHintColor(i10);
                iuVar.setHintTextColor(i10);
                return;
            } else if ((16777216 & i11) != 0) {
                ((iu) obj).setCursorColor(i10);
                return;
            } else {
                ((iu) obj).setTextColor(i10);
                return;
            }
        }
        if (obj instanceof n5) {
            if ((i11 & 2) != 0) {
                ((n5) obj).setLinkTextColor(i10);
                return;
            } else {
                ((n5) obj).setTextColor(i10);
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
                j61[] j61VarArr = (j61[]) spannedString.getSpans(0, spannedString.length(), j61.class);
                if (j61VarArr == null || j61VarArr.length <= 0) {
                    return;
                }
                for (j61 j61Var : j61VarArr) {
                    j61Var.b = i10;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof yq)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i11 & 32) != 0 ? ((yq) drawable2).a : ((yq) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof w9) {
            w9 w9Var = (w9) obj;
            Drawable staticThumb = w9Var.getImageReceiver() != null ? w9Var.getImageReceiver().getStaticThumb() : null;
            if (!(staticThumb instanceof yq)) {
                if (staticThumb != null) {
                    staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable4 = (i11 & 32) != 0 ? ((yq) staticThumb).a : ((yq) staticThumb).b;
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof g90) {
                if ((i11 & 32) != 0) {
                    g90.k.setColor(i10);
                    return;
                } else {
                    ((g90) obj).h.setColor(i10);
                    return;
                }
            }
            if (obj instanceof yq) {
                Drawable drawable5 = (i11 & 32) != 0 ? ((yq) obj).a : ((yq) obj).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                k6.E1((Drawable) obj, i10, (65536 & i11) != 0);
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
            if ((i11 & 8192) != 0) {
                ((CheckBox) obj).setBackgroundColor(i10);
                return;
            } else {
                if ((i11 & 16384) != 0) {
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
            if ((i11 & 8192) != 0) {
                RadioButton radioButton = (RadioButton) obj;
                radioButton.setBackgroundColor(i10);
                radioButton.invalidate();
                return;
            } else {
                if ((i11 & 16384) != 0) {
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
        if (obj instanceof h90) {
            if ((i11 & 2048) != 0) {
                ((h90) obj).setProgressColor(i10);
                return;
            } else {
                ((h90) obj).setBackColor(i10);
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
        if (obj instanceof hp0) {
            if ((i11 & 2048) != 0) {
                ((hp0) obj).setOuterColor(i10);
                return;
            } else {
                ((hp0) obj).setInnerColor(i10);
                return;
            }
        }
        if (obj instanceof e8) {
            if ((i11 & 33554432) != 0) {
                int i12 = 0;
                while (i12 < 2) {
                    e8 e8Var = (e8) obj;
                    TextView textView2 = i12 == 0 ? e8Var.getTextView() : e8Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            j61[] j61VarArr2 = (j61[]) spannedString2.getSpans(0, spannedString2.length(), j61.class);
                            if (j61VarArr2 != null && j61VarArr2.length > 0) {
                                for (j61 j61Var2 : j61VarArr2) {
                                    j61Var2.b = i10;
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
                        e8 e8Var2 = (e8) obj;
                        TextView textView3 = i13 == 0 ? e8Var2.getTextView() : e8Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i10);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                j61[] j61VarArr3 = (j61[]) spannedString3.getSpans(0, spannedString3.length(), j61.class);
                                if (j61VarArr3 != null && j61VarArr3.length > 0) {
                                    for (j61 j61Var3 : j61VarArr3) {
                                        j61Var3.b = i10;
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
        g6 g6Var = this.n;
        int i10 = this.e;
        Integer valueOf = g6Var != null ? Integer.valueOf(g6Var.g(i10)) : null;
        return valueOf != null ? valueOf.intValue() : k6.x0(null, i10, false);
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
                                if (background instanceof yq) {
                                    background = ((yq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    k6.E1(background, i10, (i12 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof yq) {
                                Drawable drawable = ((yq) background).a;
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
                        } else if (view instanceof e8) {
                            int i15 = 0;
                            while (i15 < 2) {
                                e8 e8Var = (e8) view;
                                TextView textView = i15 == 0 ? e8Var.getTextView() : e8Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i10);
                                }
                                i15++;
                            }
                        }
                    } else if ((536870912 & i12) == 0) {
                        if ((i12 & 4096) != 0) {
                            view.setBackgroundDrawable(k6.M0(false));
                        } else if ((268435456 & i12) != 0) {
                            view.setBackgroundDrawable(k6.M0(true));
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
                                    FileLog.e(th2);
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
                                    a(obj, view, i10);
                                }
                            }
                        }
                    }
                } else if (view instanceof v30) {
                    ((v30) view).updateColors();
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        int i11 = this.e;
        if (z11) {
            k6.x1(i11, i10, z10);
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
                    if (drawable instanceof h2) {
                        ((h2) drawable).a(i10);
                    } else if (drawable instanceof zm0) {
                        ((zm0) drawable).b(i10);
                    } else if (drawable instanceof yj0) {
                        String str = this.f;
                        if (str != null) {
                            ((yj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof yq) {
                        if ((i12 & 32) != 0) {
                            ((yq) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((yq) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof h9) {
                        ((h9) drawable).h(i10);
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
                if (background instanceof lb0) {
                    lb0 lb0Var = (lb0) background;
                    lb0Var.a.setColor(i10);
                    lb0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof yq) {
                        background2 = (i12 & 65536) != 0 ? ((yq) background2).a : ((yq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            k6.E1(background2, i10, (i12 & 65536) != 0);
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
        if (view instanceof k) {
            if ((i12 & 64) != 0) {
                ((k) view).B(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((k) view).A(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((1048576 & i12) != 0) {
                ((k) view).setActionModeColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).F(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).F(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                ((k) view).D(i10, (i12 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).C(i10, false);
            }
        }
        if (view instanceof vz) {
            if ((i12 & 4) != 0) {
                ((vz) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((vz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof h90) {
            if ((i12 & 2048) != 0) {
                ((h90) view).setProgressColor(i10);
            } else {
                ((h90) view).setBackColor(i10);
            }
        } else if (view instanceof cr) {
            ((cr) view).updateColors();
        } else if ((view instanceof hp0) && (i12 & 2048) != 0) {
            ((hp0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof n5) {
                ((n5) view).setTextColor(i10);
            } else if (view instanceof po) {
                ((po) view).setTextColor(i10);
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
                        k6.E1(drawable2, i10, (65536 & i12) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof w9)) {
                if (view instanceof n5) {
                    ((n5) view).setSideDrawablesColor(i10);
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
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i10);
        }
        if ((view instanceof z4.h) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((z4.h) view, i10);
        }
        boolean z12 = view instanceof mm0;
        if (z12) {
            mm0 mm0Var = (mm0) view;
            if ((i12 & 4096) != 0) {
                mm0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i12) != 0) {
                mm0Var.A1();
            }
            if ((32768 & i12) != 0) {
                mm0Var.setGlowColor(i10);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(k6.M0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(k6.M0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                mm0 mm0Var2 = (mm0) view;
                mm0Var2.getRecycledViewPool().a();
                int hiddenChildCount = mm0Var2.getHiddenChildCount();
                for (int i14 = 0; i14 < hiddenChildCount; i14++) {
                    d(i10, mm0Var2.V(i14));
                }
                int cachedChildCount = mm0Var2.getCachedChildCount();
                for (int i15 = 0; i15 < cachedChildCount; i15++) {
                    d(i10, mm0Var2.P(i15));
                }
                int attachedScrapChildCount = mm0Var2.getAttachedScrapChildCount();
                for (int i16 = 0; i16 < attachedScrapChildCount; i16++) {
                    d(i10, mm0Var2.O(i16));
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
        s6 s6Var = this.g;
        if (s6Var != null) {
            s6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public t6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, s6 s6Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.g = s6Var;
        if (view instanceof qu) {
            this.a = ((qu) view).getEditText();
        }
    }

    public t6(bk0 bk0Var, yj0[] yj0VarArr, String str, int i10) {
        this.i = new boolean[1];
        this.e = i10;
        this.f = str;
        this.c = yj0VarArr;
        this.a = bk0Var;
        this.j = 0;
        this.d = null;
    }

    public t6(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, s6 s6Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.k = strArr;
        this.g = s6Var;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof qu) {
            this.a = ((qu) view).getEditText();
        }
    }
}
