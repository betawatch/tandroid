package androidx.appcompat.widget;

import ah.j;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import c8.i9;
import fi.v6;
import hi.l2;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kd.f;
import m.l0;
import m.m;
import m.r2;
import m.s2;
import m.t2;
import m.u2;
import m.v2;
import m.w2;
import m.x1;
import m.x2;
import m.y1;
import m.z2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import r0.i0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class SearchView extends x1 implements k.b {
    public static final f w0;
    public final SearchAutoComplete F;
    public final View G;
    public final View H;
    public final View I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final View N;
    public x2 O;
    public final Rect P;
    public final Rect Q;
    public final int[] R;
    public final int[] S;
    public final ImageView T;
    public final Drawable U;
    public final int V;
    public final int W;
    public final Intent a0;
    public final Intent b0;
    public final CharSequence c0;
    public View.OnFocusChangeListener d0;
    public View.OnClickListener e0;
    public boolean f0;
    public boolean g0;
    public i1.a h0;
    public boolean i0;
    public CharSequence j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public boolean n0;
    public CharSequence o0;
    public boolean p0;
    public int q0;
    public SearchableInfo r0;
    public Bundle s0;
    public final r2 t0;
    public final r2 u0;
    public final WeakHashMap v0;

    /* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
    public static class SearchAutoComplete extends m {
        public int e;
        public SearchView f;
        public boolean h;
        public final d n;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i7 < 960 || i10 < 720 || configuration.orientation != 2) {
                return i7 < 600 ? (i7 < 640 || i10 < 480) ? qs.q2 : qs.W2 : qs.W2;
            }
            return 256;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            f fVar = SearchView.w0;
            fVar.getClass();
            f.a();
            Method method = fVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // m.m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.h) {
                d dVar = this.n;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z9, int i7, Rect rect) {
            super.onFocusChanged(z9, i7, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.g0);
            searchView.post(searchView.t0);
            if (searchView.F.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                f fVar = SearchView.w0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.n;
            if (!z9) {
                this.h = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.h = true;
                    return;
                }
                this.h = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.e = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.n = new d(this);
            this.e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            f fVar2 = new f();
            fVar2.a = null;
            fVar2.b = null;
            fVar2.c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        w0 = fVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.l0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.l0 = false;
    }

    public int getImeOptions() {
        return this.F.getImeOptions();
    }

    public int getInputType() {
        return this.F.getInputType();
    }

    public int getMaxWidth() {
        return this.m0;
    }

    public CharSequence getQuery() {
        return this.F.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.r0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.c0 : getContext().getText(this.r0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.W;
    }

    public int getSuggestionRowLayout() {
        return this.V;
    }

    public i1.a getSuggestionsAdapter() {
        return this.h0;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(TLObject.FLAG_28);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.r0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void k() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.F;
        if (i7 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = w0;
        fVar.getClass();
        f.a();
        Method method = fVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.F;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f0) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i7) {
        int i10;
        String g10;
        Cursor cursor = this.h0.c;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intent = null;
            try {
                int i11 = z2.N;
                String g11 = z2.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (g11 == null) {
                    g11 = this.r0.getSuggestIntentAction();
                }
                if (g11 == null) {
                    g11 = "android.intent.action.SEARCH";
                }
                String g12 = z2.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (g12 == null) {
                    g12 = this.r0.getSuggestIntentData();
                }
                if (g12 != null && (g10 = z2.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    g12 = g12 + "/" + Uri.encode(g10);
                }
                intent = i(g11, g12 == null ? null : Uri.parse(g12), z2.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), z2.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i7) {
        Editable text = this.F.getText();
        Cursor cursor = this.h0.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        String c10 = this.h0.c(cursor);
        if (c10 != null) {
            setQuery(c10);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.o0 = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.q0);
        this.p0 = false;
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        SearchAutoComplete searchAutoComplete = this.F;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.q0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.t0);
        post(this.u0);
        super.onDetachedFromWindow();
    }

    @Override // m.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9) {
            SearchAutoComplete searchAutoComplete = this.F;
            int[] iArr = this.R;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.S;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.P;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.Q;
            rect2.set(i15, 0, i16, i17);
            x2 x2Var = this.O;
            if (x2Var == null) {
                x2 x2Var2 = new x2(rect2, rect, searchAutoComplete);
                this.O = x2Var2;
                setTouchDelegate(x2Var2);
            } else {
                x2Var.b.set(rect2);
                Rect rect3 = x2Var.d;
                rect3.set(rect2);
                int i18 = -x2Var.e;
                rect3.inset(i18, i18);
                x2Var.c.set(rect);
            }
        }
    }

    @Override // m.x1, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.g0) {
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.m0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.m0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.m0) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w2 w2Var = (w2) parcelable;
        super.onRestoreInstanceState(w2Var.a);
        v(w2Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w2 w2Var = new w2(super.onSaveInstanceState());
        w2Var.c = this.g0;
        return w2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        post(this.t0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.F;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.r0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean isEmpty = TextUtils.isEmpty(this.F.getText());
        int i7 = (!isEmpty || (this.f0 && !this.p0)) ? 0 : 8;
        ImageView imageView = this.L;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.F.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.H.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.I.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.l0 || !isFocusable()) {
            return false;
        }
        if (this.g0) {
            return super.requestFocus(i7, rect);
        }
        boolean requestFocus = this.F.requestFocus(i7, rect);
        if (requestFocus) {
            v(false);
        }
        return requestFocus;
    }

    public final void s() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z9 = this.f0;
        SearchAutoComplete searchAutoComplete = this.F;
        if (z9 && (drawable = this.U) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.s0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.F;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f0 == z9) {
            return;
        }
        this.f0 = z9;
        v(z9);
        s();
    }

    public void setImeOptions(int i7) {
        this.F.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.F.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.m0 = i7;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.d0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.j0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.k0 = z9;
        i1.a aVar = this.h0;
        if (aVar instanceof z2) {
            ((z2) aVar).F = z9 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.r0 = searchableInfo;
        Intent intent = null;
        boolean z9 = true;
        SearchAutoComplete searchAutoComplete = this.F;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.r0.getImeOptions());
            int inputType = this.r0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.r0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            i1.a aVar = this.h0;
            if (aVar != null) {
                aVar.b(null);
            }
            if (this.r0.getSuggestAuthority() != null) {
                z2 z2Var = new z2(getContext(), this, this.r0, this.v0);
                this.h0 = z2Var;
                searchAutoComplete.setAdapter(z2Var);
                ((z2) this.h0).F = this.k0 ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.r0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.r0.getVoiceSearchLaunchWebSearch()) {
                intent = this.a0;
            } else if (this.r0.getVoiceSearchLaunchRecognizer()) {
                intent = this.b0;
            }
            if (intent != null) {
            }
        }
        z9 = false;
        this.n0 = z9;
        if (z9) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.g0);
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.i0 = z9;
        v(this.g0);
    }

    public void setSuggestionsAdapter(i1.a aVar) {
        this.h0 = aVar;
        this.F.setAdapter(aVar);
    }

    public final void t() {
        this.I.setVisibility(((this.i0 || this.n0) && !this.g0 && (this.K.getVisibility() == 0 || this.M.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z9) {
        boolean z10 = this.i0;
        this.K.setVisibility((!z10 || !(z10 || this.n0) || this.g0 || !hasFocus() || (!z9 && this.n0)) ? 8 : 0);
    }

    public final void v(boolean z9) {
        this.g0 = z9;
        int i7 = 8;
        int i10 = z9 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.F.getText());
        this.J.setVisibility(i10);
        u(!isEmpty);
        this.G.setVisibility(z9 ? 8 : 0);
        ImageView imageView = this.T;
        imageView.setVisibility((imageView.getDrawable() == null || this.f0) ? 8 : 0);
        q();
        if (this.n0 && !this.g0 && isEmpty) {
            this.K.setVisibility(8);
            i7 = 0;
        }
        this.M.setVisibility(i7);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new int[2];
        this.S = new int[2];
        int i10 = 0;
        this.t0 = new r2(this, i10);
        int i11 = 1;
        this.u0 = new r2(this, i11);
        this.v0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        s2 s2Var = new s2(this, i10);
        l0 l0Var = new l0(this, i11);
        y1 y1Var = new y1(this, 1);
        j jVar = new j(this, 11);
        int[] iArr = f.a.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        h6.m mVar = new h6.m(context, obtainStyledAttributes);
        i0.i(this, context, iArr, attributeSet, obtainStyledAttributes, i7);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.F = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.G = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.H = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.I = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.J = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.K = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.L = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.M = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.T = imageView5;
        findViewById.setBackground(mVar.p(10));
        findViewById2.setBackground(mVar.p(14));
        imageView.setImageDrawable(mVar.p(13));
        imageView2.setImageDrawable(mVar.p(7));
        imageView3.setImageDrawable(mVar.p(4));
        imageView4.setImageDrawable(mVar.p(16));
        imageView5.setImageDrawable(mVar.p(13));
        this.U = mVar.p(12);
        i9.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.V = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.W = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(jVar);
        searchAutoComplete.setOnEditorActionListener(s2Var);
        searchAutoComplete.setOnItemClickListener(l0Var);
        searchAutoComplete.setOnItemSelectedListener(y1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new v6(this, 1));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.c0 = obtainStyledAttributes.getText(6);
        this.j0 = obtainStyledAttributes.getText(11);
        int i12 = obtainStyledAttributes.getInt(3, -1);
        if (i12 != -1) {
            setImeOptions(i12);
        }
        int i13 = obtainStyledAttributes.getInt(2, -1);
        if (i13 != -1) {
            setInputType(i13);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        mVar.C();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.a0 = intent;
        intent.addFlags(TLObject.FLAG_28);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.b0 = intent2;
        intent2.addFlags(TLObject.FLAG_28);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.N = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new l2(this, 2));
        }
        v(this.f0);
        s();
    }

    public void setOnCloseListener(t2 t2Var) {
    }

    public void setOnQueryTextListener(u2 u2Var) {
    }

    public void setOnSuggestionListener(v2 v2Var) {
    }
}
