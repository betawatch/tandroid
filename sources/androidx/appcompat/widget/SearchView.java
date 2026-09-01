package androidx.appcompat.widget;

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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k7.n;
import l7.w0;
import m.b3;
import m.k0;
import m.l;
import m.q2;
import m.r2;
import m.s2;
import m.t2;
import m.u2;
import m.v2;
import m.w1;
import m.w2;
import m.x1;
import m.x2;
import m.y2;
import m.z2;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import r0.j0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class SearchView extends w1 implements k.b {
    public static final x2 t0;
    public final SearchAutoComplete C;
    public final View D;
    public final View E;
    public final View F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final View K;
    public z2 L;
    public final Rect M;
    public final Rect N;
    public final int[] O;
    public final int[] P;
    public final ImageView Q;
    public final Drawable R;
    public final int S;
    public final int T;
    public final Intent U;
    public final Intent V;
    public final CharSequence W;
    public View.OnFocusChangeListener a0;
    public View.OnClickListener b0;
    public boolean c0;
    public boolean d0;
    public h1.b e0;
    public boolean f0;
    public CharSequence g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public CharSequence l0;
    public boolean m0;
    public int n0;
    public SearchableInfo o0;
    public Bundle p0;
    public final q2 q0;
    public final q2 r0;
    public final WeakHashMap s0;

    /* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
    public static class SearchAutoComplete extends l {
        public int e;
        public SearchView f;
        public boolean h;
        public final d n;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
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
            x2 x2Var = SearchView.t0;
            x2Var.getClass();
            x2.a();
            Method method = x2Var.c;
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

        @Override // m.l, android.widget.TextView, android.view.View
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
        public final void onFocusChanged(boolean z4, int i10, Rect rect) {
            super.onFocusChanged(z4, i10, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.d0);
            searchView.post(searchView.q0);
            if (searchView.C.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
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
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z4) {
            super.onWindowFocusChanged(z4);
            if (z4 && this.f.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                x2 x2Var = SearchView.t0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z4) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.n;
            if (!z4) {
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
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
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
        x2 x2Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            x2 x2Var2 = new x2();
            x2Var2.a = null;
            x2Var2.b = null;
            x2Var2.c = null;
            x2.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                x2Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                x2Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                x2Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            x2Var = x2Var2;
        }
        t0 = x2Var;
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
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.i0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.i0 = false;
    }

    public int getImeOptions() {
        return this.C.getImeOptions();
    }

    public int getInputType() {
        return this.C.getInputType();
    }

    public int getMaxWidth() {
        return this.j0;
    }

    public CharSequence getQuery() {
        return this.C.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.g0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.o0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.W : getContext().getText(this.o0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.T;
    }

    public int getSuggestionRowLayout() {
        return this.S;
    }

    public h1.b getSuggestionsAdapter() {
        return this.e0;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(TLObject.FLAG_28);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.o0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.p0;
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
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.C;
        if (i10 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        x2 x2Var = t0;
        x2Var.getClass();
        x2.a();
        Method method = x2Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        x2Var.getClass();
        x2.a();
        Method method2 = x2Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.C;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.c0) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i10) {
        int i11;
        String g10;
        Cursor cursor = this.e0.c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = b3.K;
                String g11 = b3.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (g11 == null) {
                    g11 = this.o0.getSuggestIntentAction();
                }
                if (g11 == null) {
                    g11 = "android.intent.action.SEARCH";
                }
                String g12 = b3.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (g12 == null) {
                    g12 = this.o0.getSuggestIntentData();
                }
                if (g12 != null && (g10 = b3.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    g12 = g12 + "/" + Uri.encode(g10);
                }
                intent = i(g11, g12 == null ? null : Uri.parse(g12), b3.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), b3.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e6) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e6);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i10) {
        Editable text = this.C.getText();
        Cursor cursor = this.e0.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        String c3 = this.e0.c(cursor);
        if (c3 != null) {
            setQuery(c3);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.l0 = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.n0);
        this.m0 = false;
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        if (this.m0) {
            return;
        }
        this.m0 = true;
        SearchAutoComplete searchAutoComplete = this.C;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.n0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        post(this.r0);
        super.onDetachedFromWindow();
    }

    @Override // m.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4) {
            SearchAutoComplete searchAutoComplete = this.C;
            int[] iArr = this.O;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.P;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.M;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.N;
            rect2.set(i16, 0, i17, i18);
            z2 z2Var = this.L;
            if (z2Var == null) {
                z2 z2Var2 = new z2(rect2, rect, searchAutoComplete);
                this.L = z2Var2;
                setTouchDelegate(z2Var2);
            } else {
                z2Var.b.set(rect2);
                Rect rect3 = z2Var.d;
                rect3.set(rect2);
                int i19 = -z2Var.e;
                rect3.inset(i19, i19);
                z2Var.c.set(rect);
            }
        }
    }

    @Override // m.w1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.d0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.j0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.j0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.j0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y2 y2Var = (y2) parcelable;
        super.onRestoreInstanceState(y2Var.a);
        v(y2Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        y2 y2Var = new y2(super.onSaveInstanceState());
        y2Var.c = this.d0;
        return y2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        post(this.q0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.C;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.o0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean isEmpty = TextUtils.isEmpty(this.C.getText());
        int i10 = (!isEmpty || (this.c0 && !this.m0)) ? 0 : 8;
        ImageView imageView = this.I;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.C.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.F.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.i0 || !isFocusable()) {
            return false;
        }
        if (this.d0) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.C.requestFocus(i10, rect);
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
        boolean z4 = this.c0;
        SearchAutoComplete searchAutoComplete = this.C;
        if (z4 && (drawable = this.R) != null) {
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
        this.p0 = bundle;
    }

    public void setIconified(boolean z4) {
        if (z4) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.C;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.b0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z4) {
        if (this.c0 == z4) {
            return;
        }
        this.c0 = z4;
        v(z4);
        s();
    }

    public void setImeOptions(int i10) {
        this.C.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.C.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.j0 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.a0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.b0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.g0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z4) {
        this.h0 = z4;
        h1.b bVar = this.e0;
        if (bVar instanceof b3) {
            ((b3) bVar).C = z4 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.o0 = searchableInfo;
        Intent intent = null;
        boolean z4 = true;
        SearchAutoComplete searchAutoComplete = this.C;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.o0.getImeOptions());
            int inputType = this.o0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.o0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            h1.b bVar = this.e0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.o0.getSuggestAuthority() != null) {
                b3 b3Var = new b3(getContext(), this, this.o0, this.s0);
                this.e0 = b3Var;
                searchAutoComplete.setAdapter(b3Var);
                ((b3) this.e0).C = this.h0 ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.o0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.o0.getVoiceSearchLaunchWebSearch()) {
                intent = this.U;
            } else if (this.o0.getVoiceSearchLaunchRecognizer()) {
                intent = this.V;
            }
            if (intent != null) {
            }
        }
        z4 = false;
        this.k0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.d0);
    }

    public void setSubmitButtonEnabled(boolean z4) {
        this.f0 = z4;
        v(this.d0);
    }

    public void setSuggestionsAdapter(h1.b bVar) {
        this.e0 = bVar;
        this.C.setAdapter(bVar);
    }

    public final void t() {
        this.F.setVisibility(((this.f0 || this.k0) && !this.d0 && (this.H.getVisibility() == 0 || this.J.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z4) {
        boolean z10 = this.f0;
        this.H.setVisibility((!z10 || !(z10 || this.k0) || this.d0 || !hasFocus() || (!z4 && this.k0)) ? 8 : 0);
    }

    public final void v(boolean z4) {
        this.d0 = z4;
        int i10 = 8;
        int i11 = z4 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.C.getText());
        this.G.setVisibility(i11);
        u(!isEmpty);
        this.D.setVisibility(z4 ? 8 : 0);
        ImageView imageView = this.Q;
        imageView.setVisibility((imageView.getDrawable() == null || this.c0) ? 8 : 0);
        q();
        if (this.k0 && !this.d0 && isEmpty) {
            this.H.setVisibility(8);
            i10 = 0;
        }
        this.J.setVisibility(i10);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new Rect();
        this.O = new int[2];
        this.P = new int[2];
        int i11 = 0;
        this.q0 = new q2(this, i11);
        int i12 = 1;
        this.r0 = new q2(this, i12);
        this.s0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        t2 t2Var = new t2(this, i11);
        k0 k0Var = new k0(this, i12);
        x1 x1Var = new x1(this, 1);
        eh.c cVar = new eh.c(this, 3);
        int[] iArr = f.a.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        w0 w0Var = new w0(context, obtainStyledAttributes);
        j0.j(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.C = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.D = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.E = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.F = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.G = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.H = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.I = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.J = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.Q = imageView5;
        findViewById.setBackground(w0Var.s(10));
        findViewById2.setBackground(w0Var.s(14));
        imageView.setImageDrawable(w0Var.s(13));
        imageView2.setImageDrawable(w0Var.s(7));
        imageView3.setImageDrawable(w0Var.s(4));
        imageView4.setImageDrawable(w0Var.s(16));
        imageView5.setImageDrawable(w0Var.s(13));
        this.R = w0Var.s(12);
        n.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.S = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.T = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(cVar);
        searchAutoComplete.setOnEditorActionListener(t2Var);
        searchAutoComplete.setOnItemClickListener(k0Var);
        searchAutoComplete.setOnItemSelectedListener(x1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new r2(this, 0));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.W = obtainStyledAttributes.getText(6);
        this.g0 = obtainStyledAttributes.getText(11);
        int i13 = obtainStyledAttributes.getInt(3, -1);
        if (i13 != -1) {
            setImeOptions(i13);
        }
        int i14 = obtainStyledAttributes.getInt(2, -1);
        if (i14 != -1) {
            setInputType(i14);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        w0Var.A();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.U = intent;
        intent.addFlags(TLObject.FLAG_28);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.V = intent2;
        intent2.addFlags(TLObject.FLAG_28);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.K = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new s2(this, 0));
        }
        v(this.c0);
        s();
    }

    public void setOnCloseListener(u2 u2Var) {
    }

    public void setOnQueryTextListener(v2 v2Var) {
    }

    public void setOnSuggestionListener(w2 w2Var) {
    }
}
