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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.qn0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        if (view instanceof tt) {
            this.a = ((tt) view).getEditText();
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
        Integer valueOf = c6Var != null ? Integer.valueOf(c6Var.N0(i10)) : null;
        return valueOf != null ? valueOf.intValue() : g6.w0(null, i10, false);
    }

    public final void c(int i10, View view) {
        int i11;
        boolean z10;
        Field field;
        Object obj;
        k41[] k41VarArr;
        k41[] k41VarArr2;
        k41[] k41VarArr3;
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
                            } else if (view instanceof v7) {
                                int i16 = 0;
                                while (i16 < 2) {
                                    v7 v7Var = (v7) view;
                                    TextView textView = i16 == 0 ? v7Var.getTextView() : v7Var.getNextTextView();
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
                                if (background instanceof dq) {
                                    background = ((dq) background).b;
                                } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                    g6.B1(background, i10, (i13 & 65536) != 0);
                                }
                                i11 = 65536;
                                background.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                            } else if (background instanceof dq) {
                                Drawable drawable = ((dq) background).a;
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
                                if (str2 != null && (obj instanceof ri0)) {
                                    ((ri0) obj).h(i10, str2);
                                }
                                if ((131072 & i13) != 0 && (obj instanceof View)) {
                                    obj = ((View) obj).getBackground();
                                }
                                if ((i13 & 1) != 0 && (obj instanceof View)) {
                                    View view2 = (View) obj;
                                    Drawable background2 = view2.getBackground();
                                    if (background2 instanceof ca0) {
                                        ((ca0) background2).a.setColor(i10);
                                        ((ca0) background2).b = null;
                                    } else {
                                        view2.setBackgroundColor(i10);
                                    }
                                } else if (obj instanceof lt) {
                                    if ((8388608 & i13) != 0) {
                                        ((lt) obj).setHintColor(i10);
                                        ((lt) obj).setHintTextColor(i10);
                                    } else if ((16777216 & i13) != 0) {
                                        ((lt) obj).setCursorColor(i10);
                                    } else {
                                        ((lt) obj).setTextColor(i10);
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
                                        if ((text instanceof SpannedString) && (k41VarArr3 = (k41[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), k41.class)) != null && k41VarArr3.length > 0) {
                                            for (k41 k41Var : k41VarArr3) {
                                                k41Var.b = i10;
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i10);
                                    }
                                } else if (obj instanceof ImageView) {
                                    ImageView imageView = (ImageView) obj;
                                    Drawable drawable3 = imageView.getDrawable();
                                    if (!(drawable3 instanceof dq)) {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else if ((i13 & 32) != 0) {
                                        ((dq) drawable3).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((dq) drawable3).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof n9) {
                                    Drawable staticThumb = ((n9) obj).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof dq) {
                                        if ((i13 & 32) != 0) {
                                            ((dq) staticThumb).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((dq) staticThumb).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (obj instanceof Drawable) {
                                    if (obj instanceof y70) {
                                        if ((i13 & 32) != 0) {
                                            y70.j.setColor(i10);
                                        } else {
                                            ((y70) obj).h.setColor(i10);
                                        }
                                    } else if (!(obj instanceof dq)) {
                                        if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                                            if (obj instanceof GradientDrawable) {
                                                ((GradientDrawable) obj).setColor(i10);
                                            } else {
                                                ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                            }
                                        }
                                        g6.B1((Drawable) obj, i10, (i13 & i11) != 0);
                                    } else if ((i13 & 32) != 0) {
                                        ((dq) obj).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((dq) obj).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (!(obj instanceof CheckBox)) {
                                    if (obj instanceof GroupCreateCheckBox) {
                                        int i17 = GroupCreateCheckBox.b;
                                        g6.w0(null, 0, false);
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
                                    } else if (obj instanceof z70) {
                                        if ((i13 & 2048) != 0) {
                                            ((z70) obj).setProgressColor(i10);
                                        } else {
                                            ((z70) obj).setBackColor(i10);
                                        }
                                    } else if (obj instanceof RadialProgressView) {
                                        ((RadialProgressView) obj).setProgressColor(i10);
                                    } else if (obj instanceof Paint) {
                                        ((Paint) obj).setColor(i10);
                                        view.invalidate();
                                    } else if (obj instanceof qn0) {
                                        if ((i13 & 2048) != 0) {
                                            ((qn0) obj).setOuterColor(i10);
                                        } else {
                                            ((qn0) obj).setInnerColor(i10);
                                        }
                                    } else if (obj instanceof v7) {
                                        if ((i13 & 33554432) != 0) {
                                            int i18 = 0;
                                            while (i18 < 2) {
                                                TextView textView3 = i18 == 0 ? ((v7) obj).getTextView() : ((v7) obj).getNextTextView();
                                                if (textView3 != null) {
                                                    CharSequence text2 = textView3.getText();
                                                    if ((text2 instanceof SpannedString) && (k41VarArr2 = (k41[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), k41.class)) != null && k41VarArr2.length > 0) {
                                                        for (k41 k41Var2 : k41VarArr2) {
                                                            k41Var2.b = i10;
                                                        }
                                                    }
                                                }
                                                i18++;
                                            }
                                        } else if ((i13 & 4) != 0 && (i14 == 0 || a(i15, (View) obj))) {
                                            int i19 = 0;
                                            while (i19 < 2) {
                                                TextView textView4 = i19 == 0 ? ((v7) obj).getTextView() : ((v7) obj).getNextTextView();
                                                if (textView4 != null) {
                                                    textView4.setTextColor(i10);
                                                    CharSequence text3 = textView4.getText();
                                                    if ((text3 instanceof SpannedString) && (k41VarArr = (k41[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), k41.class)) != null && k41VarArr.length > 0) {
                                                        for (k41 k41Var3 : k41VarArr) {
                                                            k41Var3.b = i10;
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
                        } catch (Throwable th) {
                            FileLog.e(th);
                            hashMap2.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof a30) {
                    ((a30) view).c();
                }
            }
            i12++;
        }
    }

    public final void d(int i10, boolean z10, boolean z11) {
        ik0 ik0Var;
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
                    if (drawable instanceof g2) {
                        ((g2) drawable).a(i10);
                    } else if (drawable instanceof ll0) {
                        ((ll0) drawable).b(i10);
                    } else if (drawable instanceof oi0) {
                        String str = this.g;
                        if (str != null) {
                            ((oi0) drawable).O(i10, str);
                        }
                    } else if (drawable instanceof dq) {
                        if ((i13 & 32) != 0) {
                            ((dq) drawable).a.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((dq) drawable).b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof y8) {
                        ((y8) drawable).h(i10);
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
                if (background instanceof ca0) {
                    ca0 ca0Var = (ca0) background;
                    ca0Var.a.setColor(i10);
                    ca0Var.b = null;
                } else {
                    view.setBackgroundColor(i10);
                }
            }
            if ((i13 & 32) != 0) {
                if ((i13 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof dq) {
                        background2 = (i13 & 65536) != 0 ? ((dq) background2).a : ((dq) background2).b;
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
        if (view instanceof k) {
            if ((i13 & 64) != 0) {
                ((k) view).D(i10, false);
            }
            if ((i13 & 128) != 0) {
                ((k) view).setTitleColor(i10);
            }
            if ((i13 & 256) != 0) {
                ((k) view).C(i10, false);
            }
            if ((4194304 & i13) != 0) {
                ((k) view).C(i10, true);
            }
            if ((i13 & 512) != 0) {
                ((k) view).D(i10, true);
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
        if (view instanceof az) {
            if ((i13 & 4) != 0) {
                ((az) view).setTextColor(i10);
            } else if ((i13 & 2048) != 0) {
                ((az) view).setProgressBarColor(i10);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        } else if (view instanceof z70) {
            if ((i13 & 2048) != 0) {
                ((z70) view).setProgressColor(i10);
            } else {
                ((z70) view).setBackColor(i10);
            }
        } else if (view instanceof hq) {
            ((hq) view).b();
        } else if ((view instanceof qn0) && (i13 & 2048) != 0) {
            ((qn0) view).setOuterColor(i10);
        }
        if ((i13 & 4) != 0 && ((i13 & 262144) == 0 || a(i11, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i10);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i10);
            } else if (view instanceof h5) {
                ((h5) view).setTextColor(i10);
            } else if (view instanceof sn) {
                ((sn) view).setTextColor(i10);
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
            } else if (!(view instanceof n9)) {
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
        boolean z12 = view instanceof zk0;
        if (z12) {
            zk0 zk0Var = (zk0) view;
            if ((i13 & 4096) != 0) {
                zk0Var.setListSelectorColor(Integer.valueOf(i10));
            }
            if ((33554432 & i13) != 0 && (ik0Var = zk0Var.b1) != null) {
                ik0Var.c();
            }
            if ((32768 & i13) != 0) {
                zk0Var.setGlowColor(i10);
            }
            if ((524288 & i13) != 0) {
                ArrayList<View> headers = zk0Var.getHeaders();
                if (headers != null) {
                    for (int i15 = 0; i15 < headers.size(); i15++) {
                        c(i10, headers.get(i15));
                    }
                }
                ArrayList<View> headersCache = zk0Var.getHeadersCache();
                if (headersCache != null) {
                    for (int i16 = 0; i16 < headersCache.size(); i16++) {
                        c(i10, headersCache.get(i16));
                    }
                }
                View pinnedHeader = zk0Var.getPinnedHeader();
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
                zk0 zk0Var2 = (zk0) view;
                zk0Var2.getRecycledViewPool().a();
                int hiddenChildCount = zk0Var2.getHiddenChildCount();
                for (int i17 = 0; i17 < hiddenChildCount; i17++) {
                    c(i10, zk0Var2.V(i17));
                }
                int cachedChildCount = zk0Var2.getCachedChildCount();
                for (int i18 = 0; i18 < cachedChildCount; i18++) {
                    c(i10, zk0Var2.P(i18));
                }
                int attachedScrapChildCount = zk0Var2.getAttachedScrapChildCount();
                for (int i19 = 0; i19 < attachedScrapChildCount; i19++) {
                    c(i10, zk0Var2.O(i19));
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
        if (view instanceof tt) {
            this.a = ((tt) view).getEditText();
        }
    }

    public i6(View view, Class[] clsArr, oi0[] oi0VarArr, String str, int i10) {
        this.b = -1;
        this.j = new boolean[1];
        this.f = i10;
        this.g = str;
        this.d = oi0VarArr;
        this.a = view;
        this.k = 0;
        this.e = clsArr;
        if (view instanceof tt) {
            this.a = ((tt) view).getEditText();
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
        if (view instanceof tt) {
            this.a = ((tt) view).getEditText();
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
