package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class ListViewCompat {
    public static void scrollListBy(ListView listView, int i) {
        Api19Impl.scrollListBy(listView, i);
    }

    static class Api19Impl {
        static void scrollListBy(ListView listView, int i) {
            listView.scrollListBy(i);
        }

        static boolean canScrollList(ListView listView, int i) {
            return listView.canScrollList(i);
        }
    }
}
