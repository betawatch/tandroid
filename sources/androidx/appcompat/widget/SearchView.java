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
import b8.ae;
import bh.h;
import gi.w6;
import hd.f;
import ii.l2;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k4.j;
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
import m.y2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class SearchView extends w1 implements k.b {
    public static final f x0;
    public final SearchAutoComplete G;
    public final View H;
    public final View I;
    public final View J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final View O;
    public w2 P;
    public final Rect Q;
    public final Rect R;
    public final int[] S;
    public final int[] T;
    public final ImageView U;
    public final Drawable V;
    public final int W;
    public final int a0;
    public final Intent b0;
    public final Intent c0;
    public final CharSequence d0;
    public View.OnFocusChangeListener e0;
    public View.OnClickListener f0;
    public boolean g0;
    public boolean h0;
    public h1.a i0;
    public boolean j0;
    public CharSequence k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public CharSequence p0;
    public boolean q0;
    public int r0;
    public SearchableInfo s0;
    public Bundle t0;
    public final q2 u0;
    public final q2 v0;
    public final WeakHashMap w0;

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            int i3 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i3 < 960 || i10 < 720 || configuration.orientation != 2) {
                return i3 < 600 ? (i3 < 640 || i10 < 480) ? hs.q2 : hs.W2 : hs.W2;
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
            f fVar = SearchView.x0;
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
        public final void onFocusChanged(boolean z10, int i3, Rect rect) {
            super.onFocusChanged(z10, i3, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.h0);
            searchView.post(searchView.u0);
            if (searchView.G.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
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
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                f fVar = SearchView.x0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.n;
            if (!z10) {
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
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.e = i3;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i3) {
            super(context, attributeSet, i3);
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
        x0 = fVar;
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
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.m0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.m0 = false;
    }

    public int getImeOptions() {
        return this.G.getImeOptions();
    }

    public int getInputType() {
        return this.G.getInputType();
    }

    public int getMaxWidth() {
        return this.n0;
    }

    public CharSequence getQuery() {
        return this.G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.k0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.d0 : getContext().getText(this.s0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.a0;
    }

    public int getSuggestionRowLayout() {
        return this.W;
    }

    public h1.a getSuggestionsAdapter() {
        return this.i0;
    }

    public final Intent i(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(TLObject.FLAG_28);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.s0.getSearchActivity());
        return intent;
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.t0;
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
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.G;
        if (i3 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = x0;
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
        SearchAutoComplete searchAutoComplete = this.G;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.g0) {
            clearFocus();
            v(true);
        }
    }

    public final void m(int i3) {
        int i10;
        String g7;
        Cursor cursor = this.i0.c;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i11 = y2.O;
                String g10 = y2.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (g10 == null) {
                    g10 = this.s0.getSuggestIntentAction();
                }
                if (g10 == null) {
                    g10 = "android.intent.action.SEARCH";
                }
                String g11 = y2.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (g11 == null) {
                    g11 = this.s0.getSuggestIntentData();
                }
                if (g11 != null && (g7 = y2.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    g11 = g11 + "/" + Uri.encode(g7);
                }
                intent = i(g10, g11 == null ? null : Uri.parse(g11), y2.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), y2.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
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
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i3) {
        Editable text = this.G.getText();
        Cursor cursor = this.i0.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        String c2 = this.i0.c(cursor);
        if (c2 != null) {
            setQuery(c2);
        } else {
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.p0 = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.r0);
        this.q0 = false;
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        SearchAutoComplete searchAutoComplete = this.G;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.r0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.u0);
        post(this.v0);
        super.onDetachedFromWindow();
    }

    @Override // m.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.G;
            int[] iArr = this.S;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.T;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.Q;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.R;
            rect2.set(i15, 0, i16, i17);
            w2 w2Var = this.P;
            if (w2Var == null) {
                w2 w2Var2 = new w2(rect2, rect, searchAutoComplete);
                this.P = w2Var2;
                setTouchDelegate(w2Var2);
            } else {
                w2Var.b.set(rect2);
                Rect rect3 = w2Var.d;
                rect3.set(rect2);
                int i18 = -w2Var.e;
                rect3.inset(i18, i18);
                w2Var.c.set(rect);
            }
        }
    }

    @Override // m.w1, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.h0) {
            super.onMeasure(i3, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.n0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.n0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.n0) > 0) {
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
        if (!(parcelable instanceof v2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v2 v2Var = (v2) parcelable;
        super.onRestoreInstanceState(v2Var.a);
        v(v2Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v2 v2Var = new v2(super.onSaveInstanceState());
        v2Var.c = this.h0;
        return v2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.u0);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.G;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.s0 != null) {
            getContext().startActivity(i("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q() {
        boolean isEmpty = TextUtils.isEmpty(this.G.getText());
        int i3 = (!isEmpty || (this.g0 && !this.q0)) ? 0 : 8;
        ImageView imageView = this.M;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void r() {
        int[] iArr = this.G.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.m0 || !isFocusable()) {
            return false;
        }
        if (this.h0) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.G.requestFocus(i3, rect);
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
        boolean z10 = this.g0;
        SearchAutoComplete searchAutoComplete = this.G;
        if (z10 && (drawable = this.V) != null) {
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
        this.t0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.g0 == z10) {
            return;
        }
        this.g0 = z10;
        v(z10);
        s();
    }

    public void setImeOptions(int i3) {
        this.G.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.G.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.n0 = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.e0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.k0 = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.l0 = z10;
        h1.a aVar = this.i0;
        if (aVar instanceof y2) {
            ((y2) aVar).G = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.s0 = searchableInfo;
        Intent intent = null;
        boolean z10 = true;
        SearchAutoComplete searchAutoComplete = this.G;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.s0.getImeOptions());
            int inputType = this.s0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.s0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            h1.a aVar = this.i0;
            if (aVar != null) {
                aVar.b(null);
            }
            if (this.s0.getSuggestAuthority() != null) {
                y2 y2Var = new y2(getContext(), this, this.s0, this.w0);
                this.i0 = y2Var;
                searchAutoComplete.setAdapter(y2Var);
                ((y2) this.i0).G = this.l0 ? 2 : 1;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.s0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.s0.getVoiceSearchLaunchWebSearch()) {
                intent = this.b0;
            } else if (this.s0.getVoiceSearchLaunchRecognizer()) {
                intent = this.c0;
            }
            if (intent != null) {
            }
        }
        z10 = false;
        this.o0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.h0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.j0 = z10;
        v(this.h0);
    }

    public void setSuggestionsAdapter(h1.a aVar) {
        this.i0 = aVar;
        this.G.setAdapter(aVar);
    }

    public final void t() {
        this.J.setVisibility(((this.j0 || this.o0) && !this.h0 && (this.L.getVisibility() == 0 || this.N.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z10) {
        boolean z11 = this.j0;
        this.L.setVisibility((!z11 || !(z11 || this.o0) || this.h0 || !hasFocus() || (!z10 && this.o0)) ? 8 : 0);
    }

    public final void v(boolean z10) {
        this.h0 = z10;
        int i3 = 8;
        int i10 = z10 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.G.getText());
        this.K.setVisibility(i10);
        u(!isEmpty);
        this.H.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.U;
        imageView.setVisibility((imageView.getDrawable() == null || this.g0) ? 8 : 0);
        q();
        if (this.o0 && !this.h0 && isEmpty) {
            this.L.setVisibility(8);
            i3 = 0;
        }
        this.N.setVisibility(i3);
        t();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new int[2];
        this.T = new int[2];
        int i10 = 0;
        this.u0 = new q2(this, i10);
        int i11 = 1;
        this.v0 = new q2(this, i11);
        this.w0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        r2 r2Var = new r2(this, i10);
        k0 k0Var = new k0(this, i11);
        x1 x1Var = new x1(this, 1);
        h hVar = new h(this, 11);
        int[] iArr = f.a.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        j jVar = new j(context, obtainStyledAttributes);
        i0.i(this, context, iArr, attributeSet, obtainStyledAttributes, i3);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.H = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.I = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.J = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.K = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.U = imageView5;
        findViewById.setBackground(jVar.A(10));
        findViewById2.setBackground(jVar.A(14));
        imageView.setImageDrawable(jVar.A(13));
        imageView2.setImageDrawable(jVar.A(7));
        imageView3.setImageDrawable(jVar.A(4));
        imageView4.setImageDrawable(jVar.A(16));
        imageView5.setImageDrawable(jVar.A(13));
        this.V = jVar.A(12);
        ae.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.W = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.a0 = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(hVar);
        searchAutoComplete.setOnEditorActionListener(r2Var);
        searchAutoComplete.setOnItemClickListener(k0Var);
        searchAutoComplete.setOnItemSelectedListener(x1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new w6(this, 1));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.d0 = obtainStyledAttributes.getText(6);
        this.k0 = obtainStyledAttributes.getText(11);
        int i12 = obtainStyledAttributes.getInt(3, -1);
        if (i12 != -1) {
            setImeOptions(i12);
        }
        int i13 = obtainStyledAttributes.getInt(2, -1);
        if (i13 != -1) {
            setInputType(i13);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        jVar.H();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.b0 = intent;
        intent.addFlags(TLObject.FLAG_28);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.c0 = intent2;
        intent2.addFlags(TLObject.FLAG_28);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.O = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new l2(this, 2));
        }
        v(this.g0);
        s();
    }

    public void setOnCloseListener(s2 s2Var) {
    }

    public void setOnQueryTextListener(t2 t2Var) {
    }

    public void setOnSuggestionListener(u2 u2Var) {
    }
}
