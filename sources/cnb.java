// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cnb {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public bnb g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public ylb n;

    public cnb(View view, int i, Class[] clsArr, String[] strArr, Drawable[] drawableArr, bnb bnbVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.k = strArr;
        this.g = bnbVar;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
        }
    }

    public static boolean b(int i, View view) {
        if (i < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i;
    }

    public final void a(Object obj, View view, int i) {
        boolean z = obj instanceof View;
        if (z) {
            ((View) obj).invalidate();
        }
        String str = this.f;
        if (str != null && (obj instanceof s09)) {
            ((s09) obj).h(i, str);
        }
        int i2 = this.j;
        if ((131072 & i2) != 0 && z) {
            obj = ((View) obj).getBackground();
        }
        if ((i2 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof f37)) {
                view2.setBackgroundColor(i);
                return;
            }
            f37 f37Var = (f37) background;
            f37Var.a.setColor(i);
            f37Var.b = null;
            return;
        }
        if (obj instanceof qu3) {
            if ((8388608 & i2) != 0) {
                qu3 qu3Var = (qu3) obj;
                qu3Var.setHintColor(i);
                qu3Var.setHintTextColor(i);
                return;
            } else if ((i2 & 16777216) != 0) {
                ((qu3) obj).setCursorColor(i);
                return;
            } else {
                ((qu3) obj).setTextColor(i);
                return;
            }
        }
        if (obj instanceof lka) {
            if ((i2 & 2) != 0) {
                ((lka) obj).setLinkTextColor(i);
                return;
            } else {
                ((lka) obj).setTextColor(i);
                return;
            }
        }
        if (obj instanceof TextView) {
            TextView textView = (TextView) obj;
            if ((i2 & 8) != 0) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (compoundDrawables != null) {
                    for (Drawable drawable : compoundDrawables) {
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    return;
                }
                return;
            }
            if ((i2 & 2) != 0) {
                textView.getPaint().linkColor = i;
                textView.invalidate();
                return;
            }
            if ((i2 & 33554432) == 0) {
                textView.setTextColor(i);
                return;
            }
            CharSequence text = textView.getText();
            if (text instanceof SpannedString) {
                SpannedString spannedString = (SpannedString) text;
                z5c[] z5cVarArr = (z5c[]) spannedString.getSpans(0, spannedString.length(), z5c.class);
                if (z5cVarArr == null || z5cVarArr.length <= 0) {
                    return;
                }
                for (z5c z5cVar : z5cVarArr) {
                    z5cVar.b = i;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof sn2)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i2 & 32) != 0 ? ((sn2) drawable2).a : ((sn2) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof bf0) {
            bf0 bf0Var = (bf0) obj;
            Drawable drawable4 = bf0Var.getImageReceiver() != null ? bf0Var.getImageReceiver().n0 : null;
            if (!(drawable4 instanceof sn2)) {
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable5 = (i2 & 32) != 0 ? ((sn2) drawable4).a : ((sn2) drawable4).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof o26) {
                if ((i2 & 32) != 0) {
                    o26.k.setColor(i);
                    return;
                } else {
                    ((o26) obj).h.setColor(i);
                    return;
                }
            }
            if (obj instanceof sn2) {
                Drawable drawable6 = (i2 & 32) != 0 ? ((sn2) obj).a : ((sn2) obj).b;
                if (drawable6 != null) {
                    drawable6.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                cmb.F1((Drawable) obj, i, (i2 & 65536) != 0);
                return;
            } else if (obj instanceof GradientDrawable) {
                ((GradientDrawable) obj).setColor(i);
                return;
            } else {
                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                return;
            }
        }
        if (obj instanceof CheckBox) {
            if ((i2 & TLObject.FLAG_13) != 0) {
                ((CheckBox) obj).setBackgroundColor(i);
                return;
            } else {
                if ((i2 & TLObject.FLAG_14) != 0) {
                    ((CheckBox) obj).setCheckColor(i);
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
            if ((i2 & TLObject.FLAG_13) != 0) {
                RadioButton radioButton = (RadioButton) obj;
                radioButton.setBackgroundColor(i);
                radioButton.invalidate();
                return;
            } else {
                if ((i2 & TLObject.FLAG_14) != 0) {
                    RadioButton radioButton2 = (RadioButton) obj;
                    radioButton2.setCheckedColor(i);
                    radioButton2.invalidate();
                    return;
                }
                return;
            }
        }
        if (obj instanceof TextPaint) {
            if ((i2 & 2) != 0) {
                ((TextPaint) obj).linkColor = i;
                return;
            } else {
                ((TextPaint) obj).setColor(i);
                return;
            }
        }
        if (obj instanceof k46) {
            if ((i2 & 2048) != 0) {
                ((k46) obj).setProgressColor(i);
                return;
            } else {
                ((k46) obj).setBackColor(i);
                return;
            }
        }
        if (obj instanceof RadialProgressView) {
            ((RadialProgressView) obj).setProgressColor(i);
            return;
        }
        if (obj instanceof Paint) {
            ((Paint) obj).setColor(i);
            view.invalidate();
            return;
        }
        if (obj instanceof dx9) {
            if ((i2 & 2048) != 0) {
                ((dx9) obj).setOuterColor(i);
                return;
            } else {
                ((dx9) obj).setInnerColor(i);
                return;
            }
        }
        if (obj instanceof c30) {
            if ((33554432 & i2) != 0) {
                int i3 = 0;
                while (i3 < 2) {
                    c30 c30Var = (c30) obj;
                    TextView textView2 = i3 == 0 ? c30Var.getTextView() : c30Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            z5c[] z5cVarArr2 = (z5c[]) spannedString2.getSpans(0, spannedString2.length(), z5c.class);
                            if (z5cVarArr2 != null && z5cVarArr2.length > 0) {
                                for (z5c z5cVar2 : z5cVarArr2) {
                                    z5cVar2.b = i;
                                }
                            }
                        }
                    }
                    i3++;
                }
                return;
            }
            if ((i2 & 4) != 0) {
                if ((i2 & 262144) == 0 || b(this.e, (View) obj)) {
                    int i4 = 0;
                    while (i4 < 2) {
                        c30 c30Var2 = (c30) obj;
                        TextView textView3 = i4 == 0 ? c30Var2.getTextView() : c30Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                z5c[] z5cVarArr3 = (z5c[]) spannedString3.getSpans(0, spannedString3.length(), z5c.class);
                                if (z5cVarArr3 != null && z5cVarArr3.length > 0) {
                                    for (z5c z5cVar3 : z5cVarArr3) {
                                        z5cVar3.b = i;
                                    }
                                }
                            }
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public final int c() {
        ylb ylbVar = this.n;
        int i = this.e;
        Integer valueOf = ylbVar != null ? Integer.valueOf(ylbVar.h(i)) : null;
        return valueOf != null ? valueOf.intValue() : cmb.w0(null, i, false);
    }

    public final void d(int i, View view) {
        Class[] clsArr;
        boolean z;
        String str;
        Field field;
        Object obj;
        if (view == null || (clsArr = this.d) == null) {
            return;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Class cls = clsArr[i2];
            if (cls != null && cls.isInstance(view)) {
                view.invalidate();
                int i3 = this.j;
                int i4 = 262144 & i3;
                String[] strArr = this.k;
                int i5 = this.e;
                if (i4 == 0 || b(i5, view)) {
                    view.invalidate();
                    if (strArr == null && (i3 & 32) != 0) {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i3 & 16) == 0) {
                                if (background instanceof sn2) {
                                    background = ((sn2) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    cmb.F1(background, i, (i3 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof sn2) {
                                Drawable drawable = ((sn2) background).a;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i);
                                }
                            }
                        }
                    } else if ((i3 & 16) != 0) {
                        view.setBackgroundColor(i);
                    } else if ((i3 & 4) != 0) {
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(i);
                        } else if (view instanceof c30) {
                            int i6 = 0;
                            while (i6 < 2) {
                                c30 c30Var = (c30) view;
                                TextView textView = i6 == 0 ? c30Var.getTextView() : c30Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i);
                                }
                                i6++;
                            }
                        }
                    } else if ((536870912 & i3) == 0) {
                        if ((i3 & TLObject.FLAG_12) != 0) {
                            view.setBackgroundDrawable(cmb.L0(false));
                        } else if ((i3 & TLObject.FLAG_28) != 0) {
                            view.setBackgroundDrawable(cmb.L0(true));
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (strArr != null) {
                    if (i2 < strArr.length && (str = strArr[i2]) != null) {
                        String str2 = cls + "_" + str;
                        HashMap hashMap = this.m;
                        if (hashMap == null || !hashMap.containsKey(str2)) {
                            HashMap hashMap2 = this.l;
                            if (hashMap2 != null) {
                                try {
                                    field = (Field) hashMap2.get(str2);
                                } catch (Throwable th) {
                                    fc4.g(th, true);
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
                            if (field != null && (obj = field.get(view)) != null && (z || !(obj instanceof View) || b(i5, (View) obj))) {
                                if (obj instanceof Integer) {
                                    field.set(view, Integer.valueOf(i));
                                } else {
                                    a(obj, view, i);
                                }
                            }
                        }
                    }
                } else if (view instanceof wc5) {
                    ((wc5) view).updateColors();
                }
            }
        }
    }

    public final void e(int i, boolean z, boolean z2) {
        Drawable[] compoundDrawables;
        int i2 = this.e;
        if (z2) {
            cmb.y1(i2, i, z);
        }
        Paint[] paintArr = this.b;
        int i3 = this.j;
        if (paintArr != null) {
            for (int i4 = 0; i4 < paintArr.length; i4++) {
                if ((i3 & 2) != 0) {
                    Paint paint = paintArr[i4];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i;
                    }
                }
                paintArr[i4].setColor(i);
            }
        }
        Drawable[] drawableArr = this.c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof ee0) {
                        ((ee0) drawable).a(i);
                    } else if (drawable instanceof hs9) {
                        ((hs9) drawable).b(i);
                    } else if (drawable instanceof p09) {
                        String str = this.f;
                        if (str != null) {
                            ((p09) drawable).L(i, str);
                        }
                    } else if (drawable instanceof sn2) {
                        if ((i3 & 32) != 0) {
                            ((sn2) drawable).a.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((sn2) drawable).b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof pc0) {
                        ((pc0) drawable).g(i);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.a.setColor(i);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.a;
        if (view != null && clsArr == null && this.k == null && ((i3 & 262144) == 0 || b(i2, view))) {
            if ((i3 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof f37) {
                    f37 f37Var = (f37) background;
                    f37Var.a.setColor(i);
                    f37Var.b = null;
                } else {
                    view.setBackgroundColor(i);
                }
            }
            if ((i3 & 32) != 0) {
                if ((i3 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof sn2) {
                        background2 = (i3 & 65536) != 0 ? ((sn2) background2).a : ((sn2) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            cmb.F1(background2, i, (i3 & 65536) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                } else if (view instanceof EditTextBoldCursor) {
                    ((EditTextBoldCursor) view).setErrorLineColor(i);
                }
            }
        }
        if (view instanceof a) {
            if ((i3 & 64) != 0) {
                ((a) view).H(i, false);
            }
            if ((i3 & 128) != 0) {
                ((a) view).setTitleColor(i);
            }
            if ((i3 & 256) != 0) {
                ((a) view).G(i, false);
            }
            if ((i3 & 1024) != 0) {
                ((a) view).setSubtitleColor(i);
            }
            if ((2097152 & i3) != 0) {
                ((a) view).setActionModeTopColor(i);
            }
            if ((67108864 & i3) != 0) {
                ((a) view).L(i, true);
            }
            if ((134217728 & i3) != 0) {
                ((a) view).L(i, false);
            }
            if ((1073741824 & i3) != 0) {
                ((a) view).J(i, (i3 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i3) != 0) {
                ((a) view).I(i, false);
            }
        }
        if (view instanceof r34) {
            if ((i3 & 4) != 0) {
                ((r34) view).setTextColor(i);
            } else if ((i3 & 2048) != 0) {
                ((r34) view).setProgressBarColor(i);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i);
        } else if (view instanceof k46) {
            if ((i3 & 2048) != 0) {
                ((k46) view).setProgressColor(i);
            } else {
                ((k46) view).setBackColor(i);
            }
        } else if (view instanceof mx2) {
            ((mx2) view).updateColors();
        } else if ((view instanceof dx9) && (i3 & 2048) != 0) {
            ((dx9) view).setOuterColor(i);
        }
        if ((i3 & 4) != 0 && ((i3 & 262144) == 0 || b(i2, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i);
            } else if (view instanceof lka) {
                ((lka) view).setTextColor(i);
            } else if (view instanceof b92) {
                ((b92) view).setTextColor(i);
            }
        }
        if ((16777216 & i3) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i);
        }
        if ((8388608 & i3) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i3 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i);
            }
        }
        if ((i3 & 8) != 0 && ((262144 & i3) == 0 || b(i2, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i3) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        cmb.F1(drawable2, i, (65536 & i3) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof bf0)) {
                if (view instanceof lka) {
                    ((lka) view).setSideDrawablesColor(i);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i3 & 32768) != 0) {
            gm.u3((ScrollView) view, i);
        }
        if ((view instanceof ggc) && (i3 & 32768) != 0) {
            gm.w3((ggc) view, i);
        }
        boolean z3 = view instanceof r59;
        if (z3) {
            r59 r59Var = (r59) view;
            if ((i3 & TLObject.FLAG_12) != 0) {
                r59Var.setListSelectorColor(Integer.valueOf(i));
            }
            if ((33554432 & i3) != 0) {
                r59Var.x1();
            }
            if ((i3 & 32768) != 0) {
                r59Var.setGlowColor(i);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i3 & TLObject.FLAG_12) != 0) {
                view.setBackgroundDrawable(cmb.L0(false));
            } else if ((i3 & TLObject.FLAG_28) != 0) {
                view.setBackgroundDrawable(cmb.L0(true));
            }
        }
        if (clsArr != null) {
            if (z3) {
                r59 r59Var2 = (r59) view;
                r59Var2.getRecycledViewPool().a();
                int hiddenChildCount = r59Var2.getHiddenChildCount();
                for (int i5 = 0; i5 < hiddenChildCount; i5++) {
                    d(i, r59Var2.W(i5));
                }
                int cachedChildCount = r59Var2.getCachedChildCount();
                for (int i6 = 0; i6 < cachedChildCount; i6++) {
                    d(i, r59Var2.P(i6));
                }
                int attachedScrapChildCount = r59Var2.getAttachedScrapChildCount();
                for (int i7 = 0; i7 < attachedScrapChildCount; i7++) {
                    d(i, r59Var2.O(i7));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    d(i, viewGroup.getChildAt(i8));
                }
            }
            d(i, view);
        }
        bnb bnbVar = this.g;
        if (bnbVar != null) {
            bnbVar.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public cnb(View view, int i, Class[] clsArr, Paint paint, Drawable[] drawableArr, bnb bnbVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.g = bnbVar;
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
        }
    }

    public cnb(s09 s09Var, p09[] p09VarArr, String str, int i) {
        this.i = new boolean[1];
        this.e = i;
        this.f = str;
        this.c = p09VarArr;
        this.a = s09Var;
        this.j = 0;
        this.d = null;
    }

    public cnb(int i, View view) {
        this.i = new boolean[1];
        this.e = i;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
        }
    }
}
