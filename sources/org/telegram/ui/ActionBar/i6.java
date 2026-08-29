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
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.yn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i6 {
    public final View a;
    public final int b;
    public final Paint[] c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f;
    public final String g;
    public h6 h;
    public int i;
    public final boolean[] j;
    public final int k;
    public final String[] l;
    public final HashMap m;
    public final HashMap n;
    public c6 o;

    public i6(View view, int i10, Class[] clsArr, Paint[] paintArr, int i11) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i11;
        this.c = paintArr;
        this.d = null;
        this.a = view;
        this.k = i10;
        this.e = clsArr;
        this.h = null;
        if (view instanceof au) {
            this.a = ((au) view).getEditText();
        }
    }

    public static boolean a(int i10, View view) {
        if (i10 < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i10;
    }

    public final int b() {
        c6 c6Var = this.o;
        int i10 = this.f;
        Integer valueOf = c6Var != null ? Integer.valueOf(c6Var.C0(i10)) : null;
        return valueOf != null ? valueOf.intValue() : g6.w0(null, i10, false);
    }

    public final void c(int i10, View view) {
        int i11;
        boolean z10;
        Field field;
        Object obj;
        t41[] t41VarArr;
        t41[] t41VarArr2;
        t41[] t41VarArr3;
        HashMap hashMap = this.m;
        int i12 = 0;
        while (true) {
            Class[] clsArr = this.e;
            if (i12 >= clsArr.length) {
                return;
            }
            if (clsArr[i12].isInstance(view)) {
                view.invalidate();
                int i13 = this.k;
                int i14 = 262144 & i13;
                int i15 = this.f;
                String[] strArr = this.l;
                if (i14 == 0 || a(i15, view)) {
                    view.invalidate();
                    if (strArr != null || (i13 & 32) == 0) {
                        i11 = 65536;
                        if ((i13 & 16) != 0) {
                            view.setBackgroundColor(i10);
                        } else if ((i13 & 4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i10);
                            } else if (view instanceof a8) {
                                int i16 = 0;
                                while (i16 < 2) {
                                    a8 a8Var = (a8) view;
                                    TextView textView = i16 == 0 ? a8Var.getTextView() : a8Var.getNextTextView();
                                    if (textView != null) {
                                        textView.setTextColor(i10);
                                    }
                                    i16++;
                                }
                            }
                        } else if ((536870912 & i13) == 0) {
                            if ((i13 & 4096) != 0) {
                                view.setBackgroundDrawable(g6.K0(false));
                            } else if ((268435456 & i13) != 0) {
                                view.setBackgroundDrawable(g6.K0(true));
                            }
                        }
                    } else {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i13 & 16) == 0) {
                                if (background instanceof jq) {
                                    background = ((jq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    g6.B1(background, i10, (i13 & 65536) != 0);
                                }
                                i11 = 65536;
                                background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            } else if (background instanceof jq) {
                                Drawable drawable = ((jq) background).a;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i10);
                                }
                            }
                        }
                        i11 = 65536;
                    }
                    z10 = true;
                } else {
                    z10 = false;
                    i11 = 65536;
                }
                if (strArr != null) {
                    String str = clsArr[i12] + "_" + strArr[i12];
                    HashMap hashMap2 = this.n;
                    if (hashMap2 == null || !hashMap2.containsKey(str)) {
                        try {
                            Field field2 = (Field) hashMap.get(str);
                            if (field2 == null) {
                                field = clsArr[i12].getDeclaredField(strArr[i12]);
                                if (field != null) {
                                    field.setAccessible(true);
                                    hashMap.put(str, field);
                                }
                            } else {
                                field = field2;
                            }
                            if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || a(i15, (View) obj))) {
                                if (obj instanceof View) {
                                    ((View) obj).invalidate();
                                }
                                String str2 = this.g;
                                if (str2 != null && (obj instanceof aj0)) {
                                    ((aj0) obj).h(i10, str2);
                                }
                                if ((131072 & i13) != 0 && (obj instanceof View)) {
                                    obj = ((View) obj).getBackground();
                                }
                                if ((i13 & 1) != 0 && (obj instanceof View)) {
                                    View view2 = (View) obj;
                                    Drawable background2 = view2.getBackground();
                                    if (background2 instanceof ma0) {
                                        ((ma0) background2).a.setColor(i10);
                                        ((ma0) background2).b = null;
                                    } else {
                                        view2.setBackgroundColor(i10);
                                    }
                                } else if (obj instanceof st) {
                                    if ((8388608 & i13) != 0) {
                                        ((st) obj).setHintColor(i10);
                                        ((st) obj).setHintTextColor(i10);
                                    } else if ((16777216 & i13) != 0) {
                                        ((st) obj).setCursorColor(i10);
                                    } else {
                                        ((st) obj).setTextColor(i10);
                                    }
                                } else if (obj instanceof h5) {
                                    if ((i13 & 2) != 0) {
                                        ((h5) obj).setLinkTextColor(i10);
                                    } else {
                                        ((h5) obj).setTextColor(i10);
                                    }
                                } else if (obj instanceof TextView) {
                                    TextView textView2 = (TextView) obj;
                                    if ((i13 & 8) != 0) {
                                        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                                        if (compoundDrawables != null) {
                                            for (Drawable drawable2 : compoundDrawables) {
                                                if (drawable2 != null) {
                                                    drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                        }
                                    } else if ((i13 & 2) != 0) {
                                        textView2.getPaint().linkColor = i10;
                                        textView2.invalidate();
                                    } else if ((i13 & 33554432) != 0) {
                                        CharSequence text = textView2.getText();
                                        if ((text instanceof SpannedString) && (t41VarArr3 = (t41[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), t41.class)) != null && t41VarArr3.length > 0) {
                                            for (t41 t41Var : t41VarArr3) {
                                                t41Var.b = i10;
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i10);
                                    }
                                } else if (obj instanceof ImageView) {
                                    ImageView imageView = (ImageView) obj;
                                    Drawable drawable3 = imageView.getDrawable();
                                    if (!(drawable3 instanceof jq)) {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else if ((i13 & 32) != 0) {
                                        ((jq) drawable3).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((jq) drawable3).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof t9) {
                                    Drawable staticThumb = ((t9) obj).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof jq) {
                                        if ((i13 & 32) != 0) {
                                            ((jq) staticThumb).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((jq) staticThumb).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof Drawable) {
                                    if (obj instanceof h80) {
                                        if ((i13 & 32) != 0) {
                                            h80.j.setColor(i10);
                                        } else {
                                            ((h80) obj).h.setColor(i10);
                                        }
                                    } else if (!(obj instanceof jq)) {
                                        if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                                            if (obj instanceof GradientDrawable) {
                                                ((GradientDrawable) obj).setColor(i10);
                                            } else {
                                                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        }
                                        g6.B1((Drawable) obj, i10, (i13 & i11) != 0);
                                    } else if ((i13 & 32) != 0) {
                                        ((jq) obj).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((jq) obj).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (!(obj instanceof CheckBox)) {
                                    if (obj instanceof GroupCreateCheckBox) {
                                        int i17 = GroupCreateCheckBox.b;
                                        g6.u0(0);
                                        throw null;
                                    }
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i10));
                                    } else if (obj instanceof RadioButton) {
                                        if ((i13 & 8192) != 0) {
                                            ((RadioButton) obj).setBackgroundColor(i10);
                                            ((RadioButton) obj).invalidate();
                                        } else if ((i13 & 16384) != 0) {
                                            ((RadioButton) obj).setCheckedColor(i10);
                                            ((RadioButton) obj).invalidate();
                                        }
                                    } else if (obj instanceof TextPaint) {
                                        if ((i13 & 2) != 0) {
                                            ((TextPaint) obj).linkColor = i10;
                                        } else {
                                            ((TextPaint) obj).setColor(i10);
                                        }
                                    } else if (obj instanceof i80) {
                                        if ((i13 & 2048) != 0) {
                                            ((i80) obj).setProgressColor(i10);
                                        } else {
                                            ((i80) obj).setBackColor(i10);
                                        }
                                    } else if (obj instanceof RadialProgressView) {
                                        ((RadialProgressView) obj).setProgressColor(i10);
                                    } else if (obj instanceof Paint) {
                                        ((Paint) obj).setColor(i10);
                                        view.invalidate();
                                    } else if (obj instanceof ao0) {
                                        if ((i13 & 2048) != 0) {
                                            ((ao0) obj).setOuterColor(i10);
                                        } else {
                                            ((ao0) obj).setInnerColor(i10);
                                        }
                                    } else if (obj instanceof a8) {
                                        if ((i13 & 33554432) != 0) {
                                            int i18 = 0;
                                            while (i18 < 2) {
                                                TextView textView3 = i18 == 0 ? ((a8) obj).getTextView() : ((a8) obj).getNextTextView();
                                                if (textView3 != null) {
                                                    CharSequence text2 = textView3.getText();
                                                    if ((text2 instanceof SpannedString) && (t41VarArr2 = (t41[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), t41.class)) != null && t41VarArr2.length > 0) {
                                                        for (t41 t41Var2 : t41VarArr2) {
                                                            t41Var2.b = i10;
                                                        }
                                                    }
                                                }
                                                i18++;
                                            }
                                        } else if ((i13 & 4) != 0 && (i14 == 0 || a(i15, (View) obj))) {
                                            int i19 = 0;
                                            while (i19 < 2) {
                                                TextView textView4 = i19 == 0 ? ((a8) obj).getTextView() : ((a8) obj).getNextTextView();
                                                if (textView4 != null) {
                                                    textView4.setTextColor(i10);
                                                    CharSequence text3 = textView4.getText();
                                                    if ((text3 instanceof SpannedString) && (t41VarArr = (t41[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), t41.class)) != null && t41VarArr.length > 0) {
                                                        for (t41 t41Var3 : t41VarArr) {
                                                            t41Var3.b = i10;
                                                        }
                                                    }
                                                }
                                                i19++;
                                            }
                                        }
                                    }
                                } else if ((i13 & 8192) != 0) {
                                    ((CheckBox) obj).setBackgroundColor(i10);
                                } else if ((i13 & 16384) != 0) {
                                    ((CheckBox) obj).setCheckColor(i10);
                                }
                            }
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            hashMap2.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof j30) {
                    ((j30) view).c();
                }
            }
            i12++;
        }
    }

    public final void d(int i10, boolean z10, boolean z11) {
        sk0 sk0Var;
        Drawable[] compoundDrawables;
        int i11 = this.f;
        if (z11) {
            g6.u1(i11, i10, z10);
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
                    if (drawable instanceof h2) {
                        ((h2) drawable).a(i10);
                    } else if (drawable instanceof vl0) {
                        ((vl0) drawable).b(i10);
                    } else if (drawable instanceof xi0) {
                        String str = this.g;
                        if (str != null) {
                            ((xi0) drawable).O(i10, str);
                        }
                    } else if (drawable instanceof jq) {
                        if ((i13 & 32) != 0) {
                            ((jq) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((jq) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof e9) {
                        ((e9) drawable).h(i10);
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
        if (view != null && clsArr == null && this.l == null && ((i13 & 262144) == 0 || a(i11, view))) {
            if ((i13 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof ma0) {
                    ma0 ma0Var = (ma0) background;
                    ma0Var.a.setColor(i10);
                    ma0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i13 & 32) != 0) {
                if ((i13 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof jq) {
                        background2 = (i13 & 65536) != 0 ? ((jq) background2).a : ((jq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            g6.B1(background2, i10, (i13 & 65536) != 0);
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
            if ((i13 & 64) != 0) {
                ((l) view).C(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((l) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((l) view).B(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((l) view).B(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((l) view).C(i10, true);
            }
            if ((i13 & 1024) != 0) {
                ((l) view).setSubtitleColor(i10);
            }
            if ((1048576 & i13) != 0) {
                ((l) view).setActionModeColor(i10);
            }
            if ((2097152 & i13) != 0) {
                ((l) view).setActionModeTopColor(i10);
            }
            if ((67108864 & i13) != 0) {
                ((l) view).G(i10, true);
            }
            if ((134217728 & i13) != 0) {
                ((l) view).G(i10, false);
            }
            if ((1073741824 & i13) != 0) {
                ((l) view).E(i10, (i13 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i13) != 0) {
                ((l) view).D(i10, false);
            }
        }
        if (view instanceof hz) {
            if ((i13 & 4) != 0) {
                ((hz) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((hz) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof i80) {
            if ((i13 & 2048) != 0) {
                ((i80) view).setProgressColor(i10);
            } else {
                ((i80) view).setBackColor(i10);
            }
        } else if (view instanceof nq) {
            ((nq) view).b();
        } else if ((view instanceof ao0) && (i13 & 2048) != 0) {
            ((ao0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || a(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i10);
            } else if (view instanceof yn) {
                ((yn) view).setTextColor(i10);
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
        if ((i13 & 8) != 0 && ((262144 & i13) == 0 || a(i11, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i13) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        g6.B1(drawable2, i10, (65536 & i13) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof t9)) {
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
        if ((view instanceof m2.g) && (i13 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((m2.g) view, i10);
        }
        boolean z12 = view instanceof jl0;
        if (z12) {
            jl0 jl0Var = (jl0) view;
            if ((i13 & 4096) != 0) {
                jl0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (sk0Var = jl0Var.b1) != null) {
                sk0Var.c();
            }
            if ((32768 & i13) != 0) {
                jl0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = jl0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        c(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = jl0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        c(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = jl0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    c(i10, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i13 & 4096) != 0) {
                view.setBackgroundDrawable(g6.K0(false));
            } else if ((268435456 & i13) != 0) {
                view.setBackgroundDrawable(g6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                jl0 jl0Var2 = (jl0) view;
                jl0Var2.getRecycledViewPool().a();
                int hiddenChildCount = jl0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    c(i10, jl0Var2.V(i17));
                }
                int cachedChildCount = jl0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    c(i10, jl0Var2.P(i18));
                }
                int attachedScrapChildCount = jl0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    c(i10, jl0Var2.O(i19));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    c(i10, viewGroup.getChildAt(i20));
                }
            }
            c(i10, view);
        }
        h6 h6Var = this.h;
        if (h6Var != null) {
            h6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public i6(View view, int i10, Class[] clsArr, Paint paint, Drawable[] drawableArr, h6 h6Var, int i11) {
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
        this.h = h6Var;
        if (view instanceof au) {
            this.a = ((au) view).getEditText();
        }
    }

    public i6(View view, Class[] clsArr, xi0[] xi0VarArr, String str, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        this.g = str;
        this.d = xi0VarArr;
        this.a = view;
        this.k = 0;
        this.e = clsArr;
        if (view instanceof au) {
            this.a = ((au) view).getEditText();
        }
    }

    public i6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, h6 h6Var, int i11) {
        this(view, i10, clsArr, strArr, paintArr, drawableArr, -1, h6Var, i11);
    }

    public i6(View view, int i10, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i11, h6 h6Var, int i12) {
        this.j = new boolean[1];
        this.f = i12;
        this.c = paintArr;
        this.d = drawableArr;
        this.a = view;
        this.k = i10;
        this.e = clsArr;
        this.l = strArr;
        this.b = i11;
        this.h = h6Var;
        this.m = new HashMap();
        this.n = new HashMap();
        if (view instanceof au) {
            this.a = ((au) view).getEditText();
        }
    }

    public i6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i10) {
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
