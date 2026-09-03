package h1;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import m.b3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c extends Filter {
    public b a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((b3) this.a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        b3 b3Var = (b3) this.a;
        SearchView searchView = b3Var.v;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = b3Var.f(b3Var.w, charSequence2);
            } catch (RuntimeException e6) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e6);
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
        ((b3) bVar).b((Cursor) obj);
    }
}
