package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public b(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.F;
        if (searchView.r0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.r0 != null && searchView.h0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i7 == 66 || i7 == 84 || i7 == 61) {
                    searchView.m(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i7 == 21 || i7 == 22) {
                    searchAutoComplete.setSelection(i7 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i7 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
