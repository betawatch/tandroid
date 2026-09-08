package h1;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import m.z2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c extends Filter {
    public b a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((z2) this.a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        z2 z2Var = (z2) this.a;
        SearchView searchView = z2Var.v;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = z2Var.f(z2Var.w, charSequence2);
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        b bVar = this.a;
        Cursor cursor = bVar.c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((z2) bVar).b((Cursor) obj);
    }
}
