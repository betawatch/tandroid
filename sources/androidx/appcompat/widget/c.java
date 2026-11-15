package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    public static void b(SearchView.SearchAutoComplete searchAutoComplete, int i7) {
        searchAutoComplete.setInputMethodMode(i7);
    }
}
