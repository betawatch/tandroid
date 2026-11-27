package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public b(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
        if (searchView.s0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.i("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.s0 != null && searchView.i0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    searchView.m(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i == 21) {
                    i2 = 0;
                } else if (i == 22) {
                    i2 = searchAutoComplete.length();
                } else if (i == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(i2);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
                return true;
            }
        }
        return false;
    }
}
