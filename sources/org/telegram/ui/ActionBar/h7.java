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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h7 {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public g7 g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public u6 n;

    public h7(int i10, View view) {
        this.i = new boolean[1];
        this.e = i10;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof ru) {
            this.a = ((ru) view).getEditText();
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
        if (str != null && (obj instanceof ak0)) {
            ((ak0) obj).h(i10, str);
        }
        int i11 = this.j;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof ib0)) {
                view2.setBackgroundColor(i10);
                return;
            }
            ib0 ib0Var = (ib0) background;
            ib0Var.a.setColor(i10);
            ib0Var.b = null;
            return;
        }
        if (obj instanceof ju) {
            if ((8388608 & i11) != 0) {
                ju juVar = (ju) obj;
                juVar.setHintColor(i10);
                juVar.setHintTextColor(i10);
                return;
            } else if ((16777216 & i11) != 0) {
                ((ju) obj).setCursorColor(i10);
                return;
            } else {
                ((ju) obj).setTextColor(i10);
                return;
            }
        }
        if (obj instanceof b6) {
            if ((i11 & 2) != 0) {
                ((b6) obj).setLinkTextColor(i10);
                return;
            } else {
                ((b6) obj).setTextColor(i10);
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
                q61[] q61VarArr = (q61[]) spannedString.getSpans(0, spannedString.length(), q61.class);
                if (q61VarArr == null || q61VarArr.length <= 0) {
                    return;
                }
                for (q61 q61Var : q61VarArr) {
                    q61Var.b = i10;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof ar)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i11 & 32) != 0 ? ((ar) drawable2).a : ((ar) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof y9) {
            y9 y9Var = (y9) obj;
            Drawable staticThumb = y9Var.getImageReceiver() != null ? y9Var.getImageReceiver().getStaticThumb() : null;
            if (!(staticThumb instanceof ar)) {
                if (staticThumb != null) {
                    staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable4 = (i11 & 32) != 0 ? ((ar) staticThumb).a : ((ar) staticThumb).b;
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof h90) {
                if ((i11 & 32) != 0) {
                    h90.k.setColor(i10);
                    return;
                } else {
                    ((h90) obj).h.setColor(i10);
                    return;
                }
            }
            if (obj instanceof ar) {
                Drawable drawable5 = (i11 & 32) != 0 ? ((ar) obj).a : ((ar) obj).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                y6.E1((Drawable) obj, i10, (65536 & i11) != 0);
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
        if (obj instanceof i90) {
            if ((i11 & 2048) != 0) {
                ((i90) obj).setProgressColor(i10);
                return;
            } else {
                ((i90) obj).setBackColor(i10);
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
        if (obj instanceof lp0) {
            if ((i11 & 2048) != 0) {
                ((lp0) obj).setOuterColor(i10);
                return;
            } else {
                ((lp0) obj).setInnerColor(i10);
                return;
            }
        }
        if (obj instanceof g8) {
            if ((i11 & 33554432) != 0) {
                int i12 = 0;
                while (i12 < 2) {
                    g8 g8Var = (g8) obj;
                    TextView textView2 = i12 == 0 ? g8Var.getTextView() : g8Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            q61[] q61VarArr2 = (q61[]) spannedString2.getSpans(0, spannedString2.length(), q61.class);
                            if (q61VarArr2 != null && q61VarArr2.length > 0) {
                                for (q61 q61Var2 : q61VarArr2) {
                                    q61Var2.b = i10;
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
                        g8 g8Var2 = (g8) obj;
                        TextView textView3 = i13 == 0 ? g8Var2.getTextView() : g8Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i10);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                q61[] q61VarArr3 = (q61[]) spannedString3.getSpans(0, spannedString3.length(), q61.class);
                                if (q61VarArr3 != null && q61VarArr3.length > 0) {
                                    for (q61 q61Var3 : q61VarArr3) {
                                        q61Var3.b = i10;
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
        u6 u6Var = this.n;
        int i10 = this.e;
        Integer valueOf = u6Var != null ? Integer.valueOf(u6Var.g(i10)) : null;
        return valueOf != null ? valueOf.intValue() : y6.x0(null, i10, false);
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
                                if (background instanceof ar) {
                                    background = ((ar) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    y6.E1(background, i10, (i12 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof ar) {
                                Drawable drawable = ((ar) background).a;
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
                        } else if (view instanceof g8) {
                            int i15 = 0;
                            while (i15 < 2) {
                                g8 g8Var = (g8) view;
                                TextView textView = i15 == 0 ? g8Var.getTextView() : g8Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i10);
                                }
                                i15++;
                            }
                        }
                    } else if ((536870912 & i12) == 0) {
                        if ((i12 & 4096) != 0) {
                            view.setBackgroundDrawable(y6.M0(false));
                        } else if ((268435456 & i12) != 0) {
                            view.setBackgroundDrawable(y6.M0(true));
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
                } else if (view instanceof x30) {
                    ((x30) view).updateColors();
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Drawable[] compoundDrawables;
        int i11 = this.e;
        if (z11) {
            y6.x1(i11, i10, z10);
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
                    if (drawable instanceof j2) {
                        ((j2) drawable).a(i10);
                    } else if (drawable instanceof en0) {
                        ((en0) drawable).b(i10);
                    } else if (drawable instanceof xj0) {
                        String str = this.f;
                        if (str != null) {
                            ((xj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof ar) {
                        if ((i12 & 32) != 0) {
                            ((ar) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((ar) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof j9) {
                        ((j9) drawable).h(i10);
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
                if (background instanceof ib0) {
                    ib0 ib0Var = (ib0) background;
                    ib0Var.a.setColor(i10);
                    ib0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof ar) {
                        background2 = (i12 & 65536) != 0 ? ((ar) background2).a : ((ar) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            y6.E1(background2, i10, (i12 & 65536) != 0);
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
                ((k) view).y(i10, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i12 & 256) != 0) {
                ((k) view).x(i10, false);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).D(i10, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).D(i10, false);
            }
            if ((1073741824 & i12) != 0) {
                ((k) view).B(i10, (i12 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).A(i10, false);
            }
        }
        if (view instanceof uz) {
            if ((i12 & 4) != 0) {
                ((uz) view).setTextColor(i10);
            } else if ((i12 & 2048) != 0) {
                ((uz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof i90) {
            if ((i12 & 2048) != 0) {
                ((i90) view).setProgressColor(i10);
            } else {
                ((i90) view).setBackColor(i10);
            }
        } else if (view instanceof er) {
            ((er) view).updateColors();
        } else if ((view instanceof lp0) && (i12 & 2048) != 0) {
            ((lp0) view).setOuterColor(i10);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof b6) {
                ((b6) view).setTextColor(i10);
            } else if (view instanceof qo) {
                ((qo) view).setTextColor(i10);
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
                        y6.E1(drawable2, i10, (65536 & i12) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof y9)) {
                if (view instanceof b6) {
                    ((b6) view).setSideDrawablesColor(i10);
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
        if ((view instanceof a5.m) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((a5.m) view, i10);
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
                view.setBackgroundDrawable(y6.M0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(y6.M0(true));
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
        g7 g7Var = this.g;
        if (g7Var != null) {
            g7Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public h7(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, g7 g7Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.g = g7Var;
        if (view instanceof ru) {
            this.a = ((ru) view).getEditText();
        }
    }

    public h7(ak0 ak0Var, xj0[] xj0VarArr, String str, int i10) {
        this.i = new boolean[1];
        this.e = i10;
        this.f = str;
        this.c = xj0VarArr;
        this.a = ak0Var;
        this.j = 0;
        this.d = null;
    }

    public h7(View view, int i10, Class[] clsArr, String[] strArr, Drawable[] drawableArr, g7 g7Var, int i11) {
        this.i = new boolean[1];
        this.e = i11;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i10;
        this.d = clsArr;
        this.k = strArr;
        this.g = g7Var;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof ru) {
            this.a = ((ru) view).getEditText();
        }
    }
}
