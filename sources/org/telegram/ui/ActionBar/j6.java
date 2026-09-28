package org.telegram.ui.ActionBar;

import android.graphics.Color;
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
import java.util.ArrayList;
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
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.z80;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class j6 {
    public final View a;
    public final int b;
    public final Paint[] c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f;
    public final String g;
    public i6 h;
    public int i;
    public final boolean[] j;
    public final int k;
    public final String[] l;
    public final HashMap m;
    public final HashMap n;
    public d6 o;

    public j6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i11;
        this.c = paintArr;
        this.d = null;
        this.a = view;
        this.k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof lu) {
            this.a = ((lu) view).getEditText();
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
        String str = this.g;
        if (str != null && (obj instanceof nj0)) {
            ((nj0) obj).h(i10, str);
        }
        int i11 = this.k;
        if ((131072 & i11) != 0 && z10) {
            obj = ((View) obj).getBackground();
        }
        if ((i11 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (!(background instanceof db0)) {
                view2.setBackgroundColor(i10);
                return;
            }
            db0 db0Var = (db0) background;
            db0Var.a.setColor(i10);
            db0Var.b = null;
            return;
        }
        if (obj instanceof du) {
            if ((8388608 & i11) != 0) {
                du duVar = (du) obj;
                duVar.setHintColor(i10);
                duVar.setHintTextColor(i10);
                return;
            } else if ((16777216 & i11) != 0) {
                ((du) obj).setCursorColor(i10);
                return;
            } else {
                ((du) obj).setTextColor(i10);
                return;
            }
        }
        if (obj instanceof h5) {
            if ((i11 & 2) != 0) {
                ((h5) obj).setLinkTextColor(i10);
                return;
            } else {
                ((h5) obj).setTextColor(i10);
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
                u51[] u51VarArr = (u51[]) spannedString.getSpans(0, spannedString.length(), u51.class);
                if (u51VarArr == null || u51VarArr.length <= 0) {
                    return;
                }
                for (u51 u51Var : u51VarArr) {
                    u51Var.b = i10;
                }
                return;
            }
            return;
        }
        if (obj instanceof ImageView) {
            ImageView imageView = (ImageView) obj;
            Drawable drawable2 = imageView.getDrawable();
            if (!(drawable2 instanceof rq)) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            Drawable drawable3 = (i11 & 32) != 0 ? ((rq) drawable2).a : ((rq) drawable2).b;
            if (drawable3 != null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                return;
            }
            return;
        }
        if (obj instanceof w9) {
            w9 w9Var = (w9) obj;
            Drawable staticThumb = w9Var.getImageReceiver() != null ? w9Var.getImageReceiver().getStaticThumb() : null;
            if (!(staticThumb instanceof rq)) {
                if (staticThumb != null) {
                    staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            } else {
                Drawable drawable4 = (i11 & 32) != 0 ? ((rq) staticThumb).a : ((rq) staticThumb).b;
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (obj instanceof Drawable) {
            if (obj instanceof y80) {
                if ((i11 & 32) != 0) {
                    y80.j.setColor(i10);
                    return;
                } else {
                    ((y80) obj).h.setColor(i10);
                    return;
                }
            }
            if (obj instanceof rq) {
                Drawable drawable5 = (i11 & 32) != 0 ? ((rq) obj).a : ((rq) obj).b;
                if (drawable5 != null) {
                    drawable5.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
            if ((obj instanceof StateListDrawable) || (obj instanceof RippleDrawable)) {
                h6.B1((Drawable) obj, i10, (65536 & i11) != 0);
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
            int i12 = GroupCreateCheckBox.b;
            h6.u0(0);
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
        if (obj instanceof z80) {
            if ((i11 & 2048) != 0) {
                ((z80) obj).setProgressColor(i10);
                return;
            } else {
                ((z80) obj).setBackColor(i10);
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
        if (obj instanceof uo0) {
            if ((i11 & 2048) != 0) {
                ((uo0) obj).setOuterColor(i10);
                return;
            } else {
                ((uo0) obj).setInnerColor(i10);
                return;
            }
        }
        if (obj instanceof d8) {
            if ((i11 & 33554432) != 0) {
                int i13 = 0;
                while (i13 < 2) {
                    d8 d8Var = (d8) obj;
                    TextView textView2 = i13 == 0 ? d8Var.getTextView() : d8Var.getNextTextView();
                    if (textView2 != null) {
                        CharSequence text2 = textView2.getText();
                        if (text2 instanceof SpannedString) {
                            SpannedString spannedString2 = (SpannedString) text2;
                            u51[] u51VarArr2 = (u51[]) spannedString2.getSpans(0, spannedString2.length(), u51.class);
                            if (u51VarArr2 != null && u51VarArr2.length > 0) {
                                for (u51 u51Var2 : u51VarArr2) {
                                    u51Var2.b = i10;
                                }
                            }
                        }
                    }
                    i13++;
                }
                return;
            }
            if ((i11 & 4) != 0) {
                if ((262144 & i11) == 0 || b(this.f, (View) obj)) {
                    int i14 = 0;
                    while (i14 < 2) {
                        d8 d8Var2 = (d8) obj;
                        TextView textView3 = i14 == 0 ? d8Var2.getTextView() : d8Var2.getNextTextView();
                        if (textView3 != null) {
                            textView3.setTextColor(i10);
                            CharSequence text3 = textView3.getText();
                            if (text3 instanceof SpannedString) {
                                SpannedString spannedString3 = (SpannedString) text3;
                                u51[] u51VarArr3 = (u51[]) spannedString3.getSpans(0, spannedString3.length(), u51.class);
                                if (u51VarArr3 != null && u51VarArr3.length > 0) {
                                    for (u51 u51Var3 : u51VarArr3) {
                                        u51Var3.b = i10;
                                    }
                                }
                            }
                        }
                        i14++;
                    }
                }
            }
        }
    }

    public final int c() {
        d6 d6Var = this.o;
        int i10 = this.f;
        Integer valueOf = d6Var != null ? Integer.valueOf(d6Var.G0(i10)) : null;
        return valueOf != null ? valueOf.intValue() : h6.w0(null, i10, false);
    }

    public final void d(int i10, View view) {
        Class[] clsArr;
        boolean z10;
        String str;
        Field field;
        Object obj;
        if (view == null || (clsArr = this.e) == null) {
            return;
        }
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            Class cls = clsArr[i11];
            if (cls != null && cls.isInstance(view)) {
                view.invalidate();
                int i12 = this.k;
                int i13 = 262144 & i12;
                String[] strArr = this.l;
                int i14 = this.f;
                if (i13 == 0 || b(i14, view)) {
                    view.invalidate();
                    if (strArr == null && (i12 & 32) != 0) {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i12 & 16) == 0) {
                                if (background instanceof rq) {
                                    background = ((rq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    h6.B1(background, i10, (i12 & 65536) != 0);
                                }
                                if (background != null) {
                                    background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                }
                            } else if (background instanceof rq) {
                                Drawable drawable = ((rq) background).a;
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
                        } else if (view instanceof d8) {
                            int i15 = 0;
                            while (i15 < 2) {
                                d8 d8Var = (d8) view;
                                TextView textView = i15 == 0 ? d8Var.getTextView() : d8Var.getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i10);
                                }
                                i15++;
                            }
                        }
                    } else if ((536870912 & i12) == 0) {
                        if ((i12 & 4096) != 0) {
                            view.setBackgroundDrawable(h6.K0(false));
                        } else if ((268435456 & i12) != 0) {
                            view.setBackgroundDrawable(h6.K0(true));
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (strArr != null) {
                    if (i11 < strArr.length && (str = strArr[i11]) != null) {
                        String str2 = cls + "_" + str;
                        HashMap hashMap = this.n;
                        if (hashMap == null || !hashMap.containsKey(str2)) {
                            HashMap hashMap2 = this.m;
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
                } else if (view instanceof p30) {
                    ((p30) view).c();
                }
            }
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        fl0 fl0Var;
        Drawable[] compoundDrawables;
        int i11 = this.f;
        if (z11) {
            h6.u1(i11, i10, z10);
        }
        int i12 = this.b;
        if (i12 > 0) {
            i10 = Color.argb(i12, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        Paint[] paintArr = this.c;
        int i13 = this.k;
        if (paintArr != null) {
            for (int i14 = 0; i14 < paintArr.length; i14++) {
                if ((i13 & 2) != 0) {
                    Paint paint = paintArr[i14];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i10;
                    }
                }
                paintArr[i14].setColor(i10);
            }
        }
        Drawable[] drawableArr = this.d;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof f2) {
                        ((f2) drawable).a(i10);
                    } else if (drawable instanceof lm0) {
                        ((lm0) drawable).b(i10);
                    } else if (drawable instanceof kj0) {
                        String str = this.g;
                        if (str != null) {
                            ((kj0) drawable).Q(i10, str);
                        }
                    } else if (drawable instanceof rq) {
                        if ((i13 & 32) != 0) {
                            ((rq) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((rq) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
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
        Class[] clsArr = this.e;
        View view = this.a;
        if (view != null && clsArr == null && this.l == null && ((i13 & 262144) == 0 || b(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof db0) {
                    db0 db0Var = (db0) background;
                    db0Var.a.setColor(i10);
                    db0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i13 & 32) != 0) {
                if ((i13 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof rq) {
                        background2 = (i13 & 65536) != 0 ? ((rq) background2).a : ((rq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            h6.B1(background2, i10, (i13 & 65536) != 0);
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
            if ((i13 & 64) != 0) {
                ((k) view).B(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).A(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).A(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).B(i10, true);
            }
            if ((i13 & 1024) != 0) {
                ((k) view).setSubtitleColor(i10);
            }
            if ((1048576 & i13) != 0) {
                ((k) view).setActionModeColor(i10);
            }
            if ((2097152 & i13) != 0) {
                ((k) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i13) != 0) {
                ((k) view).H(i10, true);
            }
            if ((134217728 & i13) != 0) {
                ((k) view).H(i10, false);
            }
            if ((1073741824 & i13) != 0) {
                ((k) view).F(i10, (i13 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((k) view).E(i10, false);
            }
        }
        if (view instanceof oz) {
            if ((i13 & 4) != 0) {
                ((oz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((oz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof z80) {
            if ((i13 & 2048) != 0) {
                ((z80) view).setProgressColor(i10);
            } else {
                ((z80) view).setBackColor(i10);
            }
        } else if (view instanceof vq) {
            ((vq) view).b();
        } else if ((view instanceof uo0) && (i13 & 2048) != 0) {
            ((uo0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || b(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i10);
            } else if (view instanceof ho) {
                ((ho) view).setTextColor(i10);
            }
        }
        if ((16777216 & i13) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i10);
        }
        if ((8388608 & i13) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i13 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i10);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i10);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i10);
            }
        }
        if ((i13 & 8) != 0 && ((262144 & i13) == 0 || b(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i13) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        h6.B1(drawable2, i10, (65536 & i13) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof w9)) {
                if (view instanceof h5) {
                    ((h5) view).setSideDrawablesColor(i10);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i13 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i10);
        }
        if ((view instanceof z4.g) && (i13 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((z4.g) view, i10);
        }
        boolean z12 = view instanceof yl0;
        if (z12) {
            yl0 yl0Var = (yl0) view;
            if ((i13 & 4096) != 0) {
                yl0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (fl0Var = yl0Var.f1) != null) {
                fl0Var.c();
            }
            if ((32768 & i13) != 0) {
                yl0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = yl0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        d(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = yl0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        d(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = yl0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    d(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(h6.K0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(h6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                yl0 yl0Var2 = (yl0) view;
                yl0Var2.getRecycledViewPool().a();
                int hiddenChildCount = yl0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    d(i10, yl0Var2.V(i17));
                }
                int cachedChildCount = yl0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    d(i10, yl0Var2.P(i18));
                }
                int attachedScrapChildCount = yl0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    d(i10, yl0Var2.O(i19));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    d(i10, viewGroup.getChildAt(i20));
                }
            }
            d(i10, view);
        }
        i6 i6Var = this.h;
        if (i6Var != null) {
            i6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public j6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, i6 i6Var, int i11) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i11;
        if (paint != null) {
            this.c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.a = view;
        this.k = i10;
        this.e = clsArr;
        this.h = i6Var;
        if (view instanceof lu) {
            this.a = ((lu) view).getEditText();
        }
    }

    public j6(View view, Class[] clsArr, kj0[] kj0VarArr, String str, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        this.g = str;
        this.d = kj0VarArr;
        this.a = view;
        this.k = 0;
        this.e = clsArr;
        if (view instanceof lu) {
            this.a = ((lu) view).getEditText();
        }
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, i6 i6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, i6Var, i11);
    }

    public j6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, i6 i6Var, int i12) {
        this.j = new boolean[1];
        this.f = i12;
        this.c = paintArr;
        this.d = drawableArr;
        this.a = view;
        this.k = i10;
        this.e = clsArr;
        this.l = strArr;
        this.b = i11;
        this.h = i6Var;
        this.m = new HashMap();
        this.n = new HashMap();
        if (view instanceof lu) {
            this.a = ((lu) view).getEditText();
        }
    }

    public j6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        this.g = str;
        this.a = undoView;
        this.k = 0;
        this.e = clsArr;
        this.l = strArr;
        this.m = new HashMap();
        this.n = new HashMap();
    }
}
