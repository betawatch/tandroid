package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R$id;

/* loaded from: classes.dex */
public abstract class ViewTreeLifecycleOwner {
    public static void set(View view, LifecycleOwner lifecycleOwner) {
        view.setTag(R$id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
