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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h6 {
    public final View a;
    public final int b;
    public final Paint[] c;
    public final Drawable[] d;
    public final Class[] e;
    public final int f;
    public final String g;
    public g6 h;
    public int i;
    public final boolean[] j;
    public final int k;
    public final String[] l;
    public final HashMap m;
    public final HashMap n;
    public b6 o;

    public h6(View view, int i9, Class[] clsArr, Paint[] paintArr, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        this.c = paintArr;
        this.d = null;
        this.a = view;
        this.k = i9;
        this.e = clsArr;
        this.h = null;
        if (view instanceof ut) {
            this.a = ((ut) view).getEditText();
        }
    }

    public static boolean a(int i9, View view) {
        if (i9 < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i9;
    }

    public final int b() {
        b6 b6Var = this.o;
        int i9 = this.f;
        Integer valueOf = b6Var != null ? Integer.valueOf(b6Var.N0(i9)) : null;
        return valueOf != null ? valueOf.intValue() : f6.w0(null, i9, false);
    }

    public final void c(int i9, View view) {
        int i10;
        boolean z10;
        Field field;
        Object obj;
        i41[] i41VarArr;
        i41[] i41VarArr2;
        i41[] i41VarArr3;
        HashMap hashMap = this.m;
        int i11 = 0;
        while (true) {
            Class[] clsArr = this.e;
            if (i11 >= clsArr.length) {
                return;
            }
            if (clsArr[i11].isInstance(view)) {
                view.invalidate();
                int i12 = this.k;
                int i13 = 262144 & i12;
                int i14 = this.f;
                String[] strArr = this.l;
                if (i13 == 0 || a(i14, view)) {
                    view.invalidate();
                    if (strArr != null || (i12 & 32) == 0) {
                        i10 = 65536;
                        if ((i12 & 16) != 0) {
                            view.setBackgroundColor(i9);
                        } else if ((i12 & 4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i9);
                            } else if (view instanceof w7) {
                                int i15 = 0;
                                while (i15 < 2) {
                                    w7 w7Var = (w7) view;
                                    TextView textView = i15 == 0 ? w7Var.getTextView() : w7Var.getNextTextView();
                                    if (textView != null) {
                                        textView.setTextColor(i9);
                                    }
                                    i15++;
                                }
                            }
                        } else if ((536870912 & i12) == 0) {
                            if ((i12 & 4096) != 0) {
                                view.setBackgroundDrawable(f6.K0(false));
                            } else if ((268435456 & i12) != 0) {
                                view.setBackgroundDrawable(f6.K0(true));
                            }
                        }
                    } else {
                        Drawable background = view.getBackground();
                        if (background != null) {
                            if ((i12 & 16) == 0) {
                                if (background instanceof fq) {
                                    background = ((fq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    f6.B1(background, i9, (i12 & 65536) != 0);
                                }
                                i10 = 65536;
                                background.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                            } else if (background instanceof fq) {
                                Drawable drawable = ((fq) background).a;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i9);
                                }
                            }
                        }
                        i10 = 65536;
                    }
                    z10 = true;
                } else {
                    z10 = false;
                    i10 = 65536;
                }
                if (strArr != null) {
                    String str = clsArr[i11] + "_" + strArr[i11];
                    HashMap hashMap2 = this.n;
                    if (hashMap2 == null || !hashMap2.containsKey(str)) {
                        try {
                            Field field2 = (Field) hashMap.get(str);
                            if (field2 == null) {
                                field = clsArr[i11].getDeclaredField(strArr[i11]);
                                if (field != null) {
                                    field.setAccessible(true);
                                    hashMap.put(str, field);
                                }
                            } else {
                                field = field2;
                            }
                            if (field != null && (obj = field.get(view)) != null && (z10 || !(obj instanceof View) || a(i14, (View) obj))) {
                                if (obj instanceof View) {
                                    ((View) obj).invalidate();
                                }
                                String str2 = this.g;
                                if (str2 != null && (obj instanceof pi0)) {
                                    ((pi0) obj).h(i9, str2);
                                }
                                if ((131072 & i12) != 0 && (obj instanceof View)) {
                                    obj = ((View) obj).getBackground();
                                }
                                if ((i12 & 1) != 0 && (obj instanceof View)) {
                                    View view2 = (View) obj;
                                    Drawable background2 = view2.getBackground();
                                    if (background2 instanceof y90) {
                                        ((y90) background2).a.setColor(i9);
                                        ((y90) background2).b = null;
                                    } else {
                                        view2.setBackgroundColor(i9);
                                    }
                                } else if (obj instanceof mt) {
                                    if ((8388608 & i12) != 0) {
                                        ((mt) obj).setHintColor(i9);
                                        ((mt) obj).setHintTextColor(i9);
                                    } else if ((16777216 & i12) != 0) {
                                        ((mt) obj).setCursorColor(i9);
                                    } else {
                                        ((mt) obj).setTextColor(i9);
                                    }
                                } else if (obj instanceof h5) {
                                    if ((i12 & 2) != 0) {
                                        ((h5) obj).setLinkTextColor(i9);
                                    } else {
                                        ((h5) obj).setTextColor(i9);
                                    }
                                } else if (obj instanceof TextView) {
                                    TextView textView2 = (TextView) obj;
                                    if ((i12 & 8) != 0) {
                                        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                                        if (compoundDrawables != null) {
                                            for (Drawable drawable2 : compoundDrawables) {
                                                if (drawable2 != null) {
                                                    drawable2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                        }
                                    } else if ((i12 & 2) != 0) {
                                        textView2.getPaint().linkColor = i9;
                                        textView2.invalidate();
                                    } else if ((i12 & 33554432) != 0) {
                                        CharSequence text = textView2.getText();
                                        if ((text instanceof SpannedString) && (i41VarArr3 = (i41[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), i41.class)) != null && i41VarArr3.length > 0) {
                                            for (i41 i41Var : i41VarArr3) {
                                                i41Var.b = i9;
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i9);
                                    }
                                } else if (obj instanceof ImageView) {
                                    ImageView imageView = (ImageView) obj;
                                    Drawable drawable3 = imageView.getDrawable();
                                    if (!(drawable3 instanceof fq)) {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    } else if ((i12 & 32) != 0) {
                                        ((fq) drawable3).a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((fq) drawable3).b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof o9) {
                                    Drawable staticThumb = ((o9) obj).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof fq) {
                                        if ((i12 & 32) != 0) {
                                            ((fq) staticThumb).a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((fq) staticThumb).b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof Drawable) {
                                    if (obj instanceof u70) {
                                        if ((i12 & 32) != 0) {
                                            u70.j.setColor(i9);
                                        } else {
                                            ((u70) obj).h.setColor(i9);
                                        }
                                    } else if (!(obj instanceof fq)) {
                                        if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                                            if (obj instanceof GradientDrawable) {
                                                ((GradientDrawable) obj).setColor(i9);
                                            } else {
                                                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                            }
                                        }
                                        f6.B1((Drawable) obj, i9, (i12 & i10) != 0);
                                    } else if ((i12 & 32) != 0) {
                                        ((fq) obj).a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((fq) obj).b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (!(obj instanceof CheckBox)) {
                                    if (obj instanceof GroupCreateCheckBox) {
                                        int i16 = GroupCreateCheckBox.b;
                                        f6.u0(0);
                                        throw null;
                                    }
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i9));
                                    } else if (obj instanceof RadioButton) {
                                        if ((i12 & 8192) != 0) {
                                            ((RadioButton) obj).setBackgroundColor(i9);
                                            ((RadioButton) obj).invalidate();
                                        } else if ((i12 & 16384) != 0) {
                                            ((RadioButton) obj).setCheckedColor(i9);
                                            ((RadioButton) obj).invalidate();
                                        }
                                    } else if (obj instanceof TextPaint) {
                                        if ((i12 & 2) != 0) {
                                            ((TextPaint) obj).linkColor = i9;
                                        } else {
                                            ((TextPaint) obj).setColor(i9);
                                        }
                                    } else if (obj instanceof v70) {
                                        if ((i12 & 2048) != 0) {
                                            ((v70) obj).setProgressColor(i9);
                                        } else {
                                            ((v70) obj).setBackColor(i9);
                                        }
                                    } else if (obj instanceof RadialProgressView) {
                                        ((RadialProgressView) obj).setProgressColor(i9);
                                    } else if (obj instanceof Paint) {
                                        ((Paint) obj).setColor(i9);
                                        view.invalidate();
                                    } else if (obj instanceof pn0) {
                                        if ((i12 & 2048) != 0) {
                                            ((pn0) obj).setOuterColor(i9);
                                        } else {
                                            ((pn0) obj).setInnerColor(i9);
                                        }
                                    } else if (obj instanceof w7) {
                                        if ((i12 & 33554432) != 0) {
                                            int i17 = 0;
                                            while (i17 < 2) {
                                                TextView textView3 = i17 == 0 ? ((w7) obj).getTextView() : ((w7) obj).getNextTextView();
                                                if (textView3 != null) {
                                                    CharSequence text2 = textView3.getText();
                                                    if ((text2 instanceof SpannedString) && (i41VarArr2 = (i41[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), i41.class)) != null && i41VarArr2.length > 0) {
                                                        for (i41 i41Var2 : i41VarArr2) {
                                                            i41Var2.b = i9;
                                                        }
                                                    }
                                                }
                                                i17++;
                                            }
                                        } else if ((i12 & 4) != 0 && (i13 == 0 || a(i14, (View) obj))) {
                                            int i18 = 0;
                                            while (i18 < 2) {
                                                TextView textView4 = i18 == 0 ? ((w7) obj).getTextView() : ((w7) obj).getNextTextView();
                                                if (textView4 != null) {
                                                    textView4.setTextColor(i9);
                                                    CharSequence text3 = textView4.getText();
                                                    if ((text3 instanceof SpannedString) && (i41VarArr = (i41[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), i41.class)) != null && i41VarArr.length > 0) {
                                                        for (i41 i41Var3 : i41VarArr) {
                                                            i41Var3.b = i9;
                                                        }
                                                    }
                                                }
                                                i18++;
                                            }
                                        }
                                    }
                                } else if ((i12 & 8192) != 0) {
                                    ((CheckBox) obj).setBackgroundColor(i9);
                                } else if ((i12 & 16384) != 0) {
                                    ((CheckBox) obj).setCheckColor(i9);
                                }
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                            hashMap2.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof w20) {
                    ((w20) view).c();
                }
            }
            i11++;
        }
    }

    public final void d(int i9, boolean z10, boolean z11) {
        fk0 fk0Var;
        Drawable[] compoundDrawables;
        int i10 = this.f;
        if (z11) {
            f6.u1(i10, i9, z10);
        }
        int i11 = this.b;
        if (i11 > 0) {
            i9 = Color.argb(i11, Color.red(i9), Color.green(i9), Color.blue(i9));
        }
        Paint[] paintArr = this.c;
        int i12 = this.k;
        if (paintArr != null) {
            for (int i13 = 0; i13 < paintArr.length; i13++) {
                if ((i12 & 2) != 0) {
                    Paint paint = paintArr[i13];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i9;
                    }
                }
                paintArr[i13].setColor(i9);
            }
        }
        Drawable[] drawableArr = this.d;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof h2) {
                        ((h2) drawable).a(i9);
                    } else if (drawable instanceof il0) {
                        ((il0) drawable).b(i9);
                    } else if (drawable instanceof mi0) {
                        String str = this.g;
                        if (str != null) {
                            ((mi0) drawable).O(i9, str);
                        }
                    } else if (drawable instanceof fq) {
                        if ((i12 & 32) != 0) {
                            ((fq) drawable).a.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((fq) drawable).b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof z8) {
                        ((z8) drawable).h(i9);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.a.setColor(i9);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.e;
        View view = this.a;
        if (view != null && clsArr == null && this.l == null && ((i12 & 262144) == 0 || a(i10, view))) {
            if ((i12 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof y90) {
                    y90 y90Var = (y90) background;
                    y90Var.a.setColor(i9);
                    y90Var.b = null;
                } else {
                    view.setBackgroundColor(i9);
                }
            }
            if ((i12 & 32) != 0) {
                if ((i12 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof fq) {
                        background2 = (i12 & 65536) != 0 ? ((fq) background2).a : ((fq) background2).b;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            f6.B1(background2, i9, (i12 & 65536) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i9);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                } else if (view instanceof EditTextBoldCursor) {
                    ((EditTextBoldCursor) view).setErrorLineColor(i9);
                }
            }
        }
        if (view instanceof k) {
            if ((i12 & 64) != 0) {
                ((k) view).C(i9, false);
            }
            if ((i12 & 128) != 0) {
                ((k) view).setTitleColor(i9);
            }
            if ((i12 & 256) != 0) {
                ((k) view).A(i9, false);
            }
            if ((4194304 & i12) != 0) {
                ((k) view).A(i9, true);
            }
            if ((i12 & 512) != 0) {
                ((k) view).C(i9, true);
            }
            if ((i12 & 1024) != 0) {
                ((k) view).setSubtitleColor(i9);
            }
            if ((1048576 & i12) != 0) {
                ((k) view).setActionModeColor(i9);
            }
            if ((2097152 & i12) != 0) {
                ((k) view).setActionModeTopColor(i9);
            }
            if ((67108864 & i12) != 0) {
                ((k) view).G(i9, true);
            }
            if ((134217728 & i12) != 0) {
                ((k) view).G(i9, false);
            }
            if ((1073741824 & i12) != 0) {
                ((k) view).E(i9, (i12 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i12) != 0) {
                ((k) view).D(i9, false);
            }
        }
        if (view instanceof yy) {
            if ((i12 & 4) != 0) {
                ((yy) view).setTextColor(i9);
            } else if ((i12 & 2048) != 0) {
                ((yy) view).setProgressBarColor(i9);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i9);
        } else if (view instanceof v70) {
            if ((i12 & 2048) != 0) {
                ((v70) view).setProgressColor(i9);
            } else {
                ((v70) view).setBackColor(i9);
            }
        } else if (view instanceof jq) {
            ((jq) view).b();
        } else if ((view instanceof pn0) && (i12 & 2048) != 0) {
            ((pn0) view).setOuterColor(i9);
        }
        if ((i12 & 4) != 0 && ((i12 & 262144) == 0 || a(i10, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i9);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i9);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i9);
            } else if (view instanceof un) {
                ((un) view).setTextColor(i9);
            }
        }
        if ((16777216 & i12) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i9);
        }
        if ((8388608 & i12) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i12 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i9);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i9);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i9);
            }
        }
        if ((i12 & 8) != 0 && ((262144 & i12) == 0 || a(i10, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i12) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        f6.B1(drawable2, i9, (65536 & i12) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof o9)) {
                if (view instanceof h5) {
                    ((h5) view).setSideDrawablesColor(i9);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i12 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i9);
        }
        if ((view instanceof m2.g) && (i12 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((m2.g) view, i9);
        }
        boolean z12 = view instanceof wk0;
        if (z12) {
            wk0 wk0Var = (wk0) view;
            if ((i12 & 4096) != 0) {
                wk0Var.setListSelectorColor(Integer.valueOf(i9));
            }
            if ((33554432 & i12) != 0 && (fk0Var = wk0Var.b1) != null) {
                fk0Var.c();
            }
            if ((32768 & i12) != 0) {
                wk0Var.setGlowColor(i9);
            }
            if ((524288 & i12) != 0) {
                ArrayList<View> headers = wk0Var.getHeaders();
                if (headers != null) {
                    for (int i14 = 0; i14 < headers.size(); i14++) {
                        c(i9, headers.get(i14));
                    }
                }
                ArrayList<View> headersCache = wk0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i15 = 0; i15 < headersCache.size(); i15++) {
                        c(i9, headersCache.get(i15));
                    }
                }
                View pinnedHeader = wk0Var.getPinnedHeader();
                if (pinnedHeader != null) {
                    c(i9, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i12 & 4096) != 0) {
                view.setBackgroundDrawable(f6.K0(false));
            } else if ((268435456 & i12) != 0) {
                view.setBackgroundDrawable(f6.K0(true));
            }
        }
        if (clsArr != null) {
            if (z12) {
                wk0 wk0Var2 = (wk0) view;
                wk0Var2.getRecycledViewPool().a();
                int hiddenChildCount = wk0Var2.getHiddenChildCount();
                for (int i16 = 0; i16 < hiddenChildCount; i16++) {
                    c(i9, wk0Var2.V(i16));
                }
                int cachedChildCount = wk0Var2.getCachedChildCount();
                for (int i17 = 0; i17 < cachedChildCount; i17++) {
                    c(i9, wk0Var2.P(i17));
                }
                int attachedScrapChildCount = wk0Var2.getAttachedScrapChildCount();
                for (int i18 = 0; i18 < attachedScrapChildCount; i18++) {
                    c(i9, wk0Var2.O(i18));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    c(i9, viewGroup.getChildAt(i19));
                }
            }
            c(i9, view);
        }
        g6 g6Var = this.h;
        if (g6Var != null) {
            g6Var.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public h6(View view, int i9, Class[] clsArr, Paint paint, Drawable[] drawableArr, g6 g6Var, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        if (paint != null) {
            this.c = new Paint[]{paint};
        }
        this.d = drawableArr;
        this.a = view;
        this.k = i9;
        this.e = clsArr;
        this.h = g6Var;
        if (view instanceof ut) {
            this.a = ((ut) view).getEditText();
        }
    }

    public h6(View view, Class[] clsArr, mi0[] mi0VarArr, String str, int i9) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i9;
        this.g = str;
        this.d = mi0VarArr;
        this.a = view;
        this.k = 0;
        this.e = clsArr;
        if (view instanceof ut) {
            this.a = ((ut) view).getEditText();
        }
    }

    public h6(View view, int i9, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, g6 g6Var, int i10) {
        this(view, i9, clsArr, strArr, paintArr, drawableArr, -1, g6Var, i10);
    }

    public h6(View view, int i9, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i10, g6 g6Var, int i11) {
        this.j = new boolean[1];
        this.f = i11;
        this.c = paintArr;
        this.d = drawableArr;
        this.a = view;
        this.k = i9;
        this.e = clsArr;
        this.l = strArr;
        this.b = i10;
        this.h = g6Var;
        this.m = new HashMap();
        this.n = new HashMap();
        if (view instanceof ut) {
            this.a = ((ut) view).getEditText();
        }
    }

    public h6(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i9) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i9;
        this.g = str;
        this.a = undoView;
        this.k = 0;
        this.e = clsArr;
        this.l = strArr;
        this.m = new HashMap();
        this.n = new HashMap();
    }
}
