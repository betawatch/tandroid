package m;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z2 extends h1.b implements View.OnClickListener {
    public static final /* synthetic */ int N = 0;
    public final int E;
    public int F;
    public ColorStateList G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final int n;
    public final int r;
    public final LayoutInflater s;
    public final SearchView v;
    public final SearchableInfo w;
    public final Context x;
    public final WeakHashMap y;

    public z2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new com.google.android.gms.internal.clearcut.c(this);
        this.f = new h1.a(this, 0);
        this.r = suggestionRowLayout;
        this.n = suggestionRowLayout;
        this.s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.F = 1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.v = searchView;
        this.w = searchableInfo;
        this.E = searchView.getSuggestionCommitIconResId();
        this.x = context;
        this.y = weakHashMap;
    }

    public static String g(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // h1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i10;
        int i11;
        Drawable e7;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        y2 y2Var = (y2) view.getTag();
        int i12 = this.M;
        int i13 = i12 != -1 ? cursor.getInt(i12) : 0;
        TextView textView = y2Var.a;
        TextView textView2 = y2Var.b;
        ImageView imageView = y2Var.e;
        if (textView != null) {
            String g10 = g(cursor, this.H);
            textView.setText(g10);
            if (TextUtils.isEmpty(g10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.x;
        if (textView2 != null) {
            String g11 = g(cursor, this.J);
            if (g11 != null) {
                if (this.G == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.G = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(g11);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.G, null), 0, g11.length(), 33);
                str = spannableString;
            } else {
                str = g(cursor, this.I);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = y2Var.c;
        if (imageView2 != null) {
            int i14 = this.K;
            if (i14 == -1) {
                e7 = null;
            } else {
                e7 = e(cursor.getString(i14));
                if (e7 == null) {
                    ComponentName searchActivity = this.w.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.y;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        e7 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("SuggestionsAdapter", e10.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder l4 = i2.g.l(iconResource, "Invalid icon resource ", " for ");
                                l4.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", l4.toString());
                            } else {
                                e7 = drawable;
                                weakHashMap.put(flattenToShortString, e7 != null ? null : e7.getConstantState());
                            }
                        }
                        e7 = null;
                        weakHashMap.put(flattenToShortString, e7 != null ? null : e7.getConstantState());
                    }
                    if (e7 == null) {
                        e7 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(e7);
            if (e7 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                e7.setVisible(false, false);
                e7.setVisible(true, false);
            }
        }
        ImageView imageView3 = y2Var.d;
        if (imageView3 != null) {
            int i15 = this.L;
            Drawable e11 = i15 == -1 ? null : e(cursor.getString(i15));
            imageView3.setImageDrawable(e11);
            if (e11 != null) {
                imageView3.setVisibility(0);
                e11.setVisible(false, false);
                i10 = 1;
                e11.setVisible(true, false);
                i11 = this.F;
                if (i11 == 2 && (i11 != i10 || (i13 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i10 = 1;
        i11 = this.F;
        if (i11 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // h1.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.H = cursor.getColumnIndex("suggest_text_1");
                this.I = cursor.getColumnIndex("suggest_text_2");
                this.J = cursor.getColumnIndex("suggest_text_2_url");
                this.K = cursor.getColumnIndex("suggest_icon_1");
                this.L = cursor.getColumnIndex("suggest_icon_2");
                this.M = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // h1.b
    public final String c(Cursor cursor) {
        String g10;
        String g11;
        if (cursor == null) {
            return null;
        }
        String g12 = g(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (g12 != null) {
            return g12;
        }
        SearchableInfo searchableInfo = this.w;
        if (searchableInfo.shouldRewriteQueryFromData() && (g11 = g(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return g11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (g10 = g(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return g10;
    }

    public final Drawable d(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.x.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable e(String str) {
        WeakHashMap weakHashMap = this.y;
        Context context = this.x;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e7) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e7.getMessage());
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = d(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        drawable = Drawable.createFromStream(openInputStream, null);
                        if (drawable != null) {
                        }
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException e10) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e10);
                        }
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor f(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // h1.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.s.inflate(this.r, viewGroup, false);
            if (inflate != null) {
                ((y2) inflate.getTag()).a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // h1.b, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.s.inflate(this.n, viewGroup, false);
            inflate.setTag(new y2(inflate));
            ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.E);
            ((y2) inflate.getTag()).a.setText(e7.toString());
            return inflate;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.v.o((CharSequence) tag);
        }
    }
}
