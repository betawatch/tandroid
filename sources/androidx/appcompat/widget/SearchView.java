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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class SearchView extends o26 implements sk2 {
    public static final pe7 x0;
    public final SearchAutoComplete G;
    public final View H;
    public final View I;
    public final View J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final View O;
    public et9 P;
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
    public d43 i0;
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
    public final zs9 u0;
    public final zs9 v0;
    public final WeakHashMap w0;

    static {
        pe7 pe7Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            pe7 pe7Var2 = new pe7();
            pe7Var2.a = null;
            pe7Var2.b = null;
            pe7Var2.c = null;
            pe7.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                pe7Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                pe7Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                pe7Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            pe7Var = pe7Var2;
        }
        x0 = pe7Var;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new int[2];
        this.T = new int[2];
        this.u0 = new zs9(this, (byte) 0);
        byte b = 1;
        this.v0 = new zs9(this, b);
        this.w0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        gx1 gx1Var = new gx1(this, (byte) 3);
        aq aqVar = new aq(this, b);
        j56 j56Var = new j56(this, (byte) 1);
        jf6 jf6Var = new jf6(this, (byte) 8);
        int[] iArr = jy8.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        vk9 vk9Var = new vk9(context, obtainStyledAttributes);
        jdc.j(this, context, iArr, attributeSet, obtainStyledAttributes, i);
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
        findViewById.setBackground(vk9Var.n(10));
        findViewById2.setBackground(vk9Var.n(14));
        imageView.setImageDrawable(vk9Var.n(13));
        imageView2.setImageDrawable(vk9Var.n(7));
        imageView3.setImageDrawable(vk9Var.n(4));
        imageView4.setImageDrawable(vk9Var.n(16));
        imageView5.setImageDrawable(vk9Var.n(13));
        this.V = vk9Var.n(12);
        uve.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.W = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.a0 = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(jf6Var);
        searchAutoComplete.setOnEditorActionListener(gx1Var);
        searchAutoComplete.setOnItemClickListener(aqVar);
        searchAutoComplete.setOnItemSelectedListener(j56Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new vs3(this, (byte) 2));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.d0 = obtainStyledAttributes.getText(6);
        this.k0 = obtainStyledAttributes.getText(11);
        int i2 = obtainStyledAttributes.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = obtainStyledAttributes.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        vk9Var.y();
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
            findViewById3.addOnLayoutChangeListener(new aw0(this, (byte) 2));
        }
        v(this.g0);
        s();
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

    public d43 getSuggestionsAdapter() {
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
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.G;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        pe7 pe7Var = x0;
        pe7Var.getClass();
        pe7.a();
        Method method = pe7Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        pe7Var.getClass();
        pe7.a();
        Method method2 = pe7Var.b;
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

    public final void m(int i) {
        int i2;
        String g;
        Cursor cursor = this.i0.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = kbb.O;
                String g2 = kbb.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (g2 == null) {
                    g2 = this.s0.getSuggestIntentAction();
                }
                if (g2 == null) {
                    g2 = "android.intent.action.SEARCH";
                }
                String g3 = kbb.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (g3 == null) {
                    g3 = this.s0.getSuggestIntentData();
                }
                if (g3 != null && (g = kbb.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    g3 = g3 + "/" + Uri.encode(g);
                }
                intent = i(g2, g3 == null ? null : Uri.parse(g3), kbb.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), kbb.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i) {
        Editable text = this.G.getText();
        Cursor cursor = this.i0.c;
        if (cursor != null) {
            if (!cursor.moveToPosition(i)) {
                setQuery(text);
                return;
            }
            String c = this.i0.c(cursor);
            if (c != null) {
                setQuery(c);
            } else {
                setQuery(text);
            }
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // sk2
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

    @Override // sk2
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

    @Override // o26, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.G;
            int[] iArr = this.S;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.T;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.Q;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.R;
            rect2.set(i7, 0, i8, i9);
            et9 et9Var = this.P;
            if (et9Var == null) {
                et9 et9Var2 = new et9(rect2, rect, searchAutoComplete);
                this.P = et9Var2;
                setTouchDelegate(et9Var2);
            } else {
                et9Var.b.set(rect2);
                Rect rect3 = et9Var.d;
                rect3.set(rect2);
                int i10 = -et9Var.e;
                rect3.inset(i10, i10);
                et9Var.c.set(rect);
            }
        }
    }

    @Override // o26, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.h0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.n0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.n0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.n0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof dt9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        dt9 dt9Var = (dt9) parcelable;
        super.onRestoreInstanceState(dt9Var.a);
        v(dt9Var.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dt9 dt9Var = new dt9(super.onSaveInstanceState());
        dt9Var.c = this.h0;
        return dt9Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
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
        int i = (!isEmpty || (this.g0 && !this.q0)) ? 0 : 8;
        ImageView imageView = this.M;
        imageView.setVisibility(i);
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
    public final boolean requestFocus(int i, Rect rect) {
        if (this.m0 || !isFocusable()) {
            return false;
        }
        if (this.h0) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.G.requestFocus(i, rect);
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
        boolean z = this.g0;
        SearchAutoComplete searchAutoComplete = this.G;
        if (z && (drawable = this.V) != null) {
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

    public void setIconified(boolean z) {
        if (z) {
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

    public void setIconifiedByDefault(boolean z) {
        if (this.g0 == z) {
            return;
        }
        this.g0 = z;
        v(z);
        s();
    }

    public void setImeOptions(int i) {
        this.G.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.G.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.n0 = i;
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

    public void setQueryRefinementEnabled(boolean z) {
        this.l0 = z;
        d43 d43Var = this.i0;
        if (d43Var instanceof kbb) {
            ((kbb) d43Var).G = z ? (byte) 2 : (byte) 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.s0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
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
            d43 d43Var = this.i0;
            if (d43Var != null) {
                d43Var.b(null);
            }
            if (this.s0.getSuggestAuthority() != null) {
                kbb kbbVar = new kbb(getContext(), this, this.s0, this.w0);
                this.i0 = kbbVar;
                searchAutoComplete.setAdapter(kbbVar);
                ((kbb) this.i0).G = this.l0 ? (byte) 2 : (byte) 1;
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
        z = false;
        this.o0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.h0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.j0 = z;
        v(this.h0);
    }

    public void setSuggestionsAdapter(d43 d43Var) {
        this.i0 = d43Var;
        this.G.setAdapter(d43Var);
    }

    public final void t() {
        this.J.setVisibility(((this.j0 || this.o0) && !this.h0 && (this.L.getVisibility() == 0 || this.N.getVisibility() == 0)) ? 0 : 8);
    }

    public final void u(boolean z) {
        boolean z2 = this.j0;
        this.L.setVisibility((!z2 || !(z2 || this.o0) || this.h0 || !hasFocus() || (!z && this.o0)) ? 8 : 0);
    }

    public final void v(boolean z) {
        this.h0 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.G.getText());
        this.K.setVisibility(i2);
        u(!isEmpty);
        this.H.setVisibility(z ? 8 : 0);
        ImageView imageView = this.U;
        imageView.setVisibility((imageView.getDrawable() == null || this.g0) ? 8 : 0);
        q();
        if (this.o0 && !this.h0 && isEmpty) {
            this.L.setVisibility(8);
            i = 0;
        }
        this.N.setVisibility(i);
        t();
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    public static class SearchAutoComplete extends jo {
        public int e;
        public SearchView f;
        public boolean h;
        public final d n;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = new d(this);
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return i < 600 ? (i < 640 || i2 < 480) ? kk7.p2 : kk7.V2 : kk7.V2;
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
            pe7 pe7Var = SearchView.x0;
            pe7Var.getClass();
            pe7.a();
            Method method = pe7Var.c;
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

        @Override // jo, android.widget.TextView, android.view.View
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
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.h0);
            searchView.post(searchView.u0);
            if (searchView.G.hasFocus()) {
                searchView.k();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
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
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.h = true;
                Context context = getContext();
                pe7 pe7Var = SearchView.x0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.n;
            if (!z) {
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
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(at9 at9Var) {
    }

    public void setOnQueryTextListener(bt9 bt9Var) {
    }

    public void setOnSuggestionListener(ct9 ct9Var) {
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
